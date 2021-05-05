/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Role Sequences Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for constraint role sequences.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequencesType#getRoleSequence <em>Role Sequence</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintRoleSequencesType()
 * @model extendedMetaData="name='ConstraintRoleSequencesType' kind='elementOnly'"
 * @generated
 */
public interface ConstraintRoleSequencesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Role Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceWithJoinAndIdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Sequence</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintRoleSequencesType_RoleSequence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RoleSequence' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ConstraintRoleSequenceWithJoinAndIdType> getRoleSequence();

} // ConstraintRoleSequencesType
