/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceJoinPathType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.JoinRuleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Rule Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.JoinRuleTypeImpl#getJoinPath <em>Join Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinRuleTypeImpl extends MinimalEObjectImpl.Container implements JoinRuleType {
	/**
	 * The cached value of the '{@link #getJoinPath() <em>Join Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinPath()
	 * @generated
	 * @ordered
	 */
	protected ConstraintRoleSequenceJoinPathType joinPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinRuleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getJoinRuleType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintRoleSequenceJoinPathType getJoinPath() {
		return joinPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinPath(ConstraintRoleSequenceJoinPathType newJoinPath, NotificationChain msgs) {
		ConstraintRoleSequenceJoinPathType oldJoinPath = joinPath;
		joinPath = newJoinPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.JOIN_RULE_TYPE__JOIN_PATH, oldJoinPath, newJoinPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinPath(ConstraintRoleSequenceJoinPathType newJoinPath) {
		if (newJoinPath != joinPath) {
			NotificationChain msgs = null;
			if (joinPath != null)
				msgs = ((InternalEObject)joinPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.JOIN_RULE_TYPE__JOIN_PATH, null, msgs);
			if (newJoinPath != null)
				msgs = ((InternalEObject)newJoinPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.JOIN_RULE_TYPE__JOIN_PATH, null, msgs);
			msgs = basicSetJoinPath(newJoinPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.JOIN_RULE_TYPE__JOIN_PATH, newJoinPath, newJoinPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.JOIN_RULE_TYPE__JOIN_PATH:
				return basicSetJoinPath(null, msgs);
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
			case CorePackage.JOIN_RULE_TYPE__JOIN_PATH:
				return getJoinPath();
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
			case CorePackage.JOIN_RULE_TYPE__JOIN_PATH:
				setJoinPath((ConstraintRoleSequenceJoinPathType)newValue);
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
			case CorePackage.JOIN_RULE_TYPE__JOIN_PATH:
				setJoinPath((ConstraintRoleSequenceJoinPathType)null);
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
			case CorePackage.JOIN_RULE_TYPE__JOIN_PATH:
				return joinPath != null;
		}
		return super.eIsSet(featureID);
	}

} //JoinRuleTypeImpl
