/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram.util;

import edu.neumont.schemas.orm._2006._04.orm.diagram.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage
 * @generated
 */
public class DiagramAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DiagramPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DiagramPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramSwitch<Adapter> modelSwitch =
		new DiagramSwitch<Adapter>() {
			@Override
			public Adapter caseCardinalityConstraintShapeType(CardinalityConstraintShapeType object) {
				return createCardinalityConstraintShapeTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseExternalConstraintShapeType(ExternalConstraintShapeType object) {
				return createExternalConstraintShapeTypeAdapter();
			}
			@Override
			public Adapter caseFactTypeShapeType(FactTypeShapeType object) {
				return createFactTypeShapeTypeAdapter();
			}
			@Override
			public Adapter caseFrequencyConstraintShapeType(FrequencyConstraintShapeType object) {
				return createFrequencyConstraintShapeTypeAdapter();
			}
			@Override
			public Adapter caseModelNoteShapeType(ModelNoteShapeType object) {
				return createModelNoteShapeTypeAdapter();
			}
			@Override
			public Adapter caseObjectTypeShapeType(ObjectTypeShapeType object) {
				return createObjectTypeShapeTypeAdapter();
			}
			@Override
			public Adapter caseORMDiagramType(ORMDiagramType object) {
				return createORMDiagramTypeAdapter();
			}
			@Override
			public Adapter caseReadingShapeType(ReadingShapeType object) {
				return createReadingShapeTypeAdapter();
			}
			@Override
			public Adapter caseRelativeShapesType(RelativeShapesType object) {
				return createRelativeShapesTypeAdapter();
			}
			@Override
			public Adapter caseRelativeShapesType1(RelativeShapesType1 object) {
				return createRelativeShapesType1Adapter();
			}
			@Override
			public Adapter caseRingConstraintShapeType(RingConstraintShapeType object) {
				return createRingConstraintShapeTypeAdapter();
			}
			@Override
			public Adapter caseRoleDisplayOrderType(RoleDisplayOrderType object) {
				return createRoleDisplayOrderTypeAdapter();
			}
			@Override
			public Adapter caseRoleNameShapeType(RoleNameShapeType object) {
				return createRoleNameShapeTypeAdapter();
			}
			@Override
			public Adapter caseRoleType(RoleType object) {
				return createRoleTypeAdapter();
			}
			@Override
			public Adapter caseShapesType(ShapesType object) {
				return createShapesTypeAdapter();
			}
			@Override
			public Adapter caseShapeType(ShapeType object) {
				return createShapeTypeAdapter();
			}
			@Override
			public Adapter caseSubjectRef(SubjectRef object) {
				return createSubjectRefAdapter();
			}
			@Override
			public Adapter caseValueComparisonConstraintShapeType(ValueComparisonConstraintShapeType object) {
				return createValueComparisonConstraintShapeTypeAdapter();
			}
			@Override
			public Adapter caseValueConstraintShapeType(ValueConstraintShapeType object) {
				return createValueConstraintShapeTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.CardinalityConstraintShapeType <em>Cardinality Constraint Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.CardinalityConstraintShapeType
	 * @generated
	 */
	public Adapter createCardinalityConstraintShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ExternalConstraintShapeType <em>External Constraint Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ExternalConstraintShapeType
	 * @generated
	 */
	public Adapter createExternalConstraintShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType <em>Fact Type Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType
	 * @generated
	 */
	public Adapter createFactTypeShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FrequencyConstraintShapeType <em>Frequency Constraint Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.FrequencyConstraintShapeType
	 * @generated
	 */
	public Adapter createFrequencyConstraintShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ModelNoteShapeType <em>Model Note Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ModelNoteShapeType
	 * @generated
	 */
	public Adapter createModelNoteShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType <em>Object Type Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType
	 * @generated
	 */
	public Adapter createObjectTypeShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType <em>ORM Diagram Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType
	 * @generated
	 */
	public Adapter createORMDiagramTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ReadingShapeType <em>Reading Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ReadingShapeType
	 * @generated
	 */
	public Adapter createReadingShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType <em>Relative Shapes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType
	 * @generated
	 */
	public Adapter createRelativeShapesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1 <em>Relative Shapes Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1
	 * @generated
	 */
	public Adapter createRelativeShapesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RingConstraintShapeType <em>Ring Constraint Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RingConstraintShapeType
	 * @generated
	 */
	public Adapter createRingConstraintShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleDisplayOrderType <em>Role Display Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RoleDisplayOrderType
	 * @generated
	 */
	public Adapter createRoleDisplayOrderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleNameShapeType <em>Role Name Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RoleNameShapeType
	 * @generated
	 */
	public Adapter createRoleNameShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleType <em>Role Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.RoleType
	 * @generated
	 */
	public Adapter createRoleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType <em>Shapes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType
	 * @generated
	 */
	public Adapter createShapesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType <em>Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType
	 * @generated
	 */
	public Adapter createShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.SubjectRef <em>Subject Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.SubjectRef
	 * @generated
	 */
	public Adapter createSubjectRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueComparisonConstraintShapeType <em>Value Comparison Constraint Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ValueComparisonConstraintShapeType
	 * @generated
	 */
	public Adapter createValueComparisonConstraintShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType <em>Value Constraint Shape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType
	 * @generated
	 */
	public Adapter createValueConstraintShapeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DiagramAdapterFactory
