/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Informal Derivation Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An informal description of the intent of a derivation rule.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.InformalDerivationRuleType#getDerivationNote <em>Derivation Note</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getInformalDerivationRuleType()
 * @model extendedMetaData="name='InformalDerivationRuleType' kind='elementOnly'"
 * @generated
 */
public interface InformalDerivationRuleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Derivation Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation Note</em>' containment reference.
	 * @see #setDerivationNote(DerivationExpressionType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getInformalDerivationRuleType_DerivationNote()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DerivationNote' namespace='##targetNamespace'"
	 * @generated
	 */
	DerivationExpressionType getDerivationNote();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.InformalDerivationRuleType#getDerivationNote <em>Derivation Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Note</em>' containment reference.
	 * @see #getDerivationNote()
	 * @generated
	 */
	void setDerivationNote(DerivationExpressionType value);

} // InformalDerivationRuleType
