/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRef;
import edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintContradictsInternalUniquenessConstraintErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frequency Constraint Contradicts Internal Uniqueness Constraint Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FrequencyConstraintContradictsInternalUniquenessConstraintErrorTypeImpl#getFrequencyConstraint <em>Frequency Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FrequencyConstraintContradictsInternalUniquenessConstraintErrorTypeImpl#getFact <em>Fact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrequencyConstraintContradictsInternalUniquenessConstraintErrorTypeImpl extends ModelErrorImpl implements FrequencyConstraintContradictsInternalUniquenessConstraintErrorType {
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
	 * The cached value of the '{@link #getFact() <em>Fact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFact()
	 * @generated
	 * @ordered
	 */
	protected FactTypeRef fact;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrequencyConstraintContradictsInternalUniquenessConstraintErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getFrequencyConstraintContradictsInternalUniquenessConstraintErrorType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE__FREQUENCY_CONSTRAINT, oldFrequencyConstraint, newFrequencyConstraint);
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
				msgs = ((InternalEObject)frequencyConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE__FREQUENCY_CONSTRAINT, null, msgs);
			if (newFrequencyConstraint != null)
				msgs = ((InternalEObject)newFrequencyConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE__FREQUENCY_CONSTRAINT, null, msgs);
			msgs = basicSetFrequencyConstraint(newFrequencyConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE__FREQUENCY_CONSTRAINT, newFrequencyConstraint, newFrequencyConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeRef getFact() {
		return fact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFact(FactTypeRef newFact, NotificationChain msgs) {
		FactTypeRef oldFact = fact;
		fact = newFact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE__FACT, oldFact, newFact);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFact(FactTypeRef newFact) {
		if (newFact != fact) {
			NotificationChain msgs = null;
			if (fact != null)
				msgs = ((InternalEObject)fact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE__FACT, null, msgs);
			if (newFact != null)
				msgs = ((InternalEObject)newFact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE__FACT, null, msgs);
			msgs = basicSetFact(newFact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE__FACT, newFact, newFact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE__FREQUENCY_CONSTRAINT:
				return basicSetFrequencyConstraint(null, msgs);
			case CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE__FACT:
				return basicSetFact(null, msgs);
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
			case CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE__FREQUENCY_CONSTRAINT:
				return getFrequencyConstraint();
			case CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE__FACT:
				return getFact();
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
			case CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE__FREQUENCY_CONSTRAINT:
				setFrequencyConstraint((FrequencyConstraintRef)newValue);
				return;
			case CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE__FACT:
				setFact((FactTypeRef)newValue);
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
			case CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE__FREQUENCY_CONSTRAINT:
				setFrequencyConstraint((FrequencyConstraintRef)null);
				return;
			case CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE__FACT:
				setFact((FactTypeRef)null);
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
			case CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE__FREQUENCY_CONSTRAINT:
				return frequencyConstraint != null;
			case CorePackage.FREQUENCY_CONSTRAINT_CONTRADICTS_INTERNAL_UNIQUENESS_CONSTRAINT_ERROR_TYPE__FACT:
				return fact != null;
		}
		return super.eIsSet(featureID);
	}

} //FrequencyConstraintContradictsInternalUniquenessConstraintErrorTypeImpl
