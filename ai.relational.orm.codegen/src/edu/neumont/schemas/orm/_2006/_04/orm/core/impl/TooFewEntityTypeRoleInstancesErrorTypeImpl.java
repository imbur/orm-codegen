/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeInstanceRef;
import edu.neumont.schemas.orm._2006._04.orm.core.TooFewEntityTypeRoleInstancesErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Too Few Entity Type Role Instances Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.TooFewEntityTypeRoleInstancesErrorTypeImpl#getEntityTypeInstance <em>Entity Type Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TooFewEntityTypeRoleInstancesErrorTypeImpl extends ModelErrorImpl implements TooFewEntityTypeRoleInstancesErrorType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TooFewEntityTypeRoleInstancesErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getTooFewEntityTypeRoleInstancesErrorType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.TOO_FEW_ENTITY_TYPE_ROLE_INSTANCES_ERROR_TYPE__ENTITY_TYPE_INSTANCE, oldEntityTypeInstance, newEntityTypeInstance);
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
				msgs = ((InternalEObject)entityTypeInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.TOO_FEW_ENTITY_TYPE_ROLE_INSTANCES_ERROR_TYPE__ENTITY_TYPE_INSTANCE, null, msgs);
			if (newEntityTypeInstance != null)
				msgs = ((InternalEObject)newEntityTypeInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.TOO_FEW_ENTITY_TYPE_ROLE_INSTANCES_ERROR_TYPE__ENTITY_TYPE_INSTANCE, null, msgs);
			msgs = basicSetEntityTypeInstance(newEntityTypeInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TOO_FEW_ENTITY_TYPE_ROLE_INSTANCES_ERROR_TYPE__ENTITY_TYPE_INSTANCE, newEntityTypeInstance, newEntityTypeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.TOO_FEW_ENTITY_TYPE_ROLE_INSTANCES_ERROR_TYPE__ENTITY_TYPE_INSTANCE:
				return basicSetEntityTypeInstance(null, msgs);
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
			case CorePackage.TOO_FEW_ENTITY_TYPE_ROLE_INSTANCES_ERROR_TYPE__ENTITY_TYPE_INSTANCE:
				return getEntityTypeInstance();
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
			case CorePackage.TOO_FEW_ENTITY_TYPE_ROLE_INSTANCES_ERROR_TYPE__ENTITY_TYPE_INSTANCE:
				setEntityTypeInstance((EntityTypeInstanceRef)newValue);
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
			case CorePackage.TOO_FEW_ENTITY_TYPE_ROLE_INSTANCES_ERROR_TYPE__ENTITY_TYPE_INSTANCE:
				setEntityTypeInstance((EntityTypeInstanceRef)null);
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
			case CorePackage.TOO_FEW_ENTITY_TYPE_ROLE_INSTANCES_ERROR_TYPE__ENTITY_TYPE_INSTANCE:
				return entityTypeInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //TooFewEntityTypeRoleInstancesErrorTypeImpl
