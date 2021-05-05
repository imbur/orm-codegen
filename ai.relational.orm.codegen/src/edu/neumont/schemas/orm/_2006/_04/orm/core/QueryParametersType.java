/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Parameters Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for parameters defined by a query.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryParametersType#getQueryParameter <em>Query Parameter</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryParametersType()
 * @model extendedMetaData="name='QueryParametersType' kind='elementOnly'"
 * @generated
 */
public interface QueryParametersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Query Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Parameter</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryParametersType_QueryParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QueryParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QueryParameterType> getQueryParameter();

} // QueryParametersType
