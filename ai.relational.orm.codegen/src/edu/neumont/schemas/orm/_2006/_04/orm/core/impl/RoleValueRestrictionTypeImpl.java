/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleValueRestrictionType;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueConstraintWithNameType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Value Restriction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleValueRestrictionTypeImpl#getRoleValueConstraint <em>Role Value Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleValueRestrictionTypeImpl extends MinimalEObjectImpl.Container implements RoleValueRestrictionType {
	/**
	 * The cached value of the '{@link #getRoleValueConstraint() <em>Role Value Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleValueConstraint()
	 * @generated
	 * @ordered
	 */
	protected ValueConstraintWithNameType roleValueConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleValueRestrictionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getRoleValueRestrictionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueConstraintWithNameType getRoleValueConstraint() {
		return roleValueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleValueConstraint(ValueConstraintWithNameType newRoleValueConstraint, NotificationChain msgs) {
		ValueConstraintWithNameType oldRoleValueConstraint = roleValueConstraint;
		roleValueConstraint = newRoleValueConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_VALUE_RESTRICTION_TYPE__ROLE_VALUE_CONSTRAINT, oldRoleValueConstraint, newRoleValueConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleValueConstraint(ValueConstraintWithNameType newRoleValueConstraint) {
		if (newRoleValueConstraint != roleValueConstraint) {
			NotificationChain msgs = null;
			if (roleValueConstraint != null)
				msgs = ((InternalEObject)roleValueConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_VALUE_RESTRICTION_TYPE__ROLE_VALUE_CONSTRAINT, null, msgs);
			if (newRoleValueConstraint != null)
				msgs = ((InternalEObject)newRoleValueConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_VALUE_RESTRICTION_TYPE__ROLE_VALUE_CONSTRAINT, null, msgs);
			msgs = basicSetRoleValueConstraint(newRoleValueConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_VALUE_RESTRICTION_TYPE__ROLE_VALUE_CONSTRAINT, newRoleValueConstraint, newRoleValueConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ROLE_VALUE_RESTRICTION_TYPE__ROLE_VALUE_CONSTRAINT:
				return basicSetRoleValueConstraint(null, msgs);
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
			case CorePackage.ROLE_VALUE_RESTRICTION_TYPE__ROLE_VALUE_CONSTRAINT:
				return getRoleValueConstraint();
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
			case CorePackage.ROLE_VALUE_RESTRICTION_TYPE__ROLE_VALUE_CONSTRAINT:
				setRoleValueConstraint((ValueConstraintWithNameType)newValue);
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
			case CorePackage.ROLE_VALUE_RESTRICTION_TYPE__ROLE_VALUE_CONSTRAINT:
				setRoleValueConstraint((ValueConstraintWithNameType)null);
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
			case CorePackage.ROLE_VALUE_RESTRICTION_TYPE__ROLE_VALUE_CONSTRAINT:
				return roleValueConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleValueRestrictionTypeImpl
