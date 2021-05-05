/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculated Path Value Must Be Consumed Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A calculated value in a role path must be consumed as a path condition, an input to another calculation, or a projection onto a path.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueMustBeConsumedErrorType#getCalculatedValue <em>Calculated Value</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCalculatedPathValueMustBeConsumedErrorType()
 * @model extendedMetaData="name='CalculatedPathValueMustBeConsumedErrorType' kind='elementOnly'"
 * @generated
 */
public interface CalculatedPathValueMustBeConsumedErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Calculated Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculated Value</em>' containment reference.
	 * @see #setCalculatedValue(CalculatedValueRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCalculatedPathValueMustBeConsumedErrorType_CalculatedValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CalculatedValue' namespace='##targetNamespace'"
	 * @generated
	 */
	CalculatedValueRef getCalculatedValue();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueMustBeConsumedErrorType#getCalculatedValue <em>Calculated Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated Value</em>' containment reference.
	 * @see #getCalculatedValue()
	 * @generated
	 */
	void setCalculatedValue(CalculatedValueRef value);

} // CalculatedPathValueMustBeConsumedErrorType
