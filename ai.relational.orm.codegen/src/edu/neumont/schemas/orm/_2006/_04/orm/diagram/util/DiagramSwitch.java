/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram.util;

import edu.neumont.schemas.orm._2006._04.orm.diagram.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage
 * @generated
 */
public class DiagramSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiagramPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramSwitch() {
		if (modelPackage == null) {
			modelPackage = DiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DiagramPackage.CARDINALITY_CONSTRAINT_SHAPE_TYPE: {
				CardinalityConstraintShapeType cardinalityConstraintShapeType = (CardinalityConstraintShapeType)theEObject;
				T result = caseCardinalityConstraintShapeType(cardinalityConstraintShapeType);
				if (result == null) result = caseShapeType(cardinalityConstraintShapeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.EXTERNAL_CONSTRAINT_SHAPE_TYPE: {
				ExternalConstraintShapeType externalConstraintShapeType = (ExternalConstraintShapeType)theEObject;
				T result = caseExternalConstraintShapeType(externalConstraintShapeType);
				if (result == null) result = caseShapeType(externalConstraintShapeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE: {
				FactTypeShapeType factTypeShapeType = (FactTypeShapeType)theEObject;
				T result = caseFactTypeShapeType(factTypeShapeType);
				if (result == null) result = caseShapeType(factTypeShapeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.FREQUENCY_CONSTRAINT_SHAPE_TYPE: {
				FrequencyConstraintShapeType frequencyConstraintShapeType = (FrequencyConstraintShapeType)theEObject;
				T result = caseFrequencyConstraintShapeType(frequencyConstraintShapeType);
				if (result == null) result = caseExternalConstraintShapeType(frequencyConstraintShapeType);
				if (result == null) result = caseShapeType(frequencyConstraintShapeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.MODEL_NOTE_SHAPE_TYPE: {
				ModelNoteShapeType modelNoteShapeType = (ModelNoteShapeType)theEObject;
				T result = caseModelNoteShapeType(modelNoteShapeType);
				if (result == null) result = caseShapeType(modelNoteShapeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE: {
				ObjectTypeShapeType objectTypeShapeType = (ObjectTypeShapeType)theEObject;
				T result = caseObjectTypeShapeType(objectTypeShapeType);
				if (result == null) result = caseShapeType(objectTypeShapeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.ORM_DIAGRAM_TYPE: {
				ORMDiagramType ormDiagramType = (ORMDiagramType)theEObject;
				T result = caseORMDiagramType(ormDiagramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.READING_SHAPE_TYPE: {
				ReadingShapeType readingShapeType = (ReadingShapeType)theEObject;
				T result = caseReadingShapeType(readingShapeType);
				if (result == null) result = caseShapeType(readingShapeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.RELATIVE_SHAPES_TYPE: {
				RelativeShapesType relativeShapesType = (RelativeShapesType)theEObject;
				T result = caseRelativeShapesType(relativeShapesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.RELATIVE_SHAPES_TYPE1: {
				RelativeShapesType1 relativeShapesType1 = (RelativeShapesType1)theEObject;
				T result = caseRelativeShapesType1(relativeShapesType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.RING_CONSTRAINT_SHAPE_TYPE: {
				RingConstraintShapeType ringConstraintShapeType = (RingConstraintShapeType)theEObject;
				T result = caseRingConstraintShapeType(ringConstraintShapeType);
				if (result == null) result = caseExternalConstraintShapeType(ringConstraintShapeType);
				if (result == null) result = caseShapeType(ringConstraintShapeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.ROLE_DISPLAY_ORDER_TYPE: {
				RoleDisplayOrderType roleDisplayOrderType = (RoleDisplayOrderType)theEObject;
				T result = caseRoleDisplayOrderType(roleDisplayOrderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.ROLE_NAME_SHAPE_TYPE: {
				RoleNameShapeType roleNameShapeType = (RoleNameShapeType)theEObject;
				T result = caseRoleNameShapeType(roleNameShapeType);
				if (result == null) result = caseShapeType(roleNameShapeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.ROLE_TYPE: {
				RoleType roleType = (RoleType)theEObject;
				T result = caseRoleType(roleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.SHAPES_TYPE: {
				ShapesType shapesType = (ShapesType)theEObject;
				T result = caseShapesType(shapesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.SHAPE_TYPE: {
				ShapeType shapeType = (ShapeType)theEObject;
				T result = caseShapeType(shapeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.SUBJECT_REF: {
				SubjectRef subjectRef = (SubjectRef)theEObject;
				T result = caseSubjectRef(subjectRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.VALUE_COMPARISON_CONSTRAINT_SHAPE_TYPE: {
				ValueComparisonConstraintShapeType valueComparisonConstraintShapeType = (ValueComparisonConstraintShapeType)theEObject;
				T result = caseValueComparisonConstraintShapeType(valueComparisonConstraintShapeType);
				if (result == null) result = caseExternalConstraintShapeType(valueComparisonConstraintShapeType);
				if (result == null) result = caseShapeType(valueComparisonConstraintShapeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE: {
				ValueConstraintShapeType valueConstraintShapeType = (ValueConstraintShapeType)theEObject;
				T result = caseValueConstraintShapeType(valueConstraintShapeType);
				if (result == null) result = caseShapeType(valueConstraintShapeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality Constraint Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality Constraint Shape Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityConstraintShapeType(CardinalityConstraintShapeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Constraint Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Constraint Shape Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalConstraintShapeType(ExternalConstraintShapeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fact Type Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fact Type Shape Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFactTypeShapeType(FactTypeShapeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frequency Constraint Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frequency Constraint Shape Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrequencyConstraintShapeType(FrequencyConstraintShapeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Note Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Note Shape Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelNoteShapeType(ModelNoteShapeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type Shape Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectTypeShapeType(ObjectTypeShapeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ORM Diagram Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ORM Diagram Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseORMDiagramType(ORMDiagramType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reading Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reading Shape Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadingShapeType(ReadingShapeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Shapes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Shapes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeShapesType(RelativeShapesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Shapes Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Shapes Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelativeShapesType1(RelativeShapesType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ring Constraint Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ring Constraint Shape Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRingConstraintShapeType(RingConstraintShapeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Display Order Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Display Order Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleDisplayOrderType(RoleDisplayOrderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Name Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Name Shape Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleNameShapeType(RoleNameShapeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoleType(RoleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shapes Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shapes Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapesType(ShapesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShapeType(ShapeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectRef(SubjectRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Comparison Constraint Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Comparison Constraint Shape Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueComparisonConstraintShapeType(ValueComparisonConstraintShapeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Constraint Shape Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Constraint Shape Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueConstraintShapeType(ValueConstraintShapeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DiagramSwitch
