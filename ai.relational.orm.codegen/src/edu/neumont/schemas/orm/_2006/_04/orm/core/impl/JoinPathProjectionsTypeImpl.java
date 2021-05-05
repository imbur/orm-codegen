/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.JoinPathProjectionType;
import edu.neumont.schemas.orm._2006._04.orm.core.JoinPathProjectionsType;

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
 * An implementation of the model object '<em><b>Join Path Projections Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.JoinPathProjectionsTypeImpl#getJoinPathProjection <em>Join Path Projection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinPathProjectionsTypeImpl extends MinimalEObjectImpl.Container implements JoinPathProjectionsType {
	/**
	 * The cached value of the '{@link #getJoinPathProjection() <em>Join Path Projection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinPathProjection()
	 * @generated
	 * @ordered
	 */
	protected EList<JoinPathProjectionType> joinPathProjection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinPathProjectionsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getJoinPathProjectionsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JoinPathProjectionType> getJoinPathProjection() {
		if (joinPathProjection == null) {
			joinPathProjection = new EObjectContainmentEList<JoinPathProjectionType>(JoinPathProjectionType.class, this, CorePackage.JOIN_PATH_PROJECTIONS_TYPE__JOIN_PATH_PROJECTION);
		}
		return joinPathProjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.JOIN_PATH_PROJECTIONS_TYPE__JOIN_PATH_PROJECTION:
				return ((InternalEList<?>)getJoinPathProjection()).basicRemove(otherEnd, msgs);
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
			case CorePackage.JOIN_PATH_PROJECTIONS_TYPE__JOIN_PATH_PROJECTION:
				return getJoinPathProjection();
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
			case CorePackage.JOIN_PATH_PROJECTIONS_TYPE__JOIN_PATH_PROJECTION:
				getJoinPathProjection().clear();
				getJoinPathProjection().addAll((Collection<? extends JoinPathProjectionType>)newValue);
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
			case CorePackage.JOIN_PATH_PROJECTIONS_TYPE__JOIN_PATH_PROJECTION:
				getJoinPathProjection().clear();
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
			case CorePackage.JOIN_PATH_PROJECTIONS_TYPE__JOIN_PATH_PROJECTION:
				return joinPathProjection != null && !joinPathProjection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JoinPathProjectionsTypeImpl
