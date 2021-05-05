/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Paths Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubPathsType#getSubPath <em>Sub Path</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubPathsType()
 * @model extendedMetaData="name='SubPaths_._type' kind='elementOnly'"
 * @generated
 */
public interface SubPathsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Path</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.RoleSubPathType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Path</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubPathsType_SubPath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubPath' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RoleSubPathType> getSubPath();

} // SubPathsType
