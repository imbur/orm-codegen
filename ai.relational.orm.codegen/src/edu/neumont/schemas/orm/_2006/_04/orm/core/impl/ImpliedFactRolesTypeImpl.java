/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactRolesType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedUnaryRoleType;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleProxyType;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implied Fact Roles Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ImpliedFactRolesTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ImpliedFactRolesTypeImpl#getRoleProxy <em>Role Proxy</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ImpliedFactRolesTypeImpl#getObjectifiedUnaryRole <em>Objectified Unary Role</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ImpliedFactRolesTypeImpl#getRoleProxy1 <em>Role Proxy1</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ImpliedFactRolesTypeImpl#getObjectifiedUnaryRole1 <em>Objectified Unary Role1</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ImpliedFactRolesTypeImpl#getRole1 <em>Role1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImpliedFactRolesTypeImpl extends MinimalEObjectImpl.Container implements ImpliedFactRolesType {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected RoleType role;

	/**
	 * The cached value of the '{@link #getRoleProxy() <em>Role Proxy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleProxy()
	 * @generated
	 * @ordered
	 */
	protected RoleProxyType roleProxy;

	/**
	 * The cached value of the '{@link #getObjectifiedUnaryRole() <em>Objectified Unary Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectifiedUnaryRole()
	 * @generated
	 * @ordered
	 */
	protected ObjectifiedUnaryRoleType objectifiedUnaryRole;

	/**
	 * The cached value of the '{@link #getRoleProxy1() <em>Role Proxy1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleProxy1()
	 * @generated
	 * @ordered
	 */
	protected RoleProxyType roleProxy1;

	/**
	 * The cached value of the '{@link #getObjectifiedUnaryRole1() <em>Objectified Unary Role1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectifiedUnaryRole1()
	 * @generated
	 * @ordered
	 */
	protected ObjectifiedUnaryRoleType objectifiedUnaryRole1;

	/**
	 * The cached value of the '{@link #getRole1() <em>Role1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole1()
	 * @generated
	 * @ordered
	 */
	protected RoleType role1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImpliedFactRolesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getImpliedFactRolesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole(RoleType newRole, NotificationChain msgs) {
		RoleType oldRole = role;
		role = newRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE, oldRole, newRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole(RoleType newRole) {
		if (newRole != role) {
			NotificationChain msgs = null;
			if (role != null)
				msgs = ((InternalEObject)role).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE, null, msgs);
			if (newRole != null)
				msgs = ((InternalEObject)newRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE, null, msgs);
			msgs = basicSetRole(newRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE, newRole, newRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleProxyType getRoleProxy() {
		return roleProxy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleProxy(RoleProxyType newRoleProxy, NotificationChain msgs) {
		RoleProxyType oldRoleProxy = roleProxy;
		roleProxy = newRoleProxy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE_PROXY, oldRoleProxy, newRoleProxy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleProxy(RoleProxyType newRoleProxy) {
		if (newRoleProxy != roleProxy) {
			NotificationChain msgs = null;
			if (roleProxy != null)
				msgs = ((InternalEObject)roleProxy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE_PROXY, null, msgs);
			if (newRoleProxy != null)
				msgs = ((InternalEObject)newRoleProxy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE_PROXY, null, msgs);
			msgs = basicSetRoleProxy(newRoleProxy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE_PROXY, newRoleProxy, newRoleProxy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectifiedUnaryRoleType getObjectifiedUnaryRole() {
		return objectifiedUnaryRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectifiedUnaryRole(ObjectifiedUnaryRoleType newObjectifiedUnaryRole, NotificationChain msgs) {
		ObjectifiedUnaryRoleType oldObjectifiedUnaryRole = objectifiedUnaryRole;
		objectifiedUnaryRole = newObjectifiedUnaryRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IMPLIED_FACT_ROLES_TYPE__OBJECTIFIED_UNARY_ROLE, oldObjectifiedUnaryRole, newObjectifiedUnaryRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectifiedUnaryRole(ObjectifiedUnaryRoleType newObjectifiedUnaryRole) {
		if (newObjectifiedUnaryRole != objectifiedUnaryRole) {
			NotificationChain msgs = null;
			if (objectifiedUnaryRole != null)
				msgs = ((InternalEObject)objectifiedUnaryRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.IMPLIED_FACT_ROLES_TYPE__OBJECTIFIED_UNARY_ROLE, null, msgs);
			if (newObjectifiedUnaryRole != null)
				msgs = ((InternalEObject)newObjectifiedUnaryRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.IMPLIED_FACT_ROLES_TYPE__OBJECTIFIED_UNARY_ROLE, null, msgs);
			msgs = basicSetObjectifiedUnaryRole(newObjectifiedUnaryRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IMPLIED_FACT_ROLES_TYPE__OBJECTIFIED_UNARY_ROLE, newObjectifiedUnaryRole, newObjectifiedUnaryRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleProxyType getRoleProxy1() {
		return roleProxy1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleProxy1(RoleProxyType newRoleProxy1, NotificationChain msgs) {
		RoleProxyType oldRoleProxy1 = roleProxy1;
		roleProxy1 = newRoleProxy1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE_PROXY1, oldRoleProxy1, newRoleProxy1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleProxy1(RoleProxyType newRoleProxy1) {
		if (newRoleProxy1 != roleProxy1) {
			NotificationChain msgs = null;
			if (roleProxy1 != null)
				msgs = ((InternalEObject)roleProxy1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE_PROXY1, null, msgs);
			if (newRoleProxy1 != null)
				msgs = ((InternalEObject)newRoleProxy1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE_PROXY1, null, msgs);
			msgs = basicSetRoleProxy1(newRoleProxy1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE_PROXY1, newRoleProxy1, newRoleProxy1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectifiedUnaryRoleType getObjectifiedUnaryRole1() {
		return objectifiedUnaryRole1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectifiedUnaryRole1(ObjectifiedUnaryRoleType newObjectifiedUnaryRole1, NotificationChain msgs) {
		ObjectifiedUnaryRoleType oldObjectifiedUnaryRole1 = objectifiedUnaryRole1;
		objectifiedUnaryRole1 = newObjectifiedUnaryRole1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IMPLIED_FACT_ROLES_TYPE__OBJECTIFIED_UNARY_ROLE1, oldObjectifiedUnaryRole1, newObjectifiedUnaryRole1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectifiedUnaryRole1(ObjectifiedUnaryRoleType newObjectifiedUnaryRole1) {
		if (newObjectifiedUnaryRole1 != objectifiedUnaryRole1) {
			NotificationChain msgs = null;
			if (objectifiedUnaryRole1 != null)
				msgs = ((InternalEObject)objectifiedUnaryRole1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.IMPLIED_FACT_ROLES_TYPE__OBJECTIFIED_UNARY_ROLE1, null, msgs);
			if (newObjectifiedUnaryRole1 != null)
				msgs = ((InternalEObject)newObjectifiedUnaryRole1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.IMPLIED_FACT_ROLES_TYPE__OBJECTIFIED_UNARY_ROLE1, null, msgs);
			msgs = basicSetObjectifiedUnaryRole1(newObjectifiedUnaryRole1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IMPLIED_FACT_ROLES_TYPE__OBJECTIFIED_UNARY_ROLE1, newObjectifiedUnaryRole1, newObjectifiedUnaryRole1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType getRole1() {
		return role1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRole1(RoleType newRole1, NotificationChain msgs) {
		RoleType oldRole1 = role1;
		role1 = newRole1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE1, oldRole1, newRole1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRole1(RoleType newRole1) {
		if (newRole1 != role1) {
			NotificationChain msgs = null;
			if (role1 != null)
				msgs = ((InternalEObject)role1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE1, null, msgs);
			if (newRole1 != null)
				msgs = ((InternalEObject)newRole1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE1, null, msgs);
			msgs = basicSetRole1(newRole1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE1, newRole1, newRole1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE:
				return basicSetRole(null, msgs);
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE_PROXY:
				return basicSetRoleProxy(null, msgs);
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__OBJECTIFIED_UNARY_ROLE:
				return basicSetObjectifiedUnaryRole(null, msgs);
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE_PROXY1:
				return basicSetRoleProxy1(null, msgs);
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__OBJECTIFIED_UNARY_ROLE1:
				return basicSetObjectifiedUnaryRole1(null, msgs);
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE1:
				return basicSetRole1(null, msgs);
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
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE:
				return getRole();
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE_PROXY:
				return getRoleProxy();
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__OBJECTIFIED_UNARY_ROLE:
				return getObjectifiedUnaryRole();
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE_PROXY1:
				return getRoleProxy1();
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__OBJECTIFIED_UNARY_ROLE1:
				return getObjectifiedUnaryRole1();
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE1:
				return getRole1();
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
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE:
				setRole((RoleType)newValue);
				return;
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE_PROXY:
				setRoleProxy((RoleProxyType)newValue);
				return;
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__OBJECTIFIED_UNARY_ROLE:
				setObjectifiedUnaryRole((ObjectifiedUnaryRoleType)newValue);
				return;
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE_PROXY1:
				setRoleProxy1((RoleProxyType)newValue);
				return;
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__OBJECTIFIED_UNARY_ROLE1:
				setObjectifiedUnaryRole1((ObjectifiedUnaryRoleType)newValue);
				return;
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE1:
				setRole1((RoleType)newValue);
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
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE:
				setRole((RoleType)null);
				return;
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE_PROXY:
				setRoleProxy((RoleProxyType)null);
				return;
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__OBJECTIFIED_UNARY_ROLE:
				setObjectifiedUnaryRole((ObjectifiedUnaryRoleType)null);
				return;
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE_PROXY1:
				setRoleProxy1((RoleProxyType)null);
				return;
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__OBJECTIFIED_UNARY_ROLE1:
				setObjectifiedUnaryRole1((ObjectifiedUnaryRoleType)null);
				return;
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE1:
				setRole1((RoleType)null);
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
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE:
				return role != null;
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE_PROXY:
				return roleProxy != null;
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__OBJECTIFIED_UNARY_ROLE:
				return objectifiedUnaryRole != null;
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE_PROXY1:
				return roleProxy1 != null;
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__OBJECTIFIED_UNARY_ROLE1:
				return objectifiedUnaryRole1 != null;
			case CorePackage.IMPLIED_FACT_ROLES_TYPE__ROLE1:
				return role1 != null;
		}
		return super.eIsSet(featureID);
	}

} //ImpliedFactRolesTypeImpl
