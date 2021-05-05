/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypesType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeType;

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
 * An implementation of the model object '<em><b>Object Types Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectTypesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectTypesTypeImpl#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectTypesTypeImpl#getObjectifiedType <em>Objectified Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectTypesTypeImpl#getValueType <em>Value Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectTypesTypeImpl extends MinimalEObjectImpl.Container implements ObjectTypesType {
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
	protected ObjectTypesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getObjectTypesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.OBJECT_TYPES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityTypeType> getEntityType() {
		return getGroup().list(CorePackage.eINSTANCE.getObjectTypesType_EntityType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectifiedTypeType> getObjectifiedType() {
		return getGroup().list(CorePackage.eINSTANCE.getObjectTypesType_ObjectifiedType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueTypeType> getValueType() {
		return getGroup().list(CorePackage.eINSTANCE.getObjectTypesType_ValueType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.OBJECT_TYPES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.OBJECT_TYPES_TYPE__ENTITY_TYPE:
				return ((InternalEList<?>)getEntityType()).basicRemove(otherEnd, msgs);
			case CorePackage.OBJECT_TYPES_TYPE__OBJECTIFIED_TYPE:
				return ((InternalEList<?>)getObjectifiedType()).basicRemove(otherEnd, msgs);
			case CorePackage.OBJECT_TYPES_TYPE__VALUE_TYPE:
				return ((InternalEList<?>)getValueType()).basicRemove(otherEnd, msgs);
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
			case CorePackage.OBJECT_TYPES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.OBJECT_TYPES_TYPE__ENTITY_TYPE:
				return getEntityType();
			case CorePackage.OBJECT_TYPES_TYPE__OBJECTIFIED_TYPE:
				return getObjectifiedType();
			case CorePackage.OBJECT_TYPES_TYPE__VALUE_TYPE:
				return getValueType();
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
			case CorePackage.OBJECT_TYPES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.OBJECT_TYPES_TYPE__ENTITY_TYPE:
				getEntityType().clear();
				getEntityType().addAll((Collection<? extends EntityTypeType>)newValue);
				return;
			case CorePackage.OBJECT_TYPES_TYPE__OBJECTIFIED_TYPE:
				getObjectifiedType().clear();
				getObjectifiedType().addAll((Collection<? extends ObjectifiedTypeType>)newValue);
				return;
			case CorePackage.OBJECT_TYPES_TYPE__VALUE_TYPE:
				getValueType().clear();
				getValueType().addAll((Collection<? extends ValueTypeType>)newValue);
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
			case CorePackage.OBJECT_TYPES_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorePackage.OBJECT_TYPES_TYPE__ENTITY_TYPE:
				getEntityType().clear();
				return;
			case CorePackage.OBJECT_TYPES_TYPE__OBJECTIFIED_TYPE:
				getObjectifiedType().clear();
				return;
			case CorePackage.OBJECT_TYPES_TYPE__VALUE_TYPE:
				getValueType().clear();
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
			case CorePackage.OBJECT_TYPES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.OBJECT_TYPES_TYPE__ENTITY_TYPE:
				return !getEntityType().isEmpty();
			case CorePackage.OBJECT_TYPES_TYPE__OBJECTIFIED_TYPE:
				return !getObjectifiedType().isEmpty();
			case CorePackage.OBJECT_TYPES_TYPE__VALUE_TYPE:
				return !getValueType().isEmpty();
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

} //ObjectTypesTypeImpl
