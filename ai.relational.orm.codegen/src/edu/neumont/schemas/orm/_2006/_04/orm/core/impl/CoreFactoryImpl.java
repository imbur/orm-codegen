/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory(CorePackage.eNS_URI);
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CorePackage.AGGREGATION_CONTEXT_TYPE: return createAggregationContextType();
			case CorePackage.ALIASES_TYPE: return createAliasesType();
			case CorePackage.ALIAS_TYPE: return createAliasType();
			case CorePackage.AUTO_COUNTER_NUMERIC_DATA_TYPE_TYPE: return createAutoCounterNumericDataTypeType();
			case CorePackage.AUTO_TIMESTAMP_TEMPORAL_DATA_TYPE_TYPE: return createAutoTimestampTemporalDataTypeType();
			case CorePackage.BOUND_TO_TYPE: return createBoundToType();
			case CorePackage.CALCULATED_PATH_VALUE_MUST_BE_CONSUMED_ERROR_TYPE: return createCalculatedPathValueMustBeConsumedErrorType();
			case CorePackage.CALCULATED_PATH_VALUE_PARAMETER_BINDING_ERROR_TYPE: return createCalculatedPathValueParameterBindingErrorType();
			case CorePackage.CALCULATED_PATH_VALUE_REQUIRES_AGGREGATION_CONTEXT_ERROR_TYPE: return createCalculatedPathValueRequiresAggregationContextErrorType();
			case CorePackage.CALCULATED_PATH_VALUE_REQUIRES_FUNCTION_ERROR_TYPE: return createCalculatedPathValueRequiresFunctionErrorType();
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE: return createCalculatedValueInputType();
			case CorePackage.CALCULATED_VALUE_REF: return createCalculatedValueRef();
			case CorePackage.CALCULATED_VALUES_TYPE: return createCalculatedValuesType();
			case CorePackage.CALCULATED_VALUES_TYPE1: return createCalculatedValuesType1();
			case CorePackage.CALCULATED_VALUE_TYPE: return createCalculatedValueType();
			case CorePackage.CALCULATED_VALUE_TYPE1: return createCalculatedValueType1();
			case CorePackage.CARDINALITY_CONSTRAINT_REF: return createCardinalityConstraintRef();
			case CorePackage.CARDINALITY_CONSTRAINT_TYPE: return createCardinalityConstraintType();
			case CorePackage.CARDINALITY_RANGE_OVERLAP_ERROR_TYPE: return createCardinalityRangeOverlapErrorType();
			case CorePackage.CARDINALITY_RANGES_TYPE: return createCardinalityRangesType();
			case CorePackage.CARDINALITY_RANGE_TYPE: return createCardinalityRangeType();
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE: return createCompatibleRolePlayerTypeErrorType();
			case CorePackage.COMPATIBLE_SUPERTYPES_ERROR_TYPE: return createCompatibleSupertypesErrorType();
			case CorePackage.COMPATIBLE_VALUE_TYPE_INSTANCE_VALUE_ERROR_TYPE: return createCompatibleValueTypeInstanceValueErrorType();
			case CorePackage.CONDITIONS_TYPE: return createConditionsType();
			case CorePackage.CONSTRAINT_DUPLICATE_NAME_ERROR_TYPE: return createConstraintDuplicateNameErrorType();
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_REF: return createConstraintRoleProjectionRef();
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE: return createConstraintRoleProjectionType();
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_REF: return createConstraintRoleSequenceJoinPathRef();
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_TYPE: return createConstraintRoleSequenceJoinPathType();
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_REF: return createConstraintRoleSequenceRef();
			case CorePackage.CONSTRAINT_ROLE_SEQUENCES_TYPE: return createConstraintRoleSequencesType();
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_TYPE: return createConstraintRoleSequenceType();
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_AND_ID_TYPE: return createConstraintRoleSequenceWithJoinAndIdType();
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_TYPE: return createConstraintRoleSequenceWithJoinType();
			case CorePackage.CONSTRAINTS_TYPE: return createConstraintsType();
			case CorePackage.CONSTRAINTS_TYPE1: return createConstraintsType1();
			case CorePackage.CONSTRAINTS_TYPE2: return createConstraintsType2();
			case CorePackage.CONSTRAINTS_TYPE3: return createConstraintsType3();
			case CorePackage.CONSTRAINTS_TYPE4: return createConstraintsType4();
			case CorePackage.CONSTRAINTS_TYPE5: return createConstraintsType5();
			case CorePackage.CORRELATED_PATH_ROLE_REQUIRES_COMPATIBLE_ROLE_PLAYER_ERROR_TYPE: return createCorrelatedPathRoleRequiresCompatibleRolePlayerErrorType();
			case CorePackage.CUSTOM_REFERENCE_MODES_TYPE: return createCustomReferenceModesType();
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE: return createCustomReferenceModeType();
			case CorePackage.DATA_TYPE_NOT_SPECIFIED_ERROR_TYPE: return createDataTypeNotSpecifiedErrorType();
			case CorePackage.DATA_TYPE_REF: return createDataTypeRef();
			case CorePackage.DATA_TYPE_REF_REF: return createDataTypeRefRef();
			case CorePackage.DATA_TYPES_TYPE: return createDataTypesType();
			case CorePackage.DATE_AND_TIME_TEMPORAL_DATA_TYPE_TYPE: return createDateAndTimeTemporalDataTypeType();
			case CorePackage.DATE_TEMPORAL_DATA_TYPE_TYPE: return createDateTemporalDataTypeType();
			case CorePackage.DECIMAL_NUMERIC_DATA_TYPE_TYPE: return createDecimalNumericDataTypeType();
			case CorePackage.DEFINITIONS_TYPE: return createDefinitionsType();
			case CorePackage.DEFINITION_TYPE: return createDefinitionType();
			case CorePackage.DERIVATION_EXPRESSION_TYPE: return createDerivationExpressionType();
			case CorePackage.DERIVATION_PROJECTIONS_TYPE: return createDerivationProjectionsType();
			case CorePackage.DERIVATION_PROJECTIONS_TYPE1: return createDerivationProjectionsType1();
			case CorePackage.DERIVATION_SOURCE_TYPE: return createDerivationSourceType();
			case CorePackage.DERIVATION_SOURCE_TYPE1: return createDerivationSourceType1();
			case CorePackage.DERIVED_FACT_TYPE_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE: return createDerivedFactTypeRoleProjectionCompatibilityErrorType();
			case CorePackage.DERIVED_ROLE_PROJECTION_REF: return createDerivedRoleProjectionRef();
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE: return createDerivedRoleProjectionType();
			case CorePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case CorePackage.DOUBLE_PRECISION_FLOATING_POINT_NUMERIC_DATA_TYPE_TYPE: return createDoublePrecisionFloatingPointNumericDataTypeType();
			case CorePackage.DUPLICATE_READING_SIGNATURE_ERROR_TYPE: return createDuplicateReadingSignatureErrorType();
			case CorePackage.DYNAMIC_COLOR_TYPE: return createDynamicColorType();
			case CorePackage.ELEMENT_REF: return createElementRef();
			case CorePackage.ENTITY_TYPE_INSTANCE_REF: return createEntityTypeInstanceRef();
			case CorePackage.ENTITY_TYPE_INSTANCES_TYPE: return createEntityTypeInstancesType();
			case CorePackage.ENTITY_TYPE_INSTANCE_TYPE: return createEntityTypeInstanceType();
			case CorePackage.ENTITY_TYPE_REQUIRES_REFERENCE_SCHEME_ERROR_TYPE: return createEntityTypeRequiresReferenceSchemeErrorType();
			case CorePackage.ENTITY_TYPE_ROLE_INSTANCES_TYPE: return createEntityTypeRoleInstancesType();
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_REF: return createEntityTypeSubtypeInstanceRef();
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE: return createEntityTypeSubtypeInstanceType();
			case CorePackage.ENTITY_TYPE_TYPE: return createEntityTypeType();
			case CorePackage.EQUALITY_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE: return createEqualityConstraintImpliedByMandatoryConstraintsErrorType();
			case CorePackage.EQUALITY_CONSTRAINT_REF: return createEqualityConstraintRef();
			case CorePackage.EQUALITY_CONSTRAINT_TYPE: return createEqualityConstraintType();
			case CorePackage.EQUALITY_IMPLIED_BY_MANDATORY_ERROR_TYPE: return createEqualityImpliedByMandatoryErrorType();
			case CorePackage.EXCLUSION_CONSTRAINT_REF: return createExclusionConstraintRef();
			case CorePackage.EXCLUSION_CONSTRAINT_TYPE: return createExclusionConstraintType();
			case CorePackage.EXCLUSION_CONTRADICTS_EQUALITY_ERROR_TYPE: return createExclusionContradictsEqualityErrorType();
			case CorePackage.EXCLUSION_CONTRADICTS_MANDATORY_ERROR_TYPE: return createExclusionContradictsMandatoryErrorType();
			case CorePackage.EXCLUSION_CONTRADICTS_SUBSET_ERROR_TYPE: return createExclusionContradictsSubsetErrorType();
			case CorePackage.EXPANDED_DATA_TYPE: return createExpandedDataType();
			case CorePackage.EXTENSIONS_TYPE: return createExtensionsType();
			case CorePackage.EXTERNAL_CONSTRAINT_ROLE_SEQUENCE_ARITY_MISMATCH_ERROR_TYPE: return createExternalConstraintRoleSequenceArityMismatchErrorType();
			case CorePackage.FACT_ROLES_TYPE: return createFactRolesType();
			case CorePackage.FACT_TYPE_DERIVATION_EXPRESSION_TYPE: return createFactTypeDerivationExpressionType();
			case CorePackage.FACT_TYPE_DERIVATION_PATH_REF: return createFactTypeDerivationPathRef();
			case CorePackage.FACT_TYPE_DERIVATION_PATH_TYPE: return createFactTypeDerivationPathType();
			case CorePackage.FACT_TYPE_DERIVATION_PROJECTION_REF: return createFactTypeDerivationProjectionRef();
			case CorePackage.FACT_TYPE_DERIVATION_REQUIRES_PROJECTION_ERROR_TYPE: return createFactTypeDerivationRequiresProjectionErrorType();
			case CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE: return createFactTypeDerivationRuleType();
			case CorePackage.FACT_TYPE_INSTANCE_REF: return createFactTypeInstanceRef();
			case CorePackage.FACT_TYPE_INSTANCES_TYPE: return createFactTypeInstancesType();
			case CorePackage.FACT_TYPE_INSTANCE_TYPE: return createFactTypeInstanceType();
			case CorePackage.FACT_TYPE_REF: return createFactTypeRef();
			case CorePackage.FACT_TYPE_REQUIRES_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE: return createFactTypeRequiresInternalUniquenessConstraintErrorType();
			case CorePackage.FACT_TYPE_REQUIRES_READING_ERROR_TYPE: return createFactTypeRequiresReadingErrorType();
			case CorePackage.FACT_TYPE_ROLE_INSTANCES_TYPE: return createFactTypeRoleInstancesType();
			case CorePackage.FACT_TYPES_TYPE: return createFactTypesType();
			case CorePackage.FACT_TYPE_TYPE: return createFactTypeType();
			case CorePackage.FIXED_LENGTH_RAW_DATA_DATA_TYPE_TYPE: return createFixedLengthRawDataDataTypeType();
			case CorePackage.FIXED_LENGTH_TEXT_DATA_TYPE_TYPE: return createFixedLengthTextDataTypeType();
			case CorePackage.FLOATING_POINT_NUMERIC_DATA_TYPE_TYPE: return createFloatingPointNumericDataTypeType();
			case CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE: return createFrequencyConstraintContradictsInternalUniquenessConstraintErrorType();
			case CorePackage.FREQUENCY_CONSTRAINT_EXACTLY_ONE_ERROR_TYPE: return createFrequencyConstraintExactlyOneErrorType();
			case CorePackage.FREQUENCY_CONSTRAINT_MIN_MAX_ERROR_TYPE: return createFrequencyConstraintMinMaxErrorType();
			case CorePackage.FREQUENCY_CONSTRAINT_NON_RESTRICTIVE_RANGE_ERROR_TYPE: return createFrequencyConstraintNonRestrictiveRangeErrorType();
			case CorePackage.FREQUENCY_CONSTRAINT_REF: return createFrequencyConstraintRef();
			case CorePackage.FREQUENCY_CONSTRAINT_TYPE: return createFrequencyConstraintType();
			case CorePackage.FREQUENCY_CONSTRAINT_VIOLATED_BY_UNIQUENESS_CONSTRAINT_ERROR_TYPE: return createFrequencyConstraintViolatedByUniquenessConstraintErrorType();
			case CorePackage.FUNCTION_DUPLICATE_NAME_ERROR_TYPE: return createFunctionDuplicateNameErrorType();
			case CorePackage.FUNCTION_PARAMETER_REF: return createFunctionParameterRef();
			case CorePackage.FUNCTION_PARAMETER_TYPE: return createFunctionParameterType();
			case CorePackage.FUNCTION_REF: return createFunctionRef();
			case CorePackage.FUNCTIONS_TYPE: return createFunctionsType();
			case CorePackage.FUNCTIONS_TYPE1: return createFunctionsType1();
			case CorePackage.FUNCTION_TYPE: return createFunctionType();
			case CorePackage.GENERATION_SETTINGS_TYPE: return createGenerationSettingsType();
			case CorePackage.GENERATION_SETTING_TYPE: return createGenerationSettingType();
			case CorePackage.GENERATION_STATE_TYPE: return createGenerationStateType();
			case CorePackage.GROUP_DUPLICATE_NAME_ERROR_TYPE: return createGroupDuplicateNameErrorType();
			case CorePackage.GROUP_ELEMENTS_TYPE: return createGroupElementsType();
			case CorePackage.GROUPING_TYPE: return createGroupingType();
			case CorePackage.GROUP_MEMBERSHIP_CONTRADICTION_ERROR_TYPE: return createGroupMembershipContradictionErrorType();
			case CorePackage.GROUP_REF: return createGroupRef();
			case CorePackage.GROUPS_TYPE: return createGroupsType();
			case CorePackage.GROUPS_TYPE1: return createGroupsType1();
			case CorePackage.GROUP_TYPE: return createGroupType();
			case CorePackage.GROUP_TYPE1: return createGroupType1();
			case CorePackage.GROUP_TYPES_TYPE: return createGroupTypesType();
			case CorePackage.GROUP_TYPE_TYPE: return createGroupTypeType();
			case CorePackage.IMPLICATION_ERROR_TYPE: return createImplicationErrorType();
			case CorePackage.IMPLIED_FACT_ROLES_TYPE: return createImpliedFactRolesType();
			case CorePackage.IMPLIED_FACT_TYPE_TYPE: return createImpliedFactTypeType();
			case CorePackage.IMPLIED_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE: return createImpliedInternalUniquenessConstraintErrorType();
			case CorePackage.INFORMAL_DERIVATION_RULE_TYPE: return createInformalDerivationRuleType();
			case CorePackage.INPUT_FROM_TYPE: return createInputFromType();
			case CorePackage.INPUTS_TYPE: return createInputsType();
			case CorePackage.INSTANCES_TYPE: return createInstancesType();
			case CorePackage.INTERNAL_CONSTRAINTS_TYPE: return createInternalConstraintsType();
			case CorePackage.JOINED_CONSTRAINT_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE: return createJoinedConstraintRoleProjectionCompatibilityErrorType();
			case CorePackage.JOINED_PATH_ROLE_REQUIRES_COMPATIBLE_ROLE_PLAYER_ERROR_TYPE: return createJoinedPathRoleRequiresCompatibleRolePlayerErrorType();
			case CorePackage.JOIN_PATH_PROJECTION_REF: return createJoinPathProjectionRef();
			case CorePackage.JOIN_PATH_PROJECTIONS_TYPE: return createJoinPathProjectionsType();
			case CorePackage.JOIN_PATH_PROJECTION_TYPE: return createJoinPathProjectionType();
			case CorePackage.JOIN_PATH_REQUIRED_ERROR_TYPE: return createJoinPathRequiredErrorType();
			case CorePackage.JOIN_PATH_REQUIRES_PROJECTION_ERROR_TYPE: return createJoinPathRequiresProjectionErrorType();
			case CorePackage.JOIN_RULE_TYPE: return createJoinRuleType();
			case CorePackage.LARGE_LENGTH_RAW_DATA_DATA_TYPE_TYPE: return createLargeLengthRawDataDataTypeType();
			case CorePackage.LARGE_LENGTH_TEXT_DATA_TYPE_TYPE: return createLargeLengthTextDataTypeType();
			case CorePackage.LEAD_ROLE_PATH_REF: return createLeadRolePathRef();
			case CorePackage.LEAD_ROLE_PATH_TYPE: return createLeadRolePathType();
			case CorePackage.MANDATORY_CONSTRAINT_REF: return createMandatoryConstraintRef();
			case CorePackage.MANDATORY_CONSTRAINT_TYPE: return createMandatoryConstraintType();
			case CorePackage.MAX_VALUE_MISMATCH_ERROR_TYPE: return createMaxValueMismatchErrorType();
			case CorePackage.MIN_VALUE_MISMATCH_ERROR_TYPE: return createMinValueMismatchErrorType();
			case CorePackage.MODEL_ERROR_DISPLAY_FILTER_TYPE: return createModelErrorDisplayFilterType();
			case CorePackage.MODEL_ERRORS_TYPE: return createModelErrorsType();
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE: return createModelNoteReferencedByType();
			case CorePackage.MODEL_NOTES_TYPE: return createModelNotesType();
			case CorePackage.MODEL_NOTE_TYPE: return createModelNoteType();
			case CorePackage.MONEY_NUMERIC_DATA_TYPE_TYPE: return createMoneyNumericDataTypeType();
			case CorePackage.NAME_GENERATOR_TYPE: return createNameGeneratorType();
			case CorePackage.NESTED_GROUPS_TYPE: return createNestedGroupsType();
			case CorePackage.NMINUS_ONE_ERROR_TYPE: return createNMinusOneErrorType();
			case CorePackage.NOTES_TYPE: return createNotesType();
			case CorePackage.NOTE_TYPE: return createNoteType();
			case CorePackage.NOT_WELL_MODELED_SUBSET_AND_MANDATORY_ERROR_TYPE: return createNotWellModeledSubsetAndMandatoryErrorType();
			case CorePackage.OBJECT_ID_OTHER_DATA_TYPE_TYPE: return createObjectIdOtherDataTypeType();
			case CorePackage.OBJECTIFICATION_REF: return createObjectificationRef();
			case CorePackage.OBJECTIFIED_FACT_TYPE_REF: return createObjectifiedFactTypeRef();
			case CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE: return createObjectifiedInstanceRequiredErrorType();
			case CorePackage.OBJECTIFIED_TYPE_TYPE: return createObjectifiedTypeType();
			case CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE: return createObjectifiedUnaryRoleType();
			case CorePackage.OBJECTIFYING_INSTANCE_REQUIRED_ERROR_TYPE: return createObjectifyingInstanceRequiredErrorType();
			case CorePackage.OBJECTS_TYPE: return createObjectsType();
			case CorePackage.OBJECT_TYPE_CARDINALITY_RESTRICTION_TYPE: return createObjectTypeCardinalityRestrictionType();
			case CorePackage.OBJECT_TYPE_DUPLICATE_NAME_ERROR_TYPE: return createObjectTypeDuplicateNameErrorType();
			case CorePackage.OBJECT_TYPE_INSTANCE_REF: return createObjectTypeInstanceRef();
			case CorePackage.OBJECT_TYPE_REF: return createObjectTypeRef();
			case CorePackage.OBJECT_TYPE_REQUIRES_PRIMARY_SUPERTYPE_ERROR_TYPE: return createObjectTypeRequiresPrimarySupertypeErrorType();
			case CorePackage.OBJECT_TYPE_ROLE_INSTANCE_REF: return createObjectTypeRoleInstanceRef();
			case CorePackage.OBJECT_TYPES_TYPE: return createObjectTypesType();
			case CorePackage.OBJECT_UNIFIER_REF: return createObjectUnifierRef();
			case CorePackage.OBJECT_UNIFIER_REQUIRES_COMPATIBLE_OBJECT_TYPES_ERROR_TYPE: return createObjectUnifierRequiresCompatibleObjectTypesErrorType();
			case CorePackage.OBJECT_UNIFIERS_TYPE: return createObjectUnifiersType();
			case CorePackage.OBJECT_UNIFIER_TYPE: return createObjectUnifierType();
			case CorePackage.OLE_OBJECT_RAW_DATA_DATA_TYPE_TYPE: return createOleObjectRawDataDataTypeType();
			case CorePackage.ORM_MODEL_REF: return createORMModelRef();
			case CorePackage.ORM_MODEL_TYPE: return createORMModelType();
			case CorePackage.PARAMETERS_TYPE: return createParametersType();
			case CorePackage.PARTIAL_FACT_TYPE_DERIVATION_PROJECTION_ERROR_TYPE: return createPartialFactTypeDerivationProjectionErrorType();
			case CorePackage.PARTIAL_JOIN_PATH_PROJECTION_ERROR_TYPE: return createPartialJoinPathProjectionErrorType();
			case CorePackage.PARTIAL_QUERY_DERIVATION_PROJECTION_ERROR_TYPE: return createPartialQueryDerivationProjectionErrorType();
			case CorePackage.PATH_COMPONENTS_TYPE: return createPathComponentsType();
			case CorePackage.PATH_COMPONENT_TYPE: return createPathComponentType();
			case CorePackage.PATH_CONDITION_ROLE_VALUE_RESTRICTION_TYPE: return createPathConditionRoleValueRestrictionType();
			case CorePackage.PATH_CONDITION_ROOT_VALUE_RESTRICTION_TYPE: return createPathConditionRootValueRestrictionType();
			case CorePackage.PATH_CONSTANT_TYPE: return createPathConstantType();
			case CorePackage.PATHED_ROLE_REF: return createPathedRoleRef();
			case CorePackage.PATHED_ROLES_TYPE: return createPathedRolesType();
			case CorePackage.PATHED_ROLE_TYPE: return createPathedRoleType();
			case CorePackage.PATH_OUTER_JOIN_REQUIRES_OPTIONAL_ROLE_ERROR_TYPE: return createPathOuterJoinRequiresOptionalRoleErrorType();
			case CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE: return createPathRequiresRootObjectTypeErrorType();
			case CorePackage.PATH_SAME_FACT_TYPE_ROLE_FOLLOWS_JOIN_ERROR_TYPE: return createPathSameFactTypeRoleFollowsJoinErrorType();
			case CorePackage.PATH_START_ROLE_FOLLOWS_ROOT_OBJECT_TYPE_ERROR_TYPE: return createPathStartRoleFollowsRootObjectTypeErrorType();
			case CorePackage.PICTURE_RAW_DATA_DATA_TYPE_TYPE: return createPictureRawDataDataTypeType();
			case CorePackage.PLAYED_ROLES_TYPE: return createPlayedRolesType();
			case CorePackage.POPULATION_MANDATORY_ERROR_TYPE: return createPopulationMandatoryErrorType();
			case CorePackage.POPULATION_UNIQUENESS_ERROR_TYPE: return createPopulationUniquenessErrorType();
			case CorePackage.PREFERRED_IDENTIFIER_REQUIRES_MANDATORY_ERROR_TYPE: return createPreferredIdentifierRequiresMandatoryErrorType();
			case CorePackage.PROJECTED_FROM_TYPE: return createProjectedFromType();
			case CorePackage.PROJECTED_FROM_TYPE1: return createProjectedFromType1();
			case CorePackage.QUERY_DERIVATION_PATH_REF: return createQueryDerivationPathRef();
			case CorePackage.QUERY_DERIVATION_PATH_TYPE: return createQueryDerivationPathType();
			case CorePackage.QUERY_DERIVATION_REQUIRES_PROJECTION_ERROR_TYPE: return createQueryDerivationRequiresProjectionErrorType();
			case CorePackage.QUERY_DERIVATION_RULE_TYPE: return createQueryDerivationRuleType();
			case CorePackage.QUERY_PARAMETER_BINDINGS_TYPE: return createQueryParameterBindingsType();
			case CorePackage.QUERY_PARAMETER_BINDING_TYPE: return createQueryParameterBindingType();
			case CorePackage.QUERY_PARAMETERS_TYPE: return createQueryParametersType();
			case CorePackage.QUERY_PARAMETER_TYPE: return createQueryParameterType();
			case CorePackage.QUERY_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE: return createQueryRoleProjectionCompatibilityErrorType();
			case CorePackage.QUERY_TYPE: return createQueryType();
			case CorePackage.READING_ORDERS_TYPE: return createReadingOrdersType();
			case CorePackage.READING_ORDER_TYPE: return createReadingOrderType();
			case CorePackage.READING_REF: return createReadingRef();
			case CorePackage.READING_REQUIRES_USER_MODIFICATION_ERROR_TYPE: return createReadingRequiresUserModificationErrorType();
			case CorePackage.READING_ROLE_SEQUENCE_TYPE: return createReadingRoleSequenceType();
			case CorePackage.READINGS_TYPE: return createReadingsType();
			case CorePackage.READINGS_TYPE1: return createReadingsType1();
			case CorePackage.READING_TYPE: return createReadingType();
			case CorePackage.RECOGNIZED_PHRASE_DUPLICATE_NAME_ERROR_TYPE: return createRecognizedPhraseDuplicateNameErrorType();
			case CorePackage.RECOGNIZED_PHRASE_REF: return createRecognizedPhraseRef();
			case CorePackage.RECOGNIZED_PHRASES_TYPE: return createRecognizedPhrasesType();
			case CorePackage.RECOGNIZED_PHRASES_TYPE1: return createRecognizedPhrasesType1();
			case CorePackage.RECOGNIZED_PHRASE_TYPE: return createRecognizedPhraseType();
			case CorePackage.REFERENCE_MODE_KIND_REF: return createReferenceModeKindRef();
			case CorePackage.REFERENCE_MODE_KINDS_TYPE: return createReferenceModeKindsType();
			case CorePackage.REFERENCE_MODE_KIND_TYPE: return createReferenceModeKindType();
			case CorePackage.REFINEMENTS_TYPE: return createRefinementsType();
			case CorePackage.RING_CONSTRAINT_REF: return createRingConstraintRef();
			case CorePackage.RING_CONSTRAINT_TYPE: return createRingConstraintType();
			case CorePackage.RING_CONSTRAINT_TYPE_NOT_SPECIFIED_ERROR_TYPE: return createRingConstraintTypeNotSpecifiedErrorType();
			case CorePackage.ROLE_BASED_DERIVATION_PROJECTION_TYPE: return createRoleBasedDerivationProjectionType();
			case CorePackage.ROLE_INSTANCES_TYPE: return createRoleInstancesType();
			case CorePackage.ROLE_INSTANCES_TYPE1: return createRoleInstancesType1();
			case CorePackage.ROLE_INSTANCE_TYPE: return createRoleInstanceType();
			case CorePackage.ROLE_PLAYER_REQUIRED_ERROR_TYPE: return createRolePlayerRequiredErrorType();
			case CorePackage.ROLE_PROXY_TYPE: return createRoleProxyType();
			case CorePackage.ROLE_REF: return createRoleRef();
			case CorePackage.ROLE_SEQUENCE_ROLE_REF: return createRoleSequenceRoleRef();
			case CorePackage.ROLE_SEQUENCE_WITH_PROJECTION_ROLE_REF: return createRoleSequenceWithProjectionRoleRef();
			case CorePackage.ROLE_SUB_PATH_REF: return createRoleSubPathRef();
			case CorePackage.ROLE_SUB_PATH_TYPE: return createRoleSubPathType();
			case CorePackage.ROLE_TEXT_TYPE: return createRoleTextType();
			case CorePackage.ROLE_TYPE: return createRoleType();
			case CorePackage.ROLE_VALUE_RESTRICTION_TYPE: return createRoleValueRestrictionType();
			case CorePackage.ROOT_OBJECT_TYPE_REF: return createRootObjectTypeRef();
			case CorePackage.ROOT_OBJECT_TYPE_TYPE: return createRootObjectTypeType();
			case CorePackage.ROW_ID_OTHER_DATA_TYPE_TYPE: return createRowIdOtherDataTypeType();
			case CorePackage.SET_COMPARISON_CONSTRAINT_REF: return createSetComparisonConstraintRef();
			case CorePackage.SET_CONSTRAINT_REF: return createSetConstraintRef();
			case CorePackage.SIGNED_INTEGER_NUMERIC_DATA_TYPE_TYPE: return createSignedIntegerNumericDataTypeType();
			case CorePackage.SIGNED_LARGE_INTEGER_NUMERIC_DATA_TYPE_TYPE: return createSignedLargeIntegerNumericDataTypeType();
			case CorePackage.SIGNED_SMALL_INTEGER_NUMERIC_DATA_TYPE_TYPE: return createSignedSmallIntegerNumericDataTypeType();
			case CorePackage.SINGLE_PRECISION_FLOATING_POINT_NUMERIC_DATA_TYPE_TYPE: return createSinglePrecisionFloatingPointNumericDataTypeType();
			case CorePackage.SOURCE_TYPE: return createSourceType();
			case CorePackage.SUB_PATHS_TYPE: return createSubPathsType();
			case CorePackage.SUBQUERIES_TYPE: return createSubqueriesType();
			case CorePackage.SUBQUERY_PARAMETER_INPUTS_FOR_TYPE: return createSubqueryParameterInputsForType();
			case CorePackage.SUBQUERY_PARAMETER_INPUTS_TYPE: return createSubqueryParameterInputsType();
			case CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE: return createSubqueryParameterInputType();
			case CorePackage.SUBQUERY_REF: return createSubqueryRef();
			case CorePackage.SUBSET_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE: return createSubsetConstraintImpliedByMandatoryConstraintsErrorType();
			case CorePackage.SUBSET_CONSTRAINT_REF: return createSubsetConstraintRef();
			case CorePackage.SUBSET_CONSTRAINT_TYPE: return createSubsetConstraintType();
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE: return createSubtypeDerivationPathType();
			case CorePackage.SUBTYPE_DERIVATION_RULE_TYPE: return createSubtypeDerivationRuleType();
			case CorePackage.SUBTYPE_FACT_TYPE_TYPE: return createSubtypeFactTypeType();
			case CorePackage.SUBTYPE_ROLES_TYPE: return createSubtypeRolesType();
			case CorePackage.SUPERSET_ROLE_OF_SUBTYPE_SUBSET_CONSTRAINT_NOT_SUBTYPE_ERROR_TYPE: return createSupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType();
			case CorePackage.TIME_TEMPORAL_DATA_TYPE_TYPE: return createTimeTemporalDataTypeType();
			case CorePackage.TOO_FEW_ENTITY_TYPE_ROLE_INSTANCES_ERROR_TYPE: return createTooFewEntityTypeRoleInstancesErrorType();
			case CorePackage.TOO_FEW_FACT_TYPE_ROLE_INSTANCES_ERROR_TYPE: return createTooFewFactTypeRoleInstancesErrorType();
			case CorePackage.TOO_FEW_READING_ROLES_ERROR_TYPE: return createTooFewReadingRolesErrorType();
			case CorePackage.TOO_FEW_ROLE_SEQUENCES_ERROR_TYPE: return createTooFewRoleSequencesErrorType();
			case CorePackage.TOO_MANY_READING_ROLES_ERROR_TYPE: return createTooManyReadingRolesErrorType();
			case CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE: return createTooManyRoleSequencesErrorType();
			case CorePackage.TRUE_OR_FALSE_LOGICAL_DATA_TYPE_TYPE: return createTrueOrFalseLogicalDataTypeType();
			case CorePackage.UNARY_ROLE_CARDINALITY_RESTRICTION_TYPE: return createUnaryRoleCardinalityRestrictionType();
			case CorePackage.UNIQUENESS_CONSTRAINT_REF: return createUniquenessConstraintRef();
			case CorePackage.UNIQUENESS_CONSTRAINT_TYPE: return createUniquenessConstraintType();
			case CorePackage.UNSIGNED_INTEGER_NUMERIC_DATA_TYPE_TYPE: return createUnsignedIntegerNumericDataTypeType();
			case CorePackage.UNSIGNED_LARGE_INTEGER_NUMERIC_DATA_TYPE_TYPE: return createUnsignedLargeIntegerNumericDataTypeType();
			case CorePackage.UNSIGNED_SMALL_INTEGER_NUMERIC_DATA_TYPE_TYPE: return createUnsignedSmallIntegerNumericDataTypeType();
			case CorePackage.UNSIGNED_TINY_INTEGER_NUMERIC_DATA_TYPE_TYPE: return createUnsignedTinyIntegerNumericDataTypeType();
			case CorePackage.UNSPECIFIED_DATA_TYPE_TYPE: return createUnspecifiedDataTypeType();
			case CorePackage.VALUE_COMPARISON_CONSTRAINT_OPERATOR_NOT_SPECIFIED_ERROR_TYPE: return createValueComparisonConstraintOperatorNotSpecifiedErrorType();
			case CorePackage.VALUE_COMPARISON_CONSTRAINT_REF: return createValueComparisonConstraintRef();
			case CorePackage.VALUE_COMPARISON_CONSTRAINT_TYPE: return createValueComparisonConstraintType();
			case CorePackage.VALUE_COMPARISON_ROLES_NOT_COMPARABLE_ERROR_TYPE: return createValueComparisonRolesNotComparableErrorType();
			case CorePackage.VALUE_CONSTRAINT_REF: return createValueConstraintRef();
			case CorePackage.VALUE_CONSTRAINT_TYPE: return createValueConstraintType();
			case CorePackage.VALUE_CONSTRAINT_WITH_NAME_TYPE: return createValueConstraintWithNameType();
			case CorePackage.VALUE_RANGE_OVERLAP_ERROR_TYPE: return createValueRangeOverlapErrorType();
			case CorePackage.VALUE_RANGE_REF: return createValueRangeRef();
			case CorePackage.VALUE_RANGES_TYPE: return createValueRangesType();
			case CorePackage.VALUE_RANGE_TYPE: return createValueRangeType();
			case CorePackage.VALUE_TYPE_DETACHED_ERROR_TYPE: return createValueTypeDetachedErrorType();
			case CorePackage.VALUE_TYPE_INSTANCE_REF: return createValueTypeInstanceRef();
			case CorePackage.VALUE_TYPE_INSTANCE_TYPE: return createValueTypeInstanceType();
			case CorePackage.VALUE_TYPE_TYPE: return createValueTypeType();
			case CorePackage.VALUE_TYPE_VALUE_RESTRICTION_TYPE: return createValueTypeValueRestrictionType();
			case CorePackage.VARIABLE_LENGTH_RAW_DATA_DATA_TYPE_TYPE: return createVariableLengthRawDataDataTypeType();
			case CorePackage.VARIABLE_LENGTH_TEXT_DATA_TYPE_TYPE: return createVariableLengthTextDataTypeType();
			case CorePackage.YES_OR_NO_LOGICAL_DATA_TYPE_TYPE: return createYesOrNoLogicalDataTypeType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CorePackage.CASING_OPTION_TYPE:
				return createCasingOptionTypeFromString(eDataType, initialValue);
			case CorePackage.CONSTRAINT_MODALITY_VALUES:
				return createConstraintModalityValuesFromString(eDataType, initialValue);
			case CorePackage.DERIVATION_COMPLETENESS_VALUES:
				return createDerivationCompletenessValuesFromString(eDataType, initialValue);
			case CorePackage.DERIVATION_EXPRESSION_STORAGE_VALUES:
				return createDerivationExpressionStorageValuesFromString(eDataType, initialValue);
			case CorePackage.DERIVATION_STORAGE_VALUES:
				return createDerivationStorageValuesFromString(eDataType, initialValue);
			case CorePackage.LOGICAL_COMBINATION_OPERATOR_TYPE:
				return createLogicalCombinationOperatorTypeFromString(eDataType, initialValue);
			case CorePackage.MULTIPLICITY_VALUES:
				return createMultiplicityValuesFromString(eDataType, initialValue);
			case CorePackage.PATHED_ROLE_PURPOSE_TYPE:
				return createPathedRolePurposeTypeFromString(eDataType, initialValue);
			case CorePackage.RANGE_INCLUSION_VALUES:
				return createRangeInclusionValuesFromString(eDataType, initialValue);
			case CorePackage.REFERENCE_MODE_KIND_VALUES:
				return createReferenceModeKindValuesFromString(eDataType, initialValue);
			case CorePackage.RING_CONSTRAINT_TYPE_VALUES:
				return createRingConstraintTypeValuesFromString(eDataType, initialValue);
			case CorePackage.SPACING_FORMAT_TYPE:
				return createSpacingFormatTypeFromString(eDataType, initialValue);
			case CorePackage.TYPE_COMPLIANCE_TYPE:
				return createTypeComplianceTypeFromString(eDataType, initialValue);
			case CorePackage.VALUE_COMPARISON_OPERATOR_VALUES:
				return createValueComparisonOperatorValuesFromString(eDataType, initialValue);
			case CorePackage.CASING_OPTION_TYPE_OBJECT:
				return createCasingOptionTypeObjectFromString(eDataType, initialValue);
			case CorePackage.CONSTRAINT_MODALITY_VALUES_OBJECT:
				return createConstraintModalityValuesObjectFromString(eDataType, initialValue);
			case CorePackage.DERIVATION_COMPLETENESS_VALUES_OBJECT:
				return createDerivationCompletenessValuesObjectFromString(eDataType, initialValue);
			case CorePackage.DERIVATION_EXPRESSION_STORAGE_VALUES_OBJECT:
				return createDerivationExpressionStorageValuesObjectFromString(eDataType, initialValue);
			case CorePackage.DERIVATION_STORAGE_VALUES_OBJECT:
				return createDerivationStorageValuesObjectFromString(eDataType, initialValue);
			case CorePackage.LOGICAL_COMBINATION_OPERATOR_TYPE_OBJECT:
				return createLogicalCombinationOperatorTypeObjectFromString(eDataType, initialValue);
			case CorePackage.MULTIPLICITY_VALUES_OBJECT:
				return createMultiplicityValuesObjectFromString(eDataType, initialValue);
			case CorePackage.PATHED_ROLE_PURPOSE_TYPE_OBJECT:
				return createPathedRolePurposeTypeObjectFromString(eDataType, initialValue);
			case CorePackage.RANGE_INCLUSION_VALUES_OBJECT:
				return createRangeInclusionValuesObjectFromString(eDataType, initialValue);
			case CorePackage.REFERENCE_MODE_KIND_VALUES_OBJECT:
				return createReferenceModeKindValuesObjectFromString(eDataType, initialValue);
			case CorePackage.RING_CONSTRAINT_TYPE_VALUES_OBJECT:
				return createRingConstraintTypeValuesObjectFromString(eDataType, initialValue);
			case CorePackage.SPACING_FORMAT_TYPE_OBJECT:
				return createSpacingFormatTypeObjectFromString(eDataType, initialValue);
			case CorePackage.TYPE_COMPLIANCE_TYPE_OBJECT:
				return createTypeComplianceTypeObjectFromString(eDataType, initialValue);
			case CorePackage.VALUE_COMPARISON_OPERATOR_VALUES_OBJECT:
				return createValueComparisonOperatorValuesObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CorePackage.CASING_OPTION_TYPE:
				return convertCasingOptionTypeToString(eDataType, instanceValue);
			case CorePackage.CONSTRAINT_MODALITY_VALUES:
				return convertConstraintModalityValuesToString(eDataType, instanceValue);
			case CorePackage.DERIVATION_COMPLETENESS_VALUES:
				return convertDerivationCompletenessValuesToString(eDataType, instanceValue);
			case CorePackage.DERIVATION_EXPRESSION_STORAGE_VALUES:
				return convertDerivationExpressionStorageValuesToString(eDataType, instanceValue);
			case CorePackage.DERIVATION_STORAGE_VALUES:
				return convertDerivationStorageValuesToString(eDataType, instanceValue);
			case CorePackage.LOGICAL_COMBINATION_OPERATOR_TYPE:
				return convertLogicalCombinationOperatorTypeToString(eDataType, instanceValue);
			case CorePackage.MULTIPLICITY_VALUES:
				return convertMultiplicityValuesToString(eDataType, instanceValue);
			case CorePackage.PATHED_ROLE_PURPOSE_TYPE:
				return convertPathedRolePurposeTypeToString(eDataType, instanceValue);
			case CorePackage.RANGE_INCLUSION_VALUES:
				return convertRangeInclusionValuesToString(eDataType, instanceValue);
			case CorePackage.REFERENCE_MODE_KIND_VALUES:
				return convertReferenceModeKindValuesToString(eDataType, instanceValue);
			case CorePackage.RING_CONSTRAINT_TYPE_VALUES:
				return convertRingConstraintTypeValuesToString(eDataType, instanceValue);
			case CorePackage.SPACING_FORMAT_TYPE:
				return convertSpacingFormatTypeToString(eDataType, instanceValue);
			case CorePackage.TYPE_COMPLIANCE_TYPE:
				return convertTypeComplianceTypeToString(eDataType, instanceValue);
			case CorePackage.VALUE_COMPARISON_OPERATOR_VALUES:
				return convertValueComparisonOperatorValuesToString(eDataType, instanceValue);
			case CorePackage.CASING_OPTION_TYPE_OBJECT:
				return convertCasingOptionTypeObjectToString(eDataType, instanceValue);
			case CorePackage.CONSTRAINT_MODALITY_VALUES_OBJECT:
				return convertConstraintModalityValuesObjectToString(eDataType, instanceValue);
			case CorePackage.DERIVATION_COMPLETENESS_VALUES_OBJECT:
				return convertDerivationCompletenessValuesObjectToString(eDataType, instanceValue);
			case CorePackage.DERIVATION_EXPRESSION_STORAGE_VALUES_OBJECT:
				return convertDerivationExpressionStorageValuesObjectToString(eDataType, instanceValue);
			case CorePackage.DERIVATION_STORAGE_VALUES_OBJECT:
				return convertDerivationStorageValuesObjectToString(eDataType, instanceValue);
			case CorePackage.LOGICAL_COMBINATION_OPERATOR_TYPE_OBJECT:
				return convertLogicalCombinationOperatorTypeObjectToString(eDataType, instanceValue);
			case CorePackage.MULTIPLICITY_VALUES_OBJECT:
				return convertMultiplicityValuesObjectToString(eDataType, instanceValue);
			case CorePackage.PATHED_ROLE_PURPOSE_TYPE_OBJECT:
				return convertPathedRolePurposeTypeObjectToString(eDataType, instanceValue);
			case CorePackage.RANGE_INCLUSION_VALUES_OBJECT:
				return convertRangeInclusionValuesObjectToString(eDataType, instanceValue);
			case CorePackage.REFERENCE_MODE_KIND_VALUES_OBJECT:
				return convertReferenceModeKindValuesObjectToString(eDataType, instanceValue);
			case CorePackage.RING_CONSTRAINT_TYPE_VALUES_OBJECT:
				return convertRingConstraintTypeValuesObjectToString(eDataType, instanceValue);
			case CorePackage.SPACING_FORMAT_TYPE_OBJECT:
				return convertSpacingFormatTypeObjectToString(eDataType, instanceValue);
			case CorePackage.TYPE_COMPLIANCE_TYPE_OBJECT:
				return convertTypeComplianceTypeObjectToString(eDataType, instanceValue);
			case CorePackage.VALUE_COMPARISON_OPERATOR_VALUES_OBJECT:
				return convertValueComparisonOperatorValuesObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationContextType createAggregationContextType() {
		AggregationContextTypeImpl aggregationContextType = new AggregationContextTypeImpl();
		return aggregationContextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasesType createAliasesType() {
		AliasesTypeImpl aliasesType = new AliasesTypeImpl();
		return aliasesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasType createAliasType() {
		AliasTypeImpl aliasType = new AliasTypeImpl();
		return aliasType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoCounterNumericDataTypeType createAutoCounterNumericDataTypeType() {
		AutoCounterNumericDataTypeTypeImpl autoCounterNumericDataTypeType = new AutoCounterNumericDataTypeTypeImpl();
		return autoCounterNumericDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoTimestampTemporalDataTypeType createAutoTimestampTemporalDataTypeType() {
		AutoTimestampTemporalDataTypeTypeImpl autoTimestampTemporalDataTypeType = new AutoTimestampTemporalDataTypeTypeImpl();
		return autoTimestampTemporalDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundToType createBoundToType() {
		BoundToTypeImpl boundToType = new BoundToTypeImpl();
		return boundToType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedPathValueMustBeConsumedErrorType createCalculatedPathValueMustBeConsumedErrorType() {
		CalculatedPathValueMustBeConsumedErrorTypeImpl calculatedPathValueMustBeConsumedErrorType = new CalculatedPathValueMustBeConsumedErrorTypeImpl();
		return calculatedPathValueMustBeConsumedErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedPathValueParameterBindingErrorType createCalculatedPathValueParameterBindingErrorType() {
		CalculatedPathValueParameterBindingErrorTypeImpl calculatedPathValueParameterBindingErrorType = new CalculatedPathValueParameterBindingErrorTypeImpl();
		return calculatedPathValueParameterBindingErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedPathValueRequiresAggregationContextErrorType createCalculatedPathValueRequiresAggregationContextErrorType() {
		CalculatedPathValueRequiresAggregationContextErrorTypeImpl calculatedPathValueRequiresAggregationContextErrorType = new CalculatedPathValueRequiresAggregationContextErrorTypeImpl();
		return calculatedPathValueRequiresAggregationContextErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedPathValueRequiresFunctionErrorType createCalculatedPathValueRequiresFunctionErrorType() {
		CalculatedPathValueRequiresFunctionErrorTypeImpl calculatedPathValueRequiresFunctionErrorType = new CalculatedPathValueRequiresFunctionErrorTypeImpl();
		return calculatedPathValueRequiresFunctionErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedValueInputType createCalculatedValueInputType() {
		CalculatedValueInputTypeImpl calculatedValueInputType = new CalculatedValueInputTypeImpl();
		return calculatedValueInputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedValueRef createCalculatedValueRef() {
		CalculatedValueRefImpl calculatedValueRef = new CalculatedValueRefImpl();
		return calculatedValueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedValuesType createCalculatedValuesType() {
		CalculatedValuesTypeImpl calculatedValuesType = new CalculatedValuesTypeImpl();
		return calculatedValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedValuesType1 createCalculatedValuesType1() {
		CalculatedValuesType1Impl calculatedValuesType1 = new CalculatedValuesType1Impl();
		return calculatedValuesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedValueType createCalculatedValueType() {
		CalculatedValueTypeImpl calculatedValueType = new CalculatedValueTypeImpl();
		return calculatedValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedValueType1 createCalculatedValueType1() {
		CalculatedValueType1Impl calculatedValueType1 = new CalculatedValueType1Impl();
		return calculatedValueType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityConstraintRef createCardinalityConstraintRef() {
		CardinalityConstraintRefImpl cardinalityConstraintRef = new CardinalityConstraintRefImpl();
		return cardinalityConstraintRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityConstraintType createCardinalityConstraintType() {
		CardinalityConstraintTypeImpl cardinalityConstraintType = new CardinalityConstraintTypeImpl();
		return cardinalityConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityRangeOverlapErrorType createCardinalityRangeOverlapErrorType() {
		CardinalityRangeOverlapErrorTypeImpl cardinalityRangeOverlapErrorType = new CardinalityRangeOverlapErrorTypeImpl();
		return cardinalityRangeOverlapErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityRangesType createCardinalityRangesType() {
		CardinalityRangesTypeImpl cardinalityRangesType = new CardinalityRangesTypeImpl();
		return cardinalityRangesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityRangeType createCardinalityRangeType() {
		CardinalityRangeTypeImpl cardinalityRangeType = new CardinalityRangeTypeImpl();
		return cardinalityRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompatibleRolePlayerTypeErrorType createCompatibleRolePlayerTypeErrorType() {
		CompatibleRolePlayerTypeErrorTypeImpl compatibleRolePlayerTypeErrorType = new CompatibleRolePlayerTypeErrorTypeImpl();
		return compatibleRolePlayerTypeErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompatibleSupertypesErrorType createCompatibleSupertypesErrorType() {
		CompatibleSupertypesErrorTypeImpl compatibleSupertypesErrorType = new CompatibleSupertypesErrorTypeImpl();
		return compatibleSupertypesErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompatibleValueTypeInstanceValueErrorType createCompatibleValueTypeInstanceValueErrorType() {
		CompatibleValueTypeInstanceValueErrorTypeImpl compatibleValueTypeInstanceValueErrorType = new CompatibleValueTypeInstanceValueErrorTypeImpl();
		return compatibleValueTypeInstanceValueErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionsType createConditionsType() {
		ConditionsTypeImpl conditionsType = new ConditionsTypeImpl();
		return conditionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintDuplicateNameErrorType createConstraintDuplicateNameErrorType() {
		ConstraintDuplicateNameErrorTypeImpl constraintDuplicateNameErrorType = new ConstraintDuplicateNameErrorTypeImpl();
		return constraintDuplicateNameErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRoleProjectionRef createConstraintRoleProjectionRef() {
		ConstraintRoleProjectionRefImpl constraintRoleProjectionRef = new ConstraintRoleProjectionRefImpl();
		return constraintRoleProjectionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRoleProjectionType createConstraintRoleProjectionType() {
		ConstraintRoleProjectionTypeImpl constraintRoleProjectionType = new ConstraintRoleProjectionTypeImpl();
		return constraintRoleProjectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRoleSequenceJoinPathRef createConstraintRoleSequenceJoinPathRef() {
		ConstraintRoleSequenceJoinPathRefImpl constraintRoleSequenceJoinPathRef = new ConstraintRoleSequenceJoinPathRefImpl();
		return constraintRoleSequenceJoinPathRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRoleSequenceJoinPathType createConstraintRoleSequenceJoinPathType() {
		ConstraintRoleSequenceJoinPathTypeImpl constraintRoleSequenceJoinPathType = new ConstraintRoleSequenceJoinPathTypeImpl();
		return constraintRoleSequenceJoinPathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRoleSequenceRef createConstraintRoleSequenceRef() {
		ConstraintRoleSequenceRefImpl constraintRoleSequenceRef = new ConstraintRoleSequenceRefImpl();
		return constraintRoleSequenceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRoleSequencesType createConstraintRoleSequencesType() {
		ConstraintRoleSequencesTypeImpl constraintRoleSequencesType = new ConstraintRoleSequencesTypeImpl();
		return constraintRoleSequencesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRoleSequenceType createConstraintRoleSequenceType() {
		ConstraintRoleSequenceTypeImpl constraintRoleSequenceType = new ConstraintRoleSequenceTypeImpl();
		return constraintRoleSequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRoleSequenceWithJoinAndIdType createConstraintRoleSequenceWithJoinAndIdType() {
		ConstraintRoleSequenceWithJoinAndIdTypeImpl constraintRoleSequenceWithJoinAndIdType = new ConstraintRoleSequenceWithJoinAndIdTypeImpl();
		return constraintRoleSequenceWithJoinAndIdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRoleSequenceWithJoinType createConstraintRoleSequenceWithJoinType() {
		ConstraintRoleSequenceWithJoinTypeImpl constraintRoleSequenceWithJoinType = new ConstraintRoleSequenceWithJoinTypeImpl();
		return constraintRoleSequenceWithJoinType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType createConstraintsType() {
		ConstraintsTypeImpl constraintsType = new ConstraintsTypeImpl();
		return constraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType1 createConstraintsType1() {
		ConstraintsType1Impl constraintsType1 = new ConstraintsType1Impl();
		return constraintsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType2 createConstraintsType2() {
		ConstraintsType2Impl constraintsType2 = new ConstraintsType2Impl();
		return constraintsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType3 createConstraintsType3() {
		ConstraintsType3Impl constraintsType3 = new ConstraintsType3Impl();
		return constraintsType3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType4 createConstraintsType4() {
		ConstraintsType4Impl constraintsType4 = new ConstraintsType4Impl();
		return constraintsType4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType5 createConstraintsType5() {
		ConstraintsType5Impl constraintsType5 = new ConstraintsType5Impl();
		return constraintsType5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelatedPathRoleRequiresCompatibleRolePlayerErrorType createCorrelatedPathRoleRequiresCompatibleRolePlayerErrorType() {
		CorrelatedPathRoleRequiresCompatibleRolePlayerErrorTypeImpl correlatedPathRoleRequiresCompatibleRolePlayerErrorType = new CorrelatedPathRoleRequiresCompatibleRolePlayerErrorTypeImpl();
		return correlatedPathRoleRequiresCompatibleRolePlayerErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomReferenceModesType createCustomReferenceModesType() {
		CustomReferenceModesTypeImpl customReferenceModesType = new CustomReferenceModesTypeImpl();
		return customReferenceModesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomReferenceModeType createCustomReferenceModeType() {
		CustomReferenceModeTypeImpl customReferenceModeType = new CustomReferenceModeTypeImpl();
		return customReferenceModeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeNotSpecifiedErrorType createDataTypeNotSpecifiedErrorType() {
		DataTypeNotSpecifiedErrorTypeImpl dataTypeNotSpecifiedErrorType = new DataTypeNotSpecifiedErrorTypeImpl();
		return dataTypeNotSpecifiedErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeRef createDataTypeRef() {
		DataTypeRefImpl dataTypeRef = new DataTypeRefImpl();
		return dataTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeRefRef createDataTypeRefRef() {
		DataTypeRefRefImpl dataTypeRefRef = new DataTypeRefRefImpl();
		return dataTypeRefRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesType createDataTypesType() {
		DataTypesTypeImpl dataTypesType = new DataTypesTypeImpl();
		return dataTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateAndTimeTemporalDataTypeType createDateAndTimeTemporalDataTypeType() {
		DateAndTimeTemporalDataTypeTypeImpl dateAndTimeTemporalDataTypeType = new DateAndTimeTemporalDataTypeTypeImpl();
		return dateAndTimeTemporalDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTemporalDataTypeType createDateTemporalDataTypeType() {
		DateTemporalDataTypeTypeImpl dateTemporalDataTypeType = new DateTemporalDataTypeTypeImpl();
		return dateTemporalDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalNumericDataTypeType createDecimalNumericDataTypeType() {
		DecimalNumericDataTypeTypeImpl decimalNumericDataTypeType = new DecimalNumericDataTypeTypeImpl();
		return decimalNumericDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionsType createDefinitionsType() {
		DefinitionsTypeImpl definitionsType = new DefinitionsTypeImpl();
		return definitionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionType createDefinitionType() {
		DefinitionTypeImpl definitionType = new DefinitionTypeImpl();
		return definitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationExpressionType createDerivationExpressionType() {
		DerivationExpressionTypeImpl derivationExpressionType = new DerivationExpressionTypeImpl();
		return derivationExpressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationProjectionsType createDerivationProjectionsType() {
		DerivationProjectionsTypeImpl derivationProjectionsType = new DerivationProjectionsTypeImpl();
		return derivationProjectionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationProjectionsType1 createDerivationProjectionsType1() {
		DerivationProjectionsType1Impl derivationProjectionsType1 = new DerivationProjectionsType1Impl();
		return derivationProjectionsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationSourceType createDerivationSourceType() {
		DerivationSourceTypeImpl derivationSourceType = new DerivationSourceTypeImpl();
		return derivationSourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationSourceType1 createDerivationSourceType1() {
		DerivationSourceType1Impl derivationSourceType1 = new DerivationSourceType1Impl();
		return derivationSourceType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedFactTypeRoleProjectionCompatibilityErrorType createDerivedFactTypeRoleProjectionCompatibilityErrorType() {
		DerivedFactTypeRoleProjectionCompatibilityErrorTypeImpl derivedFactTypeRoleProjectionCompatibilityErrorType = new DerivedFactTypeRoleProjectionCompatibilityErrorTypeImpl();
		return derivedFactTypeRoleProjectionCompatibilityErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedRoleProjectionRef createDerivedRoleProjectionRef() {
		DerivedRoleProjectionRefImpl derivedRoleProjectionRef = new DerivedRoleProjectionRefImpl();
		return derivedRoleProjectionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedRoleProjectionType createDerivedRoleProjectionType() {
		DerivedRoleProjectionTypeImpl derivedRoleProjectionType = new DerivedRoleProjectionTypeImpl();
		return derivedRoleProjectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoublePrecisionFloatingPointNumericDataTypeType createDoublePrecisionFloatingPointNumericDataTypeType() {
		DoublePrecisionFloatingPointNumericDataTypeTypeImpl doublePrecisionFloatingPointNumericDataTypeType = new DoublePrecisionFloatingPointNumericDataTypeTypeImpl();
		return doublePrecisionFloatingPointNumericDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DuplicateReadingSignatureErrorType createDuplicateReadingSignatureErrorType() {
		DuplicateReadingSignatureErrorTypeImpl duplicateReadingSignatureErrorType = new DuplicateReadingSignatureErrorTypeImpl();
		return duplicateReadingSignatureErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicColorType createDynamicColorType() {
		DynamicColorTypeImpl dynamicColorType = new DynamicColorTypeImpl();
		return dynamicColorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementRef createElementRef() {
		ElementRefImpl elementRef = new ElementRefImpl();
		return elementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityTypeInstanceRef createEntityTypeInstanceRef() {
		EntityTypeInstanceRefImpl entityTypeInstanceRef = new EntityTypeInstanceRefImpl();
		return entityTypeInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityTypeInstancesType createEntityTypeInstancesType() {
		EntityTypeInstancesTypeImpl entityTypeInstancesType = new EntityTypeInstancesTypeImpl();
		return entityTypeInstancesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityTypeInstanceType createEntityTypeInstanceType() {
		EntityTypeInstanceTypeImpl entityTypeInstanceType = new EntityTypeInstanceTypeImpl();
		return entityTypeInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityTypeRequiresReferenceSchemeErrorType createEntityTypeRequiresReferenceSchemeErrorType() {
		EntityTypeRequiresReferenceSchemeErrorTypeImpl entityTypeRequiresReferenceSchemeErrorType = new EntityTypeRequiresReferenceSchemeErrorTypeImpl();
		return entityTypeRequiresReferenceSchemeErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityTypeRoleInstancesType createEntityTypeRoleInstancesType() {
		EntityTypeRoleInstancesTypeImpl entityTypeRoleInstancesType = new EntityTypeRoleInstancesTypeImpl();
		return entityTypeRoleInstancesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityTypeSubtypeInstanceRef createEntityTypeSubtypeInstanceRef() {
		EntityTypeSubtypeInstanceRefImpl entityTypeSubtypeInstanceRef = new EntityTypeSubtypeInstanceRefImpl();
		return entityTypeSubtypeInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityTypeSubtypeInstanceType createEntityTypeSubtypeInstanceType() {
		EntityTypeSubtypeInstanceTypeImpl entityTypeSubtypeInstanceType = new EntityTypeSubtypeInstanceTypeImpl();
		return entityTypeSubtypeInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityTypeType createEntityTypeType() {
		EntityTypeTypeImpl entityTypeType = new EntityTypeTypeImpl();
		return entityTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualityConstraintImpliedByMandatoryConstraintsErrorType createEqualityConstraintImpliedByMandatoryConstraintsErrorType() {
		EqualityConstraintImpliedByMandatoryConstraintsErrorTypeImpl equalityConstraintImpliedByMandatoryConstraintsErrorType = new EqualityConstraintImpliedByMandatoryConstraintsErrorTypeImpl();
		return equalityConstraintImpliedByMandatoryConstraintsErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualityConstraintRef createEqualityConstraintRef() {
		EqualityConstraintRefImpl equalityConstraintRef = new EqualityConstraintRefImpl();
		return equalityConstraintRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualityConstraintType createEqualityConstraintType() {
		EqualityConstraintTypeImpl equalityConstraintType = new EqualityConstraintTypeImpl();
		return equalityConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualityImpliedByMandatoryErrorType createEqualityImpliedByMandatoryErrorType() {
		EqualityImpliedByMandatoryErrorTypeImpl equalityImpliedByMandatoryErrorType = new EqualityImpliedByMandatoryErrorTypeImpl();
		return equalityImpliedByMandatoryErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusionConstraintRef createExclusionConstraintRef() {
		ExclusionConstraintRefImpl exclusionConstraintRef = new ExclusionConstraintRefImpl();
		return exclusionConstraintRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusionConstraintType createExclusionConstraintType() {
		ExclusionConstraintTypeImpl exclusionConstraintType = new ExclusionConstraintTypeImpl();
		return exclusionConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusionContradictsEqualityErrorType createExclusionContradictsEqualityErrorType() {
		ExclusionContradictsEqualityErrorTypeImpl exclusionContradictsEqualityErrorType = new ExclusionContradictsEqualityErrorTypeImpl();
		return exclusionContradictsEqualityErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusionContradictsMandatoryErrorType createExclusionContradictsMandatoryErrorType() {
		ExclusionContradictsMandatoryErrorTypeImpl exclusionContradictsMandatoryErrorType = new ExclusionContradictsMandatoryErrorTypeImpl();
		return exclusionContradictsMandatoryErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusionContradictsSubsetErrorType createExclusionContradictsSubsetErrorType() {
		ExclusionContradictsSubsetErrorTypeImpl exclusionContradictsSubsetErrorType = new ExclusionContradictsSubsetErrorTypeImpl();
		return exclusionContradictsSubsetErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpandedDataType createExpandedDataType() {
		ExpandedDataTypeImpl expandedDataType = new ExpandedDataTypeImpl();
		return expandedDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsType createExtensionsType() {
		ExtensionsTypeImpl extensionsType = new ExtensionsTypeImpl();
		return extensionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalConstraintRoleSequenceArityMismatchErrorType createExternalConstraintRoleSequenceArityMismatchErrorType() {
		ExternalConstraintRoleSequenceArityMismatchErrorTypeImpl externalConstraintRoleSequenceArityMismatchErrorType = new ExternalConstraintRoleSequenceArityMismatchErrorTypeImpl();
		return externalConstraintRoleSequenceArityMismatchErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactRolesType createFactRolesType() {
		FactRolesTypeImpl factRolesType = new FactRolesTypeImpl();
		return factRolesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeDerivationExpressionType createFactTypeDerivationExpressionType() {
		FactTypeDerivationExpressionTypeImpl factTypeDerivationExpressionType = new FactTypeDerivationExpressionTypeImpl();
		return factTypeDerivationExpressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeDerivationPathRef createFactTypeDerivationPathRef() {
		FactTypeDerivationPathRefImpl factTypeDerivationPathRef = new FactTypeDerivationPathRefImpl();
		return factTypeDerivationPathRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeDerivationPathType createFactTypeDerivationPathType() {
		FactTypeDerivationPathTypeImpl factTypeDerivationPathType = new FactTypeDerivationPathTypeImpl();
		return factTypeDerivationPathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeDerivationProjectionRef createFactTypeDerivationProjectionRef() {
		FactTypeDerivationProjectionRefImpl factTypeDerivationProjectionRef = new FactTypeDerivationProjectionRefImpl();
		return factTypeDerivationProjectionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeDerivationRequiresProjectionErrorType createFactTypeDerivationRequiresProjectionErrorType() {
		FactTypeDerivationRequiresProjectionErrorTypeImpl factTypeDerivationRequiresProjectionErrorType = new FactTypeDerivationRequiresProjectionErrorTypeImpl();
		return factTypeDerivationRequiresProjectionErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeDerivationRuleType createFactTypeDerivationRuleType() {
		FactTypeDerivationRuleTypeImpl factTypeDerivationRuleType = new FactTypeDerivationRuleTypeImpl();
		return factTypeDerivationRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeInstanceRef createFactTypeInstanceRef() {
		FactTypeInstanceRefImpl factTypeInstanceRef = new FactTypeInstanceRefImpl();
		return factTypeInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeInstancesType createFactTypeInstancesType() {
		FactTypeInstancesTypeImpl factTypeInstancesType = new FactTypeInstancesTypeImpl();
		return factTypeInstancesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeInstanceType createFactTypeInstanceType() {
		FactTypeInstanceTypeImpl factTypeInstanceType = new FactTypeInstanceTypeImpl();
		return factTypeInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeRef createFactTypeRef() {
		FactTypeRefImpl factTypeRef = new FactTypeRefImpl();
		return factTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeRequiresInternalUniquenessConstraintErrorType createFactTypeRequiresInternalUniquenessConstraintErrorType() {
		FactTypeRequiresInternalUniquenessConstraintErrorTypeImpl factTypeRequiresInternalUniquenessConstraintErrorType = new FactTypeRequiresInternalUniquenessConstraintErrorTypeImpl();
		return factTypeRequiresInternalUniquenessConstraintErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeRequiresReadingErrorType createFactTypeRequiresReadingErrorType() {
		FactTypeRequiresReadingErrorTypeImpl factTypeRequiresReadingErrorType = new FactTypeRequiresReadingErrorTypeImpl();
		return factTypeRequiresReadingErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeRoleInstancesType createFactTypeRoleInstancesType() {
		FactTypeRoleInstancesTypeImpl factTypeRoleInstancesType = new FactTypeRoleInstancesTypeImpl();
		return factTypeRoleInstancesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypesType createFactTypesType() {
		FactTypesTypeImpl factTypesType = new FactTypesTypeImpl();
		return factTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeType createFactTypeType() {
		FactTypeTypeImpl factTypeType = new FactTypeTypeImpl();
		return factTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedLengthRawDataDataTypeType createFixedLengthRawDataDataTypeType() {
		FixedLengthRawDataDataTypeTypeImpl fixedLengthRawDataDataTypeType = new FixedLengthRawDataDataTypeTypeImpl();
		return fixedLengthRawDataDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedLengthTextDataTypeType createFixedLengthTextDataTypeType() {
		FixedLengthTextDataTypeTypeImpl fixedLengthTextDataTypeType = new FixedLengthTextDataTypeTypeImpl();
		return fixedLengthTextDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FloatingPointNumericDataTypeType createFloatingPointNumericDataTypeType() {
		FloatingPointNumericDataTypeTypeImpl floatingPointNumericDataTypeType = new FloatingPointNumericDataTypeTypeImpl();
		return floatingPointNumericDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyConstraintContradictsInternalUniquenessConstraintErrorType createFrequencyConstraintContradictsInternalUniquenessConstraintErrorType() {
		FrequencyConstraintContradictsInternalUniquenessConstraintErrorTypeImpl frequencyConstraintContradictsInternalUniquenessConstraintErrorType = new FrequencyConstraintContradictsInternalUniquenessConstraintErrorTypeImpl();
		return frequencyConstraintContradictsInternalUniquenessConstraintErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyConstraintExactlyOneErrorType createFrequencyConstraintExactlyOneErrorType() {
		FrequencyConstraintExactlyOneErrorTypeImpl frequencyConstraintExactlyOneErrorType = new FrequencyConstraintExactlyOneErrorTypeImpl();
		return frequencyConstraintExactlyOneErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyConstraintMinMaxErrorType createFrequencyConstraintMinMaxErrorType() {
		FrequencyConstraintMinMaxErrorTypeImpl frequencyConstraintMinMaxErrorType = new FrequencyConstraintMinMaxErrorTypeImpl();
		return frequencyConstraintMinMaxErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyConstraintNonRestrictiveRangeErrorType createFrequencyConstraintNonRestrictiveRangeErrorType() {
		FrequencyConstraintNonRestrictiveRangeErrorTypeImpl frequencyConstraintNonRestrictiveRangeErrorType = new FrequencyConstraintNonRestrictiveRangeErrorTypeImpl();
		return frequencyConstraintNonRestrictiveRangeErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyConstraintRef createFrequencyConstraintRef() {
		FrequencyConstraintRefImpl frequencyConstraintRef = new FrequencyConstraintRefImpl();
		return frequencyConstraintRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyConstraintType createFrequencyConstraintType() {
		FrequencyConstraintTypeImpl frequencyConstraintType = new FrequencyConstraintTypeImpl();
		return frequencyConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyConstraintViolatedByUniquenessConstraintErrorType createFrequencyConstraintViolatedByUniquenessConstraintErrorType() {
		FrequencyConstraintViolatedByUniquenessConstraintErrorTypeImpl frequencyConstraintViolatedByUniquenessConstraintErrorType = new FrequencyConstraintViolatedByUniquenessConstraintErrorTypeImpl();
		return frequencyConstraintViolatedByUniquenessConstraintErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDuplicateNameErrorType createFunctionDuplicateNameErrorType() {
		FunctionDuplicateNameErrorTypeImpl functionDuplicateNameErrorType = new FunctionDuplicateNameErrorTypeImpl();
		return functionDuplicateNameErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionParameterRef createFunctionParameterRef() {
		FunctionParameterRefImpl functionParameterRef = new FunctionParameterRefImpl();
		return functionParameterRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionParameterType createFunctionParameterType() {
		FunctionParameterTypeImpl functionParameterType = new FunctionParameterTypeImpl();
		return functionParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionRef createFunctionRef() {
		FunctionRefImpl functionRef = new FunctionRefImpl();
		return functionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsType createFunctionsType() {
		FunctionsTypeImpl functionsType = new FunctionsTypeImpl();
		return functionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsType1 createFunctionsType1() {
		FunctionsType1Impl functionsType1 = new FunctionsType1Impl();
		return functionsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType createFunctionType() {
		FunctionTypeImpl functionType = new FunctionTypeImpl();
		return functionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationSettingsType createGenerationSettingsType() {
		GenerationSettingsTypeImpl generationSettingsType = new GenerationSettingsTypeImpl();
		return generationSettingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationSettingType createGenerationSettingType() {
		GenerationSettingTypeImpl generationSettingType = new GenerationSettingTypeImpl();
		return generationSettingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationStateType createGenerationStateType() {
		GenerationStateTypeImpl generationStateType = new GenerationStateTypeImpl();
		return generationStateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupDuplicateNameErrorType createGroupDuplicateNameErrorType() {
		GroupDuplicateNameErrorTypeImpl groupDuplicateNameErrorType = new GroupDuplicateNameErrorTypeImpl();
		return groupDuplicateNameErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupElementsType createGroupElementsType() {
		GroupElementsTypeImpl groupElementsType = new GroupElementsTypeImpl();
		return groupElementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingType createGroupingType() {
		GroupingTypeImpl groupingType = new GroupingTypeImpl();
		return groupingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupMembershipContradictionErrorType createGroupMembershipContradictionErrorType() {
		GroupMembershipContradictionErrorTypeImpl groupMembershipContradictionErrorType = new GroupMembershipContradictionErrorTypeImpl();
		return groupMembershipContradictionErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupRef createGroupRef() {
		GroupRefImpl groupRef = new GroupRefImpl();
		return groupRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupsType createGroupsType() {
		GroupsTypeImpl groupsType = new GroupsTypeImpl();
		return groupsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupsType1 createGroupsType1() {
		GroupsType1Impl groupsType1 = new GroupsType1Impl();
		return groupsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupType createGroupType() {
		GroupTypeImpl groupType = new GroupTypeImpl();
		return groupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupType1 createGroupType1() {
		GroupType1Impl groupType1 = new GroupType1Impl();
		return groupType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupTypesType createGroupTypesType() {
		GroupTypesTypeImpl groupTypesType = new GroupTypesTypeImpl();
		return groupTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupTypeType createGroupTypeType() {
		GroupTypeTypeImpl groupTypeType = new GroupTypeTypeImpl();
		return groupTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicationErrorType createImplicationErrorType() {
		ImplicationErrorTypeImpl implicationErrorType = new ImplicationErrorTypeImpl();
		return implicationErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpliedFactRolesType createImpliedFactRolesType() {
		ImpliedFactRolesTypeImpl impliedFactRolesType = new ImpliedFactRolesTypeImpl();
		return impliedFactRolesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpliedFactTypeType createImpliedFactTypeType() {
		ImpliedFactTypeTypeImpl impliedFactTypeType = new ImpliedFactTypeTypeImpl();
		return impliedFactTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImpliedInternalUniquenessConstraintErrorType createImpliedInternalUniquenessConstraintErrorType() {
		ImpliedInternalUniquenessConstraintErrorTypeImpl impliedInternalUniquenessConstraintErrorType = new ImpliedInternalUniquenessConstraintErrorTypeImpl();
		return impliedInternalUniquenessConstraintErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformalDerivationRuleType createInformalDerivationRuleType() {
		InformalDerivationRuleTypeImpl informalDerivationRuleType = new InformalDerivationRuleTypeImpl();
		return informalDerivationRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputFromType createInputFromType() {
		InputFromTypeImpl inputFromType = new InputFromTypeImpl();
		return inputFromType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputsType createInputsType() {
		InputsTypeImpl inputsType = new InputsTypeImpl();
		return inputsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancesType createInstancesType() {
		InstancesTypeImpl instancesType = new InstancesTypeImpl();
		return instancesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalConstraintsType createInternalConstraintsType() {
		InternalConstraintsTypeImpl internalConstraintsType = new InternalConstraintsTypeImpl();
		return internalConstraintsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinedConstraintRoleProjectionCompatibilityErrorType createJoinedConstraintRoleProjectionCompatibilityErrorType() {
		JoinedConstraintRoleProjectionCompatibilityErrorTypeImpl joinedConstraintRoleProjectionCompatibilityErrorType = new JoinedConstraintRoleProjectionCompatibilityErrorTypeImpl();
		return joinedConstraintRoleProjectionCompatibilityErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinedPathRoleRequiresCompatibleRolePlayerErrorType createJoinedPathRoleRequiresCompatibleRolePlayerErrorType() {
		JoinedPathRoleRequiresCompatibleRolePlayerErrorTypeImpl joinedPathRoleRequiresCompatibleRolePlayerErrorType = new JoinedPathRoleRequiresCompatibleRolePlayerErrorTypeImpl();
		return joinedPathRoleRequiresCompatibleRolePlayerErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinPathProjectionRef createJoinPathProjectionRef() {
		JoinPathProjectionRefImpl joinPathProjectionRef = new JoinPathProjectionRefImpl();
		return joinPathProjectionRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinPathProjectionsType createJoinPathProjectionsType() {
		JoinPathProjectionsTypeImpl joinPathProjectionsType = new JoinPathProjectionsTypeImpl();
		return joinPathProjectionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinPathProjectionType createJoinPathProjectionType() {
		JoinPathProjectionTypeImpl joinPathProjectionType = new JoinPathProjectionTypeImpl();
		return joinPathProjectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinPathRequiredErrorType createJoinPathRequiredErrorType() {
		JoinPathRequiredErrorTypeImpl joinPathRequiredErrorType = new JoinPathRequiredErrorTypeImpl();
		return joinPathRequiredErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinPathRequiresProjectionErrorType createJoinPathRequiresProjectionErrorType() {
		JoinPathRequiresProjectionErrorTypeImpl joinPathRequiresProjectionErrorType = new JoinPathRequiresProjectionErrorTypeImpl();
		return joinPathRequiresProjectionErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinRuleType createJoinRuleType() {
		JoinRuleTypeImpl joinRuleType = new JoinRuleTypeImpl();
		return joinRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeLengthRawDataDataTypeType createLargeLengthRawDataDataTypeType() {
		LargeLengthRawDataDataTypeTypeImpl largeLengthRawDataDataTypeType = new LargeLengthRawDataDataTypeTypeImpl();
		return largeLengthRawDataDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LargeLengthTextDataTypeType createLargeLengthTextDataTypeType() {
		LargeLengthTextDataTypeTypeImpl largeLengthTextDataTypeType = new LargeLengthTextDataTypeTypeImpl();
		return largeLengthTextDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeadRolePathRef createLeadRolePathRef() {
		LeadRolePathRefImpl leadRolePathRef = new LeadRolePathRefImpl();
		return leadRolePathRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeadRolePathType createLeadRolePathType() {
		LeadRolePathTypeImpl leadRolePathType = new LeadRolePathTypeImpl();
		return leadRolePathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryConstraintRef createMandatoryConstraintRef() {
		MandatoryConstraintRefImpl mandatoryConstraintRef = new MandatoryConstraintRefImpl();
		return mandatoryConstraintRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryConstraintType createMandatoryConstraintType() {
		MandatoryConstraintTypeImpl mandatoryConstraintType = new MandatoryConstraintTypeImpl();
		return mandatoryConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaxValueMismatchErrorType createMaxValueMismatchErrorType() {
		MaxValueMismatchErrorTypeImpl maxValueMismatchErrorType = new MaxValueMismatchErrorTypeImpl();
		return maxValueMismatchErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinValueMismatchErrorType createMinValueMismatchErrorType() {
		MinValueMismatchErrorTypeImpl minValueMismatchErrorType = new MinValueMismatchErrorTypeImpl();
		return minValueMismatchErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelErrorDisplayFilterType createModelErrorDisplayFilterType() {
		ModelErrorDisplayFilterTypeImpl modelErrorDisplayFilterType = new ModelErrorDisplayFilterTypeImpl();
		return modelErrorDisplayFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelErrorsType createModelErrorsType() {
		ModelErrorsTypeImpl modelErrorsType = new ModelErrorsTypeImpl();
		return modelErrorsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelNoteReferencedByType createModelNoteReferencedByType() {
		ModelNoteReferencedByTypeImpl modelNoteReferencedByType = new ModelNoteReferencedByTypeImpl();
		return modelNoteReferencedByType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelNotesType createModelNotesType() {
		ModelNotesTypeImpl modelNotesType = new ModelNotesTypeImpl();
		return modelNotesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelNoteType createModelNoteType() {
		ModelNoteTypeImpl modelNoteType = new ModelNoteTypeImpl();
		return modelNoteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoneyNumericDataTypeType createMoneyNumericDataTypeType() {
		MoneyNumericDataTypeTypeImpl moneyNumericDataTypeType = new MoneyNumericDataTypeTypeImpl();
		return moneyNumericDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameGeneratorType createNameGeneratorType() {
		NameGeneratorTypeImpl nameGeneratorType = new NameGeneratorTypeImpl();
		return nameGeneratorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedGroupsType createNestedGroupsType() {
		NestedGroupsTypeImpl nestedGroupsType = new NestedGroupsTypeImpl();
		return nestedGroupsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NMinusOneErrorType createNMinusOneErrorType() {
		NMinusOneErrorTypeImpl nMinusOneErrorType = new NMinusOneErrorTypeImpl();
		return nMinusOneErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotesType createNotesType() {
		NotesTypeImpl notesType = new NotesTypeImpl();
		return notesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteType createNoteType() {
		NoteTypeImpl noteType = new NoteTypeImpl();
		return noteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotWellModeledSubsetAndMandatoryErrorType createNotWellModeledSubsetAndMandatoryErrorType() {
		NotWellModeledSubsetAndMandatoryErrorTypeImpl notWellModeledSubsetAndMandatoryErrorType = new NotWellModeledSubsetAndMandatoryErrorTypeImpl();
		return notWellModeledSubsetAndMandatoryErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectIdOtherDataTypeType createObjectIdOtherDataTypeType() {
		ObjectIdOtherDataTypeTypeImpl objectIdOtherDataTypeType = new ObjectIdOtherDataTypeTypeImpl();
		return objectIdOtherDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectificationRef createObjectificationRef() {
		ObjectificationRefImpl objectificationRef = new ObjectificationRefImpl();
		return objectificationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectifiedFactTypeRef createObjectifiedFactTypeRef() {
		ObjectifiedFactTypeRefImpl objectifiedFactTypeRef = new ObjectifiedFactTypeRefImpl();
		return objectifiedFactTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectifiedInstanceRequiredErrorType createObjectifiedInstanceRequiredErrorType() {
		ObjectifiedInstanceRequiredErrorTypeImpl objectifiedInstanceRequiredErrorType = new ObjectifiedInstanceRequiredErrorTypeImpl();
		return objectifiedInstanceRequiredErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectifiedTypeType createObjectifiedTypeType() {
		ObjectifiedTypeTypeImpl objectifiedTypeType = new ObjectifiedTypeTypeImpl();
		return objectifiedTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectifiedUnaryRoleType createObjectifiedUnaryRoleType() {
		ObjectifiedUnaryRoleTypeImpl objectifiedUnaryRoleType = new ObjectifiedUnaryRoleTypeImpl();
		return objectifiedUnaryRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectifyingInstanceRequiredErrorType createObjectifyingInstanceRequiredErrorType() {
		ObjectifyingInstanceRequiredErrorTypeImpl objectifyingInstanceRequiredErrorType = new ObjectifyingInstanceRequiredErrorTypeImpl();
		return objectifyingInstanceRequiredErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectsType createObjectsType() {
		ObjectsTypeImpl objectsType = new ObjectsTypeImpl();
		return objectsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeCardinalityRestrictionType createObjectTypeCardinalityRestrictionType() {
		ObjectTypeCardinalityRestrictionTypeImpl objectTypeCardinalityRestrictionType = new ObjectTypeCardinalityRestrictionTypeImpl();
		return objectTypeCardinalityRestrictionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeDuplicateNameErrorType createObjectTypeDuplicateNameErrorType() {
		ObjectTypeDuplicateNameErrorTypeImpl objectTypeDuplicateNameErrorType = new ObjectTypeDuplicateNameErrorTypeImpl();
		return objectTypeDuplicateNameErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeInstanceRef createObjectTypeInstanceRef() {
		ObjectTypeInstanceRefImpl objectTypeInstanceRef = new ObjectTypeInstanceRefImpl();
		return objectTypeInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeRef createObjectTypeRef() {
		ObjectTypeRefImpl objectTypeRef = new ObjectTypeRefImpl();
		return objectTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeRequiresPrimarySupertypeErrorType createObjectTypeRequiresPrimarySupertypeErrorType() {
		ObjectTypeRequiresPrimarySupertypeErrorTypeImpl objectTypeRequiresPrimarySupertypeErrorType = new ObjectTypeRequiresPrimarySupertypeErrorTypeImpl();
		return objectTypeRequiresPrimarySupertypeErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeRoleInstanceRef createObjectTypeRoleInstanceRef() {
		ObjectTypeRoleInstanceRefImpl objectTypeRoleInstanceRef = new ObjectTypeRoleInstanceRefImpl();
		return objectTypeRoleInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypesType createObjectTypesType() {
		ObjectTypesTypeImpl objectTypesType = new ObjectTypesTypeImpl();
		return objectTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectUnifierRef createObjectUnifierRef() {
		ObjectUnifierRefImpl objectUnifierRef = new ObjectUnifierRefImpl();
		return objectUnifierRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectUnifierRequiresCompatibleObjectTypesErrorType createObjectUnifierRequiresCompatibleObjectTypesErrorType() {
		ObjectUnifierRequiresCompatibleObjectTypesErrorTypeImpl objectUnifierRequiresCompatibleObjectTypesErrorType = new ObjectUnifierRequiresCompatibleObjectTypesErrorTypeImpl();
		return objectUnifierRequiresCompatibleObjectTypesErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectUnifiersType createObjectUnifiersType() {
		ObjectUnifiersTypeImpl objectUnifiersType = new ObjectUnifiersTypeImpl();
		return objectUnifiersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectUnifierType createObjectUnifierType() {
		ObjectUnifierTypeImpl objectUnifierType = new ObjectUnifierTypeImpl();
		return objectUnifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OleObjectRawDataDataTypeType createOleObjectRawDataDataTypeType() {
		OleObjectRawDataDataTypeTypeImpl oleObjectRawDataDataTypeType = new OleObjectRawDataDataTypeTypeImpl();
		return oleObjectRawDataDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORMModelRef createORMModelRef() {
		ORMModelRefImpl ormModelRef = new ORMModelRefImpl();
		return ormModelRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORMModelType createORMModelType() {
		ORMModelTypeImpl ormModelType = new ORMModelTypeImpl();
		return ormModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersType createParametersType() {
		ParametersTypeImpl parametersType = new ParametersTypeImpl();
		return parametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialFactTypeDerivationProjectionErrorType createPartialFactTypeDerivationProjectionErrorType() {
		PartialFactTypeDerivationProjectionErrorTypeImpl partialFactTypeDerivationProjectionErrorType = new PartialFactTypeDerivationProjectionErrorTypeImpl();
		return partialFactTypeDerivationProjectionErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialJoinPathProjectionErrorType createPartialJoinPathProjectionErrorType() {
		PartialJoinPathProjectionErrorTypeImpl partialJoinPathProjectionErrorType = new PartialJoinPathProjectionErrorTypeImpl();
		return partialJoinPathProjectionErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialQueryDerivationProjectionErrorType createPartialQueryDerivationProjectionErrorType() {
		PartialQueryDerivationProjectionErrorTypeImpl partialQueryDerivationProjectionErrorType = new PartialQueryDerivationProjectionErrorTypeImpl();
		return partialQueryDerivationProjectionErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathComponentsType createPathComponentsType() {
		PathComponentsTypeImpl pathComponentsType = new PathComponentsTypeImpl();
		return pathComponentsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathComponentType createPathComponentType() {
		PathComponentTypeImpl pathComponentType = new PathComponentTypeImpl();
		return pathComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathConditionRoleValueRestrictionType createPathConditionRoleValueRestrictionType() {
		PathConditionRoleValueRestrictionTypeImpl pathConditionRoleValueRestrictionType = new PathConditionRoleValueRestrictionTypeImpl();
		return pathConditionRoleValueRestrictionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathConditionRootValueRestrictionType createPathConditionRootValueRestrictionType() {
		PathConditionRootValueRestrictionTypeImpl pathConditionRootValueRestrictionType = new PathConditionRootValueRestrictionTypeImpl();
		return pathConditionRootValueRestrictionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathConstantType createPathConstantType() {
		PathConstantTypeImpl pathConstantType = new PathConstantTypeImpl();
		return pathConstantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathedRoleRef createPathedRoleRef() {
		PathedRoleRefImpl pathedRoleRef = new PathedRoleRefImpl();
		return pathedRoleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathedRolesType createPathedRolesType() {
		PathedRolesTypeImpl pathedRolesType = new PathedRolesTypeImpl();
		return pathedRolesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathedRoleType createPathedRoleType() {
		PathedRoleTypeImpl pathedRoleType = new PathedRoleTypeImpl();
		return pathedRoleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathOuterJoinRequiresOptionalRoleErrorType createPathOuterJoinRequiresOptionalRoleErrorType() {
		PathOuterJoinRequiresOptionalRoleErrorTypeImpl pathOuterJoinRequiresOptionalRoleErrorType = new PathOuterJoinRequiresOptionalRoleErrorTypeImpl();
		return pathOuterJoinRequiresOptionalRoleErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathRequiresRootObjectTypeErrorType createPathRequiresRootObjectTypeErrorType() {
		PathRequiresRootObjectTypeErrorTypeImpl pathRequiresRootObjectTypeErrorType = new PathRequiresRootObjectTypeErrorTypeImpl();
		return pathRequiresRootObjectTypeErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathSameFactTypeRoleFollowsJoinErrorType createPathSameFactTypeRoleFollowsJoinErrorType() {
		PathSameFactTypeRoleFollowsJoinErrorTypeImpl pathSameFactTypeRoleFollowsJoinErrorType = new PathSameFactTypeRoleFollowsJoinErrorTypeImpl();
		return pathSameFactTypeRoleFollowsJoinErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathStartRoleFollowsRootObjectTypeErrorType createPathStartRoleFollowsRootObjectTypeErrorType() {
		PathStartRoleFollowsRootObjectTypeErrorTypeImpl pathStartRoleFollowsRootObjectTypeErrorType = new PathStartRoleFollowsRootObjectTypeErrorTypeImpl();
		return pathStartRoleFollowsRootObjectTypeErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PictureRawDataDataTypeType createPictureRawDataDataTypeType() {
		PictureRawDataDataTypeTypeImpl pictureRawDataDataTypeType = new PictureRawDataDataTypeTypeImpl();
		return pictureRawDataDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayedRolesType createPlayedRolesType() {
		PlayedRolesTypeImpl playedRolesType = new PlayedRolesTypeImpl();
		return playedRolesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationMandatoryErrorType createPopulationMandatoryErrorType() {
		PopulationMandatoryErrorTypeImpl populationMandatoryErrorType = new PopulationMandatoryErrorTypeImpl();
		return populationMandatoryErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PopulationUniquenessErrorType createPopulationUniquenessErrorType() {
		PopulationUniquenessErrorTypeImpl populationUniquenessErrorType = new PopulationUniquenessErrorTypeImpl();
		return populationUniquenessErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreferredIdentifierRequiresMandatoryErrorType createPreferredIdentifierRequiresMandatoryErrorType() {
		PreferredIdentifierRequiresMandatoryErrorTypeImpl preferredIdentifierRequiresMandatoryErrorType = new PreferredIdentifierRequiresMandatoryErrorTypeImpl();
		return preferredIdentifierRequiresMandatoryErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectedFromType createProjectedFromType() {
		ProjectedFromTypeImpl projectedFromType = new ProjectedFromTypeImpl();
		return projectedFromType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectedFromType1 createProjectedFromType1() {
		ProjectedFromType1Impl projectedFromType1 = new ProjectedFromType1Impl();
		return projectedFromType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryDerivationPathRef createQueryDerivationPathRef() {
		QueryDerivationPathRefImpl queryDerivationPathRef = new QueryDerivationPathRefImpl();
		return queryDerivationPathRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryDerivationPathType createQueryDerivationPathType() {
		QueryDerivationPathTypeImpl queryDerivationPathType = new QueryDerivationPathTypeImpl();
		return queryDerivationPathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryDerivationRequiresProjectionErrorType createQueryDerivationRequiresProjectionErrorType() {
		QueryDerivationRequiresProjectionErrorTypeImpl queryDerivationRequiresProjectionErrorType = new QueryDerivationRequiresProjectionErrorTypeImpl();
		return queryDerivationRequiresProjectionErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryDerivationRuleType createQueryDerivationRuleType() {
		QueryDerivationRuleTypeImpl queryDerivationRuleType = new QueryDerivationRuleTypeImpl();
		return queryDerivationRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParameterBindingsType createQueryParameterBindingsType() {
		QueryParameterBindingsTypeImpl queryParameterBindingsType = new QueryParameterBindingsTypeImpl();
		return queryParameterBindingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParameterBindingType createQueryParameterBindingType() {
		QueryParameterBindingTypeImpl queryParameterBindingType = new QueryParameterBindingTypeImpl();
		return queryParameterBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParametersType createQueryParametersType() {
		QueryParametersTypeImpl queryParametersType = new QueryParametersTypeImpl();
		return queryParametersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParameterType createQueryParameterType() {
		QueryParameterTypeImpl queryParameterType = new QueryParameterTypeImpl();
		return queryParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryRoleProjectionCompatibilityErrorType createQueryRoleProjectionCompatibilityErrorType() {
		QueryRoleProjectionCompatibilityErrorTypeImpl queryRoleProjectionCompatibilityErrorType = new QueryRoleProjectionCompatibilityErrorTypeImpl();
		return queryRoleProjectionCompatibilityErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryType createQueryType() {
		QueryTypeImpl queryType = new QueryTypeImpl();
		return queryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingOrdersType createReadingOrdersType() {
		ReadingOrdersTypeImpl readingOrdersType = new ReadingOrdersTypeImpl();
		return readingOrdersType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingOrderType createReadingOrderType() {
		ReadingOrderTypeImpl readingOrderType = new ReadingOrderTypeImpl();
		return readingOrderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingRef createReadingRef() {
		ReadingRefImpl readingRef = new ReadingRefImpl();
		return readingRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingRequiresUserModificationErrorType createReadingRequiresUserModificationErrorType() {
		ReadingRequiresUserModificationErrorTypeImpl readingRequiresUserModificationErrorType = new ReadingRequiresUserModificationErrorTypeImpl();
		return readingRequiresUserModificationErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingRoleSequenceType createReadingRoleSequenceType() {
		ReadingRoleSequenceTypeImpl readingRoleSequenceType = new ReadingRoleSequenceTypeImpl();
		return readingRoleSequenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingsType createReadingsType() {
		ReadingsTypeImpl readingsType = new ReadingsTypeImpl();
		return readingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingsType1 createReadingsType1() {
		ReadingsType1Impl readingsType1 = new ReadingsType1Impl();
		return readingsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingType createReadingType() {
		ReadingTypeImpl readingType = new ReadingTypeImpl();
		return readingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecognizedPhraseDuplicateNameErrorType createRecognizedPhraseDuplicateNameErrorType() {
		RecognizedPhraseDuplicateNameErrorTypeImpl recognizedPhraseDuplicateNameErrorType = new RecognizedPhraseDuplicateNameErrorTypeImpl();
		return recognizedPhraseDuplicateNameErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecognizedPhraseRef createRecognizedPhraseRef() {
		RecognizedPhraseRefImpl recognizedPhraseRef = new RecognizedPhraseRefImpl();
		return recognizedPhraseRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecognizedPhrasesType createRecognizedPhrasesType() {
		RecognizedPhrasesTypeImpl recognizedPhrasesType = new RecognizedPhrasesTypeImpl();
		return recognizedPhrasesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecognizedPhrasesType1 createRecognizedPhrasesType1() {
		RecognizedPhrasesType1Impl recognizedPhrasesType1 = new RecognizedPhrasesType1Impl();
		return recognizedPhrasesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecognizedPhraseType createRecognizedPhraseType() {
		RecognizedPhraseTypeImpl recognizedPhraseType = new RecognizedPhraseTypeImpl();
		return recognizedPhraseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceModeKindRef createReferenceModeKindRef() {
		ReferenceModeKindRefImpl referenceModeKindRef = new ReferenceModeKindRefImpl();
		return referenceModeKindRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceModeKindsType createReferenceModeKindsType() {
		ReferenceModeKindsTypeImpl referenceModeKindsType = new ReferenceModeKindsTypeImpl();
		return referenceModeKindsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceModeKindType createReferenceModeKindType() {
		ReferenceModeKindTypeImpl referenceModeKindType = new ReferenceModeKindTypeImpl();
		return referenceModeKindType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinementsType createRefinementsType() {
		RefinementsTypeImpl refinementsType = new RefinementsTypeImpl();
		return refinementsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RingConstraintRef createRingConstraintRef() {
		RingConstraintRefImpl ringConstraintRef = new RingConstraintRefImpl();
		return ringConstraintRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RingConstraintType createRingConstraintType() {
		RingConstraintTypeImpl ringConstraintType = new RingConstraintTypeImpl();
		return ringConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RingConstraintTypeNotSpecifiedErrorType createRingConstraintTypeNotSpecifiedErrorType() {
		RingConstraintTypeNotSpecifiedErrorTypeImpl ringConstraintTypeNotSpecifiedErrorType = new RingConstraintTypeNotSpecifiedErrorTypeImpl();
		return ringConstraintTypeNotSpecifiedErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleBasedDerivationProjectionType createRoleBasedDerivationProjectionType() {
		RoleBasedDerivationProjectionTypeImpl roleBasedDerivationProjectionType = new RoleBasedDerivationProjectionTypeImpl();
		return roleBasedDerivationProjectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleInstancesType createRoleInstancesType() {
		RoleInstancesTypeImpl roleInstancesType = new RoleInstancesTypeImpl();
		return roleInstancesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleInstancesType1 createRoleInstancesType1() {
		RoleInstancesType1Impl roleInstancesType1 = new RoleInstancesType1Impl();
		return roleInstancesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleInstanceType createRoleInstanceType() {
		RoleInstanceTypeImpl roleInstanceType = new RoleInstanceTypeImpl();
		return roleInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RolePlayerRequiredErrorType createRolePlayerRequiredErrorType() {
		RolePlayerRequiredErrorTypeImpl rolePlayerRequiredErrorType = new RolePlayerRequiredErrorTypeImpl();
		return rolePlayerRequiredErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleProxyType createRoleProxyType() {
		RoleProxyTypeImpl roleProxyType = new RoleProxyTypeImpl();
		return roleProxyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRef createRoleRef() {
		RoleRefImpl roleRef = new RoleRefImpl();
		return roleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleSequenceRoleRef createRoleSequenceRoleRef() {
		RoleSequenceRoleRefImpl roleSequenceRoleRef = new RoleSequenceRoleRefImpl();
		return roleSequenceRoleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleSequenceWithProjectionRoleRef createRoleSequenceWithProjectionRoleRef() {
		RoleSequenceWithProjectionRoleRefImpl roleSequenceWithProjectionRoleRef = new RoleSequenceWithProjectionRoleRefImpl();
		return roleSequenceWithProjectionRoleRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleSubPathRef createRoleSubPathRef() {
		RoleSubPathRefImpl roleSubPathRef = new RoleSubPathRefImpl();
		return roleSubPathRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleSubPathType createRoleSubPathType() {
		RoleSubPathTypeImpl roleSubPathType = new RoleSubPathTypeImpl();
		return roleSubPathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleTextType createRoleTextType() {
		RoleTextTypeImpl roleTextType = new RoleTextTypeImpl();
		return roleTextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType createRoleType() {
		RoleTypeImpl roleType = new RoleTypeImpl();
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleValueRestrictionType createRoleValueRestrictionType() {
		RoleValueRestrictionTypeImpl roleValueRestrictionType = new RoleValueRestrictionTypeImpl();
		return roleValueRestrictionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootObjectTypeRef createRootObjectTypeRef() {
		RootObjectTypeRefImpl rootObjectTypeRef = new RootObjectTypeRefImpl();
		return rootObjectTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootObjectTypeType createRootObjectTypeType() {
		RootObjectTypeTypeImpl rootObjectTypeType = new RootObjectTypeTypeImpl();
		return rootObjectTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowIdOtherDataTypeType createRowIdOtherDataTypeType() {
		RowIdOtherDataTypeTypeImpl rowIdOtherDataTypeType = new RowIdOtherDataTypeTypeImpl();
		return rowIdOtherDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetComparisonConstraintRef createSetComparisonConstraintRef() {
		SetComparisonConstraintRefImpl setComparisonConstraintRef = new SetComparisonConstraintRefImpl();
		return setComparisonConstraintRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetConstraintRef createSetConstraintRef() {
		SetConstraintRefImpl setConstraintRef = new SetConstraintRefImpl();
		return setConstraintRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedIntegerNumericDataTypeType createSignedIntegerNumericDataTypeType() {
		SignedIntegerNumericDataTypeTypeImpl signedIntegerNumericDataTypeType = new SignedIntegerNumericDataTypeTypeImpl();
		return signedIntegerNumericDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedLargeIntegerNumericDataTypeType createSignedLargeIntegerNumericDataTypeType() {
		SignedLargeIntegerNumericDataTypeTypeImpl signedLargeIntegerNumericDataTypeType = new SignedLargeIntegerNumericDataTypeTypeImpl();
		return signedLargeIntegerNumericDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignedSmallIntegerNumericDataTypeType createSignedSmallIntegerNumericDataTypeType() {
		SignedSmallIntegerNumericDataTypeTypeImpl signedSmallIntegerNumericDataTypeType = new SignedSmallIntegerNumericDataTypeTypeImpl();
		return signedSmallIntegerNumericDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinglePrecisionFloatingPointNumericDataTypeType createSinglePrecisionFloatingPointNumericDataTypeType() {
		SinglePrecisionFloatingPointNumericDataTypeTypeImpl singlePrecisionFloatingPointNumericDataTypeType = new SinglePrecisionFloatingPointNumericDataTypeTypeImpl();
		return singlePrecisionFloatingPointNumericDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType createSourceType() {
		SourceTypeImpl sourceType = new SourceTypeImpl();
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubPathsType createSubPathsType() {
		SubPathsTypeImpl subPathsType = new SubPathsTypeImpl();
		return subPathsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubqueriesType createSubqueriesType() {
		SubqueriesTypeImpl subqueriesType = new SubqueriesTypeImpl();
		return subqueriesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubqueryParameterInputsForType createSubqueryParameterInputsForType() {
		SubqueryParameterInputsForTypeImpl subqueryParameterInputsForType = new SubqueryParameterInputsForTypeImpl();
		return subqueryParameterInputsForType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubqueryParameterInputsType createSubqueryParameterInputsType() {
		SubqueryParameterInputsTypeImpl subqueryParameterInputsType = new SubqueryParameterInputsTypeImpl();
		return subqueryParameterInputsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubqueryParameterInputType createSubqueryParameterInputType() {
		SubqueryParameterInputTypeImpl subqueryParameterInputType = new SubqueryParameterInputTypeImpl();
		return subqueryParameterInputType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubqueryRef createSubqueryRef() {
		SubqueryRefImpl subqueryRef = new SubqueryRefImpl();
		return subqueryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubsetConstraintImpliedByMandatoryConstraintsErrorType createSubsetConstraintImpliedByMandatoryConstraintsErrorType() {
		SubsetConstraintImpliedByMandatoryConstraintsErrorTypeImpl subsetConstraintImpliedByMandatoryConstraintsErrorType = new SubsetConstraintImpliedByMandatoryConstraintsErrorTypeImpl();
		return subsetConstraintImpliedByMandatoryConstraintsErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubsetConstraintRef createSubsetConstraintRef() {
		SubsetConstraintRefImpl subsetConstraintRef = new SubsetConstraintRefImpl();
		return subsetConstraintRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubsetConstraintType createSubsetConstraintType() {
		SubsetConstraintTypeImpl subsetConstraintType = new SubsetConstraintTypeImpl();
		return subsetConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtypeDerivationPathType createSubtypeDerivationPathType() {
		SubtypeDerivationPathTypeImpl subtypeDerivationPathType = new SubtypeDerivationPathTypeImpl();
		return subtypeDerivationPathType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtypeDerivationRuleType createSubtypeDerivationRuleType() {
		SubtypeDerivationRuleTypeImpl subtypeDerivationRuleType = new SubtypeDerivationRuleTypeImpl();
		return subtypeDerivationRuleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtypeFactTypeType createSubtypeFactTypeType() {
		SubtypeFactTypeTypeImpl subtypeFactTypeType = new SubtypeFactTypeTypeImpl();
		return subtypeFactTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtypeRolesType createSubtypeRolesType() {
		SubtypeRolesTypeImpl subtypeRolesType = new SubtypeRolesTypeImpl();
		return subtypeRolesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType createSupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType() {
		SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorTypeImpl supersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType = new SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorTypeImpl();
		return supersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeTemporalDataTypeType createTimeTemporalDataTypeType() {
		TimeTemporalDataTypeTypeImpl timeTemporalDataTypeType = new TimeTemporalDataTypeTypeImpl();
		return timeTemporalDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TooFewEntityTypeRoleInstancesErrorType createTooFewEntityTypeRoleInstancesErrorType() {
		TooFewEntityTypeRoleInstancesErrorTypeImpl tooFewEntityTypeRoleInstancesErrorType = new TooFewEntityTypeRoleInstancesErrorTypeImpl();
		return tooFewEntityTypeRoleInstancesErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TooFewFactTypeRoleInstancesErrorType createTooFewFactTypeRoleInstancesErrorType() {
		TooFewFactTypeRoleInstancesErrorTypeImpl tooFewFactTypeRoleInstancesErrorType = new TooFewFactTypeRoleInstancesErrorTypeImpl();
		return tooFewFactTypeRoleInstancesErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TooFewReadingRolesErrorType createTooFewReadingRolesErrorType() {
		TooFewReadingRolesErrorTypeImpl tooFewReadingRolesErrorType = new TooFewReadingRolesErrorTypeImpl();
		return tooFewReadingRolesErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TooFewRoleSequencesErrorType createTooFewRoleSequencesErrorType() {
		TooFewRoleSequencesErrorTypeImpl tooFewRoleSequencesErrorType = new TooFewRoleSequencesErrorTypeImpl();
		return tooFewRoleSequencesErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TooManyReadingRolesErrorType createTooManyReadingRolesErrorType() {
		TooManyReadingRolesErrorTypeImpl tooManyReadingRolesErrorType = new TooManyReadingRolesErrorTypeImpl();
		return tooManyReadingRolesErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TooManyRoleSequencesErrorType createTooManyRoleSequencesErrorType() {
		TooManyRoleSequencesErrorTypeImpl tooManyRoleSequencesErrorType = new TooManyRoleSequencesErrorTypeImpl();
		return tooManyRoleSequencesErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrueOrFalseLogicalDataTypeType createTrueOrFalseLogicalDataTypeType() {
		TrueOrFalseLogicalDataTypeTypeImpl trueOrFalseLogicalDataTypeType = new TrueOrFalseLogicalDataTypeTypeImpl();
		return trueOrFalseLogicalDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryRoleCardinalityRestrictionType createUnaryRoleCardinalityRestrictionType() {
		UnaryRoleCardinalityRestrictionTypeImpl unaryRoleCardinalityRestrictionType = new UnaryRoleCardinalityRestrictionTypeImpl();
		return unaryRoleCardinalityRestrictionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniquenessConstraintRef createUniquenessConstraintRef() {
		UniquenessConstraintRefImpl uniquenessConstraintRef = new UniquenessConstraintRefImpl();
		return uniquenessConstraintRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniquenessConstraintType createUniquenessConstraintType() {
		UniquenessConstraintTypeImpl uniquenessConstraintType = new UniquenessConstraintTypeImpl();
		return uniquenessConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedIntegerNumericDataTypeType createUnsignedIntegerNumericDataTypeType() {
		UnsignedIntegerNumericDataTypeTypeImpl unsignedIntegerNumericDataTypeType = new UnsignedIntegerNumericDataTypeTypeImpl();
		return unsignedIntegerNumericDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedLargeIntegerNumericDataTypeType createUnsignedLargeIntegerNumericDataTypeType() {
		UnsignedLargeIntegerNumericDataTypeTypeImpl unsignedLargeIntegerNumericDataTypeType = new UnsignedLargeIntegerNumericDataTypeTypeImpl();
		return unsignedLargeIntegerNumericDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedSmallIntegerNumericDataTypeType createUnsignedSmallIntegerNumericDataTypeType() {
		UnsignedSmallIntegerNumericDataTypeTypeImpl unsignedSmallIntegerNumericDataTypeType = new UnsignedSmallIntegerNumericDataTypeTypeImpl();
		return unsignedSmallIntegerNumericDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsignedTinyIntegerNumericDataTypeType createUnsignedTinyIntegerNumericDataTypeType() {
		UnsignedTinyIntegerNumericDataTypeTypeImpl unsignedTinyIntegerNumericDataTypeType = new UnsignedTinyIntegerNumericDataTypeTypeImpl();
		return unsignedTinyIntegerNumericDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnspecifiedDataTypeType createUnspecifiedDataTypeType() {
		UnspecifiedDataTypeTypeImpl unspecifiedDataTypeType = new UnspecifiedDataTypeTypeImpl();
		return unspecifiedDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueComparisonConstraintOperatorNotSpecifiedErrorType createValueComparisonConstraintOperatorNotSpecifiedErrorType() {
		ValueComparisonConstraintOperatorNotSpecifiedErrorTypeImpl valueComparisonConstraintOperatorNotSpecifiedErrorType = new ValueComparisonConstraintOperatorNotSpecifiedErrorTypeImpl();
		return valueComparisonConstraintOperatorNotSpecifiedErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueComparisonConstraintRef createValueComparisonConstraintRef() {
		ValueComparisonConstraintRefImpl valueComparisonConstraintRef = new ValueComparisonConstraintRefImpl();
		return valueComparisonConstraintRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueComparisonConstraintType createValueComparisonConstraintType() {
		ValueComparisonConstraintTypeImpl valueComparisonConstraintType = new ValueComparisonConstraintTypeImpl();
		return valueComparisonConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueComparisonRolesNotComparableErrorType createValueComparisonRolesNotComparableErrorType() {
		ValueComparisonRolesNotComparableErrorTypeImpl valueComparisonRolesNotComparableErrorType = new ValueComparisonRolesNotComparableErrorTypeImpl();
		return valueComparisonRolesNotComparableErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueConstraintRef createValueConstraintRef() {
		ValueConstraintRefImpl valueConstraintRef = new ValueConstraintRefImpl();
		return valueConstraintRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueConstraintType createValueConstraintType() {
		ValueConstraintTypeImpl valueConstraintType = new ValueConstraintTypeImpl();
		return valueConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueConstraintWithNameType createValueConstraintWithNameType() {
		ValueConstraintWithNameTypeImpl valueConstraintWithNameType = new ValueConstraintWithNameTypeImpl();
		return valueConstraintWithNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueRangeOverlapErrorType createValueRangeOverlapErrorType() {
		ValueRangeOverlapErrorTypeImpl valueRangeOverlapErrorType = new ValueRangeOverlapErrorTypeImpl();
		return valueRangeOverlapErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueRangeRef createValueRangeRef() {
		ValueRangeRefImpl valueRangeRef = new ValueRangeRefImpl();
		return valueRangeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueRangesType createValueRangesType() {
		ValueRangesTypeImpl valueRangesType = new ValueRangesTypeImpl();
		return valueRangesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueRangeType createValueRangeType() {
		ValueRangeTypeImpl valueRangeType = new ValueRangeTypeImpl();
		return valueRangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeDetachedErrorType createValueTypeDetachedErrorType() {
		ValueTypeDetachedErrorTypeImpl valueTypeDetachedErrorType = new ValueTypeDetachedErrorTypeImpl();
		return valueTypeDetachedErrorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeInstanceRef createValueTypeInstanceRef() {
		ValueTypeInstanceRefImpl valueTypeInstanceRef = new ValueTypeInstanceRefImpl();
		return valueTypeInstanceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeInstanceType createValueTypeInstanceType() {
		ValueTypeInstanceTypeImpl valueTypeInstanceType = new ValueTypeInstanceTypeImpl();
		return valueTypeInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeType createValueTypeType() {
		ValueTypeTypeImpl valueTypeType = new ValueTypeTypeImpl();
		return valueTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeValueRestrictionType createValueTypeValueRestrictionType() {
		ValueTypeValueRestrictionTypeImpl valueTypeValueRestrictionType = new ValueTypeValueRestrictionTypeImpl();
		return valueTypeValueRestrictionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableLengthRawDataDataTypeType createVariableLengthRawDataDataTypeType() {
		VariableLengthRawDataDataTypeTypeImpl variableLengthRawDataDataTypeType = new VariableLengthRawDataDataTypeTypeImpl();
		return variableLengthRawDataDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableLengthTextDataTypeType createVariableLengthTextDataTypeType() {
		VariableLengthTextDataTypeTypeImpl variableLengthTextDataTypeType = new VariableLengthTextDataTypeTypeImpl();
		return variableLengthTextDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesOrNoLogicalDataTypeType createYesOrNoLogicalDataTypeType() {
		YesOrNoLogicalDataTypeTypeImpl yesOrNoLogicalDataTypeType = new YesOrNoLogicalDataTypeTypeImpl();
		return yesOrNoLogicalDataTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasingOptionType createCasingOptionTypeFromString(EDataType eDataType, String initialValue) {
		CasingOptionType result = CasingOptionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCasingOptionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintModalityValues createConstraintModalityValuesFromString(EDataType eDataType, String initialValue) {
		ConstraintModalityValues result = ConstraintModalityValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintModalityValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationCompletenessValues createDerivationCompletenessValuesFromString(EDataType eDataType, String initialValue) {
		DerivationCompletenessValues result = DerivationCompletenessValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDerivationCompletenessValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationExpressionStorageValues createDerivationExpressionStorageValuesFromString(EDataType eDataType, String initialValue) {
		DerivationExpressionStorageValues result = DerivationExpressionStorageValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDerivationExpressionStorageValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationStorageValues createDerivationStorageValuesFromString(EDataType eDataType, String initialValue) {
		DerivationStorageValues result = DerivationStorageValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDerivationStorageValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalCombinationOperatorType createLogicalCombinationOperatorTypeFromString(EDataType eDataType, String initialValue) {
		LogicalCombinationOperatorType result = LogicalCombinationOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalCombinationOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityValues createMultiplicityValuesFromString(EDataType eDataType, String initialValue) {
		MultiplicityValues result = MultiplicityValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathedRolePurposeType createPathedRolePurposeTypeFromString(EDataType eDataType, String initialValue) {
		PathedRolePurposeType result = PathedRolePurposeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathedRolePurposeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeInclusionValues createRangeInclusionValuesFromString(EDataType eDataType, String initialValue) {
		RangeInclusionValues result = RangeInclusionValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeInclusionValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceModeKindValues createReferenceModeKindValuesFromString(EDataType eDataType, String initialValue) {
		ReferenceModeKindValues result = ReferenceModeKindValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceModeKindValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RingConstraintTypeValues createRingConstraintTypeValuesFromString(EDataType eDataType, String initialValue) {
		RingConstraintTypeValues result = RingConstraintTypeValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRingConstraintTypeValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacingFormatType createSpacingFormatTypeFromString(EDataType eDataType, String initialValue) {
		SpacingFormatType result = SpacingFormatType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpacingFormatTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeComplianceType createTypeComplianceTypeFromString(EDataType eDataType, String initialValue) {
		TypeComplianceType result = TypeComplianceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeComplianceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueComparisonOperatorValues createValueComparisonOperatorValuesFromString(EDataType eDataType, String initialValue) {
		ValueComparisonOperatorValues result = ValueComparisonOperatorValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueComparisonOperatorValuesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasingOptionType createCasingOptionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCasingOptionTypeFromString(CorePackage.eINSTANCE.getCasingOptionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCasingOptionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCasingOptionTypeToString(CorePackage.eINSTANCE.getCasingOptionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintModalityValues createConstraintModalityValuesObjectFromString(EDataType eDataType, String initialValue) {
		return createConstraintModalityValuesFromString(CorePackage.eINSTANCE.getConstraintModalityValues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintModalityValuesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConstraintModalityValuesToString(CorePackage.eINSTANCE.getConstraintModalityValues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationCompletenessValues createDerivationCompletenessValuesObjectFromString(EDataType eDataType, String initialValue) {
		return createDerivationCompletenessValuesFromString(CorePackage.eINSTANCE.getDerivationCompletenessValues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDerivationCompletenessValuesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDerivationCompletenessValuesToString(CorePackage.eINSTANCE.getDerivationCompletenessValues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationExpressionStorageValues createDerivationExpressionStorageValuesObjectFromString(EDataType eDataType, String initialValue) {
		return createDerivationExpressionStorageValuesFromString(CorePackage.eINSTANCE.getDerivationExpressionStorageValues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDerivationExpressionStorageValuesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDerivationExpressionStorageValuesToString(CorePackage.eINSTANCE.getDerivationExpressionStorageValues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationStorageValues createDerivationStorageValuesObjectFromString(EDataType eDataType, String initialValue) {
		return createDerivationStorageValuesFromString(CorePackage.eINSTANCE.getDerivationStorageValues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDerivationStorageValuesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDerivationStorageValuesToString(CorePackage.eINSTANCE.getDerivationStorageValues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalCombinationOperatorType createLogicalCombinationOperatorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createLogicalCombinationOperatorTypeFromString(CorePackage.eINSTANCE.getLogicalCombinationOperatorType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalCombinationOperatorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertLogicalCombinationOperatorTypeToString(CorePackage.eINSTANCE.getLogicalCombinationOperatorType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityValues createMultiplicityValuesObjectFromString(EDataType eDataType, String initialValue) {
		return createMultiplicityValuesFromString(CorePackage.eINSTANCE.getMultiplicityValues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityValuesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMultiplicityValuesToString(CorePackage.eINSTANCE.getMultiplicityValues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathedRolePurposeType createPathedRolePurposeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPathedRolePurposeTypeFromString(CorePackage.eINSTANCE.getPathedRolePurposeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathedRolePurposeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPathedRolePurposeTypeToString(CorePackage.eINSTANCE.getPathedRolePurposeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeInclusionValues createRangeInclusionValuesObjectFromString(EDataType eDataType, String initialValue) {
		return createRangeInclusionValuesFromString(CorePackage.eINSTANCE.getRangeInclusionValues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeInclusionValuesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRangeInclusionValuesToString(CorePackage.eINSTANCE.getRangeInclusionValues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceModeKindValues createReferenceModeKindValuesObjectFromString(EDataType eDataType, String initialValue) {
		return createReferenceModeKindValuesFromString(CorePackage.eINSTANCE.getReferenceModeKindValues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceModeKindValuesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReferenceModeKindValuesToString(CorePackage.eINSTANCE.getReferenceModeKindValues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RingConstraintTypeValues createRingConstraintTypeValuesObjectFromString(EDataType eDataType, String initialValue) {
		return createRingConstraintTypeValuesFromString(CorePackage.eINSTANCE.getRingConstraintTypeValues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRingConstraintTypeValuesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertRingConstraintTypeValuesToString(CorePackage.eINSTANCE.getRingConstraintTypeValues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacingFormatType createSpacingFormatTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSpacingFormatTypeFromString(CorePackage.eINSTANCE.getSpacingFormatType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpacingFormatTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpacingFormatTypeToString(CorePackage.eINSTANCE.getSpacingFormatType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeComplianceType createTypeComplianceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeComplianceTypeFromString(CorePackage.eINSTANCE.getTypeComplianceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeComplianceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeComplianceTypeToString(CorePackage.eINSTANCE.getTypeComplianceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueComparisonOperatorValues createValueComparisonOperatorValuesObjectFromString(EDataType eDataType, String initialValue) {
		return createValueComparisonOperatorValuesFromString(CorePackage.eINSTANCE.getValueComparisonOperatorValues(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValueComparisonOperatorValuesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValueComparisonOperatorValuesToString(CorePackage.eINSTANCE.getValueComparisonOperatorValues(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl
