/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Groups Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for groups whose elements are included or excluded from the containing group.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.NestedGroupsType#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.NestedGroupsType#getIncludedGroup <em>Included Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.NestedGroupsType#getExcludedGroup <em>Excluded Group</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNestedGroupsType()
 * @model extendedMetaData="name='NestedGroupsType' kind='elementOnly'"
 * @generated
 */
public interface NestedGroupsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNestedGroupsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Included Group</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.GroupRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All included elements from the referenced group are included in the containing group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Included Group</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNestedGroupsType_IncludedGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='IncludedGroup' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GroupRef> getIncludedGroup();

	/**
	 * Returns the value of the '<em><b>Excluded Group</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.GroupRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All included elements from the referenced group are excluded from the containing group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Excluded Group</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getNestedGroupsType_ExcludedGroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExcludedGroup' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GroupRef> getExcludedGroup();

} // NestedGroupsType
