/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.provider;


import edu.neumont.schemas.orm._2006._04.orm.core.CompatibleRolePlayerTypeErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.CoreFactory;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleRolePlayerTypeErrorType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompatibleRolePlayerTypeErrorTypeItemProvider extends ModelErrorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompatibleRolePlayerTypeErrorTypeItemProvider(AdapterFactory adapterFactory) {
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

			addColumnPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Column feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addColumnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompatibleRolePlayerTypeErrorType_column_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompatibleRolePlayerTypeErrorType_column_feature", "_UI_CompatibleRolePlayerTypeErrorType_type"),
				 CorePackage.eINSTANCE.getCompatibleRolePlayerTypeErrorType_Column(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(CorePackage.eINSTANCE.getCompatibleRolePlayerTypeErrorType_SetComparisonConstraint());
			childrenFeatures.add(CorePackage.eINSTANCE.getCompatibleRolePlayerTypeErrorType_SetConstraint());
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
	 * This returns CompatibleRolePlayerTypeErrorType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompatibleRolePlayerTypeErrorType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CompatibleRolePlayerTypeErrorType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CompatibleRolePlayerTypeErrorType_type") :
			getString("_UI_CompatibleRolePlayerTypeErrorType_type") + " " + label;
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

		switch (notification.getFeatureID(CompatibleRolePlayerTypeErrorType.class)) {
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__COLUMN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_COMPARISON_CONSTRAINT:
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_CONSTRAINT:
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
				(CorePackage.eINSTANCE.getCompatibleRolePlayerTypeErrorType_SetComparisonConstraint(),
				 CoreFactory.eINSTANCE.createSetComparisonConstraintRef()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getCompatibleRolePlayerTypeErrorType_SetConstraint(),
				 CoreFactory.eINSTANCE.createSetConstraintRef()));
	}

}
