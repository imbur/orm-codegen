/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeDuplicateNameErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Type Duplicate Name Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectTypeDuplicateNameErrorTypeImpl#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectTypeDuplicateNameErrorTypeImpl extends ModelErrorImpl implements ObjectTypeDuplicateNameErrorType {
	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected ObjectsType objects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectTypeDuplicateNameErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getObjectTypeDuplicateNameErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectsType getObjects() {
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjects(ObjectsType newObjects, NotificationChain msgs) {
		ObjectsType oldObjects = objects;
		objects = newObjects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_DUPLICATE_NAME_ERROR_TYPE__OBJECTS, oldObjects, newObjects);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjects(ObjectsType newObjects) {
		if (newObjects != objects) {
			NotificationChain msgs = null;
			if (objects != null)
				msgs = ((InternalEObject)objects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_TYPE_DUPLICATE_NAME_ERROR_TYPE__OBJECTS, null, msgs);
			if (newObjects != null)
				msgs = ((InternalEObject)newObjects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_TYPE_DUPLICATE_NAME_ERROR_TYPE__OBJECTS, null, msgs);
			msgs = basicSetObjects(newObjects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_DUPLICATE_NAME_ERROR_TYPE__OBJECTS, newObjects, newObjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.OBJECT_TYPE_DUPLICATE_NAME_ERROR_TYPE__OBJECTS:
				return basicSetObjects(null, msgs);
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
			case CorePackage.OBJECT_TYPE_DUPLICATE_NAME_ERROR_TYPE__OBJECTS:
				return getObjects();
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
			case CorePackage.OBJECT_TYPE_DUPLICATE_NAME_ERROR_TYPE__OBJECTS:
				setObjects((ObjectsType)newValue);
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
			case CorePackage.OBJECT_TYPE_DUPLICATE_NAME_ERROR_TYPE__OBJECTS:
				setObjects((ObjectsType)null);
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
			case CorePackage.OBJECT_TYPE_DUPLICATE_NAME_ERROR_TYPE__OBJECTS:
				return objects != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectTypeDuplicateNameErrorTypeImpl
