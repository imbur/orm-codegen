/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DynamicColorType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Color Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DynamicColorTypeImpl#getColorRole <em>Color Role</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DynamicColorTypeImpl#getColorValue <em>Color Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DynamicColorTypeImpl extends MinimalEObjectImpl.Container implements DynamicColorType {
	/**
	 * The default value of the '{@link #getColorRole() <em>Color Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorRole()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColorRole() <em>Color Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorRole()
	 * @generated
	 * @ordered
	 */
	protected String colorRole = COLOR_ROLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColorValue() <em>Color Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorValue()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColorValue() <em>Color Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColorValue()
	 * @generated
	 * @ordered
	 */
	protected String colorValue = COLOR_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicColorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getDynamicColorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColorRole() {
		return colorRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorRole(String newColorRole) {
		String oldColorRole = colorRole;
		colorRole = newColorRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DYNAMIC_COLOR_TYPE__COLOR_ROLE, oldColorRole, colorRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColorValue() {
		return colorValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColorValue(String newColorValue) {
		String oldColorValue = colorValue;
		colorValue = newColorValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DYNAMIC_COLOR_TYPE__COLOR_VALUE, oldColorValue, colorValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.DYNAMIC_COLOR_TYPE__COLOR_ROLE:
				return getColorRole();
			case CorePackage.DYNAMIC_COLOR_TYPE__COLOR_VALUE:
				return getColorValue();
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
			case CorePackage.DYNAMIC_COLOR_TYPE__COLOR_ROLE:
				setColorRole((String)newValue);
				return;
			case CorePackage.DYNAMIC_COLOR_TYPE__COLOR_VALUE:
				setColorValue((String)newValue);
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
			case CorePackage.DYNAMIC_COLOR_TYPE__COLOR_ROLE:
				setColorRole(COLOR_ROLE_EDEFAULT);
				return;
			case CorePackage.DYNAMIC_COLOR_TYPE__COLOR_VALUE:
				setColorValue(COLOR_VALUE_EDEFAULT);
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
			case CorePackage.DYNAMIC_COLOR_TYPE__COLOR_ROLE:
				return COLOR_ROLE_EDEFAULT == null ? colorRole != null : !COLOR_ROLE_EDEFAULT.equals(colorRole);
			case CorePackage.DYNAMIC_COLOR_TYPE__COLOR_VALUE:
				return COLOR_VALUE_EDEFAULT == null ? colorValue != null : !COLOR_VALUE_EDEFAULT.equals(colorValue);
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
		result.append(" (colorRole: ");
		result.append(colorRole);
		result.append(", colorValue: ");
		result.append(colorValue);
		result.append(')');
		return result.toString();
	}

} //DynamicColorTypeImpl
