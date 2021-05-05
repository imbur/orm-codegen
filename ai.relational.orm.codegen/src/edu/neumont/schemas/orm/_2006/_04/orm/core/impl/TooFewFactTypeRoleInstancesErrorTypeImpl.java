/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstanceRef;
import edu.neumont.schemas.orm._2006._04.orm.core.TooFewFactTypeRoleInstancesErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Too Few Fact Type Role Instances Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.TooFewFactTypeRoleInstancesErrorTypeImpl#getFactTypeInstance <em>Fact Type Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TooFewFactTypeRoleInstancesErrorTypeImpl extends ModelErrorImpl implements TooFewFactTypeRoleInstancesErrorType {
	/**
	 * The cached value of the '{@link #getFactTypeInstance() <em>Fact Type Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactTypeInstance()
	 * @generated
	 * @ordered
	 */
	protected FactTypeInstanceRef factTypeInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TooFewFactTypeRoleInstancesErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getTooFewFactTypeRoleInstancesErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeInstanceRef getFactTypeInstance() {
		return factTypeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactTypeInstance(FactTypeInstanceRef newFactTypeInstance, NotificationChain msgs) {
		FactTypeInstanceRef oldFactTypeInstance = factTypeInstance;
		factTypeInstance = newFactTypeInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.TOO_FEW_FACT_TYPE_ROLE_INSTANCES_ERROR_TYPE__FACT_TYPE_INSTANCE, oldFactTypeInstance, newFactTypeInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactTypeInstance(FactTypeInstanceRef newFactTypeInstance) {
		if (newFactTypeInstance != factTypeInstance) {
			NotificationChain msgs = null;
			if (factTypeInstance != null)
				msgs = ((InternalEObject)factTypeInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.TOO_FEW_FACT_TYPE_ROLE_INSTANCES_ERROR_TYPE__FACT_TYPE_INSTANCE, null, msgs);
			if (newFactTypeInstance != null)
				msgs = ((InternalEObject)newFactTypeInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.TOO_FEW_FACT_TYPE_ROLE_INSTANCES_ERROR_TYPE__FACT_TYPE_INSTANCE, null, msgs);
			msgs = basicSetFactTypeInstance(newFactTypeInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TOO_FEW_FACT_TYPE_ROLE_INSTANCES_ERROR_TYPE__FACT_TYPE_INSTANCE, newFactTypeInstance, newFactTypeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.TOO_FEW_FACT_TYPE_ROLE_INSTANCES_ERROR_TYPE__FACT_TYPE_INSTANCE:
				return basicSetFactTypeInstance(null, msgs);
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
			case CorePackage.TOO_FEW_FACT_TYPE_ROLE_INSTANCES_ERROR_TYPE__FACT_TYPE_INSTANCE:
				return getFactTypeInstance();
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
			case CorePackage.TOO_FEW_FACT_TYPE_ROLE_INSTANCES_ERROR_TYPE__FACT_TYPE_INSTANCE:
				setFactTypeInstance((FactTypeInstanceRef)newValue);
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
			case CorePackage.TOO_FEW_FACT_TYPE_ROLE_INSTANCES_ERROR_TYPE__FACT_TYPE_INSTANCE:
				setFactTypeInstance((FactTypeInstanceRef)null);
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
			case CorePackage.TOO_FEW_FACT_TYPE_ROLE_INSTANCES_ERROR_TYPE__FACT_TYPE_INSTANCE:
				return factTypeInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //TooFewFactTypeRoleInstancesErrorTypeImpl
