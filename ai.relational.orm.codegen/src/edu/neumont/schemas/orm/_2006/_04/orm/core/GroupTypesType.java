/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Types Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for group types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupTypesType#getGroupTypeGroup <em>Group Type Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupTypesType#getGroupType <em>Group Type</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getGroupTypesType()
 * @model extendedMetaData="name='GroupTypesType' kind='elementOnly'"
 * @generated
 */
public interface GroupTypesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group Type Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Type Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getGroupTypesType_GroupTypeGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='GroupType:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getGroupTypeGroup();

	/**
	 * Returns the value of the '<em><b>Group Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.GroupTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getGroupTypesType_GroupType()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GroupType' namespace='##targetNamespace' group='GroupType:group'"
	 * @generated
	 */
	EList<GroupTypeType> getGroupType();

} // GroupTypesType
