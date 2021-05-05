/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Errors Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for all model validation errors.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getExtensionModelErrorGroup <em>Extension Model Error Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getExtensionModelError <em>Extension Model Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getConstraintDuplicateNameError <em>Constraint Duplicate Name Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getObjectTypeDuplicateNameError <em>Object Type Duplicate Name Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getRecognizedPhraseDuplicateNameError <em>Recognized Phrase Duplicate Name Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getGroupDuplicateNameError <em>Group Duplicate Name Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getFunctionDuplicateNameError <em>Function Duplicate Name Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getDuplicateReadingSignatureError <em>Duplicate Reading Signature Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getGroupMembershipContradictionError <em>Group Membership Contradiction Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getExternalConstraintRoleSequenceArityMismatchError <em>External Constraint Role Sequence Arity Mismatch Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getFactTypeRequiresInternalUniquenessConstraintError <em>Fact Type Requires Internal Uniqueness Constraint Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getFactTypeRequiresReadingError <em>Fact Type Requires Reading Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getTooFewEntityTypeRoleInstancesError <em>Too Few Entity Type Role Instances Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getTooFewFactTypeRoleInstancesError <em>Too Few Fact Type Role Instances Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getTooFewReadingRolesError <em>Too Few Reading Roles Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getReadingRequiresUserModificationError <em>Reading Requires User Modification Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getTooFewRoleSequencesError <em>Too Few Role Sequences Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getTooManyReadingRolesError <em>Too Many Reading Roles Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getTooManyRoleSequencesError <em>Too Many Role Sequences Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getDataTypeNotSpecifiedError <em>Data Type Not Specified Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getNMinusOneError <em>NMinus One Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getCompatibleRolePlayerTypeError <em>Compatible Role Player Type Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getSupersetRoleOfSubtypeSubsetConstraintNotSubtypeError <em>Superset Role Of Subtype Subset Constraint Not Subtype Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getJoinPathRequiredError <em>Join Path Required Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getRolePlayerRequiredError <em>Role Player Required Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getEqualityImpliedByMandatoryError <em>Equality Implied By Mandatory Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getEntityTypeRequiresReferenceSchemeError <em>Entity Type Requires Reference Scheme Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getFrequencyConstraintMinMaxError <em>Frequency Constraint Min Max Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getFrequencyConstraintExactlyOneError <em>Frequency Constraint Exactly One Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getFrequencyConstraintNonRestrictiveRangeError <em>Frequency Constraint Non Restrictive Range Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getFrequencyConstraintContradictsInternalUniquenessConstraintError <em>Frequency Constraint Contradicts Internal Uniqueness Constraint Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getFrequencyConstraintViolatedByUniquenessConstraintError <em>Frequency Constraint Violated By Uniqueness Constraint Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getMinValueMismatchError <em>Min Value Mismatch Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getMaxValueMismatchError <em>Max Value Mismatch Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getCardinalityRangeOverlapError <em>Cardinality Range Overlap Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getValueRangeOverlapError <em>Value Range Overlap Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getValueTypeDetachedError <em>Value Type Detached Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getRingConstraintTypeNotSpecifiedError <em>Ring Constraint Type Not Specified Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getValueComparisonConstraintOperatorNotSpecifiedError <em>Value Comparison Constraint Operator Not Specified Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getValueComparisonRolesNotComparableError <em>Value Comparison Roles Not Comparable Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getImplicationError <em>Implication Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getSubsetConstraintImpliedByMandatoryConstraintsError <em>Subset Constraint Implied By Mandatory Constraints Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getEqualityConstraintImpliedByMandatoryConstraintsError <em>Equality Constraint Implied By Mandatory Constraints Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getExclusionContradictsMandatoryError <em>Exclusion Contradicts Mandatory Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getNotWellModeledSubsetAndMandatoryError <em>Not Well Modeled Subset And Mandatory Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getImpliedInternalUniquenessConstraintError <em>Implied Internal Uniqueness Constraint Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getObjectTypeRequiresPrimarySupertypeError <em>Object Type Requires Primary Supertype Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getPreferredIdentifierRequiresMandatoryError <em>Preferred Identifier Requires Mandatory Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getCompatibleSupertypesError <em>Compatible Supertypes Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getObjectifyingInstanceRequiredError <em>Objectifying Instance Required Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getObjectifiedInstanceRequiredError <em>Objectified Instance Required Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getCompatibleValueTypeInstanceValueError <em>Compatible Value Type Instance Value Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getPopulationMandatoryError <em>Population Mandatory Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getPopulationUniquenessError <em>Population Uniqueness Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getExclusionContradictsEqualityError <em>Exclusion Contradicts Equality Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getExclusionContradictsSubsetError <em>Exclusion Contradicts Subset Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getPathRequiresRootObjectTypeError <em>Path Requires Root Object Type Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getPathStartRoleFollowsRootObjectTypeError <em>Path Start Role Follows Root Object Type Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getJoinedPathRoleRequiresCompatibleRolePlayerError <em>Joined Path Role Requires Compatible Role Player Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getCorrelatedPathRoleRequiresCompatibleRolePlayerError <em>Correlated Path Role Requires Compatible Role Player Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getObjectUnifierRequiresCompatibleObjectTypesError <em>Object Unifier Requires Compatible Object Types Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getPathSameFactTypeRoleFollowsJoinError <em>Path Same Fact Type Role Follows Join Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getPathOuterJoinRequiresOptionalRoleError <em>Path Outer Join Requires Optional Role Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getCalculatedPathValueRequiresAggregationContextError <em>Calculated Path Value Requires Aggregation Context Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getCalculatedPathValueRequiresFunctionError <em>Calculated Path Value Requires Function Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getCalculatedPathValueMustBeConsumedError <em>Calculated Path Value Must Be Consumed Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getCalculatedPathValueParameterBindingError <em>Calculated Path Value Parameter Binding Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getFactTypeDerivationRequiresProjectionError <em>Fact Type Derivation Requires Projection Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getQueryDerivationRequiresProjectionError <em>Query Derivation Requires Projection Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getPartialFactTypeDerivationProjectionError <em>Partial Fact Type Derivation Projection Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getPartialQueryDerivationProjectionError <em>Partial Query Derivation Projection Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getJoinPathRequiresProjectionError <em>Join Path Requires Projection Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getPartialJoinPathProjectionError <em>Partial Join Path Projection Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getDerivedFactTypeRoleProjectionCompatibilityError <em>Derived Fact Type Role Projection Compatibility Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getQueryRoleProjectionCompatibilityError <em>Query Role Projection Compatibility Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType#getJoinedConstraintRoleProjectionCompatibilityError <em>Joined Constraint Role Projection Compatibility Error</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType()
 * @model extendedMetaData="name='ModelErrorsType' kind='elementOnly'"
 * @generated
 */
