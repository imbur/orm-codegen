/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objectified Instance Required Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance an objectifying entity does not have an associated instance for the objectifed fact type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedInstanceRequiredErrorType#getEntityTypeInstance <em>Entity Type Instance</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedInstanceRequiredErrorType#getEntityTypeSubtypeInstance <em>Entity Type Subtype Instance</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectifiedInstanceRequiredErrorType()
 * @model extendedMetaData="name='ObjectifiedInstanceRequiredErrorType' kind='elementOnly'"
 * @generated
 */
public interface ObjectifiedInstanceRequiredErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Entity Type Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type Instance</em>' containment reference.
	 * @see #setEntityTypeInstance(EntityTypeInstanceRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectifiedInstanceRequiredErrorType_EntityTypeInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EntityTypeInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EntityTypeInstanceRef getEntityTypeInstance();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedInstanceRequiredErrorType#getEntityTypeInstance <em>Entity Type Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Type Instance</em>' containment reference.
	 * @see #getEntityTypeInstance()
	 * @generated
	 */
	void setEntityTypeInstance(EntityTypeInstanceRef value);

	/**
	 * Returns the value of the '<em><b>Entity Type Subtype Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type Subtype Instance</em>' containment reference.
	 * @see #setEntityTypeSubtypeInstance(EntityTypeSubtypeInstanceRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectifiedInstanceRequiredErrorType_EntityTypeSubtypeInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EntityTypeSubtypeInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EntityTypeSubtypeInstanceRef getEntityTypeSubtypeInstance();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedInstanceRequiredErrorType#getEntityTypeSubtypeInstance <em>Entity Type Subtype Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity Type Subtype Instance</em>' containment reference.
	 * @see #getEntityTypeSubtypeInstance()
	 * @generated
	 */
	void setEntityTypeSubtypeInstance(EntityTypeSubtypeInstanceRef value);

} // ObjectifiedInstanceRequiredErrorType
