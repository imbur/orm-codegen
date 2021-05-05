/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceJoinPathType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.JoinPathProjectionsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Role Sequence Join Path Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintRoleSequenceJoinPathTypeImpl#getJoinPathProjections <em>Join Path Projections</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintRoleSequenceJoinPathTypeImpl#isIsAutomatic <em>Is Automatic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintRoleSequenceJoinPathTypeImpl extends RolePathOwnerTypeImpl implements ConstraintRoleSequenceJoinPathType {
	/**
	 * The cached value of the '{@link #getJoinPathProjections() <em>Join Path Projections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinPathProjections()
	 * @generated
	 * @ordered
	 */
	protected JoinPathProjectionsType joinPathProjections;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintRoleSequenceJoinPathTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getConstraintRoleSequenceJoinPathType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinPathProjectionsType getJoinPathProjections() {
		return joinPathProjections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinPathProjections(JoinPathProjectionsType newJoinPathProjections, NotificationChain msgs) {
		JoinPathProjectionsType oldJoinPathProjections = joinPathProjections;
		joinPathProjections = newJoinPathProjections;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_TYPE__JOIN_PATH_PROJECTIONS, oldJoinPathProjections, newJoinPathProjections);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinPathProjections(JoinPathProjectionsType newJoinPathProjections) {
		if (newJoinPathProjections != joinPathProjections) {
			NotificationChain msgs = null;
			if (joinPathProjections != null)
				msgs = ((InternalEObject)joinPathProjections).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_TYPE__JOIN_PATH_PROJECTIONS, null, msgs);
			if (newJoinPathProjections != null)
				msgs = ((InternalEObject)newJoinPathProjections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_TYPE__JOIN_PATH_PROJECTIONS, null, msgs);
			msgs = basicSetJoinPathProjections(newJoinPathProjections, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_TYPE__JOIN_PATH_PROJECTIONS, newJoinPathProjections, newJoinPathProjections));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_TYPE__IS_AUTOMATIC, oldIsAutomatic, isAutomatic, !oldIsAutomaticESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_TYPE__IS_AUTOMATIC, oldIsAutomatic, IS_AUTOMATIC_EDEFAULT, oldIsAutomaticESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_TYPE__JOIN_PATH_PROJECTIONS:
				return basicSetJoinPathProjections(null, msgs);
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
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_TYPE__JOIN_PATH_PROJECTIONS:
				return getJoinPathProjections();
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_TYPE__IS_AUTOMATIC:
				return isIsAutomatic();
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
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_TYPE__JOIN_PATH_PROJECTIONS:
				setJoinPathProjections((JoinPathProjectionsType)newValue);
				return;
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_TYPE__IS_AUTOMATIC:
				setIsAutomatic((Boolean)newValue);
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
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_TYPE__JOIN_PATH_PROJECTIONS:
				setJoinPathProjections((JoinPathProjectionsType)null);
				return;
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_TYPE__IS_AUTOMATIC:
				unsetIsAutomatic();
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
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_TYPE__JOIN_PATH_PROJECTIONS:
				return joinPathProjections != null;
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_JOIN_PATH_TYPE__IS_AUTOMATIC:
				return isSetIsAutomatic();
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
		result.append(" (isAutomatic: ");
		if (isAutomaticESet) result.append(isAutomatic); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ConstraintRoleSequenceJoinPathTypeImpl
