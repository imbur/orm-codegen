/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramFactory
 * @model kind="package"
 * @generated
 */
public interface DiagramPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "diagram";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.neumont.edu/ORM/2006-04/ORMDiagram";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "diagram";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DiagramPackage eINSTANCE = edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapeTypeImpl <em>Shape Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapeTypeImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getShapeType()
	 * @generated
	 */
	int SHAPE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Absolute Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_TYPE__ABSOLUTE_BOUNDS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_TYPE__IS_EXPANDED = 2;

	/**
	 * The number of structural features of the '<em>Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.CardinalityConstraintShapeTypeImpl <em>Cardinality Constraint Shape Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.CardinalityConstraintShapeTypeImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getCardinalityConstraintShapeType()
	 * @generated
	 */
	int CARDINALITY_CONSTRAINT_SHAPE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Absolute Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINT_SHAPE_TYPE__ABSOLUTE_BOUNDS = SHAPE_TYPE__ABSOLUTE_BOUNDS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINT_SHAPE_TYPE__ID = SHAPE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINT_SHAPE_TYPE__IS_EXPANDED = SHAPE_TYPE__IS_EXPANDED;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINT_SHAPE_TYPE__SUBJECT = SHAPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cardinality Constraint Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINT_SHAPE_TYPE_FEATURE_COUNT = SHAPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cardinality Constraint Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINT_SHAPE_TYPE_OPERATION_COUNT = SHAPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DocumentRootImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Diagram Extension Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIAGRAM_EXTENSION_SHAPE = 3;

	/**
	 * The feature id for the '<em><b>Fact Type Relative Extension Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FACT_TYPE_RELATIVE_EXTENSION_SHAPE = 4;

	/**
	 * The feature id for the '<em><b>Object Type Relative Extension Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT_TYPE_RELATIVE_EXTENSION_SHAPE = 5;

	/**
	 * The feature id for the '<em><b>ORM Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORM_DIAGRAM = 6;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBJECT = 7;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ExternalConstraintShapeTypeImpl <em>External Constraint Shape Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ExternalConstraintShapeTypeImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getExternalConstraintShapeType()
	 * @generated
	 */
	int EXTERNAL_CONSTRAINT_SHAPE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Absolute Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONSTRAINT_SHAPE_TYPE__ABSOLUTE_BOUNDS = SHAPE_TYPE__ABSOLUTE_BOUNDS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONSTRAINT_SHAPE_TYPE__ID = SHAPE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONSTRAINT_SHAPE_TYPE__IS_EXPANDED = SHAPE_TYPE__IS_EXPANDED;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONSTRAINT_SHAPE_TYPE__SUBJECT = SHAPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Constraint Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONSTRAINT_SHAPE_TYPE_FEATURE_COUNT = SHAPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>External Constraint Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_CONSTRAINT_SHAPE_TYPE_OPERATION_COUNT = SHAPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.FactTypeShapeTypeImpl <em>Fact Type Shape Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.FactTypeShapeTypeImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getFactTypeShapeType()
	 * @generated
	 */
	int FACT_TYPE_SHAPE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Absolute Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_SHAPE_TYPE__ABSOLUTE_BOUNDS = SHAPE_TYPE__ABSOLUTE_BOUNDS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_SHAPE_TYPE__ID = SHAPE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_SHAPE_TYPE__IS_EXPANDED = SHAPE_TYPE__IS_EXPANDED;

	/**
	 * The feature id for the '<em><b>Relative Shapes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES = SHAPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_SHAPE_TYPE__SUBJECT = SHAPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role Display Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_SHAPE_TYPE__ROLE_DISPLAY_ORDER = SHAPE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Constraint Display Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_SHAPE_TYPE__CONSTRAINT_DISPLAY_POSITION = SHAPE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Display As Object Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_SHAPE_TYPE__DISPLAY_AS_OBJECT_TYPE = SHAPE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Display Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_SHAPE_TYPE__DISPLAY_ORIENTATION = SHAPE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Display Related Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_SHAPE_TYPE__DISPLAY_RELATED_TYPES = SHAPE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Display Role Names</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_SHAPE_TYPE__DISPLAY_ROLE_NAMES = SHAPE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Expand Ref Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_SHAPE_TYPE__EXPAND_REF_MODE = SHAPE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Fact Type Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_SHAPE_TYPE_FEATURE_COUNT = SHAPE_TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Fact Type Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACT_TYPE_SHAPE_TYPE_OPERATION_COUNT = SHAPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.FrequencyConstraintShapeTypeImpl <em>Frequency Constraint Shape Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.FrequencyConstraintShapeTypeImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getFrequencyConstraintShapeType()
	 * @generated
	 */
	int FREQUENCY_CONSTRAINT_SHAPE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Absolute Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONSTRAINT_SHAPE_TYPE__ABSOLUTE_BOUNDS = EXTERNAL_CONSTRAINT_SHAPE_TYPE__ABSOLUTE_BOUNDS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONSTRAINT_SHAPE_TYPE__ID = EXTERNAL_CONSTRAINT_SHAPE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONSTRAINT_SHAPE_TYPE__IS_EXPANDED = EXTERNAL_CONSTRAINT_SHAPE_TYPE__IS_EXPANDED;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONSTRAINT_SHAPE_TYPE__SUBJECT = EXTERNAL_CONSTRAINT_SHAPE_TYPE__SUBJECT;

	/**
	 * The number of structural features of the '<em>Frequency Constraint Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONSTRAINT_SHAPE_TYPE_FEATURE_COUNT = EXTERNAL_CONSTRAINT_SHAPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Frequency Constraint Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREQUENCY_CONSTRAINT_SHAPE_TYPE_OPERATION_COUNT = EXTERNAL_CONSTRAINT_SHAPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ModelNoteShapeTypeImpl <em>Model Note Shape Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ModelNoteShapeTypeImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getModelNoteShapeType()
	 * @generated
	 */
	int MODEL_NOTE_SHAPE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Absolute Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NOTE_SHAPE_TYPE__ABSOLUTE_BOUNDS = SHAPE_TYPE__ABSOLUTE_BOUNDS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NOTE_SHAPE_TYPE__ID = SHAPE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NOTE_SHAPE_TYPE__IS_EXPANDED = SHAPE_TYPE__IS_EXPANDED;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NOTE_SHAPE_TYPE__SUBJECT = SHAPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Note Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NOTE_SHAPE_TYPE_FEATURE_COUNT = SHAPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model Note Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_NOTE_SHAPE_TYPE_OPERATION_COUNT = SHAPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ObjectTypeShapeTypeImpl <em>Object Type Shape Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ObjectTypeShapeTypeImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getObjectTypeShapeType()
	 * @generated
	 */
	int OBJECT_TYPE_SHAPE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Absolute Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_SHAPE_TYPE__ABSOLUTE_BOUNDS = SHAPE_TYPE__ABSOLUTE_BOUNDS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_SHAPE_TYPE__ID = SHAPE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_SHAPE_TYPE__IS_EXPANDED = SHAPE_TYPE__IS_EXPANDED;

	/**
	 * The feature id for the '<em><b>Relative Shapes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES = SHAPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_SHAPE_TYPE__SUBJECT = SHAPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Display Related Types</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_SHAPE_TYPE__DISPLAY_RELATED_TYPES = SHAPE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Expand Ref Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_SHAPE_TYPE__EXPAND_REF_MODE = SHAPE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Object Type Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_SHAPE_TYPE_FEATURE_COUNT = SHAPE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Object Type Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_SHAPE_TYPE_OPERATION_COUNT = SHAPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ORMDiagramTypeImpl <em>ORM Diagram Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ORMDiagramTypeImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getORMDiagramType()
	 * @generated
	 */
	int ORM_DIAGRAM_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Shapes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_DIAGRAM_TYPE__SHAPES = 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_DIAGRAM_TYPE__SUBJECT = 1;

	/**
	 * The feature id for the '<em><b>Auto Populate Shapes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_DIAGRAM_TYPE__AUTO_POPULATE_SHAPES = 2;

	/**
	 * The feature id for the '<em><b>Base Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_DIAGRAM_TYPE__BASE_FONT_NAME = 3;

	/**
	 * The feature id for the '<em><b>Base Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_DIAGRAM_TYPE__BASE_FONT_SIZE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_DIAGRAM_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Is Complete View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_DIAGRAM_TYPE__IS_COMPLETE_VIEW = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_DIAGRAM_TYPE__NAME = 7;

	/**
	 * The number of structural features of the '<em>ORM Diagram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_DIAGRAM_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>ORM Diagram Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORM_DIAGRAM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ReadingShapeTypeImpl <em>Reading Shape Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ReadingShapeTypeImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getReadingShapeType()
	 * @generated
	 */
	int READING_SHAPE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Absolute Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_SHAPE_TYPE__ABSOLUTE_BOUNDS = SHAPE_TYPE__ABSOLUTE_BOUNDS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_SHAPE_TYPE__ID = SHAPE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_SHAPE_TYPE__IS_EXPANDED = SHAPE_TYPE__IS_EXPANDED;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_SHAPE_TYPE__SUBJECT = SHAPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reading Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_SHAPE_TYPE_FEATURE_COUNT = SHAPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reading Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READING_SHAPE_TYPE_OPERATION_COUNT = SHAPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RelativeShapesTypeImpl <em>Relative Shapes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RelativeShapesTypeImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getRelativeShapesType()
	 * @generated
	 */
	int RELATIVE_SHAPES_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SHAPES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Objectified Fact Type Name Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SHAPES_TYPE__OBJECTIFIED_FACT_TYPE_NAME_SHAPE = 1;

	/**
	 * The feature id for the '<em><b>Reading Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SHAPES_TYPE__READING_SHAPE = 2;

	/**
	 * The feature id for the '<em><b>Value Constraint Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SHAPES_TYPE__VALUE_CONSTRAINT_SHAPE = 3;

	/**
	 * The feature id for the '<em><b>Role Name Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SHAPES_TYPE__ROLE_NAME_SHAPE = 4;

	/**
	 * The feature id for the '<em><b>Cardinality Constraint Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SHAPES_TYPE__CARDINALITY_CONSTRAINT_SHAPE = 5;

	/**
	 * The feature id for the '<em><b>Fact Type Relative Extension Shape Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SHAPES_TYPE__FACT_TYPE_RELATIVE_EXTENSION_SHAPE_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Fact Type Relative Extension Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SHAPES_TYPE__FACT_TYPE_RELATIVE_EXTENSION_SHAPE = 7;

	/**
	 * The number of structural features of the '<em>Relative Shapes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SHAPES_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Relative Shapes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SHAPES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RelativeShapesType1Impl <em>Relative Shapes Type1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RelativeShapesType1Impl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getRelativeShapesType1()
	 * @generated
	 */
	int RELATIVE_SHAPES_TYPE1 = 10;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SHAPES_TYPE1__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Value Constraint Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SHAPES_TYPE1__VALUE_CONSTRAINT_SHAPE = 1;

	/**
	 * The feature id for the '<em><b>Cardinality Constraint Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SHAPES_TYPE1__CARDINALITY_CONSTRAINT_SHAPE = 2;

	/**
	 * The feature id for the '<em><b>Object Type Relative Extension Shape Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SHAPES_TYPE1__OBJECT_TYPE_RELATIVE_EXTENSION_SHAPE_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Object Type Relative Extension Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SHAPES_TYPE1__OBJECT_TYPE_RELATIVE_EXTENSION_SHAPE = 4;

	/**
	 * The number of structural features of the '<em>Relative Shapes Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SHAPES_TYPE1_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Relative Shapes Type1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIVE_SHAPES_TYPE1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RingConstraintShapeTypeImpl <em>Ring Constraint Shape Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RingConstraintShapeTypeImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getRingConstraintShapeType()
	 * @generated
	 */
	int RING_CONSTRAINT_SHAPE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Absolute Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RING_CONSTRAINT_SHAPE_TYPE__ABSOLUTE_BOUNDS = EXTERNAL_CONSTRAINT_SHAPE_TYPE__ABSOLUTE_BOUNDS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RING_CONSTRAINT_SHAPE_TYPE__ID = EXTERNAL_CONSTRAINT_SHAPE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RING_CONSTRAINT_SHAPE_TYPE__IS_EXPANDED = EXTERNAL_CONSTRAINT_SHAPE_TYPE__IS_EXPANDED;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RING_CONSTRAINT_SHAPE_TYPE__SUBJECT = EXTERNAL_CONSTRAINT_SHAPE_TYPE__SUBJECT;

	/**
	 * The number of structural features of the '<em>Ring Constraint Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RING_CONSTRAINT_SHAPE_TYPE_FEATURE_COUNT = EXTERNAL_CONSTRAINT_SHAPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ring Constraint Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RING_CONSTRAINT_SHAPE_TYPE_OPERATION_COUNT = EXTERNAL_CONSTRAINT_SHAPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RoleDisplayOrderTypeImpl <em>Role Display Order Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RoleDisplayOrderTypeImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getRoleDisplayOrderType()
	 * @generated
	 */
	int ROLE_DISPLAY_ORDER_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DISPLAY_ORDER_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DISPLAY_ORDER_TYPE__ROLE = 1;

	/**
	 * The number of structural features of the '<em>Role Display Order Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DISPLAY_ORDER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Role Display Order Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_DISPLAY_ORDER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RoleNameShapeTypeImpl <em>Role Name Shape Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RoleNameShapeTypeImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getRoleNameShapeType()
	 * @generated
	 */
	int ROLE_NAME_SHAPE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Absolute Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_SHAPE_TYPE__ABSOLUTE_BOUNDS = SHAPE_TYPE__ABSOLUTE_BOUNDS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_SHAPE_TYPE__ID = SHAPE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_SHAPE_TYPE__IS_EXPANDED = SHAPE_TYPE__IS_EXPANDED;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_SHAPE_TYPE__SUBJECT = SHAPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Role Name Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_SHAPE_TYPE_FEATURE_COUNT = SHAPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Role Name Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_NAME_SHAPE_TYPE_OPERATION_COUNT = SHAPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RoleTypeImpl <em>Role Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RoleTypeImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getRoleType()
	 * @generated
	 */
	int ROLE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE__REF = 0;

	/**
	 * The number of structural features of the '<em>Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Role Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapesTypeImpl <em>Shapes Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapesTypeImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getShapesType()
	 * @generated
	 */
	int SHAPES_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Object Type Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__OBJECT_TYPE_SHAPE = 1;

	/**
	 * The feature id for the '<em><b>Fact Type Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__FACT_TYPE_SHAPE = 2;

	/**
	 * The feature id for the '<em><b>External Constraint Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__EXTERNAL_CONSTRAINT_SHAPE = 3;

	/**
	 * The feature id for the '<em><b>Frequency Constraint Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__FREQUENCY_CONSTRAINT_SHAPE = 4;

	/**
	 * The feature id for the '<em><b>Ring Constraint Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__RING_CONSTRAINT_SHAPE = 5;

	/**
	 * The feature id for the '<em><b>Value Comparison Constraint Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__VALUE_COMPARISON_CONSTRAINT_SHAPE = 6;

	/**
	 * The feature id for the '<em><b>Model Note Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__MODEL_NOTE_SHAPE = 7;

	/**
	 * The feature id for the '<em><b>Diagram Extension Shape Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__DIAGRAM_EXTENSION_SHAPE_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Diagram Extension Shape</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE__DIAGRAM_EXTENSION_SHAPE = 9;

	/**
	 * The number of structural features of the '<em>Shapes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Shapes Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.SubjectRefImpl <em>Subject Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.SubjectRefImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getSubjectRef()
	 * @generated
	 */
	int SUBJECT_REF = 17;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_REF__REF = 0;

	/**
	 * The number of structural features of the '<em>Subject Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_REF_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Subject Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ValueComparisonConstraintShapeTypeImpl <em>Value Comparison Constraint Shape Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ValueComparisonConstraintShapeTypeImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getValueComparisonConstraintShapeType()
	 * @generated
	 */
	int VALUE_COMPARISON_CONSTRAINT_SHAPE_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Absolute Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COMPARISON_CONSTRAINT_SHAPE_TYPE__ABSOLUTE_BOUNDS = EXTERNAL_CONSTRAINT_SHAPE_TYPE__ABSOLUTE_BOUNDS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COMPARISON_CONSTRAINT_SHAPE_TYPE__ID = EXTERNAL_CONSTRAINT_SHAPE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COMPARISON_CONSTRAINT_SHAPE_TYPE__IS_EXPANDED = EXTERNAL_CONSTRAINT_SHAPE_TYPE__IS_EXPANDED;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COMPARISON_CONSTRAINT_SHAPE_TYPE__SUBJECT = EXTERNAL_CONSTRAINT_SHAPE_TYPE__SUBJECT;

	/**
	 * The number of structural features of the '<em>Value Comparison Constraint Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COMPARISON_CONSTRAINT_SHAPE_TYPE_FEATURE_COUNT = EXTERNAL_CONSTRAINT_SHAPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value Comparison Constraint Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_COMPARISON_CONSTRAINT_SHAPE_TYPE_OPERATION_COUNT = EXTERNAL_CONSTRAINT_SHAPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ValueConstraintShapeTypeImpl <em>Value Constraint Shape Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ValueConstraintShapeTypeImpl
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getValueConstraintShapeType()
	 * @generated
	 */
	int VALUE_CONSTRAINT_SHAPE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Absolute Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTRAINT_SHAPE_TYPE__ABSOLUTE_BOUNDS = SHAPE_TYPE__ABSOLUTE_BOUNDS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTRAINT_SHAPE_TYPE__ID = SHAPE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Is Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTRAINT_SHAPE_TYPE__IS_EXPANDED = SHAPE_TYPE__IS_EXPANDED;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTRAINT_SHAPE_TYPE__SUBJECT = SHAPE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Displayed Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTRAINT_SHAPE_TYPE__MAXIMUM_DISPLAYED_COLUMNS = SHAPE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum Displayed Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTRAINT_SHAPE_TYPE__MAXIMUM_DISPLAYED_VALUES = SHAPE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Value Constraint Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTRAINT_SHAPE_TYPE_FEATURE_COUNT = SHAPE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Value Constraint Shape Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_CONSTRAINT_SHAPE_TYPE_OPERATION_COUNT = SHAPE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ConstraintDisplayPositionType <em>Constraint Display Position Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ConstraintDisplayPositionType
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getConstraintDisplayPositionType()
	 * @generated
	 */
	int CONSTRAINT_DISPLAY_POSITION_TYPE = 20;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayOrientationType <em>Display Orientation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayOrientationType
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getDisplayOrientationType()
	 * @generated
	 */
	int DISPLAY_ORIENTATION_TYPE = 21;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRelatedTypesType <em>Display Related Types Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRelatedTypesType
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getDisplayRelatedTypesType()
	 * @generated
	 */
	int DISPLAY_RELATED_TYPES_TYPE = 22;

	/**
	 * The meta object id for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRoleNamesType <em>Display Role Names Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRoleNamesType
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getDisplayRoleNamesType()
	 * @generated
	 */
	int DISPLAY_ROLE_NAMES_TYPE = 23;

	/**
	 * The meta object id for the '<em>Constraint Display Position Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ConstraintDisplayPositionType
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getConstraintDisplayPositionTypeObject()
	 * @generated
	 */
	int CONSTRAINT_DISPLAY_POSITION_TYPE_OBJECT = 24;

	/**
	 * The meta object id for the '<em>Display Orientation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayOrientationType
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getDisplayOrientationTypeObject()
	 * @generated
	 */
	int DISPLAY_ORIENTATION_TYPE_OBJECT = 25;

	/**
	 * The meta object id for the '<em>Display Related Types Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRelatedTypesType
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getDisplayRelatedTypesTypeObject()
	 * @generated
	 */
	int DISPLAY_RELATED_TYPES_TYPE_OBJECT = 26;

	/**
	 * The meta object id for the '<em>Display Role Names Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRoleNamesType
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getDisplayRoleNamesTypeObject()
	 * @generated
	 */
	int DISPLAY_ROLE_NAMES_TYPE_OBJECT = 27;

	/**
	 * The meta object id for the '<em>Maximum Displayed Columns Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getMaximumDisplayedColumnsType()
	 * @generated
	 */
	int MAXIMUM_DISPLAYED_COLUMNS_TYPE = 28;

	/**
	 * The meta object id for the '<em>Maximum Displayed Columns Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Short
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getMaximumDisplayedColumnsTypeObject()
	 * @generated
	 */
	int MAXIMUM_DISPLAYED_COLUMNS_TYPE_OBJECT = 29;

	/**
	 * The meta object id for the '<em>Maximum Displayed Values Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getMaximumDisplayedValuesType()
	 * @generated
	 */
	int MAXIMUM_DISPLAYED_VALUES_TYPE = 30;

	/**
	 * The meta object id for the '<em>Maximum Displayed Values Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Short
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getMaximumDisplayedValuesTypeObject()
	 * @generated
	 */
	int MAXIMUM_DISPLAYED_VALUES_TYPE_OBJECT = 31;


	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.CardinalityConstraintShapeType <em>Cardinality Constraint Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality Constraint Shape Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.CardinalityConstraintShapeType
	 * @generated
	 */
	EClass getCardinalityConstraintShapeType();

	/**
	 * Returns the meta object for the containment reference '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.CardinalityConstraintShapeType#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.CardinalityConstraintShapeType#getSubject()
	 * @see #getCardinalityConstraintShapeType()
	 * @generated
	 */
	EReference getCardinalityConstraintShapeType_Subject();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getDiagramExtensionShape <em>Diagram Extension Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Diagram Extension Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getDiagramExtensionShape()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DiagramExtensionShape();

	/**
	 * Returns the meta object for the containment reference '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getFactTypeRelativeExtensionShape <em>Fact Type Relative Extension Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fact Type Relative Extension Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getFactTypeRelativeExtensionShape()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FactTypeRelativeExtensionShape();

	/**
	 * Returns the meta object for the containment reference '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getObjectTypeRelativeExtensionShape <em>Object Type Relative Extension Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Type Relative Extension Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getObjectTypeRelativeExtensionShape()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ObjectTypeRelativeExtensionShape();

	/**
	 * Returns the meta object for the containment reference '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getORMDiagram <em>ORM Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>ORM Diagram</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getORMDiagram()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ORMDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getSubject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Subject();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ExternalConstraintShapeType <em>External Constraint Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Constraint Shape Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ExternalConstraintShapeType
	 * @generated
	 */
	EClass getExternalConstraintShapeType();

	/**
	 * Returns the meta object for the containment reference '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ExternalConstraintShapeType#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ExternalConstraintShapeType#getSubject()
	 * @see #getExternalConstraintShapeType()
	 * @generated
	 */
	EReference getExternalConstraintShapeType_Subject();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType <em>Fact Type Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fact Type Shape Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType
	 * @generated
	 */
	EClass getFactTypeShapeType();

	/**
	 * Returns the meta object for the containment reference '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getRelativeShapes <em>Relative Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relative Shapes</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getRelativeShapes()
	 * @see #getFactTypeShapeType()
	 * @generated
	 */
	EReference getFactTypeShapeType_RelativeShapes();

	/**
	 * Returns the meta object for the containment reference '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getSubject()
	 * @see #getFactTypeShapeType()
	 * @generated
	 */
	EReference getFactTypeShapeType_Subject();

	/**
	 * Returns the meta object for the containment reference '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getRoleDisplayOrder <em>Role Display Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Role Display Order</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getRoleDisplayOrder()
	 * @see #getFactTypeShapeType()
	 * @generated
	 */
	EReference getFactTypeShapeType_RoleDisplayOrder();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getConstraintDisplayPosition <em>Constraint Display Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint Display Position</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getConstraintDisplayPosition()
	 * @see #getFactTypeShapeType()
	 * @generated
	 */
	EAttribute getFactTypeShapeType_ConstraintDisplayPosition();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#isDisplayAsObjectType <em>Display As Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display As Object Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#isDisplayAsObjectType()
	 * @see #getFactTypeShapeType()
	 * @generated
	 */
	EAttribute getFactTypeShapeType_DisplayAsObjectType();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getDisplayOrientation <em>Display Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Orientation</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getDisplayOrientation()
	 * @see #getFactTypeShapeType()
	 * @generated
	 */
	EAttribute getFactTypeShapeType_DisplayOrientation();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getDisplayRelatedTypes <em>Display Related Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Related Types</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getDisplayRelatedTypes()
	 * @see #getFactTypeShapeType()
	 * @generated
	 */
	EAttribute getFactTypeShapeType_DisplayRelatedTypes();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getDisplayRoleNames <em>Display Role Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Role Names</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getDisplayRoleNames()
	 * @see #getFactTypeShapeType()
	 * @generated
	 */
	EAttribute getFactTypeShapeType_DisplayRoleNames();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#isExpandRefMode <em>Expand Ref Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expand Ref Mode</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#isExpandRefMode()
	 * @see #getFactTypeShapeType()
	 * @generated
	 */
	EAttribute getFactTypeShapeType_ExpandRefMode();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FrequencyConstraintShapeType <em>Frequency Constraint Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frequency Constraint Shape Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.FrequencyConstraintShapeType
	 * @generated
	 */
	EClass getFrequencyConstraintShapeType();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ModelNoteShapeType <em>Model Note Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Note Shape Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ModelNoteShapeType
	 * @generated
	 */
	EClass getModelNoteShapeType();

	/**
	 * Returns the meta object for the containment reference '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ModelNoteShapeType#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ModelNoteShapeType#getSubject()
	 * @see #getModelNoteShapeType()
	 * @generated
	 */
	EReference getModelNoteShapeType_Subject();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType <em>Object Type Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type Shape Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType
	 * @generated
	 */
	EClass getObjectTypeShapeType();

	/**
	 * Returns the meta object for the containment reference '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#getRelativeShapes <em>Relative Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relative Shapes</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#getRelativeShapes()
	 * @see #getObjectTypeShapeType()
	 * @generated
	 */
	EReference getObjectTypeShapeType_RelativeShapes();

	/**
	 * Returns the meta object for the containment reference '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#getSubject()
	 * @see #getObjectTypeShapeType()
	 * @generated
	 */
	EReference getObjectTypeShapeType_Subject();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#getDisplayRelatedTypes <em>Display Related Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Related Types</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#getDisplayRelatedTypes()
	 * @see #getObjectTypeShapeType()
	 * @generated
	 */
	EAttribute getObjectTypeShapeType_DisplayRelatedTypes();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#isExpandRefMode <em>Expand Ref Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expand Ref Mode</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#isExpandRefMode()
	 * @see #getObjectTypeShapeType()
	 * @generated
	 */
	EAttribute getObjectTypeShapeType_ExpandRefMode();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType <em>ORM Diagram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ORM Diagram Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType
	 * @generated
	 */
	EClass getORMDiagramType();

	/**
	 * Returns the meta object for the containment reference '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getShapes <em>Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shapes</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getShapes()
	 * @see #getORMDiagramType()
	 * @generated
	 */
	EReference getORMDiagramType_Shapes();

	/**
	 * Returns the meta object for the containment reference '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getSubject()
	 * @see #getORMDiagramType()
	 * @generated
	 */
	EReference getORMDiagramType_Subject();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#isAutoPopulateShapes <em>Auto Populate Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Populate Shapes</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#isAutoPopulateShapes()
	 * @see #getORMDiagramType()
	 * @generated
	 */
	EAttribute getORMDiagramType_AutoPopulateShapes();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getBaseFontName <em>Base Font Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Font Name</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getBaseFontName()
	 * @see #getORMDiagramType()
	 * @generated
	 */
	EAttribute getORMDiagramType_BaseFontName();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getBaseFontSize <em>Base Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Font Size</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getBaseFontSize()
	 * @see #getORMDiagramType()
	 * @generated
	 */
	EAttribute getORMDiagramType_BaseFontSize();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getId()
	 * @see #getORMDiagramType()
	 * @generated
	 */
	EAttribute getORMDiagramType_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#isIsCompleteView <em>Is Complete View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Complete View</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#isIsCompleteView()
	 * @see #getORMDiagramType()
	 * @generated
	 */
	EAttribute getORMDiagramType_IsCompleteView();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getName()
	 * @see #getORMDiagramType()
	 * @generated
	 */
	EAttribute getORMDiagramType_Name();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ReadingShapeType <em>Reading Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reading Shape Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ReadingShapeType
	 * @generated
	 */
	EClass getReadingShapeType();

	/**
	 * Returns the meta object for the containment reference '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ReadingShapeType#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ReadingShapeType#getSubject()
	 * @see #getReadingShapeType()
	 * @generated
	 */
	EReference getReadingShapeType_Subject();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType <em>Relative Shapes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Shapes Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType
	 * @generated
	 */
	EClass getRelativeShapesType();

	/**
	 * Returns the meta object for the attribute list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getGroup()
	 * @see #getRelativeShapesType()
	 * @generated
	 */
	EAttribute getRelativeShapesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getObjectifiedFactTypeNameShape <em>Objectified Fact Type Name Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objectified Fact Type Name Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getObjectifiedFactTypeNameShape()
	 * @see #getRelativeShapesType()
	 * @generated
	 */
	EReference getRelativeShapesType_ObjectifiedFactTypeNameShape();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getReadingShape <em>Reading Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reading Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getReadingShape()
	 * @see #getRelativeShapesType()
	 * @generated
	 */
	EReference getRelativeShapesType_ReadingShape();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getValueConstraintShape <em>Value Constraint Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Constraint Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getValueConstraintShape()
	 * @see #getRelativeShapesType()
	 * @generated
	 */
	EReference getRelativeShapesType_ValueConstraintShape();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getRoleNameShape <em>Role Name Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role Name Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getRoleNameShape()
	 * @see #getRelativeShapesType()
	 * @generated
	 */
	EReference getRelativeShapesType_RoleNameShape();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getCardinalityConstraintShape <em>Cardinality Constraint Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cardinality Constraint Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getCardinalityConstraintShape()
	 * @see #getRelativeShapesType()
	 * @generated
	 */
	EReference getRelativeShapesType_CardinalityConstraintShape();

	/**
	 * Returns the meta object for the attribute list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getFactTypeRelativeExtensionShapeGroup <em>Fact Type Relative Extension Shape Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Fact Type Relative Extension Shape Group</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getFactTypeRelativeExtensionShapeGroup()
	 * @see #getRelativeShapesType()
	 * @generated
	 */
	EAttribute getRelativeShapesType_FactTypeRelativeExtensionShapeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getFactTypeRelativeExtensionShape <em>Fact Type Relative Extension Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fact Type Relative Extension Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType#getFactTypeRelativeExtensionShape()
	 * @see #getRelativeShapesType()
	 * @generated
	 */
	EReference getRelativeShapesType_FactTypeRelativeExtensionShape();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1 <em>Relative Shapes Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relative Shapes Type1</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1
	 * @generated
	 */
	EClass getRelativeShapesType1();

	/**
	 * Returns the meta object for the attribute list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1#getGroup()
	 * @see #getRelativeShapesType1()
	 * @generated
	 */
	EAttribute getRelativeShapesType1_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1#getValueConstraintShape <em>Value Constraint Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Constraint Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1#getValueConstraintShape()
	 * @see #getRelativeShapesType1()
	 * @generated
	 */
	EReference getRelativeShapesType1_ValueConstraintShape();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1#getCardinalityConstraintShape <em>Cardinality Constraint Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cardinality Constraint Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1#getCardinalityConstraintShape()
	 * @see #getRelativeShapesType1()
	 * @generated
	 */
	EReference getRelativeShapesType1_CardinalityConstraintShape();

	/**
	 * Returns the meta object for the attribute list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1#getObjectTypeRelativeExtensionShapeGroup <em>Object Type Relative Extension Shape Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Object Type Relative Extension Shape Group</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1#getObjectTypeRelativeExtensionShapeGroup()
	 * @see #getRelativeShapesType1()
	 * @generated
	 */
	EAttribute getRelativeShapesType1_ObjectTypeRelativeExtensionShapeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1#getObjectTypeRelativeExtensionShape <em>Object Type Relative Extension Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Type Relative Extension Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1#getObjectTypeRelativeExtensionShape()
	 * @see #getRelativeShapesType1()
	 * @generated
	 */
	EReference getRelativeShapesType1_ObjectTypeRelativeExtensionShape();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RingConstraintShapeType <em>Ring Constraint Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ring Constraint Shape Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RingConstraintShapeType
	 * @generated
	 */
	EClass getRingConstraintShapeType();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleDisplayOrderType <em>Role Display Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Display Order Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RoleDisplayOrderType
	 * @generated
	 */
	EClass getRoleDisplayOrderType();

	/**
	 * Returns the meta object for the attribute list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleDisplayOrderType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RoleDisplayOrderType#getGroup()
	 * @see #getRoleDisplayOrderType()
	 * @generated
	 */
	EAttribute getRoleDisplayOrderType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleDisplayOrderType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Role</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RoleDisplayOrderType#getRole()
	 * @see #getRoleDisplayOrderType()
	 * @generated
	 */
	EReference getRoleDisplayOrderType_Role();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleNameShapeType <em>Role Name Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Name Shape Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RoleNameShapeType
	 * @generated
	 */
	EClass getRoleNameShapeType();

	/**
	 * Returns the meta object for the containment reference '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleNameShapeType#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RoleNameShapeType#getSubject()
	 * @see #getRoleNameShapeType()
	 * @generated
	 */
	EReference getRoleNameShapeType_Subject();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RoleType
	 * @generated
	 */
	EClass getRoleType();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleType#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RoleType#getRef()
	 * @see #getRoleType()
	 * @generated
	 */
	EAttribute getRoleType_Ref();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType <em>Shapes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shapes Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType
	 * @generated
	 */
	EClass getShapesType();

	/**
	 * Returns the meta object for the attribute list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getGroup()
	 * @see #getShapesType()
	 * @generated
	 */
	EAttribute getShapesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getObjectTypeShape <em>Object Type Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Type Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getObjectTypeShape()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_ObjectTypeShape();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getFactTypeShape <em>Fact Type Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fact Type Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getFactTypeShape()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_FactTypeShape();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getExternalConstraintShape <em>External Constraint Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>External Constraint Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getExternalConstraintShape()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_ExternalConstraintShape();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getFrequencyConstraintShape <em>Frequency Constraint Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frequency Constraint Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getFrequencyConstraintShape()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_FrequencyConstraintShape();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getRingConstraintShape <em>Ring Constraint Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ring Constraint Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getRingConstraintShape()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_RingConstraintShape();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getValueComparisonConstraintShape <em>Value Comparison Constraint Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Comparison Constraint Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getValueComparisonConstraintShape()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_ValueComparisonConstraintShape();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getModelNoteShape <em>Model Note Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Note Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getModelNoteShape()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_ModelNoteShape();

	/**
	 * Returns the meta object for the attribute list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getDiagramExtensionShapeGroup <em>Diagram Extension Shape Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Diagram Extension Shape Group</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getDiagramExtensionShapeGroup()
	 * @see #getShapesType()
	 * @generated
	 */
	EAttribute getShapesType_DiagramExtensionShapeGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getDiagramExtensionShape <em>Diagram Extension Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagram Extension Shape</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType#getDiagramExtensionShape()
	 * @see #getShapesType()
	 * @generated
	 */
	EReference getShapesType_DiagramExtensionShape();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType <em>Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType
	 * @generated
	 */
	EClass getShapeType();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType#getAbsoluteBounds <em>Absolute Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Absolute Bounds</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType#getAbsoluteBounds()
	 * @see #getShapeType()
	 * @generated
	 */
	EAttribute getShapeType_AbsoluteBounds();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType#getId()
	 * @see #getShapeType()
	 * @generated
	 */
	EAttribute getShapeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType#isIsExpanded <em>Is Expanded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Expanded</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType#isIsExpanded()
	 * @see #getShapeType()
	 * @generated
	 */
	EAttribute getShapeType_IsExpanded();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.SubjectRef <em>Subject Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject Ref</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.SubjectRef
	 * @generated
	 */
	EClass getSubjectRef();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.SubjectRef#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.SubjectRef#getRef()
	 * @see #getSubjectRef()
	 * @generated
	 */
	EAttribute getSubjectRef_Ref();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueComparisonConstraintShapeType <em>Value Comparison Constraint Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Comparison Constraint Shape Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ValueComparisonConstraintShapeType
	 * @generated
	 */
	EClass getValueComparisonConstraintShapeType();

	/**
	 * Returns the meta object for class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType <em>Value Constraint Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Constraint Shape Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType
	 * @generated
	 */
	EClass getValueConstraintShapeType();

	/**
	 * Returns the meta object for the containment reference '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType#getSubject()
	 * @see #getValueConstraintShapeType()
	 * @generated
	 */
	EReference getValueConstraintShapeType_Subject();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType#getMaximumDisplayedColumns <em>Maximum Displayed Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Displayed Columns</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType#getMaximumDisplayedColumns()
	 * @see #getValueConstraintShapeType()
	 * @generated
	 */
	EAttribute getValueConstraintShapeType_MaximumDisplayedColumns();

	/**
	 * Returns the meta object for the attribute '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType#getMaximumDisplayedValues <em>Maximum Displayed Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Displayed Values</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType#getMaximumDisplayedValues()
	 * @see #getValueConstraintShapeType()
	 * @generated
	 */
	EAttribute getValueConstraintShapeType_MaximumDisplayedValues();

	/**
	 * Returns the meta object for enum '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ConstraintDisplayPositionType <em>Constraint Display Position Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Display Position Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ConstraintDisplayPositionType
	 * @generated
	 */
	EEnum getConstraintDisplayPositionType();

	/**
	 * Returns the meta object for enum '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayOrientationType <em>Display Orientation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Display Orientation Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayOrientationType
	 * @generated
	 */
	EEnum getDisplayOrientationType();

	/**
	 * Returns the meta object for enum '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRelatedTypesType <em>Display Related Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Display Related Types Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRelatedTypesType
	 * @generated
	 */
	EEnum getDisplayRelatedTypesType();

	/**
	 * Returns the meta object for enum '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRoleNamesType <em>Display Role Names Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Display Role Names Type</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRoleNamesType
	 * @generated
	 */
	EEnum getDisplayRoleNamesType();

	/**
	 * Returns the meta object for data type '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ConstraintDisplayPositionType <em>Constraint Display Position Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Constraint Display Position Type Object</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ConstraintDisplayPositionType
	 * @model instanceClass="edu.neumont.schemas.orm._2006._04.orm.diagram.ConstraintDisplayPositionType"
	 *        extendedMetaData="name='ConstraintDisplayPosition_._type:Object' baseType='ConstraintDisplayPosition_._type'"
	 * @generated
	 */
	EDataType getConstraintDisplayPositionTypeObject();

	/**
	 * Returns the meta object for data type '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayOrientationType <em>Display Orientation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Display Orientation Type Object</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayOrientationType
	 * @model instanceClass="edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayOrientationType"
	 *        extendedMetaData="name='DisplayOrientation_._type:Object' baseType='DisplayOrientation_._type'"
	 * @generated
	 */
	EDataType getDisplayOrientationTypeObject();

	/**
	 * Returns the meta object for data type '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRelatedTypesType <em>Display Related Types Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Display Related Types Type Object</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRelatedTypesType
	 * @model instanceClass="edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRelatedTypesType"
	 *        extendedMetaData="name='DisplayRelatedTypesType:Object' baseType='DisplayRelatedTypesType'"
	 * @generated
	 */
	EDataType getDisplayRelatedTypesTypeObject();

	/**
	 * Returns the meta object for data type '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRoleNamesType <em>Display Role Names Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Display Role Names Type Object</em>'.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRoleNamesType
	 * @model instanceClass="edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRoleNamesType"
	 *        extendedMetaData="name='DisplayRoleNames_._type:Object' baseType='DisplayRoleNames_._type'"
	 * @generated
	 */
	EDataType getDisplayRoleNamesTypeObject();

	/**
	 * Returns the meta object for data type '<em>Maximum Displayed Columns Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Maximum Displayed Columns Type</em>'.
	 * @model instanceClass="short"
	 *        extendedMetaData="name='MaximumDisplayedColumns_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#short' minExclusive='0'"
	 * @generated
	 */
	EDataType getMaximumDisplayedColumnsType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Short <em>Maximum Displayed Columns Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Maximum Displayed Columns Type Object</em>'.
	 * @see java.lang.Short
	 * @model instanceClass="java.lang.Short"
	 *        extendedMetaData="name='MaximumDisplayedColumns_._type:Object' baseType='MaximumDisplayedColumns_._type'"
	 * @generated
	 */
	EDataType getMaximumDisplayedColumnsTypeObject();

	/**
	 * Returns the meta object for data type '<em>Maximum Displayed Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Maximum Displayed Values Type</em>'.
	 * @model instanceClass="short"
	 *        extendedMetaData="name='MaximumDisplayedValues_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#short' minExclusive='0'"
	 * @generated
	 */
	EDataType getMaximumDisplayedValuesType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Short <em>Maximum Displayed Values Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Maximum Displayed Values Type Object</em>'.
	 * @see java.lang.Short
	 * @model instanceClass="java.lang.Short"
	 *        extendedMetaData="name='MaximumDisplayedValues_._type:Object' baseType='MaximumDisplayedValues_._type'"
	 * @generated
	 */
	EDataType getMaximumDisplayedValuesTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DiagramFactory getDiagramFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.CardinalityConstraintShapeTypeImpl <em>Cardinality Constraint Shape Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.CardinalityConstraintShapeTypeImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getCardinalityConstraintShapeType()
		 * @generated
		 */
		EClass CARDINALITY_CONSTRAINT_SHAPE_TYPE = eINSTANCE.getCardinalityConstraintShapeType();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDINALITY_CONSTRAINT_SHAPE_TYPE__SUBJECT = eINSTANCE.getCardinalityConstraintShapeType_Subject();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DocumentRootImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Diagram Extension Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DIAGRAM_EXTENSION_SHAPE = eINSTANCE.getDocumentRoot_DiagramExtensionShape();

		/**
		 * The meta object literal for the '<em><b>Fact Type Relative Extension Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FACT_TYPE_RELATIVE_EXTENSION_SHAPE = eINSTANCE.getDocumentRoot_FactTypeRelativeExtensionShape();

		/**
		 * The meta object literal for the '<em><b>Object Type Relative Extension Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OBJECT_TYPE_RELATIVE_EXTENSION_SHAPE = eINSTANCE.getDocumentRoot_ObjectTypeRelativeExtensionShape();

		/**
		 * The meta object literal for the '<em><b>ORM Diagram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORM_DIAGRAM = eINSTANCE.getDocumentRoot_ORMDiagram();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUBJECT = eINSTANCE.getDocumentRoot_Subject();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ExternalConstraintShapeTypeImpl <em>External Constraint Shape Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ExternalConstraintShapeTypeImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getExternalConstraintShapeType()
		 * @generated
		 */
		EClass EXTERNAL_CONSTRAINT_SHAPE_TYPE = eINSTANCE.getExternalConstraintShapeType();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_CONSTRAINT_SHAPE_TYPE__SUBJECT = eINSTANCE.getExternalConstraintShapeType_Subject();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.FactTypeShapeTypeImpl <em>Fact Type Shape Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.FactTypeShapeTypeImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getFactTypeShapeType()
		 * @generated
		 */
		EClass FACT_TYPE_SHAPE_TYPE = eINSTANCE.getFactTypeShapeType();

		/**
		 * The meta object literal for the '<em><b>Relative Shapes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES = eINSTANCE.getFactTypeShapeType_RelativeShapes();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT_TYPE_SHAPE_TYPE__SUBJECT = eINSTANCE.getFactTypeShapeType_Subject();

		/**
		 * The meta object literal for the '<em><b>Role Display Order</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACT_TYPE_SHAPE_TYPE__ROLE_DISPLAY_ORDER = eINSTANCE.getFactTypeShapeType_RoleDisplayOrder();

		/**
		 * The meta object literal for the '<em><b>Constraint Display Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT_TYPE_SHAPE_TYPE__CONSTRAINT_DISPLAY_POSITION = eINSTANCE.getFactTypeShapeType_ConstraintDisplayPosition();

		/**
		 * The meta object literal for the '<em><b>Display As Object Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT_TYPE_SHAPE_TYPE__DISPLAY_AS_OBJECT_TYPE = eINSTANCE.getFactTypeShapeType_DisplayAsObjectType();

		/**
		 * The meta object literal for the '<em><b>Display Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT_TYPE_SHAPE_TYPE__DISPLAY_ORIENTATION = eINSTANCE.getFactTypeShapeType_DisplayOrientation();

		/**
		 * The meta object literal for the '<em><b>Display Related Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT_TYPE_SHAPE_TYPE__DISPLAY_RELATED_TYPES = eINSTANCE.getFactTypeShapeType_DisplayRelatedTypes();

		/**
		 * The meta object literal for the '<em><b>Display Role Names</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT_TYPE_SHAPE_TYPE__DISPLAY_ROLE_NAMES = eINSTANCE.getFactTypeShapeType_DisplayRoleNames();

		/**
		 * The meta object literal for the '<em><b>Expand Ref Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACT_TYPE_SHAPE_TYPE__EXPAND_REF_MODE = eINSTANCE.getFactTypeShapeType_ExpandRefMode();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.FrequencyConstraintShapeTypeImpl <em>Frequency Constraint Shape Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.FrequencyConstraintShapeTypeImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getFrequencyConstraintShapeType()
		 * @generated
		 */
		EClass FREQUENCY_CONSTRAINT_SHAPE_TYPE = eINSTANCE.getFrequencyConstraintShapeType();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ModelNoteShapeTypeImpl <em>Model Note Shape Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ModelNoteShapeTypeImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getModelNoteShapeType()
		 * @generated
		 */
		EClass MODEL_NOTE_SHAPE_TYPE = eINSTANCE.getModelNoteShapeType();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_NOTE_SHAPE_TYPE__SUBJECT = eINSTANCE.getModelNoteShapeType_Subject();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ObjectTypeShapeTypeImpl <em>Object Type Shape Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ObjectTypeShapeTypeImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getObjectTypeShapeType()
		 * @generated
		 */
		EClass OBJECT_TYPE_SHAPE_TYPE = eINSTANCE.getObjectTypeShapeType();

		/**
		 * The meta object literal for the '<em><b>Relative Shapes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES = eINSTANCE.getObjectTypeShapeType_RelativeShapes();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE_SHAPE_TYPE__SUBJECT = eINSTANCE.getObjectTypeShapeType_Subject();

		/**
		 * The meta object literal for the '<em><b>Display Related Types</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE_SHAPE_TYPE__DISPLAY_RELATED_TYPES = eINSTANCE.getObjectTypeShapeType_DisplayRelatedTypes();

		/**
		 * The meta object literal for the '<em><b>Expand Ref Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE_SHAPE_TYPE__EXPAND_REF_MODE = eINSTANCE.getObjectTypeShapeType_ExpandRefMode();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ORMDiagramTypeImpl <em>ORM Diagram Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ORMDiagramTypeImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getORMDiagramType()
		 * @generated
		 */
		EClass ORM_DIAGRAM_TYPE = eINSTANCE.getORMDiagramType();

		/**
		 * The meta object literal for the '<em><b>Shapes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM_DIAGRAM_TYPE__SHAPES = eINSTANCE.getORMDiagramType_Shapes();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORM_DIAGRAM_TYPE__SUBJECT = eINSTANCE.getORMDiagramType_Subject();

		/**
		 * The meta object literal for the '<em><b>Auto Populate Shapes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM_DIAGRAM_TYPE__AUTO_POPULATE_SHAPES = eINSTANCE.getORMDiagramType_AutoPopulateShapes();

		/**
		 * The meta object literal for the '<em><b>Base Font Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM_DIAGRAM_TYPE__BASE_FONT_NAME = eINSTANCE.getORMDiagramType_BaseFontName();

		/**
		 * The meta object literal for the '<em><b>Base Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM_DIAGRAM_TYPE__BASE_FONT_SIZE = eINSTANCE.getORMDiagramType_BaseFontSize();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM_DIAGRAM_TYPE__ID = eINSTANCE.getORMDiagramType_Id();

		/**
		 * The meta object literal for the '<em><b>Is Complete View</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM_DIAGRAM_TYPE__IS_COMPLETE_VIEW = eINSTANCE.getORMDiagramType_IsCompleteView();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORM_DIAGRAM_TYPE__NAME = eINSTANCE.getORMDiagramType_Name();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ReadingShapeTypeImpl <em>Reading Shape Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ReadingShapeTypeImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getReadingShapeType()
		 * @generated
		 */
		EClass READING_SHAPE_TYPE = eINSTANCE.getReadingShapeType();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READING_SHAPE_TYPE__SUBJECT = eINSTANCE.getReadingShapeType_Subject();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RelativeShapesTypeImpl <em>Relative Shapes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RelativeShapesTypeImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getRelativeShapesType()
		 * @generated
		 */
		EClass RELATIVE_SHAPES_TYPE = eINSTANCE.getRelativeShapesType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_SHAPES_TYPE__GROUP = eINSTANCE.getRelativeShapesType_Group();

		/**
		 * The meta object literal for the '<em><b>Objectified Fact Type Name Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_SHAPES_TYPE__OBJECTIFIED_FACT_TYPE_NAME_SHAPE = eINSTANCE.getRelativeShapesType_ObjectifiedFactTypeNameShape();

		/**
		 * The meta object literal for the '<em><b>Reading Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_SHAPES_TYPE__READING_SHAPE = eINSTANCE.getRelativeShapesType_ReadingShape();

		/**
		 * The meta object literal for the '<em><b>Value Constraint Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_SHAPES_TYPE__VALUE_CONSTRAINT_SHAPE = eINSTANCE.getRelativeShapesType_ValueConstraintShape();

		/**
		 * The meta object literal for the '<em><b>Role Name Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_SHAPES_TYPE__ROLE_NAME_SHAPE = eINSTANCE.getRelativeShapesType_RoleNameShape();

		/**
		 * The meta object literal for the '<em><b>Cardinality Constraint Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_SHAPES_TYPE__CARDINALITY_CONSTRAINT_SHAPE = eINSTANCE.getRelativeShapesType_CardinalityConstraintShape();

		/**
		 * The meta object literal for the '<em><b>Fact Type Relative Extension Shape Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_SHAPES_TYPE__FACT_TYPE_RELATIVE_EXTENSION_SHAPE_GROUP = eINSTANCE.getRelativeShapesType_FactTypeRelativeExtensionShapeGroup();

		/**
		 * The meta object literal for the '<em><b>Fact Type Relative Extension Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_SHAPES_TYPE__FACT_TYPE_RELATIVE_EXTENSION_SHAPE = eINSTANCE.getRelativeShapesType_FactTypeRelativeExtensionShape();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RelativeShapesType1Impl <em>Relative Shapes Type1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RelativeShapesType1Impl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getRelativeShapesType1()
		 * @generated
		 */
		EClass RELATIVE_SHAPES_TYPE1 = eINSTANCE.getRelativeShapesType1();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_SHAPES_TYPE1__GROUP = eINSTANCE.getRelativeShapesType1_Group();

		/**
		 * The meta object literal for the '<em><b>Value Constraint Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_SHAPES_TYPE1__VALUE_CONSTRAINT_SHAPE = eINSTANCE.getRelativeShapesType1_ValueConstraintShape();

		/**
		 * The meta object literal for the '<em><b>Cardinality Constraint Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_SHAPES_TYPE1__CARDINALITY_CONSTRAINT_SHAPE = eINSTANCE.getRelativeShapesType1_CardinalityConstraintShape();

		/**
		 * The meta object literal for the '<em><b>Object Type Relative Extension Shape Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIVE_SHAPES_TYPE1__OBJECT_TYPE_RELATIVE_EXTENSION_SHAPE_GROUP = eINSTANCE.getRelativeShapesType1_ObjectTypeRelativeExtensionShapeGroup();

		/**
		 * The meta object literal for the '<em><b>Object Type Relative Extension Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIVE_SHAPES_TYPE1__OBJECT_TYPE_RELATIVE_EXTENSION_SHAPE = eINSTANCE.getRelativeShapesType1_ObjectTypeRelativeExtensionShape();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RingConstraintShapeTypeImpl <em>Ring Constraint Shape Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RingConstraintShapeTypeImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getRingConstraintShapeType()
		 * @generated
		 */
		EClass RING_CONSTRAINT_SHAPE_TYPE = eINSTANCE.getRingConstraintShapeType();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RoleDisplayOrderTypeImpl <em>Role Display Order Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RoleDisplayOrderTypeImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getRoleDisplayOrderType()
		 * @generated
		 */
		EClass ROLE_DISPLAY_ORDER_TYPE = eINSTANCE.getRoleDisplayOrderType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_DISPLAY_ORDER_TYPE__GROUP = eINSTANCE.getRoleDisplayOrderType_Group();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_DISPLAY_ORDER_TYPE__ROLE = eINSTANCE.getRoleDisplayOrderType_Role();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RoleNameShapeTypeImpl <em>Role Name Shape Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RoleNameShapeTypeImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getRoleNameShapeType()
		 * @generated
		 */
		EClass ROLE_NAME_SHAPE_TYPE = eINSTANCE.getRoleNameShapeType();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROLE_NAME_SHAPE_TYPE__SUBJECT = eINSTANCE.getRoleNameShapeType_Subject();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RoleTypeImpl <em>Role Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.RoleTypeImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getRoleType()
		 * @generated
		 */
		EClass ROLE_TYPE = eINSTANCE.getRoleType();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE_TYPE__REF = eINSTANCE.getRoleType_Ref();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapesTypeImpl <em>Shapes Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapesTypeImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getShapesType()
		 * @generated
		 */
		EClass SHAPES_TYPE = eINSTANCE.getShapesType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPES_TYPE__GROUP = eINSTANCE.getShapesType_Group();

		/**
		 * The meta object literal for the '<em><b>Object Type Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPES_TYPE__OBJECT_TYPE_SHAPE = eINSTANCE.getShapesType_ObjectTypeShape();

		/**
		 * The meta object literal for the '<em><b>Fact Type Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPES_TYPE__FACT_TYPE_SHAPE = eINSTANCE.getShapesType_FactTypeShape();

		/**
		 * The meta object literal for the '<em><b>External Constraint Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPES_TYPE__EXTERNAL_CONSTRAINT_SHAPE = eINSTANCE.getShapesType_ExternalConstraintShape();

		/**
		 * The meta object literal for the '<em><b>Frequency Constraint Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPES_TYPE__FREQUENCY_CONSTRAINT_SHAPE = eINSTANCE.getShapesType_FrequencyConstraintShape();

		/**
		 * The meta object literal for the '<em><b>Ring Constraint Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPES_TYPE__RING_CONSTRAINT_SHAPE = eINSTANCE.getShapesType_RingConstraintShape();

		/**
		 * The meta object literal for the '<em><b>Value Comparison Constraint Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPES_TYPE__VALUE_COMPARISON_CONSTRAINT_SHAPE = eINSTANCE.getShapesType_ValueComparisonConstraintShape();

		/**
		 * The meta object literal for the '<em><b>Model Note Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPES_TYPE__MODEL_NOTE_SHAPE = eINSTANCE.getShapesType_ModelNoteShape();

		/**
		 * The meta object literal for the '<em><b>Diagram Extension Shape Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPES_TYPE__DIAGRAM_EXTENSION_SHAPE_GROUP = eINSTANCE.getShapesType_DiagramExtensionShapeGroup();

		/**
		 * The meta object literal for the '<em><b>Diagram Extension Shape</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPES_TYPE__DIAGRAM_EXTENSION_SHAPE = eINSTANCE.getShapesType_DiagramExtensionShape();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapeTypeImpl <em>Shape Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ShapeTypeImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getShapeType()
		 * @generated
		 */
		EClass SHAPE_TYPE = eINSTANCE.getShapeType();

		/**
		 * The meta object literal for the '<em><b>Absolute Bounds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_TYPE__ABSOLUTE_BOUNDS = eINSTANCE.getShapeType_AbsoluteBounds();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_TYPE__ID = eINSTANCE.getShapeType_Id();

		/**
		 * The meta object literal for the '<em><b>Is Expanded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE_TYPE__IS_EXPANDED = eINSTANCE.getShapeType_IsExpanded();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.SubjectRefImpl <em>Subject Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.SubjectRefImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getSubjectRef()
		 * @generated
		 */
		EClass SUBJECT_REF = eINSTANCE.getSubjectRef();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECT_REF__REF = eINSTANCE.getSubjectRef_Ref();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ValueComparisonConstraintShapeTypeImpl <em>Value Comparison Constraint Shape Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ValueComparisonConstraintShapeTypeImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getValueComparisonConstraintShapeType()
		 * @generated
		 */
		EClass VALUE_COMPARISON_CONSTRAINT_SHAPE_TYPE = eINSTANCE.getValueComparisonConstraintShapeType();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ValueConstraintShapeTypeImpl <em>Value Constraint Shape Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ValueConstraintShapeTypeImpl
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getValueConstraintShapeType()
		 * @generated
		 */
		EClass VALUE_CONSTRAINT_SHAPE_TYPE = eINSTANCE.getValueConstraintShapeType();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_CONSTRAINT_SHAPE_TYPE__SUBJECT = eINSTANCE.getValueConstraintShapeType_Subject();

		/**
		 * The meta object literal for the '<em><b>Maximum Displayed Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_CONSTRAINT_SHAPE_TYPE__MAXIMUM_DISPLAYED_COLUMNS = eINSTANCE.getValueConstraintShapeType_MaximumDisplayedColumns();

		/**
		 * The meta object literal for the '<em><b>Maximum Displayed Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_CONSTRAINT_SHAPE_TYPE__MAXIMUM_DISPLAYED_VALUES = eINSTANCE.getValueConstraintShapeType_MaximumDisplayedValues();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ConstraintDisplayPositionType <em>Constraint Display Position Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ConstraintDisplayPositionType
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getConstraintDisplayPositionType()
		 * @generated
		 */
		EEnum CONSTRAINT_DISPLAY_POSITION_TYPE = eINSTANCE.getConstraintDisplayPositionType();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayOrientationType <em>Display Orientation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayOrientationType
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getDisplayOrientationType()
		 * @generated
		 */
		EEnum DISPLAY_ORIENTATION_TYPE = eINSTANCE.getDisplayOrientationType();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRelatedTypesType <em>Display Related Types Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRelatedTypesType
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getDisplayRelatedTypesType()
		 * @generated
		 */
		EEnum DISPLAY_RELATED_TYPES_TYPE = eINSTANCE.getDisplayRelatedTypesType();

		/**
		 * The meta object literal for the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRoleNamesType <em>Display Role Names Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRoleNamesType
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getDisplayRoleNamesType()
		 * @generated
		 */
		EEnum DISPLAY_ROLE_NAMES_TYPE = eINSTANCE.getDisplayRoleNamesType();

		/**
		 * The meta object literal for the '<em>Constraint Display Position Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ConstraintDisplayPositionType
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getConstraintDisplayPositionTypeObject()
		 * @generated
		 */
		EDataType CONSTRAINT_DISPLAY_POSITION_TYPE_OBJECT = eINSTANCE.getConstraintDisplayPositionTypeObject();

		/**
		 * The meta object literal for the '<em>Display Orientation Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayOrientationType
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getDisplayOrientationTypeObject()
		 * @generated
		 */
		EDataType DISPLAY_ORIENTATION_TYPE_OBJECT = eINSTANCE.getDisplayOrientationTypeObject();

		/**
		 * The meta object literal for the '<em>Display Related Types Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRelatedTypesType
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getDisplayRelatedTypesTypeObject()
		 * @generated
		 */
		EDataType DISPLAY_RELATED_TYPES_TYPE_OBJECT = eINSTANCE.getDisplayRelatedTypesTypeObject();

		/**
		 * The meta object literal for the '<em>Display Role Names Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRoleNamesType
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getDisplayRoleNamesTypeObject()
		 * @generated
		 */
		EDataType DISPLAY_ROLE_NAMES_TYPE_OBJECT = eINSTANCE.getDisplayRoleNamesTypeObject();

		/**
		 * The meta object literal for the '<em>Maximum Displayed Columns Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getMaximumDisplayedColumnsType()
		 * @generated
		 */
		EDataType MAXIMUM_DISPLAYED_COLUMNS_TYPE = eINSTANCE.getMaximumDisplayedColumnsType();

		/**
		 * The meta object literal for the '<em>Maximum Displayed Columns Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Short
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getMaximumDisplayedColumnsTypeObject()
		 * @generated
		 */
		EDataType MAXIMUM_DISPLAYED_COLUMNS_TYPE_OBJECT = eINSTANCE.getMaximumDisplayedColumnsTypeObject();

		/**
		 * The meta object literal for the '<em>Maximum Displayed Values Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getMaximumDisplayedValuesType()
		 * @generated
		 */
		EDataType MAXIMUM_DISPLAYED_VALUES_TYPE = eINSTANCE.getMaximumDisplayedValuesType();

		/**
		 * The meta object literal for the '<em>Maximum Displayed Values Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Short
		 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DiagramPackageImpl#getMaximumDisplayedValuesTypeObject()
		 * @generated
		 */
		EDataType MAXIMUM_DISPLAYED_VALUES_TYPE_OBJECT = eINSTANCE.getMaximumDisplayedValuesTypeObject();

	}

} //DiagramPackage
