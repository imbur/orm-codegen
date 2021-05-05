/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtype Roles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for the meta roles associated with a subtype fact.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeRolesType#getSupertypeMetaRole <em>Supertype Meta Role</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeRolesType#getSubtypeMetaRole <em>Subtype Meta Role</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeRolesType()
 * @model extendedMetaData="name='SubtypeRolesType' kind='elementOnly'"
 * @generated
 */
public interface SubtypeRolesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Supertype Meta Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The meta role associated with the supertype role player.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supertype Meta Role</em>' containment reference.
	 * @see #setSupertypeMetaRole(RoleType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeRolesType_SupertypeMetaRole()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SupertypeMetaRole' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleType getSupertypeMetaRole();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeRolesType#getSupertypeMetaRole <em>Supertype Meta Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supertype Meta Role</em>' containment reference.
	 * @see #getSupertypeMetaRole()
	 * @generated
	 */
	void setSupertypeMetaRole(RoleType value);

	/**
	 * Returns the value of the '<em><b>Subtype Meta Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The meta role associated with the subtype role player.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subtype Meta Role</em>' containment reference.
	 * @see #setSubtypeMetaRole(RoleType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeRolesType_SubtypeMetaRole()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SubtypeMetaRole' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleType getSubtypeMetaRole();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeRolesType#getSubtypeMetaRole <em>Subtype Meta Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype Meta Role</em>' containment reference.
	 * @see #getSubtypeMetaRole()
	 * @generated
	 */
	void setSubtypeMetaRole(RoleType value);

} // SubtypeRolesType
