/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.SetComparisonConstraintRef;
import edu.neumont.schemas.orm._2006._04.orm.core.SetConstraintRef;
import edu.neumont.schemas.orm._2006._04.orm.core.TooManyRoleSequencesErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Too Many Role Sequences Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.TooManyRoleSequencesErrorTypeImpl#getSetComparisonConstraint <em>Set Comparison Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.TooManyRoleSequencesErrorTypeImpl#getSetConstraint <em>Set Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TooManyRoleSequencesErrorTypeImpl extends ModelErrorImpl implements TooManyRoleSequencesErrorType {
	/**
	 * The cached value of the '{@link #getSetComparisonConstraint() <em>Set Comparison Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetComparisonConstraint()
	 * @generated
	 * @ordered
	 */
	protected SetComparisonConstraintRef setComparisonConstraint;

	/**
	 * The cached value of the '{@link #getSetConstraint() <em>Set Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetConstraint()
	 * @generated
	 * @ordered
	 */
	protected SetConstraintRef setConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TooManyRoleSequencesErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getTooManyRoleSequencesErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetComparisonConstraintRef getSetComparisonConstraint() {
		return setComparisonConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetComparisonConstraint(SetComparisonConstraintRef newSetComparisonConstraint, NotificationChain msgs) {
		SetComparisonConstraintRef oldSetComparisonConstraint = setComparisonConstraint;
		setComparisonConstraint = newSetComparisonConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE__SET_COMPARISON_CONSTRAINT, oldSetComparisonConstraint, newSetComparisonConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetComparisonConstraint(SetComparisonConstraintRef newSetComparisonConstraint) {
		if (newSetComparisonConstraint != setComparisonConstraint) {
			NotificationChain msgs = null;
			if (setComparisonConstraint != null)
				msgs = ((InternalEObject)setComparisonConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE__SET_COMPARISON_CONSTRAINT, null, msgs);
			if (newSetComparisonConstraint != null)
				msgs = ((InternalEObject)newSetComparisonConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE__SET_COMPARISON_CONSTRAINT, null, msgs);
			msgs = basicSetSetComparisonConstraint(newSetComparisonConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE__SET_COMPARISON_CONSTRAINT, newSetComparisonConstraint, newSetComparisonConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetConstraintRef getSetConstraint() {
		return setConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetConstraint(SetConstraintRef newSetConstraint, NotificationChain msgs) {
		SetConstraintRef oldSetConstraint = setConstraint;
		setConstraint = newSetConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE__SET_CONSTRAINT, oldSetConstraint, newSetConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetConstraint(SetConstraintRef newSetConstraint) {
		if (newSetConstraint != setConstraint) {
			NotificationChain msgs = null;
			if (setConstraint != null)
				msgs = ((InternalEObject)setConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE__SET_CONSTRAINT, null, msgs);
			if (newSetConstraint != null)
				msgs = ((InternalEObject)newSetConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE__SET_CONSTRAINT, null, msgs);
			msgs = basicSetSetConstraint(newSetConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE__SET_CONSTRAINT, newSetConstraint, newSetConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE__SET_COMPARISON_CONSTRAINT:
				return basicSetSetComparisonConstraint(null, msgs);
			case CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE__SET_CONSTRAINT:
				return basicSetSetConstraint(null, msgs);
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
			case CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE__SET_COMPARISON_CONSTRAINT:
				return getSetComparisonConstraint();
			case CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE__SET_CONSTRAINT:
				return getSetConstraint();
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
			case CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE__SET_COMPARISON_CONSTRAINT:
				setSetComparisonConstraint((SetComparisonConstraintRef)newValue);
				return;
			case CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE__SET_CONSTRAINT:
				setSetConstraint((SetConstraintRef)newValue);
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
			case CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE__SET_COMPARISON_CONSTRAINT:
				setSetComparisonConstraint((SetComparisonConstraintRef)null);
				return;
			case CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE__SET_CONSTRAINT:
				setSetConstraint((SetConstraintRef)null);
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
			case CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE__SET_COMPARISON_CONSTRAINT:
				return setComparisonConstraint != null;
			case CorePackage.TOO_MANY_ROLE_SEQUENCES_ERROR_TYPE__SET_CONSTRAINT:
				return setConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //TooManyRoleSequencesErrorTypeImpl
