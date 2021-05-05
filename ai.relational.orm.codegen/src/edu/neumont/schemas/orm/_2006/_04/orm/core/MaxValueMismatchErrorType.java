/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Max Value Mismatch Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The maximum value of a value range cannot be interpreted as the specified data type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.MaxValueMismatchErrorType#getValueRange <em>Value Range</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getMaxValueMismatchErrorType()
 * @model extendedMetaData="name='MaxValueMismatchErrorType' kind='elementOnly'"
 * @generated
 */
public interface MaxValueMismatchErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Value Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Range</em>' containment reference.
	 * @see #setValueRange(ValueRangeRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getMaxValueMismatchErrorType_ValueRange()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ValueRange' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueRangeRef getValueRange();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.MaxValueMismatchErrorType#getValueRange <em>Value Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Range</em>' containment reference.
	 * @see #getValueRange()
	 * @generated
	 */
	void setValueRange(ValueRangeRef value);

} // MaxValueMismatchErrorType
