/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueParameterBindingErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculated Path Value Parameter Binding Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CalculatedPathValueParameterBindingErrorTypeImpl#getCalculatedValue <em>Calculated Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculatedPathValueParameterBindingErrorTypeImpl extends ModelErrorImpl implements CalculatedPathValueParameterBindingErrorType {
	/**
	 * The cached value of the '{@link #getCalculatedValue() <em>Calculated Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculatedValue()
	 * @generated
	 * @ordered
	 */
	protected CalculatedValueType calculatedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculatedPathValueParameterBindingErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getCalculatedPathValueParameterBindingErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedValueType getCalculatedValue() {
		return calculatedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculatedValue(CalculatedValueType newCalculatedValue, NotificationChain msgs) {
		CalculatedValueType oldCalculatedValue = calculatedValue;
		calculatedValue = newCalculatedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CALCULATED_PATH_VALUE_PARAMETER_BINDING_ERROR_TYPE__CALCULATED_VALUE, oldCalculatedValue, newCalculatedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculatedValue(CalculatedValueType newCalculatedValue) {
		if (newCalculatedValue != calculatedValue) {
			NotificationChain msgs = null;
			if (calculatedValue != null)
				msgs = ((InternalEObject)calculatedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CALCULATED_PATH_VALUE_PARAMETER_BINDING_ERROR_TYPE__CALCULATED_VALUE, null, msgs);
			if (newCalculatedValue != null)
				msgs = ((InternalEObject)newCalculatedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CALCULATED_PATH_VALUE_PARAMETER_BINDING_ERROR_TYPE__CALCULATED_VALUE, null, msgs);
			msgs = basicSetCalculatedValue(newCalculatedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CALCULATED_PATH_VALUE_PARAMETER_BINDING_ERROR_TYPE__CALCULATED_VALUE, newCalculatedValue, newCalculatedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CALCULATED_PATH_VALUE_PARAMETER_BINDING_ERROR_TYPE__CALCULATED_VALUE:
				return basicSetCalculatedValue(null, msgs);
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
			case CorePackage.CALCULATED_PATH_VALUE_PARAMETER_BINDING_ERROR_TYPE__CALCULATED_VALUE:
				return getCalculatedValue();
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
			case CorePackage.CALCULATED_PATH_VALUE_PARAMETER_BINDING_ERROR_TYPE__CALCULATED_VALUE:
				setCalculatedValue((CalculatedValueType)newValue);
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
			case CorePackage.CALCULATED_PATH_VALUE_PARAMETER_BINDING_ERROR_TYPE__CALCULATED_VALUE:
				setCalculatedValue((CalculatedValueType)null);
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
			case CorePackage.CALCULATED_PATH_VALUE_PARAMETER_BINDING_ERROR_TYPE__CALCULATED_VALUE:
				return calculatedValue != null;
		}
		return super.eIsSet(featureID);
	}

} //CalculatedPathValueParameterBindingErrorTypeImpl
