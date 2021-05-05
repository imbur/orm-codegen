/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CardinalityConstraintType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.UnaryRoleCardinalityRestrictionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Role Cardinality Restriction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.UnaryRoleCardinalityRestrictionTypeImpl#getUnaryRoleCardinalityConstraint <em>Unary Role Cardinality Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnaryRoleCardinalityRestrictionTypeImpl extends MinimalEObjectImpl.Container implements UnaryRoleCardinalityRestrictionType {
	/**
	 * The cached value of the '{@link #getUnaryRoleCardinalityConstraint() <em>Unary Role Cardinality Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnaryRoleCardinalityConstraint()
	 * @generated
	 * @ordered
	 */
	protected CardinalityConstraintType unaryRoleCardinalityConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryRoleCardinalityRestrictionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getUnaryRoleCardinalityRestrictionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityConstraintType getUnaryRoleCardinalityConstraint() {
		return unaryRoleCardinalityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnaryRoleCardinalityConstraint(CardinalityConstraintType newUnaryRoleCardinalityConstraint, NotificationChain msgs) {
		CardinalityConstraintType oldUnaryRoleCardinalityConstraint = unaryRoleCardinalityConstraint;
		unaryRoleCardinalityConstraint = newUnaryRoleCardinalityConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.UNARY_ROLE_CARDINALITY_RESTRICTION_TYPE__UNARY_ROLE_CARDINALITY_CONSTRAINT, oldUnaryRoleCardinalityConstraint, newUnaryRoleCardinalityConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnaryRoleCardinalityConstraint(CardinalityConstraintType newUnaryRoleCardinalityConstraint) {
		if (newUnaryRoleCardinalityConstraint != unaryRoleCardinalityConstraint) {
			NotificationChain msgs = null;
			if (unaryRoleCardinalityConstraint != null)
				msgs = ((InternalEObject)unaryRoleCardinalityConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.UNARY_ROLE_CARDINALITY_RESTRICTION_TYPE__UNARY_ROLE_CARDINALITY_CONSTRAINT, null, msgs);
			if (newUnaryRoleCardinalityConstraint != null)
				msgs = ((InternalEObject)newUnaryRoleCardinalityConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.UNARY_ROLE_CARDINALITY_RESTRICTION_TYPE__UNARY_ROLE_CARDINALITY_CONSTRAINT, null, msgs);
			msgs = basicSetUnaryRoleCardinalityConstraint(newUnaryRoleCardinalityConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.UNARY_ROLE_CARDINALITY_RESTRICTION_TYPE__UNARY_ROLE_CARDINALITY_CONSTRAINT, newUnaryRoleCardinalityConstraint, newUnaryRoleCardinalityConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.UNARY_ROLE_CARDINALITY_RESTRICTION_TYPE__UNARY_ROLE_CARDINALITY_CONSTRAINT:
				return basicSetUnaryRoleCardinalityConstraint(null, msgs);
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
			case CorePackage.UNARY_ROLE_CARDINALITY_RESTRICTION_TYPE__UNARY_ROLE_CARDINALITY_CONSTRAINT:
				return getUnaryRoleCardinalityConstraint();
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
			case CorePackage.UNARY_ROLE_CARDINALITY_RESTRICTION_TYPE__UNARY_ROLE_CARDINALITY_CONSTRAINT:
				setUnaryRoleCardinalityConstraint((CardinalityConstraintType)newValue);
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
			case CorePackage.UNARY_ROLE_CARDINALITY_RESTRICTION_TYPE__UNARY_ROLE_CARDINALITY_CONSTRAINT:
				setUnaryRoleCardinalityConstraint((CardinalityConstraintType)null);
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
			case CorePackage.UNARY_ROLE_CARDINALITY_RESTRICTION_TYPE__UNARY_ROLE_CARDINALITY_CONSTRAINT:
				return unaryRoleCardinalityConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //UnaryRoleCardinalityRestrictionTypeImpl
