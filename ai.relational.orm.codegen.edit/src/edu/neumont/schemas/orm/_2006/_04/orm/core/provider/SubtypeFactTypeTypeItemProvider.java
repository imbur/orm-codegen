/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.provider;


import edu.neumont.schemas.orm._2006._04.orm.core.CoreFactory;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SubtypeFactTypeTypeItemProvider 
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
	public SubtypeFactTypeTypeItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addIsExternalPropertyDescriptor(object);
			addIsPrimaryPropertyDescriptor(object);
			addPreferredIdentificationPathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_SubtypeFactTypeType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubtypeFactTypeType_name_feature", "_UI_SubtypeFactTypeType_type"),
				 CorePackage.eINSTANCE.getSubtypeFactTypeType_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubtypeFactTypeType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubtypeFactTypeType_id_feature", "_UI_SubtypeFactTypeType_type"),
				 CorePackage.eINSTANCE.getSubtypeFactTypeType_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is External feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsExternalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubtypeFactTypeType_isExternal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubtypeFactTypeType_isExternal_feature", "_UI_SubtypeFactTypeType_type"),
				 CorePackage.eINSTANCE.getSubtypeFactTypeType_IsExternal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Primary feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPrimaryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubtypeFactTypeType_isPrimary_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubtypeFactTypeType_isPrimary_feature", "_UI_SubtypeFactTypeType_type"),
				 CorePackage.eINSTANCE.getSubtypeFactTypeType_IsPrimary(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Preferred Identification Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPreferredIdentificationPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SubtypeFactTypeType_preferredIdentificationPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SubtypeFactTypeType_preferredIdentificationPath_feature", "_UI_SubtypeFactTypeType_type"),
				 CorePackage.eINSTANCE.getSubtypeFactTypeType_PreferredIdentificationPath(),
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
			childrenFeatures.add(CorePackage.eINSTANCE.getSubtypeFactTypeType_Definitions());
			childrenFeatures.add(CorePackage.eINSTANCE.getSubtypeFactTypeType_Notes());
			childrenFeatures.add(CorePackage.eINSTANCE.getSubtypeFactTypeType_FactRoles());
			childrenFeatures.add(CorePackage.eINSTANCE.getSubtypeFactTypeType_ReadingOrders());
			childrenFeatures.add(CorePackage.eINSTANCE.getSubtypeFactTypeType_InternalConstraints());
			childrenFeatures.add(CorePackage.eINSTANCE.getSubtypeFactTypeType_DerivationRule());
			childrenFeatures.add(CorePackage.eINSTANCE.getSubtypeFactTypeType_Instances());
			childrenFeatures.add(CorePackage.eINSTANCE.getSubtypeFactTypeType_Extensions());
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
	 * This returns SubtypeFactTypeType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SubtypeFactTypeType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SubtypeFactTypeType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SubtypeFactTypeType_type") :
			getString("_UI_SubtypeFactTypeType_type") + " " + label;
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

		switch (notification.getFeatureID(SubtypeFactTypeType.class)) {
			case CorePackage.SUBTYPE_FACT_TYPE_TYPE__NAME:
			case CorePackage.SUBTYPE_FACT_TYPE_TYPE__ID:
			case CorePackage.SUBTYPE_FACT_TYPE_TYPE__IS_EXTERNAL:
			case CorePackage.SUBTYPE_FACT_TYPE_TYPE__IS_PRIMARY:
			case CorePackage.SUBTYPE_FACT_TYPE_TYPE__PREFERRED_IDENTIFICATION_PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.SUBTYPE_FACT_TYPE_TYPE__DEFINITIONS:
			case CorePackage.SUBTYPE_FACT_TYPE_TYPE__NOTES:
			case CorePackage.SUBTYPE_FACT_TYPE_TYPE__FACT_ROLES:
			case CorePackage.SUBTYPE_FACT_TYPE_TYPE__READING_ORDERS:
			case CorePackage.SUBTYPE_FACT_TYPE_TYPE__INTERNAL_CONSTRAINTS:
			case CorePackage.SUBTYPE_FACT_TYPE_TYPE__DERIVATION_RULE:
			case CorePackage.SUBTYPE_FACT_TYPE_TYPE__INSTANCES:
			case CorePackage.SUBTYPE_FACT_TYPE_TYPE__EXTENSIONS:
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
				(CorePackage.eINSTANCE.getSubtypeFactTypeType_Definitions(),
				 CoreFactory.eINSTANCE.createDefinitionsType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSubtypeFactTypeType_Notes(),
				 CoreFactory.eINSTANCE.createNotesType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSubtypeFactTypeType_FactRoles(),
				 CoreFactory.eINSTANCE.createSubtypeRolesType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSubtypeFactTypeType_ReadingOrders(),
				 CoreFactory.eINSTANCE.createReadingOrdersType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSubtypeFactTypeType_InternalConstraints(),
				 CoreFactory.eINSTANCE.createInternalConstraintsType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSubtypeFactTypeType_DerivationRule(),
				 CoreFactory.eINSTANCE.createFactTypeDerivationRuleType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSubtypeFactTypeType_Instances(),
				 CoreFactory.eINSTANCE.createFactTypeInstancesType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSubtypeFactTypeType_Extensions(),
				 CoreFactory.eINSTANCE.createExtensionsType()));
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
