/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Type Instance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Value instance. All other instance specifications are ultimately combinations of value instances.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeInstanceType#getValue <em>Value</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeInstanceType#getInvariantValue <em>Invariant Value</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeInstanceType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeInstanceType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueTypeInstanceType()
 * @model extendedMetaData="name='ValueTypeInstanceType' kind='elementOnly'"
 * @generated
 */
public interface ValueTypeInstanceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text form of an instance value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueTypeInstanceType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeInstanceType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Invariant Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A culture-invariant form of the instance value. This will not be set for data types with data that is not culture dependent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invariant Value</em>' attribute.
	 * @see #setInvariantValue(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueTypeInstanceType_InvariantValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='InvariantValue' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInvariantValue();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeInstanceType#getInvariantValue <em>Invariant Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant Value</em>' attribute.
	 * @see #getInvariantValue()
	 * @generated
	 */
	void setInvariantValue(String value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueTypeInstanceType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeInstanceType#getExtensions <em>Extensions</em>}' containment reference.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueTypeInstanceType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeInstanceType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ValueTypeInstanceType
