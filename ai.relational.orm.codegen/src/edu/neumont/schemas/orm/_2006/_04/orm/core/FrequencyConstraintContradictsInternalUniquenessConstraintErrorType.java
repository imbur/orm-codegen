/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frequency Constraint Contradicts Internal Uniqueness Constraint Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * (Deprecated by FrequencyConstraintViolatedByUniquenessConstraintErrorType) A frequency constraint requires more role players than are allowed by an internal uniqueness constraint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintContradictsInternalUniquenessConstraintErrorType#getFrequencyConstraint <em>Frequency Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintContradictsInternalUniquenessConstraintErrorType#getFact <em>Fact</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFrequencyConstraintContradictsInternalUniquenessConstraintErrorType()
 * @model extendedMetaData="name='FrequencyConstraintContradictsInternalUniquenessConstraintErrorType' kind='elementOnly'"
 * @generated
 */
public interface FrequencyConstraintContradictsInternalUniquenessConstraintErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Frequency Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Constraint</em>' containment reference.
	 * @see #setFrequencyConstraint(FrequencyConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFrequencyConstraintContradictsInternalUniquenessConstraintErrorType_FrequencyConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FrequencyConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	FrequencyConstraintRef getFrequencyConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintContradictsInternalUniquenessConstraintErrorType#getFrequencyConstraint <em>Frequency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Constraint</em>' containment reference.
	 * @see #getFrequencyConstraint()
	 * @generated
	 */
	void setFrequencyConstraint(FrequencyConstraintRef value);

	/**
	 * Returns the value of the '<em><b>Fact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact</em>' containment reference.
	 * @see #setFact(FactTypeRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFrequencyConstraintContradictsInternalUniquenessConstraintErrorType_Fact()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fact' namespace='##targetNamespace'"
	 * @generated
	 */
	FactTypeRef getFact();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintContradictsInternalUniquenessConstraintErrorType#getFact <em>Fact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact</em>' containment reference.
	 * @see #getFact()
	 * @generated
	 */
	void setFact(FactTypeRef value);

} // FrequencyConstraintContradictsInternalUniquenessConstraintErrorType
