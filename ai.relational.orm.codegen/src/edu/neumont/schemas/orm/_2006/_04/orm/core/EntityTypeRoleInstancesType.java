/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type Role Instances Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for the role instances associated with an entity instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeRoleInstancesType#getEntityTypeRoleInstance <em>Entity Type Role Instance</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeRoleInstancesType()
 * @model extendedMetaData="name='EntityTypeRoleInstancesType' kind='elementOnly'"
 * @generated
 */
public interface EntityTypeRoleInstancesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity Type Role Instance</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRoleInstanceRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type Role Instance</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeRoleInstancesType_EntityTypeRoleInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EntityTypeRoleInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObjectTypeRoleInstanceRef> getEntityTypeRoleInstance();

} // EntityTypeRoleInstancesType
