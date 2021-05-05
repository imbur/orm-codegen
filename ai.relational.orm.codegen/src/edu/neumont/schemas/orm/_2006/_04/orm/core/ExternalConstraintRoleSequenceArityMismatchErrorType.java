/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Constraint Role Sequence Arity Mismatch Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SetComparisonConstraint has an inconsistent number of columns.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ExternalConstraintRoleSequenceArityMismatchErrorType#getConstraint <em>Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getExternalConstraintRoleSequenceArityMismatchErrorType()
 * @model extendedMetaData="name='ExternalConstraintRoleSequenceArityMismatchErrorType' kind='elementOnly'"
 * @generated
 */
public interface ExternalConstraintRoleSequenceArityMismatchErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference.
	 * @see #setConstraint(SetComparisonConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getExternalConstraintRoleSequenceArityMismatchErrorType_Constraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Constraint' namespace='##targetNamespace'"
	 * @generated
	 */
	SetComparisonConstraintRef getConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ExternalConstraintRoleSequenceArityMismatchErrorType#getConstraint <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' containment reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(SetComparisonConstraintRef value);

} // ExternalConstraintRoleSequenceArityMismatchErrorType
