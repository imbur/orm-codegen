/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Reference Mode Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of a custom reference mode pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CustomReferenceModeType#getCustomFormatString <em>Custom Format String</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CustomReferenceModeType#getKind <em>Kind</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CustomReferenceModeType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CustomReferenceModeType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCustomReferenceModeType()
 * @model extendedMetaData="name='CustomReferenceModeType' kind='elementOnly'"
 * @generated
 */
public interface CustomReferenceModeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Custom Format String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string with replacement fields representing a custom format for a value type name based on the entity type name (replacement field {0}) and reference mode name (replacement field {1}). If not specified, defaults to the ReferenceModeKind FormatString attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Format String</em>' attribute.
	 * @see #setCustomFormatString(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCustomReferenceModeType_CustomFormatString()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='CustomFormatString' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCustomFormatString();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CustomReferenceModeType#getCustomFormatString <em>Custom Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Format String</em>' attribute.
	 * @see #getCustomFormatString()
	 * @generated
	 */
	void setCustomFormatString(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' containment reference.
	 * @see #setKind(ReferenceModeKindRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCustomReferenceModeType_Kind()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Kind' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceModeKindRef getKind();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CustomReferenceModeType#getKind <em>Kind</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' containment reference.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ReferenceModeKindRef value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCustomReferenceModeType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CustomReferenceModeType#getId <em>Id</em>}' attribute.
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
	 * The reference mode name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCustomReferenceModeType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CustomReferenceModeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CustomReferenceModeType
