/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Requires Root Object Type Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A role path does not have a specified root object type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PathRequiresRootObjectTypeErrorType#getRolePath <em>Role Path</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PathRequiresRootObjectTypeErrorType#getSubPath <em>Sub Path</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathRequiresRootObjectTypeErrorType()
 * @model extendedMetaData="name='PathRequiresRootObjectTypeErrorType' kind='elementOnly'"
 * @generated
 */
public interface PathRequiresRootObjectTypeErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Role Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Path</em>' containment reference.
	 * @see #setRolePath(LeadRolePathRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathRequiresRootObjectTypeErrorType_RolePath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RolePath' namespace='##targetNamespace'"
	 * @generated
	 */
	LeadRolePathRef getRolePath();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathRequiresRootObjectTypeErrorType#getRolePath <em>Role Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Path</em>' containment reference.
	 * @see #getRolePath()
	 * @generated
	 */
	void setRolePath(LeadRolePathRef value);

	/**
	 * Returns the value of the '<em><b>Sub Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Path</em>' containment reference.
	 * @see #setSubPath(RoleSubPathRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathRequiresRootObjectTypeErrorType_SubPath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubPath' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleSubPathRef getSubPath();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathRequiresRootObjectTypeErrorType#getSubPath <em>Sub Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Path</em>' containment reference.
	 * @see #getSubPath()
	 * @generated
	 */
	void setSubPath(RoleSubPathRef value);

} // PathRequiresRootObjectTypeErrorType
