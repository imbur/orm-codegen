/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Type Duplicate Name Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Multiple object types share the same name.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeDuplicateNameErrorType#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectTypeDuplicateNameErrorType()
 * @model extendedMetaData="name='ObjectTypeDuplicateNameErrorType' kind='elementOnly'"
 * @generated
 */
public interface ObjectTypeDuplicateNameErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Like-named object types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference.
	 * @see #setObjects(ObjectsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectTypeDuplicateNameErrorType_Objects()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Objects' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectsType getObjects();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeDuplicateNameErrorType#getObjects <em>Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objects</em>' containment reference.
	 * @see #getObjects()
	 * @generated
	 */
	void setObjects(ObjectsType value);

} // ObjectTypeDuplicateNameErrorType
