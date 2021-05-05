/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.InputFromType;
import edu.neumont.schemas.orm._2006._04.orm.core.SubqueryParameterInputType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subquery Parameter Input Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SubqueryParameterInputTypeImpl#getInputFrom <em>Input From</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SubqueryParameterInputTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SubqueryParameterInputTypeImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubqueryParameterInputTypeImpl extends MinimalEObjectImpl.Container implements SubqueryParameterInputType {
	/**
	 * The cached value of the '{@link #getInputFrom() <em>Input From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputFrom()
	 * @generated
	 * @ordered
	 */
	protected InputFromType inputFrom;

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
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubqueryParameterInputTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getSubqueryParameterInputType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputFromType getInputFrom() {
		return inputFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputFrom(InputFromType newInputFrom, NotificationChain msgs) {
		InputFromType oldInputFrom = inputFrom;
		inputFrom = newInputFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__INPUT_FROM, oldInputFrom, newInputFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFrom(InputFromType newInputFrom) {
		if (newInputFrom != inputFrom) {
			NotificationChain msgs = null;
			if (inputFrom != null)
				msgs = ((InternalEObject)inputFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__INPUT_FROM, null, msgs);
			if (newInputFrom != null)
				msgs = ((InternalEObject)newInputFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__INPUT_FROM, null, msgs);
			msgs = basicSetInputFrom(newInputFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__INPUT_FROM, newInputFrom, newInputFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__INPUT_FROM:
				return basicSetInputFrom(null, msgs);
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
			case CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__INPUT_FROM:
				return getInputFrom();
			case CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__ID:
				return getId();
			case CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__REF:
				return getRef();
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
			case CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__INPUT_FROM:
				setInputFrom((InputFromType)newValue);
				return;
			case CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__ID:
				setId((String)newValue);
				return;
			case CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__REF:
				setRef((String)newValue);
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
			case CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__INPUT_FROM:
				setInputFrom((InputFromType)null);
				return;
			case CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__REF:
				setRef(REF_EDEFAULT);
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
			case CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__INPUT_FROM:
				return inputFrom != null;
			case CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.SUBQUERY_PARAMETER_INPUT_TYPE__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
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
		result.append(", ref: ");
		result.append(ref);
		result.append(')');
		return result.toString();
	}

} //SubqueryParameterInputTypeImpl
