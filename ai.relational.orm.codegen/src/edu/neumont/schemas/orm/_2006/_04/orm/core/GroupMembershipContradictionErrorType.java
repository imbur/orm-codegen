/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Membership Contradiction Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A group member is required by one group type and blocked by another group type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupMembershipContradictionErrorType#getGroup <em>Group</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getGroupMembershipContradictionErrorType()
 * @model extendedMetaData="name='GroupMembershipContradictionErrorType' kind='elementOnly'"
 * @generated
 */
public interface GroupMembershipContradictionErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(GroupType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getGroupMembershipContradictionErrorType_Group()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Group' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupType getGroup();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupMembershipContradictionErrorType#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(GroupType value);

} // GroupMembershipContradictionErrorType
