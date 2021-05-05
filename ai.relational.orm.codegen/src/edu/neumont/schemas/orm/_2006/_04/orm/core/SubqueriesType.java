/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subqueries Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubqueriesType#getSubquery <em>Subquery</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubqueriesType#getSharedSubquery <em>Shared Subquery</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubqueriesType()
 * @model extendedMetaData="name='Subqueries_._type' kind='elementOnly'"
 * @generated
 */
public interface SubqueriesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Subquery</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.QueryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subquery</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubqueriesType_Subquery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Subquery' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QueryType> getSubquery();

	/**
	 * Returns the value of the '<em><b>Shared Subquery</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.SubqueryRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Subquery</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubqueriesType_SharedSubquery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SharedSubquery' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SubqueryRef> getSharedSubquery();

} // SubqueriesType
