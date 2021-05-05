/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleProjectionType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ProjectedFromType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Role Projection Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintRoleProjectionTypeImpl#getProjectedFrom <em>Projected From</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintRoleProjectionTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintRoleProjectionTypeImpl#isIsAutomatic <em>Is Automatic</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintRoleProjectionTypeImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintRoleProjectionTypeImpl extends MinimalEObjectImpl.Container implements ConstraintRoleProjectionType {
	/**
	 * The cached value of the '{@link #getProjectedFrom() <em>Projected From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectedFrom()
	 * @generated
	 * @ordered
	 */
	protected ProjectedFromType projectedFrom;

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
	protected ConstraintRoleProjectionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getConstraintRoleProjectionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectedFromType getProjectedFrom() {
		return projectedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectedFrom(ProjectedFromType newProjectedFrom, NotificationChain msgs) {
		ProjectedFromType oldProjectedFrom = projectedFrom;
		projectedFrom = newProjectedFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__PROJECTED_FROM, oldProjectedFrom, newProjectedFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectedFrom(ProjectedFromType newProjectedFrom) {
		if (newProjectedFrom != projectedFrom) {
			NotificationChain msgs = null;
			if (projectedFrom != null)
				msgs = ((InternalEObject)projectedFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__PROJECTED_FROM, null, msgs);
			if (newProjectedFrom != null)
				msgs = ((InternalEObject)newProjectedFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__PROJECTED_FROM, null, msgs);
			msgs = basicSetProjectedFrom(newProjectedFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__PROJECTED_FROM, newProjectedFrom, newProjectedFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__IS_AUTOMATIC, oldIsAutomatic, isAutomatic, !oldIsAutomaticESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__IS_AUTOMATIC, oldIsAutomatic, IS_AUTOMATIC_EDEFAULT, oldIsAutomaticESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__PROJECTED_FROM:
				return basicSetProjectedFrom(null, msgs);
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
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__PROJECTED_FROM:
				return getProjectedFrom();
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__ID:
				return getId();
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__IS_AUTOMATIC:
				return isIsAutomatic();
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__REF:
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
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__PROJECTED_FROM:
				setProjectedFrom((ProjectedFromType)newValue);
				return;
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__ID:
				setId((String)newValue);
				return;
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__IS_AUTOMATIC:
				setIsAutomatic((Boolean)newValue);
				return;
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__REF:
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
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__PROJECTED_FROM:
				setProjectedFrom((ProjectedFromType)null);
				return;
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__IS_AUTOMATIC:
				unsetIsAutomatic();
				return;
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__REF:
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
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__PROJECTED_FROM:
				return projectedFrom != null;
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__IS_AUTOMATIC:
				return isSetIsAutomatic();
			case CorePackage.CONSTRAINT_ROLE_PROJECTION_TYPE__REF:
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

} //ConstraintRoleProjectionTypeImpl
