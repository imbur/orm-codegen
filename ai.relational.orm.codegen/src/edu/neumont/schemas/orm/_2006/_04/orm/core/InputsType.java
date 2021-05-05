/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inputs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.InputsType#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getInputsType()
 * @model extendedMetaData="name='Inputs_._type' kind='elementOnly'"
 * @generated
 */
public interface InputsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueInputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getInputsType_Input()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Input' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CalculatedValueInputType> getInput();

} // InputsType
