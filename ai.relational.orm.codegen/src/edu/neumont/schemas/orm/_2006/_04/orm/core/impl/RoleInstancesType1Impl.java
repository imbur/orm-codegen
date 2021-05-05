/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleInstanceType;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleInstancesType1;

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
 * An implementation of the model object '<em><b>Role Instances Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleInstancesType1Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleInstancesType1Impl#getEntityTypeRoleInstance <em>Entity Type Role Instance</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleInstancesType1Impl#getValueTypeRoleInstance <em>Value Type Role Instance</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleInstancesType1Impl#getFactTypeRoleInstance <em>Fact Type Role Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleInstancesType1Impl extends MinimalEObjectImpl.Container implements RoleInstancesType1 {
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
	protected RoleInstancesType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getRoleInstancesType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.ROLE_INSTANCES_TYPE1__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleInstanceType> getEntityTypeRoleInstance() {
		return getGroup().list(CorePackage.eINSTANCE.getRoleInstancesType1_EntityTypeRoleInstance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleInstanceType> getValueTypeRoleInstance() {
		return getGroup().list(CorePackage.eINSTANCE.getRoleInstancesType1_ValueTypeRoleInstance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleInstanceType> getFactTypeRoleInstance() {
		return getGroup().list(CorePackage.eINSTANCE.getRoleInstancesType1_FactTypeRoleInstance());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ROLE_INSTANCES_TYPE1__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.ROLE_INSTANCES_TYPE1__ENTITY_TYPE_ROLE_INSTANCE:
				return ((InternalEList<?>)getEntityTypeRoleInstance()).basicRemove(otherEnd, msgs);
			case CorePackage.ROLE_INSTANCES_TYPE1__VALUE_TYPE_ROLE_INSTANCE:
				return ((InternalEList<?>)getValueTypeRoleInstance()).basicRemove(otherEnd, msgs);
			case CorePackage.ROLE_INSTANCES_TYPE1__FACT_TYPE_ROLE_INSTANCE:
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
			case CorePackage.ROLE_INSTANCES_TYPE1__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.ROLE_INSTANCES_TYPE1__ENTITY_TYPE_ROLE_INSTANCE:
				return getEntityTypeRoleInstance();
			case CorePackage.ROLE_INSTANCES_TYPE1__VALUE_TYPE_ROLE_INSTANCE:
				return getValueTypeRoleInstance();
			case CorePackage.ROLE_INSTANCES_TYPE1__FACT_TYPE_ROLE_INSTANCE:
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
			case CorePackage.ROLE_INSTANCES_TYPE1__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.ROLE_INSTANCES_TYPE1__ENTITY_TYPE_ROLE_INSTANCE:
				getEntityTypeRoleInstance().clear();
				getEntityTypeRoleInstance().addAll((Collection<? extends RoleInstanceType>)newValue);
				return;
			case CorePackage.ROLE_INSTANCES_TYPE1__VALUE_TYPE_ROLE_INSTANCE:
				getValueTypeRoleInstance().clear();
				getValueTypeRoleInstance().addAll((Collection<? extends RoleInstanceType>)newValue);
				return;
			case CorePackage.ROLE_INSTANCES_TYPE1__FACT_TYPE_ROLE_INSTANCE:
				getFactTypeRoleInstance().clear();
				getFactTypeRoleInstance().addAll((Collection<? extends RoleInstanceType>)newValue);
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
			case CorePackage.ROLE_INSTANCES_TYPE1__GROUP:
				getGroup().clear();
				return;
			case CorePackage.ROLE_INSTANCES_TYPE1__ENTITY_TYPE_ROLE_INSTANCE:
				getEntityTypeRoleInstance().clear();
				return;
			case CorePackage.ROLE_INSTANCES_TYPE1__VALUE_TYPE_ROLE_INSTANCE:
				getValueTypeRoleInstance().clear();
				return;
			case CorePackage.ROLE_INSTANCES_TYPE1__FACT_TYPE_ROLE_INSTANCE:
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
			case CorePackage.ROLE_INSTANCES_TYPE1__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.ROLE_INSTANCES_TYPE1__ENTITY_TYPE_ROLE_INSTANCE:
				return !getEntityTypeRoleInstance().isEmpty();
			case CorePackage.ROLE_INSTANCES_TYPE1__VALUE_TYPE_ROLE_INSTANCE:
				return !getValueTypeRoleInstance().isEmpty();
			case CorePackage.ROLE_INSTANCES_TYPE1__FACT_TYPE_ROLE_INSTANCE:
				return !getFactTypeRoleInstance().isEmpty();
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

} //RoleInstancesType1Impl
