/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Player Required Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A role must have a specified role player.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePlayerRequiredErrorType#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRolePlayerRequiredErrorType()
 * @model extendedMetaData="name='RolePlayerRequiredErrorType' kind='elementOnly'"
 * @generated
 */
public interface RolePlayerRequiredErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(RoleRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRolePlayerRequiredErrorType_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Role' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleRef getRole();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePlayerRequiredErrorType#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(RoleRef value);

} // RolePlayerRequiredErrorType
