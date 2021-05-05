/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getDynamicColor <em>Dynamic Color</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getExtensionModelError <em>Extension Model Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getGenerationSetting <em>Generation Setting</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getGenerationState <em>Generation State</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getGroupType <em>Group Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getModelErrorDisplayFilter <em>Model Error Display Filter</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getNameGenerator <em>Name Generator</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getORMModel <em>ORM Model</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getORMModelBrowserDynamicColor <em>ORM Model Browser Dynamic Color</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Dynamic Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dynamic Color</em>' containment reference.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDocumentRoot_DynamicColor()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DynamicColor' namespace='##targetNamespace'"
	 * @generated
	 */
	DynamicColorType getDynamicColor();

	/**
	 * Returns the value of the '<em><b>Extension Model Error</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extension point for model validation errors in extension models.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extension Model Error</em>' containment reference.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDocumentRoot_ExtensionModelError()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExtensionModelError' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelError getExtensionModelError();

	/**
	 * Returns the value of the '<em><b>Generation Setting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Setting</em>' containment reference.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDocumentRoot_GenerationSetting()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GenerationSetting' namespace='##targetNamespace'"
	 * @generated
	 */
	GenerationSettingType getGenerationSetting();

	/**
	 * Returns the value of the '<em><b>Generation State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation State</em>' containment reference.
	 * @see #setGenerationState(GenerationStateType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDocumentRoot_GenerationState()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GenerationState' namespace='##targetNamespace'"
	 * @generated
	 */
	GenerationStateType getGenerationState();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getGenerationState <em>Generation State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation State</em>' containment reference.
	 * @see #getGenerationState()
	 * @generated
	 */
	void setGenerationState(GenerationStateType value);

	/**
	 * Returns the value of the '<em><b>Grouping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouping</em>' containment reference.
	 * @see #setGrouping(GroupingType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDocumentRoot_Grouping()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Grouping' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupingType getGrouping();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getGrouping <em>Grouping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grouping</em>' containment reference.
	 * @see #getGrouping()
	 * @generated
	 */
	void setGrouping(GroupingType value);

	/**
	 * Returns the value of the '<em><b>Group Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Type</em>' containment reference.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDocumentRoot_GroupType()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GroupType' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupTypeType getGroupType();

	/**
	 * Returns the value of the '<em><b>Model Error Display Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Error Display Filter</em>' containment reference.
	 * @see #setModelErrorDisplayFilter(ModelErrorDisplayFilterType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDocumentRoot_ModelErrorDisplayFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModelErrorDisplayFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelErrorDisplayFilterType getModelErrorDisplayFilter();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getModelErrorDisplayFilter <em>Model Error Display Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Error Display Filter</em>' containment reference.
	 * @see #getModelErrorDisplayFilter()
	 * @generated
	 */
	void setModelErrorDisplayFilter(ModelErrorDisplayFilterType value);

	/**
	 * Returns the value of the '<em><b>Name Generator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Generator</em>' containment reference.
	 * @see #setNameGenerator(NameGeneratorType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDocumentRoot_NameGenerator()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NameGenerator' namespace='##targetNamespace'"
	 * @generated
	 */
	NameGeneratorType getNameGenerator();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getNameGenerator <em>Name Generator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Generator</em>' containment reference.
	 * @see #getNameGenerator()
	 * @generated
	 */
	void setNameGenerator(NameGeneratorType value);

	/**
	 * Returns the value of the '<em><b>ORM Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ORM Model</em>' containment reference.
	 * @see #setORMModel(ORMModelType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDocumentRoot_ORMModel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ORMModel' namespace='##targetNamespace'"
	 * @generated
	 */
	ORMModelType getORMModel();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getORMModel <em>ORM Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ORM Model</em>' containment reference.
	 * @see #getORMModel()
	 * @generated
	 */
	void setORMModel(ORMModelType value);

	/**
	 * Returns the value of the '<em><b>ORM Model Browser Dynamic Color</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dynamic color information displayed in the ORM Model Browser tool window.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ORM Model Browser Dynamic Color</em>' containment reference.
	 * @see #setORMModelBrowserDynamicColor(DynamicColorType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDocumentRoot_ORMModelBrowserDynamicColor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ORMModelBrowserDynamicColor' namespace='##targetNamespace' affiliation='DynamicColor'"
	 * @generated
	 */
	DynamicColorType getORMModelBrowserDynamicColor();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot#getORMModelBrowserDynamicColor <em>ORM Model Browser Dynamic Color</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ORM Model Browser Dynamic Color</em>' containment reference.
	 * @see #getORMModelBrowserDynamicColor()
	 * @generated
	 */
	void setORMModelBrowserDynamicColor(DynamicColorType value);

} // DocumentRoot
