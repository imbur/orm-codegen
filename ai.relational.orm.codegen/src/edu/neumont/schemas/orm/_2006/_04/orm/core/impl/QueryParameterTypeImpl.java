/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRef;
import edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterBindingsType;
import edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.QueryParameterTypeImpl#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.QueryParameterTypeImpl#getParameterBindings <em>Parameter Bindings</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.QueryParameterTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.QueryParameterTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryParameterTypeImpl extends MinimalEObjectImpl.Container implements QueryParameterType {
	/**
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected ObjectTypeRef parameterType;

	/**
	 * The cached value of the '{@link #getParameterBindings() <em>Parameter Bindings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterBindings()
	 * @generated
	 * @ordered
	 */
	protected QueryParameterBindingsType parameterBindings;

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
	protected QueryParameterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getQueryParameterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeRef getParameterType() {
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterType(ObjectTypeRef newParameterType, NotificationChain msgs) {
		ObjectTypeRef oldParameterType = parameterType;
		parameterType = newParameterType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_PARAMETER_TYPE__PARAMETER_TYPE, oldParameterType, newParameterType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterType(ObjectTypeRef newParameterType) {
		if (newParameterType != parameterType) {
			NotificationChain msgs = null;
			if (parameterType != null)
				msgs = ((InternalEObject)parameterType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_PARAMETER_TYPE__PARAMETER_TYPE, null, msgs);
			if (newParameterType != null)
				msgs = ((InternalEObject)newParameterType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_PARAMETER_TYPE__PARAMETER_TYPE, null, msgs);
			msgs = basicSetParameterType(newParameterType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_PARAMETER_TYPE__PARAMETER_TYPE, newParameterType, newParameterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParameterBindingsType getParameterBindings() {
		return parameterBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameterBindings(QueryParameterBindingsType newParameterBindings, NotificationChain msgs) {
		QueryParameterBindingsType oldParameterBindings = parameterBindings;
		parameterBindings = newParameterBindings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_PARAMETER_TYPE__PARAMETER_BINDINGS, oldParameterBindings, newParameterBindings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterBindings(QueryParameterBindingsType newParameterBindings) {
		if (newParameterBindings != parameterBindings) {
			NotificationChain msgs = null;
			if (parameterBindings != null)
				msgs = ((InternalEObject)parameterBindings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_PARAMETER_TYPE__PARAMETER_BINDINGS, null, msgs);
			if (newParameterBindings != null)
				msgs = ((InternalEObject)newParameterBindings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_PARAMETER_TYPE__PARAMETER_BINDINGS, null, msgs);
			msgs = basicSetParameterBindings(newParameterBindings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_PARAMETER_TYPE__PARAMETER_BINDINGS, newParameterBindings, newParameterBindings));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_PARAMETER_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_PARAMETER_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.QUERY_PARAMETER_TYPE__PARAMETER_TYPE:
				return basicSetParameterType(null, msgs);
			case CorePackage.QUERY_PARAMETER_TYPE__PARAMETER_BINDINGS:
				return basicSetParameterBindings(null, msgs);
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
			case CorePackage.QUERY_PARAMETER_TYPE__PARAMETER_TYPE:
				return getParameterType();
			case CorePackage.QUERY_PARAMETER_TYPE__PARAMETER_BINDINGS:
				return getParameterBindings();
			case CorePackage.QUERY_PARAMETER_TYPE__ID:
				return getId();
			case CorePackage.QUERY_PARAMETER_TYPE__NAME:
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
			case CorePackage.QUERY_PARAMETER_TYPE__PARAMETER_TYPE:
				setParameterType((ObjectTypeRef)newValue);
				return;
			case CorePackage.QUERY_PARAMETER_TYPE__PARAMETER_BINDINGS:
				setParameterBindings((QueryParameterBindingsType)newValue);
				return;
			case CorePackage.QUERY_PARAMETER_TYPE__ID:
				setId((String)newValue);
				return;
			case CorePackage.QUERY_PARAMETER_TYPE__NAME:
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
			case CorePackage.QUERY_PARAMETER_TYPE__PARAMETER_TYPE:
				setParameterType((ObjectTypeRef)null);
				return;
			case CorePackage.QUERY_PARAMETER_TYPE__PARAMETER_BINDINGS:
				setParameterBindings((QueryParameterBindingsType)null);
				return;
			case CorePackage.QUERY_PARAMETER_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.QUERY_PARAMETER_TYPE__NAME:
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
			case CorePackage.QUERY_PARAMETER_TYPE__PARAMETER_TYPE:
				return parameterType != null;
			case CorePackage.QUERY_PARAMETER_TYPE__PARAMETER_BINDINGS:
				return parameterBindings != null;
			case CorePackage.QUERY_PARAMETER_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.QUERY_PARAMETER_TYPE__NAME:
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //QueryParameterTypeImpl
