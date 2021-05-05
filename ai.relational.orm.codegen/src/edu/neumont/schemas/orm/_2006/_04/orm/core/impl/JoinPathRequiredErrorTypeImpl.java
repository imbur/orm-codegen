/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceRef;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.JoinPathRequiredErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Path Required Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.JoinPathRequiredErrorTypeImpl#getConstraintRoleSequence <em>Constraint Role Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinPathRequiredErrorTypeImpl extends ModelErrorImpl implements JoinPathRequiredErrorType {
	/**
	 * The cached value of the '{@link #getConstraintRoleSequence() <em>Constraint Role Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintRoleSequence()
	 * @generated
	 * @ordered
	 */
	protected ConstraintRoleSequenceRef constraintRoleSequence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinPathRequiredErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getJoinPathRequiredErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRoleSequenceRef getConstraintRoleSequence() {
		return constraintRoleSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintRoleSequence(ConstraintRoleSequenceRef newConstraintRoleSequence, NotificationChain msgs) {
		ConstraintRoleSequenceRef oldConstraintRoleSequence = constraintRoleSequence;
		constraintRoleSequence = newConstraintRoleSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.JOIN_PATH_REQUIRED_ERROR_TYPE__CONSTRAINT_ROLE_SEQUENCE, oldConstraintRoleSequence, newConstraintRoleSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintRoleSequence(ConstraintRoleSequenceRef newConstraintRoleSequence) {
		if (newConstraintRoleSequence != constraintRoleSequence) {
			NotificationChain msgs = null;
			if (constraintRoleSequence != null)
				msgs = ((InternalEObject)constraintRoleSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.JOIN_PATH_REQUIRED_ERROR_TYPE__CONSTRAINT_ROLE_SEQUENCE, null, msgs);
			if (newConstraintRoleSequence != null)
				msgs = ((InternalEObject)newConstraintRoleSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.JOIN_PATH_REQUIRED_ERROR_TYPE__CONSTRAINT_ROLE_SEQUENCE, null, msgs);
			msgs = basicSetConstraintRoleSequence(newConstraintRoleSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.JOIN_PATH_REQUIRED_ERROR_TYPE__CONSTRAINT_ROLE_SEQUENCE, newConstraintRoleSequence, newConstraintRoleSequence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.JOIN_PATH_REQUIRED_ERROR_TYPE__CONSTRAINT_ROLE_SEQUENCE:
				return basicSetConstraintRoleSequence(null, msgs);
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
			case CorePackage.JOIN_PATH_REQUIRED_ERROR_TYPE__CONSTRAINT_ROLE_SEQUENCE:
				return getConstraintRoleSequence();
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
			case CorePackage.JOIN_PATH_REQUIRED_ERROR_TYPE__CONSTRAINT_ROLE_SEQUENCE:
				setConstraintRoleSequence((ConstraintRoleSequenceRef)newValue);
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
			case CorePackage.JOIN_PATH_REQUIRED_ERROR_TYPE__CONSTRAINT_ROLE_SEQUENCE:
				setConstraintRoleSequence((ConstraintRoleSequenceRef)null);
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
			case CorePackage.JOIN_PATH_REQUIRED_ERROR_TYPE__CONSTRAINT_ROLE_SEQUENCE:
				return constraintRoleSequence != null;
		}
		return super.eIsSet(featureID);
	}

} //JoinPathRequiredErrorTypeImpl
