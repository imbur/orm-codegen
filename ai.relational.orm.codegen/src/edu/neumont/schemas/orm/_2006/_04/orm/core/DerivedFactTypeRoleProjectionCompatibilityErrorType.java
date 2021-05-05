/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Fact Type Role Projection Compatibility Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A projection onto a derived fact type role is not compatible with the role player of that role.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivedFactTypeRoleProjectionCompatibilityErrorType#getDerivedRoleProjection <em>Derived Role Projection</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDerivedFactTypeRoleProjectionCompatibilityErrorType()
 * @model extendedMetaData="name='DerivedFactTypeRoleProjectionCompatibilityErrorType' kind='elementOnly'"
 * @generated
 */
public interface DerivedFactTypeRoleProjectionCompatibilityErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Derived Role Projection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Role Projection</em>' containment reference.
	 * @see #setDerivedRoleProjection(DerivedRoleProjectionRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDerivedFactTypeRoleProjectionCompatibilityErrorType_DerivedRoleProjection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DerivedRoleProjection' namespace='##targetNamespace'"
	 * @generated
	 */
	DerivedRoleProjectionRef getDerivedRoleProjection();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivedFactTypeRoleProjectionCompatibilityErrorType#getDerivedRoleProjection <em>Derived Role Projection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived Role Projection</em>' containment reference.
	 * @see #getDerivedRoleProjection()
	 * @generated
	 */
	void setDerivedRoleProjection(DerivedRoleProjectionRef value);

} // DerivedFactTypeRoleProjectionCompatibilityErrorType
