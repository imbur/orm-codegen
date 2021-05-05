/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correlated Path Role Requires Compatible Role Player Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * (Deprecated, use ObjectUnifierRequiresCompatibleRolePlayersError) A PathedRole has an explicit correlation with a PathedRole that has an incompatible role player.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CorrelatedPathRoleRequiresCompatibleRolePlayerErrorType#getPathedRole <em>Pathed Role</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCorrelatedPathRoleRequiresCompatibleRolePlayerErrorType()
 * @model extendedMetaData="name='CorrelatedPathRoleRequiresCompatibleRolePlayerErrorType' kind='elementOnly'"
 * @generated
 */
public interface CorrelatedPathRoleRequiresCompatibleRolePlayerErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Pathed Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathed Role</em>' containment reference.
	 * @see #setPathedRole(PathedRoleRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCorrelatedPathRoleRequiresCompatibleRolePlayerErrorType_PathedRole()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PathedRole' namespace='##targetNamespace'"
	 * @generated
	 */
	PathedRoleRef getPathedRole();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CorrelatedPathRoleRequiresCompatibleRolePlayerErrorType#getPathedRole <em>Pathed Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pathed Role</em>' containment reference.
	 * @see #getPathedRole()
	 * @generated
	 */
	void setPathedRole(PathedRoleRef value);

} // CorrelatedPathRoleRequiresCompatibleRolePlayerErrorType
