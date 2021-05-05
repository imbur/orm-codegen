/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duplicate Reading Signature Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Multiple readings have the same normalized signature, which is a normalized expanded form of the reading text and role player names.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DuplicateReadingSignatureErrorType#getReadings <em>Readings</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDuplicateReadingSignatureErrorType()
 * @model extendedMetaData="name='DuplicateReadingSignatureErrorType' kind='elementOnly'"
 * @generated
 */
public interface DuplicateReadingSignatureErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Readings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Readings with equivalent signatures.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Readings</em>' containment reference.
	 * @see #setReadings(ReadingsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDuplicateReadingSignatureErrorType_Readings()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Readings' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadingsType getReadings();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.DuplicateReadingSignatureErrorType#getReadings <em>Readings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readings</em>' containment reference.
	 * @see #getReadings()
	 * @generated
	 */
	void setReadings(ReadingsType value);

} // DuplicateReadingSignatureErrorType
