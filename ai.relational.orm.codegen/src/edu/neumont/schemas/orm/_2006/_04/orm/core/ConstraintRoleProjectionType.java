/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Role Projection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifying the projection source for a referenced constraint role in a join path.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleProjectionType#getProjectedFrom <em>Projected From</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleProjectionType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleProjectionType#isIsAutomatic <em>Is Automatic</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleProjectionType#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintRoleProjectionType()
 * @model extendedMetaData="name='ConstraintRoleProjectionType' kind='elementOnly'"
 * @generated
 */
public interface ConstraintRoleProjectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Projected From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The node in the join path used to populate this constraint role in a path projection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Projected From</em>' containment reference.
	 * @see #setProjectedFrom(ProjectedFromType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintRoleProjectionType_ProjectedFrom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ProjectedFrom' namespace='##targetNamespace'"
	 * @generated
	 */
	ProjectedFromType getProjectedFrom();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleProjectionType#getProjectedFrom <em>Projected From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projected From</em>' containment reference.
	 * @see #getProjectedFrom()
	 * @generated
	 */
	void setProjectedFrom(ProjectedFromType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintRoleProjectionType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleProjectionType#getId <em>Id</em>}' attribute.
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
	 * The constraint role is automatically projected onto the only matching path node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Automatic</em>' attribute.
	 * @see #isSetIsAutomatic()
	 * @see #unsetIsAutomatic()
	 * @see #setIsAutomatic(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintRoleProjectionType_IsAutomatic()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsAutomatic'"
	 * @generated
	 */
	boolean isIsAutomatic();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleProjectionType#isIsAutomatic <em>Is Automatic</em>}' attribute.
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
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleProjectionType#isIsAutomatic <em>Is Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAutomatic()
	 * @see #isIsAutomatic()
	 * @see #setIsAutomatic(boolean)
	 * @generated
	 */
	void unsetIsAutomatic();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleProjectionType#isIsAutomatic <em>Is Automatic</em>}' attribute is set.
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
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintRoleProjectionType_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='ref'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleProjectionType#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

} // ConstraintRoleProjectionType
