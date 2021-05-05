/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeInstanceRef;
import edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeSubtypeInstanceRef;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedInstanceRequiredErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objectified Instance Required Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectifiedInstanceRequiredErrorTypeImpl#getEntityTypeInstance <em>Entity Type Instance</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectifiedInstanceRequiredErrorTypeImpl#getEntityTypeSubtypeInstance <em>Entity Type Subtype Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectifiedInstanceRequiredErrorTypeImpl extends ModelErrorImpl implements ObjectifiedInstanceRequiredErrorType {
	/**
	 * The cached value of the '{@link #getEntityTypeInstance() <em>Entity Type Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityTypeInstance()
	 * @generated
	 * @ordered
	 */
	protected EntityTypeInstanceRef entityTypeInstance;

	/**
	 * The cached value of the '{@link #getEntityTypeSubtypeInstance() <em>Entity Type Subtype Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityTypeSubtypeInstance()
	 * @generated
	 * @ordered
	 */
	protected EntityTypeSubtypeInstanceRef entityTypeSubtypeInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectifiedInstanceRequiredErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getObjectifiedInstanceRequiredErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityTypeInstanceRef getEntityTypeInstance() {
		return entityTypeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntityTypeInstance(EntityTypeInstanceRef newEntityTypeInstance, NotificationChain msgs) {
		EntityTypeInstanceRef oldEntityTypeInstance = entityTypeInstance;
		entityTypeInstance = newEntityTypeInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE__ENTITY_TYPE_INSTANCE, oldEntityTypeInstance, newEntityTypeInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityTypeInstance(EntityTypeInstanceRef newEntityTypeInstance) {
		if (newEntityTypeInstance != entityTypeInstance) {
			NotificationChain msgs = null;
			if (entityTypeInstance != null)
				msgs = ((InternalEObject)entityTypeInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE__ENTITY_TYPE_INSTANCE, null, msgs);
			if (newEntityTypeInstance != null)
				msgs = ((InternalEObject)newEntityTypeInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE__ENTITY_TYPE_INSTANCE, null, msgs);
			msgs = basicSetEntityTypeInstance(newEntityTypeInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE__ENTITY_TYPE_INSTANCE, newEntityTypeInstance, newEntityTypeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityTypeSubtypeInstanceRef getEntityTypeSubtypeInstance() {
		return entityTypeSubtypeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntityTypeSubtypeInstance(EntityTypeSubtypeInstanceRef newEntityTypeSubtypeInstance, NotificationChain msgs) {
		EntityTypeSubtypeInstanceRef oldEntityTypeSubtypeInstance = entityTypeSubtypeInstance;
		entityTypeSubtypeInstance = newEntityTypeSubtypeInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE__ENTITY_TYPE_SUBTYPE_INSTANCE, oldEntityTypeSubtypeInstance, newEntityTypeSubtypeInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityTypeSubtypeInstance(EntityTypeSubtypeInstanceRef newEntityTypeSubtypeInstance) {
		if (newEntityTypeSubtypeInstance != entityTypeSubtypeInstance) {
			NotificationChain msgs = null;
			if (entityTypeSubtypeInstance != null)
				msgs = ((InternalEObject)entityTypeSubtypeInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE__ENTITY_TYPE_SUBTYPE_INSTANCE, null, msgs);
			if (newEntityTypeSubtypeInstance != null)
				msgs = ((InternalEObject)newEntityTypeSubtypeInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE__ENTITY_TYPE_SUBTYPE_INSTANCE, null, msgs);
			msgs = basicSetEntityTypeSubtypeInstance(newEntityTypeSubtypeInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE__ENTITY_TYPE_SUBTYPE_INSTANCE, newEntityTypeSubtypeInstance, newEntityTypeSubtypeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE__ENTITY_TYPE_INSTANCE:
				return basicSetEntityTypeInstance(null, msgs);
			case CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE__ENTITY_TYPE_SUBTYPE_INSTANCE:
				return basicSetEntityTypeSubtypeInstance(null, msgs);
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
			case CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE__ENTITY_TYPE_INSTANCE:
				return getEntityTypeInstance();
			case CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE__ENTITY_TYPE_SUBTYPE_INSTANCE:
				return getEntityTypeSubtypeInstance();
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
			case CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE__ENTITY_TYPE_INSTANCE:
				setEntityTypeInstance((EntityTypeInstanceRef)newValue);
				return;
			case CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE__ENTITY_TYPE_SUBTYPE_INSTANCE:
				setEntityTypeSubtypeInstance((EntityTypeSubtypeInstanceRef)newValue);
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
			case CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE__ENTITY_TYPE_INSTANCE:
				setEntityTypeInstance((EntityTypeInstanceRef)null);
				return;
			case CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE__ENTITY_TYPE_SUBTYPE_INSTANCE:
				setEntityTypeSubtypeInstance((EntityTypeSubtypeInstanceRef)null);
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
			case CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE__ENTITY_TYPE_INSTANCE:
				return entityTypeInstance != null;
			case CorePackage.OBJECTIFIED_INSTANCE_REQUIRED_ERROR_TYPE__ENTITY_TYPE_SUBTYPE_INSTANCE:
				return entityTypeSubtypeInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //ObjectifiedInstanceRequiredErrorTypeImpl
