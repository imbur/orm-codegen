/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Well Modeled Subset And Mandatory Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Subset and mandatory constraints on intersecting roles are incorrectly modeled.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.NotWellModeledSubsetAndMandatoryErrorType#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNotWellModeledSubsetAndMandatoryErrorType()
 * @model extendedMetaData="name='NotWellModeledSubsetAndMandatoryErrorType' kind='elementOnly'"
 * @generated
 */
public interface NotWellModeledSubsetAndMandatoryErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Conflicting constraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(ConstraintsType3)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNotWellModeledSubsetAndMandatoryErrorType_Constraints()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Constraints' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintsType3 getConstraints();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NotWellModeledSubsetAndMandatoryErrorType#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(ConstraintsType3 value);

} // NotWellModeledSubsetAndMandatoryErrorType
