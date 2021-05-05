/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Sequence With Projection Role Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleSequenceWithProjectionRoleRef#getProjectedFrom <em>Projected From</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleSequenceWithProjectionRoleRef()
 * @model extendedMetaData="name='RoleSequenceWithProjectionRoleRef' kind='elementOnly'"
 * @generated
 */
public interface RoleSequenceWithProjectionRoleRef extends RoleSequenceRoleRef {
	/**
	 * Returns the value of the '<em><b>Projected From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (Deprecated, use JoinPath/JoinPathProjections) The node in the join path used to populate this role in a derived fact type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Projected From</em>' containment reference.
	 * @see #setProjectedFrom(ProjectedFromType1)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleSequenceWithProjectionRoleRef_ProjectedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProjectedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	ProjectedFromType1 getProjectedFrom();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleSequenceWithProjectionRoleRef#getProjectedFrom <em>Projected From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projected From</em>' containment reference.
	 * @see #getProjectedFrom()
	 * @generated
	 */
	void setProjectedFrom(ProjectedFromType1 value);

} // RoleSequenceWithProjectionRoleRef
