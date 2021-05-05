/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lead Role Path Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A role path starting from a root object type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathType#getObjectUnifiers <em>Object Unifiers</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathType#getSubqueryParameterInputs <em>Subquery Parameter Inputs</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathType#getCalculatedValues <em>Calculated Values</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathType#getConditions <em>Conditions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathType#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getLeadRolePathType()
 * @model extendedMetaData="name='LeadRolePathType' kind='elementOnly'"
 * @generated
 */
public interface LeadRolePathType extends RolePathType {
	/**
	 * Returns the value of the '<em><b>Object Unifiers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for object unifiers relating multiple pathed roles and pathed roots in difference branches of the path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object Unifiers</em>' containment reference.
	 * @see #setObjectUnifiers(ObjectUnifiersType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getLeadRolePathType_ObjectUnifiers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ObjectUnifiers' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectUnifiersType getObjectUnifiers();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathType#getObjectUnifiers <em>Object Unifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Unifiers</em>' containment reference.
	 * @see #getObjectUnifiers()
	 * @generated
	 */
	void setObjectUnifiers(ObjectUnifiersType value);

	/**
	 * Returns the value of the '<em><b>Subquery Parameter Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for subquery parameter inputs relating pathed roles and pathed roots with parameters used in subqueries used directly by this path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subquery Parameter Inputs</em>' containment reference.
	 * @see #setSubqueryParameterInputs(SubqueryParameterInputsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getLeadRolePathType_SubqueryParameterInputs()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SubqueryParameterInputs' namespace='##targetNamespace'"
	 * @generated
	 */
	SubqueryParameterInputsType getSubqueryParameterInputs();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathType#getSubqueryParameterInputs <em>Subquery Parameter Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subquery Parameter Inputs</em>' containment reference.
	 * @see #getSubqueryParameterInputs()
	 * @generated
	 */
	void setSubqueryParameterInputs(SubqueryParameterInputsType value);

	/**
	 * Returns the value of the '<em><b>Calculated Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for calculated values applied to any elements in this role path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calculated Values</em>' containment reference.
	 * @see #setCalculatedValues(CalculatedValuesType1)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getLeadRolePathType_CalculatedValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CalculatedValues' namespace='##targetNamespace'"
	 * @generated
	 */
	CalculatedValuesType1 getCalculatedValues();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathType#getCalculatedValues <em>Calculated Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated Values</em>' containment reference.
	 * @see #getCalculatedValues()
	 * @generated
	 */
	void setCalculatedValues(CalculatedValuesType1 value);

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A list of calculated boolean results that are necessary conditions for this role path.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference.
	 * @see #setConditions(ConditionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getLeadRolePathType_Conditions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Conditions' namespace='##targetNamespace'"
	 * @generated
	 */
	ConditionsType getConditions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathType#getConditions <em>Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditions</em>' containment reference.
	 * @see #getConditions()
	 * @generated
	 */
	void setConditions(ConditionsType value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference.
	 * @see #setNotes(NotesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getLeadRolePathType_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Notes' namespace='##targetNamespace'"
	 * @generated
	 */
	NotesType getNotes();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathType#getNotes <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' containment reference.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(NotesType value);

} // LeadRolePathType
