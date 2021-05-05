/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType1;
import edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValuesType1;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculated Values Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CalculatedValuesType1Impl#getCalculatedValue <em>Calculated Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculatedValuesType1Impl extends MinimalEObjectImpl.Container implements CalculatedValuesType1 {
	/**
	 * The cached value of the '{@link #getCalculatedValue() <em>Calculated Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculatedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<CalculatedValueType1> calculatedValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculatedValuesType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getCalculatedValuesType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CalculatedValueType1> getCalculatedValue() {
		if (calculatedValue == null) {
			calculatedValue = new EObjectContainmentEList<CalculatedValueType1>(CalculatedValueType1.class, this, CorePackage.CALCULATED_VALUES_TYPE1__CALCULATED_VALUE);
		}
		return calculatedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CALCULATED_VALUES_TYPE1__CALCULATED_VALUE:
				return ((InternalEList<?>)getCalculatedValue()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CALCULATED_VALUES_TYPE1__CALCULATED_VALUE:
				return getCalculatedValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.CALCULATED_VALUES_TYPE1__CALCULATED_VALUE:
				getCalculatedValue().clear();
				getCalculatedValue().addAll((Collection<? extends CalculatedValueType1>)newValue);
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
			case CorePackage.CALCULATED_VALUES_TYPE1__CALCULATED_VALUE:
				getCalculatedValue().clear();
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
			case CorePackage.CALCULATED_VALUES_TYPE1__CALCULATED_VALUE:
				return calculatedValue != null && !calculatedValue.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CalculatedValuesType1Impl
