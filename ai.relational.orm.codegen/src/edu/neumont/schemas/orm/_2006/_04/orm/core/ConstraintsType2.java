/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraints Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType2#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType2#getExclusionConstraintThatContradictsWithSubset <em>Exclusion Constraint That Contradicts With Subset</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType2#getSubsetConstraint <em>Subset Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintsType2()
 * @model extendedMetaData="name='Constraints_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface ConstraintsType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintsType2_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Exclusion Constraint That Contradicts With Subset</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.SetComparisonConstraintRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusion Constraint That Contradicts With Subset</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintsType2_ExclusionConstraintThatContradictsWithSubset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExclusionConstraintThatContradictsWithSubset' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SetComparisonConstraintRef> getExclusionConstraintThatContradictsWithSubset();

	/**
	 * Returns the value of the '<em><b>Subset Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.SetComparisonConstraintRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subset Constraint</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintsType2_SubsetConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubsetConstraint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SetComparisonConstraintRef> getSubsetConstraint();

} // ConstraintsType2
