/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies a function definition used for calculating values.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionType#getParameters <em>Parameters</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionType#isIsBoolean <em>Is Boolean</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionType#getName <em>Name</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionType#getOperatorSymbol <em>Operator Symbol</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFunctionType()
 * @model extendedMetaData="name='FunctionType' kind='elementOnly'"
 * @generated
 */
public interface FunctionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for function parameters
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(ParametersType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFunctionType_Parameters()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	ParametersType getParameters();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionType#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(ParametersType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFunctionType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Is Boolean</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if this function or operator returns a boolean value, making it appropriate for use as a path condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Boolean</em>' attribute.
	 * @see #isSetIsBoolean()
	 * @see #unsetIsBoolean()
	 * @see #setIsBoolean(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFunctionType_IsBoolean()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsBoolean'"
	 * @generated
	 */
	boolean isIsBoolean();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionType#isIsBoolean <em>Is Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Boolean</em>' attribute.
	 * @see #isSetIsBoolean()
	 * @see #unsetIsBoolean()
	 * @see #isIsBoolean()
	 * @generated
	 */
	void setIsBoolean(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionType#isIsBoolean <em>Is Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsBoolean()
	 * @see #isIsBoolean()
	 * @see #setIsBoolean(boolean)
	 * @generated
	 */
	void unsetIsBoolean();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionType#isIsBoolean <em>Is Boolean</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Boolean</em>' attribute is set.
	 * @see #unsetIsBoolean()
	 * @see #isIsBoolean()
	 * @see #setIsBoolean(boolean)
	 * @generated
	 */
	boolean isSetIsBoolean();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFunctionType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operator Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A symbol used to display this function as an operator. Treated as an infix operator for binary functions and a prefix operator for unary functions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operator Symbol</em>' attribute.
	 * @see #setOperatorSymbol(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFunctionType_OperatorSymbol()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='OperatorSymbol'"
	 * @generated
	 */
	String getOperatorSymbol();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionType#getOperatorSymbol <em>Operator Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator Symbol</em>' attribute.
	 * @see #getOperatorSymbol()
	 * @generated
	 */
	void setOperatorSymbol(String value);

} // FunctionType
