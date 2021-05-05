/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.PathConditionRoleValueRestrictionType;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueConstraintType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Condition Role Value Restriction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PathConditionRoleValueRestrictionTypeImpl#getPathedRoleConditionValueConstraint <em>Pathed Role Condition Value Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathConditionRoleValueRestrictionTypeImpl extends MinimalEObjectImpl.Container implements PathConditionRoleValueRestrictionType {
	/**
	 * The cached value of the '{@link #getPathedRoleConditionValueConstraint() <em>Pathed Role Condition Value Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathedRoleConditionValueConstraint()
	 * @generated
	 * @ordered
	 */
	protected ValueConstraintType pathedRoleConditionValueConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathConditionRoleValueRestrictionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getPathConditionRoleValueRestrictionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueConstraintType getPathedRoleConditionValueConstraint() {
		return pathedRoleConditionValueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathedRoleConditionValueConstraint(ValueConstraintType newPathedRoleConditionValueConstraint, NotificationChain msgs) {
		ValueConstraintType oldPathedRoleConditionValueConstraint = pathedRoleConditionValueConstraint;
		pathedRoleConditionValueConstraint = newPathedRoleConditionValueConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.PATH_CONDITION_ROLE_VALUE_RESTRICTION_TYPE__PATHED_ROLE_CONDITION_VALUE_CONSTRAINT, oldPathedRoleConditionValueConstraint, newPathedRoleConditionValueConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathedRoleConditionValueConstraint(ValueConstraintType newPathedRoleConditionValueConstraint) {
		if (newPathedRoleConditionValueConstraint != pathedRoleConditionValueConstraint) {
			NotificationChain msgs = null;
			if (pathedRoleConditionValueConstraint != null)
				msgs = ((InternalEObject)pathedRoleConditionValueConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.PATH_CONDITION_ROLE_VALUE_RESTRICTION_TYPE__PATHED_ROLE_CONDITION_VALUE_CONSTRAINT, null, msgs);
			if (newPathedRoleConditionValueConstraint != null)
				msgs = ((InternalEObject)newPathedRoleConditionValueConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.PATH_CONDITION_ROLE_VALUE_RESTRICTION_TYPE__PATHED_ROLE_CONDITION_VALUE_CONSTRAINT, null, msgs);
			msgs = basicSetPathedRoleConditionValueConstraint(newPathedRoleConditionValueConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PATH_CONDITION_ROLE_VALUE_RESTRICTION_TYPE__PATHED_ROLE_CONDITION_VALUE_CONSTRAINT, newPathedRoleConditionValueConstraint, newPathedRoleConditionValueConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.PATH_CONDITION_ROLE_VALUE_RESTRICTION_TYPE__PATHED_ROLE_CONDITION_VALUE_CONSTRAINT:
				return basicSetPathedRoleConditionValueConstraint(null, msgs);
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
			case CorePackage.PATH_CONDITION_ROLE_VALUE_RESTRICTION_TYPE__PATHED_ROLE_CONDITION_VALUE_CONSTRAINT:
				return getPathedRoleConditionValueConstraint();
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
			case CorePackage.PATH_CONDITION_ROLE_VALUE_RESTRICTION_TYPE__PATHED_ROLE_CONDITION_VALUE_CONSTRAINT:
				setPathedRoleConditionValueConstraint((ValueConstraintType)newValue);
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
			case CorePackage.PATH_CONDITION_ROLE_VALUE_RESTRICTION_TYPE__PATHED_ROLE_CONDITION_VALUE_CONSTRAINT:
				setPathedRoleConditionValueConstraint((ValueConstraintType)null);
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
			case CorePackage.PATH_CONDITION_ROLE_VALUE_RESTRICTION_TYPE__PATHED_ROLE_CONDITION_VALUE_CONSTRAINT:
				return pathedRoleConditionValueConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //PathConditionRoleValueRestrictionTypeImpl
