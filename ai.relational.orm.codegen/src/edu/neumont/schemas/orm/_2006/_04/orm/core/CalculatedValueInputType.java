/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Calculated Value Input Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An input to the function used to calculate a value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueInputType#getParameter <em>Parameter</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueInputType#getSource <em>Source</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueInputType#isDistinctValues <em>Distinct Values</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueInputType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCalculatedValueInputType()
 * @model extendedMetaData="name='CalculatedValueInputType' kind='elementOnly'"
 * @generated
 */
public interface CalculatedValueInputType extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(FunctionParameterRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCalculatedValueInputType_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	FunctionParameterRef getParameter();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueInputType#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(FunctionParameterRef value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source of value or bag passed to this parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(SourceType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCalculatedValueInputType_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Source' namespace='##targetNamespace'"
	 * @generated
	 */
	SourceType getSource();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueInputType#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceType value);

	/**
	 * Returns the value of the '<em><b>Distinct Values</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Should the bag input be analyzed to return only distinct values? Can only be applied an input associated with a bag parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distinct Values</em>' attribute.
	 * @see #isSetDistinctValues()
	 * @see #unsetDistinctValues()
	 * @see #setDistinctValues(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCalculatedValueInputType_DistinctValues()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='DistinctValues'"
	 * @generated
	 */
	boolean isDistinctValues();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueInputType#isDistinctValues <em>Distinct Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distinct Values</em>' attribute.
	 * @see #isSetDistinctValues()
	 * @see #unsetDistinctValues()
	 * @see #isDistinctValues()
	 * @generated
	 */
	void setDistinctValues(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueInputType#isDistinctValues <em>Distinct Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistinctValues()
	 * @see #isDistinctValues()
	 * @see #setDistinctValues(boolean)
	 * @generated
	 */
	void unsetDistinctValues();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueInputType#isDistinctValues <em>Distinct Values</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distinct Values</em>' attribute is set.
	 * @see #unsetDistinctValues()
	 * @see #isDistinctValues()
	 * @see #setDistinctValues(boolean)
	 * @generated
	 */
	boolean isSetDistinctValues();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCalculatedValueInputType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueInputType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // CalculatedValueInputType
