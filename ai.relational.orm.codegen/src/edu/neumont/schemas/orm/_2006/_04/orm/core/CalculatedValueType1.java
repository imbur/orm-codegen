/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculated Value Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies the function, scope, and inputs used for an algorithmic calculation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType1#getFunction <em>Function</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType1#getAggregationContext <em>Aggregation Context</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType1#getScope <em>Scope</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType1#getInputs <em>Inputs</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType1#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType1#isUniversalAggregationContext <em>Universal Aggregation Context</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCalculatedValueType1()
 * @model extendedMetaData="name='CalculatedValueType' kind='elementOnly'"
 * @generated
 */
public interface CalculatedValueType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The function used to perform the calculation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Function</em>' containment reference.
	 * @see #setFunction(FunctionRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCalculatedValueType1_Function()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Function' namespace='##targetNamespace'"
	 * @generated
	 */
	FunctionRef getFunction();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType1#getFunction <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' containment reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(FunctionRef value);

	/**
	 * Returns the value of the '<em><b>Aggregation Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Path root and path role elements forming the aggregation context for the function evaluation. Populate if the function is an aggregate (meaning that a parameter is marked as a BagInput) and the UniversalAggregationContext attribute is not set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregation Context</em>' containment reference.
	 * @see #setAggregationContext(AggregationContextType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCalculatedValueType1_AggregationContext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AggregationContext' namespace='##targetNamespace'"
	 * @generated
	 */
	AggregationContextType getAggregationContext();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType1#getAggregationContext <em>Aggregation Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Context</em>' containment reference.
	 * @see #getAggregationContext()
	 * @generated
	 */
	void setAggregationContext(AggregationContextType value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (deprecated, use AggregationContext) The pathed role that provides the context for this calculation. Generally used to defined the extent of elements based to a bag parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Scope</em>' containment reference.
	 * @see #setScope(PathedRoleRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCalculatedValueType1_Scope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Scope' namespace='##targetNamespace'"
	 * @generated
	 */
	PathedRoleRef getScope();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType1#getScope <em>Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' containment reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(PathedRoleRef value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inputs passed to the function used for the calculation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference.
	 * @see #setInputs(InputsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCalculatedValueType1_Inputs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Inputs' namespace='##targetNamespace'"
	 * @generated
	 */
	InputsType getInputs();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType1#getInputs <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' containment reference.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(InputsType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCalculatedValueType1_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType1#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Universal Aggregation Context</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set to true if the AggregationContext is not provided and the function is an aggregate, meaning that a parameter is marked as a BagInput.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Universal Aggregation Context</em>' attribute.
	 * @see #isSetUniversalAggregationContext()
	 * @see #unsetUniversalAggregationContext()
	 * @see #setUniversalAggregationContext(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCalculatedValueType1_UniversalAggregationContext()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='UniversalAggregationContext'"
	 * @generated
	 */
	boolean isUniversalAggregationContext();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType1#isUniversalAggregationContext <em>Universal Aggregation Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Universal Aggregation Context</em>' attribute.
	 * @see #isSetUniversalAggregationContext()
	 * @see #unsetUniversalAggregationContext()
	 * @see #isUniversalAggregationContext()
	 * @generated
	 */
	void setUniversalAggregationContext(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType1#isUniversalAggregationContext <em>Universal Aggregation Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUniversalAggregationContext()
	 * @see #isUniversalAggregationContext()
	 * @see #setUniversalAggregationContext(boolean)
	 * @generated
	 */
	void unsetUniversalAggregationContext();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueType1#isUniversalAggregationContext <em>Universal Aggregation Context</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Universal Aggregation Context</em>' attribute is set.
	 * @see #unsetUniversalAggregationContext()
	 * @see #isUniversalAggregationContext()
	 * @see #setUniversalAggregationContext(boolean)
	 * @generated
	 */
	boolean isSetUniversalAggregationContext();

} // CalculatedValueType1
