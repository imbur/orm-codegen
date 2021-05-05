/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DerivationExpressionType;
import edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationPathType;
import edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationRuleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtype Derivation Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SubtypeDerivationRuleTypeImpl#getSubtypeDerivationExpression <em>Subtype Derivation Expression</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SubtypeDerivationRuleTypeImpl#getSubtypeDerivationPath <em>Subtype Derivation Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubtypeDerivationRuleTypeImpl extends MinimalEObjectImpl.Container implements SubtypeDerivationRuleType {
	/**
	 * The cached value of the '{@link #getSubtypeDerivationExpression() <em>Subtype Derivation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypeDerivationExpression()
	 * @generated
	 * @ordered
	 */
	protected DerivationExpressionType subtypeDerivationExpression;

	/**
	 * The cached value of the '{@link #getSubtypeDerivationPath() <em>Subtype Derivation Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypeDerivationPath()
	 * @generated
	 * @ordered
	 */
	protected SubtypeDerivationPathType subtypeDerivationPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtypeDerivationRuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getSubtypeDerivationRuleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationExpressionType getSubtypeDerivationExpression() {
		return subtypeDerivationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtypeDerivationExpression(DerivationExpressionType newSubtypeDerivationExpression, NotificationChain msgs) {
		DerivationExpressionType oldSubtypeDerivationExpression = subtypeDerivationExpression;
		subtypeDerivationExpression = newSubtypeDerivationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SUBTYPE_DERIVATION_RULE_TYPE__SUBTYPE_DERIVATION_EXPRESSION, oldSubtypeDerivationExpression, newSubtypeDerivationExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtypeDerivationExpression(DerivationExpressionType newSubtypeDerivationExpression) {
		if (newSubtypeDerivationExpression != subtypeDerivationExpression) {
			NotificationChain msgs = null;
			if (subtypeDerivationExpression != null)
				msgs = ((InternalEObject)subtypeDerivationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SUBTYPE_DERIVATION_RULE_TYPE__SUBTYPE_DERIVATION_EXPRESSION, null, msgs);
			if (newSubtypeDerivationExpression != null)
				msgs = ((InternalEObject)newSubtypeDerivationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SUBTYPE_DERIVATION_RULE_TYPE__SUBTYPE_DERIVATION_EXPRESSION, null, msgs);
			msgs = basicSetSubtypeDerivationExpression(newSubtypeDerivationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SUBTYPE_DERIVATION_RULE_TYPE__SUBTYPE_DERIVATION_EXPRESSION, newSubtypeDerivationExpression, newSubtypeDerivationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtypeDerivationPathType getSubtypeDerivationPath() {
		return subtypeDerivationPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtypeDerivationPath(SubtypeDerivationPathType newSubtypeDerivationPath, NotificationChain msgs) {
		SubtypeDerivationPathType oldSubtypeDerivationPath = subtypeDerivationPath;
		subtypeDerivationPath = newSubtypeDerivationPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SUBTYPE_DERIVATION_RULE_TYPE__SUBTYPE_DERIVATION_PATH, oldSubtypeDerivationPath, newSubtypeDerivationPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtypeDerivationPath(SubtypeDerivationPathType newSubtypeDerivationPath) {
		if (newSubtypeDerivationPath != subtypeDerivationPath) {
			NotificationChain msgs = null;
			if (subtypeDerivationPath != null)
				msgs = ((InternalEObject)subtypeDerivationPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SUBTYPE_DERIVATION_RULE_TYPE__SUBTYPE_DERIVATION_PATH, null, msgs);
			if (newSubtypeDerivationPath != null)
				msgs = ((InternalEObject)newSubtypeDerivationPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SUBTYPE_DERIVATION_RULE_TYPE__SUBTYPE_DERIVATION_PATH, null, msgs);
			msgs = basicSetSubtypeDerivationPath(newSubtypeDerivationPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SUBTYPE_DERIVATION_RULE_TYPE__SUBTYPE_DERIVATION_PATH, newSubtypeDerivationPath, newSubtypeDerivationPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SUBTYPE_DERIVATION_RULE_TYPE__SUBTYPE_DERIVATION_EXPRESSION:
				return basicSetSubtypeDerivationExpression(null, msgs);
			case CorePackage.SUBTYPE_DERIVATION_RULE_TYPE__SUBTYPE_DERIVATION_PATH:
				return basicSetSubtypeDerivationPath(null, msgs);
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
			case CorePackage.SUBTYPE_DERIVATION_RULE_TYPE__SUBTYPE_DERIVATION_EXPRESSION:
				return getSubtypeDerivationExpression();
			case CorePackage.SUBTYPE_DERIVATION_RULE_TYPE__SUBTYPE_DERIVATION_PATH:
				return getSubtypeDerivationPath();
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
			case CorePackage.SUBTYPE_DERIVATION_RULE_TYPE__SUBTYPE_DERIVATION_EXPRESSION:
				setSubtypeDerivationExpression((DerivationExpressionType)newValue);
				return;
			case CorePackage.SUBTYPE_DERIVATION_RULE_TYPE__SUBTYPE_DERIVATION_PATH:
				setSubtypeDerivationPath((SubtypeDerivationPathType)newValue);
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
			case CorePackage.SUBTYPE_DERIVATION_RULE_TYPE__SUBTYPE_DERIVATION_EXPRESSION:
				setSubtypeDerivationExpression((DerivationExpressionType)null);
				return;
			case CorePackage.SUBTYPE_DERIVATION_RULE_TYPE__SUBTYPE_DERIVATION_PATH:
				setSubtypeDerivationPath((SubtypeDerivationPathType)null);
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
			case CorePackage.SUBTYPE_DERIVATION_RULE_TYPE__SUBTYPE_DERIVATION_EXPRESSION:
				return subtypeDerivationExpression != null;
			case CorePackage.SUBTYPE_DERIVATION_RULE_TYPE__SUBTYPE_DERIVATION_PATH:
				return subtypeDerivationPath != null;
		}
		return super.eIsSet(featureID);
	}

} //SubtypeDerivationRuleTypeImpl
