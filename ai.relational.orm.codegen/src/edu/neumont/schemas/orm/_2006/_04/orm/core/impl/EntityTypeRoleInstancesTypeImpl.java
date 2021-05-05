/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeRoleInstancesType;
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
 * An implementation of the model object '<em><b>Entity Type Role Instances Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.EntityTypeRoleInstancesTypeImpl#getEntityTypeRoleInstance <em>Entity Type Role Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityTypeRoleInstancesTypeImpl extends MinimalEObjectImpl.Container implements EntityTypeRoleInstancesType {
	/**
	 * The cached value of the '{@link #getEntityTypeRoleInstance() <em>Entity Type Role Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityTypeRoleInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectTypeRoleInstanceRef> entityTypeRoleInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTypeRoleInstancesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getEntityTypeRoleInstancesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectTypeRoleInstanceRef> getEntityTypeRoleInstance() {
		if (entityTypeRoleInstance == null) {
			entityTypeRoleInstance = new EObjectContainmentEList<ObjectTypeRoleInstanceRef>(ObjectTypeRoleInstanceRef.class, this, CorePackage.ENTITY_TYPE_ROLE_INSTANCES_TYPE__ENTITY_TYPE_ROLE_INSTANCE);
		}
		return entityTypeRoleInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ENTITY_TYPE_ROLE_INSTANCES_TYPE__ENTITY_TYPE_ROLE_INSTANCE:
				return ((InternalEList<?>)getEntityTypeRoleInstance()).basicRemove(otherEnd, msgs);
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
			case CorePackage.ENTITY_TYPE_ROLE_INSTANCES_TYPE__ENTITY_TYPE_ROLE_INSTANCE:
				return getEntityTypeRoleInstance();
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
			case CorePackage.ENTITY_TYPE_ROLE_INSTANCES_TYPE__ENTITY_TYPE_ROLE_INSTANCE:
				getEntityTypeRoleInstance().clear();
				getEntityTypeRoleInstance().addAll((Collection<? extends ObjectTypeRoleInstanceRef>)newValue);
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
			case CorePackage.ENTITY_TYPE_ROLE_INSTANCES_TYPE__ENTITY_TYPE_ROLE_INSTANCE:
				getEntityTypeRoleInstance().clear();
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
			case CorePackage.ENTITY_TYPE_ROLE_INSTANCES_TYPE__ENTITY_TYPE_ROLE_INSTANCE:
				return entityTypeRoleInstance != null && !entityTypeRoleInstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityTypeRoleInstancesTypeImpl
