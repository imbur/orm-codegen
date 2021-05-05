/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Too Few Entity Type Role Instances Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An entity instance is missing instance associations for some of the roles in its preferred identifier.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.TooFewEntityTypeRoleInstancesErrorType#getEntityTypeInstance <em>Entity Type Instance</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getTooFewEntityTypeRoleInstancesErrorType()
 * @model extendedMetaData="name='TooFewEntityTypeRoleInstancesErrorType' kind='elementOnly'"
 * @generated
 */
public interface TooFewEntityTypeRoleInstancesErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Entity Type Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type Instance</em>' containment reference.
	 * @see #setEntityTypeInstance(EntityTypeInstanceRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getTooFewEntityTypeRoleInstancesErrorType_EntityTypeInstance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EntityTypeInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EntityTypeInstanceRef getEntityTypeInstance();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.TooFewEntityTypeRoleInstancesErrorType#getEntityTypeInstance <em>Entity Type Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Type Instance</em>' containment reference.
	 * @see #getEntityTypeInstance()
	 * @generated
	 */
	void setEntityTypeInstance(EntityTypeInstanceRef value);

} // TooFewEntityTypeRoleInstancesErrorType
