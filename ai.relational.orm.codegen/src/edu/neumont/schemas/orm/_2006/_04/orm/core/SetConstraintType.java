/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SetConstraintType#getRoleSequence <em>Role Sequence</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSetConstraintType()
 * @model abstract="true"
 *        extendedMetaData="name='SetConstraintType' kind='elementOnly'"
 * @generated
 */
public interface SetConstraintType extends ConstraintType {
	/**
	 * Returns the value of the '<em><b>Role Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Sequence</em>' containment reference.
	 * @see #setRoleSequence(ConstraintRoleSequenceType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSetConstraintType_RoleSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RoleSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintRoleSequenceType getRoleSequence();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SetConstraintType#getRoleSequence <em>Role Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Sequence</em>' containment reference.
	 * @see #getRoleSequence()
	 * @generated
	 */
	void setRoleSequence(ConstraintRoleSequenceType value);

} // SetConstraintType
