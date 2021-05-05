/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtype Fact Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A fact type representing the subtype meta relationship between a subtype and a supertype.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getFactRoles <em>Fact Roles</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getReadingOrders <em>Reading Orders</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getInternalConstraints <em>Internal Constraints</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getDerivationRule <em>Derivation Rule</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getInstances <em>Instances</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getName <em>Name</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#isIsPrimary <em>Is Primary</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#isPreferredIdentificationPath <em>Preferred Identification Path</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeFactTypeType()
 * @model extendedMetaData="name='SubtypeFactTypeType' kind='elementOnly'"
 * @generated
 */
public interface SubtypeFactTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference.
	 * @see #setDefinitions(DefinitionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeFactTypeType_Definitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Definitions' namespace='##targetNamespace'"
	 * @generated
	 */
	DefinitionsType getDefinitions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getDefinitions <em>Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definitions</em>' containment reference.
	 * @see #getDefinitions()
	 * @generated
	 */
	void setDefinitions(DefinitionsType value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference.
	 * @see #setNotes(NotesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeFactTypeType_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Notes' namespace='##targetNamespace'"
	 * @generated
	 */
	NotesType getNotes();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getNotes <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' containment reference.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(NotesType value);

	/**
	 * Returns the value of the '<em><b>Fact Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Roles</em>' containment reference.
	 * @see #setFactRoles(SubtypeRolesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeFactTypeType_FactRoles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FactRoles' namespace='##targetNamespace'"
	 * @generated
	 */
	SubtypeRolesType getFactRoles();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getFactRoles <em>Fact Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact Roles</em>' containment reference.
	 * @see #getFactRoles()
	 * @generated
	 */
	void setFactRoles(SubtypeRolesType value);

	/**
	 * Returns the value of the '<em><b>Reading Orders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Orders</em>' containment reference.
	 * @see #setReadingOrders(ReadingOrdersType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeFactTypeType_ReadingOrders()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReadingOrders' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadingOrdersType getReadingOrders();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getReadingOrders <em>Reading Orders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reading Orders</em>' containment reference.
	 * @see #getReadingOrders()
	 * @generated
	 */
	void setReadingOrders(ReadingOrdersType value);

	/**
	 * Returns the value of the '<em><b>Internal Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Constraints</em>' containment reference.
	 * @see #setInternalConstraints(InternalConstraintsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeFactTypeType_InternalConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InternalConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	InternalConstraintsType getInternalConstraints();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getInternalConstraints <em>Internal Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internal Constraints</em>' containment reference.
	 * @see #getInternalConstraints()
	 * @generated
	 */
	void setInternalConstraints(InternalConstraintsType value);

	/**
	 * Returns the value of the '<em><b>Derivation Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (Deprecated) Subtype derivation rules are expressed directly on the subtype, not the subtype fact relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivation Rule</em>' containment reference.
	 * @see #setDerivationRule(FactTypeDerivationRuleType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeFactTypeType_DerivationRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DerivationRule' namespace='##targetNamespace'"
	 * @generated
	 */
	FactTypeDerivationRuleType getDerivationRule();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getDerivationRule <em>Derivation Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Rule</em>' containment reference.
	 * @see #getDerivationRule()
	 * @generated
	 */
	void setDerivationRule(FactTypeDerivationRuleType value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference.
	 * @see #setInstances(FactTypeInstancesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeFactTypeType_Instances()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Instances' namespace='##targetNamespace'"
	 * @generated
	 */
	FactTypeInstancesType getInstances();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getInstances <em>Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances</em>' containment reference.
	 * @see #getInstances()
	 * @generated
	 */
	void setInstances(FactTypeInstancesType value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeFactTypeType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A name generated from the implied reading for subtype fact, name 'AIsASubtypeOfB'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeFactTypeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='_Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeFactTypeType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Is External</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This fact type is externally defined (not used).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is External</em>' attribute.
	 * @see #isSetIsExternal()
	 * @see #unsetIsExternal()
	 * @see #setIsExternal(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeFactTypeType_IsExternal()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsExternal'"
	 * @generated
	 */
	boolean isIsExternal();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#isIsExternal <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is External</em>' attribute.
	 * @see #isSetIsExternal()
	 * @see #unsetIsExternal()
	 * @see #isIsExternal()
	 * @generated
	 */
	void setIsExternal(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#isIsExternal <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsExternal()
	 * @see #isIsExternal()
	 * @see #setIsExternal(boolean)
	 * @generated
	 */
	void unsetIsExternal();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#isIsExternal <em>Is External</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is External</em>' attribute is set.
	 * @see #unsetIsExternal()
	 * @see #isIsExternal()
	 * @see #setIsExternal(boolean)
	 * @generated
	 */
	boolean isSetIsExternal();

	/**
	 * Returns the value of the '<em><b>Is Primary</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deprecated property, use PreferredIdentificationPath instead.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Primary</em>' attribute.
	 * @see #isSetIsPrimary()
	 * @see #unsetIsPrimary()
	 * @see #setIsPrimary(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeFactTypeType_IsPrimary()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsPrimary'"
	 * @generated
	 */
	boolean isIsPrimary();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#isIsPrimary <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Primary</em>' attribute.
	 * @see #isSetIsPrimary()
	 * @see #unsetIsPrimary()
	 * @see #isIsPrimary()
	 * @generated
	 */
	void setIsPrimary(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#isIsPrimary <em>Is Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsPrimary()
	 * @see #isIsPrimary()
	 * @see #setIsPrimary(boolean)
	 * @generated
	 */
	void unsetIsPrimary();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#isIsPrimary <em>Is Primary</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Primary</em>' attribute is set.
	 * @see #unsetIsPrimary()
	 * @see #isIsPrimary()
	 * @see #setIsPrimary(boolean)
	 * @generated
	 */
	boolean isSetIsPrimary();

	/**
	 * Returns the value of the '<em><b>Preferred Identification Path</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subtype fact is a possible path through the subtype graph for retrieving the identifying supertype for the subtype. The identifying supertype can be a direct or indirect supertype.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Preferred Identification Path</em>' attribute.
	 * @see #isSetPreferredIdentificationPath()
	 * @see #unsetPreferredIdentificationPath()
	 * @see #setPreferredIdentificationPath(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeFactTypeType_PreferredIdentificationPath()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='PreferredIdentificationPath'"
	 * @generated
	 */
	boolean isPreferredIdentificationPath();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#isPreferredIdentificationPath <em>Preferred Identification Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Identification Path</em>' attribute.
	 * @see #isSetPreferredIdentificationPath()
	 * @see #unsetPreferredIdentificationPath()
	 * @see #isPreferredIdentificationPath()
	 * @generated
	 */
	void setPreferredIdentificationPath(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#isPreferredIdentificationPath <em>Preferred Identification Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPreferredIdentificationPath()
	 * @see #isPreferredIdentificationPath()
	 * @see #setPreferredIdentificationPath(boolean)
	 * @generated
	 */
	void unsetPreferredIdentificationPath();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeFactTypeType#isPreferredIdentificationPath <em>Preferred Identification Path</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Preferred Identification Path</em>' attribute is set.
	 * @see #unsetPreferredIdentificationPath()
	 * @see #isPreferredIdentificationPath()
	 * @see #setPreferredIdentificationPath(boolean)
	 * @generated
	 */
	boolean isSetPreferredIdentificationPath();

} // SubtypeFactTypeType
