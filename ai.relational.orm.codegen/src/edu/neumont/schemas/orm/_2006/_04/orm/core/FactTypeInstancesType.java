/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact Type Instances Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for instances associated with a fact type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstancesType#getFactTypeInstance <em>Fact Type Instance</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeInstancesType()
 * @model extendedMetaData="name='FactTypeInstancesType' kind='elementOnly'"
 * @generated
 */
public interface FactTypeInstancesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Fact Type Instance</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type Instance</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeInstancesType_FactTypeInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FactTypeInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FactTypeInstanceType> getFactTypeInstance();

} // FactTypeInstancesType
