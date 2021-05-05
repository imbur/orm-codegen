/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueMustBeConsumedErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueParameterBindingErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueRequiresAggregationContextErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueRequiresFunctionErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.CardinalityRangeOverlapErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.CompatibleRolePlayerTypeErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.CompatibleSupertypesErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.CompatibleValueTypeInstanceValueErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ConstraintDuplicateNameErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.CorrelatedPathRoleRequiresCompatibleRolePlayerErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.DataTypeNotSpecifiedErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.DerivedFactTypeRoleProjectionCompatibilityErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.DuplicateReadingSignatureErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeRequiresReferenceSchemeErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.EqualityConstraintImpliedByMandatoryConstraintsErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.EqualityImpliedByMandatoryErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ExclusionContradictsEqualityErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ExclusionContradictsMandatoryErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ExclusionContradictsSubsetErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ExternalConstraintRoleSequenceArityMismatchErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationRequiresProjectionErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRequiresInternalUniquenessConstraintErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRequiresReadingErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintContradictsInternalUniquenessConstraintErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintExactlyOneErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintMinMaxErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintNonRestrictiveRangeErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintViolatedByUniquenessConstraintErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.FunctionDuplicateNameErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.GroupDuplicateNameErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.GroupMembershipContradictionErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ImplicationErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ImpliedInternalUniquenessConstraintErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.JoinPathRequiredErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.JoinPathRequiresProjectionErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.JoinedConstraintRoleProjectionCompatibilityErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.JoinedPathRoleRequiresCompatibleRolePlayerErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.MaxValueMismatchErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.MinValueMismatchErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ModelError;
import edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType;
import edu.neumont.schemas.orm._2006._04.orm.core.NMinusOneErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.NotWellModeledSubsetAndMandatoryErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeDuplicateNameErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRequiresPrimarySupertypeErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifierRequiresCompatibleObjectTypesErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedInstanceRequiredErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectifyingInstanceRequiredErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.PartialFactTypeDerivationProjectionErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.PartialJoinPathProjectionErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.PartialQueryDerivationProjectionErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.PathOuterJoinRequiresOptionalRoleErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.PathRequiresRootObjectTypeErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.PathSameFactTypeRoleFollowsJoinErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.PathStartRoleFollowsRootObjectTypeErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.PopulationMandatoryErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.PopulationUniquenessErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.PreferredIdentifierRequiresMandatoryErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationRequiresProjectionErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.QueryRoleProjectionCompatibilityErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ReadingRequiresUserModificationErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhraseDuplicateNameErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.RingConstraintTypeNotSpecifiedErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.RolePlayerRequiredErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.SubsetConstraintImpliedByMandatoryConstraintsErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.TooFewEntityTypeRoleInstancesErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.TooFewFactTypeRoleInstancesErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.TooFewReadingRolesErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.TooFewRoleSequencesErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.TooManyReadingRolesErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.TooManyRoleSequencesErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonConstraintOperatorNotSpecifiedErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonRolesNotComparableErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeOverlapErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeDetachedErrorType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Errors Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getExtensionModelErrorGroup <em>Extension Model Error Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getExtensionModelError <em>Extension Model Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getConstraintDuplicateNameError <em>Constraint Duplicate Name Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getObjectTypeDuplicateNameError <em>Object Type Duplicate Name Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getRecognizedPhraseDuplicateNameError <em>Recognized Phrase Duplicate Name Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getGroupDuplicateNameError <em>Group Duplicate Name Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getFunctionDuplicateNameError <em>Function Duplicate Name Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getDuplicateReadingSignatureError <em>Duplicate Reading Signature Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getGroupMembershipContradictionError <em>Group Membership Contradiction Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getExternalConstraintRoleSequenceArityMismatchError <em>External Constraint Role Sequence Arity Mismatch Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getFactTypeRequiresInternalUniquenessConstraintError <em>Fact Type Requires Internal Uniqueness Constraint Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getFactTypeRequiresReadingError <em>Fact Type Requires Reading Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getTooFewEntityTypeRoleInstancesError <em>Too Few Entity Type Role Instances Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getTooFewFactTypeRoleInstancesError <em>Too Few Fact Type Role Instances Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getTooFewReadingRolesError <em>Too Few Reading Roles Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getReadingRequiresUserModificationError <em>Reading Requires User Modification Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getTooFewRoleSequencesError <em>Too Few Role Sequences Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getTooManyReadingRolesError <em>Too Many Reading Roles Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getTooManyRoleSequencesError <em>Too Many Role Sequences Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getDataTypeNotSpecifiedError <em>Data Type Not Specified Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getNMinusOneError <em>NMinus One Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getCompatibleRolePlayerTypeError <em>Compatible Role Player Type Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getSupersetRoleOfSubtypeSubsetConstraintNotSubtypeError <em>Superset Role Of Subtype Subset Constraint Not Subtype Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getJoinPathRequiredError <em>Join Path Required Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getRolePlayerRequiredError <em>Role Player Required Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getEqualityImpliedByMandatoryError <em>Equality Implied By Mandatory Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getEntityTypeRequiresReferenceSchemeError <em>Entity Type Requires Reference Scheme Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getFrequencyConstraintMinMaxError <em>Frequency Constraint Min Max Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getFrequencyConstraintExactlyOneError <em>Frequency Constraint Exactly One Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getFrequencyConstraintNonRestrictiveRangeError <em>Frequency Constraint Non Restrictive Range Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getFrequencyConstraintContradictsInternalUniquenessConstraintError <em>Frequency Constraint Contradicts Internal Uniqueness Constraint Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getFrequencyConstraintViolatedByUniquenessConstraintError <em>Frequency Constraint Violated By Uniqueness Constraint Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getMinValueMismatchError <em>Min Value Mismatch Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getMaxValueMismatchError <em>Max Value Mismatch Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getCardinalityRangeOverlapError <em>Cardinality Range Overlap Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getValueRangeOverlapError <em>Value Range Overlap Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getValueTypeDetachedError <em>Value Type Detached Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getRingConstraintTypeNotSpecifiedError <em>Ring Constraint Type Not Specified Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getValueComparisonConstraintOperatorNotSpecifiedError <em>Value Comparison Constraint Operator Not Specified Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getValueComparisonRolesNotComparableError <em>Value Comparison Roles Not Comparable Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getImplicationError <em>Implication Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getSubsetConstraintImpliedByMandatoryConstraintsError <em>Subset Constraint Implied By Mandatory Constraints Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getEqualityConstraintImpliedByMandatoryConstraintsError <em>Equality Constraint Implied By Mandatory Constraints Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getExclusionContradictsMandatoryError <em>Exclusion Contradicts Mandatory Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getNotWellModeledSubsetAndMandatoryError <em>Not Well Modeled Subset And Mandatory Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getImpliedInternalUniquenessConstraintError <em>Implied Internal Uniqueness Constraint Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getObjectTypeRequiresPrimarySupertypeError <em>Object Type Requires Primary Supertype Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getPreferredIdentifierRequiresMandatoryError <em>Preferred Identifier Requires Mandatory Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getCompatibleSupertypesError <em>Compatible Supertypes Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getObjectifyingInstanceRequiredError <em>Objectifying Instance Required Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getObjectifiedInstanceRequiredError <em>Objectified Instance Required Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getCompatibleValueTypeInstanceValueError <em>Compatible Value Type Instance Value Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getPopulationMandatoryError <em>Population Mandatory Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getPopulationUniquenessError <em>Population Uniqueness Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getExclusionContradictsEqualityError <em>Exclusion Contradicts Equality Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getExclusionContradictsSubsetError <em>Exclusion Contradicts Subset Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getPathRequiresRootObjectTypeError <em>Path Requires Root Object Type Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getPathStartRoleFollowsRootObjectTypeError <em>Path Start Role Follows Root Object Type Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getJoinedPathRoleRequiresCompatibleRolePlayerError <em>Joined Path Role Requires Compatible Role Player Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getCorrelatedPathRoleRequiresCompatibleRolePlayerError <em>Correlated Path Role Requires Compatible Role Player Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getObjectUnifierRequiresCompatibleObjectTypesError <em>Object Unifier Requires Compatible Object Types Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getPathSameFactTypeRoleFollowsJoinError <em>Path Same Fact Type Role Follows Join Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getPathOuterJoinRequiresOptionalRoleError <em>Path Outer Join Requires Optional Role Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getCalculatedPathValueRequiresAggregationContextError <em>Calculated Path Value Requires Aggregation Context Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getCalculatedPathValueRequiresFunctionError <em>Calculated Path Value Requires Function Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getCalculatedPathValueMustBeConsumedError <em>Calculated Path Value Must Be Consumed Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getCalculatedPathValueParameterBindingError <em>Calculated Path Value Parameter Binding Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getFactTypeDerivationRequiresProjectionError <em>Fact Type Derivation Requires Projection Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getQueryDerivationRequiresProjectionError <em>Query Derivation Requires Projection Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getPartialFactTypeDerivationProjectionError <em>Partial Fact Type Derivation Projection Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getPartialQueryDerivationProjectionError <em>Partial Query Derivation Projection Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getJoinPathRequiresProjectionError <em>Join Path Requires Projection Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getPartialJoinPathProjectionError <em>Partial Join Path Projection Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getDerivedFactTypeRoleProjectionCompatibilityError <em>Derived Fact Type Role Projection Compatibility Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getQueryRoleProjectionCompatibilityError <em>Query Role Projection Compatibility Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelErrorsTypeImpl#getJoinedConstraintRoleProjectionCompatibilityError <em>Joined Constraint Role Projection Compatibility Error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelErrorsTypeImpl extends MinimalEObjectImpl.Container implements ModelErrorsType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelErrorsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getModelErrorsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.MODEL_ERRORS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getExtensionModelErrorGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(CorePackage.eINSTANCE.getModelErrorsType_ExtensionModelErrorGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelError> getExtensionModelError() {
		return getExtensionModelErrorGroup().list(CorePackage.eINSTANCE.getModelErrorsType_ExtensionModelError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintDuplicateNameErrorType> getConstraintDuplicateNameError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_ConstraintDuplicateNameError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectTypeDuplicateNameErrorType> getObjectTypeDuplicateNameError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_ObjectTypeDuplicateNameError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecognizedPhraseDuplicateNameErrorType> getRecognizedPhraseDuplicateNameError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_RecognizedPhraseDuplicateNameError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupDuplicateNameErrorType> getGroupDuplicateNameError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_GroupDuplicateNameError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionDuplicateNameErrorType> getFunctionDuplicateNameError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_FunctionDuplicateNameError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DuplicateReadingSignatureErrorType> getDuplicateReadingSignatureError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_DuplicateReadingSignatureError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupMembershipContradictionErrorType> getGroupMembershipContradictionError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_GroupMembershipContradictionError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalConstraintRoleSequenceArityMismatchErrorType> getExternalConstraintRoleSequenceArityMismatchError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_ExternalConstraintRoleSequenceArityMismatchError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FactTypeRequiresInternalUniquenessConstraintErrorType> getFactTypeRequiresInternalUniquenessConstraintError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_FactTypeRequiresInternalUniquenessConstraintError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FactTypeRequiresReadingErrorType> getFactTypeRequiresReadingError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_FactTypeRequiresReadingError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TooFewEntityTypeRoleInstancesErrorType> getTooFewEntityTypeRoleInstancesError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_TooFewEntityTypeRoleInstancesError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TooFewFactTypeRoleInstancesErrorType> getTooFewFactTypeRoleInstancesError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_TooFewFactTypeRoleInstancesError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TooFewReadingRolesErrorType> getTooFewReadingRolesError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_TooFewReadingRolesError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReadingRequiresUserModificationErrorType> getReadingRequiresUserModificationError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_ReadingRequiresUserModificationError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TooFewRoleSequencesErrorType> getTooFewRoleSequencesError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_TooFewRoleSequencesError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TooManyReadingRolesErrorType> getTooManyReadingRolesError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_TooManyReadingRolesError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TooManyRoleSequencesErrorType> getTooManyRoleSequencesError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_TooManyRoleSequencesError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataTypeNotSpecifiedErrorType> getDataTypeNotSpecifiedError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_DataTypeNotSpecifiedError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NMinusOneErrorType> getNMinusOneError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_NMinusOneError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompatibleRolePlayerTypeErrorType> getCompatibleRolePlayerTypeError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_CompatibleRolePlayerTypeError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType> getSupersetRoleOfSubtypeSubsetConstraintNotSubtypeError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_SupersetRoleOfSubtypeSubsetConstraintNotSubtypeError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinPathRequiredErrorType> getJoinPathRequiredError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_JoinPathRequiredError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RolePlayerRequiredErrorType> getRolePlayerRequiredError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_RolePlayerRequiredError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqualityImpliedByMandatoryErrorType> getEqualityImpliedByMandatoryError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_EqualityImpliedByMandatoryError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityTypeRequiresReferenceSchemeErrorType> getEntityTypeRequiresReferenceSchemeError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_EntityTypeRequiresReferenceSchemeError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrequencyConstraintMinMaxErrorType> getFrequencyConstraintMinMaxError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_FrequencyConstraintMinMaxError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrequencyConstraintExactlyOneErrorType> getFrequencyConstraintExactlyOneError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_FrequencyConstraintExactlyOneError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrequencyConstraintNonRestrictiveRangeErrorType> getFrequencyConstraintNonRestrictiveRangeError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_FrequencyConstraintNonRestrictiveRangeError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrequencyConstraintContradictsInternalUniquenessConstraintErrorType> getFrequencyConstraintContradictsInternalUniquenessConstraintError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_FrequencyConstraintContradictsInternalUniquenessConstraintError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrequencyConstraintViolatedByUniquenessConstraintErrorType> getFrequencyConstraintViolatedByUniquenessConstraintError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_FrequencyConstraintViolatedByUniquenessConstraintError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MinValueMismatchErrorType> getMinValueMismatchError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_MinValueMismatchError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MaxValueMismatchErrorType> getMaxValueMismatchError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_MaxValueMismatchError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CardinalityRangeOverlapErrorType> getCardinalityRangeOverlapError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_CardinalityRangeOverlapError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueRangeOverlapErrorType> getValueRangeOverlapError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_ValueRangeOverlapError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueTypeDetachedErrorType> getValueTypeDetachedError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_ValueTypeDetachedError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RingConstraintTypeNotSpecifiedErrorType> getRingConstraintTypeNotSpecifiedError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_RingConstraintTypeNotSpecifiedError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueComparisonConstraintOperatorNotSpecifiedErrorType> getValueComparisonConstraintOperatorNotSpecifiedError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_ValueComparisonConstraintOperatorNotSpecifiedError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueComparisonRolesNotComparableErrorType> getValueComparisonRolesNotComparableError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_ValueComparisonRolesNotComparableError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplicationErrorType> getImplicationError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_ImplicationError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubsetConstraintImpliedByMandatoryConstraintsErrorType> getSubsetConstraintImpliedByMandatoryConstraintsError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_SubsetConstraintImpliedByMandatoryConstraintsError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqualityConstraintImpliedByMandatoryConstraintsErrorType> getEqualityConstraintImpliedByMandatoryConstraintsError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_EqualityConstraintImpliedByMandatoryConstraintsError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExclusionContradictsMandatoryErrorType> getExclusionContradictsMandatoryError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_ExclusionContradictsMandatoryError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NotWellModeledSubsetAndMandatoryErrorType> getNotWellModeledSubsetAndMandatoryError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_NotWellModeledSubsetAndMandatoryError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImpliedInternalUniquenessConstraintErrorType> getImpliedInternalUniquenessConstraintError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_ImpliedInternalUniquenessConstraintError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectTypeRequiresPrimarySupertypeErrorType> getObjectTypeRequiresPrimarySupertypeError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_ObjectTypeRequiresPrimarySupertypeError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreferredIdentifierRequiresMandatoryErrorType> getPreferredIdentifierRequiresMandatoryError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_PreferredIdentifierRequiresMandatoryError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompatibleSupertypesErrorType> getCompatibleSupertypesError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_CompatibleSupertypesError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectifyingInstanceRequiredErrorType> getObjectifyingInstanceRequiredError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_ObjectifyingInstanceRequiredError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectifiedInstanceRequiredErrorType> getObjectifiedInstanceRequiredError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_ObjectifiedInstanceRequiredError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompatibleValueTypeInstanceValueErrorType> getCompatibleValueTypeInstanceValueError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_CompatibleValueTypeInstanceValueError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PopulationMandatoryErrorType> getPopulationMandatoryError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_PopulationMandatoryError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PopulationUniquenessErrorType> getPopulationUniquenessError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_PopulationUniquenessError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExclusionContradictsEqualityErrorType> getExclusionContradictsEqualityError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_ExclusionContradictsEqualityError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExclusionContradictsSubsetErrorType> getExclusionContradictsSubsetError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_ExclusionContradictsSubsetError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathRequiresRootObjectTypeErrorType> getPathRequiresRootObjectTypeError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_PathRequiresRootObjectTypeError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathStartRoleFollowsRootObjectTypeErrorType> getPathStartRoleFollowsRootObjectTypeError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_PathStartRoleFollowsRootObjectTypeError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinedPathRoleRequiresCompatibleRolePlayerErrorType> getJoinedPathRoleRequiresCompatibleRolePlayerError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_JoinedPathRoleRequiresCompatibleRolePlayerError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CorrelatedPathRoleRequiresCompatibleRolePlayerErrorType> getCorrelatedPathRoleRequiresCompatibleRolePlayerError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_CorrelatedPathRoleRequiresCompatibleRolePlayerError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectUnifierRequiresCompatibleObjectTypesErrorType> getObjectUnifierRequiresCompatibleObjectTypesError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_ObjectUnifierRequiresCompatibleObjectTypesError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathSameFactTypeRoleFollowsJoinErrorType> getPathSameFactTypeRoleFollowsJoinError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_PathSameFactTypeRoleFollowsJoinError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathOuterJoinRequiresOptionalRoleErrorType> getPathOuterJoinRequiresOptionalRoleError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_PathOuterJoinRequiresOptionalRoleError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CalculatedPathValueRequiresAggregationContextErrorType> getCalculatedPathValueRequiresAggregationContextError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_CalculatedPathValueRequiresAggregationContextError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CalculatedPathValueRequiresFunctionErrorType> getCalculatedPathValueRequiresFunctionError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_CalculatedPathValueRequiresFunctionError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CalculatedPathValueMustBeConsumedErrorType> getCalculatedPathValueMustBeConsumedError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_CalculatedPathValueMustBeConsumedError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CalculatedPathValueParameterBindingErrorType> getCalculatedPathValueParameterBindingError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_CalculatedPathValueParameterBindingError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FactTypeDerivationRequiresProjectionErrorType> getFactTypeDerivationRequiresProjectionError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_FactTypeDerivationRequiresProjectionError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryDerivationRequiresProjectionErrorType> getQueryDerivationRequiresProjectionError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_QueryDerivationRequiresProjectionError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartialFactTypeDerivationProjectionErrorType> getPartialFactTypeDerivationProjectionError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_PartialFactTypeDerivationProjectionError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartialQueryDerivationProjectionErrorType> getPartialQueryDerivationProjectionError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_PartialQueryDerivationProjectionError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinPathRequiresProjectionErrorType> getJoinPathRequiresProjectionError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_JoinPathRequiresProjectionError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PartialJoinPathProjectionErrorType> getPartialJoinPathProjectionError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_PartialJoinPathProjectionError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DerivedFactTypeRoleProjectionCompatibilityErrorType> getDerivedFactTypeRoleProjectionCompatibilityError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_DerivedFactTypeRoleProjectionCompatibilityError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryRoleProjectionCompatibilityErrorType> getQueryRoleProjectionCompatibilityError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_QueryRoleProjectionCompatibilityError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinedConstraintRoleProjectionCompatibilityErrorType> getJoinedConstraintRoleProjectionCompatibilityError() {
		return getGroup().list(CorePackage.eINSTANCE.getModelErrorsType_JoinedConstraintRoleProjectionCompatibilityError());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.MODEL_ERRORS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__EXTENSION_MODEL_ERROR_GROUP:
				return ((InternalEList<?>)getExtensionModelErrorGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__EXTENSION_MODEL_ERROR:
				return ((InternalEList<?>)getExtensionModelError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__CONSTRAINT_DUPLICATE_NAME_ERROR:
				return ((InternalEList<?>)getConstraintDuplicateNameError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__OBJECT_TYPE_DUPLICATE_NAME_ERROR:
				return ((InternalEList<?>)getObjectTypeDuplicateNameError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__RECOGNIZED_PHRASE_DUPLICATE_NAME_ERROR:
				return ((InternalEList<?>)getRecognizedPhraseDuplicateNameError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__GROUP_DUPLICATE_NAME_ERROR:
				return ((InternalEList<?>)getGroupDuplicateNameError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__FUNCTION_DUPLICATE_NAME_ERROR:
				return ((InternalEList<?>)getFunctionDuplicateNameError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__DUPLICATE_READING_SIGNATURE_ERROR:
				return ((InternalEList<?>)getDuplicateReadingSignatureError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__GROUP_MEMBERSHIP_CONTRADICTION_ERROR:
				return ((InternalEList<?>)getGroupMembershipContradictionError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__EXTERNAL_CONSTRAINT_ROLE_SEQUENCE_ARITY_MISMATCH_ERROR:
				return ((InternalEList<?>)getExternalConstraintRoleSequenceArityMismatchError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__FACT_TYPE_REQUIRES_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR:
				return ((InternalEList<?>)getFactTypeRequiresInternalUniquenessConstraintError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__FACT_TYPE_REQUIRES_READING_ERROR:
				return ((InternalEList<?>)getFactTypeRequiresReadingError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_ENTITY_TYPE_ROLE_INSTANCES_ERROR:
				return ((InternalEList<?>)getTooFewEntityTypeRoleInstancesError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_FACT_TYPE_ROLE_INSTANCES_ERROR:
				return ((InternalEList<?>)getTooFewFactTypeRoleInstancesError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_READING_ROLES_ERROR:
				return ((InternalEList<?>)getTooFewReadingRolesError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__READING_REQUIRES_USER_MODIFICATION_ERROR:
				return ((InternalEList<?>)getReadingRequiresUserModificationError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_ROLE_SEQUENCES_ERROR:
				return ((InternalEList<?>)getTooFewRoleSequencesError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__TOO_MANY_READING_ROLES_ERROR:
				return ((InternalEList<?>)getTooManyReadingRolesError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__TOO_MANY_ROLE_SEQUENCES_ERROR:
				return ((InternalEList<?>)getTooManyRoleSequencesError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__DATA_TYPE_NOT_SPECIFIED_ERROR:
				return ((InternalEList<?>)getDataTypeNotSpecifiedError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__NMINUS_ONE_ERROR:
				return ((InternalEList<?>)getNMinusOneError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__COMPATIBLE_ROLE_PLAYER_TYPE_ERROR:
				return ((InternalEList<?>)getCompatibleRolePlayerTypeError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__SUPERSET_ROLE_OF_SUBTYPE_SUBSET_CONSTRAINT_NOT_SUBTYPE_ERROR:
				return ((InternalEList<?>)getSupersetRoleOfSubtypeSubsetConstraintNotSubtypeError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__JOIN_PATH_REQUIRED_ERROR:
				return ((InternalEList<?>)getJoinPathRequiredError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__ROLE_PLAYER_REQUIRED_ERROR:
				return ((InternalEList<?>)getRolePlayerRequiredError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__EQUALITY_IMPLIED_BY_MANDATORY_ERROR:
				return ((InternalEList<?>)getEqualityImpliedByMandatoryError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__ENTITY_TYPE_REQUIRES_REFERENCE_SCHEME_ERROR:
				return ((InternalEList<?>)getEntityTypeRequiresReferenceSchemeError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_MIN_MAX_ERROR:
				return ((InternalEList<?>)getFrequencyConstraintMinMaxError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_EXACTLY_ONE_ERROR:
				return ((InternalEList<?>)getFrequencyConstraintExactlyOneError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_NON_RESTRICTIVE_RANGE_ERROR:
				return ((InternalEList<?>)getFrequencyConstraintNonRestrictiveRangeError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR:
				return ((InternalEList<?>)getFrequencyConstraintContradictsInternalUniquenessConstraintError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_VIOLATED_BY_UNIQUENESS_CONSTRAINT_ERROR:
				return ((InternalEList<?>)getFrequencyConstraintViolatedByUniquenessConstraintError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__MIN_VALUE_MISMATCH_ERROR:
				return ((InternalEList<?>)getMinValueMismatchError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__MAX_VALUE_MISMATCH_ERROR:
				return ((InternalEList<?>)getMaxValueMismatchError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__CARDINALITY_RANGE_OVERLAP_ERROR:
				return ((InternalEList<?>)getCardinalityRangeOverlapError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_RANGE_OVERLAP_ERROR:
				return ((InternalEList<?>)getValueRangeOverlapError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_TYPE_DETACHED_ERROR:
				return ((InternalEList<?>)getValueTypeDetachedError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__RING_CONSTRAINT_TYPE_NOT_SPECIFIED_ERROR:
				return ((InternalEList<?>)getRingConstraintTypeNotSpecifiedError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_COMPARISON_CONSTRAINT_OPERATOR_NOT_SPECIFIED_ERROR:
				return ((InternalEList<?>)getValueComparisonConstraintOperatorNotSpecifiedError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_COMPARISON_ROLES_NOT_COMPARABLE_ERROR:
				return ((InternalEList<?>)getValueComparisonRolesNotComparableError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__IMPLICATION_ERROR:
				return ((InternalEList<?>)getImplicationError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__SUBSET_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR:
				return ((InternalEList<?>)getSubsetConstraintImpliedByMandatoryConstraintsError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__EQUALITY_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR:
				return ((InternalEList<?>)getEqualityConstraintImpliedByMandatoryConstraintsError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__EXCLUSION_CONTRADICTS_MANDATORY_ERROR:
				return ((InternalEList<?>)getExclusionContradictsMandatoryError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__NOT_WELL_MODELED_SUBSET_AND_MANDATORY_ERROR:
				return ((InternalEList<?>)getNotWellModeledSubsetAndMandatoryError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__IMPLIED_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR:
				return ((InternalEList<?>)getImpliedInternalUniquenessConstraintError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__OBJECT_TYPE_REQUIRES_PRIMARY_SUPERTYPE_ERROR:
				return ((InternalEList<?>)getObjectTypeRequiresPrimarySupertypeError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__PREFERRED_IDENTIFIER_REQUIRES_MANDATORY_ERROR:
				return ((InternalEList<?>)getPreferredIdentifierRequiresMandatoryError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__COMPATIBLE_SUPERTYPES_ERROR:
				return ((InternalEList<?>)getCompatibleSupertypesError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__OBJECTIFYING_INSTANCE_REQUIRED_ERROR:
				return ((InternalEList<?>)getObjectifyingInstanceRequiredError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__OBJECTIFIED_INSTANCE_REQUIRED_ERROR:
				return ((InternalEList<?>)getObjectifiedInstanceRequiredError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__COMPATIBLE_VALUE_TYPE_INSTANCE_VALUE_ERROR:
				return ((InternalEList<?>)getCompatibleValueTypeInstanceValueError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__POPULATION_MANDATORY_ERROR:
				return ((InternalEList<?>)getPopulationMandatoryError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__POPULATION_UNIQUENESS_ERROR:
				return ((InternalEList<?>)getPopulationUniquenessError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__EXCLUSION_CONTRADICTS_EQUALITY_ERROR:
				return ((InternalEList<?>)getExclusionContradictsEqualityError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__EXCLUSION_CONTRADICTS_SUBSET_ERROR:
				return ((InternalEList<?>)getExclusionContradictsSubsetError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR:
				return ((InternalEList<?>)getPathRequiresRootObjectTypeError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__PATH_START_ROLE_FOLLOWS_ROOT_OBJECT_TYPE_ERROR:
				return ((InternalEList<?>)getPathStartRoleFollowsRootObjectTypeError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__JOINED_PATH_ROLE_REQUIRES_COMPATIBLE_ROLE_PLAYER_ERROR:
				return ((InternalEList<?>)getJoinedPathRoleRequiresCompatibleRolePlayerError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__CORRELATED_PATH_ROLE_REQUIRES_COMPATIBLE_ROLE_PLAYER_ERROR:
				return ((InternalEList<?>)getCorrelatedPathRoleRequiresCompatibleRolePlayerError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__OBJECT_UNIFIER_REQUIRES_COMPATIBLE_OBJECT_TYPES_ERROR:
				return ((InternalEList<?>)getObjectUnifierRequiresCompatibleObjectTypesError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__PATH_SAME_FACT_TYPE_ROLE_FOLLOWS_JOIN_ERROR:
				return ((InternalEList<?>)getPathSameFactTypeRoleFollowsJoinError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__PATH_OUTER_JOIN_REQUIRES_OPTIONAL_ROLE_ERROR:
				return ((InternalEList<?>)getPathOuterJoinRequiresOptionalRoleError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_REQUIRES_AGGREGATION_CONTEXT_ERROR:
				return ((InternalEList<?>)getCalculatedPathValueRequiresAggregationContextError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_REQUIRES_FUNCTION_ERROR:
				return ((InternalEList<?>)getCalculatedPathValueRequiresFunctionError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_MUST_BE_CONSUMED_ERROR:
				return ((InternalEList<?>)getCalculatedPathValueMustBeConsumedError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_PARAMETER_BINDING_ERROR:
				return ((InternalEList<?>)getCalculatedPathValueParameterBindingError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__FACT_TYPE_DERIVATION_REQUIRES_PROJECTION_ERROR:
				return ((InternalEList<?>)getFactTypeDerivationRequiresProjectionError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__QUERY_DERIVATION_REQUIRES_PROJECTION_ERROR:
				return ((InternalEList<?>)getQueryDerivationRequiresProjectionError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__PARTIAL_FACT_TYPE_DERIVATION_PROJECTION_ERROR:
				return ((InternalEList<?>)getPartialFactTypeDerivationProjectionError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__PARTIAL_QUERY_DERIVATION_PROJECTION_ERROR:
				return ((InternalEList<?>)getPartialQueryDerivationProjectionError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__JOIN_PATH_REQUIRES_PROJECTION_ERROR:
				return ((InternalEList<?>)getJoinPathRequiresProjectionError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__PARTIAL_JOIN_PATH_PROJECTION_ERROR:
				return ((InternalEList<?>)getPartialJoinPathProjectionError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__DERIVED_FACT_TYPE_ROLE_PROJECTION_COMPATIBILITY_ERROR:
				return ((InternalEList<?>)getDerivedFactTypeRoleProjectionCompatibilityError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__QUERY_ROLE_PROJECTION_COMPATIBILITY_ERROR:
				return ((InternalEList<?>)getQueryRoleProjectionCompatibilityError()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_ERRORS_TYPE__JOINED_CONSTRAINT_ROLE_PROJECTION_COMPATIBILITY_ERROR:
				return ((InternalEList<?>)getJoinedConstraintRoleProjectionCompatibilityError()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.MODEL_ERRORS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.MODEL_ERRORS_TYPE__EXTENSION_MODEL_ERROR_GROUP:
				if (coreType) return getExtensionModelErrorGroup();
				return ((FeatureMap.Internal)getExtensionModelErrorGroup()).getWrapper();
			case CorePackage.MODEL_ERRORS_TYPE__EXTENSION_MODEL_ERROR:
				return getExtensionModelError();
			case CorePackage.MODEL_ERRORS_TYPE__CONSTRAINT_DUPLICATE_NAME_ERROR:
				return getConstraintDuplicateNameError();
			case CorePackage.MODEL_ERRORS_TYPE__OBJECT_TYPE_DUPLICATE_NAME_ERROR:
				return getObjectTypeDuplicateNameError();
			case CorePackage.MODEL_ERRORS_TYPE__RECOGNIZED_PHRASE_DUPLICATE_NAME_ERROR:
				return getRecognizedPhraseDuplicateNameError();
			case CorePackage.MODEL_ERRORS_TYPE__GROUP_DUPLICATE_NAME_ERROR:
				return getGroupDuplicateNameError();
			case CorePackage.MODEL_ERRORS_TYPE__FUNCTION_DUPLICATE_NAME_ERROR:
				return getFunctionDuplicateNameError();
			case CorePackage.MODEL_ERRORS_TYPE__DUPLICATE_READING_SIGNATURE_ERROR:
				return getDuplicateReadingSignatureError();
			case CorePackage.MODEL_ERRORS_TYPE__GROUP_MEMBERSHIP_CONTRADICTION_ERROR:
				return getGroupMembershipContradictionError();
			case CorePackage.MODEL_ERRORS_TYPE__EXTERNAL_CONSTRAINT_ROLE_SEQUENCE_ARITY_MISMATCH_ERROR:
				return getExternalConstraintRoleSequenceArityMismatchError();
			case CorePackage.MODEL_ERRORS_TYPE__FACT_TYPE_REQUIRES_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR:
				return getFactTypeRequiresInternalUniquenessConstraintError();
			case CorePackage.MODEL_ERRORS_TYPE__FACT_TYPE_REQUIRES_READING_ERROR:
				return getFactTypeRequiresReadingError();
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_ENTITY_TYPE_ROLE_INSTANCES_ERROR:
				return getTooFewEntityTypeRoleInstancesError();
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_FACT_TYPE_ROLE_INSTANCES_ERROR:
				return getTooFewFactTypeRoleInstancesError();
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_READING_ROLES_ERROR:
				return getTooFewReadingRolesError();
			case CorePackage.MODEL_ERRORS_TYPE__READING_REQUIRES_USER_MODIFICATION_ERROR:
				return getReadingRequiresUserModificationError();
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_ROLE_SEQUENCES_ERROR:
				return getTooFewRoleSequencesError();
			case CorePackage.MODEL_ERRORS_TYPE__TOO_MANY_READING_ROLES_ERROR:
				return getTooManyReadingRolesError();
			case CorePackage.MODEL_ERRORS_TYPE__TOO_MANY_ROLE_SEQUENCES_ERROR:
				return getTooManyRoleSequencesError();
			case CorePackage.MODEL_ERRORS_TYPE__DATA_TYPE_NOT_SPECIFIED_ERROR:
				return getDataTypeNotSpecifiedError();
			case CorePackage.MODEL_ERRORS_TYPE__NMINUS_ONE_ERROR:
				return getNMinusOneError();
			case CorePackage.MODEL_ERRORS_TYPE__COMPATIBLE_ROLE_PLAYER_TYPE_ERROR:
				return getCompatibleRolePlayerTypeError();
			case CorePackage.MODEL_ERRORS_TYPE__SUPERSET_ROLE_OF_SUBTYPE_SUBSET_CONSTRAINT_NOT_SUBTYPE_ERROR:
				return getSupersetRoleOfSubtypeSubsetConstraintNotSubtypeError();
			case CorePackage.MODEL_ERRORS_TYPE__JOIN_PATH_REQUIRED_ERROR:
				return getJoinPathRequiredError();
			case CorePackage.MODEL_ERRORS_TYPE__ROLE_PLAYER_REQUIRED_ERROR:
				return getRolePlayerRequiredError();
			case CorePackage.MODEL_ERRORS_TYPE__EQUALITY_IMPLIED_BY_MANDATORY_ERROR:
				return getEqualityImpliedByMandatoryError();
			case CorePackage.MODEL_ERRORS_TYPE__ENTITY_TYPE_REQUIRES_REFERENCE_SCHEME_ERROR:
				return getEntityTypeRequiresReferenceSchemeError();
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_MIN_MAX_ERROR:
				return getFrequencyConstraintMinMaxError();
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_EXACTLY_ONE_ERROR:
				return getFrequencyConstraintExactlyOneError();
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_NON_RESTRICTIVE_RANGE_ERROR:
				return getFrequencyConstraintNonRestrictiveRangeError();
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR:
				return getFrequencyConstraintContradictsInternalUniquenessConstraintError();
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_VIOLATED_BY_UNIQUENESS_CONSTRAINT_ERROR:
				return getFrequencyConstraintViolatedByUniquenessConstraintError();
			case CorePackage.MODEL_ERRORS_TYPE__MIN_VALUE_MISMATCH_ERROR:
				return getMinValueMismatchError();
			case CorePackage.MODEL_ERRORS_TYPE__MAX_VALUE_MISMATCH_ERROR:
				return getMaxValueMismatchError();
			case CorePackage.MODEL_ERRORS_TYPE__CARDINALITY_RANGE_OVERLAP_ERROR:
				return getCardinalityRangeOverlapError();
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_RANGE_OVERLAP_ERROR:
				return getValueRangeOverlapError();
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_TYPE_DETACHED_ERROR:
				return getValueTypeDetachedError();
			case CorePackage.MODEL_ERRORS_TYPE__RING_CONSTRAINT_TYPE_NOT_SPECIFIED_ERROR:
				return getRingConstraintTypeNotSpecifiedError();
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_COMPARISON_CONSTRAINT_OPERATOR_NOT_SPECIFIED_ERROR:
				return getValueComparisonConstraintOperatorNotSpecifiedError();
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_COMPARISON_ROLES_NOT_COMPARABLE_ERROR:
				return getValueComparisonRolesNotComparableError();
			case CorePackage.MODEL_ERRORS_TYPE__IMPLICATION_ERROR:
				return getImplicationError();
			case CorePackage.MODEL_ERRORS_TYPE__SUBSET_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR:
				return getSubsetConstraintImpliedByMandatoryConstraintsError();
			case CorePackage.MODEL_ERRORS_TYPE__EQUALITY_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR:
				return getEqualityConstraintImpliedByMandatoryConstraintsError();
			case CorePackage.MODEL_ERRORS_TYPE__EXCLUSION_CONTRADICTS_MANDATORY_ERROR:
				return getExclusionContradictsMandatoryError();
			case CorePackage.MODEL_ERRORS_TYPE__NOT_WELL_MODELED_SUBSET_AND_MANDATORY_ERROR:
				return getNotWellModeledSubsetAndMandatoryError();
			case CorePackage.MODEL_ERRORS_TYPE__IMPLIED_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR:
				return getImpliedInternalUniquenessConstraintError();
			case CorePackage.MODEL_ERRORS_TYPE__OBJECT_TYPE_REQUIRES_PRIMARY_SUPERTYPE_ERROR:
				return getObjectTypeRequiresPrimarySupertypeError();
			case CorePackage.MODEL_ERRORS_TYPE__PREFERRED_IDENTIFIER_REQUIRES_MANDATORY_ERROR:
				return getPreferredIdentifierRequiresMandatoryError();
			case CorePackage.MODEL_ERRORS_TYPE__COMPATIBLE_SUPERTYPES_ERROR:
				return getCompatibleSupertypesError();
			case CorePackage.MODEL_ERRORS_TYPE__OBJECTIFYING_INSTANCE_REQUIRED_ERROR:
				return getObjectifyingInstanceRequiredError();
			case CorePackage.MODEL_ERRORS_TYPE__OBJECTIFIED_INSTANCE_REQUIRED_ERROR:
				return getObjectifiedInstanceRequiredError();
			case CorePackage.MODEL_ERRORS_TYPE__COMPATIBLE_VALUE_TYPE_INSTANCE_VALUE_ERROR:
				return getCompatibleValueTypeInstanceValueError();
			case CorePackage.MODEL_ERRORS_TYPE__POPULATION_MANDATORY_ERROR:
				return getPopulationMandatoryError();
			case CorePackage.MODEL_ERRORS_TYPE__POPULATION_UNIQUENESS_ERROR:
				return getPopulationUniquenessError();
			case CorePackage.MODEL_ERRORS_TYPE__EXCLUSION_CONTRADICTS_EQUALITY_ERROR:
				return getExclusionContradictsEqualityError();
			case CorePackage.MODEL_ERRORS_TYPE__EXCLUSION_CONTRADICTS_SUBSET_ERROR:
				return getExclusionContradictsSubsetError();
			case CorePackage.MODEL_ERRORS_TYPE__PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR:
				return getPathRequiresRootObjectTypeError();
			case CorePackage.MODEL_ERRORS_TYPE__PATH_START_ROLE_FOLLOWS_ROOT_OBJECT_TYPE_ERROR:
				return getPathStartRoleFollowsRootObjectTypeError();
			case CorePackage.MODEL_ERRORS_TYPE__JOINED_PATH_ROLE_REQUIRES_COMPATIBLE_ROLE_PLAYER_ERROR:
				return getJoinedPathRoleRequiresCompatibleRolePlayerError();
			case CorePackage.MODEL_ERRORS_TYPE__CORRELATED_PATH_ROLE_REQUIRES_COMPATIBLE_ROLE_PLAYER_ERROR:
				return getCorrelatedPathRoleRequiresCompatibleRolePlayerError();
			case CorePackage.MODEL_ERRORS_TYPE__OBJECT_UNIFIER_REQUIRES_COMPATIBLE_OBJECT_TYPES_ERROR:
				return getObjectUnifierRequiresCompatibleObjectTypesError();
			case CorePackage.MODEL_ERRORS_TYPE__PATH_SAME_FACT_TYPE_ROLE_FOLLOWS_JOIN_ERROR:
				return getPathSameFactTypeRoleFollowsJoinError();
			case CorePackage.MODEL_ERRORS_TYPE__PATH_OUTER_JOIN_REQUIRES_OPTIONAL_ROLE_ERROR:
				return getPathOuterJoinRequiresOptionalRoleError();
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_REQUIRES_AGGREGATION_CONTEXT_ERROR:
				return getCalculatedPathValueRequiresAggregationContextError();
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_REQUIRES_FUNCTION_ERROR:
				return getCalculatedPathValueRequiresFunctionError();
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_MUST_BE_CONSUMED_ERROR:
				return getCalculatedPathValueMustBeConsumedError();
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_PARAMETER_BINDING_ERROR:
				return getCalculatedPathValueParameterBindingError();
			case CorePackage.MODEL_ERRORS_TYPE__FACT_TYPE_DERIVATION_REQUIRES_PROJECTION_ERROR:
				return getFactTypeDerivationRequiresProjectionError();
			case CorePackage.MODEL_ERRORS_TYPE__QUERY_DERIVATION_REQUIRES_PROJECTION_ERROR:
				return getQueryDerivationRequiresProjectionError();
			case CorePackage.MODEL_ERRORS_TYPE__PARTIAL_FACT_TYPE_DERIVATION_PROJECTION_ERROR:
				return getPartialFactTypeDerivationProjectionError();
			case CorePackage.MODEL_ERRORS_TYPE__PARTIAL_QUERY_DERIVATION_PROJECTION_ERROR:
				return getPartialQueryDerivationProjectionError();
			case CorePackage.MODEL_ERRORS_TYPE__JOIN_PATH_REQUIRES_PROJECTION_ERROR:
				return getJoinPathRequiresProjectionError();
			case CorePackage.MODEL_ERRORS_TYPE__PARTIAL_JOIN_PATH_PROJECTION_ERROR:
				return getPartialJoinPathProjectionError();
			case CorePackage.MODEL_ERRORS_TYPE__DERIVED_FACT_TYPE_ROLE_PROJECTION_COMPATIBILITY_ERROR:
				return getDerivedFactTypeRoleProjectionCompatibilityError();
			case CorePackage.MODEL_ERRORS_TYPE__QUERY_ROLE_PROJECTION_COMPATIBILITY_ERROR:
				return getQueryRoleProjectionCompatibilityError();
			case CorePackage.MODEL_ERRORS_TYPE__JOINED_CONSTRAINT_ROLE_PROJECTION_COMPATIBILITY_ERROR:
				return getJoinedConstraintRoleProjectionCompatibilityError();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.MODEL_ERRORS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__EXTENSION_MODEL_ERROR_GROUP:
				((FeatureMap.Internal)getExtensionModelErrorGroup()).set(newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__CONSTRAINT_DUPLICATE_NAME_ERROR:
				getConstraintDuplicateNameError().clear();
				getConstraintDuplicateNameError().addAll((Collection<? extends ConstraintDuplicateNameErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__OBJECT_TYPE_DUPLICATE_NAME_ERROR:
				getObjectTypeDuplicateNameError().clear();
				getObjectTypeDuplicateNameError().addAll((Collection<? extends ObjectTypeDuplicateNameErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__RECOGNIZED_PHRASE_DUPLICATE_NAME_ERROR:
				getRecognizedPhraseDuplicateNameError().clear();
				getRecognizedPhraseDuplicateNameError().addAll((Collection<? extends RecognizedPhraseDuplicateNameErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__GROUP_DUPLICATE_NAME_ERROR:
				getGroupDuplicateNameError().clear();
				getGroupDuplicateNameError().addAll((Collection<? extends GroupDuplicateNameErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__FUNCTION_DUPLICATE_NAME_ERROR:
				getFunctionDuplicateNameError().clear();
				getFunctionDuplicateNameError().addAll((Collection<? extends FunctionDuplicateNameErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__DUPLICATE_READING_SIGNATURE_ERROR:
				getDuplicateReadingSignatureError().clear();
				getDuplicateReadingSignatureError().addAll((Collection<? extends DuplicateReadingSignatureErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__GROUP_MEMBERSHIP_CONTRADICTION_ERROR:
				getGroupMembershipContradictionError().clear();
				getGroupMembershipContradictionError().addAll((Collection<? extends GroupMembershipContradictionErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__EXTERNAL_CONSTRAINT_ROLE_SEQUENCE_ARITY_MISMATCH_ERROR:
				getExternalConstraintRoleSequenceArityMismatchError().clear();
				getExternalConstraintRoleSequenceArityMismatchError().addAll((Collection<? extends ExternalConstraintRoleSequenceArityMismatchErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__FACT_TYPE_REQUIRES_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR:
				getFactTypeRequiresInternalUniquenessConstraintError().clear();
				getFactTypeRequiresInternalUniquenessConstraintError().addAll((Collection<? extends FactTypeRequiresInternalUniquenessConstraintErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__FACT_TYPE_REQUIRES_READING_ERROR:
				getFactTypeRequiresReadingError().clear();
				getFactTypeRequiresReadingError().addAll((Collection<? extends FactTypeRequiresReadingErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_ENTITY_TYPE_ROLE_INSTANCES_ERROR:
				getTooFewEntityTypeRoleInstancesError().clear();
				getTooFewEntityTypeRoleInstancesError().addAll((Collection<? extends TooFewEntityTypeRoleInstancesErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_FACT_TYPE_ROLE_INSTANCES_ERROR:
				getTooFewFactTypeRoleInstancesError().clear();
				getTooFewFactTypeRoleInstancesError().addAll((Collection<? extends TooFewFactTypeRoleInstancesErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_READING_ROLES_ERROR:
				getTooFewReadingRolesError().clear();
				getTooFewReadingRolesError().addAll((Collection<? extends TooFewReadingRolesErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__READING_REQUIRES_USER_MODIFICATION_ERROR:
				getReadingRequiresUserModificationError().clear();
				getReadingRequiresUserModificationError().addAll((Collection<? extends ReadingRequiresUserModificationErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_ROLE_SEQUENCES_ERROR:
				getTooFewRoleSequencesError().clear();
				getTooFewRoleSequencesError().addAll((Collection<? extends TooFewRoleSequencesErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__TOO_MANY_READING_ROLES_ERROR:
				getTooManyReadingRolesError().clear();
				getTooManyReadingRolesError().addAll((Collection<? extends TooManyReadingRolesErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__TOO_MANY_ROLE_SEQUENCES_ERROR:
				getTooManyRoleSequencesError().clear();
				getTooManyRoleSequencesError().addAll((Collection<? extends TooManyRoleSequencesErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__DATA_TYPE_NOT_SPECIFIED_ERROR:
				getDataTypeNotSpecifiedError().clear();
				getDataTypeNotSpecifiedError().addAll((Collection<? extends DataTypeNotSpecifiedErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__NMINUS_ONE_ERROR:
				getNMinusOneError().clear();
				getNMinusOneError().addAll((Collection<? extends NMinusOneErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__COMPATIBLE_ROLE_PLAYER_TYPE_ERROR:
				getCompatibleRolePlayerTypeError().clear();
				getCompatibleRolePlayerTypeError().addAll((Collection<? extends CompatibleRolePlayerTypeErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__SUPERSET_ROLE_OF_SUBTYPE_SUBSET_CONSTRAINT_NOT_SUBTYPE_ERROR:
				getSupersetRoleOfSubtypeSubsetConstraintNotSubtypeError().clear();
				getSupersetRoleOfSubtypeSubsetConstraintNotSubtypeError().addAll((Collection<? extends SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__JOIN_PATH_REQUIRED_ERROR:
				getJoinPathRequiredError().clear();
				getJoinPathRequiredError().addAll((Collection<? extends JoinPathRequiredErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__ROLE_PLAYER_REQUIRED_ERROR:
				getRolePlayerRequiredError().clear();
				getRolePlayerRequiredError().addAll((Collection<? extends RolePlayerRequiredErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__EQUALITY_IMPLIED_BY_MANDATORY_ERROR:
				getEqualityImpliedByMandatoryError().clear();
				getEqualityImpliedByMandatoryError().addAll((Collection<? extends EqualityImpliedByMandatoryErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__ENTITY_TYPE_REQUIRES_REFERENCE_SCHEME_ERROR:
				getEntityTypeRequiresReferenceSchemeError().clear();
				getEntityTypeRequiresReferenceSchemeError().addAll((Collection<? extends EntityTypeRequiresReferenceSchemeErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_MIN_MAX_ERROR:
				getFrequencyConstraintMinMaxError().clear();
				getFrequencyConstraintMinMaxError().addAll((Collection<? extends FrequencyConstraintMinMaxErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_EXACTLY_ONE_ERROR:
				getFrequencyConstraintExactlyOneError().clear();
				getFrequencyConstraintExactlyOneError().addAll((Collection<? extends FrequencyConstraintExactlyOneErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_NON_RESTRICTIVE_RANGE_ERROR:
				getFrequencyConstraintNonRestrictiveRangeError().clear();
				getFrequencyConstraintNonRestrictiveRangeError().addAll((Collection<? extends FrequencyConstraintNonRestrictiveRangeErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR:
				getFrequencyConstraintContradictsInternalUniquenessConstraintError().clear();
				getFrequencyConstraintContradictsInternalUniquenessConstraintError().addAll((Collection<? extends FrequencyConstraintContradictsInternalUniquenessConstraintErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_VIOLATED_BY_UNIQUENESS_CONSTRAINT_ERROR:
				getFrequencyConstraintViolatedByUniquenessConstraintError().clear();
				getFrequencyConstraintViolatedByUniquenessConstraintError().addAll((Collection<? extends FrequencyConstraintViolatedByUniquenessConstraintErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__MIN_VALUE_MISMATCH_ERROR:
				getMinValueMismatchError().clear();
				getMinValueMismatchError().addAll((Collection<? extends MinValueMismatchErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__MAX_VALUE_MISMATCH_ERROR:
				getMaxValueMismatchError().clear();
				getMaxValueMismatchError().addAll((Collection<? extends MaxValueMismatchErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__CARDINALITY_RANGE_OVERLAP_ERROR:
				getCardinalityRangeOverlapError().clear();
				getCardinalityRangeOverlapError().addAll((Collection<? extends CardinalityRangeOverlapErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_RANGE_OVERLAP_ERROR:
				getValueRangeOverlapError().clear();
				getValueRangeOverlapError().addAll((Collection<? extends ValueRangeOverlapErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_TYPE_DETACHED_ERROR:
				getValueTypeDetachedError().clear();
				getValueTypeDetachedError().addAll((Collection<? extends ValueTypeDetachedErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__RING_CONSTRAINT_TYPE_NOT_SPECIFIED_ERROR:
				getRingConstraintTypeNotSpecifiedError().clear();
				getRingConstraintTypeNotSpecifiedError().addAll((Collection<? extends RingConstraintTypeNotSpecifiedErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_COMPARISON_CONSTRAINT_OPERATOR_NOT_SPECIFIED_ERROR:
				getValueComparisonConstraintOperatorNotSpecifiedError().clear();
				getValueComparisonConstraintOperatorNotSpecifiedError().addAll((Collection<? extends ValueComparisonConstraintOperatorNotSpecifiedErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_COMPARISON_ROLES_NOT_COMPARABLE_ERROR:
				getValueComparisonRolesNotComparableError().clear();
				getValueComparisonRolesNotComparableError().addAll((Collection<? extends ValueComparisonRolesNotComparableErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__IMPLICATION_ERROR:
				getImplicationError().clear();
				getImplicationError().addAll((Collection<? extends ImplicationErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__SUBSET_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR:
				getSubsetConstraintImpliedByMandatoryConstraintsError().clear();
				getSubsetConstraintImpliedByMandatoryConstraintsError().addAll((Collection<? extends SubsetConstraintImpliedByMandatoryConstraintsErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__EQUALITY_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR:
				getEqualityConstraintImpliedByMandatoryConstraintsError().clear();
				getEqualityConstraintImpliedByMandatoryConstraintsError().addAll((Collection<? extends EqualityConstraintImpliedByMandatoryConstraintsErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__EXCLUSION_CONTRADICTS_MANDATORY_ERROR:
				getExclusionContradictsMandatoryError().clear();
				getExclusionContradictsMandatoryError().addAll((Collection<? extends ExclusionContradictsMandatoryErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__NOT_WELL_MODELED_SUBSET_AND_MANDATORY_ERROR:
				getNotWellModeledSubsetAndMandatoryError().clear();
				getNotWellModeledSubsetAndMandatoryError().addAll((Collection<? extends NotWellModeledSubsetAndMandatoryErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__IMPLIED_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR:
				getImpliedInternalUniquenessConstraintError().clear();
				getImpliedInternalUniquenessConstraintError().addAll((Collection<? extends ImpliedInternalUniquenessConstraintErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__OBJECT_TYPE_REQUIRES_PRIMARY_SUPERTYPE_ERROR:
				getObjectTypeRequiresPrimarySupertypeError().clear();
				getObjectTypeRequiresPrimarySupertypeError().addAll((Collection<? extends ObjectTypeRequiresPrimarySupertypeErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__PREFERRED_IDENTIFIER_REQUIRES_MANDATORY_ERROR:
				getPreferredIdentifierRequiresMandatoryError().clear();
				getPreferredIdentifierRequiresMandatoryError().addAll((Collection<? extends PreferredIdentifierRequiresMandatoryErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__COMPATIBLE_SUPERTYPES_ERROR:
				getCompatibleSupertypesError().clear();
				getCompatibleSupertypesError().addAll((Collection<? extends CompatibleSupertypesErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__OBJECTIFYING_INSTANCE_REQUIRED_ERROR:
				getObjectifyingInstanceRequiredError().clear();
				getObjectifyingInstanceRequiredError().addAll((Collection<? extends ObjectifyingInstanceRequiredErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__OBJECTIFIED_INSTANCE_REQUIRED_ERROR:
				getObjectifiedInstanceRequiredError().clear();
				getObjectifiedInstanceRequiredError().addAll((Collection<? extends ObjectifiedInstanceRequiredErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__COMPATIBLE_VALUE_TYPE_INSTANCE_VALUE_ERROR:
				getCompatibleValueTypeInstanceValueError().clear();
				getCompatibleValueTypeInstanceValueError().addAll((Collection<? extends CompatibleValueTypeInstanceValueErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__POPULATION_MANDATORY_ERROR:
				getPopulationMandatoryError().clear();
				getPopulationMandatoryError().addAll((Collection<? extends PopulationMandatoryErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__POPULATION_UNIQUENESS_ERROR:
				getPopulationUniquenessError().clear();
				getPopulationUniquenessError().addAll((Collection<? extends PopulationUniquenessErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__EXCLUSION_CONTRADICTS_EQUALITY_ERROR:
				getExclusionContradictsEqualityError().clear();
				getExclusionContradictsEqualityError().addAll((Collection<? extends ExclusionContradictsEqualityErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__EXCLUSION_CONTRADICTS_SUBSET_ERROR:
				getExclusionContradictsSubsetError().clear();
				getExclusionContradictsSubsetError().addAll((Collection<? extends ExclusionContradictsSubsetErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR:
				getPathRequiresRootObjectTypeError().clear();
				getPathRequiresRootObjectTypeError().addAll((Collection<? extends PathRequiresRootObjectTypeErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__PATH_START_ROLE_FOLLOWS_ROOT_OBJECT_TYPE_ERROR:
				getPathStartRoleFollowsRootObjectTypeError().clear();
				getPathStartRoleFollowsRootObjectTypeError().addAll((Collection<? extends PathStartRoleFollowsRootObjectTypeErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__JOINED_PATH_ROLE_REQUIRES_COMPATIBLE_ROLE_PLAYER_ERROR:
				getJoinedPathRoleRequiresCompatibleRolePlayerError().clear();
				getJoinedPathRoleRequiresCompatibleRolePlayerError().addAll((Collection<? extends JoinedPathRoleRequiresCompatibleRolePlayerErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__CORRELATED_PATH_ROLE_REQUIRES_COMPATIBLE_ROLE_PLAYER_ERROR:
				getCorrelatedPathRoleRequiresCompatibleRolePlayerError().clear();
				getCorrelatedPathRoleRequiresCompatibleRolePlayerError().addAll((Collection<? extends CorrelatedPathRoleRequiresCompatibleRolePlayerErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__OBJECT_UNIFIER_REQUIRES_COMPATIBLE_OBJECT_TYPES_ERROR:
				getObjectUnifierRequiresCompatibleObjectTypesError().clear();
				getObjectUnifierRequiresCompatibleObjectTypesError().addAll((Collection<? extends ObjectUnifierRequiresCompatibleObjectTypesErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__PATH_SAME_FACT_TYPE_ROLE_FOLLOWS_JOIN_ERROR:
				getPathSameFactTypeRoleFollowsJoinError().clear();
				getPathSameFactTypeRoleFollowsJoinError().addAll((Collection<? extends PathSameFactTypeRoleFollowsJoinErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__PATH_OUTER_JOIN_REQUIRES_OPTIONAL_ROLE_ERROR:
				getPathOuterJoinRequiresOptionalRoleError().clear();
				getPathOuterJoinRequiresOptionalRoleError().addAll((Collection<? extends PathOuterJoinRequiresOptionalRoleErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_REQUIRES_AGGREGATION_CONTEXT_ERROR:
				getCalculatedPathValueRequiresAggregationContextError().clear();
				getCalculatedPathValueRequiresAggregationContextError().addAll((Collection<? extends CalculatedPathValueRequiresAggregationContextErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_REQUIRES_FUNCTION_ERROR:
				getCalculatedPathValueRequiresFunctionError().clear();
				getCalculatedPathValueRequiresFunctionError().addAll((Collection<? extends CalculatedPathValueRequiresFunctionErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_MUST_BE_CONSUMED_ERROR:
				getCalculatedPathValueMustBeConsumedError().clear();
				getCalculatedPathValueMustBeConsumedError().addAll((Collection<? extends CalculatedPathValueMustBeConsumedErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_PARAMETER_BINDING_ERROR:
				getCalculatedPathValueParameterBindingError().clear();
				getCalculatedPathValueParameterBindingError().addAll((Collection<? extends CalculatedPathValueParameterBindingErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__FACT_TYPE_DERIVATION_REQUIRES_PROJECTION_ERROR:
				getFactTypeDerivationRequiresProjectionError().clear();
				getFactTypeDerivationRequiresProjectionError().addAll((Collection<? extends FactTypeDerivationRequiresProjectionErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__QUERY_DERIVATION_REQUIRES_PROJECTION_ERROR:
				getQueryDerivationRequiresProjectionError().clear();
				getQueryDerivationRequiresProjectionError().addAll((Collection<? extends QueryDerivationRequiresProjectionErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__PARTIAL_FACT_TYPE_DERIVATION_PROJECTION_ERROR:
				getPartialFactTypeDerivationProjectionError().clear();
				getPartialFactTypeDerivationProjectionError().addAll((Collection<? extends PartialFactTypeDerivationProjectionErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__PARTIAL_QUERY_DERIVATION_PROJECTION_ERROR:
				getPartialQueryDerivationProjectionError().clear();
				getPartialQueryDerivationProjectionError().addAll((Collection<? extends PartialQueryDerivationProjectionErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__JOIN_PATH_REQUIRES_PROJECTION_ERROR:
				getJoinPathRequiresProjectionError().clear();
				getJoinPathRequiresProjectionError().addAll((Collection<? extends JoinPathRequiresProjectionErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__PARTIAL_JOIN_PATH_PROJECTION_ERROR:
				getPartialJoinPathProjectionError().clear();
				getPartialJoinPathProjectionError().addAll((Collection<? extends PartialJoinPathProjectionErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__DERIVED_FACT_TYPE_ROLE_PROJECTION_COMPATIBILITY_ERROR:
				getDerivedFactTypeRoleProjectionCompatibilityError().clear();
				getDerivedFactTypeRoleProjectionCompatibilityError().addAll((Collection<? extends DerivedFactTypeRoleProjectionCompatibilityErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__QUERY_ROLE_PROJECTION_COMPATIBILITY_ERROR:
				getQueryRoleProjectionCompatibilityError().clear();
				getQueryRoleProjectionCompatibilityError().addAll((Collection<? extends QueryRoleProjectionCompatibilityErrorType>)newValue);
				return;
			case CorePackage.MODEL_ERRORS_TYPE__JOINED_CONSTRAINT_ROLE_PROJECTION_COMPATIBILITY_ERROR:
				getJoinedConstraintRoleProjectionCompatibilityError().clear();
				getJoinedConstraintRoleProjectionCompatibilityError().addAll((Collection<? extends JoinedConstraintRoleProjectionCompatibilityErrorType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.MODEL_ERRORS_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__EXTENSION_MODEL_ERROR_GROUP:
				getExtensionModelErrorGroup().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__CONSTRAINT_DUPLICATE_NAME_ERROR:
				getConstraintDuplicateNameError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__OBJECT_TYPE_DUPLICATE_NAME_ERROR:
				getObjectTypeDuplicateNameError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__RECOGNIZED_PHRASE_DUPLICATE_NAME_ERROR:
				getRecognizedPhraseDuplicateNameError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__GROUP_DUPLICATE_NAME_ERROR:
				getGroupDuplicateNameError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__FUNCTION_DUPLICATE_NAME_ERROR:
				getFunctionDuplicateNameError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__DUPLICATE_READING_SIGNATURE_ERROR:
				getDuplicateReadingSignatureError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__GROUP_MEMBERSHIP_CONTRADICTION_ERROR:
				getGroupMembershipContradictionError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__EXTERNAL_CONSTRAINT_ROLE_SEQUENCE_ARITY_MISMATCH_ERROR:
				getExternalConstraintRoleSequenceArityMismatchError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__FACT_TYPE_REQUIRES_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR:
				getFactTypeRequiresInternalUniquenessConstraintError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__FACT_TYPE_REQUIRES_READING_ERROR:
				getFactTypeRequiresReadingError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_ENTITY_TYPE_ROLE_INSTANCES_ERROR:
				getTooFewEntityTypeRoleInstancesError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_FACT_TYPE_ROLE_INSTANCES_ERROR:
				getTooFewFactTypeRoleInstancesError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_READING_ROLES_ERROR:
				getTooFewReadingRolesError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__READING_REQUIRES_USER_MODIFICATION_ERROR:
				getReadingRequiresUserModificationError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_ROLE_SEQUENCES_ERROR:
				getTooFewRoleSequencesError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__TOO_MANY_READING_ROLES_ERROR:
				getTooManyReadingRolesError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__TOO_MANY_ROLE_SEQUENCES_ERROR:
				getTooManyRoleSequencesError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__DATA_TYPE_NOT_SPECIFIED_ERROR:
				getDataTypeNotSpecifiedError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__NMINUS_ONE_ERROR:
				getNMinusOneError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__COMPATIBLE_ROLE_PLAYER_TYPE_ERROR:
				getCompatibleRolePlayerTypeError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__SUPERSET_ROLE_OF_SUBTYPE_SUBSET_CONSTRAINT_NOT_SUBTYPE_ERROR:
				getSupersetRoleOfSubtypeSubsetConstraintNotSubtypeError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__JOIN_PATH_REQUIRED_ERROR:
				getJoinPathRequiredError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__ROLE_PLAYER_REQUIRED_ERROR:
				getRolePlayerRequiredError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__EQUALITY_IMPLIED_BY_MANDATORY_ERROR:
				getEqualityImpliedByMandatoryError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__ENTITY_TYPE_REQUIRES_REFERENCE_SCHEME_ERROR:
				getEntityTypeRequiresReferenceSchemeError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_MIN_MAX_ERROR:
				getFrequencyConstraintMinMaxError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_EXACTLY_ONE_ERROR:
				getFrequencyConstraintExactlyOneError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_NON_RESTRICTIVE_RANGE_ERROR:
				getFrequencyConstraintNonRestrictiveRangeError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR:
				getFrequencyConstraintContradictsInternalUniquenessConstraintError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_VIOLATED_BY_UNIQUENESS_CONSTRAINT_ERROR:
				getFrequencyConstraintViolatedByUniquenessConstraintError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__MIN_VALUE_MISMATCH_ERROR:
				getMinValueMismatchError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__MAX_VALUE_MISMATCH_ERROR:
				getMaxValueMismatchError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__CARDINALITY_RANGE_OVERLAP_ERROR:
				getCardinalityRangeOverlapError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_RANGE_OVERLAP_ERROR:
				getValueRangeOverlapError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_TYPE_DETACHED_ERROR:
				getValueTypeDetachedError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__RING_CONSTRAINT_TYPE_NOT_SPECIFIED_ERROR:
				getRingConstraintTypeNotSpecifiedError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_COMPARISON_CONSTRAINT_OPERATOR_NOT_SPECIFIED_ERROR:
				getValueComparisonConstraintOperatorNotSpecifiedError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_COMPARISON_ROLES_NOT_COMPARABLE_ERROR:
				getValueComparisonRolesNotComparableError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__IMPLICATION_ERROR:
				getImplicationError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__SUBSET_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR:
				getSubsetConstraintImpliedByMandatoryConstraintsError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__EQUALITY_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR:
				getEqualityConstraintImpliedByMandatoryConstraintsError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__EXCLUSION_CONTRADICTS_MANDATORY_ERROR:
				getExclusionContradictsMandatoryError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__NOT_WELL_MODELED_SUBSET_AND_MANDATORY_ERROR:
				getNotWellModeledSubsetAndMandatoryError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__IMPLIED_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR:
				getImpliedInternalUniquenessConstraintError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__OBJECT_TYPE_REQUIRES_PRIMARY_SUPERTYPE_ERROR:
				getObjectTypeRequiresPrimarySupertypeError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__PREFERRED_IDENTIFIER_REQUIRES_MANDATORY_ERROR:
				getPreferredIdentifierRequiresMandatoryError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__COMPATIBLE_SUPERTYPES_ERROR:
				getCompatibleSupertypesError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__OBJECTIFYING_INSTANCE_REQUIRED_ERROR:
				getObjectifyingInstanceRequiredError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__OBJECTIFIED_INSTANCE_REQUIRED_ERROR:
				getObjectifiedInstanceRequiredError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__COMPATIBLE_VALUE_TYPE_INSTANCE_VALUE_ERROR:
				getCompatibleValueTypeInstanceValueError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__POPULATION_MANDATORY_ERROR:
				getPopulationMandatoryError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__POPULATION_UNIQUENESS_ERROR:
				getPopulationUniquenessError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__EXCLUSION_CONTRADICTS_EQUALITY_ERROR:
				getExclusionContradictsEqualityError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__EXCLUSION_CONTRADICTS_SUBSET_ERROR:
				getExclusionContradictsSubsetError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR:
				getPathRequiresRootObjectTypeError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__PATH_START_ROLE_FOLLOWS_ROOT_OBJECT_TYPE_ERROR:
				getPathStartRoleFollowsRootObjectTypeError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__JOINED_PATH_ROLE_REQUIRES_COMPATIBLE_ROLE_PLAYER_ERROR:
				getJoinedPathRoleRequiresCompatibleRolePlayerError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__CORRELATED_PATH_ROLE_REQUIRES_COMPATIBLE_ROLE_PLAYER_ERROR:
				getCorrelatedPathRoleRequiresCompatibleRolePlayerError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__OBJECT_UNIFIER_REQUIRES_COMPATIBLE_OBJECT_TYPES_ERROR:
				getObjectUnifierRequiresCompatibleObjectTypesError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__PATH_SAME_FACT_TYPE_ROLE_FOLLOWS_JOIN_ERROR:
				getPathSameFactTypeRoleFollowsJoinError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__PATH_OUTER_JOIN_REQUIRES_OPTIONAL_ROLE_ERROR:
				getPathOuterJoinRequiresOptionalRoleError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_REQUIRES_AGGREGATION_CONTEXT_ERROR:
				getCalculatedPathValueRequiresAggregationContextError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_REQUIRES_FUNCTION_ERROR:
				getCalculatedPathValueRequiresFunctionError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_MUST_BE_CONSUMED_ERROR:
				getCalculatedPathValueMustBeConsumedError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_PARAMETER_BINDING_ERROR:
				getCalculatedPathValueParameterBindingError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__FACT_TYPE_DERIVATION_REQUIRES_PROJECTION_ERROR:
				getFactTypeDerivationRequiresProjectionError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__QUERY_DERIVATION_REQUIRES_PROJECTION_ERROR:
				getQueryDerivationRequiresProjectionError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__PARTIAL_FACT_TYPE_DERIVATION_PROJECTION_ERROR:
				getPartialFactTypeDerivationProjectionError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__PARTIAL_QUERY_DERIVATION_PROJECTION_ERROR:
				getPartialQueryDerivationProjectionError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__JOIN_PATH_REQUIRES_PROJECTION_ERROR:
				getJoinPathRequiresProjectionError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__PARTIAL_JOIN_PATH_PROJECTION_ERROR:
				getPartialJoinPathProjectionError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__DERIVED_FACT_TYPE_ROLE_PROJECTION_COMPATIBILITY_ERROR:
				getDerivedFactTypeRoleProjectionCompatibilityError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__QUERY_ROLE_PROJECTION_COMPATIBILITY_ERROR:
				getQueryRoleProjectionCompatibilityError().clear();
				return;
			case CorePackage.MODEL_ERRORS_TYPE__JOINED_CONSTRAINT_ROLE_PROJECTION_COMPATIBILITY_ERROR:
				getJoinedConstraintRoleProjectionCompatibilityError().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.MODEL_ERRORS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__EXTENSION_MODEL_ERROR_GROUP:
				return !getExtensionModelErrorGroup().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__EXTENSION_MODEL_ERROR:
				return !getExtensionModelError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__CONSTRAINT_DUPLICATE_NAME_ERROR:
				return !getConstraintDuplicateNameError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__OBJECT_TYPE_DUPLICATE_NAME_ERROR:
				return !getObjectTypeDuplicateNameError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__RECOGNIZED_PHRASE_DUPLICATE_NAME_ERROR:
				return !getRecognizedPhraseDuplicateNameError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__GROUP_DUPLICATE_NAME_ERROR:
				return !getGroupDuplicateNameError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__FUNCTION_DUPLICATE_NAME_ERROR:
				return !getFunctionDuplicateNameError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__DUPLICATE_READING_SIGNATURE_ERROR:
				return !getDuplicateReadingSignatureError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__GROUP_MEMBERSHIP_CONTRADICTION_ERROR:
				return !getGroupMembershipContradictionError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__EXTERNAL_CONSTRAINT_ROLE_SEQUENCE_ARITY_MISMATCH_ERROR:
				return !getExternalConstraintRoleSequenceArityMismatchError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__FACT_TYPE_REQUIRES_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR:
				return !getFactTypeRequiresInternalUniquenessConstraintError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__FACT_TYPE_REQUIRES_READING_ERROR:
				return !getFactTypeRequiresReadingError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_ENTITY_TYPE_ROLE_INSTANCES_ERROR:
				return !getTooFewEntityTypeRoleInstancesError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_FACT_TYPE_ROLE_INSTANCES_ERROR:
				return !getTooFewFactTypeRoleInstancesError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_READING_ROLES_ERROR:
				return !getTooFewReadingRolesError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__READING_REQUIRES_USER_MODIFICATION_ERROR:
				return !getReadingRequiresUserModificationError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__TOO_FEW_ROLE_SEQUENCES_ERROR:
				return !getTooFewRoleSequencesError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__TOO_MANY_READING_ROLES_ERROR:
				return !getTooManyReadingRolesError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__TOO_MANY_ROLE_SEQUENCES_ERROR:
				return !getTooManyRoleSequencesError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__DATA_TYPE_NOT_SPECIFIED_ERROR:
				return !getDataTypeNotSpecifiedError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__NMINUS_ONE_ERROR:
				return !getNMinusOneError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__COMPATIBLE_ROLE_PLAYER_TYPE_ERROR:
				return !getCompatibleRolePlayerTypeError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__SUPERSET_ROLE_OF_SUBTYPE_SUBSET_CONSTRAINT_NOT_SUBTYPE_ERROR:
				return !getSupersetRoleOfSubtypeSubsetConstraintNotSubtypeError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__JOIN_PATH_REQUIRED_ERROR:
				return !getJoinPathRequiredError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__ROLE_PLAYER_REQUIRED_ERROR:
				return !getRolePlayerRequiredError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__EQUALITY_IMPLIED_BY_MANDATORY_ERROR:
				return !getEqualityImpliedByMandatoryError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__ENTITY_TYPE_REQUIRES_REFERENCE_SCHEME_ERROR:
				return !getEntityTypeRequiresReferenceSchemeError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_MIN_MAX_ERROR:
				return !getFrequencyConstraintMinMaxError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_EXACTLY_ONE_ERROR:
				return !getFrequencyConstraintExactlyOneError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_NON_RESTRICTIVE_RANGE_ERROR:
				return !getFrequencyConstraintNonRestrictiveRangeError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR:
				return !getFrequencyConstraintContradictsInternalUniquenessConstraintError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__FREQUENCY_CONSTRAINT_VIOLATED_BY_UNIQUENESS_CONSTRAINT_ERROR:
				return !getFrequencyConstraintViolatedByUniquenessConstraintError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__MIN_VALUE_MISMATCH_ERROR:
				return !getMinValueMismatchError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__MAX_VALUE_MISMATCH_ERROR:
				return !getMaxValueMismatchError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__CARDINALITY_RANGE_OVERLAP_ERROR:
				return !getCardinalityRangeOverlapError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_RANGE_OVERLAP_ERROR:
				return !getValueRangeOverlapError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_TYPE_DETACHED_ERROR:
				return !getValueTypeDetachedError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__RING_CONSTRAINT_TYPE_NOT_SPECIFIED_ERROR:
				return !getRingConstraintTypeNotSpecifiedError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_COMPARISON_CONSTRAINT_OPERATOR_NOT_SPECIFIED_ERROR:
				return !getValueComparisonConstraintOperatorNotSpecifiedError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__VALUE_COMPARISON_ROLES_NOT_COMPARABLE_ERROR:
				return !getValueComparisonRolesNotComparableError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__IMPLICATION_ERROR:
				return !getImplicationError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__SUBSET_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR:
				return !getSubsetConstraintImpliedByMandatoryConstraintsError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__EQUALITY_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR:
				return !getEqualityConstraintImpliedByMandatoryConstraintsError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__EXCLUSION_CONTRADICTS_MANDATORY_ERROR:
				return !getExclusionContradictsMandatoryError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__NOT_WELL_MODELED_SUBSET_AND_MANDATORY_ERROR:
				return !getNotWellModeledSubsetAndMandatoryError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__IMPLIED_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR:
				return !getImpliedInternalUniquenessConstraintError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__OBJECT_TYPE_REQUIRES_PRIMARY_SUPERTYPE_ERROR:
				return !getObjectTypeRequiresPrimarySupertypeError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__PREFERRED_IDENTIFIER_REQUIRES_MANDATORY_ERROR:
				return !getPreferredIdentifierRequiresMandatoryError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__COMPATIBLE_SUPERTYPES_ERROR:
				return !getCompatibleSupertypesError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__OBJECTIFYING_INSTANCE_REQUIRED_ERROR:
				return !getObjectifyingInstanceRequiredError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__OBJECTIFIED_INSTANCE_REQUIRED_ERROR:
				return !getObjectifiedInstanceRequiredError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__COMPATIBLE_VALUE_TYPE_INSTANCE_VALUE_ERROR:
				return !getCompatibleValueTypeInstanceValueError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__POPULATION_MANDATORY_ERROR:
				return !getPopulationMandatoryError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__POPULATION_UNIQUENESS_ERROR:
				return !getPopulationUniquenessError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__EXCLUSION_CONTRADICTS_EQUALITY_ERROR:
				return !getExclusionContradictsEqualityError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__EXCLUSION_CONTRADICTS_SUBSET_ERROR:
				return !getExclusionContradictsSubsetError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR:
				return !getPathRequiresRootObjectTypeError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__PATH_START_ROLE_FOLLOWS_ROOT_OBJECT_TYPE_ERROR:
				return !getPathStartRoleFollowsRootObjectTypeError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__JOINED_PATH_ROLE_REQUIRES_COMPATIBLE_ROLE_PLAYER_ERROR:
				return !getJoinedPathRoleRequiresCompatibleRolePlayerError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__CORRELATED_PATH_ROLE_REQUIRES_COMPATIBLE_ROLE_PLAYER_ERROR:
				return !getCorrelatedPathRoleRequiresCompatibleRolePlayerError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__OBJECT_UNIFIER_REQUIRES_COMPATIBLE_OBJECT_TYPES_ERROR:
				return !getObjectUnifierRequiresCompatibleObjectTypesError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__PATH_SAME_FACT_TYPE_ROLE_FOLLOWS_JOIN_ERROR:
				return !getPathSameFactTypeRoleFollowsJoinError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__PATH_OUTER_JOIN_REQUIRES_OPTIONAL_ROLE_ERROR:
				return !getPathOuterJoinRequiresOptionalRoleError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_REQUIRES_AGGREGATION_CONTEXT_ERROR:
				return !getCalculatedPathValueRequiresAggregationContextError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_REQUIRES_FUNCTION_ERROR:
				return !getCalculatedPathValueRequiresFunctionError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_MUST_BE_CONSUMED_ERROR:
				return !getCalculatedPathValueMustBeConsumedError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__CALCULATED_PATH_VALUE_PARAMETER_BINDING_ERROR:
				return !getCalculatedPathValueParameterBindingError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__FACT_TYPE_DERIVATION_REQUIRES_PROJECTION_ERROR:
				return !getFactTypeDerivationRequiresProjectionError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__QUERY_DERIVATION_REQUIRES_PROJECTION_ERROR:
				return !getQueryDerivationRequiresProjectionError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__PARTIAL_FACT_TYPE_DERIVATION_PROJECTION_ERROR:
				return !getPartialFactTypeDerivationProjectionError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__PARTIAL_QUERY_DERIVATION_PROJECTION_ERROR:
				return !getPartialQueryDerivationProjectionError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__JOIN_PATH_REQUIRES_PROJECTION_ERROR:
				return !getJoinPathRequiresProjectionError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__PARTIAL_JOIN_PATH_PROJECTION_ERROR:
				return !getPartialJoinPathProjectionError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__DERIVED_FACT_TYPE_ROLE_PROJECTION_COMPATIBILITY_ERROR:
				return !getDerivedFactTypeRoleProjectionCompatibilityError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__QUERY_ROLE_PROJECTION_COMPATIBILITY_ERROR:
				return !getQueryRoleProjectionCompatibilityError().isEmpty();
			case CorePackage.MODEL_ERRORS_TYPE__JOINED_CONSTRAINT_ROLE_PROJECTION_COMPATIBILITY_ERROR:
				return !getJoinedConstraintRoleProjectionCompatibilityError().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ModelErrorsTypeImpl
