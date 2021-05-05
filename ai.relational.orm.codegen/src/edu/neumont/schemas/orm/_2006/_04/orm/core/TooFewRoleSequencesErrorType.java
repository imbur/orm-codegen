/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Too Few Role Sequences Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An external constraint requires multiple roles (SetConstraint) or multiple role sequences (SetComparisonConstraint).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.TooFewRoleSequencesErrorType#getSetComparisonConstraint <em>Set Comparison Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.TooFewRoleSequencesErrorType#getSetConstraint <em>Set Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getTooFewRoleSequencesErrorType()
 * @model extendedMetaData="name='TooFewRoleSequencesErrorType' kind='elementOnly'"
 * @generated
 */
public interface TooFewRoleSequencesErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Set Comparison Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Comparison Constraint</em>' containment reference.
	 * @see #setSetComparisonConstraint(SetComparisonConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getTooFewRoleSequencesErrorType_SetComparisonConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SetComparisonConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	SetComparisonConstraintRef getSetComparisonConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.TooFewRoleSequencesErrorType#getSetComparisonConstraint <em>Set Comparison Constraint</em>}' containment reference.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getTooFewRoleSequencesErrorType_SetConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SetConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	SetConstraintRef getSetConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.TooFewRoleSequencesErrorType#getSetConstraint <em>Set Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Constraint</em>' containment reference.
	 * @see #getSetConstraint()
	 * @generated
	 */
	void setSetConstraint(SetConstraintRef value);

} // TooFewRoleSequencesErrorType
