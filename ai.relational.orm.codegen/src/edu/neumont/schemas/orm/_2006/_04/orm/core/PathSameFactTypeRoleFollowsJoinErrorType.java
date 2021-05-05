/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Same Fact Type Role Follows Join Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A PathedRole with a purpose of SameFactType must follow an entry into the fact type with a join or start role. A role within a single fact type cannot be reused in a path without first joining to another instance of the same fact type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PathSameFactTypeRoleFollowsJoinErrorType#getPathedRole <em>Pathed Role</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathSameFactTypeRoleFollowsJoinErrorType()
 * @model extendedMetaData="name='PathSameFactTypeRoleFollowsJoinErrorType' kind='elementOnly'"
 * @generated
 */
public interface PathSameFactTypeRoleFollowsJoinErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Pathed Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathed Role</em>' containment reference.
	 * @see #setPathedRole(PathedRoleRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathSameFactTypeRoleFollowsJoinErrorType_PathedRole()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PathedRole' namespace='##targetNamespace'"
	 * @generated
	 */
	PathedRoleRef getPathedRole();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathSameFactTypeRoleFollowsJoinErrorType#getPathedRole <em>Pathed Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pathed Role</em>' containment reference.
	 * @see #getPathedRole()
	 * @generated
	 */
	void setPathedRole(PathedRoleRef value);

} // PathSameFactTypeRoleFollowsJoinErrorType
