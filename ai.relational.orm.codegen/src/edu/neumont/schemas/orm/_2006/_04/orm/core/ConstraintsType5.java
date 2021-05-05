/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints Type5</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for SetConstraints and SetComparisonConstraints.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType5#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType5#getEqualityConstraint <em>Equality Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType5#getExclusionConstraint <em>Exclusion Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType5#getSubsetConstraint <em>Subset Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType5#getFrequencyConstraint <em>Frequency Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType5#getMandatoryConstraint <em>Mandatory Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType5#getUniquenessConstraint <em>Uniqueness Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType5#getRingConstraint <em>Ring Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType5#getValueComparisonConstraint <em>Value Comparison Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintsType5()
 * @model extendedMetaData="name='ConstraintsType' kind='elementOnly'"
 * @generated
 */
public interface ConstraintsType5 extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintsType5_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Equality Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.EqualityConstraintType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Equality Constraint</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintsType5_EqualityConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EqualityConstraint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<EqualityConstraintType> getEqualityConstraint();

	/**
	 * Returns the value of the '<em><b>Exclusion Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ExclusionConstraintType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusion Constraint</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintsType5_ExclusionConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExclusionConstraint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ExclusionConstraintType> getExclusionConstraint();

	/**
	 * Returns the value of the '<em><b>Subset Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.SubsetConstraintType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subset Constraint</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintsType5_SubsetConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubsetConstraint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SubsetConstraintType> getSubsetConstraint();

	/**
	 * Returns the value of the '<em><b>Frequency Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Constraint</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintsType5_FrequencyConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FrequencyConstraint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FrequencyConstraintType> getFrequencyConstraint();

	/**
	 * Returns the value of the '<em><b>Mandatory Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Constraint</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintsType5_MandatoryConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MandatoryConstraint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MandatoryConstraintType> getMandatoryConstraint();

	/**
	 * Returns the value of the '<em><b>Uniqueness Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.UniquenessConstraintType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uniqueness Constraint</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintsType5_UniquenessConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UniquenessConstraint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<UniquenessConstraintType> getUniquenessConstraint();

	/**
	 * Returns the value of the '<em><b>Ring Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.RingConstraintType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ring Constraint</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintsType5_RingConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RingConstraint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RingConstraintType> getRingConstraint();

	/**
	 * Returns the value of the '<em><b>Value Comparison Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ValueComparisonConstraintType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Comparison Constraint</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintsType5_ValueComparisonConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueComparisonConstraint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ValueComparisonConstraintType> getValueComparisonConstraint();

} // ConstraintsType5
