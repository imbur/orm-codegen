/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definitions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The container for informal description elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DefinitionsType#getDefinition <em>Definition</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDefinitionsType()
 * @model extendedMetaData="name='DefinitionsType' kind='elementOnly'"
 * @generated
 */
public interface DefinitionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' containment reference.
	 * @see #setDefinition(DefinitionType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDefinitionsType_Definition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Definition' namespace='##targetNamespace'"
	 * @generated
	 */
	DefinitionType getDefinition();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.DefinitionsType#getDefinition <em>Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' containment reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(DefinitionType value);

} // DefinitionsType
