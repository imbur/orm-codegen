/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.QueryType;
import edu.neumont.schemas.orm._2006._04.orm.core.SubqueriesType;
import edu.neumont.schemas.orm._2006._04.orm.core.SubqueryRef;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subqueries Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SubqueriesTypeImpl#getSubquery <em>Subquery</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SubqueriesTypeImpl#getSharedSubquery <em>Shared Subquery</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubqueriesTypeImpl extends MinimalEObjectImpl.Container implements SubqueriesType {
	/**
	 * The cached value of the '{@link #getSubquery() <em>Subquery</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubquery()
	 * @generated
	 * @ordered
	 */
	protected EList<QueryType> subquery;

	/**
	 * The cached value of the '{@link #getSharedSubquery() <em>Shared Subquery</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedSubquery()
	 * @generated
	 * @ordered
	 */
	protected EList<SubqueryRef> sharedSubquery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubqueriesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getSubqueriesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QueryType> getSubquery() {
		if (subquery == null) {
			subquery = new EObjectContainmentEList<QueryType>(QueryType.class, this, CorePackage.SUBQUERIES_TYPE__SUBQUERY);
		}
		return subquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubqueryRef> getSharedSubquery() {
		if (sharedSubquery == null) {
			sharedSubquery = new EObjectContainmentEList<SubqueryRef>(SubqueryRef.class, this, CorePackage.SUBQUERIES_TYPE__SHARED_SUBQUERY);
		}
		return sharedSubquery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SUBQUERIES_TYPE__SUBQUERY:
				return ((InternalEList<?>)getSubquery()).basicRemove(otherEnd, msgs);
			case CorePackage.SUBQUERIES_TYPE__SHARED_SUBQUERY:
				return ((InternalEList<?>)getSharedSubquery()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.SUBQUERIES_TYPE__SUBQUERY:
				return getSubquery();
			case CorePackage.SUBQUERIES_TYPE__SHARED_SUBQUERY:
				return getSharedSubquery();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.SUBQUERIES_TYPE__SUBQUERY:
				getSubquery().clear();
				getSubquery().addAll((Collection<? extends QueryType>)newValue);
				return;
			case CorePackage.SUBQUERIES_TYPE__SHARED_SUBQUERY:
				getSharedSubquery().clear();
				getSharedSubquery().addAll((Collection<? extends SubqueryRef>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.SUBQUERIES_TYPE__SUBQUERY:
				getSubquery().clear();
				return;
			case CorePackage.SUBQUERIES_TYPE__SHARED_SUBQUERY:
				getSharedSubquery().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.SUBQUERIES_TYPE__SUBQUERY:
				return subquery != null && !subquery.isEmpty();
			case CorePackage.SUBQUERIES_TYPE__SHARED_SUBQUERY:
				return sharedSubquery != null && !sharedSubquery.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubqueriesTypeImpl
