/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.PopulationUniquenessErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleInstancesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Population Uniqueness Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PopulationUniquenessErrorTypeImpl#getRoleInstances <em>Role Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PopulationUniquenessErrorTypeImpl extends ModelErrorImpl implements PopulationUniquenessErrorType {
	/**
	 * The cached value of the '{@link #getRoleInstances() <em>Role Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleInstances()
	 * @generated
	 * @ordered
	 */
	protected RoleInstancesType roleInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopulationUniquenessErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getPopulationUniquenessErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleInstancesType getRoleInstances() {
		return roleInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleInstances(RoleInstancesType newRoleInstances, NotificationChain msgs) {
		RoleInstancesType oldRoleInstances = roleInstances;
		roleInstances = newRoleInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.POPULATION_UNIQUENESS_ERROR_TYPE__ROLE_INSTANCES, oldRoleInstances, newRoleInstances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleInstances(RoleInstancesType newRoleInstances) {
		if (newRoleInstances != roleInstances) {
			NotificationChain msgs = null;
			if (roleInstances != null)
				msgs = ((InternalEObject)roleInstances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.POPULATION_UNIQUENESS_ERROR_TYPE__ROLE_INSTANCES, null, msgs);
			if (newRoleInstances != null)
				msgs = ((InternalEObject)newRoleInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.POPULATION_UNIQUENESS_ERROR_TYPE__ROLE_INSTANCES, null, msgs);
			msgs = basicSetRoleInstances(newRoleInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.POPULATION_UNIQUENESS_ERROR_TYPE__ROLE_INSTANCES, newRoleInstances, newRoleInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.POPULATION_UNIQUENESS_ERROR_TYPE__ROLE_INSTANCES:
				return basicSetRoleInstances(null, msgs);
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
			case CorePackage.POPULATION_UNIQUENESS_ERROR_TYPE__ROLE_INSTANCES:
				return getRoleInstances();
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
			case CorePackage.POPULATION_UNIQUENESS_ERROR_TYPE__ROLE_INSTANCES:
				setRoleInstances((RoleInstancesType)newValue);
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
			case CorePackage.POPULATION_UNIQUENESS_ERROR_TYPE__ROLE_INSTANCES:
				setRoleInstances((RoleInstancesType)null);
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
			case CorePackage.POPULATION_UNIQUENESS_ERROR_TYPE__ROLE_INSTANCES:
				return roleInstances != null;
		}
		return super.eIsSet(featureID);
	}

} //PopulationUniquenessErrorTypeImpl
