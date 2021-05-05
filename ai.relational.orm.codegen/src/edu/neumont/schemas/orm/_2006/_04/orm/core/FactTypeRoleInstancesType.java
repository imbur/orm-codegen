/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact Type Role Instances Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for the role instances associated with a fact instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRoleInstancesType#getFactTypeRoleInstance <em>Fact Type Role Instance</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeRoleInstancesType()
 * @model extendedMetaData="name='FactTypeRoleInstancesType' kind='elementOnly'"
 * @generated
 */
public interface FactTypeRoleInstancesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Fact Type Role Instance</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRoleInstanceRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type Role Instance</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeRoleInstancesType_FactTypeRoleInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FactTypeRoleInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObjectTypeRoleInstanceRef> getFactTypeRoleInstance();

} // FactTypeRoleInstancesType
