/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Path Owner Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathOwnerType#getPathComponents <em>Path Components</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathOwnerType#getPathComponent <em>Path Component</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathOwnerType#getCalculatedValues <em>Calculated Values</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathOwnerType#getSubqueries <em>Subqueries</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathOwnerType#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRolePathOwnerType()
 * @model abstract="true"
 *        extendedMetaData="name='RolePathOwnerType' kind='elementOnly'"
 * @generated
 */
public interface RolePathOwnerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Path Components</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for the role paths defined for this owner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Components</em>' containment reference.
	 * @see #setPathComponents(PathComponentsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRolePathOwnerType_PathComponents()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PathComponents' namespace='##targetNamespace'"
	 * @generated
	 */
	PathComponentsType getPathComponents();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathOwnerType#getPathComponents <em>Path Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Components</em>' containment reference.
	 * @see #getPathComponents()
	 * @generated
	 */
	void setPathComponents(PathComponentsType value);

	/**
	 * Returns the value of the '<em><b>Path Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (Deprecated, use PathComponents) A container for the role path defined by this owner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path Component</em>' containment reference.
	 * @see #setPathComponent(PathComponentType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRolePathOwnerType_PathComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PathComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	PathComponentType getPathComponent();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathOwnerType#getPathComponent <em>Path Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Component</em>' containment reference.
	 * @see #getPathComponent()
	 * @generated
	 */
	void setPathComponent(PathComponentType value);

	/**
	 * Returns the value of the '<em><b>Calculated Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (Deprecated, move to individual path components) A container for calculated values applied to elements in contained role paths.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Calculated Values</em>' containment reference.
	 * @see #setCalculatedValues(CalculatedValuesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRolePathOwnerType_CalculatedValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CalculatedValues' namespace='##targetNamespace'"
	 * @generated
	 */
	CalculatedValuesType getCalculatedValues();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathOwnerType#getCalculatedValues <em>Calculated Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated Values</em>' containment reference.
	 * @see #getCalculatedValues()
	 * @generated
	 */
	void setCalculatedValues(CalculatedValuesType value);

	/**
	 * Returns the value of the '<em><b>Subqueries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for subquery elements used by paths in this container.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subqueries</em>' containment reference.
	 * @see #setSubqueries(SubqueriesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRolePathOwnerType_Subqueries()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Subqueries' namespace='##targetNamespace'"
	 * @generated
	 */
	SubqueriesType getSubqueries();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathOwnerType#getSubqueries <em>Subqueries</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subqueries</em>' containment reference.
	 * @see #getSubqueries()
	 * @generated
	 */
	void setSubqueries(SubqueriesType value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRolePathOwnerType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathOwnerType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // RolePathOwnerType
