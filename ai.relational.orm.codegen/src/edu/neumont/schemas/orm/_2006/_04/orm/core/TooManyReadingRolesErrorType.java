/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Too Many Reading Roles Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reading text does not have enough placeholders for all roles.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.TooManyReadingRolesErrorType#getReading <em>Reading</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getTooManyReadingRolesErrorType()
 * @model extendedMetaData="name='TooManyReadingRolesErrorType' kind='elementOnly'"
 * @generated
 */
public interface TooManyReadingRolesErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Reading</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading</em>' containment reference.
	 * @see #setReading(ReadingRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getTooManyReadingRolesErrorType_Reading()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Reading' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadingRef getReading();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.TooManyReadingRolesErrorType#getReading <em>Reading</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading</em>' containment reference.
	 * @see #getReading()
	 * @generated
	 */
	void setReading(ReadingRef value);

} // TooManyReadingRolesErrorType
