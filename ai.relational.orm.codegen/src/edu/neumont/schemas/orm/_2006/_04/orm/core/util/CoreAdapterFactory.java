/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.util;

import edu.neumont.schemas.orm._2006._04.orm.core.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreSwitch<Adapter> modelSwitch =
		new CoreSwitch<Adapter>() {
			@Override
			public Adapter caseAggregationContextType(AggregationContextType object) {
				return createAggregationContextTypeAdapter();
			}
			@Override
			public Adapter caseAliasesType(AliasesType object) {
				return createAliasesTypeAdapter();
			}
			@Override
			public Adapter caseAliasType(AliasType object) {
				return createAliasTypeAdapter();
			}
			@Override
			public Adapter caseAutoCounterNumericDataTypeType(AutoCounterNumericDataTypeType object) {
				return createAutoCounterNumericDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseAutoTimestampTemporalDataTypeType(AutoTimestampTemporalDataTypeType object) {
				return createAutoTimestampTemporalDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseBoundToType(BoundToType object) {
				return createBoundToTypeAdapter();
			}
			@Override
			public Adapter caseCalculatedPathValueMustBeConsumedErrorType(CalculatedPathValueMustBeConsumedErrorType object) {
				return createCalculatedPathValueMustBeConsumedErrorTypeAdapter();
			}
			@Override
			public Adapter caseCalculatedPathValueParameterBindingErrorType(CalculatedPathValueParameterBindingErrorType object) {
				return createCalculatedPathValueParameterBindingErrorTypeAdapter();
			}
			@Override
			public Adapter caseCalculatedPathValueRequiresAggregationContextErrorType(CalculatedPathValueRequiresAggregationContextErrorType object) {
				return createCalculatedPathValueRequiresAggregationContextErrorTypeAdapter();
			}
			@Override
			public Adapter caseCalculatedPathValueRequiresFunctionErrorType(CalculatedPathValueRequiresFunctionErrorType object) {
				return createCalculatedPathValueRequiresFunctionErrorTypeAdapter();
			}
			@Override
			public Adapter caseCalculatedValueInputType(CalculatedValueInputType object) {
				return createCalculatedValueInputTypeAdapter();
			}
			@Override
			public Adapter caseCalculatedValueRef(CalculatedValueRef object) {
				return createCalculatedValueRefAdapter();
			}
			@Override
			public Adapter caseCalculatedValuesType(CalculatedValuesType object) {
				return createCalculatedValuesTypeAdapter();
			}
			@Override
			public Adapter caseCalculatedValuesType1(CalculatedValuesType1 object) {
				return createCalculatedValuesType1Adapter();
			}
			@Override
			public Adapter caseCalculatedValueType(CalculatedValueType object) {
				return createCalculatedValueTypeAdapter();
			}
			@Override
			public Adapter caseCalculatedValueType1(CalculatedValueType1 object) {
				return createCalculatedValueType1Adapter();
			}
			@Override
			public Adapter caseCardinalityConstraintRef(CardinalityConstraintRef object) {
				return createCardinalityConstraintRefAdapter();
			}
			@Override
			public Adapter caseCardinalityConstraintType(CardinalityConstraintType object) {
				return createCardinalityConstraintTypeAdapter();
			}
			@Override
			public Adapter caseCardinalityRangeOverlapErrorType(CardinalityRangeOverlapErrorType object) {
				return createCardinalityRangeOverlapErrorTypeAdapter();
			}
			@Override
			public Adapter caseCardinalityRangesType(CardinalityRangesType object) {
				return createCardinalityRangesTypeAdapter();
			}
			@Override
			public Adapter caseCardinalityRangeType(CardinalityRangeType object) {
				return createCardinalityRangeTypeAdapter();
			}
			@Override
			public Adapter caseCompatibleRolePlayerTypeErrorType(CompatibleRolePlayerTypeErrorType object) {
				return createCompatibleRolePlayerTypeErrorTypeAdapter();
			}
			@Override
			public Adapter caseCompatibleSupertypesErrorType(CompatibleSupertypesErrorType object) {
				return createCompatibleSupertypesErrorTypeAdapter();
			}
			@Override
			public Adapter caseCompatibleValueTypeInstanceValueErrorType(CompatibleValueTypeInstanceValueErrorType object) {
				return createCompatibleValueTypeInstanceValueErrorTypeAdapter();
			}
			@Override
			public Adapter caseConditionsType(ConditionsType object) {
				return createConditionsTypeAdapter();
			}
			@Override
			public Adapter caseConstraintDuplicateNameErrorType(ConstraintDuplicateNameErrorType object) {
				return createConstraintDuplicateNameErrorTypeAdapter();
			}
			@Override
			public Adapter caseConstraintRoleProjectionRef(ConstraintRoleProjectionRef object) {
				return createConstraintRoleProjectionRefAdapter();
			}
			@Override
			public Adapter caseConstraintRoleProjectionType(ConstraintRoleProjectionType object) {
				return createConstraintRoleProjectionTypeAdapter();
			}
			@Override
			public Adapter caseConstraintRoleSequenceJoinPathRef(ConstraintRoleSequenceJoinPathRef object) {
				return createConstraintRoleSequenceJoinPathRefAdapter();
			}
			@Override
			public Adapter caseConstraintRoleSequenceJoinPathType(ConstraintRoleSequenceJoinPathType object) {
				return createConstraintRoleSequenceJoinPathTypeAdapter();
			}
			@Override
			public Adapter caseConstraintRoleSequenceRef(ConstraintRoleSequenceRef object) {
				return createConstraintRoleSequenceRefAdapter();
			}
			@Override
			public Adapter caseConstraintRoleSequencesType(ConstraintRoleSequencesType object) {
				return createConstraintRoleSequencesTypeAdapter();
			}
			@Override
			public Adapter caseConstraintRoleSequenceType(ConstraintRoleSequenceType object) {
				return createConstraintRoleSequenceTypeAdapter();
			}
			@Override
			public Adapter caseConstraintRoleSequenceWithJoinAndIdType(ConstraintRoleSequenceWithJoinAndIdType object) {
				return createConstraintRoleSequenceWithJoinAndIdTypeAdapter();
			}
			@Override
			public Adapter caseConstraintRoleSequenceWithJoinType(ConstraintRoleSequenceWithJoinType object) {
				return createConstraintRoleSequenceWithJoinTypeAdapter();
			}
			@Override
			public Adapter caseConstraintsType(ConstraintsType object) {
				return createConstraintsTypeAdapter();
			}
			@Override
			public Adapter caseConstraintsType1(ConstraintsType1 object) {
				return createConstraintsType1Adapter();
			}
			@Override
			public Adapter caseConstraintsType2(ConstraintsType2 object) {
				return createConstraintsType2Adapter();
			}
			@Override
			public Adapter caseConstraintsType3(ConstraintsType3 object) {
				return createConstraintsType3Adapter();
			}
			@Override
			public Adapter caseConstraintsType4(ConstraintsType4 object) {
				return createConstraintsType4Adapter();
			}
			@Override
			public Adapter caseConstraintsType5(ConstraintsType5 object) {
				return createConstraintsType5Adapter();
			}
			@Override
			public Adapter caseConstraintType(ConstraintType object) {
				return createConstraintTypeAdapter();
			}
			@Override
			public Adapter caseCorrelatedPathRoleRequiresCompatibleRolePlayerErrorType(CorrelatedPathRoleRequiresCompatibleRolePlayerErrorType object) {
				return createCorrelatedPathRoleRequiresCompatibleRolePlayerErrorTypeAdapter();
			}
			@Override
			public Adapter caseCustomReferenceModesType(CustomReferenceModesType object) {
				return createCustomReferenceModesTypeAdapter();
			}
			@Override
			public Adapter caseCustomReferenceModeType(CustomReferenceModeType object) {
				return createCustomReferenceModeTypeAdapter();
			}
			@Override
			public Adapter caseDataType(DataType object) {
				return createDataTypeAdapter();
			}
			@Override
			public Adapter caseDataTypeNotSpecifiedErrorType(DataTypeNotSpecifiedErrorType object) {
				return createDataTypeNotSpecifiedErrorTypeAdapter();
			}
			@Override
			public Adapter caseDataTypeRef(DataTypeRef object) {
				return createDataTypeRefAdapter();
			}
			@Override
			public Adapter caseDataTypeRefRef(DataTypeRefRef object) {
				return createDataTypeRefRefAdapter();
			}
			@Override
			public Adapter caseDataTypesType(DataTypesType object) {
				return createDataTypesTypeAdapter();
			}
			@Override
			public Adapter caseDateAndTimeTemporalDataTypeType(DateAndTimeTemporalDataTypeType object) {
				return createDateAndTimeTemporalDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseDateTemporalDataTypeType(DateTemporalDataTypeType object) {
				return createDateTemporalDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseDecimalNumericDataTypeType(DecimalNumericDataTypeType object) {
				return createDecimalNumericDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseDefinitionsType(DefinitionsType object) {
				return createDefinitionsTypeAdapter();
			}
			@Override
			public Adapter caseDefinitionType(DefinitionType object) {
				return createDefinitionTypeAdapter();
			}
			@Override
			public Adapter caseDerivationExpressionType(DerivationExpressionType object) {
				return createDerivationExpressionTypeAdapter();
			}
			@Override
			public Adapter caseDerivationProjectionsType(DerivationProjectionsType object) {
				return createDerivationProjectionsTypeAdapter();
			}
			@Override
			public Adapter caseDerivationProjectionsType1(DerivationProjectionsType1 object) {
				return createDerivationProjectionsType1Adapter();
			}
			@Override
			public Adapter caseDerivationSourceType(DerivationSourceType object) {
				return createDerivationSourceTypeAdapter();
			}
			@Override
			public Adapter caseDerivationSourceType1(DerivationSourceType1 object) {
				return createDerivationSourceType1Adapter();
			}
			@Override
			public Adapter caseDerivedFactTypeRoleProjectionCompatibilityErrorType(DerivedFactTypeRoleProjectionCompatibilityErrorType object) {
				return createDerivedFactTypeRoleProjectionCompatibilityErrorTypeAdapter();
			}
			@Override
			public Adapter caseDerivedRoleProjectionRef(DerivedRoleProjectionRef object) {
				return createDerivedRoleProjectionRefAdapter();
			}
			@Override
			public Adapter caseDerivedRoleProjectionType(DerivedRoleProjectionType object) {
				return createDerivedRoleProjectionTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDoublePrecisionFloatingPointNumericDataTypeType(DoublePrecisionFloatingPointNumericDataTypeType object) {
				return createDoublePrecisionFloatingPointNumericDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseDuplicateReadingSignatureErrorType(DuplicateReadingSignatureErrorType object) {
				return createDuplicateReadingSignatureErrorTypeAdapter();
			}
			@Override
			public Adapter caseDynamicColorType(DynamicColorType object) {
				return createDynamicColorTypeAdapter();
			}
			@Override
			public Adapter caseElementRef(ElementRef object) {
				return createElementRefAdapter();
			}
			@Override
			public Adapter caseEntityTypeInstanceRef(EntityTypeInstanceRef object) {
				return createEntityTypeInstanceRefAdapter();
			}
			@Override
			public Adapter caseEntityTypeInstancesType(EntityTypeInstancesType object) {
				return createEntityTypeInstancesTypeAdapter();
			}
			@Override
			public Adapter caseEntityTypeInstanceType(EntityTypeInstanceType object) {
				return createEntityTypeInstanceTypeAdapter();
			}
			@Override
			public Adapter caseEntityTypeRequiresReferenceSchemeErrorType(EntityTypeRequiresReferenceSchemeErrorType object) {
				return createEntityTypeRequiresReferenceSchemeErrorTypeAdapter();
			}
			@Override
			public Adapter caseEntityTypeRoleInstancesType(EntityTypeRoleInstancesType object) {
				return createEntityTypeRoleInstancesTypeAdapter();
			}
			@Override
			public Adapter caseEntityTypeSubtypeInstanceRef(EntityTypeSubtypeInstanceRef object) {
				return createEntityTypeSubtypeInstanceRefAdapter();
			}
			@Override
			public Adapter caseEntityTypeSubtypeInstanceType(EntityTypeSubtypeInstanceType object) {
				return createEntityTypeSubtypeInstanceTypeAdapter();
			}
			@Override
			public Adapter caseEntityTypeType(EntityTypeType object) {
				return createEntityTypeTypeAdapter();
			}
			@Override
			public Adapter caseEqualityConstraintImpliedByMandatoryConstraintsErrorType(EqualityConstraintImpliedByMandatoryConstraintsErrorType object) {
				return createEqualityConstraintImpliedByMandatoryConstraintsErrorTypeAdapter();
			}
			@Override
			public Adapter caseEqualityConstraintRef(EqualityConstraintRef object) {
				return createEqualityConstraintRefAdapter();
			}
			@Override
			public Adapter caseEqualityConstraintType(EqualityConstraintType object) {
				return createEqualityConstraintTypeAdapter();
			}
			@Override
			public Adapter caseEqualityImpliedByMandatoryErrorType(EqualityImpliedByMandatoryErrorType object) {
				return createEqualityImpliedByMandatoryErrorTypeAdapter();
			}
			@Override
			public Adapter caseExclusionConstraintRef(ExclusionConstraintRef object) {
				return createExclusionConstraintRefAdapter();
			}
			@Override
			public Adapter caseExclusionConstraintType(ExclusionConstraintType object) {
				return createExclusionConstraintTypeAdapter();
			}
			@Override
			public Adapter caseExclusionContradictsEqualityErrorType(ExclusionContradictsEqualityErrorType object) {
				return createExclusionContradictsEqualityErrorTypeAdapter();
			}
			@Override
			public Adapter caseExclusionContradictsMandatoryErrorType(ExclusionContradictsMandatoryErrorType object) {
				return createExclusionContradictsMandatoryErrorTypeAdapter();
			}
			@Override
			public Adapter caseExclusionContradictsSubsetErrorType(ExclusionContradictsSubsetErrorType object) {
				return createExclusionContradictsSubsetErrorTypeAdapter();
			}
			@Override
			public Adapter caseExpandedDataType(ExpandedDataType object) {
				return createExpandedDataTypeAdapter();
			}
			@Override
			public Adapter caseExtensionsType(ExtensionsType object) {
				return createExtensionsTypeAdapter();
			}
			@Override
			public Adapter caseExternalConstraintRoleSequenceArityMismatchErrorType(ExternalConstraintRoleSequenceArityMismatchErrorType object) {
				return createExternalConstraintRoleSequenceArityMismatchErrorTypeAdapter();
			}
			@Override
			public Adapter caseFactRolesType(FactRolesType object) {
				return createFactRolesTypeAdapter();
			}
			@Override
			public Adapter caseFactTypeDerivationExpressionType(FactTypeDerivationExpressionType object) {
				return createFactTypeDerivationExpressionTypeAdapter();
			}
			@Override
			public Adapter caseFactTypeDerivationPathRef(FactTypeDerivationPathRef object) {
				return createFactTypeDerivationPathRefAdapter();
			}
			@Override
			public Adapter caseFactTypeDerivationPathType(FactTypeDerivationPathType object) {
				return createFactTypeDerivationPathTypeAdapter();
			}
			@Override
			public Adapter caseFactTypeDerivationProjectionRef(FactTypeDerivationProjectionRef object) {
				return createFactTypeDerivationProjectionRefAdapter();
			}
			@Override
			public Adapter caseFactTypeDerivationRequiresProjectionErrorType(FactTypeDerivationRequiresProjectionErrorType object) {
				return createFactTypeDerivationRequiresProjectionErrorTypeAdapter();
			}
			@Override
			public Adapter caseFactTypeDerivationRuleType(FactTypeDerivationRuleType object) {
				return createFactTypeDerivationRuleTypeAdapter();
			}
			@Override
			public Adapter caseFactTypeInstanceRef(FactTypeInstanceRef object) {
				return createFactTypeInstanceRefAdapter();
			}
			@Override
			public Adapter caseFactTypeInstancesType(FactTypeInstancesType object) {
				return createFactTypeInstancesTypeAdapter();
			}
			@Override
			public Adapter caseFactTypeInstanceType(FactTypeInstanceType object) {
				return createFactTypeInstanceTypeAdapter();
			}
			@Override
			public Adapter caseFactTypeRef(FactTypeRef object) {
				return createFactTypeRefAdapter();
			}
			@Override
			public Adapter caseFactTypeRequiresInternalUniquenessConstraintErrorType(FactTypeRequiresInternalUniquenessConstraintErrorType object) {
				return createFactTypeRequiresInternalUniquenessConstraintErrorTypeAdapter();
			}
			@Override
			public Adapter caseFactTypeRequiresReadingErrorType(FactTypeRequiresReadingErrorType object) {
				return createFactTypeRequiresReadingErrorTypeAdapter();
			}
			@Override
			public Adapter caseFactTypeRoleInstancesType(FactTypeRoleInstancesType object) {
				return createFactTypeRoleInstancesTypeAdapter();
			}
			@Override
			public Adapter caseFactTypesType(FactTypesType object) {
				return createFactTypesTypeAdapter();
			}
			@Override
			public Adapter caseFactTypeType(FactTypeType object) {
				return createFactTypeTypeAdapter();
			}
			@Override
			public Adapter caseFixedLengthRawDataDataTypeType(FixedLengthRawDataDataTypeType object) {
				return createFixedLengthRawDataDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseFixedLengthTextDataTypeType(FixedLengthTextDataTypeType object) {
				return createFixedLengthTextDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseFloatingPointNumericDataTypeType(FloatingPointNumericDataTypeType object) {
				return createFloatingPointNumericDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseFrequencyConstraintContradictsInternalUniquenessConstraintErrorType(FrequencyConstraintContradictsInternalUniquenessConstraintErrorType object) {
				return createFrequencyConstraintContradictsInternalUniquenessConstraintErrorTypeAdapter();
			}
			@Override
			public Adapter caseFrequencyConstraintExactlyOneErrorType(FrequencyConstraintExactlyOneErrorType object) {
				return createFrequencyConstraintExactlyOneErrorTypeAdapter();
			}
			@Override
			public Adapter caseFrequencyConstraintMinMaxErrorType(FrequencyConstraintMinMaxErrorType object) {
				return createFrequencyConstraintMinMaxErrorTypeAdapter();
			}
			@Override
			public Adapter caseFrequencyConstraintNonRestrictiveRangeErrorType(FrequencyConstraintNonRestrictiveRangeErrorType object) {
				return createFrequencyConstraintNonRestrictiveRangeErrorTypeAdapter();
			}
			@Override
			public Adapter caseFrequencyConstraintRef(FrequencyConstraintRef object) {
				return createFrequencyConstraintRefAdapter();
			}
			@Override
			public Adapter caseFrequencyConstraintType(FrequencyConstraintType object) {
				return createFrequencyConstraintTypeAdapter();
			}
			@Override
			public Adapter caseFrequencyConstraintViolatedByUniquenessConstraintErrorType(FrequencyConstraintViolatedByUniquenessConstraintErrorType object) {
				return createFrequencyConstraintViolatedByUniquenessConstraintErrorTypeAdapter();
			}
			@Override
			public Adapter caseFunctionDuplicateNameErrorType(FunctionDuplicateNameErrorType object) {
				return createFunctionDuplicateNameErrorTypeAdapter();
			}
			@Override
			public Adapter caseFunctionParameterRef(FunctionParameterRef object) {
				return createFunctionParameterRefAdapter();
			}
			@Override
			public Adapter caseFunctionParameterType(FunctionParameterType object) {
				return createFunctionParameterTypeAdapter();
			}
			@Override
			public Adapter caseFunctionRef(FunctionRef object) {
				return createFunctionRefAdapter();
			}
			@Override
			public Adapter caseFunctionsType(FunctionsType object) {
				return createFunctionsTypeAdapter();
			}
			@Override
			public Adapter caseFunctionsType1(FunctionsType1 object) {
				return createFunctionsType1Adapter();
			}
			@Override
			public Adapter caseFunctionType(FunctionType object) {
				return createFunctionTypeAdapter();
			}
			@Override
			public Adapter caseGenerationSettingsType(GenerationSettingsType object) {
				return createGenerationSettingsTypeAdapter();
			}
			@Override
			public Adapter caseGenerationSettingType(GenerationSettingType object) {
				return createGenerationSettingTypeAdapter();
			}
			@Override
			public Adapter caseGenerationStateType(GenerationStateType object) {
				return createGenerationStateTypeAdapter();
			}
			@Override
			public Adapter caseGroupDuplicateNameErrorType(GroupDuplicateNameErrorType object) {
				return createGroupDuplicateNameErrorTypeAdapter();
			}
			@Override
			public Adapter caseGroupElementsType(GroupElementsType object) {
				return createGroupElementsTypeAdapter();
			}
			@Override
			public Adapter caseGroupingType(GroupingType object) {
				return createGroupingTypeAdapter();
			}
			@Override
			public Adapter caseGroupMembershipContradictionErrorType(GroupMembershipContradictionErrorType object) {
				return createGroupMembershipContradictionErrorTypeAdapter();
			}
			@Override
			public Adapter caseGroupRef(GroupRef object) {
				return createGroupRefAdapter();
			}
			@Override
			public Adapter caseGroupsType(GroupsType object) {
				return createGroupsTypeAdapter();
			}
			@Override
			public Adapter caseGroupsType1(GroupsType1 object) {
				return createGroupsType1Adapter();
			}
			@Override
			public Adapter caseGroupType(GroupType object) {
				return createGroupTypeAdapter();
			}
			@Override
			public Adapter caseGroupType1(GroupType1 object) {
				return createGroupType1Adapter();
			}
			@Override
			public Adapter caseGroupTypesType(GroupTypesType object) {
				return createGroupTypesTypeAdapter();
			}
			@Override
			public Adapter caseGroupTypeType(GroupTypeType object) {
				return createGroupTypeTypeAdapter();
			}
			@Override
			public Adapter caseImplicationErrorType(ImplicationErrorType object) {
				return createImplicationErrorTypeAdapter();
			}
			@Override
			public Adapter caseImpliedFactRolesType(ImpliedFactRolesType object) {
				return createImpliedFactRolesTypeAdapter();
			}
			@Override
			public Adapter caseImpliedFactTypeType(ImpliedFactTypeType object) {
				return createImpliedFactTypeTypeAdapter();
			}
			@Override
			public Adapter caseImpliedInternalUniquenessConstraintErrorType(ImpliedInternalUniquenessConstraintErrorType object) {
				return createImpliedInternalUniquenessConstraintErrorTypeAdapter();
			}
			@Override
			public Adapter caseInformalDerivationRuleType(InformalDerivationRuleType object) {
				return createInformalDerivationRuleTypeAdapter();
			}
			@Override
			public Adapter caseInputFromType(InputFromType object) {
				return createInputFromTypeAdapter();
			}
			@Override
			public Adapter caseInputsType(InputsType object) {
				return createInputsTypeAdapter();
			}
			@Override
			public Adapter caseInstancesType(InstancesType object) {
				return createInstancesTypeAdapter();
			}
			@Override
			public Adapter caseInternalConstraintsType(InternalConstraintsType object) {
				return createInternalConstraintsTypeAdapter();
			}
			@Override
			public Adapter caseJoinedConstraintRoleProjectionCompatibilityErrorType(JoinedConstraintRoleProjectionCompatibilityErrorType object) {
				return createJoinedConstraintRoleProjectionCompatibilityErrorTypeAdapter();
			}
			@Override
			public Adapter caseJoinedPathRoleRequiresCompatibleRolePlayerErrorType(JoinedPathRoleRequiresCompatibleRolePlayerErrorType object) {
				return createJoinedPathRoleRequiresCompatibleRolePlayerErrorTypeAdapter();
			}
			@Override
			public Adapter caseJoinPathProjectionRef(JoinPathProjectionRef object) {
				return createJoinPathProjectionRefAdapter();
			}
			@Override
			public Adapter caseJoinPathProjectionsType(JoinPathProjectionsType object) {
				return createJoinPathProjectionsTypeAdapter();
			}
			@Override
			public Adapter caseJoinPathProjectionType(JoinPathProjectionType object) {
				return createJoinPathProjectionTypeAdapter();
			}
			@Override
			public Adapter caseJoinPathRequiredErrorType(JoinPathRequiredErrorType object) {
				return createJoinPathRequiredErrorTypeAdapter();
			}
			@Override
			public Adapter caseJoinPathRequiresProjectionErrorType(JoinPathRequiresProjectionErrorType object) {
				return createJoinPathRequiresProjectionErrorTypeAdapter();
			}
			@Override
			public Adapter caseJoinRuleType(JoinRuleType object) {
				return createJoinRuleTypeAdapter();
			}
			@Override
			public Adapter caseLargeLengthRawDataDataTypeType(LargeLengthRawDataDataTypeType object) {
				return createLargeLengthRawDataDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseLargeLengthTextDataTypeType(LargeLengthTextDataTypeType object) {
				return createLargeLengthTextDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseLeadRolePathRef(LeadRolePathRef object) {
				return createLeadRolePathRefAdapter();
			}
			@Override
			public Adapter caseLeadRolePathType(LeadRolePathType object) {
				return createLeadRolePathTypeAdapter();
			}
			@Override
			public Adapter caseMandatoryConstraintRef(MandatoryConstraintRef object) {
				return createMandatoryConstraintRefAdapter();
			}
			@Override
			public Adapter caseMandatoryConstraintType(MandatoryConstraintType object) {
				return createMandatoryConstraintTypeAdapter();
			}
			@Override
			public Adapter caseMaxValueMismatchErrorType(MaxValueMismatchErrorType object) {
				return createMaxValueMismatchErrorTypeAdapter();
			}
			@Override
			public Adapter caseMinValueMismatchErrorType(MinValueMismatchErrorType object) {
				return createMinValueMismatchErrorTypeAdapter();
			}
			@Override
			public Adapter caseModelError(ModelError object) {
				return createModelErrorAdapter();
			}
			@Override
			public Adapter caseModelErrorDisplayFilterType(ModelErrorDisplayFilterType object) {
				return createModelErrorDisplayFilterTypeAdapter();
			}
			@Override
			public Adapter caseModelErrorsType(ModelErrorsType object) {
				return createModelErrorsTypeAdapter();
			}
			@Override
			public Adapter caseModelNoteReferencedByType(ModelNoteReferencedByType object) {
				return createModelNoteReferencedByTypeAdapter();
			}
			@Override
			public Adapter caseModelNotesType(ModelNotesType object) {
				return createModelNotesTypeAdapter();
			}
			@Override
			public Adapter caseModelNoteType(ModelNoteType object) {
				return createModelNoteTypeAdapter();
			}
			@Override
			public Adapter caseMoneyNumericDataTypeType(MoneyNumericDataTypeType object) {
				return createMoneyNumericDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseNameGeneratorType(NameGeneratorType object) {
				return createNameGeneratorTypeAdapter();
			}
			@Override
			public Adapter caseNestedGroupsType(NestedGroupsType object) {
				return createNestedGroupsTypeAdapter();
			}
			@Override
			public Adapter caseNMinusOneErrorType(NMinusOneErrorType object) {
				return createNMinusOneErrorTypeAdapter();
			}
			@Override
			public Adapter caseNotesType(NotesType object) {
				return createNotesTypeAdapter();
			}
			@Override
			public Adapter caseNoteType(NoteType object) {
				return createNoteTypeAdapter();
			}
			@Override
			public Adapter caseNotWellModeledSubsetAndMandatoryErrorType(NotWellModeledSubsetAndMandatoryErrorType object) {
				return createNotWellModeledSubsetAndMandatoryErrorTypeAdapter();
			}
			@Override
			public Adapter caseObjectIdOtherDataTypeType(ObjectIdOtherDataTypeType object) {
				return createObjectIdOtherDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseObjectificationRef(ObjectificationRef object) {
				return createObjectificationRefAdapter();
			}
			@Override
			public Adapter caseObjectifiedFactTypeRef(ObjectifiedFactTypeRef object) {
				return createObjectifiedFactTypeRefAdapter();
			}
			@Override
			public Adapter caseObjectifiedInstanceRequiredErrorType(ObjectifiedInstanceRequiredErrorType object) {
				return createObjectifiedInstanceRequiredErrorTypeAdapter();
			}
			@Override
			public Adapter caseObjectifiedTypeType(ObjectifiedTypeType object) {
				return createObjectifiedTypeTypeAdapter();
			}
			@Override
			public Adapter caseObjectifiedUnaryRoleType(ObjectifiedUnaryRoleType object) {
				return createObjectifiedUnaryRoleTypeAdapter();
			}
			@Override
			public Adapter caseObjectifyingInstanceRequiredErrorType(ObjectifyingInstanceRequiredErrorType object) {
				return createObjectifyingInstanceRequiredErrorTypeAdapter();
			}
			@Override
			public Adapter caseObjectsType(ObjectsType object) {
				return createObjectsTypeAdapter();
			}
			@Override
			public Adapter caseObjectTypeCardinalityRestrictionType(ObjectTypeCardinalityRestrictionType object) {
				return createObjectTypeCardinalityRestrictionTypeAdapter();
			}
			@Override
			public Adapter caseObjectTypeDuplicateNameErrorType(ObjectTypeDuplicateNameErrorType object) {
				return createObjectTypeDuplicateNameErrorTypeAdapter();
			}
			@Override
			public Adapter caseObjectTypeInstanceRef(ObjectTypeInstanceRef object) {
				return createObjectTypeInstanceRefAdapter();
			}
			@Override
			public Adapter caseObjectTypeRef(ObjectTypeRef object) {
				return createObjectTypeRefAdapter();
			}
			@Override
			public Adapter caseObjectTypeRequiresPrimarySupertypeErrorType(ObjectTypeRequiresPrimarySupertypeErrorType object) {
				return createObjectTypeRequiresPrimarySupertypeErrorTypeAdapter();
			}
			@Override
			public Adapter caseObjectTypeRoleInstanceRef(ObjectTypeRoleInstanceRef object) {
				return createObjectTypeRoleInstanceRefAdapter();
			}
			@Override
			public Adapter caseObjectTypesType(ObjectTypesType object) {
				return createObjectTypesTypeAdapter();
			}
			@Override
			public Adapter caseObjectTypeType(ObjectTypeType object) {
				return createObjectTypeTypeAdapter();
			}
			@Override
			public Adapter caseObjectUnifierRef(ObjectUnifierRef object) {
				return createObjectUnifierRefAdapter();
			}
			@Override
			public Adapter caseObjectUnifierRequiresCompatibleObjectTypesErrorType(ObjectUnifierRequiresCompatibleObjectTypesErrorType object) {
				return createObjectUnifierRequiresCompatibleObjectTypesErrorTypeAdapter();
			}
			@Override
			public Adapter caseObjectUnifiersType(ObjectUnifiersType object) {
				return createObjectUnifiersTypeAdapter();
			}
			@Override
			public Adapter caseObjectUnifierType(ObjectUnifierType object) {
				return createObjectUnifierTypeAdapter();
			}
			@Override
			public Adapter caseOleObjectRawDataDataTypeType(OleObjectRawDataDataTypeType object) {
				return createOleObjectRawDataDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseORMModelRef(ORMModelRef object) {
				return createORMModelRefAdapter();
			}
			@Override
			public Adapter caseORMModelType(ORMModelType object) {
				return createORMModelTypeAdapter();
			}
			@Override
			public Adapter caseParametersType(ParametersType object) {
				return createParametersTypeAdapter();
			}
			@Override
			public Adapter casePartialFactTypeDerivationProjectionErrorType(PartialFactTypeDerivationProjectionErrorType object) {
				return createPartialFactTypeDerivationProjectionErrorTypeAdapter();
			}
			@Override
			public Adapter casePartialJoinPathProjectionErrorType(PartialJoinPathProjectionErrorType object) {
				return createPartialJoinPathProjectionErrorTypeAdapter();
			}
			@Override
			public Adapter casePartialQueryDerivationProjectionErrorType(PartialQueryDerivationProjectionErrorType object) {
				return createPartialQueryDerivationProjectionErrorTypeAdapter();
			}
			@Override
			public Adapter casePathComponentsType(PathComponentsType object) {
				return createPathComponentsTypeAdapter();
			}
			@Override
			public Adapter casePathComponentType(PathComponentType object) {
				return createPathComponentTypeAdapter();
			}
			@Override
			public Adapter casePathConditionRoleValueRestrictionType(PathConditionRoleValueRestrictionType object) {
				return createPathConditionRoleValueRestrictionTypeAdapter();
			}
			@Override
			public Adapter casePathConditionRootValueRestrictionType(PathConditionRootValueRestrictionType object) {
				return createPathConditionRootValueRestrictionTypeAdapter();
			}
			@Override
			public Adapter casePathConstantType(PathConstantType object) {
				return createPathConstantTypeAdapter();
			}
			@Override
			public Adapter casePathedRoleRef(PathedRoleRef object) {
				return createPathedRoleRefAdapter();
			}
			@Override
			public Adapter casePathedRolesType(PathedRolesType object) {
				return createPathedRolesTypeAdapter();
			}
			@Override
			public Adapter casePathedRoleType(PathedRoleType object) {
				return createPathedRoleTypeAdapter();
			}
			@Override
			public Adapter casePathOuterJoinRequiresOptionalRoleErrorType(PathOuterJoinRequiresOptionalRoleErrorType object) {
				return createPathOuterJoinRequiresOptionalRoleErrorTypeAdapter();
			}
			@Override
			public Adapter casePathRequiresRootObjectTypeErrorType(PathRequiresRootObjectTypeErrorType object) {
				return createPathRequiresRootObjectTypeErrorTypeAdapter();
			}
			@Override
			public Adapter casePathSameFactTypeRoleFollowsJoinErrorType(PathSameFactTypeRoleFollowsJoinErrorType object) {
				return createPathSameFactTypeRoleFollowsJoinErrorTypeAdapter();
			}
			@Override
			public Adapter casePathStartRoleFollowsRootObjectTypeErrorType(PathStartRoleFollowsRootObjectTypeErrorType object) {
				return createPathStartRoleFollowsRootObjectTypeErrorTypeAdapter();
			}
			@Override
			public Adapter casePictureRawDataDataTypeType(PictureRawDataDataTypeType object) {
				return createPictureRawDataDataTypeTypeAdapter();
			}
			@Override
			public Adapter casePlayedRolesType(PlayedRolesType object) {
				return createPlayedRolesTypeAdapter();
			}
			@Override
			public Adapter casePopulationMandatoryErrorType(PopulationMandatoryErrorType object) {
				return createPopulationMandatoryErrorTypeAdapter();
			}
			@Override
			public Adapter casePopulationUniquenessErrorType(PopulationUniquenessErrorType object) {
				return createPopulationUniquenessErrorTypeAdapter();
			}
			@Override
			public Adapter casePreferredIdentifierRequiresMandatoryErrorType(PreferredIdentifierRequiresMandatoryErrorType object) {
				return createPreferredIdentifierRequiresMandatoryErrorTypeAdapter();
			}
			@Override
			public Adapter caseProjectedFromType(ProjectedFromType object) {
				return createProjectedFromTypeAdapter();
			}
			@Override
			public Adapter caseProjectedFromType1(ProjectedFromType1 object) {
				return createProjectedFromType1Adapter();
			}
			@Override
			public Adapter caseQueryDerivationPathRef(QueryDerivationPathRef object) {
				return createQueryDerivationPathRefAdapter();
			}
			@Override
			public Adapter caseQueryDerivationPathType(QueryDerivationPathType object) {
				return createQueryDerivationPathTypeAdapter();
			}
			@Override
			public Adapter caseQueryDerivationRequiresProjectionErrorType(QueryDerivationRequiresProjectionErrorType object) {
				return createQueryDerivationRequiresProjectionErrorTypeAdapter();
			}
			@Override
			public Adapter caseQueryDerivationRuleType(QueryDerivationRuleType object) {
				return createQueryDerivationRuleTypeAdapter();
			}
			@Override
			public Adapter caseQueryParameterBindingsType(QueryParameterBindingsType object) {
				return createQueryParameterBindingsTypeAdapter();
			}
			@Override
			public Adapter caseQueryParameterBindingType(QueryParameterBindingType object) {
				return createQueryParameterBindingTypeAdapter();
			}
			@Override
			public Adapter caseQueryParametersType(QueryParametersType object) {
				return createQueryParametersTypeAdapter();
			}
			@Override
			public Adapter caseQueryParameterType(QueryParameterType object) {
				return createQueryParameterTypeAdapter();
			}
			@Override
			public Adapter caseQueryRoleProjectionCompatibilityErrorType(QueryRoleProjectionCompatibilityErrorType object) {
				return createQueryRoleProjectionCompatibilityErrorTypeAdapter();
			}
			@Override
			public Adapter caseQueryType(QueryType object) {
				return createQueryTypeAdapter();
			}
			@Override
			public Adapter caseReadingOrdersType(ReadingOrdersType object) {
				return createReadingOrdersTypeAdapter();
			}
			@Override
			public Adapter caseReadingOrderType(ReadingOrderType object) {
				return createReadingOrderTypeAdapter();
			}
			@Override
			public Adapter caseReadingRef(ReadingRef object) {
				return createReadingRefAdapter();
			}
			@Override
			public Adapter caseReadingRequiresUserModificationErrorType(ReadingRequiresUserModificationErrorType object) {
				return createReadingRequiresUserModificationErrorTypeAdapter();
			}
			@Override
			public Adapter caseReadingRoleSequenceType(ReadingRoleSequenceType object) {
				return createReadingRoleSequenceTypeAdapter();
			}
			@Override
			public Adapter caseReadingsType(ReadingsType object) {
				return createReadingsTypeAdapter();
			}
			@Override
			public Adapter caseReadingsType1(ReadingsType1 object) {
				return createReadingsType1Adapter();
			}
			@Override
			public Adapter caseReadingType(ReadingType object) {
				return createReadingTypeAdapter();
			}
			@Override
			public Adapter caseRecognizedPhraseDuplicateNameErrorType(RecognizedPhraseDuplicateNameErrorType object) {
				return createRecognizedPhraseDuplicateNameErrorTypeAdapter();
			}
			@Override
			public Adapter caseRecognizedPhraseRef(RecognizedPhraseRef object) {
				return createRecognizedPhraseRefAdapter();
			}
			@Override
			public Adapter caseRecognizedPhrasesType(RecognizedPhrasesType object) {
				return createRecognizedPhrasesTypeAdapter();
			}
			@Override
			public Adapter caseRecognizedPhrasesType1(RecognizedPhrasesType1 object) {
				return createRecognizedPhrasesType1Adapter();
			}
			@Override
			public Adapter caseRecognizedPhraseType(RecognizedPhraseType object) {
				return createRecognizedPhraseTypeAdapter();
			}
			@Override
			public Adapter caseReferenceModeKindRef(ReferenceModeKindRef object) {
				return createReferenceModeKindRefAdapter();
			}
			@Override
			public Adapter caseReferenceModeKindsType(ReferenceModeKindsType object) {
				return createReferenceModeKindsTypeAdapter();
			}
			@Override
			public Adapter caseReferenceModeKindType(ReferenceModeKindType object) {
				return createReferenceModeKindTypeAdapter();
			}
			@Override
			public Adapter caseRefinementsType(RefinementsType object) {
				return createRefinementsTypeAdapter();
			}
			@Override
			public Adapter caseRingConstraintRef(RingConstraintRef object) {
				return createRingConstraintRefAdapter();
			}
			@Override
			public Adapter caseRingConstraintType(RingConstraintType object) {
				return createRingConstraintTypeAdapter();
			}
			@Override
			public Adapter caseRingConstraintTypeNotSpecifiedErrorType(RingConstraintTypeNotSpecifiedErrorType object) {
				return createRingConstraintTypeNotSpecifiedErrorTypeAdapter();
			}
			@Override
			public Adapter caseRoleBasedDerivationProjectionType(RoleBasedDerivationProjectionType object) {
				return createRoleBasedDerivationProjectionTypeAdapter();
			}
			@Override
			public Adapter caseRoleBaseType(RoleBaseType object) {
				return createRoleBaseTypeAdapter();
			}
			@Override
			public Adapter caseRoleInstancesType(RoleInstancesType object) {
				return createRoleInstancesTypeAdapter();
			}
			@Override
			public Adapter caseRoleInstancesType1(RoleInstancesType1 object) {
				return createRoleInstancesType1Adapter();
			}
			@Override
			public Adapter caseRoleInstanceType(RoleInstanceType object) {
				return createRoleInstanceTypeAdapter();
			}
			@Override
			public Adapter caseRolePathOwnerType(RolePathOwnerType object) {
				return createRolePathOwnerTypeAdapter();
			}
			@Override
			public Adapter caseRolePathType(RolePathType object) {
				return createRolePathTypeAdapter();
			}
			@Override
			public Adapter caseRolePlayerRequiredErrorType(RolePlayerRequiredErrorType object) {
				return createRolePlayerRequiredErrorTypeAdapter();
			}
			@Override
			public Adapter caseRoleProxyType(RoleProxyType object) {
				return createRoleProxyTypeAdapter();
			}
			@Override
			public Adapter caseRoleRef(RoleRef object) {
				return createRoleRefAdapter();
			}
			@Override
			public Adapter caseRoleSequenceRoleRef(RoleSequenceRoleRef object) {
				return createRoleSequenceRoleRefAdapter();
			}
			@Override
			public Adapter caseRoleSequenceWithProjectionRoleRef(RoleSequenceWithProjectionRoleRef object) {
				return createRoleSequenceWithProjectionRoleRefAdapter();
			}
			@Override
			public Adapter caseRoleSubPathRef(RoleSubPathRef object) {
				return createRoleSubPathRefAdapter();
			}
			@Override
			public Adapter caseRoleSubPathType(RoleSubPathType object) {
				return createRoleSubPathTypeAdapter();
			}
			@Override
			public Adapter caseRoleTextType(RoleTextType object) {
				return createRoleTextTypeAdapter();
			}
			@Override
			public Adapter caseRoleType(RoleType object) {
				return createRoleTypeAdapter();
			}
			@Override
			public Adapter caseRoleValueRestrictionType(RoleValueRestrictionType object) {
				return createRoleValueRestrictionTypeAdapter();
			}
			@Override
			public Adapter caseRootObjectTypeRef(RootObjectTypeRef object) {
				return createRootObjectTypeRefAdapter();
			}
			@Override
			public Adapter caseRootObjectTypeType(RootObjectTypeType object) {
				return createRootObjectTypeTypeAdapter();
			}
			@Override
			public Adapter caseRowIdOtherDataTypeType(RowIdOtherDataTypeType object) {
				return createRowIdOtherDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseSetComparisonConstraintRef(SetComparisonConstraintRef object) {
				return createSetComparisonConstraintRefAdapter();
			}
			@Override
			public Adapter caseSetComparisonConstraintType(SetComparisonConstraintType object) {
				return createSetComparisonConstraintTypeAdapter();
			}
			@Override
			public Adapter caseSetConstraintRef(SetConstraintRef object) {
				return createSetConstraintRefAdapter();
			}
			@Override
			public Adapter caseSetConstraintType(SetConstraintType object) {
				return createSetConstraintTypeAdapter();
			}
			@Override
			public Adapter caseSetConstraintWithJoinType(SetConstraintWithJoinType object) {
				return createSetConstraintWithJoinTypeAdapter();
			}
			@Override
			public Adapter caseSignedIntegerNumericDataTypeType(SignedIntegerNumericDataTypeType object) {
				return createSignedIntegerNumericDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseSignedLargeIntegerNumericDataTypeType(SignedLargeIntegerNumericDataTypeType object) {
				return createSignedLargeIntegerNumericDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseSignedSmallIntegerNumericDataTypeType(SignedSmallIntegerNumericDataTypeType object) {
				return createSignedSmallIntegerNumericDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseSinglePrecisionFloatingPointNumericDataTypeType(SinglePrecisionFloatingPointNumericDataTypeType object) {
				return createSinglePrecisionFloatingPointNumericDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseSourceType(SourceType object) {
				return createSourceTypeAdapter();
			}
			@Override
			public Adapter caseSubPathsType(SubPathsType object) {
				return createSubPathsTypeAdapter();
			}
			@Override
			public Adapter caseSubqueriesType(SubqueriesType object) {
				return createSubqueriesTypeAdapter();
			}
			@Override
			public Adapter caseSubqueryParameterInputsForType(SubqueryParameterInputsForType object) {
				return createSubqueryParameterInputsForTypeAdapter();
			}
			@Override
			public Adapter caseSubqueryParameterInputsType(SubqueryParameterInputsType object) {
				return createSubqueryParameterInputsTypeAdapter();
			}
			@Override
			public Adapter caseSubqueryParameterInputType(SubqueryParameterInputType object) {
				return createSubqueryParameterInputTypeAdapter();
			}
			@Override
			public Adapter caseSubqueryRef(SubqueryRef object) {
				return createSubqueryRefAdapter();
			}
			@Override
			public Adapter caseSubsetConstraintImpliedByMandatoryConstraintsErrorType(SubsetConstraintImpliedByMandatoryConstraintsErrorType object) {
				return createSubsetConstraintImpliedByMandatoryConstraintsErrorTypeAdapter();
			}
			@Override
			public Adapter caseSubsetConstraintRef(SubsetConstraintRef object) {
				return createSubsetConstraintRefAdapter();
			}
			@Override
			public Adapter caseSubsetConstraintType(SubsetConstraintType object) {
				return createSubsetConstraintTypeAdapter();
			}
			@Override
			public Adapter caseSubtypeDerivationPathType(SubtypeDerivationPathType object) {
				return createSubtypeDerivationPathTypeAdapter();
			}
			@Override
			public Adapter caseSubtypeDerivationRuleType(SubtypeDerivationRuleType object) {
				return createSubtypeDerivationRuleTypeAdapter();
			}
			@Override
			public Adapter caseSubtypeFactTypeType(SubtypeFactTypeType object) {
				return createSubtypeFactTypeTypeAdapter();
			}
			@Override
			public Adapter caseSubtypeRolesType(SubtypeRolesType object) {
				return createSubtypeRolesTypeAdapter();
			}
			@Override
			public Adapter caseSupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType(SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType object) {
				return createSupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorTypeAdapter();
			}
			@Override
			public Adapter caseTimeTemporalDataTypeType(TimeTemporalDataTypeType object) {
				return createTimeTemporalDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseTooFewEntityTypeRoleInstancesErrorType(TooFewEntityTypeRoleInstancesErrorType object) {
				return createTooFewEntityTypeRoleInstancesErrorTypeAdapter();
			}
			@Override
			public Adapter caseTooFewFactTypeRoleInstancesErrorType(TooFewFactTypeRoleInstancesErrorType object) {
				return createTooFewFactTypeRoleInstancesErrorTypeAdapter();
			}
			@Override
			public Adapter caseTooFewReadingRolesErrorType(TooFewReadingRolesErrorType object) {
				return createTooFewReadingRolesErrorTypeAdapter();
			}
			@Override
			public Adapter caseTooFewRoleSequencesErrorType(TooFewRoleSequencesErrorType object) {
				return createTooFewRoleSequencesErrorTypeAdapter();
			}
			@Override
			public Adapter caseTooManyReadingRolesErrorType(TooManyReadingRolesErrorType object) {
				return createTooManyReadingRolesErrorTypeAdapter();
			}
			@Override
			public Adapter caseTooManyRoleSequencesErrorType(TooManyRoleSequencesErrorType object) {
				return createTooManyRoleSequencesErrorTypeAdapter();
			}
			@Override
			public Adapter caseTrueOrFalseLogicalDataTypeType(TrueOrFalseLogicalDataTypeType object) {
				return createTrueOrFalseLogicalDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseUnaryRoleCardinalityRestrictionType(UnaryRoleCardinalityRestrictionType object) {
				return createUnaryRoleCardinalityRestrictionTypeAdapter();
			}
			@Override
			public Adapter caseUniquenessConstraintRef(UniquenessConstraintRef object) {
				return createUniquenessConstraintRefAdapter();
			}
			@Override
			public Adapter caseUniquenessConstraintType(UniquenessConstraintType object) {
				return createUniquenessConstraintTypeAdapter();
			}
			@Override
			public Adapter caseUnsignedIntegerNumericDataTypeType(UnsignedIntegerNumericDataTypeType object) {
				return createUnsignedIntegerNumericDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseUnsignedLargeIntegerNumericDataTypeType(UnsignedLargeIntegerNumericDataTypeType object) {
				return createUnsignedLargeIntegerNumericDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseUnsignedSmallIntegerNumericDataTypeType(UnsignedSmallIntegerNumericDataTypeType object) {
				return createUnsignedSmallIntegerNumericDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseUnsignedTinyIntegerNumericDataTypeType(UnsignedTinyIntegerNumericDataTypeType object) {
				return createUnsignedTinyIntegerNumericDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseUnspecifiedDataTypeType(UnspecifiedDataTypeType object) {
				return createUnspecifiedDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseValueComparisonConstraintOperatorNotSpecifiedErrorType(ValueComparisonConstraintOperatorNotSpecifiedErrorType object) {
				return createValueComparisonConstraintOperatorNotSpecifiedErrorTypeAdapter();
			}
			@Override
			public Adapter caseValueComparisonConstraintRef(ValueComparisonConstraintRef object) {
				return createValueComparisonConstraintRefAdapter();
			}
			@Override
			public Adapter caseValueComparisonConstraintType(ValueComparisonConstraintType object) {
				return createValueComparisonConstraintTypeAdapter();
			}
			@Override
			public Adapter caseValueComparisonRolesNotComparableErrorType(ValueComparisonRolesNotComparableErrorType object) {
				return createValueComparisonRolesNotComparableErrorTypeAdapter();
			}
			@Override
			public Adapter caseValueConstraintRef(ValueConstraintRef object) {
				return createValueConstraintRefAdapter();
			}
			@Override
			public Adapter caseValueConstraintType(ValueConstraintType object) {
				return createValueConstraintTypeAdapter();
			}
			@Override
			public Adapter caseValueConstraintWithNameType(ValueConstraintWithNameType object) {
				return createValueConstraintWithNameTypeAdapter();
			}
			@Override
			public Adapter caseValueRangeOverlapErrorType(ValueRangeOverlapErrorType object) {
				return createValueRangeOverlapErrorTypeAdapter();
			}
			@Override
			public Adapter caseValueRangeRef(ValueRangeRef object) {
				return createValueRangeRefAdapter();
			}
			@Override
			public Adapter caseValueRangesType(ValueRangesType object) {
				return createValueRangesTypeAdapter();
			}
			@Override
			public Adapter caseValueRangeType(ValueRangeType object) {
				return createValueRangeTypeAdapter();
			}
			@Override
			public Adapter caseValueTypeDetachedErrorType(ValueTypeDetachedErrorType object) {
				return createValueTypeDetachedErrorTypeAdapter();
			}
			@Override
			public Adapter caseValueTypeInstanceRef(ValueTypeInstanceRef object) {
				return createValueTypeInstanceRefAdapter();
			}
			@Override
			public Adapter caseValueTypeInstanceType(ValueTypeInstanceType object) {
				return createValueTypeInstanceTypeAdapter();
			}
			@Override
			public Adapter caseValueTypeType(ValueTypeType object) {
				return createValueTypeTypeAdapter();
			}
			@Override
			public Adapter caseValueTypeValueRestrictionType(ValueTypeValueRestrictionType object) {
				return createValueTypeValueRestrictionTypeAdapter();
			}
			@Override
			public Adapter caseVariableLengthRawDataDataTypeType(VariableLengthRawDataDataTypeType object) {
				return createVariableLengthRawDataDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseVariableLengthTextDataTypeType(VariableLengthTextDataTypeType object) {
				return createVariableLengthTextDataTypeTypeAdapter();
			}
			@Override
			public Adapter caseYesOrNoLogicalDataTypeType(YesOrNoLogicalDataTypeType object) {
				return createYesOrNoLogicalDataTypeTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.AggregationContextType <em>Aggregation Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.AggregationContextType
	 * @generated
	 */
	public Adapter createAggregationContextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.AliasesType <em>Aliases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.AliasesType
	 * @generated
	 */
	public Adapter createAliasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.AliasType <em>Alias Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.AliasType
	 * @generated
	 */
	public Adapter createAliasTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.AutoCounterNumericDataTypeType <em>Auto Counter Numeric Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.AutoCounterNumericDataTypeType
	 * @generated
	 */
	public Adapter createAutoCounterNumericDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.AutoTimestampTemporalDataTypeType <em>Auto Timestamp Temporal Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.AutoTimestampTemporalDataTypeType
	 * @generated
	 */
	public Adapter createAutoTimestampTemporalDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.BoundToType <em>Bound To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.BoundToType
	 * @generated
	 */
	public Adapter createBoundToTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueMustBeConsumedErrorType <em>Calculated Path Value Must Be Consumed Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueMustBeConsumedErrorType
	 * @generated
	 */
	public Adapter createCalculatedPathValueMustBeConsumedErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueParameterBindingErrorType <em>Calculated Path Value Parameter Binding Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueParameterBindingErrorType
	 * @generated
	 */
	public Adapter createCalculatedPathValueParameterBindingErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueRequiresAggregationContextErrorType <em>Calculated Path Value Requires Aggregation Context Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueRequiresAggregationContextErrorType
	 * @generated
	 */
	public Adapter createCalculatedPathValueRequiresAggregationContextErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueRequiresFunctionErrorType <em>Calculated Path Value Requires Function Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueRequiresFunctionErrorType
	 * @generated
	 */
	public Adapter createCalculatedPathValueRequiresFunctionErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueInputType <em>Calculated Value Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueInputType
	 * @generated
	 */
	public Adapter createCalculatedValueInputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueRef <em>Calculated Value Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueRef
	 * @generated
	 */
	public Adapter createCalculatedValueRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValuesType <em>Calculated Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValuesType
	 * @generated
	 */
	public Adapter createCalculatedValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValuesType1 <em>Calculated Values Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValuesType1
	 * @generated
	 */
	public Adapter createCalculatedValuesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType <em>Calculated Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType
	 * @generated
	 */
	public Adapter createCalculatedValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType1 <em>Calculated Value Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType1
	 * @generated
	 */
	public Adapter createCalculatedValueType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CardinalityConstraintRef <em>Cardinality Constraint Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CardinalityConstraintRef
	 * @generated
	 */
	public Adapter createCardinalityConstraintRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CardinalityConstraintType <em>Cardinality Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CardinalityConstraintType
	 * @generated
	 */
	public Adapter createCardinalityConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CardinalityRangeOverlapErrorType <em>Cardinality Range Overlap Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CardinalityRangeOverlapErrorType
	 * @generated
	 */
	public Adapter createCardinalityRangeOverlapErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CardinalityRangesType <em>Cardinality Ranges Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CardinalityRangesType
	 * @generated
	 */
	public Adapter createCardinalityRangesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CardinalityRangeType <em>Cardinality Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CardinalityRangeType
	 * @generated
	 */
	public Adapter createCardinalityRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleRolePlayerTypeErrorType <em>Compatible Role Player Type Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CompatibleRolePlayerTypeErrorType
	 * @generated
	 */
	public Adapter createCompatibleRolePlayerTypeErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleSupertypesErrorType <em>Compatible Supertypes Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CompatibleSupertypesErrorType
	 * @generated
	 */
	public Adapter createCompatibleSupertypesErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleValueTypeInstanceValueErrorType <em>Compatible Value Type Instance Value Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CompatibleValueTypeInstanceValueErrorType
	 * @generated
	 */
	public Adapter createCompatibleValueTypeInstanceValueErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConditionsType <em>Conditions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ConditionsType
	 * @generated
	 */
	public Adapter createConditionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintDuplicateNameErrorType <em>Constraint Duplicate Name Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ConstraintDuplicateNameErrorType
	 * @generated
	 */
	public Adapter createConstraintDuplicateNameErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleProjectionRef <em>Constraint Role Projection Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleProjectionRef
	 * @generated
	 */
	public Adapter createConstraintRoleProjectionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleProjectionType <em>Constraint Role Projection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleProjectionType
	 * @generated
	 */
	public Adapter createConstraintRoleProjectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceJoinPathRef <em>Constraint Role Sequence Join Path Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceJoinPathRef
	 * @generated
	 */
	public Adapter createConstraintRoleSequenceJoinPathRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceJoinPathType <em>Constraint Role Sequence Join Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceJoinPathType
	 * @generated
	 */
	public Adapter createConstraintRoleSequenceJoinPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceRef <em>Constraint Role Sequence Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceRef
	 * @generated
	 */
	public Adapter createConstraintRoleSequenceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequencesType <em>Constraint Role Sequences Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequencesType
	 * @generated
	 */
	public Adapter createConstraintRoleSequencesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceType <em>Constraint Role Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceType
	 * @generated
	 */
	public Adapter createConstraintRoleSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceWithJoinAndIdType <em>Constraint Role Sequence With Join And Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceWithJoinAndIdType
	 * @generated
	 */
	public Adapter createConstraintRoleSequenceWithJoinAndIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceWithJoinType <em>Constraint Role Sequence With Join Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceWithJoinType
	 * @generated
	 */
	public Adapter createConstraintRoleSequenceWithJoinTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType <em>Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType
	 * @generated
	 */
	public Adapter createConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType1 <em>Constraints Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType1
	 * @generated
	 */
	public Adapter createConstraintsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType2 <em>Constraints Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType2
	 * @generated
	 */
	public Adapter createConstraintsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType3 <em>Constraints Type3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType3
	 * @generated
	 */
	public Adapter createConstraintsType3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType4 <em>Constraints Type4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType4
	 * @generated
	 */
	public Adapter createConstraintsType4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType5 <em>Constraints Type5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType5
	 * @generated
	 */
	public Adapter createConstraintsType5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintType <em>Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ConstraintType
	 * @generated
	 */
	public Adapter createConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CorrelatedPathRoleRequiresCompatibleRolePlayerErrorType <em>Correlated Path Role Requires Compatible Role Player Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorrelatedPathRoleRequiresCompatibleRolePlayerErrorType
	 * @generated
	 */
	public Adapter createCorrelatedPathRoleRequiresCompatibleRolePlayerErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CustomReferenceModesType <em>Custom Reference Modes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CustomReferenceModesType
	 * @generated
	 */
	public Adapter createCustomReferenceModesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.CustomReferenceModeType <em>Custom Reference Mode Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CustomReferenceModeType
	 * @generated
	 */
	public Adapter createCustomReferenceModeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DataType
	 * @generated
	 */
	public Adapter createDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypeNotSpecifiedErrorType <em>Data Type Not Specified Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DataTypeNotSpecifiedErrorType
	 * @generated
	 */
	public Adapter createDataTypeNotSpecifiedErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypeRef <em>Data Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DataTypeRef
	 * @generated
	 */
	public Adapter createDataTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypeRefRef <em>Data Type Ref Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DataTypeRefRef
	 * @generated
	 */
	public Adapter createDataTypeRefRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType <em>Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType
	 * @generated
	 */
	public Adapter createDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DateAndTimeTemporalDataTypeType <em>Date And Time Temporal Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DateAndTimeTemporalDataTypeType
	 * @generated
	 */
	public Adapter createDateAndTimeTemporalDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DateTemporalDataTypeType <em>Date Temporal Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DateTemporalDataTypeType
	 * @generated
	 */
	public Adapter createDateTemporalDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DecimalNumericDataTypeType <em>Decimal Numeric Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DecimalNumericDataTypeType
	 * @generated
	 */
	public Adapter createDecimalNumericDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DefinitionsType <em>Definitions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DefinitionsType
	 * @generated
	 */
	public Adapter createDefinitionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DefinitionType <em>Definition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DefinitionType
	 * @generated
	 */
	public Adapter createDefinitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivationExpressionType <em>Derivation Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DerivationExpressionType
	 * @generated
	 */
	public Adapter createDerivationExpressionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivationProjectionsType <em>Derivation Projections Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DerivationProjectionsType
	 * @generated
	 */
	public Adapter createDerivationProjectionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivationProjectionsType1 <em>Derivation Projections Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DerivationProjectionsType1
	 * @generated
	 */
	public Adapter createDerivationProjectionsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivationSourceType <em>Derivation Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DerivationSourceType
	 * @generated
	 */
	public Adapter createDerivationSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivationSourceType1 <em>Derivation Source Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DerivationSourceType1
	 * @generated
	 */
	public Adapter createDerivationSourceType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivedFactTypeRoleProjectionCompatibilityErrorType <em>Derived Fact Type Role Projection Compatibility Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DerivedFactTypeRoleProjectionCompatibilityErrorType
	 * @generated
	 */
	public Adapter createDerivedFactTypeRoleProjectionCompatibilityErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivedRoleProjectionRef <em>Derived Role Projection Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DerivedRoleProjectionRef
	 * @generated
	 */
	public Adapter createDerivedRoleProjectionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivedRoleProjectionType <em>Derived Role Projection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DerivedRoleProjectionType
	 * @generated
	 */
	public Adapter createDerivedRoleProjectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DoublePrecisionFloatingPointNumericDataTypeType <em>Double Precision Floating Point Numeric Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DoublePrecisionFloatingPointNumericDataTypeType
	 * @generated
	 */
	public Adapter createDoublePrecisionFloatingPointNumericDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DuplicateReadingSignatureErrorType <em>Duplicate Reading Signature Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DuplicateReadingSignatureErrorType
	 * @generated
	 */
	public Adapter createDuplicateReadingSignatureErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.DynamicColorType <em>Dynamic Color Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DynamicColorType
	 * @generated
	 */
	public Adapter createDynamicColorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ElementRef <em>Element Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ElementRef
	 * @generated
	 */
	public Adapter createElementRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeInstanceRef <em>Entity Type Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeInstanceRef
	 * @generated
	 */
	public Adapter createEntityTypeInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeInstancesType <em>Entity Type Instances Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeInstancesType
	 * @generated
	 */
	public Adapter createEntityTypeInstancesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeInstanceType <em>Entity Type Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeInstanceType
	 * @generated
	 */
	public Adapter createEntityTypeInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeRequiresReferenceSchemeErrorType <em>Entity Type Requires Reference Scheme Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeRequiresReferenceSchemeErrorType
	 * @generated
	 */
	public Adapter createEntityTypeRequiresReferenceSchemeErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeRoleInstancesType <em>Entity Type Role Instances Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeRoleInstancesType
	 * @generated
	 */
	public Adapter createEntityTypeRoleInstancesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeSubtypeInstanceRef <em>Entity Type Subtype Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeSubtypeInstanceRef
	 * @generated
	 */
	public Adapter createEntityTypeSubtypeInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeSubtypeInstanceType <em>Entity Type Subtype Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeSubtypeInstanceType
	 * @generated
	 */
	public Adapter createEntityTypeSubtypeInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeType <em>Entity Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeType
	 * @generated
	 */
	public Adapter createEntityTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.EqualityConstraintImpliedByMandatoryConstraintsErrorType <em>Equality Constraint Implied By Mandatory Constraints Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.EqualityConstraintImpliedByMandatoryConstraintsErrorType
	 * @generated
	 */
	public Adapter createEqualityConstraintImpliedByMandatoryConstraintsErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.EqualityConstraintRef <em>Equality Constraint Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.EqualityConstraintRef
	 * @generated
	 */
	public Adapter createEqualityConstraintRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.EqualityConstraintType <em>Equality Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.EqualityConstraintType
	 * @generated
	 */
	public Adapter createEqualityConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.EqualityImpliedByMandatoryErrorType <em>Equality Implied By Mandatory Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.EqualityImpliedByMandatoryErrorType
	 * @generated
	 */
	public Adapter createEqualityImpliedByMandatoryErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ExclusionConstraintRef <em>Exclusion Constraint Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ExclusionConstraintRef
	 * @generated
	 */
	public Adapter createExclusionConstraintRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ExclusionConstraintType <em>Exclusion Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ExclusionConstraintType
	 * @generated
	 */
	public Adapter createExclusionConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ExclusionContradictsEqualityErrorType <em>Exclusion Contradicts Equality Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ExclusionContradictsEqualityErrorType
	 * @generated
	 */
	public Adapter createExclusionContradictsEqualityErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ExclusionContradictsMandatoryErrorType <em>Exclusion Contradicts Mandatory Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ExclusionContradictsMandatoryErrorType
	 * @generated
	 */
	public Adapter createExclusionContradictsMandatoryErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ExclusionContradictsSubsetErrorType <em>Exclusion Contradicts Subset Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ExclusionContradictsSubsetErrorType
	 * @generated
	 */
	public Adapter createExclusionContradictsSubsetErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ExpandedDataType <em>Expanded Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ExpandedDataType
	 * @generated
	 */
	public Adapter createExpandedDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ExtensionsType <em>Extensions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ExtensionsType
	 * @generated
	 */
	public Adapter createExtensionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ExternalConstraintRoleSequenceArityMismatchErrorType <em>External Constraint Role Sequence Arity Mismatch Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ExternalConstraintRoleSequenceArityMismatchErrorType
	 * @generated
	 */
	public Adapter createExternalConstraintRoleSequenceArityMismatchErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactRolesType <em>Fact Roles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FactRolesType
	 * @generated
	 */
	public Adapter createFactRolesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationExpressionType <em>Fact Type Derivation Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationExpressionType
	 * @generated
	 */
	public Adapter createFactTypeDerivationExpressionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathRef <em>Fact Type Derivation Path Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathRef
	 * @generated
	 */
	public Adapter createFactTypeDerivationPathRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType <em>Fact Type Derivation Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType
	 * @generated
	 */
	public Adapter createFactTypeDerivationPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationProjectionRef <em>Fact Type Derivation Projection Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationProjectionRef
	 * @generated
	 */
	public Adapter createFactTypeDerivationProjectionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationRequiresProjectionErrorType <em>Fact Type Derivation Requires Projection Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationRequiresProjectionErrorType
	 * @generated
	 */
	public Adapter createFactTypeDerivationRequiresProjectionErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationRuleType <em>Fact Type Derivation Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationRuleType
	 * @generated
	 */
	public Adapter createFactTypeDerivationRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstanceRef <em>Fact Type Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstanceRef
	 * @generated
	 */
	public Adapter createFactTypeInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstancesType <em>Fact Type Instances Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstancesType
	 * @generated
	 */
	public Adapter createFactTypeInstancesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstanceType <em>Fact Type Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstanceType
	 * @generated
	 */
	public Adapter createFactTypeInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRef <em>Fact Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRef
	 * @generated
	 */
	public Adapter createFactTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRequiresInternalUniquenessConstraintErrorType <em>Fact Type Requires Internal Uniqueness Constraint Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRequiresInternalUniquenessConstraintErrorType
	 * @generated
	 */
	public Adapter createFactTypeRequiresInternalUniquenessConstraintErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRequiresReadingErrorType <em>Fact Type Requires Reading Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRequiresReadingErrorType
	 * @generated
	 */
	public Adapter createFactTypeRequiresReadingErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRoleInstancesType <em>Fact Type Role Instances Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRoleInstancesType
	 * @generated
	 */
	public Adapter createFactTypeRoleInstancesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypesType <em>Fact Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FactTypesType
	 * @generated
	 */
	public Adapter createFactTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType <em>Fact Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType
	 * @generated
	 */
	public Adapter createFactTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FixedLengthRawDataDataTypeType <em>Fixed Length Raw Data Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FixedLengthRawDataDataTypeType
	 * @generated
	 */
	public Adapter createFixedLengthRawDataDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FixedLengthTextDataTypeType <em>Fixed Length Text Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FixedLengthTextDataTypeType
	 * @generated
	 */
	public Adapter createFixedLengthTextDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FloatingPointNumericDataTypeType <em>Floating Point Numeric Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FloatingPointNumericDataTypeType
	 * @generated
	 */
	public Adapter createFloatingPointNumericDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintContradictsInternalUniquenessConstraintErrorType <em>Frequency Constraint Contradicts Internal Uniqueness Constraint Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintContradictsInternalUniquenessConstraintErrorType
	 * @generated
	 */
	public Adapter createFrequencyConstraintContradictsInternalUniquenessConstraintErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintExactlyOneErrorType <em>Frequency Constraint Exactly One Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintExactlyOneErrorType
	 * @generated
	 */
	public Adapter createFrequencyConstraintExactlyOneErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintMinMaxErrorType <em>Frequency Constraint Min Max Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintMinMaxErrorType
	 * @generated
	 */
	public Adapter createFrequencyConstraintMinMaxErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintNonRestrictiveRangeErrorType <em>Frequency Constraint Non Restrictive Range Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintNonRestrictiveRangeErrorType
	 * @generated
	 */
	public Adapter createFrequencyConstraintNonRestrictiveRangeErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintRef <em>Frequency Constraint Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintRef
	 * @generated
	 */
	public Adapter createFrequencyConstraintRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintType <em>Frequency Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintType
	 * @generated
	 */
	public Adapter createFrequencyConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintViolatedByUniquenessConstraintErrorType <em>Frequency Constraint Violated By Uniqueness Constraint Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintViolatedByUniquenessConstraintErrorType
	 * @generated
	 */
	public Adapter createFrequencyConstraintViolatedByUniquenessConstraintErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionDuplicateNameErrorType <em>Function Duplicate Name Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FunctionDuplicateNameErrorType
	 * @generated
	 */
	public Adapter createFunctionDuplicateNameErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionParameterRef <em>Function Parameter Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FunctionParameterRef
	 * @generated
	 */
	public Adapter createFunctionParameterRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionParameterType <em>Function Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FunctionParameterType
	 * @generated
	 */
	public Adapter createFunctionParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionRef <em>Function Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FunctionRef
	 * @generated
	 */
	public Adapter createFunctionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionsType <em>Functions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FunctionsType
	 * @generated
	 */
	public Adapter createFunctionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionsType1 <em>Functions Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FunctionsType1
	 * @generated
	 */
	public Adapter createFunctionsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.FunctionType
	 * @generated
	 */
	public Adapter createFunctionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.GenerationSettingsType <em>Generation Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.GenerationSettingsType
	 * @generated
	 */
	public Adapter createGenerationSettingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.GenerationSettingType <em>Generation Setting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.GenerationSettingType
	 * @generated
	 */
	public Adapter createGenerationSettingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.GenerationStateType <em>Generation State Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.GenerationStateType
	 * @generated
	 */
	public Adapter createGenerationStateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupDuplicateNameErrorType <em>Group Duplicate Name Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.GroupDuplicateNameErrorType
	 * @generated
	 */
	public Adapter createGroupDuplicateNameErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupElementsType <em>Group Elements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.GroupElementsType
	 * @generated
	 */
	public Adapter createGroupElementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupingType <em>Grouping Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.GroupingType
	 * @generated
	 */
	public Adapter createGroupingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupMembershipContradictionErrorType <em>Group Membership Contradiction Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.GroupMembershipContradictionErrorType
	 * @generated
	 */
	public Adapter createGroupMembershipContradictionErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupRef <em>Group Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.GroupRef
	 * @generated
	 */
	public Adapter createGroupRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupsType <em>Groups Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.GroupsType
	 * @generated
	 */
	public Adapter createGroupsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupsType1 <em>Groups Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.GroupsType1
	 * @generated
	 */
	public Adapter createGroupsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.GroupType
	 * @generated
	 */
	public Adapter createGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupType1 <em>Group Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.GroupType1
	 * @generated
	 */
	public Adapter createGroupType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupTypesType <em>Group Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.GroupTypesType
	 * @generated
	 */
	public Adapter createGroupTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupTypeType <em>Group Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.GroupTypeType
	 * @generated
	 */
	public Adapter createGroupTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImplicationErrorType <em>Implication Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ImplicationErrorType
	 * @generated
	 */
	public Adapter createImplicationErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactRolesType <em>Implied Fact Roles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactRolesType
	 * @generated
	 */
	public Adapter createImpliedFactRolesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType <em>Implied Fact Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType
	 * @generated
	 */
	public Adapter createImpliedFactTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedInternalUniquenessConstraintErrorType <em>Implied Internal Uniqueness Constraint Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ImpliedInternalUniquenessConstraintErrorType
	 * @generated
	 */
	public Adapter createImpliedInternalUniquenessConstraintErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.InformalDerivationRuleType <em>Informal Derivation Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.InformalDerivationRuleType
	 * @generated
	 */
	public Adapter createInformalDerivationRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.InputFromType <em>Input From Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.InputFromType
	 * @generated
	 */
	public Adapter createInputFromTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.InputsType <em>Inputs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.InputsType
	 * @generated
	 */
	public Adapter createInputsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.InstancesType <em>Instances Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.InstancesType
	 * @generated
	 */
	public Adapter createInstancesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.InternalConstraintsType <em>Internal Constraints Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.InternalConstraintsType
	 * @generated
	 */
	public Adapter createInternalConstraintsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.JoinedConstraintRoleProjectionCompatibilityErrorType <em>Joined Constraint Role Projection Compatibility Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.JoinedConstraintRoleProjectionCompatibilityErrorType
	 * @generated
	 */
	public Adapter createJoinedConstraintRoleProjectionCompatibilityErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.JoinedPathRoleRequiresCompatibleRolePlayerErrorType <em>Joined Path Role Requires Compatible Role Player Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.JoinedPathRoleRequiresCompatibleRolePlayerErrorType
	 * @generated
	 */
	public Adapter createJoinedPathRoleRequiresCompatibleRolePlayerErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.JoinPathProjectionRef <em>Join Path Projection Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.JoinPathProjectionRef
	 * @generated
	 */
	public Adapter createJoinPathProjectionRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.JoinPathProjectionsType <em>Join Path Projections Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.JoinPathProjectionsType
	 * @generated
	 */
	public Adapter createJoinPathProjectionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.JoinPathProjectionType <em>Join Path Projection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.JoinPathProjectionType
	 * @generated
	 */
	public Adapter createJoinPathProjectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.JoinPathRequiredErrorType <em>Join Path Required Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.JoinPathRequiredErrorType
	 * @generated
	 */
	public Adapter createJoinPathRequiredErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.JoinPathRequiresProjectionErrorType <em>Join Path Requires Projection Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.JoinPathRequiresProjectionErrorType
	 * @generated
	 */
	public Adapter createJoinPathRequiresProjectionErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.JoinRuleType <em>Join Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.JoinRuleType
	 * @generated
	 */
	public Adapter createJoinRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.LargeLengthRawDataDataTypeType <em>Large Length Raw Data Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.LargeLengthRawDataDataTypeType
	 * @generated
	 */
	public Adapter createLargeLengthRawDataDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.LargeLengthTextDataTypeType <em>Large Length Text Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.LargeLengthTextDataTypeType
	 * @generated
	 */
	public Adapter createLargeLengthTextDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathRef <em>Lead Role Path Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathRef
	 * @generated
	 */
	public Adapter createLeadRolePathRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathType <em>Lead Role Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathType
	 * @generated
	 */
	public Adapter createLeadRolePathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintRef <em>Mandatory Constraint Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintRef
	 * @generated
	 */
	public Adapter createMandatoryConstraintRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType <em>Mandatory Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType
	 * @generated
	 */
	public Adapter createMandatoryConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.MaxValueMismatchErrorType <em>Max Value Mismatch Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.MaxValueMismatchErrorType
	 * @generated
	 */
	public Adapter createMaxValueMismatchErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.MinValueMismatchErrorType <em>Min Value Mismatch Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.MinValueMismatchErrorType
	 * @generated
	 */
	public Adapter createMinValueMismatchErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelError <em>Model Error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ModelError
	 * @generated
	 */
	public Adapter createModelErrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorDisplayFilterType <em>Model Error Display Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorDisplayFilterType
	 * @generated
	 */
	public Adapter createModelErrorDisplayFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType <em>Model Errors Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType
	 * @generated
	 */
	public Adapter createModelErrorsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelNoteReferencedByType <em>Model Note Referenced By Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ModelNoteReferencedByType
	 * @generated
	 */
	public Adapter createModelNoteReferencedByTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelNotesType <em>Model Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ModelNotesType
	 * @generated
	 */
	public Adapter createModelNotesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelNoteType <em>Model Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ModelNoteType
	 * @generated
	 */
	public Adapter createModelNoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.MoneyNumericDataTypeType <em>Money Numeric Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.MoneyNumericDataTypeType
	 * @generated
	 */
	public Adapter createMoneyNumericDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType <em>Name Generator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType
	 * @generated
	 */
	public Adapter createNameGeneratorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.NestedGroupsType <em>Nested Groups Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.NestedGroupsType
	 * @generated
	 */
	public Adapter createNestedGroupsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.NMinusOneErrorType <em>NMinus One Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.NMinusOneErrorType
	 * @generated
	 */
	public Adapter createNMinusOneErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.NotesType <em>Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.NotesType
	 * @generated
	 */
	public Adapter createNotesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.NoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.NoteType
	 * @generated
	 */
	public Adapter createNoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.NotWellModeledSubsetAndMandatoryErrorType <em>Not Well Modeled Subset And Mandatory Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.NotWellModeledSubsetAndMandatoryErrorType
	 * @generated
	 */
	public Adapter createNotWellModeledSubsetAndMandatoryErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectIdOtherDataTypeType <em>Object Id Other Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectIdOtherDataTypeType
	 * @generated
	 */
	public Adapter createObjectIdOtherDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectificationRef <em>Objectification Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectificationRef
	 * @generated
	 */
	public Adapter createObjectificationRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedFactTypeRef <em>Objectified Fact Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedFactTypeRef
	 * @generated
	 */
	public Adapter createObjectifiedFactTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedInstanceRequiredErrorType <em>Objectified Instance Required Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedInstanceRequiredErrorType
	 * @generated
	 */
	public Adapter createObjectifiedInstanceRequiredErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedTypeType <em>Objectified Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedTypeType
	 * @generated
	 */
	public Adapter createObjectifiedTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedUnaryRoleType <em>Objectified Unary Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedUnaryRoleType
	 * @generated
	 */
	public Adapter createObjectifiedUnaryRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectifyingInstanceRequiredErrorType <em>Objectifying Instance Required Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectifyingInstanceRequiredErrorType
	 * @generated
	 */
	public Adapter createObjectifyingInstanceRequiredErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectsType <em>Objects Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectsType
	 * @generated
	 */
	public Adapter createObjectsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeCardinalityRestrictionType <em>Object Type Cardinality Restriction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeCardinalityRestrictionType
	 * @generated
	 */
	public Adapter createObjectTypeCardinalityRestrictionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeDuplicateNameErrorType <em>Object Type Duplicate Name Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeDuplicateNameErrorType
	 * @generated
	 */
	public Adapter createObjectTypeDuplicateNameErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeInstanceRef <em>Object Type Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeInstanceRef
	 * @generated
	 */
	public Adapter createObjectTypeInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRef <em>Object Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRef
	 * @generated
	 */
	public Adapter createObjectTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRequiresPrimarySupertypeErrorType <em>Object Type Requires Primary Supertype Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRequiresPrimarySupertypeErrorType
	 * @generated
	 */
	public Adapter createObjectTypeRequiresPrimarySupertypeErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRoleInstanceRef <em>Object Type Role Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRoleInstanceRef
	 * @generated
	 */
	public Adapter createObjectTypeRoleInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypesType <em>Object Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypesType
	 * @generated
	 */
	public Adapter createObjectTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType <em>Object Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType
	 * @generated
	 */
	public Adapter createObjectTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifierRef <em>Object Unifier Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifierRef
	 * @generated
	 */
	public Adapter createObjectUnifierRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifierRequiresCompatibleObjectTypesErrorType <em>Object Unifier Requires Compatible Object Types Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifierRequiresCompatibleObjectTypesErrorType
	 * @generated
	 */
	public Adapter createObjectUnifierRequiresCompatibleObjectTypesErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifiersType <em>Object Unifiers Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifiersType
	 * @generated
	 */
	public Adapter createObjectUnifiersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifierType <em>Object Unifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifierType
	 * @generated
	 */
	public Adapter createObjectUnifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.OleObjectRawDataDataTypeType <em>Ole Object Raw Data Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.OleObjectRawDataDataTypeType
	 * @generated
	 */
	public Adapter createOleObjectRawDataDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelRef <em>ORM Model Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ORMModelRef
	 * @generated
	 */
	public Adapter createORMModelRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType <em>ORM Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType
	 * @generated
	 */
	public Adapter createORMModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ParametersType <em>Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ParametersType
	 * @generated
	 */
	public Adapter createParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PartialFactTypeDerivationProjectionErrorType <em>Partial Fact Type Derivation Projection Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PartialFactTypeDerivationProjectionErrorType
	 * @generated
	 */
	public Adapter createPartialFactTypeDerivationProjectionErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PartialJoinPathProjectionErrorType <em>Partial Join Path Projection Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PartialJoinPathProjectionErrorType
	 * @generated
	 */
	public Adapter createPartialJoinPathProjectionErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PartialQueryDerivationProjectionErrorType <em>Partial Query Derivation Projection Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PartialQueryDerivationProjectionErrorType
	 * @generated
	 */
	public Adapter createPartialQueryDerivationProjectionErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathComponentsType <em>Path Components Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PathComponentsType
	 * @generated
	 */
	public Adapter createPathComponentsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathComponentType <em>Path Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PathComponentType
	 * @generated
	 */
	public Adapter createPathComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathConditionRoleValueRestrictionType <em>Path Condition Role Value Restriction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PathConditionRoleValueRestrictionType
	 * @generated
	 */
	public Adapter createPathConditionRoleValueRestrictionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathConditionRootValueRestrictionType <em>Path Condition Root Value Restriction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PathConditionRootValueRestrictionType
	 * @generated
	 */
	public Adapter createPathConditionRootValueRestrictionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathConstantType <em>Path Constant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PathConstantType
	 * @generated
	 */
	public Adapter createPathConstantTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleRef <em>Pathed Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleRef
	 * @generated
	 */
	public Adapter createPathedRoleRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRolesType <em>Pathed Roles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PathedRolesType
	 * @generated
	 */
	public Adapter createPathedRolesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType <em>Pathed Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType
	 * @generated
	 */
	public Adapter createPathedRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathOuterJoinRequiresOptionalRoleErrorType <em>Path Outer Join Requires Optional Role Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PathOuterJoinRequiresOptionalRoleErrorType
	 * @generated
	 */
	public Adapter createPathOuterJoinRequiresOptionalRoleErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathRequiresRootObjectTypeErrorType <em>Path Requires Root Object Type Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PathRequiresRootObjectTypeErrorType
	 * @generated
	 */
	public Adapter createPathRequiresRootObjectTypeErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathSameFactTypeRoleFollowsJoinErrorType <em>Path Same Fact Type Role Follows Join Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PathSameFactTypeRoleFollowsJoinErrorType
	 * @generated
	 */
	public Adapter createPathSameFactTypeRoleFollowsJoinErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathStartRoleFollowsRootObjectTypeErrorType <em>Path Start Role Follows Root Object Type Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PathStartRoleFollowsRootObjectTypeErrorType
	 * @generated
	 */
	public Adapter createPathStartRoleFollowsRootObjectTypeErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PictureRawDataDataTypeType <em>Picture Raw Data Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PictureRawDataDataTypeType
	 * @generated
	 */
	public Adapter createPictureRawDataDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PlayedRolesType <em>Played Roles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PlayedRolesType
	 * @generated
	 */
	public Adapter createPlayedRolesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PopulationMandatoryErrorType <em>Population Mandatory Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PopulationMandatoryErrorType
	 * @generated
	 */
	public Adapter createPopulationMandatoryErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PopulationUniquenessErrorType <em>Population Uniqueness Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PopulationUniquenessErrorType
	 * @generated
	 */
	public Adapter createPopulationUniquenessErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.PreferredIdentifierRequiresMandatoryErrorType <em>Preferred Identifier Requires Mandatory Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PreferredIdentifierRequiresMandatoryErrorType
	 * @generated
	 */
	public Adapter createPreferredIdentifierRequiresMandatoryErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ProjectedFromType <em>Projected From Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ProjectedFromType
	 * @generated
	 */
	public Adapter createProjectedFromTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ProjectedFromType1 <em>Projected From Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ProjectedFromType1
	 * @generated
	 */
	public Adapter createProjectedFromType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationPathRef <em>Query Derivation Path Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationPathRef
	 * @generated
	 */
	public Adapter createQueryDerivationPathRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationPathType <em>Query Derivation Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationPathType
	 * @generated
	 */
	public Adapter createQueryDerivationPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationRequiresProjectionErrorType <em>Query Derivation Requires Projection Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationRequiresProjectionErrorType
	 * @generated
	 */
	public Adapter createQueryDerivationRequiresProjectionErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationRuleType <em>Query Derivation Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationRuleType
	 * @generated
	 */
	public Adapter createQueryDerivationRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterBindingsType <em>Query Parameter Bindings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterBindingsType
	 * @generated
	 */
	public Adapter createQueryParameterBindingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterBindingType <em>Query Parameter Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterBindingType
	 * @generated
	 */
	public Adapter createQueryParameterBindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryParametersType <em>Query Parameters Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.QueryParametersType
	 * @generated
	 */
	public Adapter createQueryParametersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterType <em>Query Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterType
	 * @generated
	 */
	public Adapter createQueryParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryRoleProjectionCompatibilityErrorType <em>Query Role Projection Compatibility Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.QueryRoleProjectionCompatibilityErrorType
	 * @generated
	 */
	public Adapter createQueryRoleProjectionCompatibilityErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryType <em>Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.QueryType
	 * @generated
	 */
	public Adapter createQueryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingOrdersType <em>Reading Orders Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ReadingOrdersType
	 * @generated
	 */
	public Adapter createReadingOrdersTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingOrderType <em>Reading Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ReadingOrderType
	 * @generated
	 */
	public Adapter createReadingOrderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingRef <em>Reading Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ReadingRef
	 * @generated
	 */
	public Adapter createReadingRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingRequiresUserModificationErrorType <em>Reading Requires User Modification Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ReadingRequiresUserModificationErrorType
	 * @generated
	 */
	public Adapter createReadingRequiresUserModificationErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingRoleSequenceType <em>Reading Role Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ReadingRoleSequenceType
	 * @generated
	 */
	public Adapter createReadingRoleSequenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingsType <em>Readings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ReadingsType
	 * @generated
	 */
	public Adapter createReadingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingsType1 <em>Readings Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ReadingsType1
	 * @generated
	 */
	public Adapter createReadingsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingType <em>Reading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ReadingType
	 * @generated
	 */
	public Adapter createReadingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhraseDuplicateNameErrorType <em>Recognized Phrase Duplicate Name Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhraseDuplicateNameErrorType
	 * @generated
	 */
	public Adapter createRecognizedPhraseDuplicateNameErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhraseRef <em>Recognized Phrase Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhraseRef
	 * @generated
	 */
	public Adapter createRecognizedPhraseRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhrasesType <em>Recognized Phrases Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhrasesType
	 * @generated
	 */
	public Adapter createRecognizedPhrasesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhrasesType1 <em>Recognized Phrases Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhrasesType1
	 * @generated
	 */
	public Adapter createRecognizedPhrasesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhraseType <em>Recognized Phrase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhraseType
	 * @generated
	 */
	public Adapter createRecognizedPhraseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindRef <em>Reference Mode Kind Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindRef
	 * @generated
	 */
	public Adapter createReferenceModeKindRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindsType <em>Reference Mode Kinds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindsType
	 * @generated
	 */
	public Adapter createReferenceModeKindsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindType <em>Reference Mode Kind Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindType
	 * @generated
	 */
	public Adapter createReferenceModeKindTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RefinementsType <em>Refinements Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RefinementsType
	 * @generated
	 */
	public Adapter createRefinementsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RingConstraintRef <em>Ring Constraint Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RingConstraintRef
	 * @generated
	 */
	public Adapter createRingConstraintRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RingConstraintType <em>Ring Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RingConstraintType
	 * @generated
	 */
	public Adapter createRingConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RingConstraintTypeNotSpecifiedErrorType <em>Ring Constraint Type Not Specified Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RingConstraintTypeNotSpecifiedErrorType
	 * @generated
	 */
	public Adapter createRingConstraintTypeNotSpecifiedErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBasedDerivationProjectionType <em>Role Based Derivation Projection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RoleBasedDerivationProjectionType
	 * @generated
	 */
	public Adapter createRoleBasedDerivationProjectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType <em>Role Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType
	 * @generated
	 */
	public Adapter createRoleBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleInstancesType <em>Role Instances Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RoleInstancesType
	 * @generated
	 */
	public Adapter createRoleInstancesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleInstancesType1 <em>Role Instances Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RoleInstancesType1
	 * @generated
	 */
	public Adapter createRoleInstancesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleInstanceType <em>Role Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RoleInstanceType
	 * @generated
	 */
	public Adapter createRoleInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathOwnerType <em>Role Path Owner Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RolePathOwnerType
	 * @generated
	 */
	public Adapter createRolePathOwnerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathType <em>Role Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RolePathType
	 * @generated
	 */
	public Adapter createRolePathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePlayerRequiredErrorType <em>Role Player Required Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RolePlayerRequiredErrorType
	 * @generated
	 */
	public Adapter createRolePlayerRequiredErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleProxyType <em>Role Proxy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RoleProxyType
	 * @generated
	 */
	public Adapter createRoleProxyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleRef <em>Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RoleRef
	 * @generated
	 */
	public Adapter createRoleRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleSequenceRoleRef <em>Role Sequence Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RoleSequenceRoleRef
	 * @generated
	 */
	public Adapter createRoleSequenceRoleRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleSequenceWithProjectionRoleRef <em>Role Sequence With Projection Role Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RoleSequenceWithProjectionRoleRef
	 * @generated
	 */
	public Adapter createRoleSequenceWithProjectionRoleRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleSubPathRef <em>Role Sub Path Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RoleSubPathRef
	 * @generated
	 */
	public Adapter createRoleSubPathRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleSubPathType <em>Role Sub Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RoleSubPathType
	 * @generated
	 */
	public Adapter createRoleSubPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleTextType <em>Role Text Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RoleTextType
	 * @generated
	 */
	public Adapter createRoleTextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RoleType
	 * @generated
	 */
	public Adapter createRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleValueRestrictionType <em>Role Value Restriction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RoleValueRestrictionType
	 * @generated
	 */
	public Adapter createRoleValueRestrictionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeRef <em>Root Object Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeRef
	 * @generated
	 */
	public Adapter createRootObjectTypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeType <em>Root Object Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeType
	 * @generated
	 */
	public Adapter createRootObjectTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.RowIdOtherDataTypeType <em>Row Id Other Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RowIdOtherDataTypeType
	 * @generated
	 */
	public Adapter createRowIdOtherDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SetComparisonConstraintRef <em>Set Comparison Constraint Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SetComparisonConstraintRef
	 * @generated
	 */
	public Adapter createSetComparisonConstraintRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SetComparisonConstraintType <em>Set Comparison Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SetComparisonConstraintType
	 * @generated
	 */
	public Adapter createSetComparisonConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SetConstraintRef <em>Set Constraint Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SetConstraintRef
	 * @generated
	 */
	public Adapter createSetConstraintRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SetConstraintType <em>Set Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SetConstraintType
	 * @generated
	 */
	public Adapter createSetConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SetConstraintWithJoinType <em>Set Constraint With Join Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SetConstraintWithJoinType
	 * @generated
	 */
	public Adapter createSetConstraintWithJoinTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SignedIntegerNumericDataTypeType <em>Signed Integer Numeric Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SignedIntegerNumericDataTypeType
	 * @generated
	 */
	public Adapter createSignedIntegerNumericDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SignedLargeIntegerNumericDataTypeType <em>Signed Large Integer Numeric Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SignedLargeIntegerNumericDataTypeType
	 * @generated
	 */
	public Adapter createSignedLargeIntegerNumericDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SignedSmallIntegerNumericDataTypeType <em>Signed Small Integer Numeric Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SignedSmallIntegerNumericDataTypeType
	 * @generated
	 */
	public Adapter createSignedSmallIntegerNumericDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SinglePrecisionFloatingPointNumericDataTypeType <em>Single Precision Floating Point Numeric Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SinglePrecisionFloatingPointNumericDataTypeType
	 * @generated
	 */
	public Adapter createSinglePrecisionFloatingPointNumericDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SourceType
	 * @generated
	 */
	public Adapter createSourceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubPathsType <em>Sub Paths Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SubPathsType
	 * @generated
	 */
	public Adapter createSubPathsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubqueriesType <em>Subqueries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SubqueriesType
	 * @generated
	 */
	public Adapter createSubqueriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubqueryParameterInputsForType <em>Subquery Parameter Inputs For Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SubqueryParameterInputsForType
	 * @generated
	 */
	public Adapter createSubqueryParameterInputsForTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubqueryParameterInputsType <em>Subquery Parameter Inputs Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SubqueryParameterInputsType
	 * @generated
	 */
	public Adapter createSubqueryParameterInputsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubqueryParameterInputType <em>Subquery Parameter Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SubqueryParameterInputType
	 * @generated
	 */
	public Adapter createSubqueryParameterInputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubqueryRef <em>Subquery Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SubqueryRef
	 * @generated
	 */
	public Adapter createSubqueryRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubsetConstraintImpliedByMandatoryConstraintsErrorType <em>Subset Constraint Implied By Mandatory Constraints Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SubsetConstraintImpliedByMandatoryConstraintsErrorType
	 * @generated
	 */
	public Adapter createSubsetConstraintImpliedByMandatoryConstraintsErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubsetConstraintRef <em>Subset Constraint Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SubsetConstraintRef
	 * @generated
	 */
	public Adapter createSubsetConstraintRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubsetConstraintType <em>Subset Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SubsetConstraintType
	 * @generated
	 */
	public Adapter createSubsetConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationPathType <em>Subtype Derivation Path Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationPathType
	 * @generated
	 */
	public Adapter createSubtypeDerivationPathTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationRuleType <em>Subtype Derivation Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationRuleType
	 * @generated
	 */
	public Adapter createSubtypeDerivationRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType <em>Subtype Fact Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType
	 * @generated
	 */
	public Adapter createSubtypeFactTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeRolesType <em>Subtype Roles Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SubtypeRolesType
	 * @generated
	 */
	public Adapter createSubtypeRolesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType <em>Superset Role Of Subtype Subset Constraint Not Subtype Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType
	 * @generated
	 */
	public Adapter createSupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.TimeTemporalDataTypeType <em>Time Temporal Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.TimeTemporalDataTypeType
	 * @generated
	 */
	public Adapter createTimeTemporalDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.TooFewEntityTypeRoleInstancesErrorType <em>Too Few Entity Type Role Instances Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.TooFewEntityTypeRoleInstancesErrorType
	 * @generated
	 */
	public Adapter createTooFewEntityTypeRoleInstancesErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.TooFewFactTypeRoleInstancesErrorType <em>Too Few Fact Type Role Instances Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.TooFewFactTypeRoleInstancesErrorType
	 * @generated
	 */
	public Adapter createTooFewFactTypeRoleInstancesErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.TooFewReadingRolesErrorType <em>Too Few Reading Roles Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.TooFewReadingRolesErrorType
	 * @generated
	 */
	public Adapter createTooFewReadingRolesErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.TooFewRoleSequencesErrorType <em>Too Few Role Sequences Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.TooFewRoleSequencesErrorType
	 * @generated
	 */
	public Adapter createTooFewRoleSequencesErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.TooManyReadingRolesErrorType <em>Too Many Reading Roles Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.TooManyReadingRolesErrorType
	 * @generated
	 */
	public Adapter createTooManyReadingRolesErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.TooManyRoleSequencesErrorType <em>Too Many Role Sequences Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.TooManyRoleSequencesErrorType
	 * @generated
	 */
	public Adapter createTooManyRoleSequencesErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.TrueOrFalseLogicalDataTypeType <em>True Or False Logical Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.TrueOrFalseLogicalDataTypeType
	 * @generated
	 */
	public Adapter createTrueOrFalseLogicalDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.UnaryRoleCardinalityRestrictionType <em>Unary Role Cardinality Restriction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.UnaryRoleCardinalityRestrictionType
	 * @generated
	 */
	public Adapter createUnaryRoleCardinalityRestrictionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.UniquenessConstraintRef <em>Uniqueness Constraint Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.UniquenessConstraintRef
	 * @generated
	 */
	public Adapter createUniquenessConstraintRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.UniquenessConstraintType <em>Uniqueness Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.UniquenessConstraintType
	 * @generated
	 */
	public Adapter createUniquenessConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.UnsignedIntegerNumericDataTypeType <em>Unsigned Integer Numeric Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.UnsignedIntegerNumericDataTypeType
	 * @generated
	 */
	public Adapter createUnsignedIntegerNumericDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.UnsignedLargeIntegerNumericDataTypeType <em>Unsigned Large Integer Numeric Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.UnsignedLargeIntegerNumericDataTypeType
	 * @generated
	 */
	public Adapter createUnsignedLargeIntegerNumericDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.UnsignedSmallIntegerNumericDataTypeType <em>Unsigned Small Integer Numeric Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.UnsignedSmallIntegerNumericDataTypeType
	 * @generated
	 */
	public Adapter createUnsignedSmallIntegerNumericDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.UnsignedTinyIntegerNumericDataTypeType <em>Unsigned Tiny Integer Numeric Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.UnsignedTinyIntegerNumericDataTypeType
	 * @generated
	 */
	public Adapter createUnsignedTinyIntegerNumericDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.UnspecifiedDataTypeType <em>Unspecified Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.UnspecifiedDataTypeType
	 * @generated
	 */
	public Adapter createUnspecifiedDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonConstraintOperatorNotSpecifiedErrorType <em>Value Comparison Constraint Operator Not Specified Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonConstraintOperatorNotSpecifiedErrorType
	 * @generated
	 */
	public Adapter createValueComparisonConstraintOperatorNotSpecifiedErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonConstraintRef <em>Value Comparison Constraint Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonConstraintRef
	 * @generated
	 */
	public Adapter createValueComparisonConstraintRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonConstraintType <em>Value Comparison Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonConstraintType
	 * @generated
	 */
	public Adapter createValueComparisonConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonRolesNotComparableErrorType <em>Value Comparison Roles Not Comparable Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonRolesNotComparableErrorType
	 * @generated
	 */
	public Adapter createValueComparisonRolesNotComparableErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueConstraintRef <em>Value Constraint Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ValueConstraintRef
	 * @generated
	 */
	public Adapter createValueConstraintRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueConstraintType <em>Value Constraint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ValueConstraintType
	 * @generated
	 */
	public Adapter createValueConstraintTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueConstraintWithNameType <em>Value Constraint With Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ValueConstraintWithNameType
	 * @generated
	 */
	public Adapter createValueConstraintWithNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeOverlapErrorType <em>Value Range Overlap Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeOverlapErrorType
	 * @generated
	 */
	public Adapter createValueRangeOverlapErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeRef <em>Value Range Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeRef
	 * @generated
	 */
	public Adapter createValueRangeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangesType <em>Value Ranges Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ValueRangesType
	 * @generated
	 */
	public Adapter createValueRangesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType <em>Value Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType
	 * @generated
	 */
	public Adapter createValueRangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeDetachedErrorType <em>Value Type Detached Error Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeDetachedErrorType
	 * @generated
	 */
	public Adapter createValueTypeDetachedErrorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeInstanceRef <em>Value Type Instance Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeInstanceRef
	 * @generated
	 */
	public Adapter createValueTypeInstanceRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeInstanceType <em>Value Type Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeInstanceType
	 * @generated
	 */
	public Adapter createValueTypeInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeType <em>Value Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeType
	 * @generated
	 */
	public Adapter createValueTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeValueRestrictionType <em>Value Type Value Restriction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeValueRestrictionType
	 * @generated
	 */
	public Adapter createValueTypeValueRestrictionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.VariableLengthRawDataDataTypeType <em>Variable Length Raw Data Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.VariableLengthRawDataDataTypeType
	 * @generated
	 */
	public Adapter createVariableLengthRawDataDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.VariableLengthTextDataTypeType <em>Variable Length Text Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.VariableLengthTextDataTypeType
	 * @generated
	 */
	public Adapter createVariableLengthTextDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.core.YesOrNoLogicalDataTypeType <em>Yes Or No Logical Data Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.YesOrNoLogicalDataTypeType
	 * @generated
	 */
	public Adapter createYesOrNoLogicalDataTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CoreAdapterFactory
