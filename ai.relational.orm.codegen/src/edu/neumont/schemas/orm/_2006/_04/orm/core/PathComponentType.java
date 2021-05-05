/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PathComponentType#getRolePath <em>Role Path</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathComponentType()
 * @model extendedMetaData="name='PathComponent_._type' kind='elementOnly'"
 * @generated
 */
public interface PathComponentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Role Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Path</em>' containment reference.
	 * @see #setRolePath(LeadRolePathType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathComponentType_RolePath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RolePath' namespace='##targetNamespace'"
	 * @generated
	 */
	LeadRolePathType getRolePath();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathComponentType#getRolePath <em>Role Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Path</em>' containment reference.
	 * @see #getRolePath()
	 * @generated
	 */
	void setRolePath(LeadRolePathType value);

} // PathComponentType
