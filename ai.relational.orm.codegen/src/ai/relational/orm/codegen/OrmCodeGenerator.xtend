package ai.relational.orm.codegen

import com.google.common.collect.Sets
import edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeType
import edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType
import edu.neumont.schemas.orm._2006._04.orm.core.RoleRef
import edu.neumont.schemas.orm._2006._04.orm.core.SubsetConstraintType

import static extension ai.relational.orm.codegen.GeneratorHelper.isBooleanAttributeName
import static extension ai.relational.orm.codegen.GeneratorHelper.lookUpRelDataType
import static extension ai.relational.orm.codegen.GeneratorHelper.purgeAuxiliaryVerbsFromBeginning
import static extension ai.relational.orm.codegen.GeneratorHelper.toSnakeCase
import static extension ai.relational.orm.codegen.GeneratorHelper.purgeNonAlphaChars

class OrmCodeGenerator {

	static def generate(ORMModelType model) {

		val StringBuilder builder = new StringBuilder

		val entities = model.objects.entityType
		val facts = model.facts.fact
		val roles = model.facts.fact.map[it.factRoles.role].flatten
		val subtypeFacts = model.facts.subtypeFact
		val subsetConstraints = model.constraints.subsetConstraint
		val valueTypes = model.objects.valueType
		GeneratorHelper.storeDataTypeIds(model)

		// Cache the entity types which are direct subtypes of declared subtypes
		// This set is useful when generating integrity constraints for entities which are subtypes of the implicit Entity entity type
		val registeredSubtypes = Sets.<EntityTypeType>newHashSet
		builder.append('''
			/*
			 * Subtype ICs
			 */
		''')
		for (subtypeFact : subtypeFacts) {
			val subtype = entities.findFirst[id == subtypeFact.factRoles.subtypeMetaRole.rolePlayer.ref]
			val supertype = entities.findFirst[id == subtypeFact.factRoles.supertypeMetaRole.rolePlayer.ref]
			builder.append(generateSubTypeIcs(subtype, supertype))
			registeredSubtypes.add(subtype)
		}

		for (entity : entities) {
			if (!registeredSubtypes.contains(entity)) {
				builder.append(generateTopLevelEntityIcs(entity))
			}
		}

		builder.append('''
			/*
			 * Attribute type ICs
			 */
		''')
		for (valueType : valueTypes) {
			for (RoleRef roleRef : valueType.playedRoles.role) {
				val fact = facts.findFirst[factRoles.role.filter[id == roleRef.ref].size > 0]
				val entityRole = fact.factRoles.role.findFirst[id != roleRef.ref]
				val entity = entities.findFirst[id == entityRole.rolePlayer.ref]
				val dataTypeName = valueType.conceptualDataType.ref.lookUpRelDataType
				val rawRelationNameFromFact = fact.name.replaceFirst(entity.name, "")
				val relationNameFromFact = rawRelationNameFromFact.purgeAuxiliaryVerbsFromBeginning
				if(rawRelationNameFromFact.isBooleanAttributeName){
					builder.append(generateAttributeTypeIcs(relationNameFromFact, entity))
				} else {
					builder.append(generateAttributeTypeIcs(relationNameFromFact, entity, dataTypeName))
				}
			}
		}

		// TODO
		builder.append('''
			/*
			 * Subset ICs
			 */
		''')
		for (sc : subsetConstraints) {
			val factOfSubsetRole = facts.findFirst[it.factRoles.role.filter[id == sc.roleSequences.roleSequence.get(0).role.head.ref].size > 0]
			val factOfSupersetRole = facts.findFirst[it.factRoles.role.filter[id == sc.roleSequences.roleSequence.get(1).role.head.ref].size > 0]
			val subsetFactVerbalized = factOfSubsetRole.readingOrders.readingOrder.head.readings.reading.head.data.purgeNonAlphaChars
			val supersetFactVerbalized = factOfSupersetRole.readingOrders.readingOrder.head.readings.reading.head.data.purgeNonAlphaChars
			generateSubsetIcs(subsetFactVerbalized, supersetFactVerbalized)
		}

		println(builder.toString)
	}

	static def generateSubTypeIcs(EntityTypeType subtype, EntityTypeType supertype) '''
		ic «subtype.name.toSnakeCase»_subtype(e) { «subtype.name»(e) implies «supertype.name»(e) }
	'''

	static def generateTopLevelEntityIcs(EntityTypeType type) '''
		ic «type.name.toSnakeCase»_entity(e) { «type.name»(e) implies Entity(e) }
	'''

	// Boolean attribute type constraint translates to checking if an entity is in a relation or not
	// No value is actually stored (unlike in case of other attribute types)
	static def generateAttributeTypeIcs(String relationName, EntityTypeType entity) '''
		ic «relationName.toSnakeCase»_types(e) { «relationName.toSnakeCase»(e) implies «entity.name»(e) }
	'''
	
	static def generateAttributeTypeIcs(String relationName, EntityTypeType entity, String dataTypeName) '''
		ic «relationName.toSnakeCase»_types(e, v) { «relationName.toSnakeCase»(e, v) implies «entity.name»(e) and «dataTypeName»(v) }
	'''


	static def generateSubsetIcs(String subVerbalized, String supVerbalized) '''
		ic work_order_«subVerbalized»_subsets_«supVerbalized»(w, v) {
		    work_ended(w, v)
		    implies
		    exists(s: work_started(w, s))
		}
	'''
}
