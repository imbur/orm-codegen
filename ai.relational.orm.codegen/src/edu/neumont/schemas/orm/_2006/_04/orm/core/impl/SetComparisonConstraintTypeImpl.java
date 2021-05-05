/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequencesType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.SetComparisonConstraintType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Comparison Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SetComparisonConstraintTypeImpl#getRoleSequences <em>Role Sequences</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SetComparisonConstraintTypeImpl extends ConstraintTypeImpl implements SetComparisonConstraintType {
	/**
	 * The cached value of the '{@link #getRoleSequences() <em>Role Sequences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleSequences()
	 * @generated
	 * @ordered
	 */
	protected ConstraintRoleSequencesType roleSequences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetComparisonConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getSetComparisonConstraintType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRoleSequencesType getRoleSequences() {
		return roleSequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleSequences(ConstraintRoleSequencesType newRoleSequences, NotificationChain msgs) {
		ConstraintRoleSequencesType oldRoleSequences = roleSequences;
		roleSequences = newRoleSequences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SET_COMPARISON_CONSTRAINT_TYPE__ROLE_SEQUENCES, oldRoleSequences, newRoleSequences);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleSequences(ConstraintRoleSequencesType newRoleSequences) {
		if (newRoleSequences != roleSequences) {
			NotificationChain msgs = null;
			if (roleSequences != null)
				msgs = ((InternalEObject)roleSequences).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SET_COMPARISON_CONSTRAINT_TYPE__ROLE_SEQUENCES, null, msgs);
			if (newRoleSequences != null)
				msgs = ((InternalEObject)newRoleSequences).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SET_COMPARISON_CONSTRAINT_TYPE__ROLE_SEQUENCES, null, msgs);
			msgs = basicSetRoleSequences(newRoleSequences, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SET_COMPARISON_CONSTRAINT_TYPE__ROLE_SEQUENCES, newRoleSequences, newRoleSequences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SET_COMPARISON_CONSTRAINT_TYPE__ROLE_SEQUENCES:
				return basicSetRoleSequences(null, msgs);
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
			case CorePackage.SET_COMPARISON_CONSTRAINT_TYPE__ROLE_SEQUENCES:
				return getRoleSequences();
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
			case CorePackage.SET_COMPARISON_CONSTRAINT_TYPE__ROLE_SEQUENCES:
				setRoleSequences((ConstraintRoleSequencesType)newValue);
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
			case CorePackage.SET_COMPARISON_CONSTRAINT_TYPE__ROLE_SEQUENCES:
				setRoleSequences((ConstraintRoleSequencesType)null);
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
			case CorePackage.SET_COMPARISON_CONSTRAINT_TYPE__ROLE_SEQUENCES:
				return roleSequences != null;
		}
		return super.eIsSet(featureID);
	}

} //SetComparisonConstraintTypeImpl
