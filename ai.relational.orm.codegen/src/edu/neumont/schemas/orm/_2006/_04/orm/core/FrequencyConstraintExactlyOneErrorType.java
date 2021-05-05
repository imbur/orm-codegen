/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frequency Constraint Exactly One Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A frequency constraint with a minimum and maximum range of 1 should be represented by a uniqueness constraint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintExactlyOneErrorType#getFrequencyConstraint <em>Frequency Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFrequencyConstraintExactlyOneErrorType()
 * @model extendedMetaData="name='FrequencyConstraintExactlyOneErrorType' kind='elementOnly'"
 * @generated
 */
public interface FrequencyConstraintExactlyOneErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Frequency Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Constraint</em>' containment reference.
	 * @see #setFrequencyConstraint(FrequencyConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFrequencyConstraintExactlyOneErrorType_FrequencyConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FrequencyConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	FrequencyConstraintRef getFrequencyConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintExactlyOneErrorType#getFrequencyConstraint <em>Frequency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Constraint</em>' containment reference.
	 * @see #getFrequencyConstraint()
	 * @generated
	 */
	void setFrequencyConstraint(FrequencyConstraintRef value);

} // FrequencyConstraintExactlyOneErrorType
