/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Parameter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A parameter defined as the input for a query element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterType#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterType#getParameterBindings <em>Parameter Bindings</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryParameterType()
 * @model extendedMetaData="name='QueryParameterType' kind='elementOnly'"
 * @generated
 */
public interface QueryParameterType extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type associated with this parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Type</em>' containment reference.
	 * @see #setParameterType(ObjectTypeRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryParameterType_ParameterType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParameterType' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectTypeRef getParameterType();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterType#getParameterType <em>Parameter Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' containment reference.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(ObjectTypeRef value);

	/**
	 * Returns the value of the '<em><b>Parameter Bindings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Bindings</em>' containment reference.
	 * @see #setParameterBindings(QueryParameterBindingsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryParameterType_ParameterBindings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ParameterBindings' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryParameterBindingsType getParameterBindings();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterType#getParameterBindings <em>Parameter Bindings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Bindings</em>' containment reference.
	 * @see #getParameterBindings()
	 * @generated
	 */
	void setParameterBindings(QueryParameterBindingsType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryParameterType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterType#getId <em>Id</em>}' attribute.
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
	 * The name of the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryParameterType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryParameterType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // QueryParameterType
