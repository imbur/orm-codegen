/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DerivationProjectionsType1;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleBasedDerivationProjectionType;

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
 * An implementation of the model object '<em><b>Derivation Projections Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DerivationProjectionsType1Impl#getDerivationProjection <em>Derivation Projection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivationProjectionsType1Impl extends MinimalEObjectImpl.Container implements DerivationProjectionsType1 {
	/**
	 * The cached value of the '{@link #getDerivationProjection() <em>Derivation Projection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationProjection()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleBasedDerivationProjectionType> derivationProjection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivationProjectionsType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getDerivationProjectionsType1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleBasedDerivationProjectionType> getDerivationProjection() {
		if (derivationProjection == null) {
			derivationProjection = new EObjectContainmentEList<RoleBasedDerivationProjectionType>(RoleBasedDerivationProjectionType.class, this, CorePackage.DERIVATION_PROJECTIONS_TYPE1__DERIVATION_PROJECTION);
		}
		return derivationProjection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DERIVATION_PROJECTIONS_TYPE1__DERIVATION_PROJECTION:
				return ((InternalEList<?>)getDerivationProjection()).basicRemove(otherEnd, msgs);
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
			case CorePackage.DERIVATION_PROJECTIONS_TYPE1__DERIVATION_PROJECTION:
				return getDerivationProjection();
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
			case CorePackage.DERIVATION_PROJECTIONS_TYPE1__DERIVATION_PROJECTION:
				getDerivationProjection().clear();
				getDerivationProjection().addAll((Collection<? extends RoleBasedDerivationProjectionType>)newValue);
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
			case CorePackage.DERIVATION_PROJECTIONS_TYPE1__DERIVATION_PROJECTION:
				getDerivationProjection().clear();
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
			case CorePackage.DERIVATION_PROJECTIONS_TYPE1__DERIVATION_PROJECTION:
				return derivationProjection != null && !derivationProjection.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DerivationProjectionsType1Impl
