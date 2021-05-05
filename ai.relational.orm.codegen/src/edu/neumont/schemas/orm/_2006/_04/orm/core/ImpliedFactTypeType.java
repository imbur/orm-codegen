/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implied Fact Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A fact type representing the implied relationship between an objectifying entity type and the role player of a role in the objectified fact type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getFactRoles <em>Fact Roles</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getReadingOrders <em>Reading Orders</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getInternalConstraints <em>Internal Constraints</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getDerivationRule <em>Derivation Rule</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getImpliedByObjectification <em>Implied By Objectification</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getName <em>Name</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#isIsExternal <em>Is External</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactTypeType()
 * @model extendedMetaData="name='ImpliedFactTypeType' kind='elementOnly'"
 * @generated
 */
public interface ImpliedFactTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference.
	 * @see #setDefinitions(DefinitionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactTypeType_Definitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Definitions' namespace='##targetNamespace'"
	 * @generated
	 */
	DefinitionsType getDefinitions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getDefinitions <em>Definitions</em>}' containment reference.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactTypeType_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Notes' namespace='##targetNamespace'"
	 * @generated
	 */
	NotesType getNotes();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getNotes <em>Notes</em>}' containment reference.
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
	 * @see #setFactRoles(ImpliedFactRolesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactTypeType_FactRoles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FactRoles' namespace='##targetNamespace'"
	 * @generated
	 */
	ImpliedFactRolesType getFactRoles();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getFactRoles <em>Fact Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact Roles</em>' containment reference.
	 * @see #getFactRoles()
	 * @generated
	 */
	void setFactRoles(ImpliedFactRolesType value);

	/**
	 * Returns the value of the '<em><b>Reading Orders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Orders</em>' containment reference.
	 * @see #setReadingOrders(ReadingOrdersType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactTypeType_ReadingOrders()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReadingOrders' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadingOrdersType getReadingOrders();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getReadingOrders <em>Reading Orders</em>}' containment reference.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactTypeType_InternalConstraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InternalConstraints' namespace='##targetNamespace'"
	 * @generated
	 */
	InternalConstraintsType getInternalConstraints();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getInternalConstraints <em>Internal Constraints</em>}' containment reference.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactTypeType_DerivationRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DerivationRule' namespace='##targetNamespace'"
	 * @generated
	 */
	FactTypeDerivationRuleType getDerivationRule();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getDerivationRule <em>Derivation Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Rule</em>' containment reference.
	 * @see #getDerivationRule()
	 * @generated
	 */
	void setDerivationRule(FactTypeDerivationRuleType value);

	/**
	 * Returns the value of the '<em><b>Implied By Objectification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the objectification relationship that implies this fact type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implied By Objectification</em>' containment reference.
	 * @see #setImpliedByObjectification(ObjectificationRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactTypeType_ImpliedByObjectification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImpliedByObjectification' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectificationRef getImpliedByObjectification();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getImpliedByObjectification <em>Implied By Objectification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implied By Objectification</em>' containment reference.
	 * @see #getImpliedByObjectification()
	 * @generated
	 */
	void setImpliedByObjectification(ObjectificationRef value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactTypeType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getExtensions <em>Extensions</em>}' containment reference.
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
	 * A name generated from the first reading of the first reading order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactTypeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='_Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getName <em>Name</em>}' attribute.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactTypeType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#getId <em>Id</em>}' attribute.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getImpliedFactTypeType_IsExternal()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsExternal'"
	 * @generated
	 */
	boolean isIsExternal();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#isIsExternal <em>Is External</em>}' attribute.
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
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#isIsExternal <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsExternal()
	 * @see #isIsExternal()
	 * @see #setIsExternal(boolean)
	 * @generated
	 */
	void unsetIsExternal();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ImpliedFactTypeType#isIsExternal <em>Is External</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is External</em>' attribute is set.
	 * @see #unsetIsExternal()
	 * @see #isIsExternal()
	 * @see #setIsExternal(boolean)
	 * @generated
	 */
	boolean isSetIsExternal();

} // ImpliedFactTypeType
