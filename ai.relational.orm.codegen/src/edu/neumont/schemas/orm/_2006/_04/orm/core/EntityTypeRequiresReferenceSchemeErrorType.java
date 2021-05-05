/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type Requires Reference Scheme Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An entity type requires a reference scheme or a supertype that provides a preferred identification path.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeRequiresReferenceSchemeErrorType#getEntityType <em>Entity Type</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeRequiresReferenceSchemeErrorType()
 * @model extendedMetaData="name='EntityTypeRequiresReferenceSchemeErrorType' kind='elementOnly'"
 * @generated
 */
public interface EntityTypeRequiresReferenceSchemeErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Entity Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type</em>' containment reference.
	 * @see #setEntityType(ObjectTypeRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeRequiresReferenceSchemeErrorType_EntityType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EntityType' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectTypeRef getEntityType();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeRequiresReferenceSchemeErrorType#getEntityType <em>Entity Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Type</em>' containment reference.
	 * @see #getEntityType()
	 * @generated
	 */
	void setEntityType(ObjectTypeRef value);

} // EntityTypeRequiresReferenceSchemeErrorType
