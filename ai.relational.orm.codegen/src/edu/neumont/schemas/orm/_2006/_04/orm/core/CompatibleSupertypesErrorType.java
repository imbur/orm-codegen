/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compatible Supertypes Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Multiple supertypes are specified that do not share a common ancestor, or a supertype is specified that is implied by other supertypes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleSupertypesErrorType#getObjectType <em>Object Type</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCompatibleSupertypesErrorType()
 * @model extendedMetaData="name='CompatibleSupertypesErrorType' kind='elementOnly'"
 * @generated
 */
public interface CompatibleSupertypesErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type</em>' containment reference.
	 * @see #setObjectType(ObjectTypeRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCompatibleSupertypesErrorType_ObjectType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ObjectType' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectTypeRef getObjectType();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleSupertypesErrorType#getObjectType <em>Object Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type</em>' containment reference.
	 * @see #getObjectType()
	 * @generated
	 */
	void setObjectType(ObjectTypeRef value);

} // CompatibleSupertypesErrorType
