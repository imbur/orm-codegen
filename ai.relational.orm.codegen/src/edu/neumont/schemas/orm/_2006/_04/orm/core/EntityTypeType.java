/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An object type with an external identification scheme.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeType#getPreferredIdentifier <em>Preferred Identifier</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeType#getInstances <em>Instances</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeType#getReferenceMode <em>Reference Mode</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeType()
 * @model extendedMetaData="name='EntityTypeType' kind='elementOnly'"
 * @generated
 */
public interface EntityTypeType extends ObjectTypeType {
	/**
	 * Returns the value of the '<em><b>Preferred Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the uniqueness constraint that provides the preferred identification scheme for this entity type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preferred Identifier</em>' containment reference.
	 * @see #setPreferredIdentifier(UniquenessConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeType_PreferredIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PreferredIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	UniquenessConstraintRef getPreferredIdentifier();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeType#getPreferredIdentifier <em>Preferred Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Identifier</em>' containment reference.
	 * @see #getPreferredIdentifier()
	 * @generated
	 */
	void setPreferredIdentifier(UniquenessConstraintRef value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference.
	 * @see #setInstances(EntityTypeInstancesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeType_Instances()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Instances' namespace='##targetNamespace'"
	 * @generated
	 */
	EntityTypeInstancesType getInstances();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeType#getInstances <em>Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances</em>' containment reference.
	 * @see #getInstances()
	 * @generated
	 */
	void setInstances(EntityTypeInstancesType value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Reference Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the reference mode pattern used to identify this element. Derived from a single-role preferred identifier with a ValueType role player.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Mode</em>' attribute.
	 * @see #setReferenceMode(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeType_ReferenceMode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='_ReferenceMode'"
	 * @generated
	 */
	String getReferenceMode();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeType#getReferenceMode <em>Reference Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Mode</em>' attribute.
	 * @see #getReferenceMode()
	 * @generated
	 */
	void setReferenceMode(String value);

} // EntityTypeType
