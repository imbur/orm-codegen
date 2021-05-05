/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceWithJoinType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.JoinRuleType;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleSequenceWithProjectionRoleRef;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Role Sequence With Join Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintRoleSequenceWithJoinTypeImpl#getRole <em>Role</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ConstraintRoleSequenceWithJoinTypeImpl#getJoinRule <em>Join Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintRoleSequenceWithJoinTypeImpl extends MinimalEObjectImpl.Container implements ConstraintRoleSequenceWithJoinType {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleSequenceWithProjectionRoleRef> role;

	/**
	 * The cached value of the '{@link #getJoinRule() <em>Join Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinRule()
	 * @generated
	 * @ordered
	 */
	protected JoinRuleType joinRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintRoleSequenceWithJoinTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getConstraintRoleSequenceWithJoinType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleSequenceWithProjectionRoleRef> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<RoleSequenceWithProjectionRoleRef>(RoleSequenceWithProjectionRoleRef.class, this, CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_TYPE__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinRuleType getJoinRule() {
		return joinRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinRule(JoinRuleType newJoinRule, NotificationChain msgs) {
		JoinRuleType oldJoinRule = joinRule;
		joinRule = newJoinRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_TYPE__JOIN_RULE, oldJoinRule, newJoinRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinRule(JoinRuleType newJoinRule) {
		if (newJoinRule != joinRule) {
			NotificationChain msgs = null;
			if (joinRule != null)
				msgs = ((InternalEObject)joinRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_TYPE__JOIN_RULE, null, msgs);
			if (newJoinRule != null)
				msgs = ((InternalEObject)newJoinRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_TYPE__JOIN_RULE, null, msgs);
			msgs = basicSetJoinRule(newJoinRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_TYPE__JOIN_RULE, newJoinRule, newJoinRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_TYPE__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_TYPE__JOIN_RULE:
				return basicSetJoinRule(null, msgs);
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
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_TYPE__ROLE:
				return getRole();
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_TYPE__JOIN_RULE:
				return getJoinRule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_TYPE__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends RoleSequenceWithProjectionRoleRef>)newValue);
				return;
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_TYPE__JOIN_RULE:
				setJoinRule((JoinRuleType)newValue);
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
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_TYPE__ROLE:
				getRole().clear();
				return;
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_TYPE__JOIN_RULE:
				setJoinRule((JoinRuleType)null);
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
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_TYPE__ROLE:
				return role != null && !role.isEmpty();
			case CorePackage.CONSTRAINT_ROLE_SEQUENCE_WITH_JOIN_TYPE__JOIN_RULE:
				return joinRule != null;
		}
		return super.eIsSet(featureID);
	}

} //ConstraintRoleSequenceWithJoinTypeImpl
