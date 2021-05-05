/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType3#getMandatoryConstraint <em>Mandatory Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType3#getSubsetConstraint <em>Subset Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintsType3()
 * @model extendedMetaData="name='Constraints_._3_._type' kind='elementOnly'"
 * @generated
 */
public interface ConstraintsType3 extends EObject {
	/**
	 * Returns the value of the '<em><b>Mandatory Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Constraint</em>' containment reference.
	 * @see #setMandatoryConstraint(MandatoryConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintsType3_MandatoryConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MandatoryConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	MandatoryConstraintRef getMandatoryConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType3#getMandatoryConstraint <em>Mandatory Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory Constraint</em>' containment reference.
	 * @see #getMandatoryConstraint()
	 * @generated
	 */
	void setMandatoryConstraint(MandatoryConstraintRef value);

	/**
	 * Returns the value of the '<em><b>Subset Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subset Constraint</em>' containment reference.
	 * @see #setSubsetConstraint(SetComparisonConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintsType3_SubsetConstraint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SubsetConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	SetComparisonConstraintRef getSubsetConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType3#getSubsetConstraint <em>Subset Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subset Constraint</em>' containment reference.
	 * @see #getSubsetConstraint()
	 * @generated
	 */
	void setSubsetConstraint(SetComparisonConstraintRef value);

} // ConstraintsType3
