/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ProjectedFromType1;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleSequenceWithProjectionRoleRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Sequence With Projection Role Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleSequenceWithProjectionRoleRefImpl#getProjectedFrom <em>Projected From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleSequenceWithProjectionRoleRefImpl extends RoleSequenceRoleRefImpl implements RoleSequenceWithProjectionRoleRef {
	/**
	 * The cached value of the '{@link #getProjectedFrom() <em>Projected From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectedFrom()
	 * @generated
	 * @ordered
	 */
	protected ProjectedFromType1 projectedFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleSequenceWithProjectionRoleRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getRoleSequenceWithProjectionRoleRef();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectedFromType1 getProjectedFrom() {
		return projectedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProjectedFrom(ProjectedFromType1 newProjectedFrom, NotificationChain msgs) {
		ProjectedFromType1 oldProjectedFrom = projectedFrom;
		projectedFrom = newProjectedFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_SEQUENCE_WITH_PROJECTION_ROLE_REF__PROJECTED_FROM, oldProjectedFrom, newProjectedFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectedFrom(ProjectedFromType1 newProjectedFrom) {
		if (newProjectedFrom != projectedFrom) {
			NotificationChain msgs = null;
			if (projectedFrom != null)
				msgs = ((InternalEObject)projectedFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_SEQUENCE_WITH_PROJECTION_ROLE_REF__PROJECTED_FROM, null, msgs);
			if (newProjectedFrom != null)
				msgs = ((InternalEObject)newProjectedFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_SEQUENCE_WITH_PROJECTION_ROLE_REF__PROJECTED_FROM, null, msgs);
			msgs = basicSetProjectedFrom(newProjectedFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_SEQUENCE_WITH_PROJECTION_ROLE_REF__PROJECTED_FROM, newProjectedFrom, newProjectedFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ROLE_SEQUENCE_WITH_PROJECTION_ROLE_REF__PROJECTED_FROM:
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
			case CorePackage.ROLE_SEQUENCE_WITH_PROJECTION_ROLE_REF__PROJECTED_FROM:
				return getProjectedFrom();
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
			case CorePackage.ROLE_SEQUENCE_WITH_PROJECTION_ROLE_REF__PROJECTED_FROM:
				setProjectedFrom((ProjectedFromType1)newValue);
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
			case CorePackage.ROLE_SEQUENCE_WITH_PROJECTION_ROLE_REF__PROJECTED_FROM:
				setProjectedFrom((ProjectedFromType1)null);
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
			case CorePackage.ROLE_SEQUENCE_WITH_PROJECTION_ROLE_REF__PROJECTED_FROM:
				return projectedFrom != null;
		}
		return super.eIsSet(featureID);
	}

} //RoleSequenceWithProjectionRoleRefImpl
