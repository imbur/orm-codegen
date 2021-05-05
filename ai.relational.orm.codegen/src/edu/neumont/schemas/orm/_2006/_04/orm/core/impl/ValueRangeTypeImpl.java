/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.RangeInclusionValues;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Range Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ValueRangeTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ValueRangeTypeImpl#getInvariantMaxValue <em>Invariant Max Value</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ValueRangeTypeImpl#getInvariantMinValue <em>Invariant Min Value</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ValueRangeTypeImpl#getMaxInclusion <em>Max Inclusion</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ValueRangeTypeImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ValueRangeTypeImpl#getMinInclusion <em>Min Inclusion</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ValueRangeTypeImpl#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueRangeTypeImpl extends MinimalEObjectImpl.Container implements ValueRangeType {
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
	 * The default value of the '{@link #getInvariantMaxValue() <em>Invariant Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariantMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final String INVARIANT_MAX_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvariantMaxValue() <em>Invariant Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariantMaxValue()
	 * @generated
	 * @ordered
	 */
	protected String invariantMaxValue = INVARIANT_MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvariantMinValue() <em>Invariant Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariantMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final String INVARIANT_MIN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvariantMinValue() <em>Invariant Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariantMinValue()
	 * @generated
	 * @ordered
	 */
	protected String invariantMinValue = INVARIANT_MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxInclusion() <em>Max Inclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInclusion()
	 * @generated
	 * @ordered
	 */
	protected static final RangeInclusionValues MAX_INCLUSION_EDEFAULT = RangeInclusionValues.NOT_SET;

	/**
	 * The cached value of the '{@link #getMaxInclusion() <em>Max Inclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInclusion()
	 * @generated
	 * @ordered
	 */
	protected RangeInclusionValues maxInclusion = MAX_INCLUSION_EDEFAULT;

	/**
	 * This is true if the Max Inclusion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxInclusionESet;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected String maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinInclusion() <em>Min Inclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInclusion()
	 * @generated
	 * @ordered
	 */
	protected static final RangeInclusionValues MIN_INCLUSION_EDEFAULT = RangeInclusionValues.NOT_SET;

	/**
	 * The cached value of the '{@link #getMinInclusion() <em>Min Inclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInclusion()
	 * @generated
	 * @ordered
	 */
	protected RangeInclusionValues minInclusion = MIN_INCLUSION_EDEFAULT;

	/**
	 * This is true if the Min Inclusion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minInclusionESet;

	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected String minValue = MIN_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueRangeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getValueRangeType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_RANGE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvariantMaxValue() {
		return invariantMaxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvariantMaxValue(String newInvariantMaxValue) {
		String oldInvariantMaxValue = invariantMaxValue;
		invariantMaxValue = newInvariantMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_RANGE_TYPE__INVARIANT_MAX_VALUE, oldInvariantMaxValue, invariantMaxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvariantMinValue() {
		return invariantMinValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvariantMinValue(String newInvariantMinValue) {
		String oldInvariantMinValue = invariantMinValue;
		invariantMinValue = newInvariantMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_RANGE_TYPE__INVARIANT_MIN_VALUE, oldInvariantMinValue, invariantMinValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeInclusionValues getMaxInclusion() {
		return maxInclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInclusion(RangeInclusionValues newMaxInclusion) {
		RangeInclusionValues oldMaxInclusion = maxInclusion;
		maxInclusion = newMaxInclusion == null ? MAX_INCLUSION_EDEFAULT : newMaxInclusion;
		boolean oldMaxInclusionESet = maxInclusionESet;
		maxInclusionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_RANGE_TYPE__MAX_INCLUSION, oldMaxInclusion, maxInclusion, !oldMaxInclusionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxInclusion() {
		RangeInclusionValues oldMaxInclusion = maxInclusion;
		boolean oldMaxInclusionESet = maxInclusionESet;
		maxInclusion = MAX_INCLUSION_EDEFAULT;
		maxInclusionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.VALUE_RANGE_TYPE__MAX_INCLUSION, oldMaxInclusion, MAX_INCLUSION_EDEFAULT, oldMaxInclusionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxInclusion() {
		return maxInclusionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(String newMaxValue) {
		String oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_RANGE_TYPE__MAX_VALUE, oldMaxValue, maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeInclusionValues getMinInclusion() {
		return minInclusion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInclusion(RangeInclusionValues newMinInclusion) {
		RangeInclusionValues oldMinInclusion = minInclusion;
		minInclusion = newMinInclusion == null ? MIN_INCLUSION_EDEFAULT : newMinInclusion;
		boolean oldMinInclusionESet = minInclusionESet;
		minInclusionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_RANGE_TYPE__MIN_INCLUSION, oldMinInclusion, minInclusion, !oldMinInclusionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinInclusion() {
		RangeInclusionValues oldMinInclusion = minInclusion;
		boolean oldMinInclusionESet = minInclusionESet;
		minInclusion = MIN_INCLUSION_EDEFAULT;
		minInclusionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.VALUE_RANGE_TYPE__MIN_INCLUSION, oldMinInclusion, MIN_INCLUSION_EDEFAULT, oldMinInclusionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinInclusion() {
		return minInclusionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(String newMinValue) {
		String oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.VALUE_RANGE_TYPE__MIN_VALUE, oldMinValue, minValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.VALUE_RANGE_TYPE__ID:
				return getId();
			case CorePackage.VALUE_RANGE_TYPE__INVARIANT_MAX_VALUE:
				return getInvariantMaxValue();
			case CorePackage.VALUE_RANGE_TYPE__INVARIANT_MIN_VALUE:
				return getInvariantMinValue();
			case CorePackage.VALUE_RANGE_TYPE__MAX_INCLUSION:
				return getMaxInclusion();
			case CorePackage.VALUE_RANGE_TYPE__MAX_VALUE:
				return getMaxValue();
			case CorePackage.VALUE_RANGE_TYPE__MIN_INCLUSION:
				return getMinInclusion();
			case CorePackage.VALUE_RANGE_TYPE__MIN_VALUE:
				return getMinValue();
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
			case CorePackage.VALUE_RANGE_TYPE__ID:
				setId((String)newValue);
				return;
			case CorePackage.VALUE_RANGE_TYPE__INVARIANT_MAX_VALUE:
				setInvariantMaxValue((String)newValue);
				return;
			case CorePackage.VALUE_RANGE_TYPE__INVARIANT_MIN_VALUE:
				setInvariantMinValue((String)newValue);
				return;
			case CorePackage.VALUE_RANGE_TYPE__MAX_INCLUSION:
				setMaxInclusion((RangeInclusionValues)newValue);
				return;
			case CorePackage.VALUE_RANGE_TYPE__MAX_VALUE:
				setMaxValue((String)newValue);
				return;
			case CorePackage.VALUE_RANGE_TYPE__MIN_INCLUSION:
				setMinInclusion((RangeInclusionValues)newValue);
				return;
			case CorePackage.VALUE_RANGE_TYPE__MIN_VALUE:
				setMinValue((String)newValue);
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
			case CorePackage.VALUE_RANGE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.VALUE_RANGE_TYPE__INVARIANT_MAX_VALUE:
				setInvariantMaxValue(INVARIANT_MAX_VALUE_EDEFAULT);
				return;
			case CorePackage.VALUE_RANGE_TYPE__INVARIANT_MIN_VALUE:
				setInvariantMinValue(INVARIANT_MIN_VALUE_EDEFAULT);
				return;
			case CorePackage.VALUE_RANGE_TYPE__MAX_INCLUSION:
				unsetMaxInclusion();
				return;
			case CorePackage.VALUE_RANGE_TYPE__MAX_VALUE:
				setMaxValue(MAX_VALUE_EDEFAULT);
				return;
			case CorePackage.VALUE_RANGE_TYPE__MIN_INCLUSION:
				unsetMinInclusion();
				return;
			case CorePackage.VALUE_RANGE_TYPE__MIN_VALUE:
				setMinValue(MIN_VALUE_EDEFAULT);
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
			case CorePackage.VALUE_RANGE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.VALUE_RANGE_TYPE__INVARIANT_MAX_VALUE:
				return INVARIANT_MAX_VALUE_EDEFAULT == null ? invariantMaxValue != null : !INVARIANT_MAX_VALUE_EDEFAULT.equals(invariantMaxValue);
			case CorePackage.VALUE_RANGE_TYPE__INVARIANT_MIN_VALUE:
				return INVARIANT_MIN_VALUE_EDEFAULT == null ? invariantMinValue != null : !INVARIANT_MIN_VALUE_EDEFAULT.equals(invariantMinValue);
			case CorePackage.VALUE_RANGE_TYPE__MAX_INCLUSION:
				return isSetMaxInclusion();
			case CorePackage.VALUE_RANGE_TYPE__MAX_VALUE:
				return MAX_VALUE_EDEFAULT == null ? maxValue != null : !MAX_VALUE_EDEFAULT.equals(maxValue);
			case CorePackage.VALUE_RANGE_TYPE__MIN_INCLUSION:
				return isSetMinInclusion();
			case CorePackage.VALUE_RANGE_TYPE__MIN_VALUE:
				return MIN_VALUE_EDEFAULT == null ? minValue != null : !MIN_VALUE_EDEFAULT.equals(minValue);
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
		result.append(", invariantMaxValue: ");
		result.append(invariantMaxValue);
		result.append(", invariantMinValue: ");
		result.append(invariantMinValue);
		result.append(", maxInclusion: ");
		if (maxInclusionESet) result.append(maxInclusion); else result.append("<unset>");
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(", minInclusion: ");
		if (minInclusionESet) result.append(minInclusion); else result.append("<unset>");
		result.append(", minValue: ");
		result.append(minValue);
		result.append(')');
		return result.toString();
	}

} //ValueRangeTypeImpl
