/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.JoinPathProjectionRef;
import edu.neumont.schemas.orm._2006._04.orm.core.PartialJoinPathProjectionErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partial Join Path Projection Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PartialJoinPathProjectionErrorTypeImpl#getJoinPathProjection <em>Join Path Projection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartialJoinPathProjectionErrorTypeImpl extends ModelErrorImpl implements PartialJoinPathProjectionErrorType {
	/**
	 * The cached value of the '{@link #getJoinPathProjection() <em>Join Path Projection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinPathProjection()
	 * @generated
	 * @ordered
	 */
	protected JoinPathProjectionRef joinPathProjection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialJoinPathProjectionErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getPartialJoinPathProjectionErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinPathProjectionRef getJoinPathProjection() {
		return joinPathProjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinPathProjection(JoinPathProjectionRef newJoinPathProjection, NotificationChain msgs) {
		JoinPathProjectionRef oldJoinPathProjection = joinPathProjection;
		joinPathProjection = newJoinPathProjection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.PARTIAL_JOIN_PATH_PROJECTION_ERROR_TYPE__JOIN_PATH_PROJECTION, oldJoinPathProjection, newJoinPathProjection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinPathProjection(JoinPathProjectionRef newJoinPathProjection) {
		if (newJoinPathProjection != joinPathProjection) {
			NotificationChain msgs = null;
			if (joinPathProjection != null)
				msgs = ((InternalEObject)joinPathProjection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.PARTIAL_JOIN_PATH_PROJECTION_ERROR_TYPE__JOIN_PATH_PROJECTION, null, msgs);
			if (newJoinPathProjection != null)
				msgs = ((InternalEObject)newJoinPathProjection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.PARTIAL_JOIN_PATH_PROJECTION_ERROR_TYPE__JOIN_PATH_PROJECTION, null, msgs);
			msgs = basicSetJoinPathProjection(newJoinPathProjection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PARTIAL_JOIN_PATH_PROJECTION_ERROR_TYPE__JOIN_PATH_PROJECTION, newJoinPathProjection, newJoinPathProjection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.PARTIAL_JOIN_PATH_PROJECTION_ERROR_TYPE__JOIN_PATH_PROJECTION:
				return basicSetJoinPathProjection(null, msgs);
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
			case CorePackage.PARTIAL_JOIN_PATH_PROJECTION_ERROR_TYPE__JOIN_PATH_PROJECTION:
				return getJoinPathProjection();
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
			case CorePackage.PARTIAL_JOIN_PATH_PROJECTION_ERROR_TYPE__JOIN_PATH_PROJECTION:
				setJoinPathProjection((JoinPathProjectionRef)newValue);
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
			case CorePackage.PARTIAL_JOIN_PATH_PROJECTION_ERROR_TYPE__JOIN_PATH_PROJECTION:
				setJoinPathProjection((JoinPathProjectionRef)null);
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
			case CorePackage.PARTIAL_JOIN_PATH_PROJECTION_ERROR_TYPE__JOIN_PATH_PROJECTION:
				return joinPathProjection != null;
		}
		return super.eIsSet(featureID);
	}

} //PartialJoinPathProjectionErrorTypeImpl
