/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Not Specified Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A value type is using the unspecified data type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypeNotSpecifiedErrorType#getConceptualDataType <em>Conceptual Data Type</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypeNotSpecifiedErrorType()
 * @model extendedMetaData="name='DataTypeNotSpecifiedErrorType' kind='elementOnly'"
 * @generated
 */
public interface DataTypeNotSpecifiedErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Conceptual Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conceptual Data Type</em>' containment reference.
	 * @see #setConceptualDataType(DataTypeRefRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDataTypeNotSpecifiedErrorType_ConceptualDataType()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ConceptualDataType' namespace='##targetNamespace'"
	 * @generated
	 */
	DataTypeRefRef getConceptualDataType();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.DataTypeNotSpecifiedErrorType#getConceptualDataType <em>Conceptual Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conceptual Data Type</em>' containment reference.
	 * @see #getConceptualDataType()
	 * @generated
	 */
	void setConceptualDataType(DataTypeRefRef value);

} // DataTypeNotSpecifiedErrorType
