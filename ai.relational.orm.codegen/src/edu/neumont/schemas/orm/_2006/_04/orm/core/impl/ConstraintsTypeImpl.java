/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CardinalityConstraintRef;
import edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.SetComparisonConstraintRef;
import edu.neumont.schemas.orm._2006._04.orm.core.SetConstraintRef;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueConstraintRef;

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
 * An implementation of the model object '<em><b>Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsTypeImpl#getSetComparisonConstraint <em>Set Comparison Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsTypeImpl#getSetConstraint <em>Set Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsTypeImpl#getValueConstraint <em>Value Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintsTypeImpl#getCardinalityConstraint <em>Cardinality Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintsTypeImpl extends MinimalEObjectImpl.Container implements ConstraintsType {
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
	protected ConstraintsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getConstraintsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.CONSTRAINTS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetComparisonConstraintRef> getSetComparisonConstraint() {
		return getGroup().list(CorePackage.eINSTANCE.getConstraintsType_SetComparisonConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetConstraintRef> getSetConstraint() {
		return getGroup().list(CorePackage.eINSTANCE.getConstraintsType_SetConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueConstraintRef> getValueConstraint() {
		return getGroup().list(CorePackage.eINSTANCE.getConstraintsType_ValueConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CardinalityConstraintRef> getCardinalityConstraint() {
		return getGroup().list(CorePackage.eINSTANCE.getConstraintsType_CardinalityConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CONSTRAINTS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.CONSTRAINTS_TYPE__SET_COMPARISON_CONSTRAINT:
				return ((InternalEList<?>)getSetComparisonConstraint()).basicRemove(otherEnd, msgs);
			case CorePackage.CONSTRAINTS_TYPE__SET_CONSTRAINT:
				return ((InternalEList<?>)getSetConstraint()).basicRemove(otherEnd, msgs);
			case CorePackage.CONSTRAINTS_TYPE__VALUE_CONSTRAINT:
				return ((InternalEList<?>)getValueConstraint()).basicRemove(otherEnd, msgs);
			case CorePackage.CONSTRAINTS_TYPE__CARDINALITY_CONSTRAINT:
				return ((InternalEList<?>)getCardinalityConstraint()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CONSTRAINTS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.CONSTRAINTS_TYPE__SET_COMPARISON_CONSTRAINT:
				return getSetComparisonConstraint();
			case CorePackage.CONSTRAINTS_TYPE__SET_CONSTRAINT:
				return getSetConstraint();
			case CorePackage.CONSTRAINTS_TYPE__VALUE_CONSTRAINT:
				return getValueConstraint();
			case CorePackage.CONSTRAINTS_TYPE__CARDINALITY_CONSTRAINT:
				return getCardinalityConstraint();
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
			case CorePackage.CONSTRAINTS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.CONSTRAINTS_TYPE__SET_COMPARISON_CONSTRAINT:
				getSetComparisonConstraint().clear();
				getSetComparisonConstraint().addAll((Collection<? extends SetComparisonConstraintRef>)newValue);
				return;
			case CorePackage.CONSTRAINTS_TYPE__SET_CONSTRAINT:
				getSetConstraint().clear();
				getSetConstraint().addAll((Collection<? extends SetConstraintRef>)newValue);
				return;
			case CorePackage.CONSTRAINTS_TYPE__VALUE_CONSTRAINT:
				getValueConstraint().clear();
				getValueConstraint().addAll((Collection<? extends ValueConstraintRef>)newValue);
				return;
			case CorePackage.CONSTRAINTS_TYPE__CARDINALITY_CONSTRAINT:
				getCardinalityConstraint().clear();
				getCardinalityConstraint().addAll((Collection<? extends CardinalityConstraintRef>)newValue);
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
			case CorePackage.CONSTRAINTS_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorePackage.CONSTRAINTS_TYPE__SET_COMPARISON_CONSTRAINT:
				getSetComparisonConstraint().clear();
				return;
			case CorePackage.CONSTRAINTS_TYPE__SET_CONSTRAINT:
				getSetConstraint().clear();
				return;
			case CorePackage.CONSTRAINTS_TYPE__VALUE_CONSTRAINT:
				getValueConstraint().clear();
				return;
			case CorePackage.CONSTRAINTS_TYPE__CARDINALITY_CONSTRAINT:
				getCardinalityConstraint().clear();
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
			case CorePackage.CONSTRAINTS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.CONSTRAINTS_TYPE__SET_COMPARISON_CONSTRAINT:
				return !getSetComparisonConstraint().isEmpty();
			case CorePackage.CONSTRAINTS_TYPE__SET_CONSTRAINT:
				return !getSetConstraint().isEmpty();
			case CorePackage.CONSTRAINTS_TYPE__VALUE_CONSTRAINT:
				return !getValueConstraint().isEmpty();
			case CorePackage.CONSTRAINTS_TYPE__CARDINALITY_CONSTRAINT:
				return !getCardinalityConstraint().isEmpty();
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

} //ConstraintsTypeImpl
