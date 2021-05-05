/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compatible Role Player Type Error Type</b></em>'.
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
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleRolePlayerTypeErrorType#getSetComparisonConstraint <em>Set Comparison Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleRolePlayerTypeErrorType#getSetConstraint <em>Set Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleRolePlayerTypeErrorType#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCompatibleRolePlayerTypeErrorType()
 * @model extendedMetaData="name='CompatibleRolePlayerTypeErrorType' kind='elementOnly'"
 * @generated
 */
public interface CompatibleRolePlayerTypeErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Set Comparison Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Comparison Constraint</em>' containment reference.
	 * @see #setSetComparisonConstraint(SetComparisonConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCompatibleRolePlayerTypeErrorType_SetComparisonConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SetComparisonConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	SetComparisonConstraintRef getSetComparisonConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleRolePlayerTypeErrorType#getSetComparisonConstraint <em>Set Comparison Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Comparison Constraint</em>' containment reference.
	 * @see #getSetComparisonConstraint()
	 * @generated
	 */
	void setSetComparisonConstraint(SetComparisonConstraintRef value);

	/**
	 * Returns the value of the '<em><b>Set Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Constraint</em>' containment reference.
	 * @see #setSetConstraint(SetConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCompatibleRolePlayerTypeErrorType_SetConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SetConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	SetConstraintRef getSetConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleRolePlayerTypeErrorType#getSetConstraint <em>Set Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Constraint</em>' containment reference.
	 * @see #getSetConstraint()
	 * @generated
	 */
	void setSetConstraint(SetConstraintRef value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The zero-based column with incompatible types (specified with a SetComparisonConstraint).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #isSetColumn()
	 * @see #unsetColumn()
	 * @see #setColumn(int)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCompatibleRolePlayerTypeErrorType_Column()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='Column'"
	 * @generated
	 */
	int getColumn();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleRolePlayerTypeErrorType#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #isSetColumn()
	 * @see #unsetColumn()
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(int value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleRolePlayerTypeErrorType#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColumn()
	 * @see #getColumn()
	 * @see #setColumn(int)
	 * @generated
	 */
	void unsetColumn();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CompatibleRolePlayerTypeErrorType#getColumn <em>Column</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Column</em>' attribute is set.
	 * @see #unsetColumn()
	 * @see #getColumn()
	 * @see #setColumn(int)
	 * @generated
	 */
	boolean isSetColumn();

} // CompatibleRolePlayerTypeErrorType
