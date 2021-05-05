/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pathed Role Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A role in connected path.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType#getValueRestriction <em>Value Restriction</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType#getCorrelatedWith <em>Correlated With</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType#isIsNegated <em>Is Negated</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathedRoleType()
 * @model extendedMetaData="name='PathedRoleType' kind='elementOnly'"
 * @generated
 */
public interface PathedRoleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Restriction</em>' containment reference.
	 * @see #setValueRestriction(PathConditionRoleValueRestrictionType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathedRoleType_ValueRestriction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValueRestriction' namespace='##targetNamespace'"
	 * @generated
	 */
	PathConditionRoleValueRestrictionType getValueRestriction();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType#getValueRestriction <em>Value Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Restriction</em>' containment reference.
	 * @see #getValueRestriction()
	 * @generated
	 */
	void setValueRestriction(PathConditionRoleValueRestrictionType value);

	/**
	 * Returns the value of the '<em><b>Correlated With</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlated With</em>' containment reference.
	 * @see #setCorrelatedWith(PathedRoleRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathedRoleType_CorrelatedWith()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CorrelatedWith' namespace='##targetNamespace'"
	 * @generated
	 */
	PathedRoleRef getCorrelatedWith();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType#getCorrelatedWith <em>Correlated With</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlated With</em>' containment reference.
	 * @see #getCorrelatedWith()
	 * @generated
	 */
	void setCorrelatedWith(PathedRoleRef value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathedRoleType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Is Negated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The path step is treated as a negation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Negated</em>' attribute.
	 * @see #isSetIsNegated()
	 * @see #unsetIsNegated()
	 * @see #setIsNegated(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathedRoleType_IsNegated()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsNegated'"
	 * @generated
	 */
	boolean isIsNegated();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType#isIsNegated <em>Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Negated</em>' attribute.
	 * @see #isSetIsNegated()
	 * @see #unsetIsNegated()
	 * @see #isIsNegated()
	 * @generated
	 */
	void setIsNegated(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType#isIsNegated <em>Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsNegated()
	 * @see #isIsNegated()
	 * @see #setIsNegated(boolean)
	 * @generated
	 */
	void unsetIsNegated();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType#isIsNegated <em>Is Negated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Negated</em>' attribute is set.
	 * @see #unsetIsNegated()
	 * @see #isIsNegated()
	 * @see #setIsNegated(boolean)
	 * @generated
	 */
	boolean isSetIsNegated();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRolePurposeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PathedRolePurposeType
	 * @see #isSetPurpose()
	 * @see #unsetPurpose()
	 * @see #setPurpose(PathedRolePurposeType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathedRoleType_Purpose()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='Purpose'"
	 * @generated
	 */
	PathedRolePurposeType getPurpose();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.PathedRolePurposeType
	 * @see #isSetPurpose()
	 * @see #unsetPurpose()
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(PathedRolePurposeType value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPurpose()
	 * @see #getPurpose()
	 * @see #setPurpose(PathedRolePurposeType)
	 * @generated
	 */
	void unsetPurpose();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType#getPurpose <em>Purpose</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Purpose</em>' attribute is set.
	 * @see #unsetPurpose()
	 * @see #getPurpose()
	 * @see #setPurpose(PathedRolePurposeType)
	 * @generated
	 */
	boolean isSetPurpose();

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the referenced element's unique id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathedRoleType_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='ref'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRoleType#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

} // PathedRoleType
