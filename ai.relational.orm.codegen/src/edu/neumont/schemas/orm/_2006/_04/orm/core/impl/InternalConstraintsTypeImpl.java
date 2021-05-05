/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.InternalConstraintsType;
import edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintRef;
import edu.neumont.schemas.orm._2006._04.orm.core.UniquenessConstraintRef;

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
 * An implementation of the model object '<em><b>Internal Constraints Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.InternalConstraintsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.InternalConstraintsTypeImpl#getUniquenessConstraint <em>Uniqueness Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.InternalConstraintsTypeImpl#getMandatoryConstraint <em>Mandatory Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalConstraintsTypeImpl extends MinimalEObjectImpl.Container implements InternalConstraintsType {
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
	protected InternalConstraintsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getInternalConstraintsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.INTERNAL_CONSTRAINTS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UniquenessConstraintRef> getUniquenessConstraint() {
		return getGroup().list(CorePackage.eINSTANCE.getInternalConstraintsType_UniquenessConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MandatoryConstraintRef> getMandatoryConstraint() {
		return getGroup().list(CorePackage.eINSTANCE.getInternalConstraintsType_MandatoryConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.INTERNAL_CONSTRAINTS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.INTERNAL_CONSTRAINTS_TYPE__UNIQUENESS_CONSTRAINT:
				return ((InternalEList<?>)getUniquenessConstraint()).basicRemove(otherEnd, msgs);
			case CorePackage.INTERNAL_CONSTRAINTS_TYPE__MANDATORY_CONSTRAINT:
				return ((InternalEList<?>)getMandatoryConstraint()).basicRemove(otherEnd, msgs);
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
			case CorePackage.INTERNAL_CONSTRAINTS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.INTERNAL_CONSTRAINTS_TYPE__UNIQUENESS_CONSTRAINT:
				return getUniquenessConstraint();
			case CorePackage.INTERNAL_CONSTRAINTS_TYPE__MANDATORY_CONSTRAINT:
				return getMandatoryConstraint();
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
			case CorePackage.INTERNAL_CONSTRAINTS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.INTERNAL_CONSTRAINTS_TYPE__UNIQUENESS_CONSTRAINT:
				getUniquenessConstraint().clear();
				getUniquenessConstraint().addAll((Collection<? extends UniquenessConstraintRef>)newValue);
				return;
			case CorePackage.INTERNAL_CONSTRAINTS_TYPE__MANDATORY_CONSTRAINT:
				getMandatoryConstraint().clear();
				getMandatoryConstraint().addAll((Collection<? extends MandatoryConstraintRef>)newValue);
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
			case CorePackage.INTERNAL_CONSTRAINTS_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorePackage.INTERNAL_CONSTRAINTS_TYPE__UNIQUENESS_CONSTRAINT:
				getUniquenessConstraint().clear();
				return;
			case CorePackage.INTERNAL_CONSTRAINTS_TYPE__MANDATORY_CONSTRAINT:
				getMandatoryConstraint().clear();
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
			case CorePackage.INTERNAL_CONSTRAINTS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.INTERNAL_CONSTRAINTS_TYPE__UNIQUENESS_CONSTRAINT:
				return !getUniquenessConstraint().isEmpty();
			case CorePackage.INTERNAL_CONSTRAINTS_TYPE__MANDATORY_CONSTRAINT:
				return !getMandatoryConstraint().isEmpty();
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

} //InternalConstraintsTypeImpl
