/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CardinalityConstraintRef;
import edu.neumont.schemas.orm._2006._04.orm.core.CardinalityRangeOverlapErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality Range Overlap Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CardinalityRangeOverlapErrorTypeImpl#getCardinalityConstraint <em>Cardinality Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardinalityRangeOverlapErrorTypeImpl extends ModelErrorImpl implements CardinalityRangeOverlapErrorType {
	/**
	 * The cached value of the '{@link #getCardinalityConstraint() <em>Cardinality Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityConstraint()
	 * @generated
	 * @ordered
	 */
	protected CardinalityConstraintRef cardinalityConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardinalityRangeOverlapErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getCardinalityRangeOverlapErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityConstraintRef getCardinalityConstraint() {
		return cardinalityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinalityConstraint(CardinalityConstraintRef newCardinalityConstraint, NotificationChain msgs) {
		CardinalityConstraintRef oldCardinalityConstraint = cardinalityConstraint;
		cardinalityConstraint = newCardinalityConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CARDINALITY_RANGE_OVERLAP_ERROR_TYPE__CARDINALITY_CONSTRAINT, oldCardinalityConstraint, newCardinalityConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityConstraint(CardinalityConstraintRef newCardinalityConstraint) {
		if (newCardinalityConstraint != cardinalityConstraint) {
			NotificationChain msgs = null;
			if (cardinalityConstraint != null)
				msgs = ((InternalEObject)cardinalityConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CARDINALITY_RANGE_OVERLAP_ERROR_TYPE__CARDINALITY_CONSTRAINT, null, msgs);
			if (newCardinalityConstraint != null)
				msgs = ((InternalEObject)newCardinalityConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CARDINALITY_RANGE_OVERLAP_ERROR_TYPE__CARDINALITY_CONSTRAINT, null, msgs);
			msgs = basicSetCardinalityConstraint(newCardinalityConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CARDINALITY_RANGE_OVERLAP_ERROR_TYPE__CARDINALITY_CONSTRAINT, newCardinalityConstraint, newCardinalityConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CARDINALITY_RANGE_OVERLAP_ERROR_TYPE__CARDINALITY_CONSTRAINT:
				return basicSetCardinalityConstraint(null, msgs);
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
			case CorePackage.CARDINALITY_RANGE_OVERLAP_ERROR_TYPE__CARDINALITY_CONSTRAINT:
				return getCardinalityConstraint();
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
			case CorePackage.CARDINALITY_RANGE_OVERLAP_ERROR_TYPE__CARDINALITY_CONSTRAINT:
				setCardinalityConstraint((CardinalityConstraintRef)newValue);
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
			case CorePackage.CARDINALITY_RANGE_OVERLAP_ERROR_TYPE__CARDINALITY_CONSTRAINT:
				setCardinalityConstraint((CardinalityConstraintRef)null);
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
			case CorePackage.CARDINALITY_RANGE_OVERLAP_ERROR_TYPE__CARDINALITY_CONSTRAINT:
				return cardinalityConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //CardinalityRangeOverlapErrorTypeImpl
