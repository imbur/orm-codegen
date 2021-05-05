/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.GroupRef;
import edu.neumont.schemas.orm._2006._04.orm.core.NestedGroupsType;

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
 * An implementation of the model object '<em><b>Nested Groups Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.NestedGroupsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.NestedGroupsTypeImpl#getIncludedGroup <em>Included Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.NestedGroupsTypeImpl#getExcludedGroup <em>Excluded Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NestedGroupsTypeImpl extends MinimalEObjectImpl.Container implements NestedGroupsType {
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
	protected NestedGroupsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getNestedGroupsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.NESTED_GROUPS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupRef> getIncludedGroup() {
		return getGroup().list(CorePackage.eINSTANCE.getNestedGroupsType_IncludedGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupRef> getExcludedGroup() {
		return getGroup().list(CorePackage.eINSTANCE.getNestedGroupsType_ExcludedGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.NESTED_GROUPS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.NESTED_GROUPS_TYPE__INCLUDED_GROUP:
				return ((InternalEList<?>)getIncludedGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.NESTED_GROUPS_TYPE__EXCLUDED_GROUP:
				return ((InternalEList<?>)getExcludedGroup()).basicRemove(otherEnd, msgs);
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
			case CorePackage.NESTED_GROUPS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.NESTED_GROUPS_TYPE__INCLUDED_GROUP:
				return getIncludedGroup();
			case CorePackage.NESTED_GROUPS_TYPE__EXCLUDED_GROUP:
				return getExcludedGroup();
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
			case CorePackage.NESTED_GROUPS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.NESTED_GROUPS_TYPE__INCLUDED_GROUP:
				getIncludedGroup().clear();
				getIncludedGroup().addAll((Collection<? extends GroupRef>)newValue);
				return;
			case CorePackage.NESTED_GROUPS_TYPE__EXCLUDED_GROUP:
				getExcludedGroup().clear();
				getExcludedGroup().addAll((Collection<? extends GroupRef>)newValue);
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
			case CorePackage.NESTED_GROUPS_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorePackage.NESTED_GROUPS_TYPE__INCLUDED_GROUP:
				getIncludedGroup().clear();
				return;
			case CorePackage.NESTED_GROUPS_TYPE__EXCLUDED_GROUP:
				getExcludedGroup().clear();
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
			case CorePackage.NESTED_GROUPS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.NESTED_GROUPS_TYPE__INCLUDED_GROUP:
				return !getIncludedGroup().isEmpty();
			case CorePackage.NESTED_GROUPS_TYPE__EXCLUDED_GROUP:
				return !getExcludedGroup().isEmpty();
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

} //NestedGroupsTypeImpl
