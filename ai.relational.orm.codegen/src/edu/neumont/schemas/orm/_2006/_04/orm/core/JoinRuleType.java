/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A rule indicating how roles from different fact types in the same constraint role sequence are connected.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.JoinRuleType#getJoinPath <em>Join Path</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getJoinRuleType()
 * @model extendedMetaData="name='JoinRuleType' kind='elementOnly'"
 * @generated
 */
public interface JoinRuleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Join Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Path</em>' containment reference.
	 * @see #setJoinPath(ConstraintRoleSequenceJoinPathType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getJoinRuleType_JoinPath()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='JoinPath' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintRoleSequenceJoinPathType getJoinPath();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.JoinRuleType#getJoinPath <em>Join Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Path</em>' containment reference.
	 * @see #getJoinPath()
	 * @generated
	 */
	void setJoinPath(ConstraintRoleSequenceJoinPathType value);

} // JoinRuleType
