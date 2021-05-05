/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationExpressionType;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationRuleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fact Type Derivation Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeDerivationRuleTypeImpl#getDerivationExpression <em>Derivation Expression</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeDerivationRuleTypeImpl#getFactTypeDerivationPath <em>Fact Type Derivation Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactTypeDerivationRuleTypeImpl extends MinimalEObjectImpl.Container implements FactTypeDerivationRuleType {
	/**
	 * The cached value of the '{@link #getDerivationExpression() <em>Derivation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationExpression()
	 * @generated
	 * @ordered
	 */
	protected FactTypeDerivationExpressionType derivationExpression;

	/**
	 * The cached value of the '{@link #getFactTypeDerivationPath() <em>Fact Type Derivation Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactTypeDerivationPath()
	 * @generated
	 * @ordered
	 */
	protected FactTypeDerivationPathType factTypeDerivationPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactTypeDerivationRuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getFactTypeDerivationRuleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeDerivationExpressionType getDerivationExpression() {
		return derivationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivationExpression(FactTypeDerivationExpressionType newDerivationExpression, NotificationChain msgs) {
		FactTypeDerivationExpressionType oldDerivationExpression = derivationExpression;
		derivationExpression = newDerivationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE__DERIVATION_EXPRESSION, oldDerivationExpression, newDerivationExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationExpression(FactTypeDerivationExpressionType newDerivationExpression) {
		if (newDerivationExpression != derivationExpression) {
			NotificationChain msgs = null;
			if (derivationExpression != null)
				msgs = ((InternalEObject)derivationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE__DERIVATION_EXPRESSION, null, msgs);
			if (newDerivationExpression != null)
				msgs = ((InternalEObject)newDerivationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE__DERIVATION_EXPRESSION, null, msgs);
			msgs = basicSetDerivationExpression(newDerivationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE__DERIVATION_EXPRESSION, newDerivationExpression, newDerivationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeDerivationPathType getFactTypeDerivationPath() {
		return factTypeDerivationPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactTypeDerivationPath(FactTypeDerivationPathType newFactTypeDerivationPath, NotificationChain msgs) {
		FactTypeDerivationPathType oldFactTypeDerivationPath = factTypeDerivationPath;
		factTypeDerivationPath = newFactTypeDerivationPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE__FACT_TYPE_DERIVATION_PATH, oldFactTypeDerivationPath, newFactTypeDerivationPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactTypeDerivationPath(FactTypeDerivationPathType newFactTypeDerivationPath) {
		if (newFactTypeDerivationPath != factTypeDerivationPath) {
			NotificationChain msgs = null;
			if (factTypeDerivationPath != null)
				msgs = ((InternalEObject)factTypeDerivationPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE__FACT_TYPE_DERIVATION_PATH, null, msgs);
			if (newFactTypeDerivationPath != null)
				msgs = ((InternalEObject)newFactTypeDerivationPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE__FACT_TYPE_DERIVATION_PATH, null, msgs);
			msgs = basicSetFactTypeDerivationPath(newFactTypeDerivationPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE__FACT_TYPE_DERIVATION_PATH, newFactTypeDerivationPath, newFactTypeDerivationPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE__DERIVATION_EXPRESSION:
				return basicSetDerivationExpression(null, msgs);
			case CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE__FACT_TYPE_DERIVATION_PATH:
				return basicSetFactTypeDerivationPath(null, msgs);
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
			case CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE__DERIVATION_EXPRESSION:
				return getDerivationExpression();
			case CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE__FACT_TYPE_DERIVATION_PATH:
				return getFactTypeDerivationPath();
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
			case CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE__DERIVATION_EXPRESSION:
				setDerivationExpression((FactTypeDerivationExpressionType)newValue);
				return;
			case CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE__FACT_TYPE_DERIVATION_PATH:
				setFactTypeDerivationPath((FactTypeDerivationPathType)newValue);
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
			case CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE__DERIVATION_EXPRESSION:
				setDerivationExpression((FactTypeDerivationExpressionType)null);
				return;
			case CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE__FACT_TYPE_DERIVATION_PATH:
				setFactTypeDerivationPath((FactTypeDerivationPathType)null);
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
			case CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE__DERIVATION_EXPRESSION:
				return derivationExpression != null;
			case CorePackage.FACT_TYPE_DERIVATION_RULE_TYPE__FACT_TYPE_DERIVATION_PATH:
				return factTypeDerivationPath != null;
		}
		return super.eIsSet(featureID);
	}

} //FactTypeDerivationRuleTypeImpl
