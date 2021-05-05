/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.FunctionDuplicateNameErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.FunctionsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Duplicate Name Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FunctionDuplicateNameErrorTypeImpl#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionDuplicateNameErrorTypeImpl extends ModelErrorImpl implements FunctionDuplicateNameErrorType {
	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected FunctionsType functions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionDuplicateNameErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getFunctionDuplicateNameErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsType getFunctions() {
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctions(FunctionsType newFunctions, NotificationChain msgs) {
		FunctionsType oldFunctions = functions;
		functions = newFunctions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FUNCTION_DUPLICATE_NAME_ERROR_TYPE__FUNCTIONS, oldFunctions, newFunctions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctions(FunctionsType newFunctions) {
		if (newFunctions != functions) {
			NotificationChain msgs = null;
			if (functions != null)
				msgs = ((InternalEObject)functions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FUNCTION_DUPLICATE_NAME_ERROR_TYPE__FUNCTIONS, null, msgs);
			if (newFunctions != null)
				msgs = ((InternalEObject)newFunctions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FUNCTION_DUPLICATE_NAME_ERROR_TYPE__FUNCTIONS, null, msgs);
			msgs = basicSetFunctions(newFunctions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FUNCTION_DUPLICATE_NAME_ERROR_TYPE__FUNCTIONS, newFunctions, newFunctions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FUNCTION_DUPLICATE_NAME_ERROR_TYPE__FUNCTIONS:
				return basicSetFunctions(null, msgs);
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
			case CorePackage.FUNCTION_DUPLICATE_NAME_ERROR_TYPE__FUNCTIONS:
				return getFunctions();
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
			case CorePackage.FUNCTION_DUPLICATE_NAME_ERROR_TYPE__FUNCTIONS:
				setFunctions((FunctionsType)newValue);
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
			case CorePackage.FUNCTION_DUPLICATE_NAME_ERROR_TYPE__FUNCTIONS:
				setFunctions((FunctionsType)null);
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
			case CorePackage.FUNCTION_DUPLICATE_NAME_ERROR_TYPE__FUNCTIONS:
				return functions != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionDuplicateNameErrorTypeImpl
