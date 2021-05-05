/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathRef;
import edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathType;
import edu.neumont.schemas.orm._2006._04.orm.core.PathComponentsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Components Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PathComponentsTypeImpl#getRolePath <em>Role Path</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PathComponentsTypeImpl#getSharedRolePath <em>Shared Role Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathComponentsTypeImpl extends MinimalEObjectImpl.Container implements PathComponentsType {
	/**
	 * The cached value of the '{@link #getRolePath() <em>Role Path</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolePath()
	 * @generated
	 * @ordered
	 */
	protected EList<LeadRolePathType> rolePath;

	/**
	 * The cached value of the '{@link #getSharedRolePath() <em>Shared Role Path</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedRolePath()
	 * @generated
	 * @ordered
	 */
	protected EList<LeadRolePathRef> sharedRolePath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathComponentsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getPathComponentsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LeadRolePathType> getRolePath() {
		if (rolePath == null) {
			rolePath = new EObjectContainmentEList<LeadRolePathType>(LeadRolePathType.class, this, CorePackage.PATH_COMPONENTS_TYPE__ROLE_PATH);
		}
		return rolePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LeadRolePathRef> getSharedRolePath() {
		if (sharedRolePath == null) {
			sharedRolePath = new EObjectContainmentEList<LeadRolePathRef>(LeadRolePathRef.class, this, CorePackage.PATH_COMPONENTS_TYPE__SHARED_ROLE_PATH);
		}
		return sharedRolePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.PATH_COMPONENTS_TYPE__ROLE_PATH:
				return ((InternalEList<?>)getRolePath()).basicRemove(otherEnd, msgs);
			case CorePackage.PATH_COMPONENTS_TYPE__SHARED_ROLE_PATH:
				return ((InternalEList<?>)getSharedRolePath()).basicRemove(otherEnd, msgs);
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
			case CorePackage.PATH_COMPONENTS_TYPE__ROLE_PATH:
				return getRolePath();
			case CorePackage.PATH_COMPONENTS_TYPE__SHARED_ROLE_PATH:
				return getSharedRolePath();
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
			case CorePackage.PATH_COMPONENTS_TYPE__ROLE_PATH:
				getRolePath().clear();
				getRolePath().addAll((Collection<? extends LeadRolePathType>)newValue);
				return;
			case CorePackage.PATH_COMPONENTS_TYPE__SHARED_ROLE_PATH:
				getSharedRolePath().clear();
				getSharedRolePath().addAll((Collection<? extends LeadRolePathRef>)newValue);
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
			case CorePackage.PATH_COMPONENTS_TYPE__ROLE_PATH:
				getRolePath().clear();
				return;
			case CorePackage.PATH_COMPONENTS_TYPE__SHARED_ROLE_PATH:
				getSharedRolePath().clear();
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
			case CorePackage.PATH_COMPONENTS_TYPE__ROLE_PATH:
				return rolePath != null && !rolePath.isEmpty();
			case CorePackage.PATH_COMPONENTS_TYPE__SHARED_ROLE_PATH:
				return sharedRolePath != null && !sharedRolePath.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PathComponentsTypeImpl
