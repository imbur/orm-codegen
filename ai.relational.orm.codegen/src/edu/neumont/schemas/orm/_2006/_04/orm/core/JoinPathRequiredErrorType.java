/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Path Required Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The roles in a constraint role sequence span multiple fact types that are not implicitly joined.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.JoinPathRequiredErrorType#getConstraintRoleSequence <em>Constraint Role Sequence</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getJoinPathRequiredErrorType()
 * @model extendedMetaData="name='JoinPathRequiredErrorType' kind='elementOnly'"
 * @generated
 */
public interface JoinPathRequiredErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Constraint Role Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Role Sequence</em>' containment reference.
	 * @see #setConstraintRoleSequence(ConstraintRoleSequenceRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getJoinPathRequiredErrorType_ConstraintRoleSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConstraintRoleSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintRoleSequenceRef getConstraintRoleSequence();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.JoinPathRequiredErrorType#getConstraintRoleSequence <em>Constraint Role Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Role Sequence</em>' containment reference.
	 * @see #getConstraintRoleSequence()
	 * @generated
	 */
	void setConstraintRoleSequence(ConstraintRoleSequenceRef value);

} // JoinPathRequiredErrorType
