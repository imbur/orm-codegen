/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Derivation Requires Projection Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A query derivation path must be projected on at least one role path.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationRequiresProjectionErrorType#getQueryDerivationPath <em>Query Derivation Path</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryDerivationRequiresProjectionErrorType()
 * @model extendedMetaData="name='QueryDerivationRequiresProjectionErrorType' kind='elementOnly'"
 * @generated
 */
public interface QueryDerivationRequiresProjectionErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Query Derivation Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Derivation Path</em>' containment reference.
	 * @see #setQueryDerivationPath(QueryDerivationPathRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryDerivationRequiresProjectionErrorType_QueryDerivationPath()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='QueryDerivationPath' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryDerivationPathRef getQueryDerivationPath();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationRequiresProjectionErrorType#getQueryDerivationPath <em>Query Derivation Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Derivation Path</em>' containment reference.
	 * @see #getQueryDerivationPath()
	 * @generated
	 */
	void setQueryDerivationPath(QueryDerivationPathRef value);

} // QueryDerivationRequiresProjectionErrorType
