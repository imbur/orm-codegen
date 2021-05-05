/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeRequiresReferenceSchemeErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Type Requires Reference Scheme Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.EntityTypeRequiresReferenceSchemeErrorTypeImpl#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityTypeRequiresReferenceSchemeErrorTypeImpl extends ModelErrorImpl implements EntityTypeRequiresReferenceSchemeErrorType {
	/**
	 * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityType()
	 * @generated
	 * @ordered
	 */
	protected ObjectTypeRef entityType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTypeRequiresReferenceSchemeErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getEntityTypeRequiresReferenceSchemeErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeRef getEntityType() {
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntityType(ObjectTypeRef newEntityType, NotificationChain msgs) {
		ObjectTypeRef oldEntityType = entityType;
		entityType = newEntityType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ENTITY_TYPE_REQUIRES_REFERENCE_SCHEME_ERROR_TYPE__ENTITY_TYPE, oldEntityType, newEntityType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityType(ObjectTypeRef newEntityType) {
		if (newEntityType != entityType) {
			NotificationChain msgs = null;
			if (entityType != null)
				msgs = ((InternalEObject)entityType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ENTITY_TYPE_REQUIRES_REFERENCE_SCHEME_ERROR_TYPE__ENTITY_TYPE, null, msgs);
			if (newEntityType != null)
				msgs = ((InternalEObject)newEntityType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ENTITY_TYPE_REQUIRES_REFERENCE_SCHEME_ERROR_TYPE__ENTITY_TYPE, null, msgs);
			msgs = basicSetEntityType(newEntityType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ENTITY_TYPE_REQUIRES_REFERENCE_SCHEME_ERROR_TYPE__ENTITY_TYPE, newEntityType, newEntityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ENTITY_TYPE_REQUIRES_REFERENCE_SCHEME_ERROR_TYPE__ENTITY_TYPE:
				return basicSetEntityType(null, msgs);
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
			case CorePackage.ENTITY_TYPE_REQUIRES_REFERENCE_SCHEME_ERROR_TYPE__ENTITY_TYPE:
				return getEntityType();
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
			case CorePackage.ENTITY_TYPE_REQUIRES_REFERENCE_SCHEME_ERROR_TYPE__ENTITY_TYPE:
				setEntityType((ObjectTypeRef)newValue);
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
			case CorePackage.ENTITY_TYPE_REQUIRES_REFERENCE_SCHEME_ERROR_TYPE__ENTITY_TYPE:
				setEntityType((ObjectTypeRef)null);
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
			case CorePackage.ENTITY_TYPE_REQUIRES_REFERENCE_SCHEME_ERROR_TYPE__ENTITY_TYPE:
				return entityType != null;
		}
		return super.eIsSet(featureID);
	}

} //EntityTypeRequiresReferenceSchemeErrorTypeImpl
