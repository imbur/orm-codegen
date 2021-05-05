/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram.provider;


import edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramFactory;
import edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType;

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
 * This is the item provider adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ORMDiagramTypeItemProvider 
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
	public ORMDiagramTypeItemProvider(AdapterFactory adapterFactory) {
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

			addAutoPopulateShapesPropertyDescriptor(object);
			addBaseFontNamePropertyDescriptor(object);
			addBaseFontSizePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addIsCompleteViewPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Auto Populate Shapes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutoPopulateShapesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ORMDiagramType_autoPopulateShapes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ORMDiagramType_autoPopulateShapes_feature", "_UI_ORMDiagramType_type"),
				 DiagramPackage.Literals.ORM_DIAGRAM_TYPE__AUTO_POPULATE_SHAPES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Font Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseFontNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ORMDiagramType_baseFontName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ORMDiagramType_baseFontName_feature", "_UI_ORMDiagramType_type"),
				 DiagramPackage.Literals.ORM_DIAGRAM_TYPE__BASE_FONT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Font Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseFontSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ORMDiagramType_baseFontSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ORMDiagramType_baseFontSize_feature", "_UI_ORMDiagramType_type"),
				 DiagramPackage.Literals.ORM_DIAGRAM_TYPE__BASE_FONT_SIZE,
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
				 getString("_UI_ORMDiagramType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ORMDiagramType_id_feature", "_UI_ORMDiagramType_type"),
				 DiagramPackage.Literals.ORM_DIAGRAM_TYPE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Complete View feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsCompleteViewPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ORMDiagramType_isCompleteView_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ORMDiagramType_isCompleteView_feature", "_UI_ORMDiagramType_type"),
				 DiagramPackage.Literals.ORM_DIAGRAM_TYPE__IS_COMPLETE_VIEW,
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
				 getString("_UI_ORMDiagramType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ORMDiagramType_name_feature", "_UI_ORMDiagramType_type"),
				 DiagramPackage.Literals.ORM_DIAGRAM_TYPE__NAME,
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
			childrenFeatures.add(DiagramPackage.Literals.ORM_DIAGRAM_TYPE__SHAPES);
			childrenFeatures.add(DiagramPackage.Literals.ORM_DIAGRAM_TYPE__SUBJECT);
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
	 * This returns ORMDiagramType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ORMDiagramType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ORMDiagramType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ORMDiagramType_type") :
			getString("_UI_ORMDiagramType_type") + " " + label;
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

		switch (notification.getFeatureID(ORMDiagramType.class)) {
			case DiagramPackage.ORM_DIAGRAM_TYPE__AUTO_POPULATE_SHAPES:
			case DiagramPackage.ORM_DIAGRAM_TYPE__BASE_FONT_NAME:
			case DiagramPackage.ORM_DIAGRAM_TYPE__BASE_FONT_SIZE:
			case DiagramPackage.ORM_DIAGRAM_TYPE__ID:
			case DiagramPackage.ORM_DIAGRAM_TYPE__IS_COMPLETE_VIEW:
			case DiagramPackage.ORM_DIAGRAM_TYPE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case DiagramPackage.ORM_DIAGRAM_TYPE__SHAPES:
			case DiagramPackage.ORM_DIAGRAM_TYPE__SUBJECT:
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
				(DiagramPackage.Literals.ORM_DIAGRAM_TYPE__SHAPES,
				 DiagramFactory.eINSTANCE.createShapesType()));

		newChildDescriptors.add
			(createChildParameter
				(DiagramPackage.Literals.ORM_DIAGRAM_TYPE__SUBJECT,
				 DiagramFactory.eINSTANCE.createSubjectRef()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ORM2DiagramEditPlugin.INSTANCE;
	}

}
