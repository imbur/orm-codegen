/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterBindingType;
import edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterBindingsType;

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
 * An implementation of the model object '<em><b>Query Parameter Bindings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.QueryParameterBindingsTypeImpl#getParameterBinding <em>Parameter Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryParameterBindingsTypeImpl extends MinimalEObjectImpl.Container implements QueryParameterBindingsType {
	/**
	 * The cached value of the '{@link #getParameterBinding() <em>Parameter Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryParameterBindingType> parameterBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryParameterBindingsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getQueryParameterBindingsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryParameterBindingType> getParameterBinding() {
		if (parameterBinding == null) {
			parameterBinding = new EObjectContainmentEList<QueryParameterBindingType>(QueryParameterBindingType.class, this, CorePackage.QUERY_PARAMETER_BINDINGS_TYPE__PARAMETER_BINDING);
		}
		return parameterBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.QUERY_PARAMETER_BINDINGS_TYPE__PARAMETER_BINDING:
				return ((InternalEList<?>)getParameterBinding()).basicRemove(otherEnd, msgs);
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
			case CorePackage.QUERY_PARAMETER_BINDINGS_TYPE__PARAMETER_BINDING:
				return getParameterBinding();
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
			case CorePackage.QUERY_PARAMETER_BINDINGS_TYPE__PARAMETER_BINDING:
				getParameterBinding().clear();
				getParameterBinding().addAll((Collection<? extends QueryParameterBindingType>)newValue);
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
			case CorePackage.QUERY_PARAMETER_BINDINGS_TYPE__PARAMETER_BINDING:
				getParameterBinding().clear();
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
			case CorePackage.QUERY_PARAMETER_BINDINGS_TYPE__PARAMETER_BINDING:
				return parameterBinding != null && !parameterBinding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QueryParameterBindingsTypeImpl
