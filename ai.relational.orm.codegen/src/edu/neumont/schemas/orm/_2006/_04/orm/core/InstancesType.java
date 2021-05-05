/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instances Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.InstancesType#getValueTypeInstance <em>Value Type Instance</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getInstancesType()
 * @model extendedMetaData="name='Instances_._type' kind='elementOnly'"
 * @generated
 */
public interface InstancesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Type Instance</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ValueTypeInstanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Type Instance</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getInstancesType_ValueTypeInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValueTypeInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ValueTypeInstanceType> getValueTypeInstance();

} // InstancesType
