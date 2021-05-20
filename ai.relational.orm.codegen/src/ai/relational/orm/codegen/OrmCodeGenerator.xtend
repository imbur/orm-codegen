package ai.relational.orm.codegen

import com.google.common.collect.Sets
import edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeType
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType
import edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRef
import edu.neumont.schemas.orm._2006._04.orm.core.RoleRef
import edu.neumont.schemas.orm._2006._04.orm.core.RoleSequenceRoleRef
import edu.neumont.schemas.orm._2006._04.orm.root.DocumentRoot
import org.eclipse.emf.ecore.EObject

import static extension ai.relational.orm.codegen.GeneratorHelper.isBooleanAttributeName
import static extension ai.relational.orm.codegen.GeneratorHelper.lookUpRelDataType
import static extension ai.relational.orm.codegen.GeneratorHelper.purgeAuxiliaryVerbsFromBeginning
import static extension ai.relational.orm.codegen.GeneratorHelper.purgeNonAlphaChars
import static extension ai.relational.orm.codegen.GeneratorHelper.toSnakeCase
import edu.neumont.schemas.orm._2006._04.orm.core.RoleType

class OrmCodeGenerator {

	static def generate(ORMModelType model) {

		val StringBuilder builder = new StringBuilder

		val entities = model.objects.entityType
		val facts = model.facts.fact
		// Implied facts store the same set of information as a non-implied fact, 
		// however, the MM does not consider them as related types.
		val impliedFacts = model.facts.impliedFact
		val roles = model.facts.fact.map[it.factRoles.role].flatten

		val mandatoryConstraints = model.constraints.mandatoryConstraint
		val ringConstraints = model.constraints.ringConstraint
		val subsetConstraints = model.constraints.subsetConstraint
		val uniquenessConstraints = model.constraints.uniquenessConstraint
		// frequency refers to multiplicity
//		val frequencyConstraints = model.constraints.frequencyConstraint
		val frequencyConstraints = model.constraints.frequencyConstraint

		for (fc : frequencyConstraints) {
			println(fc)
		}
//		
//		for(r : roles) {
//			println(r.multiplicity)
//		}
		// testing area
		for (f : facts) {
			var factRoles = f.factRoles.role
			println("fact name: " + f.name)
			println("extracted fact name: " + f.extractName)

			for (r : factRoles) {
				print("\t " + r.multiplicity + r.id)
				if (r.name !== null && r.name != "") {
					println(" role name: " + r.name)
				} else {
					println
				}
				for (c : mandatoryConstraints) {
					if (c.roleSequence.role.map[resolve].filter[it !== null].filter[equals(r)].size > 0) {
						println("\t\t found mandatory constraint: " + c.name + c.id)
					}
				}
				for (c : uniquenessConstraints) {
					if (c.roleSequence.role.map[resolve].filter[it !== null].filter[equals(r)].size > 0) {
						println("\t\t found uniqueness constraint: " + c.name + c.id)
						if (c.preferredIdentifierFor !== null) {
							println("\t\t\t preferred identifier for: " + c.preferredIdentifierFor.resolve.name)
						}
					}
				}
			}
		}

		// For each fact, iterate over the roles, get the multiplicity constraints, and generate ICs
		// Many to one -> function
		builder.append('''
			/*
			 * Multiplicity constraints
			 */
		''')
		val multiplicityConstraintAddedStrings = Sets.<String>newHashSet
		for (f : facts) {
			if (!multiplicityConstraintAddedStrings.contains(f.extractName)) {

				var factRoles = f.factRoles.role
				for (r : factRoles) {
					switch r.multiplicity {
						case ZERO_TO_MANY,
						case ONE_TO_MANY: {
							builder.append('''
								ic «f.extractName»_many_one { function(«f.extractName») }
							''')
						}
						case ZERO_TO_ONE,
						case EXACTLY_ONE: {
							println
						}
						case INDETERMINATE: {
							// TODO
						}
						case UNSPECIFIED: {
							// TODO
						}
					}
					multiplicityConstraintAddedStrings.add(f.extractName)
				}
			}
		}

		builder.append('''
			/*
			 * Mandatory constraints
			 */
		''')
		for (f : facts) {
			var factRoles = f.factRoles.role
			for (r : factRoles) {
				if (r.isIsMandatory) {
					builder.append('''
						ic «f.extractName»_mandatory { «r.rolePlayer.resolve.name»(e) implies «f.extractName»(«FOR i : 0..f.factRoles.role.size-1 SEPARATOR ','»«
								IF i==r.index
									»e«
								ELSE
									»_«
								ENDIF»«ENDFOR») }
					''')
				}
			}

		}

		// in appt. schema
//		fact name: AppointmentHasDayOfContactPerson
//	 ZeroToMany_10BFD8CB-5C70-4C9B-89A0-55A65E8AC620
//		 found uniqueness constraint: InternalUniquenessConstraint27_E6573712-B8AA-4EF5-83FB-1D96A47D7347
//	 ZeroToOne_4543DFDB-A50C-49C4-A56B-3DD5A3960902 role name: day_of_contact
//		 found mandatory constraint: ImpliedMandatoryConstraint12_C580EACF-7C7D-48A0-8754-DCAEF014BFBB
//		
		// Exactly one -> mandatory
		// created_on
//	fact name: AppointmentIsCreatedOnDateTime
//	 ZeroToMany_8FC8BBFA-E20E-4E3A-8983-CFE5D3BB7374
//		 found mandatory constraint: SimpleMandatoryConstraint16_094129DF-34DA-4FBA-AAC8-5DDF250F6DE7
//		 found uniqueness constraint: InternalUniquenessConstraint30_AF694538-AE21-4F00-9ED7-1BDB89B26DEA
//	 ExactlyOne_3BB0609C-2272-4E85-A565-FEB2842CFFDB
//		 found mandatory constraint: ImpliedMandatoryConstraint33_8904CCAA-D837-4C24-9DCF-87D6ACF12BB3
//	
		// TODO use reading order data to extract relation name	
		uniquenessConstraints.head.roleSequence.role.get(0).resolve.rolePlayer
		var prefId = uniquenessConstraints.head.preferredIdentifierFor // .resolve
		for (uc : uniquenessConstraints) {
			println("ROLE REFS: " + uc.roleSequence.role)
			val resolvedRoles = uc.roleSequence.role.map[resolve]
			println("ROLES: " + resolvedRoles)
			if (uc.preferredIdentifierFor !== null) {
				val identified = uc.preferredIdentifierFor.resolve
				if (uc.preferredIdentifierFor.resolve === null) {
					// This references an objectified fact, no explicitly modeled entity is in the model
					// This case is for now ignored
				} else {
					println("IDENTIFIES ENTITY: " + identified)
				}
			}
		}

		val subtypeFacts = model.facts.subtypeFact
		val valueTypes = model.objects.valueType
		GeneratorHelper.storeDataTypeIds(model)

		builder.append('''
			/*
			 * Subtype ICs
			 */
		''')
		// Cache the entity types which are direct subtypes of declared subtypes
		// This set is useful when generating integrity constraints for entities which are subtypes of the implicit Entity entity type
		val registeredSubtypes = Sets.<EntityTypeType>newHashSet
		for (subtypeFact : subtypeFacts) {
			val subtype = subtypeFact.factRoles.subtypeMetaRole.rolePlayer.resolve
			val supertype = subtypeFact.factRoles.supertypeMetaRole.rolePlayer.resolve
			if (subtype instanceof EntityTypeType && supertype instanceof EntityTypeType) {
				builder.append(generateSubTypeIcs(subtype as EntityTypeType, supertype as EntityTypeType))
				registeredSubtypes.add(subtype as EntityTypeType)
			}
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
				if (rawRelationNameFromFact.isBooleanAttributeName) {
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
			val factOfSubsetRole = facts.findFirst [
				it.factRoles.role.filter[id == sc.roleSequences.roleSequence.get(0).role.head.ref].size > 0
			]
			val factOfSupersetRole = facts.findFirst [
				it.factRoles.role.filter[id == sc.roleSequences.roleSequence.get(1).role.head.ref].size > 0
			]
			val subsetFactVerbalized = factOfSubsetRole.readingOrders.readingOrder.head.readings.reading.head.data.
				purgeNonAlphaChars
			val supersetFactVerbalized = factOfSupersetRole.readingOrders.readingOrder.head.readings.reading.head.data.
				purgeNonAlphaChars
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

	private static def resolve(RoleSequenceRoleRef roleRef) {
		var allRoles = Sets.newHashSet
		allRoles.addAll(roleRef.model.facts.fact.map[it.factRoles.role].flatten)
		// TODO What do implied facts exactly express? 
		allRoles.addAll(roleRef.model.facts.impliedFact.map[it.factRoles.role])
		allRoles.findFirst[id == roleRef.ref]
	}

	private static def resolve(ObjectTypeRef entityRef) {
		val allEntities = Sets.newHashSet
		allEntities.addAll(entityRef.model.objects.entityType)
		allEntities.addAll(entityRef.model.objects.objectifiedType)
		allEntities.findFirst[id == entityRef.ref]
	}

	private static def ORMModelType getModel(EObject eObject) {
		if (eObject === null) {
			throw new Exception("Model cannot be retrieved for parameter eObject: " + eObject)
		} else if (eObject instanceof DocumentRoot) {
			return GeneratorHelper.extractOrmModelRoot(eObject as DocumentRoot)
		}
		return eObject.eContainer.model
	}

	/**
	 * Internal helper function to extract special identifier role names based on identifier name
	 */
	private static def extractIdentifierRoleName(FactTypeType fact) {
		val isPossibleIdentifierRole = fact.factRoles.role.size == 2

		if(!isPossibleIdentifierRole) {
			return null
		}
		
		val role1 = fact.factRoles.role.get(0)
		val role2 = fact.factRoles.role.get(1)
		val ucs = fact.model.constraints.uniquenessConstraint
		val possibleUcs = ucs.filter[it.roleSequence.role.containsAll(#[role1, role2])]

		for (uc : possibleUcs) {
			if (role1.rolePlayer.resolve.equals(uc.preferredIdentifierFor.resolve)) {
				return role2.rolePlayer.resolve.name.toSnakeCase
			}

			if (role2.rolePlayer.resolve.equals(uc.preferredIdentifierFor.resolve)) {
				return role1.rolePlayer.resolve.name.toSnakeCase
			}
		}
		return null
	}


	private static def extractName(FactTypeType fact) {
		// Special case: ref mode - a fact that is binary, has preferred identifier and two uniqueness constraints
		// should be named after the preferred identifier rather than any role names
		if(fact.extractIdentifierRoleName !== null) {
			return fact.extractIdentifierRoleName
		}
		
		for (role : fact.factRoles.role) {
			if (role.name !== null && role.name != "") {
				return role.name.toSnakeCase;
			}
		}
		for (order : fact.readingOrders.readingOrder) {
			for (reading : order.readings.reading) {
				for (text : reading.expandedData.roleText) {
					return text.followingText.toSnakeCase
				}
			}
		}
	}

	private static def index(RoleType role) {
		val fact = role.model.facts.fact.findFirst[it.factRoles.role.contains(role)]
		fact.factRoles.role.indexOf(role)
	}
}
