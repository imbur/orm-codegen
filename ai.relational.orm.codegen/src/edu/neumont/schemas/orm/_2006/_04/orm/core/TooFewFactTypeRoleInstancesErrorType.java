/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Too Few Fact Type Role Instances Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A fact instance is missing instance associations for some roles in the fact type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.TooFewFactTypeRoleInstancesErrorType#getFactTypeInstance <em>Fact Type Instance</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getTooFewFactTypeRoleInstancesErrorType()
 * @model extendedMetaData="name='TooFewFactTypeRoleInstancesErrorType' kind='elementOnly'"
 * @generated
 */
public interface TooFewFactTypeRoleInstancesErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Fact Type Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type Instance</em>' containment reference.
	 * @see #setFactTypeInstance(FactTypeInstanceRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getTooFewFactTypeRoleInstancesErrorType_FactTypeInstance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FactTypeInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	FactTypeInstanceRef getFactTypeInstance();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.TooFewFactTypeRoleInstancesErrorType#getFactTypeInstance <em>Fact Type Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact Type Instance</em>' containment reference.
	 * @see #getFactTypeInstance()
	 * @generated
	 */
	void setFactTypeInstance(FactTypeInstanceRef value);

} // TooFewFactTypeRoleInstancesErrorType
