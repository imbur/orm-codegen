package ai.relational.orm.codegen

import com.google.common.collect.Sets
import edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeType
import edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType
import edu.neumont.schemas.orm._2006._04.orm.core.RoleRef
import edu.neumont.schemas.orm._2006._04.orm.core.SubsetConstraintType

import static extension ai.relational.orm.codegen.GeneratorHelper.toSnakeCase
import static extension ai.relational.orm.codegen.GeneratorHelper.lookUpRelDataType
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypesType
import edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeType

class OrmCodeGenerator {

	static def generate(ORMModelType model) {

		val StringBuilder builder = new StringBuilder

		val entities = model.objects.entityType
		val facts = model.facts.fact
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
				builder.append(generateAttributeTypeIcs(entity,valueType,fact,dataTypeName))
			}
		}

		for (fact : facts) {
//			println(fact.name)
		}

		// TODO
		builder.append('''
			/*
			 * Subset ICs
			 */
		''')
		for (sc : subsetConstraints) {
			generateSubsetIcs(sc)
		}

		println(builder.toString)
	}
	
	static def generateSubTypeIcs(EntityTypeType subtype, EntityTypeType supertype) '''
		ic «subtype.name.toSnakeCase»_subtype(e) { «subtype.name»(e) implies «supertype.name»(e) }
	'''

	static def generateTopLevelEntityIcs(EntityTypeType type) '''
		ic «type.name.toSnakeCase»_entity(e) { «type.name»(e) implies Entity(e) }
	'''

	static def generateAttributeTypeIcs(EntityTypeType entity, ValueTypeType valueType, FactTypeType fact, String dataTypeName) '''
		ic «valueType.name.toSnakeCase»_types(e, v) { «valueType.name.toSnakeCase»(e, v) implies «entity.name»(e) and «dataTypeName»(v) }
	'''

	static def generateSubsetIcs(SubsetConstraintType sc) '''
		«sc.roleSequences»
	'''

//		val objects = model.objects
//		val facts = model.facts.fact
//		
//		for (EntityTypeType entity : objects.entityType) {
//			println("ENTITY: " + entity.name)
//			entity.playedRoles.role.forEach[r | println("\tROLE NAME: " + facts.filter[f | f.factRoles.role.filter[fr | fr.id == r.ref].size() > 0].get(0).name)]
//		}
//		
//		val facts = model.facts
//		
//		for (FactTypeType fact : facts.fact) {
//			println("FACT: " + fact.name)
//			
//			for(RoleType role : fact.factRoles.role) {
//				println("\tROLE: " + role.name)
//			}
//		}
//		for (UniquenessConstraintType constraint : constraints.uniquenessConstraint) {
//			println(constraint.preferredIdentifierFor)
//		}
//
//		for (FactTypeType fact : facts) {
//			val uniquenessConstraints = fact.factRoles.role.filter[it instanceof UniquenessConstraintType].map[it as UniquenessConstraintType]
//			for (UniquenessConstraintType uniquenessConstraint : uniquenessConstraints) {
//				generate(uniquenessConstraint);
//			}
//		}
}
