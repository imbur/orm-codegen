/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DerivationSourceType;
import edu.neumont.schemas.orm._2006._04.orm.core.DerivedRoleProjectionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Role Projection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DerivedRoleProjectionTypeImpl#getDerivationSource <em>Derivation Source</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DerivedRoleProjectionTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DerivedRoleProjectionTypeImpl#isIsAutomatic <em>Is Automatic</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DerivedRoleProjectionTypeImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DerivedRoleProjectionTypeImpl extends MinimalEObjectImpl.Container implements DerivedRoleProjectionType {
	/**
	 * The cached value of the '{@link #getDerivationSource() <em>Derivation Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationSource()
	 * @generated
	 * @ordered
	 */
	protected DerivationSourceType derivationSource;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAutomatic() <em>Is Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutomatic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_AUTOMATIC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAutomatic() <em>Is Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAutomatic()
	 * @generated
	 * @ordered
	 */
	protected boolean isAutomatic = IS_AUTOMATIC_EDEFAULT;

	/**
	 * This is true if the Is Automatic attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isAutomaticESet;

	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedRoleProjectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getDerivedRoleProjectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationSourceType getDerivationSource() {
		return derivationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivationSource(DerivationSourceType newDerivationSource, NotificationChain msgs) {
		DerivationSourceType oldDerivationSource = derivationSource;
		derivationSource = newDerivationSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.DERIVED_ROLE_PROJECTION_TYPE__DERIVATION_SOURCE, oldDerivationSource, newDerivationSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationSource(DerivationSourceType newDerivationSource) {
		if (newDerivationSource != derivationSource) {
			NotificationChain msgs = null;
			if (derivationSource != null)
				msgs = ((InternalEObject)derivationSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.DERIVED_ROLE_PROJECTION_TYPE__DERIVATION_SOURCE, null, msgs);
			if (newDerivationSource != null)
				msgs = ((InternalEObject)newDerivationSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.DERIVED_ROLE_PROJECTION_TYPE__DERIVATION_SOURCE, null, msgs);
			msgs = basicSetDerivationSource(newDerivationSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DERIVED_ROLE_PROJECTION_TYPE__DERIVATION_SOURCE, newDerivationSource, newDerivationSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DERIVED_ROLE_PROJECTION_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAutomatic() {
		return isAutomatic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAutomatic(boolean newIsAutomatic) {
		boolean oldIsAutomatic = isAutomatic;
		isAutomatic = newIsAutomatic;
		boolean oldIsAutomaticESet = isAutomaticESet;
		isAutomaticESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DERIVED_ROLE_PROJECTION_TYPE__IS_AUTOMATIC, oldIsAutomatic, isAutomatic, !oldIsAutomaticESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsAutomatic() {
		boolean oldIsAutomatic = isAutomatic;
		boolean oldIsAutomaticESet = isAutomaticESet;
		isAutomatic = IS_AUTOMATIC_EDEFAULT;
		isAutomaticESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.DERIVED_ROLE_PROJECTION_TYPE__IS_AUTOMATIC, oldIsAutomatic, IS_AUTOMATIC_EDEFAULT, oldIsAutomaticESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsAutomatic() {
		return isAutomaticESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DERIVED_ROLE_PROJECTION_TYPE__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE__DERIVATION_SOURCE:
				return basicSetDerivationSource(null, msgs);
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
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE__DERIVATION_SOURCE:
				return getDerivationSource();
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE__ID:
				return getId();
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE__IS_AUTOMATIC:
				return isIsAutomatic();
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE__REF:
				return getRef();
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
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE__DERIVATION_SOURCE:
				setDerivationSource((DerivationSourceType)newValue);
				return;
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE__ID:
				setId((String)newValue);
				return;
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE__IS_AUTOMATIC:
				setIsAutomatic((Boolean)newValue);
				return;
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE__REF:
				setRef((String)newValue);
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
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE__DERIVATION_SOURCE:
				setDerivationSource((DerivationSourceType)null);
				return;
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE__IS_AUTOMATIC:
				unsetIsAutomatic();
				return;
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE__REF:
				setRef(REF_EDEFAULT);
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
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE__DERIVATION_SOURCE:
				return derivationSource != null;
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE__IS_AUTOMATIC:
				return isSetIsAutomatic();
			case CorePackage.DERIVED_ROLE_PROJECTION_TYPE__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", isAutomatic: ");
		if (isAutomaticESet) result.append(isAutomatic); else result.append("<unset>");
		result.append(", ref: ");
		result.append(ref);
		result.append(')');
		return result.toString();
	}

} //DerivedRoleProjectionTypeImpl
