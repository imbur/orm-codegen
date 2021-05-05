/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ring Constraint Type Not Specified Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The type of a ring constraint is not specified.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RingConstraintTypeNotSpecifiedErrorType#getRingConstraint <em>Ring Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRingConstraintTypeNotSpecifiedErrorType()
 * @model extendedMetaData="name='RingConstraintTypeNotSpecifiedErrorType' kind='elementOnly'"
 * @generated
 */
public interface RingConstraintTypeNotSpecifiedErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Ring Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ring Constraint</em>' containment reference.
	 * @see #setRingConstraint(RingConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRingConstraintTypeNotSpecifiedErrorType_RingConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RingConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	RingConstraintRef getRingConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RingConstraintTypeNotSpecifiedErrorType#getRingConstraint <em>Ring Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ring Constraint</em>' containment reference.
	 * @see #getRingConstraint()
	 * @generated
	 */
	void setRingConstraint(RingConstraintRef value);

} // RingConstraintTypeNotSpecifiedErrorType
