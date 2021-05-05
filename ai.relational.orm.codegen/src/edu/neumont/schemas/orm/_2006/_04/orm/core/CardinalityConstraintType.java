/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A constraint limiting the number of instances in a population.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CardinalityConstraintType#getRanges <em>Ranges</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CardinalityConstraintType#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCardinalityConstraintType()
 * @model extendedMetaData="name='CardinalityConstraintType' kind='elementOnly'"
 * @generated
 */
public interface CardinalityConstraintType extends ConstraintType {
	/**
	 * Returns the value of the '<em><b>Ranges</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ranges</em>' containment reference.
	 * @see #setRanges(CardinalityRangesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCardinalityConstraintType_Ranges()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ranges' namespace='##targetNamespace'"
	 * @generated
	 */
	CardinalityRangesType getRanges();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CardinalityConstraintType#getRanges <em>Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ranges</em>' containment reference.
	 * @see #getRanges()
	 * @generated
	 */
	void setRanges(CardinalityRangesType value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCardinalityConstraintType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CardinalityConstraintType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

} // CardinalityConstraintType
