/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ORM Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of elements used in the primary definition of an ORM model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getObjects <em>Objects</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getFacts <em>Facts</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getFunctions <em>Functions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getCustomReferenceModes <em>Custom Reference Modes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getModelNotes <em>Model Notes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getModelErrors <em>Model Errors</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getReferenceModeKinds <em>Reference Mode Kinds</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getRecognizedPhrases <em>Recognized Phrases</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getORMModelType()
 * @model extendedMetaData="name='ORMModelType' kind='elementOnly'"
 * @generated
 */
public interface ORMModelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference.
	 * @see #setDefinitions(DefinitionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getORMModelType_Definitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Definitions' namespace='##targetNamespace'"
	 * @generated
	 */
	DefinitionsType getDefinitions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getDefinitions <em>Definitions</em>}' containment reference.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getORMModelType_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Notes' namespace='##targetNamespace'"
	 * @generated
	 */
	NotesType getNotes();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getNotes <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' containment reference.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(NotesType value);

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference.
	 * @see #setObjects(ObjectTypesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getORMModelType_Objects()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Objects' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectTypesType getObjects();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getObjects <em>Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objects</em>' containment reference.
	 * @see #getObjects()
	 * @generated
	 */
	void setObjects(ObjectTypesType value);

	/**
	 * Returns the value of the '<em><b>Facts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facts</em>' containment reference.
	 * @see #setFacts(FactTypesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getORMModelType_Facts()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Facts' namespace='##targetNamespace'"
	 * @generated
	 */
	FactTypesType getFacts();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getFacts <em>Facts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facts</em>' containment reference.
	 * @see #getFacts()
	 * @generated
	 */
	void setFacts(FactTypesType value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(ConstraintsType5)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getORMModelType_Constraints()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Constraints' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintsType5 getConstraints();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(ConstraintsType5 value);

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference.
	 * @see #setDataTypes(DataTypesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getORMModelType_DataTypes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	DataTypesType getDataTypes();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getDataTypes <em>Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Types</em>' containment reference.
	 * @see #getDataTypes()
	 * @generated
	 */
	void setDataTypes(DataTypesType value);

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference.
	 * @see #setFunctions(FunctionsType1)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getORMModelType_Functions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Functions' namespace='##targetNamespace'"
	 * @generated
	 */
	FunctionsType1 getFunctions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getFunctions <em>Functions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functions</em>' containment reference.
	 * @see #getFunctions()
	 * @generated
	 */
	void setFunctions(FunctionsType1 value);

	/**
	 * Returns the value of the '<em><b>Custom Reference Modes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Reference Modes</em>' containment reference.
	 * @see #setCustomReferenceModes(CustomReferenceModesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getORMModelType_CustomReferenceModes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CustomReferenceModes' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomReferenceModesType getCustomReferenceModes();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getCustomReferenceModes <em>Custom Reference Modes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Reference Modes</em>' containment reference.
	 * @see #getCustomReferenceModes()
	 * @generated
	 */
	void setCustomReferenceModes(CustomReferenceModesType value);

	/**
	 * Returns the value of the '<em><b>Model Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Notes</em>' containment reference.
	 * @see #setModelNotes(ModelNotesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getORMModelType_ModelNotes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ModelNotes' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelNotesType getModelNotes();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getModelNotes <em>Model Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Notes</em>' containment reference.
	 * @see #getModelNotes()
	 * @generated
	 */
	void setModelNotes(ModelNotesType value);

	/**
	 * Returns the value of the '<em><b>Model Errors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Errors</em>' containment reference.
	 * @see #setModelErrors(ModelErrorsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getORMModelType_ModelErrors()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ModelErrors' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelErrorsType getModelErrors();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getModelErrors <em>Model Errors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Errors</em>' containment reference.
	 * @see #getModelErrors()
	 * @generated
	 */
	void setModelErrors(ModelErrorsType value);

	/**
	 * Returns the value of the '<em><b>Reference Mode Kinds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Mode Kinds</em>' containment reference.
	 * @see #setReferenceModeKinds(ReferenceModeKindsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getORMModelType_ReferenceModeKinds()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ReferenceModeKinds' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceModeKindsType getReferenceModeKinds();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getReferenceModeKinds <em>Reference Mode Kinds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Mode Kinds</em>' containment reference.
	 * @see #getReferenceModeKinds()
	 * @generated
	 */
	void setReferenceModeKinds(ReferenceModeKindsType value);

	/**
	 * Returns the value of the '<em><b>Recognized Phrases</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recognized Phrases</em>' containment reference.
	 * @see #setRecognizedPhrases(RecognizedPhrasesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getORMModelType_RecognizedPhrases()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RecognizedPhrases' namespace='##targetNamespace'"
	 * @generated
	 */
	RecognizedPhrasesType getRecognizedPhrases();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getRecognizedPhrases <em>Recognized Phrases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recognized Phrases</em>' containment reference.
	 * @see #getRecognizedPhrases()
	 * @generated
	 */
	void setRecognizedPhrases(RecognizedPhrasesType value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getORMModelType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getExtensions <em>Extensions</em>}' containment reference.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getORMModelType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getORMModelType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ORMModelType
