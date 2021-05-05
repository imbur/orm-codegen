/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Unifiers Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifiersType#getObjectUnifier <em>Object Unifier</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectUnifiersType()
 * @model extendedMetaData="name='ObjectUnifiers_._type' kind='elementOnly'"
 * @generated
 */
public interface ObjectUnifiersType extends EObject {
	/**
	 * Returns the value of the '<em><b>Object Unifier</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifierType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Unifier</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectUnifiersType_ObjectUnifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObjectUnifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ObjectUnifierType> getObjectUnifier();

} // ObjectUnifiersType
