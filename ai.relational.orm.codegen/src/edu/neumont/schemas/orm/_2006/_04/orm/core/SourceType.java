/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SourceType#getPathRoot <em>Path Root</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SourceType#getPathedRole <em>Pathed Role</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SourceType#getCalculatedValue <em>Calculated Value</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.SourceType#getConstant <em>Constant</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSourceType()
 * @model extendedMetaData="name='Source_._type' kind='elementOnly'"
 * @generated
 */
public interface SourceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Path Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path Root</em>' containment reference.
	 * @see #setPathRoot(RootObjectTypeRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSourceType_PathRoot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PathRoot' namespace='##targetNamespace'"
	 * @generated
	 */
	RootObjectTypeRef getPathRoot();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SourceType#getPathRoot <em>Path Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path Root</em>' containment reference.
	 * @see #getPathRoot()
	 * @generated
	 */
	void setPathRoot(RootObjectTypeRef value);

	/**
	 * Returns the value of the '<em><b>Pathed Role</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathed Role</em>' containment reference.
	 * @see #setPathedRole(PathedRoleRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSourceType_PathedRole()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PathedRole' namespace='##targetNamespace'"
	 * @generated
	 */
	PathedRoleRef getPathedRole();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SourceType#getPathedRole <em>Pathed Role</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pathed Role</em>' containment reference.
	 * @see #getPathedRole()
	 * @generated
	 */
	void setPathedRole(PathedRoleRef value);

	/**
	 * Returns the value of the '<em><b>Calculated Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calculated Value</em>' containment reference.
	 * @see #setCalculatedValue(CalculatedValueRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSourceType_CalculatedValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CalculatedValue' namespace='##targetNamespace'"
	 * @generated
	 */
	CalculatedValueRef getCalculatedValue();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SourceType#getCalculatedValue <em>Calculated Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Calculated Value</em>' containment reference.
	 * @see #getCalculatedValue()
	 * @generated
	 */
	void setCalculatedValue(CalculatedValueRef value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' containment reference.
	 * @see #setConstant(PathConstantType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSourceType_Constant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Constant' namespace='##targetNamespace'"
	 * @generated
	 */
	PathConstantType getConstant();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.SourceType#getConstant <em>Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' containment reference.
	 * @see #getConstant()
	 * @generated
	 */
	void setConstant(PathConstantType value);

} // SourceType
