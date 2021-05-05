/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRoleInstancesType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRoleInstanceRef;

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
 * An implementation of the model object '<em><b>Fact Type Role Instances Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeRoleInstancesTypeImpl#getFactTypeRoleInstance <em>Fact Type Role Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactTypeRoleInstancesTypeImpl extends MinimalEObjectImpl.Container implements FactTypeRoleInstancesType {
	/**
	 * The cached value of the '{@link #getFactTypeRoleInstance() <em>Fact Type Role Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactTypeRoleInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectTypeRoleInstanceRef> factTypeRoleInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactTypeRoleInstancesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getFactTypeRoleInstancesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectTypeRoleInstanceRef> getFactTypeRoleInstance() {
		if (factTypeRoleInstance == null) {
			factTypeRoleInstance = new EObjectContainmentEList<ObjectTypeRoleInstanceRef>(ObjectTypeRoleInstanceRef.class, this, CorePackage.FACT_TYPE_ROLE_INSTANCES_TYPE__FACT_TYPE_ROLE_INSTANCE);
		}
		return factTypeRoleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FACT_TYPE_ROLE_INSTANCES_TYPE__FACT_TYPE_ROLE_INSTANCE:
				return ((InternalEList<?>)getFactTypeRoleInstance()).basicRemove(otherEnd, msgs);
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
			case CorePackage.FACT_TYPE_ROLE_INSTANCES_TYPE__FACT_TYPE_ROLE_INSTANCE:
				return getFactTypeRoleInstance();
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
			case CorePackage.FACT_TYPE_ROLE_INSTANCES_TYPE__FACT_TYPE_ROLE_INSTANCE:
				getFactTypeRoleInstance().clear();
				getFactTypeRoleInstance().addAll((Collection<? extends ObjectTypeRoleInstanceRef>)newValue);
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
			case CorePackage.FACT_TYPE_ROLE_INSTANCES_TYPE__FACT_TYPE_ROLE_INSTANCE:
				getFactTypeRoleInstance().clear();
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
			case CorePackage.FACT_TYPE_ROLE_INSTANCES_TYPE__FACT_TYPE_ROLE_INSTANCE:
				return factTypeRoleInstance != null && !factTypeRoleInstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FactTypeRoleInstancesTypeImpl
