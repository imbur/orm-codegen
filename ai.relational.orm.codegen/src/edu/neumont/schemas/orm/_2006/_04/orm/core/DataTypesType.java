/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Types Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for all data types used in the model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getUnspecifiedDataType <em>Unspecified Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getFixedLengthTextDataType <em>Fixed Length Text Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getVariableLengthTextDataType <em>Variable Length Text Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getLargeLengthTextDataType <em>Large Length Text Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getSignedIntegerNumericDataType <em>Signed Integer Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getSignedSmallIntegerNumericDataType <em>Signed Small Integer Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getSignedLargeIntegerNumericDataType <em>Signed Large Integer Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getUnsignedIntegerNumericDataType <em>Unsigned Integer Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getUnsignedTinyIntegerNumericDataType <em>Unsigned Tiny Integer Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getUnsignedSmallIntegerNumericDataType <em>Unsigned Small Integer Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getUnsignedLargeIntegerNumericDataType <em>Unsigned Large Integer Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getAutoCounterNumericDataType <em>Auto Counter Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getFloatingPointNumericDataType <em>Floating Point Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getSinglePrecisionFloatingPointNumericDataType <em>Single Precision Floating Point Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getDoublePrecisionFloatingPointNumericDataType <em>Double Precision Floating Point Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getDecimalNumericDataType <em>Decimal Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getMoneyNumericDataType <em>Money Numeric Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getFixedLengthRawDataDataType <em>Fixed Length Raw Data Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getVariableLengthRawDataDataType <em>Variable Length Raw Data Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getLargeLengthRawDataDataType <em>Large Length Raw Data Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getPictureRawDataDataType <em>Picture Raw Data Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getOleObjectRawDataDataType <em>Ole Object Raw Data Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getAutoTimestampTemporalDataType <em>Auto Timestamp Temporal Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getTimeTemporalDataType <em>Time Temporal Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getDateTemporalDataType <em>Date Temporal Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getDateAndTimeTemporalDataType <em>Date And Time Temporal Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getTrueOrFalseLogicalDataType <em>True Or False Logical Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getYesOrNoLogicalDataType <em>Yes Or No Logical Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getRowIdOtherDataType <em>Row Id Other Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType#getObjectIdOtherDataType <em>Object Id Other Data Type</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType()
 * @model extendedMetaData="name='DataTypesType' kind='elementOnly'"
 * @generated
 */
