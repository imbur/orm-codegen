/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Objectifying Instance Required Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance of an objectified fact type does not have an associated instance for the objectifying entity type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectifyingInstanceRequiredErrorType#getFactTypeInstance <em>Fact Type Instance</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectifyingInstanceRequiredErrorType()
 * @model extendedMetaData="name='ObjectifyingInstanceRequiredErrorType' kind='elementOnly'"
 * @generated
 */
public interface ObjectifyingInstanceRequiredErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Fact Type Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type Instance</em>' containment reference.
	 * @see #setFactTypeInstance(FactTypeInstanceRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectifyingInstanceRequiredErrorType_FactTypeInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FactTypeInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	FactTypeInstanceRef getFactTypeInstance();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectifyingInstanceRequiredErrorType#getFactTypeInstance <em>Fact Type Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact Type Instance</em>' containment reference.
	 * @see #getFactTypeInstance()
	 * @generated
	 */
	void setFactTypeInstance(FactTypeInstanceRef value);

} // ObjectifyingInstanceRequiredErrorType
