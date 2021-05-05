/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Components Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PathComponentsType#getRolePath <em>Role Path</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PathComponentsType#getSharedRolePath <em>Shared Role Path</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathComponentsType()
 * @model extendedMetaData="name='PathComponents_._type' kind='elementOnly'"
 * @generated
 */
public interface PathComponentsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Role Path</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Path</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathComponentsType_RolePath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RolePath' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LeadRolePathType> getRolePath();

	/**
	 * Returns the value of the '<em><b>Shared Role Path</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Role Path</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathComponentsType_SharedRolePath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SharedRolePath' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LeadRolePathRef> getSharedRolePath();

} // PathComponentsType
