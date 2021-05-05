/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueConstraintRef;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeOverlapErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Range Overlap Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ValueRangeOverlapErrorTypeImpl#getValueConstraint <em>Value Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueRangeOverlapErrorTypeImpl extends ModelErrorImpl implements ValueRangeOverlapErrorType {
	/**
	 * The cached value of the '{@link #getValueConstraint() <em>Value Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueConstraint()
	 * @generated
	 * @ordered
	 */
	protected ValueConstraintRef valueConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueRangeOverlapErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getValueRangeOverlapErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueConstraintRef getValueConstraint() {
		return valueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueConstraint(ValueConstraintRef newValueConstraint, NotificationChain msgs) {
		ValueConstraintRef oldValueConstraint = valueConstraint;
		valueConstraint = newValueConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_RANGE_OVERLAP_ERROR_TYPE__VALUE_CONSTRAINT, oldValueConstraint, newValueConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueConstraint(ValueConstraintRef newValueConstraint) {
		if (newValueConstraint != valueConstraint) {
			NotificationChain msgs = null;
			if (valueConstraint != null)
				msgs = ((InternalEObject)valueConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.VALUE_RANGE_OVERLAP_ERROR_TYPE__VALUE_CONSTRAINT, null, msgs);
			if (newValueConstraint != null)
				msgs = ((InternalEObject)newValueConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.VALUE_RANGE_OVERLAP_ERROR_TYPE__VALUE_CONSTRAINT, null, msgs);
			msgs = basicSetValueConstraint(newValueConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_RANGE_OVERLAP_ERROR_TYPE__VALUE_CONSTRAINT, newValueConstraint, newValueConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.VALUE_RANGE_OVERLAP_ERROR_TYPE__VALUE_CONSTRAINT:
				return basicSetValueConstraint(null, msgs);
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
			case CorePackage.VALUE_RANGE_OVERLAP_ERROR_TYPE__VALUE_CONSTRAINT:
				return getValueConstraint();
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
			case CorePackage.VALUE_RANGE_OVERLAP_ERROR_TYPE__VALUE_CONSTRAINT:
				setValueConstraint((ValueConstraintRef)newValue);
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
			case CorePackage.VALUE_RANGE_OVERLAP_ERROR_TYPE__VALUE_CONSTRAINT:
				setValueConstraint((ValueConstraintRef)null);
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
			case CorePackage.VALUE_RANGE_OVERLAP_ERROR_TYPE__VALUE_CONSTRAINT:
				return valueConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueRangeOverlapErrorTypeImpl
