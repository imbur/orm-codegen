/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shapes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getObjectTypeShape <em>Object Type Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getFactTypeShape <em>Fact Type Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getExternalConstraintShape <em>External Constraint Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getFrequencyConstraintShape <em>Frequency Constraint Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getRingConstraintShape <em>Ring Constraint Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getValueComparisonConstraintShape <em>Value Comparison Constraint Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getModelNoteShape <em>Model Note Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getDiagramExtensionShapeGroup <em>Diagram Extension Shape Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getDiagramExtensionShape <em>Diagram Extension Shape</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getShapesType()
 * @model extendedMetaData="name='Shapes_._type' kind='elementOnly'"
 * @generated
 */
public interface ShapesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getShapesType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Object Type Shape</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type Shape</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getShapesType_ObjectTypeShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectTypeShape' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ObjectTypeShapeType> getObjectTypeShape();

	/**
	 * Returns the value of the '<em><b>Fact Type Shape</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type Shape</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getShapesType_FactTypeShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FactTypeShape' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FactTypeShapeType> getFactTypeShape();

	/**
	 * Returns the value of the '<em><b>External Constraint Shape</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ExternalConstraintShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Constraint Shape</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getShapesType_ExternalConstraintShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExternalConstraintShape' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ExternalConstraintShapeType> getExternalConstraintShape();

	/**
	 * Returns the value of the '<em><b>Frequency Constraint Shape</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.diagram.FrequencyConstraintShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Constraint Shape</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getShapesType_FrequencyConstraintShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FrequencyConstraintShape' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<FrequencyConstraintShapeType> getFrequencyConstraintShape();

	/**
	 * Returns the value of the '<em><b>Ring Constraint Shape</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.diagram.RingConstraintShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ring Constraint Shape</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getShapesType_RingConstraintShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RingConstraintShape' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RingConstraintShapeType> getRingConstraintShape();

	/**
	 * Returns the value of the '<em><b>Value Comparison Constraint Shape</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueComparisonConstraintShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Comparison Constraint Shape</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getShapesType_ValueComparisonConstraintShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueComparisonConstraintShape' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ValueComparisonConstraintShapeType> getValueComparisonConstraintShape();

	/**
	 * Returns the value of the '<em><b>Model Note Shape</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ModelNoteShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Note Shape</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getShapesType_ModelNoteShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModelNoteShape' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ModelNoteShapeType> getModelNoteShape();

	/**
	 * Returns the value of the '<em><b>Diagram Extension Shape Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Extension Shape Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getShapesType_DiagramExtensionShapeGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='DiagramExtensionShape:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getDiagramExtensionShapeGroup();

	/**
	 * Returns the value of the '<em><b>Diagram Extension Shape</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Extension Shape</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getShapesType_DiagramExtensionShape()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DiagramExtensionShape' namespace='##targetNamespace' group='DiagramExtensionShape:group'"
	 * @generated
	 */
	EList<ShapeType> getDiagramExtensionShape();

} // ShapesType
