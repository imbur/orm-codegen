/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType5;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.EqualityConstraintType;
import edu.neumont.schemas.orm._2006._04.orm.core.ExclusionConstraintType;
import edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintType;
import edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType;
import edu.neumont.schemas.orm._2006._04.orm.core.RingConstraintType;
import edu.neumont.schemas.orm._2006._04.orm.core.SubsetConstraintType;
import edu.neumont.schemas.orm._2006._04.orm.core.UniquenessConstraintType;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonConstraintType;

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
 * An implementation of the model object '<em><b>Constraints Type5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsType5Impl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsType5Impl#getEqualityConstraint <em>Equality Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsType5Impl#getExclusionConstraint <em>Exclusion Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsType5Impl#getSubsetConstraint <em>Subset Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsType5Impl#getFrequencyConstraint <em>Frequency Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsType5Impl#getMandatoryConstraint <em>Mandatory Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsType5Impl#getUniquenessConstraint <em>Uniqueness Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsType5Impl#getRingConstraint <em>Ring Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsType5Impl#getValueComparisonConstraint <em>Value Comparison Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintsType5Impl extends MinimalEObjectImpl.Container implements ConstraintsType5 {
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
	protected ConstraintsType5Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getConstraintsType5();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.CONSTRAINTS_TYPE5__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EqualityConstraintType> getEqualityConstraint() {
		return getGroup().list(CorePackage.eINSTANCE.getConstraintsType5_EqualityConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExclusionConstraintType> getExclusionConstraint() {
		return getGroup().list(CorePackage.eINSTANCE.getConstraintsType5_ExclusionConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubsetConstraintType> getSubsetConstraint() {
		return getGroup().list(CorePackage.eINSTANCE.getConstraintsType5_SubsetConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrequencyConstraintType> getFrequencyConstraint() {
		return getGroup().list(CorePackage.eINSTANCE.getConstraintsType5_FrequencyConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MandatoryConstraintType> getMandatoryConstraint() {
		return getGroup().list(CorePackage.eINSTANCE.getConstraintsType5_MandatoryConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UniquenessConstraintType> getUniquenessConstraint() {
		return getGroup().list(CorePackage.eINSTANCE.getConstraintsType5_UniquenessConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RingConstraintType> getRingConstraint() {
		return getGroup().list(CorePackage.eINSTANCE.getConstraintsType5_RingConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueComparisonConstraintType> getValueComparisonConstraint() {
		return getGroup().list(CorePackage.eINSTANCE.getConstraintsType5_ValueComparisonConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CONSTRAINTS_TYPE5__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.CONSTRAINTS_TYPE5__EQUALITY_CONSTRAINT:
				return ((InternalEList<?>)getEqualityConstraint()).basicRemove(otherEnd, msgs);
			case CorePackage.CONSTRAINTS_TYPE5__EXCLUSION_CONSTRAINT:
				return ((InternalEList<?>)getExclusionConstraint()).basicRemove(otherEnd, msgs);
			case CorePackage.CONSTRAINTS_TYPE5__SUBSET_CONSTRAINT:
				return ((InternalEList<?>)getSubsetConstraint()).basicRemove(otherEnd, msgs);
			case CorePackage.CONSTRAINTS_TYPE5__FREQUENCY_CONSTRAINT:
				return ((InternalEList<?>)getFrequencyConstraint()).basicRemove(otherEnd, msgs);
			case CorePackage.CONSTRAINTS_TYPE5__MANDATORY_CONSTRAINT:
				return ((InternalEList<?>)getMandatoryConstraint()).basicRemove(otherEnd, msgs);
			case CorePackage.CONSTRAINTS_TYPE5__UNIQUENESS_CONSTRAINT:
				return ((InternalEList<?>)getUniquenessConstraint()).basicRemove(otherEnd, msgs);
			case CorePackage.CONSTRAINTS_TYPE5__RING_CONSTRAINT:
				return ((InternalEList<?>)getRingConstraint()).basicRemove(otherEnd, msgs);
			case CorePackage.CONSTRAINTS_TYPE5__VALUE_COMPARISON_CONSTRAINT:
				return ((InternalEList<?>)getValueComparisonConstraint()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CONSTRAINTS_TYPE5__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.CONSTRAINTS_TYPE5__EQUALITY_CONSTRAINT:
				return getEqualityConstraint();
			case CorePackage.CONSTRAINTS_TYPE5__EXCLUSION_CONSTRAINT:
				return getExclusionConstraint();
			case CorePackage.CONSTRAINTS_TYPE5__SUBSET_CONSTRAINT:
				return getSubsetConstraint();
			case CorePackage.CONSTRAINTS_TYPE5__FREQUENCY_CONSTRAINT:
				return getFrequencyConstraint();
			case CorePackage.CONSTRAINTS_TYPE5__MANDATORY_CONSTRAINT:
				return getMandatoryConstraint();
			case CorePackage.CONSTRAINTS_TYPE5__UNIQUENESS_CONSTRAINT:
				return getUniquenessConstraint();
			case CorePackage.CONSTRAINTS_TYPE5__RING_CONSTRAINT:
				return getRingConstraint();
			case CorePackage.CONSTRAINTS_TYPE5__VALUE_COMPARISON_CONSTRAINT:
				return getValueComparisonConstraint();
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
			case CorePackage.CONSTRAINTS_TYPE5__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.CONSTRAINTS_TYPE5__EQUALITY_CONSTRAINT:
				getEqualityConstraint().clear();
				getEqualityConstraint().addAll((Collection<? extends EqualityConstraintType>)newValue);
				return;
			case CorePackage.CONSTRAINTS_TYPE5__EXCLUSION_CONSTRAINT:
				getExclusionConstraint().clear();
				getExclusionConstraint().addAll((Collection<? extends ExclusionConstraintType>)newValue);
				return;
			case CorePackage.CONSTRAINTS_TYPE5__SUBSET_CONSTRAINT:
				getSubsetConstraint().clear();
				getSubsetConstraint().addAll((Collection<? extends SubsetConstraintType>)newValue);
				return;
			case CorePackage.CONSTRAINTS_TYPE5__FREQUENCY_CONSTRAINT:
				getFrequencyConstraint().clear();
				getFrequencyConstraint().addAll((Collection<? extends FrequencyConstraintType>)newValue);
				return;
			case CorePackage.CONSTRAINTS_TYPE5__MANDATORY_CONSTRAINT:
				getMandatoryConstraint().clear();
				getMandatoryConstraint().addAll((Collection<? extends MandatoryConstraintType>)newValue);
				return;
			case CorePackage.CONSTRAINTS_TYPE5__UNIQUENESS_CONSTRAINT:
				getUniquenessConstraint().clear();
				getUniquenessConstraint().addAll((Collection<? extends UniquenessConstraintType>)newValue);
				return;
			case CorePackage.CONSTRAINTS_TYPE5__RING_CONSTRAINT:
				getRingConstraint().clear();
				getRingConstraint().addAll((Collection<? extends RingConstraintType>)newValue);
				return;
			case CorePackage.CONSTRAINTS_TYPE5__VALUE_COMPARISON_CONSTRAINT:
				getValueComparisonConstraint().clear();
				getValueComparisonConstraint().addAll((Collection<? extends ValueComparisonConstraintType>)newValue);
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
			case CorePackage.CONSTRAINTS_TYPE5__GROUP:
				getGroup().clear();
				return;
			case CorePackage.CONSTRAINTS_TYPE5__EQUALITY_CONSTRAINT:
				getEqualityConstraint().clear();
				return;
			case CorePackage.CONSTRAINTS_TYPE5__EXCLUSION_CONSTRAINT:
				getExclusionConstraint().clear();
				return;
			case CorePackage.CONSTRAINTS_TYPE5__SUBSET_CONSTRAINT:
				getSubsetConstraint().clear();
				return;
			case CorePackage.CONSTRAINTS_TYPE5__FREQUENCY_CONSTRAINT:
				getFrequencyConstraint().clear();
				return;
			case CorePackage.CONSTRAINTS_TYPE5__MANDATORY_CONSTRAINT:
				getMandatoryConstraint().clear();
				return;
			case CorePackage.CONSTRAINTS_TYPE5__UNIQUENESS_CONSTRAINT:
				getUniquenessConstraint().clear();
				return;
			case CorePackage.CONSTRAINTS_TYPE5__RING_CONSTRAINT:
				getRingConstraint().clear();
				return;
			case CorePackage.CONSTRAINTS_TYPE5__VALUE_COMPARISON_CONSTRAINT:
				getValueComparisonConstraint().clear();
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
			case CorePackage.CONSTRAINTS_TYPE5__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.CONSTRAINTS_TYPE5__EQUALITY_CONSTRAINT:
				return !getEqualityConstraint().isEmpty();
			case CorePackage.CONSTRAINTS_TYPE5__EXCLUSION_CONSTRAINT:
				return !getExclusionConstraint().isEmpty();
			case CorePackage.CONSTRAINTS_TYPE5__SUBSET_CONSTRAINT:
				return !getSubsetConstraint().isEmpty();
			case CorePackage.CONSTRAINTS_TYPE5__FREQUENCY_CONSTRAINT:
				return !getFrequencyConstraint().isEmpty();
			case CorePackage.CONSTRAINTS_TYPE5__MANDATORY_CONSTRAINT:
				return !getMandatoryConstraint().isEmpty();
			case CorePackage.CONSTRAINTS_TYPE5__UNIQUENESS_CONSTRAINT:
				return !getUniquenessConstraint().isEmpty();
			case CorePackage.CONSTRAINTS_TYPE5__RING_CONSTRAINT:
				return !getRingConstraint().isEmpty();
			case CorePackage.CONSTRAINTS_TYPE5__VALUE_COMPARISON_CONSTRAINT:
				return !getValueComparisonConstraint().isEmpty();
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

} //ConstraintsType5Impl
