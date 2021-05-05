/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Type Detached Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A role value constraint is specified for a role that is no longer associated with a value type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeDetachedErrorType#getValueConstraint <em>Value Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueTypeDetachedErrorType()
 * @model extendedMetaData="name='ValueTypeDetachedErrorType' kind='elementOnly'"
 * @generated
 */
public interface ValueTypeDetachedErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Constraint</em>' containment reference.
	 * @see #setValueConstraint(ValueConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueTypeDetachedErrorType_ValueConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ValueConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueConstraintRef getValueConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeDetachedErrorType#getValueConstraint <em>Value Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Constraint</em>' containment reference.
	 * @see #getValueConstraint()
	 * @generated
	 */
	void setValueConstraint(ValueConstraintRef value);

} // ValueTypeDetachedErrorType
