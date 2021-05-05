/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ExpandedDataType;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleTextType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expanded Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ExpandedDataTypeImpl#getRoleText <em>Role Text</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ExpandedDataTypeImpl#getFrontText <em>Front Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpandedDataTypeImpl extends MinimalEObjectImpl.Container implements ExpandedDataType {
	/**
	 * The cached value of the '{@link #getRoleText() <em>Role Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleText()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleTextType> roleText;

	/**
	 * The default value of the '{@link #getFrontText() <em>Front Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontText()
	 * @generated
	 * @ordered
	 */
	protected static final String FRONT_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrontText() <em>Front Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontText()
	 * @generated
	 * @ordered
	 */
	protected String frontText = FRONT_TEXT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpandedDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getExpandedDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleTextType> getRoleText() {
		if (roleText == null) {
			roleText = new EObjectContainmentEList<RoleTextType>(RoleTextType.class, this, CorePackage.EXPANDED_DATA_TYPE__ROLE_TEXT);
		}
		return roleText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrontText() {
		return frontText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrontText(String newFrontText) {
		String oldFrontText = frontText;
		frontText = newFrontText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXPANDED_DATA_TYPE__FRONT_TEXT, oldFrontText, frontText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.EXPANDED_DATA_TYPE__ROLE_TEXT:
				return ((InternalEList<?>)getRoleText()).basicRemove(otherEnd, msgs);
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
			case CorePackage.EXPANDED_DATA_TYPE__ROLE_TEXT:
				return getRoleText();
			case CorePackage.EXPANDED_DATA_TYPE__FRONT_TEXT:
				return getFrontText();
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
			case CorePackage.EXPANDED_DATA_TYPE__ROLE_TEXT:
				getRoleText().clear();
				getRoleText().addAll((Collection<? extends RoleTextType>)newValue);
				return;
			case CorePackage.EXPANDED_DATA_TYPE__FRONT_TEXT:
				setFrontText((String)newValue);
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
			case CorePackage.EXPANDED_DATA_TYPE__ROLE_TEXT:
				getRoleText().clear();
				return;
			case CorePackage.EXPANDED_DATA_TYPE__FRONT_TEXT:
				setFrontText(FRONT_TEXT_EDEFAULT);
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
			case CorePackage.EXPANDED_DATA_TYPE__ROLE_TEXT:
				return roleText != null && !roleText.isEmpty();
			case CorePackage.EXPANDED_DATA_TYPE__FRONT_TEXT:
				return FRONT_TEXT_EDEFAULT == null ? frontText != null : !FRONT_TEXT_EDEFAULT.equals(frontText);
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
		result.append(" (frontText: ");
		result.append(frontText);
		result.append(')');
		return result.toString();
	}

} //ExpandedDataTypeImpl
