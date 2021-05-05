/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.CustomReferenceModeType;
import edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Reference Mode Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CustomReferenceModeTypeImpl#getCustomFormatString <em>Custom Format String</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CustomReferenceModeTypeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CustomReferenceModeTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CustomReferenceModeTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomReferenceModeTypeImpl extends MinimalEObjectImpl.Container implements CustomReferenceModeType {
	/**
	 * The default value of the '{@link #getCustomFormatString() <em>Custom Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomFormatString()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_FORMAT_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomFormatString() <em>Custom Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomFormatString()
	 * @generated
	 * @ordered
	 */
	protected String customFormatString = CUSTOM_FORMAT_STRING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ReferenceModeKindRef kind;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomReferenceModeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getCustomReferenceModeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomFormatString() {
		return customFormatString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomFormatString(String newCustomFormatString) {
		String oldCustomFormatString = customFormatString;
		customFormatString = newCustomFormatString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CUSTOM_REFERENCE_MODE_TYPE__CUSTOM_FORMAT_STRING, oldCustomFormatString, customFormatString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceModeKindRef getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKind(ReferenceModeKindRef newKind, NotificationChain msgs) {
		ReferenceModeKindRef oldKind = kind;
		kind = newKind;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CUSTOM_REFERENCE_MODE_TYPE__KIND, oldKind, newKind);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ReferenceModeKindRef newKind) {
		if (newKind != kind) {
			NotificationChain msgs = null;
			if (kind != null)
				msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CUSTOM_REFERENCE_MODE_TYPE__KIND, null, msgs);
			if (newKind != null)
				msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CUSTOM_REFERENCE_MODE_TYPE__KIND, null, msgs);
			msgs = basicSetKind(newKind, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CUSTOM_REFERENCE_MODE_TYPE__KIND, newKind, newKind));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CUSTOM_REFERENCE_MODE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CUSTOM_REFERENCE_MODE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE__KIND:
				return basicSetKind(null, msgs);
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
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE__CUSTOM_FORMAT_STRING:
				return getCustomFormatString();
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE__KIND:
				return getKind();
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE__ID:
				return getId();
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE__NAME:
				return getName();
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
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE__CUSTOM_FORMAT_STRING:
				setCustomFormatString((String)newValue);
				return;
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE__KIND:
				setKind((ReferenceModeKindRef)newValue);
				return;
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE__ID:
				setId((String)newValue);
				return;
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE__NAME:
				setName((String)newValue);
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
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE__CUSTOM_FORMAT_STRING:
				setCustomFormatString(CUSTOM_FORMAT_STRING_EDEFAULT);
				return;
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE__KIND:
				setKind((ReferenceModeKindRef)null);
				return;
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE__CUSTOM_FORMAT_STRING:
				return CUSTOM_FORMAT_STRING_EDEFAULT == null ? customFormatString != null : !CUSTOM_FORMAT_STRING_EDEFAULT.equals(customFormatString);
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE__KIND:
				return kind != null;
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.CUSTOM_REFERENCE_MODE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (customFormatString: ");
		result.append(customFormatString);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CustomReferenceModeTypeImpl
