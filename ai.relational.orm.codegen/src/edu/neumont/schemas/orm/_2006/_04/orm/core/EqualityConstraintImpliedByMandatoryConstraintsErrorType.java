/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality Constraint Implied By Mandatory Constraints Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An equality constraint is implied by one or more mandatory constraints.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.EqualityConstraintImpliedByMandatoryConstraintsErrorType#getEqualityConstraint <em>Equality Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEqualityConstraintImpliedByMandatoryConstraintsErrorType()
 * @model extendedMetaData="name='EqualityConstraintImpliedByMandatoryConstraintsErrorType' kind='elementOnly'"
 * @generated
 */
public interface EqualityConstraintImpliedByMandatoryConstraintsErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Equality Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equality Constraint</em>' containment reference.
	 * @see #setEqualityConstraint(SetComparisonConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEqualityConstraintImpliedByMandatoryConstraintsErrorType_EqualityConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EqualityConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	SetComparisonConstraintRef getEqualityConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.EqualityConstraintImpliedByMandatoryConstraintsErrorType#getEqualityConstraint <em>Equality Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equality Constraint</em>' containment reference.
	 * @see #getEqualityConstraint()
	 * @generated
	 */
	void setEqualityConstraint(SetComparisonConstraintRef value);

} // EqualityConstraintImpliedByMandatoryConstraintsErrorType
