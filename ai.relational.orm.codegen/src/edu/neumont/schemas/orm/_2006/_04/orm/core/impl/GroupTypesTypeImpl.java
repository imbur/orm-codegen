/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.GroupTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.GroupTypesType;

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
 * An implementation of the model object '<em><b>Group Types Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GroupTypesTypeImpl#getGroupTypeGroup <em>Group Type Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GroupTypesTypeImpl#getGroupType <em>Group Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupTypesTypeImpl extends MinimalEObjectImpl.Container implements GroupTypesType {
	/**
	 * The cached value of the '{@link #getGroupTypeGroup() <em>Group Type Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupTypeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap groupTypeGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupTypesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getGroupTypesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroupTypeGroup() {
		if (groupTypeGroup == null) {
			groupTypeGroup = new BasicFeatureMap(this, CorePackage.GROUP_TYPES_TYPE__GROUP_TYPE_GROUP);
		}
		return groupTypeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GroupTypeType> getGroupType() {
		return getGroupTypeGroup().list(CorePackage.eINSTANCE.getGroupTypesType_GroupType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.GROUP_TYPES_TYPE__GROUP_TYPE_GROUP:
				return ((InternalEList<?>)getGroupTypeGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.GROUP_TYPES_TYPE__GROUP_TYPE:
				return ((InternalEList<?>)getGroupType()).basicRemove(otherEnd, msgs);
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
			case CorePackage.GROUP_TYPES_TYPE__GROUP_TYPE_GROUP:
				if (coreType) return getGroupTypeGroup();
				return ((FeatureMap.Internal)getGroupTypeGroup()).getWrapper();
			case CorePackage.GROUP_TYPES_TYPE__GROUP_TYPE:
				return getGroupType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.GROUP_TYPES_TYPE__GROUP_TYPE_GROUP:
				((FeatureMap.Internal)getGroupTypeGroup()).set(newValue);
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
			case CorePackage.GROUP_TYPES_TYPE__GROUP_TYPE_GROUP:
				getGroupTypeGroup().clear();
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
			case CorePackage.GROUP_TYPES_TYPE__GROUP_TYPE_GROUP:
				return groupTypeGroup != null && !groupTypeGroup.isEmpty();
			case CorePackage.GROUP_TYPES_TYPE__GROUP_TYPE:
				return !getGroupType().isEmpty();
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
		result.append(" (groupTypeGroup: ");
		result.append(groupTypeGroup);
		result.append(')');
		return result.toString();
	}

} //GroupTypesTypeImpl
