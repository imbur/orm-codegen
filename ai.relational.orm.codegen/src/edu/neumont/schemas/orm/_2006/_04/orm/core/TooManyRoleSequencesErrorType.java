/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Too Many Role Sequences Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SetConstraint has too many roles for the constraint type, or a SetComparisonConstraint has too many role sequences.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.TooManyRoleSequencesErrorType#getSetComparisonConstraint <em>Set Comparison Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.TooManyRoleSequencesErrorType#getSetConstraint <em>Set Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getTooManyRoleSequencesErrorType()
 * @model extendedMetaData="name='TooManyRoleSequencesErrorType' kind='elementOnly'"
 * @generated
 */
public interface TooManyRoleSequencesErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Set Comparison Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Comparison Constraint</em>' containment reference.
	 * @see #setSetComparisonConstraint(SetComparisonConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getTooManyRoleSequencesErrorType_SetComparisonConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SetComparisonConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	SetComparisonConstraintRef getSetComparisonConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.TooManyRoleSequencesErrorType#getSetComparisonConstraint <em>Set Comparison Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Comparison Constraint</em>' containment reference.
	 * @see #getSetComparisonConstraint()
	 * @generated
	 */
	void setSetComparisonConstraint(SetComparisonConstraintRef value);

	/**
	 * Returns the value of the '<em><b>Set Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Constraint</em>' containment reference.
	 * @see #setSetConstraint(SetConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getTooManyRoleSequencesErrorType_SetConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SetConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	SetConstraintRef getSetConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.TooManyRoleSequencesErrorType#getSetConstraint <em>Set Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Constraint</em>' containment reference.
	 * @see #getSetConstraint()
	 * @generated
	 */
	void setSetConstraint(SetConstraintRef value);

} // TooManyRoleSequencesErrorType
