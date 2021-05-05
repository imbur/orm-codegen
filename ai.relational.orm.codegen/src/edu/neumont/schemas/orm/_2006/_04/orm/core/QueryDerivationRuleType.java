/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Derivation Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The formal derivation rule for a query.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationRuleType#getQueryDerivationPath <em>Query Derivation Path</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryDerivationRuleType()
 * @model extendedMetaData="name='QueryDerivationRuleType' kind='elementOnly'"
 * @generated
 */
public interface QueryDerivationRuleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Query Derivation Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Derivation Path</em>' containment reference.
	 * @see #setQueryDerivationPath(QueryDerivationPathType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getQueryDerivationRuleType_QueryDerivationPath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QueryDerivationPath' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryDerivationPathType getQueryDerivationPath();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationRuleType#getQueryDerivationPath <em>Query Derivation Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Derivation Path</em>' containment reference.
	 * @see #getQueryDerivationPath()
	 * @generated
	 */
	void setQueryDerivationPath(QueryDerivationPathType value);

} // QueryDerivationRuleType
