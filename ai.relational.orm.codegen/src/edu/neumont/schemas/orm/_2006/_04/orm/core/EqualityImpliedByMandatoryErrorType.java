/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality Implied By Mandatory Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An equality constraint is implied by a mandatory constraint (Deprecated, replaced by EqualityConstraintImpliedByMandatoryConstraintsError).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.EqualityImpliedByMandatoryErrorType#getEqualityConstraint <em>Equality Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEqualityImpliedByMandatoryErrorType()
 * @model extendedMetaData="name='EqualityImpliedByMandatoryErrorType' kind='elementOnly'"
 * @generated
 */
public interface EqualityImpliedByMandatoryErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Equality Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equality Constraint</em>' containment reference.
	 * @see #setEqualityConstraint(EqualityConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEqualityImpliedByMandatoryErrorType_EqualityConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EqualityConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	EqualityConstraintRef getEqualityConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.EqualityImpliedByMandatoryErrorType#getEqualityConstraint <em>Equality Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Equality Constraint</em>' containment reference.
	 * @see #getEqualityConstraint()
	 * @generated
	 */
	void setEqualityConstraint(EqualityConstraintRef value);

} // EqualityImpliedByMandatoryErrorType
