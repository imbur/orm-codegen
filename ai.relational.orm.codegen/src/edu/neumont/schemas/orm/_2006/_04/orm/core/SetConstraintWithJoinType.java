/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Constraint With Join Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SetConstraintWithJoinType#getRoleSequence <em>Role Sequence</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSetConstraintWithJoinType()
 * @model abstract="true"
 *        extendedMetaData="name='SetConstraintWithJoinType' kind='elementOnly'"
 * @generated
 */
public interface SetConstraintWithJoinType extends ConstraintType {
	/**
	 * Returns the value of the '<em><b>Role Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Sequence</em>' containment reference.
	 * @see #setRoleSequence(ConstraintRoleSequenceWithJoinType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSetConstraintWithJoinType_RoleSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RoleSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintRoleSequenceWithJoinType getRoleSequence();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SetConstraintWithJoinType#getRoleSequence <em>Role Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Sequence</em>' containment reference.
	 * @see #getRoleSequence()
	 * @generated
	 */
	void setRoleSequence(ConstraintRoleSequenceWithJoinType value);

} // SetConstraintWithJoinType
