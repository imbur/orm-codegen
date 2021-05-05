/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceJoinPathRef;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.JoinPathRequiresProjectionErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Path Requires Projection Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.JoinPathRequiresProjectionErrorTypeImpl#getJoinPath <em>Join Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinPathRequiresProjectionErrorTypeImpl extends ModelErrorImpl implements JoinPathRequiresProjectionErrorType {
	/**
	 * The cached value of the '{@link #getJoinPath() <em>Join Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinPath()
	 * @generated
	 * @ordered
	 */
	protected ConstraintRoleSequenceJoinPathRef joinPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinPathRequiresProjectionErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getJoinPathRequiresProjectionErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRoleSequenceJoinPathRef getJoinPath() {
		return joinPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinPath(ConstraintRoleSequenceJoinPathRef newJoinPath, NotificationChain msgs) {
		ConstraintRoleSequenceJoinPathRef oldJoinPath = joinPath;
		joinPath = newJoinPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.JOIN_PATH_REQUIRES_PROJECTION_ERROR_TYPE__JOIN_PATH, oldJoinPath, newJoinPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinPath(ConstraintRoleSequenceJoinPathRef newJoinPath) {
		if (newJoinPath != joinPath) {
			NotificationChain msgs = null;
			if (joinPath != null)
				msgs = ((InternalEObject)joinPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.JOIN_PATH_REQUIRES_PROJECTION_ERROR_TYPE__JOIN_PATH, null, msgs);
			if (newJoinPath != null)
				msgs = ((InternalEObject)newJoinPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.JOIN_PATH_REQUIRES_PROJECTION_ERROR_TYPE__JOIN_PATH, null, msgs);
			msgs = basicSetJoinPath(newJoinPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.JOIN_PATH_REQUIRES_PROJECTION_ERROR_TYPE__JOIN_PATH, newJoinPath, newJoinPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.JOIN_PATH_REQUIRES_PROJECTION_ERROR_TYPE__JOIN_PATH:
				return basicSetJoinPath(null, msgs);
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
			case CorePackage.JOIN_PATH_REQUIRES_PROJECTION_ERROR_TYPE__JOIN_PATH:
				return getJoinPath();
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
			case CorePackage.JOIN_PATH_REQUIRES_PROJECTION_ERROR_TYPE__JOIN_PATH:
				setJoinPath((ConstraintRoleSequenceJoinPathRef)newValue);
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
			case CorePackage.JOIN_PATH_REQUIRES_PROJECTION_ERROR_TYPE__JOIN_PATH:
				setJoinPath((ConstraintRoleSequenceJoinPathRef)null);
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
			case CorePackage.JOIN_PATH_REQUIRES_PROJECTION_ERROR_TYPE__JOIN_PATH:
				return joinPath != null;
		}
		return super.eIsSet(featureID);
	}

} //JoinPathRequiresProjectionErrorTypeImpl
