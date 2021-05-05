/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType2;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.SetComparisonConstraintRef;

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
 * An implementation of the model object '<em><b>Constraints Type2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsType2Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsType2Impl#getExclusionConstraintThatContradictsWithSubset <em>Exclusion Constraint That Contradicts With Subset</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsType2Impl#getSubsetConstraint <em>Subset Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintsType2Impl extends MinimalEObjectImpl.Container implements ConstraintsType2 {
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
	protected ConstraintsType2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getConstraintsType2();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.CONSTRAINTS_TYPE2__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetComparisonConstraintRef> getExclusionConstraintThatContradictsWithSubset() {
		return getGroup().list(CorePackage.eINSTANCE.getConstraintsType2_ExclusionConstraintThatContradictsWithSubset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetComparisonConstraintRef> getSubsetConstraint() {
		return getGroup().list(CorePackage.eINSTANCE.getConstraintsType2_SubsetConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CONSTRAINTS_TYPE2__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.CONSTRAINTS_TYPE2__EXCLUSION_CONSTRAINT_THAT_CONTRADICTS_WITH_SUBSET:
				return ((InternalEList<?>)getExclusionConstraintThatContradictsWithSubset()).basicRemove(otherEnd, msgs);
			case CorePackage.CONSTRAINTS_TYPE2__SUBSET_CONSTRAINT:
				return ((InternalEList<?>)getSubsetConstraint()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CONSTRAINTS_TYPE2__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.CONSTRAINTS_TYPE2__EXCLUSION_CONSTRAINT_THAT_CONTRADICTS_WITH_SUBSET:
				return getExclusionConstraintThatContradictsWithSubset();
			case CorePackage.CONSTRAINTS_TYPE2__SUBSET_CONSTRAINT:
				return getSubsetConstraint();
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
			case CorePackage.CONSTRAINTS_TYPE2__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.CONSTRAINTS_TYPE2__EXCLUSION_CONSTRAINT_THAT_CONTRADICTS_WITH_SUBSET:
				getExclusionConstraintThatContradictsWithSubset().clear();
				getExclusionConstraintThatContradictsWithSubset().addAll((Collection<? extends SetComparisonConstraintRef>)newValue);
				return;
			case CorePackage.CONSTRAINTS_TYPE2__SUBSET_CONSTRAINT:
				getSubsetConstraint().clear();
				getSubsetConstraint().addAll((Collection<? extends SetComparisonConstraintRef>)newValue);
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
			case CorePackage.CONSTRAINTS_TYPE2__GROUP:
				getGroup().clear();
				return;
			case CorePackage.CONSTRAINTS_TYPE2__EXCLUSION_CONSTRAINT_THAT_CONTRADICTS_WITH_SUBSET:
				getExclusionConstraintThatContradictsWithSubset().clear();
				return;
			case CorePackage.CONSTRAINTS_TYPE2__SUBSET_CONSTRAINT:
				getSubsetConstraint().clear();
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
			case CorePackage.CONSTRAINTS_TYPE2__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.CONSTRAINTS_TYPE2__EXCLUSION_CONSTRAINT_THAT_CONTRADICTS_WITH_SUBSET:
				return !getExclusionConstraintThatContradictsWithSubset().isEmpty();
			case CorePackage.CONSTRAINTS_TYPE2__SUBSET_CONSTRAINT:
				return !getSubsetConstraint().isEmpty();
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

} //ConstraintsType2Impl
