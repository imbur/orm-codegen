/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Note Referenced By Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference from a model note indicating a related element discussed by the note.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelNoteReferencedByType#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelNoteReferencedByType#getFactType <em>Fact Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelNoteReferencedByType#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelNoteReferencedByType#getSetConstraint <em>Set Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ModelNoteReferencedByType#getSetComparisonConstraint <em>Set Comparison Constraint</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelNoteReferencedByType()
 * @model extendedMetaData="name='ModelNoteReferencedByType' kind='elementOnly'"
 * @generated
 */
public interface ModelNoteReferencedByType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelNoteReferencedByType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Fact Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelNoteReferencedByType_FactType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FactType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FactTypeRef> getFactType();

	/**
	 * Returns the value of the '<em><b>Object Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelNoteReferencedByType_ObjectType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ObjectTypeRef> getObjectType();

	/**
	 * Returns the value of the '<em><b>Set Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.SetConstraintRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Constraint</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelNoteReferencedByType_SetConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SetConstraint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SetConstraintRef> getSetConstraint();

	/**
	 * Returns the value of the '<em><b>Set Comparison Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.SetComparisonConstraintRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Comparison Constraint</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getModelNoteReferencedByType_SetComparisonConstraint()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SetComparisonConstraint' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SetComparisonConstraintRef> getSetComparisonConstraint();

} // ModelNoteReferencedByType
