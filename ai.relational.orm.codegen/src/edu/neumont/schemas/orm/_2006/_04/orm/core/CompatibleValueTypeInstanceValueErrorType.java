/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compatible Value Type Instance Value Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The value of an instance is not compatible with the data type of the corresponding value type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleValueTypeInstanceValueErrorType#getValueTypeInstance <em>Value Type Instance</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCompatibleValueTypeInstanceValueErrorType()
 * @model extendedMetaData="name='CompatibleValueTypeInstanceValueErrorType' kind='elementOnly'"
 * @generated
 */
public interface CompatibleValueTypeInstanceValueErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Value Type Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type Instance</em>' containment reference.
	 * @see #setValueTypeInstance(ValueTypeInstanceRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCompatibleValueTypeInstanceValueErrorType_ValueTypeInstance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ValueTypeInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueTypeInstanceRef getValueTypeInstance();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleValueTypeInstanceValueErrorType#getValueTypeInstance <em>Value Type Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Type Instance</em>' containment reference.
	 * @see #getValueTypeInstance()
	 * @generated
	 */
	void setValueTypeInstance(ValueTypeInstanceRef value);

} // CompatibleValueTypeInstanceValueErrorType
