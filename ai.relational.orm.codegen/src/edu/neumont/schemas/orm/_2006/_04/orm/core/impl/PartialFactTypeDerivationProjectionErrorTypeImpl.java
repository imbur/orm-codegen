/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationProjectionRef;
import edu.neumont.schemas.orm._2006._04.orm.core.PartialFactTypeDerivationProjectionErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partial Fact Type Derivation Projection Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PartialFactTypeDerivationProjectionErrorTypeImpl#getDerivationProjection <em>Derivation Projection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartialFactTypeDerivationProjectionErrorTypeImpl extends ModelErrorImpl implements PartialFactTypeDerivationProjectionErrorType {
	/**
	 * The cached value of the '{@link #getDerivationProjection() <em>Derivation Projection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationProjection()
	 * @generated
	 * @ordered
	 */
	protected FactTypeDerivationProjectionRef derivationProjection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialFactTypeDerivationProjectionErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getPartialFactTypeDerivationProjectionErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeDerivationProjectionRef getDerivationProjection() {
		return derivationProjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivationProjection(FactTypeDerivationProjectionRef newDerivationProjection, NotificationChain msgs) {
		FactTypeDerivationProjectionRef oldDerivationProjection = derivationProjection;
		derivationProjection = newDerivationProjection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.PARTIAL_FACT_TYPE_DERIVATION_PROJECTION_ERROR_TYPE__DERIVATION_PROJECTION, oldDerivationProjection, newDerivationProjection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationProjection(FactTypeDerivationProjectionRef newDerivationProjection) {
		if (newDerivationProjection != derivationProjection) {
			NotificationChain msgs = null;
			if (derivationProjection != null)
				msgs = ((InternalEObject)derivationProjection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.PARTIAL_FACT_TYPE_DERIVATION_PROJECTION_ERROR_TYPE__DERIVATION_PROJECTION, null, msgs);
			if (newDerivationProjection != null)
				msgs = ((InternalEObject)newDerivationProjection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.PARTIAL_FACT_TYPE_DERIVATION_PROJECTION_ERROR_TYPE__DERIVATION_PROJECTION, null, msgs);
			msgs = basicSetDerivationProjection(newDerivationProjection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PARTIAL_FACT_TYPE_DERIVATION_PROJECTION_ERROR_TYPE__DERIVATION_PROJECTION, newDerivationProjection, newDerivationProjection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.PARTIAL_FACT_TYPE_DERIVATION_PROJECTION_ERROR_TYPE__DERIVATION_PROJECTION:
				return basicSetDerivationProjection(null, msgs);
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
			case CorePackage.PARTIAL_FACT_TYPE_DERIVATION_PROJECTION_ERROR_TYPE__DERIVATION_PROJECTION:
				return getDerivationProjection();
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
			case CorePackage.PARTIAL_FACT_TYPE_DERIVATION_PROJECTION_ERROR_TYPE__DERIVATION_PROJECTION:
				setDerivationProjection((FactTypeDerivationProjectionRef)newValue);
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
			case CorePackage.PARTIAL_FACT_TYPE_DERIVATION_PROJECTION_ERROR_TYPE__DERIVATION_PROJECTION:
				setDerivationProjection((FactTypeDerivationProjectionRef)null);
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
			case CorePackage.PARTIAL_FACT_TYPE_DERIVATION_PROJECTION_ERROR_TYPE__DERIVATION_PROJECTION:
				return derivationProjection != null;
		}
		return super.eIsSet(featureID);
	}

} //PartialFactTypeDerivationProjectionErrorTypeImpl
