/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An alternative name for the containing named element
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.AliasType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.AliasType#getName <em>Name</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.AliasType#getNameConsumer <em>Name Consumer</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.AliasType#getNameUsage <em>Name Usage</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getAliasType()
 * @model extendedMetaData="name='AliasType' kind='empty'"
 * @generated
 */
public interface AliasType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getAliasType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.AliasType#getId <em>Id</em>}' attribute.
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
	 * The alternative name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getAliasType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.AliasType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Name Consumer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of consumer for this form of the name. NameConsumer types are provided by extension models.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Consumer</em>' attribute.
	 * @see #setNameConsumer(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getAliasType_NameConsumer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='NameConsumer'"
	 * @generated
	 */
	String getNameConsumer();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.AliasType#getNameConsumer <em>Name Consumer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Consumer</em>' attribute.
	 * @see #getNameConsumer()
	 * @generated
	 */
	void setNameConsumer(String value);

	/**
	 * Returns the value of the '<em><b>Name Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional extension-provided categorization type for how a name should be used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Usage</em>' attribute.
	 * @see #setNameUsage(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getAliasType_NameUsage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='NameUsage'"
	 * @generated
	 */
	String getNameUsage();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.AliasType#getNameUsage <em>Name Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Usage</em>' attribute.
	 * @see #getNameUsage()
	 * @generated
	 */
	void setNameUsage(String value);

} // AliasType
