/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.provider;


import edu.neumont.schemas.orm._2006._04.orm.core.CoreFactory;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType;

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
 * This is the item provider adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NameGeneratorTypeItemProvider 
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
	public NameGeneratorTypeItemProvider(AdapterFactory adapterFactory) {
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

			addAutomaticallyShortenNamesPropertyDescriptor(object);
			addCasingOptionPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addNameUsagePropertyDescriptor(object);
			addSpacingFormatPropertyDescriptor(object);
			addSpacingReplacementPropertyDescriptor(object);
			addUserDefinedMaximumPropertyDescriptor(object);
			addUseTargetDefaultMaximumPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Automatically Shorten Names feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutomaticallyShortenNamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NameGeneratorType_automaticallyShortenNames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NameGeneratorType_automaticallyShortenNames_feature", "_UI_NameGeneratorType_type"),
				 CorePackage.eINSTANCE.getNameGeneratorType_AutomaticallyShortenNames(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Casing Option feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCasingOptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NameGeneratorType_casingOption_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NameGeneratorType_casingOption_feature", "_UI_NameGeneratorType_type"),
				 CorePackage.eINSTANCE.getNameGeneratorType_CasingOption(),
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
				 getString("_UI_NameGeneratorType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NameGeneratorType_id_feature", "_UI_NameGeneratorType_type"),
				 CorePackage.eINSTANCE.getNameGeneratorType_Id(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name Usage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNameUsagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NameGeneratorType_nameUsage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NameGeneratorType_nameUsage_feature", "_UI_NameGeneratorType_type"),
				 CorePackage.eINSTANCE.getNameGeneratorType_NameUsage(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Spacing Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpacingFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NameGeneratorType_spacingFormat_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NameGeneratorType_spacingFormat_feature", "_UI_NameGeneratorType_type"),
				 CorePackage.eINSTANCE.getNameGeneratorType_SpacingFormat(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Spacing Replacement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpacingReplacementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NameGeneratorType_spacingReplacement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NameGeneratorType_spacingReplacement_feature", "_UI_NameGeneratorType_type"),
				 CorePackage.eINSTANCE.getNameGeneratorType_SpacingReplacement(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User Defined Maximum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserDefinedMaximumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NameGeneratorType_userDefinedMaximum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NameGeneratorType_userDefinedMaximum_feature", "_UI_NameGeneratorType_type"),
				 CorePackage.eINSTANCE.getNameGeneratorType_UserDefinedMaximum(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Target Default Maximum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseTargetDefaultMaximumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NameGeneratorType_useTargetDefaultMaximum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NameGeneratorType_useTargetDefaultMaximum_feature", "_UI_NameGeneratorType_type"),
				 CorePackage.eINSTANCE.getNameGeneratorType_UseTargetDefaultMaximum(),
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
			childrenFeatures.add(CorePackage.eINSTANCE.getNameGeneratorType_Extensions());
			childrenFeatures.add(CorePackage.eINSTANCE.getNameGeneratorType_Refinements());
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
	 * This returns NameGeneratorType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NameGeneratorType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NameGeneratorType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_NameGeneratorType_type") :
			getString("_UI_NameGeneratorType_type") + " " + label;
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

		switch (notification.getFeatureID(NameGeneratorType.class)) {
			case CorePackage.NAME_GENERATOR_TYPE__AUTOMATICALLY_SHORTEN_NAMES:
			case CorePackage.NAME_GENERATOR_TYPE__CASING_OPTION:
			case CorePackage.NAME_GENERATOR_TYPE__ID:
			case CorePackage.NAME_GENERATOR_TYPE__NAME_USAGE:
			case CorePackage.NAME_GENERATOR_TYPE__SPACING_FORMAT:
			case CorePackage.NAME_GENERATOR_TYPE__SPACING_REPLACEMENT:
			case CorePackage.NAME_GENERATOR_TYPE__USER_DEFINED_MAXIMUM:
			case CorePackage.NAME_GENERATOR_TYPE__USE_TARGET_DEFAULT_MAXIMUM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.NAME_GENERATOR_TYPE__EXTENSIONS:
			case CorePackage.NAME_GENERATOR_TYPE__REFINEMENTS:
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
				(CorePackage.eINSTANCE.getNameGeneratorType_Extensions(),
				 CoreFactory.eINSTANCE.createExtensionsType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getNameGeneratorType_Refinements(),
				 CoreFactory.eINSTANCE.createRefinementsType()));
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
