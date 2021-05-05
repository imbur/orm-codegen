/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joined Constraint Role Projection Compatibility Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A projection from a join path onto a constrained role is not compatible with the role player of that role.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.JoinedConstraintRoleProjectionCompatibilityErrorType#getConstraintRoleProjection <em>Constraint Role Projection</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getJoinedConstraintRoleProjectionCompatibilityErrorType()
 * @model extendedMetaData="name='JoinedConstraintRoleProjectionCompatibilityErrorType' kind='elementOnly'"
 * @generated
 */
public interface JoinedConstraintRoleProjectionCompatibilityErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Constraint Role Projection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Role Projection</em>' containment reference.
	 * @see #setConstraintRoleProjection(ConstraintRoleProjectionRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getJoinedConstraintRoleProjectionCompatibilityErrorType_ConstraintRoleProjection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ConstraintRoleProjection' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintRoleProjectionRef getConstraintRoleProjection();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.JoinedConstraintRoleProjectionCompatibilityErrorType#getConstraintRoleProjection <em>Constraint Role Projection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Role Projection</em>' containment reference.
	 * @see #getConstraintRoleProjection()
	 * @generated
	 */
	void setConstraintRoleProjection(ConstraintRoleProjectionRef value);

} // JoinedConstraintRoleProjectionCompatibilityErrorType
