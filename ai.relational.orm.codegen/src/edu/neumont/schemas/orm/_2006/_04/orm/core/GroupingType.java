/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grouping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * User-defined and rule-based element groupings.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupingType#getORMModel <em>ORM Model</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupingType#getGroups <em>Groups</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupingType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getGroupingType()
 * @model extendedMetaData="name='GroupingType' kind='elementOnly'"
 * @generated
 */
public interface GroupingType extends EObject {
	/**
	 * Returns the value of the '<em><b>ORM Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ORMModel element associated with these groups.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ORM Model</em>' containment reference.
	 * @see #setORMModel(ORMModelRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getGroupingType_ORMModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ORMModel' namespace='##targetNamespace'"
	 * @generated
	 */
	ORMModelRef getORMModel();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupingType#getORMModel <em>ORM Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ORM Model</em>' containment reference.
	 * @see #getORMModel()
	 * @generated
	 */
	void setORMModel(ORMModelRef value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference.
	 * @see #setGroups(GroupsType1)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getGroupingType_Groups()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Groups' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupsType1 getGroups();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupingType#getGroups <em>Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groups</em>' containment reference.
	 * @see #getGroups()
	 * @generated
	 */
	void setGroups(GroupsType1 value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getGroupingType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupingType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // GroupingType
