/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DuplicateReadingSignatureErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ReadingsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duplicate Reading Signature Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DuplicateReadingSignatureErrorTypeImpl#getReadings <em>Readings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DuplicateReadingSignatureErrorTypeImpl extends ModelErrorImpl implements DuplicateReadingSignatureErrorType {
	/**
	 * The cached value of the '{@link #getReadings() <em>Readings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadings()
	 * @generated
	 * @ordered
	 */
	protected ReadingsType readings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DuplicateReadingSignatureErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getDuplicateReadingSignatureErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingsType getReadings() {
		return readings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadings(ReadingsType newReadings, NotificationChain msgs) {
		ReadingsType oldReadings = readings;
		readings = newReadings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.DUPLICATE_READING_SIGNATURE_ERROR_TYPE__READINGS, oldReadings, newReadings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadings(ReadingsType newReadings) {
		if (newReadings != readings) {
			NotificationChain msgs = null;
			if (readings != null)
				msgs = ((InternalEObject)readings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.DUPLICATE_READING_SIGNATURE_ERROR_TYPE__READINGS, null, msgs);
			if (newReadings != null)
				msgs = ((InternalEObject)newReadings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.DUPLICATE_READING_SIGNATURE_ERROR_TYPE__READINGS, null, msgs);
			msgs = basicSetReadings(newReadings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DUPLICATE_READING_SIGNATURE_ERROR_TYPE__READINGS, newReadings, newReadings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DUPLICATE_READING_SIGNATURE_ERROR_TYPE__READINGS:
				return basicSetReadings(null, msgs);
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
			case CorePackage.DUPLICATE_READING_SIGNATURE_ERROR_TYPE__READINGS:
				return getReadings();
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
			case CorePackage.DUPLICATE_READING_SIGNATURE_ERROR_TYPE__READINGS:
				setReadings((ReadingsType)newValue);
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
			case CorePackage.DUPLICATE_READING_SIGNATURE_ERROR_TYPE__READINGS:
				setReadings((ReadingsType)null);
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
			case CorePackage.DUPLICATE_READING_SIGNATURE_ERROR_TYPE__READINGS:
				return readings != null;
		}
		return super.eIsSet(featureID);
	}

} //DuplicateReadingSignatureErrorTypeImpl
