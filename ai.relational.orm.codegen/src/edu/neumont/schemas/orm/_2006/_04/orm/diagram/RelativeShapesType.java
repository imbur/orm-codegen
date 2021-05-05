/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Shapes Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getObjectifiedFactTypeNameShape <em>Objectified Fact Type Name Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getReadingShape <em>Reading Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getValueConstraintShape <em>Value Constraint Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getRoleNameShape <em>Role Name Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getCardinalityConstraintShape <em>Cardinality Constraint Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getFactTypeRelativeExtensionShapeGroup <em>Fact Type Relative Extension Shape Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getFactTypeRelativeExtensionShape <em>Fact Type Relative Extension Shape</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getRelativeShapesType()
 * @model extendedMetaData="name='RelativeShapes_._type' kind='elementOnly'"
 * @generated
 */
public interface RelativeShapesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getRelativeShapesType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Objectified Fact Type Name Shape</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objectified Fact Type Name Shape</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getRelativeShapesType_ObjectifiedFactTypeNameShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectifiedFactTypeNameShape' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ObjectTypeShapeType> getObjectifiedFactTypeNameShape();

	/**
	 * Returns the value of the '<em><b>Reading Shape</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ReadingShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reading Shape</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getRelativeShapesType_ReadingShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReadingShape' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ReadingShapeType> getReadingShape();

	/**
	 * Returns the value of the '<em><b>Value Constraint Shape</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Constraint Shape</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getRelativeShapesType_ValueConstraintShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueConstraintShape' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ValueConstraintShapeType> getValueConstraintShape();

	/**
	 * Returns the value of the '<em><b>Role Name Shape</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleNameShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Name Shape</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getRelativeShapesType_RoleNameShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RoleNameShape' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RoleNameShapeType> getRoleNameShape();

	/**
	 * Returns the value of the '<em><b>Cardinality Constraint Shape</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.diagram.CardinalityConstraintShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Constraint Shape</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getRelativeShapesType_CardinalityConstraintShape()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CardinalityConstraintShape' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CardinalityConstraintShapeType> getCardinalityConstraintShape();

	/**
	 * Returns the value of the '<em><b>Fact Type Relative Extension Shape Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type Relative Extension Shape Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getRelativeShapesType_FactTypeRelativeExtensionShapeGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='FactTypeRelativeExtensionShape:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getFactTypeRelativeExtensionShapeGroup();

	/**
	 * Returns the value of the '<em><b>Fact Type Relative Extension Shape</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type Relative Extension Shape</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getRelativeShapesType_FactTypeRelativeExtensionShape()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FactTypeRelativeExtensionShape' namespace='##targetNamespace' group='FactTypeRelativeExtensionShape:group'"
	 * @generated
	 */
	EList<ShapeType> getFactTypeRelativeExtensionShape();

} // RelativeShapesType
