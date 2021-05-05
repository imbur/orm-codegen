/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Superset Role Of Subtype Subset Constraint Not Subtype Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The roles in a SetConstraint or a column of a SetComparisonConstraint have incompatible role players.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType#getSubsetConstraint <em>Subset Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType()
 * @model extendedMetaData="name='SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType' kind='elementOnly'"
 * @generated
 */
public interface SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Subset Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subset Constraint</em>' containment reference.
	 * @see #setSubsetConstraint(SubsetConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType_SubsetConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SubsetConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	SubsetConstraintRef getSubsetConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType#getSubsetConstraint <em>Subset Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subset Constraint</em>' containment reference.
	 * @see #getSubsetConstraint()
	 * @generated
	 */
	void setSubsetConstraint(SubsetConstraintRef value);

} // SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType
