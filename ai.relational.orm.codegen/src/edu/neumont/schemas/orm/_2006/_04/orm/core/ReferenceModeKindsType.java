/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Mode Kinds Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container for the reference mode kinds.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindsType#getReferenceModeKind <em>Reference Mode Kind</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getReferenceModeKindsType()
 * @model extendedMetaData="name='ReferenceModeKindsType' kind='elementOnly'"
 * @generated
 */
public interface ReferenceModeKindsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Mode Kind</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Mode Kind</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getReferenceModeKindsType_ReferenceModeKind()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ReferenceModeKind' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReferenceModeKindType> getReferenceModeKind();

} // ReferenceModeKindsType
