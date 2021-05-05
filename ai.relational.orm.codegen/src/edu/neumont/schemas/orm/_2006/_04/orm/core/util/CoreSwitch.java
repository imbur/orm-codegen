/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.util;

import edu.neumont.schemas.orm._2006._04.orm.core.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CorePackage.AGGREGATION_CONTEXT_TYPE: {
				AggregationContextType aggregationContextType = (AggregationContextType)theEObject;
				T result = caseAggregationContextType(aggregationContextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ALIASES_TYPE: {
				AliasesType aliasesType = (AliasesType)theEObject;
				T result = caseAliasesType(aliasesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ALIAS_TYPE: {
				AliasType aliasType = (AliasType)theEObject;
				T result = caseAliasType(aliasType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.AUTO_COUNTER_NUMERIC_DATA_TYPE_TYPE: {
				AutoCounterNumericDataTypeType autoCounterNumericDataTypeType = (AutoCounterNumericDataTypeType)theEObject;
				T result = caseAutoCounterNumericDataTypeType(autoCounterNumericDataTypeType);
				if (result == null) result = caseDataType(autoCounterNumericDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.AUTO_TIMESTAMP_TEMPORAL_DATA_TYPE_TYPE: {
				AutoTimestampTemporalDataTypeType autoTimestampTemporalDataTypeType = (AutoTimestampTemporalDataTypeType)theEObject;
				T result = caseAutoTimestampTemporalDataTypeType(autoTimestampTemporalDataTypeType);
				if (result == null) result = caseDataType(autoTimestampTemporalDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BOUND_TO_TYPE: {
				BoundToType boundToType = (BoundToType)theEObject;
				T result = caseBoundToType(boundToType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CALCULATED_PATH_VALUE_MUST_BE_CONSUMED_ERROR_TYPE: {
				CalculatedPathValueMustBeConsumedErrorType calculatedPathValueMustBeConsumedErrorType = (CalculatedPathValueMustBeConsumedErrorType)theEObject;
				T result = caseCalculatedPathValueMustBeConsumedErrorType(calculatedPathValueMustBeConsumedErrorType);
				if (result == null) result = caseModelError(calculatedPathValueMustBeConsumedErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CALCULATED_PATH_VALUE_PARAMETER_BINDING_ERROR_TYPE: {
				CalculatedPathValueParameterBindingErrorType calculatedPathValueParameterBindingErrorType = (CalculatedPathValueParameterBindingErrorType)theEObject;
				T result = caseCalculatedPathValueParameterBindingErrorType(calculatedPathValueParameterBindingErrorType);
				if (result == null) result = caseModelError(calculatedPathValueParameterBindingErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CALCULATED_PATH_VALUE_REQUIRES_AGGREGATION_CONTEXT_ERROR_TYPE: {
				CalculatedPathValueRequiresAggregationContextErrorType calculatedPathValueRequiresAggregationContextErrorType = (CalculatedPathValueRequiresAggregationContextErrorType)theEObject;
				T result = caseCalculatedPathValueRequiresAggregationContextErrorType(calculatedPathValueRequiresAggregationContextErrorType);
				if (result == null) result = caseModelError(calculatedPathValueRequiresAggregationContextErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CALCULATED_PATH_VALUE_REQUIRES_FUNCTION_ERROR_TYPE: {
				CalculatedPathValueRequiresFunctionErrorType calculatedPathValueRequiresFunctionErrorType = (CalculatedPathValueRequiresFunctionErrorType)theEObject;
				T result = caseCalculatedPathValueRequiresFunctionErrorType(calculatedPathValueRequiresFunctionErrorType);
				if (result == null) result = caseModelError(calculatedPathValueRequiresFunctionErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE: {
				CalculatedValueInputType calculatedValueInputType = (CalculatedValueInputType)theEObject;
				T result = caseCalculatedValueInputType(calculatedValueInputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CALCULATED_VALUE_REF: {
				CalculatedValueRef calculatedValueRef = (CalculatedValueRef)theEObject;
				T result = caseCalculatedValueRef(calculatedValueRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CALCULATED_VALUES_TYPE: {
				CalculatedValuesType calculatedValuesType = (CalculatedValuesType)theEObject;
				T result = caseCalculatedValuesType(calculatedValuesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CALCULATED_VALUES_TYPE1: {
				CalculatedValuesType1 calculatedValuesType1 = (CalculatedValuesType1)theEObject;
				T result = caseCalculatedValuesType1(calculatedValuesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CALCULATED_VALUE_TYPE: {
				CalculatedValueType calculatedValueType = (CalculatedValueType)theEObject;
				T result = caseCalculatedValueType(calculatedValueType);
				if (result == null) result = caseCalculatedValueRef(calculatedValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CALCULATED_VALUE_TYPE1: {
				CalculatedValueType1 calculatedValueType1 = (CalculatedValueType1)theEObject;
				T result = caseCalculatedValueType1(calculatedValueType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CARDINALITY_CONSTRAINT_REF: {
				CardinalityConstraintRef cardinalityConstraintRef = (CardinalityConstraintRef)theEObject;
				T result = caseCardinalityConstraintRef(cardinalityConstraintRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CARDINALITY_CONSTRAINT_TYPE: {
				CardinalityConstraintType cardinalityConstraintType = (CardinalityConstraintType)theEObject;
				T result = caseCardinalityConstraintType(cardinalityConstraintType);
				if (result == null) result = caseConstraintType(cardinalityConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CARDINALITY_RANGE_OVERLAP_ERROR_TYPE: {
				CardinalityRangeOverlapErrorType cardinalityRangeOverlapErrorType = (CardinalityRangeOverlapErrorType)theEObject;
				T result = caseCardinalityRangeOverlapErrorType(cardinalityRangeOverlapErrorType);
				if (result == null) result = caseModelError(cardinalityRangeOverlapErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CARDINALITY_RANGES_TYPE: {
				CardinalityRangesType cardinalityRangesType = (CardinalityRangesType)theEObject;
				T result = caseCardinalityRangesType(cardinalityRangesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CARDINALITY_RANGE_TYPE: {
				CardinalityRangeType cardinalityRangeType = (CardinalityRangeType)theEObject;
				T result = caseCardinalityRangeType(cardinalityRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE: {
				CompatibleRolePlayerTypeErrorType compatibleRolePlayerTypeErrorType = (CompatibleRolePlayerTypeErrorType)theEObject;
				T result = caseCompatibleRolePlayerTypeErrorType(compatibleRolePlayerTypeErrorType);
				if (result == null) result = caseModelError(compatibleRolePlayerTypeErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.COMPATIBLE_SUPERTYPES_ERROR_TYPE: {
				CompatibleSupertypesErrorType compatibleSupertypesErrorType = (CompatibleSupertypesErrorType)theEObject;
				T result = caseCompatibleSupertypesErrorType(compatibleSupertypesErrorType);
				if (result == null) result = caseModelError(compatibleSupertypesErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.COMPATIBLE_VALUE_TYPE_INSTANCE_VALUE_ERROR_TYPE: {
				CompatibleValueTypeInstanceValueErrorType compatibleValueTypeInstanceValueErrorType = (CompatibleValueTypeInstanceValueErrorType)theEObject;
				T result = caseCompatibleValueTypeInstanceValueErrorType(compatibleValueTypeInstanceValueErrorType);
				if (result == null) result = caseModelError(compatibleValueTypeInstanceValueErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONDITIONS_TYPE: {
				ConditionsType conditionsType = (ConditionsType)theEObject;
				T result = caseConditionsType(conditionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINT_DUPLICATE_NAME_ERROR_TYPE: {
				ConstraintDuplicateNameErrorType constraintDuplicateNameErrorType = (ConstraintDuplicateNameErrorType)theEObject;
				T result = caseConstraintDuplicateNameErrorType(constraintDuplicateNameErrorType);
				if (result == null) result = caseModelError(constraintDuplicateNameErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_REF: {
				ConstraintRoleProjectionRef constraintRoleProjectionRef = (ConstraintRoleProjectionRef)theEObject;
				T result = caseConstraintRoleProjectionRef(constraintRoleProjectionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE: {
				ConstraintRoleProjectionType constraintRoleProjectionType = (ConstraintRoleProjectionType)theEObject;
				T result = caseConstraintRoleProjectionType(constraintRoleProjectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_REF: {
				ConstraintRoleSequenceJoinPathRef constraintRoleSequenceJoinPathRef = (ConstraintRoleSequenceJoinPathRef)theEObject;
				T result = caseConstraintRoleSequenceJoinPathRef(constraintRoleSequenceJoinPathRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_TYPE: {
				ConstraintRoleSequenceJoinPathType constraintRoleSequenceJoinPathType = (ConstraintRoleSequenceJoinPathType)theEObject;
				T result = caseConstraintRoleSequenceJoinPathType(constraintRoleSequenceJoinPathType);
				if (result == null) result = caseRolePathOwnerType(constraintRoleSequenceJoinPathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_REF: {
				ConstraintRoleSequenceRef constraintRoleSequenceRef = (ConstraintRoleSequenceRef)theEObject;
				T result = caseConstraintRoleSequenceRef(constraintRoleSequenceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINT_ROLE_SEQUENCES_TYPE: {
				ConstraintRoleSequencesType constraintRoleSequencesType = (ConstraintRoleSequencesType)theEObject;
				T result = caseConstraintRoleSequencesType(constraintRoleSequencesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_TYPE: {
				ConstraintRoleSequenceType constraintRoleSequenceType = (ConstraintRoleSequenceType)theEObject;
				T result = caseConstraintRoleSequenceType(constraintRoleSequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_AND_ID_TYPE: {
				ConstraintRoleSequenceWithJoinAndIdType constraintRoleSequenceWithJoinAndIdType = (ConstraintRoleSequenceWithJoinAndIdType)theEObject;
				T result = caseConstraintRoleSequenceWithJoinAndIdType(constraintRoleSequenceWithJoinAndIdType);
				if (result == null) result = caseConstraintRoleSequenceWithJoinType(constraintRoleSequenceWithJoinAndIdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_TYPE: {
				ConstraintRoleSequenceWithJoinType constraintRoleSequenceWithJoinType = (ConstraintRoleSequenceWithJoinType)theEObject;
				T result = caseConstraintRoleSequenceWithJoinType(constraintRoleSequenceWithJoinType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINTS_TYPE: {
				ConstraintsType constraintsType = (ConstraintsType)theEObject;
				T result = caseConstraintsType(constraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINTS_TYPE1: {
				ConstraintsType1 constraintsType1 = (ConstraintsType1)theEObject;
				T result = caseConstraintsType1(constraintsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINTS_TYPE2: {
				ConstraintsType2 constraintsType2 = (ConstraintsType2)theEObject;
				T result = caseConstraintsType2(constraintsType2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINTS_TYPE3: {
				ConstraintsType3 constraintsType3 = (ConstraintsType3)theEObject;
				T result = caseConstraintsType3(constraintsType3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINTS_TYPE4: {
				ConstraintsType4 constraintsType4 = (ConstraintsType4)theEObject;
				T result = caseConstraintsType4(constraintsType4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINTS_TYPE5: {
				ConstraintsType5 constraintsType5 = (ConstraintsType5)theEObject;
				T result = caseConstraintsType5(constraintsType5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONSTRAINT_TYPE: {
				ConstraintType constraintType = (ConstraintType)theEObject;
				T result = caseConstraintType(constraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORRELATED_PATH_ROLE_REQUIRES_COMPATIBLE_ROLE_PLAYER_ERROR_TYPE: {
				CorrelatedPathRoleRequiresCompatibleRolePlayerErrorType correlatedPathRoleRequiresCompatibleRolePlayerErrorType = (CorrelatedPathRoleRequiresCompatibleRolePlayerErrorType)theEObject;
				T result = caseCorrelatedPathRoleRequiresCompatibleRolePlayerErrorType(correlatedPathRoleRequiresCompatibleRolePlayerErrorType);
				if (result == null) result = caseModelError(correlatedPathRoleRequiresCompatibleRolePlayerErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_REFERENCE_MODES_TYPE: {
				CustomReferenceModesType customReferenceModesType = (CustomReferenceModesType)theEObject;
				T result = caseCustomReferenceModesType(customReferenceModesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE: {
				CustomReferenceModeType customReferenceModeType = (CustomReferenceModeType)theEObject;
				T result = caseCustomReferenceModeType(customReferenceModeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DATA_TYPE_NOT_SPECIFIED_ERROR_TYPE: {
				DataTypeNotSpecifiedErrorType dataTypeNotSpecifiedErrorType = (DataTypeNotSpecifiedErrorType)theEObject;
				T result = caseDataTypeNotSpecifiedErrorType(dataTypeNotSpecifiedErrorType);
				if (result == null) result = caseModelError(dataTypeNotSpecifiedErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DATA_TYPE_REF: {
				DataTypeRef dataTypeRef = (DataTypeRef)theEObject;
				T result = caseDataTypeRef(dataTypeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DATA_TYPE_REF_REF: {
				DataTypeRefRef dataTypeRefRef = (DataTypeRefRef)theEObject;
				T result = caseDataTypeRefRef(dataTypeRefRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DATA_TYPES_TYPE: {
				DataTypesType dataTypesType = (DataTypesType)theEObject;
				T result = caseDataTypesType(dataTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DATE_AND_TIME_TEMPORAL_DATA_TYPE_TYPE: {
				DateAndTimeTemporalDataTypeType dateAndTimeTemporalDataTypeType = (DateAndTimeTemporalDataTypeType)theEObject;
				T result = caseDateAndTimeTemporalDataTypeType(dateAndTimeTemporalDataTypeType);
				if (result == null) result = caseDataType(dateAndTimeTemporalDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DATE_TEMPORAL_DATA_TYPE_TYPE: {
				DateTemporalDataTypeType dateTemporalDataTypeType = (DateTemporalDataTypeType)theEObject;
				T result = caseDateTemporalDataTypeType(dateTemporalDataTypeType);
				if (result == null) result = caseDataType(dateTemporalDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DECIMAL_NUMERIC_DATA_TYPE_TYPE: {
				DecimalNumericDataTypeType decimalNumericDataTypeType = (DecimalNumericDataTypeType)theEObject;
				T result = caseDecimalNumericDataTypeType(decimalNumericDataTypeType);
				if (result == null) result = caseDataType(decimalNumericDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DEFINITIONS_TYPE: {
				DefinitionsType definitionsType = (DefinitionsType)theEObject;
				T result = caseDefinitionsType(definitionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DEFINITION_TYPE: {
				DefinitionType definitionType = (DefinitionType)theEObject;
				T result = caseDefinitionType(definitionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DERIVATION_EXPRESSION_TYPE: {
				DerivationExpressionType derivationExpressionType = (DerivationExpressionType)theEObject;
				T result = caseDerivationExpressionType(derivationExpressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DERIVATION_PROJECTIONS_TYPE: {
				DerivationProjectionsType derivationProjectionsType = (DerivationProjectionsType)theEObject;
				T result = caseDerivationProjectionsType(derivationProjectionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DERIVATION_PROJECTIONS_TYPE1: {
				DerivationProjectionsType1 derivationProjectionsType1 = (DerivationProjectionsType1)theEObject;
				T result = caseDerivationProjectionsType1(derivationProjectionsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DERIVATION_SOURCE_TYPE: {
				DerivationSourceType derivationSourceType = (DerivationSourceType)theEObject;
				T result = caseDerivationSourceType(derivationSourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DERIVATION_SOURCE_TYPE1: {
				DerivationSourceType1 derivationSourceType1 = (DerivationSourceType1)theEObject;
				T result = caseDerivationSourceType1(derivationSourceType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DERIVED_FACT_TYPE_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE: {
				DerivedFactTypeRoleProjectionCompatibilityErrorType derivedFactTypeRoleProjectionCompatibilityErrorType = (DerivedFactTypeRoleProjectionCompatibilityErrorType)theEObject;
				T result = caseDerivedFactTypeRoleProjectionCompatibilityErrorType(derivedFactTypeRoleProjectionCompatibilityErrorType);
				if (result == null) result = caseModelError(derivedFactTypeRoleProjectionCompatibilityErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DERIVED_ROLE_PROJECTION_REF: {
				DerivedRoleProjectionRef derivedRoleProjectionRef = (DerivedRoleProjectionRef)theEObject;
				T result = caseDerivedRoleProjectionRef(derivedRoleProjectionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE: {
				DerivedRoleProjectionType derivedRoleProjectionType = (DerivedRoleProjectionType)theEObject;
				T result = caseDerivedRoleProjectionType(derivedRoleProjectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DOUBLE_PRECISION_FLOATING_POINT_NUMERIC_DATA_TYPE_TYPE: {
				DoublePrecisionFloatingPointNumericDataTypeType doublePrecisionFloatingPointNumericDataTypeType = (DoublePrecisionFloatingPointNumericDataTypeType)theEObject;
				T result = caseDoublePrecisionFloatingPointNumericDataTypeType(doublePrecisionFloatingPointNumericDataTypeType);
				if (result == null) result = caseDataType(doublePrecisionFloatingPointNumericDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DUPLICATE_READING_SIGNATURE_ERROR_TYPE: {
				DuplicateReadingSignatureErrorType duplicateReadingSignatureErrorType = (DuplicateReadingSignatureErrorType)theEObject;
				T result = caseDuplicateReadingSignatureErrorType(duplicateReadingSignatureErrorType);
				if (result == null) result = caseModelError(duplicateReadingSignatureErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DYNAMIC_COLOR_TYPE: {
				DynamicColorType dynamicColorType = (DynamicColorType)theEObject;
				T result = caseDynamicColorType(dynamicColorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ELEMENT_REF: {
				ElementRef elementRef = (ElementRef)theEObject;
				T result = caseElementRef(elementRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ENTITY_TYPE_INSTANCE_REF: {
				EntityTypeInstanceRef entityTypeInstanceRef = (EntityTypeInstanceRef)theEObject;
				T result = caseEntityTypeInstanceRef(entityTypeInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ENTITY_TYPE_INSTANCES_TYPE: {
				EntityTypeInstancesType entityTypeInstancesType = (EntityTypeInstancesType)theEObject;
				T result = caseEntityTypeInstancesType(entityTypeInstancesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ENTITY_TYPE_INSTANCE_TYPE: {
				EntityTypeInstanceType entityTypeInstanceType = (EntityTypeInstanceType)theEObject;
				T result = caseEntityTypeInstanceType(entityTypeInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ENTITY_TYPE_REQUIRES_REFERENCE_SCHEME_ERROR_TYPE: {
				EntityTypeRequiresReferenceSchemeErrorType entityTypeRequiresReferenceSchemeErrorType = (EntityTypeRequiresReferenceSchemeErrorType)theEObject;
				T result = caseEntityTypeRequiresReferenceSchemeErrorType(entityTypeRequiresReferenceSchemeErrorType);
				if (result == null) result = caseModelError(entityTypeRequiresReferenceSchemeErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ENTITY_TYPE_ROLE_INSTANCES_TYPE: {
				EntityTypeRoleInstancesType entityTypeRoleInstancesType = (EntityTypeRoleInstancesType)theEObject;
				T result = caseEntityTypeRoleInstancesType(entityTypeRoleInstancesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_REF: {
				EntityTypeSubtypeInstanceRef entityTypeSubtypeInstanceRef = (EntityTypeSubtypeInstanceRef)theEObject;
				T result = caseEntityTypeSubtypeInstanceRef(entityTypeSubtypeInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE: {
				EntityTypeSubtypeInstanceType entityTypeSubtypeInstanceType = (EntityTypeSubtypeInstanceType)theEObject;
				T result = caseEntityTypeSubtypeInstanceType(entityTypeSubtypeInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ENTITY_TYPE_TYPE: {
				EntityTypeType entityTypeType = (EntityTypeType)theEObject;
				T result = caseEntityTypeType(entityTypeType);
				if (result == null) result = caseObjectTypeType(entityTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EQUALITY_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE: {
				EqualityConstraintImpliedByMandatoryConstraintsErrorType equalityConstraintImpliedByMandatoryConstraintsErrorType = (EqualityConstraintImpliedByMandatoryConstraintsErrorType)theEObject;
				T result = caseEqualityConstraintImpliedByMandatoryConstraintsErrorType(equalityConstraintImpliedByMandatoryConstraintsErrorType);
				if (result == null) result = caseModelError(equalityConstraintImpliedByMandatoryConstraintsErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EQUALITY_CONSTRAINT_REF: {
				EqualityConstraintRef equalityConstraintRef = (EqualityConstraintRef)theEObject;
				T result = caseEqualityConstraintRef(equalityConstraintRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EQUALITY_CONSTRAINT_TYPE: {
				EqualityConstraintType equalityConstraintType = (EqualityConstraintType)theEObject;
				T result = caseEqualityConstraintType(equalityConstraintType);
				if (result == null) result = caseSetComparisonConstraintType(equalityConstraintType);
				if (result == null) result = caseConstraintType(equalityConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EQUALITY_IMPLIED_BY_MANDATORY_ERROR_TYPE: {
				EqualityImpliedByMandatoryErrorType equalityImpliedByMandatoryErrorType = (EqualityImpliedByMandatoryErrorType)theEObject;
				T result = caseEqualityImpliedByMandatoryErrorType(equalityImpliedByMandatoryErrorType);
				if (result == null) result = caseModelError(equalityImpliedByMandatoryErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXCLUSION_CONSTRAINT_REF: {
				ExclusionConstraintRef exclusionConstraintRef = (ExclusionConstraintRef)theEObject;
				T result = caseExclusionConstraintRef(exclusionConstraintRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXCLUSION_CONSTRAINT_TYPE: {
				ExclusionConstraintType exclusionConstraintType = (ExclusionConstraintType)theEObject;
				T result = caseExclusionConstraintType(exclusionConstraintType);
				if (result == null) result = caseSetComparisonConstraintType(exclusionConstraintType);
				if (result == null) result = caseConstraintType(exclusionConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXCLUSION_CONTRADICTS_EQUALITY_ERROR_TYPE: {
				ExclusionContradictsEqualityErrorType exclusionContradictsEqualityErrorType = (ExclusionContradictsEqualityErrorType)theEObject;
				T result = caseExclusionContradictsEqualityErrorType(exclusionContradictsEqualityErrorType);
				if (result == null) result = caseModelError(exclusionContradictsEqualityErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXCLUSION_CONTRADICTS_MANDATORY_ERROR_TYPE: {
				ExclusionContradictsMandatoryErrorType exclusionContradictsMandatoryErrorType = (ExclusionContradictsMandatoryErrorType)theEObject;
				T result = caseExclusionContradictsMandatoryErrorType(exclusionContradictsMandatoryErrorType);
				if (result == null) result = caseModelError(exclusionContradictsMandatoryErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXCLUSION_CONTRADICTS_SUBSET_ERROR_TYPE: {
				ExclusionContradictsSubsetErrorType exclusionContradictsSubsetErrorType = (ExclusionContradictsSubsetErrorType)theEObject;
				T result = caseExclusionContradictsSubsetErrorType(exclusionContradictsSubsetErrorType);
				if (result == null) result = caseModelError(exclusionContradictsSubsetErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXPANDED_DATA_TYPE: {
				ExpandedDataType expandedDataType = (ExpandedDataType)theEObject;
				T result = caseExpandedDataType(expandedDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXTENSIONS_TYPE: {
				ExtensionsType extensionsType = (ExtensionsType)theEObject;
				T result = caseExtensionsType(extensionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXTERNAL_CONSTRAINT_ROLE_SEQUENCE_ARITY_MISMATCH_ERROR_TYPE: {
				ExternalConstraintRoleSequenceArityMismatchErrorType externalConstraintRoleSequenceArityMismatchErrorType = (ExternalConstraintRoleSequenceArityMismatchErrorType)theEObject;
				T result = caseExternalConstraintRoleSequenceArityMismatchErrorType(externalConstraintRoleSequenceArityMismatchErrorType);
				if (result == null) result = caseModelError(externalConstraintRoleSequenceArityMismatchErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FACT_ROLES_TYPE: {
				FactRolesType factRolesType = (FactRolesType)theEObject;
				T result = caseFactRolesType(factRolesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FACT_TYPE_DERIVATION_EXPRESSION_TYPE: {
				FactTypeDerivationExpressionType factTypeDerivationExpressionType = (FactTypeDerivationExpressionType)theEObject;
				T result = caseFactTypeDerivationExpressionType(factTypeDerivationExpressionType);
				if (result == null) result = caseDerivationExpressionType(factTypeDerivationExpressionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FACT_TYPE_DERIVATION_PATH_REF: {
				FactTypeDerivationPathRef factTypeDerivationPathRef = (FactTypeDerivationPathRef)theEObject;
				T result = caseFactTypeDerivationPathRef(factTypeDerivationPathRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FACT_TYPE_DERIVATION_PATH_TYPE: {
				FactTypeDerivationPathType factTypeDerivationPathType = (FactTypeDerivationPathType)theEObject;
				T result = caseFactTypeDerivationPathType(factTypeDerivationPathType);
				if (result == null) result = caseRolePathOwnerType(factTypeDerivationPathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FACT_TYPE_DERIVATION_PROJECTION_REF: {
				FactTypeDerivationProjectionRef factTypeDerivationProjectionRef = (FactTypeDerivationProjectionRef)theEObject;
				T result = caseFactTypeDerivationProjectionRef(factTypeDerivationProjectionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FACT_TYPE_DERIVATION_REQUIRES_PROJECTION_ERROR_TYPE: {
				FactTypeDerivationRequiresProjectionErrorType factTypeDerivationRequiresProjectionErrorType = (FactTypeDerivationRequiresProjectionErrorType)theEObject;
				T result = caseFactTypeDerivationRequiresProjectionErrorType(factTypeDerivationRequiresProjectionErrorType);
				if (result == null) result = caseModelError(factTypeDerivationRequiresProjectionErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE: {
				FactTypeDerivationRuleType factTypeDerivationRuleType = (FactTypeDerivationRuleType)theEObject;
				T result = caseFactTypeDerivationRuleType(factTypeDerivationRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FACT_TYPE_INSTANCE_REF: {
				FactTypeInstanceRef factTypeInstanceRef = (FactTypeInstanceRef)theEObject;
				T result = caseFactTypeInstanceRef(factTypeInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FACT_TYPE_INSTANCES_TYPE: {
				FactTypeInstancesType factTypeInstancesType = (FactTypeInstancesType)theEObject;
				T result = caseFactTypeInstancesType(factTypeInstancesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FACT_TYPE_INSTANCE_TYPE: {
				FactTypeInstanceType factTypeInstanceType = (FactTypeInstanceType)theEObject;
				T result = caseFactTypeInstanceType(factTypeInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FACT_TYPE_REF: {
				FactTypeRef factTypeRef = (FactTypeRef)theEObject;
				T result = caseFactTypeRef(factTypeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FACT_TYPE_REQUIRES_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE: {
				FactTypeRequiresInternalUniquenessConstraintErrorType factTypeRequiresInternalUniquenessConstraintErrorType = (FactTypeRequiresInternalUniquenessConstraintErrorType)theEObject;
				T result = caseFactTypeRequiresInternalUniquenessConstraintErrorType(factTypeRequiresInternalUniquenessConstraintErrorType);
				if (result == null) result = caseModelError(factTypeRequiresInternalUniquenessConstraintErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FACT_TYPE_REQUIRES_READING_ERROR_TYPE: {
				FactTypeRequiresReadingErrorType factTypeRequiresReadingErrorType = (FactTypeRequiresReadingErrorType)theEObject;
				T result = caseFactTypeRequiresReadingErrorType(factTypeRequiresReadingErrorType);
				if (result == null) result = caseModelError(factTypeRequiresReadingErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FACT_TYPE_ROLE_INSTANCES_TYPE: {
				FactTypeRoleInstancesType factTypeRoleInstancesType = (FactTypeRoleInstancesType)theEObject;
				T result = caseFactTypeRoleInstancesType(factTypeRoleInstancesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FACT_TYPES_TYPE: {
				FactTypesType factTypesType = (FactTypesType)theEObject;
				T result = caseFactTypesType(factTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FACT_TYPE_TYPE: {
				FactTypeType factTypeType = (FactTypeType)theEObject;
				T result = caseFactTypeType(factTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FIXED_LENGTH_RAW_DATA_DATA_TYPE_TYPE: {
				FixedLengthRawDataDataTypeType fixedLengthRawDataDataTypeType = (FixedLengthRawDataDataTypeType)theEObject;
				T result = caseFixedLengthRawDataDataTypeType(fixedLengthRawDataDataTypeType);
				if (result == null) result = caseDataType(fixedLengthRawDataDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FIXED_LENGTH_TEXT_DATA_TYPE_TYPE: {
				FixedLengthTextDataTypeType fixedLengthTextDataTypeType = (FixedLengthTextDataTypeType)theEObject;
				T result = caseFixedLengthTextDataTypeType(fixedLengthTextDataTypeType);
				if (result == null) result = caseDataType(fixedLengthTextDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FLOATING_POINT_NUMERIC_DATA_TYPE_TYPE: {
				FloatingPointNumericDataTypeType floatingPointNumericDataTypeType = (FloatingPointNumericDataTypeType)theEObject;
				T result = caseFloatingPointNumericDataTypeType(floatingPointNumericDataTypeType);
				if (result == null) result = caseDataType(floatingPointNumericDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE: {
				FrequencyConstraintContradictsInternalUniquenessConstraintErrorType frequencyConstraintContradictsInternalUniquenessConstraintErrorType = (FrequencyConstraintContradictsInternalUniquenessConstraintErrorType)theEObject;
				T result = caseFrequencyConstraintContradictsInternalUniquenessConstraintErrorType(frequencyConstraintContradictsInternalUniquenessConstraintErrorType);
				if (result == null) result = caseModelError(frequencyConstraintContradictsInternalUniquenessConstraintErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FREQUENCY_CONSTRAINT_EXACTLY_ONE_ERROR_TYPE: {
				FrequencyConstraintExactlyOneErrorType frequencyConstraintExactlyOneErrorType = (FrequencyConstraintExactlyOneErrorType)theEObject;
				T result = caseFrequencyConstraintExactlyOneErrorType(frequencyConstraintExactlyOneErrorType);
				if (result == null) result = caseModelError(frequencyConstraintExactlyOneErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FREQUENCY_CONSTRAINT_MIN_MAX_ERROR_TYPE: {
				FrequencyConstraintMinMaxErrorType frequencyConstraintMinMaxErrorType = (FrequencyConstraintMinMaxErrorType)theEObject;
				T result = caseFrequencyConstraintMinMaxErrorType(frequencyConstraintMinMaxErrorType);
				if (result == null) result = caseModelError(frequencyConstraintMinMaxErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FREQUENCY_CONSTRAINT_NON_RESTRICTIVE_RANGE_ERROR_TYPE: {
				FrequencyConstraintNonRestrictiveRangeErrorType frequencyConstraintNonRestrictiveRangeErrorType = (FrequencyConstraintNonRestrictiveRangeErrorType)theEObject;
				T result = caseFrequencyConstraintNonRestrictiveRangeErrorType(frequencyConstraintNonRestrictiveRangeErrorType);
				if (result == null) result = caseModelError(frequencyConstraintNonRestrictiveRangeErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FREQUENCY_CONSTRAINT_REF: {
				FrequencyConstraintRef frequencyConstraintRef = (FrequencyConstraintRef)theEObject;
				T result = caseFrequencyConstraintRef(frequencyConstraintRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FREQUENCY_CONSTRAINT_TYPE: {
				FrequencyConstraintType frequencyConstraintType = (FrequencyConstraintType)theEObject;
				T result = caseFrequencyConstraintType(frequencyConstraintType);
				if (result == null) result = caseSetConstraintWithJoinType(frequencyConstraintType);
				if (result == null) result = caseConstraintType(frequencyConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FREQUENCY_CONSTRAINT_VIOLATED_BY_UNIQUENESS_CONSTRAINT_ERROR_TYPE: {
				FrequencyConstraintViolatedByUniquenessConstraintErrorType frequencyConstraintViolatedByUniquenessConstraintErrorType = (FrequencyConstraintViolatedByUniquenessConstraintErrorType)theEObject;
				T result = caseFrequencyConstraintViolatedByUniquenessConstraintErrorType(frequencyConstraintViolatedByUniquenessConstraintErrorType);
				if (result == null) result = caseModelError(frequencyConstraintViolatedByUniquenessConstraintErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FUNCTION_DUPLICATE_NAME_ERROR_TYPE: {
				FunctionDuplicateNameErrorType functionDuplicateNameErrorType = (FunctionDuplicateNameErrorType)theEObject;
				T result = caseFunctionDuplicateNameErrorType(functionDuplicateNameErrorType);
				if (result == null) result = caseModelError(functionDuplicateNameErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FUNCTION_PARAMETER_REF: {
				FunctionParameterRef functionParameterRef = (FunctionParameterRef)theEObject;
				T result = caseFunctionParameterRef(functionParameterRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FUNCTION_PARAMETER_TYPE: {
				FunctionParameterType functionParameterType = (FunctionParameterType)theEObject;
				T result = caseFunctionParameterType(functionParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FUNCTION_REF: {
				FunctionRef functionRef = (FunctionRef)theEObject;
				T result = caseFunctionRef(functionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FUNCTIONS_TYPE: {
				FunctionsType functionsType = (FunctionsType)theEObject;
				T result = caseFunctionsType(functionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FUNCTIONS_TYPE1: {
				FunctionsType1 functionsType1 = (FunctionsType1)theEObject;
				T result = caseFunctionsType1(functionsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FUNCTION_TYPE: {
				FunctionType functionType = (FunctionType)theEObject;
				T result = caseFunctionType(functionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GENERATION_SETTINGS_TYPE: {
				GenerationSettingsType generationSettingsType = (GenerationSettingsType)theEObject;
				T result = caseGenerationSettingsType(generationSettingsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GENERATION_SETTING_TYPE: {
				GenerationSettingType generationSettingType = (GenerationSettingType)theEObject;
				T result = caseGenerationSettingType(generationSettingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GENERATION_STATE_TYPE: {
				GenerationStateType generationStateType = (GenerationStateType)theEObject;
				T result = caseGenerationStateType(generationStateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GROUP_DUPLICATE_NAME_ERROR_TYPE: {
				GroupDuplicateNameErrorType groupDuplicateNameErrorType = (GroupDuplicateNameErrorType)theEObject;
				T result = caseGroupDuplicateNameErrorType(groupDuplicateNameErrorType);
				if (result == null) result = caseModelError(groupDuplicateNameErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GROUP_ELEMENTS_TYPE: {
				GroupElementsType groupElementsType = (GroupElementsType)theEObject;
				T result = caseGroupElementsType(groupElementsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GROUPING_TYPE: {
				GroupingType groupingType = (GroupingType)theEObject;
				T result = caseGroupingType(groupingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GROUP_MEMBERSHIP_CONTRADICTION_ERROR_TYPE: {
				GroupMembershipContradictionErrorType groupMembershipContradictionErrorType = (GroupMembershipContradictionErrorType)theEObject;
				T result = caseGroupMembershipContradictionErrorType(groupMembershipContradictionErrorType);
				if (result == null) result = caseModelError(groupMembershipContradictionErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GROUP_REF: {
				GroupRef groupRef = (GroupRef)theEObject;
				T result = caseGroupRef(groupRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GROUPS_TYPE: {
				GroupsType groupsType = (GroupsType)theEObject;
				T result = caseGroupsType(groupsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GROUPS_TYPE1: {
				GroupsType1 groupsType1 = (GroupsType1)theEObject;
				T result = caseGroupsType1(groupsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GROUP_TYPE: {
				GroupType groupType = (GroupType)theEObject;
				T result = caseGroupType(groupType);
				if (result == null) result = caseGroupRef(groupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GROUP_TYPE1: {
				GroupType1 groupType1 = (GroupType1)theEObject;
				T result = caseGroupType1(groupType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GROUP_TYPES_TYPE: {
				GroupTypesType groupTypesType = (GroupTypesType)theEObject;
				T result = caseGroupTypesType(groupTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GROUP_TYPE_TYPE: {
				GroupTypeType groupTypeType = (GroupTypeType)theEObject;
				T result = caseGroupTypeType(groupTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IMPLICATION_ERROR_TYPE: {
				ImplicationErrorType implicationErrorType = (ImplicationErrorType)theEObject;
				T result = caseImplicationErrorType(implicationErrorType);
				if (result == null) result = caseModelError(implicationErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IMPLIED_FACT_ROLES_TYPE: {
				ImpliedFactRolesType impliedFactRolesType = (ImpliedFactRolesType)theEObject;
				T result = caseImpliedFactRolesType(impliedFactRolesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IMPLIED_FACT_TYPE_TYPE: {
				ImpliedFactTypeType impliedFactTypeType = (ImpliedFactTypeType)theEObject;
				T result = caseImpliedFactTypeType(impliedFactTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IMPLIED_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE: {
				ImpliedInternalUniquenessConstraintErrorType impliedInternalUniquenessConstraintErrorType = (ImpliedInternalUniquenessConstraintErrorType)theEObject;
				T result = caseImpliedInternalUniquenessConstraintErrorType(impliedInternalUniquenessConstraintErrorType);
				if (result == null) result = caseModelError(impliedInternalUniquenessConstraintErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INFORMAL_DERIVATION_RULE_TYPE: {
				InformalDerivationRuleType informalDerivationRuleType = (InformalDerivationRuleType)theEObject;
				T result = caseInformalDerivationRuleType(informalDerivationRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INPUT_FROM_TYPE: {
				InputFromType inputFromType = (InputFromType)theEObject;
				T result = caseInputFromType(inputFromType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INPUTS_TYPE: {
				InputsType inputsType = (InputsType)theEObject;
				T result = caseInputsType(inputsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INSTANCES_TYPE: {
				InstancesType instancesType = (InstancesType)theEObject;
				T result = caseInstancesType(instancesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INTERNAL_CONSTRAINTS_TYPE: {
				InternalConstraintsType internalConstraintsType = (InternalConstraintsType)theEObject;
				T result = caseInternalConstraintsType(internalConstraintsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.JOINED_CONSTRAINT_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE: {
				JoinedConstraintRoleProjectionCompatibilityErrorType joinedConstraintRoleProjectionCompatibilityErrorType = (JoinedConstraintRoleProjectionCompatibilityErrorType)theEObject;
				T result = caseJoinedConstraintRoleProjectionCompatibilityErrorType(joinedConstraintRoleProjectionCompatibilityErrorType);
				if (result == null) result = caseModelError(joinedConstraintRoleProjectionCompatibilityErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.JOINED_PATH_ROLE_REQUIRES_COMPATIBLE_ROLE_PLAYER_ERROR_TYPE: {
				JoinedPathRoleRequiresCompatibleRolePlayerErrorType joinedPathRoleRequiresCompatibleRolePlayerErrorType = (JoinedPathRoleRequiresCompatibleRolePlayerErrorType)theEObject;
				T result = caseJoinedPathRoleRequiresCompatibleRolePlayerErrorType(joinedPathRoleRequiresCompatibleRolePlayerErrorType);
				if (result == null) result = caseModelError(joinedPathRoleRequiresCompatibleRolePlayerErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.JOIN_PATH_PROJECTION_REF: {
				JoinPathProjectionRef joinPathProjectionRef = (JoinPathProjectionRef)theEObject;
				T result = caseJoinPathProjectionRef(joinPathProjectionRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.JOIN_PATH_PROJECTIONS_TYPE: {
				JoinPathProjectionsType joinPathProjectionsType = (JoinPathProjectionsType)theEObject;
				T result = caseJoinPathProjectionsType(joinPathProjectionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.JOIN_PATH_PROJECTION_TYPE: {
				JoinPathProjectionType joinPathProjectionType = (JoinPathProjectionType)theEObject;
				T result = caseJoinPathProjectionType(joinPathProjectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.JOIN_PATH_REQUIRED_ERROR_TYPE: {
				JoinPathRequiredErrorType joinPathRequiredErrorType = (JoinPathRequiredErrorType)theEObject;
				T result = caseJoinPathRequiredErrorType(joinPathRequiredErrorType);
				if (result == null) result = caseModelError(joinPathRequiredErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.JOIN_PATH_REQUIRES_PROJECTION_ERROR_TYPE: {
				JoinPathRequiresProjectionErrorType joinPathRequiresProjectionErrorType = (JoinPathRequiresProjectionErrorType)theEObject;
				T result = caseJoinPathRequiresProjectionErrorType(joinPathRequiresProjectionErrorType);
				if (result == null) result = caseModelError(joinPathRequiresProjectionErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.JOIN_RULE_TYPE: {
				JoinRuleType joinRuleType = (JoinRuleType)theEObject;
				T result = caseJoinRuleType(joinRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.LARGE_LENGTH_RAW_DATA_DATA_TYPE_TYPE: {
				LargeLengthRawDataDataTypeType largeLengthRawDataDataTypeType = (LargeLengthRawDataDataTypeType)theEObject;
				T result = caseLargeLengthRawDataDataTypeType(largeLengthRawDataDataTypeType);
				if (result == null) result = caseDataType(largeLengthRawDataDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.LARGE_LENGTH_TEXT_DATA_TYPE_TYPE: {
				LargeLengthTextDataTypeType largeLengthTextDataTypeType = (LargeLengthTextDataTypeType)theEObject;
				T result = caseLargeLengthTextDataTypeType(largeLengthTextDataTypeType);
				if (result == null) result = caseDataType(largeLengthTextDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.LEAD_ROLE_PATH_REF: {
				LeadRolePathRef leadRolePathRef = (LeadRolePathRef)theEObject;
				T result = caseLeadRolePathRef(leadRolePathRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.LEAD_ROLE_PATH_TYPE: {
				LeadRolePathType leadRolePathType = (LeadRolePathType)theEObject;
				T result = caseLeadRolePathType(leadRolePathType);
				if (result == null) result = caseRolePathType(leadRolePathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MANDATORY_CONSTRAINT_REF: {
				MandatoryConstraintRef mandatoryConstraintRef = (MandatoryConstraintRef)theEObject;
				T result = caseMandatoryConstraintRef(mandatoryConstraintRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MANDATORY_CONSTRAINT_TYPE: {
				MandatoryConstraintType mandatoryConstraintType = (MandatoryConstraintType)theEObject;
				T result = caseMandatoryConstraintType(mandatoryConstraintType);
				if (result == null) result = caseSetConstraintType(mandatoryConstraintType);
				if (result == null) result = caseConstraintType(mandatoryConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MAX_VALUE_MISMATCH_ERROR_TYPE: {
				MaxValueMismatchErrorType maxValueMismatchErrorType = (MaxValueMismatchErrorType)theEObject;
				T result = caseMaxValueMismatchErrorType(maxValueMismatchErrorType);
				if (result == null) result = caseModelError(maxValueMismatchErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MIN_VALUE_MISMATCH_ERROR_TYPE: {
				MinValueMismatchErrorType minValueMismatchErrorType = (MinValueMismatchErrorType)theEObject;
				T result = caseMinValueMismatchErrorType(minValueMismatchErrorType);
				if (result == null) result = caseModelError(minValueMismatchErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MODEL_ERROR: {
				ModelError modelError = (ModelError)theEObject;
				T result = caseModelError(modelError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MODEL_ERROR_DISPLAY_FILTER_TYPE: {
				ModelErrorDisplayFilterType modelErrorDisplayFilterType = (ModelErrorDisplayFilterType)theEObject;
				T result = caseModelErrorDisplayFilterType(modelErrorDisplayFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MODEL_ERRORS_TYPE: {
				ModelErrorsType modelErrorsType = (ModelErrorsType)theEObject;
				T result = caseModelErrorsType(modelErrorsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE: {
				ModelNoteReferencedByType modelNoteReferencedByType = (ModelNoteReferencedByType)theEObject;
				T result = caseModelNoteReferencedByType(modelNoteReferencedByType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MODEL_NOTES_TYPE: {
				ModelNotesType modelNotesType = (ModelNotesType)theEObject;
				T result = caseModelNotesType(modelNotesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MODEL_NOTE_TYPE: {
				ModelNoteType modelNoteType = (ModelNoteType)theEObject;
				T result = caseModelNoteType(modelNoteType);
				if (result == null) result = caseNoteType(modelNoteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MONEY_NUMERIC_DATA_TYPE_TYPE: {
				MoneyNumericDataTypeType moneyNumericDataTypeType = (MoneyNumericDataTypeType)theEObject;
				T result = caseMoneyNumericDataTypeType(moneyNumericDataTypeType);
				if (result == null) result = caseDataType(moneyNumericDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NAME_GENERATOR_TYPE: {
				NameGeneratorType nameGeneratorType = (NameGeneratorType)theEObject;
				T result = caseNameGeneratorType(nameGeneratorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NESTED_GROUPS_TYPE: {
				NestedGroupsType nestedGroupsType = (NestedGroupsType)theEObject;
				T result = caseNestedGroupsType(nestedGroupsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NMINUS_ONE_ERROR_TYPE: {
				NMinusOneErrorType nMinusOneErrorType = (NMinusOneErrorType)theEObject;
				T result = caseNMinusOneErrorType(nMinusOneErrorType);
				if (result == null) result = caseModelError(nMinusOneErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NOTES_TYPE: {
				NotesType notesType = (NotesType)theEObject;
				T result = caseNotesType(notesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NOTE_TYPE: {
				NoteType noteType = (NoteType)theEObject;
				T result = caseNoteType(noteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NOT_WELL_MODELED_SUBSET_AND_MANDATORY_ERROR_TYPE: {
				NotWellModeledSubsetAndMandatoryErrorType notWellModeledSubsetAndMandatoryErrorType = (NotWellModeledSubsetAndMandatoryErrorType)theEObject;
				T result = caseNotWellModeledSubsetAndMandatoryErrorType(notWellModeledSubsetAndMandatoryErrorType);
				if (result == null) result = caseModelError(notWellModeledSubsetAndMandatoryErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECT_ID_OTHER_DATA_TYPE_TYPE: {
				ObjectIdOtherDataTypeType objectIdOtherDataTypeType = (ObjectIdOtherDataTypeType)theEObject;
				T result = caseObjectIdOtherDataTypeType(objectIdOtherDataTypeType);
				if (result == null) result = caseDataType(objectIdOtherDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECTIFICATION_REF: {
				ObjectificationRef objectificationRef = (ObjectificationRef)theEObject;
				T result = caseObjectificationRef(objectificationRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECTIFIED_FACT_TYPE_REF: {
				ObjectifiedFactTypeRef objectifiedFactTypeRef = (ObjectifiedFactTypeRef)theEObject;
				T result = caseObjectifiedFactTypeRef(objectifiedFactTypeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE: {
				ObjectifiedInstanceRequiredErrorType objectifiedInstanceRequiredErrorType = (ObjectifiedInstanceRequiredErrorType)theEObject;
				T result = caseObjectifiedInstanceRequiredErrorType(objectifiedInstanceRequiredErrorType);
				if (result == null) result = caseModelError(objectifiedInstanceRequiredErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECTIFIED_TYPE_TYPE: {
				ObjectifiedTypeType objectifiedTypeType = (ObjectifiedTypeType)theEObject;
				T result = caseObjectifiedTypeType(objectifiedTypeType);
				if (result == null) result = caseObjectTypeType(objectifiedTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE: {
				ObjectifiedUnaryRoleType objectifiedUnaryRoleType = (ObjectifiedUnaryRoleType)theEObject;
				T result = caseObjectifiedUnaryRoleType(objectifiedUnaryRoleType);
				if (result == null) result = caseRoleBaseType(objectifiedUnaryRoleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECTIFYING_INSTANCE_REQUIRED_ERROR_TYPE: {
				ObjectifyingInstanceRequiredErrorType objectifyingInstanceRequiredErrorType = (ObjectifyingInstanceRequiredErrorType)theEObject;
				T result = caseObjectifyingInstanceRequiredErrorType(objectifyingInstanceRequiredErrorType);
				if (result == null) result = caseModelError(objectifyingInstanceRequiredErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECTS_TYPE: {
				ObjectsType objectsType = (ObjectsType)theEObject;
				T result = caseObjectsType(objectsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECT_TYPE_CARDINALITY_RESTRICTION_TYPE: {
				ObjectTypeCardinalityRestrictionType objectTypeCardinalityRestrictionType = (ObjectTypeCardinalityRestrictionType)theEObject;
				T result = caseObjectTypeCardinalityRestrictionType(objectTypeCardinalityRestrictionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECT_TYPE_DUPLICATE_NAME_ERROR_TYPE: {
				ObjectTypeDuplicateNameErrorType objectTypeDuplicateNameErrorType = (ObjectTypeDuplicateNameErrorType)theEObject;
				T result = caseObjectTypeDuplicateNameErrorType(objectTypeDuplicateNameErrorType);
				if (result == null) result = caseModelError(objectTypeDuplicateNameErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECT_TYPE_INSTANCE_REF: {
				ObjectTypeInstanceRef objectTypeInstanceRef = (ObjectTypeInstanceRef)theEObject;
				T result = caseObjectTypeInstanceRef(objectTypeInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECT_TYPE_REF: {
				ObjectTypeRef objectTypeRef = (ObjectTypeRef)theEObject;
				T result = caseObjectTypeRef(objectTypeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECT_TYPE_REQUIRES_PRIMARY_SUPERTYPE_ERROR_TYPE: {
				ObjectTypeRequiresPrimarySupertypeErrorType objectTypeRequiresPrimarySupertypeErrorType = (ObjectTypeRequiresPrimarySupertypeErrorType)theEObject;
				T result = caseObjectTypeRequiresPrimarySupertypeErrorType(objectTypeRequiresPrimarySupertypeErrorType);
				if (result == null) result = caseModelError(objectTypeRequiresPrimarySupertypeErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECT_TYPE_ROLE_INSTANCE_REF: {
				ObjectTypeRoleInstanceRef objectTypeRoleInstanceRef = (ObjectTypeRoleInstanceRef)theEObject;
				T result = caseObjectTypeRoleInstanceRef(objectTypeRoleInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECT_TYPES_TYPE: {
				ObjectTypesType objectTypesType = (ObjectTypesType)theEObject;
				T result = caseObjectTypesType(objectTypesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECT_TYPE_TYPE: {
				ObjectTypeType objectTypeType = (ObjectTypeType)theEObject;
				T result = caseObjectTypeType(objectTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECT_UNIFIER_REF: {
				ObjectUnifierRef objectUnifierRef = (ObjectUnifierRef)theEObject;
				T result = caseObjectUnifierRef(objectUnifierRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECT_UNIFIER_REQUIRES_COMPATIBLE_OBJECT_TYPES_ERROR_TYPE: {
				ObjectUnifierRequiresCompatibleObjectTypesErrorType objectUnifierRequiresCompatibleObjectTypesErrorType = (ObjectUnifierRequiresCompatibleObjectTypesErrorType)theEObject;
				T result = caseObjectUnifierRequiresCompatibleObjectTypesErrorType(objectUnifierRequiresCompatibleObjectTypesErrorType);
				if (result == null) result = caseModelError(objectUnifierRequiresCompatibleObjectTypesErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECT_UNIFIERS_TYPE: {
				ObjectUnifiersType objectUnifiersType = (ObjectUnifiersType)theEObject;
				T result = caseObjectUnifiersType(objectUnifiersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OBJECT_UNIFIER_TYPE: {
				ObjectUnifierType objectUnifierType = (ObjectUnifierType)theEObject;
				T result = caseObjectUnifierType(objectUnifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OLE_OBJECT_RAW_DATA_DATA_TYPE_TYPE: {
				OleObjectRawDataDataTypeType oleObjectRawDataDataTypeType = (OleObjectRawDataDataTypeType)theEObject;
				T result = caseOleObjectRawDataDataTypeType(oleObjectRawDataDataTypeType);
				if (result == null) result = caseDataType(oleObjectRawDataDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ORM_MODEL_REF: {
				ORMModelRef ormModelRef = (ORMModelRef)theEObject;
				T result = caseORMModelRef(ormModelRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ORM_MODEL_TYPE: {
				ORMModelType ormModelType = (ORMModelType)theEObject;
				T result = caseORMModelType(ormModelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PARAMETERS_TYPE: {
				ParametersType parametersType = (ParametersType)theEObject;
				T result = caseParametersType(parametersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PARTIAL_FACT_TYPE_DERIVATION_PROJECTION_ERROR_TYPE: {
				PartialFactTypeDerivationProjectionErrorType partialFactTypeDerivationProjectionErrorType = (PartialFactTypeDerivationProjectionErrorType)theEObject;
				T result = casePartialFactTypeDerivationProjectionErrorType(partialFactTypeDerivationProjectionErrorType);
				if (result == null) result = caseModelError(partialFactTypeDerivationProjectionErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PARTIAL_JOIN_PATH_PROJECTION_ERROR_TYPE: {
				PartialJoinPathProjectionErrorType partialJoinPathProjectionErrorType = (PartialJoinPathProjectionErrorType)theEObject;
				T result = casePartialJoinPathProjectionErrorType(partialJoinPathProjectionErrorType);
				if (result == null) result = caseModelError(partialJoinPathProjectionErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PARTIAL_QUERY_DERIVATION_PROJECTION_ERROR_TYPE: {
				PartialQueryDerivationProjectionErrorType partialQueryDerivationProjectionErrorType = (PartialQueryDerivationProjectionErrorType)theEObject;
				T result = casePartialQueryDerivationProjectionErrorType(partialQueryDerivationProjectionErrorType);
				if (result == null) result = caseModelError(partialQueryDerivationProjectionErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PATH_COMPONENTS_TYPE: {
				PathComponentsType pathComponentsType = (PathComponentsType)theEObject;
				T result = casePathComponentsType(pathComponentsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PATH_COMPONENT_TYPE: {
				PathComponentType pathComponentType = (PathComponentType)theEObject;
				T result = casePathComponentType(pathComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PATH_CONDITION_ROLE_VALUE_RESTRICTION_TYPE: {
				PathConditionRoleValueRestrictionType pathConditionRoleValueRestrictionType = (PathConditionRoleValueRestrictionType)theEObject;
				T result = casePathConditionRoleValueRestrictionType(pathConditionRoleValueRestrictionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PATH_CONDITION_ROOT_VALUE_RESTRICTION_TYPE: {
				PathConditionRootValueRestrictionType pathConditionRootValueRestrictionType = (PathConditionRootValueRestrictionType)theEObject;
				T result = casePathConditionRootValueRestrictionType(pathConditionRootValueRestrictionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PATH_CONSTANT_TYPE: {
				PathConstantType pathConstantType = (PathConstantType)theEObject;
				T result = casePathConstantType(pathConstantType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PATHED_ROLE_REF: {
				PathedRoleRef pathedRoleRef = (PathedRoleRef)theEObject;
				T result = casePathedRoleRef(pathedRoleRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PATHED_ROLES_TYPE: {
				PathedRolesType pathedRolesType = (PathedRolesType)theEObject;
				T result = casePathedRolesType(pathedRolesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PATHED_ROLE_TYPE: {
				PathedRoleType pathedRoleType = (PathedRoleType)theEObject;
				T result = casePathedRoleType(pathedRoleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PATH_OUTER_JOIN_REQUIRES_OPTIONAL_ROLE_ERROR_TYPE: {
				PathOuterJoinRequiresOptionalRoleErrorType pathOuterJoinRequiresOptionalRoleErrorType = (PathOuterJoinRequiresOptionalRoleErrorType)theEObject;
				T result = casePathOuterJoinRequiresOptionalRoleErrorType(pathOuterJoinRequiresOptionalRoleErrorType);
				if (result == null) result = caseModelError(pathOuterJoinRequiresOptionalRoleErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE: {
				PathRequiresRootObjectTypeErrorType pathRequiresRootObjectTypeErrorType = (PathRequiresRootObjectTypeErrorType)theEObject;
				T result = casePathRequiresRootObjectTypeErrorType(pathRequiresRootObjectTypeErrorType);
				if (result == null) result = caseModelError(pathRequiresRootObjectTypeErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PATH_SAME_FACT_TYPE_ROLE_FOLLOWS_JOIN_ERROR_TYPE: {
				PathSameFactTypeRoleFollowsJoinErrorType pathSameFactTypeRoleFollowsJoinErrorType = (PathSameFactTypeRoleFollowsJoinErrorType)theEObject;
				T result = casePathSameFactTypeRoleFollowsJoinErrorType(pathSameFactTypeRoleFollowsJoinErrorType);
				if (result == null) result = caseModelError(pathSameFactTypeRoleFollowsJoinErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PATH_START_ROLE_FOLLOWS_ROOT_OBJECT_TYPE_ERROR_TYPE: {
				PathStartRoleFollowsRootObjectTypeErrorType pathStartRoleFollowsRootObjectTypeErrorType = (PathStartRoleFollowsRootObjectTypeErrorType)theEObject;
				T result = casePathStartRoleFollowsRootObjectTypeErrorType(pathStartRoleFollowsRootObjectTypeErrorType);
				if (result == null) result = caseModelError(pathStartRoleFollowsRootObjectTypeErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PICTURE_RAW_DATA_DATA_TYPE_TYPE: {
				PictureRawDataDataTypeType pictureRawDataDataTypeType = (PictureRawDataDataTypeType)theEObject;
				T result = casePictureRawDataDataTypeType(pictureRawDataDataTypeType);
				if (result == null) result = caseDataType(pictureRawDataDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PLAYED_ROLES_TYPE: {
				PlayedRolesType playedRolesType = (PlayedRolesType)theEObject;
				T result = casePlayedRolesType(playedRolesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.POPULATION_MANDATORY_ERROR_TYPE: {
				PopulationMandatoryErrorType populationMandatoryErrorType = (PopulationMandatoryErrorType)theEObject;
				T result = casePopulationMandatoryErrorType(populationMandatoryErrorType);
				if (result == null) result = caseModelError(populationMandatoryErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.POPULATION_UNIQUENESS_ERROR_TYPE: {
				PopulationUniquenessErrorType populationUniquenessErrorType = (PopulationUniquenessErrorType)theEObject;
				T result = casePopulationUniquenessErrorType(populationUniquenessErrorType);
				if (result == null) result = caseModelError(populationUniquenessErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PREFERRED_IDENTIFIER_REQUIRES_MANDATORY_ERROR_TYPE: {
				PreferredIdentifierRequiresMandatoryErrorType preferredIdentifierRequiresMandatoryErrorType = (PreferredIdentifierRequiresMandatoryErrorType)theEObject;
				T result = casePreferredIdentifierRequiresMandatoryErrorType(preferredIdentifierRequiresMandatoryErrorType);
				if (result == null) result = caseModelError(preferredIdentifierRequiresMandatoryErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PROJECTED_FROM_TYPE: {
				ProjectedFromType projectedFromType = (ProjectedFromType)theEObject;
				T result = caseProjectedFromType(projectedFromType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PROJECTED_FROM_TYPE1: {
				ProjectedFromType1 projectedFromType1 = (ProjectedFromType1)theEObject;
				T result = caseProjectedFromType1(projectedFromType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.QUERY_DERIVATION_PATH_REF: {
				QueryDerivationPathRef queryDerivationPathRef = (QueryDerivationPathRef)theEObject;
				T result = caseQueryDerivationPathRef(queryDerivationPathRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.QUERY_DERIVATION_PATH_TYPE: {
				QueryDerivationPathType queryDerivationPathType = (QueryDerivationPathType)theEObject;
				T result = caseQueryDerivationPathType(queryDerivationPathType);
				if (result == null) result = caseRolePathOwnerType(queryDerivationPathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.QUERY_DERIVATION_REQUIRES_PROJECTION_ERROR_TYPE: {
				QueryDerivationRequiresProjectionErrorType queryDerivationRequiresProjectionErrorType = (QueryDerivationRequiresProjectionErrorType)theEObject;
				T result = caseQueryDerivationRequiresProjectionErrorType(queryDerivationRequiresProjectionErrorType);
				if (result == null) result = caseModelError(queryDerivationRequiresProjectionErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.QUERY_DERIVATION_RULE_TYPE: {
				QueryDerivationRuleType queryDerivationRuleType = (QueryDerivationRuleType)theEObject;
				T result = caseQueryDerivationRuleType(queryDerivationRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.QUERY_PARAMETER_BINDINGS_TYPE: {
				QueryParameterBindingsType queryParameterBindingsType = (QueryParameterBindingsType)theEObject;
				T result = caseQueryParameterBindingsType(queryParameterBindingsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.QUERY_PARAMETER_BINDING_TYPE: {
				QueryParameterBindingType queryParameterBindingType = (QueryParameterBindingType)theEObject;
				T result = caseQueryParameterBindingType(queryParameterBindingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.QUERY_PARAMETERS_TYPE: {
				QueryParametersType queryParametersType = (QueryParametersType)theEObject;
				T result = caseQueryParametersType(queryParametersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.QUERY_PARAMETER_TYPE: {
				QueryParameterType queryParameterType = (QueryParameterType)theEObject;
				T result = caseQueryParameterType(queryParameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.QUERY_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE: {
				QueryRoleProjectionCompatibilityErrorType queryRoleProjectionCompatibilityErrorType = (QueryRoleProjectionCompatibilityErrorType)theEObject;
				T result = caseQueryRoleProjectionCompatibilityErrorType(queryRoleProjectionCompatibilityErrorType);
				if (result == null) result = caseModelError(queryRoleProjectionCompatibilityErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.QUERY_TYPE: {
				QueryType queryType = (QueryType)theEObject;
				T result = caseQueryType(queryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.READING_ORDERS_TYPE: {
				ReadingOrdersType readingOrdersType = (ReadingOrdersType)theEObject;
				T result = caseReadingOrdersType(readingOrdersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.READING_ORDER_TYPE: {
				ReadingOrderType readingOrderType = (ReadingOrderType)theEObject;
				T result = caseReadingOrderType(readingOrderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.READING_REF: {
				ReadingRef readingRef = (ReadingRef)theEObject;
				T result = caseReadingRef(readingRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.READING_REQUIRES_USER_MODIFICATION_ERROR_TYPE: {
				ReadingRequiresUserModificationErrorType readingRequiresUserModificationErrorType = (ReadingRequiresUserModificationErrorType)theEObject;
				T result = caseReadingRequiresUserModificationErrorType(readingRequiresUserModificationErrorType);
				if (result == null) result = caseModelError(readingRequiresUserModificationErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.READING_ROLE_SEQUENCE_TYPE: {
				ReadingRoleSequenceType readingRoleSequenceType = (ReadingRoleSequenceType)theEObject;
				T result = caseReadingRoleSequenceType(readingRoleSequenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.READINGS_TYPE: {
				ReadingsType readingsType = (ReadingsType)theEObject;
				T result = caseReadingsType(readingsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.READINGS_TYPE1: {
				ReadingsType1 readingsType1 = (ReadingsType1)theEObject;
				T result = caseReadingsType1(readingsType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.READING_TYPE: {
				ReadingType readingType = (ReadingType)theEObject;
				T result = caseReadingType(readingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RECOGNIZED_PHRASE_DUPLICATE_NAME_ERROR_TYPE: {
				RecognizedPhraseDuplicateNameErrorType recognizedPhraseDuplicateNameErrorType = (RecognizedPhraseDuplicateNameErrorType)theEObject;
				T result = caseRecognizedPhraseDuplicateNameErrorType(recognizedPhraseDuplicateNameErrorType);
				if (result == null) result = caseModelError(recognizedPhraseDuplicateNameErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RECOGNIZED_PHRASE_REF: {
				RecognizedPhraseRef recognizedPhraseRef = (RecognizedPhraseRef)theEObject;
				T result = caseRecognizedPhraseRef(recognizedPhraseRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RECOGNIZED_PHRASES_TYPE: {
				RecognizedPhrasesType recognizedPhrasesType = (RecognizedPhrasesType)theEObject;
				T result = caseRecognizedPhrasesType(recognizedPhrasesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RECOGNIZED_PHRASES_TYPE1: {
				RecognizedPhrasesType1 recognizedPhrasesType1 = (RecognizedPhrasesType1)theEObject;
				T result = caseRecognizedPhrasesType1(recognizedPhrasesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RECOGNIZED_PHRASE_TYPE: {
				RecognizedPhraseType recognizedPhraseType = (RecognizedPhraseType)theEObject;
				T result = caseRecognizedPhraseType(recognizedPhraseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REFERENCE_MODE_KIND_REF: {
				ReferenceModeKindRef referenceModeKindRef = (ReferenceModeKindRef)theEObject;
				T result = caseReferenceModeKindRef(referenceModeKindRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REFERENCE_MODE_KINDS_TYPE: {
				ReferenceModeKindsType referenceModeKindsType = (ReferenceModeKindsType)theEObject;
				T result = caseReferenceModeKindsType(referenceModeKindsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REFERENCE_MODE_KIND_TYPE: {
				ReferenceModeKindType referenceModeKindType = (ReferenceModeKindType)theEObject;
				T result = caseReferenceModeKindType(referenceModeKindType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REFINEMENTS_TYPE: {
				RefinementsType refinementsType = (RefinementsType)theEObject;
				T result = caseRefinementsType(refinementsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RING_CONSTRAINT_REF: {
				RingConstraintRef ringConstraintRef = (RingConstraintRef)theEObject;
				T result = caseRingConstraintRef(ringConstraintRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RING_CONSTRAINT_TYPE: {
				RingConstraintType ringConstraintType = (RingConstraintType)theEObject;
				T result = caseRingConstraintType(ringConstraintType);
				if (result == null) result = caseSetConstraintWithJoinType(ringConstraintType);
				if (result == null) result = caseConstraintType(ringConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RING_CONSTRAINT_TYPE_NOT_SPECIFIED_ERROR_TYPE: {
				RingConstraintTypeNotSpecifiedErrorType ringConstraintTypeNotSpecifiedErrorType = (RingConstraintTypeNotSpecifiedErrorType)theEObject;
				T result = caseRingConstraintTypeNotSpecifiedErrorType(ringConstraintTypeNotSpecifiedErrorType);
				if (result == null) result = caseModelError(ringConstraintTypeNotSpecifiedErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROLE_BASED_DERIVATION_PROJECTION_TYPE: {
				RoleBasedDerivationProjectionType roleBasedDerivationProjectionType = (RoleBasedDerivationProjectionType)theEObject;
				T result = caseRoleBasedDerivationProjectionType(roleBasedDerivationProjectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROLE_BASE_TYPE: {
				RoleBaseType roleBaseType = (RoleBaseType)theEObject;
				T result = caseRoleBaseType(roleBaseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROLE_INSTANCES_TYPE: {
				RoleInstancesType roleInstancesType = (RoleInstancesType)theEObject;
				T result = caseRoleInstancesType(roleInstancesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROLE_INSTANCES_TYPE1: {
				RoleInstancesType1 roleInstancesType1 = (RoleInstancesType1)theEObject;
				T result = caseRoleInstancesType1(roleInstancesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROLE_INSTANCE_TYPE: {
				RoleInstanceType roleInstanceType = (RoleInstanceType)theEObject;
				T result = caseRoleInstanceType(roleInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROLE_PATH_OWNER_TYPE: {
				RolePathOwnerType rolePathOwnerType = (RolePathOwnerType)theEObject;
				T result = caseRolePathOwnerType(rolePathOwnerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROLE_PATH_TYPE: {
				RolePathType rolePathType = (RolePathType)theEObject;
				T result = caseRolePathType(rolePathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROLE_PLAYER_REQUIRED_ERROR_TYPE: {
				RolePlayerRequiredErrorType rolePlayerRequiredErrorType = (RolePlayerRequiredErrorType)theEObject;
				T result = caseRolePlayerRequiredErrorType(rolePlayerRequiredErrorType);
				if (result == null) result = caseModelError(rolePlayerRequiredErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROLE_PROXY_TYPE: {
				RoleProxyType roleProxyType = (RoleProxyType)theEObject;
				T result = caseRoleProxyType(roleProxyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROLE_REF: {
				RoleRef roleRef = (RoleRef)theEObject;
				T result = caseRoleRef(roleRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROLE_SEQUENCE_ROLE_REF: {
				RoleSequenceRoleRef roleSequenceRoleRef = (RoleSequenceRoleRef)theEObject;
				T result = caseRoleSequenceRoleRef(roleSequenceRoleRef);
				if (result == null) result = caseRoleRef(roleSequenceRoleRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROLE_SEQUENCE_WITH_PROJECTION_ROLE_REF: {
				RoleSequenceWithProjectionRoleRef roleSequenceWithProjectionRoleRef = (RoleSequenceWithProjectionRoleRef)theEObject;
				T result = caseRoleSequenceWithProjectionRoleRef(roleSequenceWithProjectionRoleRef);
				if (result == null) result = caseRoleSequenceRoleRef(roleSequenceWithProjectionRoleRef);
				if (result == null) result = caseRoleRef(roleSequenceWithProjectionRoleRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROLE_SUB_PATH_REF: {
				RoleSubPathRef roleSubPathRef = (RoleSubPathRef)theEObject;
				T result = caseRoleSubPathRef(roleSubPathRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROLE_SUB_PATH_TYPE: {
				RoleSubPathType roleSubPathType = (RoleSubPathType)theEObject;
				T result = caseRoleSubPathType(roleSubPathType);
				if (result == null) result = caseRolePathType(roleSubPathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROLE_TEXT_TYPE: {
				RoleTextType roleTextType = (RoleTextType)theEObject;
				T result = caseRoleTextType(roleTextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROLE_TYPE: {
				RoleType roleType = (RoleType)theEObject;
				T result = caseRoleType(roleType);
				if (result == null) result = caseRoleBaseType(roleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROLE_VALUE_RESTRICTION_TYPE: {
				RoleValueRestrictionType roleValueRestrictionType = (RoleValueRestrictionType)theEObject;
				T result = caseRoleValueRestrictionType(roleValueRestrictionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROOT_OBJECT_TYPE_REF: {
				RootObjectTypeRef rootObjectTypeRef = (RootObjectTypeRef)theEObject;
				T result = caseRootObjectTypeRef(rootObjectTypeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROOT_OBJECT_TYPE_TYPE: {
				RootObjectTypeType rootObjectTypeType = (RootObjectTypeType)theEObject;
				T result = caseRootObjectTypeType(rootObjectTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROW_ID_OTHER_DATA_TYPE_TYPE: {
				RowIdOtherDataTypeType rowIdOtherDataTypeType = (RowIdOtherDataTypeType)theEObject;
				T result = caseRowIdOtherDataTypeType(rowIdOtherDataTypeType);
				if (result == null) result = caseDataType(rowIdOtherDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SET_COMPARISON_CONSTRAINT_REF: {
				SetComparisonConstraintRef setComparisonConstraintRef = (SetComparisonConstraintRef)theEObject;
				T result = caseSetComparisonConstraintRef(setComparisonConstraintRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SET_COMPARISON_CONSTRAINT_TYPE: {
				SetComparisonConstraintType setComparisonConstraintType = (SetComparisonConstraintType)theEObject;
				T result = caseSetComparisonConstraintType(setComparisonConstraintType);
				if (result == null) result = caseConstraintType(setComparisonConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SET_CONSTRAINT_REF: {
				SetConstraintRef setConstraintRef = (SetConstraintRef)theEObject;
				T result = caseSetConstraintRef(setConstraintRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SET_CONSTRAINT_TYPE: {
				SetConstraintType setConstraintType = (SetConstraintType)theEObject;
				T result = caseSetConstraintType(setConstraintType);
				if (result == null) result = caseConstraintType(setConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SET_CONSTRAINT_WITH_JOIN_TYPE: {
				SetConstraintWithJoinType setConstraintWithJoinType = (SetConstraintWithJoinType)theEObject;
				T result = caseSetConstraintWithJoinType(setConstraintWithJoinType);
				if (result == null) result = caseConstraintType(setConstraintWithJoinType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SIGNED_INTEGER_NUMERIC_DATA_TYPE_TYPE: {
				SignedIntegerNumericDataTypeType signedIntegerNumericDataTypeType = (SignedIntegerNumericDataTypeType)theEObject;
				T result = caseSignedIntegerNumericDataTypeType(signedIntegerNumericDataTypeType);
				if (result == null) result = caseDataType(signedIntegerNumericDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SIGNED_LARGE_INTEGER_NUMERIC_DATA_TYPE_TYPE: {
				SignedLargeIntegerNumericDataTypeType signedLargeIntegerNumericDataTypeType = (SignedLargeIntegerNumericDataTypeType)theEObject;
				T result = caseSignedLargeIntegerNumericDataTypeType(signedLargeIntegerNumericDataTypeType);
				if (result == null) result = caseDataType(signedLargeIntegerNumericDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SIGNED_SMALL_INTEGER_NUMERIC_DATA_TYPE_TYPE: {
				SignedSmallIntegerNumericDataTypeType signedSmallIntegerNumericDataTypeType = (SignedSmallIntegerNumericDataTypeType)theEObject;
				T result = caseSignedSmallIntegerNumericDataTypeType(signedSmallIntegerNumericDataTypeType);
				if (result == null) result = caseDataType(signedSmallIntegerNumericDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SINGLE_PRECISION_FLOATING_POINT_NUMERIC_DATA_TYPE_TYPE: {
				SinglePrecisionFloatingPointNumericDataTypeType singlePrecisionFloatingPointNumericDataTypeType = (SinglePrecisionFloatingPointNumericDataTypeType)theEObject;
				T result = caseSinglePrecisionFloatingPointNumericDataTypeType(singlePrecisionFloatingPointNumericDataTypeType);
				if (result == null) result = caseDataType(singlePrecisionFloatingPointNumericDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SOURCE_TYPE: {
				SourceType sourceType = (SourceType)theEObject;
				T result = caseSourceType(sourceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUB_PATHS_TYPE: {
				SubPathsType subPathsType = (SubPathsType)theEObject;
				T result = caseSubPathsType(subPathsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUBQUERIES_TYPE: {
				SubqueriesType subqueriesType = (SubqueriesType)theEObject;
				T result = caseSubqueriesType(subqueriesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUBQUERY_PARAMETER_INPUTS_FOR_TYPE: {
				SubqueryParameterInputsForType subqueryParameterInputsForType = (SubqueryParameterInputsForType)theEObject;
				T result = caseSubqueryParameterInputsForType(subqueryParameterInputsForType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUBQUERY_PARAMETER_INPUTS_TYPE: {
				SubqueryParameterInputsType subqueryParameterInputsType = (SubqueryParameterInputsType)theEObject;
				T result = caseSubqueryParameterInputsType(subqueryParameterInputsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE: {
				SubqueryParameterInputType subqueryParameterInputType = (SubqueryParameterInputType)theEObject;
				T result = caseSubqueryParameterInputType(subqueryParameterInputType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUBQUERY_REF: {
				SubqueryRef subqueryRef = (SubqueryRef)theEObject;
				T result = caseSubqueryRef(subqueryRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUBSET_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE: {
				SubsetConstraintImpliedByMandatoryConstraintsErrorType subsetConstraintImpliedByMandatoryConstraintsErrorType = (SubsetConstraintImpliedByMandatoryConstraintsErrorType)theEObject;
				T result = caseSubsetConstraintImpliedByMandatoryConstraintsErrorType(subsetConstraintImpliedByMandatoryConstraintsErrorType);
				if (result == null) result = caseModelError(subsetConstraintImpliedByMandatoryConstraintsErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUBSET_CONSTRAINT_REF: {
				SubsetConstraintRef subsetConstraintRef = (SubsetConstraintRef)theEObject;
				T result = caseSubsetConstraintRef(subsetConstraintRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUBSET_CONSTRAINT_TYPE: {
				SubsetConstraintType subsetConstraintType = (SubsetConstraintType)theEObject;
				T result = caseSubsetConstraintType(subsetConstraintType);
				if (result == null) result = caseSetComparisonConstraintType(subsetConstraintType);
				if (result == null) result = caseConstraintType(subsetConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE: {
				SubtypeDerivationPathType subtypeDerivationPathType = (SubtypeDerivationPathType)theEObject;
				T result = caseSubtypeDerivationPathType(subtypeDerivationPathType);
				if (result == null) result = caseRolePathOwnerType(subtypeDerivationPathType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUBTYPE_DERIVATION_RULE_TYPE: {
				SubtypeDerivationRuleType subtypeDerivationRuleType = (SubtypeDerivationRuleType)theEObject;
				T result = caseSubtypeDerivationRuleType(subtypeDerivationRuleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUBTYPE_FACT_TYPE_TYPE: {
				SubtypeFactTypeType subtypeFactTypeType = (SubtypeFactTypeType)theEObject;
				T result = caseSubtypeFactTypeType(subtypeFactTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUBTYPE_ROLES_TYPE: {
				SubtypeRolesType subtypeRolesType = (SubtypeRolesType)theEObject;
				T result = caseSubtypeRolesType(subtypeRolesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SUPERSET_ROLE_OF_SUBTYPE_SUBSET_CONSTRAINT_NOT_SUBTYPE_ERROR_TYPE: {
				SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType supersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType = (SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType)theEObject;
				T result = caseSupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType(supersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType);
				if (result == null) result = caseModelError(supersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TIME_TEMPORAL_DATA_TYPE_TYPE: {
				TimeTemporalDataTypeType timeTemporalDataTypeType = (TimeTemporalDataTypeType)theEObject;
				T result = caseTimeTemporalDataTypeType(timeTemporalDataTypeType);
				if (result == null) result = caseDataType(timeTemporalDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TOO_FEW_ENTITY_TYPE_ROLE_INSTANCES_ERROR_TYPE: {
				TooFewEntityTypeRoleInstancesErrorType tooFewEntityTypeRoleInstancesErrorType = (TooFewEntityTypeRoleInstancesErrorType)theEObject;
				T result = caseTooFewEntityTypeRoleInstancesErrorType(tooFewEntityTypeRoleInstancesErrorType);
				if (result == null) result = caseModelError(tooFewEntityTypeRoleInstancesErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TOO_FEW_FACT_TYPE_ROLE_INSTANCES_ERROR_TYPE: {
				TooFewFactTypeRoleInstancesErrorType tooFewFactTypeRoleInstancesErrorType = (TooFewFactTypeRoleInstancesErrorType)theEObject;
				T result = caseTooFewFactTypeRoleInstancesErrorType(tooFewFactTypeRoleInstancesErrorType);
				if (result == null) result = caseModelError(tooFewFactTypeRoleInstancesErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TOO_FEW_READING_ROLES_ERROR_TYPE: {
				TooFewReadingRolesErrorType tooFewReadingRolesErrorType = (TooFewReadingRolesErrorType)theEObject;
				T result = caseTooFewReadingRolesErrorType(tooFewReadingRolesErrorType);
				if (result == null) result = caseModelError(tooFewReadingRolesErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TOO_FEW_ROLE_SEQUENCES_ERROR_TYPE: {
				TooFewRoleSequencesErrorType tooFewRoleSequencesErrorType = (TooFewRoleSequencesErrorType)theEObject;
				T result = caseTooFewRoleSequencesErrorType(tooFewRoleSequencesErrorType);
				if (result == null) result = caseModelError(tooFewRoleSequencesErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TOO_MANY_READING_ROLES_ERROR_TYPE: {
				TooManyReadingRolesErrorType tooManyReadingRolesErrorType = (TooManyReadingRolesErrorType)theEObject;
				T result = caseTooManyReadingRolesErrorType(tooManyReadingRolesErrorType);
				if (result == null) result = caseModelError(tooManyReadingRolesErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE: {
				TooManyRoleSequencesErrorType tooManyRoleSequencesErrorType = (TooManyRoleSequencesErrorType)theEObject;
				T result = caseTooManyRoleSequencesErrorType(tooManyRoleSequencesErrorType);
				if (result == null) result = caseModelError(tooManyRoleSequencesErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRUE_OR_FALSE_LOGICAL_DATA_TYPE_TYPE: {
				TrueOrFalseLogicalDataTypeType trueOrFalseLogicalDataTypeType = (TrueOrFalseLogicalDataTypeType)theEObject;
				T result = caseTrueOrFalseLogicalDataTypeType(trueOrFalseLogicalDataTypeType);
				if (result == null) result = caseDataType(trueOrFalseLogicalDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UNARY_ROLE_CARDINALITY_RESTRICTION_TYPE: {
				UnaryRoleCardinalityRestrictionType unaryRoleCardinalityRestrictionType = (UnaryRoleCardinalityRestrictionType)theEObject;
				T result = caseUnaryRoleCardinalityRestrictionType(unaryRoleCardinalityRestrictionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UNIQUENESS_CONSTRAINT_REF: {
				UniquenessConstraintRef uniquenessConstraintRef = (UniquenessConstraintRef)theEObject;
				T result = caseUniquenessConstraintRef(uniquenessConstraintRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UNIQUENESS_CONSTRAINT_TYPE: {
				UniquenessConstraintType uniquenessConstraintType = (UniquenessConstraintType)theEObject;
				T result = caseUniquenessConstraintType(uniquenessConstraintType);
				if (result == null) result = caseSetConstraintWithJoinType(uniquenessConstraintType);
				if (result == null) result = caseConstraintType(uniquenessConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UNSIGNED_INTEGER_NUMERIC_DATA_TYPE_TYPE: {
				UnsignedIntegerNumericDataTypeType unsignedIntegerNumericDataTypeType = (UnsignedIntegerNumericDataTypeType)theEObject;
				T result = caseUnsignedIntegerNumericDataTypeType(unsignedIntegerNumericDataTypeType);
				if (result == null) result = caseDataType(unsignedIntegerNumericDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UNSIGNED_LARGE_INTEGER_NUMERIC_DATA_TYPE_TYPE: {
				UnsignedLargeIntegerNumericDataTypeType unsignedLargeIntegerNumericDataTypeType = (UnsignedLargeIntegerNumericDataTypeType)theEObject;
				T result = caseUnsignedLargeIntegerNumericDataTypeType(unsignedLargeIntegerNumericDataTypeType);
				if (result == null) result = caseDataType(unsignedLargeIntegerNumericDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UNSIGNED_SMALL_INTEGER_NUMERIC_DATA_TYPE_TYPE: {
				UnsignedSmallIntegerNumericDataTypeType unsignedSmallIntegerNumericDataTypeType = (UnsignedSmallIntegerNumericDataTypeType)theEObject;
				T result = caseUnsignedSmallIntegerNumericDataTypeType(unsignedSmallIntegerNumericDataTypeType);
				if (result == null) result = caseDataType(unsignedSmallIntegerNumericDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UNSIGNED_TINY_INTEGER_NUMERIC_DATA_TYPE_TYPE: {
				UnsignedTinyIntegerNumericDataTypeType unsignedTinyIntegerNumericDataTypeType = (UnsignedTinyIntegerNumericDataTypeType)theEObject;
				T result = caseUnsignedTinyIntegerNumericDataTypeType(unsignedTinyIntegerNumericDataTypeType);
				if (result == null) result = caseDataType(unsignedTinyIntegerNumericDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UNSPECIFIED_DATA_TYPE_TYPE: {
				UnspecifiedDataTypeType unspecifiedDataTypeType = (UnspecifiedDataTypeType)theEObject;
				T result = caseUnspecifiedDataTypeType(unspecifiedDataTypeType);
				if (result == null) result = caseDataType(unspecifiedDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VALUE_COMPARISON_CONSTRAINT_OPERATOR_NOT_SPECIFIED_ERROR_TYPE: {
				ValueComparisonConstraintOperatorNotSpecifiedErrorType valueComparisonConstraintOperatorNotSpecifiedErrorType = (ValueComparisonConstraintOperatorNotSpecifiedErrorType)theEObject;
				T result = caseValueComparisonConstraintOperatorNotSpecifiedErrorType(valueComparisonConstraintOperatorNotSpecifiedErrorType);
				if (result == null) result = caseModelError(valueComparisonConstraintOperatorNotSpecifiedErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VALUE_COMPARISON_CONSTRAINT_REF: {
				ValueComparisonConstraintRef valueComparisonConstraintRef = (ValueComparisonConstraintRef)theEObject;
				T result = caseValueComparisonConstraintRef(valueComparisonConstraintRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VALUE_COMPARISON_CONSTRAINT_TYPE: {
				ValueComparisonConstraintType valueComparisonConstraintType = (ValueComparisonConstraintType)theEObject;
				T result = caseValueComparisonConstraintType(valueComparisonConstraintType);
				if (result == null) result = caseSetConstraintWithJoinType(valueComparisonConstraintType);
				if (result == null) result = caseConstraintType(valueComparisonConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VALUE_COMPARISON_ROLES_NOT_COMPARABLE_ERROR_TYPE: {
				ValueComparisonRolesNotComparableErrorType valueComparisonRolesNotComparableErrorType = (ValueComparisonRolesNotComparableErrorType)theEObject;
				T result = caseValueComparisonRolesNotComparableErrorType(valueComparisonRolesNotComparableErrorType);
				if (result == null) result = caseModelError(valueComparisonRolesNotComparableErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VALUE_CONSTRAINT_REF: {
				ValueConstraintRef valueConstraintRef = (ValueConstraintRef)theEObject;
				T result = caseValueConstraintRef(valueConstraintRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VALUE_CONSTRAINT_TYPE: {
				ValueConstraintType valueConstraintType = (ValueConstraintType)theEObject;
				T result = caseValueConstraintType(valueConstraintType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VALUE_CONSTRAINT_WITH_NAME_TYPE: {
				ValueConstraintWithNameType valueConstraintWithNameType = (ValueConstraintWithNameType)theEObject;
				T result = caseValueConstraintWithNameType(valueConstraintWithNameType);
				if (result == null) result = caseValueConstraintType(valueConstraintWithNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VALUE_RANGE_OVERLAP_ERROR_TYPE: {
				ValueRangeOverlapErrorType valueRangeOverlapErrorType = (ValueRangeOverlapErrorType)theEObject;
				T result = caseValueRangeOverlapErrorType(valueRangeOverlapErrorType);
				if (result == null) result = caseModelError(valueRangeOverlapErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VALUE_RANGE_REF: {
				ValueRangeRef valueRangeRef = (ValueRangeRef)theEObject;
				T result = caseValueRangeRef(valueRangeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VALUE_RANGES_TYPE: {
				ValueRangesType valueRangesType = (ValueRangesType)theEObject;
				T result = caseValueRangesType(valueRangesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VALUE_RANGE_TYPE: {
				ValueRangeType valueRangeType = (ValueRangeType)theEObject;
				T result = caseValueRangeType(valueRangeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VALUE_TYPE_DETACHED_ERROR_TYPE: {
				ValueTypeDetachedErrorType valueTypeDetachedErrorType = (ValueTypeDetachedErrorType)theEObject;
				T result = caseValueTypeDetachedErrorType(valueTypeDetachedErrorType);
				if (result == null) result = caseModelError(valueTypeDetachedErrorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VALUE_TYPE_INSTANCE_REF: {
				ValueTypeInstanceRef valueTypeInstanceRef = (ValueTypeInstanceRef)theEObject;
				T result = caseValueTypeInstanceRef(valueTypeInstanceRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VALUE_TYPE_INSTANCE_TYPE: {
				ValueTypeInstanceType valueTypeInstanceType = (ValueTypeInstanceType)theEObject;
				T result = caseValueTypeInstanceType(valueTypeInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VALUE_TYPE_TYPE: {
				ValueTypeType valueTypeType = (ValueTypeType)theEObject;
				T result = caseValueTypeType(valueTypeType);
				if (result == null) result = caseObjectTypeType(valueTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VALUE_TYPE_VALUE_RESTRICTION_TYPE: {
				ValueTypeValueRestrictionType valueTypeValueRestrictionType = (ValueTypeValueRestrictionType)theEObject;
				T result = caseValueTypeValueRestrictionType(valueTypeValueRestrictionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VARIABLE_LENGTH_RAW_DATA_DATA_TYPE_TYPE: {
				VariableLengthRawDataDataTypeType variableLengthRawDataDataTypeType = (VariableLengthRawDataDataTypeType)theEObject;
				T result = caseVariableLengthRawDataDataTypeType(variableLengthRawDataDataTypeType);
				if (result == null) result = caseDataType(variableLengthRawDataDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VARIABLE_LENGTH_TEXT_DATA_TYPE_TYPE: {
				VariableLengthTextDataTypeType variableLengthTextDataTypeType = (VariableLengthTextDataTypeType)theEObject;
				T result = caseVariableLengthTextDataTypeType(variableLengthTextDataTypeType);
				if (result == null) result = caseDataType(variableLengthTextDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.YES_OR_NO_LOGICAL_DATA_TYPE_TYPE: {
				YesOrNoLogicalDataTypeType yesOrNoLogicalDataTypeType = (YesOrNoLogicalDataTypeType)theEObject;
				T result = caseYesOrNoLogicalDataTypeType(yesOrNoLogicalDataTypeType);
				if (result == null) result = caseDataType(yesOrNoLogicalDataTypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation Context Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation Context Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregationContextType(AggregationContextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aliases Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aliases Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasesType(AliasesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasType(AliasType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Counter Numeric Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Counter Numeric Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoCounterNumericDataTypeType(AutoCounterNumericDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Timestamp Temporal Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Timestamp Temporal Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoTimestampTemporalDataTypeType(AutoTimestampTemporalDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bound To Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bound To Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundToType(BoundToType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculated Path Value Must Be Consumed Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculated Path Value Must Be Consumed Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatedPathValueMustBeConsumedErrorType(CalculatedPathValueMustBeConsumedErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculated Path Value Parameter Binding Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculated Path Value Parameter Binding Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatedPathValueParameterBindingErrorType(CalculatedPathValueParameterBindingErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculated Path Value Requires Aggregation Context Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculated Path Value Requires Aggregation Context Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatedPathValueRequiresAggregationContextErrorType(CalculatedPathValueRequiresAggregationContextErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculated Path Value Requires Function Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculated Path Value Requires Function Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatedPathValueRequiresFunctionErrorType(CalculatedPathValueRequiresFunctionErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculated Value Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculated Value Input Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatedValueInputType(CalculatedValueInputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculated Value Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculated Value Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatedValueRef(CalculatedValueRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculated Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculated Values Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatedValuesType(CalculatedValuesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculated Values Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculated Values Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatedValuesType1(CalculatedValuesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculated Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculated Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatedValueType(CalculatedValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Calculated Value Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Calculated Value Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCalculatedValueType1(CalculatedValueType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality Constraint Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality Constraint Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityConstraintRef(CardinalityConstraintRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityConstraintType(CardinalityConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality Range Overlap Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality Range Overlap Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityRangeOverlapErrorType(CardinalityRangeOverlapErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality Ranges Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality Ranges Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityRangesType(CardinalityRangesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityRangeType(CardinalityRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compatible Role Player Type Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compatible Role Player Type Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompatibleRolePlayerTypeErrorType(CompatibleRolePlayerTypeErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compatible Supertypes Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compatible Supertypes Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompatibleSupertypesErrorType(CompatibleSupertypesErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compatible Value Type Instance Value Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compatible Value Type Instance Value Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompatibleValueTypeInstanceValueErrorType(CompatibleValueTypeInstanceValueErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionsType(ConditionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Duplicate Name Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Duplicate Name Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintDuplicateNameErrorType(ConstraintDuplicateNameErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Role Projection Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Role Projection Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintRoleProjectionRef(ConstraintRoleProjectionRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Role Projection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Role Projection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintRoleProjectionType(ConstraintRoleProjectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Role Sequence Join Path Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Role Sequence Join Path Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintRoleSequenceJoinPathRef(ConstraintRoleSequenceJoinPathRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Role Sequence Join Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Role Sequence Join Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintRoleSequenceJoinPathType(ConstraintRoleSequenceJoinPathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Role Sequence Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Role Sequence Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintRoleSequenceRef(ConstraintRoleSequenceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Role Sequences Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Role Sequences Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintRoleSequencesType(ConstraintRoleSequencesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Role Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Role Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintRoleSequenceType(ConstraintRoleSequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Role Sequence With Join And Id Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Role Sequence With Join And Id Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintRoleSequenceWithJoinAndIdType(ConstraintRoleSequenceWithJoinAndIdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Role Sequence With Join Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Role Sequence With Join Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintRoleSequenceWithJoinType(ConstraintRoleSequenceWithJoinType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintsType(ConstraintsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraints Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraints Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintsType1(ConstraintsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraints Type2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraints Type2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintsType2(ConstraintsType2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraints Type3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraints Type3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintsType3(ConstraintsType3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraints Type4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraints Type4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintsType4(ConstraintsType4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraints Type5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraints Type5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintsType5(ConstraintsType5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintType(ConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correlated Path Role Requires Compatible Role Player Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlated Path Role Requires Compatible Role Player Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrelatedPathRoleRequiresCompatibleRolePlayerErrorType(CorrelatedPathRoleRequiresCompatibleRolePlayerErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Reference Modes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Reference Modes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomReferenceModesType(CustomReferenceModesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Reference Mode Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Reference Mode Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomReferenceModeType(CustomReferenceModeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Not Specified Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Not Specified Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeNotSpecifiedErrorType(DataTypeNotSpecifiedErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeRef(DataTypeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type Ref Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type Ref Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeRefRef(DataTypeRefRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypesType(DataTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date And Time Temporal Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date And Time Temporal Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateAndTimeTemporalDataTypeType(DateAndTimeTemporalDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Temporal Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Temporal Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTemporalDataTypeType(DateTemporalDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Numeric Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Numeric Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalNumericDataTypeType(DecimalNumericDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definitions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definitions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionsType(DefinitionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinitionType(DefinitionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derivation Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derivation Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivationExpressionType(DerivationExpressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derivation Projections Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derivation Projections Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivationProjectionsType(DerivationProjectionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derivation Projections Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derivation Projections Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivationProjectionsType1(DerivationProjectionsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derivation Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derivation Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivationSourceType(DerivationSourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derivation Source Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derivation Source Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivationSourceType1(DerivationSourceType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Fact Type Role Projection Compatibility Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Fact Type Role Projection Compatibility Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedFactTypeRoleProjectionCompatibilityErrorType(DerivedFactTypeRoleProjectionCompatibilityErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Role Projection Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Role Projection Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedRoleProjectionRef(DerivedRoleProjectionRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Role Projection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Role Projection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedRoleProjectionType(DerivedRoleProjectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Precision Floating Point Numeric Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Precision Floating Point Numeric Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoublePrecisionFloatingPointNumericDataTypeType(DoublePrecisionFloatingPointNumericDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Duplicate Reading Signature Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Duplicate Reading Signature Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDuplicateReadingSignatureErrorType(DuplicateReadingSignatureErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Color Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Color Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicColorType(DynamicColorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementRef(ElementRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityTypeInstanceRef(EntityTypeInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type Instances Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type Instances Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityTypeInstancesType(EntityTypeInstancesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityTypeInstanceType(EntityTypeInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type Requires Reference Scheme Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type Requires Reference Scheme Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityTypeRequiresReferenceSchemeErrorType(EntityTypeRequiresReferenceSchemeErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type Role Instances Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type Role Instances Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityTypeRoleInstancesType(EntityTypeRoleInstancesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type Subtype Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type Subtype Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityTypeSubtypeInstanceRef(EntityTypeSubtypeInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type Subtype Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type Subtype Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityTypeSubtypeInstanceType(EntityTypeSubtypeInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityTypeType(EntityTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality Constraint Implied By Mandatory Constraints Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality Constraint Implied By Mandatory Constraints Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualityConstraintImpliedByMandatoryConstraintsErrorType(EqualityConstraintImpliedByMandatoryConstraintsErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality Constraint Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality Constraint Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualityConstraintRef(EqualityConstraintRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualityConstraintType(EqualityConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equality Implied By Mandatory Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equality Implied By Mandatory Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEqualityImpliedByMandatoryErrorType(EqualityImpliedByMandatoryErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusion Constraint Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusion Constraint Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusionConstraintRef(ExclusionConstraintRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusion Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusion Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusionConstraintType(ExclusionConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusion Contradicts Equality Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusion Contradicts Equality Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusionContradictsEqualityErrorType(ExclusionContradictsEqualityErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusion Contradicts Mandatory Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusion Contradicts Mandatory Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusionContradictsMandatoryErrorType(ExclusionContradictsMandatoryErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusion Contradicts Subset Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusion Contradicts Subset Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusionContradictsSubsetErrorType(ExclusionContradictsSubsetErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expanded Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expanded Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpandedDataType(ExpandedDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionsType(ExtensionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Constraint Role Sequence Arity Mismatch Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Constraint Role Sequence Arity Mismatch Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalConstraintRoleSequenceArityMismatchErrorType(ExternalConstraintRoleSequenceArityMismatchErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Roles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Roles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactRolesType(FactRolesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type Derivation Expression Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type Derivation Expression Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypeDerivationExpressionType(FactTypeDerivationExpressionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type Derivation Path Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type Derivation Path Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypeDerivationPathRef(FactTypeDerivationPathRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type Derivation Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type Derivation Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypeDerivationPathType(FactTypeDerivationPathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type Derivation Projection Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type Derivation Projection Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypeDerivationProjectionRef(FactTypeDerivationProjectionRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type Derivation Requires Projection Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type Derivation Requires Projection Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypeDerivationRequiresProjectionErrorType(FactTypeDerivationRequiresProjectionErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type Derivation Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type Derivation Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypeDerivationRuleType(FactTypeDerivationRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypeInstanceRef(FactTypeInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type Instances Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type Instances Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypeInstancesType(FactTypeInstancesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypeInstanceType(FactTypeInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypeRef(FactTypeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type Requires Internal Uniqueness Constraint Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type Requires Internal Uniqueness Constraint Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypeRequiresInternalUniquenessConstraintErrorType(FactTypeRequiresInternalUniquenessConstraintErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type Requires Reading Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type Requires Reading Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypeRequiresReadingErrorType(FactTypeRequiresReadingErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type Role Instances Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type Role Instances Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypeRoleInstancesType(FactTypeRoleInstancesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypesType(FactTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypeType(FactTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Length Raw Data Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Length Raw Data Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedLengthRawDataDataTypeType(FixedLengthRawDataDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Length Text Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Length Text Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedLengthTextDataTypeType(FixedLengthTextDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Floating Point Numeric Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Floating Point Numeric Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloatingPointNumericDataTypeType(FloatingPointNumericDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency Constraint Contradicts Internal Uniqueness Constraint Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency Constraint Contradicts Internal Uniqueness Constraint Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequencyConstraintContradictsInternalUniquenessConstraintErrorType(FrequencyConstraintContradictsInternalUniquenessConstraintErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency Constraint Exactly One Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency Constraint Exactly One Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequencyConstraintExactlyOneErrorType(FrequencyConstraintExactlyOneErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency Constraint Min Max Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency Constraint Min Max Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequencyConstraintMinMaxErrorType(FrequencyConstraintMinMaxErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency Constraint Non Restrictive Range Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency Constraint Non Restrictive Range Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequencyConstraintNonRestrictiveRangeErrorType(FrequencyConstraintNonRestrictiveRangeErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency Constraint Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency Constraint Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequencyConstraintRef(FrequencyConstraintRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequencyConstraintType(FrequencyConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency Constraint Violated By Uniqueness Constraint Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency Constraint Violated By Uniqueness Constraint Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequencyConstraintViolatedByUniquenessConstraintErrorType(FrequencyConstraintViolatedByUniquenessConstraintErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Duplicate Name Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Duplicate Name Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDuplicateNameErrorType(FunctionDuplicateNameErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Parameter Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Parameter Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionParameterRef(FunctionParameterRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionParameterType(FunctionParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionRef(FunctionRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionsType(FunctionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functions Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functions Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionsType1(FunctionsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionType(FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generation Settings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generation Settings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerationSettingsType(GenerationSettingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generation Setting Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generation Setting Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerationSettingType(GenerationSettingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generation State Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generation State Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenerationStateType(GenerationStateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Duplicate Name Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Duplicate Name Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupDuplicateNameErrorType(GroupDuplicateNameErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Elements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Elements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupElementsType(GroupElementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grouping Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grouping Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupingType(GroupingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Membership Contradiction Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Membership Contradiction Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupMembershipContradictionErrorType(GroupMembershipContradictionErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupRef(GroupRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Groups Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Groups Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupsType(GroupsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Groups Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Groups Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupsType1(GroupsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupType(GroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupType1(GroupType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupTypesType(GroupTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupTypeType(GroupTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implication Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implication Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplicationErrorType(ImplicationErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implied Fact Roles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implied Fact Roles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpliedFactRolesType(ImpliedFactRolesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implied Fact Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implied Fact Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpliedFactTypeType(ImpliedFactTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implied Internal Uniqueness Constraint Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implied Internal Uniqueness Constraint Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImpliedInternalUniquenessConstraintErrorType(ImpliedInternalUniquenessConstraintErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Informal Derivation Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Informal Derivation Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformalDerivationRuleType(InformalDerivationRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input From Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input From Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputFromType(InputFromType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inputs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inputs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputsType(InputsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instances Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instances Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstancesType(InstancesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Constraints Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Constraints Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalConstraintsType(InternalConstraintsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Joined Constraint Role Projection Compatibility Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Joined Constraint Role Projection Compatibility Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinedConstraintRoleProjectionCompatibilityErrorType(JoinedConstraintRoleProjectionCompatibilityErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Joined Path Role Requires Compatible Role Player Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Joined Path Role Requires Compatible Role Player Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinedPathRoleRequiresCompatibleRolePlayerErrorType(JoinedPathRoleRequiresCompatibleRolePlayerErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Path Projection Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Path Projection Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinPathProjectionRef(JoinPathProjectionRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Path Projections Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Path Projections Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinPathProjectionsType(JoinPathProjectionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Path Projection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Path Projection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinPathProjectionType(JoinPathProjectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Path Required Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Path Required Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinPathRequiredErrorType(JoinPathRequiredErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Path Requires Projection Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Path Requires Projection Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinPathRequiresProjectionErrorType(JoinPathRequiresProjectionErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinRuleType(JoinRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Large Length Raw Data Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Large Length Raw Data Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLargeLengthRawDataDataTypeType(LargeLengthRawDataDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Large Length Text Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Large Length Text Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLargeLengthTextDataTypeType(LargeLengthTextDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lead Role Path Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lead Role Path Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeadRolePathRef(LeadRolePathRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lead Role Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lead Role Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeadRolePathType(LeadRolePathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory Constraint Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory Constraint Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatoryConstraintRef(MandatoryConstraintRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mandatory Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mandatory Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMandatoryConstraintType(MandatoryConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Value Mismatch Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Value Mismatch Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMaxValueMismatchErrorType(MaxValueMismatchErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Value Mismatch Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Value Mismatch Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinValueMismatchErrorType(MinValueMismatchErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelError(ModelError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Error Display Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Error Display Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelErrorDisplayFilterType(ModelErrorDisplayFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Errors Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Errors Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelErrorsType(ModelErrorsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Note Referenced By Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Note Referenced By Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelNoteReferencedByType(ModelNoteReferencedByType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Notes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Notes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelNotesType(ModelNotesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Note Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Note Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelNoteType(ModelNoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Money Numeric Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Money Numeric Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoneyNumericDataTypeType(MoneyNumericDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Generator Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Generator Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameGeneratorType(NameGeneratorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Groups Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Groups Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedGroupsType(NestedGroupsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NMinus One Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NMinus One Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNMinusOneErrorType(NMinusOneErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotesType(NotesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteType(NoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Well Modeled Subset And Mandatory Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Well Modeled Subset And Mandatory Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotWellModeledSubsetAndMandatoryErrorType(NotWellModeledSubsetAndMandatoryErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Id Other Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Id Other Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectIdOtherDataTypeType(ObjectIdOtherDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objectification Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objectification Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectificationRef(ObjectificationRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objectified Fact Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objectified Fact Type Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectifiedFactTypeRef(ObjectifiedFactTypeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objectified Instance Required Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objectified Instance Required Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectifiedInstanceRequiredErrorType(ObjectifiedInstanceRequiredErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objectified Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objectified Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectifiedTypeType(ObjectifiedTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objectified Unary Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objectified Unary Role Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectifiedUnaryRoleType(ObjectifiedUnaryRoleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objectifying Instance Required Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objectifying Instance Required Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectifyingInstanceRequiredErrorType(ObjectifyingInstanceRequiredErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Objects Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Objects Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectsType(ObjectsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type Cardinality Restriction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type Cardinality Restriction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectTypeCardinalityRestrictionType(ObjectTypeCardinalityRestrictionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type Duplicate Name Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type Duplicate Name Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectTypeDuplicateNameErrorType(ObjectTypeDuplicateNameErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectTypeInstanceRef(ObjectTypeInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectTypeRef(ObjectTypeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type Requires Primary Supertype Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type Requires Primary Supertype Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectTypeRequiresPrimarySupertypeErrorType(ObjectTypeRequiresPrimarySupertypeErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type Role Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type Role Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectTypeRoleInstanceRef(ObjectTypeRoleInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Types Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Types Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectTypesType(ObjectTypesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectTypeType(ObjectTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Unifier Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Unifier Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectUnifierRef(ObjectUnifierRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Unifier Requires Compatible Object Types Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Unifier Requires Compatible Object Types Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectUnifierRequiresCompatibleObjectTypesErrorType(ObjectUnifierRequiresCompatibleObjectTypesErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Unifiers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Unifiers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectUnifiersType(ObjectUnifiersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Unifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Unifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectUnifierType(ObjectUnifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ole Object Raw Data Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ole Object Raw Data Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOleObjectRawDataDataTypeType(OleObjectRawDataDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ORM Model Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ORM Model Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORMModelRef(ORMModelRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ORM Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ORM Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORMModelType(ORMModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametersType(ParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Fact Type Derivation Projection Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Fact Type Derivation Projection Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialFactTypeDerivationProjectionErrorType(PartialFactTypeDerivationProjectionErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Join Path Projection Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Join Path Projection Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialJoinPathProjectionErrorType(PartialJoinPathProjectionErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partial Query Derivation Projection Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partial Query Derivation Projection Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartialQueryDerivationProjectionErrorType(PartialQueryDerivationProjectionErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Components Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Components Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathComponentsType(PathComponentsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathComponentType(PathComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Condition Role Value Restriction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Condition Role Value Restriction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathConditionRoleValueRestrictionType(PathConditionRoleValueRestrictionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Condition Root Value Restriction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Condition Root Value Restriction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathConditionRootValueRestrictionType(PathConditionRootValueRestrictionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Constant Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Constant Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathConstantType(PathConstantType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pathed Role Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pathed Role Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathedRoleRef(PathedRoleRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pathed Roles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pathed Roles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathedRolesType(PathedRolesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pathed Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pathed Role Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathedRoleType(PathedRoleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Outer Join Requires Optional Role Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Outer Join Requires Optional Role Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathOuterJoinRequiresOptionalRoleErrorType(PathOuterJoinRequiresOptionalRoleErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Requires Root Object Type Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Requires Root Object Type Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathRequiresRootObjectTypeErrorType(PathRequiresRootObjectTypeErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Same Fact Type Role Follows Join Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Same Fact Type Role Follows Join Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathSameFactTypeRoleFollowsJoinErrorType(PathSameFactTypeRoleFollowsJoinErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Start Role Follows Root Object Type Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Start Role Follows Root Object Type Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathStartRoleFollowsRootObjectTypeErrorType(PathStartRoleFollowsRootObjectTypeErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Picture Raw Data Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Picture Raw Data Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePictureRawDataDataTypeType(PictureRawDataDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Played Roles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Played Roles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayedRolesType(PlayedRolesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Population Mandatory Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Population Mandatory Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopulationMandatoryErrorType(PopulationMandatoryErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Population Uniqueness Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Population Uniqueness Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePopulationUniquenessErrorType(PopulationUniquenessErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preferred Identifier Requires Mandatory Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preferred Identifier Requires Mandatory Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreferredIdentifierRequiresMandatoryErrorType(PreferredIdentifierRequiresMandatoryErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projected From Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projected From Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectedFromType(ProjectedFromType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Projected From Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Projected From Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectedFromType1(ProjectedFromType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Derivation Path Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Derivation Path Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryDerivationPathRef(QueryDerivationPathRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Derivation Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Derivation Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryDerivationPathType(QueryDerivationPathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Derivation Requires Projection Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Derivation Requires Projection Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryDerivationRequiresProjectionErrorType(QueryDerivationRequiresProjectionErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Derivation Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Derivation Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryDerivationRuleType(QueryDerivationRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Parameter Bindings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Parameter Bindings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryParameterBindingsType(QueryParameterBindingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Parameter Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Parameter Binding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryParameterBindingType(QueryParameterBindingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Parameters Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Parameters Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryParametersType(QueryParametersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryParameterType(QueryParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Role Projection Compatibility Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Role Projection Compatibility Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryRoleProjectionCompatibilityErrorType(QueryRoleProjectionCompatibilityErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryType(QueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reading Orders Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reading Orders Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadingOrdersType(ReadingOrdersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reading Order Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reading Order Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadingOrderType(ReadingOrderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reading Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reading Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadingRef(ReadingRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reading Requires User Modification Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reading Requires User Modification Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadingRequiresUserModificationErrorType(ReadingRequiresUserModificationErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reading Role Sequence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reading Role Sequence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadingRoleSequenceType(ReadingRoleSequenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Readings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Readings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadingsType(ReadingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Readings Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Readings Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadingsType1(ReadingsType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reading Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reading Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadingType(ReadingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recognized Phrase Duplicate Name Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recognized Phrase Duplicate Name Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecognizedPhraseDuplicateNameErrorType(RecognizedPhraseDuplicateNameErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recognized Phrase Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recognized Phrase Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecognizedPhraseRef(RecognizedPhraseRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recognized Phrases Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recognized Phrases Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecognizedPhrasesType(RecognizedPhrasesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recognized Phrases Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recognized Phrases Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecognizedPhrasesType1(RecognizedPhrasesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recognized Phrase Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recognized Phrase Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecognizedPhraseType(RecognizedPhraseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Mode Kind Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Mode Kind Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceModeKindRef(ReferenceModeKindRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Mode Kinds Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Mode Kinds Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceModeKindsType(ReferenceModeKindsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Mode Kind Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Mode Kind Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceModeKindType(ReferenceModeKindType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refinements Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refinements Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefinementsType(RefinementsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ring Constraint Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ring Constraint Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRingConstraintRef(RingConstraintRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ring Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ring Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRingConstraintType(RingConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ring Constraint Type Not Specified Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ring Constraint Type Not Specified Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRingConstraintTypeNotSpecifiedErrorType(RingConstraintTypeNotSpecifiedErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Based Derivation Projection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Based Derivation Projection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleBasedDerivationProjectionType(RoleBasedDerivationProjectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleBaseType(RoleBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Instances Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Instances Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleInstancesType(RoleInstancesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Instances Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Instances Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleInstancesType1(RoleInstancesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleInstanceType(RoleInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Path Owner Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Path Owner Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRolePathOwnerType(RolePathOwnerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRolePathType(RolePathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Player Required Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Player Required Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRolePlayerRequiredErrorType(RolePlayerRequiredErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Proxy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Proxy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleProxyType(RoleProxyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleRef(RoleRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Sequence Role Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Sequence Role Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleSequenceRoleRef(RoleSequenceRoleRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Sequence With Projection Role Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Sequence With Projection Role Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleSequenceWithProjectionRoleRef(RoleSequenceWithProjectionRoleRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Sub Path Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Sub Path Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleSubPathRef(RoleSubPathRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Sub Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Sub Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleSubPathType(RoleSubPathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Text Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Text Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleTextType(RoleTextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleType(RoleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Value Restriction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Value Restriction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleValueRestrictionType(RoleValueRestrictionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Object Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Object Type Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootObjectTypeRef(RootObjectTypeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Object Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Object Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootObjectTypeType(RootObjectTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Id Other Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Id Other Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRowIdOtherDataTypeType(RowIdOtherDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Comparison Constraint Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Comparison Constraint Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetComparisonConstraintRef(SetComparisonConstraintRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Comparison Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Comparison Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetComparisonConstraintType(SetComparisonConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Constraint Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Constraint Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetConstraintRef(SetConstraintRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetConstraintType(SetConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Constraint With Join Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Constraint With Join Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetConstraintWithJoinType(SetConstraintWithJoinType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signed Integer Numeric Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signed Integer Numeric Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignedIntegerNumericDataTypeType(SignedIntegerNumericDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signed Large Integer Numeric Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signed Large Integer Numeric Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignedLargeIntegerNumericDataTypeType(SignedLargeIntegerNumericDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signed Small Integer Numeric Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signed Small Integer Numeric Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignedSmallIntegerNumericDataTypeType(SignedSmallIntegerNumericDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Precision Floating Point Numeric Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Precision Floating Point Numeric Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinglePrecisionFloatingPointNumericDataTypeType(SinglePrecisionFloatingPointNumericDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceType(SourceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Paths Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Paths Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubPathsType(SubPathsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subqueries Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subqueries Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubqueriesType(SubqueriesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subquery Parameter Inputs For Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subquery Parameter Inputs For Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubqueryParameterInputsForType(SubqueryParameterInputsForType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subquery Parameter Inputs Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subquery Parameter Inputs Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubqueryParameterInputsType(SubqueryParameterInputsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subquery Parameter Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subquery Parameter Input Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubqueryParameterInputType(SubqueryParameterInputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subquery Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subquery Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubqueryRef(SubqueryRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subset Constraint Implied By Mandatory Constraints Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subset Constraint Implied By Mandatory Constraints Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsetConstraintImpliedByMandatoryConstraintsErrorType(SubsetConstraintImpliedByMandatoryConstraintsErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subset Constraint Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subset Constraint Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsetConstraintRef(SubsetConstraintRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subset Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subset Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubsetConstraintType(SubsetConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtype Derivation Path Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtype Derivation Path Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtypeDerivationPathType(SubtypeDerivationPathType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtype Derivation Rule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtype Derivation Rule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtypeDerivationRuleType(SubtypeDerivationRuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtype Fact Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtype Fact Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtypeFactTypeType(SubtypeFactTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtype Roles Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtype Roles Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtypeRolesType(SubtypeRolesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Superset Role Of Subtype Subset Constraint Not Subtype Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Superset Role Of Subtype Subset Constraint Not Subtype Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType(SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Temporal Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Temporal Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeTemporalDataTypeType(TimeTemporalDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Too Few Entity Type Role Instances Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Too Few Entity Type Role Instances Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTooFewEntityTypeRoleInstancesErrorType(TooFewEntityTypeRoleInstancesErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Too Few Fact Type Role Instances Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Too Few Fact Type Role Instances Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTooFewFactTypeRoleInstancesErrorType(TooFewFactTypeRoleInstancesErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Too Few Reading Roles Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Too Few Reading Roles Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTooFewReadingRolesErrorType(TooFewReadingRolesErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Too Few Role Sequences Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Too Few Role Sequences Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTooFewRoleSequencesErrorType(TooFewRoleSequencesErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Too Many Reading Roles Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Too Many Reading Roles Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTooManyReadingRolesErrorType(TooManyReadingRolesErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Too Many Role Sequences Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Too Many Role Sequences Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTooManyRoleSequencesErrorType(TooManyRoleSequencesErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>True Or False Logical Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True Or False Logical Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrueOrFalseLogicalDataTypeType(TrueOrFalseLogicalDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Role Cardinality Restriction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Role Cardinality Restriction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryRoleCardinalityRestrictionType(UnaryRoleCardinalityRestrictionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uniqueness Constraint Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uniqueness Constraint Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniquenessConstraintRef(UniquenessConstraintRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uniqueness Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uniqueness Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniquenessConstraintType(UniquenessConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsigned Integer Numeric Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsigned Integer Numeric Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsignedIntegerNumericDataTypeType(UnsignedIntegerNumericDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsigned Large Integer Numeric Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsigned Large Integer Numeric Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsignedLargeIntegerNumericDataTypeType(UnsignedLargeIntegerNumericDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsigned Small Integer Numeric Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsigned Small Integer Numeric Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsignedSmallIntegerNumericDataTypeType(UnsignedSmallIntegerNumericDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unsigned Tiny Integer Numeric Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unsigned Tiny Integer Numeric Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnsignedTinyIntegerNumericDataTypeType(UnsignedTinyIntegerNumericDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unspecified Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unspecified Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnspecifiedDataTypeType(UnspecifiedDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Comparison Constraint Operator Not Specified Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Comparison Constraint Operator Not Specified Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueComparisonConstraintOperatorNotSpecifiedErrorType(ValueComparisonConstraintOperatorNotSpecifiedErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Comparison Constraint Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Comparison Constraint Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueComparisonConstraintRef(ValueComparisonConstraintRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Comparison Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Comparison Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueComparisonConstraintType(ValueComparisonConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Comparison Roles Not Comparable Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Comparison Roles Not Comparable Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueComparisonRolesNotComparableErrorType(ValueComparisonRolesNotComparableErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Constraint Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Constraint Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueConstraintRef(ValueConstraintRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Constraint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Constraint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueConstraintType(ValueConstraintType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Constraint With Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Constraint With Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueConstraintWithNameType(ValueConstraintWithNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Range Overlap Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Range Overlap Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueRangeOverlapErrorType(ValueRangeOverlapErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Range Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Range Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueRangeRef(ValueRangeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Ranges Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Ranges Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueRangesType(ValueRangesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Range Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Range Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueRangeType(ValueRangeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type Detached Error Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type Detached Error Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueTypeDetachedErrorType(ValueTypeDetachedErrorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type Instance Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type Instance Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueTypeInstanceRef(ValueTypeInstanceRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueTypeInstanceType(ValueTypeInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueTypeType(ValueTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type Value Restriction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type Value Restriction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueTypeValueRestrictionType(ValueTypeValueRestrictionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Length Raw Data Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Length Raw Data Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableLengthRawDataDataTypeType(VariableLengthRawDataDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Length Text Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Length Text Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableLengthTextDataTypeType(VariableLengthTextDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Yes Or No Logical Data Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Yes Or No Logical Data Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseYesOrNoLogicalDataTypeType(YesOrNoLogicalDataTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CoreSwitch
