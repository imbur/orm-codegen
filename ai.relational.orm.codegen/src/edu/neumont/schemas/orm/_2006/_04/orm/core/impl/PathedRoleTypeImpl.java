/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.PathConditionRoleValueRestrictionType;
import edu.neumont.schemas.orm._2006._04.orm.core.PathedRolePurposeType;
import edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleRef;
import edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pathed Role Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PathedRoleTypeImpl#getValueRestriction <em>Value Restriction</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PathedRoleTypeImpl#getCorrelatedWith <em>Correlated With</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PathedRoleTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PathedRoleTypeImpl#isIsNegated <em>Is Negated</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PathedRoleTypeImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PathedRoleTypeImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathedRoleTypeImpl extends MinimalEObjectImpl.Container implements PathedRoleType {
	/**
	 * The cached value of the '{@link #getValueRestriction() <em>Value Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRestriction()
	 * @generated
	 * @ordered
	 */
	protected PathConditionRoleValueRestrictionType valueRestriction;

	/**
	 * The cached value of the '{@link #getCorrelatedWith() <em>Correlated With</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelatedWith()
	 * @generated
	 * @ordered
	 */
	protected PathedRoleRef correlatedWith;

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
	 * The default value of the '{@link #isIsNegated() <em>Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNegated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NEGATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNegated() <em>Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNegated()
	 * @generated
	 * @ordered
	 */
	protected boolean isNegated = IS_NEGATED_EDEFAULT;

	/**
	 * This is true if the Is Negated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isNegatedESet;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final PathedRolePurposeType PURPOSE_EDEFAULT = PathedRolePurposeType.START_ROLE;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected PathedRolePurposeType purpose = PURPOSE_EDEFAULT;

	/**
	 * This is true if the Purpose attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean purposeESet;

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
	protected PathedRoleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getPathedRoleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathConditionRoleValueRestrictionType getValueRestriction() {
		return valueRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueRestriction(PathConditionRoleValueRestrictionType newValueRestriction, NotificationChain msgs) {
		PathConditionRoleValueRestrictionType oldValueRestriction = valueRestriction;
		valueRestriction = newValueRestriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.PATHED_ROLE_TYPE__VALUE_RESTRICTION, oldValueRestriction, newValueRestriction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueRestriction(PathConditionRoleValueRestrictionType newValueRestriction) {
		if (newValueRestriction != valueRestriction) {
			NotificationChain msgs = null;
			if (valueRestriction != null)
				msgs = ((InternalEObject)valueRestriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.PATHED_ROLE_TYPE__VALUE_RESTRICTION, null, msgs);
			if (newValueRestriction != null)
				msgs = ((InternalEObject)newValueRestriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.PATHED_ROLE_TYPE__VALUE_RESTRICTION, null, msgs);
			msgs = basicSetValueRestriction(newValueRestriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PATHED_ROLE_TYPE__VALUE_RESTRICTION, newValueRestriction, newValueRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathedRoleRef getCorrelatedWith() {
		return correlatedWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelatedWith(PathedRoleRef newCorrelatedWith, NotificationChain msgs) {
		PathedRoleRef oldCorrelatedWith = correlatedWith;
		correlatedWith = newCorrelatedWith;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.PATHED_ROLE_TYPE__CORRELATED_WITH, oldCorrelatedWith, newCorrelatedWith);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelatedWith(PathedRoleRef newCorrelatedWith) {
		if (newCorrelatedWith != correlatedWith) {
			NotificationChain msgs = null;
			if (correlatedWith != null)
				msgs = ((InternalEObject)correlatedWith).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.PATHED_ROLE_TYPE__CORRELATED_WITH, null, msgs);
			if (newCorrelatedWith != null)
				msgs = ((InternalEObject)newCorrelatedWith).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.PATHED_ROLE_TYPE__CORRELATED_WITH, null, msgs);
			msgs = basicSetCorrelatedWith(newCorrelatedWith, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PATHED_ROLE_TYPE__CORRELATED_WITH, newCorrelatedWith, newCorrelatedWith));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PATHED_ROLE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNegated() {
		return isNegated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNegated(boolean newIsNegated) {
		boolean oldIsNegated = isNegated;
		isNegated = newIsNegated;
		boolean oldIsNegatedESet = isNegatedESet;
		isNegatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PATHED_ROLE_TYPE__IS_NEGATED, oldIsNegated, isNegated, !oldIsNegatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsNegated() {
		boolean oldIsNegated = isNegated;
		boolean oldIsNegatedESet = isNegatedESet;
		isNegated = IS_NEGATED_EDEFAULT;
		isNegatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.PATHED_ROLE_TYPE__IS_NEGATED, oldIsNegated, IS_NEGATED_EDEFAULT, oldIsNegatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsNegated() {
		return isNegatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathedRolePurposeType getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(PathedRolePurposeType newPurpose) {
		PathedRolePurposeType oldPurpose = purpose;
		purpose = newPurpose == null ? PURPOSE_EDEFAULT : newPurpose;
		boolean oldPurposeESet = purposeESet;
		purposeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PATHED_ROLE_TYPE__PURPOSE, oldPurpose, purpose, !oldPurposeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPurpose() {
		PathedRolePurposeType oldPurpose = purpose;
		boolean oldPurposeESet = purposeESet;
		purpose = PURPOSE_EDEFAULT;
		purposeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.PATHED_ROLE_TYPE__PURPOSE, oldPurpose, PURPOSE_EDEFAULT, oldPurposeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPurpose() {
		return purposeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PATHED_ROLE_TYPE__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.PATHED_ROLE_TYPE__VALUE_RESTRICTION:
				return basicSetValueRestriction(null, msgs);
			case CorePackage.PATHED_ROLE_TYPE__CORRELATED_WITH:
				return basicSetCorrelatedWith(null, msgs);
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
			case CorePackage.PATHED_ROLE_TYPE__VALUE_RESTRICTION:
				return getValueRestriction();
			case CorePackage.PATHED_ROLE_TYPE__CORRELATED_WITH:
				return getCorrelatedWith();
			case CorePackage.PATHED_ROLE_TYPE__ID:
				return getId();
			case CorePackage.PATHED_ROLE_TYPE__IS_NEGATED:
				return isIsNegated();
			case CorePackage.PATHED_ROLE_TYPE__PURPOSE:
				return getPurpose();
			case CorePackage.PATHED_ROLE_TYPE__REF:
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
			case CorePackage.PATHED_ROLE_TYPE__VALUE_RESTRICTION:
				setValueRestriction((PathConditionRoleValueRestrictionType)newValue);
				return;
			case CorePackage.PATHED_ROLE_TYPE__CORRELATED_WITH:
				setCorrelatedWith((PathedRoleRef)newValue);
				return;
			case CorePackage.PATHED_ROLE_TYPE__ID:
				setId((String)newValue);
				return;
			case CorePackage.PATHED_ROLE_TYPE__IS_NEGATED:
				setIsNegated((Boolean)newValue);
				return;
			case CorePackage.PATHED_ROLE_TYPE__PURPOSE:
				setPurpose((PathedRolePurposeType)newValue);
				return;
			case CorePackage.PATHED_ROLE_TYPE__REF:
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
			case CorePackage.PATHED_ROLE_TYPE__VALUE_RESTRICTION:
				setValueRestriction((PathConditionRoleValueRestrictionType)null);
				return;
			case CorePackage.PATHED_ROLE_TYPE__CORRELATED_WITH:
				setCorrelatedWith((PathedRoleRef)null);
				return;
			case CorePackage.PATHED_ROLE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.PATHED_ROLE_TYPE__IS_NEGATED:
				unsetIsNegated();
				return;
			case CorePackage.PATHED_ROLE_TYPE__PURPOSE:
				unsetPurpose();
				return;
			case CorePackage.PATHED_ROLE_TYPE__REF:
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
			case CorePackage.PATHED_ROLE_TYPE__VALUE_RESTRICTION:
				return valueRestriction != null;
			case CorePackage.PATHED_ROLE_TYPE__CORRELATED_WITH:
				return correlatedWith != null;
			case CorePackage.PATHED_ROLE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.PATHED_ROLE_TYPE__IS_NEGATED:
				return isSetIsNegated();
			case CorePackage.PATHED_ROLE_TYPE__PURPOSE:
				return isSetPurpose();
			case CorePackage.PATHED_ROLE_TYPE__REF:
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
		result.append(", isNegated: ");
		if (isNegatedESet) result.append(isNegated); else result.append("<unset>");
		result.append(", purpose: ");
		if (purposeESet) result.append(purpose); else result.append("<unset>");
		result.append(", ref: ");
		result.append(ref);
		result.append(')');
		return result.toString();
	}

} //PathedRoleTypeImpl
