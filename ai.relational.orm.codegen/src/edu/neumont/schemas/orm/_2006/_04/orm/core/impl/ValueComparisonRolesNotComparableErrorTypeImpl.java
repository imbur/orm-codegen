/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonConstraintRef;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonRolesNotComparableErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Comparison Roles Not Comparable Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ValueComparisonRolesNotComparableErrorTypeImpl#getValueComparisonConstraint <em>Value Comparison Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueComparisonRolesNotComparableErrorTypeImpl extends ModelErrorImpl implements ValueComparisonRolesNotComparableErrorType {
	/**
	 * The cached value of the '{@link #getValueComparisonConstraint() <em>Value Comparison Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueComparisonConstraint()
	 * @generated
	 * @ordered
	 */
	protected ValueComparisonConstraintRef valueComparisonConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueComparisonRolesNotComparableErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getValueComparisonRolesNotComparableErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueComparisonConstraintRef getValueComparisonConstraint() {
		return valueComparisonConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueComparisonConstraint(ValueComparisonConstraintRef newValueComparisonConstraint, NotificationChain msgs) {
		ValueComparisonConstraintRef oldValueComparisonConstraint = valueComparisonConstraint;
		valueComparisonConstraint = newValueComparisonConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_COMPARISON_ROLES_NOT_COMPARABLE_ERROR_TYPE__VALUE_COMPARISON_CONSTRAINT, oldValueComparisonConstraint, newValueComparisonConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueComparisonConstraint(ValueComparisonConstraintRef newValueComparisonConstraint) {
		if (newValueComparisonConstraint != valueComparisonConstraint) {
			NotificationChain msgs = null;
			if (valueComparisonConstraint != null)
				msgs = ((InternalEObject)valueComparisonConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.VALUE_COMPARISON_ROLES_NOT_COMPARABLE_ERROR_TYPE__VALUE_COMPARISON_CONSTRAINT, null, msgs);
			if (newValueComparisonConstraint != null)
				msgs = ((InternalEObject)newValueComparisonConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.VALUE_COMPARISON_ROLES_NOT_COMPARABLE_ERROR_TYPE__VALUE_COMPARISON_CONSTRAINT, null, msgs);
			msgs = basicSetValueComparisonConstraint(newValueComparisonConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_COMPARISON_ROLES_NOT_COMPARABLE_ERROR_TYPE__VALUE_COMPARISON_CONSTRAINT, newValueComparisonConstraint, newValueComparisonConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.VALUE_COMPARISON_ROLES_NOT_COMPARABLE_ERROR_TYPE__VALUE_COMPARISON_CONSTRAINT:
				return basicSetValueComparisonConstraint(null, msgs);
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
			case CorePackage.VALUE_COMPARISON_ROLES_NOT_COMPARABLE_ERROR_TYPE__VALUE_COMPARISON_CONSTRAINT:
				return getValueComparisonConstraint();
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
			case CorePackage.VALUE_COMPARISON_ROLES_NOT_COMPARABLE_ERROR_TYPE__VALUE_COMPARISON_CONSTRAINT:
				setValueComparisonConstraint((ValueComparisonConstraintRef)newValue);
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
			case CorePackage.VALUE_COMPARISON_ROLES_NOT_COMPARABLE_ERROR_TYPE__VALUE_COMPARISON_CONSTRAINT:
				setValueComparisonConstraint((ValueComparisonConstraintRef)null);
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
			case CorePackage.VALUE_COMPARISON_ROLES_NOT_COMPARABLE_ERROR_TYPE__VALUE_COMPARISON_CONSTRAINT:
				return valueComparisonConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueComparisonRolesNotComparableErrorTypeImpl
