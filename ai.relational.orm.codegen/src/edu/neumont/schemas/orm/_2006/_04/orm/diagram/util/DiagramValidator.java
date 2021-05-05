/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram.util;

import edu.neumont.schemas.orm._2006._04.orm.diagram.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage
 * @generated
 */
public class DiagramValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DiagramValidator INSTANCE = new DiagramValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "edu.neumont.schemas.orm._2006._04.orm.diagram";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DiagramPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DiagramPackage.CARDINALITY_CONSTRAINT_SHAPE_TYPE:
				return validateCardinalityConstraintShapeType((CardinalityConstraintShapeType)value, diagnostics, context);
			case DiagramPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case DiagramPackage.EXTERNAL_CONSTRAINT_SHAPE_TYPE:
				return validateExternalConstraintShapeType((ExternalConstraintShapeType)value, diagnostics, context);
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE:
				return validateFactTypeShapeType((FactTypeShapeType)value, diagnostics, context);
			case DiagramPackage.FREQUENCY_CONSTRAINT_SHAPE_TYPE:
				return validateFrequencyConstraintShapeType((FrequencyConstraintShapeType)value, diagnostics, context);
			case DiagramPackage.MODEL_NOTE_SHAPE_TYPE:
				return validateModelNoteShapeType((ModelNoteShapeType)value, diagnostics, context);
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE:
				return validateObjectTypeShapeType((ObjectTypeShapeType)value, diagnostics, context);
			case DiagramPackage.ORM_DIAGRAM_TYPE:
				return validateORMDiagramType((ORMDiagramType)value, diagnostics, context);
			case DiagramPackage.READING_SHAPE_TYPE:
				return validateReadingShapeType((ReadingShapeType)value, diagnostics, context);
			case DiagramPackage.RELATIVE_SHAPES_TYPE:
				return validateRelativeShapesType((RelativeShapesType)value, diagnostics, context);
			case DiagramPackage.RELATIVE_SHAPES_TYPE1:
				return validateRelativeShapesType1((RelativeShapesType1)value, diagnostics, context);
			case DiagramPackage.RING_CONSTRAINT_SHAPE_TYPE:
				return validateRingConstraintShapeType((RingConstraintShapeType)value, diagnostics, context);
			case DiagramPackage.ROLE_DISPLAY_ORDER_TYPE:
				return validateRoleDisplayOrderType((RoleDisplayOrderType)value, diagnostics, context);
			case DiagramPackage.ROLE_NAME_SHAPE_TYPE:
				return validateRoleNameShapeType((RoleNameShapeType)value, diagnostics, context);
			case DiagramPackage.ROLE_TYPE:
				return validateRoleType((RoleType)value, diagnostics, context);
			case DiagramPackage.SHAPES_TYPE:
				return validateShapesType((ShapesType)value, diagnostics, context);
			case DiagramPackage.SHAPE_TYPE:
				return validateShapeType((ShapeType)value, diagnostics, context);
			case DiagramPackage.SUBJECT_REF:
				return validateSubjectRef((SubjectRef)value, diagnostics, context);
			case DiagramPackage.VALUE_COMPARISON_CONSTRAINT_SHAPE_TYPE:
				return validateValueComparisonConstraintShapeType((ValueComparisonConstraintShapeType)value, diagnostics, context);
			case DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE:
				return validateValueConstraintShapeType((ValueConstraintShapeType)value, diagnostics, context);
			case DiagramPackage.CONSTRAINT_DISPLAY_POSITION_TYPE:
				return validateConstraintDisplayPositionType((ConstraintDisplayPositionType)value, diagnostics, context);
			case DiagramPackage.DISPLAY_ORIENTATION_TYPE:
				return validateDisplayOrientationType((DisplayOrientationType)value, diagnostics, context);
			case DiagramPackage.DISPLAY_RELATED_TYPES_TYPE:
				return validateDisplayRelatedTypesType((DisplayRelatedTypesType)value, diagnostics, context);
			case DiagramPackage.DISPLAY_ROLE_NAMES_TYPE:
				return validateDisplayRoleNamesType((DisplayRoleNamesType)value, diagnostics, context);
			case DiagramPackage.CONSTRAINT_DISPLAY_POSITION_TYPE_OBJECT:
				return validateConstraintDisplayPositionTypeObject((ConstraintDisplayPositionType)value, diagnostics, context);
			case DiagramPackage.DISPLAY_ORIENTATION_TYPE_OBJECT:
				return validateDisplayOrientationTypeObject((DisplayOrientationType)value, diagnostics, context);
			case DiagramPackage.DISPLAY_RELATED_TYPES_TYPE_OBJECT:
				return validateDisplayRelatedTypesTypeObject((DisplayRelatedTypesType)value, diagnostics, context);
			case DiagramPackage.DISPLAY_ROLE_NAMES_TYPE_OBJECT:
				return validateDisplayRoleNamesTypeObject((DisplayRoleNamesType)value, diagnostics, context);
			case DiagramPackage.MAXIMUM_DISPLAYED_COLUMNS_TYPE:
				return validateMaximumDisplayedColumnsType((Short)value, diagnostics, context);
			case DiagramPackage.MAXIMUM_DISPLAYED_COLUMNS_TYPE_OBJECT:
				return validateMaximumDisplayedColumnsTypeObject((Short)value, diagnostics, context);
			case DiagramPackage.MAXIMUM_DISPLAYED_VALUES_TYPE:
				return validateMaximumDisplayedValuesType((Short)value, diagnostics, context);
			case DiagramPackage.MAXIMUM_DISPLAYED_VALUES_TYPE_OBJECT:
				return validateMaximumDisplayedValuesTypeObject((Short)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCardinalityConstraintShapeType(CardinalityConstraintShapeType cardinalityConstraintShapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cardinalityConstraintShapeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalConstraintShapeType(ExternalConstraintShapeType externalConstraintShapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalConstraintShapeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFactTypeShapeType(FactTypeShapeType factTypeShapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(factTypeShapeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrequencyConstraintShapeType(FrequencyConstraintShapeType frequencyConstraintShapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(frequencyConstraintShapeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelNoteShapeType(ModelNoteShapeType modelNoteShapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelNoteShapeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectTypeShapeType(ObjectTypeShapeType objectTypeShapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectTypeShapeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateORMDiagramType(ORMDiagramType ormDiagramType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ormDiagramType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadingShapeType(ReadingShapeType readingShapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(readingShapeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeShapesType(RelativeShapesType relativeShapesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relativeShapesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeShapesType1(RelativeShapesType1 relativeShapesType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relativeShapesType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRingConstraintShapeType(RingConstraintShapeType ringConstraintShapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ringConstraintShapeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleDisplayOrderType(RoleDisplayOrderType roleDisplayOrderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roleDisplayOrderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleNameShapeType(RoleNameShapeType roleNameShapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roleNameShapeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoleType(RoleType roleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(roleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShapesType(ShapesType shapesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shapesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShapeType(ShapeType shapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(shapeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubjectRef(SubjectRef subjectRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subjectRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueComparisonConstraintShapeType(ValueComparisonConstraintShapeType valueComparisonConstraintShapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueComparisonConstraintShapeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueConstraintShapeType(ValueConstraintShapeType valueConstraintShapeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueConstraintShapeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintDisplayPositionType(ConstraintDisplayPositionType constraintDisplayPositionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayOrientationType(DisplayOrientationType displayOrientationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayRelatedTypesType(DisplayRelatedTypesType displayRelatedTypesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayRoleNamesType(DisplayRoleNamesType displayRoleNamesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstraintDisplayPositionTypeObject(ConstraintDisplayPositionType constraintDisplayPositionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayOrientationTypeObject(DisplayOrientationType displayOrientationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayRelatedTypesTypeObject(DisplayRelatedTypesType displayRelatedTypesTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisplayRoleNamesTypeObject(DisplayRoleNamesType displayRoleNamesTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaximumDisplayedColumnsType(short maximumDisplayedColumnsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaximumDisplayedColumnsType_Min(maximumDisplayedColumnsType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMaximumDisplayedColumnsType_Min
	 */
	public static final short MAXIMUM_DISPLAYED_COLUMNS_TYPE__MIN__VALUE = 0;

	/**
	 * Validates the Min constraint of '<em>Maximum Displayed Columns Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaximumDisplayedColumnsType_Min(short maximumDisplayedColumnsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maximumDisplayedColumnsType > MAXIMUM_DISPLAYED_COLUMNS_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(DiagramPackage.Literals.MAXIMUM_DISPLAYED_COLUMNS_TYPE, maximumDisplayedColumnsType, MAXIMUM_DISPLAYED_COLUMNS_TYPE__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaximumDisplayedColumnsTypeObject(Short maximumDisplayedColumnsTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaximumDisplayedColumnsType_Min(maximumDisplayedColumnsTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaximumDisplayedValuesType(short maximumDisplayedValuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaximumDisplayedValuesType_Min(maximumDisplayedValuesType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMaximumDisplayedValuesType_Min
	 */
	public static final short MAXIMUM_DISPLAYED_VALUES_TYPE__MIN__VALUE = 0;

	/**
	 * Validates the Min constraint of '<em>Maximum Displayed Values Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaximumDisplayedValuesType_Min(short maximumDisplayedValuesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = maximumDisplayedValuesType > MAXIMUM_DISPLAYED_VALUES_TYPE__MIN__VALUE;
		if (!result && diagnostics != null)
			reportMinViolation(DiagramPackage.Literals.MAXIMUM_DISPLAYED_VALUES_TYPE, maximumDisplayedValuesType, MAXIMUM_DISPLAYED_VALUES_TYPE__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMaximumDisplayedValuesTypeObject(Short maximumDisplayedValuesTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMaximumDisplayedValuesType_Min(maximumDisplayedValuesTypeObject, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DiagramValidator
