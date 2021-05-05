/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusion Contradicts Mandatory Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Exclusion and mandatory constraints defined on intersecting roles contradict.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ExclusionContradictsMandatoryErrorType#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getExclusionContradictsMandatoryErrorType()
 * @model extendedMetaData="name='ExclusionContradictsMandatoryErrorType' kind='elementOnly'"
 * @generated
 */
public interface ExclusionContradictsMandatoryErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contradictory constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(ConstraintsType4)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getExclusionContradictsMandatoryErrorType_Constraints()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Constraints' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintsType4 getConstraints();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ExclusionContradictsMandatoryErrorType#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(ConstraintsType4 value);

} // ExclusionContradictsMandatoryErrorType
