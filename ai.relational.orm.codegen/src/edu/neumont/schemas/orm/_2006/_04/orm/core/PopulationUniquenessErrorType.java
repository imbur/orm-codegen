/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Population Uniqueness Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An instance is used twice by a role with a single-column uniqueness constraint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PopulationUniquenessErrorType#getRoleInstances <em>Role Instances</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPopulationUniquenessErrorType()
 * @model extendedMetaData="name='PopulationUniquenessErrorType' kind='elementOnly'"
 * @generated
 */
public interface PopulationUniquenessErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Role Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Conflicting role instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Instances</em>' containment reference.
	 * @see #setRoleInstances(RoleInstancesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPopulationUniquenessErrorType_RoleInstances()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RoleInstances' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleInstancesType getRoleInstances();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PopulationUniquenessErrorType#getRoleInstances <em>Role Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Instances</em>' containment reference.
	 * @see #getRoleInstances()
	 * @generated
	 */
	void setRoleInstances(RoleInstancesType value);

} // PopulationUniquenessErrorType
