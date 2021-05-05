/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Duplicate Name Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Multiple groups share the same name.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupDuplicateNameErrorType#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getGroupDuplicateNameErrorType()
 * @model extendedMetaData="name='GroupDuplicateNameErrorType' kind='elementOnly'"
 * @generated
 */
public interface GroupDuplicateNameErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Link-named groups.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference.
	 * @see #setGroups(GroupsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getGroupDuplicateNameErrorType_Groups()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Groups' namespace='##targetNamespace'"
	 * @generated
	 */
	GroupsType getGroups();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.GroupDuplicateNameErrorType#getGroups <em>Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Groups</em>' containment reference.
	 * @see #getGroups()
	 * @generated
	 */
	void setGroups(GroupsType value);

} // GroupDuplicateNameErrorType
