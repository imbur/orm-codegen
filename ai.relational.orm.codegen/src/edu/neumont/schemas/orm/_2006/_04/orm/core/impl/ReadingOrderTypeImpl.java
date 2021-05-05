/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ReadingOrderType;
import edu.neumont.schemas.orm._2006._04.orm.core.ReadingRoleSequenceType;
import edu.neumont.schemas.orm._2006._04.orm.core.ReadingsType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reading Order Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ReadingOrderTypeImpl#getReadings <em>Readings</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ReadingOrderTypeImpl#getRoleSequence <em>Role Sequence</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ReadingOrderTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadingOrderTypeImpl extends MinimalEObjectImpl.Container implements ReadingOrderType {
	/**
	 * The cached value of the '{@link #getReadings() <em>Readings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadings()
	 * @generated
	 * @ordered
	 */
	protected ReadingsType1 readings;

	/**
	 * The cached value of the '{@link #getRoleSequence() <em>Role Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleSequence()
	 * @generated
	 * @ordered
	 */
	protected ReadingRoleSequenceType roleSequence;

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
	protected ReadingOrderTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getReadingOrderType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingsType1 getReadings() {
		return readings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadings(ReadingsType1 newReadings, NotificationChain msgs) {
		ReadingsType1 oldReadings = readings;
		readings = newReadings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.READING_ORDER_TYPE__READINGS, oldReadings, newReadings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadings(ReadingsType1 newReadings) {
		if (newReadings != readings) {
			NotificationChain msgs = null;
			if (readings != null)
				msgs = ((InternalEObject)readings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.READING_ORDER_TYPE__READINGS, null, msgs);
			if (newReadings != null)
				msgs = ((InternalEObject)newReadings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.READING_ORDER_TYPE__READINGS, null, msgs);
			msgs = basicSetReadings(newReadings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.READING_ORDER_TYPE__READINGS, newReadings, newReadings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingRoleSequenceType getRoleSequence() {
		return roleSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleSequence(ReadingRoleSequenceType newRoleSequence, NotificationChain msgs) {
		ReadingRoleSequenceType oldRoleSequence = roleSequence;
		roleSequence = newRoleSequence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.READING_ORDER_TYPE__ROLE_SEQUENCE, oldRoleSequence, newRoleSequence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleSequence(ReadingRoleSequenceType newRoleSequence) {
		if (newRoleSequence != roleSequence) {
			NotificationChain msgs = null;
			if (roleSequence != null)
				msgs = ((InternalEObject)roleSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.READING_ORDER_TYPE__ROLE_SEQUENCE, null, msgs);
			if (newRoleSequence != null)
				msgs = ((InternalEObject)newRoleSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.READING_ORDER_TYPE__ROLE_SEQUENCE, null, msgs);
			msgs = basicSetRoleSequence(newRoleSequence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.READING_ORDER_TYPE__ROLE_SEQUENCE, newRoleSequence, newRoleSequence));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.READING_ORDER_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.READING_ORDER_TYPE__READINGS:
				return basicSetReadings(null, msgs);
			case CorePackage.READING_ORDER_TYPE__ROLE_SEQUENCE:
				return basicSetRoleSequence(null, msgs);
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
			case CorePackage.READING_ORDER_TYPE__READINGS:
				return getReadings();
			case CorePackage.READING_ORDER_TYPE__ROLE_SEQUENCE:
				return getRoleSequence();
			case CorePackage.READING_ORDER_TYPE__ID:
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
			case CorePackage.READING_ORDER_TYPE__READINGS:
				setReadings((ReadingsType1)newValue);
				return;
			case CorePackage.READING_ORDER_TYPE__ROLE_SEQUENCE:
				setRoleSequence((ReadingRoleSequenceType)newValue);
				return;
			case CorePackage.READING_ORDER_TYPE__ID:
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
			case CorePackage.READING_ORDER_TYPE__READINGS:
				setReadings((ReadingsType1)null);
				return;
			case CorePackage.READING_ORDER_TYPE__ROLE_SEQUENCE:
				setRoleSequence((ReadingRoleSequenceType)null);
				return;
			case CorePackage.READING_ORDER_TYPE__ID:
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
			case CorePackage.READING_ORDER_TYPE__READINGS:
				return readings != null;
			case CorePackage.READING_ORDER_TYPE__ROLE_SEQUENCE:
				return roleSequence != null;
			case CorePackage.READING_ORDER_TYPE__ID:
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

} //ReadingOrderTypeImpl
