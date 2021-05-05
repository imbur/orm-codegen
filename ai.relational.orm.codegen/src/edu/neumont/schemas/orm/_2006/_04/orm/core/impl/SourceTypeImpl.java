/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueRef;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.PathConstantType;
import edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleRef;
import edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeRef;
import edu.neumont.schemas.orm._2006._04.orm.core.SourceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SourceTypeImpl#getPathRoot <em>Path Root</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SourceTypeImpl#getPathedRole <em>Pathed Role</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SourceTypeImpl#getCalculatedValue <em>Calculated Value</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.SourceTypeImpl#getConstant <em>Constant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceTypeImpl extends MinimalEObjectImpl.Container implements SourceType {
	/**
	 * The cached value of the '{@link #getPathRoot() <em>Path Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathRoot()
	 * @generated
	 * @ordered
	 */
	protected RootObjectTypeRef pathRoot;

	/**
	 * The cached value of the '{@link #getPathedRole() <em>Pathed Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathedRole()
	 * @generated
	 * @ordered
	 */
	protected PathedRoleRef pathedRole;

	/**
	 * The cached value of the '{@link #getCalculatedValue() <em>Calculated Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculatedValue()
	 * @generated
	 * @ordered
	 */
	protected CalculatedValueRef calculatedValue;

	/**
	 * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstant()
	 * @generated
	 * @ordered
	 */
	protected PathConstantType constant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getSourceType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootObjectTypeRef getPathRoot() {
		return pathRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathRoot(RootObjectTypeRef newPathRoot, NotificationChain msgs) {
		RootObjectTypeRef oldPathRoot = pathRoot;
		pathRoot = newPathRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SOURCE_TYPE__PATH_ROOT, oldPathRoot, newPathRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathRoot(RootObjectTypeRef newPathRoot) {
		if (newPathRoot != pathRoot) {
			NotificationChain msgs = null;
			if (pathRoot != null)
				msgs = ((InternalEObject)pathRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SOURCE_TYPE__PATH_ROOT, null, msgs);
			if (newPathRoot != null)
				msgs = ((InternalEObject)newPathRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SOURCE_TYPE__PATH_ROOT, null, msgs);
			msgs = basicSetPathRoot(newPathRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SOURCE_TYPE__PATH_ROOT, newPathRoot, newPathRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathedRoleRef getPathedRole() {
		return pathedRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathedRole(PathedRoleRef newPathedRole, NotificationChain msgs) {
		PathedRoleRef oldPathedRole = pathedRole;
		pathedRole = newPathedRole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SOURCE_TYPE__PATHED_ROLE, oldPathedRole, newPathedRole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathedRole(PathedRoleRef newPathedRole) {
		if (newPathedRole != pathedRole) {
			NotificationChain msgs = null;
			if (pathedRole != null)
				msgs = ((InternalEObject)pathedRole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SOURCE_TYPE__PATHED_ROLE, null, msgs);
			if (newPathedRole != null)
				msgs = ((InternalEObject)newPathedRole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SOURCE_TYPE__PATHED_ROLE, null, msgs);
			msgs = basicSetPathedRole(newPathedRole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SOURCE_TYPE__PATHED_ROLE, newPathedRole, newPathedRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedValueRef getCalculatedValue() {
		return calculatedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculatedValue(CalculatedValueRef newCalculatedValue, NotificationChain msgs) {
		CalculatedValueRef oldCalculatedValue = calculatedValue;
		calculatedValue = newCalculatedValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SOURCE_TYPE__CALCULATED_VALUE, oldCalculatedValue, newCalculatedValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculatedValue(CalculatedValueRef newCalculatedValue) {
		if (newCalculatedValue != calculatedValue) {
			NotificationChain msgs = null;
			if (calculatedValue != null)
				msgs = ((InternalEObject)calculatedValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SOURCE_TYPE__CALCULATED_VALUE, null, msgs);
			if (newCalculatedValue != null)
				msgs = ((InternalEObject)newCalculatedValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SOURCE_TYPE__CALCULATED_VALUE, null, msgs);
			msgs = basicSetCalculatedValue(newCalculatedValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SOURCE_TYPE__CALCULATED_VALUE, newCalculatedValue, newCalculatedValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathConstantType getConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstant(PathConstantType newConstant, NotificationChain msgs) {
		PathConstantType oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SOURCE_TYPE__CONSTANT, oldConstant, newConstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstant(PathConstantType newConstant) {
		if (newConstant != constant) {
			NotificationChain msgs = null;
			if (constant != null)
				msgs = ((InternalEObject)constant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SOURCE_TYPE__CONSTANT, null, msgs);
			if (newConstant != null)
				msgs = ((InternalEObject)newConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SOURCE_TYPE__CONSTANT, null, msgs);
			msgs = basicSetConstant(newConstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SOURCE_TYPE__CONSTANT, newConstant, newConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SOURCE_TYPE__PATH_ROOT:
				return basicSetPathRoot(null, msgs);
			case CorePackage.SOURCE_TYPE__PATHED_ROLE:
				return basicSetPathedRole(null, msgs);
			case CorePackage.SOURCE_TYPE__CALCULATED_VALUE:
				return basicSetCalculatedValue(null, msgs);
			case CorePackage.SOURCE_TYPE__CONSTANT:
				return basicSetConstant(null, msgs);
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
			case CorePackage.SOURCE_TYPE__PATH_ROOT:
				return getPathRoot();
			case CorePackage.SOURCE_TYPE__PATHED_ROLE:
				return getPathedRole();
			case CorePackage.SOURCE_TYPE__CALCULATED_VALUE:
				return getCalculatedValue();
			case CorePackage.SOURCE_TYPE__CONSTANT:
				return getConstant();
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
			case CorePackage.SOURCE_TYPE__PATH_ROOT:
				setPathRoot((RootObjectTypeRef)newValue);
				return;
			case CorePackage.SOURCE_TYPE__PATHED_ROLE:
				setPathedRole((PathedRoleRef)newValue);
				return;
			case CorePackage.SOURCE_TYPE__CALCULATED_VALUE:
				setCalculatedValue((CalculatedValueRef)newValue);
				return;
			case CorePackage.SOURCE_TYPE__CONSTANT:
				setConstant((PathConstantType)newValue);
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
			case CorePackage.SOURCE_TYPE__PATH_ROOT:
				setPathRoot((RootObjectTypeRef)null);
				return;
			case CorePackage.SOURCE_TYPE__PATHED_ROLE:
				setPathedRole((PathedRoleRef)null);
				return;
			case CorePackage.SOURCE_TYPE__CALCULATED_VALUE:
				setCalculatedValue((CalculatedValueRef)null);
				return;
			case CorePackage.SOURCE_TYPE__CONSTANT:
				setConstant((PathConstantType)null);
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
			case CorePackage.SOURCE_TYPE__PATH_ROOT:
				return pathRoot != null;
			case CorePackage.SOURCE_TYPE__PATHED_ROLE:
				return pathedRole != null;
			case CorePackage.SOURCE_TYPE__CALCULATED_VALUE:
				return calculatedValue != null;
			case CorePackage.SOURCE_TYPE__CONSTANT:
				return constant != null;
		}
		return super.eIsSet(featureID);
	}

} //SourceTypeImpl
