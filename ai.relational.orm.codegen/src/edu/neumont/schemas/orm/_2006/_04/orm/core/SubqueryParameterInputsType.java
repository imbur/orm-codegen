/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subquery Parameter Inputs Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubqueryParameterInputsType#getSubqueryParameterInputsFor <em>Subquery Parameter Inputs For</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubqueryParameterInputsType()
 * @model extendedMetaData="name='SubqueryParameterInputs_._type' kind='elementOnly'"
 * @generated
 */
public interface SubqueryParameterInputsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Subquery Parameter Inputs For</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.SubqueryParameterInputsForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subquery Parameter Inputs For</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubqueryParameterInputsType_SubqueryParameterInputsFor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubqueryParameterInputsFor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubqueryParameterInputsForType> getSubqueryParameterInputsFor();

} // SubqueryParameterInputsType
