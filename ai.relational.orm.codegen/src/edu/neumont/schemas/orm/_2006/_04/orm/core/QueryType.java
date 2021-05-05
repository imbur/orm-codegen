/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A query specified by the modeler.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryType#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryType#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryType#getQueryRoles <em>Query Roles</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryType#getDerivationRule <em>Derivation Rule</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryType#getQueryParameters <em>Query Parameters</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryType#getSignature <em>Signature</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryType()
 * @model extendedMetaData="name='QueryType' kind='elementOnly'"
 * @generated
 */
public interface QueryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference.
	 * @see #setDefinitions(DefinitionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryType_Definitions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Definitions' namespace='##targetNamespace'"
	 * @generated
	 */
	DefinitionsType getDefinitions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryType#getDefinitions <em>Definitions</em>}' containment reference.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryType_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Notes' namespace='##targetNamespace'"
	 * @generated
	 */
	NotesType getNotes();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryType#getNotes <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' containment reference.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(NotesType value);

	/**
	 * Returns the value of the '<em><b>Query Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Roles</em>' containment reference.
	 * @see #setQueryRoles(FactRolesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryType_QueryRoles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QueryRoles' namespace='##targetNamespace'"
	 * @generated
	 */
	FactRolesType getQueryRoles();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryType#getQueryRoles <em>Query Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Roles</em>' containment reference.
	 * @see #getQueryRoles()
	 * @generated
	 */
	void setQueryRoles(FactRolesType value);

	/**
	 * Returns the value of the '<em><b>Derivation Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation Rule</em>' containment reference.
	 * @see #setDerivationRule(QueryDerivationRuleType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryType_DerivationRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DerivationRule' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryDerivationRuleType getDerivationRule();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryType#getDerivationRule <em>Derivation Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Rule</em>' containment reference.
	 * @see #getDerivationRule()
	 * @generated
	 */
	void setDerivationRule(QueryDerivationRuleType value);

	/**
	 * Returns the value of the '<em><b>Query Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Parameters</em>' containment reference.
	 * @see #setQueryParameters(QueryParametersType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryType_QueryParameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QueryParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryParametersType getQueryParameters();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryType#getQueryParameters <em>Query Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Parameters</em>' containment reference.
	 * @see #getQueryParameters()
	 * @generated
	 */
	void setQueryParameters(QueryParametersType value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A description of the query signature show names and types for parameters and roles.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryType_Signature()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='_Signature'"
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryType#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // QueryType
