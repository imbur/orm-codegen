/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Range Overlap Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Two value ranges for the same value constraint have overlapping ranges.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeOverlapErrorType#getValueConstraint <em>Value Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueRangeOverlapErrorType()
 * @model extendedMetaData="name='ValueRangeOverlapErrorType' kind='elementOnly'"
 * @generated
 */
public interface ValueRangeOverlapErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Constraint</em>' containment reference.
	 * @see #setValueConstraint(ValueConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueRangeOverlapErrorType_ValueConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ValueConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueConstraintRef getValueConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeOverlapErrorType#getValueConstraint <em>Value Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Constraint</em>' containment reference.
	 * @see #getValueConstraint()
	 * @generated
	 */
	void setValueConstraint(ValueConstraintRef value);

} // ValueRangeOverlapErrorType
