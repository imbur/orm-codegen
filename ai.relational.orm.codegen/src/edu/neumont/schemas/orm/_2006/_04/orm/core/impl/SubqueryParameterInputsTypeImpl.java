/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.SubqueryParameterInputsForType;
import edu.neumont.schemas.orm._2006._04.orm.core.SubqueryParameterInputsType;

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
 * An implementation of the model object '<em><b>Subquery Parameter Inputs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SubqueryParameterInputsTypeImpl#getSubqueryParameterInputsFor <em>Subquery Parameter Inputs For</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubqueryParameterInputsTypeImpl extends MinimalEObjectImpl.Container implements SubqueryParameterInputsType {
	/**
	 * The cached value of the '{@link #getSubqueryParameterInputsFor() <em>Subquery Parameter Inputs For</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubqueryParameterInputsFor()
	 * @generated
	 * @ordered
	 */
	protected EList<SubqueryParameterInputsForType> subqueryParameterInputsFor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubqueryParameterInputsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getSubqueryParameterInputsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubqueryParameterInputsForType> getSubqueryParameterInputsFor() {
		if (subqueryParameterInputsFor == null) {
			subqueryParameterInputsFor = new EObjectContainmentEList<SubqueryParameterInputsForType>(SubqueryParameterInputsForType.class, this, CorePackage.SUBQUERY_PARAMETER_INPUTS_TYPE__SUBQUERY_PARAMETER_INPUTS_FOR);
		}
		return subqueryParameterInputsFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SUBQUERY_PARAMETER_INPUTS_TYPE__SUBQUERY_PARAMETER_INPUTS_FOR:
				return ((InternalEList<?>)getSubqueryParameterInputsFor()).basicRemove(otherEnd, msgs);
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
			case CorePackage.SUBQUERY_PARAMETER_INPUTS_TYPE__SUBQUERY_PARAMETER_INPUTS_FOR:
				return getSubqueryParameterInputsFor();
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
			case CorePackage.SUBQUERY_PARAMETER_INPUTS_TYPE__SUBQUERY_PARAMETER_INPUTS_FOR:
				getSubqueryParameterInputsFor().clear();
				getSubqueryParameterInputsFor().addAll((Collection<? extends SubqueryParameterInputsForType>)newValue);
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
			case CorePackage.SUBQUERY_PARAMETER_INPUTS_TYPE__SUBQUERY_PARAMETER_INPUTS_FOR:
				getSubqueryParameterInputsFor().clear();
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
			case CorePackage.SUBQUERY_PARAMETER_INPUTS_TYPE__SUBQUERY_PARAMETER_INPUTS_FOR:
				return subqueryParameterInputsFor != null && !subqueryParameterInputsFor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubqueryParameterInputsTypeImpl
