/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generation State Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * State information relating to automatic mapping algorithms.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.GenerationStateType#getGenerationSettings <em>Generation Settings</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.GenerationStateType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getGenerationStateType()
 * @model extendedMetaData="name='GenerationStateType' kind='elementOnly'"
 * @generated
 */
public interface GenerationStateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Generation Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container for extension-defined data relating to how elements were generated from the ORM model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generation Settings</em>' containment reference.
	 * @see #setGenerationSettings(GenerationSettingsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getGenerationStateType_GenerationSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GenerationSettings' namespace='##targetNamespace'"
	 * @generated
	 */
	GenerationSettingsType getGenerationSettings();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.GenerationStateType#getGenerationSettings <em>Generation Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation Settings</em>' containment reference.
	 * @see #getGenerationSettings()
	 * @generated
	 */
	void setGenerationSettings(GenerationSettingsType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getGenerationStateType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.GenerationStateType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // GenerationStateType
