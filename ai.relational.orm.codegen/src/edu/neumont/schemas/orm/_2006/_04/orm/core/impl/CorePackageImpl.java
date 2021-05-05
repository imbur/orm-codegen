/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CoreFactory;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "core.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationContextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoCounterNumericDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoTimestampTemporalDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundToTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatedPathValueMustBeConsumedErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatedPathValueParameterBindingErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatedPathValueRequiresAggregationContextErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatedPathValueRequiresFunctionErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatedValueInputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatedValueRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatedValuesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatedValuesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatedValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass calculatedValueType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityConstraintRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityRangeOverlapErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityRangesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compatibleRolePlayerTypeErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compatibleSupertypesErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compatibleValueTypeInstanceValueErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintDuplicateNameErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintRoleProjectionRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintRoleProjectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintRoleSequenceJoinPathRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintRoleSequenceJoinPathTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintRoleSequenceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintRoleSequencesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintRoleSequenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintRoleSequenceWithJoinAndIdTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintRoleSequenceWithJoinTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintsType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintsType3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintsType4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintsType5EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correlatedPathRoleRequiresCompatibleRolePlayerErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customReferenceModesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customReferenceModeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeNotSpecifiedErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeRefRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateAndTimeTemporalDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTemporalDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalNumericDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivationExpressionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivationProjectionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivationProjectionsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivationSourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivationSourceType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedFactTypeRoleProjectionCompatibilityErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedRoleProjectionRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedRoleProjectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doublePrecisionFloatingPointNumericDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass duplicateReadingSignatureErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicColorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTypeInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTypeInstancesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTypeInstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTypeRequiresReferenceSchemeErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTypeRoleInstancesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTypeSubtypeInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTypeSubtypeInstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityConstraintImpliedByMandatoryConstraintsErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityConstraintRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalityImpliedByMandatoryErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusionConstraintRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusionConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusionContradictsEqualityErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusionContradictsMandatoryErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusionContradictsSubsetErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expandedDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalConstraintRoleSequenceArityMismatchErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factRolesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeDerivationExpressionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeDerivationPathRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeDerivationPathTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeDerivationProjectionRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeDerivationRequiresProjectionErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeDerivationRuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeInstancesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeInstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeRequiresInternalUniquenessConstraintErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeRequiresReadingErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeRoleInstancesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedLengthRawDataDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedLengthTextDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass floatingPointNumericDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyConstraintContradictsInternalUniquenessConstraintErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyConstraintExactlyOneErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyConstraintMinMaxErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyConstraintNonRestrictiveRangeErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyConstraintRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyConstraintViolatedByUniquenessConstraintErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDuplicateNameErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionParameterRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generationSettingsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generationSettingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generationStateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupDuplicateNameErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupElementsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupMembershipContradictionErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupTypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicationErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impliedFactRolesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impliedFactTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impliedInternalUniquenessConstraintErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informalDerivationRuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputFromTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instancesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalConstraintsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinedConstraintRoleProjectionCompatibilityErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinedPathRoleRequiresCompatibleRolePlayerErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinPathProjectionRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinPathProjectionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinPathProjectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinPathRequiredErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinPathRequiresProjectionErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinRuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass largeLengthRawDataDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass largeLengthTextDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leadRolePathRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leadRolePathTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mandatoryConstraintRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mandatoryConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass maxValueMismatchErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minValueMismatchErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelErrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelErrorDisplayFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelErrorsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelNoteReferencedByTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelNotesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelNoteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moneyNumericDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameGeneratorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedGroupsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nMinusOneErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notWellModeledSubsetAndMandatoryErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectIdOtherDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectificationRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectifiedFactTypeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectifiedInstanceRequiredErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectifiedTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectifiedUnaryRoleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectifyingInstanceRequiredErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeCardinalityRestrictionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeDuplicateNameErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeRequiresPrimarySupertypeErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeRoleInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectUnifierRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectUnifierRequiresCompatibleObjectTypesErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectUnifiersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectUnifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oleObjectRawDataDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ormModelRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ormModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialFactTypeDerivationProjectionErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialJoinPathProjectionErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialQueryDerivationProjectionErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathComponentsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathConditionRoleValueRestrictionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathConditionRootValueRestrictionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathConstantTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathedRoleRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathedRolesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathedRoleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathOuterJoinRequiresOptionalRoleErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathRequiresRootObjectTypeErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathSameFactTypeRoleFollowsJoinErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathStartRoleFollowsRootObjectTypeErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pictureRawDataDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playedRolesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationMandatoryErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass populationUniquenessErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preferredIdentifierRequiresMandatoryErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectedFromTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectedFromType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryDerivationPathRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryDerivationPathTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryDerivationRequiresProjectionErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryDerivationRuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParameterBindingsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParameterBindingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParametersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryParameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryRoleProjectionCompatibilityErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingOrdersTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingOrderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingRequiresUserModificationErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingRoleSequenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recognizedPhraseDuplicateNameErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recognizedPhraseRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recognizedPhrasesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recognizedPhrasesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recognizedPhraseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceModeKindRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceModeKindsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceModeKindTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refinementsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ringConstraintRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ringConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ringConstraintTypeNotSpecifiedErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleBasedDerivationProjectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleInstancesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleInstancesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleInstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolePathOwnerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolePathTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rolePlayerRequiredErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleProxyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSequenceRoleRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSequenceWithProjectionRoleRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSubPathRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleSubPathTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleValueRestrictionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootObjectTypeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootObjectTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowIdOtherDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setComparisonConstraintRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setComparisonConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setConstraintRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setConstraintWithJoinTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signedIntegerNumericDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signedLargeIntegerNumericDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signedSmallIntegerNumericDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singlePrecisionFloatingPointNumericDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subPathsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subqueriesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subqueryParameterInputsForTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subqueryParameterInputsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subqueryParameterInputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subqueryRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsetConstraintImpliedByMandatoryConstraintsErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsetConstraintRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subsetConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtypeDerivationPathTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtypeDerivationRuleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtypeFactTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtypeRolesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTemporalDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tooFewEntityTypeRoleInstancesErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tooFewFactTypeRoleInstancesErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tooFewReadingRolesErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tooFewRoleSequencesErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tooManyReadingRolesErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tooManyRoleSequencesErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trueOrFalseLogicalDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryRoleCardinalityRestrictionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniquenessConstraintRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniquenessConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedIntegerNumericDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedLargeIntegerNumericDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedSmallIntegerNumericDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsignedTinyIntegerNumericDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unspecifiedDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueComparisonConstraintOperatorNotSpecifiedErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueComparisonConstraintRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueComparisonConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueComparisonRolesNotComparableErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueConstraintRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueConstraintTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueConstraintWithNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueRangeOverlapErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueRangeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueRangesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueRangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeDetachedErrorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeInstanceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeInstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeValueRestrictionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableLengthRawDataDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableLengthTextDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yesOrNoLogicalDataTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum casingOptionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintModalityValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum derivationCompletenessValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum derivationExpressionStorageValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum derivationStorageValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalCombinationOperatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicityValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pathedRolePurposeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rangeInclusionValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceModeKindValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ringConstraintTypeValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum spacingFormatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeComplianceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum valueComparisonOperatorValuesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType casingOptionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType constraintModalityValuesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType derivationCompletenessValuesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType derivationExpressionStorageValuesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType derivationStorageValuesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType logicalCombinationOperatorTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType multiplicityValuesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pathedRolePurposeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rangeInclusionValuesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType referenceModeKindValuesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ringConstraintTypeValuesObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType spacingFormatTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType typeComplianceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType valueComparisonOperatorValuesObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCorePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CorePackageImpl theCorePackage = registeredCorePackage instanceof CorePackageImpl ? (CorePackageImpl)registeredCorePackage : new CorePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		theCorePackage.loadPackage();

		// Fix loaded packages
		theCorePackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CorePackage.eNS_URI, theCorePackage);
		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregationContextType() {
		if (aggregationContextTypeEClass == null) {
			aggregationContextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(0);
		}
		return aggregationContextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregationContextType_Group() {
        return (EAttribute)getAggregationContextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregationContextType_PathRoot() {
        return (EReference)getAggregationContextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregationContextType_PathedRole() {
        return (EReference)getAggregationContextType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasesType() {
		if (aliasesTypeEClass == null) {
			aliasesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(1);
		}
		return aliasesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasesType_Group() {
        return (EAttribute)getAliasesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasesType_Alias() {
        return (EReference)getAliasesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasType() {
		if (aliasTypeEClass == null) {
			aliasTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(2);
		}
		return aliasTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasType_Id() {
        return (EAttribute)getAliasType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasType_Name() {
        return (EAttribute)getAliasType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasType_NameConsumer() {
        return (EAttribute)getAliasType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAliasType_NameUsage() {
        return (EAttribute)getAliasType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutoCounterNumericDataTypeType() {
		if (autoCounterNumericDataTypeTypeEClass == null) {
			autoCounterNumericDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(3);
		}
		return autoCounterNumericDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutoTimestampTemporalDataTypeType() {
		if (autoTimestampTemporalDataTypeTypeEClass == null) {
			autoTimestampTemporalDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(4);
		}
		return autoTimestampTemporalDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundToType() {
		if (boundToTypeEClass == null) {
			boundToTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(5);
		}
		return boundToTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundToType_PathedRole() {
        return (EReference)getBoundToType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundToType_PathRoot() {
        return (EReference)getBoundToType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatedPathValueMustBeConsumedErrorType() {
		if (calculatedPathValueMustBeConsumedErrorTypeEClass == null) {
			calculatedPathValueMustBeConsumedErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(6);
		}
		return calculatedPathValueMustBeConsumedErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculatedPathValueMustBeConsumedErrorType_CalculatedValue() {
        return (EReference)getCalculatedPathValueMustBeConsumedErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatedPathValueParameterBindingErrorType() {
		if (calculatedPathValueParameterBindingErrorTypeEClass == null) {
			calculatedPathValueParameterBindingErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(7);
		}
		return calculatedPathValueParameterBindingErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculatedPathValueParameterBindingErrorType_CalculatedValue() {
        return (EReference)getCalculatedPathValueParameterBindingErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatedPathValueRequiresAggregationContextErrorType() {
		if (calculatedPathValueRequiresAggregationContextErrorTypeEClass == null) {
			calculatedPathValueRequiresAggregationContextErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(8);
		}
		return calculatedPathValueRequiresAggregationContextErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculatedPathValueRequiresAggregationContextErrorType_CalculatedValue() {
        return (EReference)getCalculatedPathValueRequiresAggregationContextErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatedPathValueRequiresFunctionErrorType() {
		if (calculatedPathValueRequiresFunctionErrorTypeEClass == null) {
			calculatedPathValueRequiresFunctionErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(9);
		}
		return calculatedPathValueRequiresFunctionErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculatedPathValueRequiresFunctionErrorType_CalculatedValue() {
        return (EReference)getCalculatedPathValueRequiresFunctionErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatedValueInputType() {
		if (calculatedValueInputTypeEClass == null) {
			calculatedValueInputTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(10);
		}
		return calculatedValueInputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculatedValueInputType_Parameter() {
        return (EReference)getCalculatedValueInputType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculatedValueInputType_Source() {
        return (EReference)getCalculatedValueInputType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculatedValueInputType_DistinctValues() {
        return (EAttribute)getCalculatedValueInputType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculatedValueInputType_Id() {
        return (EAttribute)getCalculatedValueInputType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatedValueRef() {
		if (calculatedValueRefEClass == null) {
			calculatedValueRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(11);
		}
		return calculatedValueRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculatedValueRef_Ref() {
        return (EAttribute)getCalculatedValueRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatedValuesType() {
		if (calculatedValuesTypeEClass == null) {
			calculatedValuesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(12);
		}
		return calculatedValuesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculatedValuesType_CalculatedValue() {
        return (EReference)getCalculatedValuesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatedValuesType1() {
		if (calculatedValuesType1EClass == null) {
			calculatedValuesType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(13);
		}
		return calculatedValuesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculatedValuesType1_CalculatedValue() {
        return (EReference)getCalculatedValuesType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatedValueType() {
		if (calculatedValueTypeEClass == null) {
			calculatedValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(14);
		}
		return calculatedValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculatedValueType_Parameter() {
        return (EReference)getCalculatedValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculatedValueType_Id() {
        return (EAttribute)getCalculatedValueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCalculatedValueType1() {
		if (calculatedValueType1EClass == null) {
			calculatedValueType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(15);
		}
		return calculatedValueType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculatedValueType1_Function() {
        return (EReference)getCalculatedValueType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculatedValueType1_AggregationContext() {
        return (EReference)getCalculatedValueType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculatedValueType1_Scope() {
        return (EReference)getCalculatedValueType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCalculatedValueType1_Inputs() {
        return (EReference)getCalculatedValueType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculatedValueType1_Id() {
        return (EAttribute)getCalculatedValueType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCalculatedValueType1_UniversalAggregationContext() {
        return (EAttribute)getCalculatedValueType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinalityConstraintRef() {
		if (cardinalityConstraintRefEClass == null) {
			cardinalityConstraintRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(16);
		}
		return cardinalityConstraintRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinalityConstraintRef_Ref() {
        return (EAttribute)getCardinalityConstraintRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinalityConstraintType() {
		if (cardinalityConstraintTypeEClass == null) {
			cardinalityConstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(17);
		}
		return cardinalityConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardinalityConstraintType_Ranges() {
        return (EReference)getCardinalityConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardinalityConstraintType_Extensions() {
        return (EReference)getCardinalityConstraintType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinalityRangeOverlapErrorType() {
		if (cardinalityRangeOverlapErrorTypeEClass == null) {
			cardinalityRangeOverlapErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(18);
		}
		return cardinalityRangeOverlapErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardinalityRangeOverlapErrorType_CardinalityConstraint() {
        return (EReference)getCardinalityRangeOverlapErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinalityRangesType() {
		if (cardinalityRangesTypeEClass == null) {
			cardinalityRangesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(19);
		}
		return cardinalityRangesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinalityRangesType_Group() {
        return (EAttribute)getCardinalityRangesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardinalityRangesType_CardinalityRange() {
        return (EReference)getCardinalityRangesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinalityRangeType() {
		if (cardinalityRangeTypeEClass == null) {
			cardinalityRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(20);
		}
		return cardinalityRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinalityRangeType_From() {
        return (EAttribute)getCardinalityRangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinalityRangeType_Id() {
        return (EAttribute)getCardinalityRangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinalityRangeType_To() {
        return (EAttribute)getCardinalityRangeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompatibleRolePlayerTypeErrorType() {
		if (compatibleRolePlayerTypeErrorTypeEClass == null) {
			compatibleRolePlayerTypeErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(23);
		}
		return compatibleRolePlayerTypeErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompatibleRolePlayerTypeErrorType_SetComparisonConstraint() {
        return (EReference)getCompatibleRolePlayerTypeErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompatibleRolePlayerTypeErrorType_SetConstraint() {
        return (EReference)getCompatibleRolePlayerTypeErrorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompatibleRolePlayerTypeErrorType_Column() {
        return (EAttribute)getCompatibleRolePlayerTypeErrorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompatibleSupertypesErrorType() {
		if (compatibleSupertypesErrorTypeEClass == null) {
			compatibleSupertypesErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(24);
		}
		return compatibleSupertypesErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompatibleSupertypesErrorType_ObjectType() {
        return (EReference)getCompatibleSupertypesErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompatibleValueTypeInstanceValueErrorType() {
		if (compatibleValueTypeInstanceValueErrorTypeEClass == null) {
			compatibleValueTypeInstanceValueErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(25);
		}
		return compatibleValueTypeInstanceValueErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompatibleValueTypeInstanceValueErrorType_ValueTypeInstance() {
        return (EReference)getCompatibleValueTypeInstanceValueErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionsType() {
		if (conditionsTypeEClass == null) {
			conditionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(26);
		}
		return conditionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionsType_CalculatedCondition() {
        return (EReference)getConditionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintDuplicateNameErrorType() {
		if (constraintDuplicateNameErrorTypeEClass == null) {
			constraintDuplicateNameErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(27);
		}
		return constraintDuplicateNameErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintDuplicateNameErrorType_Constraints() {
        return (EReference)getConstraintDuplicateNameErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintRoleProjectionRef() {
		if (constraintRoleProjectionRefEClass == null) {
			constraintRoleProjectionRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(30);
		}
		return constraintRoleProjectionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintRoleProjectionRef_Ref() {
        return (EAttribute)getConstraintRoleProjectionRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintRoleProjectionType() {
		if (constraintRoleProjectionTypeEClass == null) {
			constraintRoleProjectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(31);
		}
		return constraintRoleProjectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintRoleProjectionType_ProjectedFrom() {
        return (EReference)getConstraintRoleProjectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintRoleProjectionType_Id() {
        return (EAttribute)getConstraintRoleProjectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintRoleProjectionType_IsAutomatic() {
        return (EAttribute)getConstraintRoleProjectionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintRoleProjectionType_Ref() {
        return (EAttribute)getConstraintRoleProjectionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintRoleSequenceJoinPathRef() {
		if (constraintRoleSequenceJoinPathRefEClass == null) {
			constraintRoleSequenceJoinPathRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(32);
		}
		return constraintRoleSequenceJoinPathRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintRoleSequenceJoinPathRef_Ref() {
        return (EAttribute)getConstraintRoleSequenceJoinPathRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintRoleSequenceJoinPathType() {
		if (constraintRoleSequenceJoinPathTypeEClass == null) {
			constraintRoleSequenceJoinPathTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(33);
		}
		return constraintRoleSequenceJoinPathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintRoleSequenceJoinPathType_JoinPathProjections() {
        return (EReference)getConstraintRoleSequenceJoinPathType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintRoleSequenceJoinPathType_IsAutomatic() {
        return (EAttribute)getConstraintRoleSequenceJoinPathType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintRoleSequenceRef() {
		if (constraintRoleSequenceRefEClass == null) {
			constraintRoleSequenceRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(34);
		}
		return constraintRoleSequenceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintRoleSequenceRef_Ref() {
        return (EAttribute)getConstraintRoleSequenceRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintRoleSequencesType() {
		if (constraintRoleSequencesTypeEClass == null) {
			constraintRoleSequencesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(35);
		}
		return constraintRoleSequencesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintRoleSequencesType_RoleSequence() {
        return (EReference)getConstraintRoleSequencesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintRoleSequenceType() {
		if (constraintRoleSequenceTypeEClass == null) {
			constraintRoleSequenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(36);
		}
		return constraintRoleSequenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintRoleSequenceType_Role() {
        return (EReference)getConstraintRoleSequenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintRoleSequenceWithJoinAndIdType() {
		if (constraintRoleSequenceWithJoinAndIdTypeEClass == null) {
			constraintRoleSequenceWithJoinAndIdTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(37);
		}
		return constraintRoleSequenceWithJoinAndIdTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintRoleSequenceWithJoinAndIdType_Id() {
        return (EAttribute)getConstraintRoleSequenceWithJoinAndIdType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintRoleSequenceWithJoinType() {
		if (constraintRoleSequenceWithJoinTypeEClass == null) {
			constraintRoleSequenceWithJoinTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(38);
		}
		return constraintRoleSequenceWithJoinTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintRoleSequenceWithJoinType_Role() {
        return (EReference)getConstraintRoleSequenceWithJoinType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintRoleSequenceWithJoinType_JoinRule() {
        return (EReference)getConstraintRoleSequenceWithJoinType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintsType() {
		if (constraintsTypeEClass == null) {
			constraintsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(39);
		}
		return constraintsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintsType_Group() {
        return (EAttribute)getConstraintsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType_SetComparisonConstraint() {
        return (EReference)getConstraintsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType_SetConstraint() {
        return (EReference)getConstraintsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType_ValueConstraint() {
        return (EReference)getConstraintsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType_CardinalityConstraint() {
        return (EReference)getConstraintsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintsType1() {
		if (constraintsType1EClass == null) {
			constraintsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(40);
		}
		return constraintsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintsType1_Group() {
        return (EAttribute)getConstraintsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType1_ExclusionConstraintThatContradictsWithEquality() {
        return (EReference)getConstraintsType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType1_EqualityConstraint() {
        return (EReference)getConstraintsType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintsType2() {
		if (constraintsType2EClass == null) {
			constraintsType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(41);
		}
		return constraintsType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintsType2_Group() {
        return (EAttribute)getConstraintsType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType2_ExclusionConstraintThatContradictsWithSubset() {
        return (EReference)getConstraintsType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType2_SubsetConstraint() {
        return (EReference)getConstraintsType2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintsType3() {
		if (constraintsType3EClass == null) {
			constraintsType3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(42);
		}
		return constraintsType3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType3_MandatoryConstraint() {
        return (EReference)getConstraintsType3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType3_SubsetConstraint() {
        return (EReference)getConstraintsType3().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintsType4() {
		if (constraintsType4EClass == null) {
			constraintsType4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(43);
		}
		return constraintsType4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintsType4_Group() {
        return (EAttribute)getConstraintsType4().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType4_MandatoryConstraint() {
        return (EReference)getConstraintsType4().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType4_ExclusionConstraint() {
        return (EReference)getConstraintsType4().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintsType5() {
		if (constraintsType5EClass == null) {
			constraintsType5EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(44);
		}
		return constraintsType5EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintsType5_Group() {
        return (EAttribute)getConstraintsType5().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType5_EqualityConstraint() {
        return (EReference)getConstraintsType5().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType5_ExclusionConstraint() {
        return (EReference)getConstraintsType5().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType5_SubsetConstraint() {
        return (EReference)getConstraintsType5().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType5_FrequencyConstraint() {
        return (EReference)getConstraintsType5().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType5_MandatoryConstraint() {
        return (EReference)getConstraintsType5().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType5_UniquenessConstraint() {
        return (EReference)getConstraintsType5().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType5_RingConstraint() {
        return (EReference)getConstraintsType5().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintsType5_ValueComparisonConstraint() {
        return (EReference)getConstraintsType5().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintType() {
		if (constraintTypeEClass == null) {
			constraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(45);
		}
		return constraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintType_Definitions() {
        return (EReference)getConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintType_Notes() {
        return (EReference)getConstraintType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintType_Id() {
        return (EAttribute)getConstraintType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintType_Modality() {
        return (EAttribute)getConstraintType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstraintType_Name() {
        return (EAttribute)getConstraintType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrelatedPathRoleRequiresCompatibleRolePlayerErrorType() {
		if (correlatedPathRoleRequiresCompatibleRolePlayerErrorTypeEClass == null) {
			correlatedPathRoleRequiresCompatibleRolePlayerErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(46);
		}
		return correlatedPathRoleRequiresCompatibleRolePlayerErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrelatedPathRoleRequiresCompatibleRolePlayerErrorType_PathedRole() {
        return (EReference)getCorrelatedPathRoleRequiresCompatibleRolePlayerErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomReferenceModesType() {
		if (customReferenceModesTypeEClass == null) {
			customReferenceModesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(47);
		}
		return customReferenceModesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomReferenceModesType_Group() {
        return (EAttribute)getCustomReferenceModesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomReferenceModesType_CustomReferenceMode() {
        return (EReference)getCustomReferenceModesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomReferenceModeType() {
		if (customReferenceModeTypeEClass == null) {
			customReferenceModeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(48);
		}
		return customReferenceModeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomReferenceModeType_CustomFormatString() {
        return (EAttribute)getCustomReferenceModeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomReferenceModeType_Kind() {
        return (EReference)getCustomReferenceModeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomReferenceModeType_Id() {
        return (EAttribute)getCustomReferenceModeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomReferenceModeType_Name() {
        return (EAttribute)getCustomReferenceModeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		if (dataTypeEClass == null) {
			dataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(49);
		}
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_Extensions() {
        return (EReference)getDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataType_Id() {
        return (EAttribute)getDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeNotSpecifiedErrorType() {
		if (dataTypeNotSpecifiedErrorTypeEClass == null) {
			dataTypeNotSpecifiedErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(50);
		}
		return dataTypeNotSpecifiedErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeNotSpecifiedErrorType_ConceptualDataType() {
        return (EReference)getDataTypeNotSpecifiedErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeRef() {
		if (dataTypeRefEClass == null) {
			dataTypeRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(51);
		}
		return dataTypeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeRef_Id() {
        return (EAttribute)getDataTypeRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeRef_Length() {
        return (EAttribute)getDataTypeRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeRef_Ref() {
        return (EAttribute)getDataTypeRef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeRef_Scale() {
        return (EAttribute)getDataTypeRef().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeRefRef() {
		if (dataTypeRefRefEClass == null) {
			dataTypeRefRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(52);
		}
		return dataTypeRefRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeRefRef_Ref() {
        return (EAttribute)getDataTypeRefRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypesType() {
		if (dataTypesTypeEClass == null) {
			dataTypesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(53);
		}
		return dataTypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypesType_Group() {
        return (EAttribute)getDataTypesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_UnspecifiedDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_FixedLengthTextDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_VariableLengthTextDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_LargeLengthTextDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_SignedIntegerNumericDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_SignedSmallIntegerNumericDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_SignedLargeIntegerNumericDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_UnsignedIntegerNumericDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_UnsignedTinyIntegerNumericDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_UnsignedSmallIntegerNumericDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_UnsignedLargeIntegerNumericDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_AutoCounterNumericDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_FloatingPointNumericDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_SinglePrecisionFloatingPointNumericDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_DoublePrecisionFloatingPointNumericDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_DecimalNumericDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_MoneyNumericDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_FixedLengthRawDataDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_VariableLengthRawDataDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_LargeLengthRawDataDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_PictureRawDataDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_OleObjectRawDataDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_AutoTimestampTemporalDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_TimeTemporalDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_DateTemporalDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_DateAndTimeTemporalDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_TrueOrFalseLogicalDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_YesOrNoLogicalDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_RowIdOtherDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_ObjectIdOtherDataType() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateAndTimeTemporalDataTypeType() {
		if (dateAndTimeTemporalDataTypeTypeEClass == null) {
			dateAndTimeTemporalDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(54);
		}
		return dateAndTimeTemporalDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTemporalDataTypeType() {
		if (dateTemporalDataTypeTypeEClass == null) {
			dateTemporalDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(55);
		}
		return dateTemporalDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalNumericDataTypeType() {
		if (decimalNumericDataTypeTypeEClass == null) {
			decimalNumericDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(56);
		}
		return decimalNumericDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionsType() {
		if (definitionsTypeEClass == null) {
			definitionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(57);
		}
		return definitionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitionsType_Definition() {
        return (EReference)getDefinitionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitionType() {
		if (definitionTypeEClass == null) {
			definitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(58);
		}
		return definitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinitionType_Text() {
        return (EAttribute)getDefinitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinitionType_Id() {
        return (EAttribute)getDefinitionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivationExpressionType() {
		if (derivationExpressionTypeEClass == null) {
			derivationExpressionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(63);
		}
		return derivationExpressionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivationExpressionType_Body() {
        return (EAttribute)getDerivationExpressionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivationExpressionType_Id() {
        return (EAttribute)getDerivationExpressionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivationProjectionsType() {
		if (derivationProjectionsTypeEClass == null) {
			derivationProjectionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(64);
		}
		return derivationProjectionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivationProjectionsType_DerivationProjection() {
        return (EReference)getDerivationProjectionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivationProjectionsType1() {
		if (derivationProjectionsType1EClass == null) {
			derivationProjectionsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(65);
		}
		return derivationProjectionsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivationProjectionsType1_DerivationProjection() {
        return (EReference)getDerivationProjectionsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivationSourceType() {
		if (derivationSourceTypeEClass == null) {
			derivationSourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(66);
		}
		return derivationSourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivationSourceType_PathRoot() {
        return (EReference)getDerivationSourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivationSourceType_PathedRole() {
        return (EReference)getDerivationSourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivationSourceType_CalculatedValue() {
        return (EReference)getDerivationSourceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivationSourceType_Constant() {
        return (EReference)getDerivationSourceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivationSourceType1() {
		if (derivationSourceType1EClass == null) {
			derivationSourceType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(67);
		}
		return derivationSourceType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivationSourceType1_PathedRole() {
        return (EReference)getDerivationSourceType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivationSourceType1_CalculatedValue() {
        return (EReference)getDerivationSourceType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivationSourceType1_Constant() {
        return (EReference)getDerivationSourceType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedFactTypeRoleProjectionCompatibilityErrorType() {
		if (derivedFactTypeRoleProjectionCompatibilityErrorTypeEClass == null) {
			derivedFactTypeRoleProjectionCompatibilityErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(70);
		}
		return derivedFactTypeRoleProjectionCompatibilityErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedFactTypeRoleProjectionCompatibilityErrorType_DerivedRoleProjection() {
        return (EReference)getDerivedFactTypeRoleProjectionCompatibilityErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedRoleProjectionRef() {
		if (derivedRoleProjectionRefEClass == null) {
			derivedRoleProjectionRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(71);
		}
		return derivedRoleProjectionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivedRoleProjectionRef_Ref() {
        return (EAttribute)getDerivedRoleProjectionRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedRoleProjectionType() {
		if (derivedRoleProjectionTypeEClass == null) {
			derivedRoleProjectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(72);
		}
		return derivedRoleProjectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedRoleProjectionType_DerivationSource() {
        return (EReference)getDerivedRoleProjectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivedRoleProjectionType_Id() {
        return (EAttribute)getDerivedRoleProjectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivedRoleProjectionType_IsAutomatic() {
        return (EAttribute)getDerivedRoleProjectionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivedRoleProjectionType_Ref() {
        return (EAttribute)getDerivedRoleProjectionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(73);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DynamicColor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExtensionModelError() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenerationSetting() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GenerationState() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Grouping() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GroupType() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ModelErrorDisplayFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NameGenerator() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ORMModel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ORMModelBrowserDynamicColor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoublePrecisionFloatingPointNumericDataTypeType() {
		if (doublePrecisionFloatingPointNumericDataTypeTypeEClass == null) {
			doublePrecisionFloatingPointNumericDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(74);
		}
		return doublePrecisionFloatingPointNumericDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuplicateReadingSignatureErrorType() {
		if (duplicateReadingSignatureErrorTypeEClass == null) {
			duplicateReadingSignatureErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(75);
		}
		return duplicateReadingSignatureErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuplicateReadingSignatureErrorType_Readings() {
        return (EReference)getDuplicateReadingSignatureErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicColorType() {
		if (dynamicColorTypeEClass == null) {
			dynamicColorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(76);
		}
		return dynamicColorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicColorType_ColorRole() {
        return (EAttribute)getDynamicColorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDynamicColorType_ColorValue() {
        return (EAttribute)getDynamicColorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementRef() {
		if (elementRefEClass == null) {
			elementRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(77);
		}
		return elementRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementRef_Ref() {
        return (EAttribute)getElementRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityTypeInstanceRef() {
		if (entityTypeInstanceRefEClass == null) {
			entityTypeInstanceRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(78);
		}
		return entityTypeInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityTypeInstanceRef_Ref() {
        return (EAttribute)getEntityTypeInstanceRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityTypeInstancesType() {
		if (entityTypeInstancesTypeEClass == null) {
			entityTypeInstancesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(79);
		}
		return entityTypeInstancesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityTypeInstancesType_EntityTypeInstance() {
        return (EReference)getEntityTypeInstancesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityTypeInstancesType_EntityTypeSubtypeInstance() {
        return (EReference)getEntityTypeInstancesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityTypeInstanceType() {
		if (entityTypeInstanceTypeEClass == null) {
			entityTypeInstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(80);
		}
		return entityTypeInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityTypeInstanceType_RoleInstances() {
        return (EReference)getEntityTypeInstanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityTypeInstanceType_ObjectifiedInstance() {
        return (EReference)getEntityTypeInstanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityTypeInstanceType_Extensions() {
        return (EReference)getEntityTypeInstanceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityTypeInstanceType_Id() {
        return (EAttribute)getEntityTypeInstanceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityTypeRequiresReferenceSchemeErrorType() {
		if (entityTypeRequiresReferenceSchemeErrorTypeEClass == null) {
			entityTypeRequiresReferenceSchemeErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(81);
		}
		return entityTypeRequiresReferenceSchemeErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityTypeRequiresReferenceSchemeErrorType_EntityType() {
        return (EReference)getEntityTypeRequiresReferenceSchemeErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityTypeRoleInstancesType() {
		if (entityTypeRoleInstancesTypeEClass == null) {
			entityTypeRoleInstancesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(82);
		}
		return entityTypeRoleInstancesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityTypeRoleInstancesType_EntityTypeRoleInstance() {
        return (EReference)getEntityTypeRoleInstancesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityTypeSubtypeInstanceRef() {
		if (entityTypeSubtypeInstanceRefEClass == null) {
			entityTypeSubtypeInstanceRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(83);
		}
		return entityTypeSubtypeInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityTypeSubtypeInstanceRef_Ref() {
        return (EAttribute)getEntityTypeSubtypeInstanceRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityTypeSubtypeInstanceType() {
		if (entityTypeSubtypeInstanceTypeEClass == null) {
			entityTypeSubtypeInstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(84);
		}
		return entityTypeSubtypeInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityTypeSubtypeInstanceType_SupertypeInstance() {
        return (EReference)getEntityTypeSubtypeInstanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityTypeSubtypeInstanceType_ObjectifiedInstance() {
        return (EReference)getEntityTypeSubtypeInstanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityTypeSubtypeInstanceType_Extensions() {
        return (EReference)getEntityTypeSubtypeInstanceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityTypeSubtypeInstanceType_Id() {
        return (EAttribute)getEntityTypeSubtypeInstanceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntityTypeType() {
		if (entityTypeTypeEClass == null) {
			entityTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(85);
		}
		return entityTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityTypeType_PreferredIdentifier() {
        return (EReference)getEntityTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityTypeType_Instances() {
        return (EReference)getEntityTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityTypeType_Extensions() {
        return (EReference)getEntityTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityTypeType_ReferenceMode() {
        return (EAttribute)getEntityTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualityConstraintImpliedByMandatoryConstraintsErrorType() {
		if (equalityConstraintImpliedByMandatoryConstraintsErrorTypeEClass == null) {
			equalityConstraintImpliedByMandatoryConstraintsErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(86);
		}
		return equalityConstraintImpliedByMandatoryConstraintsErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEqualityConstraintImpliedByMandatoryConstraintsErrorType_EqualityConstraint() {
        return (EReference)getEqualityConstraintImpliedByMandatoryConstraintsErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualityConstraintRef() {
		if (equalityConstraintRefEClass == null) {
			equalityConstraintRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(87);
		}
		return equalityConstraintRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEqualityConstraintRef_Ref() {
        return (EAttribute)getEqualityConstraintRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualityConstraintType() {
		if (equalityConstraintTypeEClass == null) {
			equalityConstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(88);
		}
		return equalityConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEqualityConstraintType_Extensions() {
        return (EReference)getEqualityConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEqualityImpliedByMandatoryErrorType() {
		if (equalityImpliedByMandatoryErrorTypeEClass == null) {
			equalityImpliedByMandatoryErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(89);
		}
		return equalityImpliedByMandatoryErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEqualityImpliedByMandatoryErrorType_EqualityConstraint() {
        return (EReference)getEqualityImpliedByMandatoryErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusionConstraintRef() {
		if (exclusionConstraintRefEClass == null) {
			exclusionConstraintRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(90);
		}
		return exclusionConstraintRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExclusionConstraintRef_Ref() {
        return (EAttribute)getExclusionConstraintRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusionConstraintType() {
		if (exclusionConstraintTypeEClass == null) {
			exclusionConstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(91);
		}
		return exclusionConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusionConstraintType_ExclusiveOrMandatoryConstraint() {
        return (EReference)getExclusionConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusionConstraintType_Extensions() {
        return (EReference)getExclusionConstraintType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusionContradictsEqualityErrorType() {
		if (exclusionContradictsEqualityErrorTypeEClass == null) {
			exclusionContradictsEqualityErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(92);
		}
		return exclusionContradictsEqualityErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusionContradictsEqualityErrorType_Constraints() {
        return (EReference)getExclusionContradictsEqualityErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusionContradictsMandatoryErrorType() {
		if (exclusionContradictsMandatoryErrorTypeEClass == null) {
			exclusionContradictsMandatoryErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(93);
		}
		return exclusionContradictsMandatoryErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusionContradictsMandatoryErrorType_Constraints() {
        return (EReference)getExclusionContradictsMandatoryErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusionContradictsSubsetErrorType() {
		if (exclusionContradictsSubsetErrorTypeEClass == null) {
			exclusionContradictsSubsetErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(94);
		}
		return exclusionContradictsSubsetErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusionContradictsSubsetErrorType_Constraints() {
        return (EReference)getExclusionContradictsSubsetErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpandedDataType() {
		if (expandedDataTypeEClass == null) {
			expandedDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(95);
		}
		return expandedDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpandedDataType_RoleText() {
        return (EReference)getExpandedDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpandedDataType_FrontText() {
        return (EAttribute)getExpandedDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionsType() {
		if (extensionsTypeEClass == null) {
			extensionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(96);
		}
		return extensionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensionsType_Group() {
        return (EAttribute)getExtensionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensionsType_Any() {
        return (EAttribute)getExtensionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalConstraintRoleSequenceArityMismatchErrorType() {
		if (externalConstraintRoleSequenceArityMismatchErrorTypeEClass == null) {
			externalConstraintRoleSequenceArityMismatchErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(97);
		}
		return externalConstraintRoleSequenceArityMismatchErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalConstraintRoleSequenceArityMismatchErrorType_Constraint() {
        return (EReference)getExternalConstraintRoleSequenceArityMismatchErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactRolesType() {
		if (factRolesTypeEClass == null) {
			factRolesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(98);
		}
		return factRolesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactRolesType_Group() {
        return (EAttribute)getFactRolesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactRolesType_Role() {
        return (EReference)getFactRolesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypeDerivationExpressionType() {
		if (factTypeDerivationExpressionTypeEClass == null) {
			factTypeDerivationExpressionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(99);
		}
		return factTypeDerivationExpressionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeDerivationExpressionType_DerivationStorage() {
        return (EAttribute)getFactTypeDerivationExpressionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypeDerivationPathRef() {
		if (factTypeDerivationPathRefEClass == null) {
			factTypeDerivationPathRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(100);
		}
		return factTypeDerivationPathRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeDerivationPathRef_Ref() {
        return (EAttribute)getFactTypeDerivationPathRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypeDerivationPathType() {
		if (factTypeDerivationPathTypeEClass == null) {
			factTypeDerivationPathTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(101);
		}
		return factTypeDerivationPathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeDerivationPathType_DerivationProjections() {
        return (EReference)getFactTypeDerivationPathType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeDerivationPathType_InformalRule() {
        return (EReference)getFactTypeDerivationPathType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeDerivationPathType_DerivationCompleteness() {
        return (EAttribute)getFactTypeDerivationPathType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeDerivationPathType_DerivationStorage() {
        return (EAttribute)getFactTypeDerivationPathType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeDerivationPathType_ExternalDerivation() {
        return (EAttribute)getFactTypeDerivationPathType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeDerivationPathType_Name() {
        return (EAttribute)getFactTypeDerivationPathType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeDerivationPathType_SetProjection() {
        return (EAttribute)getFactTypeDerivationPathType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypeDerivationProjectionRef() {
		if (factTypeDerivationProjectionRefEClass == null) {
			factTypeDerivationProjectionRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(102);
		}
		return factTypeDerivationProjectionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeDerivationProjectionRef_Ref() {
        return (EAttribute)getFactTypeDerivationProjectionRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypeDerivationRequiresProjectionErrorType() {
		if (factTypeDerivationRequiresProjectionErrorTypeEClass == null) {
			factTypeDerivationRequiresProjectionErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(103);
		}
		return factTypeDerivationRequiresProjectionErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeDerivationRequiresProjectionErrorType_FactTypeDerivationPath() {
        return (EReference)getFactTypeDerivationRequiresProjectionErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypeDerivationRuleType() {
		if (factTypeDerivationRuleTypeEClass == null) {
			factTypeDerivationRuleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(104);
		}
		return factTypeDerivationRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeDerivationRuleType_DerivationExpression() {
        return (EReference)getFactTypeDerivationRuleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeDerivationRuleType_FactTypeDerivationPath() {
        return (EReference)getFactTypeDerivationRuleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypeInstanceRef() {
		if (factTypeInstanceRefEClass == null) {
			factTypeInstanceRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(105);
		}
		return factTypeInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeInstanceRef_Ref() {
        return (EAttribute)getFactTypeInstanceRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypeInstancesType() {
		if (factTypeInstancesTypeEClass == null) {
			factTypeInstancesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(106);
		}
		return factTypeInstancesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeInstancesType_FactTypeInstance() {
        return (EReference)getFactTypeInstancesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypeInstanceType() {
		if (factTypeInstanceTypeEClass == null) {
			factTypeInstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(107);
		}
		return factTypeInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeInstanceType_RoleInstances() {
        return (EReference)getFactTypeInstanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeInstanceType_Extensions() {
        return (EReference)getFactTypeInstanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeInstanceType_Id() {
        return (EAttribute)getFactTypeInstanceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypeRef() {
		if (factTypeRefEClass == null) {
			factTypeRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(108);
		}
		return factTypeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeRef_Ref() {
        return (EAttribute)getFactTypeRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypeRequiresInternalUniquenessConstraintErrorType() {
		if (factTypeRequiresInternalUniquenessConstraintErrorTypeEClass == null) {
			factTypeRequiresInternalUniquenessConstraintErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(109);
		}
		return factTypeRequiresInternalUniquenessConstraintErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeRequiresInternalUniquenessConstraintErrorType_Fact() {
        return (EReference)getFactTypeRequiresInternalUniquenessConstraintErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypeRequiresReadingErrorType() {
		if (factTypeRequiresReadingErrorTypeEClass == null) {
			factTypeRequiresReadingErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(110);
		}
		return factTypeRequiresReadingErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeRequiresReadingErrorType_Fact() {
        return (EReference)getFactTypeRequiresReadingErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypeRoleInstancesType() {
		if (factTypeRoleInstancesTypeEClass == null) {
			factTypeRoleInstancesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(111);
		}
		return factTypeRoleInstancesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeRoleInstancesType_FactTypeRoleInstance() {
        return (EReference)getFactTypeRoleInstancesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypesType() {
		if (factTypesTypeEClass == null) {
			factTypesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(112);
		}
		return factTypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypesType_Group() {
        return (EAttribute)getFactTypesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypesType_Fact() {
        return (EReference)getFactTypesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypesType_SubtypeFact() {
        return (EReference)getFactTypesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypesType_ImpliedFact() {
        return (EReference)getFactTypesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypeType() {
		if (factTypeTypeEClass == null) {
			factTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(113);
		}
		return factTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeType_Definitions() {
        return (EReference)getFactTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeType_Notes() {
        return (EReference)getFactTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeType_FactRoles() {
        return (EReference)getFactTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeType_ReadingOrders() {
        return (EReference)getFactTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeType_InternalConstraints() {
        return (EReference)getFactTypeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeType_DerivationRule() {
        return (EReference)getFactTypeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeType_Instances() {
        return (EReference)getFactTypeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeType_Extensions() {
        return (EReference)getFactTypeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeType_Name() {
        return (EAttribute)getFactTypeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeType_Id() {
        return (EAttribute)getFactTypeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeType_IsExternal() {
        return (EAttribute)getFactTypeType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedLengthRawDataDataTypeType() {
		if (fixedLengthRawDataDataTypeTypeEClass == null) {
			fixedLengthRawDataDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(114);
		}
		return fixedLengthRawDataDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedLengthTextDataTypeType() {
		if (fixedLengthTextDataTypeTypeEClass == null) {
			fixedLengthTextDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(115);
		}
		return fixedLengthTextDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFloatingPointNumericDataTypeType() {
		if (floatingPointNumericDataTypeTypeEClass == null) {
			floatingPointNumericDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(116);
		}
		return floatingPointNumericDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrequencyConstraintContradictsInternalUniquenessConstraintErrorType() {
		if (frequencyConstraintContradictsInternalUniquenessConstraintErrorTypeEClass == null) {
			frequencyConstraintContradictsInternalUniquenessConstraintErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(117);
		}
		return frequencyConstraintContradictsInternalUniquenessConstraintErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrequencyConstraintContradictsInternalUniquenessConstraintErrorType_FrequencyConstraint() {
        return (EReference)getFrequencyConstraintContradictsInternalUniquenessConstraintErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrequencyConstraintContradictsInternalUniquenessConstraintErrorType_Fact() {
        return (EReference)getFrequencyConstraintContradictsInternalUniquenessConstraintErrorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrequencyConstraintExactlyOneErrorType() {
		if (frequencyConstraintExactlyOneErrorTypeEClass == null) {
			frequencyConstraintExactlyOneErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(118);
		}
		return frequencyConstraintExactlyOneErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrequencyConstraintExactlyOneErrorType_FrequencyConstraint() {
        return (EReference)getFrequencyConstraintExactlyOneErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrequencyConstraintMinMaxErrorType() {
		if (frequencyConstraintMinMaxErrorTypeEClass == null) {
			frequencyConstraintMinMaxErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(119);
		}
		return frequencyConstraintMinMaxErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrequencyConstraintMinMaxErrorType_FrequencyConstraint() {
        return (EReference)getFrequencyConstraintMinMaxErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrequencyConstraintNonRestrictiveRangeErrorType() {
		if (frequencyConstraintNonRestrictiveRangeErrorTypeEClass == null) {
			frequencyConstraintNonRestrictiveRangeErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(120);
		}
		return frequencyConstraintNonRestrictiveRangeErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrequencyConstraintNonRestrictiveRangeErrorType_FrequencyConstraint() {
        return (EReference)getFrequencyConstraintNonRestrictiveRangeErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrequencyConstraintRef() {
		if (frequencyConstraintRefEClass == null) {
			frequencyConstraintRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(121);
		}
		return frequencyConstraintRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequencyConstraintRef_Ref() {
        return (EAttribute)getFrequencyConstraintRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrequencyConstraintType() {
		if (frequencyConstraintTypeEClass == null) {
			frequencyConstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(122);
		}
		return frequencyConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrequencyConstraintType_Extensions() {
        return (EReference)getFrequencyConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequencyConstraintType_MaxFrequency() {
        return (EAttribute)getFrequencyConstraintType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrequencyConstraintType_MinFrequency() {
        return (EAttribute)getFrequencyConstraintType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrequencyConstraintViolatedByUniquenessConstraintErrorType() {
		if (frequencyConstraintViolatedByUniquenessConstraintErrorTypeEClass == null) {
			frequencyConstraintViolatedByUniquenessConstraintErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(123);
		}
		return frequencyConstraintViolatedByUniquenessConstraintErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrequencyConstraintViolatedByUniquenessConstraintErrorType_FrequencyConstraint() {
        return (EReference)getFrequencyConstraintViolatedByUniquenessConstraintErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDuplicateNameErrorType() {
		if (functionDuplicateNameErrorTypeEClass == null) {
			functionDuplicateNameErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(124);
		}
		return functionDuplicateNameErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDuplicateNameErrorType_Functions() {
        return (EReference)getFunctionDuplicateNameErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionParameterRef() {
		if (functionParameterRefEClass == null) {
			functionParameterRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(125);
		}
		return functionParameterRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionParameterRef_Ref() {
        return (EAttribute)getFunctionParameterRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionParameterType() {
		if (functionParameterTypeEClass == null) {
			functionParameterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(126);
		}
		return functionParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionParameterType_BagInput() {
        return (EAttribute)getFunctionParameterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionParameterType_Id() {
        return (EAttribute)getFunctionParameterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionParameterType_Name() {
        return (EAttribute)getFunctionParameterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionRef() {
		if (functionRefEClass == null) {
			functionRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(127);
		}
		return functionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionRef_Ref() {
        return (EAttribute)getFunctionRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionsType() {
		if (functionsTypeEClass == null) {
			functionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(128);
		}
		return functionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionsType_Group() {
        return (EAttribute)getFunctionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionsType_Function() {
        return (EReference)getFunctionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionsType1() {
		if (functionsType1EClass == null) {
			functionsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(129);
		}
		return functionsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionsType1_Function() {
        return (EReference)getFunctionsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionType() {
		if (functionTypeEClass == null) {
			functionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(130);
		}
		return functionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionType_Parameters() {
        return (EReference)getFunctionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionType_Id() {
        return (EAttribute)getFunctionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionType_IsBoolean() {
        return (EAttribute)getFunctionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionType_Name() {
        return (EAttribute)getFunctionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionType_OperatorSymbol() {
        return (EAttribute)getFunctionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerationSettingsType() {
		if (generationSettingsTypeEClass == null) {
			generationSettingsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(131);
		}
		return generationSettingsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationSettingsType_Group() {
        return (EAttribute)getGenerationSettingsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationSettingsType_GenerationSettingGroup() {
        return (EAttribute)getGenerationSettingsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerationSettingsType_GenerationSetting() {
        return (EReference)getGenerationSettingsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerationSettingType() {
		if (generationSettingTypeEClass == null) {
			generationSettingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(132);
		}
		return generationSettingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationSettingType_Id() {
        return (EAttribute)getGenerationSettingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerationStateType() {
		if (generationStateTypeEClass == null) {
			generationStateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(133);
		}
		return generationStateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerationStateType_GenerationSettings() {
        return (EReference)getGenerationStateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenerationStateType_Id() {
        return (EAttribute)getGenerationStateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupDuplicateNameErrorType() {
		if (groupDuplicateNameErrorTypeEClass == null) {
			groupDuplicateNameErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(134);
		}
		return groupDuplicateNameErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupDuplicateNameErrorType_Groups() {
        return (EReference)getGroupDuplicateNameErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupElementsType() {
		if (groupElementsTypeEClass == null) {
			groupElementsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(135);
		}
		return groupElementsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupElementsType_Group() {
        return (EAttribute)getGroupElementsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupElementsType_IncludedElement() {
        return (EReference)getGroupElementsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupElementsType_ExcludedElement() {
        return (EReference)getGroupElementsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupingType() {
		if (groupingTypeEClass == null) {
			groupingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(136);
		}
		return groupingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupingType_ORMModel() {
        return (EReference)getGroupingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupingType_Groups() {
        return (EReference)getGroupingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupingType_Id() {
        return (EAttribute)getGroupingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupMembershipContradictionErrorType() {
		if (groupMembershipContradictionErrorTypeEClass == null) {
			groupMembershipContradictionErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(137);
		}
		return groupMembershipContradictionErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupMembershipContradictionErrorType_Group() {
        return (EReference)getGroupMembershipContradictionErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupRef() {
		if (groupRefEClass == null) {
			groupRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(138);
		}
		return groupRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupRef_Ref() {
        return (EAttribute)getGroupRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupsType() {
		if (groupsTypeEClass == null) {
			groupsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(139);
		}
		return groupsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupsType_Group() {
        return (EAttribute)getGroupsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupsType_Group1() {
        return (EReference)getGroupsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupsType1() {
		if (groupsType1EClass == null) {
			groupsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(140);
		}
		return groupsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupsType1_Group() {
        return (EReference)getGroupsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupType() {
		if (groupTypeEClass == null) {
			groupTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(141);
		}
		return groupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupType_Element() {
        return (EReference)getGroupType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType_Id() {
        return (EAttribute)getGroupType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupType1() {
		if (groupType1EClass == null) {
			groupType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(142);
		}
		return groupType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupType1_Definitions() {
        return (EReference)getGroupType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupType1_Notes() {
        return (EReference)getGroupType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupType1_GroupTypes() {
        return (EReference)getGroupType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupType1_Elements() {
        return (EReference)getGroupType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupType1_NestedGroups() {
        return (EReference)getGroupType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupType1_Extensions() {
        return (EReference)getGroupType1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType1_Id() {
        return (EAttribute)getGroupType1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType1_Name() {
        return (EAttribute)getGroupType1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType1_Priority() {
        return (EAttribute)getGroupType1().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupType1_TypeCompliance() {
        return (EAttribute)getGroupType1().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupTypesType() {
		if (groupTypesTypeEClass == null) {
			groupTypesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(143);
		}
		return groupTypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupTypesType_GroupTypeGroup() {
        return (EAttribute)getGroupTypesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupTypesType_GroupType() {
        return (EReference)getGroupTypesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupTypeType() {
		if (groupTypeTypeEClass == null) {
			groupTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(144);
		}
		return groupTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupTypeType_Id() {
        return (EAttribute)getGroupTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicationErrorType() {
		if (implicationErrorTypeEClass == null) {
			implicationErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(145);
		}
		return implicationErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicationErrorType_SetComparisonConstraint() {
        return (EReference)getImplicationErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImplicationErrorType_SetConstraint() {
        return (EReference)getImplicationErrorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImpliedFactRolesType() {
		if (impliedFactRolesTypeEClass == null) {
			impliedFactRolesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(146);
		}
		return impliedFactRolesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpliedFactRolesType_Role() {
        return (EReference)getImpliedFactRolesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpliedFactRolesType_RoleProxy() {
        return (EReference)getImpliedFactRolesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpliedFactRolesType_ObjectifiedUnaryRole() {
        return (EReference)getImpliedFactRolesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpliedFactRolesType_RoleProxy1() {
        return (EReference)getImpliedFactRolesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpliedFactRolesType_ObjectifiedUnaryRole1() {
        return (EReference)getImpliedFactRolesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpliedFactRolesType_Role1() {
        return (EReference)getImpliedFactRolesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImpliedFactTypeType() {
		if (impliedFactTypeTypeEClass == null) {
			impliedFactTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(147);
		}
		return impliedFactTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpliedFactTypeType_Definitions() {
        return (EReference)getImpliedFactTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpliedFactTypeType_Notes() {
        return (EReference)getImpliedFactTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpliedFactTypeType_FactRoles() {
        return (EReference)getImpliedFactTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpliedFactTypeType_ReadingOrders() {
        return (EReference)getImpliedFactTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpliedFactTypeType_InternalConstraints() {
        return (EReference)getImpliedFactTypeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpliedFactTypeType_DerivationRule() {
        return (EReference)getImpliedFactTypeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpliedFactTypeType_ImpliedByObjectification() {
        return (EReference)getImpliedFactTypeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpliedFactTypeType_Extensions() {
        return (EReference)getImpliedFactTypeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImpliedFactTypeType_Name() {
        return (EAttribute)getImpliedFactTypeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImpliedFactTypeType_Id() {
        return (EAttribute)getImpliedFactTypeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImpliedFactTypeType_IsExternal() {
        return (EAttribute)getImpliedFactTypeType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImpliedInternalUniquenessConstraintErrorType() {
		if (impliedInternalUniquenessConstraintErrorTypeEClass == null) {
			impliedInternalUniquenessConstraintErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(148);
		}
		return impliedInternalUniquenessConstraintErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImpliedInternalUniquenessConstraintErrorType_Fact() {
        return (EReference)getImpliedInternalUniquenessConstraintErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformalDerivationRuleType() {
		if (informalDerivationRuleTypeEClass == null) {
			informalDerivationRuleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(149);
		}
		return informalDerivationRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformalDerivationRuleType_DerivationNote() {
        return (EReference)getInformalDerivationRuleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputFromType() {
		if (inputFromTypeEClass == null) {
			inputFromTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(150);
		}
		return inputFromTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputFromType_PathRoot() {
        return (EReference)getInputFromType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputFromType_PathedRole() {
        return (EReference)getInputFromType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputFromType_CalculatedValue() {
        return (EReference)getInputFromType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputFromType_Constant() {
        return (EReference)getInputFromType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputsType() {
		if (inputsTypeEClass == null) {
			inputsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(151);
		}
		return inputsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputsType_Input() {
        return (EReference)getInputsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstancesType() {
		if (instancesTypeEClass == null) {
			instancesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(152);
		}
		return instancesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstancesType_ValueTypeInstance() {
        return (EReference)getInstancesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalConstraintsType() {
		if (internalConstraintsTypeEClass == null) {
			internalConstraintsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(153);
		}
		return internalConstraintsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInternalConstraintsType_Group() {
        return (EAttribute)getInternalConstraintsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalConstraintsType_UniquenessConstraint() {
        return (EReference)getInternalConstraintsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInternalConstraintsType_MandatoryConstraint() {
        return (EReference)getInternalConstraintsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinedConstraintRoleProjectionCompatibilityErrorType() {
		if (joinedConstraintRoleProjectionCompatibilityErrorTypeEClass == null) {
			joinedConstraintRoleProjectionCompatibilityErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(154);
		}
		return joinedConstraintRoleProjectionCompatibilityErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedConstraintRoleProjectionCompatibilityErrorType_ConstraintRoleProjection() {
        return (EReference)getJoinedConstraintRoleProjectionCompatibilityErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinedPathRoleRequiresCompatibleRolePlayerErrorType() {
		if (joinedPathRoleRequiresCompatibleRolePlayerErrorTypeEClass == null) {
			joinedPathRoleRequiresCompatibleRolePlayerErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(155);
		}
		return joinedPathRoleRequiresCompatibleRolePlayerErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinedPathRoleRequiresCompatibleRolePlayerErrorType_PathedRole() {
        return (EReference)getJoinedPathRoleRequiresCompatibleRolePlayerErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinPathProjectionRef() {
		if (joinPathProjectionRefEClass == null) {
			joinPathProjectionRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(156);
		}
		return joinPathProjectionRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinPathProjectionRef_Ref() {
        return (EAttribute)getJoinPathProjectionRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinPathProjectionsType() {
		if (joinPathProjectionsTypeEClass == null) {
			joinPathProjectionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(157);
		}
		return joinPathProjectionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinPathProjectionsType_JoinPathProjection() {
        return (EReference)getJoinPathProjectionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinPathProjectionType() {
		if (joinPathProjectionTypeEClass == null) {
			joinPathProjectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(158);
		}
		return joinPathProjectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinPathProjectionType_ConstraintRoleProjection() {
        return (EReference)getJoinPathProjectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinPathProjectionType_Id() {
        return (EAttribute)getJoinPathProjectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinPathProjectionType_Ref() {
        return (EAttribute)getJoinPathProjectionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinPathRequiredErrorType() {
		if (joinPathRequiredErrorTypeEClass == null) {
			joinPathRequiredErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(159);
		}
		return joinPathRequiredErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinPathRequiredErrorType_ConstraintRoleSequence() {
        return (EReference)getJoinPathRequiredErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinPathRequiresProjectionErrorType() {
		if (joinPathRequiresProjectionErrorTypeEClass == null) {
			joinPathRequiresProjectionErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(160);
		}
		return joinPathRequiresProjectionErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinPathRequiresProjectionErrorType_JoinPath() {
        return (EReference)getJoinPathRequiresProjectionErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinRuleType() {
		if (joinRuleTypeEClass == null) {
			joinRuleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(161);
		}
		return joinRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinRuleType_JoinPath() {
        return (EReference)getJoinRuleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLargeLengthRawDataDataTypeType() {
		if (largeLengthRawDataDataTypeTypeEClass == null) {
			largeLengthRawDataDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(162);
		}
		return largeLengthRawDataDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLargeLengthTextDataTypeType() {
		if (largeLengthTextDataTypeTypeEClass == null) {
			largeLengthTextDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(163);
		}
		return largeLengthTextDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeadRolePathRef() {
		if (leadRolePathRefEClass == null) {
			leadRolePathRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(164);
		}
		return leadRolePathRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLeadRolePathRef_Ref() {
        return (EAttribute)getLeadRolePathRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeadRolePathType() {
		if (leadRolePathTypeEClass == null) {
			leadRolePathTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(165);
		}
		return leadRolePathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeadRolePathType_ObjectUnifiers() {
        return (EReference)getLeadRolePathType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeadRolePathType_SubqueryParameterInputs() {
        return (EReference)getLeadRolePathType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeadRolePathType_CalculatedValues() {
        return (EReference)getLeadRolePathType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeadRolePathType_Conditions() {
        return (EReference)getLeadRolePathType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeadRolePathType_Notes() {
        return (EReference)getLeadRolePathType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMandatoryConstraintRef() {
		if (mandatoryConstraintRefEClass == null) {
			mandatoryConstraintRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(168);
		}
		return mandatoryConstraintRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandatoryConstraintRef_Ref() {
        return (EAttribute)getMandatoryConstraintRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMandatoryConstraintType() {
		if (mandatoryConstraintTypeEClass == null) {
			mandatoryConstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(169);
		}
		return mandatoryConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandatoryConstraintType_ExclusiveOrExclusionConstraint() {
        return (EReference)getMandatoryConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandatoryConstraintType_ImpliedByObjectType() {
        return (EReference)getMandatoryConstraintType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMandatoryConstraintType_Extensions() {
        return (EReference)getMandatoryConstraintType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandatoryConstraintType_IsImplied() {
        return (EAttribute)getMandatoryConstraintType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMandatoryConstraintType_IsSimple() {
        return (EAttribute)getMandatoryConstraintType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMaxValueMismatchErrorType() {
		if (maxValueMismatchErrorTypeEClass == null) {
			maxValueMismatchErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(170);
		}
		return maxValueMismatchErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMaxValueMismatchErrorType_ValueRange() {
        return (EReference)getMaxValueMismatchErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinValueMismatchErrorType() {
		if (minValueMismatchErrorTypeEClass == null) {
			minValueMismatchErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(171);
		}
		return minValueMismatchErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMinValueMismatchErrorType_ValueRange() {
        return (EReference)getMinValueMismatchErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelError() {
		if (modelErrorEClass == null) {
			modelErrorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(172);
		}
		return modelErrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelError_Id() {
        return (EAttribute)getModelError().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelError_Name() {
        return (EAttribute)getModelError().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelErrorDisplayFilterType() {
		if (modelErrorDisplayFilterTypeEClass == null) {
			modelErrorDisplayFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(173);
		}
		return modelErrorDisplayFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelErrorDisplayFilterType_Group() {
        return (EAttribute)getModelErrorDisplayFilterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelErrorDisplayFilterType_Any() {
        return (EAttribute)getModelErrorDisplayFilterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelErrorDisplayFilterType_AnyAttribute() {
        return (EAttribute)getModelErrorDisplayFilterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelErrorsType() {
		if (modelErrorsTypeEClass == null) {
			modelErrorsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(174);
		}
		return modelErrorsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelErrorsType_Group() {
        return (EAttribute)getModelErrorsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelErrorsType_ExtensionModelErrorGroup() {
        return (EAttribute)getModelErrorsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_ExtensionModelError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_ConstraintDuplicateNameError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_ObjectTypeDuplicateNameError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_RecognizedPhraseDuplicateNameError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_GroupDuplicateNameError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_FunctionDuplicateNameError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_DuplicateReadingSignatureError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_GroupMembershipContradictionError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_ExternalConstraintRoleSequenceArityMismatchError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_FactTypeRequiresInternalUniquenessConstraintError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_FactTypeRequiresReadingError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_TooFewEntityTypeRoleInstancesError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_TooFewFactTypeRoleInstancesError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_TooFewReadingRolesError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_ReadingRequiresUserModificationError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_TooFewRoleSequencesError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_TooManyReadingRolesError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_TooManyRoleSequencesError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_DataTypeNotSpecifiedError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_NMinusOneError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_CompatibleRolePlayerTypeError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_SupersetRoleOfSubtypeSubsetConstraintNotSubtypeError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_JoinPathRequiredError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_RolePlayerRequiredError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_EqualityImpliedByMandatoryError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_EntityTypeRequiresReferenceSchemeError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_FrequencyConstraintMinMaxError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_FrequencyConstraintExactlyOneError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_FrequencyConstraintNonRestrictiveRangeError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_FrequencyConstraintContradictsInternalUniquenessConstraintError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_FrequencyConstraintViolatedByUniquenessConstraintError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_MinValueMismatchError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_MaxValueMismatchError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_CardinalityRangeOverlapError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_ValueRangeOverlapError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_ValueTypeDetachedError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_RingConstraintTypeNotSpecifiedError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_ValueComparisonConstraintOperatorNotSpecifiedError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_ValueComparisonRolesNotComparableError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_ImplicationError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_SubsetConstraintImpliedByMandatoryConstraintsError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_EqualityConstraintImpliedByMandatoryConstraintsError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_ExclusionContradictsMandatoryError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_NotWellModeledSubsetAndMandatoryError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_ImpliedInternalUniquenessConstraintError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_ObjectTypeRequiresPrimarySupertypeError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_PreferredIdentifierRequiresMandatoryError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_CompatibleSupertypesError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_ObjectifyingInstanceRequiredError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_ObjectifiedInstanceRequiredError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_CompatibleValueTypeInstanceValueError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_PopulationMandatoryError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_PopulationUniquenessError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_ExclusionContradictsEqualityError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_ExclusionContradictsSubsetError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_PathRequiresRootObjectTypeError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_PathStartRoleFollowsRootObjectTypeError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_JoinedPathRoleRequiresCompatibleRolePlayerError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_CorrelatedPathRoleRequiresCompatibleRolePlayerError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_ObjectUnifierRequiresCompatibleObjectTypesError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_PathSameFactTypeRoleFollowsJoinError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_PathOuterJoinRequiresOptionalRoleError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_CalculatedPathValueRequiresAggregationContextError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_CalculatedPathValueRequiresFunctionError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_CalculatedPathValueMustBeConsumedError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_CalculatedPathValueParameterBindingError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_FactTypeDerivationRequiresProjectionError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_QueryDerivationRequiresProjectionError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_PartialFactTypeDerivationProjectionError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_PartialQueryDerivationProjectionError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_JoinPathRequiresProjectionError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_PartialJoinPathProjectionError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_DerivedFactTypeRoleProjectionCompatibilityError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_QueryRoleProjectionCompatibilityError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelErrorsType_JoinedConstraintRoleProjectionCompatibilityError() {
        return (EReference)getModelErrorsType().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelNoteReferencedByType() {
		if (modelNoteReferencedByTypeEClass == null) {
			modelNoteReferencedByTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(175);
		}
		return modelNoteReferencedByTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelNoteReferencedByType_Group() {
        return (EAttribute)getModelNoteReferencedByType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelNoteReferencedByType_FactType() {
        return (EReference)getModelNoteReferencedByType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelNoteReferencedByType_ObjectType() {
        return (EReference)getModelNoteReferencedByType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelNoteReferencedByType_SetConstraint() {
        return (EReference)getModelNoteReferencedByType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelNoteReferencedByType_SetComparisonConstraint() {
        return (EReference)getModelNoteReferencedByType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelNotesType() {
		if (modelNotesTypeEClass == null) {
			modelNotesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(176);
		}
		return modelNotesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelNotesType_Group() {
        return (EAttribute)getModelNotesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelNotesType_ModelNote() {
        return (EReference)getModelNotesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelNoteType() {
		if (modelNoteTypeEClass == null) {
			modelNoteTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(177);
		}
		return modelNoteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelNoteType_ReferencedBy() {
        return (EReference)getModelNoteType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoneyNumericDataTypeType() {
		if (moneyNumericDataTypeTypeEClass == null) {
			moneyNumericDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(178);
		}
		return moneyNumericDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameGeneratorType() {
		if (nameGeneratorTypeEClass == null) {
			nameGeneratorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(181);
		}
		return nameGeneratorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameGeneratorType_Extensions() {
        return (EReference)getNameGeneratorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameGeneratorType_Refinements() {
        return (EReference)getNameGeneratorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameGeneratorType_AutomaticallyShortenNames() {
        return (EAttribute)getNameGeneratorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameGeneratorType_CasingOption() {
        return (EAttribute)getNameGeneratorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameGeneratorType_Id() {
        return (EAttribute)getNameGeneratorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameGeneratorType_NameUsage() {
        return (EAttribute)getNameGeneratorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameGeneratorType_SpacingFormat() {
        return (EAttribute)getNameGeneratorType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameGeneratorType_SpacingReplacement() {
        return (EAttribute)getNameGeneratorType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameGeneratorType_UserDefinedMaximum() {
        return (EAttribute)getNameGeneratorType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameGeneratorType_UseTargetDefaultMaximum() {
        return (EAttribute)getNameGeneratorType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedGroupsType() {
		if (nestedGroupsTypeEClass == null) {
			nestedGroupsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(182);
		}
		return nestedGroupsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNestedGroupsType_Group() {
        return (EAttribute)getNestedGroupsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedGroupsType_IncludedGroup() {
        return (EReference)getNestedGroupsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedGroupsType_ExcludedGroup() {
        return (EReference)getNestedGroupsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNMinusOneErrorType() {
		if (nMinusOneErrorTypeEClass == null) {
			nMinusOneErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(183);
		}
		return nMinusOneErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNMinusOneErrorType_UniquenessConstraint() {
        return (EReference)getNMinusOneErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotesType() {
		if (notesTypeEClass == null) {
			notesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(184);
		}
		return notesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_Note() {
        return (EReference)getNotesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoteType() {
		if (noteTypeEClass == null) {
			noteTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(185);
		}
		return noteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteType_Text() {
        return (EAttribute)getNoteType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteType_Id() {
        return (EAttribute)getNoteType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotWellModeledSubsetAndMandatoryErrorType() {
		if (notWellModeledSubsetAndMandatoryErrorTypeEClass == null) {
			notWellModeledSubsetAndMandatoryErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(186);
		}
		return notWellModeledSubsetAndMandatoryErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotWellModeledSubsetAndMandatoryErrorType_Constraints() {
        return (EReference)getNotWellModeledSubsetAndMandatoryErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectIdOtherDataTypeType() {
		if (objectIdOtherDataTypeTypeEClass == null) {
			objectIdOtherDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(187);
		}
		return objectIdOtherDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectificationRef() {
		if (objectificationRefEClass == null) {
			objectificationRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(188);
		}
		return objectificationRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectificationRef_Ref() {
        return (EAttribute)getObjectificationRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectifiedFactTypeRef() {
		if (objectifiedFactTypeRefEClass == null) {
			objectifiedFactTypeRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(189);
		}
		return objectifiedFactTypeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectifiedFactTypeRef_Id() {
        return (EAttribute)getObjectifiedFactTypeRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectifiedFactTypeRef_IsImplied() {
        return (EAttribute)getObjectifiedFactTypeRef().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectifiedFactTypeRef_Ref() {
        return (EAttribute)getObjectifiedFactTypeRef().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectifiedInstanceRequiredErrorType() {
		if (objectifiedInstanceRequiredErrorTypeEClass == null) {
			objectifiedInstanceRequiredErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(190);
		}
		return objectifiedInstanceRequiredErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectifiedInstanceRequiredErrorType_EntityTypeInstance() {
        return (EReference)getObjectifiedInstanceRequiredErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectifiedInstanceRequiredErrorType_EntityTypeSubtypeInstance() {
        return (EReference)getObjectifiedInstanceRequiredErrorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectifiedTypeType() {
		if (objectifiedTypeTypeEClass == null) {
			objectifiedTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(191);
		}
		return objectifiedTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectifiedTypeType_PreferredIdentifier() {
        return (EReference)getObjectifiedTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectifiedTypeType_NestedPredicate() {
        return (EReference)getObjectifiedTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectifiedTypeType_Instances() {
        return (EReference)getObjectifiedTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectifiedTypeType_Extensions() {
        return (EReference)getObjectifiedTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectifiedTypeType_ReferenceMode() {
        return (EAttribute)getObjectifiedTypeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectifiedUnaryRoleType() {
		if (objectifiedUnaryRoleTypeEClass == null) {
			objectifiedUnaryRoleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(192);
		}
		return objectifiedUnaryRoleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectifiedUnaryRoleType_UnaryRole() {
        return (EReference)getObjectifiedUnaryRoleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectifiedUnaryRoleType_Extensions() {
        return (EReference)getObjectifiedUnaryRoleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectifyingInstanceRequiredErrorType() {
		if (objectifyingInstanceRequiredErrorTypeEClass == null) {
			objectifyingInstanceRequiredErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(193);
		}
		return objectifyingInstanceRequiredErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectifyingInstanceRequiredErrorType_FactTypeInstance() {
        return (EReference)getObjectifyingInstanceRequiredErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectsType() {
		if (objectsTypeEClass == null) {
			objectsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(194);
		}
		return objectsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectsType_Group() {
        return (EAttribute)getObjectsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectsType_Object() {
        return (EReference)getObjectsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectTypeCardinalityRestrictionType() {
		if (objectTypeCardinalityRestrictionTypeEClass == null) {
			objectTypeCardinalityRestrictionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(195);
		}
		return objectTypeCardinalityRestrictionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTypeCardinalityRestrictionType_CardinalityConstraint() {
        return (EReference)getObjectTypeCardinalityRestrictionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectTypeDuplicateNameErrorType() {
		if (objectTypeDuplicateNameErrorTypeEClass == null) {
			objectTypeDuplicateNameErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(196);
		}
		return objectTypeDuplicateNameErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTypeDuplicateNameErrorType_Objects() {
        return (EReference)getObjectTypeDuplicateNameErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectTypeInstanceRef() {
		if (objectTypeInstanceRefEClass == null) {
			objectTypeInstanceRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(197);
		}
		return objectTypeInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectTypeInstanceRef_Ref() {
        return (EAttribute)getObjectTypeInstanceRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectTypeRef() {
		if (objectTypeRefEClass == null) {
			objectTypeRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(198);
		}
		return objectTypeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectTypeRef_Ref() {
        return (EAttribute)getObjectTypeRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectTypeRequiresPrimarySupertypeErrorType() {
		if (objectTypeRequiresPrimarySupertypeErrorTypeEClass == null) {
			objectTypeRequiresPrimarySupertypeErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(199);
		}
		return objectTypeRequiresPrimarySupertypeErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTypeRequiresPrimarySupertypeErrorType_ObjectType() {
        return (EReference)getObjectTypeRequiresPrimarySupertypeErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectTypeRoleInstanceRef() {
		if (objectTypeRoleInstanceRefEClass == null) {
			objectTypeRoleInstanceRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(200);
		}
		return objectTypeRoleInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectTypeRoleInstanceRef_Ref() {
        return (EAttribute)getObjectTypeRoleInstanceRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectTypesType() {
		if (objectTypesTypeEClass == null) {
			objectTypesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(201);
		}
		return objectTypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectTypesType_Group() {
        return (EAttribute)getObjectTypesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTypesType_EntityType() {
        return (EReference)getObjectTypesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTypesType_ObjectifiedType() {
        return (EReference)getObjectTypesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTypesType_ValueType() {
        return (EReference)getObjectTypesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectTypeType() {
		if (objectTypeTypeEClass == null) {
			objectTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(202);
		}
		return objectTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTypeType_Definitions() {
        return (EReference)getObjectTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTypeType_Notes() {
        return (EReference)getObjectTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTypeType_Abbreviations() {
        return (EReference)getObjectTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTypeType_CardinalityRestriction() {
        return (EReference)getObjectTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTypeType_PlayedRoles() {
        return (EReference)getObjectTypeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTypeType_SubtypeDerivationRule() {
        return (EReference)getObjectTypeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectTypeType_Id() {
        return (EAttribute)getObjectTypeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectTypeType_IsExternal() {
        return (EAttribute)getObjectTypeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectTypeType_IsIndependent() {
        return (EAttribute)getObjectTypeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectTypeType_IsPersonal() {
        return (EAttribute)getObjectTypeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectTypeType_Name() {
        return (EAttribute)getObjectTypeType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectUnifierRef() {
		if (objectUnifierRefEClass == null) {
			objectUnifierRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(203);
		}
		return objectUnifierRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectUnifierRef_Ref() {
        return (EAttribute)getObjectUnifierRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectUnifierRequiresCompatibleObjectTypesErrorType() {
		if (objectUnifierRequiresCompatibleObjectTypesErrorTypeEClass == null) {
			objectUnifierRequiresCompatibleObjectTypesErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(204);
		}
		return objectUnifierRequiresCompatibleObjectTypesErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnifierRequiresCompatibleObjectTypesErrorType_ObjectUnifier() {
        return (EReference)getObjectUnifierRequiresCompatibleObjectTypesErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectUnifiersType() {
		if (objectUnifiersTypeEClass == null) {
			objectUnifiersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(205);
		}
		return objectUnifiersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnifiersType_ObjectUnifier() {
        return (EReference)getObjectUnifiersType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectUnifierType() {
		if (objectUnifierTypeEClass == null) {
			objectUnifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(206);
		}
		return objectUnifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectUnifierType_Group() {
        return (EAttribute)getObjectUnifierType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnifierType_PathRoot() {
        return (EReference)getObjectUnifierType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectUnifierType_PathedRole() {
        return (EReference)getObjectUnifierType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectUnifierType_Id() {
        return (EAttribute)getObjectUnifierType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOleObjectRawDataDataTypeType() {
		if (oleObjectRawDataDataTypeTypeEClass == null) {
			oleObjectRawDataDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(207);
		}
		return oleObjectRawDataDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getORMModelRef() {
		if (ormModelRefEClass == null) {
			ormModelRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(208);
		}
		return ormModelRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getORMModelRef_Ref() {
        return (EAttribute)getORMModelRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getORMModelType() {
		if (ormModelTypeEClass == null) {
			ormModelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(209);
		}
		return ormModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORMModelType_Definitions() {
        return (EReference)getORMModelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORMModelType_Notes() {
        return (EReference)getORMModelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORMModelType_Objects() {
        return (EReference)getORMModelType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORMModelType_Facts() {
        return (EReference)getORMModelType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORMModelType_Constraints() {
        return (EReference)getORMModelType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORMModelType_DataTypes() {
        return (EReference)getORMModelType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORMModelType_Functions() {
        return (EReference)getORMModelType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORMModelType_CustomReferenceModes() {
        return (EReference)getORMModelType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORMModelType_ModelNotes() {
        return (EReference)getORMModelType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORMModelType_ModelErrors() {
        return (EReference)getORMModelType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORMModelType_ReferenceModeKinds() {
        return (EReference)getORMModelType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORMModelType_RecognizedPhrases() {
        return (EReference)getORMModelType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORMModelType_Extensions() {
        return (EReference)getORMModelType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getORMModelType_Id() {
        return (EAttribute)getORMModelType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getORMModelType_Name() {
        return (EAttribute)getORMModelType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametersType() {
		if (parametersTypeEClass == null) {
			parametersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(210);
		}
		return parametersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParametersType_Parameter() {
        return (EReference)getParametersType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartialFactTypeDerivationProjectionErrorType() {
		if (partialFactTypeDerivationProjectionErrorTypeEClass == null) {
			partialFactTypeDerivationProjectionErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(211);
		}
		return partialFactTypeDerivationProjectionErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialFactTypeDerivationProjectionErrorType_DerivationProjection() {
        return (EReference)getPartialFactTypeDerivationProjectionErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartialJoinPathProjectionErrorType() {
		if (partialJoinPathProjectionErrorTypeEClass == null) {
			partialJoinPathProjectionErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(212);
		}
		return partialJoinPathProjectionErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialJoinPathProjectionErrorType_JoinPathProjection() {
        return (EReference)getPartialJoinPathProjectionErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartialQueryDerivationProjectionErrorType() {
		if (partialQueryDerivationProjectionErrorTypeEClass == null) {
			partialQueryDerivationProjectionErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(213);
		}
		return partialQueryDerivationProjectionErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialQueryDerivationProjectionErrorType_DerivationProjection() {
        return (EReference)getPartialQueryDerivationProjectionErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathComponentsType() {
		if (pathComponentsTypeEClass == null) {
			pathComponentsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(214);
		}
		return pathComponentsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathComponentsType_RolePath() {
        return (EReference)getPathComponentsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathComponentsType_SharedRolePath() {
        return (EReference)getPathComponentsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathComponentType() {
		if (pathComponentTypeEClass == null) {
			pathComponentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(215);
		}
		return pathComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathComponentType_RolePath() {
        return (EReference)getPathComponentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathConditionRoleValueRestrictionType() {
		if (pathConditionRoleValueRestrictionTypeEClass == null) {
			pathConditionRoleValueRestrictionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(216);
		}
		return pathConditionRoleValueRestrictionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathConditionRoleValueRestrictionType_PathedRoleConditionValueConstraint() {
        return (EReference)getPathConditionRoleValueRestrictionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathConditionRootValueRestrictionType() {
		if (pathConditionRootValueRestrictionTypeEClass == null) {
			pathConditionRootValueRestrictionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(217);
		}
		return pathConditionRootValueRestrictionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathConditionRootValueRestrictionType_PathRootConditionValueConstraint() {
        return (EReference)getPathConditionRootValueRestrictionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathConstantType() {
		if (pathConstantTypeEClass == null) {
			pathConstantTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(218);
		}
		return pathConstantTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathConstantType_Value() {
        return (EAttribute)getPathConstantType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathConstantType_Id() {
        return (EAttribute)getPathConstantType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathedRoleRef() {
		if (pathedRoleRefEClass == null) {
			pathedRoleRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(221);
		}
		return pathedRoleRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathedRoleRef_Ref() {
        return (EAttribute)getPathedRoleRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathedRolesType() {
		if (pathedRolesTypeEClass == null) {
			pathedRolesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(222);
		}
		return pathedRolesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathedRolesType_PathedRole() {
        return (EReference)getPathedRolesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathedRoleType() {
		if (pathedRoleTypeEClass == null) {
			pathedRoleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(223);
		}
		return pathedRoleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathedRoleType_ValueRestriction() {
        return (EReference)getPathedRoleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathedRoleType_CorrelatedWith() {
        return (EReference)getPathedRoleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathedRoleType_Id() {
        return (EAttribute)getPathedRoleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathedRoleType_IsNegated() {
        return (EAttribute)getPathedRoleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathedRoleType_Purpose() {
        return (EAttribute)getPathedRoleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathedRoleType_Ref() {
        return (EAttribute)getPathedRoleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathOuterJoinRequiresOptionalRoleErrorType() {
		if (pathOuterJoinRequiresOptionalRoleErrorTypeEClass == null) {
			pathOuterJoinRequiresOptionalRoleErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(224);
		}
		return pathOuterJoinRequiresOptionalRoleErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathOuterJoinRequiresOptionalRoleErrorType_PathedRole() {
        return (EReference)getPathOuterJoinRequiresOptionalRoleErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathRequiresRootObjectTypeErrorType() {
		if (pathRequiresRootObjectTypeErrorTypeEClass == null) {
			pathRequiresRootObjectTypeErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(225);
		}
		return pathRequiresRootObjectTypeErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathRequiresRootObjectTypeErrorType_RolePath() {
        return (EReference)getPathRequiresRootObjectTypeErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathRequiresRootObjectTypeErrorType_SubPath() {
        return (EReference)getPathRequiresRootObjectTypeErrorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathSameFactTypeRoleFollowsJoinErrorType() {
		if (pathSameFactTypeRoleFollowsJoinErrorTypeEClass == null) {
			pathSameFactTypeRoleFollowsJoinErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(226);
		}
		return pathSameFactTypeRoleFollowsJoinErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathSameFactTypeRoleFollowsJoinErrorType_PathedRole() {
        return (EReference)getPathSameFactTypeRoleFollowsJoinErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathStartRoleFollowsRootObjectTypeErrorType() {
		if (pathStartRoleFollowsRootObjectTypeErrorTypeEClass == null) {
			pathStartRoleFollowsRootObjectTypeErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(227);
		}
		return pathStartRoleFollowsRootObjectTypeErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathStartRoleFollowsRootObjectTypeErrorType_PathedRole() {
        return (EReference)getPathStartRoleFollowsRootObjectTypeErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPictureRawDataDataTypeType() {
		if (pictureRawDataDataTypeTypeEClass == null) {
			pictureRawDataDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(228);
		}
		return pictureRawDataDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayedRolesType() {
		if (playedRolesTypeEClass == null) {
			playedRolesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(229);
		}
		return playedRolesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayedRolesType_Group() {
        return (EAttribute)getPlayedRolesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayedRolesType_Role() {
        return (EReference)getPlayedRolesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayedRolesType_SubtypeMetaRole() {
        return (EReference)getPlayedRolesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayedRolesType_SupertypeMetaRole() {
        return (EReference)getPlayedRolesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopulationMandatoryErrorType() {
		if (populationMandatoryErrorTypeEClass == null) {
			populationMandatoryErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(230);
		}
		return populationMandatoryErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPopulationMandatoryErrorType_ObjectTypeInstance() {
        return (EReference)getPopulationMandatoryErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPopulationMandatoryErrorType_MandatoryConstraint() {
        return (EReference)getPopulationMandatoryErrorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPopulationUniquenessErrorType() {
		if (populationUniquenessErrorTypeEClass == null) {
			populationUniquenessErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(231);
		}
		return populationUniquenessErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPopulationUniquenessErrorType_RoleInstances() {
        return (EReference)getPopulationUniquenessErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreferredIdentifierRequiresMandatoryErrorType() {
		if (preferredIdentifierRequiresMandatoryErrorTypeEClass == null) {
			preferredIdentifierRequiresMandatoryErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(232);
		}
		return preferredIdentifierRequiresMandatoryErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreferredIdentifierRequiresMandatoryErrorType_ObjectType() {
        return (EReference)getPreferredIdentifierRequiresMandatoryErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectedFromType() {
		if (projectedFromTypeEClass == null) {
			projectedFromTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(233);
		}
		return projectedFromTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectedFromType_PathRoot() {
        return (EReference)getProjectedFromType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectedFromType_PathedRole() {
        return (EReference)getProjectedFromType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectedFromType_CalculatedValue() {
        return (EReference)getProjectedFromType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectedFromType_Constant() {
        return (EReference)getProjectedFromType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectedFromType1() {
		if (projectedFromType1EClass == null) {
			projectedFromType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(234);
		}
		return projectedFromType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectedFromType1_PathedRole() {
        return (EReference)getProjectedFromType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectedFromType1_CalculatedValue() {
        return (EReference)getProjectedFromType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectedFromType1_Constant() {
        return (EReference)getProjectedFromType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryDerivationPathRef() {
		if (queryDerivationPathRefEClass == null) {
			queryDerivationPathRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(235);
		}
		return queryDerivationPathRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryDerivationPathRef_Ref() {
        return (EAttribute)getQueryDerivationPathRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryDerivationPathType() {
		if (queryDerivationPathTypeEClass == null) {
			queryDerivationPathTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(236);
		}
		return queryDerivationPathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryDerivationPathType_DerivationProjections() {
        return (EReference)getQueryDerivationPathType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryDerivationRequiresProjectionErrorType() {
		if (queryDerivationRequiresProjectionErrorTypeEClass == null) {
			queryDerivationRequiresProjectionErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(237);
		}
		return queryDerivationRequiresProjectionErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryDerivationRequiresProjectionErrorType_QueryDerivationPath() {
        return (EReference)getQueryDerivationRequiresProjectionErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryDerivationRuleType() {
		if (queryDerivationRuleTypeEClass == null) {
			queryDerivationRuleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(238);
		}
		return queryDerivationRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryDerivationRuleType_QueryDerivationPath() {
        return (EReference)getQueryDerivationRuleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParameterBindingsType() {
		if (queryParameterBindingsTypeEClass == null) {
			queryParameterBindingsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(239);
		}
		return queryParameterBindingsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryParameterBindingsType_ParameterBinding() {
        return (EReference)getQueryParameterBindingsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParameterBindingType() {
		if (queryParameterBindingTypeEClass == null) {
			queryParameterBindingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(240);
		}
		return queryParameterBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryParameterBindingType_BoundTo() {
        return (EReference)getQueryParameterBindingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameterBindingType_Id() {
        return (EAttribute)getQueryParameterBindingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameterBindingType_Ref() {
        return (EAttribute)getQueryParameterBindingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParametersType() {
		if (queryParametersTypeEClass == null) {
			queryParametersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(241);
		}
		return queryParametersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryParametersType_QueryParameter() {
        return (EReference)getQueryParametersType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryParameterType() {
		if (queryParameterTypeEClass == null) {
			queryParameterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(242);
		}
		return queryParameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryParameterType_ParameterType() {
        return (EReference)getQueryParameterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryParameterType_ParameterBindings() {
        return (EReference)getQueryParameterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameterType_Id() {
        return (EAttribute)getQueryParameterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryParameterType_Name() {
        return (EAttribute)getQueryParameterType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryRoleProjectionCompatibilityErrorType() {
		if (queryRoleProjectionCompatibilityErrorTypeEClass == null) {
			queryRoleProjectionCompatibilityErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(243);
		}
		return queryRoleProjectionCompatibilityErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryRoleProjectionCompatibilityErrorType_DerivedRoleProjection() {
        return (EReference)getQueryRoleProjectionCompatibilityErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryType() {
		if (queryTypeEClass == null) {
			queryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(244);
		}
		return queryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryType_Definitions() {
        return (EReference)getQueryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryType_Notes() {
        return (EReference)getQueryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryType_QueryRoles() {
        return (EReference)getQueryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryType_DerivationRule() {
        return (EReference)getQueryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryType_QueryParameters() {
        return (EReference)getQueryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQueryType_Extensions() {
        return (EReference)getQueryType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryType_Signature() {
        return (EAttribute)getQueryType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryType_Id() {
        return (EAttribute)getQueryType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadingOrdersType() {
		if (readingOrdersTypeEClass == null) {
			readingOrdersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(247);
		}
		return readingOrdersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingOrdersType_Group() {
        return (EAttribute)getReadingOrdersType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadingOrdersType_ReadingOrder() {
        return (EReference)getReadingOrdersType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadingOrderType() {
		if (readingOrderTypeEClass == null) {
			readingOrderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(248);
		}
		return readingOrderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadingOrderType_Readings() {
        return (EReference)getReadingOrderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadingOrderType_RoleSequence() {
        return (EReference)getReadingOrderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingOrderType_Id() {
        return (EAttribute)getReadingOrderType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadingRef() {
		if (readingRefEClass == null) {
			readingRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(249);
		}
		return readingRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingRef_Ref() {
        return (EAttribute)getReadingRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadingRequiresUserModificationErrorType() {
		if (readingRequiresUserModificationErrorTypeEClass == null) {
			readingRequiresUserModificationErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(250);
		}
		return readingRequiresUserModificationErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadingRequiresUserModificationErrorType_Reading() {
        return (EReference)getReadingRequiresUserModificationErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadingRoleSequenceType() {
		if (readingRoleSequenceTypeEClass == null) {
			readingRoleSequenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(251);
		}
		return readingRoleSequenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingRoleSequenceType_Group() {
        return (EAttribute)getReadingRoleSequenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadingRoleSequenceType_Role() {
        return (EReference)getReadingRoleSequenceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadingsType() {
		if (readingsTypeEClass == null) {
			readingsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(252);
		}
		return readingsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingsType_Group() {
        return (EAttribute)getReadingsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadingsType_Reading() {
        return (EReference)getReadingsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadingsType1() {
		if (readingsType1EClass == null) {
			readingsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(253);
		}
		return readingsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingsType1_Group() {
        return (EAttribute)getReadingsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadingsType1_Reading() {
        return (EReference)getReadingsType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadingType() {
		if (readingTypeEClass == null) {
			readingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(254);
		}
		return readingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingType_Data() {
        return (EAttribute)getReadingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadingType_ExpandedData() {
        return (EReference)getReadingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadingType_Id() {
        return (EAttribute)getReadingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecognizedPhraseDuplicateNameErrorType() {
		if (recognizedPhraseDuplicateNameErrorTypeEClass == null) {
			recognizedPhraseDuplicateNameErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(255);
		}
		return recognizedPhraseDuplicateNameErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecognizedPhraseDuplicateNameErrorType_RecognizedPhrases() {
        return (EReference)getRecognizedPhraseDuplicateNameErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecognizedPhraseRef() {
		if (recognizedPhraseRefEClass == null) {
			recognizedPhraseRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(256);
		}
		return recognizedPhraseRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecognizedPhraseRef_Ref() {
        return (EAttribute)getRecognizedPhraseRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecognizedPhrasesType() {
		if (recognizedPhrasesTypeEClass == null) {
			recognizedPhrasesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(257);
		}
		return recognizedPhrasesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecognizedPhrasesType_RecognizedPhrase() {
        return (EReference)getRecognizedPhrasesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecognizedPhrasesType1() {
		if (recognizedPhrasesType1EClass == null) {
			recognizedPhrasesType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(258);
		}
		return recognizedPhrasesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecognizedPhrasesType1_Group() {
        return (EAttribute)getRecognizedPhrasesType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecognizedPhrasesType1_RecognizedPhrase() {
        return (EReference)getRecognizedPhrasesType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecognizedPhraseType() {
		if (recognizedPhraseTypeEClass == null) {
			recognizedPhraseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(259);
		}
		return recognizedPhraseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecognizedPhraseType_Abbreviations() {
        return (EReference)getRecognizedPhraseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecognizedPhraseType_Id() {
        return (EAttribute)getRecognizedPhraseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecognizedPhraseType_Name() {
        return (EAttribute)getRecognizedPhraseType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceModeKindRef() {
		if (referenceModeKindRefEClass == null) {
			referenceModeKindRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(260);
		}
		return referenceModeKindRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceModeKindRef_Ref() {
        return (EAttribute)getReferenceModeKindRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceModeKindsType() {
		if (referenceModeKindsTypeEClass == null) {
			referenceModeKindsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(261);
		}
		return referenceModeKindsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceModeKindsType_ReferenceModeKind() {
        return (EReference)getReferenceModeKindsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceModeKindType() {
		if (referenceModeKindTypeEClass == null) {
			referenceModeKindTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(262);
		}
		return referenceModeKindTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceModeKindType_FormatString() {
        return (EAttribute)getReferenceModeKindType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceModeKindType_Id() {
        return (EAttribute)getReferenceModeKindType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceModeKindType_ReferenceModeType() {
        return (EAttribute)getReferenceModeKindType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefinementsType() {
		if (refinementsTypeEClass == null) {
			refinementsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(265);
		}
		return refinementsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefinementsType_NameGenerator() {
        return (EReference)getRefinementsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRingConstraintRef() {
		if (ringConstraintRefEClass == null) {
			ringConstraintRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(266);
		}
		return ringConstraintRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRingConstraintRef_Ref() {
        return (EAttribute)getRingConstraintRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRingConstraintType() {
		if (ringConstraintTypeEClass == null) {
			ringConstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(267);
		}
		return ringConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRingConstraintType_Extensions() {
        return (EReference)getRingConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRingConstraintType_Type() {
        return (EAttribute)getRingConstraintType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRingConstraintTypeNotSpecifiedErrorType() {
		if (ringConstraintTypeNotSpecifiedErrorTypeEClass == null) {
			ringConstraintTypeNotSpecifiedErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(268);
		}
		return ringConstraintTypeNotSpecifiedErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRingConstraintTypeNotSpecifiedErrorType_RingConstraint() {
        return (EReference)getRingConstraintTypeNotSpecifiedErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleBasedDerivationProjectionType() {
		if (roleBasedDerivationProjectionTypeEClass == null) {
			roleBasedDerivationProjectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(271);
		}
		return roleBasedDerivationProjectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleBasedDerivationProjectionType_RoleProjection() {
        return (EReference)getRoleBasedDerivationProjectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleBasedDerivationProjectionType_Id() {
        return (EAttribute)getRoleBasedDerivationProjectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleBasedDerivationProjectionType_Ref() {
        return (EAttribute)getRoleBasedDerivationProjectionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleBaseType() {
		if (roleBaseTypeEClass == null) {
			roleBaseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(272);
		}
		return roleBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleBaseType_RolePlayer() {
        return (EReference)getRoleBaseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleBaseType_ValueRestriction() {
        return (EReference)getRoleBaseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleBaseType_CardinalityRestriction() {
        return (EReference)getRoleBaseType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleBaseType_DerivationSource() {
        return (EReference)getRoleBaseType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleBaseType_RoleInstances() {
        return (EReference)getRoleBaseType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleBaseType_IsMandatory() {
        return (EAttribute)getRoleBaseType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleBaseType_Multiplicity() {
        return (EAttribute)getRoleBaseType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleBaseType_Id() {
        return (EAttribute)getRoleBaseType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleBaseType_Name() {
        return (EAttribute)getRoleBaseType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleInstancesType() {
		if (roleInstancesTypeEClass == null) {
			roleInstancesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(273);
		}
		return roleInstancesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleInstancesType_Group() {
        return (EAttribute)getRoleInstancesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleInstancesType_FactTypeRoleInstance() {
        return (EReference)getRoleInstancesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleInstancesType_EntityTypeRoleInstance() {
        return (EReference)getRoleInstancesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleInstancesType1() {
		if (roleInstancesType1EClass == null) {
			roleInstancesType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(274);
		}
		return roleInstancesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleInstancesType1_Group() {
        return (EAttribute)getRoleInstancesType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleInstancesType1_EntityTypeRoleInstance() {
        return (EReference)getRoleInstancesType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleInstancesType1_ValueTypeRoleInstance() {
        return (EReference)getRoleInstancesType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleInstancesType1_FactTypeRoleInstance() {
        return (EReference)getRoleInstancesType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleInstanceType() {
		if (roleInstanceTypeEClass == null) {
			roleInstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(275);
		}
		return roleInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleInstanceType_Id() {
        return (EAttribute)getRoleInstanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleInstanceType_Ref() {
        return (EAttribute)getRoleInstanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRolePathOwnerType() {
		if (rolePathOwnerTypeEClass == null) {
			rolePathOwnerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(276);
		}
		return rolePathOwnerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolePathOwnerType_PathComponents() {
        return (EReference)getRolePathOwnerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolePathOwnerType_PathComponent() {
        return (EReference)getRolePathOwnerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolePathOwnerType_CalculatedValues() {
        return (EReference)getRolePathOwnerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolePathOwnerType_Subqueries() {
        return (EReference)getRolePathOwnerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRolePathOwnerType_Id() {
        return (EAttribute)getRolePathOwnerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRolePathType() {
		if (rolePathTypeEClass == null) {
			rolePathTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(277);
		}
		return rolePathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRolePathType_Group() {
        return (EAttribute)getRolePathType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolePathType_RootObjectType() {
        return (EReference)getRolePathType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolePathType_PathedRoles() {
        return (EReference)getRolePathType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolePathType_SubPaths() {
        return (EReference)getRolePathType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRolePathType_Id() {
        return (EAttribute)getRolePathType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRolePathType_SplitCombinationOperator() {
        return (EAttribute)getRolePathType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRolePathType_SplitIsNegated() {
        return (EAttribute)getRolePathType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRolePlayerRequiredErrorType() {
		if (rolePlayerRequiredErrorTypeEClass == null) {
			rolePlayerRequiredErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(278);
		}
		return rolePlayerRequiredErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRolePlayerRequiredErrorType_Role() {
        return (EReference)getRolePlayerRequiredErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleProxyType() {
		if (roleProxyTypeEClass == null) {
			roleProxyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(279);
		}
		return roleProxyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleProxyType_Role() {
        return (EReference)getRoleProxyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleProxyType_Extensions() {
        return (EReference)getRoleProxyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleProxyType_Id() {
        return (EAttribute)getRoleProxyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleRef() {
		if (roleRefEClass == null) {
			roleRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(280);
		}
		return roleRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleRef_Ref() {
        return (EAttribute)getRoleRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSequenceRoleRef() {
		if (roleSequenceRoleRefEClass == null) {
			roleSequenceRoleRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(281);
		}
		return roleSequenceRoleRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleSequenceRoleRef_Id() {
        return (EAttribute)getRoleSequenceRoleRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSequenceWithProjectionRoleRef() {
		if (roleSequenceWithProjectionRoleRefEClass == null) {
			roleSequenceWithProjectionRoleRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(282);
		}
		return roleSequenceWithProjectionRoleRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleSequenceWithProjectionRoleRef_ProjectedFrom() {
        return (EReference)getRoleSequenceWithProjectionRoleRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSubPathRef() {
		if (roleSubPathRefEClass == null) {
			roleSubPathRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(283);
		}
		return roleSubPathRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleSubPathRef_Ref() {
        return (EAttribute)getRoleSubPathRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleSubPathType() {
		if (roleSubPathTypeEClass == null) {
			roleSubPathTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(284);
		}
		return roleSubPathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleTextType() {
		if (roleTextTypeEClass == null) {
			roleTextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(285);
		}
		return roleTextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleTextType_FollowingText() {
        return (EAttribute)getRoleTextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleTextType_PostBoundText() {
        return (EAttribute)getRoleTextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleTextType_PreBoundText() {
        return (EAttribute)getRoleTextType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleTextType_RoleIndex() {
        return (EAttribute)getRoleTextType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleType() {
		if (roleTypeEClass == null) {
			roleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(286);
		}
		return roleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleType_Extensions() {
        return (EReference)getRoleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleValueRestrictionType() {
		if (roleValueRestrictionTypeEClass == null) {
			roleValueRestrictionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(287);
		}
		return roleValueRestrictionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleValueRestrictionType_RoleValueConstraint() {
        return (EReference)getRoleValueRestrictionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootObjectTypeRef() {
		if (rootObjectTypeRefEClass == null) {
			rootObjectTypeRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(288);
		}
		return rootObjectTypeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRootObjectTypeRef_Ref() {
        return (EAttribute)getRootObjectTypeRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootObjectTypeType() {
		if (rootObjectTypeTypeEClass == null) {
			rootObjectTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(289);
		}
		return rootObjectTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootObjectTypeType_ValueRestriction() {
        return (EReference)getRootObjectTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRootObjectTypeType_Id() {
        return (EAttribute)getRootObjectTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRootObjectTypeType_IsNegated() {
        return (EAttribute)getRootObjectTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRootObjectTypeType_Ref() {
        return (EAttribute)getRootObjectTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRowIdOtherDataTypeType() {
		if (rowIdOtherDataTypeTypeEClass == null) {
			rowIdOtherDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(290);
		}
		return rowIdOtherDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetComparisonConstraintRef() {
		if (setComparisonConstraintRefEClass == null) {
			setComparisonConstraintRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(291);
		}
		return setComparisonConstraintRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetComparisonConstraintRef_Ref() {
        return (EAttribute)getSetComparisonConstraintRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetComparisonConstraintType() {
		if (setComparisonConstraintTypeEClass == null) {
			setComparisonConstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(292);
		}
		return setComparisonConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetComparisonConstraintType_RoleSequences() {
        return (EReference)getSetComparisonConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetConstraintRef() {
		if (setConstraintRefEClass == null) {
			setConstraintRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(293);
		}
		return setConstraintRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetConstraintRef_Ref() {
        return (EAttribute)getSetConstraintRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetConstraintType() {
		if (setConstraintTypeEClass == null) {
			setConstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(294);
		}
		return setConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetConstraintType_RoleSequence() {
        return (EReference)getSetConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetConstraintWithJoinType() {
		if (setConstraintWithJoinTypeEClass == null) {
			setConstraintWithJoinTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(295);
		}
		return setConstraintWithJoinTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetConstraintWithJoinType_RoleSequence() {
        return (EReference)getSetConstraintWithJoinType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignedIntegerNumericDataTypeType() {
		if (signedIntegerNumericDataTypeTypeEClass == null) {
			signedIntegerNumericDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(296);
		}
		return signedIntegerNumericDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignedLargeIntegerNumericDataTypeType() {
		if (signedLargeIntegerNumericDataTypeTypeEClass == null) {
			signedLargeIntegerNumericDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(297);
		}
		return signedLargeIntegerNumericDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignedSmallIntegerNumericDataTypeType() {
		if (signedSmallIntegerNumericDataTypeTypeEClass == null) {
			signedSmallIntegerNumericDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(298);
		}
		return signedSmallIntegerNumericDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinglePrecisionFloatingPointNumericDataTypeType() {
		if (singlePrecisionFloatingPointNumericDataTypeTypeEClass == null) {
			singlePrecisionFloatingPointNumericDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(299);
		}
		return singlePrecisionFloatingPointNumericDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceType() {
		if (sourceTypeEClass == null) {
			sourceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(300);
		}
		return sourceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceType_PathRoot() {
        return (EReference)getSourceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceType_PathedRole() {
        return (EReference)getSourceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceType_CalculatedValue() {
        return (EReference)getSourceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceType_Constant() {
        return (EReference)getSourceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubPathsType() {
		if (subPathsTypeEClass == null) {
			subPathsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(303);
		}
		return subPathsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubPathsType_SubPath() {
        return (EReference)getSubPathsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubqueriesType() {
		if (subqueriesTypeEClass == null) {
			subqueriesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(304);
		}
		return subqueriesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubqueriesType_Subquery() {
        return (EReference)getSubqueriesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubqueriesType_SharedSubquery() {
        return (EReference)getSubqueriesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubqueryParameterInputsForType() {
		if (subqueryParameterInputsForTypeEClass == null) {
			subqueryParameterInputsForTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(305);
		}
		return subqueryParameterInputsForTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubqueryParameterInputsForType_ParameterInput() {
        return (EReference)getSubqueryParameterInputsForType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubqueryParameterInputsForType_Id() {
        return (EAttribute)getSubqueryParameterInputsForType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubqueryParameterInputsForType_Ref() {
        return (EAttribute)getSubqueryParameterInputsForType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubqueryParameterInputsType() {
		if (subqueryParameterInputsTypeEClass == null) {
			subqueryParameterInputsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(306);
		}
		return subqueryParameterInputsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubqueryParameterInputsType_SubqueryParameterInputsFor() {
        return (EReference)getSubqueryParameterInputsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubqueryParameterInputType() {
		if (subqueryParameterInputTypeEClass == null) {
			subqueryParameterInputTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(307);
		}
		return subqueryParameterInputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubqueryParameterInputType_InputFrom() {
        return (EReference)getSubqueryParameterInputType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubqueryParameterInputType_Id() {
        return (EAttribute)getSubqueryParameterInputType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubqueryParameterInputType_Ref() {
        return (EAttribute)getSubqueryParameterInputType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubqueryRef() {
		if (subqueryRefEClass == null) {
			subqueryRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(308);
		}
		return subqueryRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubqueryRef_Ref() {
        return (EAttribute)getSubqueryRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubsetConstraintImpliedByMandatoryConstraintsErrorType() {
		if (subsetConstraintImpliedByMandatoryConstraintsErrorTypeEClass == null) {
			subsetConstraintImpliedByMandatoryConstraintsErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(309);
		}
		return subsetConstraintImpliedByMandatoryConstraintsErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubsetConstraintImpliedByMandatoryConstraintsErrorType_SubsetConstraint() {
        return (EReference)getSubsetConstraintImpliedByMandatoryConstraintsErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubsetConstraintRef() {
		if (subsetConstraintRefEClass == null) {
			subsetConstraintRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(310);
		}
		return subsetConstraintRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubsetConstraintRef_Ref() {
        return (EAttribute)getSubsetConstraintRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubsetConstraintType() {
		if (subsetConstraintTypeEClass == null) {
			subsetConstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(311);
		}
		return subsetConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubsetConstraintType_Extensions() {
        return (EReference)getSubsetConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtypeDerivationPathType() {
		if (subtypeDerivationPathTypeEClass == null) {
			subtypeDerivationPathTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(312);
		}
		return subtypeDerivationPathTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtypeDerivationPathType_InformalRule() {
        return (EReference)getSubtypeDerivationPathType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubtypeDerivationPathType_DerivationCompleteness() {
        return (EAttribute)getSubtypeDerivationPathType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubtypeDerivationPathType_DerivationStorage() {
        return (EAttribute)getSubtypeDerivationPathType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubtypeDerivationPathType_ExternalDerivation() {
        return (EAttribute)getSubtypeDerivationPathType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtypeDerivationRuleType() {
		if (subtypeDerivationRuleTypeEClass == null) {
			subtypeDerivationRuleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(313);
		}
		return subtypeDerivationRuleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtypeDerivationRuleType_SubtypeDerivationExpression() {
        return (EReference)getSubtypeDerivationRuleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtypeDerivationRuleType_SubtypeDerivationPath() {
        return (EReference)getSubtypeDerivationRuleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtypeFactTypeType() {
		if (subtypeFactTypeTypeEClass == null) {
			subtypeFactTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(314);
		}
		return subtypeFactTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtypeFactTypeType_Definitions() {
        return (EReference)getSubtypeFactTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtypeFactTypeType_Notes() {
        return (EReference)getSubtypeFactTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtypeFactTypeType_FactRoles() {
        return (EReference)getSubtypeFactTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtypeFactTypeType_ReadingOrders() {
        return (EReference)getSubtypeFactTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtypeFactTypeType_InternalConstraints() {
        return (EReference)getSubtypeFactTypeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtypeFactTypeType_DerivationRule() {
        return (EReference)getSubtypeFactTypeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtypeFactTypeType_Instances() {
        return (EReference)getSubtypeFactTypeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtypeFactTypeType_Extensions() {
        return (EReference)getSubtypeFactTypeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubtypeFactTypeType_Name() {
        return (EAttribute)getSubtypeFactTypeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubtypeFactTypeType_Id() {
        return (EAttribute)getSubtypeFactTypeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubtypeFactTypeType_IsExternal() {
        return (EAttribute)getSubtypeFactTypeType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubtypeFactTypeType_IsPrimary() {
        return (EAttribute)getSubtypeFactTypeType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubtypeFactTypeType_PreferredIdentificationPath() {
        return (EAttribute)getSubtypeFactTypeType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtypeRolesType() {
		if (subtypeRolesTypeEClass == null) {
			subtypeRolesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(315);
		}
		return subtypeRolesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtypeRolesType_SupertypeMetaRole() {
        return (EReference)getSubtypeRolesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtypeRolesType_SubtypeMetaRole() {
        return (EReference)getSubtypeRolesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType() {
		if (supersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorTypeEClass == null) {
			supersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(316);
		}
		return supersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType_SubsetConstraint() {
        return (EReference)getSupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeTemporalDataTypeType() {
		if (timeTemporalDataTypeTypeEClass == null) {
			timeTemporalDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(317);
		}
		return timeTemporalDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTooFewEntityTypeRoleInstancesErrorType() {
		if (tooFewEntityTypeRoleInstancesErrorTypeEClass == null) {
			tooFewEntityTypeRoleInstancesErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(318);
		}
		return tooFewEntityTypeRoleInstancesErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTooFewEntityTypeRoleInstancesErrorType_EntityTypeInstance() {
        return (EReference)getTooFewEntityTypeRoleInstancesErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTooFewFactTypeRoleInstancesErrorType() {
		if (tooFewFactTypeRoleInstancesErrorTypeEClass == null) {
			tooFewFactTypeRoleInstancesErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(319);
		}
		return tooFewFactTypeRoleInstancesErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTooFewFactTypeRoleInstancesErrorType_FactTypeInstance() {
        return (EReference)getTooFewFactTypeRoleInstancesErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTooFewReadingRolesErrorType() {
		if (tooFewReadingRolesErrorTypeEClass == null) {
			tooFewReadingRolesErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(320);
		}
		return tooFewReadingRolesErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTooFewReadingRolesErrorType_Reading() {
        return (EReference)getTooFewReadingRolesErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTooFewRoleSequencesErrorType() {
		if (tooFewRoleSequencesErrorTypeEClass == null) {
			tooFewRoleSequencesErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(321);
		}
		return tooFewRoleSequencesErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTooFewRoleSequencesErrorType_SetComparisonConstraint() {
        return (EReference)getTooFewRoleSequencesErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTooFewRoleSequencesErrorType_SetConstraint() {
        return (EReference)getTooFewRoleSequencesErrorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTooManyReadingRolesErrorType() {
		if (tooManyReadingRolesErrorTypeEClass == null) {
			tooManyReadingRolesErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(322);
		}
		return tooManyReadingRolesErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTooManyReadingRolesErrorType_Reading() {
        return (EReference)getTooManyReadingRolesErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTooManyRoleSequencesErrorType() {
		if (tooManyRoleSequencesErrorTypeEClass == null) {
			tooManyRoleSequencesErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(323);
		}
		return tooManyRoleSequencesErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTooManyRoleSequencesErrorType_SetComparisonConstraint() {
        return (EReference)getTooManyRoleSequencesErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTooManyRoleSequencesErrorType_SetConstraint() {
        return (EReference)getTooManyRoleSequencesErrorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrueOrFalseLogicalDataTypeType() {
		if (trueOrFalseLogicalDataTypeTypeEClass == null) {
			trueOrFalseLogicalDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(324);
		}
		return trueOrFalseLogicalDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryRoleCardinalityRestrictionType() {
		if (unaryRoleCardinalityRestrictionTypeEClass == null) {
			unaryRoleCardinalityRestrictionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(327);
		}
		return unaryRoleCardinalityRestrictionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryRoleCardinalityRestrictionType_UnaryRoleCardinalityConstraint() {
        return (EReference)getUnaryRoleCardinalityRestrictionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniquenessConstraintRef() {
		if (uniquenessConstraintRefEClass == null) {
			uniquenessConstraintRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(328);
		}
		return uniquenessConstraintRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniquenessConstraintRef_Ref() {
        return (EAttribute)getUniquenessConstraintRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniquenessConstraintType() {
		if (uniquenessConstraintTypeEClass == null) {
			uniquenessConstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(329);
		}
		return uniquenessConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniquenessConstraintType_PreferredIdentifierFor() {
        return (EReference)getUniquenessConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniquenessConstraintType_Extensions() {
        return (EReference)getUniquenessConstraintType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUniquenessConstraintType_IsInternal() {
        return (EAttribute)getUniquenessConstraintType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsignedIntegerNumericDataTypeType() {
		if (unsignedIntegerNumericDataTypeTypeEClass == null) {
			unsignedIntegerNumericDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(330);
		}
		return unsignedIntegerNumericDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsignedLargeIntegerNumericDataTypeType() {
		if (unsignedLargeIntegerNumericDataTypeTypeEClass == null) {
			unsignedLargeIntegerNumericDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(331);
		}
		return unsignedLargeIntegerNumericDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsignedSmallIntegerNumericDataTypeType() {
		if (unsignedSmallIntegerNumericDataTypeTypeEClass == null) {
			unsignedSmallIntegerNumericDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(332);
		}
		return unsignedSmallIntegerNumericDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsignedTinyIntegerNumericDataTypeType() {
		if (unsignedTinyIntegerNumericDataTypeTypeEClass == null) {
			unsignedTinyIntegerNumericDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(333);
		}
		return unsignedTinyIntegerNumericDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnspecifiedDataTypeType() {
		if (unspecifiedDataTypeTypeEClass == null) {
			unspecifiedDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(334);
		}
		return unspecifiedDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueComparisonConstraintOperatorNotSpecifiedErrorType() {
		if (valueComparisonConstraintOperatorNotSpecifiedErrorTypeEClass == null) {
			valueComparisonConstraintOperatorNotSpecifiedErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(335);
		}
		return valueComparisonConstraintOperatorNotSpecifiedErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueComparisonConstraintOperatorNotSpecifiedErrorType_ValueComparisonConstraint() {
        return (EReference)getValueComparisonConstraintOperatorNotSpecifiedErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueComparisonConstraintRef() {
		if (valueComparisonConstraintRefEClass == null) {
			valueComparisonConstraintRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(336);
		}
		return valueComparisonConstraintRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueComparisonConstraintRef_Ref() {
        return (EAttribute)getValueComparisonConstraintRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueComparisonConstraintType() {
		if (valueComparisonConstraintTypeEClass == null) {
			valueComparisonConstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(337);
		}
		return valueComparisonConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueComparisonConstraintType_Extensions() {
        return (EReference)getValueComparisonConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueComparisonConstraintType_Operator() {
        return (EAttribute)getValueComparisonConstraintType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueComparisonRolesNotComparableErrorType() {
		if (valueComparisonRolesNotComparableErrorTypeEClass == null) {
			valueComparisonRolesNotComparableErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(340);
		}
		return valueComparisonRolesNotComparableErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueComparisonRolesNotComparableErrorType_ValueComparisonConstraint() {
        return (EReference)getValueComparisonRolesNotComparableErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueConstraintRef() {
		if (valueConstraintRefEClass == null) {
			valueConstraintRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(341);
		}
		return valueConstraintRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueConstraintRef_Ref() {
        return (EAttribute)getValueConstraintRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueConstraintType() {
		if (valueConstraintTypeEClass == null) {
			valueConstraintTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(342);
		}
		return valueConstraintTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueConstraintType_Definitions() {
        return (EReference)getValueConstraintType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueConstraintType_Notes() {
        return (EReference)getValueConstraintType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueConstraintType_ValueRanges() {
        return (EReference)getValueConstraintType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueConstraintType_Extensions() {
        return (EReference)getValueConstraintType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueConstraintType_Id() {
        return (EAttribute)getValueConstraintType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueConstraintWithNameType() {
		if (valueConstraintWithNameTypeEClass == null) {
			valueConstraintWithNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(343);
		}
		return valueConstraintWithNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueConstraintWithNameType_Name() {
        return (EAttribute)getValueConstraintWithNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueRangeOverlapErrorType() {
		if (valueRangeOverlapErrorTypeEClass == null) {
			valueRangeOverlapErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(344);
		}
		return valueRangeOverlapErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueRangeOverlapErrorType_ValueConstraint() {
        return (EReference)getValueRangeOverlapErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueRangeRef() {
		if (valueRangeRefEClass == null) {
			valueRangeRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(345);
		}
		return valueRangeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeRef_Ref() {
        return (EAttribute)getValueRangeRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueRangesType() {
		if (valueRangesTypeEClass == null) {
			valueRangesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(346);
		}
		return valueRangesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangesType_Group() {
        return (EAttribute)getValueRangesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueRangesType_ValueRange() {
        return (EReference)getValueRangesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueRangeType() {
		if (valueRangeTypeEClass == null) {
			valueRangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(347);
		}
		return valueRangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_Id() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_InvariantMaxValue() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_InvariantMinValue() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_MaxInclusion() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_MaxValue() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_MinInclusion() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueRangeType_MinValue() {
        return (EAttribute)getValueRangeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueTypeDetachedErrorType() {
		if (valueTypeDetachedErrorTypeEClass == null) {
			valueTypeDetachedErrorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(348);
		}
		return valueTypeDetachedErrorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueTypeDetachedErrorType_ValueConstraint() {
        return (EReference)getValueTypeDetachedErrorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueTypeInstanceRef() {
		if (valueTypeInstanceRefEClass == null) {
			valueTypeInstanceRefEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(349);
		}
		return valueTypeInstanceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueTypeInstanceRef_Ref() {
        return (EAttribute)getValueTypeInstanceRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueTypeInstanceType() {
		if (valueTypeInstanceTypeEClass == null) {
			valueTypeInstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(350);
		}
		return valueTypeInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueTypeInstanceType_Value() {
        return (EAttribute)getValueTypeInstanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueTypeInstanceType_InvariantValue() {
        return (EAttribute)getValueTypeInstanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueTypeInstanceType_Extensions() {
        return (EReference)getValueTypeInstanceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueTypeInstanceType_Id() {
        return (EAttribute)getValueTypeInstanceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueTypeType() {
		if (valueTypeTypeEClass == null) {
			valueTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(351);
		}
		return valueTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueTypeType_ConceptualDataType() {
        return (EReference)getValueTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueTypeType_ValueRestriction() {
        return (EReference)getValueTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueTypeType_Instances() {
        return (EReference)getValueTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueTypeType_Extensions() {
        return (EReference)getValueTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueTypeType_IsImplicitBooleanValue() {
        return (EAttribute)getValueTypeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueTypeValueRestrictionType() {
		if (valueTypeValueRestrictionTypeEClass == null) {
			valueTypeValueRestrictionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(352);
		}
		return valueTypeValueRestrictionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueTypeValueRestrictionType_ValueConstraint() {
        return (EReference)getValueTypeValueRestrictionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableLengthRawDataDataTypeType() {
		if (variableLengthRawDataDataTypeTypeEClass == null) {
			variableLengthRawDataDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(353);
		}
		return variableLengthRawDataDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableLengthTextDataTypeType() {
		if (variableLengthTextDataTypeTypeEClass == null) {
			variableLengthTextDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(354);
		}
		return variableLengthTextDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getYesOrNoLogicalDataTypeType() {
		if (yesOrNoLogicalDataTypeTypeEClass == null) {
			yesOrNoLogicalDataTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(355);
		}
		return yesOrNoLogicalDataTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCasingOptionType() {
		if (casingOptionTypeEEnum == null) {
			casingOptionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(21);
		}
		return casingOptionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintModalityValues() {
		if (constraintModalityValuesEEnum == null) {
			constraintModalityValuesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(28);
		}
		return constraintModalityValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDerivationCompletenessValues() {
		if (derivationCompletenessValuesEEnum == null) {
			derivationCompletenessValuesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(59);
		}
		return derivationCompletenessValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDerivationExpressionStorageValues() {
		if (derivationExpressionStorageValuesEEnum == null) {
			derivationExpressionStorageValuesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(61);
		}
		return derivationExpressionStorageValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDerivationStorageValues() {
		if (derivationStorageValuesEEnum == null) {
			derivationStorageValuesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(68);
		}
		return derivationStorageValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalCombinationOperatorType() {
		if (logicalCombinationOperatorTypeEEnum == null) {
			logicalCombinationOperatorTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(166);
		}
		return logicalCombinationOperatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplicityValues() {
		if (multiplicityValuesEEnum == null) {
			multiplicityValuesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(179);
		}
		return multiplicityValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPathedRolePurposeType() {
		if (pathedRolePurposeTypeEEnum == null) {
			pathedRolePurposeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(219);
		}
		return pathedRolePurposeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRangeInclusionValues() {
		if (rangeInclusionValuesEEnum == null) {
			rangeInclusionValuesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(245);
		}
		return rangeInclusionValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferenceModeKindValues() {
		if (referenceModeKindValuesEEnum == null) {
			referenceModeKindValuesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(263);
		}
		return referenceModeKindValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRingConstraintTypeValues() {
		if (ringConstraintTypeValuesEEnum == null) {
			ringConstraintTypeValuesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(269);
		}
		return ringConstraintTypeValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpacingFormatType() {
		if (spacingFormatTypeEEnum == null) {
			spacingFormatTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(301);
		}
		return spacingFormatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypeComplianceType() {
		if (typeComplianceTypeEEnum == null) {
			typeComplianceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(325);
		}
		return typeComplianceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValueComparisonOperatorValues() {
		if (valueComparisonOperatorValuesEEnum == null) {
			valueComparisonOperatorValuesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(338);
		}
		return valueComparisonOperatorValuesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCasingOptionTypeObject() {
		if (casingOptionTypeObjectEDataType == null) {
			casingOptionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(22);
		}
		return casingOptionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConstraintModalityValuesObject() {
		if (constraintModalityValuesObjectEDataType == null) {
			constraintModalityValuesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(29);
		}
		return constraintModalityValuesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDerivationCompletenessValuesObject() {
		if (derivationCompletenessValuesObjectEDataType == null) {
			derivationCompletenessValuesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(60);
		}
		return derivationCompletenessValuesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDerivationExpressionStorageValuesObject() {
		if (derivationExpressionStorageValuesObjectEDataType == null) {
			derivationExpressionStorageValuesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(62);
		}
		return derivationExpressionStorageValuesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDerivationStorageValuesObject() {
		if (derivationStorageValuesObjectEDataType == null) {
			derivationStorageValuesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(69);
		}
		return derivationStorageValuesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLogicalCombinationOperatorTypeObject() {
		if (logicalCombinationOperatorTypeObjectEDataType == null) {
			logicalCombinationOperatorTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(167);
		}
		return logicalCombinationOperatorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMultiplicityValuesObject() {
		if (multiplicityValuesObjectEDataType == null) {
			multiplicityValuesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(180);
		}
		return multiplicityValuesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPathedRolePurposeTypeObject() {
		if (pathedRolePurposeTypeObjectEDataType == null) {
			pathedRolePurposeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(220);
		}
		return pathedRolePurposeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRangeInclusionValuesObject() {
		if (rangeInclusionValuesObjectEDataType == null) {
			rangeInclusionValuesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(246);
		}
		return rangeInclusionValuesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReferenceModeKindValuesObject() {
		if (referenceModeKindValuesObjectEDataType == null) {
			referenceModeKindValuesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(264);
		}
		return referenceModeKindValuesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRingConstraintTypeValuesObject() {
		if (ringConstraintTypeValuesObjectEDataType == null) {
			ringConstraintTypeValuesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(270);
		}
		return ringConstraintTypeValuesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSpacingFormatTypeObject() {
		if (spacingFormatTypeObjectEDataType == null) {
			spacingFormatTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(302);
		}
		return spacingFormatTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTypeComplianceTypeObject() {
		if (typeComplianceTypeObjectEDataType == null) {
			typeComplianceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(326);
		}
		return typeComplianceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getValueComparisonOperatorValuesObject() {
		if (valueComparisonOperatorValuesObjectEDataType == null) {
			valueComparisonOperatorValuesObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(339);
		}
		return valueComparisonOperatorValuesObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("edu.neumont.schemas.orm._2006._04.orm.core." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //CorePackageImpl
