/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.AggregationContextType;
import edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType1;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.FunctionRef;
import edu.neumont.schemas.orm._2006._04.orm.core.InputsType;
import edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculated Value Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CalculatedValueType1Impl#getFunction <em>Function</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CalculatedValueType1Impl#getAggregationContext <em>Aggregation Context</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CalculatedValueType1Impl#getScope <em>Scope</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CalculatedValueType1Impl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CalculatedValueType1Impl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CalculatedValueType1Impl#isUniversalAggregationContext <em>Universal Aggregation Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculatedValueType1Impl extends MinimalEObjectImpl.Container implements CalculatedValueType1 {
	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected FunctionRef function;

	/**
	 * The cached value of the '{@link #getAggregationContext() <em>Aggregation Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationContext()
	 * @generated
	 * @ordered
	 */
	protected AggregationContextType aggregationContext;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected PathedRoleRef scope;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected InputsType inputs;

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
	 * The default value of the '{@link #isUniversalAggregationContext() <em>Universal Aggregation Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniversalAggregationContext()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIVERSAL_AGGREGATION_CONTEXT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUniversalAggregationContext() <em>Universal Aggregation Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniversalAggregationContext()
	 * @generated
	 * @ordered
	 */
	protected boolean universalAggregationContext = UNIVERSAL_AGGREGATION_CONTEXT_EDEFAULT;

	/**
	 * This is true if the Universal Aggregation Context attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean universalAggregationContextESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculatedValueType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getCalculatedValueType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionRef getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(FunctionRef newFunction, NotificationChain msgs) {
		FunctionRef oldFunction = function;
		function = newFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CALCULATED_VALUE_TYPE1__FUNCTION, oldFunction, newFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(FunctionRef newFunction) {
		if (newFunction != function) {
			NotificationChain msgs = null;
			if (function != null)
				msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CALCULATED_VALUE_TYPE1__FUNCTION, null, msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CALCULATED_VALUE_TYPE1__FUNCTION, null, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CALCULATED_VALUE_TYPE1__FUNCTION, newFunction, newFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationContextType getAggregationContext() {
		return aggregationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAggregationContext(AggregationContextType newAggregationContext, NotificationChain msgs) {
		AggregationContextType oldAggregationContext = aggregationContext;
		aggregationContext = newAggregationContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CALCULATED_VALUE_TYPE1__AGGREGATION_CONTEXT, oldAggregationContext, newAggregationContext);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregationContext(AggregationContextType newAggregationContext) {
		if (newAggregationContext != aggregationContext) {
			NotificationChain msgs = null;
			if (aggregationContext != null)
				msgs = ((InternalEObject)aggregationContext).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CALCULATED_VALUE_TYPE1__AGGREGATION_CONTEXT, null, msgs);
			if (newAggregationContext != null)
				msgs = ((InternalEObject)newAggregationContext).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CALCULATED_VALUE_TYPE1__AGGREGATION_CONTEXT, null, msgs);
			msgs = basicSetAggregationContext(newAggregationContext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CALCULATED_VALUE_TYPE1__AGGREGATION_CONTEXT, newAggregationContext, newAggregationContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathedRoleRef getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(PathedRoleRef newScope, NotificationChain msgs) {
		PathedRoleRef oldScope = scope;
		scope = newScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CALCULATED_VALUE_TYPE1__SCOPE, oldScope, newScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(PathedRoleRef newScope) {
		if (newScope != scope) {
			NotificationChain msgs = null;
			if (scope != null)
				msgs = ((InternalEObject)scope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CALCULATED_VALUE_TYPE1__SCOPE, null, msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CALCULATED_VALUE_TYPE1__SCOPE, null, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CALCULATED_VALUE_TYPE1__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputsType getInputs() {
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputs(InputsType newInputs, NotificationChain msgs) {
		InputsType oldInputs = inputs;
		inputs = newInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CALCULATED_VALUE_TYPE1__INPUTS, oldInputs, newInputs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputs(InputsType newInputs) {
		if (newInputs != inputs) {
			NotificationChain msgs = null;
			if (inputs != null)
				msgs = ((InternalEObject)inputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CALCULATED_VALUE_TYPE1__INPUTS, null, msgs);
			if (newInputs != null)
				msgs = ((InternalEObject)newInputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CALCULATED_VALUE_TYPE1__INPUTS, null, msgs);
			msgs = basicSetInputs(newInputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CALCULATED_VALUE_TYPE1__INPUTS, newInputs, newInputs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CALCULATED_VALUE_TYPE1__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUniversalAggregationContext() {
		return universalAggregationContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniversalAggregationContext(boolean newUniversalAggregationContext) {
		boolean oldUniversalAggregationContext = universalAggregationContext;
		universalAggregationContext = newUniversalAggregationContext;
		boolean oldUniversalAggregationContextESet = universalAggregationContextESet;
		universalAggregationContextESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CALCULATED_VALUE_TYPE1__UNIVERSAL_AGGREGATION_CONTEXT, oldUniversalAggregationContext, universalAggregationContext, !oldUniversalAggregationContextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUniversalAggregationContext() {
		boolean oldUniversalAggregationContext = universalAggregationContext;
		boolean oldUniversalAggregationContextESet = universalAggregationContextESet;
		universalAggregationContext = UNIVERSAL_AGGREGATION_CONTEXT_EDEFAULT;
		universalAggregationContextESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.CALCULATED_VALUE_TYPE1__UNIVERSAL_AGGREGATION_CONTEXT, oldUniversalAggregationContext, UNIVERSAL_AGGREGATION_CONTEXT_EDEFAULT, oldUniversalAggregationContextESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUniversalAggregationContext() {
		return universalAggregationContextESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CALCULATED_VALUE_TYPE1__FUNCTION:
				return basicSetFunction(null, msgs);
			case CorePackage.CALCULATED_VALUE_TYPE1__AGGREGATION_CONTEXT:
				return basicSetAggregationContext(null, msgs);
			case CorePackage.CALCULATED_VALUE_TYPE1__SCOPE:
				return basicSetScope(null, msgs);
			case CorePackage.CALCULATED_VALUE_TYPE1__INPUTS:
				return basicSetInputs(null, msgs);
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
			case CorePackage.CALCULATED_VALUE_TYPE1__FUNCTION:
				return getFunction();
			case CorePackage.CALCULATED_VALUE_TYPE1__AGGREGATION_CONTEXT:
				return getAggregationContext();
			case CorePackage.CALCULATED_VALUE_TYPE1__SCOPE:
				return getScope();
			case CorePackage.CALCULATED_VALUE_TYPE1__INPUTS:
				return getInputs();
			case CorePackage.CALCULATED_VALUE_TYPE1__ID:
				return getId();
			case CorePackage.CALCULATED_VALUE_TYPE1__UNIVERSAL_AGGREGATION_CONTEXT:
				return isUniversalAggregationContext();
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
			case CorePackage.CALCULATED_VALUE_TYPE1__FUNCTION:
				setFunction((FunctionRef)newValue);
				return;
			case CorePackage.CALCULATED_VALUE_TYPE1__AGGREGATION_CONTEXT:
				setAggregationContext((AggregationContextType)newValue);
				return;
			case CorePackage.CALCULATED_VALUE_TYPE1__SCOPE:
				setScope((PathedRoleRef)newValue);
				return;
			case CorePackage.CALCULATED_VALUE_TYPE1__INPUTS:
				setInputs((InputsType)newValue);
				return;
			case CorePackage.CALCULATED_VALUE_TYPE1__ID:
				setId((String)newValue);
				return;
			case CorePackage.CALCULATED_VALUE_TYPE1__UNIVERSAL_AGGREGATION_CONTEXT:
				setUniversalAggregationContext((Boolean)newValue);
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
			case CorePackage.CALCULATED_VALUE_TYPE1__FUNCTION:
				setFunction((FunctionRef)null);
				return;
			case CorePackage.CALCULATED_VALUE_TYPE1__AGGREGATION_CONTEXT:
				setAggregationContext((AggregationContextType)null);
				return;
			case CorePackage.CALCULATED_VALUE_TYPE1__SCOPE:
				setScope((PathedRoleRef)null);
				return;
			case CorePackage.CALCULATED_VALUE_TYPE1__INPUTS:
				setInputs((InputsType)null);
				return;
			case CorePackage.CALCULATED_VALUE_TYPE1__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.CALCULATED_VALUE_TYPE1__UNIVERSAL_AGGREGATION_CONTEXT:
				unsetUniversalAggregationContext();
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
			case CorePackage.CALCULATED_VALUE_TYPE1__FUNCTION:
				return function != null;
			case CorePackage.CALCULATED_VALUE_TYPE1__AGGREGATION_CONTEXT:
				return aggregationContext != null;
			case CorePackage.CALCULATED_VALUE_TYPE1__SCOPE:
				return scope != null;
			case CorePackage.CALCULATED_VALUE_TYPE1__INPUTS:
				return inputs != null;
			case CorePackage.CALCULATED_VALUE_TYPE1__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.CALCULATED_VALUE_TYPE1__UNIVERSAL_AGGREGATION_CONTEXT:
				return isSetUniversalAggregationContext();
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
		result.append(", universalAggregationContext: ");
		if (universalAggregationContextESet) result.append(universalAggregationContext); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CalculatedValueType1Impl
