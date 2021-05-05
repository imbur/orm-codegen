/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram.impl;

import edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapeTypeImpl#getAbsoluteBounds <em>Absolute Bounds</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapeTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapeTypeImpl#isIsExpanded <em>Is Expanded</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ShapeTypeImpl extends MinimalEObjectImpl.Container implements ShapeType {
	/**
	 * The default value of the '{@link #getAbsoluteBounds() <em>Absolute Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteBounds()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSOLUTE_BOUNDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbsoluteBounds() <em>Absolute Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbsoluteBounds()
	 * @generated
	 * @ordered
	 */
	protected String absoluteBounds = ABSOLUTE_BOUNDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsExpanded() <em>Is Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExpanded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXPANDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExpanded() <em>Is Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExpanded()
	 * @generated
	 * @ordered
	 */
	protected boolean isExpanded = IS_EXPANDED_EDEFAULT;

	/**
	 * This is true if the Is Expanded attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isExpandedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.SHAPE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbsoluteBounds() {
		return absoluteBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbsoluteBounds(String newAbsoluteBounds) {
		String oldAbsoluteBounds = absoluteBounds;
		absoluteBounds = newAbsoluteBounds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.SHAPE_TYPE__ABSOLUTE_BOUNDS, oldAbsoluteBounds, absoluteBounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.SHAPE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExpanded() {
		return isExpanded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExpanded(boolean newIsExpanded) {
		boolean oldIsExpanded = isExpanded;
		isExpanded = newIsExpanded;
		boolean oldIsExpandedESet = isExpandedESet;
		isExpandedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.SHAPE_TYPE__IS_EXPANDED, oldIsExpanded, isExpanded, !oldIsExpandedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsExpanded() {
		boolean oldIsExpanded = isExpanded;
		boolean oldIsExpandedESet = isExpandedESet;
		isExpanded = IS_EXPANDED_EDEFAULT;
		isExpandedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DiagramPackage.SHAPE_TYPE__IS_EXPANDED, oldIsExpanded, IS_EXPANDED_EDEFAULT, oldIsExpandedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsExpanded() {
		return isExpandedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramPackage.SHAPE_TYPE__ABSOLUTE_BOUNDS:
				return getAbsoluteBounds();
			case DiagramPackage.SHAPE_TYPE__ID:
				return getId();
			case DiagramPackage.SHAPE_TYPE__IS_EXPANDED:
				return isIsExpanded();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiagramPackage.SHAPE_TYPE__ABSOLUTE_BOUNDS:
				setAbsoluteBounds((String)newValue);
				return;
			case DiagramPackage.SHAPE_TYPE__ID:
				setId((String)newValue);
				return;
			case DiagramPackage.SHAPE_TYPE__IS_EXPANDED:
				setIsExpanded((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DiagramPackage.SHAPE_TYPE__ABSOLUTE_BOUNDS:
				setAbsoluteBounds(ABSOLUTE_BOUNDS_EDEFAULT);
				return;
			case DiagramPackage.SHAPE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DiagramPackage.SHAPE_TYPE__IS_EXPANDED:
				unsetIsExpanded();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DiagramPackage.SHAPE_TYPE__ABSOLUTE_BOUNDS:
				return ABSOLUTE_BOUNDS_EDEFAULT == null ? absoluteBounds != null : !ABSOLUTE_BOUNDS_EDEFAULT.equals(absoluteBounds);
			case DiagramPackage.SHAPE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DiagramPackage.SHAPE_TYPE__IS_EXPANDED:
				return isSetIsExpanded();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (absoluteBounds: ");
		result.append(absoluteBounds);
		result.append(", id: ");
		result.append(id);
		result.append(", isExpanded: ");
		if (isExpandedESet) result.append(isExpanded); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ShapeTypeImpl
