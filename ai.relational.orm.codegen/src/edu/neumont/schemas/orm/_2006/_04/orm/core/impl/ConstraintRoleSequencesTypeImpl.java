/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceWithJoinAndIdType;
import edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequencesType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Role Sequences Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintRoleSequencesTypeImpl#getRoleSequence <em>Role Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintRoleSequencesTypeImpl extends MinimalEObjectImpl.Container implements ConstraintRoleSequencesType {
	/**
	 * The cached value of the '{@link #getRoleSequence() <em>Role Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintRoleSequenceWithJoinAndIdType> roleSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintRoleSequencesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getConstraintRoleSequencesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintRoleSequenceWithJoinAndIdType> getRoleSequence() {
		if (roleSequence == null) {
			roleSequence = new EObjectContainmentEList<ConstraintRoleSequenceWithJoinAndIdType>(ConstraintRoleSequenceWithJoinAndIdType.class, this, CorePackage.CONSTRAINT_ROLE_SEQUENCES_TYPE__ROLE_SEQUENCE);
		}
		return roleSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CONSTRAINT_ROLE_SEQUENCES_TYPE__ROLE_SEQUENCE:
				return ((InternalEList<?>)getRoleSequence()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CONSTRAINT_ROLE_SEQUENCES_TYPE__ROLE_SEQUENCE:
				return getRoleSequence();
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
			case CorePackage.CONSTRAINT_ROLE_SEQUENCES_TYPE__ROLE_SEQUENCE:
				getRoleSequence().clear();
				getRoleSequence().addAll((Collection<? extends ConstraintRoleSequenceWithJoinAndIdType>)newValue);
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
			case CorePackage.CONSTRAINT_ROLE_SEQUENCES_TYPE__ROLE_SEQUENCE:
				getRoleSequence().clear();
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
			case CorePackage.CONSTRAINT_ROLE_SEQUENCES_TYPE__ROLE_SEQUENCE:
				return roleSequence != null && !roleSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstraintRoleSequencesTypeImpl
