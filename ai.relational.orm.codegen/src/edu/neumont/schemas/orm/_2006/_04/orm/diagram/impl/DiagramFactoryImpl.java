/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram.impl;

import edu.neumont.schemas.orm._2006._04.orm.diagram.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramFactoryImpl extends EFactoryImpl implements DiagramFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiagramFactory init() {
		try {
			DiagramFactory theDiagramFactory = (DiagramFactory)EPackage.Registry.INSTANCE.getEFactory(DiagramPackage.eNS_URI);
			if (theDiagramFactory != null) {
				return theDiagramFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DiagramFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DiagramPackage.CARDINALITY_CONSTRAINT_SHAPE_TYPE: return createCardinalityConstraintShapeType();
			case DiagramPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case DiagramPackage.EXTERNAL_CONSTRAINT_SHAPE_TYPE: return createExternalConstraintShapeType();
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE: return createFactTypeShapeType();
			case DiagramPackage.FREQUENCY_CONSTRAINT_SHAPE_TYPE: return createFrequencyConstraintShapeType();
			case DiagramPackage.MODEL_NOTE_SHAPE_TYPE: return createModelNoteShapeType();
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE: return createObjectTypeShapeType();
			case DiagramPackage.ORM_DIAGRAM_TYPE: return createORMDiagramType();
			case DiagramPackage.READING_SHAPE_TYPE: return createReadingShapeType();
			case DiagramPackage.RELATIVE_SHAPES_TYPE: return createRelativeShapesType();
			case DiagramPackage.RELATIVE_SHAPES_TYPE1: return createRelativeShapesType1();
			case DiagramPackage.RING_CONSTRAINT_SHAPE_TYPE: return createRingConstraintShapeType();
			case DiagramPackage.ROLE_DISPLAY_ORDER_TYPE: return createRoleDisplayOrderType();
			case DiagramPackage.ROLE_NAME_SHAPE_TYPE: return createRoleNameShapeType();
			case DiagramPackage.ROLE_TYPE: return createRoleType();
			case DiagramPackage.SHAPES_TYPE: return createShapesType();
			case DiagramPackage.SUBJECT_REF: return createSubjectRef();
			case DiagramPackage.VALUE_COMPARISON_CONSTRAINT_SHAPE_TYPE: return createValueComparisonConstraintShapeType();
			case DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE: return createValueConstraintShapeType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DiagramPackage.CONSTRAINT_DISPLAY_POSITION_TYPE:
				return createConstraintDisplayPositionTypeFromString(eDataType, initialValue);
			case DiagramPackage.DISPLAY_ORIENTATION_TYPE:
				return createDisplayOrientationTypeFromString(eDataType, initialValue);
			case DiagramPackage.DISPLAY_RELATED_TYPES_TYPE:
				return createDisplayRelatedTypesTypeFromString(eDataType, initialValue);
			case DiagramPackage.DISPLAY_ROLE_NAMES_TYPE:
				return createDisplayRoleNamesTypeFromString(eDataType, initialValue);
			case DiagramPackage.CONSTRAINT_DISPLAY_POSITION_TYPE_OBJECT:
				return createConstraintDisplayPositionTypeObjectFromString(eDataType, initialValue);
			case DiagramPackage.DISPLAY_ORIENTATION_TYPE_OBJECT:
				return createDisplayOrientationTypeObjectFromString(eDataType, initialValue);
			case DiagramPackage.DISPLAY_RELATED_TYPES_TYPE_OBJECT:
				return createDisplayRelatedTypesTypeObjectFromString(eDataType, initialValue);
			case DiagramPackage.DISPLAY_ROLE_NAMES_TYPE_OBJECT:
				return createDisplayRoleNamesTypeObjectFromString(eDataType, initialValue);
			case DiagramPackage.MAXIMUM_DISPLAYED_COLUMNS_TYPE:
				return createMaximumDisplayedColumnsTypeFromString(eDataType, initialValue);
			case DiagramPackage.MAXIMUM_DISPLAYED_COLUMNS_TYPE_OBJECT:
				return createMaximumDisplayedColumnsTypeObjectFromString(eDataType, initialValue);
			case DiagramPackage.MAXIMUM_DISPLAYED_VALUES_TYPE:
				return createMaximumDisplayedValuesTypeFromString(eDataType, initialValue);
			case DiagramPackage.MAXIMUM_DISPLAYED_VALUES_TYPE_OBJECT:
				return createMaximumDisplayedValuesTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DiagramPackage.CONSTRAINT_DISPLAY_POSITION_TYPE:
				return convertConstraintDisplayPositionTypeToString(eDataType, instanceValue);
			case DiagramPackage.DISPLAY_ORIENTATION_TYPE:
				return convertDisplayOrientationTypeToString(eDataType, instanceValue);
			case DiagramPackage.DISPLAY_RELATED_TYPES_TYPE:
				return convertDisplayRelatedTypesTypeToString(eDataType, instanceValue);
			case DiagramPackage.DISPLAY_ROLE_NAMES_TYPE:
				return convertDisplayRoleNamesTypeToString(eDataType, instanceValue);
			case DiagramPackage.CONSTRAINT_DISPLAY_POSITION_TYPE_OBJECT:
				return convertConstraintDisplayPositionTypeObjectToString(eDataType, instanceValue);
			case DiagramPackage.DISPLAY_ORIENTATION_TYPE_OBJECT:
				return convertDisplayOrientationTypeObjectToString(eDataType, instanceValue);
			case DiagramPackage.DISPLAY_RELATED_TYPES_TYPE_OBJECT:
				return convertDisplayRelatedTypesTypeObjectToString(eDataType, instanceValue);
			case DiagramPackage.DISPLAY_ROLE_NAMES_TYPE_OBJECT:
				return convertDisplayRoleNamesTypeObjectToString(eDataType, instanceValue);
			case DiagramPackage.MAXIMUM_DISPLAYED_COLUMNS_TYPE:
				return convertMaximumDisplayedColumnsTypeToString(eDataType, instanceValue);
			case DiagramPackage.MAXIMUM_DISPLAYED_COLUMNS_TYPE_OBJECT:
				return convertMaximumDisplayedColumnsTypeObjectToString(eDataType, instanceValue);
			case DiagramPackage.MAXIMUM_DISPLAYED_VALUES_TYPE:
				return convertMaximumDisplayedValuesTypeToString(eDataType, instanceValue);
			case DiagramPackage.MAXIMUM_DISPLAYED_VALUES_TYPE_OBJECT:
				return convertMaximumDisplayedValuesTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityConstraintShapeType createCardinalityConstraintShapeType() {
		CardinalityConstraintShapeTypeImpl cardinalityConstraintShapeType = new CardinalityConstraintShapeTypeImpl();
		return cardinalityConstraintShapeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalConstraintShapeType createExternalConstraintShapeType() {
		ExternalConstraintShapeTypeImpl externalConstraintShapeType = new ExternalConstraintShapeTypeImpl();
		return externalConstraintShapeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeShapeType createFactTypeShapeType() {
		FactTypeShapeTypeImpl factTypeShapeType = new FactTypeShapeTypeImpl();
		return factTypeShapeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyConstraintShapeType createFrequencyConstraintShapeType() {
		FrequencyConstraintShapeTypeImpl frequencyConstraintShapeType = new FrequencyConstraintShapeTypeImpl();
		return frequencyConstraintShapeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelNoteShapeType createModelNoteShapeType() {
		ModelNoteShapeTypeImpl modelNoteShapeType = new ModelNoteShapeTypeImpl();
		return modelNoteShapeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeShapeType createObjectTypeShapeType() {
		ObjectTypeShapeTypeImpl objectTypeShapeType = new ObjectTypeShapeTypeImpl();
		return objectTypeShapeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORMDiagramType createORMDiagramType() {
		ORMDiagramTypeImpl ormDiagramType = new ORMDiagramTypeImpl();
		return ormDiagramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingShapeType createReadingShapeType() {
		ReadingShapeTypeImpl readingShapeType = new ReadingShapeTypeImpl();
		return readingShapeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeShapesType createRelativeShapesType() {
		RelativeShapesTypeImpl relativeShapesType = new RelativeShapesTypeImpl();
		return relativeShapesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeShapesType1 createRelativeShapesType1() {
		RelativeShapesType1Impl relativeShapesType1 = new RelativeShapesType1Impl();
		return relativeShapesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RingConstraintShapeType createRingConstraintShapeType() {
		RingConstraintShapeTypeImpl ringConstraintShapeType = new RingConstraintShapeTypeImpl();
		return ringConstraintShapeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleDisplayOrderType createRoleDisplayOrderType() {
		RoleDisplayOrderTypeImpl roleDisplayOrderType = new RoleDisplayOrderTypeImpl();
		return roleDisplayOrderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleNameShapeType createRoleNameShapeType() {
		RoleNameShapeTypeImpl roleNameShapeType = new RoleNameShapeTypeImpl();
		return roleNameShapeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleType createRoleType() {
		RoleTypeImpl roleType = new RoleTypeImpl();
		return roleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapesType createShapesType() {
		ShapesTypeImpl shapesType = new ShapesTypeImpl();
		return shapesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectRef createSubjectRef() {
		SubjectRefImpl subjectRef = new SubjectRefImpl();
		return subjectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueComparisonConstraintShapeType createValueComparisonConstraintShapeType() {
		ValueComparisonConstraintShapeTypeImpl valueComparisonConstraintShapeType = new ValueComparisonConstraintShapeTypeImpl();
		return valueComparisonConstraintShapeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueConstraintShapeType createValueConstraintShapeType() {
		ValueConstraintShapeTypeImpl valueConstraintShapeType = new ValueConstraintShapeTypeImpl();
		return valueConstraintShapeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintDisplayPositionType createConstraintDisplayPositionTypeFromString(EDataType eDataType, String initialValue) {
		ConstraintDisplayPositionType result = ConstraintDisplayPositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintDisplayPositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayOrientationType createDisplayOrientationTypeFromString(EDataType eDataType, String initialValue) {
		DisplayOrientationType result = DisplayOrientationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayOrientationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayRelatedTypesType createDisplayRelatedTypesTypeFromString(EDataType eDataType, String initialValue) {
		DisplayRelatedTypesType result = DisplayRelatedTypesType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayRelatedTypesTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayRoleNamesType createDisplayRoleNamesTypeFromString(EDataType eDataType, String initialValue) {
		DisplayRoleNamesType result = DisplayRoleNamesType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayRoleNamesTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintDisplayPositionType createConstraintDisplayPositionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createConstraintDisplayPositionTypeFromString(DiagramPackage.Literals.CONSTRAINT_DISPLAY_POSITION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintDisplayPositionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertConstraintDisplayPositionTypeToString(DiagramPackage.Literals.CONSTRAINT_DISPLAY_POSITION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayOrientationType createDisplayOrientationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDisplayOrientationTypeFromString(DiagramPackage.Literals.DISPLAY_ORIENTATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayOrientationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDisplayOrientationTypeToString(DiagramPackage.Literals.DISPLAY_ORIENTATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayRelatedTypesType createDisplayRelatedTypesTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDisplayRelatedTypesTypeFromString(DiagramPackage.Literals.DISPLAY_RELATED_TYPES_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayRelatedTypesTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDisplayRelatedTypesTypeToString(DiagramPackage.Literals.DISPLAY_RELATED_TYPES_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayRoleNamesType createDisplayRoleNamesTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDisplayRoleNamesTypeFromString(DiagramPackage.Literals.DISPLAY_ROLE_NAMES_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisplayRoleNamesTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDisplayRoleNamesTypeToString(DiagramPackage.Literals.DISPLAY_ROLE_NAMES_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createMaximumDisplayedColumnsTypeFromString(EDataType eDataType, String initialValue) {
		return (Short)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.SHORT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaximumDisplayedColumnsTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.SHORT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createMaximumDisplayedColumnsTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMaximumDisplayedColumnsTypeFromString(DiagramPackage.Literals.MAXIMUM_DISPLAYED_COLUMNS_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaximumDisplayedColumnsTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMaximumDisplayedColumnsTypeToString(DiagramPackage.Literals.MAXIMUM_DISPLAYED_COLUMNS_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createMaximumDisplayedValuesTypeFromString(EDataType eDataType, String initialValue) {
		return (Short)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.SHORT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaximumDisplayedValuesTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.SHORT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Short createMaximumDisplayedValuesTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMaximumDisplayedValuesTypeFromString(DiagramPackage.Literals.MAXIMUM_DISPLAYED_VALUES_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaximumDisplayedValuesTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMaximumDisplayedValuesTypeToString(DiagramPackage.Literals.MAXIMUM_DISPLAYED_VALUES_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramPackage getDiagramPackage() {
		return (DiagramPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DiagramPackage getPackage() {
		return DiagramPackage.eINSTANCE;
	}

} //DiagramFactoryImpl
