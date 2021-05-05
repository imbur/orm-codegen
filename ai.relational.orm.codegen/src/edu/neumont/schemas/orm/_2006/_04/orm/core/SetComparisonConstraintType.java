/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Comparison Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SetComparisonConstraintType#getRoleSequences <em>Role Sequences</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSetComparisonConstraintType()
 * @model abstract="true"
 *        extendedMetaData="name='SetComparisonConstraintType' kind='elementOnly'"
 * @generated
 */
public interface SetComparisonConstraintType extends ConstraintType {
	/**
	 * Returns the value of the '<em><b>Role Sequences</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Sequences</em>' containment reference.
	 * @see #setRoleSequences(ConstraintRoleSequencesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSetComparisonConstraintType_RoleSequences()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RoleSequences' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintRoleSequencesType getRoleSequences();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SetComparisonConstraintType#getRoleSequences <em>Role Sequences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Sequences</em>' containment reference.
	 * @see #getRoleSequences()
	 * @generated
	 */
	void setRoleSequences(ConstraintRoleSequencesType value);

} // SetComparisonConstraintType
