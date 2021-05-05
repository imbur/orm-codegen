/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact Type Derivation Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The formal derivation rule defining a fact type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationRuleType#getDerivationExpression <em>Derivation Expression</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationRuleType#getFactTypeDerivationPath <em>Fact Type Derivation Path</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeDerivationRuleType()
 * @model extendedMetaData="name='FactTypeDerivationRuleType' kind='elementOnly'"
 * @generated
 */
public interface FactTypeDerivationRuleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Derivation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation Expression</em>' containment reference.
	 * @see #setDerivationExpression(FactTypeDerivationExpressionType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeDerivationRuleType_DerivationExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DerivationExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	FactTypeDerivationExpressionType getDerivationExpression();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationRuleType#getDerivationExpression <em>Derivation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Expression</em>' containment reference.
	 * @see #getDerivationExpression()
	 * @generated
	 */
	void setDerivationExpression(FactTypeDerivationExpressionType value);

	/**
	 * Returns the value of the '<em><b>Fact Type Derivation Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type Derivation Path</em>' containment reference.
	 * @see #setFactTypeDerivationPath(FactTypeDerivationPathType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeDerivationRuleType_FactTypeDerivationPath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FactTypeDerivationPath' namespace='##targetNamespace'"
	 * @generated
	 */
	FactTypeDerivationPathType getFactTypeDerivationPath();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationRuleType#getFactTypeDerivationPath <em>Fact Type Derivation Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact Type Derivation Path</em>' containment reference.
	 * @see #getFactTypeDerivationPath()
	 * @generated
	 */
	void setFactTypeDerivationPath(FactTypeDerivationPathType value);

} // FactTypeDerivationRuleType
