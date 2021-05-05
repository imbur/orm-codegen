/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DerivationCompletenessValues;
import edu.neumont.schemas.orm._2006._04.orm.core.DerivationStorageValues;
import edu.neumont.schemas.orm._2006._04.orm.core.InformalDerivationRuleType;
import edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationPathType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtype Derivation Path Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SubtypeDerivationPathTypeImpl#getInformalRule <em>Informal Rule</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SubtypeDerivationPathTypeImpl#getDerivationCompleteness <em>Derivation Completeness</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SubtypeDerivationPathTypeImpl#getDerivationStorage <em>Derivation Storage</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SubtypeDerivationPathTypeImpl#isExternalDerivation <em>External Derivation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubtypeDerivationPathTypeImpl extends RolePathOwnerTypeImpl implements SubtypeDerivationPathType {
	/**
	 * The cached value of the '{@link #getInformalRule() <em>Informal Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformalRule()
	 * @generated
	 * @ordered
	 */
	protected InformalDerivationRuleType informalRule;

	/**
	 * The default value of the '{@link #getDerivationCompleteness() <em>Derivation Completeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationCompleteness()
	 * @generated
	 * @ordered
	 */
	protected static final DerivationCompletenessValues DERIVATION_COMPLETENESS_EDEFAULT = DerivationCompletenessValues.FULLY_DERIVED;

	/**
	 * The cached value of the '{@link #getDerivationCompleteness() <em>Derivation Completeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationCompleteness()
	 * @generated
	 * @ordered
	 */
	protected DerivationCompletenessValues derivationCompleteness = DERIVATION_COMPLETENESS_EDEFAULT;

	/**
	 * This is true if the Derivation Completeness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean derivationCompletenessESet;

	/**
	 * The default value of the '{@link #getDerivationStorage() <em>Derivation Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationStorage()
	 * @generated
	 * @ordered
	 */
	protected static final DerivationStorageValues DERIVATION_STORAGE_EDEFAULT = DerivationStorageValues.NOT_STORED;

	/**
	 * The cached value of the '{@link #getDerivationStorage() <em>Derivation Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationStorage()
	 * @generated
	 * @ordered
	 */
	protected DerivationStorageValues derivationStorage = DERIVATION_STORAGE_EDEFAULT;

	/**
	 * This is true if the Derivation Storage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean derivationStorageESet;

	/**
	 * The default value of the '{@link #isExternalDerivation() <em>External Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalDerivation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_DERIVATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternalDerivation() <em>External Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalDerivation()
	 * @generated
	 * @ordered
	 */
	protected boolean externalDerivation = EXTERNAL_DERIVATION_EDEFAULT;

	/**
	 * This is true if the External Derivation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean externalDerivationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtypeDerivationPathTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getSubtypeDerivationPathType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformalDerivationRuleType getInformalRule() {
		return informalRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformalRule(InformalDerivationRuleType newInformalRule, NotificationChain msgs) {
		InformalDerivationRuleType oldInformalRule = informalRule;
		informalRule = newInformalRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__INFORMAL_RULE, oldInformalRule, newInformalRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformalRule(InformalDerivationRuleType newInformalRule) {
		if (newInformalRule != informalRule) {
			NotificationChain msgs = null;
			if (informalRule != null)
				msgs = ((InternalEObject)informalRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__INFORMAL_RULE, null, msgs);
			if (newInformalRule != null)
				msgs = ((InternalEObject)newInformalRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__INFORMAL_RULE, null, msgs);
			msgs = basicSetInformalRule(newInformalRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__INFORMAL_RULE, newInformalRule, newInformalRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationCompletenessValues getDerivationCompleteness() {
		return derivationCompleteness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationCompleteness(DerivationCompletenessValues newDerivationCompleteness) {
		DerivationCompletenessValues oldDerivationCompleteness = derivationCompleteness;
		derivationCompleteness = newDerivationCompleteness == null ? DERIVATION_COMPLETENESS_EDEFAULT : newDerivationCompleteness;
		boolean oldDerivationCompletenessESet = derivationCompletenessESet;
		derivationCompletenessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__DERIVATION_COMPLETENESS, oldDerivationCompleteness, derivationCompleteness, !oldDerivationCompletenessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDerivationCompleteness() {
		DerivationCompletenessValues oldDerivationCompleteness = derivationCompleteness;
		boolean oldDerivationCompletenessESet = derivationCompletenessESet;
		derivationCompleteness = DERIVATION_COMPLETENESS_EDEFAULT;
		derivationCompletenessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__DERIVATION_COMPLETENESS, oldDerivationCompleteness, DERIVATION_COMPLETENESS_EDEFAULT, oldDerivationCompletenessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDerivationCompleteness() {
		return derivationCompletenessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationStorageValues getDerivationStorage() {
		return derivationStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationStorage(DerivationStorageValues newDerivationStorage) {
		DerivationStorageValues oldDerivationStorage = derivationStorage;
		derivationStorage = newDerivationStorage == null ? DERIVATION_STORAGE_EDEFAULT : newDerivationStorage;
		boolean oldDerivationStorageESet = derivationStorageESet;
		derivationStorageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__DERIVATION_STORAGE, oldDerivationStorage, derivationStorage, !oldDerivationStorageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDerivationStorage() {
		DerivationStorageValues oldDerivationStorage = derivationStorage;
		boolean oldDerivationStorageESet = derivationStorageESet;
		derivationStorage = DERIVATION_STORAGE_EDEFAULT;
		derivationStorageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__DERIVATION_STORAGE, oldDerivationStorage, DERIVATION_STORAGE_EDEFAULT, oldDerivationStorageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDerivationStorage() {
		return derivationStorageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExternalDerivation() {
		return externalDerivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalDerivation(boolean newExternalDerivation) {
		boolean oldExternalDerivation = externalDerivation;
		externalDerivation = newExternalDerivation;
		boolean oldExternalDerivationESet = externalDerivationESet;
		externalDerivationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__EXTERNAL_DERIVATION, oldExternalDerivation, externalDerivation, !oldExternalDerivationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExternalDerivation() {
		boolean oldExternalDerivation = externalDerivation;
		boolean oldExternalDerivationESet = externalDerivationESet;
		externalDerivation = EXTERNAL_DERIVATION_EDEFAULT;
		externalDerivationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__EXTERNAL_DERIVATION, oldExternalDerivation, EXTERNAL_DERIVATION_EDEFAULT, oldExternalDerivationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExternalDerivation() {
		return externalDerivationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__INFORMAL_RULE:
				return basicSetInformalRule(null, msgs);
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
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__INFORMAL_RULE:
				return getInformalRule();
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__DERIVATION_COMPLETENESS:
				return getDerivationCompleteness();
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__DERIVATION_STORAGE:
				return getDerivationStorage();
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__EXTERNAL_DERIVATION:
				return isExternalDerivation();
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
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__INFORMAL_RULE:
				setInformalRule((InformalDerivationRuleType)newValue);
				return;
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__DERIVATION_COMPLETENESS:
				setDerivationCompleteness((DerivationCompletenessValues)newValue);
				return;
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__DERIVATION_STORAGE:
				setDerivationStorage((DerivationStorageValues)newValue);
				return;
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__EXTERNAL_DERIVATION:
				setExternalDerivation((Boolean)newValue);
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
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__INFORMAL_RULE:
				setInformalRule((InformalDerivationRuleType)null);
				return;
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__DERIVATION_COMPLETENESS:
				unsetDerivationCompleteness();
				return;
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__DERIVATION_STORAGE:
				unsetDerivationStorage();
				return;
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__EXTERNAL_DERIVATION:
				unsetExternalDerivation();
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
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__INFORMAL_RULE:
				return informalRule != null;
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__DERIVATION_COMPLETENESS:
				return isSetDerivationCompleteness();
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__DERIVATION_STORAGE:
				return isSetDerivationStorage();
			case CorePackage.SUBTYPE_DERIVATION_PATH_TYPE__EXTERNAL_DERIVATION:
				return isSetExternalDerivation();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (derivationCompleteness: ");
		if (derivationCompletenessESet) result.append(derivationCompleteness); else result.append("<unset>");
		result.append(", derivationStorage: ");
		if (derivationStorageESet) result.append(derivationStorage); else result.append("<unset>");
		result.append(", externalDerivation: ");
		if (externalDerivationESet) result.append(externalDerivation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SubtypeDerivationPathTypeImpl
