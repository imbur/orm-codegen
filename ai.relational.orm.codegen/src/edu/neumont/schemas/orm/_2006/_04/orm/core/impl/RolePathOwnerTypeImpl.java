/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValuesType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.PathComponentType;
import edu.neumont.schemas.orm._2006._04.orm.core.PathComponentsType;
import edu.neumont.schemas.orm._2006._04.orm.core.RolePathOwnerType;
import edu.neumont.schemas.orm._2006._04.orm.core.SubqueriesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Path Owner Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RolePathOwnerTypeImpl#getPathComponents <em>Path Components</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RolePathOwnerTypeImpl#getPathComponent <em>Path Component</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RolePathOwnerTypeImpl#getCalculatedValues <em>Calculated Values</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RolePathOwnerTypeImpl#getSubqueries <em>Subqueries</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RolePathOwnerTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RolePathOwnerTypeImpl extends MinimalEObjectImpl.Container implements RolePathOwnerType {
	/**
	 * The cached value of the '{@link #getPathComponents() <em>Path Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathComponents()
	 * @generated
	 * @ordered
	 */
	protected PathComponentsType pathComponents;

	/**
	 * The cached value of the '{@link #getPathComponent() <em>Path Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathComponent()
	 * @generated
	 * @ordered
	 */
	protected PathComponentType pathComponent;

	/**
	 * The cached value of the '{@link #getCalculatedValues() <em>Calculated Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculatedValues()
	 * @generated
	 * @ordered
	 */
	protected CalculatedValuesType calculatedValues;

	/**
	 * The cached value of the '{@link #getSubqueries() <em>Subqueries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubqueries()
	 * @generated
	 * @ordered
	 */
	protected SubqueriesType subqueries;

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
	protected RolePathOwnerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getRolePathOwnerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathComponentsType getPathComponents() {
		return pathComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathComponents(PathComponentsType newPathComponents, NotificationChain msgs) {
		PathComponentsType oldPathComponents = pathComponents;
		pathComponents = newPathComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_PATH_OWNER_TYPE__PATH_COMPONENTS, oldPathComponents, newPathComponents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathComponents(PathComponentsType newPathComponents) {
		if (newPathComponents != pathComponents) {
			NotificationChain msgs = null;
			if (pathComponents != null)
				msgs = ((InternalEObject)pathComponents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_PATH_OWNER_TYPE__PATH_COMPONENTS, null, msgs);
			if (newPathComponents != null)
				msgs = ((InternalEObject)newPathComponents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_PATH_OWNER_TYPE__PATH_COMPONENTS, null, msgs);
			msgs = basicSetPathComponents(newPathComponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_PATH_OWNER_TYPE__PATH_COMPONENTS, newPathComponents, newPathComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathComponentType getPathComponent() {
		return pathComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathComponent(PathComponentType newPathComponent, NotificationChain msgs) {
		PathComponentType oldPathComponent = pathComponent;
		pathComponent = newPathComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_PATH_OWNER_TYPE__PATH_COMPONENT, oldPathComponent, newPathComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathComponent(PathComponentType newPathComponent) {
		if (newPathComponent != pathComponent) {
			NotificationChain msgs = null;
			if (pathComponent != null)
				msgs = ((InternalEObject)pathComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_PATH_OWNER_TYPE__PATH_COMPONENT, null, msgs);
			if (newPathComponent != null)
				msgs = ((InternalEObject)newPathComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_PATH_OWNER_TYPE__PATH_COMPONENT, null, msgs);
			msgs = basicSetPathComponent(newPathComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_PATH_OWNER_TYPE__PATH_COMPONENT, newPathComponent, newPathComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedValuesType getCalculatedValues() {
		return calculatedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculatedValues(CalculatedValuesType newCalculatedValues, NotificationChain msgs) {
		CalculatedValuesType oldCalculatedValues = calculatedValues;
		calculatedValues = newCalculatedValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_PATH_OWNER_TYPE__CALCULATED_VALUES, oldCalculatedValues, newCalculatedValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculatedValues(CalculatedValuesType newCalculatedValues) {
		if (newCalculatedValues != calculatedValues) {
			NotificationChain msgs = null;
			if (calculatedValues != null)
				msgs = ((InternalEObject)calculatedValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_PATH_OWNER_TYPE__CALCULATED_VALUES, null, msgs);
			if (newCalculatedValues != null)
				msgs = ((InternalEObject)newCalculatedValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_PATH_OWNER_TYPE__CALCULATED_VALUES, null, msgs);
			msgs = basicSetCalculatedValues(newCalculatedValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_PATH_OWNER_TYPE__CALCULATED_VALUES, newCalculatedValues, newCalculatedValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubqueriesType getSubqueries() {
		return subqueries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubqueries(SubqueriesType newSubqueries, NotificationChain msgs) {
		SubqueriesType oldSubqueries = subqueries;
		subqueries = newSubqueries;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_PATH_OWNER_TYPE__SUBQUERIES, oldSubqueries, newSubqueries);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubqueries(SubqueriesType newSubqueries) {
		if (newSubqueries != subqueries) {
			NotificationChain msgs = null;
			if (subqueries != null)
				msgs = ((InternalEObject)subqueries).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_PATH_OWNER_TYPE__SUBQUERIES, null, msgs);
			if (newSubqueries != null)
				msgs = ((InternalEObject)newSubqueries).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_PATH_OWNER_TYPE__SUBQUERIES, null, msgs);
			msgs = basicSetSubqueries(newSubqueries, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_PATH_OWNER_TYPE__SUBQUERIES, newSubqueries, newSubqueries));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_PATH_OWNER_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ROLE_PATH_OWNER_TYPE__PATH_COMPONENTS:
				return basicSetPathComponents(null, msgs);
			case CorePackage.ROLE_PATH_OWNER_TYPE__PATH_COMPONENT:
				return basicSetPathComponent(null, msgs);
			case CorePackage.ROLE_PATH_OWNER_TYPE__CALCULATED_VALUES:
				return basicSetCalculatedValues(null, msgs);
			case CorePackage.ROLE_PATH_OWNER_TYPE__SUBQUERIES:
				return basicSetSubqueries(null, msgs);
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
			case CorePackage.ROLE_PATH_OWNER_TYPE__PATH_COMPONENTS:
				return getPathComponents();
			case CorePackage.ROLE_PATH_OWNER_TYPE__PATH_COMPONENT:
				return getPathComponent();
			case CorePackage.ROLE_PATH_OWNER_TYPE__CALCULATED_VALUES:
				return getCalculatedValues();
			case CorePackage.ROLE_PATH_OWNER_TYPE__SUBQUERIES:
				return getSubqueries();
			case CorePackage.ROLE_PATH_OWNER_TYPE__ID:
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
			case CorePackage.ROLE_PATH_OWNER_TYPE__PATH_COMPONENTS:
				setPathComponents((PathComponentsType)newValue);
				return;
			case CorePackage.ROLE_PATH_OWNER_TYPE__PATH_COMPONENT:
				setPathComponent((PathComponentType)newValue);
				return;
			case CorePackage.ROLE_PATH_OWNER_TYPE__CALCULATED_VALUES:
				setCalculatedValues((CalculatedValuesType)newValue);
				return;
			case CorePackage.ROLE_PATH_OWNER_TYPE__SUBQUERIES:
				setSubqueries((SubqueriesType)newValue);
				return;
			case CorePackage.ROLE_PATH_OWNER_TYPE__ID:
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
			case CorePackage.ROLE_PATH_OWNER_TYPE__PATH_COMPONENTS:
				setPathComponents((PathComponentsType)null);
				return;
			case CorePackage.ROLE_PATH_OWNER_TYPE__PATH_COMPONENT:
				setPathComponent((PathComponentType)null);
				return;
			case CorePackage.ROLE_PATH_OWNER_TYPE__CALCULATED_VALUES:
				setCalculatedValues((CalculatedValuesType)null);
				return;
			case CorePackage.ROLE_PATH_OWNER_TYPE__SUBQUERIES:
				setSubqueries((SubqueriesType)null);
				return;
			case CorePackage.ROLE_PATH_OWNER_TYPE__ID:
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
			case CorePackage.ROLE_PATH_OWNER_TYPE__PATH_COMPONENTS:
				return pathComponents != null;
			case CorePackage.ROLE_PATH_OWNER_TYPE__PATH_COMPONENT:
				return pathComponent != null;
			case CorePackage.ROLE_PATH_OWNER_TYPE__CALCULATED_VALUES:
				return calculatedValues != null;
			case CorePackage.ROLE_PATH_OWNER_TYPE__SUBQUERIES:
				return subqueries != null;
			case CorePackage.ROLE_PATH_OWNER_TYPE__ID:
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

} //RolePathOwnerTypeImpl
