/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recognized Phrase Duplicate Name Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Multiple recognized phrases have the same text.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhraseDuplicateNameErrorType#getRecognizedPhrases <em>Recognized Phrases</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRecognizedPhraseDuplicateNameErrorType()
 * @model extendedMetaData="name='RecognizedPhraseDuplicateNameErrorType' kind='elementOnly'"
 * @generated
 */
public interface RecognizedPhraseDuplicateNameErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Recognized Phrases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Like-named phrases.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recognized Phrases</em>' containment reference.
	 * @see #setRecognizedPhrases(RecognizedPhrasesType1)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRecognizedPhraseDuplicateNameErrorType_RecognizedPhrases()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RecognizedPhrases' namespace='##targetNamespace'"
	 * @generated
	 */
	RecognizedPhrasesType1 getRecognizedPhrases();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhraseDuplicateNameErrorType#getRecognizedPhrases <em>Recognized Phrases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recognized Phrases</em>' containment reference.
	 * @see #getRecognizedPhrases()
	 * @generated
	 */
	void setRecognizedPhrases(RecognizedPhrasesType1 value);

} // RecognizedPhraseDuplicateNameErrorType
