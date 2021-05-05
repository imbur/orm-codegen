/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type Instances Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for instances associated with an entity type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeInstancesType#getEntityTypeInstance <em>Entity Type Instance</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeInstancesType#getEntityTypeSubtypeInstance <em>Entity Type Subtype Instance</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeInstancesType()
 * @model extendedMetaData="name='EntityTypeInstancesType' kind='elementOnly'"
 * @generated
 */
public interface EntityTypeInstancesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Entity Type Instance</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeInstanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type Instance</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeInstancesType_EntityTypeInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EntityTypeInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityTypeInstanceType> getEntityTypeInstance();

	/**
	 * Returns the value of the '<em><b>Entity Type Subtype Instance</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeSubtypeInstanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity Type Subtype Instance</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeInstancesType_EntityTypeSubtypeInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EntityTypeSubtypeInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EntityTypeSubtypeInstanceType> getEntityTypeSubtypeInstance();

} // EntityTypeInstancesType
