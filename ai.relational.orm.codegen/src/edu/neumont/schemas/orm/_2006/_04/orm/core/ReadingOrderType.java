/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reading Order Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A sequence of roles from a single fact type representing representing a complete role traversal. Also called a predicate.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingOrderType#getReadings <em>Readings</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingOrderType#getRoleSequence <em>Role Sequence</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingOrderType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getReadingOrderType()
 * @model extendedMetaData="name='ReadingOrderType' kind='elementOnly'"
 * @generated
 */
public interface ReadingOrderType extends EObject {
	/**
	 * Returns the value of the '<em><b>Readings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Readings</em>' containment reference.
	 * @see #setReadings(ReadingsType1)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getReadingOrderType_Readings()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Readings' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadingsType1 getReadings();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingOrderType#getReadings <em>Readings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Readings</em>' containment reference.
	 * @see #getReadings()
	 * @generated
	 */
	void setReadings(ReadingsType1 value);

	/**
	 * Returns the value of the '<em><b>Role Sequence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Sequence</em>' containment reference.
	 * @see #setRoleSequence(ReadingRoleSequenceType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getReadingOrderType_RoleSequence()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RoleSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	ReadingRoleSequenceType getRoleSequence();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingOrderType#getRoleSequence <em>Role Sequence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Sequence</em>' containment reference.
	 * @see #getRoleSequence()
	 * @generated
	 */
	void setRoleSequence(ReadingRoleSequenceType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getReadingOrderType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReadingOrderType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ReadingOrderType