public interface DataTypesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Unspecified Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.UnspecifiedDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unspecified Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_UnspecifiedDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnspecifiedDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<UnspecifiedDataTypeType> getUnspecifiedDataType();

	/**
	 * Returns the value of the '<em><b>Fixed Length Text Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.FixedLengthTextDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Length Text Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_FixedLengthTextDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FixedLengthTextDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FixedLengthTextDataTypeType> getFixedLengthTextDataType();

	/**
	 * Returns the value of the '<em><b>Variable Length Text Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.VariableLengthTextDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Length Text Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_VariableLengthTextDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VariableLengthTextDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<VariableLengthTextDataTypeType> getVariableLengthTextDataType();

	/**
	 * Returns the value of the '<em><b>Large Length Text Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.LargeLengthTextDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Large Length Text Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_LargeLengthTextDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LargeLengthTextDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LargeLengthTextDataTypeType> getLargeLengthTextDataType();

	/**
	 * Returns the value of the '<em><b>Signed Integer Numeric Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.SignedIntegerNumericDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signed Integer Numeric Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_SignedIntegerNumericDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignedIntegerNumericDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SignedIntegerNumericDataTypeType> getSignedIntegerNumericDataType();

	/**
	 * Returns the value of the '<em><b>Signed Small Integer Numeric Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.SignedSmallIntegerNumericDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signed Small Integer Numeric Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_SignedSmallIntegerNumericDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignedSmallIntegerNumericDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SignedSmallIntegerNumericDataTypeType> getSignedSmallIntegerNumericDataType();

	/**
	 * Returns the value of the '<em><b>Signed Large Integer Numeric Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.SignedLargeIntegerNumericDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signed Large Integer Numeric Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_SignedLargeIntegerNumericDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SignedLargeIntegerNumericDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SignedLargeIntegerNumericDataTypeType> getSignedLargeIntegerNumericDataType();

	/**
	 * Returns the value of the '<em><b>Unsigned Integer Numeric Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.UnsignedIntegerNumericDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsigned Integer Numeric Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_UnsignedIntegerNumericDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnsignedIntegerNumericDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<UnsignedIntegerNumericDataTypeType> getUnsignedIntegerNumericDataType();

	/**
	 * Returns the value of the '<em><b>Unsigned Tiny Integer Numeric Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.UnsignedTinyIntegerNumericDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsigned Tiny Integer Numeric Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_UnsignedTinyIntegerNumericDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnsignedTinyIntegerNumericDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<UnsignedTinyIntegerNumericDataTypeType> getUnsignedTinyIntegerNumericDataType();

	/**
	 * Returns the value of the '<em><b>Unsigned Small Integer Numeric Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.UnsignedSmallIntegerNumericDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsigned Small Integer Numeric Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_UnsignedSmallIntegerNumericDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnsignedSmallIntegerNumericDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<UnsignedSmallIntegerNumericDataTypeType> getUnsignedSmallIntegerNumericDataType();

	/**
	 * Returns the value of the '<em><b>Unsigned Large Integer Numeric Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.UnsignedLargeIntegerNumericDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsigned Large Integer Numeric Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_UnsignedLargeIntegerNumericDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UnsignedLargeIntegerNumericDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<UnsignedLargeIntegerNumericDataTypeType> getUnsignedLargeIntegerNumericDataType();

	/**
	 * Returns the value of the '<em><b>Auto Counter Numeric Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.AutoCounterNumericDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Counter Numeric Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_AutoCounterNumericDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutoCounterNumericDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AutoCounterNumericDataTypeType> getAutoCounterNumericDataType();

	/**
	 * Returns the value of the '<em><b>Floating Point Numeric Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.FloatingPointNumericDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floating Point Numeric Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_FloatingPointNumericDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FloatingPointNumericDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FloatingPointNumericDataTypeType> getFloatingPointNumericDataType();

	/**
	 * Returns the value of the '<em><b>Single Precision Floating Point Numeric Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.SinglePrecisionFloatingPointNumericDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Precision Floating Point Numeric Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_SinglePrecisionFloatingPointNumericDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SinglePrecisionFloatingPointNumericDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SinglePrecisionFloatingPointNumericDataTypeType> getSinglePrecisionFloatingPointNumericDataType();

	/**
	 * Returns the value of the '<em><b>Double Precision Floating Point Numeric Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.DoublePrecisionFloatingPointNumericDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double Precision Floating Point Numeric Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_DoublePrecisionFloatingPointNumericDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DoublePrecisionFloatingPointNumericDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DoublePrecisionFloatingPointNumericDataTypeType> getDoublePrecisionFloatingPointNumericDataType();

	/**
	 * Returns the value of the '<em><b>Decimal Numeric Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.DecimalNumericDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Numeric Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_DecimalNumericDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DecimalNumericDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DecimalNumericDataTypeType> getDecimalNumericDataType();

	/**
	 * Returns the value of the '<em><b>Money Numeric Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.MoneyNumericDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Money Numeric Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_MoneyNumericDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MoneyNumericDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MoneyNumericDataTypeType> getMoneyNumericDataType();

	/**
	 * Returns the value of the '<em><b>Fixed Length Raw Data Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.FixedLengthRawDataDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed Length Raw Data Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_FixedLengthRawDataDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FixedLengthRawDataDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FixedLengthRawDataDataTypeType> getFixedLengthRawDataDataType();

	/**
	 * Returns the value of the '<em><b>Variable Length Raw Data Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.VariableLengthRawDataDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Length Raw Data Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_VariableLengthRawDataDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VariableLengthRawDataDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<VariableLengthRawDataDataTypeType> getVariableLengthRawDataDataType();

	/**
	 * Returns the value of the '<em><b>Large Length Raw Data Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.LargeLengthRawDataDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Large Length Raw Data Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_LargeLengthRawDataDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LargeLengthRawDataDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LargeLengthRawDataDataTypeType> getLargeLengthRawDataDataType();

	/**
	 * Returns the value of the '<em><b>Picture Raw Data Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.PictureRawDataDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Picture Raw Data Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_PictureRawDataDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PictureRawDataDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PictureRawDataDataTypeType> getPictureRawDataDataType();

	/**
	 * Returns the value of the '<em><b>Ole Object Raw Data Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.OleObjectRawDataDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ole Object Raw Data Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_OleObjectRawDataDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OleObjectRawDataDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<OleObjectRawDataDataTypeType> getOleObjectRawDataDataType();

	/**
	 * Returns the value of the '<em><b>Auto Timestamp Temporal Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.AutoTimestampTemporalDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Timestamp Temporal Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_AutoTimestampTemporalDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AutoTimestampTemporalDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AutoTimestampTemporalDataTypeType> getAutoTimestampTemporalDataType();

	/**
	 * Returns the value of the '<em><b>Time Temporal Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.TimeTemporalDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Temporal Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_TimeTemporalDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TimeTemporalDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TimeTemporalDataTypeType> getTimeTemporalDataType();

	/**
	 * Returns the value of the '<em><b>Date Temporal Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.DateTemporalDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Temporal Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_DateTemporalDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DateTemporalDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DateTemporalDataTypeType> getDateTemporalDataType();

	/**
	 * Returns the value of the '<em><b>Date And Time Temporal Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.DateAndTimeTemporalDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date And Time Temporal Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_DateAndTimeTemporalDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DateAndTimeTemporalDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DateAndTimeTemporalDataTypeType> getDateAndTimeTemporalDataType();

	/**
	 * Returns the value of the '<em><b>True Or False Logical Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.TrueOrFalseLogicalDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>True Or False Logical Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_TrueOrFalseLogicalDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TrueOrFalseLogicalDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TrueOrFalseLogicalDataTypeType> getTrueOrFalseLogicalDataType();

	/**
	 * Returns the value of the '<em><b>Yes Or No Logical Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.YesOrNoLogicalDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yes Or No Logical Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_YesOrNoLogicalDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='YesOrNoLogicalDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<YesOrNoLogicalDataTypeType> getYesOrNoLogicalDataType();

	/**
	 * Returns the value of the '<em><b>Row Id Other Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.RowIdOtherDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Id Other Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_RowIdOtherDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RowIdOtherDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RowIdOtherDataTypeType> getRowIdOtherDataType();

	/**
	 * Returns the value of the '<em><b>Object Id Other Data Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectIdOtherDataTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Id Other Data Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypesType_ObjectIdOtherDataType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectIdOtherDataType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ObjectIdOtherDataTypeType> getObjectIdOtherDataType();

} // DataTypesType
