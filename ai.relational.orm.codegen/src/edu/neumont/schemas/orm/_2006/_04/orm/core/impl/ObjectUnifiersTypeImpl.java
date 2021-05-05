/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifierType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifiersType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Unifiers Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectUnifiersTypeImpl#getObjectUnifier <em>Object Unifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectUnifiersTypeImpl extends MinimalEObjectImpl.Container implements ObjectUnifiersType {
	/**
	 * The cached value of the '{@link #getObjectUnifier() <em>Object Unifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectUnifier()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectUnifierType> objectUnifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectUnifiersTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getObjectUnifiersType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectUnifierType> getObjectUnifier() {
		if (objectUnifier == null) {
			objectUnifier = new EObjectContainmentEList<ObjectUnifierType>(ObjectUnifierType.class, this, CorePackage.OBJECT_UNIFIERS_TYPE__OBJECT_UNIFIER);
		}
		return objectUnifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.OBJECT_UNIFIERS_TYPE__OBJECT_UNIFIER:
				return ((InternalEList<?>)getObjectUnifier()).basicRemove(otherEnd, msgs);
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
			case CorePackage.OBJECT_UNIFIERS_TYPE__OBJECT_UNIFIER:
				return getObjectUnifier();
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
			case CorePackage.OBJECT_UNIFIERS_TYPE__OBJECT_UNIFIER:
				getObjectUnifier().clear();
				getObjectUnifier().addAll((Collection<? extends ObjectUnifierType>)newValue);
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
			case CorePackage.OBJECT_UNIFIERS_TYPE__OBJECT_UNIFIER:
				getObjectUnifier().clear();
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
			case CorePackage.OBJECT_UNIFIERS_TYPE__OBJECT_UNIFIER:
				return objectUnifier != null && !objectUnifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectUnifiersTypeImpl
