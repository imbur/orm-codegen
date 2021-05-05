/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Role Cardinality Restriction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Restrict the number of different instances allowed to play this role in a population.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.UnaryRoleCardinalityRestrictionType#getUnaryRoleCardinalityConstraint <em>Unary Role Cardinality Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getUnaryRoleCardinalityRestrictionType()
 * @model extendedMetaData="name='UnaryRoleCardinalityRestrictionType' kind='elementOnly'"
 * @generated
 */
public interface UnaryRoleCardinalityRestrictionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Unary Role Cardinality Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unary Role Cardinality Constraint</em>' containment reference.
	 * @see #setUnaryRoleCardinalityConstraint(CardinalityConstraintType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getUnaryRoleCardinalityRestrictionType_UnaryRoleCardinalityConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UnaryRoleCardinalityConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	CardinalityConstraintType getUnaryRoleCardinalityConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.UnaryRoleCardinalityRestrictionType#getUnaryRoleCardinalityConstraint <em>Unary Role Cardinality Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unary Role Cardinality Constraint</em>' containment reference.
	 * @see #getUnaryRoleCardinalityConstraint()
	 * @generated
	 */
	void setUnaryRoleCardinalityConstraint(CardinalityConstraintType value);

} // UnaryRoleCardinalityRestrictionType
