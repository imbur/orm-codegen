/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality Range Overlap Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Two or more cardinality constraint ranges are either overlapping or not increasing.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CardinalityRangeOverlapErrorType#getCardinalityConstraint <em>Cardinality Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCardinalityRangeOverlapErrorType()
 * @model extendedMetaData="name='CardinalityRangeOverlapErrorType' kind='elementOnly'"
 * @generated
 */
public interface CardinalityRangeOverlapErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Cardinality Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Constraint</em>' containment reference.
	 * @see #setCardinalityConstraint(CardinalityConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCardinalityRangeOverlapErrorType_CardinalityConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CardinalityConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	CardinalityConstraintRef getCardinalityConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CardinalityRangeOverlapErrorType#getCardinalityConstraint <em>Cardinality Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Constraint</em>' containment reference.
	 * @see #getCardinalityConstraint()
	 * @generated
	 */
	void setCardinalityConstraint(CardinalityConstraintRef value);

} // CardinalityRangeOverlapErrorType
