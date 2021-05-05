/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CompatibleValueTypeInstanceValueErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeInstanceRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compatible Value Type Instance Value Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CompatibleValueTypeInstanceValueErrorTypeImpl#getValueTypeInstance <em>Value Type Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompatibleValueTypeInstanceValueErrorTypeImpl extends ModelErrorImpl implements CompatibleValueTypeInstanceValueErrorType {
	/**
	 * The cached value of the '{@link #getValueTypeInstance() <em>Value Type Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueTypeInstance()
	 * @generated
	 * @ordered
	 */
	protected ValueTypeInstanceRef valueTypeInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompatibleValueTypeInstanceValueErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getCompatibleValueTypeInstanceValueErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeInstanceRef getValueTypeInstance() {
		return valueTypeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueTypeInstance(ValueTypeInstanceRef newValueTypeInstance, NotificationChain msgs) {
		ValueTypeInstanceRef oldValueTypeInstance = valueTypeInstance;
		valueTypeInstance = newValueTypeInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.COMPATIBLE_VALUE_TYPE_INSTANCE_VALUE_ERROR_TYPE__VALUE_TYPE_INSTANCE, oldValueTypeInstance, newValueTypeInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueTypeInstance(ValueTypeInstanceRef newValueTypeInstance) {
		if (newValueTypeInstance != valueTypeInstance) {
			NotificationChain msgs = null;
			if (valueTypeInstance != null)
				msgs = ((InternalEObject)valueTypeInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.COMPATIBLE_VALUE_TYPE_INSTANCE_VALUE_ERROR_TYPE__VALUE_TYPE_INSTANCE, null, msgs);
			if (newValueTypeInstance != null)
				msgs = ((InternalEObject)newValueTypeInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.COMPATIBLE_VALUE_TYPE_INSTANCE_VALUE_ERROR_TYPE__VALUE_TYPE_INSTANCE, null, msgs);
			msgs = basicSetValueTypeInstance(newValueTypeInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPATIBLE_VALUE_TYPE_INSTANCE_VALUE_ERROR_TYPE__VALUE_TYPE_INSTANCE, newValueTypeInstance, newValueTypeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.COMPATIBLE_VALUE_TYPE_INSTANCE_VALUE_ERROR_TYPE__VALUE_TYPE_INSTANCE:
				return basicSetValueTypeInstance(null, msgs);
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
			case CorePackage.COMPATIBLE_VALUE_TYPE_INSTANCE_VALUE_ERROR_TYPE__VALUE_TYPE_INSTANCE:
				return getValueTypeInstance();
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
			case CorePackage.COMPATIBLE_VALUE_TYPE_INSTANCE_VALUE_ERROR_TYPE__VALUE_TYPE_INSTANCE:
				setValueTypeInstance((ValueTypeInstanceRef)newValue);
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
			case CorePackage.COMPATIBLE_VALUE_TYPE_INSTANCE_VALUE_ERROR_TYPE__VALUE_TYPE_INSTANCE:
				setValueTypeInstance((ValueTypeInstanceRef)null);
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
			case CorePackage.COMPATIBLE_VALUE_TYPE_INSTANCE_VALUE_ERROR_TYPE__VALUE_TYPE_INSTANCE:
				return valueTypeInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //CompatibleValueTypeInstanceValueErrorTypeImpl
