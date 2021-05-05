/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objectified Unary Role Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A role representing the identifying role in the fact type implied between the object type that objectifies a unary role and the unary role player. There is an implied equality constraint between this role and the referenced unary role.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedUnaryRoleType#getUnaryRole <em>Unary Role</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedUnaryRoleType#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectifiedUnaryRoleType()
 * @model extendedMetaData="name='ObjectifiedUnaryRoleType' kind='elementOnly'"
 * @generated
 */
public interface ObjectifiedUnaryRoleType extends RoleBaseType {
	/**
	 * Returns the value of the '<em><b>Unary Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the objectified unary role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unary Role</em>' containment reference.
	 * @see #setUnaryRole(RoleRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectifiedUnaryRoleType_UnaryRole()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UnaryRole' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleRef getUnaryRole();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedUnaryRoleType#getUnaryRole <em>Unary Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unary Role</em>' containment reference.
	 * @see #getUnaryRole()
	 * @generated
	 */
	void setUnaryRole(RoleRef value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectifiedUnaryRoleType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedUnaryRoleType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

} // ObjectifiedUnaryRoleType
