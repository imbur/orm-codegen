/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.GroupingType;
import edu.neumont.schemas.orm._2006._04.orm.core.GroupsType1;
import edu.neumont.schemas.orm._2006._04.orm.core.ORMModelRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grouping Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GroupingTypeImpl#getORMModel <em>ORM Model</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GroupingTypeImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GroupingTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupingTypeImpl extends MinimalEObjectImpl.Container implements GroupingType {
	/**
	 * The cached value of the '{@link #getORMModel() <em>ORM Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORMModel()
	 * @generated
	 * @ordered
	 */
	protected ORMModelRef oRMModel;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected GroupsType1 groups;

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
	protected GroupingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getGroupingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORMModelRef getORMModel() {
		return oRMModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORMModel(ORMModelRef newORMModel, NotificationChain msgs) {
		ORMModelRef oldORMModel = oRMModel;
		oRMModel = newORMModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.GROUPING_TYPE__ORM_MODEL, oldORMModel, newORMModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORMModel(ORMModelRef newORMModel) {
		if (newORMModel != oRMModel) {
			NotificationChain msgs = null;
			if (oRMModel != null)
				msgs = ((InternalEObject)oRMModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.GROUPING_TYPE__ORM_MODEL, null, msgs);
			if (newORMModel != null)
				msgs = ((InternalEObject)newORMModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.GROUPING_TYPE__ORM_MODEL, null, msgs);
			msgs = basicSetORMModel(newORMModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GROUPING_TYPE__ORM_MODEL, newORMModel, newORMModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupsType1 getGroups() {
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroups(GroupsType1 newGroups, NotificationChain msgs) {
		GroupsType1 oldGroups = groups;
		groups = newGroups;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.GROUPING_TYPE__GROUPS, oldGroups, newGroups);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroups(GroupsType1 newGroups) {
		if (newGroups != groups) {
			NotificationChain msgs = null;
			if (groups != null)
				msgs = ((InternalEObject)groups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.GROUPING_TYPE__GROUPS, null, msgs);
			if (newGroups != null)
				msgs = ((InternalEObject)newGroups).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.GROUPING_TYPE__GROUPS, null, msgs);
			msgs = basicSetGroups(newGroups, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GROUPING_TYPE__GROUPS, newGroups, newGroups));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GROUPING_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.GROUPING_TYPE__ORM_MODEL:
				return basicSetORMModel(null, msgs);
			case CorePackage.GROUPING_TYPE__GROUPS:
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
			case CorePackage.GROUPING_TYPE__ORM_MODEL:
				return getORMModel();
			case CorePackage.GROUPING_TYPE__GROUPS:
				return getGroups();
			case CorePackage.GROUPING_TYPE__ID:
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
			case CorePackage.GROUPING_TYPE__ORM_MODEL:
				setORMModel((ORMModelRef)newValue);
				return;
			case CorePackage.GROUPING_TYPE__GROUPS:
				setGroups((GroupsType1)newValue);
				return;
			case CorePackage.GROUPING_TYPE__ID:
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
			case CorePackage.GROUPING_TYPE__ORM_MODEL:
				setORMModel((ORMModelRef)null);
				return;
			case CorePackage.GROUPING_TYPE__GROUPS:
				setGroups((GroupsType1)null);
				return;
			case CorePackage.GROUPING_TYPE__ID:
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
			case CorePackage.GROUPING_TYPE__ORM_MODEL:
				return oRMModel != null;
			case CorePackage.GROUPING_TYPE__GROUPS:
				return groups != null;
			case CorePackage.GROUPING_TYPE__ID:
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

} //GroupingTypeImpl
