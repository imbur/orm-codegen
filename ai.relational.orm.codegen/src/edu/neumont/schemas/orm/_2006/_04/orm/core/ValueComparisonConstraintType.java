/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Comparison Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A constraint specifying that a comparison between two related values must be satisfied.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonConstraintType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonConstraintType#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueComparisonConstraintType()
 * @model extendedMetaData="name='ValueComparisonConstraintType' kind='elementOnly'"
 * @generated
 */
public interface ValueComparisonConstraintType extends SetConstraintWithJoinType {
	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueComparisonConstraintType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonConstraintType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonOperatorValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonOperatorValues
	 * @see #isSetOperator()
	 * @see #unsetOperator()
	 * @see #setOperator(ValueComparisonOperatorValues)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueComparisonConstraintType_Operator()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='Operator'"
	 * @generated
	 */
	ValueComparisonOperatorValues getOperator();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonConstraintType#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonOperatorValues
	 * @see #isSetOperator()
	 * @see #unsetOperator()
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ValueComparisonOperatorValues value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonConstraintType#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperator()
	 * @see #getOperator()
	 * @see #setOperator(ValueComparisonOperatorValues)
	 * @generated
	 */
	void unsetOperator();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonConstraintType#getOperator <em>Operator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operator</em>' attribute is set.
	 * @see #unsetOperator()
	 * @see #getOperator()
	 * @see #setOperator(ValueComparisonOperatorValues)
	 * @generated
	 */
	boolean isSetOperator();

} // ValueComparisonConstraintType
