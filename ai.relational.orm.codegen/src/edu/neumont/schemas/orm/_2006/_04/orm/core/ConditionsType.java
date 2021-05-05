/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditions Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConditionsType#getCalculatedCondition <em>Calculated Condition</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConditionsType()
 * @model extendedMetaData="name='Conditions_._type' kind='elementOnly'"
 * @generated
 */
public interface ConditionsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Calculated Condition</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValueRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculated Condition</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConditionsType_CalculatedCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CalculatedCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CalculatedValueRef> getCalculatedCondition();

} // ConditionsType
