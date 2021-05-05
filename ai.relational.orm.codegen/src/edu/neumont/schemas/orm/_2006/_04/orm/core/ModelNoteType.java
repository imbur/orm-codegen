/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Note Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A miscellaneous note for this model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelNoteType#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelNoteType()
 * @model extendedMetaData="name='ModelNoteType' kind='elementOnly'"
 * @generated
 */
public interface ModelNoteType extends NoteType {
	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' containment reference.
	 * @see #setReferencedBy(ModelNoteReferencedByType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelNoteType_ReferencedBy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferencedBy' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelNoteReferencedByType getReferencedBy();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelNoteType#getReferencedBy <em>Referenced By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced By</em>' containment reference.
	 * @see #getReferencedBy()
	 * @generated
	 */
	void setReferencedBy(ModelNoteReferencedByType value);

} // ModelNoteType
