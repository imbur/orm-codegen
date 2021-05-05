/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.provider;


import edu.neumont.schemas.orm._2006._04.orm.core.CoreFactory;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType;

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
 * This is the item provider adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypesTypeItemProvider 
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
	public DataTypesTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CorePackage.eINSTANCE.getDataTypesType_Group());
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
	 * This returns DataTypesType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DataTypesType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DataTypesType_type");
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

		switch (notification.getFeatureID(DataTypesType.class)) {
			case CorePackage.DATA_TYPES_TYPE__GROUP:
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
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_UnspecifiedDataType(),
					 CoreFactory.eINSTANCE.createUnspecifiedDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_FixedLengthTextDataType(),
					 CoreFactory.eINSTANCE.createFixedLengthTextDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_VariableLengthTextDataType(),
					 CoreFactory.eINSTANCE.createVariableLengthTextDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_LargeLengthTextDataType(),
					 CoreFactory.eINSTANCE.createLargeLengthTextDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_SignedIntegerNumericDataType(),
					 CoreFactory.eINSTANCE.createSignedIntegerNumericDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_SignedSmallIntegerNumericDataType(),
					 CoreFactory.eINSTANCE.createSignedSmallIntegerNumericDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_SignedLargeIntegerNumericDataType(),
					 CoreFactory.eINSTANCE.createSignedLargeIntegerNumericDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_UnsignedIntegerNumericDataType(),
					 CoreFactory.eINSTANCE.createUnsignedIntegerNumericDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_UnsignedTinyIntegerNumericDataType(),
					 CoreFactory.eINSTANCE.createUnsignedTinyIntegerNumericDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_UnsignedSmallIntegerNumericDataType(),
					 CoreFactory.eINSTANCE.createUnsignedSmallIntegerNumericDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_UnsignedLargeIntegerNumericDataType(),
					 CoreFactory.eINSTANCE.createUnsignedLargeIntegerNumericDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_AutoCounterNumericDataType(),
					 CoreFactory.eINSTANCE.createAutoCounterNumericDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_FloatingPointNumericDataType(),
					 CoreFactory.eINSTANCE.createFloatingPointNumericDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_SinglePrecisionFloatingPointNumericDataType(),
					 CoreFactory.eINSTANCE.createSinglePrecisionFloatingPointNumericDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_DoublePrecisionFloatingPointNumericDataType(),
					 CoreFactory.eINSTANCE.createDoublePrecisionFloatingPointNumericDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_DecimalNumericDataType(),
					 CoreFactory.eINSTANCE.createDecimalNumericDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_MoneyNumericDataType(),
					 CoreFactory.eINSTANCE.createMoneyNumericDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_FixedLengthRawDataDataType(),
					 CoreFactory.eINSTANCE.createFixedLengthRawDataDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_VariableLengthRawDataDataType(),
					 CoreFactory.eINSTANCE.createVariableLengthRawDataDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_LargeLengthRawDataDataType(),
					 CoreFactory.eINSTANCE.createLargeLengthRawDataDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_PictureRawDataDataType(),
					 CoreFactory.eINSTANCE.createPictureRawDataDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_OleObjectRawDataDataType(),
					 CoreFactory.eINSTANCE.createOleObjectRawDataDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_AutoTimestampTemporalDataType(),
					 CoreFactory.eINSTANCE.createAutoTimestampTemporalDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_TimeTemporalDataType(),
					 CoreFactory.eINSTANCE.createTimeTemporalDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_DateTemporalDataType(),
					 CoreFactory.eINSTANCE.createDateTemporalDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_DateAndTimeTemporalDataType(),
					 CoreFactory.eINSTANCE.createDateAndTimeTemporalDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_TrueOrFalseLogicalDataType(),
					 CoreFactory.eINSTANCE.createTrueOrFalseLogicalDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_YesOrNoLogicalDataType(),
					 CoreFactory.eINSTANCE.createYesOrNoLogicalDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_RowIdOtherDataType(),
					 CoreFactory.eINSTANCE.createRowIdOtherDataTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDataTypesType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDataTypesType_ObjectIdOtherDataType(),
					 CoreFactory.eINSTANCE.createObjectIdOtherDataTypeType())));
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
