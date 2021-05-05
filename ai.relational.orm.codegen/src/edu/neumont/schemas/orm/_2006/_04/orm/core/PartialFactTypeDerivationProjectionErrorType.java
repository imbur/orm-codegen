/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial Fact Type Derivation Projection Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A fact type derivation projection must project on all roles in the derived fact type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PartialFactTypeDerivationProjectionErrorType#getDerivationProjection <em>Derivation Projection</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPartialFactTypeDerivationProjectionErrorType()
 * @model extendedMetaData="name='PartialFactTypeDerivationProjectionErrorType' kind='elementOnly'"
 * @generated
 */
public interface PartialFactTypeDerivationProjectionErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Derivation Projection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation Projection</em>' containment reference.
	 * @see #setDerivationProjection(FactTypeDerivationProjectionRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPartialFactTypeDerivationProjectionErrorType_DerivationProjection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DerivationProjection' namespace='##targetNamespace'"
	 * @generated
	 */
	FactTypeDerivationProjectionRef getDerivationProjection();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PartialFactTypeDerivationProjectionErrorType#getDerivationProjection <em>Derivation Projection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Projection</em>' containment reference.
	 * @see #getDerivationProjection()
	 * @generated
	 */
	void setDerivationProjection(FactTypeDerivationProjectionRef value);

} // PartialFactTypeDerivationProjectionErrorType
