/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Population Mandatory Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The role player of the roles in a mandatory constraint has an instance that is not used by any of the roles.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PopulationMandatoryErrorType#getObjectTypeInstance <em>Object Type Instance</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PopulationMandatoryErrorType#getMandatoryConstraint <em>Mandatory Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPopulationMandatoryErrorType()
 * @model extendedMetaData="name='PopulationMandatoryErrorType' kind='elementOnly'"
 * @generated
 */
public interface PopulationMandatoryErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Object Type Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type Instance</em>' containment reference.
	 * @see #setObjectTypeInstance(ObjectTypeInstanceRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPopulationMandatoryErrorType_ObjectTypeInstance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ObjectTypeInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectTypeInstanceRef getObjectTypeInstance();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PopulationMandatoryErrorType#getObjectTypeInstance <em>Object Type Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Type Instance</em>' containment reference.
	 * @see #getObjectTypeInstance()
	 * @generated
	 */
	void setObjectTypeInstance(ObjectTypeInstanceRef value);

	/**
	 * Returns the value of the '<em><b>Mandatory Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Constraint</em>' containment reference.
	 * @see #setMandatoryConstraint(MandatoryConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPopulationMandatoryErrorType_MandatoryConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MandatoryConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	MandatoryConstraintRef getMandatoryConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PopulationMandatoryErrorType#getMandatoryConstraint <em>Mandatory Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory Constraint</em>' containment reference.
	 * @see #getMandatoryConstraint()
	 * @generated
	 */
	void setMandatoryConstraint(MandatoryConstraintRef value);

} // PopulationMandatoryErrorType
