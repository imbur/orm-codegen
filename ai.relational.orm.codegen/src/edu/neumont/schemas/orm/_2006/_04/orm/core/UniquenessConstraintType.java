/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uniqueness Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A constraint specifying that the population of a set must be unique.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.UniquenessConstraintType#getPreferredIdentifierFor <em>Preferred Identifier For</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.UniquenessConstraintType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.UniquenessConstraintType#isIsInternal <em>Is Internal</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getUniquenessConstraintType()
 * @model extendedMetaData="name='UniquenessConstraintType' kind='elementOnly'"
 * @generated
 */
public interface UniquenessConstraintType extends SetConstraintWithJoinType {
	/**
	 * Returns the value of the '<em><b>Preferred Identifier For</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Identifier For</em>' containment reference.
	 * @see #setPreferredIdentifierFor(ObjectTypeRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getUniquenessConstraintType_PreferredIdentifierFor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PreferredIdentifierFor' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectTypeRef getPreferredIdentifierFor();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.UniquenessConstraintType#getPreferredIdentifierFor <em>Preferred Identifier For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Preferred Identifier For</em>' containment reference.
	 * @see #getPreferredIdentifierFor()
	 * @generated
	 */
	void setPreferredIdentifierFor(ObjectTypeRef value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getUniquenessConstraintType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.UniquenessConstraintType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Is Internal</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, this uniqueness constraint is internal to a single fact type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Internal</em>' attribute.
	 * @see #isSetIsInternal()
	 * @see #unsetIsInternal()
	 * @see #setIsInternal(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getUniquenessConstraintType_IsInternal()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsInternal'"
	 * @generated
	 */
	boolean isIsInternal();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.UniquenessConstraintType#isIsInternal <em>Is Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Internal</em>' attribute.
	 * @see #isSetIsInternal()
	 * @see #unsetIsInternal()
	 * @see #isIsInternal()
	 * @generated
	 */
	void setIsInternal(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.UniquenessConstraintType#isIsInternal <em>Is Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsInternal()
	 * @see #isIsInternal()
	 * @see #setIsInternal(boolean)
	 * @generated
	 */
	void unsetIsInternal();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.UniquenessConstraintType#isIsInternal <em>Is Internal</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Internal</em>' attribute is set.
	 * @see #unsetIsInternal()
	 * @see #isIsInternal()
	 * @see #setIsInternal(boolean)
	 * @generated
	 */
	boolean isSetIsInternal();

} // UniquenessConstraintType
