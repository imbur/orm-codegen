/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frequency Constraint Min Max Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A frequency constraints maximum values is less that its minimum value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintMinMaxErrorType#getFrequencyConstraint <em>Frequency Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFrequencyConstraintMinMaxErrorType()
 * @model extendedMetaData="name='FrequencyConstraintMinMaxErrorType' kind='elementOnly'"
 * @generated
 */
public interface FrequencyConstraintMinMaxErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Frequency Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Constraint</em>' containment reference.
	 * @see #setFrequencyConstraint(FrequencyConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFrequencyConstraintMinMaxErrorType_FrequencyConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FrequencyConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	FrequencyConstraintRef getFrequencyConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintMinMaxErrorType#getFrequencyConstraint <em>Frequency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Constraint</em>' containment reference.
	 * @see #getFrequencyConstraint()
	 * @generated
	 */
	void setFrequencyConstraint(FrequencyConstraintRef value);

} // FrequencyConstraintMinMaxErrorType
