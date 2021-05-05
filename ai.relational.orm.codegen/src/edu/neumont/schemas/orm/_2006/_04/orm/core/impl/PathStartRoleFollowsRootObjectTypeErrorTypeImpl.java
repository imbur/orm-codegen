/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.PathStartRoleFollowsRootObjectTypeErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Start Role Follows Root Object Type Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PathStartRoleFollowsRootObjectTypeErrorTypeImpl#getPathedRole <em>Pathed Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathStartRoleFollowsRootObjectTypeErrorTypeImpl extends ModelErrorImpl implements PathStartRoleFollowsRootObjectTypeErrorType {
	/**
	 * The cached value of the '{@link #getPathedRole() <em>Pathed Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathedRole()
	 * @generated
	 * @ordered
	 */
	protected PathedRoleRef pathedRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathStartRoleFollowsRootObjectTypeErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getPathStartRoleFollowsRootObjectTypeErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathedRoleRef getPathedRole() {
		return pathedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathedRole(PathedRoleRef newPathedRole, NotificationChain msgs) {
		PathedRoleRef oldPathedRole = pathedRole;
		pathedRole = newPathedRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.PATH_START_ROLE_FOLLOWS_ROOT_OBJECT_TYPE_ERROR_TYPE__PATHED_ROLE, oldPathedRole, newPathedRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathedRole(PathedRoleRef newPathedRole) {
		if (newPathedRole != pathedRole) {
			NotificationChain msgs = null;
			if (pathedRole != null)
				msgs = ((InternalEObject)pathedRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.PATH_START_ROLE_FOLLOWS_ROOT_OBJECT_TYPE_ERROR_TYPE__PATHED_ROLE, null, msgs);
			if (newPathedRole != null)
				msgs = ((InternalEObject)newPathedRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.PATH_START_ROLE_FOLLOWS_ROOT_OBJECT_TYPE_ERROR_TYPE__PATHED_ROLE, null, msgs);
			msgs = basicSetPathedRole(newPathedRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PATH_START_ROLE_FOLLOWS_ROOT_OBJECT_TYPE_ERROR_TYPE__PATHED_ROLE, newPathedRole, newPathedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.PATH_START_ROLE_FOLLOWS_ROOT_OBJECT_TYPE_ERROR_TYPE__PATHED_ROLE:
				return basicSetPathedRole(null, msgs);
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
			case CorePackage.PATH_START_ROLE_FOLLOWS_ROOT_OBJECT_TYPE_ERROR_TYPE__PATHED_ROLE:
				return getPathedRole();
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
			case CorePackage.PATH_START_ROLE_FOLLOWS_ROOT_OBJECT_TYPE_ERROR_TYPE__PATHED_ROLE:
				setPathedRole((PathedRoleRef)newValue);
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
			case CorePackage.PATH_START_ROLE_FOLLOWS_ROOT_OBJECT_TYPE_ERROR_TYPE__PATHED_ROLE:
				setPathedRole((PathedRoleRef)null);
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
			case CorePackage.PATH_START_ROLE_FOLLOWS_ROOT_OBJECT_TYPE_ERROR_TYPE__PATHED_ROLE:
				return pathedRole != null;
		}
		return super.eIsSet(featureID);
	}

} //PathStartRoleFollowsRootObjectTypeErrorTypeImpl
