/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Value Restriction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Restrict the values allowed for role players associated with this role.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleValueRestrictionType#getRoleValueConstraint <em>Role Value Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleValueRestrictionType()
 * @model extendedMetaData="name='RoleValueRestrictionType' kind='elementOnly'"
 * @generated
 */
public interface RoleValueRestrictionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Role Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Value Constraint</em>' containment reference.
	 * @see #setRoleValueConstraint(ValueConstraintWithNameType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleValueRestrictionType_RoleValueConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RoleValueConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueConstraintWithNameType getRoleValueConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleValueRestrictionType#getRoleValueConstraint <em>Role Value Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Value Constraint</em>' containment reference.
	 * @see #getRoleValueConstraint()
	 * @generated
	 */
	void setRoleValueConstraint(ValueConstraintWithNameType value);

} // RoleValueRestrictionType
