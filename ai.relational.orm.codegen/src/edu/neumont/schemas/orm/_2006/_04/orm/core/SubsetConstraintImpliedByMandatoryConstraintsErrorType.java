/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subset Constraint Implied By Mandatory Constraints Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subset constraint is implied by one or more mandatory constraints.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubsetConstraintImpliedByMandatoryConstraintsErrorType#getSubsetConstraint <em>Subset Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubsetConstraintImpliedByMandatoryConstraintsErrorType()
 * @model extendedMetaData="name='SubsetConstraintImpliedByMandatoryConstraintsErrorType' kind='elementOnly'"
 * @generated
 */
public interface SubsetConstraintImpliedByMandatoryConstraintsErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Subset Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subset Constraint</em>' containment reference.
	 * @see #setSubsetConstraint(SetComparisonConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubsetConstraintImpliedByMandatoryConstraintsErrorType_SubsetConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SubsetConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	SetComparisonConstraintRef getSubsetConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubsetConstraintImpliedByMandatoryConstraintsErrorType#getSubsetConstraint <em>Subset Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subset Constraint</em>' containment reference.
	 * @see #getSubsetConstraint()
	 * @generated
	 */
	void setSubsetConstraint(SetComparisonConstraintRef value);

} // SubsetConstraintImpliedByMandatoryConstraintsErrorType
