/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Condition Root Value Restriction Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Restrict the values required by a path root to satisfy the role path.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PathConditionRootValueRestrictionType#getPathRootConditionValueConstraint <em>Path Root Condition Value Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathConditionRootValueRestrictionType()
 * @model extendedMetaData="name='PathConditionRootValueRestrictionType' kind='elementOnly'"
 * @generated
 */
public interface PathConditionRootValueRestrictionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Path Root Condition Value Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Root Condition Value Constraint</em>' containment reference.
	 * @see #setPathRootConditionValueConstraint(ValueConstraintType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathConditionRootValueRestrictionType_PathRootConditionValueConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PathRootConditionValueConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueConstraintType getPathRootConditionValueConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathConditionRootValueRestrictionType#getPathRootConditionValueConstraint <em>Path Root Condition Value Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Root Condition Value Constraint</em>' containment reference.
	 * @see #getPathRootConditionValueConstraint()
	 * @generated
	 */
	void setPathRootConditionValueConstraint(ValueConstraintType value);

} // PathConditionRootValueRestrictionType
