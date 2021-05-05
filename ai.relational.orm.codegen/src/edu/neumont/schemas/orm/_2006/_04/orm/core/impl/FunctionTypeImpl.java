/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.FunctionType;
import edu.neumont.schemas.orm._2006._04.orm.core.ParametersType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FunctionTypeImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FunctionTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FunctionTypeImpl#isIsBoolean <em>Is Boolean</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FunctionTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FunctionTypeImpl#getOperatorSymbol <em>Operator Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionTypeImpl extends MinimalEObjectImpl.Container implements FunctionType {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected ParametersType parameters;

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
	 * The default value of the '{@link #isIsBoolean() <em>Is Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBoolean()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_BOOLEAN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsBoolean() <em>Is Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsBoolean()
	 * @generated
	 * @ordered
	 */
	protected boolean isBoolean = IS_BOOLEAN_EDEFAULT;

	/**
	 * This is true if the Is Boolean attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isBooleanESet;

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
	 * The default value of the '{@link #getOperatorSymbol() <em>Operator Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperatorSymbol() <em>Operator Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatorSymbol()
	 * @generated
	 * @ordered
	 */
	protected String operatorSymbol = OPERATOR_SYMBOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getFunctionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParametersType getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(ParametersType newParameters, NotificationChain msgs) {
		ParametersType oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FUNCTION_TYPE__PARAMETERS, oldParameters, newParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(ParametersType newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FUNCTION_TYPE__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FUNCTION_TYPE__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FUNCTION_TYPE__PARAMETERS, newParameters, newParameters));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FUNCTION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsBoolean() {
		return isBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsBoolean(boolean newIsBoolean) {
		boolean oldIsBoolean = isBoolean;
		isBoolean = newIsBoolean;
		boolean oldIsBooleanESet = isBooleanESet;
		isBooleanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FUNCTION_TYPE__IS_BOOLEAN, oldIsBoolean, isBoolean, !oldIsBooleanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsBoolean() {
		boolean oldIsBoolean = isBoolean;
		boolean oldIsBooleanESet = isBooleanESet;
		isBoolean = IS_BOOLEAN_EDEFAULT;
		isBooleanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.FUNCTION_TYPE__IS_BOOLEAN, oldIsBoolean, IS_BOOLEAN_EDEFAULT, oldIsBooleanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsBoolean() {
		return isBooleanESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FUNCTION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperatorSymbol() {
		return operatorSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatorSymbol(String newOperatorSymbol) {
		String oldOperatorSymbol = operatorSymbol;
		operatorSymbol = newOperatorSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FUNCTION_TYPE__OPERATOR_SYMBOL, oldOperatorSymbol, operatorSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FUNCTION_TYPE__PARAMETERS:
				return basicSetParameters(null, msgs);
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
			case CorePackage.FUNCTION_TYPE__PARAMETERS:
				return getParameters();
			case CorePackage.FUNCTION_TYPE__ID:
				return getId();
			case CorePackage.FUNCTION_TYPE__IS_BOOLEAN:
				return isIsBoolean();
			case CorePackage.FUNCTION_TYPE__NAME:
				return getName();
			case CorePackage.FUNCTION_TYPE__OPERATOR_SYMBOL:
				return getOperatorSymbol();
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
			case CorePackage.FUNCTION_TYPE__PARAMETERS:
				setParameters((ParametersType)newValue);
				return;
			case CorePackage.FUNCTION_TYPE__ID:
				setId((String)newValue);
				return;
			case CorePackage.FUNCTION_TYPE__IS_BOOLEAN:
				setIsBoolean((Boolean)newValue);
				return;
			case CorePackage.FUNCTION_TYPE__NAME:
				setName((String)newValue);
				return;
			case CorePackage.FUNCTION_TYPE__OPERATOR_SYMBOL:
				setOperatorSymbol((String)newValue);
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
			case CorePackage.FUNCTION_TYPE__PARAMETERS:
				setParameters((ParametersType)null);
				return;
			case CorePackage.FUNCTION_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.FUNCTION_TYPE__IS_BOOLEAN:
				unsetIsBoolean();
				return;
			case CorePackage.FUNCTION_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.FUNCTION_TYPE__OPERATOR_SYMBOL:
				setOperatorSymbol(OPERATOR_SYMBOL_EDEFAULT);
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
			case CorePackage.FUNCTION_TYPE__PARAMETERS:
				return parameters != null;
			case CorePackage.FUNCTION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.FUNCTION_TYPE__IS_BOOLEAN:
				return isSetIsBoolean();
			case CorePackage.FUNCTION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.FUNCTION_TYPE__OPERATOR_SYMBOL:
				return OPERATOR_SYMBOL_EDEFAULT == null ? operatorSymbol != null : !OPERATOR_SYMBOL_EDEFAULT.equals(operatorSymbol);
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
		result.append(", isBoolean: ");
		if (isBooleanESet) result.append(isBoolean); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", operatorSymbol: ");
		result.append(operatorSymbol);
		result.append(')');
		return result.toString();
	}

} //FunctionTypeImpl
