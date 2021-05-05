/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeInstanceType;
import edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeInstancesType;
import edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeSubtypeInstanceType;

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
 * An implementation of the model object '<em><b>Entity Type Instances Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.EntityTypeInstancesTypeImpl#getEntityTypeInstance <em>Entity Type Instance</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.EntityTypeInstancesTypeImpl#getEntityTypeSubtypeInstance <em>Entity Type Subtype Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityTypeInstancesTypeImpl extends MinimalEObjectImpl.Container implements EntityTypeInstancesType {
	/**
	 * The cached value of the '{@link #getEntityTypeInstance() <em>Entity Type Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityTypeInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityTypeInstanceType> entityTypeInstance;

	/**
	 * The cached value of the '{@link #getEntityTypeSubtypeInstance() <em>Entity Type Subtype Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityTypeSubtypeInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityTypeSubtypeInstanceType> entityTypeSubtypeInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTypeInstancesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getEntityTypeInstancesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityTypeInstanceType> getEntityTypeInstance() {
		if (entityTypeInstance == null) {
			entityTypeInstance = new EObjectContainmentEList<EntityTypeInstanceType>(EntityTypeInstanceType.class, this, CorePackage.ENTITY_TYPE_INSTANCES_TYPE__ENTITY_TYPE_INSTANCE);
		}
		return entityTypeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityTypeSubtypeInstanceType> getEntityTypeSubtypeInstance() {
		if (entityTypeSubtypeInstance == null) {
			entityTypeSubtypeInstance = new EObjectContainmentEList<EntityTypeSubtypeInstanceType>(EntityTypeSubtypeInstanceType.class, this, CorePackage.ENTITY_TYPE_INSTANCES_TYPE__ENTITY_TYPE_SUBTYPE_INSTANCE);
		}
		return entityTypeSubtypeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ENTITY_TYPE_INSTANCES_TYPE__ENTITY_TYPE_INSTANCE:
				return ((InternalEList<?>)getEntityTypeInstance()).basicRemove(otherEnd, msgs);
			case CorePackage.ENTITY_TYPE_INSTANCES_TYPE__ENTITY_TYPE_SUBTYPE_INSTANCE:
				return ((InternalEList<?>)getEntityTypeSubtypeInstance()).basicRemove(otherEnd, msgs);
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
			case CorePackage.ENTITY_TYPE_INSTANCES_TYPE__ENTITY_TYPE_INSTANCE:
				return getEntityTypeInstance();
			case CorePackage.ENTITY_TYPE_INSTANCES_TYPE__ENTITY_TYPE_SUBTYPE_INSTANCE:
				return getEntityTypeSubtypeInstance();
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
			case CorePackage.ENTITY_TYPE_INSTANCES_TYPE__ENTITY_TYPE_INSTANCE:
				getEntityTypeInstance().clear();
				getEntityTypeInstance().addAll((Collection<? extends EntityTypeInstanceType>)newValue);
				return;
			case CorePackage.ENTITY_TYPE_INSTANCES_TYPE__ENTITY_TYPE_SUBTYPE_INSTANCE:
				getEntityTypeSubtypeInstance().clear();
				getEntityTypeSubtypeInstance().addAll((Collection<? extends EntityTypeSubtypeInstanceType>)newValue);
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
			case CorePackage.ENTITY_TYPE_INSTANCES_TYPE__ENTITY_TYPE_INSTANCE:
				getEntityTypeInstance().clear();
				return;
			case CorePackage.ENTITY_TYPE_INSTANCES_TYPE__ENTITY_TYPE_SUBTYPE_INSTANCE:
				getEntityTypeSubtypeInstance().clear();
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
			case CorePackage.ENTITY_TYPE_INSTANCES_TYPE__ENTITY_TYPE_INSTANCE:
				return entityTypeInstance != null && !entityTypeInstance.isEmpty();
			case CorePackage.ENTITY_TYPE_INSTANCES_TYPE__ENTITY_TYPE_SUBTYPE_INSTANCE:
				return entityTypeSubtypeInstance != null && !entityTypeSubtypeInstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EntityTypeInstancesTypeImpl
