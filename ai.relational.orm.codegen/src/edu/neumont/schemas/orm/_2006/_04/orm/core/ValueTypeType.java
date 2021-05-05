/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An object type representing a self-identifying value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeType#getConceptualDataType <em>Conceptual Data Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeType#getValueRestriction <em>Value Restriction</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeType#getInstances <em>Instances</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeType#isIsImplicitBooleanValue <em>Is Implicit Boolean Value</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueTypeType()
 * @model extendedMetaData="name='ValueTypeType' kind='elementOnly'"
 * @generated
 */
public interface ValueTypeType extends ObjectTypeType {
	/**
	 * Returns the value of the '<em><b>Conceptual Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conceptual Data Type</em>' containment reference.
	 * @see #setConceptualDataType(DataTypeRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueTypeType_ConceptualDataType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ConceptualDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	DataTypeRef getConceptualDataType();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeType#getConceptualDataType <em>Conceptual Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conceptual Data Type</em>' containment reference.
	 * @see #getConceptualDataType()
	 * @generated
	 */
	void setConceptualDataType(DataTypeRef value);

	/**
	 * Returns the value of the '<em><b>Value Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Restriction</em>' containment reference.
	 * @see #setValueRestriction(ValueTypeValueRestrictionType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueTypeType_ValueRestriction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValueRestriction' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueTypeValueRestrictionType getValueRestriction();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeType#getValueRestriction <em>Value Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Restriction</em>' containment reference.
	 * @see #getValueRestriction()
	 * @generated
	 */
	void setValueRestriction(ValueTypeValueRestrictionType value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for instances of this value type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference.
	 * @see #setInstances(InstancesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueTypeType_Instances()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Instances' namespace='##targetNamespace'"
	 * @generated
	 */
	InstancesType getInstances();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeType#getInstances <em>Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances</em>' containment reference.
	 * @see #getInstances()
	 * @generated
	 */
	void setInstances(InstancesType value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueTypeType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Is Implicit Boolean Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if this is an implied boolean value type. The implied boolean values are automatically created to provide a binarized form of a unary fact type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Implicit Boolean Value</em>' attribute.
	 * @see #isSetIsImplicitBooleanValue()
	 * @see #unsetIsImplicitBooleanValue()
	 * @see #setIsImplicitBooleanValue(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueTypeType_IsImplicitBooleanValue()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsImplicitBooleanValue'"
	 * @generated
	 */
	boolean isIsImplicitBooleanValue();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeType#isIsImplicitBooleanValue <em>Is Implicit Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Implicit Boolean Value</em>' attribute.
	 * @see #isSetIsImplicitBooleanValue()
	 * @see #unsetIsImplicitBooleanValue()
	 * @see #isIsImplicitBooleanValue()
	 * @generated
	 */
	void setIsImplicitBooleanValue(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeType#isIsImplicitBooleanValue <em>Is Implicit Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsImplicitBooleanValue()
	 * @see #isIsImplicitBooleanValue()
	 * @see #setIsImplicitBooleanValue(boolean)
	 * @generated
	 */
	void unsetIsImplicitBooleanValue();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeType#isIsImplicitBooleanValue <em>Is Implicit Boolean Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Implicit Boolean Value</em>' attribute is set.
	 * @see #unsetIsImplicitBooleanValue()
	 * @see #isIsImplicitBooleanValue()
	 * @see #setIsImplicitBooleanValue(boolean)
	 * @generated
	 */
	boolean isSetIsImplicitBooleanValue();

} // ValueTypeType
