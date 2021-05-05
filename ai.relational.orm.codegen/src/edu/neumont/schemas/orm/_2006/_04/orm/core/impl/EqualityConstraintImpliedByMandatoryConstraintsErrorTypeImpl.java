/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.EqualityConstraintImpliedByMandatoryConstraintsErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.SetComparisonConstraintRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equality Constraint Implied By Mandatory Constraints Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.EqualityConstraintImpliedByMandatoryConstraintsErrorTypeImpl#getEqualityConstraint <em>Equality Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EqualityConstraintImpliedByMandatoryConstraintsErrorTypeImpl extends ModelErrorImpl implements EqualityConstraintImpliedByMandatoryConstraintsErrorType {
	/**
	 * The cached value of the '{@link #getEqualityConstraint() <em>Equality Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEqualityConstraint()
	 * @generated
	 * @ordered
	 */
	protected SetComparisonConstraintRef equalityConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EqualityConstraintImpliedByMandatoryConstraintsErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getEqualityConstraintImpliedByMandatoryConstraintsErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetComparisonConstraintRef getEqualityConstraint() {
		return equalityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEqualityConstraint(SetComparisonConstraintRef newEqualityConstraint, NotificationChain msgs) {
		SetComparisonConstraintRef oldEqualityConstraint = equalityConstraint;
		equalityConstraint = newEqualityConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.EQUALITY_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE__EQUALITY_CONSTRAINT, oldEqualityConstraint, newEqualityConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEqualityConstraint(SetComparisonConstraintRef newEqualityConstraint) {
		if (newEqualityConstraint != equalityConstraint) {
			NotificationChain msgs = null;
			if (equalityConstraint != null)
				msgs = ((InternalEObject)equalityConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.EQUALITY_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE__EQUALITY_CONSTRAINT, null, msgs);
			if (newEqualityConstraint != null)
				msgs = ((InternalEObject)newEqualityConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.EQUALITY_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE__EQUALITY_CONSTRAINT, null, msgs);
			msgs = basicSetEqualityConstraint(newEqualityConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EQUALITY_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE__EQUALITY_CONSTRAINT, newEqualityConstraint, newEqualityConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.EQUALITY_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE__EQUALITY_CONSTRAINT:
				return basicSetEqualityConstraint(null, msgs);
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
			case CorePackage.EQUALITY_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE__EQUALITY_CONSTRAINT:
				return getEqualityConstraint();
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
			case CorePackage.EQUALITY_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE__EQUALITY_CONSTRAINT:
				setEqualityConstraint((SetComparisonConstraintRef)newValue);
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
			case CorePackage.EQUALITY_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE__EQUALITY_CONSTRAINT:
				setEqualityConstraint((SetComparisonConstraintRef)null);
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
			case CorePackage.EQUALITY_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE__EQUALITY_CONSTRAINT:
				return equalityConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //EqualityConstraintImpliedByMandatoryConstraintsErrorTypeImpl
