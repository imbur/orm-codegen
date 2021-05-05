/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Path Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathType#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathType#getRootObjectType <em>Root Object Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathType#getPathedRoles <em>Pathed Roles</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathType#getSubPaths <em>Sub Paths</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathType#getSplitCombinationOperator <em>Split Combination Operator</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathType#isSplitIsNegated <em>Split Is Negated</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRolePathType()
 * @model abstract="true"
 *        extendedMetaData="name='RolePathType' kind='elementOnly'"
 * @generated
 */
public interface RolePathType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRolePathType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Root Object Type</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.RootObjectTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Object Type</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRolePathType_RootObjectType()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RootObjectType' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RootObjectTypeType> getRootObjectType();

	/**
	 * Returns the value of the '<em><b>Pathed Roles</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.PathedRolesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for PathedRole elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pathed Roles</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRolePathType_PathedRoles()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PathedRoles' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PathedRolesType> getPathedRoles();

	/**
	 * Returns the value of the '<em><b>Sub Paths</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.SubPathsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for SubPath elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub Paths</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRolePathType_SubPaths()
	 * @model containment="true" upper="2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SubPaths' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SubPathsType> getSubPaths();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRolePathType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Split Combination Operator</b></em>' attribute.
	 * The default value is <code>"And"</code>.
	 * The literals are from the enumeration {@link edu.neumont.schemas.orm._2006._04.orm.core.LogicalCombinationOperatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specify how sub paths split from this path should be combined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Split Combination Operator</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.LogicalCombinationOperatorType
	 * @see #isSetSplitCombinationOperator()
	 * @see #unsetSplitCombinationOperator()
	 * @see #setSplitCombinationOperator(LogicalCombinationOperatorType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRolePathType_SplitCombinationOperator()
	 * @model default="And" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='SplitCombinationOperator'"
	 * @generated
	 */
	LogicalCombinationOperatorType getSplitCombinationOperator();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathType#getSplitCombinationOperator <em>Split Combination Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split Combination Operator</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.LogicalCombinationOperatorType
	 * @see #isSetSplitCombinationOperator()
	 * @see #unsetSplitCombinationOperator()
	 * @see #getSplitCombinationOperator()
	 * @generated
	 */
	void setSplitCombinationOperator(LogicalCombinationOperatorType value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathType#getSplitCombinationOperator <em>Split Combination Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSplitCombinationOperator()
	 * @see #getSplitCombinationOperator()
	 * @see #setSplitCombinationOperator(LogicalCombinationOperatorType)
	 * @generated
	 */
	void unsetSplitCombinationOperator();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathType#getSplitCombinationOperator <em>Split Combination Operator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Split Combination Operator</em>' attribute is set.
	 * @see #unsetSplitCombinationOperator()
	 * @see #getSplitCombinationOperator()
	 * @see #setSplitCombinationOperator(LogicalCombinationOperatorType)
	 * @generated
	 */
	boolean isSetSplitCombinationOperator();

	/**
	 * Returns the value of the '<em><b>Split Is Negated</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Should a negation be applied to the split combination operator?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Split Is Negated</em>' attribute.
	 * @see #isSetSplitIsNegated()
	 * @see #unsetSplitIsNegated()
	 * @see #setSplitIsNegated(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRolePathType_SplitIsNegated()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='SplitIsNegated'"
	 * @generated
	 */
	boolean isSplitIsNegated();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathType#isSplitIsNegated <em>Split Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split Is Negated</em>' attribute.
	 * @see #isSetSplitIsNegated()
	 * @see #unsetSplitIsNegated()
	 * @see #isSplitIsNegated()
	 * @generated
	 */
	void setSplitIsNegated(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathType#isSplitIsNegated <em>Split Is Negated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSplitIsNegated()
	 * @see #isSplitIsNegated()
	 * @see #setSplitIsNegated(boolean)
	 * @generated
	 */
	void unsetSplitIsNegated();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RolePathType#isSplitIsNegated <em>Split Is Negated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Split Is Negated</em>' attribute is set.
	 * @see #unsetSplitIsNegated()
	 * @see #isSplitIsNegated()
	 * @see #setSplitIsNegated(boolean)
	 * @generated
	 */
	boolean isSetSplitIsNegated();

} // RolePathType
