/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Role Projection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifying the derivation source for a referenced role in a derived FactType.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivedRoleProjectionType#getDerivationSource <em>Derivation Source</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivedRoleProjectionType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivedRoleProjectionType#isIsAutomatic <em>Is Automatic</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivedRoleProjectionType#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDerivedRoleProjectionType()
 * @model extendedMetaData="name='DerivedRoleProjectionType' kind='elementOnly'"
 * @generated
 */
public interface DerivedRoleProjectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Derivation Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The node in the derivation path used to populate this role in a derived fact.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivation Source</em>' containment reference.
	 * @see #setDerivationSource(DerivationSourceType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDerivedRoleProjectionType_DerivationSource()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DerivationSource' namespace='##targetNamespace'"
	 * @generated
	 */
	DerivationSourceType getDerivationSource();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivedRoleProjectionType#getDerivationSource <em>Derivation Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Source</em>' containment reference.
	 * @see #getDerivationSource()
	 * @generated
	 */
	void setDerivationSource(DerivationSourceType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDerivedRoleProjectionType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivedRoleProjectionType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Is Automatic</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role is automatically projected onto the only matching path node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Automatic</em>' attribute.
	 * @see #isSetIsAutomatic()
	 * @see #unsetIsAutomatic()
	 * @see #setIsAutomatic(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDerivedRoleProjectionType_IsAutomatic()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsAutomatic'"
	 * @generated
	 */
	boolean isIsAutomatic();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivedRoleProjectionType#isIsAutomatic <em>Is Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Automatic</em>' attribute.
	 * @see #isSetIsAutomatic()
	 * @see #unsetIsAutomatic()
	 * @see #isIsAutomatic()
	 * @generated
	 */
	void setIsAutomatic(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivedRoleProjectionType#isIsAutomatic <em>Is Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAutomatic()
	 * @see #isIsAutomatic()
	 * @see #setIsAutomatic(boolean)
	 * @generated
	 */
	void unsetIsAutomatic();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivedRoleProjectionType#isIsAutomatic <em>Is Automatic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Automatic</em>' attribute is set.
	 * @see #unsetIsAutomatic()
	 * @see #isIsAutomatic()
	 * @see #setIsAutomatic(boolean)
	 * @generated
	 */
	boolean isSetIsAutomatic();

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the referenced element's unique id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDerivedRoleProjectionType_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='ref'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.DerivedRoleProjectionType#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

} // DerivedRoleProjectionType
