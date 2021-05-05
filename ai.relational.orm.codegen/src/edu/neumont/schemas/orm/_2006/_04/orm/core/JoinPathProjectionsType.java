/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Path Projections Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.JoinPathProjectionsType#getJoinPathProjection <em>Join Path Projection</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getJoinPathProjectionsType()
 * @model extendedMetaData="name='JoinPathProjections_._type' kind='elementOnly'"
 * @generated
 */
public interface JoinPathProjectionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Join Path Projection</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.JoinPathProjectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Path Projection</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getJoinPathProjectionsType_JoinPathProjection()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='JoinPathProjection' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<JoinPathProjectionType> getJoinPathProjection();

} // JoinPathProjectionsType
