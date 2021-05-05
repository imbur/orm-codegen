/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram.impl;

import edu.neumont.schemas.orm._2006._04.orm.diagram.CardinalityConstraintShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ConstraintDisplayPositionType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramFactory;
import edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage;
import edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayOrientationType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRelatedTypesType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRoleNamesType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ExternalConstraintShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.FrequencyConstraintShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ModelNoteShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ReadingShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1;
import edu.neumont.schemas.orm._2006._04.orm.diagram.RingConstraintShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.RoleDisplayOrderType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.RoleNameShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.RoleType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.SubjectRef;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ValueComparisonConstraintShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType;

import edu.neumont.schemas.orm._2006._04.orm.diagram.util.DiagramValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramPackageImpl extends EPackageImpl implements DiagramPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityConstraintShapeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalConstraintShapeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factTypeShapeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frequencyConstraintShapeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelNoteShapeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeShapeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ormDiagramTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readingShapeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeShapesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relativeShapesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ringConstraintShapeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleDisplayOrderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleNameShapeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueComparisonConstraintShapeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueConstraintShapeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintDisplayPositionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum displayOrientationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum displayRelatedTypesTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum displayRoleNamesTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType constraintDisplayPositionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType displayOrientationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType displayRelatedTypesTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType displayRoleNamesTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maximumDisplayedColumnsTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maximumDisplayedColumnsTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maximumDisplayedValuesTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType maximumDisplayedValuesTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DiagramPackageImpl() {
		super(eNS_URI, DiagramFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DiagramPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DiagramPackage init() {
		if (isInited) return (DiagramPackage)EPackage.Registry.INSTANCE.getEPackage(DiagramPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDiagramPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DiagramPackageImpl theDiagramPackage = registeredDiagramPackage instanceof DiagramPackageImpl ? (DiagramPackageImpl)registeredDiagramPackage : new DiagramPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDiagramPackage.createPackageContents();

		// Initialize created meta-data
		theDiagramPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theDiagramPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return DiagramValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theDiagramPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DiagramPackage.eNS_URI, theDiagramPackage);
		return theDiagramPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinalityConstraintShapeType() {
		return cardinalityConstraintShapeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardinalityConstraintShapeType_Subject() {
		return (EReference)cardinalityConstraintShapeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DiagramExtensionShape() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FactTypeRelativeExtensionShape() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectTypeRelativeExtensionShape() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ORMDiagram() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Subject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalConstraintShapeType() {
		return externalConstraintShapeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalConstraintShapeType_Subject() {
		return (EReference)externalConstraintShapeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFactTypeShapeType() {
		return factTypeShapeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeShapeType_RelativeShapes() {
		return (EReference)factTypeShapeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeShapeType_Subject() {
		return (EReference)factTypeShapeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFactTypeShapeType_RoleDisplayOrder() {
		return (EReference)factTypeShapeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeShapeType_ConstraintDisplayPosition() {
		return (EAttribute)factTypeShapeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeShapeType_DisplayAsObjectType() {
		return (EAttribute)factTypeShapeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeShapeType_DisplayOrientation() {
		return (EAttribute)factTypeShapeTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeShapeType_DisplayRelatedTypes() {
		return (EAttribute)factTypeShapeTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeShapeType_DisplayRoleNames() {
		return (EAttribute)factTypeShapeTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFactTypeShapeType_ExpandRefMode() {
		return (EAttribute)factTypeShapeTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrequencyConstraintShapeType() {
		return frequencyConstraintShapeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelNoteShapeType() {
		return modelNoteShapeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelNoteShapeType_Subject() {
		return (EReference)modelNoteShapeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectTypeShapeType() {
		return objectTypeShapeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTypeShapeType_RelativeShapes() {
		return (EReference)objectTypeShapeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTypeShapeType_Subject() {
		return (EReference)objectTypeShapeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectTypeShapeType_DisplayRelatedTypes() {
		return (EAttribute)objectTypeShapeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectTypeShapeType_ExpandRefMode() {
		return (EAttribute)objectTypeShapeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getORMDiagramType() {
		return ormDiagramTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORMDiagramType_Shapes() {
		return (EReference)ormDiagramTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getORMDiagramType_Subject() {
		return (EReference)ormDiagramTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getORMDiagramType_AutoPopulateShapes() {
		return (EAttribute)ormDiagramTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getORMDiagramType_BaseFontName() {
		return (EAttribute)ormDiagramTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getORMDiagramType_BaseFontSize() {
		return (EAttribute)ormDiagramTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getORMDiagramType_Id() {
		return (EAttribute)ormDiagramTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getORMDiagramType_IsCompleteView() {
		return (EAttribute)ormDiagramTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getORMDiagramType_Name() {
		return (EAttribute)ormDiagramTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadingShapeType() {
		return readingShapeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadingShapeType_Subject() {
		return (EReference)readingShapeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeShapesType() {
		return relativeShapesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeShapesType_Group() {
		return (EAttribute)relativeShapesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeShapesType_ObjectifiedFactTypeNameShape() {
		return (EReference)relativeShapesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeShapesType_ReadingShape() {
		return (EReference)relativeShapesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeShapesType_ValueConstraintShape() {
		return (EReference)relativeShapesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeShapesType_RoleNameShape() {
		return (EReference)relativeShapesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeShapesType_CardinalityConstraintShape() {
		return (EReference)relativeShapesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeShapesType_FactTypeRelativeExtensionShapeGroup() {
		return (EAttribute)relativeShapesTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeShapesType_FactTypeRelativeExtensionShape() {
		return (EReference)relativeShapesTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelativeShapesType1() {
		return relativeShapesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeShapesType1_Group() {
		return (EAttribute)relativeShapesType1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeShapesType1_ValueConstraintShape() {
		return (EReference)relativeShapesType1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeShapesType1_CardinalityConstraintShape() {
		return (EReference)relativeShapesType1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelativeShapesType1_ObjectTypeRelativeExtensionShapeGroup() {
		return (EAttribute)relativeShapesType1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelativeShapesType1_ObjectTypeRelativeExtensionShape() {
		return (EReference)relativeShapesType1EClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRingConstraintShapeType() {
		return ringConstraintShapeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleDisplayOrderType() {
		return roleDisplayOrderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleDisplayOrderType_Group() {
		return (EAttribute)roleDisplayOrderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleDisplayOrderType_Role() {
		return (EReference)roleDisplayOrderTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleNameShapeType() {
		return roleNameShapeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoleNameShapeType_Subject() {
		return (EReference)roleNameShapeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoleType() {
		return roleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoleType_Ref() {
		return (EAttribute)roleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapesType() {
		return shapesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapesType_Group() {
		return (EAttribute)shapesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapesType_ObjectTypeShape() {
		return (EReference)shapesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapesType_FactTypeShape() {
		return (EReference)shapesTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapesType_ExternalConstraintShape() {
		return (EReference)shapesTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapesType_FrequencyConstraintShape() {
		return (EReference)shapesTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapesType_RingConstraintShape() {
		return (EReference)shapesTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapesType_ValueComparisonConstraintShape() {
		return (EReference)shapesTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapesType_ModelNoteShape() {
		return (EReference)shapesTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapesType_DiagramExtensionShapeGroup() {
		return (EAttribute)shapesTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShapesType_DiagramExtensionShape() {
		return (EReference)shapesTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapeType() {
		return shapeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeType_AbsoluteBounds() {
		return (EAttribute)shapeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeType_Id() {
		return (EAttribute)shapeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapeType_IsExpanded() {
		return (EAttribute)shapeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectRef() {
		return subjectRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubjectRef_Ref() {
		return (EAttribute)subjectRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueComparisonConstraintShapeType() {
		return valueComparisonConstraintShapeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueConstraintShapeType() {
		return valueConstraintShapeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueConstraintShapeType_Subject() {
		return (EReference)valueConstraintShapeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueConstraintShapeType_MaximumDisplayedColumns() {
		return (EAttribute)valueConstraintShapeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueConstraintShapeType_MaximumDisplayedValues() {
		return (EAttribute)valueConstraintShapeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstraintDisplayPositionType() {
		return constraintDisplayPositionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisplayOrientationType() {
		return displayOrientationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisplayRelatedTypesType() {
		return displayRelatedTypesTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDisplayRoleNamesType() {
		return displayRoleNamesTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConstraintDisplayPositionTypeObject() {
		return constraintDisplayPositionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDisplayOrientationTypeObject() {
		return displayOrientationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDisplayRelatedTypesTypeObject() {
		return displayRelatedTypesTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDisplayRoleNamesTypeObject() {
		return displayRoleNamesTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMaximumDisplayedColumnsType() {
		return maximumDisplayedColumnsTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMaximumDisplayedColumnsTypeObject() {
		return maximumDisplayedColumnsTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMaximumDisplayedValuesType() {
		return maximumDisplayedValuesTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMaximumDisplayedValuesTypeObject() {
		return maximumDisplayedValuesTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramFactory getDiagramFactory() {
		return (DiagramFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cardinalityConstraintShapeTypeEClass = createEClass(CARDINALITY_CONSTRAINT_SHAPE_TYPE);
		createEReference(cardinalityConstraintShapeTypeEClass, CARDINALITY_CONSTRAINT_SHAPE_TYPE__SUBJECT);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DIAGRAM_EXTENSION_SHAPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FACT_TYPE_RELATIVE_EXTENSION_SHAPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OBJECT_TYPE_RELATIVE_EXTENSION_SHAPE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORM_DIAGRAM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUBJECT);

		externalConstraintShapeTypeEClass = createEClass(EXTERNAL_CONSTRAINT_SHAPE_TYPE);
		createEReference(externalConstraintShapeTypeEClass, EXTERNAL_CONSTRAINT_SHAPE_TYPE__SUBJECT);

		factTypeShapeTypeEClass = createEClass(FACT_TYPE_SHAPE_TYPE);
		createEReference(factTypeShapeTypeEClass, FACT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES);
		createEReference(factTypeShapeTypeEClass, FACT_TYPE_SHAPE_TYPE__SUBJECT);
		createEReference(factTypeShapeTypeEClass, FACT_TYPE_SHAPE_TYPE__ROLE_DISPLAY_ORDER);
		createEAttribute(factTypeShapeTypeEClass, FACT_TYPE_SHAPE_TYPE__CONSTRAINT_DISPLAY_POSITION);
		createEAttribute(factTypeShapeTypeEClass, FACT_TYPE_SHAPE_TYPE__DISPLAY_AS_OBJECT_TYPE);
		createEAttribute(factTypeShapeTypeEClass, FACT_TYPE_SHAPE_TYPE__DISPLAY_ORIENTATION);
		createEAttribute(factTypeShapeTypeEClass, FACT_TYPE_SHAPE_TYPE__DISPLAY_RELATED_TYPES);
		createEAttribute(factTypeShapeTypeEClass, FACT_TYPE_SHAPE_TYPE__DISPLAY_ROLE_NAMES);
		createEAttribute(factTypeShapeTypeEClass, FACT_TYPE_SHAPE_TYPE__EXPAND_REF_MODE);

		frequencyConstraintShapeTypeEClass = createEClass(FREQUENCY_CONSTRAINT_SHAPE_TYPE);

		modelNoteShapeTypeEClass = createEClass(MODEL_NOTE_SHAPE_TYPE);
		createEReference(modelNoteShapeTypeEClass, MODEL_NOTE_SHAPE_TYPE__SUBJECT);

		objectTypeShapeTypeEClass = createEClass(OBJECT_TYPE_SHAPE_TYPE);
		createEReference(objectTypeShapeTypeEClass, OBJECT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES);
		createEReference(objectTypeShapeTypeEClass, OBJECT_TYPE_SHAPE_TYPE__SUBJECT);
		createEAttribute(objectTypeShapeTypeEClass, OBJECT_TYPE_SHAPE_TYPE__DISPLAY_RELATED_TYPES);
		createEAttribute(objectTypeShapeTypeEClass, OBJECT_TYPE_SHAPE_TYPE__EXPAND_REF_MODE);

		ormDiagramTypeEClass = createEClass(ORM_DIAGRAM_TYPE);
		createEReference(ormDiagramTypeEClass, ORM_DIAGRAM_TYPE__SHAPES);
		createEReference(ormDiagramTypeEClass, ORM_DIAGRAM_TYPE__SUBJECT);
		createEAttribute(ormDiagramTypeEClass, ORM_DIAGRAM_TYPE__AUTO_POPULATE_SHAPES);
		createEAttribute(ormDiagramTypeEClass, ORM_DIAGRAM_TYPE__BASE_FONT_NAME);
		createEAttribute(ormDiagramTypeEClass, ORM_DIAGRAM_TYPE__BASE_FONT_SIZE);
		createEAttribute(ormDiagramTypeEClass, ORM_DIAGRAM_TYPE__ID);
		createEAttribute(ormDiagramTypeEClass, ORM_DIAGRAM_TYPE__IS_COMPLETE_VIEW);
		createEAttribute(ormDiagramTypeEClass, ORM_DIAGRAM_TYPE__NAME);

		readingShapeTypeEClass = createEClass(READING_SHAPE_TYPE);
		createEReference(readingShapeTypeEClass, READING_SHAPE_TYPE__SUBJECT);

		relativeShapesTypeEClass = createEClass(RELATIVE_SHAPES_TYPE);
		createEAttribute(relativeShapesTypeEClass, RELATIVE_SHAPES_TYPE__GROUP);
		createEReference(relativeShapesTypeEClass, RELATIVE_SHAPES_TYPE__OBJECTIFIED_FACT_TYPE_NAME_SHAPE);
		createEReference(relativeShapesTypeEClass, RELATIVE_SHAPES_TYPE__READING_SHAPE);
		createEReference(relativeShapesTypeEClass, RELATIVE_SHAPES_TYPE__VALUE_CONSTRAINT_SHAPE);
		createEReference(relativeShapesTypeEClass, RELATIVE_SHAPES_TYPE__ROLE_NAME_SHAPE);
		createEReference(relativeShapesTypeEClass, RELATIVE_SHAPES_TYPE__CARDINALITY_CONSTRAINT_SHAPE);
		createEAttribute(relativeShapesTypeEClass, RELATIVE_SHAPES_TYPE__FACT_TYPE_RELATIVE_EXTENSION_SHAPE_GROUP);
		createEReference(relativeShapesTypeEClass, RELATIVE_SHAPES_TYPE__FACT_TYPE_RELATIVE_EXTENSION_SHAPE);

		relativeShapesType1EClass = createEClass(RELATIVE_SHAPES_TYPE1);
		createEAttribute(relativeShapesType1EClass, RELATIVE_SHAPES_TYPE1__GROUP);
		createEReference(relativeShapesType1EClass, RELATIVE_SHAPES_TYPE1__VALUE_CONSTRAINT_SHAPE);
		createEReference(relativeShapesType1EClass, RELATIVE_SHAPES_TYPE1__CARDINALITY_CONSTRAINT_SHAPE);
		createEAttribute(relativeShapesType1EClass, RELATIVE_SHAPES_TYPE1__OBJECT_TYPE_RELATIVE_EXTENSION_SHAPE_GROUP);
		createEReference(relativeShapesType1EClass, RELATIVE_SHAPES_TYPE1__OBJECT_TYPE_RELATIVE_EXTENSION_SHAPE);

		ringConstraintShapeTypeEClass = createEClass(RING_CONSTRAINT_SHAPE_TYPE);

		roleDisplayOrderTypeEClass = createEClass(ROLE_DISPLAY_ORDER_TYPE);
		createEAttribute(roleDisplayOrderTypeEClass, ROLE_DISPLAY_ORDER_TYPE__GROUP);
		createEReference(roleDisplayOrderTypeEClass, ROLE_DISPLAY_ORDER_TYPE__ROLE);

		roleNameShapeTypeEClass = createEClass(ROLE_NAME_SHAPE_TYPE);
		createEReference(roleNameShapeTypeEClass, ROLE_NAME_SHAPE_TYPE__SUBJECT);

		roleTypeEClass = createEClass(ROLE_TYPE);
		createEAttribute(roleTypeEClass, ROLE_TYPE__REF);

		shapesTypeEClass = createEClass(SHAPES_TYPE);
		createEAttribute(shapesTypeEClass, SHAPES_TYPE__GROUP);
		createEReference(shapesTypeEClass, SHAPES_TYPE__OBJECT_TYPE_SHAPE);
		createEReference(shapesTypeEClass, SHAPES_TYPE__FACT_TYPE_SHAPE);
		createEReference(shapesTypeEClass, SHAPES_TYPE__EXTERNAL_CONSTRAINT_SHAPE);
		createEReference(shapesTypeEClass, SHAPES_TYPE__FREQUENCY_CONSTRAINT_SHAPE);
		createEReference(shapesTypeEClass, SHAPES_TYPE__RING_CONSTRAINT_SHAPE);
		createEReference(shapesTypeEClass, SHAPES_TYPE__VALUE_COMPARISON_CONSTRAINT_SHAPE);
		createEReference(shapesTypeEClass, SHAPES_TYPE__MODEL_NOTE_SHAPE);
		createEAttribute(shapesTypeEClass, SHAPES_TYPE__DIAGRAM_EXTENSION_SHAPE_GROUP);
		createEReference(shapesTypeEClass, SHAPES_TYPE__DIAGRAM_EXTENSION_SHAPE);

		shapeTypeEClass = createEClass(SHAPE_TYPE);
		createEAttribute(shapeTypeEClass, SHAPE_TYPE__ABSOLUTE_BOUNDS);
		createEAttribute(shapeTypeEClass, SHAPE_TYPE__ID);
		createEAttribute(shapeTypeEClass, SHAPE_TYPE__IS_EXPANDED);

		subjectRefEClass = createEClass(SUBJECT_REF);
		createEAttribute(subjectRefEClass, SUBJECT_REF__REF);

		valueComparisonConstraintShapeTypeEClass = createEClass(VALUE_COMPARISON_CONSTRAINT_SHAPE_TYPE);

		valueConstraintShapeTypeEClass = createEClass(VALUE_CONSTRAINT_SHAPE_TYPE);
		createEReference(valueConstraintShapeTypeEClass, VALUE_CONSTRAINT_SHAPE_TYPE__SUBJECT);
		createEAttribute(valueConstraintShapeTypeEClass, VALUE_CONSTRAINT_SHAPE_TYPE__MAXIMUM_DISPLAYED_COLUMNS);
		createEAttribute(valueConstraintShapeTypeEClass, VALUE_CONSTRAINT_SHAPE_TYPE__MAXIMUM_DISPLAYED_VALUES);

		// Create enums
		constraintDisplayPositionTypeEEnum = createEEnum(CONSTRAINT_DISPLAY_POSITION_TYPE);
		displayOrientationTypeEEnum = createEEnum(DISPLAY_ORIENTATION_TYPE);
		displayRelatedTypesTypeEEnum = createEEnum(DISPLAY_RELATED_TYPES_TYPE);
		displayRoleNamesTypeEEnum = createEEnum(DISPLAY_ROLE_NAMES_TYPE);

		// Create data types
		constraintDisplayPositionTypeObjectEDataType = createEDataType(CONSTRAINT_DISPLAY_POSITION_TYPE_OBJECT);
		displayOrientationTypeObjectEDataType = createEDataType(DISPLAY_ORIENTATION_TYPE_OBJECT);
		displayRelatedTypesTypeObjectEDataType = createEDataType(DISPLAY_RELATED_TYPES_TYPE_OBJECT);
		displayRoleNamesTypeObjectEDataType = createEDataType(DISPLAY_ROLE_NAMES_TYPE_OBJECT);
		maximumDisplayedColumnsTypeEDataType = createEDataType(MAXIMUM_DISPLAYED_COLUMNS_TYPE);
		maximumDisplayedColumnsTypeObjectEDataType = createEDataType(MAXIMUM_DISPLAYED_COLUMNS_TYPE_OBJECT);
		maximumDisplayedValuesTypeEDataType = createEDataType(MAXIMUM_DISPLAYED_VALUES_TYPE);
		maximumDisplayedValuesTypeObjectEDataType = createEDataType(MAXIMUM_DISPLAYED_VALUES_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cardinalityConstraintShapeTypeEClass.getESuperTypes().add(this.getShapeType());
		externalConstraintShapeTypeEClass.getESuperTypes().add(this.getShapeType());
		factTypeShapeTypeEClass.getESuperTypes().add(this.getShapeType());
		frequencyConstraintShapeTypeEClass.getESuperTypes().add(this.getExternalConstraintShapeType());
		modelNoteShapeTypeEClass.getESuperTypes().add(this.getShapeType());
		objectTypeShapeTypeEClass.getESuperTypes().add(this.getShapeType());
		readingShapeTypeEClass.getESuperTypes().add(this.getShapeType());
		ringConstraintShapeTypeEClass.getESuperTypes().add(this.getExternalConstraintShapeType());
		roleNameShapeTypeEClass.getESuperTypes().add(this.getShapeType());
		valueComparisonConstraintShapeTypeEClass.getESuperTypes().add(this.getExternalConstraintShapeType());
		valueConstraintShapeTypeEClass.getESuperTypes().add(this.getShapeType());

		// Initialize classes, features, and operations; add parameters
		initEClass(cardinalityConstraintShapeTypeEClass, CardinalityConstraintShapeType.class, "CardinalityConstraintShapeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardinalityConstraintShapeType_Subject(), this.getSubjectRef(), null, "subject", null, 1, 1, CardinalityConstraintShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_DiagramExtensionShape(), this.getShapeType(), null, "diagramExtensionShape", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_FactTypeRelativeExtensionShape(), this.getShapeType(), null, "factTypeRelativeExtensionShape", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ObjectTypeRelativeExtensionShape(), this.getShapeType(), null, "objectTypeRelativeExtensionShape", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ORMDiagram(), this.getORMDiagramType(), null, "oRMDiagram", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Subject(), this.getSubjectRef(), null, "subject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(externalConstraintShapeTypeEClass, ExternalConstraintShapeType.class, "ExternalConstraintShapeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExternalConstraintShapeType_Subject(), this.getSubjectRef(), null, "subject", null, 1, 1, ExternalConstraintShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(factTypeShapeTypeEClass, FactTypeShapeType.class, "FactTypeShapeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFactTypeShapeType_RelativeShapes(), this.getRelativeShapesType(), null, "relativeShapes", null, 0, 1, FactTypeShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactTypeShapeType_Subject(), this.getSubjectRef(), null, "subject", null, 1, 1, FactTypeShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFactTypeShapeType_RoleDisplayOrder(), this.getRoleDisplayOrderType(), null, "roleDisplayOrder", null, 0, 1, FactTypeShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactTypeShapeType_ConstraintDisplayPosition(), this.getConstraintDisplayPositionType(), "constraintDisplayPosition", "Top", 0, 1, FactTypeShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactTypeShapeType_DisplayAsObjectType(), theXMLTypePackage.getBoolean(), "displayAsObjectType", "false", 0, 1, FactTypeShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactTypeShapeType_DisplayOrientation(), this.getDisplayOrientationType(), "displayOrientation", "Horizontal", 0, 1, FactTypeShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactTypeShapeType_DisplayRelatedTypes(), this.getDisplayRelatedTypesType(), "displayRelatedTypes", "AttachAllTypes", 0, 1, FactTypeShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactTypeShapeType_DisplayRoleNames(), this.getDisplayRoleNamesType(), "displayRoleNames", "UserDefault", 0, 1, FactTypeShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFactTypeShapeType_ExpandRefMode(), theXMLTypePackage.getBoolean(), "expandRefMode", "false", 0, 1, FactTypeShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frequencyConstraintShapeTypeEClass, FrequencyConstraintShapeType.class, "FrequencyConstraintShapeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelNoteShapeTypeEClass, ModelNoteShapeType.class, "ModelNoteShapeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelNoteShapeType_Subject(), this.getSubjectRef(), null, "subject", null, 1, 1, ModelNoteShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectTypeShapeTypeEClass, ObjectTypeShapeType.class, "ObjectTypeShapeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectTypeShapeType_RelativeShapes(), this.getRelativeShapesType1(), null, "relativeShapes", null, 0, 1, ObjectTypeShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectTypeShapeType_Subject(), this.getSubjectRef(), null, "subject", null, 1, 1, ObjectTypeShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectTypeShapeType_DisplayRelatedTypes(), this.getDisplayRelatedTypesType(), "displayRelatedTypes", "AttachAllTypes", 0, 1, ObjectTypeShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectTypeShapeType_ExpandRefMode(), theXMLTypePackage.getBoolean(), "expandRefMode", "false", 0, 1, ObjectTypeShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ormDiagramTypeEClass, ORMDiagramType.class, "ORMDiagramType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getORMDiagramType_Shapes(), this.getShapesType(), null, "shapes", null, 0, 1, ORMDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getORMDiagramType_Subject(), this.getSubjectRef(), null, "subject", null, 1, 1, ORMDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getORMDiagramType_AutoPopulateShapes(), theXMLTypePackage.getBoolean(), "autoPopulateShapes", "false", 0, 1, ORMDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getORMDiagramType_BaseFontName(), theXMLTypePackage.getString(), "baseFontName", null, 1, 1, ORMDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getORMDiagramType_BaseFontSize(), theXMLTypePackage.getDecimal(), "baseFontSize", null, 1, 1, ORMDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getORMDiagramType_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, ORMDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getORMDiagramType_IsCompleteView(), theXMLTypePackage.getBoolean(), "isCompleteView", null, 1, 1, ORMDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getORMDiagramType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, ORMDiagramType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readingShapeTypeEClass, ReadingShapeType.class, "ReadingShapeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadingShapeType_Subject(), this.getSubjectRef(), null, "subject", null, 1, 1, ReadingShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relativeShapesTypeEClass, RelativeShapesType.class, "RelativeShapesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelativeShapesType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, RelativeShapesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelativeShapesType_ObjectifiedFactTypeNameShape(), this.getObjectTypeShapeType(), null, "objectifiedFactTypeNameShape", null, 0, -1, RelativeShapesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRelativeShapesType_ReadingShape(), this.getReadingShapeType(), null, "readingShape", null, 0, -1, RelativeShapesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRelativeShapesType_ValueConstraintShape(), this.getValueConstraintShapeType(), null, "valueConstraintShape", null, 0, -1, RelativeShapesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRelativeShapesType_RoleNameShape(), this.getRoleNameShapeType(), null, "roleNameShape", null, 0, -1, RelativeShapesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRelativeShapesType_CardinalityConstraintShape(), this.getCardinalityConstraintShapeType(), null, "cardinalityConstraintShape", null, 0, -1, RelativeShapesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeShapesType_FactTypeRelativeExtensionShapeGroup(), ecorePackage.getEFeatureMapEntry(), "factTypeRelativeExtensionShapeGroup", null, 0, -1, RelativeShapesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRelativeShapesType_FactTypeRelativeExtensionShape(), this.getShapeType(), null, "factTypeRelativeExtensionShape", null, 0, -1, RelativeShapesType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(relativeShapesType1EClass, RelativeShapesType1.class, "RelativeShapesType1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelativeShapesType1_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, RelativeShapesType1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelativeShapesType1_ValueConstraintShape(), this.getValueConstraintShapeType(), null, "valueConstraintShape", null, 0, -1, RelativeShapesType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRelativeShapesType1_CardinalityConstraintShape(), this.getCardinalityConstraintShapeType(), null, "cardinalityConstraintShape", null, 0, -1, RelativeShapesType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelativeShapesType1_ObjectTypeRelativeExtensionShapeGroup(), ecorePackage.getEFeatureMapEntry(), "objectTypeRelativeExtensionShapeGroup", null, 0, -1, RelativeShapesType1.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRelativeShapesType1_ObjectTypeRelativeExtensionShape(), this.getShapeType(), null, "objectTypeRelativeExtensionShape", null, 0, -1, RelativeShapesType1.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ringConstraintShapeTypeEClass, RingConstraintShapeType.class, "RingConstraintShapeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(roleDisplayOrderTypeEClass, RoleDisplayOrderType.class, "RoleDisplayOrderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleDisplayOrderType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, RoleDisplayOrderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoleDisplayOrderType_Role(), this.getRoleType(), null, "role", null, 0, -1, RoleDisplayOrderType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(roleNameShapeTypeEClass, RoleNameShapeType.class, "RoleNameShapeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoleNameShapeType_Subject(), this.getSubjectRef(), null, "subject", null, 1, 1, RoleNameShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleTypeEClass, RoleType.class, "RoleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoleType_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, RoleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapesTypeEClass, ShapesType.class, "ShapesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShapesType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ShapesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShapesType_ObjectTypeShape(), this.getObjectTypeShapeType(), null, "objectTypeShape", null, 0, -1, ShapesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getShapesType_FactTypeShape(), this.getFactTypeShapeType(), null, "factTypeShape", null, 0, -1, ShapesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getShapesType_ExternalConstraintShape(), this.getExternalConstraintShapeType(), null, "externalConstraintShape", null, 0, -1, ShapesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getShapesType_FrequencyConstraintShape(), this.getFrequencyConstraintShapeType(), null, "frequencyConstraintShape", null, 0, -1, ShapesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getShapesType_RingConstraintShape(), this.getRingConstraintShapeType(), null, "ringConstraintShape", null, 0, -1, ShapesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getShapesType_ValueComparisonConstraintShape(), this.getValueComparisonConstraintShapeType(), null, "valueComparisonConstraintShape", null, 0, -1, ShapesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getShapesType_ModelNoteShape(), this.getModelNoteShapeType(), null, "modelNoteShape", null, 0, -1, ShapesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapesType_DiagramExtensionShapeGroup(), ecorePackage.getEFeatureMapEntry(), "diagramExtensionShapeGroup", null, 0, -1, ShapesType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getShapesType_DiagramExtensionShape(), this.getShapeType(), null, "diagramExtensionShape", null, 0, -1, ShapesType.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(shapeTypeEClass, ShapeType.class, "ShapeType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShapeType_AbsoluteBounds(), theXMLTypePackage.getString(), "absoluteBounds", null, 0, 1, ShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeType_Id(), theXMLTypePackage.getID(), "id", null, 1, 1, ShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShapeType_IsExpanded(), theXMLTypePackage.getBoolean(), "isExpanded", null, 0, 1, ShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subjectRefEClass, SubjectRef.class, "SubjectRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubjectRef_Ref(), theXMLTypePackage.getIDREF(), "ref", null, 0, 1, SubjectRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueComparisonConstraintShapeTypeEClass, ValueComparisonConstraintShapeType.class, "ValueComparisonConstraintShapeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valueConstraintShapeTypeEClass, ValueConstraintShapeType.class, "ValueConstraintShapeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueConstraintShapeType_Subject(), this.getSubjectRef(), null, "subject", null, 1, 1, ValueConstraintShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueConstraintShapeType_MaximumDisplayedColumns(), this.getMaximumDisplayedColumnsType(), "maximumDisplayedColumns", null, 0, 1, ValueConstraintShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueConstraintShapeType_MaximumDisplayedValues(), this.getMaximumDisplayedValuesType(), "maximumDisplayedValues", null, 0, 1, ValueConstraintShapeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(constraintDisplayPositionTypeEEnum, ConstraintDisplayPositionType.class, "ConstraintDisplayPositionType");
		addEEnumLiteral(constraintDisplayPositionTypeEEnum, ConstraintDisplayPositionType.TOP);
		addEEnumLiteral(constraintDisplayPositionTypeEEnum, ConstraintDisplayPositionType.BOTTOM);

		initEEnum(displayOrientationTypeEEnum, DisplayOrientationType.class, "DisplayOrientationType");
		addEEnumLiteral(displayOrientationTypeEEnum, DisplayOrientationType.HORIZONTAL);
		addEEnumLiteral(displayOrientationTypeEEnum, DisplayOrientationType.VERTICAL_ROTATED_RIGHT);
		addEEnumLiteral(displayOrientationTypeEEnum, DisplayOrientationType.VERTICAL_ROTATED_LEFT);

		initEEnum(displayRelatedTypesTypeEEnum, DisplayRelatedTypesType.class, "DisplayRelatedTypesType");
		addEEnumLiteral(displayRelatedTypesTypeEEnum, DisplayRelatedTypesType.ATTACH_ALL_TYPES);
		addEEnumLiteral(displayRelatedTypesTypeEEnum, DisplayRelatedTypesType.ATTACH_SUBTYPES);
		addEEnumLiteral(displayRelatedTypesTypeEEnum, DisplayRelatedTypesType.ATTACH_SUPERTYPES);
		addEEnumLiteral(displayRelatedTypesTypeEEnum, DisplayRelatedTypesType.ATTACH_NO_TYPES);

		initEEnum(displayRoleNamesTypeEEnum, DisplayRoleNamesType.class, "DisplayRoleNamesType");
		addEEnumLiteral(displayRoleNamesTypeEEnum, DisplayRoleNamesType.USER_DEFAULT);
		addEEnumLiteral(displayRoleNamesTypeEEnum, DisplayRoleNamesType.OFF);
		addEEnumLiteral(displayRoleNamesTypeEEnum, DisplayRoleNamesType.ON);

		// Initialize data types
		initEDataType(constraintDisplayPositionTypeObjectEDataType, ConstraintDisplayPositionType.class, "ConstraintDisplayPositionTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(displayOrientationTypeObjectEDataType, DisplayOrientationType.class, "DisplayOrientationTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(displayRelatedTypesTypeObjectEDataType, DisplayRelatedTypesType.class, "DisplayRelatedTypesTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(displayRoleNamesTypeObjectEDataType, DisplayRoleNamesType.class, "DisplayRoleNamesTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maximumDisplayedColumnsTypeEDataType, short.class, "MaximumDisplayedColumnsType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maximumDisplayedColumnsTypeObjectEDataType, Short.class, "MaximumDisplayedColumnsTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maximumDisplayedValuesTypeEDataType, short.class, "MaximumDisplayedValuesType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(maximumDisplayedValuesTypeObjectEDataType, Short.class, "MaximumDisplayedValuesTypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (cardinalityConstraintShapeTypeEClass,
		   source,
		   new String[] {
			   "name", "CardinalityConstraintShapeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getCardinalityConstraintShapeType_Subject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subject",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (constraintDisplayPositionTypeEEnum,
		   source,
		   new String[] {
			   "name", "ConstraintDisplayPosition_._type"
		   });
		addAnnotation
		  (constraintDisplayPositionTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ConstraintDisplayPosition_._type:Object",
			   "baseType", "ConstraintDisplayPosition_._type"
		   });
		addAnnotation
		  (displayOrientationTypeEEnum,
		   source,
		   new String[] {
			   "name", "DisplayOrientation_._type"
		   });
		addAnnotation
		  (displayOrientationTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "DisplayOrientation_._type:Object",
			   "baseType", "DisplayOrientation_._type"
		   });
		addAnnotation
		  (displayRelatedTypesTypeEEnum,
		   source,
		   new String[] {
			   "name", "DisplayRelatedTypesType"
		   });
		addAnnotation
		  (displayRelatedTypesTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "DisplayRelatedTypesType:Object",
			   "baseType", "DisplayRelatedTypesType"
		   });
		addAnnotation
		  (displayRoleNamesTypeEEnum,
		   source,
		   new String[] {
			   "name", "DisplayRoleNames_._type"
		   });
		addAnnotation
		  (displayRoleNamesTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "DisplayRoleNames_._type:Object",
			   "baseType", "DisplayRoleNames_._type"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_DiagramExtensionShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DiagramExtensionShape",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_FactTypeRelativeExtensionShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FactTypeRelativeExtensionShape",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ObjectTypeRelativeExtensionShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ObjectTypeRelativeExtensionShape",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_ORMDiagram(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ORMDiagram",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getDocumentRoot_Subject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subject",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (externalConstraintShapeTypeEClass,
		   source,
		   new String[] {
			   "name", "ExternalConstraintShapeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getExternalConstraintShapeType_Subject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subject",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (factTypeShapeTypeEClass,
		   source,
		   new String[] {
			   "name", "FactTypeShapeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFactTypeShapeType_RelativeShapes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RelativeShapes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFactTypeShapeType_Subject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subject",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFactTypeShapeType_RoleDisplayOrder(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RoleDisplayOrder",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getFactTypeShapeType_ConstraintDisplayPosition(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ConstraintDisplayPosition"
		   });
		addAnnotation
		  (getFactTypeShapeType_DisplayAsObjectType(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "DisplayAsObjectType"
		   });
		addAnnotation
		  (getFactTypeShapeType_DisplayOrientation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "DisplayOrientation"
		   });
		addAnnotation
		  (getFactTypeShapeType_DisplayRelatedTypes(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "DisplayRelatedTypes"
		   });
		addAnnotation
		  (getFactTypeShapeType_DisplayRoleNames(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "DisplayRoleNames"
		   });
		addAnnotation
		  (getFactTypeShapeType_ExpandRefMode(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ExpandRefMode"
		   });
		addAnnotation
		  (frequencyConstraintShapeTypeEClass,
		   source,
		   new String[] {
			   "name", "FrequencyConstraintShapeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (maximumDisplayedColumnsTypeEDataType,
		   source,
		   new String[] {
			   "name", "MaximumDisplayedColumns_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#short",
			   "minExclusive", "0"
		   });
		addAnnotation
		  (maximumDisplayedColumnsTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "MaximumDisplayedColumns_._type:Object",
			   "baseType", "MaximumDisplayedColumns_._type"
		   });
		addAnnotation
		  (maximumDisplayedValuesTypeEDataType,
		   source,
		   new String[] {
			   "name", "MaximumDisplayedValues_._type",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#short",
			   "minExclusive", "0"
		   });
		addAnnotation
		  (maximumDisplayedValuesTypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "MaximumDisplayedValues_._type:Object",
			   "baseType", "MaximumDisplayedValues_._type"
		   });
		addAnnotation
		  (modelNoteShapeTypeEClass,
		   source,
		   new String[] {
			   "name", "ModelNoteShapeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getModelNoteShapeType_Subject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subject",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (objectTypeShapeTypeEClass,
		   source,
		   new String[] {
			   "name", "ObjectTypeShapeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getObjectTypeShapeType_RelativeShapes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RelativeShapes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getObjectTypeShapeType_Subject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subject",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getObjectTypeShapeType_DisplayRelatedTypes(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "DisplayRelatedTypes"
		   });
		addAnnotation
		  (getObjectTypeShapeType_ExpandRefMode(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ExpandRefMode"
		   });
		addAnnotation
		  (ormDiagramTypeEClass,
		   source,
		   new String[] {
			   "name", "ORMDiagramType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getORMDiagramType_Shapes(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Shapes",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getORMDiagramType_Subject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subject",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getORMDiagramType_AutoPopulateShapes(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "AutoPopulateShapes"
		   });
		addAnnotation
		  (getORMDiagramType_BaseFontName(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "BaseFontName"
		   });
		addAnnotation
		  (getORMDiagramType_BaseFontSize(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "BaseFontSize"
		   });
		addAnnotation
		  (getORMDiagramType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getORMDiagramType_IsCompleteView(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "IsCompleteView"
		   });
		addAnnotation
		  (getORMDiagramType_Name(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Name"
		   });
		addAnnotation
		  (readingShapeTypeEClass,
		   source,
		   new String[] {
			   "name", "ReadingShapeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReadingShapeType_Subject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subject",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (relativeShapesTypeEClass,
		   source,
		   new String[] {
			   "name", "RelativeShapes_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRelativeShapesType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getRelativeShapesType_ObjectifiedFactTypeNameShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ObjectifiedFactTypeNameShape",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRelativeShapesType_ReadingShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ReadingShape",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRelativeShapesType_ValueConstraintShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ValueConstraintShape",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRelativeShapesType_RoleNameShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RoleNameShape",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRelativeShapesType_CardinalityConstraintShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CardinalityConstraintShape",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRelativeShapesType_FactTypeRelativeExtensionShapeGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "FactTypeRelativeExtensionShape:group",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRelativeShapesType_FactTypeRelativeExtensionShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FactTypeRelativeExtensionShape",
			   "namespace", "##targetNamespace",
			   "group", "FactTypeRelativeExtensionShape:group"
		   });
		addAnnotation
		  (relativeShapesType1EClass,
		   source,
		   new String[] {
			   "name", "RelativeShapes_._1_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRelativeShapesType1_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getRelativeShapesType1_ValueConstraintShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ValueConstraintShape",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRelativeShapesType1_CardinalityConstraintShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "CardinalityConstraintShape",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRelativeShapesType1_ObjectTypeRelativeExtensionShapeGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "ObjectTypeRelativeExtensionShape:group",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getRelativeShapesType1_ObjectTypeRelativeExtensionShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ObjectTypeRelativeExtensionShape",
			   "namespace", "##targetNamespace",
			   "group", "ObjectTypeRelativeExtensionShape:group"
		   });
		addAnnotation
		  (ringConstraintShapeTypeEClass,
		   source,
		   new String[] {
			   "name", "RingConstraintShapeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (roleDisplayOrderTypeEClass,
		   source,
		   new String[] {
			   "name", "RoleDisplayOrder_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRoleDisplayOrderType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getRoleDisplayOrderType_Role(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Role",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (roleNameShapeTypeEClass,
		   source,
		   new String[] {
			   "name", "RoleNameShapeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRoleNameShapeType_Subject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subject",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (roleTypeEClass,
		   source,
		   new String[] {
			   "name", "Role_._type",
			   "kind", "empty"
		   });
		addAnnotation
		  (getRoleType_Ref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ref"
		   });
		addAnnotation
		  (shapesTypeEClass,
		   source,
		   new String[] {
			   "name", "Shapes_._type",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getShapesType_Group(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "group:0"
		   });
		addAnnotation
		  (getShapesType_ObjectTypeShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ObjectTypeShape",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getShapesType_FactTypeShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FactTypeShape",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getShapesType_ExternalConstraintShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ExternalConstraintShape",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getShapesType_FrequencyConstraintShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FrequencyConstraintShape",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getShapesType_RingConstraintShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RingConstraintShape",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getShapesType_ValueComparisonConstraintShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ValueComparisonConstraintShape",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getShapesType_ModelNoteShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ModelNoteShape",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getShapesType_DiagramExtensionShapeGroup(),
		   source,
		   new String[] {
			   "kind", "group",
			   "name", "DiagramExtensionShape:group",
			   "namespace", "##targetNamespace",
			   "group", "#group:0"
		   });
		addAnnotation
		  (getShapesType_DiagramExtensionShape(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DiagramExtensionShape",
			   "namespace", "##targetNamespace",
			   "group", "DiagramExtensionShape:group"
		   });
		addAnnotation
		  (shapeTypeEClass,
		   source,
		   new String[] {
			   "name", "ShapeType",
			   "kind", "empty"
		   });
		addAnnotation
		  (getShapeType_AbsoluteBounds(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "AbsoluteBounds"
		   });
		addAnnotation
		  (getShapeType_Id(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "id"
		   });
		addAnnotation
		  (getShapeType_IsExpanded(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "IsExpanded"
		   });
		addAnnotation
		  (subjectRefEClass,
		   source,
		   new String[] {
			   "name", "SubjectRef",
			   "kind", "empty"
		   });
		addAnnotation
		  (getSubjectRef_Ref(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "ref"
		   });
		addAnnotation
		  (valueComparisonConstraintShapeTypeEClass,
		   source,
		   new String[] {
			   "name", "ValueComparisonConstraintShapeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (valueConstraintShapeTypeEClass,
		   source,
		   new String[] {
			   "name", "ValueConstraintShapeType",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getValueConstraintShapeType_Subject(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Subject",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (getValueConstraintShapeType_MaximumDisplayedColumns(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "MaximumDisplayedColumns"
		   });
		addAnnotation
		  (getValueConstraintShapeType_MaximumDisplayedValues(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "MaximumDisplayedValues"
		   });
	}

} //DiagramPackageImpl
