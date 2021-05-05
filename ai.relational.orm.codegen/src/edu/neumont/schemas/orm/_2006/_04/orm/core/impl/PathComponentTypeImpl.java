/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathType;
import edu.neumont.schemas.orm._2006._04.orm.core.PathComponentType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Component Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PathComponentTypeImpl#getRolePath <em>Role Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathComponentTypeImpl extends MinimalEObjectImpl.Container implements PathComponentType {
	/**
	 * The cached value of the '{@link #getRolePath() <em>Role Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolePath()
	 * @generated
	 * @ordered
	 */
	protected LeadRolePathType rolePath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathComponentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getPathComponentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeadRolePathType getRolePath() {
		return rolePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolePath(LeadRolePathType newRolePath, NotificationChain msgs) {
		LeadRolePathType oldRolePath = rolePath;
		rolePath = newRolePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.PATH_COMPONENT_TYPE__ROLE_PATH, oldRolePath, newRolePath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolePath(LeadRolePathType newRolePath) {
		if (newRolePath != rolePath) {
			NotificationChain msgs = null;
			if (rolePath != null)
				msgs = ((InternalEObject)rolePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.PATH_COMPONENT_TYPE__ROLE_PATH, null, msgs);
			if (newRolePath != null)
				msgs = ((InternalEObject)newRolePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.PATH_COMPONENT_TYPE__ROLE_PATH, null, msgs);
			msgs = basicSetRolePath(newRolePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PATH_COMPONENT_TYPE__ROLE_PATH, newRolePath, newRolePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.PATH_COMPONENT_TYPE__ROLE_PATH:
				return basicSetRolePath(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.PATH_COMPONENT_TYPE__ROLE_PATH:
				return getRolePath();
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
			case CorePackage.PATH_COMPONENT_TYPE__ROLE_PATH:
				setRolePath((LeadRolePathType)newValue);
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
			case CorePackage.PATH_COMPONENT_TYPE__ROLE_PATH:
				setRolePath((LeadRolePathType)null);
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
			case CorePackage.PATH_COMPONENT_TYPE__ROLE_PATH:
				return rolePath != null;
		}
		return super.eIsSet(featureID);
	}

} //PathComponentTypeImpl
