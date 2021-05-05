/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram.impl;

import edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ExternalConstraintShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.FrequencyConstraintShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ModelNoteShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.RingConstraintShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ValueComparisonConstraintShapeType;

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
 * An implementation of the model object '<em><b>Shapes Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapesTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapesTypeImpl#getObjectTypeShape <em>Object Type Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapesTypeImpl#getFactTypeShape <em>Fact Type Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapesTypeImpl#getExternalConstraintShape <em>External Constraint Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapesTypeImpl#getFrequencyConstraintShape <em>Frequency Constraint Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapesTypeImpl#getRingConstraintShape <em>Ring Constraint Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapesTypeImpl#getValueComparisonConstraintShape <em>Value Comparison Constraint Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapesTypeImpl#getModelNoteShape <em>Model Note Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapesTypeImpl#getDiagramExtensionShapeGroup <em>Diagram Extension Shape Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapesTypeImpl#getDiagramExtensionShape <em>Diagram Extension Shape</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShapesTypeImpl extends MinimalEObjectImpl.Container implements ShapesType {
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
	protected ShapesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.SHAPES_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DiagramPackage.SHAPES_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectTypeShapeType> getObjectTypeShape() {
		return getGroup().list(DiagramPackage.Literals.SHAPES_TYPE__OBJECT_TYPE_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FactTypeShapeType> getFactTypeShape() {
		return getGroup().list(DiagramPackage.Literals.SHAPES_TYPE__FACT_TYPE_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalConstraintShapeType> getExternalConstraintShape() {
		return getGroup().list(DiagramPackage.Literals.SHAPES_TYPE__EXTERNAL_CONSTRAINT_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrequencyConstraintShapeType> getFrequencyConstraintShape() {
		return getGroup().list(DiagramPackage.Literals.SHAPES_TYPE__FREQUENCY_CONSTRAINT_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RingConstraintShapeType> getRingConstraintShape() {
		return getGroup().list(DiagramPackage.Literals.SHAPES_TYPE__RING_CONSTRAINT_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueComparisonConstraintShapeType> getValueComparisonConstraintShape() {
		return getGroup().list(DiagramPackage.Literals.SHAPES_TYPE__VALUE_COMPARISON_CONSTRAINT_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelNoteShapeType> getModelNoteShape() {
		return getGroup().list(DiagramPackage.Literals.SHAPES_TYPE__MODEL_NOTE_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getDiagramExtensionShapeGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(DiagramPackage.Literals.SHAPES_TYPE__DIAGRAM_EXTENSION_SHAPE_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ShapeType> getDiagramExtensionShape() {
		return getDiagramExtensionShapeGroup().list(DiagramPackage.Literals.SHAPES_TYPE__DIAGRAM_EXTENSION_SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramPackage.SHAPES_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DiagramPackage.SHAPES_TYPE__OBJECT_TYPE_SHAPE:
				return ((InternalEList<?>)getObjectTypeShape()).basicRemove(otherEnd, msgs);
			case DiagramPackage.SHAPES_TYPE__FACT_TYPE_SHAPE:
				return ((InternalEList<?>)getFactTypeShape()).basicRemove(otherEnd, msgs);
			case DiagramPackage.SHAPES_TYPE__EXTERNAL_CONSTRAINT_SHAPE:
				return ((InternalEList<?>)getExternalConstraintShape()).basicRemove(otherEnd, msgs);
			case DiagramPackage.SHAPES_TYPE__FREQUENCY_CONSTRAINT_SHAPE:
				return ((InternalEList<?>)getFrequencyConstraintShape()).basicRemove(otherEnd, msgs);
			case DiagramPackage.SHAPES_TYPE__RING_CONSTRAINT_SHAPE:
				return ((InternalEList<?>)getRingConstraintShape()).basicRemove(otherEnd, msgs);
			case DiagramPackage.SHAPES_TYPE__VALUE_COMPARISON_CONSTRAINT_SHAPE:
				return ((InternalEList<?>)getValueComparisonConstraintShape()).basicRemove(otherEnd, msgs);
			case DiagramPackage.SHAPES_TYPE__MODEL_NOTE_SHAPE:
				return ((InternalEList<?>)getModelNoteShape()).basicRemove(otherEnd, msgs);
			case DiagramPackage.SHAPES_TYPE__DIAGRAM_EXTENSION_SHAPE_GROUP:
				return ((InternalEList<?>)getDiagramExtensionShapeGroup()).basicRemove(otherEnd, msgs);
			case DiagramPackage.SHAPES_TYPE__DIAGRAM_EXTENSION_SHAPE:
				return ((InternalEList<?>)getDiagramExtensionShape()).basicRemove(otherEnd, msgs);
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
			case DiagramPackage.SHAPES_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DiagramPackage.SHAPES_TYPE__OBJECT_TYPE_SHAPE:
				return getObjectTypeShape();
			case DiagramPackage.SHAPES_TYPE__FACT_TYPE_SHAPE:
				return getFactTypeShape();
			case DiagramPackage.SHAPES_TYPE__EXTERNAL_CONSTRAINT_SHAPE:
				return getExternalConstraintShape();
			case DiagramPackage.SHAPES_TYPE__FREQUENCY_CONSTRAINT_SHAPE:
				return getFrequencyConstraintShape();
			case DiagramPackage.SHAPES_TYPE__RING_CONSTRAINT_SHAPE:
				return getRingConstraintShape();
			case DiagramPackage.SHAPES_TYPE__VALUE_COMPARISON_CONSTRAINT_SHAPE:
				return getValueComparisonConstraintShape();
			case DiagramPackage.SHAPES_TYPE__MODEL_NOTE_SHAPE:
				return getModelNoteShape();
			case DiagramPackage.SHAPES_TYPE__DIAGRAM_EXTENSION_SHAPE_GROUP:
				if (coreType) return getDiagramExtensionShapeGroup();
				return ((FeatureMap.Internal)getDiagramExtensionShapeGroup()).getWrapper();
			case DiagramPackage.SHAPES_TYPE__DIAGRAM_EXTENSION_SHAPE:
				return getDiagramExtensionShape();
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
			case DiagramPackage.SHAPES_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DiagramPackage.SHAPES_TYPE__OBJECT_TYPE_SHAPE:
				getObjectTypeShape().clear();
				getObjectTypeShape().addAll((Collection<? extends ObjectTypeShapeType>)newValue);
				return;
			case DiagramPackage.SHAPES_TYPE__FACT_TYPE_SHAPE:
				getFactTypeShape().clear();
				getFactTypeShape().addAll((Collection<? extends FactTypeShapeType>)newValue);
				return;
			case DiagramPackage.SHAPES_TYPE__EXTERNAL_CONSTRAINT_SHAPE:
				getExternalConstraintShape().clear();
				getExternalConstraintShape().addAll((Collection<? extends ExternalConstraintShapeType>)newValue);
				return;
			case DiagramPackage.SHAPES_TYPE__FREQUENCY_CONSTRAINT_SHAPE:
				getFrequencyConstraintShape().clear();
				getFrequencyConstraintShape().addAll((Collection<? extends FrequencyConstraintShapeType>)newValue);
				return;
			case DiagramPackage.SHAPES_TYPE__RING_CONSTRAINT_SHAPE:
				getRingConstraintShape().clear();
				getRingConstraintShape().addAll((Collection<? extends RingConstraintShapeType>)newValue);
				return;
			case DiagramPackage.SHAPES_TYPE__VALUE_COMPARISON_CONSTRAINT_SHAPE:
				getValueComparisonConstraintShape().clear();
				getValueComparisonConstraintShape().addAll((Collection<? extends ValueComparisonConstraintShapeType>)newValue);
				return;
			case DiagramPackage.SHAPES_TYPE__MODEL_NOTE_SHAPE:
				getModelNoteShape().clear();
				getModelNoteShape().addAll((Collection<? extends ModelNoteShapeType>)newValue);
				return;
			case DiagramPackage.SHAPES_TYPE__DIAGRAM_EXTENSION_SHAPE_GROUP:
				((FeatureMap.Internal)getDiagramExtensionShapeGroup()).set(newValue);
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
			case DiagramPackage.SHAPES_TYPE__GROUP:
				getGroup().clear();
				return;
			case DiagramPackage.SHAPES_TYPE__OBJECT_TYPE_SHAPE:
				getObjectTypeShape().clear();
				return;
			case DiagramPackage.SHAPES_TYPE__FACT_TYPE_SHAPE:
				getFactTypeShape().clear();
				return;
			case DiagramPackage.SHAPES_TYPE__EXTERNAL_CONSTRAINT_SHAPE:
				getExternalConstraintShape().clear();
				return;
			case DiagramPackage.SHAPES_TYPE__FREQUENCY_CONSTRAINT_SHAPE:
				getFrequencyConstraintShape().clear();
				return;
			case DiagramPackage.SHAPES_TYPE__RING_CONSTRAINT_SHAPE:
				getRingConstraintShape().clear();
				return;
			case DiagramPackage.SHAPES_TYPE__VALUE_COMPARISON_CONSTRAINT_SHAPE:
				getValueComparisonConstraintShape().clear();
				return;
			case DiagramPackage.SHAPES_TYPE__MODEL_NOTE_SHAPE:
				getModelNoteShape().clear();
				return;
			case DiagramPackage.SHAPES_TYPE__DIAGRAM_EXTENSION_SHAPE_GROUP:
				getDiagramExtensionShapeGroup().clear();
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
			case DiagramPackage.SHAPES_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DiagramPackage.SHAPES_TYPE__OBJECT_TYPE_SHAPE:
				return !getObjectTypeShape().isEmpty();
			case DiagramPackage.SHAPES_TYPE__FACT_TYPE_SHAPE:
				return !getFactTypeShape().isEmpty();
			case DiagramPackage.SHAPES_TYPE__EXTERNAL_CONSTRAINT_SHAPE:
				return !getExternalConstraintShape().isEmpty();
			case DiagramPackage.SHAPES_TYPE__FREQUENCY_CONSTRAINT_SHAPE:
				return !getFrequencyConstraintShape().isEmpty();
			case DiagramPackage.SHAPES_TYPE__RING_CONSTRAINT_SHAPE:
				return !getRingConstraintShape().isEmpty();
			case DiagramPackage.SHAPES_TYPE__VALUE_COMPARISON_CONSTRAINT_SHAPE:
				return !getValueComparisonConstraintShape().isEmpty();
			case DiagramPackage.SHAPES_TYPE__MODEL_NOTE_SHAPE:
				return !getModelNoteShape().isEmpty();
			case DiagramPackage.SHAPES_TYPE__DIAGRAM_EXTENSION_SHAPE_GROUP:
				return !getDiagramExtensionShapeGroup().isEmpty();
			case DiagramPackage.SHAPES_TYPE__DIAGRAM_EXTENSION_SHAPE:
				return !getDiagramExtensionShape().isEmpty();
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

} //ShapesTypeImpl
