/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeRef;
import edu.neumont.schemas.orm._2006._04.orm.core.ModelNoteReferencedByType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRef;
import edu.neumont.schemas.orm._2006._04.orm.core.SetComparisonConstraintRef;
import edu.neumont.schemas.orm._2006._04.orm.core.SetConstraintRef;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Note Referenced By Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelNoteReferencedByTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelNoteReferencedByTypeImpl#getFactType <em>Fact Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelNoteReferencedByTypeImpl#getObjectType <em>Object Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelNoteReferencedByTypeImpl#getSetConstraint <em>Set Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelNoteReferencedByTypeImpl#getSetComparisonConstraint <em>Set Comparison Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelNoteReferencedByTypeImpl extends MinimalEObjectImpl.Container implements ModelNoteReferencedByType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelNoteReferencedByTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getModelNoteReferencedByType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FactTypeRef> getFactType() {
		return getGroup().list(CorePackage.eINSTANCE.getModelNoteReferencedByType_FactType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectTypeRef> getObjectType() {
		return getGroup().list(CorePackage.eINSTANCE.getModelNoteReferencedByType_ObjectType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetConstraintRef> getSetConstraint() {
		return getGroup().list(CorePackage.eINSTANCE.getModelNoteReferencedByType_SetConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SetComparisonConstraintRef> getSetComparisonConstraint() {
		return getGroup().list(CorePackage.eINSTANCE.getModelNoteReferencedByType_SetComparisonConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__FACT_TYPE:
				return ((InternalEList<?>)getFactType()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__OBJECT_TYPE:
				return ((InternalEList<?>)getObjectType()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__SET_CONSTRAINT:
				return ((InternalEList<?>)getSetConstraint()).basicRemove(otherEnd, msgs);
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__SET_COMPARISON_CONSTRAINT:
				return ((InternalEList<?>)getSetComparisonConstraint()).basicRemove(otherEnd, msgs);
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
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__FACT_TYPE:
				return getFactType();
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__OBJECT_TYPE:
				return getObjectType();
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__SET_CONSTRAINT:
				return getSetConstraint();
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__SET_COMPARISON_CONSTRAINT:
				return getSetComparisonConstraint();
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
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__FACT_TYPE:
				getFactType().clear();
				getFactType().addAll((Collection<? extends FactTypeRef>)newValue);
				return;
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__OBJECT_TYPE:
				getObjectType().clear();
				getObjectType().addAll((Collection<? extends ObjectTypeRef>)newValue);
				return;
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__SET_CONSTRAINT:
				getSetConstraint().clear();
				getSetConstraint().addAll((Collection<? extends SetConstraintRef>)newValue);
				return;
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__SET_COMPARISON_CONSTRAINT:
				getSetComparisonConstraint().clear();
				getSetComparisonConstraint().addAll((Collection<? extends SetComparisonConstraintRef>)newValue);
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
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__GROUP:
				getGroup().clear();
				return;
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__FACT_TYPE:
				getFactType().clear();
				return;
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__OBJECT_TYPE:
				getObjectType().clear();
				return;
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__SET_CONSTRAINT:
				getSetConstraint().clear();
				return;
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__SET_COMPARISON_CONSTRAINT:
				getSetComparisonConstraint().clear();
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
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__FACT_TYPE:
				return !getFactType().isEmpty();
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__OBJECT_TYPE:
				return !getObjectType().isEmpty();
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__SET_CONSTRAINT:
				return !getSetConstraint().isEmpty();
			case CorePackage.MODEL_NOTE_REFERENCED_BY_TYPE__SET_COMPARISON_CONSTRAINT:
				return !getSetComparisonConstraint().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ModelNoteReferencedByTypeImpl
