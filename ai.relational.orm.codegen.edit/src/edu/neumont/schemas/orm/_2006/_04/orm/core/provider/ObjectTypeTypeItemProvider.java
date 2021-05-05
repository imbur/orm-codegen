/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.provider;


import edu.neumont.schemas.orm._2006._04.orm.core.CoreFactory;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType;

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
 * This is the item provider adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectTypeTypeItemProvider 
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
	public ObjectTypeTypeItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addIsExternalPropertyDescriptor(object);
			addIsIndependentPropertyDescriptor(object);
			addIsPersonalPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_ObjectTypeType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectTypeType_id_feature", "_UI_ObjectTypeType_type"),
				 CorePackage.eINSTANCE.getObjectTypeType_Id(),
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
				 getString("_UI_ObjectTypeType_isExternal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectTypeType_isExternal_feature", "_UI_ObjectTypeType_type"),
				 CorePackage.eINSTANCE.getObjectTypeType_IsExternal(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Independent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsIndependentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectTypeType_isIndependent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectTypeType_isIndependent_feature", "_UI_ObjectTypeType_type"),
				 CorePackage.eINSTANCE.getObjectTypeType_IsIndependent(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Personal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsPersonalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ObjectTypeType_isPersonal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectTypeType_isPersonal_feature", "_UI_ObjectTypeType_type"),
				 CorePackage.eINSTANCE.getObjectTypeType_IsPersonal(),
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
				 getString("_UI_ObjectTypeType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ObjectTypeType_name_feature", "_UI_ObjectTypeType_type"),
				 CorePackage.eINSTANCE.getObjectTypeType_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(CorePackage.eINSTANCE.getObjectTypeType_Definitions());
			childrenFeatures.add(CorePackage.eINSTANCE.getObjectTypeType_Notes());
			childrenFeatures.add(CorePackage.eINSTANCE.getObjectTypeType_Abbreviations());
			childrenFeatures.add(CorePackage.eINSTANCE.getObjectTypeType_CardinalityRestriction());
			childrenFeatures.add(CorePackage.eINSTANCE.getObjectTypeType_PlayedRoles());
			childrenFeatures.add(CorePackage.eINSTANCE.getObjectTypeType_SubtypeDerivationRule());
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ObjectTypeType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ObjectTypeType_type") :
			getString("_UI_ObjectTypeType_type") + " " + label;
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

		switch (notification.getFeatureID(ObjectTypeType.class)) {
			case CorePackage.OBJECT_TYPE_TYPE__ID:
			case CorePackage.OBJECT_TYPE_TYPE__IS_EXTERNAL:
			case CorePackage.OBJECT_TYPE_TYPE__IS_INDEPENDENT:
			case CorePackage.OBJECT_TYPE_TYPE__IS_PERSONAL:
			case CorePackage.OBJECT_TYPE_TYPE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.OBJECT_TYPE_TYPE__DEFINITIONS:
			case CorePackage.OBJECT_TYPE_TYPE__NOTES:
			case CorePackage.OBJECT_TYPE_TYPE__ABBREVIATIONS:
			case CorePackage.OBJECT_TYPE_TYPE__CARDINALITY_RESTRICTION:
			case CorePackage.OBJECT_TYPE_TYPE__PLAYED_ROLES:
			case CorePackage.OBJECT_TYPE_TYPE__SUBTYPE_DERIVATION_RULE:
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
				(CorePackage.eINSTANCE.getObjectTypeType_Definitions(),
				 CoreFactory.eINSTANCE.createDefinitionsType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getObjectTypeType_Notes(),
				 CoreFactory.eINSTANCE.createNotesType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getObjectTypeType_Abbreviations(),
				 CoreFactory.eINSTANCE.createAliasesType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getObjectTypeType_CardinalityRestriction(),
				 CoreFactory.eINSTANCE.createObjectTypeCardinalityRestrictionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getObjectTypeType_PlayedRoles(),
				 CoreFactory.eINSTANCE.createPlayedRolesType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getObjectTypeType_SubtypeDerivationRule(),
				 CoreFactory.eINSTANCE.createSubtypeDerivationRuleType()));
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
