/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refinements Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RefinementsType#getNameGenerator <em>Name Generator</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRefinementsType()
 * @model extendedMetaData="name='Refinements_._type' kind='elementOnly'"
 * @generated
 */
public interface RefinementsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Generator</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Generator</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRefinementsType_NameGenerator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NameGenerator' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NameGeneratorType> getNameGenerator();

} // RefinementsType
