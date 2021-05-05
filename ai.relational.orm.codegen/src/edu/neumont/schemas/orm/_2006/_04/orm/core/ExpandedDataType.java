/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expanded Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ExpandedDataType#getRoleText <em>Role Text</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ExpandedDataType#getFrontText <em>Front Text</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getExpandedDataType()
 * @model extendedMetaData="name='ExpandedData_._type' kind='elementOnly'"
 * @generated
 */
public interface ExpandedDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Role Text</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.RoleTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text bound to or occurring after a given role. Roles with no text are not represented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Text</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getExpandedDataType_RoleText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RoleText' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RoleTextType> getRoleText();

	/**
	 * Returns the value of the '<em><b>Front Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text that occurs before the lead role, including prebound text associated with that role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Front Text</em>' attribute.
	 * @see #setFrontText(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getExpandedDataType_FrontText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='FrontText'"
	 * @generated
	 */
	String getFrontText();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ExpandedDataType#getFrontText <em>Front Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Front Text</em>' attribute.
	 * @see #getFrontText()
	 * @generated
	 */
	void setFrontText(String value);

} // ExpandedDataType
