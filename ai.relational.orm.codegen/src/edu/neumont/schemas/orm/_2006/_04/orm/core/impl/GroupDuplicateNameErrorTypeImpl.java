/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.GroupDuplicateNameErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.GroupsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Duplicate Name Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GroupDuplicateNameErrorTypeImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupDuplicateNameErrorTypeImpl extends ModelErrorImpl implements GroupDuplicateNameErrorType {
	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected GroupsType groups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupDuplicateNameErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getGroupDuplicateNameErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupsType getGroups() {
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroups(GroupsType newGroups, NotificationChain msgs) {
		GroupsType oldGroups = groups;
		groups = newGroups;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.GROUP_DUPLICATE_NAME_ERROR_TYPE__GROUPS, oldGroups, newGroups);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroups(GroupsType newGroups) {
		if (newGroups != groups) {
			NotificationChain msgs = null;
			if (groups != null)
				msgs = ((InternalEObject)groups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.GROUP_DUPLICATE_NAME_ERROR_TYPE__GROUPS, null, msgs);
			if (newGroups != null)
				msgs = ((InternalEObject)newGroups).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.GROUP_DUPLICATE_NAME_ERROR_TYPE__GROUPS, null, msgs);
			msgs = basicSetGroups(newGroups, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GROUP_DUPLICATE_NAME_ERROR_TYPE__GROUPS, newGroups, newGroups));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.GROUP_DUPLICATE_NAME_ERROR_TYPE__GROUPS:
				return basicSetGroups(null, msgs);
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
			case CorePackage.GROUP_DUPLICATE_NAME_ERROR_TYPE__GROUPS:
				return getGroups();
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
			case CorePackage.GROUP_DUPLICATE_NAME_ERROR_TYPE__GROUPS:
				setGroups((GroupsType)newValue);
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
			case CorePackage.GROUP_DUPLICATE_NAME_ERROR_TYPE__GROUPS:
				setGroups((GroupsType)null);
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
			case CorePackage.GROUP_DUPLICATE_NAME_ERROR_TYPE__GROUPS:
				return groups != null;
		}
		return super.eIsSet(featureID);
	}

} //GroupDuplicateNameErrorTypeImpl
