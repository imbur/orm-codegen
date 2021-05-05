/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DerivationExpressionType;
import edu.neumont.schemas.orm._2006._04.orm.core.InformalDerivationRuleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Informal Derivation Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.InformalDerivationRuleTypeImpl#getDerivationNote <em>Derivation Note</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformalDerivationRuleTypeImpl extends MinimalEObjectImpl.Container implements InformalDerivationRuleType {
	/**
	 * The cached value of the '{@link #getDerivationNote() <em>Derivation Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationNote()
	 * @generated
	 * @ordered
	 */
	protected DerivationExpressionType derivationNote;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformalDerivationRuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getInformalDerivationRuleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationExpressionType getDerivationNote() {
		return derivationNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivationNote(DerivationExpressionType newDerivationNote, NotificationChain msgs) {
		DerivationExpressionType oldDerivationNote = derivationNote;
		derivationNote = newDerivationNote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.INFORMAL_DERIVATION_RULE_TYPE__DERIVATION_NOTE, oldDerivationNote, newDerivationNote);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationNote(DerivationExpressionType newDerivationNote) {
		if (newDerivationNote != derivationNote) {
			NotificationChain msgs = null;
			if (derivationNote != null)
				msgs = ((InternalEObject)derivationNote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.INFORMAL_DERIVATION_RULE_TYPE__DERIVATION_NOTE, null, msgs);
			if (newDerivationNote != null)
				msgs = ((InternalEObject)newDerivationNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.INFORMAL_DERIVATION_RULE_TYPE__DERIVATION_NOTE, null, msgs);
			msgs = basicSetDerivationNote(newDerivationNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.INFORMAL_DERIVATION_RULE_TYPE__DERIVATION_NOTE, newDerivationNote, newDerivationNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.INFORMAL_DERIVATION_RULE_TYPE__DERIVATION_NOTE:
				return basicSetDerivationNote(null, msgs);
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
			case CorePackage.INFORMAL_DERIVATION_RULE_TYPE__DERIVATION_NOTE:
				return getDerivationNote();
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
			case CorePackage.INFORMAL_DERIVATION_RULE_TYPE__DERIVATION_NOTE:
				setDerivationNote((DerivationExpressionType)newValue);
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
			case CorePackage.INFORMAL_DERIVATION_RULE_TYPE__DERIVATION_NOTE:
				setDerivationNote((DerivationExpressionType)null);
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
			case CorePackage.INFORMAL_DERIVATION_RULE_TYPE__DERIVATION_NOTE:
				return derivationNote != null;
		}
		return super.eIsSet(featureID);
	}

} //InformalDerivationRuleTypeImpl
