/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.provider;


import edu.neumont.schemas.orm._2006._04.orm.core.CoreFactory;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType;

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
 * This is the item provider adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FactTypeDerivationPathTypeItemProvider extends RolePathOwnerTypeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeDerivationPathTypeItemProvider(AdapterFactory adapterFactory) {
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

			addDerivationCompletenessPropertyDescriptor(object);
			addDerivationStoragePropertyDescriptor(object);
			addExternalDerivationPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addSetProjectionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Derivation Completeness feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivationCompletenessPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FactTypeDerivationPathType_derivationCompleteness_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FactTypeDerivationPathType_derivationCompleteness_feature", "_UI_FactTypeDerivationPathType_type"),
				 CorePackage.eINSTANCE.getFactTypeDerivationPathType_DerivationCompleteness(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Derivation Storage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDerivationStoragePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FactTypeDerivationPathType_derivationStorage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FactTypeDerivationPathType_derivationStorage_feature", "_UI_FactTypeDerivationPathType_type"),
				 CorePackage.eINSTANCE.getFactTypeDerivationPathType_DerivationStorage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the External Derivation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExternalDerivationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FactTypeDerivationPathType_externalDerivation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FactTypeDerivationPathType_externalDerivation_feature", "_UI_FactTypeDerivationPathType_type"),
				 CorePackage.eINSTANCE.getFactTypeDerivationPathType_ExternalDerivation(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FactTypeDerivationPathType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FactTypeDerivationPathType_name_feature", "_UI_FactTypeDerivationPathType_type"),
				 CorePackage.eINSTANCE.getFactTypeDerivationPathType_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Set Projection feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSetProjectionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FactTypeDerivationPathType_setProjection_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FactTypeDerivationPathType_setProjection_feature", "_UI_FactTypeDerivationPathType_type"),
				 CorePackage.eINSTANCE.getFactTypeDerivationPathType_SetProjection(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(CorePackage.eINSTANCE.getFactTypeDerivationPathType_DerivationProjections());
			childrenFeatures.add(CorePackage.eINSTANCE.getFactTypeDerivationPathType_InformalRule());
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
	 * This returns FactTypeDerivationPathType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FactTypeDerivationPathType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FactTypeDerivationPathType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FactTypeDerivationPathType_type") :
			getString("_UI_FactTypeDerivationPathType_type") + " " + label;
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

		switch (notification.getFeatureID(FactTypeDerivationPathType.class)) {
			case CorePackage.FACT_TYPE_DERIVATION_PATH_TYPE__DERIVATION_COMPLETENESS:
			case CorePackage.FACT_TYPE_DERIVATION_PATH_TYPE__DERIVATION_STORAGE:
			case CorePackage.FACT_TYPE_DERIVATION_PATH_TYPE__EXTERNAL_DERIVATION:
			case CorePackage.FACT_TYPE_DERIVATION_PATH_TYPE__NAME:
			case CorePackage.FACT_TYPE_DERIVATION_PATH_TYPE__SET_PROJECTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.FACT_TYPE_DERIVATION_PATH_TYPE__DERIVATION_PROJECTIONS:
			case CorePackage.FACT_TYPE_DERIVATION_PATH_TYPE__INFORMAL_RULE:
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
				(CorePackage.eINSTANCE.getFactTypeDerivationPathType_DerivationProjections(),
				 CoreFactory.eINSTANCE.createDerivationProjectionsType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getFactTypeDerivationPathType_InformalRule(),
				 CoreFactory.eINSTANCE.createInformalDerivationRuleType()));
	}

}
