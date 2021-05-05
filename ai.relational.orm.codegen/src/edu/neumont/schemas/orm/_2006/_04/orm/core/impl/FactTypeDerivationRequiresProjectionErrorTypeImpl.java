/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathRef;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationRequiresProjectionErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fact Type Derivation Requires Projection Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeDerivationRequiresProjectionErrorTypeImpl#getFactTypeDerivationPath <em>Fact Type Derivation Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactTypeDerivationRequiresProjectionErrorTypeImpl extends ModelErrorImpl implements FactTypeDerivationRequiresProjectionErrorType {
	/**
	 * The cached value of the '{@link #getFactTypeDerivationPath() <em>Fact Type Derivation Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactTypeDerivationPath()
	 * @generated
	 * @ordered
	 */
	protected FactTypeDerivationPathRef factTypeDerivationPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactTypeDerivationRequiresProjectionErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getFactTypeDerivationRequiresProjectionErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeDerivationPathRef getFactTypeDerivationPath() {
		return factTypeDerivationPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactTypeDerivationPath(FactTypeDerivationPathRef newFactTypeDerivationPath, NotificationChain msgs) {
		FactTypeDerivationPathRef oldFactTypeDerivationPath = factTypeDerivationPath;
		factTypeDerivationPath = newFactTypeDerivationPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_DERIVATION_REQUIRES_PROJECTION_ERROR_TYPE__FACT_TYPE_DERIVATION_PATH, oldFactTypeDerivationPath, newFactTypeDerivationPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactTypeDerivationPath(FactTypeDerivationPathRef newFactTypeDerivationPath) {
		if (newFactTypeDerivationPath != factTypeDerivationPath) {
			NotificationChain msgs = null;
			if (factTypeDerivationPath != null)
				msgs = ((InternalEObject)factTypeDerivationPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_DERIVATION_REQUIRES_PROJECTION_ERROR_TYPE__FACT_TYPE_DERIVATION_PATH, null, msgs);
			if (newFactTypeDerivationPath != null)
				msgs = ((InternalEObject)newFactTypeDerivationPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_DERIVATION_REQUIRES_PROJECTION_ERROR_TYPE__FACT_TYPE_DERIVATION_PATH, null, msgs);
			msgs = basicSetFactTypeDerivationPath(newFactTypeDerivationPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_DERIVATION_REQUIRES_PROJECTION_ERROR_TYPE__FACT_TYPE_DERIVATION_PATH, newFactTypeDerivationPath, newFactTypeDerivationPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FACT_TYPE_DERIVATION_REQUIRES_PROJECTION_ERROR_TYPE__FACT_TYPE_DERIVATION_PATH:
				return basicSetFactTypeDerivationPath(null, msgs);
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
			case CorePackage.FACT_TYPE_DERIVATION_REQUIRES_PROJECTION_ERROR_TYPE__FACT_TYPE_DERIVATION_PATH:
				return getFactTypeDerivationPath();
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
			case CorePackage.FACT_TYPE_DERIVATION_REQUIRES_PROJECTION_ERROR_TYPE__FACT_TYPE_DERIVATION_PATH:
				setFactTypeDerivationPath((FactTypeDerivationPathRef)newValue);
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
			case CorePackage.FACT_TYPE_DERIVATION_REQUIRES_PROJECTION_ERROR_TYPE__FACT_TYPE_DERIVATION_PATH:
				setFactTypeDerivationPath((FactTypeDerivationPathRef)null);
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
			case CorePackage.FACT_TYPE_DERIVATION_REQUIRES_PROJECTION_ERROR_TYPE__FACT_TYPE_DERIVATION_PATH:
				return factTypeDerivationPath != null;
		}
		return super.eIsSet(featureID);
	}

} //FactTypeDerivationRequiresProjectionErrorTypeImpl
