/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DataTypeRef;
import edu.neumont.schemas.orm._2006._04.orm.core.ExtensionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.InstancesType;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeValueRestrictionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ValueTypeTypeImpl#getConceptualDataType <em>Conceptual Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ValueTypeTypeImpl#getValueRestriction <em>Value Restriction</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ValueTypeTypeImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ValueTypeTypeImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ValueTypeTypeImpl#isIsImplicitBooleanValue <em>Is Implicit Boolean Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueTypeTypeImpl extends ObjectTypeTypeImpl implements ValueTypeType {
	/**
	 * The cached value of the '{@link #getConceptualDataType() <em>Conceptual Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptualDataType()
	 * @generated
	 * @ordered
	 */
	protected DataTypeRef conceptualDataType;

	/**
	 * The cached value of the '{@link #getValueRestriction() <em>Value Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRestriction()
	 * @generated
	 * @ordered
	 */
	protected ValueTypeValueRestrictionType valueRestriction;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected InstancesType instances;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected ExtensionsType extensions;

	/**
	 * The default value of the '{@link #isIsImplicitBooleanValue() <em>Is Implicit Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsImplicitBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IMPLICIT_BOOLEAN_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsImplicitBooleanValue() <em>Is Implicit Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsImplicitBooleanValue()
	 * @generated
	 * @ordered
	 */
	protected boolean isImplicitBooleanValue = IS_IMPLICIT_BOOLEAN_VALUE_EDEFAULT;

	/**
	 * This is true if the Is Implicit Boolean Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isImplicitBooleanValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueTypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getValueTypeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeRef getConceptualDataType() {
		return conceptualDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConceptualDataType(DataTypeRef newConceptualDataType, NotificationChain msgs) {
		DataTypeRef oldConceptualDataType = conceptualDataType;
		conceptualDataType = newConceptualDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_TYPE_TYPE__CONCEPTUAL_DATA_TYPE, oldConceptualDataType, newConceptualDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConceptualDataType(DataTypeRef newConceptualDataType) {
		if (newConceptualDataType != conceptualDataType) {
			NotificationChain msgs = null;
			if (conceptualDataType != null)
				msgs = ((InternalEObject)conceptualDataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.VALUE_TYPE_TYPE__CONCEPTUAL_DATA_TYPE, null, msgs);
			if (newConceptualDataType != null)
				msgs = ((InternalEObject)newConceptualDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.VALUE_TYPE_TYPE__CONCEPTUAL_DATA_TYPE, null, msgs);
			msgs = basicSetConceptualDataType(newConceptualDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_TYPE_TYPE__CONCEPTUAL_DATA_TYPE, newConceptualDataType, newConceptualDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueTypeValueRestrictionType getValueRestriction() {
		return valueRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueRestriction(ValueTypeValueRestrictionType newValueRestriction, NotificationChain msgs) {
		ValueTypeValueRestrictionType oldValueRestriction = valueRestriction;
		valueRestriction = newValueRestriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_TYPE_TYPE__VALUE_RESTRICTION, oldValueRestriction, newValueRestriction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueRestriction(ValueTypeValueRestrictionType newValueRestriction) {
		if (newValueRestriction != valueRestriction) {
			NotificationChain msgs = null;
			if (valueRestriction != null)
				msgs = ((InternalEObject)valueRestriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.VALUE_TYPE_TYPE__VALUE_RESTRICTION, null, msgs);
			if (newValueRestriction != null)
				msgs = ((InternalEObject)newValueRestriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.VALUE_TYPE_TYPE__VALUE_RESTRICTION, null, msgs);
			msgs = basicSetValueRestriction(newValueRestriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_TYPE_TYPE__VALUE_RESTRICTION, newValueRestriction, newValueRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancesType getInstances() {
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstances(InstancesType newInstances, NotificationChain msgs) {
		InstancesType oldInstances = instances;
		instances = newInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_TYPE_TYPE__INSTANCES, oldInstances, newInstances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstances(InstancesType newInstances) {
		if (newInstances != instances) {
			NotificationChain msgs = null;
			if (instances != null)
				msgs = ((InternalEObject)instances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.VALUE_TYPE_TYPE__INSTANCES, null, msgs);
			if (newInstances != null)
				msgs = ((InternalEObject)newInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.VALUE_TYPE_TYPE__INSTANCES, null, msgs);
			msgs = basicSetInstances(newInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_TYPE_TYPE__INSTANCES, newInstances, newInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsType getExtensions() {
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensions(ExtensionsType newExtensions, NotificationChain msgs) {
		ExtensionsType oldExtensions = extensions;
		extensions = newExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_TYPE_TYPE__EXTENSIONS, oldExtensions, newExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensions(ExtensionsType newExtensions) {
		if (newExtensions != extensions) {
			NotificationChain msgs = null;
			if (extensions != null)
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.VALUE_TYPE_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.VALUE_TYPE_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_TYPE_TYPE__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsImplicitBooleanValue() {
		return isImplicitBooleanValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsImplicitBooleanValue(boolean newIsImplicitBooleanValue) {
		boolean oldIsImplicitBooleanValue = isImplicitBooleanValue;
		isImplicitBooleanValue = newIsImplicitBooleanValue;
		boolean oldIsImplicitBooleanValueESet = isImplicitBooleanValueESet;
		isImplicitBooleanValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_TYPE_TYPE__IS_IMPLICIT_BOOLEAN_VALUE, oldIsImplicitBooleanValue, isImplicitBooleanValue, !oldIsImplicitBooleanValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsImplicitBooleanValue() {
		boolean oldIsImplicitBooleanValue = isImplicitBooleanValue;
		boolean oldIsImplicitBooleanValueESet = isImplicitBooleanValueESet;
		isImplicitBooleanValue = IS_IMPLICIT_BOOLEAN_VALUE_EDEFAULT;
		isImplicitBooleanValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.VALUE_TYPE_TYPE__IS_IMPLICIT_BOOLEAN_VALUE, oldIsImplicitBooleanValue, IS_IMPLICIT_BOOLEAN_VALUE_EDEFAULT, oldIsImplicitBooleanValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsImplicitBooleanValue() {
		return isImplicitBooleanValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.VALUE_TYPE_TYPE__CONCEPTUAL_DATA_TYPE:
				return basicSetConceptualDataType(null, msgs);
			case CorePackage.VALUE_TYPE_TYPE__VALUE_RESTRICTION:
				return basicSetValueRestriction(null, msgs);
			case CorePackage.VALUE_TYPE_TYPE__INSTANCES:
				return basicSetInstances(null, msgs);
			case CorePackage.VALUE_TYPE_TYPE__EXTENSIONS:
				return basicSetExtensions(null, msgs);
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
			case CorePackage.VALUE_TYPE_TYPE__CONCEPTUAL_DATA_TYPE:
				return getConceptualDataType();
			case CorePackage.VALUE_TYPE_TYPE__VALUE_RESTRICTION:
				return getValueRestriction();
			case CorePackage.VALUE_TYPE_TYPE__INSTANCES:
				return getInstances();
			case CorePackage.VALUE_TYPE_TYPE__EXTENSIONS:
				return getExtensions();
			case CorePackage.VALUE_TYPE_TYPE__IS_IMPLICIT_BOOLEAN_VALUE:
				return isIsImplicitBooleanValue();
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
			case CorePackage.VALUE_TYPE_TYPE__CONCEPTUAL_DATA_TYPE:
				setConceptualDataType((DataTypeRef)newValue);
				return;
			case CorePackage.VALUE_TYPE_TYPE__VALUE_RESTRICTION:
				setValueRestriction((ValueTypeValueRestrictionType)newValue);
				return;
			case CorePackage.VALUE_TYPE_TYPE__INSTANCES:
				setInstances((InstancesType)newValue);
				return;
			case CorePackage.VALUE_TYPE_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
				return;
			case CorePackage.VALUE_TYPE_TYPE__IS_IMPLICIT_BOOLEAN_VALUE:
				setIsImplicitBooleanValue((Boolean)newValue);
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
			case CorePackage.VALUE_TYPE_TYPE__CONCEPTUAL_DATA_TYPE:
				setConceptualDataType((DataTypeRef)null);
				return;
			case CorePackage.VALUE_TYPE_TYPE__VALUE_RESTRICTION:
				setValueRestriction((ValueTypeValueRestrictionType)null);
				return;
			case CorePackage.VALUE_TYPE_TYPE__INSTANCES:
				setInstances((InstancesType)null);
				return;
			case CorePackage.VALUE_TYPE_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)null);
				return;
			case CorePackage.VALUE_TYPE_TYPE__IS_IMPLICIT_BOOLEAN_VALUE:
				unsetIsImplicitBooleanValue();
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
			case CorePackage.VALUE_TYPE_TYPE__CONCEPTUAL_DATA_TYPE:
				return conceptualDataType != null;
			case CorePackage.VALUE_TYPE_TYPE__VALUE_RESTRICTION:
				return valueRestriction != null;
			case CorePackage.VALUE_TYPE_TYPE__INSTANCES:
				return instances != null;
			case CorePackage.VALUE_TYPE_TYPE__EXTENSIONS:
				return extensions != null;
			case CorePackage.VALUE_TYPE_TYPE__IS_IMPLICIT_BOOLEAN_VALUE:
				return isSetIsImplicitBooleanValue();
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
		result.append(" (isImplicitBooleanValue: ");
		if (isImplicitBooleanValueESet) result.append(isImplicitBooleanValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ValueTypeTypeImpl
