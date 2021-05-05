/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Shapes Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1#getValueConstraintShape <em>Value Constraint Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1#getCardinalityConstraintShape <em>Cardinality Constraint Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1#getObjectTypeRelativeExtensionShapeGroup <em>Object Type Relative Extension Shape Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1#getObjectTypeRelativeExtensionShape <em>Object Type Relative Extension Shape</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getRelativeShapesType1()
 * @model extendedMetaData="name='RelativeShapes_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface RelativeShapesType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getRelativeShapesType1_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Value Constraint Shape</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Constraint Shape</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getRelativeShapesType1_ValueConstraintShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueConstraintShape' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ValueConstraintShapeType> getValueConstraintShape();

	/**
	 * Returns the value of the '<em><b>Cardinality Constraint Shape</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.diagram.CardinalityConstraintShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Constraint Shape</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getRelativeShapesType1_CardinalityConstraintShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CardinalityConstraintShape' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CardinalityConstraintShapeType> getCardinalityConstraintShape();

	/**
	 * Returns the value of the '<em><b>Object Type Relative Extension Shape Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type Relative Extension Shape Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getRelativeShapesType1_ObjectTypeRelativeExtensionShapeGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='ObjectTypeRelativeExtensionShape:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getObjectTypeRelativeExtensionShapeGroup();

	/**
	 * Returns the value of the '<em><b>Object Type Relative Extension Shape</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type Relative Extension Shape</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getRelativeShapesType1_ObjectTypeRelativeExtensionShape()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectTypeRelativeExtensionShape' namespace='##targetNamespace' group='ObjectTypeRelativeExtensionShape:group'"
	 * @generated
	 */
	EList<ShapeType> getObjectTypeRelativeExtensionShape();

} // RelativeShapesType1
