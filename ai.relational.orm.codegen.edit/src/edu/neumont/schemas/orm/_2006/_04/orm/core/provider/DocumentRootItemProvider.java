/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.provider;


import edu.neumont.schemas.orm._2006._04.orm.core.CoreFactory;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider 
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_DynamicColor());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ExtensionModelError());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_GenerationSetting());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_GenerationState());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Grouping());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_GroupType());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ModelErrorDisplayFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_NameGenerator());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ORMModel());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ORMModelBrowserDynamicColor());
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type");
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case CorePackage.DOCUMENT_ROOT__DYNAMIC_COLOR:
			case CorePackage.DOCUMENT_ROOT__EXTENSION_MODEL_ERROR:
			case CorePackage.DOCUMENT_ROOT__GENERATION_SETTING:
			case CorePackage.DOCUMENT_ROOT__GENERATION_STATE:
			case CorePackage.DOCUMENT_ROOT__GROUPING:
			case CorePackage.DOCUMENT_ROOT__GROUP_TYPE:
			case CorePackage.DOCUMENT_ROOT__MODEL_ERROR_DISPLAY_FILTER:
			case CorePackage.DOCUMENT_ROOT__NAME_GENERATOR:
			case CorePackage.DOCUMENT_ROOT__ORM_MODEL:
			case CorePackage.DOCUMENT_ROOT__ORM_MODEL_BROWSER_DYNAMIC_COLOR:
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
				(CorePackage.eINSTANCE.getDocumentRoot_GenerationState(),
				 CoreFactory.eINSTANCE.createGenerationStateType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Grouping(),
				 CoreFactory.eINSTANCE.createGroupingType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ModelErrorDisplayFilter(),
				 CoreFactory.eINSTANCE.createModelErrorDisplayFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_NameGenerator(),
				 CoreFactory.eINSTANCE.createNameGeneratorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ORMModel(),
				 CoreFactory.eINSTANCE.createORMModelType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ORMModelBrowserDynamicColor(),
				 CoreFactory.eINSTANCE.createDynamicColorType()));
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
