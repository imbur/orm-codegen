/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reading Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Predicate text corresponding to a specific role traversal.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingType#getData <em>Data</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingType#getExpandedData <em>Expanded Data</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getReadingType()
 * @model extendedMetaData="name='ReadingType' kind='elementOnly'"
 * @generated
 */
public interface ReadingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reading text with numbered replacemented fields in the format {n}, where n is a zero-based index into the corresponding role traversal order. n is also strictly increasing, so the first replacement field corresponds to the first role, etc. Reading text also includes hyphen-binding specifications, where 'WORD- ' (or ' -WORD') binds WORD and all intermediate words to the nearest right (left) placeholder. To enable hyphen binding with no space before the role player, 'WORD-- ROLEPLAYER' collapses the trailing space, resulting in 'WORD-ROLEPLAYER'. 'WORD- ROLEPLAYER' can be achived with two hyphens and two spaces.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getReadingType_Data()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Data' namespace='##targetNamespace'"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingType#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>Expanded Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An expanded form of the Data element with text decoration broken down on a per-role basis. Hyphen binding constructs are fully resolved with hyphens removed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expanded Data</em>' containment reference.
	 * @see #setExpandedData(ExpandedDataType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getReadingType_ExpandedData()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExpandedData' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpandedDataType getExpandedData();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingType#getExpandedData <em>Expanded Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expanded Data</em>' containment reference.
	 * @see #getExpandedData()
	 * @generated
	 */
	void setExpandedData(ExpandedDataType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getReadingType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ReadingType
