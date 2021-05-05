/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#getRolePlayer <em>Role Player</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#getValueRestriction <em>Value Restriction</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#getCardinalityRestriction <em>Cardinality Restriction</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#getDerivationSource <em>Derivation Source</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#getRoleInstances <em>Role Instances</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleBaseType()
 * @model abstract="true"
 *        extendedMetaData="name='RoleBaseType' kind='elementOnly'"
 * @generated
 */
public interface RoleBaseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Role Player</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to the object type that plays this role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Player</em>' containment reference.
	 * @see #setRolePlayer(ObjectTypeRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleBaseType_RolePlayer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RolePlayer' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectTypeRef getRolePlayer();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#getRolePlayer <em>Role Player</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Player</em>' containment reference.
	 * @see #getRolePlayer()
	 * @generated
	 */
	void setRolePlayer(ObjectTypeRef value);

	/**
	 * Returns the value of the '<em><b>Value Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Restriction</em>' containment reference.
	 * @see #setValueRestriction(RoleValueRestrictionType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleBaseType_ValueRestriction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValueRestriction' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleValueRestrictionType getValueRestriction();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#getValueRestriction <em>Value Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Restriction</em>' containment reference.
	 * @see #getValueRestriction()
	 * @generated
	 */
	void setValueRestriction(RoleValueRestrictionType value);

	/**
	 * Returns the value of the '<em><b>Cardinality Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Restriction</em>' containment reference.
	 * @see #setCardinalityRestriction(UnaryRoleCardinalityRestrictionType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleBaseType_CardinalityRestriction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CardinalityRestriction' namespace='##targetNamespace'"
	 * @generated
	 */
	UnaryRoleCardinalityRestrictionType getCardinalityRestriction();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#getCardinalityRestriction <em>Cardinality Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Restriction</em>' containment reference.
	 * @see #getCardinalityRestriction()
	 * @generated
	 */
	void setCardinalityRestriction(UnaryRoleCardinalityRestrictionType value);

	/**
	 * Returns the value of the '<em><b>Derivation Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (Deprecated, replaced with FactTypeDerivationPath/DerivationProjections) The node in the derivation path used to populate this role in a derived fact type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivation Source</em>' containment reference.
	 * @see #setDerivationSource(DerivationSourceType1)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleBaseType_DerivationSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DerivationSource' namespace='##targetNamespace'"
	 * @generated
	 */
	DerivationSourceType1 getDerivationSource();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#getDerivationSource <em>Derivation Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Source</em>' containment reference.
	 * @see #getDerivationSource()
	 * @generated
	 */
	void setDerivationSource(DerivationSourceType1 value);

	/**
	 * Returns the value of the '<em><b>Role Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Instances</em>' containment reference.
	 * @see #setRoleInstances(RoleInstancesType1)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleBaseType_RoleInstances()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RoleInstances' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleInstancesType1 getRoleInstances();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#getRoleInstances <em>Role Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Instances</em>' containment reference.
	 * @see #getRoleInstances()
	 * @generated
	 */
	void setRoleInstances(RoleInstancesType1 value);

	/**
	 * Returns the value of the '<em><b>Is Mandatory</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived attribute set to true if this role is associated with a simple mandatory constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Mandatory</em>' attribute.
	 * @see #isSetIsMandatory()
	 * @see #unsetIsMandatory()
	 * @see #setIsMandatory(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleBaseType_IsMandatory()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='_IsMandatory'"
	 * @generated
	 */
	boolean isIsMandatory();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#isIsMandatory <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mandatory</em>' attribute.
	 * @see #isSetIsMandatory()
	 * @see #unsetIsMandatory()
	 * @see #isIsMandatory()
	 * @generated
	 */
	void setIsMandatory(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#isIsMandatory <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsMandatory()
	 * @see #isIsMandatory()
	 * @see #setIsMandatory(boolean)
	 * @generated
	 */
	void unsetIsMandatory();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#isIsMandatory <em>Is Mandatory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Mandatory</em>' attribute is set.
	 * @see #unsetIsMandatory()
	 * @see #isIsMandatory()
	 * @see #setIsMandatory(boolean)
	 * @generated
	 */
	boolean isSetIsMandatory();

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The default value is <code>"ZeroToOne"</code>.
	 * The literals are from the enumeration {@link edu.neumont.schemas.orm._2006._04.orm.core.MultiplicityValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.MultiplicityValues
	 * @see #isSetMultiplicity()
	 * @see #unsetMultiplicity()
	 * @see #setMultiplicity(MultiplicityValues)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleBaseType_Multiplicity()
	 * @model default="ZeroToOne" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='_Multiplicity'"
	 * @generated
	 */
	MultiplicityValues getMultiplicity();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.MultiplicityValues
	 * @see #isSetMultiplicity()
	 * @see #unsetMultiplicity()
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(MultiplicityValues value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMultiplicity()
	 * @see #getMultiplicity()
	 * @see #setMultiplicity(MultiplicityValues)
	 * @generated
	 */
	void unsetMultiplicity();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#getMultiplicity <em>Multiplicity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Multiplicity</em>' attribute is set.
	 * @see #unsetMultiplicity()
	 * @see #getMultiplicity()
	 * @see #setMultiplicity(MultiplicityValues)
	 * @generated
	 */
	boolean isSetMultiplicity();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleBaseType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An explicit name for this role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleBaseType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RoleBaseType
