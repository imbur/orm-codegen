/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DerivedRoleProjectionRef;
import edu.neumont.schemas.orm._2006._04.orm.core.QueryRoleProjectionCompatibilityErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Role Projection Compatibility Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.QueryRoleProjectionCompatibilityErrorTypeImpl#getDerivedRoleProjection <em>Derived Role Projection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryRoleProjectionCompatibilityErrorTypeImpl extends ModelErrorImpl implements QueryRoleProjectionCompatibilityErrorType {
	/**
	 * The cached value of the '{@link #getDerivedRoleProjection() <em>Derived Role Projection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedRoleProjection()
	 * @generated
	 * @ordered
	 */
	protected DerivedRoleProjectionRef derivedRoleProjection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryRoleProjectionCompatibilityErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getQueryRoleProjectionCompatibilityErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedRoleProjectionRef getDerivedRoleProjection() {
		return derivedRoleProjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivedRoleProjection(DerivedRoleProjectionRef newDerivedRoleProjection, NotificationChain msgs) {
		DerivedRoleProjectionRef oldDerivedRoleProjection = derivedRoleProjection;
		derivedRoleProjection = newDerivedRoleProjection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE__DERIVED_ROLE_PROJECTION, oldDerivedRoleProjection, newDerivedRoleProjection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivedRoleProjection(DerivedRoleProjectionRef newDerivedRoleProjection) {
		if (newDerivedRoleProjection != derivedRoleProjection) {
			NotificationChain msgs = null;
			if (derivedRoleProjection != null)
				msgs = ((InternalEObject)derivedRoleProjection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE__DERIVED_ROLE_PROJECTION, null, msgs);
			if (newDerivedRoleProjection != null)
				msgs = ((InternalEObject)newDerivedRoleProjection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE__DERIVED_ROLE_PROJECTION, null, msgs);
			msgs = basicSetDerivedRoleProjection(newDerivedRoleProjection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE__DERIVED_ROLE_PROJECTION, newDerivedRoleProjection, newDerivedRoleProjection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.QUERY_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE__DERIVED_ROLE_PROJECTION:
				return basicSetDerivedRoleProjection(null, msgs);
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
			case CorePackage.QUERY_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE__DERIVED_ROLE_PROJECTION:
				return getDerivedRoleProjection();
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
			case CorePackage.QUERY_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE__DERIVED_ROLE_PROJECTION:
				setDerivedRoleProjection((DerivedRoleProjectionRef)newValue);
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
			case CorePackage.QUERY_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE__DERIVED_ROLE_PROJECTION:
				setDerivedRoleProjection((DerivedRoleProjectionRef)null);
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
			case CorePackage.QUERY_ROLE_PROJECTION_COMPATIBILITY_ERROR_TYPE__DERIVED_ROLE_PROJECTION:
				return derivedRoleProjection != null;
		}
		return super.eIsSet(featureID);
	}

} //QueryRoleProjectionCompatibilityErrorTypeImpl
