/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.provider;


import edu.neumont.schemas.orm._2006._04.orm.core.CoreFactory;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelErrorsTypeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelErrorsTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CorePackage.eINSTANCE.getModelErrorsType_Group());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ModelErrorsType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ModelErrorsType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ModelErrorsType_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ModelErrorsType.class)) {
			case CorePackage.MODEL_ERRORS_TYPE__GROUP:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_ConstraintDuplicateNameError(),
					 CoreFactory.eINSTANCE.createConstraintDuplicateNameErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_ObjectTypeDuplicateNameError(),
					 CoreFactory.eINSTANCE.createObjectTypeDuplicateNameErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_RecognizedPhraseDuplicateNameError(),
					 CoreFactory.eINSTANCE.createRecognizedPhraseDuplicateNameErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_GroupDuplicateNameError(),
					 CoreFactory.eINSTANCE.createGroupDuplicateNameErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_FunctionDuplicateNameError(),
					 CoreFactory.eINSTANCE.createFunctionDuplicateNameErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_DuplicateReadingSignatureError(),
					 CoreFactory.eINSTANCE.createDuplicateReadingSignatureErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_GroupMembershipContradictionError(),
					 CoreFactory.eINSTANCE.createGroupMembershipContradictionErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_ExternalConstraintRoleSequenceArityMismatchError(),
					 CoreFactory.eINSTANCE.createExternalConstraintRoleSequenceArityMismatchErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_FactTypeRequiresInternalUniquenessConstraintError(),
					 CoreFactory.eINSTANCE.createFactTypeRequiresInternalUniquenessConstraintErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_FactTypeRequiresReadingError(),
					 CoreFactory.eINSTANCE.createFactTypeRequiresReadingErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_TooFewEntityTypeRoleInstancesError(),
					 CoreFactory.eINSTANCE.createTooFewEntityTypeRoleInstancesErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_TooFewFactTypeRoleInstancesError(),
					 CoreFactory.eINSTANCE.createTooFewFactTypeRoleInstancesErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_TooFewReadingRolesError(),
					 CoreFactory.eINSTANCE.createTooFewReadingRolesErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_ReadingRequiresUserModificationError(),
					 CoreFactory.eINSTANCE.createReadingRequiresUserModificationErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_TooFewRoleSequencesError(),
					 CoreFactory.eINSTANCE.createTooFewRoleSequencesErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_TooManyReadingRolesError(),
					 CoreFactory.eINSTANCE.createTooManyReadingRolesErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_TooManyRoleSequencesError(),
					 CoreFactory.eINSTANCE.createTooManyRoleSequencesErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_DataTypeNotSpecifiedError(),
					 CoreFactory.eINSTANCE.createDataTypeNotSpecifiedErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_NMinusOneError(),
					 CoreFactory.eINSTANCE.createNMinusOneErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_CompatibleRolePlayerTypeError(),
					 CoreFactory.eINSTANCE.createCompatibleRolePlayerTypeErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_SupersetRoleOfSubtypeSubsetConstraintNotSubtypeError(),
					 CoreFactory.eINSTANCE.createSupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_JoinPathRequiredError(),
					 CoreFactory.eINSTANCE.createJoinPathRequiredErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_RolePlayerRequiredError(),
					 CoreFactory.eINSTANCE.createRolePlayerRequiredErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_EqualityImpliedByMandatoryError(),
					 CoreFactory.eINSTANCE.createEqualityImpliedByMandatoryErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_EntityTypeRequiresReferenceSchemeError(),
					 CoreFactory.eINSTANCE.createEntityTypeRequiresReferenceSchemeErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_FrequencyConstraintMinMaxError(),
					 CoreFactory.eINSTANCE.createFrequencyConstraintMinMaxErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_FrequencyConstraintExactlyOneError(),
					 CoreFactory.eINSTANCE.createFrequencyConstraintExactlyOneErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_FrequencyConstraintNonRestrictiveRangeError(),
					 CoreFactory.eINSTANCE.createFrequencyConstraintNonRestrictiveRangeErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_FrequencyConstraintContradictsInternalUniquenessConstraintError(),
					 CoreFactory.eINSTANCE.createFrequencyConstraintContradictsInternalUniquenessConstraintErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_FrequencyConstraintViolatedByUniquenessConstraintError(),
					 CoreFactory.eINSTANCE.createFrequencyConstraintViolatedByUniquenessConstraintErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_MinValueMismatchError(),
					 CoreFactory.eINSTANCE.createMinValueMismatchErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_MaxValueMismatchError(),
					 CoreFactory.eINSTANCE.createMaxValueMismatchErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_CardinalityRangeOverlapError(),
					 CoreFactory.eINSTANCE.createCardinalityRangeOverlapErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_ValueRangeOverlapError(),
					 CoreFactory.eINSTANCE.createValueRangeOverlapErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_ValueTypeDetachedError(),
					 CoreFactory.eINSTANCE.createValueTypeDetachedErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_RingConstraintTypeNotSpecifiedError(),
					 CoreFactory.eINSTANCE.createRingConstraintTypeNotSpecifiedErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_ValueComparisonConstraintOperatorNotSpecifiedError(),
					 CoreFactory.eINSTANCE.createValueComparisonConstraintOperatorNotSpecifiedErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_ValueComparisonRolesNotComparableError(),
					 CoreFactory.eINSTANCE.createValueComparisonRolesNotComparableErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_ImplicationError(),
					 CoreFactory.eINSTANCE.createImplicationErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_SubsetConstraintImpliedByMandatoryConstraintsError(),
					 CoreFactory.eINSTANCE.createSubsetConstraintImpliedByMandatoryConstraintsErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_EqualityConstraintImpliedByMandatoryConstraintsError(),
					 CoreFactory.eINSTANCE.createEqualityConstraintImpliedByMandatoryConstraintsErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_ExclusionContradictsMandatoryError(),
					 CoreFactory.eINSTANCE.createExclusionContradictsMandatoryErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_NotWellModeledSubsetAndMandatoryError(),
					 CoreFactory.eINSTANCE.createNotWellModeledSubsetAndMandatoryErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_ImpliedInternalUniquenessConstraintError(),
					 CoreFactory.eINSTANCE.createImpliedInternalUniquenessConstraintErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_ObjectTypeRequiresPrimarySupertypeError(),
					 CoreFactory.eINSTANCE.createObjectTypeRequiresPrimarySupertypeErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_PreferredIdentifierRequiresMandatoryError(),
					 CoreFactory.eINSTANCE.createPreferredIdentifierRequiresMandatoryErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_CompatibleSupertypesError(),
					 CoreFactory.eINSTANCE.createCompatibleSupertypesErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_ObjectifyingInstanceRequiredError(),
					 CoreFactory.eINSTANCE.createObjectifyingInstanceRequiredErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_ObjectifiedInstanceRequiredError(),
					 CoreFactory.eINSTANCE.createObjectifiedInstanceRequiredErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_CompatibleValueTypeInstanceValueError(),
					 CoreFactory.eINSTANCE.createCompatibleValueTypeInstanceValueErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_PopulationMandatoryError(),
					 CoreFactory.eINSTANCE.createPopulationMandatoryErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_PopulationUniquenessError(),
					 CoreFactory.eINSTANCE.createPopulationUniquenessErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_ExclusionContradictsEqualityError(),
					 CoreFactory.eINSTANCE.createExclusionContradictsEqualityErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_ExclusionContradictsSubsetError(),
					 CoreFactory.eINSTANCE.createExclusionContradictsSubsetErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_PathRequiresRootObjectTypeError(),
					 CoreFactory.eINSTANCE.createPathRequiresRootObjectTypeErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_PathStartRoleFollowsRootObjectTypeError(),
					 CoreFactory.eINSTANCE.createPathStartRoleFollowsRootObjectTypeErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_JoinedPathRoleRequiresCompatibleRolePlayerError(),
					 CoreFactory.eINSTANCE.createJoinedPathRoleRequiresCompatibleRolePlayerErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_CorrelatedPathRoleRequiresCompatibleRolePlayerError(),
					 CoreFactory.eINSTANCE.createCorrelatedPathRoleRequiresCompatibleRolePlayerErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_ObjectUnifierRequiresCompatibleObjectTypesError(),
					 CoreFactory.eINSTANCE.createObjectUnifierRequiresCompatibleObjectTypesErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_PathSameFactTypeRoleFollowsJoinError(),
					 CoreFactory.eINSTANCE.createPathSameFactTypeRoleFollowsJoinErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_PathOuterJoinRequiresOptionalRoleError(),
					 CoreFactory.eINSTANCE.createPathOuterJoinRequiresOptionalRoleErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_CalculatedPathValueRequiresAggregationContextError(),
					 CoreFactory.eINSTANCE.createCalculatedPathValueRequiresAggregationContextErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_CalculatedPathValueRequiresFunctionError(),
					 CoreFactory.eINSTANCE.createCalculatedPathValueRequiresFunctionErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_CalculatedPathValueMustBeConsumedError(),
					 CoreFactory.eINSTANCE.createCalculatedPathValueMustBeConsumedErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_CalculatedPathValueParameterBindingError(),
					 CoreFactory.eINSTANCE.createCalculatedPathValueParameterBindingErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_FactTypeDerivationRequiresProjectionError(),
					 CoreFactory.eINSTANCE.createFactTypeDerivationRequiresProjectionErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_QueryDerivationRequiresProjectionError(),
					 CoreFactory.eINSTANCE.createQueryDerivationRequiresProjectionErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_PartialFactTypeDerivationProjectionError(),
					 CoreFactory.eINSTANCE.createPartialFactTypeDerivationProjectionErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_PartialQueryDerivationProjectionError(),
					 CoreFactory.eINSTANCE.createPartialQueryDerivationProjectionErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_JoinPathRequiresProjectionError(),
					 CoreFactory.eINSTANCE.createJoinPathRequiresProjectionErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_PartialJoinPathProjectionError(),
					 CoreFactory.eINSTANCE.createPartialJoinPathProjectionErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_DerivedFactTypeRoleProjectionCompatibilityError(),
					 CoreFactory.eINSTANCE.createDerivedFactTypeRoleProjectionCompatibilityErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_QueryRoleProjectionCompatibilityError(),
					 CoreFactory.eINSTANCE.createQueryRoleProjectionCompatibilityErrorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getModelErrorsType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getModelErrorsType_JoinedConstraintRoleProjectionCompatibilityError(),
					 CoreFactory.eINSTANCE.createJoinedConstraintRoleProjectionCompatibilityErrorType())));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ORM2CoreEditPlugin.INSTANCE;
	}

}
