/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Name Generator Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Name generation settings
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getRefinements <em>Refinements</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#isAutomaticallyShortenNames <em>Automatically Shorten Names</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getCasingOption <em>Casing Option</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getNameUsage <em>Name Usage</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getSpacingFormat <em>Spacing Format</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getSpacingReplacement <em>Spacing Replacement</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getUserDefinedMaximum <em>User Defined Maximum</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#isUseTargetDefaultMaximum <em>Use Target Default Maximum</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNameGeneratorType()
 * @model extendedMetaData="name='NameGeneratorType' kind='elementOnly'"
 * @generated
 */
public interface NameGeneratorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNameGeneratorType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Refinements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container specifying additional name generator instances that provide settings for a more specific use of the generated names.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Refinements</em>' containment reference.
	 * @see #setRefinements(RefinementsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNameGeneratorType_Refinements()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Refinements' namespace='##targetNamespace'"
	 * @generated
	 */
	RefinementsType getRefinements();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getRefinements <em>Refinements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refinements</em>' containment reference.
	 * @see #getRefinements()
	 * @generated
	 */
	void setRefinements(RefinementsType value);

	/**
	 * Returns the value of the '<em><b>Automatically Shorten Names</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the namegeneration system should automatically shorten names if they exceed the max length
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Automatically Shorten Names</em>' attribute.
	 * @see #isSetAutomaticallyShortenNames()
	 * @see #unsetAutomaticallyShortenNames()
	 * @see #setAutomaticallyShortenNames(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNameGeneratorType_AutomaticallyShortenNames()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='AutomaticallyShortenNames'"
	 * @generated
	 */
	boolean isAutomaticallyShortenNames();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#isAutomaticallyShortenNames <em>Automatically Shorten Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatically Shorten Names</em>' attribute.
	 * @see #isSetAutomaticallyShortenNames()
	 * @see #unsetAutomaticallyShortenNames()
	 * @see #isAutomaticallyShortenNames()
	 * @generated
	 */
	void setAutomaticallyShortenNames(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#isAutomaticallyShortenNames <em>Automatically Shorten Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutomaticallyShortenNames()
	 * @see #isAutomaticallyShortenNames()
	 * @see #setAutomaticallyShortenNames(boolean)
	 * @generated
	 */
	void unsetAutomaticallyShortenNames();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#isAutomaticallyShortenNames <em>Automatically Shorten Names</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Automatically Shorten Names</em>' attribute is set.
	 * @see #unsetAutomaticallyShortenNames()
	 * @see #isAutomaticallyShortenNames()
	 * @see #setAutomaticallyShortenNames(boolean)
	 * @generated
	 */
	boolean isSetAutomaticallyShortenNames();

	/**
	 * Returns the value of the '<em><b>Casing Option</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link edu.neumont.schemas.orm._2006._04.orm.core.CasingOptionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specify casing modifications for name parts and combinations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Casing Option</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CasingOptionType
	 * @see #isSetCasingOption()
	 * @see #unsetCasingOption()
	 * @see #setCasingOption(CasingOptionType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNameGeneratorType_CasingOption()
	 * @model default="None" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='CasingOption'"
	 * @generated
	 */
	CasingOptionType getCasingOption();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getCasingOption <em>Casing Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Casing Option</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CasingOptionType
	 * @see #isSetCasingOption()
	 * @see #unsetCasingOption()
	 * @see #getCasingOption()
	 * @generated
	 */
	void setCasingOption(CasingOptionType value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getCasingOption <em>Casing Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCasingOption()
	 * @see #getCasingOption()
	 * @see #setCasingOption(CasingOptionType)
	 * @generated
	 */
	void unsetCasingOption();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getCasingOption <em>Casing Option</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Casing Option</em>' attribute is set.
	 * @see #unsetCasingOption()
	 * @see #getCasingOption()
	 * @see #setCasingOption(CasingOptionType)
	 * @generated
	 */
	boolean isSetCasingOption();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNameGeneratorType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The usage associated with this Name Generator
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Usage</em>' attribute.
	 * @see #setNameUsage(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNameGeneratorType_NameUsage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='NameUsage'"
	 * @generated
	 */
	String getNameUsage();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getNameUsage <em>Name Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Usage</em>' attribute.
	 * @see #getNameUsage()
	 * @generated
	 */
	void setNameUsage(String value);

	/**
	 * Returns the value of the '<em><b>Spacing Format</b></em>' attribute.
	 * The default value is <code>"Retain"</code>.
	 * The literals are from the enumeration {@link edu.neumont.schemas.orm._2006._04.orm.core.SpacingFormatType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specify how name spaces are treated during name generation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spacing Format</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SpacingFormatType
	 * @see #isSetSpacingFormat()
	 * @see #unsetSpacingFormat()
	 * @see #setSpacingFormat(SpacingFormatType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNameGeneratorType_SpacingFormat()
	 * @model default="Retain" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='SpacingFormat'"
	 * @generated
	 */
	SpacingFormatType getSpacingFormat();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getSpacingFormat <em>Spacing Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spacing Format</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.SpacingFormatType
	 * @see #isSetSpacingFormat()
	 * @see #unsetSpacingFormat()
	 * @see #getSpacingFormat()
	 * @generated
	 */
	void setSpacingFormat(SpacingFormatType value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getSpacingFormat <em>Spacing Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpacingFormat()
	 * @see #getSpacingFormat()
	 * @see #setSpacingFormat(SpacingFormatType)
	 * @generated
	 */
	void unsetSpacingFormat();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getSpacingFormat <em>Spacing Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spacing Format</em>' attribute is set.
	 * @see #unsetSpacingFormat()
	 * @see #getSpacingFormat()
	 * @see #setSpacingFormat(SpacingFormatType)
	 * @generated
	 */
	boolean isSetSpacingFormat();

	/**
	 * Returns the value of the '<em><b>Spacing Replacement</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The string used in place of spaces when the SpacingFormat attribute is ReplaceWith
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spacing Replacement</em>' attribute.
	 * @see #isSetSpacingReplacement()
	 * @see #unsetSpacingReplacement()
	 * @see #setSpacingReplacement(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNameGeneratorType_SpacingReplacement()
	 * @model default="" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='SpacingReplacement'"
	 * @generated
	 */
	String getSpacingReplacement();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getSpacingReplacement <em>Spacing Replacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spacing Replacement</em>' attribute.
	 * @see #isSetSpacingReplacement()
	 * @see #unsetSpacingReplacement()
	 * @see #getSpacingReplacement()
	 * @generated
	 */
	void setSpacingReplacement(String value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getSpacingReplacement <em>Spacing Replacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpacingReplacement()
	 * @see #getSpacingReplacement()
	 * @see #setSpacingReplacement(String)
	 * @generated
	 */
	void unsetSpacingReplacement();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getSpacingReplacement <em>Spacing Replacement</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spacing Replacement</em>' attribute is set.
	 * @see #unsetSpacingReplacement()
	 * @see #getSpacingReplacement()
	 * @see #setSpacingReplacement(String)
	 * @generated
	 */
	boolean isSetSpacingReplacement();

	/**
	 * Returns the value of the '<em><b>User Defined Maximum</b></em>' attribute.
	 * The default value is <code>"128"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum name length set by user
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User Defined Maximum</em>' attribute.
	 * @see #isSetUserDefinedMaximum()
	 * @see #unsetUserDefinedMaximum()
	 * @see #setUserDefinedMaximum(BigInteger)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNameGeneratorType_UserDefinedMaximum()
	 * @model default="128" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='UserDefinedMaximum'"
	 * @generated
	 */
	BigInteger getUserDefinedMaximum();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getUserDefinedMaximum <em>User Defined Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Defined Maximum</em>' attribute.
	 * @see #isSetUserDefinedMaximum()
	 * @see #unsetUserDefinedMaximum()
	 * @see #getUserDefinedMaximum()
	 * @generated
	 */
	void setUserDefinedMaximum(BigInteger value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getUserDefinedMaximum <em>User Defined Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUserDefinedMaximum()
	 * @see #getUserDefinedMaximum()
	 * @see #setUserDefinedMaximum(BigInteger)
	 * @generated
	 */
	void unsetUserDefinedMaximum();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#getUserDefinedMaximum <em>User Defined Maximum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>User Defined Maximum</em>' attribute is set.
	 * @see #unsetUserDefinedMaximum()
	 * @see #getUserDefinedMaximum()
	 * @see #setUserDefinedMaximum(BigInteger)
	 * @generated
	 */
	boolean isSetUserDefinedMaximum();

	/**
	 * Returns the value of the '<em><b>Use Target Default Maximum</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum name length set by user
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Target Default Maximum</em>' attribute.
	 * @see #isSetUseTargetDefaultMaximum()
	 * @see #unsetUseTargetDefaultMaximum()
	 * @see #setUseTargetDefaultMaximum(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNameGeneratorType_UseTargetDefaultMaximum()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='UseTargetDefaultMaximum'"
	 * @generated
	 */
	boolean isUseTargetDefaultMaximum();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#isUseTargetDefaultMaximum <em>Use Target Default Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Target Default Maximum</em>' attribute.
	 * @see #isSetUseTargetDefaultMaximum()
	 * @see #unsetUseTargetDefaultMaximum()
	 * @see #isUseTargetDefaultMaximum()
	 * @generated
	 */
	void setUseTargetDefaultMaximum(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#isUseTargetDefaultMaximum <em>Use Target Default Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseTargetDefaultMaximum()
	 * @see #isUseTargetDefaultMaximum()
	 * @see #setUseTargetDefaultMaximum(boolean)
	 * @generated
	 */
	void unsetUseTargetDefaultMaximum();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType#isUseTargetDefaultMaximum <em>Use Target Default Maximum</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Target Default Maximum</em>' attribute is set.
	 * @see #unsetUseTargetDefaultMaximum()
	 * @see #isUseTargetDefaultMaximum()
	 * @see #setUseTargetDefaultMaximum(boolean)
	 * @generated
	 */
	boolean isSetUseTargetDefaultMaximum();

} // NameGeneratorType
