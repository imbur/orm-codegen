/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.InstancesType;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeInstanceType;

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
 * An implementation of the model object '<em><b>Instances Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.InstancesTypeImpl#getValueTypeInstance <em>Value Type Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstancesTypeImpl extends MinimalEObjectImpl.Container implements InstancesType {
	/**
	 * The cached value of the '{@link #getValueTypeInstance() <em>Value Type Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTypeInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueTypeInstanceType> valueTypeInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstancesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getInstancesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueTypeInstanceType> getValueTypeInstance() {
		if (valueTypeInstance == null) {
			valueTypeInstance = new EObjectContainmentEList<ValueTypeInstanceType>(ValueTypeInstanceType.class, this, CorePackage.INSTANCES_TYPE__VALUE_TYPE_INSTANCE);
		}
		return valueTypeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.INSTANCES_TYPE__VALUE_TYPE_INSTANCE:
				return ((InternalEList<?>)getValueTypeInstance()).basicRemove(otherEnd, msgs);
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
			case CorePackage.INSTANCES_TYPE__VALUE_TYPE_INSTANCE:
				return getValueTypeInstance();
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
			case CorePackage.INSTANCES_TYPE__VALUE_TYPE_INSTANCE:
				getValueTypeInstance().clear();
				getValueTypeInstance().addAll((Collection<? extends ValueTypeInstanceType>)newValue);
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
			case CorePackage.INSTANCES_TYPE__VALUE_TYPE_INSTANCE:
				getValueTypeInstance().clear();
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
			case CorePackage.INSTANCES_TYPE__VALUE_TYPE_INSTANCE:
				return valueTypeInstance != null && !valueTypeInstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InstancesTypeImpl
