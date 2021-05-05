/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueInputType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.FunctionParameterRef;
import edu.neumont.schemas.orm._2006._04.orm.core.SourceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculated Value Input Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CalculatedValueInputTypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CalculatedValueInputTypeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CalculatedValueInputTypeImpl#isDistinctValues <em>Distinct Values</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CalculatedValueInputTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculatedValueInputTypeImpl extends MinimalEObjectImpl.Container implements CalculatedValueInputType {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected FunctionParameterRef parameter;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SourceType source;

	/**
	 * The default value of the '{@link #isDistinctValues() <em>Distinct Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinctValues()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISTINCT_VALUES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDistinctValues() <em>Distinct Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinctValues()
	 * @generated
	 * @ordered
	 */
	protected boolean distinctValues = DISTINCT_VALUES_EDEFAULT;

	/**
	 * This is true if the Distinct Values attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean distinctValuesESet;

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
	protected CalculatedValueInputTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getCalculatedValueInputType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionParameterRef getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(FunctionParameterRef newParameter, NotificationChain msgs) {
		FunctionParameterRef oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CALCULATED_VALUE_INPUT_TYPE__PARAMETER, oldParameter, newParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(FunctionParameterRef newParameter) {
		if (newParameter != parameter) {
			NotificationChain msgs = null;
			if (parameter != null)
				msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CALCULATED_VALUE_INPUT_TYPE__PARAMETER, null, msgs);
			if (newParameter != null)
				msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CALCULATED_VALUE_INPUT_TYPE__PARAMETER, null, msgs);
			msgs = basicSetParameter(newParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CALCULATED_VALUE_INPUT_TYPE__PARAMETER, newParameter, newParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(SourceType newSource, NotificationChain msgs) {
		SourceType oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CALCULATED_VALUE_INPUT_TYPE__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SourceType newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CALCULATED_VALUE_INPUT_TYPE__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CALCULATED_VALUE_INPUT_TYPE__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CALCULATED_VALUE_INPUT_TYPE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDistinctValues() {
		return distinctValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistinctValues(boolean newDistinctValues) {
		boolean oldDistinctValues = distinctValues;
		distinctValues = newDistinctValues;
		boolean oldDistinctValuesESet = distinctValuesESet;
		distinctValuesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CALCULATED_VALUE_INPUT_TYPE__DISTINCT_VALUES, oldDistinctValues, distinctValues, !oldDistinctValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDistinctValues() {
		boolean oldDistinctValues = distinctValues;
		boolean oldDistinctValuesESet = distinctValuesESet;
		distinctValues = DISTINCT_VALUES_EDEFAULT;
		distinctValuesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.CALCULATED_VALUE_INPUT_TYPE__DISTINCT_VALUES, oldDistinctValues, DISTINCT_VALUES_EDEFAULT, oldDistinctValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDistinctValues() {
		return distinctValuesESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CALCULATED_VALUE_INPUT_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE__PARAMETER:
				return basicSetParameter(null, msgs);
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE__SOURCE:
				return basicSetSource(null, msgs);
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
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE__PARAMETER:
				return getParameter();
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE__SOURCE:
				return getSource();
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE__DISTINCT_VALUES:
				return isDistinctValues();
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE__ID:
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
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE__PARAMETER:
				setParameter((FunctionParameterRef)newValue);
				return;
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE__SOURCE:
				setSource((SourceType)newValue);
				return;
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE__DISTINCT_VALUES:
				setDistinctValues((Boolean)newValue);
				return;
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE__ID:
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
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE__PARAMETER:
				setParameter((FunctionParameterRef)null);
				return;
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE__SOURCE:
				setSource((SourceType)null);
				return;
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE__DISTINCT_VALUES:
				unsetDistinctValues();
				return;
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE__ID:
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
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE__PARAMETER:
				return parameter != null;
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE__SOURCE:
				return source != null;
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE__DISTINCT_VALUES:
				return isSetDistinctValues();
			case CorePackage.CALCULATED_VALUE_INPUT_TYPE__ID:
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
		result.append(" (distinctValues: ");
		if (distinctValuesESet) result.append(distinctValues); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //CalculatedValueInputTypeImpl
