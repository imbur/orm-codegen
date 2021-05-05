/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact Type Instance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A fact instance defined by a population of the fact roles.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstanceType#getRoleInstances <em>Role Instances</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstanceType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstanceType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeInstanceType()
 * @model extendedMetaData="name='FactTypeInstanceType' kind='elementOnly'"
 * @generated
 */
public interface FactTypeInstanceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Role Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Instances</em>' containment reference.
	 * @see #setRoleInstances(FactTypeRoleInstancesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeInstanceType_RoleInstances()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RoleInstances' namespace='##targetNamespace'"
	 * @generated
	 */
	FactTypeRoleInstancesType getRoleInstances();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstanceType#getRoleInstances <em>Role Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Instances</em>' containment reference.
	 * @see #getRoleInstances()
	 * @generated
	 */
	void setRoleInstances(FactTypeRoleInstancesType value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeInstanceType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstanceType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeInstanceType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstanceType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // FactTypeInstanceType
