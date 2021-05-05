/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.SetConstraintType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SetConstraintTypeImpl#getRoleSequence <em>Role Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SetConstraintTypeImpl extends ConstraintTypeImpl implements SetConstraintType {
	/**
	 * The cached value of the '{@link #getRoleSequence() <em>Role Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleSequence()
	 * @generated
	 * @ordered
	 */
	protected ConstraintRoleSequenceType roleSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getSetConstraintType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRoleSequenceType getRoleSequence() {
		return roleSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleSequence(ConstraintRoleSequenceType newRoleSequence, NotificationChain msgs) {
		ConstraintRoleSequenceType oldRoleSequence = roleSequence;
		roleSequence = newRoleSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SET_CONSTRAINT_TYPE__ROLE_SEQUENCE, oldRoleSequence, newRoleSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleSequence(ConstraintRoleSequenceType newRoleSequence) {
		if (newRoleSequence != roleSequence) {
			NotificationChain msgs = null;
			if (roleSequence != null)
				msgs = ((InternalEObject)roleSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SET_CONSTRAINT_TYPE__ROLE_SEQUENCE, null, msgs);
			if (newRoleSequence != null)
				msgs = ((InternalEObject)newRoleSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SET_CONSTRAINT_TYPE__ROLE_SEQUENCE, null, msgs);
			msgs = basicSetRoleSequence(newRoleSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SET_CONSTRAINT_TYPE__ROLE_SEQUENCE, newRoleSequence, newRoleSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SET_CONSTRAINT_TYPE__ROLE_SEQUENCE:
				return basicSetRoleSequence(null, msgs);
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
			case CorePackage.SET_CONSTRAINT_TYPE__ROLE_SEQUENCE:
				return getRoleSequence();
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
			case CorePackage.SET_CONSTRAINT_TYPE__ROLE_SEQUENCE:
				setRoleSequence((ConstraintRoleSequenceType)newValue);
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
			case CorePackage.SET_CONSTRAINT_TYPE__ROLE_SEQUENCE:
				setRoleSequence((ConstraintRoleSequenceType)null);
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
			case CorePackage.SET_CONSTRAINT_TYPE__ROLE_SEQUENCE:
				return roleSequence != null;
		}
		return super.eIsSet(featureID);
	}

} //SetConstraintTypeImpl
