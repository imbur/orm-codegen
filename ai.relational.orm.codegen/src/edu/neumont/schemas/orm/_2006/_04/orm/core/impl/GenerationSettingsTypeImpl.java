/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.GenerationSettingType;
import edu.neumont.schemas.orm._2006._04.orm.core.GenerationSettingsType;

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
 * An implementation of the model object '<em><b>Generation Settings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GenerationSettingsTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GenerationSettingsTypeImpl#getGenerationSettingGroup <em>Generation Setting Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GenerationSettingsTypeImpl#getGenerationSetting <em>Generation Setting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenerationSettingsTypeImpl extends MinimalEObjectImpl.Container implements GenerationSettingsType {
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
	protected GenerationSettingsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getGenerationSettingsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.GENERATION_SETTINGS_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGenerationSettingGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(CorePackage.eINSTANCE.getGenerationSettingsType_GenerationSettingGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenerationSettingType> getGenerationSetting() {
		return getGenerationSettingGroup().list(CorePackage.eINSTANCE.getGenerationSettingsType_GenerationSetting());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.GENERATION_SETTINGS_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.GENERATION_SETTINGS_TYPE__GENERATION_SETTING_GROUP:
				return ((InternalEList<?>)getGenerationSettingGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.GENERATION_SETTINGS_TYPE__GENERATION_SETTING:
				return ((InternalEList<?>)getGenerationSetting()).basicRemove(otherEnd, msgs);
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
			case CorePackage.GENERATION_SETTINGS_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.GENERATION_SETTINGS_TYPE__GENERATION_SETTING_GROUP:
				if (coreType) return getGenerationSettingGroup();
				return ((FeatureMap.Internal)getGenerationSettingGroup()).getWrapper();
			case CorePackage.GENERATION_SETTINGS_TYPE__GENERATION_SETTING:
				return getGenerationSetting();
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
			case CorePackage.GENERATION_SETTINGS_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.GENERATION_SETTINGS_TYPE__GENERATION_SETTING_GROUP:
				((FeatureMap.Internal)getGenerationSettingGroup()).set(newValue);
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
			case CorePackage.GENERATION_SETTINGS_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorePackage.GENERATION_SETTINGS_TYPE__GENERATION_SETTING_GROUP:
				getGenerationSettingGroup().clear();
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
			case CorePackage.GENERATION_SETTINGS_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.GENERATION_SETTINGS_TYPE__GENERATION_SETTING_GROUP:
				return !getGenerationSettingGroup().isEmpty();
			case CorePackage.GENERATION_SETTINGS_TYPE__GENERATION_SETTING:
				return !getGenerationSetting().isEmpty();
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

} //GenerationSettingsTypeImpl
