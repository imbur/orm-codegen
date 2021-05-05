/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtype Derivation Path Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A role path used to define the population of a derived subtype.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationPathType#getInformalRule <em>Informal Rule</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationPathType#getDerivationCompleteness <em>Derivation Completeness</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationPathType#getDerivationStorage <em>Derivation Storage</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationPathType#isExternalDerivation <em>External Derivation</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeDerivationPathType()
 * @model extendedMetaData="name='SubtypeDerivationPathType' kind='elementOnly'"
 * @generated
 */
public interface SubtypeDerivationPathType extends RolePathOwnerType {
	/**
	 * Returns the value of the '<em><b>Informal Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informal Rule</em>' containment reference.
	 * @see #setInformalRule(InformalDerivationRuleType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeDerivationPathType_InformalRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InformalRule' namespace='##targetNamespace'"
	 * @generated
	 */
	InformalDerivationRuleType getInformalRule();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationPathType#getInformalRule <em>Informal Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Informal Rule</em>' containment reference.
	 * @see #getInformalRule()
	 * @generated
	 */
	void setInformalRule(InformalDerivationRuleType value);

	/**
	 * Returns the value of the '<em><b>Derivation Completeness</b></em>' attribute.
	 * The default value is <code>"FullyDerived"</code>.
	 * The literals are from the enumeration {@link edu.neumont.schemas.orm._2006._04.orm.core.DerivationCompletenessValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation Completeness</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DerivationCompletenessValues
	 * @see #isSetDerivationCompleteness()
	 * @see #unsetDerivationCompleteness()
	 * @see #setDerivationCompleteness(DerivationCompletenessValues)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeDerivationPathType_DerivationCompleteness()
	 * @model default="FullyDerived" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='DerivationCompleteness'"
	 * @generated
	 */
	DerivationCompletenessValues getDerivationCompleteness();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationPathType#getDerivationCompleteness <em>Derivation Completeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Completeness</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DerivationCompletenessValues
	 * @see #isSetDerivationCompleteness()
	 * @see #unsetDerivationCompleteness()
	 * @see #getDerivationCompleteness()
	 * @generated
	 */
	void setDerivationCompleteness(DerivationCompletenessValues value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationPathType#getDerivationCompleteness <em>Derivation Completeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDerivationCompleteness()
	 * @see #getDerivationCompleteness()
	 * @see #setDerivationCompleteness(DerivationCompletenessValues)
	 * @generated
	 */
	void unsetDerivationCompleteness();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationPathType#getDerivationCompleteness <em>Derivation Completeness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Derivation Completeness</em>' attribute is set.
	 * @see #unsetDerivationCompleteness()
	 * @see #getDerivationCompleteness()
	 * @see #setDerivationCompleteness(DerivationCompletenessValues)
	 * @generated
	 */
	boolean isSetDerivationCompleteness();

	/**
	 * Returns the value of the '<em><b>Derivation Storage</b></em>' attribute.
	 * The default value is <code>"NotStored"</code>.
	 * The literals are from the enumeration {@link edu.neumont.schemas.orm._2006._04.orm.core.DerivationStorageValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation Storage</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DerivationStorageValues
	 * @see #isSetDerivationStorage()
	 * @see #unsetDerivationStorage()
	 * @see #setDerivationStorage(DerivationStorageValues)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeDerivationPathType_DerivationStorage()
	 * @model default="NotStored" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='DerivationStorage'"
	 * @generated
	 */
	DerivationStorageValues getDerivationStorage();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationPathType#getDerivationStorage <em>Derivation Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Storage</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DerivationStorageValues
	 * @see #isSetDerivationStorage()
	 * @see #unsetDerivationStorage()
	 * @see #getDerivationStorage()
	 * @generated
	 */
	void setDerivationStorage(DerivationStorageValues value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationPathType#getDerivationStorage <em>Derivation Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDerivationStorage()
	 * @see #getDerivationStorage()
	 * @see #setDerivationStorage(DerivationStorageValues)
	 * @generated
	 */
	void unsetDerivationStorage();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationPathType#getDerivationStorage <em>Derivation Storage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Derivation Storage</em>' attribute is set.
	 * @see #unsetDerivationStorage()
	 * @see #getDerivationStorage()
	 * @see #setDerivationStorage(DerivationStorageValues)
	 * @generated
	 */
	boolean isSetDerivationStorage();

	/**
	 * Returns the value of the '<em><b>External Derivation</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An empty derivation rule is externally defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Derivation</em>' attribute.
	 * @see #isSetExternalDerivation()
	 * @see #unsetExternalDerivation()
	 * @see #setExternalDerivation(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSubtypeDerivationPathType_ExternalDerivation()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ExternalDerivation'"
	 * @generated
	 */
	boolean isExternalDerivation();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationPathType#isExternalDerivation <em>External Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Derivation</em>' attribute.
	 * @see #isSetExternalDerivation()
	 * @see #unsetExternalDerivation()
	 * @see #isExternalDerivation()
	 * @generated
	 */
	void setExternalDerivation(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationPathType#isExternalDerivation <em>External Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExternalDerivation()
	 * @see #isExternalDerivation()
	 * @see #setExternalDerivation(boolean)
	 * @generated
	 */
	void unsetExternalDerivation();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationPathType#isExternalDerivation <em>External Derivation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>External Derivation</em>' attribute is set.
	 * @see #unsetExternalDerivation()
	 * @see #isExternalDerivation()
	 * @see #setExternalDerivation(boolean)
	 * @generated
	 */
	boolean isSetExternalDerivation();

} // SubtypeDerivationPathType
