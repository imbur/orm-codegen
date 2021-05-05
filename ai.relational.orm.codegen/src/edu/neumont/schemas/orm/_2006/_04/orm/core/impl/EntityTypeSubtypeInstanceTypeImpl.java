/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeInstanceRef;
import edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeSubtypeInstanceType;
import edu.neumont.schemas.orm._2006._04.orm.core.ExtensionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstanceRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Type Subtype Instance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.EntityTypeSubtypeInstanceTypeImpl#getSupertypeInstance <em>Supertype Instance</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.EntityTypeSubtypeInstanceTypeImpl#getObjectifiedInstance <em>Objectified Instance</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.EntityTypeSubtypeInstanceTypeImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.EntityTypeSubtypeInstanceTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityTypeSubtypeInstanceTypeImpl extends MinimalEObjectImpl.Container implements EntityTypeSubtypeInstanceType {
	/**
	 * The cached value of the '{@link #getSupertypeInstance() <em>Supertype Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupertypeInstance()
	 * @generated
	 * @ordered
	 */
	protected EntityTypeInstanceRef supertypeInstance;

	/**
	 * The cached value of the '{@link #getObjectifiedInstance() <em>Objectified Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectifiedInstance()
	 * @generated
	 * @ordered
	 */
	protected FactTypeInstanceRef objectifiedInstance;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected ExtensionsType extensions;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTypeSubtypeInstanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getEntityTypeSubtypeInstanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityTypeInstanceRef getSupertypeInstance() {
		return supertypeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupertypeInstance(EntityTypeInstanceRef newSupertypeInstance, NotificationChain msgs) {
		EntityTypeInstanceRef oldSupertypeInstance = supertypeInstance;
		supertypeInstance = newSupertypeInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__SUPERTYPE_INSTANCE, oldSupertypeInstance, newSupertypeInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupertypeInstance(EntityTypeInstanceRef newSupertypeInstance) {
		if (newSupertypeInstance != supertypeInstance) {
			NotificationChain msgs = null;
			if (supertypeInstance != null)
				msgs = ((InternalEObject)supertypeInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__SUPERTYPE_INSTANCE, null, msgs);
			if (newSupertypeInstance != null)
				msgs = ((InternalEObject)newSupertypeInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__SUPERTYPE_INSTANCE, null, msgs);
			msgs = basicSetSupertypeInstance(newSupertypeInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__SUPERTYPE_INSTANCE, newSupertypeInstance, newSupertypeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeInstanceRef getObjectifiedInstance() {
		return objectifiedInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectifiedInstance(FactTypeInstanceRef newObjectifiedInstance, NotificationChain msgs) {
		FactTypeInstanceRef oldObjectifiedInstance = objectifiedInstance;
		objectifiedInstance = newObjectifiedInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__OBJECTIFIED_INSTANCE, oldObjectifiedInstance, newObjectifiedInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectifiedInstance(FactTypeInstanceRef newObjectifiedInstance) {
		if (newObjectifiedInstance != objectifiedInstance) {
			NotificationChain msgs = null;
			if (objectifiedInstance != null)
				msgs = ((InternalEObject)objectifiedInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__OBJECTIFIED_INSTANCE, null, msgs);
			if (newObjectifiedInstance != null)
				msgs = ((InternalEObject)newObjectifiedInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__OBJECTIFIED_INSTANCE, null, msgs);
			msgs = basicSetObjectifiedInstance(newObjectifiedInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__OBJECTIFIED_INSTANCE, newObjectifiedInstance, newObjectifiedInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsType getExtensions() {
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensions(ExtensionsType newExtensions, NotificationChain msgs) {
		ExtensionsType oldExtensions = extensions;
		extensions = newExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__EXTENSIONS, oldExtensions, newExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensions(ExtensionsType newExtensions) {
		if (newExtensions != extensions) {
			NotificationChain msgs = null;
			if (extensions != null)
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__SUPERTYPE_INSTANCE:
				return basicSetSupertypeInstance(null, msgs);
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__OBJECTIFIED_INSTANCE:
				return basicSetObjectifiedInstance(null, msgs);
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__EXTENSIONS:
				return basicSetExtensions(null, msgs);
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
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__SUPERTYPE_INSTANCE:
				return getSupertypeInstance();
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__OBJECTIFIED_INSTANCE:
				return getObjectifiedInstance();
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__EXTENSIONS:
				return getExtensions();
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__ID:
				return getId();
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
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__SUPERTYPE_INSTANCE:
				setSupertypeInstance((EntityTypeInstanceRef)newValue);
				return;
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__OBJECTIFIED_INSTANCE:
				setObjectifiedInstance((FactTypeInstanceRef)newValue);
				return;
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
				return;
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__ID:
				setId((String)newValue);
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
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__SUPERTYPE_INSTANCE:
				setSupertypeInstance((EntityTypeInstanceRef)null);
				return;
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__OBJECTIFIED_INSTANCE:
				setObjectifiedInstance((FactTypeInstanceRef)null);
				return;
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)null);
				return;
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__SUPERTYPE_INSTANCE:
				return supertypeInstance != null;
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__OBJECTIFIED_INSTANCE:
				return objectifiedInstance != null;
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__EXTENSIONS:
				return extensions != null;
			case CorePackage.ENTITY_TYPE_SUBTYPE_INSTANCE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //EntityTypeSubtypeInstanceTypeImpl
