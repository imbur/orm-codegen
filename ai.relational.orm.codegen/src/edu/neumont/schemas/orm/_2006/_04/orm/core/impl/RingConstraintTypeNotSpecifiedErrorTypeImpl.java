/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.RingConstraintRef;
import edu.neumont.schemas.orm._2006._04.orm.core.RingConstraintTypeNotSpecifiedErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ring Constraint Type Not Specified Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RingConstraintTypeNotSpecifiedErrorTypeImpl#getRingConstraint <em>Ring Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RingConstraintTypeNotSpecifiedErrorTypeImpl extends ModelErrorImpl implements RingConstraintTypeNotSpecifiedErrorType {
	/**
	 * The cached value of the '{@link #getRingConstraint() <em>Ring Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRingConstraint()
	 * @generated
	 * @ordered
	 */
	protected RingConstraintRef ringConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RingConstraintTypeNotSpecifiedErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getRingConstraintTypeNotSpecifiedErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RingConstraintRef getRingConstraint() {
		return ringConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRingConstraint(RingConstraintRef newRingConstraint, NotificationChain msgs) {
		RingConstraintRef oldRingConstraint = ringConstraint;
		ringConstraint = newRingConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.RING_CONSTRAINT_TYPE_NOT_SPECIFIED_ERROR_TYPE__RING_CONSTRAINT, oldRingConstraint, newRingConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRingConstraint(RingConstraintRef newRingConstraint) {
		if (newRingConstraint != ringConstraint) {
			NotificationChain msgs = null;
			if (ringConstraint != null)
				msgs = ((InternalEObject)ringConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.RING_CONSTRAINT_TYPE_NOT_SPECIFIED_ERROR_TYPE__RING_CONSTRAINT, null, msgs);
			if (newRingConstraint != null)
				msgs = ((InternalEObject)newRingConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.RING_CONSTRAINT_TYPE_NOT_SPECIFIED_ERROR_TYPE__RING_CONSTRAINT, null, msgs);
			msgs = basicSetRingConstraint(newRingConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RING_CONSTRAINT_TYPE_NOT_SPECIFIED_ERROR_TYPE__RING_CONSTRAINT, newRingConstraint, newRingConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.RING_CONSTRAINT_TYPE_NOT_SPECIFIED_ERROR_TYPE__RING_CONSTRAINT:
				return basicSetRingConstraint(null, msgs);
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
			case CorePackage.RING_CONSTRAINT_TYPE_NOT_SPECIFIED_ERROR_TYPE__RING_CONSTRAINT:
				return getRingConstraint();
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
			case CorePackage.RING_CONSTRAINT_TYPE_NOT_SPECIFIED_ERROR_TYPE__RING_CONSTRAINT:
				setRingConstraint((RingConstraintRef)newValue);
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
			case CorePackage.RING_CONSTRAINT_TYPE_NOT_SPECIFIED_ERROR_TYPE__RING_CONSTRAINT:
				setRingConstraint((RingConstraintRef)null);
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
			case CorePackage.RING_CONSTRAINT_TYPE_NOT_SPECIFIED_ERROR_TYPE__RING_CONSTRAINT:
				return ringConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //RingConstraintTypeNotSpecifiedErrorTypeImpl
