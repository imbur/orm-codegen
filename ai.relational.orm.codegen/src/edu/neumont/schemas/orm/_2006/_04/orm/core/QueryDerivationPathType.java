/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Derivation Path Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A role path with projected nodes used to populate a query.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationPathType#getDerivationProjections <em>Derivation Projections</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryDerivationPathType()
 * @model extendedMetaData="name='QueryDerivationPathType' kind='elementOnly'"
 * @generated
 */
public interface QueryDerivationPathType extends RolePathOwnerType {
	/**
	 * Returns the value of the '<em><b>Derivation Projections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for different sets of role projections.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivation Projections</em>' containment reference.
	 * @see #setDerivationProjections(DerivationProjectionsType1)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryDerivationPathType_DerivationProjections()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DerivationProjections' namespace='##targetNamespace'"
	 * @generated
	 */
	DerivationProjectionsType1 getDerivationProjections();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationPathType#getDerivationProjections <em>Derivation Projections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Projections</em>' containment reference.
	 * @see #getDerivationProjections()
	 * @generated
	 */
	void setDerivationProjections(DerivationProjectionsType1 value);

} // QueryDerivationPathType
