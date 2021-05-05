/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.SubsetConstraintRef;
import edu.neumont.schemas.orm._2006._04.orm.core.SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Superset Role Of Subtype Subset Constraint Not Subtype Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorTypeImpl#getSubsetConstraint <em>Subset Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorTypeImpl extends ModelErrorImpl implements SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType {
	/**
	 * The cached value of the '{@link #getSubsetConstraint() <em>Subset Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubsetConstraint()
	 * @generated
	 * @ordered
	 */
	protected SubsetConstraintRef subsetConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getSupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubsetConstraintRef getSubsetConstraint() {
		return subsetConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubsetConstraint(SubsetConstraintRef newSubsetConstraint, NotificationChain msgs) {
		SubsetConstraintRef oldSubsetConstraint = subsetConstraint;
		subsetConstraint = newSubsetConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SUPERSET_ROLE_OF_SUBTYPE_SUBSET_CONSTRAINT_NOT_SUBTYPE_ERROR_TYPE__SUBSET_CONSTRAINT, oldSubsetConstraint, newSubsetConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubsetConstraint(SubsetConstraintRef newSubsetConstraint) {
		if (newSubsetConstraint != subsetConstraint) {
			NotificationChain msgs = null;
			if (subsetConstraint != null)
				msgs = ((InternalEObject)subsetConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SUPERSET_ROLE_OF_SUBTYPE_SUBSET_CONSTRAINT_NOT_SUBTYPE_ERROR_TYPE__SUBSET_CONSTRAINT, null, msgs);
			if (newSubsetConstraint != null)
				msgs = ((InternalEObject)newSubsetConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SUPERSET_ROLE_OF_SUBTYPE_SUBSET_CONSTRAINT_NOT_SUBTYPE_ERROR_TYPE__SUBSET_CONSTRAINT, null, msgs);
			msgs = basicSetSubsetConstraint(newSubsetConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SUPERSET_ROLE_OF_SUBTYPE_SUBSET_CONSTRAINT_NOT_SUBTYPE_ERROR_TYPE__SUBSET_CONSTRAINT, newSubsetConstraint, newSubsetConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SUPERSET_ROLE_OF_SUBTYPE_SUBSET_CONSTRAINT_NOT_SUBTYPE_ERROR_TYPE__SUBSET_CONSTRAINT:
				return basicSetSubsetConstraint(null, msgs);
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
			case CorePackage.SUPERSET_ROLE_OF_SUBTYPE_SUBSET_CONSTRAINT_NOT_SUBTYPE_ERROR_TYPE__SUBSET_CONSTRAINT:
				return getSubsetConstraint();
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
			case CorePackage.SUPERSET_ROLE_OF_SUBTYPE_SUBSET_CONSTRAINT_NOT_SUBTYPE_ERROR_TYPE__SUBSET_CONSTRAINT:
				setSubsetConstraint((SubsetConstraintRef)newValue);
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
			case CorePackage.SUPERSET_ROLE_OF_SUBTYPE_SUBSET_CONSTRAINT_NOT_SUBTYPE_ERROR_TYPE__SUBSET_CONSTRAINT:
				setSubsetConstraint((SubsetConstraintRef)null);
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
			case CorePackage.SUPERSET_ROLE_OF_SUBTYPE_SUBSET_CONSTRAINT_NOT_SUBTYPE_ERROR_TYPE__SUBSET_CONSTRAINT:
				return subsetConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //SupersetRoleOfSubtypeSubsetConstraintNotSubtypeErrorTypeImpl
