/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.LogicalCombinationOperatorType;
import edu.neumont.schemas.orm._2006._04.orm.core.PathedRolesType;
import edu.neumont.schemas.orm._2006._04.orm.core.RolePathType;
import edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.SubPathsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Path Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RolePathTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RolePathTypeImpl#getRootObjectType <em>Root Object Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RolePathTypeImpl#getPathedRoles <em>Pathed Roles</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RolePathTypeImpl#getSubPaths <em>Sub Paths</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RolePathTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RolePathTypeImpl#getSplitCombinationOperator <em>Split Combination Operator</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RolePathTypeImpl#isSplitIsNegated <em>Split Is Negated</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RolePathTypeImpl extends MinimalEObjectImpl.Container implements RolePathType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

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
	 * The default value of the '{@link #getSplitCombinationOperator() <em>Split Combination Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplitCombinationOperator()
	 * @generated
	 * @ordered
	 */
	protected static final LogicalCombinationOperatorType SPLIT_COMBINATION_OPERATOR_EDEFAULT = LogicalCombinationOperatorType.AND;

	/**
	 * The cached value of the '{@link #getSplitCombinationOperator() <em>Split Combination Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplitCombinationOperator()
	 * @generated
	 * @ordered
	 */
	protected LogicalCombinationOperatorType splitCombinationOperator = SPLIT_COMBINATION_OPERATOR_EDEFAULT;

	/**
	 * This is true if the Split Combination Operator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean splitCombinationOperatorESet;

	/**
	 * The default value of the '{@link #isSplitIsNegated() <em>Split Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSplitIsNegated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPLIT_IS_NEGATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSplitIsNegated() <em>Split Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSplitIsNegated()
	 * @generated
	 * @ordered
	 */
	protected boolean splitIsNegated = SPLIT_IS_NEGATED_EDEFAULT;

	/**
	 * This is true if the Split Is Negated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean splitIsNegatedESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RolePathTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getRolePathType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.ROLE_PATH_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RootObjectTypeType> getRootObjectType() {
		return getGroup().list(CorePackage.eINSTANCE.getRolePathType_RootObjectType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PathedRolesType> getPathedRoles() {
		return getGroup().list(CorePackage.eINSTANCE.getRolePathType_PathedRoles());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubPathsType> getSubPaths() {
		return getGroup().list(CorePackage.eINSTANCE.getRolePathType_SubPaths());
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_PATH_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalCombinationOperatorType getSplitCombinationOperator() {
		return splitCombinationOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplitCombinationOperator(LogicalCombinationOperatorType newSplitCombinationOperator) {
		LogicalCombinationOperatorType oldSplitCombinationOperator = splitCombinationOperator;
		splitCombinationOperator = newSplitCombinationOperator == null ? SPLIT_COMBINATION_OPERATOR_EDEFAULT : newSplitCombinationOperator;
		boolean oldSplitCombinationOperatorESet = splitCombinationOperatorESet;
		splitCombinationOperatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_PATH_TYPE__SPLIT_COMBINATION_OPERATOR, oldSplitCombinationOperator, splitCombinationOperator, !oldSplitCombinationOperatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSplitCombinationOperator() {
		LogicalCombinationOperatorType oldSplitCombinationOperator = splitCombinationOperator;
		boolean oldSplitCombinationOperatorESet = splitCombinationOperatorESet;
		splitCombinationOperator = SPLIT_COMBINATION_OPERATOR_EDEFAULT;
		splitCombinationOperatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.ROLE_PATH_TYPE__SPLIT_COMBINATION_OPERATOR, oldSplitCombinationOperator, SPLIT_COMBINATION_OPERATOR_EDEFAULT, oldSplitCombinationOperatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSplitCombinationOperator() {
		return splitCombinationOperatorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSplitIsNegated() {
		return splitIsNegated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplitIsNegated(boolean newSplitIsNegated) {
		boolean oldSplitIsNegated = splitIsNegated;
		splitIsNegated = newSplitIsNegated;
		boolean oldSplitIsNegatedESet = splitIsNegatedESet;
		splitIsNegatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_PATH_TYPE__SPLIT_IS_NEGATED, oldSplitIsNegated, splitIsNegated, !oldSplitIsNegatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSplitIsNegated() {
		boolean oldSplitIsNegated = splitIsNegated;
		boolean oldSplitIsNegatedESet = splitIsNegatedESet;
		splitIsNegated = SPLIT_IS_NEGATED_EDEFAULT;
		splitIsNegatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.ROLE_PATH_TYPE__SPLIT_IS_NEGATED, oldSplitIsNegated, SPLIT_IS_NEGATED_EDEFAULT, oldSplitIsNegatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSplitIsNegated() {
		return splitIsNegatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ROLE_PATH_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.ROLE_PATH_TYPE__ROOT_OBJECT_TYPE:
				return ((InternalEList<?>)getRootObjectType()).basicRemove(otherEnd, msgs);
			case CorePackage.ROLE_PATH_TYPE__PATHED_ROLES:
				return ((InternalEList<?>)getPathedRoles()).basicRemove(otherEnd, msgs);
			case CorePackage.ROLE_PATH_TYPE__SUB_PATHS:
				return ((InternalEList<?>)getSubPaths()).basicRemove(otherEnd, msgs);
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
			case CorePackage.ROLE_PATH_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.ROLE_PATH_TYPE__ROOT_OBJECT_TYPE:
				return getRootObjectType();
			case CorePackage.ROLE_PATH_TYPE__PATHED_ROLES:
				return getPathedRoles();
			case CorePackage.ROLE_PATH_TYPE__SUB_PATHS:
				return getSubPaths();
			case CorePackage.ROLE_PATH_TYPE__ID:
				return getId();
			case CorePackage.ROLE_PATH_TYPE__SPLIT_COMBINATION_OPERATOR:
				return getSplitCombinationOperator();
			case CorePackage.ROLE_PATH_TYPE__SPLIT_IS_NEGATED:
				return isSplitIsNegated();
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
			case CorePackage.ROLE_PATH_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.ROLE_PATH_TYPE__ROOT_OBJECT_TYPE:
				getRootObjectType().clear();
				getRootObjectType().addAll((Collection<? extends RootObjectTypeType>)newValue);
				return;
			case CorePackage.ROLE_PATH_TYPE__PATHED_ROLES:
				getPathedRoles().clear();
				getPathedRoles().addAll((Collection<? extends PathedRolesType>)newValue);
				return;
			case CorePackage.ROLE_PATH_TYPE__SUB_PATHS:
				getSubPaths().clear();
				getSubPaths().addAll((Collection<? extends SubPathsType>)newValue);
				return;
			case CorePackage.ROLE_PATH_TYPE__ID:
				setId((String)newValue);
				return;
			case CorePackage.ROLE_PATH_TYPE__SPLIT_COMBINATION_OPERATOR:
				setSplitCombinationOperator((LogicalCombinationOperatorType)newValue);
				return;
			case CorePackage.ROLE_PATH_TYPE__SPLIT_IS_NEGATED:
				setSplitIsNegated((Boolean)newValue);
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
			case CorePackage.ROLE_PATH_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorePackage.ROLE_PATH_TYPE__ROOT_OBJECT_TYPE:
				getRootObjectType().clear();
				return;
			case CorePackage.ROLE_PATH_TYPE__PATHED_ROLES:
				getPathedRoles().clear();
				return;
			case CorePackage.ROLE_PATH_TYPE__SUB_PATHS:
				getSubPaths().clear();
				return;
			case CorePackage.ROLE_PATH_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.ROLE_PATH_TYPE__SPLIT_COMBINATION_OPERATOR:
				unsetSplitCombinationOperator();
				return;
			case CorePackage.ROLE_PATH_TYPE__SPLIT_IS_NEGATED:
				unsetSplitIsNegated();
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
			case CorePackage.ROLE_PATH_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.ROLE_PATH_TYPE__ROOT_OBJECT_TYPE:
				return !getRootObjectType().isEmpty();
			case CorePackage.ROLE_PATH_TYPE__PATHED_ROLES:
				return !getPathedRoles().isEmpty();
			case CorePackage.ROLE_PATH_TYPE__SUB_PATHS:
				return !getSubPaths().isEmpty();
			case CorePackage.ROLE_PATH_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.ROLE_PATH_TYPE__SPLIT_COMBINATION_OPERATOR:
				return isSetSplitCombinationOperator();
			case CorePackage.ROLE_PATH_TYPE__SPLIT_IS_NEGATED:
				return isSetSplitIsNegated();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", id: ");
		result.append(id);
		result.append(", splitCombinationOperator: ");
		if (splitCombinationOperatorESet) result.append(splitCombinationOperator); else result.append("<unset>");
		result.append(", splitIsNegated: ");
		if (splitIsNegatedESet) result.append(splitIsNegated); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RolePathTypeImpl
