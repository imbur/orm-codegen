/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preferred Identifier Requires Mandatory Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The roles opposite a preferred identifier must have at least one mandatory constraint that covers a subset of the opposite roles.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PreferredIdentifierRequiresMandatoryErrorType#getObjectType <em>Object Type</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPreferredIdentifierRequiresMandatoryErrorType()
 * @model extendedMetaData="name='PreferredIdentifierRequiresMandatoryErrorType' kind='elementOnly'"
 * @generated
 */
public interface PreferredIdentifierRequiresMandatoryErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type</em>' containment reference.
	 * @see #setObjectType(ObjectTypeRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPreferredIdentifierRequiresMandatoryErrorType_ObjectType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ObjectType' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectTypeRef getObjectType();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PreferredIdentifierRequiresMandatoryErrorType#getObjectType <em>Object Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type</em>' containment reference.
	 * @see #getObjectType()
	 * @generated
	 */
	void setObjectType(ObjectTypeRef value);

} // PreferredIdentifierRequiresMandatoryErrorType
