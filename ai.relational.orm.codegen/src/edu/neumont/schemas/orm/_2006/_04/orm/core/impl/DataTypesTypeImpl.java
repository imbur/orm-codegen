/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.AutoCounterNumericDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.AutoTimestampTemporalDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType;
import edu.neumont.schemas.orm._2006._04.orm.core.DateAndTimeTemporalDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.DateTemporalDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.DecimalNumericDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.DoublePrecisionFloatingPointNumericDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.FixedLengthRawDataDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.FixedLengthTextDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.FloatingPointNumericDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.LargeLengthRawDataDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.LargeLengthTextDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.MoneyNumericDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectIdOtherDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.OleObjectRawDataDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.PictureRawDataDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.RowIdOtherDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.SignedIntegerNumericDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.SignedLargeIntegerNumericDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.SignedSmallIntegerNumericDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.SinglePrecisionFloatingPointNumericDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.TimeTemporalDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.TrueOrFalseLogicalDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.UnsignedIntegerNumericDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.UnsignedLargeIntegerNumericDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.UnsignedSmallIntegerNumericDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.UnsignedTinyIntegerNumericDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.UnspecifiedDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.VariableLengthRawDataDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.VariableLengthTextDataTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.YesOrNoLogicalDataTypeType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Types Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getUnspecifiedDataType <em>Unspecified Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getFixedLengthTextDataType <em>Fixed Length Text Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getVariableLengthTextDataType <em>Variable Length Text Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getLargeLengthTextDataType <em>Large Length Text Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getSignedIntegerNumericDataType <em>Signed Integer Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getSignedSmallIntegerNumericDataType <em>Signed Small Integer Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getSignedLargeIntegerNumericDataType <em>Signed Large Integer Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getUnsignedIntegerNumericDataType <em>Unsigned Integer Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getUnsignedTinyIntegerNumericDataType <em>Unsigned Tiny Integer Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getUnsignedSmallIntegerNumericDataType <em>Unsigned Small Integer Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getUnsignedLargeIntegerNumericDataType <em>Unsigned Large Integer Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getAutoCounterNumericDataType <em>Auto Counter Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getFloatingPointNumericDataType <em>Floating Point Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getSinglePrecisionFloatingPointNumericDataType <em>Single Precision Floating Point Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getDoublePrecisionFloatingPointNumericDataType <em>Double Precision Floating Point Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getDecimalNumericDataType <em>Decimal Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getMoneyNumericDataType <em>Money Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getFixedLengthRawDataDataType <em>Fixed Length Raw Data Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getVariableLengthRawDataDataType <em>Variable Length Raw Data Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getLargeLengthRawDataDataType <em>Large Length Raw Data Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getPictureRawDataDataType <em>Picture Raw Data Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getOleObjectRawDataDataType <em>Ole Object Raw Data Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getAutoTimestampTemporalDataType <em>Auto Timestamp Temporal Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getTimeTemporalDataType <em>Time Temporal Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getDateTemporalDataType <em>Date Temporal Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getDateAndTimeTemporalDataType <em>Date And Time Temporal Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getTrueOrFalseLogicalDataType <em>True Or False Logical Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getYesOrNoLogicalDataType <em>Yes Or No Logical Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getRowIdOtherDataType <em>Row Id Other Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DataTypesTypeImpl#getObjectIdOtherDataType <em>Object Id Other Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypesTypeImpl extends MinimalEObjectImpl.Container implements DataTypesType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getDataTypesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.DATA_TYPES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnspecifiedDataTypeType> getUnspecifiedDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_UnspecifiedDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FixedLengthTextDataTypeType> getFixedLengthTextDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_FixedLengthTextDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableLengthTextDataTypeType> getVariableLengthTextDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_VariableLengthTextDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LargeLengthTextDataTypeType> getLargeLengthTextDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_LargeLengthTextDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignedIntegerNumericDataTypeType> getSignedIntegerNumericDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_SignedIntegerNumericDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignedSmallIntegerNumericDataTypeType> getSignedSmallIntegerNumericDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_SignedSmallIntegerNumericDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SignedLargeIntegerNumericDataTypeType> getSignedLargeIntegerNumericDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_SignedLargeIntegerNumericDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnsignedIntegerNumericDataTypeType> getUnsignedIntegerNumericDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_UnsignedIntegerNumericDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnsignedTinyIntegerNumericDataTypeType> getUnsignedTinyIntegerNumericDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_UnsignedTinyIntegerNumericDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnsignedSmallIntegerNumericDataTypeType> getUnsignedSmallIntegerNumericDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_UnsignedSmallIntegerNumericDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnsignedLargeIntegerNumericDataTypeType> getUnsignedLargeIntegerNumericDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_UnsignedLargeIntegerNumericDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AutoCounterNumericDataTypeType> getAutoCounterNumericDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_AutoCounterNumericDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FloatingPointNumericDataTypeType> getFloatingPointNumericDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_FloatingPointNumericDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SinglePrecisionFloatingPointNumericDataTypeType> getSinglePrecisionFloatingPointNumericDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_SinglePrecisionFloatingPointNumericDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DoublePrecisionFloatingPointNumericDataTypeType> getDoublePrecisionFloatingPointNumericDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_DoublePrecisionFloatingPointNumericDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecimalNumericDataTypeType> getDecimalNumericDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_DecimalNumericDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MoneyNumericDataTypeType> getMoneyNumericDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_MoneyNumericDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FixedLengthRawDataDataTypeType> getFixedLengthRawDataDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_FixedLengthRawDataDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableLengthRawDataDataTypeType> getVariableLengthRawDataDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_VariableLengthRawDataDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LargeLengthRawDataDataTypeType> getLargeLengthRawDataDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_LargeLengthRawDataDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PictureRawDataDataTypeType> getPictureRawDataDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_PictureRawDataDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OleObjectRawDataDataTypeType> getOleObjectRawDataDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_OleObjectRawDataDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AutoTimestampTemporalDataTypeType> getAutoTimestampTemporalDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_AutoTimestampTemporalDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeTemporalDataTypeType> getTimeTemporalDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_TimeTemporalDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateTemporalDataTypeType> getDateTemporalDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_DateTemporalDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DateAndTimeTemporalDataTypeType> getDateAndTimeTemporalDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_DateAndTimeTemporalDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrueOrFalseLogicalDataTypeType> getTrueOrFalseLogicalDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_TrueOrFalseLogicalDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<YesOrNoLogicalDataTypeType> getYesOrNoLogicalDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_YesOrNoLogicalDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RowIdOtherDataTypeType> getRowIdOtherDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_RowIdOtherDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectIdOtherDataTypeType> getObjectIdOtherDataType() {
		return getGroup().list(CorePackage.eINSTANCE.getDataTypesType_ObjectIdOtherDataType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DATA_TYPES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__UNSPECIFIED_DATA_TYPE:
				return ((InternalEList<?>)getUnspecifiedDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__FIXED_LENGTH_TEXT_DATA_TYPE:
				return ((InternalEList<?>)getFixedLengthTextDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__VARIABLE_LENGTH_TEXT_DATA_TYPE:
				return ((InternalEList<?>)getVariableLengthTextDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__LARGE_LENGTH_TEXT_DATA_TYPE:
				return ((InternalEList<?>)getLargeLengthTextDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__SIGNED_INTEGER_NUMERIC_DATA_TYPE:
				return ((InternalEList<?>)getSignedIntegerNumericDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__SIGNED_SMALL_INTEGER_NUMERIC_DATA_TYPE:
				return ((InternalEList<?>)getSignedSmallIntegerNumericDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__SIGNED_LARGE_INTEGER_NUMERIC_DATA_TYPE:
				return ((InternalEList<?>)getSignedLargeIntegerNumericDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_INTEGER_NUMERIC_DATA_TYPE:
				return ((InternalEList<?>)getUnsignedIntegerNumericDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_TINY_INTEGER_NUMERIC_DATA_TYPE:
				return ((InternalEList<?>)getUnsignedTinyIntegerNumericDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_SMALL_INTEGER_NUMERIC_DATA_TYPE:
				return ((InternalEList<?>)getUnsignedSmallIntegerNumericDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_LARGE_INTEGER_NUMERIC_DATA_TYPE:
				return ((InternalEList<?>)getUnsignedLargeIntegerNumericDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__AUTO_COUNTER_NUMERIC_DATA_TYPE:
				return ((InternalEList<?>)getAutoCounterNumericDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__FLOATING_POINT_NUMERIC_DATA_TYPE:
				return ((InternalEList<?>)getFloatingPointNumericDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__SINGLE_PRECISION_FLOATING_POINT_NUMERIC_DATA_TYPE:
				return ((InternalEList<?>)getSinglePrecisionFloatingPointNumericDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__DOUBLE_PRECISION_FLOATING_POINT_NUMERIC_DATA_TYPE:
				return ((InternalEList<?>)getDoublePrecisionFloatingPointNumericDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__DECIMAL_NUMERIC_DATA_TYPE:
				return ((InternalEList<?>)getDecimalNumericDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__MONEY_NUMERIC_DATA_TYPE:
				return ((InternalEList<?>)getMoneyNumericDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__FIXED_LENGTH_RAW_DATA_DATA_TYPE:
				return ((InternalEList<?>)getFixedLengthRawDataDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__VARIABLE_LENGTH_RAW_DATA_DATA_TYPE:
				return ((InternalEList<?>)getVariableLengthRawDataDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__LARGE_LENGTH_RAW_DATA_DATA_TYPE:
				return ((InternalEList<?>)getLargeLengthRawDataDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__PICTURE_RAW_DATA_DATA_TYPE:
				return ((InternalEList<?>)getPictureRawDataDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__OLE_OBJECT_RAW_DATA_DATA_TYPE:
				return ((InternalEList<?>)getOleObjectRawDataDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__AUTO_TIMESTAMP_TEMPORAL_DATA_TYPE:
				return ((InternalEList<?>)getAutoTimestampTemporalDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__TIME_TEMPORAL_DATA_TYPE:
				return ((InternalEList<?>)getTimeTemporalDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__DATE_TEMPORAL_DATA_TYPE:
				return ((InternalEList<?>)getDateTemporalDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__DATE_AND_TIME_TEMPORAL_DATA_TYPE:
				return ((InternalEList<?>)getDateAndTimeTemporalDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__TRUE_OR_FALSE_LOGICAL_DATA_TYPE:
				return ((InternalEList<?>)getTrueOrFalseLogicalDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__YES_OR_NO_LOGICAL_DATA_TYPE:
				return ((InternalEList<?>)getYesOrNoLogicalDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__ROW_ID_OTHER_DATA_TYPE:
				return ((InternalEList<?>)getRowIdOtherDataType()).basicRemove(otherEnd, msgs);
			case CorePackage.DATA_TYPES_TYPE__OBJECT_ID_OTHER_DATA_TYPE:
				return ((InternalEList<?>)getObjectIdOtherDataType()).basicRemove(otherEnd, msgs);
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
			case CorePackage.DATA_TYPES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.DATA_TYPES_TYPE__UNSPECIFIED_DATA_TYPE:
				return getUnspecifiedDataType();
			case CorePackage.DATA_TYPES_TYPE__FIXED_LENGTH_TEXT_DATA_TYPE:
				return getFixedLengthTextDataType();
			case CorePackage.DATA_TYPES_TYPE__VARIABLE_LENGTH_TEXT_DATA_TYPE:
				return getVariableLengthTextDataType();
			case CorePackage.DATA_TYPES_TYPE__LARGE_LENGTH_TEXT_DATA_TYPE:
				return getLargeLengthTextDataType();
			case CorePackage.DATA_TYPES_TYPE__SIGNED_INTEGER_NUMERIC_DATA_TYPE:
				return getSignedIntegerNumericDataType();
			case CorePackage.DATA_TYPES_TYPE__SIGNED_SMALL_INTEGER_NUMERIC_DATA_TYPE:
				return getSignedSmallIntegerNumericDataType();
			case CorePackage.DATA_TYPES_TYPE__SIGNED_LARGE_INTEGER_NUMERIC_DATA_TYPE:
				return getSignedLargeIntegerNumericDataType();
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_INTEGER_NUMERIC_DATA_TYPE:
				return getUnsignedIntegerNumericDataType();
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_TINY_INTEGER_NUMERIC_DATA_TYPE:
				return getUnsignedTinyIntegerNumericDataType();
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_SMALL_INTEGER_NUMERIC_DATA_TYPE:
				return getUnsignedSmallIntegerNumericDataType();
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_LARGE_INTEGER_NUMERIC_DATA_TYPE:
				return getUnsignedLargeIntegerNumericDataType();
			case CorePackage.DATA_TYPES_TYPE__AUTO_COUNTER_NUMERIC_DATA_TYPE:
				return getAutoCounterNumericDataType();
			case CorePackage.DATA_TYPES_TYPE__FLOATING_POINT_NUMERIC_DATA_TYPE:
				return getFloatingPointNumericDataType();
			case CorePackage.DATA_TYPES_TYPE__SINGLE_PRECISION_FLOATING_POINT_NUMERIC_DATA_TYPE:
				return getSinglePrecisionFloatingPointNumericDataType();
			case CorePackage.DATA_TYPES_TYPE__DOUBLE_PRECISION_FLOATING_POINT_NUMERIC_DATA_TYPE:
				return getDoublePrecisionFloatingPointNumericDataType();
			case CorePackage.DATA_TYPES_TYPE__DECIMAL_NUMERIC_DATA_TYPE:
				return getDecimalNumericDataType();
			case CorePackage.DATA_TYPES_TYPE__MONEY_NUMERIC_DATA_TYPE:
				return getMoneyNumericDataType();
			case CorePackage.DATA_TYPES_TYPE__FIXED_LENGTH_RAW_DATA_DATA_TYPE:
				return getFixedLengthRawDataDataType();
			case CorePackage.DATA_TYPES_TYPE__VARIABLE_LENGTH_RAW_DATA_DATA_TYPE:
				return getVariableLengthRawDataDataType();
			case CorePackage.DATA_TYPES_TYPE__LARGE_LENGTH_RAW_DATA_DATA_TYPE:
				return getLargeLengthRawDataDataType();
			case CorePackage.DATA_TYPES_TYPE__PICTURE_RAW_DATA_DATA_TYPE:
				return getPictureRawDataDataType();
			case CorePackage.DATA_TYPES_TYPE__OLE_OBJECT_RAW_DATA_DATA_TYPE:
				return getOleObjectRawDataDataType();
			case CorePackage.DATA_TYPES_TYPE__AUTO_TIMESTAMP_TEMPORAL_DATA_TYPE:
				return getAutoTimestampTemporalDataType();
			case CorePackage.DATA_TYPES_TYPE__TIME_TEMPORAL_DATA_TYPE:
				return getTimeTemporalDataType();
			case CorePackage.DATA_TYPES_TYPE__DATE_TEMPORAL_DATA_TYPE:
				return getDateTemporalDataType();
			case CorePackage.DATA_TYPES_TYPE__DATE_AND_TIME_TEMPORAL_DATA_TYPE:
				return getDateAndTimeTemporalDataType();
			case CorePackage.DATA_TYPES_TYPE__TRUE_OR_FALSE_LOGICAL_DATA_TYPE:
				return getTrueOrFalseLogicalDataType();
			case CorePackage.DATA_TYPES_TYPE__YES_OR_NO_LOGICAL_DATA_TYPE:
				return getYesOrNoLogicalDataType();
			case CorePackage.DATA_TYPES_TYPE__ROW_ID_OTHER_DATA_TYPE:
				return getRowIdOtherDataType();
			case CorePackage.DATA_TYPES_TYPE__OBJECT_ID_OTHER_DATA_TYPE:
				return getObjectIdOtherDataType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.DATA_TYPES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__UNSPECIFIED_DATA_TYPE:
				getUnspecifiedDataType().clear();
				getUnspecifiedDataType().addAll((Collection<? extends UnspecifiedDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__FIXED_LENGTH_TEXT_DATA_TYPE:
				getFixedLengthTextDataType().clear();
				getFixedLengthTextDataType().addAll((Collection<? extends FixedLengthTextDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__VARIABLE_LENGTH_TEXT_DATA_TYPE:
				getVariableLengthTextDataType().clear();
				getVariableLengthTextDataType().addAll((Collection<? extends VariableLengthTextDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__LARGE_LENGTH_TEXT_DATA_TYPE:
				getLargeLengthTextDataType().clear();
				getLargeLengthTextDataType().addAll((Collection<? extends LargeLengthTextDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__SIGNED_INTEGER_NUMERIC_DATA_TYPE:
				getSignedIntegerNumericDataType().clear();
				getSignedIntegerNumericDataType().addAll((Collection<? extends SignedIntegerNumericDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__SIGNED_SMALL_INTEGER_NUMERIC_DATA_TYPE:
				getSignedSmallIntegerNumericDataType().clear();
				getSignedSmallIntegerNumericDataType().addAll((Collection<? extends SignedSmallIntegerNumericDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__SIGNED_LARGE_INTEGER_NUMERIC_DATA_TYPE:
				getSignedLargeIntegerNumericDataType().clear();
				getSignedLargeIntegerNumericDataType().addAll((Collection<? extends SignedLargeIntegerNumericDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_INTEGER_NUMERIC_DATA_TYPE:
				getUnsignedIntegerNumericDataType().clear();
				getUnsignedIntegerNumericDataType().addAll((Collection<? extends UnsignedIntegerNumericDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_TINY_INTEGER_NUMERIC_DATA_TYPE:
				getUnsignedTinyIntegerNumericDataType().clear();
				getUnsignedTinyIntegerNumericDataType().addAll((Collection<? extends UnsignedTinyIntegerNumericDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_SMALL_INTEGER_NUMERIC_DATA_TYPE:
				getUnsignedSmallIntegerNumericDataType().clear();
				getUnsignedSmallIntegerNumericDataType().addAll((Collection<? extends UnsignedSmallIntegerNumericDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_LARGE_INTEGER_NUMERIC_DATA_TYPE:
				getUnsignedLargeIntegerNumericDataType().clear();
				getUnsignedLargeIntegerNumericDataType().addAll((Collection<? extends UnsignedLargeIntegerNumericDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__AUTO_COUNTER_NUMERIC_DATA_TYPE:
				getAutoCounterNumericDataType().clear();
				getAutoCounterNumericDataType().addAll((Collection<? extends AutoCounterNumericDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__FLOATING_POINT_NUMERIC_DATA_TYPE:
				getFloatingPointNumericDataType().clear();
				getFloatingPointNumericDataType().addAll((Collection<? extends FloatingPointNumericDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__SINGLE_PRECISION_FLOATING_POINT_NUMERIC_DATA_TYPE:
				getSinglePrecisionFloatingPointNumericDataType().clear();
				getSinglePrecisionFloatingPointNumericDataType().addAll((Collection<? extends SinglePrecisionFloatingPointNumericDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__DOUBLE_PRECISION_FLOATING_POINT_NUMERIC_DATA_TYPE:
				getDoublePrecisionFloatingPointNumericDataType().clear();
				getDoublePrecisionFloatingPointNumericDataType().addAll((Collection<? extends DoublePrecisionFloatingPointNumericDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__DECIMAL_NUMERIC_DATA_TYPE:
				getDecimalNumericDataType().clear();
				getDecimalNumericDataType().addAll((Collection<? extends DecimalNumericDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__MONEY_NUMERIC_DATA_TYPE:
				getMoneyNumericDataType().clear();
				getMoneyNumericDataType().addAll((Collection<? extends MoneyNumericDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__FIXED_LENGTH_RAW_DATA_DATA_TYPE:
				getFixedLengthRawDataDataType().clear();
				getFixedLengthRawDataDataType().addAll((Collection<? extends FixedLengthRawDataDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__VARIABLE_LENGTH_RAW_DATA_DATA_TYPE:
				getVariableLengthRawDataDataType().clear();
				getVariableLengthRawDataDataType().addAll((Collection<? extends VariableLengthRawDataDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__LARGE_LENGTH_RAW_DATA_DATA_TYPE:
				getLargeLengthRawDataDataType().clear();
				getLargeLengthRawDataDataType().addAll((Collection<? extends LargeLengthRawDataDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__PICTURE_RAW_DATA_DATA_TYPE:
				getPictureRawDataDataType().clear();
				getPictureRawDataDataType().addAll((Collection<? extends PictureRawDataDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__OLE_OBJECT_RAW_DATA_DATA_TYPE:
				getOleObjectRawDataDataType().clear();
				getOleObjectRawDataDataType().addAll((Collection<? extends OleObjectRawDataDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__AUTO_TIMESTAMP_TEMPORAL_DATA_TYPE:
				getAutoTimestampTemporalDataType().clear();
				getAutoTimestampTemporalDataType().addAll((Collection<? extends AutoTimestampTemporalDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__TIME_TEMPORAL_DATA_TYPE:
				getTimeTemporalDataType().clear();
				getTimeTemporalDataType().addAll((Collection<? extends TimeTemporalDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__DATE_TEMPORAL_DATA_TYPE:
				getDateTemporalDataType().clear();
				getDateTemporalDataType().addAll((Collection<? extends DateTemporalDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__DATE_AND_TIME_TEMPORAL_DATA_TYPE:
				getDateAndTimeTemporalDataType().clear();
				getDateAndTimeTemporalDataType().addAll((Collection<? extends DateAndTimeTemporalDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__TRUE_OR_FALSE_LOGICAL_DATA_TYPE:
				getTrueOrFalseLogicalDataType().clear();
				getTrueOrFalseLogicalDataType().addAll((Collection<? extends TrueOrFalseLogicalDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__YES_OR_NO_LOGICAL_DATA_TYPE:
				getYesOrNoLogicalDataType().clear();
				getYesOrNoLogicalDataType().addAll((Collection<? extends YesOrNoLogicalDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__ROW_ID_OTHER_DATA_TYPE:
				getRowIdOtherDataType().clear();
				getRowIdOtherDataType().addAll((Collection<? extends RowIdOtherDataTypeType>)newValue);
				return;
			case CorePackage.DATA_TYPES_TYPE__OBJECT_ID_OTHER_DATA_TYPE:
				getObjectIdOtherDataType().clear();
				getObjectIdOtherDataType().addAll((Collection<? extends ObjectIdOtherDataTypeType>)newValue);
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
			case CorePackage.DATA_TYPES_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__UNSPECIFIED_DATA_TYPE:
				getUnspecifiedDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__FIXED_LENGTH_TEXT_DATA_TYPE:
				getFixedLengthTextDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__VARIABLE_LENGTH_TEXT_DATA_TYPE:
				getVariableLengthTextDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__LARGE_LENGTH_TEXT_DATA_TYPE:
				getLargeLengthTextDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__SIGNED_INTEGER_NUMERIC_DATA_TYPE:
				getSignedIntegerNumericDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__SIGNED_SMALL_INTEGER_NUMERIC_DATA_TYPE:
				getSignedSmallIntegerNumericDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__SIGNED_LARGE_INTEGER_NUMERIC_DATA_TYPE:
				getSignedLargeIntegerNumericDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_INTEGER_NUMERIC_DATA_TYPE:
				getUnsignedIntegerNumericDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_TINY_INTEGER_NUMERIC_DATA_TYPE:
				getUnsignedTinyIntegerNumericDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_SMALL_INTEGER_NUMERIC_DATA_TYPE:
				getUnsignedSmallIntegerNumericDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_LARGE_INTEGER_NUMERIC_DATA_TYPE:
				getUnsignedLargeIntegerNumericDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__AUTO_COUNTER_NUMERIC_DATA_TYPE:
				getAutoCounterNumericDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__FLOATING_POINT_NUMERIC_DATA_TYPE:
				getFloatingPointNumericDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__SINGLE_PRECISION_FLOATING_POINT_NUMERIC_DATA_TYPE:
				getSinglePrecisionFloatingPointNumericDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__DOUBLE_PRECISION_FLOATING_POINT_NUMERIC_DATA_TYPE:
				getDoublePrecisionFloatingPointNumericDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__DECIMAL_NUMERIC_DATA_TYPE:
				getDecimalNumericDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__MONEY_NUMERIC_DATA_TYPE:
				getMoneyNumericDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__FIXED_LENGTH_RAW_DATA_DATA_TYPE:
				getFixedLengthRawDataDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__VARIABLE_LENGTH_RAW_DATA_DATA_TYPE:
				getVariableLengthRawDataDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__LARGE_LENGTH_RAW_DATA_DATA_TYPE:
				getLargeLengthRawDataDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__PICTURE_RAW_DATA_DATA_TYPE:
				getPictureRawDataDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__OLE_OBJECT_RAW_DATA_DATA_TYPE:
				getOleObjectRawDataDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__AUTO_TIMESTAMP_TEMPORAL_DATA_TYPE:
				getAutoTimestampTemporalDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__TIME_TEMPORAL_DATA_TYPE:
				getTimeTemporalDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__DATE_TEMPORAL_DATA_TYPE:
				getDateTemporalDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__DATE_AND_TIME_TEMPORAL_DATA_TYPE:
				getDateAndTimeTemporalDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__TRUE_OR_FALSE_LOGICAL_DATA_TYPE:
				getTrueOrFalseLogicalDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__YES_OR_NO_LOGICAL_DATA_TYPE:
				getYesOrNoLogicalDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__ROW_ID_OTHER_DATA_TYPE:
				getRowIdOtherDataType().clear();
				return;
			case CorePackage.DATA_TYPES_TYPE__OBJECT_ID_OTHER_DATA_TYPE:
				getObjectIdOtherDataType().clear();
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
			case CorePackage.DATA_TYPES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.DATA_TYPES_TYPE__UNSPECIFIED_DATA_TYPE:
				return !getUnspecifiedDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__FIXED_LENGTH_TEXT_DATA_TYPE:
				return !getFixedLengthTextDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__VARIABLE_LENGTH_TEXT_DATA_TYPE:
				return !getVariableLengthTextDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__LARGE_LENGTH_TEXT_DATA_TYPE:
				return !getLargeLengthTextDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__SIGNED_INTEGER_NUMERIC_DATA_TYPE:
				return !getSignedIntegerNumericDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__SIGNED_SMALL_INTEGER_NUMERIC_DATA_TYPE:
				return !getSignedSmallIntegerNumericDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__SIGNED_LARGE_INTEGER_NUMERIC_DATA_TYPE:
				return !getSignedLargeIntegerNumericDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_INTEGER_NUMERIC_DATA_TYPE:
				return !getUnsignedIntegerNumericDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_TINY_INTEGER_NUMERIC_DATA_TYPE:
				return !getUnsignedTinyIntegerNumericDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_SMALL_INTEGER_NUMERIC_DATA_TYPE:
				return !getUnsignedSmallIntegerNumericDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__UNSIGNED_LARGE_INTEGER_NUMERIC_DATA_TYPE:
				return !getUnsignedLargeIntegerNumericDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__AUTO_COUNTER_NUMERIC_DATA_TYPE:
				return !getAutoCounterNumericDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__FLOATING_POINT_NUMERIC_DATA_TYPE:
				return !getFloatingPointNumericDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__SINGLE_PRECISION_FLOATING_POINT_NUMERIC_DATA_TYPE:
				return !getSinglePrecisionFloatingPointNumericDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__DOUBLE_PRECISION_FLOATING_POINT_NUMERIC_DATA_TYPE:
				return !getDoublePrecisionFloatingPointNumericDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__DECIMAL_NUMERIC_DATA_TYPE:
				return !getDecimalNumericDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__MONEY_NUMERIC_DATA_TYPE:
				return !getMoneyNumericDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__FIXED_LENGTH_RAW_DATA_DATA_TYPE:
				return !getFixedLengthRawDataDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__VARIABLE_LENGTH_RAW_DATA_DATA_TYPE:
				return !getVariableLengthRawDataDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__LARGE_LENGTH_RAW_DATA_DATA_TYPE:
				return !getLargeLengthRawDataDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__PICTURE_RAW_DATA_DATA_TYPE:
				return !getPictureRawDataDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__OLE_OBJECT_RAW_DATA_DATA_TYPE:
				return !getOleObjectRawDataDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__AUTO_TIMESTAMP_TEMPORAL_DATA_TYPE:
				return !getAutoTimestampTemporalDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__TIME_TEMPORAL_DATA_TYPE:
				return !getTimeTemporalDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__DATE_TEMPORAL_DATA_TYPE:
				return !getDateTemporalDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__DATE_AND_TIME_TEMPORAL_DATA_TYPE:
				return !getDateAndTimeTemporalDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__TRUE_OR_FALSE_LOGICAL_DATA_TYPE:
				return !getTrueOrFalseLogicalDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__YES_OR_NO_LOGICAL_DATA_TYPE:
				return !getYesOrNoLogicalDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__ROW_ID_OTHER_DATA_TYPE:
				return !getRowIdOtherDataType().isEmpty();
			case CorePackage.DATA_TYPES_TYPE__OBJECT_ID_OTHER_DATA_TYPE:
				return !getObjectIdOtherDataType().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //DataTypesTypeImpl
