/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DerivationExpressionStorageValues;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationExpressionType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fact Type Derivation Expression Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeDerivationExpressionTypeImpl#getDerivationStorage <em>Derivation Storage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactTypeDerivationExpressionTypeImpl extends DerivationExpressionTypeImpl implements FactTypeDerivationExpressionType {
	/**
	 * The default value of the '{@link #getDerivationStorage() <em>Derivation Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationStorage()
	 * @generated
	 * @ordered
	 */
	protected static final DerivationExpressionStorageValues DERIVATION_STORAGE_EDEFAULT = DerivationExpressionStorageValues.DERIVED;

	/**
	 * The cached value of the '{@link #getDerivationStorage() <em>Derivation Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationStorage()
	 * @generated
	 * @ordered
	 */
	protected DerivationExpressionStorageValues derivationStorage = DERIVATION_STORAGE_EDEFAULT;

	/**
	 * This is true if the Derivation Storage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean derivationStorageESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactTypeDerivationExpressionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getFactTypeDerivationExpressionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationExpressionStorageValues getDerivationStorage() {
		return derivationStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationStorage(DerivationExpressionStorageValues newDerivationStorage) {
		DerivationExpressionStorageValues oldDerivationStorage = derivationStorage;
		derivationStorage = newDerivationStorage == null ? DERIVATION_STORAGE_EDEFAULT : newDerivationStorage;
		boolean oldDerivationStorageESet = derivationStorageESet;
		derivationStorageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_DERIVATION_EXPRESSION_TYPE__DERIVATION_STORAGE, oldDerivationStorage, derivationStorage, !oldDerivationStorageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDerivationStorage() {
		DerivationExpressionStorageValues oldDerivationStorage = derivationStorage;
		boolean oldDerivationStorageESet = derivationStorageESet;
		derivationStorage = DERIVATION_STORAGE_EDEFAULT;
		derivationStorageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.FACT_TYPE_DERIVATION_EXPRESSION_TYPE__DERIVATION_STORAGE, oldDerivationStorage, DERIVATION_STORAGE_EDEFAULT, oldDerivationStorageESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.FACT_TYPE_DERIVATION_EXPRESSION_TYPE__DERIVATION_STORAGE:
				return getDerivationStorage();
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
			case CorePackage.FACT_TYPE_DERIVATION_EXPRESSION_TYPE__DERIVATION_STORAGE:
				setDerivationStorage((DerivationExpressionStorageValues)newValue);
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
			case CorePackage.FACT_TYPE_DERIVATION_EXPRESSION_TYPE__DERIVATION_STORAGE:
				unsetDerivationStorage();
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
			case CorePackage.FACT_TYPE_DERIVATION_EXPRESSION_TYPE__DERIVATION_STORAGE:
				return isSetDerivationStorage();
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
		result.append(" (derivationStorage: ");
		if (derivationStorageESet) result.append(derivationStorage); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FactTypeDerivationExpressionTypeImpl
