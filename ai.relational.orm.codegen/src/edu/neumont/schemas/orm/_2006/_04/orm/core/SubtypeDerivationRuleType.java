/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtype Derivation Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The formal derivation rule defining a subtype.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationRuleType#getSubtypeDerivationExpression <em>Subtype Derivation Expression</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationRuleType#getSubtypeDerivationPath <em>Subtype Derivation Path</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeDerivationRuleType()
 * @model extendedMetaData="name='SubtypeDerivationRuleType' kind='elementOnly'"
 * @generated
 */
public interface SubtypeDerivationRuleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Subtype Derivation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (Deprecated) A derivation expression. Use SubtypeDerivationPath/InformalRule/DerivationNote instead.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subtype Derivation Expression</em>' containment reference.
	 * @see #setSubtypeDerivationExpression(DerivationExpressionType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeDerivationRuleType_SubtypeDerivationExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubtypeDerivationExpression' namespace='##targetNamespace'"
	 * @generated
	 */
	DerivationExpressionType getSubtypeDerivationExpression();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationRuleType#getSubtypeDerivationExpression <em>Subtype Derivation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype Derivation Expression</em>' containment reference.
	 * @see #getSubtypeDerivationExpression()
	 * @generated
	 */
	void setSubtypeDerivationExpression(DerivationExpressionType value);

	/**
	 * Returns the value of the '<em><b>Subtype Derivation Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype Derivation Path</em>' containment reference.
	 * @see #setSubtypeDerivationPath(SubtypeDerivationPathType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeDerivationRuleType_SubtypeDerivationPath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubtypeDerivationPath' namespace='##targetNamespace'"
	 * @generated
	 */
	SubtypeDerivationPathType getSubtypeDerivationPath();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationRuleType#getSubtypeDerivationPath <em>Subtype Derivation Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype Derivation Path</em>' containment reference.
	 * @see #getSubtypeDerivationPath()
	 * @generated
	 */
	void setSubtypeDerivationPath(SubtypeDerivationPathType value);

} // SubtypeDerivationRuleType
