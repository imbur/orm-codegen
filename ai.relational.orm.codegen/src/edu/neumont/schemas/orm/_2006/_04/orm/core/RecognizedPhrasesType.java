/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recognized Phrases Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for recognized phrases.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhrasesType#getRecognizedPhrase <em>Recognized Phrase</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRecognizedPhrasesType()
 * @model extendedMetaData="name='RecognizedPhrasesType' kind='elementOnly'"
 * @generated
 */
public interface RecognizedPhrasesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Recognized Phrase</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhraseType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recognized Phrase</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRecognizedPhrasesType_RecognizedPhrase()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RecognizedPhrase' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RecognizedPhraseType> getRecognizedPhrase();

} // RecognizedPhrasesType
