/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mandatory Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A constraint specifying that a set must be populated.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType#getExclusiveOrExclusionConstraint <em>Exclusive Or Exclusion Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType#getImpliedByObjectType <em>Implied By Object Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType#isIsImplied <em>Is Implied</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType#isIsSimple <em>Is Simple</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getMandatoryConstraintType()
 * @model extendedMetaData="name='MandatoryConstraintType' kind='elementOnly'"
 * @generated
 */
public interface MandatoryConstraintType extends SetConstraintType {
	/**
	 * Returns the value of the '<em><b>Exclusive Or Exclusion Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive Or Exclusion Constraint</em>' containment reference.
	 * @see #setExclusiveOrExclusionConstraint(ExclusionConstraintRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getMandatoryConstraintType_ExclusiveOrExclusionConstraint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExclusiveOrExclusionConstraint' namespace='##targetNamespace'"
	 * @generated
	 */
	ExclusionConstraintRef getExclusiveOrExclusionConstraint();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType#getExclusiveOrExclusionConstraint <em>Exclusive Or Exclusion Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Or Exclusion Constraint</em>' containment reference.
	 * @see #getExclusiveOrExclusionConstraint()
	 * @generated
	 */
	void setExclusiveOrExclusionConstraint(ExclusionConstraintRef value);

	/**
	 * Returns the value of the '<em><b>Implied By Object Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implied By Object Type</em>' containment reference.
	 * @see #setImpliedByObjectType(ObjectTypeRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getMandatoryConstraintType_ImpliedByObjectType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ImpliedByObjectType' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectTypeRef getImpliedByObjectType();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType#getImpliedByObjectType <em>Implied By Object Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implied By Object Type</em>' containment reference.
	 * @see #getImpliedByObjectType()
	 * @generated
	 */
	void setImpliedByObjectType(ObjectTypeRef value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getMandatoryConstraintType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Is Implied</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if this constraint is implied by a lack of a mandatory role on any non-existential role on the non-independent role player. An implied mandatory constraint may have a single role or multiple roles, but IsSimple is never true for an implied mandatory constraint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Implied</em>' attribute.
	 * @see #isSetIsImplied()
	 * @see #unsetIsImplied()
	 * @see #setIsImplied(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getMandatoryConstraintType_IsImplied()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsImplied'"
	 * @generated
	 */
	boolean isIsImplied();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType#isIsImplied <em>Is Implied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Implied</em>' attribute.
	 * @see #isSetIsImplied()
	 * @see #unsetIsImplied()
	 * @see #isIsImplied()
	 * @generated
	 */
	void setIsImplied(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType#isIsImplied <em>Is Implied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsImplied()
	 * @see #isIsImplied()
	 * @see #setIsImplied(boolean)
	 * @generated
	 */
	void unsetIsImplied();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType#isIsImplied <em>Is Implied</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Implied</em>' attribute is set.
	 * @see #unsetIsImplied()
	 * @see #isIsImplied()
	 * @see #setIsImplied(boolean)
	 * @generated
	 */
	boolean isSetIsImplied();

	/**
	 * Returns the value of the '<em><b>Is Simple</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True if this is an internal constraint associated with a single role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Simple</em>' attribute.
	 * @see #isSetIsSimple()
	 * @see #unsetIsSimple()
	 * @see #setIsSimple(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getMandatoryConstraintType_IsSimple()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsSimple'"
	 * @generated
	 */
	boolean isIsSimple();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType#isIsSimple <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Simple</em>' attribute.
	 * @see #isSetIsSimple()
	 * @see #unsetIsSimple()
	 * @see #isIsSimple()
	 * @generated
	 */
	void setIsSimple(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType#isIsSimple <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsSimple()
	 * @see #isIsSimple()
	 * @see #setIsSimple(boolean)
	 * @generated
	 */
	void unsetIsSimple();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType#isIsSimple <em>Is Simple</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Simple</em>' attribute is set.
	 * @see #unsetIsSimple()
	 * @see #isIsSimple()
	 * @see #setIsSimple(boolean)
	 * @generated
	 */
	boolean isSetIsSimple();

} // MandatoryConstraintType
