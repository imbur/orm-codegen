/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The container for note elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.NotesType#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNotesType()
 * @model extendedMetaData="name='NotesType' kind='elementOnly'"
 * @generated
 */
public interface NotesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' containment reference.
	 * @see #setNote(NoteType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNotesType_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Note' namespace='##targetNamespace'"
	 * @generated
	 */
	NoteType getNote();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NotesType#getNote <em>Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Note</em>' containment reference.
	 * @see #getNote()
	 * @generated
	 */
	void setNote(NoteType value);

} // NotesType
