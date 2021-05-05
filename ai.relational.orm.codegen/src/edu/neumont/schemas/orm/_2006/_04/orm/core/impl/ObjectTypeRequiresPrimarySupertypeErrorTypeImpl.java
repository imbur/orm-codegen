/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRef;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRequiresPrimarySupertypeErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Type Requires Primary Supertype Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectTypeRequiresPrimarySupertypeErrorTypeImpl#getObjectType <em>Object Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectTypeRequiresPrimarySupertypeErrorTypeImpl extends ModelErrorImpl implements ObjectTypeRequiresPrimarySupertypeErrorType {
	/**
	 * The cached value of the '{@link #getObjectType() <em>Object Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectType()
	 * @generated
	 * @ordered
	 */
	protected ObjectTypeRef objectType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectTypeRequiresPrimarySupertypeErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getObjectTypeRequiresPrimarySupertypeErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeRef getObjectType() {
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectType(ObjectTypeRef newObjectType, NotificationChain msgs) {
		ObjectTypeRef oldObjectType = objectType;
		objectType = newObjectType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_REQUIRES_PRIMARY_SUPERTYPE_ERROR_TYPE__OBJECT_TYPE, oldObjectType, newObjectType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectType(ObjectTypeRef newObjectType) {
		if (newObjectType != objectType) {
			NotificationChain msgs = null;
			if (objectType != null)
				msgs = ((InternalEObject)objectType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_TYPE_REQUIRES_PRIMARY_SUPERTYPE_ERROR_TYPE__OBJECT_TYPE, null, msgs);
			if (newObjectType != null)
				msgs = ((InternalEObject)newObjectType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_TYPE_REQUIRES_PRIMARY_SUPERTYPE_ERROR_TYPE__OBJECT_TYPE, null, msgs);
			msgs = basicSetObjectType(newObjectType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_REQUIRES_PRIMARY_SUPERTYPE_ERROR_TYPE__OBJECT_TYPE, newObjectType, newObjectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.OBJECT_TYPE_REQUIRES_PRIMARY_SUPERTYPE_ERROR_TYPE__OBJECT_TYPE:
				return basicSetObjectType(null, msgs);
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
			case CorePackage.OBJECT_TYPE_REQUIRES_PRIMARY_SUPERTYPE_ERROR_TYPE__OBJECT_TYPE:
				return getObjectType();
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
			case CorePackage.OBJECT_TYPE_REQUIRES_PRIMARY_SUPERTYPE_ERROR_TYPE__OBJECT_TYPE:
				setObjectType((ObjectTypeRef)newValue);
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
			case CorePackage.OBJECT_TYPE_REQUIRES_PRIMARY_SUPERTYPE_ERROR_TYPE__OBJECT_TYPE:
				setObjectType((ObjectTypeRef)null);
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
			case CorePackage.OBJECT_TYPE_REQUIRES_PRIMARY_SUPERTYPE_ERROR_TYPE__OBJECT_TYPE:
				return objectType != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectTypeRequiresPrimarySupertypeErrorTypeImpl
