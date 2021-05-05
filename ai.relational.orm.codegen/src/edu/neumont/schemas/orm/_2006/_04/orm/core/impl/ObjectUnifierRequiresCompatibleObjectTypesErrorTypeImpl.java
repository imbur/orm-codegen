/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifierRef;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifierRequiresCompatibleObjectTypesErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Unifier Requires Compatible Object Types Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectUnifierRequiresCompatibleObjectTypesErrorTypeImpl#getObjectUnifier <em>Object Unifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectUnifierRequiresCompatibleObjectTypesErrorTypeImpl extends ModelErrorImpl implements ObjectUnifierRequiresCompatibleObjectTypesErrorType {
	/**
	 * The cached value of the '{@link #getObjectUnifier() <em>Object Unifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectUnifier()
	 * @generated
	 * @ordered
	 */
	protected ObjectUnifierRef objectUnifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectUnifierRequiresCompatibleObjectTypesErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getObjectUnifierRequiresCompatibleObjectTypesErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectUnifierRef getObjectUnifier() {
		return objectUnifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectUnifier(ObjectUnifierRef newObjectUnifier, NotificationChain msgs) {
		ObjectUnifierRef oldObjectUnifier = objectUnifier;
		objectUnifier = newObjectUnifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_UNIFIER_REQUIRES_COMPATIBLE_OBJECT_TYPES_ERROR_TYPE__OBJECT_UNIFIER, oldObjectUnifier, newObjectUnifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectUnifier(ObjectUnifierRef newObjectUnifier) {
		if (newObjectUnifier != objectUnifier) {
			NotificationChain msgs = null;
			if (objectUnifier != null)
				msgs = ((InternalEObject)objectUnifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_UNIFIER_REQUIRES_COMPATIBLE_OBJECT_TYPES_ERROR_TYPE__OBJECT_UNIFIER, null, msgs);
			if (newObjectUnifier != null)
				msgs = ((InternalEObject)newObjectUnifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_UNIFIER_REQUIRES_COMPATIBLE_OBJECT_TYPES_ERROR_TYPE__OBJECT_UNIFIER, null, msgs);
			msgs = basicSetObjectUnifier(newObjectUnifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_UNIFIER_REQUIRES_COMPATIBLE_OBJECT_TYPES_ERROR_TYPE__OBJECT_UNIFIER, newObjectUnifier, newObjectUnifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.OBJECT_UNIFIER_REQUIRES_COMPATIBLE_OBJECT_TYPES_ERROR_TYPE__OBJECT_UNIFIER:
				return basicSetObjectUnifier(null, msgs);
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
			case CorePackage.OBJECT_UNIFIER_REQUIRES_COMPATIBLE_OBJECT_TYPES_ERROR_TYPE__OBJECT_UNIFIER:
				return getObjectUnifier();
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
			case CorePackage.OBJECT_UNIFIER_REQUIRES_COMPATIBLE_OBJECT_TYPES_ERROR_TYPE__OBJECT_UNIFIER:
				setObjectUnifier((ObjectUnifierRef)newValue);
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
			case CorePackage.OBJECT_UNIFIER_REQUIRES_COMPATIBLE_OBJECT_TYPES_ERROR_TYPE__OBJECT_UNIFIER:
				setObjectUnifier((ObjectUnifierRef)null);
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
			case CorePackage.OBJECT_UNIFIER_REQUIRES_COMPATIBLE_OBJECT_TYPES_ERROR_TYPE__OBJECT_UNIFIER:
				return objectUnifier != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectUnifierRequiresCompatibleObjectTypesErrorTypeImpl
