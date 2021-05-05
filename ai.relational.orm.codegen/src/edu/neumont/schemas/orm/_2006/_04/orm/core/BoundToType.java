/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bound To Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.BoundToType#getPathedRole <em>Pathed Role</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.BoundToType#getPathRoot <em>Path Root</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getBoundToType()
 * @model extendedMetaData="name='BoundTo_._type' kind='elementOnly'"
 * @generated
 */
public interface BoundToType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pathed Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PathedRole associated with this parameter for this role path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pathed Role</em>' containment reference.
	 * @see #setPathedRole(PathedRoleRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getBoundToType_PathedRole()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PathedRole' namespace='##targetNamespace'"
	 * @generated
	 */
	PathedRoleRef getPathedRole();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.BoundToType#getPathedRole <em>Pathed Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pathed Role</em>' containment reference.
	 * @see #getPathedRole()
	 * @generated
	 */
	void setPathedRole(PathedRoleRef value);

	/**
	 * Returns the value of the '<em><b>Path Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PathRoot associated with this parameter for this role path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Root</em>' containment reference.
	 * @see #setPathRoot(RootObjectTypeRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getBoundToType_PathRoot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PathRoot' namespace='##targetNamespace'"
	 * @generated
	 */
	RootObjectTypeRef getPathRoot();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.BoundToType#getPathRoot <em>Path Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Root</em>' containment reference.
	 * @see #getPathRoot()
	 * @generated
	 */
	void setPathRoot(RootObjectTypeRef value);

} // BoundToType
