/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Type Requires Primary Supertype Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Deprecated along with SubtypeFact.IsPrimary property
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRequiresPrimarySupertypeErrorType#getObjectType <em>Object Type</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectTypeRequiresPrimarySupertypeErrorType()
 * @model extendedMetaData="name='ObjectTypeRequiresPrimarySupertypeErrorType' kind='elementOnly'"
 * @generated
 */
public interface ObjectTypeRequiresPrimarySupertypeErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type</em>' containment reference.
	 * @see #setObjectType(ObjectTypeRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectTypeRequiresPrimarySupertypeErrorType_ObjectType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ObjectType' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectTypeRef getObjectType();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRequiresPrimarySupertypeErrorType#getObjectType <em>Object Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type</em>' containment reference.
	 * @see #getObjectType()
	 * @generated
	 */
	void setObjectType(ObjectTypeRef value);

} // ObjectTypeRequiresPrimarySupertypeErrorType
