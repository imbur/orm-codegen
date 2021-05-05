/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Condition Role Value Restriction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Restrict the values required by a pathed role to satisfy the role path.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PathConditionRoleValueRestrictionType#getPathedRoleConditionValueConstraint <em>Pathed Role Condition Value Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathConditionRoleValueRestrictionType()
 * @model extendedMetaData="name='PathConditionRoleValueRestrictionType' kind='elementOnly'"
 * @generated
 */
public interface PathConditionRoleValueRestrictionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pathed Role Condition Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathed Role Condition Value Constraint</em>' containment reference.
	 * @see #setPathedRoleConditionValueConstraint(ValueConstraintType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathConditionRoleValueRestrictionType_PathedRoleConditionValueConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PathedRoleConditionValueConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueConstraintType getPathedRoleConditionValueConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathConditionRoleValueRestrictionType#getPathedRoleConditionValueConstraint <em>Pathed Role Condition Value Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pathed Role Condition Value Constraint</em>' containment reference.
	 * @see #getPathedRoleConditionValueConstraint()
	 * @generated
	 */
	void setPathedRoleConditionValueConstraint(ValueConstraintType value);

} // PathConditionRoleValueRestrictionType
