/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueRef;
import edu.neumont.schemas.orm._2006._04.orm.core.ConditionsType;
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
 * An implementation of the model object '<em><b>Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConditionsTypeImpl#getCalculatedCondition <em>Calculated Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionsTypeImpl extends MinimalEObjectImpl.Container implements ConditionsType {
	/**
	 * The cached value of the '{@link #getCalculatedCondition() <em>Calculated Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculatedCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<CalculatedValueRef> calculatedCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getConditionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CalculatedValueRef> getCalculatedCondition() {
		if (calculatedCondition == null) {
			calculatedCondition = new EObjectContainmentEList<CalculatedValueRef>(CalculatedValueRef.class, this, CorePackage.CONDITIONS_TYPE__CALCULATED_CONDITION);
		}
		return calculatedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CONDITIONS_TYPE__CALCULATED_CONDITION:
				return ((InternalEList<?>)getCalculatedCondition()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CONDITIONS_TYPE__CALCULATED_CONDITION:
				return getCalculatedCondition();
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
			case CorePackage.CONDITIONS_TYPE__CALCULATED_CONDITION:
				getCalculatedCondition().clear();
				getCalculatedCondition().addAll((Collection<? extends CalculatedValueRef>)newValue);
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
			case CorePackage.CONDITIONS_TYPE__CALCULATED_CONDITION:
				getCalculatedCondition().clear();
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
			case CorePackage.CONDITIONS_TYPE__CALCULATED_CONDITION:
				return calculatedCondition != null && !calculatedCondition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionsTypeImpl
