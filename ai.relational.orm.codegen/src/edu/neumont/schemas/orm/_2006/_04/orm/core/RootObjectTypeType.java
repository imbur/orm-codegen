/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Object Type Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to the object type that establishes the start point object type for a role path.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeType#getValueRestriction <em>Value Restriction</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeType#isIsNegated <em>Is Negated</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeType#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRootObjectTypeType()
 * @model extendedMetaData="name='RootObjectTypeType' kind='elementOnly'"
 * @generated
 */
public interface RootObjectTypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Restriction</em>' containment reference.
	 * @see #setValueRestriction(PathConditionRootValueRestrictionType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRootObjectTypeType_ValueRestriction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ValueRestriction' namespace='##targetNamespace'"
	 * @generated
	 */
	PathConditionRootValueRestrictionType getValueRestriction();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeType#getValueRestriction <em>Value Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Restriction</em>' containment reference.
	 * @see #getValueRestriction()
	 * @generated
	 */
	void setValueRestriction(PathConditionRootValueRestrictionType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRootObjectTypeType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeType#getId <em>Id</em>}' attribute.
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
	 * The path root is negated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Negated</em>' attribute.
	 * @see #isSetIsNegated()
	 * @see #unsetIsNegated()
	 * @see #setIsNegated(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRootObjectTypeType_IsNegated()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsNegated'"
	 * @generated
	 */
	boolean isIsNegated();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeType#isIsNegated <em>Is Negated</em>}' attribute.
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
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeType#isIsNegated <em>Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsNegated()
	 * @see #isIsNegated()
	 * @see #setIsNegated(boolean)
	 * @generated
	 */
	void unsetIsNegated();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeType#isIsNegated <em>Is Negated</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the referenced element's unique id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRootObjectTypeType_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='ref'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeType#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

} // RootObjectTypeType
