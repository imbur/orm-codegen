/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.PathConditionRootValueRestrictionType;
import edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Object Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RootObjectTypeTypeImpl#getValueRestriction <em>Value Restriction</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RootObjectTypeTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RootObjectTypeTypeImpl#isIsNegated <em>Is Negated</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RootObjectTypeTypeImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootObjectTypeTypeImpl extends MinimalEObjectImpl.Container implements RootObjectTypeType {
	/**
	 * The cached value of the '{@link #getValueRestriction() <em>Value Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRestriction()
	 * @generated
	 * @ordered
	 */
	protected PathConditionRootValueRestrictionType valueRestriction;

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
	protected RootObjectTypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getRootObjectTypeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathConditionRootValueRestrictionType getValueRestriction() {
		return valueRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueRestriction(PathConditionRootValueRestrictionType newValueRestriction, NotificationChain msgs) {
		PathConditionRootValueRestrictionType oldValueRestriction = valueRestriction;
		valueRestriction = newValueRestriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ROOT_OBJECT_TYPE_TYPE__VALUE_RESTRICTION, oldValueRestriction, newValueRestriction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueRestriction(PathConditionRootValueRestrictionType newValueRestriction) {
		if (newValueRestriction != valueRestriction) {
			NotificationChain msgs = null;
			if (valueRestriction != null)
				msgs = ((InternalEObject)valueRestriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROOT_OBJECT_TYPE_TYPE__VALUE_RESTRICTION, null, msgs);
			if (newValueRestriction != null)
				msgs = ((InternalEObject)newValueRestriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROOT_OBJECT_TYPE_TYPE__VALUE_RESTRICTION, null, msgs);
			msgs = basicSetValueRestriction(newValueRestriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROOT_OBJECT_TYPE_TYPE__VALUE_RESTRICTION, newValueRestriction, newValueRestriction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROOT_OBJECT_TYPE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROOT_OBJECT_TYPE_TYPE__IS_NEGATED, oldIsNegated, isNegated, !oldIsNegatedESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.ROOT_OBJECT_TYPE_TYPE__IS_NEGATED, oldIsNegated, IS_NEGATED_EDEFAULT, oldIsNegatedESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROOT_OBJECT_TYPE_TYPE__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ROOT_OBJECT_TYPE_TYPE__VALUE_RESTRICTION:
				return basicSetValueRestriction(null, msgs);
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
			case CorePackage.ROOT_OBJECT_TYPE_TYPE__VALUE_RESTRICTION:
				return getValueRestriction();
			case CorePackage.ROOT_OBJECT_TYPE_TYPE__ID:
				return getId();
			case CorePackage.ROOT_OBJECT_TYPE_TYPE__IS_NEGATED:
				return isIsNegated();
			case CorePackage.ROOT_OBJECT_TYPE_TYPE__REF:
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
			case CorePackage.ROOT_OBJECT_TYPE_TYPE__VALUE_RESTRICTION:
				setValueRestriction((PathConditionRootValueRestrictionType)newValue);
				return;
			case CorePackage.ROOT_OBJECT_TYPE_TYPE__ID:
				setId((String)newValue);
				return;
			case CorePackage.ROOT_OBJECT_TYPE_TYPE__IS_NEGATED:
				setIsNegated((Boolean)newValue);
				return;
			case CorePackage.ROOT_OBJECT_TYPE_TYPE__REF:
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
			case CorePackage.ROOT_OBJECT_TYPE_TYPE__VALUE_RESTRICTION:
				setValueRestriction((PathConditionRootValueRestrictionType)null);
				return;
			case CorePackage.ROOT_OBJECT_TYPE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.ROOT_OBJECT_TYPE_TYPE__IS_NEGATED:
				unsetIsNegated();
				return;
			case CorePackage.ROOT_OBJECT_TYPE_TYPE__REF:
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
			case CorePackage.ROOT_OBJECT_TYPE_TYPE__VALUE_RESTRICTION:
				return valueRestriction != null;
			case CorePackage.ROOT_OBJECT_TYPE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.ROOT_OBJECT_TYPE_TYPE__IS_NEGATED:
				return isSetIsNegated();
			case CorePackage.ROOT_OBJECT_TYPE_TYPE__REF:
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
		result.append(", ref: ");
		result.append(ref);
		result.append(')');
		return result.toString();
	}

} //RootObjectTypeTypeImpl
