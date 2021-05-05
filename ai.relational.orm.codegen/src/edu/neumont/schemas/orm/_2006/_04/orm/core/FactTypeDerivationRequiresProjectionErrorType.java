/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact Type Derivation Requires Projection Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A fact type derivation path must be projected on at least one role path.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationRequiresProjectionErrorType#getFactTypeDerivationPath <em>Fact Type Derivation Path</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeDerivationRequiresProjectionErrorType()
 * @model extendedMetaData="name='FactTypeDerivationRequiresProjectionErrorType' kind='elementOnly'"
 * @generated
 */
public interface FactTypeDerivationRequiresProjectionErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Fact Type Derivation Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type Derivation Path</em>' containment reference.
	 * @see #setFactTypeDerivationPath(FactTypeDerivationPathRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeDerivationRequiresProjectionErrorType_FactTypeDerivationPath()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FactTypeDerivationPath' namespace='##targetNamespace'"
	 * @generated
	 */
	FactTypeDerivationPathRef getFactTypeDerivationPath();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationRequiresProjectionErrorType#getFactTypeDerivationPath <em>Fact Type Derivation Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact Type Derivation Path</em>' containment reference.
	 * @see #getFactTypeDerivationPath()
	 * @generated
	 */
	void setFactTypeDerivationPath(FactTypeDerivationPathRef value);

} // FactTypeDerivationRequiresProjectionErrorType
