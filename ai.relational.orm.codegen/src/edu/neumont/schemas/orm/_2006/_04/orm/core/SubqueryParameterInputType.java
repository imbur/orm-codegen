/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subquery Parameter Input Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Associate the referenced parameter with a path node from the path that steps into this subquery.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubqueryParameterInputType#getInputFrom <em>Input From</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubqueryParameterInputType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubqueryParameterInputType#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubqueryParameterInputType()
 * @model extendedMetaData="name='SubqueryParameterInputType' kind='elementOnly'"
 * @generated
 */
public interface SubqueryParameterInputType extends EObject {
	/**
	 * Returns the value of the '<em><b>Input From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specify the path node used to provide the input data for the subquery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input From</em>' containment reference.
	 * @see #setInputFrom(InputFromType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubqueryParameterInputType_InputFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InputFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	InputFromType getInputFrom();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubqueryParameterInputType#getInputFrom <em>Input From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input From</em>' containment reference.
	 * @see #getInputFrom()
	 * @generated
	 */
	void setInputFrom(InputFromType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubqueryParameterInputType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubqueryParameterInputType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the referenced element's unique id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubqueryParameterInputType_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='ref'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubqueryParameterInputType#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

} // SubqueryParameterInputType
