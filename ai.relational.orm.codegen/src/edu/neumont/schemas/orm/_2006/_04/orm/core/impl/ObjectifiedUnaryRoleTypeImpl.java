/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ExtensionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedUnaryRoleType;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objectified Unary Role Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectifiedUnaryRoleTypeImpl#getUnaryRole <em>Unary Role</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectifiedUnaryRoleTypeImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectifiedUnaryRoleTypeImpl extends RoleBaseTypeImpl implements ObjectifiedUnaryRoleType {
	/**
	 * The cached value of the '{@link #getUnaryRole() <em>Unary Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryRole()
	 * @generated
	 * @ordered
	 */
	protected RoleRef unaryRole;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected ExtensionsType extensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectifiedUnaryRoleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getObjectifiedUnaryRoleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleRef getUnaryRole() {
		return unaryRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryRole(RoleRef newUnaryRole, NotificationChain msgs) {
		RoleRef oldUnaryRole = unaryRole;
		unaryRole = newUnaryRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE__UNARY_ROLE, oldUnaryRole, newUnaryRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnaryRole(RoleRef newUnaryRole) {
		if (newUnaryRole != unaryRole) {
			NotificationChain msgs = null;
			if (unaryRole != null)
				msgs = ((InternalEObject)unaryRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE__UNARY_ROLE, null, msgs);
			if (newUnaryRole != null)
				msgs = ((InternalEObject)newUnaryRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE__UNARY_ROLE, null, msgs);
			msgs = basicSetUnaryRole(newUnaryRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE__UNARY_ROLE, newUnaryRole, newUnaryRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsType getExtensions() {
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensions(ExtensionsType newExtensions, NotificationChain msgs) {
		ExtensionsType oldExtensions = extensions;
		extensions = newExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE__EXTENSIONS, oldExtensions, newExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensions(ExtensionsType newExtensions) {
		if (newExtensions != extensions) {
			NotificationChain msgs = null;
			if (extensions != null)
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE__UNARY_ROLE:
				return basicSetUnaryRole(null, msgs);
			case CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE__EXTENSIONS:
				return basicSetExtensions(null, msgs);
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
			case CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE__UNARY_ROLE:
				return getUnaryRole();
			case CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE__EXTENSIONS:
				return getExtensions();
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
			case CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE__UNARY_ROLE:
				setUnaryRole((RoleRef)newValue);
				return;
			case CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
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
			case CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE__UNARY_ROLE:
				setUnaryRole((RoleRef)null);
				return;
			case CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)null);
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
			case CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE__UNARY_ROLE:
				return unaryRole != null;
			case CorePackage.OBJECTIFIED_UNARY_ROLE_TYPE__EXTENSIONS:
				return extensions != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectifiedUnaryRoleTypeImpl
