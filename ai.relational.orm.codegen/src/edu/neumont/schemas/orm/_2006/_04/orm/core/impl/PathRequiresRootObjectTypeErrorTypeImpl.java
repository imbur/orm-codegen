/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathRef;
import edu.neumont.schemas.orm._2006._04.orm.core.PathRequiresRootObjectTypeErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleSubPathRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Requires Root Object Type Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PathRequiresRootObjectTypeErrorTypeImpl#getRolePath <em>Role Path</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PathRequiresRootObjectTypeErrorTypeImpl#getSubPath <em>Sub Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathRequiresRootObjectTypeErrorTypeImpl extends ModelErrorImpl implements PathRequiresRootObjectTypeErrorType {
	/**
	 * The cached value of the '{@link #getRolePath() <em>Role Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolePath()
	 * @generated
	 * @ordered
	 */
	protected LeadRolePathRef rolePath;

	/**
	 * The cached value of the '{@link #getSubPath() <em>Sub Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPath()
	 * @generated
	 * @ordered
	 */
	protected RoleSubPathRef subPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathRequiresRootObjectTypeErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getPathRequiresRootObjectTypeErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeadRolePathRef getRolePath() {
		return rolePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolePath(LeadRolePathRef newRolePath, NotificationChain msgs) {
		LeadRolePathRef oldRolePath = rolePath;
		rolePath = newRolePath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE__ROLE_PATH, oldRolePath, newRolePath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolePath(LeadRolePathRef newRolePath) {
		if (newRolePath != rolePath) {
			NotificationChain msgs = null;
			if (rolePath != null)
				msgs = ((InternalEObject)rolePath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE__ROLE_PATH, null, msgs);
			if (newRolePath != null)
				msgs = ((InternalEObject)newRolePath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE__ROLE_PATH, null, msgs);
			msgs = basicSetRolePath(newRolePath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE__ROLE_PATH, newRolePath, newRolePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleSubPathRef getSubPath() {
		return subPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubPath(RoleSubPathRef newSubPath, NotificationChain msgs) {
		RoleSubPathRef oldSubPath = subPath;
		subPath = newSubPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE__SUB_PATH, oldSubPath, newSubPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubPath(RoleSubPathRef newSubPath) {
		if (newSubPath != subPath) {
			NotificationChain msgs = null;
			if (subPath != null)
				msgs = ((InternalEObject)subPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE__SUB_PATH, null, msgs);
			if (newSubPath != null)
				msgs = ((InternalEObject)newSubPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE__SUB_PATH, null, msgs);
			msgs = basicSetSubPath(newSubPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE__SUB_PATH, newSubPath, newSubPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE__ROLE_PATH:
				return basicSetRolePath(null, msgs);
			case CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE__SUB_PATH:
				return basicSetSubPath(null, msgs);
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
			case CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE__ROLE_PATH:
				return getRolePath();
			case CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE__SUB_PATH:
				return getSubPath();
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
			case CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE__ROLE_PATH:
				setRolePath((LeadRolePathRef)newValue);
				return;
			case CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE__SUB_PATH:
				setSubPath((RoleSubPathRef)newValue);
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
			case CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE__ROLE_PATH:
				setRolePath((LeadRolePathRef)null);
				return;
			case CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE__SUB_PATH:
				setSubPath((RoleSubPathRef)null);
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
			case CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE__ROLE_PATH:
				return rolePath != null;
			case CorePackage.PATH_REQUIRES_ROOT_OBJECT_TYPE_ERROR_TYPE__SUB_PATH:
				return subPath != null;
		}
		return super.eIsSet(featureID);
	}

} //PathRequiresRootObjectTypeErrorTypeImpl
