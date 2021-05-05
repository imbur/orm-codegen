/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Played Roles Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for the roles played an entity type. Duplicates the RolePlayer information specified on the played roles.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PlayedRolesType#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PlayedRolesType#getRole <em>Role</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PlayedRolesType#getSubtypeMetaRole <em>Subtype Meta Role</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PlayedRolesType#getSupertypeMetaRole <em>Supertype Meta Role</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPlayedRolesType()
 * @model extendedMetaData="name='PlayedRolesType' kind='elementOnly'"
 * @generated
 */
public interface PlayedRolesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPlayedRolesType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.RoleRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPlayedRolesType_Role()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Role' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RoleRef> getRole();

	/**
	 * Returns the value of the '<em><b>Subtype Meta Role</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.RoleRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype Meta Role</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPlayedRolesType_SubtypeMetaRole()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubtypeMetaRole' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RoleRef> getSubtypeMetaRole();

	/**
	 * Returns the value of the '<em><b>Supertype Meta Role</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.RoleRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype Meta Role</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPlayedRolesType_SupertypeMetaRole()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SupertypeMetaRole' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RoleRef> getSupertypeMetaRole();

} // PlayedRolesType
