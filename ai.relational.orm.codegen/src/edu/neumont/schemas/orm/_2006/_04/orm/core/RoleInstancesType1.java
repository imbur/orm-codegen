/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Instances Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for relationships between instances of the role player and roles used in other complex instance definitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleInstancesType1#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleInstancesType1#getEntityTypeRoleInstance <em>Entity Type Role Instance</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleInstancesType1#getValueTypeRoleInstance <em>Value Type Role Instance</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleInstancesType1#getFactTypeRoleInstance <em>Fact Type Role Instance</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleInstancesType1()
 * @model extendedMetaData="name='RoleInstancesType' kind='elementOnly'"
 * @generated
 */
public interface RoleInstancesType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleInstancesType1_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Entity Type Role Instance</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.RoleInstanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type Role Instance</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleInstancesType1_EntityTypeRoleInstance()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EntityTypeRoleInstance' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RoleInstanceType> getEntityTypeRoleInstance();

	/**
	 * Returns the value of the '<em><b>Value Type Role Instance</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.RoleInstanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type Role Instance</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleInstancesType1_ValueTypeRoleInstance()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueTypeRoleInstance' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RoleInstanceType> getValueTypeRoleInstance();

	/**
	 * Returns the value of the '<em><b>Fact Type Role Instance</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.RoleInstanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type Role Instance</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleInstancesType1_FactTypeRoleInstance()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FactTypeRoleInstance' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RoleInstanceType> getFactTypeRoleInstance();

} // RoleInstancesType1
