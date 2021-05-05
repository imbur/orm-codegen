/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Type Value Restriction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Restrict the values allowed for any instance of the containing value type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeValueRestrictionType#getValueConstraint <em>Value Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueTypeValueRestrictionType()
 * @model extendedMetaData="name='ValueTypeValueRestrictionType' kind='elementOnly'"
 * @generated
 */
public interface ValueTypeValueRestrictionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Constraint</em>' containment reference.
	 * @see #setValueConstraint(ValueConstraintWithNameType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueTypeValueRestrictionType_ValueConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ValueConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueConstraintWithNameType getValueConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeValueRestrictionType#getValueConstraint <em>Value Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Constraint</em>' containment reference.
	 * @see #getValueConstraint()
	 * @generated
	 */
	void setValueConstraint(ValueConstraintWithNameType value);

} // ValueTypeValueRestrictionType
