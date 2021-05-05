/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculated Path Value Parameter Binding Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A parameter binding is missing for the parameters associated with the function that calculates a calculated value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueParameterBindingErrorType#getCalculatedValue <em>Calculated Value</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCalculatedPathValueParameterBindingErrorType()
 * @model extendedMetaData="name='CalculatedPathValueParameterBindingErrorType' kind='elementOnly'"
 * @generated
 */
public interface CalculatedPathValueParameterBindingErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Calculated Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculated Value</em>' containment reference.
	 * @see #setCalculatedValue(CalculatedValueType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCalculatedPathValueParameterBindingErrorType_CalculatedValue()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CalculatedValue' namespace='##targetNamespace'"
	 * @generated
	 */
	CalculatedValueType getCalculatedValue();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedPathValueParameterBindingErrorType#getCalculatedValue <em>Calculated Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated Value</em>' containment reference.
	 * @see #getCalculatedValue()
	 * @generated
	 */
	void setCalculatedValue(CalculatedValueType value);

} // CalculatedPathValueParameterBindingErrorType
