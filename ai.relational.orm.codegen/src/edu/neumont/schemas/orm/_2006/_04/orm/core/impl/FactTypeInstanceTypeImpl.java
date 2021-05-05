/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ExtensionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstanceType;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRoleInstancesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fact Type Instance Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeInstanceTypeImpl#getRoleInstances <em>Role Instances</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeInstanceTypeImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeInstanceTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactTypeInstanceTypeImpl extends MinimalEObjectImpl.Container implements FactTypeInstanceType {
	/**
	 * The cached value of the '{@link #getRoleInstances() <em>Role Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleInstances()
	 * @generated
	 * @ordered
	 */
	protected FactTypeRoleInstancesType roleInstances;

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
	protected FactTypeInstanceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getFactTypeInstanceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeRoleInstancesType getRoleInstances() {
		return roleInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleInstances(FactTypeRoleInstancesType newRoleInstances, NotificationChain msgs) {
		FactTypeRoleInstancesType oldRoleInstances = roleInstances;
		roleInstances = newRoleInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_INSTANCE_TYPE__ROLE_INSTANCES, oldRoleInstances, newRoleInstances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleInstances(FactTypeRoleInstancesType newRoleInstances) {
		if (newRoleInstances != roleInstances) {
			NotificationChain msgs = null;
			if (roleInstances != null)
				msgs = ((InternalEObject)roleInstances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_INSTANCE_TYPE__ROLE_INSTANCES, null, msgs);
			if (newRoleInstances != null)
				msgs = ((InternalEObject)newRoleInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_INSTANCE_TYPE__ROLE_INSTANCES, null, msgs);
			msgs = basicSetRoleInstances(newRoleInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_INSTANCE_TYPE__ROLE_INSTANCES, newRoleInstances, newRoleInstances));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_INSTANCE_TYPE__EXTENSIONS, oldExtensions, newExtensions);
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
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_INSTANCE_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_INSTANCE_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_INSTANCE_TYPE__EXTENSIONS, newExtensions, newExtensions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_INSTANCE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FACT_TYPE_INSTANCE_TYPE__ROLE_INSTANCES:
				return basicSetRoleInstances(null, msgs);
			case CorePackage.FACT_TYPE_INSTANCE_TYPE__EXTENSIONS:
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
			case CorePackage.FACT_TYPE_INSTANCE_TYPE__ROLE_INSTANCES:
				return getRoleInstances();
			case CorePackage.FACT_TYPE_INSTANCE_TYPE__EXTENSIONS:
				return getExtensions();
			case CorePackage.FACT_TYPE_INSTANCE_TYPE__ID:
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
			case CorePackage.FACT_TYPE_INSTANCE_TYPE__ROLE_INSTANCES:
				setRoleInstances((FactTypeRoleInstancesType)newValue);
				return;
			case CorePackage.FACT_TYPE_INSTANCE_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
				return;
			case CorePackage.FACT_TYPE_INSTANCE_TYPE__ID:
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
			case CorePackage.FACT_TYPE_INSTANCE_TYPE__ROLE_INSTANCES:
				setRoleInstances((FactTypeRoleInstancesType)null);
				return;
			case CorePackage.FACT_TYPE_INSTANCE_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)null);
				return;
			case CorePackage.FACT_TYPE_INSTANCE_TYPE__ID:
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
			case CorePackage.FACT_TYPE_INSTANCE_TYPE__ROLE_INSTANCES:
				return roleInstances != null;
			case CorePackage.FACT_TYPE_INSTANCE_TYPE__EXTENSIONS:
				return extensions != null;
			case CorePackage.FACT_TYPE_INSTANCE_TYPE__ID:
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

} //FactTypeInstanceTypeImpl
