/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.CustomReferenceModeType;
import edu.neumont.schemas.orm._2006._04.orm.core.CustomReferenceModesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Reference Modes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CustomReferenceModesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CustomReferenceModesTypeImpl#getCustomReferenceMode <em>Custom Reference Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomReferenceModesTypeImpl extends MinimalEObjectImpl.Container implements CustomReferenceModesType {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomReferenceModesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getCustomReferenceModesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.CUSTOM_REFERENCE_MODES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomReferenceModeType> getCustomReferenceMode() {
		return getGroup().list(CorePackage.eINSTANCE.getCustomReferenceModesType_CustomReferenceMode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CUSTOM_REFERENCE_MODES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.CUSTOM_REFERENCE_MODES_TYPE__CUSTOM_REFERENCE_MODE:
				return ((InternalEList<?>)getCustomReferenceMode()).basicRemove(otherEnd, msgs);
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
			case CorePackage.CUSTOM_REFERENCE_MODES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.CUSTOM_REFERENCE_MODES_TYPE__CUSTOM_REFERENCE_MODE:
				return getCustomReferenceMode();
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
			case CorePackage.CUSTOM_REFERENCE_MODES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.CUSTOM_REFERENCE_MODES_TYPE__CUSTOM_REFERENCE_MODE:
				getCustomReferenceMode().clear();
				getCustomReferenceMode().addAll((Collection<? extends CustomReferenceModeType>)newValue);
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
			case CorePackage.CUSTOM_REFERENCE_MODES_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorePackage.CUSTOM_REFERENCE_MODES_TYPE__CUSTOM_REFERENCE_MODE:
				getCustomReferenceMode().clear();
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
			case CorePackage.CUSTOM_REFERENCE_MODES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.CUSTOM_REFERENCE_MODES_TYPE__CUSTOM_REFERENCE_MODE:
				return !getCustomReferenceMode().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //CustomReferenceModesTypeImpl
