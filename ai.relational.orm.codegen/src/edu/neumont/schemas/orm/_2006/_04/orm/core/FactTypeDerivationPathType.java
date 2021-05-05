/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact Type Derivation Path Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A role path with projected nodes used to define the population of a derived fact type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#getDerivationProjections <em>Derivation Projections</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#getInformalRule <em>Informal Rule</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#getDerivationCompleteness <em>Derivation Completeness</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#getDerivationStorage <em>Derivation Storage</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#isExternalDerivation <em>External Derivation</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#getName <em>Name</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#isSetProjection <em>Set Projection</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeDerivationPathType()
 * @model extendedMetaData="name='FactTypeDerivationPathType' kind='elementOnly'"
 * @generated
 */
public interface FactTypeDerivationPathType extends RolePathOwnerType {
	/**
	 * Returns the value of the '<em><b>Derivation Projections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for different sets of role projections.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivation Projections</em>' containment reference.
	 * @see #setDerivationProjections(DerivationProjectionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeDerivationPathType_DerivationProjections()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DerivationProjections' namespace='##targetNamespace'"
	 * @generated
	 */
	DerivationProjectionsType getDerivationProjections();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#getDerivationProjections <em>Derivation Projections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Projections</em>' containment reference.
	 * @see #getDerivationProjections()
	 * @generated
	 */
	void setDerivationProjections(DerivationProjectionsType value);

	/**
	 * Returns the value of the '<em><b>Informal Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Informal Rule</em>' containment reference.
	 * @see #setInformalRule(InformalDerivationRuleType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeDerivationPathType_InformalRule()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InformalRule' namespace='##targetNamespace'"
	 * @generated
	 */
	InformalDerivationRuleType getInformalRule();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#getInformalRule <em>Informal Rule</em>}' containment reference.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeDerivationPathType_DerivationCompleteness()
	 * @model default="FullyDerived" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='DerivationCompleteness'"
	 * @generated
	 */
	DerivationCompletenessValues getDerivationCompleteness();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#getDerivationCompleteness <em>Derivation Completeness</em>}' attribute.
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
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#getDerivationCompleteness <em>Derivation Completeness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDerivationCompleteness()
	 * @see #getDerivationCompleteness()
	 * @see #setDerivationCompleteness(DerivationCompletenessValues)
	 * @generated
	 */
	void unsetDerivationCompleteness();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#getDerivationCompleteness <em>Derivation Completeness</em>}' attribute is set.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeDerivationPathType_DerivationStorage()
	 * @model default="NotStored" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='DerivationStorage'"
	 * @generated
	 */
	DerivationStorageValues getDerivationStorage();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#getDerivationStorage <em>Derivation Storage</em>}' attribute.
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
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#getDerivationStorage <em>Derivation Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDerivationStorage()
	 * @see #getDerivationStorage()
	 * @see #setDerivationStorage(DerivationStorageValues)
	 * @generated
	 */
	void unsetDerivationStorage();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#getDerivationStorage <em>Derivation Storage</em>}' attribute is set.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeDerivationPathType_ExternalDerivation()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ExternalDerivation'"
	 * @generated
	 */
	boolean isExternalDerivation();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#isExternalDerivation <em>External Derivation</em>}' attribute.
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
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#isExternalDerivation <em>External Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExternalDerivation()
	 * @see #isExternalDerivation()
	 * @see #setExternalDerivation(boolean)
	 * @generated
	 */
	void unsetExternalDerivation();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#isExternalDerivation <em>External Derivation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>External Derivation</em>' attribute is set.
	 * @see #unsetExternalDerivation()
	 * @see #isExternalDerivation()
	 * @see #setExternalDerivation(boolean)
	 * @generated
	 */
	boolean isSetExternalDerivation();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of a fully derived fact type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeDerivationPathType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Set Projection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The derivation rule results in a set of distinct facts instead of a bag that might contain duplicates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Projection</em>' attribute.
	 * @see #isSetSetProjection()
	 * @see #unsetSetProjection()
	 * @see #setSetProjection(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeDerivationPathType_SetProjection()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='SetProjection'"
	 * @generated
	 */
	boolean isSetProjection();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#isSetProjection <em>Set Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Projection</em>' attribute.
	 * @see #isSetSetProjection()
	 * @see #unsetSetProjection()
	 * @see #isSetProjection()
	 * @generated
	 */
	void setSetProjection(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#isSetProjection <em>Set Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSetProjection()
	 * @see #isSetProjection()
	 * @see #setSetProjection(boolean)
	 * @generated
	 */
	void unsetSetProjection();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationPathType#isSetProjection <em>Set Projection</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Set Projection</em>' attribute is set.
	 * @see #unsetSetProjection()
	 * @see #isSetProjection()
	 * @see #setSetProjection(boolean)
	 * @generated
	 */
	boolean isSetSetProjection();

} // FactTypeDerivationPathType
