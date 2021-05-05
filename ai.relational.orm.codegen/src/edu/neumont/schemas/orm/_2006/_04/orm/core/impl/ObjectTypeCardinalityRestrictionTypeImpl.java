/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CardinalityConstraintType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeCardinalityRestrictionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Type Cardinality Restriction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectTypeCardinalityRestrictionTypeImpl#getCardinalityConstraint <em>Cardinality Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectTypeCardinalityRestrictionTypeImpl extends MinimalEObjectImpl.Container implements ObjectTypeCardinalityRestrictionType {
	/**
	 * The cached value of the '{@link #getCardinalityConstraint() <em>Cardinality Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityConstraint()
	 * @generated
	 * @ordered
	 */
	protected CardinalityConstraintType cardinalityConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectTypeCardinalityRestrictionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getObjectTypeCardinalityRestrictionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityConstraintType getCardinalityConstraint() {
		return cardinalityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinalityConstraint(CardinalityConstraintType newCardinalityConstraint, NotificationChain msgs) {
		CardinalityConstraintType oldCardinalityConstraint = cardinalityConstraint;
		cardinalityConstraint = newCardinalityConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_CARDINALITY_RESTRICTION_TYPE__CARDINALITY_CONSTRAINT, oldCardinalityConstraint, newCardinalityConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityConstraint(CardinalityConstraintType newCardinalityConstraint) {
		if (newCardinalityConstraint != cardinalityConstraint) {
			NotificationChain msgs = null;
			if (cardinalityConstraint != null)
				msgs = ((InternalEObject)cardinalityConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_TYPE_CARDINALITY_RESTRICTION_TYPE__CARDINALITY_CONSTRAINT, null, msgs);
			if (newCardinalityConstraint != null)
				msgs = ((InternalEObject)newCardinalityConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_TYPE_CARDINALITY_RESTRICTION_TYPE__CARDINALITY_CONSTRAINT, null, msgs);
			msgs = basicSetCardinalityConstraint(newCardinalityConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_CARDINALITY_RESTRICTION_TYPE__CARDINALITY_CONSTRAINT, newCardinalityConstraint, newCardinalityConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.OBJECT_TYPE_CARDINALITY_RESTRICTION_TYPE__CARDINALITY_CONSTRAINT:
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
			case CorePackage.OBJECT_TYPE_CARDINALITY_RESTRICTION_TYPE__CARDINALITY_CONSTRAINT:
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
			case CorePackage.OBJECT_TYPE_CARDINALITY_RESTRICTION_TYPE__CARDINALITY_CONSTRAINT:
				setCardinalityConstraint((CardinalityConstraintType)newValue);
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
			case CorePackage.OBJECT_TYPE_CARDINALITY_RESTRICTION_TYPE__CARDINALITY_CONSTRAINT:
				setCardinalityConstraint((CardinalityConstraintType)null);
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
			case CorePackage.OBJECT_TYPE_CARDINALITY_RESTRICTION_TYPE__CARDINALITY_CONSTRAINT:
				return cardinalityConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectTypeCardinalityRestrictionTypeImpl
