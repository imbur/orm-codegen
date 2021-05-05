/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleProjectionRef;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.JoinedConstraintRoleProjectionCompatibilityErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joined Constraint Role Projection Compatibility Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.JoinedConstraintRoleProjectionCompatibilityErrorTypeImpl#getConstraintRoleProjection <em>Constraint Role Projection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinedConstraintRoleProjectionCompatibilityErrorTypeImpl extends ModelErrorImpl implements JoinedConstraintRoleProjectionCompatibilityErrorType {
	/**
	 * The cached value of the '{@link #getConstraintRoleProjection() <em>Constraint Role Projection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintRoleProjection()
	 * @generated
	 * @ordered
	 */
	protected ConstraintRoleProjectionRef constraintRoleProjection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinedConstraintRoleProjectionCompatibilityErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getJoinedConstraintRoleProjectionCompatibilityErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRoleProjectionRef getConstraintRoleProjection() {
		return constraintRoleProjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraintRoleProjection(ConstraintRoleProjectionRef newConstraintRoleProjection, NotificationChain msgs) {
		ConstraintRoleProjectionRef oldConstraintRoleProjection = constraintRoleProjection;
		constraintRoleProjection = newConstraintRoleProjection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.JOINED_CONSTRAINT_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE__CONSTRAINT_ROLE_PROJECTION, oldConstraintRoleProjection, newConstraintRoleProjection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintRoleProjection(ConstraintRoleProjectionRef newConstraintRoleProjection) {
		if (newConstraintRoleProjection != constraintRoleProjection) {
			NotificationChain msgs = null;
			if (constraintRoleProjection != null)
				msgs = ((InternalEObject)constraintRoleProjection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.JOINED_CONSTRAINT_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE__CONSTRAINT_ROLE_PROJECTION, null, msgs);
			if (newConstraintRoleProjection != null)
				msgs = ((InternalEObject)newConstraintRoleProjection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.JOINED_CONSTRAINT_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE__CONSTRAINT_ROLE_PROJECTION, null, msgs);
			msgs = basicSetConstraintRoleProjection(newConstraintRoleProjection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.JOINED_CONSTRAINT_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE__CONSTRAINT_ROLE_PROJECTION, newConstraintRoleProjection, newConstraintRoleProjection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.JOINED_CONSTRAINT_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE__CONSTRAINT_ROLE_PROJECTION:
				return basicSetConstraintRoleProjection(null, msgs);
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
			case CorePackage.JOINED_CONSTRAINT_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE__CONSTRAINT_ROLE_PROJECTION:
				return getConstraintRoleProjection();
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
			case CorePackage.JOINED_CONSTRAINT_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE__CONSTRAINT_ROLE_PROJECTION:
				setConstraintRoleProjection((ConstraintRoleProjectionRef)newValue);
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
			case CorePackage.JOINED_CONSTRAINT_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE__CONSTRAINT_ROLE_PROJECTION:
				setConstraintRoleProjection((ConstraintRoleProjectionRef)null);
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
			case CorePackage.JOINED_CONSTRAINT_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE__CONSTRAINT_ROLE_PROJECTION:
				return constraintRoleProjection != null;
		}
		return super.eIsSet(featureID);
	}

} //JoinedConstraintRoleProjectionCompatibilityErrorTypeImpl
