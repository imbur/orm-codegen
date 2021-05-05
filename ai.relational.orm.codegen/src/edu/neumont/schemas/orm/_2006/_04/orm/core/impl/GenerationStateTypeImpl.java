/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.GenerationSettingsType;
import edu.neumont.schemas.orm._2006._04.orm.core.GenerationStateType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generation State Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GenerationStateTypeImpl#getGenerationSettings <em>Generation Settings</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GenerationStateTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenerationStateTypeImpl extends MinimalEObjectImpl.Container implements GenerationStateType {
	/**
	 * The cached value of the '{@link #getGenerationSettings() <em>Generation Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationSettings()
	 * @generated
	 * @ordered
	 */
	protected GenerationSettingsType generationSettings;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerationStateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getGenerationStateType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationSettingsType getGenerationSettings() {
		return generationSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerationSettings(GenerationSettingsType newGenerationSettings, NotificationChain msgs) {
		GenerationSettingsType oldGenerationSettings = generationSettings;
		generationSettings = newGenerationSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.GENERATION_STATE_TYPE__GENERATION_SETTINGS, oldGenerationSettings, newGenerationSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationSettings(GenerationSettingsType newGenerationSettings) {
		if (newGenerationSettings != generationSettings) {
			NotificationChain msgs = null;
			if (generationSettings != null)
				msgs = ((InternalEObject)generationSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.GENERATION_STATE_TYPE__GENERATION_SETTINGS, null, msgs);
			if (newGenerationSettings != null)
				msgs = ((InternalEObject)newGenerationSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.GENERATION_STATE_TYPE__GENERATION_SETTINGS, null, msgs);
			msgs = basicSetGenerationSettings(newGenerationSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GENERATION_STATE_TYPE__GENERATION_SETTINGS, newGenerationSettings, newGenerationSettings));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GENERATION_STATE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.GENERATION_STATE_TYPE__GENERATION_SETTINGS:
				return basicSetGenerationSettings(null, msgs);
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
			case CorePackage.GENERATION_STATE_TYPE__GENERATION_SETTINGS:
				return getGenerationSettings();
			case CorePackage.GENERATION_STATE_TYPE__ID:
				return getId();
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
			case CorePackage.GENERATION_STATE_TYPE__GENERATION_SETTINGS:
				setGenerationSettings((GenerationSettingsType)newValue);
				return;
			case CorePackage.GENERATION_STATE_TYPE__ID:
				setId((String)newValue);
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
			case CorePackage.GENERATION_STATE_TYPE__GENERATION_SETTINGS:
				setGenerationSettings((GenerationSettingsType)null);
				return;
			case CorePackage.GENERATION_STATE_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case CorePackage.GENERATION_STATE_TYPE__GENERATION_SETTINGS:
				return generationSettings != null;
			case CorePackage.GENERATION_STATE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //GenerationStateTypeImpl
