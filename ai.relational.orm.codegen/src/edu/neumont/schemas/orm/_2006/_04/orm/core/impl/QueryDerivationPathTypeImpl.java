/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DerivationProjectionsType1;
import edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationPathType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Derivation Path Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.QueryDerivationPathTypeImpl#getDerivationProjections <em>Derivation Projections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryDerivationPathTypeImpl extends RolePathOwnerTypeImpl implements QueryDerivationPathType {
	/**
	 * The cached value of the '{@link #getDerivationProjections() <em>Derivation Projections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationProjections()
	 * @generated
	 * @ordered
	 */
	protected DerivationProjectionsType1 derivationProjections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryDerivationPathTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getQueryDerivationPathType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationProjectionsType1 getDerivationProjections() {
		return derivationProjections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivationProjections(DerivationProjectionsType1 newDerivationProjections, NotificationChain msgs) {
		DerivationProjectionsType1 oldDerivationProjections = derivationProjections;
		derivationProjections = newDerivationProjections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_DERIVATION_PATH_TYPE__DERIVATION_PROJECTIONS, oldDerivationProjections, newDerivationProjections);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationProjections(DerivationProjectionsType1 newDerivationProjections) {
		if (newDerivationProjections != derivationProjections) {
			NotificationChain msgs = null;
			if (derivationProjections != null)
				msgs = ((InternalEObject)derivationProjections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_DERIVATION_PATH_TYPE__DERIVATION_PROJECTIONS, null, msgs);
			if (newDerivationProjections != null)
				msgs = ((InternalEObject)newDerivationProjections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_DERIVATION_PATH_TYPE__DERIVATION_PROJECTIONS, null, msgs);
			msgs = basicSetDerivationProjections(newDerivationProjections, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_DERIVATION_PATH_TYPE__DERIVATION_PROJECTIONS, newDerivationProjections, newDerivationProjections));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.QUERY_DERIVATION_PATH_TYPE__DERIVATION_PROJECTIONS:
				return basicSetDerivationProjections(null, msgs);
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
			case CorePackage.QUERY_DERIVATION_PATH_TYPE__DERIVATION_PROJECTIONS:
				return getDerivationProjections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.QUERY_DERIVATION_PATH_TYPE__DERIVATION_PROJECTIONS:
				setDerivationProjections((DerivationProjectionsType1)newValue);
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
			case CorePackage.QUERY_DERIVATION_PATH_TYPE__DERIVATION_PROJECTIONS:
				setDerivationProjections((DerivationProjectionsType1)null);
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
			case CorePackage.QUERY_DERIVATION_PATH_TYPE__DERIVATION_PROJECTIONS:
				return derivationProjections != null;
		}
		return super.eIsSet(featureID);
	}

} //QueryDerivationPathTypeImpl
