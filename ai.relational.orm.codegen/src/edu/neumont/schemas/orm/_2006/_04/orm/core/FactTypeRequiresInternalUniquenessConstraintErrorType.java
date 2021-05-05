/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact Type Requires Internal Uniqueness Constraint Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ground fact type does not have at least on internal uniqueness constraint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRequiresInternalUniquenessConstraintErrorType#getFact <em>Fact</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeRequiresInternalUniquenessConstraintErrorType()
 * @model extendedMetaData="name='FactTypeRequiresInternalUniquenessConstraintErrorType' kind='elementOnly'"
 * @generated
 */
public interface FactTypeRequiresInternalUniquenessConstraintErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Fact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact</em>' containment reference.
	 * @see #setFact(FactTypeRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeRequiresInternalUniquenessConstraintErrorType_Fact()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fact' namespace='##targetNamespace'"
	 * @generated
	 */
	FactTypeRef getFact();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRequiresInternalUniquenessConstraintErrorType#getFact <em>Fact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact</em>' containment reference.
	 * @see #getFact()
	 * @generated
	 */
	void setFact(FactTypeRef value);

} // FactTypeRequiresInternalUniquenessConstraintErrorType
