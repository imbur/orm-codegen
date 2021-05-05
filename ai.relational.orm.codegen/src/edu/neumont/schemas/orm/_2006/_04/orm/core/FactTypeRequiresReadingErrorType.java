/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact Type Requires Reading Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A predicate reading has not been specified for a fact type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRequiresReadingErrorType#getFact <em>Fact</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeRequiresReadingErrorType()
 * @model extendedMetaData="name='FactTypeRequiresReadingErrorType' kind='elementOnly'"
 * @generated
 */
public interface FactTypeRequiresReadingErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Fact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact</em>' containment reference.
	 * @see #setFact(FactTypeRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeRequiresReadingErrorType_Fact()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fact' namespace='##targetNamespace'"
	 * @generated
	 */
	FactTypeRef getFact();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRequiresReadingErrorType#getFact <em>Fact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact</em>' containment reference.
	 * @see #getFact()
	 * @generated
	 */
	void setFact(FactTypeRef value);

} // FactTypeRequiresReadingErrorType
