/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A fact type directly specified by the modeler.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getFactRoles <em>Fact Roles</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getReadingOrders <em>Reading Orders</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getInternalConstraints <em>Internal Constraints</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getDerivationRule <em>Derivation Rule</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getInstances <em>Instances</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getName <em>Name</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#isIsExternal <em>Is External</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeType()
 * @model extendedMetaData="name='FactTypeType' kind='elementOnly'"
 * @generated
 */
public interface FactTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference.
	 * @see #setDefinitions(DefinitionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeType_Definitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Definitions' namespace='##targetNamespace'"
	 * @generated
	 */
	DefinitionsType getDefinitions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getDefinitions <em>Definitions</em>}' containment reference.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeType_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Notes' namespace='##targetNamespace'"
	 * @generated
	 */
	NotesType getNotes();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getNotes <em>Notes</em>}' containment reference.
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
	 * @see #setFactRoles(FactRolesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeType_FactRoles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FactRoles' namespace='##targetNamespace'"
	 * @generated
	 */
	FactRolesType getFactRoles();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getFactRoles <em>Fact Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact Roles</em>' containment reference.
	 * @see #getFactRoles()
	 * @generated
	 */
	void setFactRoles(FactRolesType value);

	/**
	 * Returns the value of the '<em><b>Reading Orders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Orders</em>' containment reference.
	 * @see #setReadingOrders(ReadingOrdersType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeType_ReadingOrders()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReadingOrders' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadingOrdersType getReadingOrders();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getReadingOrders <em>Reading Orders</em>}' containment reference.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeType_InternalConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InternalConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	InternalConstraintsType getInternalConstraints();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getInternalConstraints <em>Internal Constraints</em>}' containment reference.
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
	 * @return the value of the '<em>Derivation Rule</em>' containment reference.
	 * @see #setDerivationRule(FactTypeDerivationRuleType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeType_DerivationRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DerivationRule' namespace='##targetNamespace'"
	 * @generated
	 */
	FactTypeDerivationRuleType getDerivationRule();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getDerivationRule <em>Derivation Rule</em>}' containment reference.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeType_Instances()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Instances' namespace='##targetNamespace'"
	 * @generated
	 */
	FactTypeInstancesType getInstances();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getInstances <em>Instances</em>}' containment reference.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getExtensions <em>Extensions</em>}' containment reference.
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
	 * A name generated from the first reading of the first reading order, or the name of the objectifying entity type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='_Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getName <em>Name</em>}' attribute.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#getId <em>Id</em>}' attribute.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeType_IsExternal()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsExternal'"
	 * @generated
	 */
	boolean isIsExternal();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#isIsExternal <em>Is External</em>}' attribute.
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
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#isIsExternal <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsExternal()
	 * @see #isIsExternal()
	 * @see #setIsExternal(boolean)
	 * @generated
	 */
	void unsetIsExternal();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType#isIsExternal <em>Is External</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is External</em>' attribute is set.
	 * @see #unsetIsExternal()
	 * @see #isIsExternal()
	 * @see #setIsExternal(boolean)
	 * @generated
	 */
	boolean isSetIsExternal();

} // FactTypeType
