/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationPathType;
import edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationRuleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Derivation Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.QueryDerivationRuleTypeImpl#getQueryDerivationPath <em>Query Derivation Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryDerivationRuleTypeImpl extends MinimalEObjectImpl.Container implements QueryDerivationRuleType {
	/**
	 * The cached value of the '{@link #getQueryDerivationPath() <em>Query Derivation Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryDerivationPath()
	 * @generated
	 * @ordered
	 */
	protected QueryDerivationPathType queryDerivationPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryDerivationRuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getQueryDerivationRuleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryDerivationPathType getQueryDerivationPath() {
		return queryDerivationPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryDerivationPath(QueryDerivationPathType newQueryDerivationPath, NotificationChain msgs) {
		QueryDerivationPathType oldQueryDerivationPath = queryDerivationPath;
		queryDerivationPath = newQueryDerivationPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_DERIVATION_RULE_TYPE__QUERY_DERIVATION_PATH, oldQueryDerivationPath, newQueryDerivationPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryDerivationPath(QueryDerivationPathType newQueryDerivationPath) {
		if (newQueryDerivationPath != queryDerivationPath) {
			NotificationChain msgs = null;
			if (queryDerivationPath != null)
				msgs = ((InternalEObject)queryDerivationPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_DERIVATION_RULE_TYPE__QUERY_DERIVATION_PATH, null, msgs);
			if (newQueryDerivationPath != null)
				msgs = ((InternalEObject)newQueryDerivationPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_DERIVATION_RULE_TYPE__QUERY_DERIVATION_PATH, null, msgs);
			msgs = basicSetQueryDerivationPath(newQueryDerivationPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_DERIVATION_RULE_TYPE__QUERY_DERIVATION_PATH, newQueryDerivationPath, newQueryDerivationPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.QUERY_DERIVATION_RULE_TYPE__QUERY_DERIVATION_PATH:
				return basicSetQueryDerivationPath(null, msgs);
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
			case CorePackage.QUERY_DERIVATION_RULE_TYPE__QUERY_DERIVATION_PATH:
				return getQueryDerivationPath();
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
			case CorePackage.QUERY_DERIVATION_RULE_TYPE__QUERY_DERIVATION_PATH:
				setQueryDerivationPath((QueryDerivationPathType)newValue);
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
			case CorePackage.QUERY_DERIVATION_RULE_TYPE__QUERY_DERIVATION_PATH:
				setQueryDerivationPath((QueryDerivationPathType)null);
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
			case CorePackage.QUERY_DERIVATION_RULE_TYPE__QUERY_DERIVATION_PATH:
				return queryDerivationPath != null;
		}
		return super.eIsSet(featureID);
	}

} //QueryDerivationRuleTypeImpl
