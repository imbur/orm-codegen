/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implied Fact Roles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for roles in a fact type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactRolesType#getRole <em>Role</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactRolesType#getRoleProxy <em>Role Proxy</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactRolesType#getObjectifiedUnaryRole <em>Objectified Unary Role</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactRolesType#getRoleProxy1 <em>Role Proxy1</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactRolesType#getObjectifiedUnaryRole1 <em>Objectified Unary Role1</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactRolesType#getRole1 <em>Role1</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactRolesType()
 * @model extendedMetaData="name='ImpliedFactRolesType' kind='elementOnly'"
 * @generated
 */
public interface ImpliedFactRolesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference.
	 * @see #setRole(RoleType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactRolesType_Role()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Role' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleType getRole();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactRolesType#getRole <em>Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' containment reference.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(RoleType value);

	/**
	 * Returns the value of the '<em><b>Role Proxy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Proxy</em>' containment reference.
	 * @see #setRoleProxy(RoleProxyType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactRolesType_RoleProxy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RoleProxy' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleProxyType getRoleProxy();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactRolesType#getRoleProxy <em>Role Proxy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Proxy</em>' containment reference.
	 * @see #getRoleProxy()
	 * @generated
	 */
	void setRoleProxy(RoleProxyType value);

	/**
	 * Returns the value of the '<em><b>Objectified Unary Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectified Unary Role</em>' containment reference.
	 * @see #setObjectifiedUnaryRole(ObjectifiedUnaryRoleType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactRolesType_ObjectifiedUnaryRole()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObjectifiedUnaryRole' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectifiedUnaryRoleType getObjectifiedUnaryRole();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactRolesType#getObjectifiedUnaryRole <em>Objectified Unary Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectified Unary Role</em>' containment reference.
	 * @see #getObjectifiedUnaryRole()
	 * @generated
	 */
	void setObjectifiedUnaryRole(ObjectifiedUnaryRoleType value);

	/**
	 * Returns the value of the '<em><b>Role Proxy1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Proxy1</em>' containment reference.
	 * @see #setRoleProxy1(RoleProxyType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactRolesType_RoleProxy1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RoleProxy' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleProxyType getRoleProxy1();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactRolesType#getRoleProxy1 <em>Role Proxy1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Proxy1</em>' containment reference.
	 * @see #getRoleProxy1()
	 * @generated
	 */
	void setRoleProxy1(RoleProxyType value);

	/**
	 * Returns the value of the '<em><b>Objectified Unary Role1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectified Unary Role1</em>' containment reference.
	 * @see #setObjectifiedUnaryRole1(ObjectifiedUnaryRoleType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactRolesType_ObjectifiedUnaryRole1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObjectifiedUnaryRole' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectifiedUnaryRoleType getObjectifiedUnaryRole1();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactRolesType#getObjectifiedUnaryRole1 <em>Objectified Unary Role1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectified Unary Role1</em>' containment reference.
	 * @see #getObjectifiedUnaryRole1()
	 * @generated
	 */
	void setObjectifiedUnaryRole1(ObjectifiedUnaryRoleType value);

	/**
	 * Returns the value of the '<em><b>Role1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role1</em>' containment reference.
	 * @see #setRole1(RoleType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactRolesType_Role1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Role' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleType getRole1();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactRolesType#getRole1 <em>Role1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role1</em>' containment reference.
	 * @see #getRole1()
	 * @generated
	 */
	void setRole1(RoleType value);

} // ImpliedFactRolesType
