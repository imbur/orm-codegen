/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NMinus One Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An internal uniqueness constraint must span at least n minus one roles, where n is the number of roles in the fact type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.NMinusOneErrorType#getUniquenessConstraint <em>Uniqueness Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNMinusOneErrorType()
 * @model extendedMetaData="name='NMinusOneErrorType' kind='elementOnly'"
 * @generated
 */
public interface NMinusOneErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Uniqueness Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uniqueness Constraint</em>' containment reference.
	 * @see #setUniquenessConstraint(UniquenessConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNMinusOneErrorType_UniquenessConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='UniquenessConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	UniquenessConstraintRef getUniquenessConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.NMinusOneErrorType#getUniquenessConstraint <em>Uniqueness Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uniqueness Constraint</em>' containment reference.
	 * @see #getUniquenessConstraint()
	 * @generated
	 */
	void setUniquenessConstraint(UniquenessConstraintRef value);

} // NMinusOneErrorType
