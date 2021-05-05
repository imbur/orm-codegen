/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Role Sequence With Join Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A sequence of constraint roles and possible join path.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceWithJoinType#getRole <em>Role</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceWithJoinType#getJoinRule <em>Join Rule</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintRoleSequenceWithJoinType()
 * @model extendedMetaData="name='ConstraintRoleSequenceWithJoinType' kind='elementOnly'"
 * @generated
 */
public interface ConstraintRoleSequenceWithJoinType extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.RoleSequenceWithProjectionRoleRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintRoleSequenceWithJoinType_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Role' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RoleSequenceWithProjectionRoleRef> getRole();

	/**
	 * Returns the value of the '<em><b>Join Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Rule</em>' containment reference.
	 * @see #setJoinRule(JoinRuleType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintRoleSequenceWithJoinType_JoinRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='JoinRule' namespace='##targetNamespace'"
	 * @generated
	 */
	JoinRuleType getJoinRule();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceWithJoinType#getJoinRule <em>Join Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Rule</em>' containment reference.
	 * @see #getJoinRule()
	 * @generated
	 */
	void setJoinRule(JoinRuleType value);

} // ConstraintRoleSequenceWithJoinType
