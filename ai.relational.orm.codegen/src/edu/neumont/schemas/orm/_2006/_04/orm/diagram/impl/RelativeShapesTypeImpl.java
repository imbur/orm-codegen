/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram.impl;

import edu.neumont.schemas.orm._2006._04.orm.diagram.CardinalityConstraintShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ReadingShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.RoleNameShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType;

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
 * An implementation of the model object '<em><b>Relative Shapes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RelativeShapesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RelativeShapesTypeImpl#getObjectifiedFactTypeNameShape <em>Objectified Fact Type Name Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RelativeShapesTypeImpl#getReadingShape <em>Reading Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RelativeShapesTypeImpl#getValueConstraintShape <em>Value Constraint Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RelativeShapesTypeImpl#getRoleNameShape <em>Role Name Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RelativeShapesTypeImpl#getCardinalityConstraintShape <em>Cardinality Constraint Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RelativeShapesTypeImpl#getFactTypeRelativeExtensionShapeGroup <em>Fact Type Relative Extension Shape Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RelativeShapesTypeImpl#getFactTypeRelativeExtensionShape <em>Fact Type Relative Extension Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativeShapesTypeImpl extends MinimalEObjectImpl.Container implements RelativeShapesType {
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
	protected RelativeShapesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.RELATIVE_SHAPES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DiagramPackage.RELATIVE_SHAPES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectTypeShapeType> getObjectifiedFactTypeNameShape() {
		return getGroup().list(DiagramPackage.Literals.RELATIVE_SHAPES_TYPE__OBJECTIFIED_FACT_TYPE_NAME_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReadingShapeType> getReadingShape() {
		return getGroup().list(DiagramPackage.Literals.RELATIVE_SHAPES_TYPE__READING_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueConstraintShapeType> getValueConstraintShape() {
		return getGroup().list(DiagramPackage.Literals.RELATIVE_SHAPES_TYPE__VALUE_CONSTRAINT_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleNameShapeType> getRoleNameShape() {
		return getGroup().list(DiagramPackage.Literals.RELATIVE_SHAPES_TYPE__ROLE_NAME_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CardinalityConstraintShapeType> getCardinalityConstraintShape() {
		return getGroup().list(DiagramPackage.Literals.RELATIVE_SHAPES_TYPE__CARDINALITY_CONSTRAINT_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getFactTypeRelativeExtensionShapeGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(DiagramPackage.Literals.RELATIVE_SHAPES_TYPE__FACT_TYPE_RELATIVE_EXTENSION_SHAPE_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ShapeType> getFactTypeRelativeExtensionShape() {
		return getFactTypeRelativeExtensionShapeGroup().list(DiagramPackage.Literals.RELATIVE_SHAPES_TYPE__FACT_TYPE_RELATIVE_EXTENSION_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramPackage.RELATIVE_SHAPES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DiagramPackage.RELATIVE_SHAPES_TYPE__OBJECTIFIED_FACT_TYPE_NAME_SHAPE:
				return ((InternalEList<?>)getObjectifiedFactTypeNameShape()).basicRemove(otherEnd, msgs);
			case DiagramPackage.RELATIVE_SHAPES_TYPE__READING_SHAPE:
				return ((InternalEList<?>)getReadingShape()).basicRemove(otherEnd, msgs);
			case DiagramPackage.RELATIVE_SHAPES_TYPE__VALUE_CONSTRAINT_SHAPE:
				return ((InternalEList<?>)getValueConstraintShape()).basicRemove(otherEnd, msgs);
			case DiagramPackage.RELATIVE_SHAPES_TYPE__ROLE_NAME_SHAPE:
				return ((InternalEList<?>)getRoleNameShape()).basicRemove(otherEnd, msgs);
			case DiagramPackage.RELATIVE_SHAPES_TYPE__CARDINALITY_CONSTRAINT_SHAPE:
				return ((InternalEList<?>)getCardinalityConstraintShape()).basicRemove(otherEnd, msgs);
			case DiagramPackage.RELATIVE_SHAPES_TYPE__FACT_TYPE_RELATIVE_EXTENSION_SHAPE_GROUP:
				return ((InternalEList<?>)getFactTypeRelativeExtensionShapeGroup()).basicRemove(otherEnd, msgs);
			case DiagramPackage.RELATIVE_SHAPES_TYPE__FACT_TYPE_RELATIVE_EXTENSION_SHAPE:
				return ((InternalEList<?>)getFactTypeRelativeExtensionShape()).basicRemove(otherEnd, msgs);
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
			case DiagramPackage.RELATIVE_SHAPES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DiagramPackage.RELATIVE_SHAPES_TYPE__OBJECTIFIED_FACT_TYPE_NAME_SHAPE:
				return getObjectifiedFactTypeNameShape();
			case DiagramPackage.RELATIVE_SHAPES_TYPE__READING_SHAPE:
				return getReadingShape();
			case DiagramPackage.RELATIVE_SHAPES_TYPE__VALUE_CONSTRAINT_SHAPE:
				return getValueConstraintShape();
			case DiagramPackage.RELATIVE_SHAPES_TYPE__ROLE_NAME_SHAPE:
				return getRoleNameShape();
			case DiagramPackage.RELATIVE_SHAPES_TYPE__CARDINALITY_CONSTRAINT_SHAPE:
				return getCardinalityConstraintShape();
			case DiagramPackage.RELATIVE_SHAPES_TYPE__FACT_TYPE_RELATIVE_EXTENSION_SHAPE_GROUP:
				if (coreType) return getFactTypeRelativeExtensionShapeGroup();
				return ((FeatureMap.Internal)getFactTypeRelativeExtensionShapeGroup()).getWrapper();
			case DiagramPackage.RELATIVE_SHAPES_TYPE__FACT_TYPE_RELATIVE_EXTENSION_SHAPE:
				return getFactTypeRelativeExtensionShape();
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
			case DiagramPackage.RELATIVE_SHAPES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DiagramPackage.RELATIVE_SHAPES_TYPE__OBJECTIFIED_FACT_TYPE_NAME_SHAPE:
				getObjectifiedFactTypeNameShape().clear();
				getObjectifiedFactTypeNameShape().addAll((Collection<? extends ObjectTypeShapeType>)newValue);
				return;
			case DiagramPackage.RELATIVE_SHAPES_TYPE__READING_SHAPE:
				getReadingShape().clear();
				getReadingShape().addAll((Collection<? extends ReadingShapeType>)newValue);
				return;
			case DiagramPackage.RELATIVE_SHAPES_TYPE__VALUE_CONSTRAINT_SHAPE:
				getValueConstraintShape().clear();
				getValueConstraintShape().addAll((Collection<? extends ValueConstraintShapeType>)newValue);
				return;
			case DiagramPackage.RELATIVE_SHAPES_TYPE__ROLE_NAME_SHAPE:
				getRoleNameShape().clear();
				getRoleNameShape().addAll((Collection<? extends RoleNameShapeType>)newValue);
				return;
			case DiagramPackage.RELATIVE_SHAPES_TYPE__CARDINALITY_CONSTRAINT_SHAPE:
				getCardinalityConstraintShape().clear();
				getCardinalityConstraintShape().addAll((Collection<? extends CardinalityConstraintShapeType>)newValue);
				return;
			case DiagramPackage.RELATIVE_SHAPES_TYPE__FACT_TYPE_RELATIVE_EXTENSION_SHAPE_GROUP:
				((FeatureMap.Internal)getFactTypeRelativeExtensionShapeGroup()).set(newValue);
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
			case DiagramPackage.RELATIVE_SHAPES_TYPE__GROUP:
				getGroup().clear();
				return;
			case DiagramPackage.RELATIVE_SHAPES_TYPE__OBJECTIFIED_FACT_TYPE_NAME_SHAPE:
				getObjectifiedFactTypeNameShape().clear();
				return;
			case DiagramPackage.RELATIVE_SHAPES_TYPE__READING_SHAPE:
				getReadingShape().clear();
				return;
			case DiagramPackage.RELATIVE_SHAPES_TYPE__VALUE_CONSTRAINT_SHAPE:
				getValueConstraintShape().clear();
				return;
			case DiagramPackage.RELATIVE_SHAPES_TYPE__ROLE_NAME_SHAPE:
				getRoleNameShape().clear();
				return;
			case DiagramPackage.RELATIVE_SHAPES_TYPE__CARDINALITY_CONSTRAINT_SHAPE:
				getCardinalityConstraintShape().clear();
				return;
			case DiagramPackage.RELATIVE_SHAPES_TYPE__FACT_TYPE_RELATIVE_EXTENSION_SHAPE_GROUP:
				getFactTypeRelativeExtensionShapeGroup().clear();
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
			case DiagramPackage.RELATIVE_SHAPES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DiagramPackage.RELATIVE_SHAPES_TYPE__OBJECTIFIED_FACT_TYPE_NAME_SHAPE:
				return !getObjectifiedFactTypeNameShape().isEmpty();
			case DiagramPackage.RELATIVE_SHAPES_TYPE__READING_SHAPE:
				return !getReadingShape().isEmpty();
			case DiagramPackage.RELATIVE_SHAPES_TYPE__VALUE_CONSTRAINT_SHAPE:
				return !getValueConstraintShape().isEmpty();
			case DiagramPackage.RELATIVE_SHAPES_TYPE__ROLE_NAME_SHAPE:
				return !getRoleNameShape().isEmpty();
			case DiagramPackage.RELATIVE_SHAPES_TYPE__CARDINALITY_CONSTRAINT_SHAPE:
				return !getCardinalityConstraintShape().isEmpty();
			case DiagramPackage.RELATIVE_SHAPES_TYPE__FACT_TYPE_RELATIVE_EXTENSION_SHAPE_GROUP:
				return !getFactTypeRelativeExtensionShapeGroup().isEmpty();
			case DiagramPackage.RELATIVE_SHAPES_TYPE__FACT_TYPE_RELATIVE_EXTENSION_SHAPE:
				return !getFactTypeRelativeExtensionShape().isEmpty();
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

} //RelativeShapesTypeImpl
