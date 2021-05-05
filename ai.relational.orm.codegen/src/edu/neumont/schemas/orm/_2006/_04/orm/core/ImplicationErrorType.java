/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implication Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A constraint is implied by another constraint in the model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImplicationErrorType#getSetComparisonConstraint <em>Set Comparison Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImplicationErrorType#getSetConstraint <em>Set Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImplicationErrorType()
 * @model extendedMetaData="name='ImplicationErrorType' kind='elementOnly'"
 * @generated
 */
public interface ImplicationErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Set Comparison Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Comparison Constraint</em>' containment reference.
	 * @see #setSetComparisonConstraint(SetComparisonConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImplicationErrorType_SetComparisonConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SetComparisonConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	SetComparisonConstraintRef getSetComparisonConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImplicationErrorType#getSetComparisonConstraint <em>Set Comparison Constraint</em>}' containment reference.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImplicationErrorType_SetConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SetConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	SetConstraintRef getSetConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImplicationErrorType#getSetConstraint <em>Set Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Constraint</em>' containment reference.
	 * @see #getSetConstraint()
	 * @generated
	 */
	void setSetConstraint(SetConstraintRef value);

} // ImplicationErrorType
