/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implied Internal Uniqueness Constraint Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One or more internal uniqueness constraints in a fact type are implied by other internal uniqueness constraints on the same fact type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedInternalUniquenessConstraintErrorType#getFact <em>Fact</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedInternalUniquenessConstraintErrorType()
 * @model extendedMetaData="name='ImpliedInternalUniquenessConstraintErrorType' kind='elementOnly'"
 * @generated
 */
public interface ImpliedInternalUniquenessConstraintErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Fact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact</em>' containment reference.
	 * @see #setFact(FactTypeRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedInternalUniquenessConstraintErrorType_Fact()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fact' namespace='##targetNamespace'"
	 * @generated
	 */
	FactTypeRef getFact();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedInternalUniquenessConstraintErrorType#getFact <em>Fact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact</em>' containment reference.
	 * @see #getFact()
	 * @generated
	 */
	void setFact(FactTypeRef value);

} // ImpliedInternalUniquenessConstraintErrorType
