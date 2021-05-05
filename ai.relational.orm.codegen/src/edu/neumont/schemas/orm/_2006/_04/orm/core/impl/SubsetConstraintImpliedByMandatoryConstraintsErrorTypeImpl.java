/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.SetComparisonConstraintRef;
import edu.neumont.schemas.orm._2006._04.orm.core.SubsetConstraintImpliedByMandatoryConstraintsErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subset Constraint Implied By Mandatory Constraints Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SubsetConstraintImpliedByMandatoryConstraintsErrorTypeImpl#getSubsetConstraint <em>Subset Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubsetConstraintImpliedByMandatoryConstraintsErrorTypeImpl extends ModelErrorImpl implements SubsetConstraintImpliedByMandatoryConstraintsErrorType {
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
	protected SubsetConstraintImpliedByMandatoryConstraintsErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getSubsetConstraintImpliedByMandatoryConstraintsErrorType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SUBSET_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE__SUBSET_CONSTRAINT, oldSubsetConstraint, newSubsetConstraint);
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
				msgs = ((InternalEObject)subsetConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SUBSET_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE__SUBSET_CONSTRAINT, null, msgs);
			if (newSubsetConstraint != null)
				msgs = ((InternalEObject)newSubsetConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SUBSET_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE__SUBSET_CONSTRAINT, null, msgs);
			msgs = basicSetSubsetConstraint(newSubsetConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SUBSET_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE__SUBSET_CONSTRAINT, newSubsetConstraint, newSubsetConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SUBSET_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE__SUBSET_CONSTRAINT:
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
			case CorePackage.SUBSET_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE__SUBSET_CONSTRAINT:
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
			case CorePackage.SUBSET_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE__SUBSET_CONSTRAINT:
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
			case CorePackage.SUBSET_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE__SUBSET_CONSTRAINT:
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
			case CorePackage.SUBSET_CONSTRAINT_IMPLIED_BY_MANDATORY_CONSTRAINTS_ERROR_TYPE__SUBSET_CONSTRAINT:
				return subsetConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //SubsetConstraintImpliedByMandatoryConstraintsErrorTypeImpl
