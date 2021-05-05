/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstanceType;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstancesType;

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
 * An implementation of the model object '<em><b>Fact Type Instances Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeInstancesTypeImpl#getFactTypeInstance <em>Fact Type Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactTypeInstancesTypeImpl extends MinimalEObjectImpl.Container implements FactTypeInstancesType {
	/**
	 * The cached value of the '{@link #getFactTypeInstance() <em>Fact Type Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactTypeInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<FactTypeInstanceType> factTypeInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactTypeInstancesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getFactTypeInstancesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FactTypeInstanceType> getFactTypeInstance() {
		if (factTypeInstance == null) {
			factTypeInstance = new EObjectContainmentEList<FactTypeInstanceType>(FactTypeInstanceType.class, this, CorePackage.FACT_TYPE_INSTANCES_TYPE__FACT_TYPE_INSTANCE);
		}
		return factTypeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FACT_TYPE_INSTANCES_TYPE__FACT_TYPE_INSTANCE:
				return ((InternalEList<?>)getFactTypeInstance()).basicRemove(otherEnd, msgs);
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
			case CorePackage.FACT_TYPE_INSTANCES_TYPE__FACT_TYPE_INSTANCE:
				return getFactTypeInstance();
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
			case CorePackage.FACT_TYPE_INSTANCES_TYPE__FACT_TYPE_INSTANCE:
				getFactTypeInstance().clear();
				getFactTypeInstance().addAll((Collection<? extends FactTypeInstanceType>)newValue);
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
			case CorePackage.FACT_TYPE_INSTANCES_TYPE__FACT_TYPE_INSTANCE:
				getFactTypeInstance().clear();
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
			case CorePackage.FACT_TYPE_INSTANCES_TYPE__FACT_TYPE_INSTANCE:
				return factTypeInstance != null && !factTypeInstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FactTypeInstancesTypeImpl
