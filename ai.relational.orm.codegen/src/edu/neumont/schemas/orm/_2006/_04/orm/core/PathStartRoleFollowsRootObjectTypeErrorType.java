/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Start Role Follows Root Object Type Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * (Deprecated, StartRole is no longer used) A PathedRole with a purpose of StartRole must be the first PathedRole after the path root.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PathStartRoleFollowsRootObjectTypeErrorType#getPathedRole <em>Pathed Role</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathStartRoleFollowsRootObjectTypeErrorType()
 * @model extendedMetaData="name='PathStartRoleFollowsRootObjectTypeErrorType' kind='elementOnly'"
 * @generated
 */
public interface PathStartRoleFollowsRootObjectTypeErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Pathed Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathed Role</em>' containment reference.
	 * @see #setPathedRole(PathedRoleRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathStartRoleFollowsRootObjectTypeErrorType_PathedRole()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PathedRole' namespace='##targetNamespace'"
	 * @generated
	 */
	PathedRoleRef getPathedRole();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathStartRoleFollowsRootObjectTypeErrorType#getPathedRole <em>Pathed Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pathed Role</em>' containment reference.
	 * @see #getPathedRole()
	 * @generated
	 */
	void setPathedRole(PathedRoleRef value);

} // PathStartRoleFollowsRootObjectTypeErrorType
