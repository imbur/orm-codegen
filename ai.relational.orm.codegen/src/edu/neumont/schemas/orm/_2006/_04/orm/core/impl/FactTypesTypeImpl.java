/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypesType;
import edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType;

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
 * An implementation of the model object '<em><b>Fact Types Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypesTypeImpl#getFact <em>Fact</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypesTypeImpl#getSubtypeFact <em>Subtype Fact</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypesTypeImpl#getImpliedFact <em>Implied Fact</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactTypesTypeImpl extends MinimalEObjectImpl.Container implements FactTypesType {
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
	protected FactTypesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getFactTypesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.FACT_TYPES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FactTypeType> getFact() {
		return getGroup().list(CorePackage.eINSTANCE.getFactTypesType_Fact());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubtypeFactTypeType> getSubtypeFact() {
		return getGroup().list(CorePackage.eINSTANCE.getFactTypesType_SubtypeFact());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImpliedFactTypeType> getImpliedFact() {
		return getGroup().list(CorePackage.eINSTANCE.getFactTypesType_ImpliedFact());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FACT_TYPES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.FACT_TYPES_TYPE__FACT:
				return ((InternalEList<?>)getFact()).basicRemove(otherEnd, msgs);
			case CorePackage.FACT_TYPES_TYPE__SUBTYPE_FACT:
				return ((InternalEList<?>)getSubtypeFact()).basicRemove(otherEnd, msgs);
			case CorePackage.FACT_TYPES_TYPE__IMPLIED_FACT:
				return ((InternalEList<?>)getImpliedFact()).basicRemove(otherEnd, msgs);
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
			case CorePackage.FACT_TYPES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.FACT_TYPES_TYPE__FACT:
				return getFact();
			case CorePackage.FACT_TYPES_TYPE__SUBTYPE_FACT:
				return getSubtypeFact();
			case CorePackage.FACT_TYPES_TYPE__IMPLIED_FACT:
				return getImpliedFact();
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
			case CorePackage.FACT_TYPES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.FACT_TYPES_TYPE__FACT:
				getFact().clear();
				getFact().addAll((Collection<? extends FactTypeType>)newValue);
				return;
			case CorePackage.FACT_TYPES_TYPE__SUBTYPE_FACT:
				getSubtypeFact().clear();
				getSubtypeFact().addAll((Collection<? extends SubtypeFactTypeType>)newValue);
				return;
			case CorePackage.FACT_TYPES_TYPE__IMPLIED_FACT:
				getImpliedFact().clear();
				getImpliedFact().addAll((Collection<? extends ImpliedFactTypeType>)newValue);
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
			case CorePackage.FACT_TYPES_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorePackage.FACT_TYPES_TYPE__FACT:
				getFact().clear();
				return;
			case CorePackage.FACT_TYPES_TYPE__SUBTYPE_FACT:
				getSubtypeFact().clear();
				return;
			case CorePackage.FACT_TYPES_TYPE__IMPLIED_FACT:
				getImpliedFact().clear();
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
			case CorePackage.FACT_TYPES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.FACT_TYPES_TYPE__FACT:
				return !getFact().isEmpty();
			case CorePackage.FACT_TYPES_TYPE__SUBTYPE_FACT:
				return !getSubtypeFact().isEmpty();
			case CorePackage.FACT_TYPES_TYPE__IMPLIED_FACT:
				return !getImpliedFact().isEmpty();
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

} //FactTypesTypeImpl
