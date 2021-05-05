/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleType;
import edu.neumont.schemas.orm._2006._04.orm.core.SubtypeRolesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtype Roles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SubtypeRolesTypeImpl#getSupertypeMetaRole <em>Supertype Meta Role</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SubtypeRolesTypeImpl#getSubtypeMetaRole <em>Subtype Meta Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubtypeRolesTypeImpl extends MinimalEObjectImpl.Container implements SubtypeRolesType {
	/**
	 * The cached value of the '{@link #getSupertypeMetaRole() <em>Supertype Meta Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertypeMetaRole()
	 * @generated
	 * @ordered
	 */
	protected RoleType supertypeMetaRole;

	/**
	 * The cached value of the '{@link #getSubtypeMetaRole() <em>Subtype Meta Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypeMetaRole()
	 * @generated
	 * @ordered
	 */
	protected RoleType subtypeMetaRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtypeRolesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getSubtypeRolesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getSupertypeMetaRole() {
		return supertypeMetaRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupertypeMetaRole(RoleType newSupertypeMetaRole, NotificationChain msgs) {
		RoleType oldSupertypeMetaRole = supertypeMetaRole;
		supertypeMetaRole = newSupertypeMetaRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SUBTYPE_ROLES_TYPE__SUPERTYPE_META_ROLE, oldSupertypeMetaRole, newSupertypeMetaRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupertypeMetaRole(RoleType newSupertypeMetaRole) {
		if (newSupertypeMetaRole != supertypeMetaRole) {
			NotificationChain msgs = null;
			if (supertypeMetaRole != null)
				msgs = ((InternalEObject)supertypeMetaRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SUBTYPE_ROLES_TYPE__SUPERTYPE_META_ROLE, null, msgs);
			if (newSupertypeMetaRole != null)
				msgs = ((InternalEObject)newSupertypeMetaRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SUBTYPE_ROLES_TYPE__SUPERTYPE_META_ROLE, null, msgs);
			msgs = basicSetSupertypeMetaRole(newSupertypeMetaRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SUBTYPE_ROLES_TYPE__SUPERTYPE_META_ROLE, newSupertypeMetaRole, newSupertypeMetaRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getSubtypeMetaRole() {
		return subtypeMetaRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtypeMetaRole(RoleType newSubtypeMetaRole, NotificationChain msgs) {
		RoleType oldSubtypeMetaRole = subtypeMetaRole;
		subtypeMetaRole = newSubtypeMetaRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SUBTYPE_ROLES_TYPE__SUBTYPE_META_ROLE, oldSubtypeMetaRole, newSubtypeMetaRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtypeMetaRole(RoleType newSubtypeMetaRole) {
		if (newSubtypeMetaRole != subtypeMetaRole) {
			NotificationChain msgs = null;
			if (subtypeMetaRole != null)
				msgs = ((InternalEObject)subtypeMetaRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SUBTYPE_ROLES_TYPE__SUBTYPE_META_ROLE, null, msgs);
			if (newSubtypeMetaRole != null)
				msgs = ((InternalEObject)newSubtypeMetaRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SUBTYPE_ROLES_TYPE__SUBTYPE_META_ROLE, null, msgs);
			msgs = basicSetSubtypeMetaRole(newSubtypeMetaRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SUBTYPE_ROLES_TYPE__SUBTYPE_META_ROLE, newSubtypeMetaRole, newSubtypeMetaRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SUBTYPE_ROLES_TYPE__SUPERTYPE_META_ROLE:
				return basicSetSupertypeMetaRole(null, msgs);
			case CorePackage.SUBTYPE_ROLES_TYPE__SUBTYPE_META_ROLE:
				return basicSetSubtypeMetaRole(null, msgs);
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
			case CorePackage.SUBTYPE_ROLES_TYPE__SUPERTYPE_META_ROLE:
				return getSupertypeMetaRole();
			case CorePackage.SUBTYPE_ROLES_TYPE__SUBTYPE_META_ROLE:
				return getSubtypeMetaRole();
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
			case CorePackage.SUBTYPE_ROLES_TYPE__SUPERTYPE_META_ROLE:
				setSupertypeMetaRole((RoleType)newValue);
				return;
			case CorePackage.SUBTYPE_ROLES_TYPE__SUBTYPE_META_ROLE:
				setSubtypeMetaRole((RoleType)newValue);
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
			case CorePackage.SUBTYPE_ROLES_TYPE__SUPERTYPE_META_ROLE:
				setSupertypeMetaRole((RoleType)null);
				return;
			case CorePackage.SUBTYPE_ROLES_TYPE__SUBTYPE_META_ROLE:
				setSubtypeMetaRole((RoleType)null);
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
			case CorePackage.SUBTYPE_ROLES_TYPE__SUPERTYPE_META_ROLE:
				return supertypeMetaRole != null;
			case CorePackage.SUBTYPE_ROLES_TYPE__SUBTYPE_META_ROLE:
				return subtypeMetaRole != null;
		}
		return super.eIsSet(featureID);
	}

} //SubtypeRolesTypeImpl
