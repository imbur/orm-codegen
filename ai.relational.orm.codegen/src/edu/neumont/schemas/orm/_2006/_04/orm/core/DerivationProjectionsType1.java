/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derivation Projections Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivationProjectionsType1#getDerivationProjection <em>Derivation Projection</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDerivationProjectionsType1()
 * @model extendedMetaData="name='DerivationProjections_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface DerivationProjectionsType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Derivation Projection</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBasedDerivationProjectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation Projection</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDerivationProjectionsType1_DerivationProjection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DerivationProjection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RoleBasedDerivationProjectionType> getDerivationProjection();

} // DerivationProjectionsType1
