/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.AliasType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.AliasTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.AliasTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.AliasTypeImpl#getNameConsumer <em>Name Consumer</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.AliasTypeImpl#getNameUsage <em>Name Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AliasTypeImpl extends MinimalEObjectImpl.Container implements AliasType {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameConsumer() <em>Name Consumer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameConsumer()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_CONSUMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameConsumer() <em>Name Consumer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameConsumer()
	 * @generated
	 * @ordered
	 */
	protected String nameConsumer = NAME_CONSUMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameUsage() <em>Name Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameUsage() <em>Name Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameUsage()
	 * @generated
	 * @ordered
	 */
	protected String nameUsage = NAME_USAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AliasTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getAliasType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ALIAS_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ALIAS_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameConsumer() {
		return nameConsumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameConsumer(String newNameConsumer) {
		String oldNameConsumer = nameConsumer;
		nameConsumer = newNameConsumer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ALIAS_TYPE__NAME_CONSUMER, oldNameConsumer, nameConsumer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameUsage() {
		return nameUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameUsage(String newNameUsage) {
		String oldNameUsage = nameUsage;
		nameUsage = newNameUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ALIAS_TYPE__NAME_USAGE, oldNameUsage, nameUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ALIAS_TYPE__ID:
				return getId();
			case CorePackage.ALIAS_TYPE__NAME:
				return getName();
			case CorePackage.ALIAS_TYPE__NAME_CONSUMER:
				return getNameConsumer();
			case CorePackage.ALIAS_TYPE__NAME_USAGE:
				return getNameUsage();
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
			case CorePackage.ALIAS_TYPE__ID:
				setId((String)newValue);
				return;
			case CorePackage.ALIAS_TYPE__NAME:
				setName((String)newValue);
				return;
			case CorePackage.ALIAS_TYPE__NAME_CONSUMER:
				setNameConsumer((String)newValue);
				return;
			case CorePackage.ALIAS_TYPE__NAME_USAGE:
				setNameUsage((String)newValue);
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
			case CorePackage.ALIAS_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.ALIAS_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.ALIAS_TYPE__NAME_CONSUMER:
				setNameConsumer(NAME_CONSUMER_EDEFAULT);
				return;
			case CorePackage.ALIAS_TYPE__NAME_USAGE:
				setNameUsage(NAME_USAGE_EDEFAULT);
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
			case CorePackage.ALIAS_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.ALIAS_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.ALIAS_TYPE__NAME_CONSUMER:
				return NAME_CONSUMER_EDEFAULT == null ? nameConsumer != null : !NAME_CONSUMER_EDEFAULT.equals(nameConsumer);
			case CorePackage.ALIAS_TYPE__NAME_USAGE:
				return NAME_USAGE_EDEFAULT == null ? nameUsage != null : !NAME_USAGE_EDEFAULT.equals(nameUsage);
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
		result.append(", name: ");
		result.append(name);
		result.append(", nameConsumer: ");
		result.append(nameConsumer);
		result.append(", nameUsage: ");
		result.append(nameUsage);
		result.append(')');
		return result.toString();
	}

} //AliasTypeImpl
