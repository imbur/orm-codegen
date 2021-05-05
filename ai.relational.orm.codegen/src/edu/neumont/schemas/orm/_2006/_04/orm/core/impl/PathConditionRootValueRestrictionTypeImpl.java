/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.PathConditionRootValueRestrictionType;
import edu.neumont.schemas.orm._2006._04.orm.core.ValueConstraintType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Condition Root Value Restriction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PathConditionRootValueRestrictionTypeImpl#getPathRootConditionValueConstraint <em>Path Root Condition Value Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathConditionRootValueRestrictionTypeImpl extends MinimalEObjectImpl.Container implements PathConditionRootValueRestrictionType {
	/**
	 * The cached value of the '{@link #getPathRootConditionValueConstraint() <em>Path Root Condition Value Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathRootConditionValueConstraint()
	 * @generated
	 * @ordered
	 */
	protected ValueConstraintType pathRootConditionValueConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathConditionRootValueRestrictionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getPathConditionRootValueRestrictionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueConstraintType getPathRootConditionValueConstraint() {
		return pathRootConditionValueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathRootConditionValueConstraint(ValueConstraintType newPathRootConditionValueConstraint, NotificationChain msgs) {
		ValueConstraintType oldPathRootConditionValueConstraint = pathRootConditionValueConstraint;
		pathRootConditionValueConstraint = newPathRootConditionValueConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.PATH_CONDITION_ROOT_VALUE_RESTRICTION_TYPE__PATH_ROOT_CONDITION_VALUE_CONSTRAINT, oldPathRootConditionValueConstraint, newPathRootConditionValueConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathRootConditionValueConstraint(ValueConstraintType newPathRootConditionValueConstraint) {
		if (newPathRootConditionValueConstraint != pathRootConditionValueConstraint) {
			NotificationChain msgs = null;
			if (pathRootConditionValueConstraint != null)
				msgs = ((InternalEObject)pathRootConditionValueConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.PATH_CONDITION_ROOT_VALUE_RESTRICTION_TYPE__PATH_ROOT_CONDITION_VALUE_CONSTRAINT, null, msgs);
			if (newPathRootConditionValueConstraint != null)
				msgs = ((InternalEObject)newPathRootConditionValueConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.PATH_CONDITION_ROOT_VALUE_RESTRICTION_TYPE__PATH_ROOT_CONDITION_VALUE_CONSTRAINT, null, msgs);
			msgs = basicSetPathRootConditionValueConstraint(newPathRootConditionValueConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PATH_CONDITION_ROOT_VALUE_RESTRICTION_TYPE__PATH_ROOT_CONDITION_VALUE_CONSTRAINT, newPathRootConditionValueConstraint, newPathRootConditionValueConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.PATH_CONDITION_ROOT_VALUE_RESTRICTION_TYPE__PATH_ROOT_CONDITION_VALUE_CONSTRAINT:
				return basicSetPathRootConditionValueConstraint(null, msgs);
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
			case CorePackage.PATH_CONDITION_ROOT_VALUE_RESTRICTION_TYPE__PATH_ROOT_CONDITION_VALUE_CONSTRAINT:
				return getPathRootConditionValueConstraint();
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
			case CorePackage.PATH_CONDITION_ROOT_VALUE_RESTRICTION_TYPE__PATH_ROOT_CONDITION_VALUE_CONSTRAINT:
				setPathRootConditionValueConstraint((ValueConstraintType)newValue);
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
			case CorePackage.PATH_CONDITION_ROOT_VALUE_RESTRICTION_TYPE__PATH_ROOT_CONDITION_VALUE_CONSTRAINT:
				setPathRootConditionValueConstraint((ValueConstraintType)null);
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
			case CorePackage.PATH_CONDITION_ROOT_VALUE_RESTRICTION_TYPE__PATH_ROOT_CONDITION_VALUE_CONSTRAINT:
				return pathRootConditionValueConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //PathConditionRootValueRestrictionTypeImpl
