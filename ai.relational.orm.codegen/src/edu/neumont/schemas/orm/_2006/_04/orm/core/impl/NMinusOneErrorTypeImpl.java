/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.NMinusOneErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.UniquenessConstraintRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NMinus One Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.NMinusOneErrorTypeImpl#getUniquenessConstraint <em>Uniqueness Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NMinusOneErrorTypeImpl extends ModelErrorImpl implements NMinusOneErrorType {
	/**
	 * The cached value of the '{@link #getUniquenessConstraint() <em>Uniqueness Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniquenessConstraint()
	 * @generated
	 * @ordered
	 */
	protected UniquenessConstraintRef uniquenessConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NMinusOneErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getNMinusOneErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniquenessConstraintRef getUniquenessConstraint() {
		return uniquenessConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUniquenessConstraint(UniquenessConstraintRef newUniquenessConstraint, NotificationChain msgs) {
		UniquenessConstraintRef oldUniquenessConstraint = uniquenessConstraint;
		uniquenessConstraint = newUniquenessConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.NMINUS_ONE_ERROR_TYPE__UNIQUENESS_CONSTRAINT, oldUniquenessConstraint, newUniquenessConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniquenessConstraint(UniquenessConstraintRef newUniquenessConstraint) {
		if (newUniquenessConstraint != uniquenessConstraint) {
			NotificationChain msgs = null;
			if (uniquenessConstraint != null)
				msgs = ((InternalEObject)uniquenessConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.NMINUS_ONE_ERROR_TYPE__UNIQUENESS_CONSTRAINT, null, msgs);
			if (newUniquenessConstraint != null)
				msgs = ((InternalEObject)newUniquenessConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.NMINUS_ONE_ERROR_TYPE__UNIQUENESS_CONSTRAINT, null, msgs);
			msgs = basicSetUniquenessConstraint(newUniquenessConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NMINUS_ONE_ERROR_TYPE__UNIQUENESS_CONSTRAINT, newUniquenessConstraint, newUniquenessConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.NMINUS_ONE_ERROR_TYPE__UNIQUENESS_CONSTRAINT:
				return basicSetUniquenessConstraint(null, msgs);
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
			case CorePackage.NMINUS_ONE_ERROR_TYPE__UNIQUENESS_CONSTRAINT:
				return getUniquenessConstraint();
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
			case CorePackage.NMINUS_ONE_ERROR_TYPE__UNIQUENESS_CONSTRAINT:
				setUniquenessConstraint((UniquenessConstraintRef)newValue);
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
			case CorePackage.NMINUS_ONE_ERROR_TYPE__UNIQUENESS_CONSTRAINT:
				setUniquenessConstraint((UniquenessConstraintRef)null);
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
			case CorePackage.NMINUS_ONE_ERROR_TYPE__UNIQUENESS_CONSTRAINT:
				return uniquenessConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //NMinusOneErrorTypeImpl
