/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CompatibleRolePlayerTypeErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.SetComparisonConstraintRef;
import edu.neumont.schemas.orm._2006._04.orm.core.SetConstraintRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compatible Role Player Type Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CompatibleRolePlayerTypeErrorTypeImpl#getSetComparisonConstraint <em>Set Comparison Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CompatibleRolePlayerTypeErrorTypeImpl#getSetConstraint <em>Set Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CompatibleRolePlayerTypeErrorTypeImpl#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompatibleRolePlayerTypeErrorTypeImpl extends ModelErrorImpl implements CompatibleRolePlayerTypeErrorType {
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
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected int column = COLUMN_EDEFAULT;

	/**
	 * This is true if the Column attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean columnESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompatibleRolePlayerTypeErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getCompatibleRolePlayerTypeErrorType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_COMPARISON_CONSTRAINT, oldSetComparisonConstraint, newSetComparisonConstraint);
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
				msgs = ((InternalEObject)setComparisonConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_COMPARISON_CONSTRAINT, null, msgs);
			if (newSetComparisonConstraint != null)
				msgs = ((InternalEObject)newSetComparisonConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_COMPARISON_CONSTRAINT, null, msgs);
			msgs = basicSetSetComparisonConstraint(newSetComparisonConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_COMPARISON_CONSTRAINT, newSetComparisonConstraint, newSetComparisonConstraint));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_CONSTRAINT, oldSetConstraint, newSetConstraint);
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
				msgs = ((InternalEObject)setConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_CONSTRAINT, null, msgs);
			if (newSetConstraint != null)
				msgs = ((InternalEObject)newSetConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_CONSTRAINT, null, msgs);
			msgs = basicSetSetConstraint(newSetConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_CONSTRAINT, newSetConstraint, newSetConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(int newColumn) {
		int oldColumn = column;
		column = newColumn;
		boolean oldColumnESet = columnESet;
		columnESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__COLUMN, oldColumn, column, !oldColumnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetColumn() {
		int oldColumn = column;
		boolean oldColumnESet = columnESet;
		column = COLUMN_EDEFAULT;
		columnESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__COLUMN, oldColumn, COLUMN_EDEFAULT, oldColumnESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetColumn() {
		return columnESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_COMPARISON_CONSTRAINT:
				return basicSetSetComparisonConstraint(null, msgs);
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_CONSTRAINT:
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
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_COMPARISON_CONSTRAINT:
				return getSetComparisonConstraint();
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_CONSTRAINT:
				return getSetConstraint();
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__COLUMN:
				return getColumn();
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
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_COMPARISON_CONSTRAINT:
				setSetComparisonConstraint((SetComparisonConstraintRef)newValue);
				return;
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_CONSTRAINT:
				setSetConstraint((SetConstraintRef)newValue);
				return;
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__COLUMN:
				setColumn((Integer)newValue);
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
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_COMPARISON_CONSTRAINT:
				setSetComparisonConstraint((SetComparisonConstraintRef)null);
				return;
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_CONSTRAINT:
				setSetConstraint((SetConstraintRef)null);
				return;
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__COLUMN:
				unsetColumn();
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
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_COMPARISON_CONSTRAINT:
				return setComparisonConstraint != null;
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__SET_CONSTRAINT:
				return setConstraint != null;
			case CorePackage.COMPATIBLE_ROLE_PLAYER_TYPE_ERROR_TYPE__COLUMN:
				return isSetColumn();
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
		result.append(" (column: ");
		if (columnESet) result.append(column); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CompatibleRolePlayerTypeErrorTypeImpl
