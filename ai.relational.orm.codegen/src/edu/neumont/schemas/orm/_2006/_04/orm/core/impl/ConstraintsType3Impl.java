/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType3;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintRef;
import edu.neumont.schemas.orm._2006._04.orm.core.SetComparisonConstraintRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraints Type3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsType3Impl#getMandatoryConstraint <em>Mandatory Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsType3Impl#getSubsetConstraint <em>Subset Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintsType3Impl extends MinimalEObjectImpl.Container implements ConstraintsType3 {
	/**
	 * The cached value of the '{@link #getMandatoryConstraint() <em>Mandatory Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryConstraint()
	 * @generated
	 * @ordered
	 */
	protected MandatoryConstraintRef mandatoryConstraint;

	/**
	 * The cached value of the '{@link #getSubsetConstraint() <em>Subset Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsetConstraint()
	 * @generated
	 * @ordered
	 */
	protected SetComparisonConstraintRef subsetConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintsType3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getConstraintsType3();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryConstraintRef getMandatoryConstraint() {
		return mandatoryConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMandatoryConstraint(MandatoryConstraintRef newMandatoryConstraint, NotificationChain msgs) {
		MandatoryConstraintRef oldMandatoryConstraint = mandatoryConstraint;
		mandatoryConstraint = newMandatoryConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONSTRAINTS_TYPE3__MANDATORY_CONSTRAINT, oldMandatoryConstraint, newMandatoryConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatoryConstraint(MandatoryConstraintRef newMandatoryConstraint) {
		if (newMandatoryConstraint != mandatoryConstraint) {
			NotificationChain msgs = null;
			if (mandatoryConstraint != null)
				msgs = ((InternalEObject)mandatoryConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONSTRAINTS_TYPE3__MANDATORY_CONSTRAINT, null, msgs);
			if (newMandatoryConstraint != null)
				msgs = ((InternalEObject)newMandatoryConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONSTRAINTS_TYPE3__MANDATORY_CONSTRAINT, null, msgs);
			msgs = basicSetMandatoryConstraint(newMandatoryConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONSTRAINTS_TYPE3__MANDATORY_CONSTRAINT, newMandatoryConstraint, newMandatoryConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetComparisonConstraintRef getSubsetConstraint() {
		return subsetConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubsetConstraint(SetComparisonConstraintRef newSubsetConstraint, NotificationChain msgs) {
		SetComparisonConstraintRef oldSubsetConstraint = subsetConstraint;
		subsetConstraint = newSubsetConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONSTRAINTS_TYPE3__SUBSET_CONSTRAINT, oldSubsetConstraint, newSubsetConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsetConstraint(SetComparisonConstraintRef newSubsetConstraint) {
		if (newSubsetConstraint != subsetConstraint) {
			NotificationChain msgs = null;
			if (subsetConstraint != null)
				msgs = ((InternalEObject)subsetConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONSTRAINTS_TYPE3__SUBSET_CONSTRAINT, null, msgs);
			if (newSubsetConstraint != null)
				msgs = ((InternalEObject)newSubsetConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONSTRAINTS_TYPE3__SUBSET_CONSTRAINT, null, msgs);
			msgs = basicSetSubsetConstraint(newSubsetConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONSTRAINTS_TYPE3__SUBSET_CONSTRAINT, newSubsetConstraint, newSubsetConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CONSTRAINTS_TYPE3__MANDATORY_CONSTRAINT:
				return basicSetMandatoryConstraint(null, msgs);
			case CorePackage.CONSTRAINTS_TYPE3__SUBSET_CONSTRAINT:
				return basicSetSubsetConstraint(null, msgs);
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
			case CorePackage.CONSTRAINTS_TYPE3__MANDATORY_CONSTRAINT:
				return getMandatoryConstraint();
			case CorePackage.CONSTRAINTS_TYPE3__SUBSET_CONSTRAINT:
				return getSubsetConstraint();
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
			case CorePackage.CONSTRAINTS_TYPE3__MANDATORY_CONSTRAINT:
				setMandatoryConstraint((MandatoryConstraintRef)newValue);
				return;
			case CorePackage.CONSTRAINTS_TYPE3__SUBSET_CONSTRAINT:
				setSubsetConstraint((SetComparisonConstraintRef)newValue);
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
			case CorePackage.CONSTRAINTS_TYPE3__MANDATORY_CONSTRAINT:
				setMandatoryConstraint((MandatoryConstraintRef)null);
				return;
			case CorePackage.CONSTRAINTS_TYPE3__SUBSET_CONSTRAINT:
				setSubsetConstraint((SetComparisonConstraintRef)null);
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
			case CorePackage.CONSTRAINTS_TYPE3__MANDATORY_CONSTRAINT:
				return mandatoryConstraint != null;
			case CorePackage.CONSTRAINTS_TYPE3__SUBSET_CONSTRAINT:
				return subsetConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstraintsType3Impl
