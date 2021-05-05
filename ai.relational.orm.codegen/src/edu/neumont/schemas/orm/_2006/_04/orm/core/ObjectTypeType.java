/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#getAbbreviations <em>Abbreviations</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#getCardinalityRestriction <em>Cardinality Restriction</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#getPlayedRoles <em>Played Roles</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#getSubtypeDerivationRule <em>Subtype Derivation Rule</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#isIsIndependent <em>Is Independent</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#isIsPersonal <em>Is Personal</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectTypeType()
 * @model abstract="true"
 *        extendedMetaData="name='ObjectTypeType' kind='elementOnly'"
 * @generated
 */
public interface ObjectTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference.
	 * @see #setDefinitions(DefinitionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectTypeType_Definitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Definitions' namespace='##targetNamespace'"
	 * @generated
	 */
	DefinitionsType getDefinitions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#getDefinitions <em>Definitions</em>}' containment reference.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectTypeType_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Notes' namespace='##targetNamespace'"
	 * @generated
	 */
	NotesType getNotes();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#getNotes <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' containment reference.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(NotesType value);

	/**
	 * Returns the value of the '<em><b>Abbreviations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbreviations</em>' containment reference.
	 * @see #setAbbreviations(AliasesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectTypeType_Abbreviations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Abbreviations' namespace='##targetNamespace'"
	 * @generated
	 */
	AliasesType getAbbreviations();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#getAbbreviations <em>Abbreviations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbreviations</em>' containment reference.
	 * @see #getAbbreviations()
	 * @generated
	 */
	void setAbbreviations(AliasesType value);

	/**
	 * Returns the value of the '<em><b>Cardinality Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Restriction</em>' containment reference.
	 * @see #setCardinalityRestriction(ObjectTypeCardinalityRestrictionType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectTypeType_CardinalityRestriction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CardinalityRestriction' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectTypeCardinalityRestrictionType getCardinalityRestriction();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#getCardinalityRestriction <em>Cardinality Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Restriction</em>' containment reference.
	 * @see #getCardinalityRestriction()
	 * @generated
	 */
	void setCardinalityRestriction(ObjectTypeCardinalityRestrictionType value);

	/**
	 * Returns the value of the '<em><b>Played Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Played Roles</em>' containment reference.
	 * @see #setPlayedRoles(PlayedRolesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectTypeType_PlayedRoles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PlayedRoles' namespace='##targetNamespace'"
	 * @generated
	 */
	PlayedRolesType getPlayedRoles();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#getPlayedRoles <em>Played Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Played Roles</em>' containment reference.
	 * @see #getPlayedRoles()
	 * @generated
	 */
	void setPlayedRoles(PlayedRolesType value);

	/**
	 * Returns the value of the '<em><b>Subtype Derivation Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype Derivation Rule</em>' containment reference.
	 * @see #setSubtypeDerivationRule(SubtypeDerivationRuleType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectTypeType_SubtypeDerivationRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubtypeDerivationRule' namespace='##targetNamespace'"
	 * @generated
	 */
	SubtypeDerivationRuleType getSubtypeDerivationRule();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#getSubtypeDerivationRule <em>Subtype Derivation Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype Derivation Rule</em>' containment reference.
	 * @see #getSubtypeDerivationRule()
	 * @generated
	 */
	void setSubtypeDerivationRule(SubtypeDerivationRuleType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectTypeType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#getId <em>Id</em>}' attribute.
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
	 * This object type is externally defined (not used).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is External</em>' attribute.
	 * @see #isSetIsExternal()
	 * @see #unsetIsExternal()
	 * @see #setIsExternal(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectTypeType_IsExternal()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsExternal'"
	 * @generated
	 */
	boolean isIsExternal();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#isIsExternal <em>Is External</em>}' attribute.
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
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#isIsExternal <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsExternal()
	 * @see #isIsExternal()
	 * @see #setIsExternal(boolean)
	 * @generated
	 */
	void unsetIsExternal();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#isIsExternal <em>Is External</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Is Independent</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An instance of this object type can exist without playing any non-identifying roles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Independent</em>' attribute.
	 * @see #isSetIsIndependent()
	 * @see #unsetIsIndependent()
	 * @see #setIsIndependent(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectTypeType_IsIndependent()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsIndependent'"
	 * @generated
	 */
	boolean isIsIndependent();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#isIsIndependent <em>Is Independent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Independent</em>' attribute.
	 * @see #isSetIsIndependent()
	 * @see #unsetIsIndependent()
	 * @see #isIsIndependent()
	 * @generated
	 */
	void setIsIndependent(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#isIsIndependent <em>Is Independent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsIndependent()
	 * @see #isIsIndependent()
	 * @see #setIsIndependent(boolean)
	 * @generated
	 */
	void unsetIsIndependent();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#isIsIndependent <em>Is Independent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Independent</em>' attribute is set.
	 * @see #unsetIsIndependent()
	 * @see #isIsIndependent()
	 * @see #setIsIndependent(boolean)
	 * @generated
	 */
	boolean isSetIsIndependent();

	/**
	 * Returns the value of the '<em><b>Is Personal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This object type refers to a person, not a thing. A directive to tell the verbalization to use personal pronouns.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Personal</em>' attribute.
	 * @see #isSetIsPersonal()
	 * @see #unsetIsPersonal()
	 * @see #setIsPersonal(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectTypeType_IsPersonal()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsPersonal'"
	 * @generated
	 */
	boolean isIsPersonal();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#isIsPersonal <em>Is Personal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Personal</em>' attribute.
	 * @see #isSetIsPersonal()
	 * @see #unsetIsPersonal()
	 * @see #isIsPersonal()
	 * @generated
	 */
	void setIsPersonal(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#isIsPersonal <em>Is Personal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsPersonal()
	 * @see #isIsPersonal()
	 * @see #setIsPersonal(boolean)
	 * @generated
	 */
	void unsetIsPersonal();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#isIsPersonal <em>Is Personal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Personal</em>' attribute is set.
	 * @see #unsetIsPersonal()
	 * @see #isIsPersonal()
	 * @see #setIsPersonal(boolean)
	 * @generated
	 */
	boolean isSetIsPersonal();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The object type name. Validation errors will be present for any object type name that is not unique within the model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectTypeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ObjectTypeType
