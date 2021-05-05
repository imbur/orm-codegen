/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Comparison Roles Not Comparable Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The roles in a value comparison constraint cannot be compared.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonRolesNotComparableErrorType#getValueComparisonConstraint <em>Value Comparison Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueComparisonRolesNotComparableErrorType()
 * @model extendedMetaData="name='ValueComparisonRolesNotComparableErrorType' kind='elementOnly'"
 * @generated
 */
public interface ValueComparisonRolesNotComparableErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Value Comparison Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Comparison Constraint</em>' containment reference.
	 * @see #setValueComparisonConstraint(ValueComparisonConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueComparisonRolesNotComparableErrorType_ValueComparisonConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ValueComparisonConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueComparisonConstraintRef getValueComparisonConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonRolesNotComparableErrorType#getValueComparisonConstraint <em>Value Comparison Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Comparison Constraint</em>' containment reference.
	 * @see #getValueComparisonConstraint()
	 * @generated
	 */
	void setValueComparisonConstraint(ValueComparisonConstraintRef value);

} // ValueComparisonRolesNotComparableErrorType
