/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRoleInstanceRef;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleInstancesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Instances Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleInstancesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleInstancesTypeImpl#getFactTypeRoleInstance <em>Fact Type Role Instance</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleInstancesTypeImpl#getEntityTypeRoleInstance <em>Entity Type Role Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleInstancesTypeImpl extends MinimalEObjectImpl.Container implements RoleInstancesType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleInstancesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getRoleInstancesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.ROLE_INSTANCES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectTypeRoleInstanceRef> getFactTypeRoleInstance() {
		return getGroup().list(CorePackage.eINSTANCE.getRoleInstancesType_FactTypeRoleInstance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectTypeRoleInstanceRef> getEntityTypeRoleInstance() {
		return getGroup().list(CorePackage.eINSTANCE.getRoleInstancesType_EntityTypeRoleInstance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ROLE_INSTANCES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.ROLE_INSTANCES_TYPE__FACT_TYPE_ROLE_INSTANCE:
				return ((InternalEList<?>)getFactTypeRoleInstance()).basicRemove(otherEnd, msgs);
			case CorePackage.ROLE_INSTANCES_TYPE__ENTITY_TYPE_ROLE_INSTANCE:
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
			case CorePackage.ROLE_INSTANCES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.ROLE_INSTANCES_TYPE__FACT_TYPE_ROLE_INSTANCE:
				return getFactTypeRoleInstance();
			case CorePackage.ROLE_INSTANCES_TYPE__ENTITY_TYPE_ROLE_INSTANCE:
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
			case CorePackage.ROLE_INSTANCES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.ROLE_INSTANCES_TYPE__FACT_TYPE_ROLE_INSTANCE:
				getFactTypeRoleInstance().clear();
				getFactTypeRoleInstance().addAll((Collection<? extends ObjectTypeRoleInstanceRef>)newValue);
				return;
			case CorePackage.ROLE_INSTANCES_TYPE__ENTITY_TYPE_ROLE_INSTANCE:
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
			case CorePackage.ROLE_INSTANCES_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorePackage.ROLE_INSTANCES_TYPE__FACT_TYPE_ROLE_INSTANCE:
				getFactTypeRoleInstance().clear();
				return;
			case CorePackage.ROLE_INSTANCES_TYPE__ENTITY_TYPE_ROLE_INSTANCE:
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
			case CorePackage.ROLE_INSTANCES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.ROLE_INSTANCES_TYPE__FACT_TYPE_ROLE_INSTANCE:
				return !getFactTypeRoleInstance().isEmpty();
			case CorePackage.ROLE_INSTANCES_TYPE__ENTITY_TYPE_ROLE_INSTANCE:
				return !getEntityTypeRoleInstance().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //RoleInstancesTypeImpl
