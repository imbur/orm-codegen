/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.AggregationContextType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleRef;
import edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeRef;

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
 * An implementation of the model object '<em><b>Aggregation Context Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.AggregationContextTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.AggregationContextTypeImpl#getPathRoot <em>Path Root</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.AggregationContextTypeImpl#getPathedRole <em>Pathed Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AggregationContextTypeImpl extends MinimalEObjectImpl.Container implements AggregationContextType {
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
	protected AggregationContextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getAggregationContextType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.AGGREGATION_CONTEXT_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RootObjectTypeRef> getPathRoot() {
		return getGroup().list(CorePackage.eINSTANCE.getAggregationContextType_PathRoot());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathedRoleRef> getPathedRole() {
		return getGroup().list(CorePackage.eINSTANCE.getAggregationContextType_PathedRole());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.AGGREGATION_CONTEXT_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.AGGREGATION_CONTEXT_TYPE__PATH_ROOT:
				return ((InternalEList<?>)getPathRoot()).basicRemove(otherEnd, msgs);
			case CorePackage.AGGREGATION_CONTEXT_TYPE__PATHED_ROLE:
				return ((InternalEList<?>)getPathedRole()).basicRemove(otherEnd, msgs);
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
			case CorePackage.AGGREGATION_CONTEXT_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.AGGREGATION_CONTEXT_TYPE__PATH_ROOT:
				return getPathRoot();
			case CorePackage.AGGREGATION_CONTEXT_TYPE__PATHED_ROLE:
				return getPathedRole();
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
			case CorePackage.AGGREGATION_CONTEXT_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.AGGREGATION_CONTEXT_TYPE__PATH_ROOT:
				getPathRoot().clear();
				getPathRoot().addAll((Collection<? extends RootObjectTypeRef>)newValue);
				return;
			case CorePackage.AGGREGATION_CONTEXT_TYPE__PATHED_ROLE:
				getPathedRole().clear();
				getPathedRole().addAll((Collection<? extends PathedRoleRef>)newValue);
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
			case CorePackage.AGGREGATION_CONTEXT_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorePackage.AGGREGATION_CONTEXT_TYPE__PATH_ROOT:
				getPathRoot().clear();
				return;
			case CorePackage.AGGREGATION_CONTEXT_TYPE__PATHED_ROLE:
				getPathedRole().clear();
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
			case CorePackage.AGGREGATION_CONTEXT_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.AGGREGATION_CONTEXT_TYPE__PATH_ROOT:
				return !getPathRoot().isEmpty();
			case CorePackage.AGGREGATION_CONTEXT_TYPE__PATHED_ROLE:
				return !getPathedRole().isEmpty();
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

} //AggregationContextTypeImpl
