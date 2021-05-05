/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintMinMaxErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frequency Constraint Min Max Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FrequencyConstraintMinMaxErrorTypeImpl#getFrequencyConstraint <em>Frequency Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrequencyConstraintMinMaxErrorTypeImpl extends ModelErrorImpl implements FrequencyConstraintMinMaxErrorType {
	/**
	 * The cached value of the '{@link #getFrequencyConstraint() <em>Frequency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyConstraint()
	 * @generated
	 * @ordered
	 */
	protected FrequencyConstraintRef frequencyConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrequencyConstraintMinMaxErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getFrequencyConstraintMinMaxErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyConstraintRef getFrequencyConstraint() {
		return frequencyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequencyConstraint(FrequencyConstraintRef newFrequencyConstraint, NotificationChain msgs) {
		FrequencyConstraintRef oldFrequencyConstraint = frequencyConstraint;
		frequencyConstraint = newFrequencyConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FREQUENCY_CONSTRAINT_MIN_MAX_ERROR_TYPE__FREQUENCY_CONSTRAINT, oldFrequencyConstraint, newFrequencyConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyConstraint(FrequencyConstraintRef newFrequencyConstraint) {
		if (newFrequencyConstraint != frequencyConstraint) {
			NotificationChain msgs = null;
			if (frequencyConstraint != null)
				msgs = ((InternalEObject)frequencyConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FREQUENCY_CONSTRAINT_MIN_MAX_ERROR_TYPE__FREQUENCY_CONSTRAINT, null, msgs);
			if (newFrequencyConstraint != null)
				msgs = ((InternalEObject)newFrequencyConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FREQUENCY_CONSTRAINT_MIN_MAX_ERROR_TYPE__FREQUENCY_CONSTRAINT, null, msgs);
			msgs = basicSetFrequencyConstraint(newFrequencyConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FREQUENCY_CONSTRAINT_MIN_MAX_ERROR_TYPE__FREQUENCY_CONSTRAINT, newFrequencyConstraint, newFrequencyConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FREQUENCY_CONSTRAINT_MIN_MAX_ERROR_TYPE__FREQUENCY_CONSTRAINT:
				return basicSetFrequencyConstraint(null, msgs);
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
			case CorePackage.FREQUENCY_CONSTRAINT_MIN_MAX_ERROR_TYPE__FREQUENCY_CONSTRAINT:
				return getFrequencyConstraint();
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
			case CorePackage.FREQUENCY_CONSTRAINT_MIN_MAX_ERROR_TYPE__FREQUENCY_CONSTRAINT:
				setFrequencyConstraint((FrequencyConstraintRef)newValue);
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
			case CorePackage.FREQUENCY_CONSTRAINT_MIN_MAX_ERROR_TYPE__FREQUENCY_CONSTRAINT:
				setFrequencyConstraint((FrequencyConstraintRef)null);
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
			case CorePackage.FREQUENCY_CONSTRAINT_MIN_MAX_ERROR_TYPE__FREQUENCY_CONSTRAINT:
				return frequencyConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //FrequencyConstraintMinMaxErrorTypeImpl
