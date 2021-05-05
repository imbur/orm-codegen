/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusion Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A constraint specifying that two set populations must not be equal.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ExclusionConstraintType#getExclusiveOrMandatoryConstraint <em>Exclusive Or Mandatory Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ExclusionConstraintType#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getExclusionConstraintType()
 * @model extendedMetaData="name='ExclusionConstraintType' kind='elementOnly'"
 * @generated
 */
public interface ExclusionConstraintType extends SetComparisonConstraintType {
	/**
	 * Returns the value of the '<em><b>Exclusive Or Mandatory Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive Or Mandatory Constraint</em>' containment reference.
	 * @see #setExclusiveOrMandatoryConstraint(MandatoryConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getExclusionConstraintType_ExclusiveOrMandatoryConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExclusiveOrMandatoryConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	MandatoryConstraintRef getExclusiveOrMandatoryConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ExclusionConstraintType#getExclusiveOrMandatoryConstraint <em>Exclusive Or Mandatory Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Or Mandatory Constraint</em>' containment reference.
	 * @see #getExclusiveOrMandatoryConstraint()
	 * @generated
	 */
	void setExclusiveOrMandatoryConstraint(MandatoryConstraintRef value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getExclusionConstraintType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ExclusionConstraintType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

} // ExclusionConstraintType
