/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindType;
import edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindsType;

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
 * An implementation of the model object '<em><b>Reference Mode Kinds Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ReferenceModeKindsTypeImpl#getReferenceModeKind <em>Reference Mode Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceModeKindsTypeImpl extends MinimalEObjectImpl.Container implements ReferenceModeKindsType {
	/**
	 * The cached value of the '{@link #getReferenceModeKind() <em>Reference Mode Kind</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceModeKind()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceModeKindType> referenceModeKind;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceModeKindsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getReferenceModeKindsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceModeKindType> getReferenceModeKind() {
		if (referenceModeKind == null) {
			referenceModeKind = new EObjectContainmentEList<ReferenceModeKindType>(ReferenceModeKindType.class, this, CorePackage.REFERENCE_MODE_KINDS_TYPE__REFERENCE_MODE_KIND);
		}
		return referenceModeKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.REFERENCE_MODE_KINDS_TYPE__REFERENCE_MODE_KIND:
				return ((InternalEList<?>)getReferenceModeKind()).basicRemove(otherEnd, msgs);
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
			case CorePackage.REFERENCE_MODE_KINDS_TYPE__REFERENCE_MODE_KIND:
				return getReferenceModeKind();
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
			case CorePackage.REFERENCE_MODE_KINDS_TYPE__REFERENCE_MODE_KIND:
				getReferenceModeKind().clear();
				getReferenceModeKind().addAll((Collection<? extends ReferenceModeKindType>)newValue);
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
			case CorePackage.REFERENCE_MODE_KINDS_TYPE__REFERENCE_MODE_KIND:
				getReferenceModeKind().clear();
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
			case CorePackage.REFERENCE_MODE_KINDS_TYPE__REFERENCE_MODE_KIND:
				return referenceModeKind != null && !referenceModeKind.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReferenceModeKindsTypeImpl
