/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DataTypeNotSpecifiedErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.DataTypeRefRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type Not Specified Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypeNotSpecifiedErrorTypeImpl#getConceptualDataType <em>Conceptual Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeNotSpecifiedErrorTypeImpl extends ModelErrorImpl implements DataTypeNotSpecifiedErrorType {
	/**
	 * The cached value of the '{@link #getConceptualDataType() <em>Conceptual Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptualDataType()
	 * @generated
	 * @ordered
	 */
	protected DataTypeRefRef conceptualDataType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeNotSpecifiedErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getDataTypeNotSpecifiedErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeRefRef getConceptualDataType() {
		return conceptualDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConceptualDataType(DataTypeRefRef newConceptualDataType, NotificationChain msgs) {
		DataTypeRefRef oldConceptualDataType = conceptualDataType;
		conceptualDataType = newConceptualDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.DATA_TYPE_NOT_SPECIFIED_ERROR_TYPE__CONCEPTUAL_DATA_TYPE, oldConceptualDataType, newConceptualDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConceptualDataType(DataTypeRefRef newConceptualDataType) {
		if (newConceptualDataType != conceptualDataType) {
			NotificationChain msgs = null;
			if (conceptualDataType != null)
				msgs = ((InternalEObject)conceptualDataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.DATA_TYPE_NOT_SPECIFIED_ERROR_TYPE__CONCEPTUAL_DATA_TYPE, null, msgs);
			if (newConceptualDataType != null)
				msgs = ((InternalEObject)newConceptualDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.DATA_TYPE_NOT_SPECIFIED_ERROR_TYPE__CONCEPTUAL_DATA_TYPE, null, msgs);
			msgs = basicSetConceptualDataType(newConceptualDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DATA_TYPE_NOT_SPECIFIED_ERROR_TYPE__CONCEPTUAL_DATA_TYPE, newConceptualDataType, newConceptualDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DATA_TYPE_NOT_SPECIFIED_ERROR_TYPE__CONCEPTUAL_DATA_TYPE:
				return basicSetConceptualDataType(null, msgs);
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
			case CorePackage.DATA_TYPE_NOT_SPECIFIED_ERROR_TYPE__CONCEPTUAL_DATA_TYPE:
				return getConceptualDataType();
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
			case CorePackage.DATA_TYPE_NOT_SPECIFIED_ERROR_TYPE__CONCEPTUAL_DATA_TYPE:
				setConceptualDataType((DataTypeRefRef)newValue);
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
			case CorePackage.DATA_TYPE_NOT_SPECIFIED_ERROR_TYPE__CONCEPTUAL_DATA_TYPE:
				setConceptualDataType((DataTypeRefRef)null);
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
			case CorePackage.DATA_TYPE_NOT_SPECIFIED_ERROR_TYPE__CONCEPTUAL_DATA_TYPE:
				return conceptualDataType != null;
		}
		return super.eIsSet(featureID);
	}

} //DataTypeNotSpecifiedErrorTypeImpl
