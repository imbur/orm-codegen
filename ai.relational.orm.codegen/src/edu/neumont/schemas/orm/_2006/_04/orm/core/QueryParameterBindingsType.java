/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Parameter Bindings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container to bind parameters to join path elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterBindingsType#getParameterBinding <em>Parameter Binding</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryParameterBindingsType()
 * @model extendedMetaData="name='QueryParameterBindingsType' kind='elementOnly'"
 * @generated
 */
public interface QueryParameterBindingsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Binding</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterBindingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Binding</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryParameterBindingsType_ParameterBinding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParameterBinding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QueryParameterBindingType> getParameterBinding();

} // QueryParameterBindingsType