public interface ModelErrorsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Extension Model Error Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extension point for model validation errors in extension models.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension Model Error Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ExtensionModelErrorGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='ExtensionModelError:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getExtensionModelErrorGroup();

	/**
	 * Returns the value of the '<em><b>Extension Model Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ModelError}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extension point for model validation errors in extension models.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension Model Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ExtensionModelError()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExtensionModelError' namespace='##targetNamespace' group='ExtensionModelError:group'"
	 * @generated
	 */
	EList<ModelError> getExtensionModelError();

	/**
	 * Returns the value of the '<em><b>Constraint Duplicate Name Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintDuplicateNameErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Duplicate Name Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ConstraintDuplicateNameError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConstraintDuplicateNameError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ConstraintDuplicateNameErrorType> getConstraintDuplicateNameError();

	/**
	 * Returns the value of the '<em><b>Object Type Duplicate Name Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeDuplicateNameErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type Duplicate Name Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ObjectTypeDuplicateNameError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectTypeDuplicateNameError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ObjectTypeDuplicateNameErrorType> getObjectTypeDuplicateNameError();

	/**
	 * Returns the value of the '<em><b>Recognized Phrase Duplicate Name Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhraseDuplicateNameErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recognized Phrase Duplicate Name Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_RecognizedPhraseDuplicateNameError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RecognizedPhraseDuplicateNameError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RecognizedPhraseDuplicateNameErrorType> getRecognizedPhraseDuplicateNameError();

	/**
	 * Returns the value of the '<em><b>Group Duplicate Name Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.GroupDuplicateNameErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Duplicate Name Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_GroupDuplicateNameError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GroupDuplicateNameError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GroupDuplicateNameErrorType> getGroupDuplicateNameError();

	/**
	 * Returns the value of the '<em><b>Function Duplicate Name Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionDuplicateNameErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Duplicate Name Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_FunctionDuplicateNameError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FunctionDuplicateNameError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FunctionDuplicateNameErrorType> getFunctionDuplicateNameError();

	/**
	 * Returns the value of the '<em><b>Duplicate Reading Signature Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.DuplicateReadingSignatureErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duplicate Reading Signature Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_DuplicateReadingSignatureError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DuplicateReadingSignatureError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DuplicateReadingSignatureErrorType> getDuplicateReadingSignatureError();

	/**
	 * Returns the value of the '<em><b>Group Membership Contradiction Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.GroupMembershipContradictionErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Membership Contradiction Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_GroupMembershipContradictionError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GroupMembershipContradictionError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GroupMembershipContradictionErrorType> getGroupMembershipContradictionError();

	/**
	 * Returns the value of the '<em><b>External Constraint Role Sequence Arity Mismatch Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ExternalConstraintRoleSequenceArityMismatchErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Constraint Role Sequence Arity Mismatch Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ExternalConstraintRoleSequenceArityMismatchError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExternalConstraintRoleSequenceArityMismatchError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ExternalConstraintRoleSequenceArityMismatchErrorType> getExternalConstraintRoleSequenceArityMismatchError();

	/**
	 * Returns the value of the '<em><b>Fact Type Requires Internal Uniqueness Constraint Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRequiresInternalUniquenessConstraintErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type Requires Internal Uniqueness Constraint Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_FactTypeRequiresInternalUniquenessConstraintError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FactTypeRequiresInternalUniquenessConstraintError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FactTypeRequiresInternalUniquenessConstraintErrorType> getFactTypeRequiresInternalUniquenessConstraintError();

	/**
	 * Returns the value of the '<em><b>Fact Type Requires Reading Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRequiresReadingErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type Requires Reading Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_FactTypeRequiresReadingError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FactTypeRequiresReadingError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FactTypeRequiresReadingErrorType> getFactTypeRequiresReadingError();

	/**
	 * Returns the value of the '<em><b>Too Few Entity Type Role Instances Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.TooFewEntityTypeRoleInstancesErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Too Few Entity Type Role Instances Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_TooFewEntityTypeRoleInstancesError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TooFewEntityTypeRoleInstancesError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TooFewEntityTypeRoleInstancesErrorType> getTooFewEntityTypeRoleInstancesError();

	/**
	 * Returns the value of the '<em><b>Too Few Fact Type Role Instances Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.TooFewFactTypeRoleInstancesErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Too Few Fact Type Role Instances Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_TooFewFactTypeRoleInstancesError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TooFewFactTypeRoleInstancesError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TooFewFactTypeRoleInstancesErrorType> getTooFewFactTypeRoleInstancesError();

	/**
	 * Returns the value of the '<em><b>Too Few Reading Roles Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.TooFewReadingRolesErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Too Few Reading Roles Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_TooFewReadingRolesError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TooFewReadingRolesError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TooFewReadingRolesErrorType> getTooFewReadingRolesError();

	/**
	 * Returns the value of the '<em><b>Reading Requires User Modification Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingRequiresUserModificationErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Requires User Modification Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ReadingRequiresUserModificationError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReadingRequiresUserModificationError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ReadingRequiresUserModificationErrorType> getReadingRequiresUserModificationError();

	/**
	 * Returns the value of the '<em><b>Too Few Role Sequences Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.TooFewRoleSequencesErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Too Few Role Sequences Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_TooFewRoleSequencesError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TooFewRoleSequencesError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TooFewRoleSequencesErrorType> getTooFewRoleSequencesError();

	/**
	 * Returns the value of the '<em><b>Too Many Reading Roles Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.TooManyReadingRolesErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Too Many Reading Roles Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_TooManyReadingRolesError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TooManyReadingRolesError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TooManyReadingRolesErrorType> getTooManyReadingRolesError();

	/**
	 * Returns the value of the '<em><b>Too Many Role Sequences Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.TooManyRoleSequencesErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Too Many Role Sequences Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_TooManyRoleSequencesError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TooManyRoleSequencesError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TooManyRoleSequencesErrorType> getTooManyRoleSequencesError();

	/**
	 * Returns the value of the '<em><b>Data Type Not Specified Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypeNotSpecifiedErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type Not Specified Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_DataTypeNotSpecifiedError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataTypeNotSpecifiedError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DataTypeNotSpecifiedErrorType> getDataTypeNotSpecifiedError();

	/**
	 * Returns the value of the '<em><b>NMinus One Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.NMinusOneErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NMinus One Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_NMinusOneError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NMinusOneError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<NMinusOneErrorType> getNMinusOneError();

	/**
	 * Returns the value of the '<em><b>Compatible Role Player Type Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleRolePlayerTypeErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Role Player Type Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_CompatibleRolePlayerTypeError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompatibleRolePlayerTypeError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CompatibleRolePlayerTypeErrorType> getCompatibleRolePlayerTypeError();

	/**
	 * Returns the value of the '<em><b>Superset Role Of Subtype Subset Constraint Not Subtype Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superset Role Of Subtype Subset Constraint Not Subtype Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_SupersetRoleOfSubtypeSubsetConstraintNotSubtypeError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SupersetRoleOfSubtypeSubsetConstraintNotSubtypeError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType> getSupersetRoleOfSubtypeSubsetConstraintNotSubtypeError();

	/**
	 * Returns the value of the '<em><b>Join Path Required Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.JoinPathRequiredErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Path Required Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_JoinPathRequiredError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='JoinPathRequiredError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<JoinPathRequiredErrorType> getJoinPathRequiredError();

	/**
	 * Returns the value of the '<em><b>Role Player Required Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.RolePlayerRequiredErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Player Required Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_RolePlayerRequiredError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RolePlayerRequiredError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RolePlayerRequiredErrorType> getRolePlayerRequiredError();

	/**
	 * Returns the value of the '<em><b>Equality Implied By Mandatory Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.EqualityImpliedByMandatoryErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equality Implied By Mandatory Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_EqualityImpliedByMandatoryError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EqualityImpliedByMandatoryError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EqualityImpliedByMandatoryErrorType> getEqualityImpliedByMandatoryError();

	/**
	 * Returns the value of the '<em><b>Entity Type Requires Reference Scheme Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeRequiresReferenceSchemeErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type Requires Reference Scheme Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_EntityTypeRequiresReferenceSchemeError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EntityTypeRequiresReferenceSchemeError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EntityTypeRequiresReferenceSchemeErrorType> getEntityTypeRequiresReferenceSchemeError();

	/**
	 * Returns the value of the '<em><b>Frequency Constraint Min Max Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintMinMaxErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Constraint Min Max Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_FrequencyConstraintMinMaxError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FrequencyConstraintMinMaxError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FrequencyConstraintMinMaxErrorType> getFrequencyConstraintMinMaxError();

	/**
	 * Returns the value of the '<em><b>Frequency Constraint Exactly One Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintExactlyOneErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Constraint Exactly One Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_FrequencyConstraintExactlyOneError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FrequencyConstraintExactlyOneError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FrequencyConstraintExactlyOneErrorType> getFrequencyConstraintExactlyOneError();

	/**
	 * Returns the value of the '<em><b>Frequency Constraint Non Restrictive Range Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintNonRestrictiveRangeErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Constraint Non Restrictive Range Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_FrequencyConstraintNonRestrictiveRangeError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FrequencyConstraintNonRestrictiveRangeError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FrequencyConstraintNonRestrictiveRangeErrorType> getFrequencyConstraintNonRestrictiveRangeError();

	/**
	 * Returns the value of the '<em><b>Frequency Constraint Contradicts Internal Uniqueness Constraint Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintContradictsInternalUniquenessConstraintErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Constraint Contradicts Internal Uniqueness Constraint Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_FrequencyConstraintContradictsInternalUniquenessConstraintError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FrequencyConstraintContradictsInternalUniquenessConstraintError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FrequencyConstraintContradictsInternalUniquenessConstraintErrorType> getFrequencyConstraintContradictsInternalUniquenessConstraintError();

	/**
	 * Returns the value of the '<em><b>Frequency Constraint Violated By Uniqueness Constraint Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintViolatedByUniquenessConstraintErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Constraint Violated By Uniqueness Constraint Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_FrequencyConstraintViolatedByUniquenessConstraintError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FrequencyConstraintViolatedByUniquenessConstraintError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FrequencyConstraintViolatedByUniquenessConstraintErrorType> getFrequencyConstraintViolatedByUniquenessConstraintError();

	/**
	 * Returns the value of the '<em><b>Min Value Mismatch Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.MinValueMismatchErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value Mismatch Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_MinValueMismatchError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MinValueMismatchError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MinValueMismatchErrorType> getMinValueMismatchError();

	/**
	 * Returns the value of the '<em><b>Max Value Mismatch Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.MaxValueMismatchErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value Mismatch Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_MaxValueMismatchError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MaxValueMismatchError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MaxValueMismatchErrorType> getMaxValueMismatchError();

	/**
	 * Returns the value of the '<em><b>Cardinality Range Overlap Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.CardinalityRangeOverlapErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Range Overlap Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_CardinalityRangeOverlapError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CardinalityRangeOverlapError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CardinalityRangeOverlapErrorType> getCardinalityRangeOverlapError();

	/**
	 * Returns the value of the '<em><b>Value Range Overlap Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeOverlapErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Range Overlap Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ValueRangeOverlapError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueRangeOverlapError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ValueRangeOverlapErrorType> getValueRangeOverlapError();

	/**
	 * Returns the value of the '<em><b>Value Type Detached Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeDetachedErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type Detached Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ValueTypeDetachedError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueTypeDetachedError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ValueTypeDetachedErrorType> getValueTypeDetachedError();

	/**
	 * Returns the value of the '<em><b>Ring Constraint Type Not Specified Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.RingConstraintTypeNotSpecifiedErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ring Constraint Type Not Specified Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_RingConstraintTypeNotSpecifiedError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RingConstraintTypeNotSpecifiedError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RingConstraintTypeNotSpecifiedErrorType> getRingConstraintTypeNotSpecifiedError();

	/**
	 * Returns the value of the '<em><b>Value Comparison Constraint Operator Not Specified Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonConstraintOperatorNotSpecifiedErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Comparison Constraint Operator Not Specified Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ValueComparisonConstraintOperatorNotSpecifiedError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueComparisonConstraintOperatorNotSpecifiedError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ValueComparisonConstraintOperatorNotSpecifiedErrorType> getValueComparisonConstraintOperatorNotSpecifiedError();

	/**
	 * Returns the value of the '<em><b>Value Comparison Roles Not Comparable Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonRolesNotComparableErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Comparison Roles Not Comparable Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ValueComparisonRolesNotComparableError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueComparisonRolesNotComparableError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ValueComparisonRolesNotComparableErrorType> getValueComparisonRolesNotComparableError();

	/**
	 * Returns the value of the '<em><b>Implication Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ImplicationErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implication Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ImplicationError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImplicationError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ImplicationErrorType> getImplicationError();

	/**
	 * Returns the value of the '<em><b>Subset Constraint Implied By Mandatory Constraints Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.SubsetConstraintImpliedByMandatoryConstraintsErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subset Constraint Implied By Mandatory Constraints Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_SubsetConstraintImpliedByMandatoryConstraintsError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubsetConstraintImpliedByMandatoryConstraintsError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SubsetConstraintImpliedByMandatoryConstraintsErrorType> getSubsetConstraintImpliedByMandatoryConstraintsError();

	/**
	 * Returns the value of the '<em><b>Equality Constraint Implied By Mandatory Constraints Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.EqualityConstraintImpliedByMandatoryConstraintsErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equality Constraint Implied By Mandatory Constraints Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_EqualityConstraintImpliedByMandatoryConstraintsError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EqualityConstraintImpliedByMandatoryConstraintsError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EqualityConstraintImpliedByMandatoryConstraintsErrorType> getEqualityConstraintImpliedByMandatoryConstraintsError();

	/**
	 * Returns the value of the '<em><b>Exclusion Contradicts Mandatory Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ExclusionContradictsMandatoryErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusion Contradicts Mandatory Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ExclusionContradictsMandatoryError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExclusionContradictsMandatoryError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ExclusionContradictsMandatoryErrorType> getExclusionContradictsMandatoryError();

	/**
	 * Returns the value of the '<em><b>Not Well Modeled Subset And Mandatory Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.NotWellModeledSubsetAndMandatoryErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Well Modeled Subset And Mandatory Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_NotWellModeledSubsetAndMandatoryError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NotWellModeledSubsetAndMandatoryError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<NotWellModeledSubsetAndMandatoryErrorType> getNotWellModeledSubsetAndMandatoryError();

	/**
	 * Returns the value of the '<em><b>Implied Internal Uniqueness Constraint Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedInternalUniquenessConstraintErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implied Internal Uniqueness Constraint Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ImpliedInternalUniquenessConstraintError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImpliedInternalUniquenessConstraintError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ImpliedInternalUniquenessConstraintErrorType> getImpliedInternalUniquenessConstraintError();

	/**
	 * Returns the value of the '<em><b>Object Type Requires Primary Supertype Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRequiresPrimarySupertypeErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type Requires Primary Supertype Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ObjectTypeRequiresPrimarySupertypeError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectTypeRequiresPrimarySupertypeError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ObjectTypeRequiresPrimarySupertypeErrorType> getObjectTypeRequiresPrimarySupertypeError();

	/**
	 * Returns the value of the '<em><b>Preferred Identifier Requires Mandatory Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.PreferredIdentifierRequiresMandatoryErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Identifier Requires Mandatory Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_PreferredIdentifierRequiresMandatoryError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PreferredIdentifierRequiresMandatoryError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PreferredIdentifierRequiresMandatoryErrorType> getPreferredIdentifierRequiresMandatoryError();

	/**
	 * Returns the value of the '<em><b>Compatible Supertypes Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleSupertypesErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Supertypes Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_CompatibleSupertypesError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompatibleSupertypesError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CompatibleSupertypesErrorType> getCompatibleSupertypesError();

	/**
	 * Returns the value of the '<em><b>Objectifying Instance Required Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectifyingInstanceRequiredErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectifying Instance Required Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ObjectifyingInstanceRequiredError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectifyingInstanceRequiredError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ObjectifyingInstanceRequiredErrorType> getObjectifyingInstanceRequiredError();

	/**
	 * Returns the value of the '<em><b>Objectified Instance Required Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedInstanceRequiredErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectified Instance Required Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ObjectifiedInstanceRequiredError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectifiedInstanceRequiredError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ObjectifiedInstanceRequiredErrorType> getObjectifiedInstanceRequiredError();

	/**
	 * Returns the value of the '<em><b>Compatible Value Type Instance Value Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleValueTypeInstanceValueErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compatible Value Type Instance Value Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_CompatibleValueTypeInstanceValueError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CompatibleValueTypeInstanceValueError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CompatibleValueTypeInstanceValueErrorType> getCompatibleValueTypeInstanceValueError();

	/**
	 * Returns the value of the '<em><b>Population Mandatory Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.PopulationMandatoryErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population Mandatory Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_PopulationMandatoryError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PopulationMandatoryError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PopulationMandatoryErrorType> getPopulationMandatoryError();

	/**
	 * Returns the value of the '<em><b>Population Uniqueness Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.PopulationUniquenessErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population Uniqueness Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_PopulationUniquenessError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PopulationUniquenessError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PopulationUniquenessErrorType> getPopulationUniquenessError();

	/**
	 * Returns the value of the '<em><b>Exclusion Contradicts Equality Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ExclusionContradictsEqualityErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusion Contradicts Equality Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ExclusionContradictsEqualityError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExclusionContradictsEqualityError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ExclusionContradictsEqualityErrorType> getExclusionContradictsEqualityError();

	/**
	 * Returns the value of the '<em><b>Exclusion Contradicts Subset Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ExclusionContradictsSubsetErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusion Contradicts Subset Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ExclusionContradictsSubsetError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExclusionContradictsSubsetError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ExclusionContradictsSubsetErrorType> getExclusionContradictsSubsetError();

	/**
	 * Returns the value of the '<em><b>Path Requires Root Object Type Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.PathRequiresRootObjectTypeErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Requires Root Object Type Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_PathRequiresRootObjectTypeError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PathRequiresRootObjectTypeError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PathRequiresRootObjectTypeErrorType> getPathRequiresRootObjectTypeError();

	/**
	 * Returns the value of the '<em><b>Path Start Role Follows Root Object Type Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.PathStartRoleFollowsRootObjectTypeErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Start Role Follows Root Object Type Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_PathStartRoleFollowsRootObjectTypeError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PathStartRoleFollowsRootObjectTypeError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PathStartRoleFollowsRootObjectTypeErrorType> getPathStartRoleFollowsRootObjectTypeError();

	/**
	 * Returns the value of the '<em><b>Joined Path Role Requires Compatible Role Player Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.JoinedPathRoleRequiresCompatibleRolePlayerErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joined Path Role Requires Compatible Role Player Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_JoinedPathRoleRequiresCompatibleRolePlayerError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='JoinedPathRoleRequiresCompatibleRolePlayerError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<JoinedPathRoleRequiresCompatibleRolePlayerErrorType> getJoinedPathRoleRequiresCompatibleRolePlayerError();

	/**
	 * Returns the value of the '<em><b>Correlated Path Role Requires Compatible Role Player Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.CorrelatedPathRoleRequiresCompatibleRolePlayerErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlated Path Role Requires Compatible Role Player Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_CorrelatedPathRoleRequiresCompatibleRolePlayerError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CorrelatedPathRoleRequiresCompatibleRolePlayerError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CorrelatedPathRoleRequiresCompatibleRolePlayerErrorType> getCorrelatedPathRoleRequiresCompatibleRolePlayerError();

	/**
	 * Returns the value of the '<em><b>Object Unifier Requires Compatible Object Types Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifierRequiresCompatibleObjectTypesErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Unifier Requires Compatible Object Types Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_ObjectUnifierRequiresCompatibleObjectTypesError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectUnifierRequiresCompatibleObjectTypesError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ObjectUnifierRequiresCompatibleObjectTypesErrorType> getObjectUnifierRequiresCompatibleObjectTypesError();

	/**
	 * Returns the value of the '<em><b>Path Same Fact Type Role Follows Join Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.PathSameFactTypeRoleFollowsJoinErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Same Fact Type Role Follows Join Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_PathSameFactTypeRoleFollowsJoinError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PathSameFactTypeRoleFollowsJoinError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PathSameFactTypeRoleFollowsJoinErrorType> getPathSameFactTypeRoleFollowsJoinError();

	/**
	 * Returns the value of the '<em><b>Path Outer Join Requires Optional Role Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.PathOuterJoinRequiresOptionalRoleErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Outer Join Requires Optional Role Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_PathOuterJoinRequiresOptionalRoleError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PathOuterJoinRequiresOptionalRoleError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PathOuterJoinRequiresOptionalRoleErrorType> getPathOuterJoinRequiresOptionalRoleError();

	/**
	 * Returns the value of the '<em><b>Calculated Path Value Requires Aggregation Context Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueRequiresAggregationContextErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculated Path Value Requires Aggregation Context Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_CalculatedPathValueRequiresAggregationContextError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CalculatedPathValueRequiresAggregationContextError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CalculatedPathValueRequiresAggregationContextErrorType> getCalculatedPathValueRequiresAggregationContextError();

	/**
	 * Returns the value of the '<em><b>Calculated Path Value Requires Function Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueRequiresFunctionErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculated Path Value Requires Function Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_CalculatedPathValueRequiresFunctionError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CalculatedPathValueRequiresFunctionError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CalculatedPathValueRequiresFunctionErrorType> getCalculatedPathValueRequiresFunctionError();

	/**
	 * Returns the value of the '<em><b>Calculated Path Value Must Be Consumed Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueMustBeConsumedErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculated Path Value Must Be Consumed Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_CalculatedPathValueMustBeConsumedError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CalculatedPathValueMustBeConsumedError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CalculatedPathValueMustBeConsumedErrorType> getCalculatedPathValueMustBeConsumedError();

	/**
	 * Returns the value of the '<em><b>Calculated Path Value Parameter Binding Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueParameterBindingErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculated Path Value Parameter Binding Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_CalculatedPathValueParameterBindingError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CalculatedPathValueParameterBindingError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CalculatedPathValueParameterBindingErrorType> getCalculatedPathValueParameterBindingError();

	/**
	 * Returns the value of the '<em><b>Fact Type Derivation Requires Projection Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationRequiresProjectionErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type Derivation Requires Projection Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_FactTypeDerivationRequiresProjectionError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FactTypeDerivationRequiresProjectionError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FactTypeDerivationRequiresProjectionErrorType> getFactTypeDerivationRequiresProjectionError();

	/**
	 * Returns the value of the '<em><b>Query Derivation Requires Projection Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationRequiresProjectionErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Derivation Requires Projection Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_QueryDerivationRequiresProjectionError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='QueryDerivationRequiresProjectionError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<QueryDerivationRequiresProjectionErrorType> getQueryDerivationRequiresProjectionError();

	/**
	 * Returns the value of the '<em><b>Partial Fact Type Derivation Projection Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.PartialFactTypeDerivationProjectionErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial Fact Type Derivation Projection Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_PartialFactTypeDerivationProjectionError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PartialFactTypeDerivationProjectionError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PartialFactTypeDerivationProjectionErrorType> getPartialFactTypeDerivationProjectionError();

	/**
	 * Returns the value of the '<em><b>Partial Query Derivation Projection Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.PartialQueryDerivationProjectionErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial Query Derivation Projection Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_PartialQueryDerivationProjectionError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PartialQueryDerivationProjectionError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PartialQueryDerivationProjectionErrorType> getPartialQueryDerivationProjectionError();

	/**
	 * Returns the value of the '<em><b>Join Path Requires Projection Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.JoinPathRequiresProjectionErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Path Requires Projection Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_JoinPathRequiresProjectionError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='JoinPathRequiresProjectionError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<JoinPathRequiresProjectionErrorType> getJoinPathRequiresProjectionError();

	/**
	 * Returns the value of the '<em><b>Partial Join Path Projection Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.PartialJoinPathProjectionErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial Join Path Projection Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_PartialJoinPathProjectionError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PartialJoinPathProjectionError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PartialJoinPathProjectionErrorType> getPartialJoinPathProjectionError();

	/**
	 * Returns the value of the '<em><b>Derived Fact Type Role Projection Compatibility Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.DerivedFactTypeRoleProjectionCompatibilityErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Fact Type Role Projection Compatibility Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_DerivedFactTypeRoleProjectionCompatibilityError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DerivedFactTypeRoleProjectionCompatibilityError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DerivedFactTypeRoleProjectionCompatibilityErrorType> getDerivedFactTypeRoleProjectionCompatibilityError();

	/**
	 * Returns the value of the '<em><b>Query Role Projection Compatibility Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.QueryRoleProjectionCompatibilityErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Role Projection Compatibility Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_QueryRoleProjectionCompatibilityError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='QueryRoleProjectionCompatibilityError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<QueryRoleProjectionCompatibilityErrorType> getQueryRoleProjectionCompatibilityError();

	/**
	 * Returns the value of the '<em><b>Joined Constraint Role Projection Compatibility Error</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.JoinedConstraintRoleProjectionCompatibilityErrorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joined Constraint Role Projection Compatibility Error</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelErrorsType_JoinedConstraintRoleProjectionCompatibilityError()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='JoinedConstraintRoleProjectionCompatibilityError' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<JoinedConstraintRoleProjectionCompatibilityErrorType> getJoinedConstraintRoleProjectionCompatibilityError();

} // ModelErrorsType
