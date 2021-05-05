/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type Subtype Instance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of a subtype instance defined as a relationship to an instance of the identifying supertype.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeSubtypeInstanceType#getSupertypeInstance <em>Supertype Instance</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeSubtypeInstanceType#getObjectifiedInstance <em>Objectified Instance</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeSubtypeInstanceType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeSubtypeInstanceType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeSubtypeInstanceType()
 * @model extendedMetaData="name='EntityTypeSubtypeInstanceType' kind='elementOnly'"
 * @generated
 */
public interface EntityTypeSubtypeInstanceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Supertype Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supertype Instance</em>' containment reference.
	 * @see #setSupertypeInstance(EntityTypeInstanceRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeSubtypeInstanceType_SupertypeInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SupertypeInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EntityTypeInstanceRef getSupertypeInstance();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeSubtypeInstanceType#getSupertypeInstance <em>Supertype Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supertype Instance</em>' containment reference.
	 * @see #getSupertypeInstance()
	 * @generated
	 */
	void setSupertypeInstance(EntityTypeInstanceRef value);

	/**
	 * Returns the value of the '<em><b>Objectified Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the fact instance associated with this subtype instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objectified Instance</em>' containment reference.
	 * @see #setObjectifiedInstance(FactTypeInstanceRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeSubtypeInstanceType_ObjectifiedInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObjectifiedInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	FactTypeInstanceRef getObjectifiedInstance();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeSubtypeInstanceType#getObjectifiedInstance <em>Objectified Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objectified Instance</em>' containment reference.
	 * @see #getObjectifiedInstance()
	 * @generated
	 */
	void setObjectifiedInstance(FactTypeInstanceRef value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeSubtypeInstanceType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeSubtypeInstanceType#getExtensions <em>Extensions</em>}' containment reference.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeSubtypeInstanceType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeSubtypeInstanceType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // EntityTypeSubtypeInstanceType
