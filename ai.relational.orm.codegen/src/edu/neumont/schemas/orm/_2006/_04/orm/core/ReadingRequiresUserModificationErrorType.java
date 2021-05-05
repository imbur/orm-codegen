/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reading Requires User Modification Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reading has been automatically modified and must be edited by the user to restore its meaning.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingRequiresUserModificationErrorType#getReading <em>Reading</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getReadingRequiresUserModificationErrorType()
 * @model extendedMetaData="name='ReadingRequiresUserModificationErrorType' kind='elementOnly'"
 * @generated
 */
public interface ReadingRequiresUserModificationErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading</em>' containment reference.
	 * @see #setReading(ReadingRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getReadingRequiresUserModificationErrorType_Reading()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Reading' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadingRef getReading();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingRequiresUserModificationErrorType#getReading <em>Reading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading</em>' containment reference.
	 * @see #getReading()
	 * @generated
	 */
	void setReading(ReadingRef value);

} // ReadingRequiresUserModificationErrorType
