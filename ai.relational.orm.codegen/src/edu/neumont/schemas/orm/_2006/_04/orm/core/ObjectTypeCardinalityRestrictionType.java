/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Type Cardinality Restriction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Restrict the size of a population of this object type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeCardinalityRestrictionType#getCardinalityConstraint <em>Cardinality Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectTypeCardinalityRestrictionType()
 * @model extendedMetaData="name='ObjectTypeCardinalityRestrictionType' kind='elementOnly'"
 * @generated
 */
public interface ObjectTypeCardinalityRestrictionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cardinality Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Constraint</em>' containment reference.
	 * @see #setCardinalityConstraint(CardinalityConstraintType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectTypeCardinalityRestrictionType_CardinalityConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CardinalityConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	CardinalityConstraintType getCardinalityConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeCardinalityRestrictionType#getCardinalityConstraint <em>Cardinality Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Constraint</em>' containment reference.
	 * @see #getCardinalityConstraint()
	 * @generated
	 */
	void setCardinalityConstraint(CardinalityConstraintType value);

} // ObjectTypeCardinalityRestrictionType
