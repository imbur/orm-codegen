/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Color Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dynamic color information used by extension models with shape representations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DynamicColorType#getColorRole <em>Color Role</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.DynamicColorType#getColorValue <em>Color Value</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDynamicColorType()
 * @model extendedMetaData="name='DynamicColorType' kind='empty'"
 * @generated
 */
public interface DynamicColorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Color Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of a role indicating use of the color. Correspond to an item in a color set enum.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color Role</em>' attribute.
	 * @see #setColorRole(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDynamicColorType_ColorRole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Token"
	 *        extendedMetaData="kind='attribute' name='ColorRole'"
	 * @generated
	 */
	String getColorRole();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.DynamicColorType#getColorRole <em>Color Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Role</em>' attribute.
	 * @see #getColorRole()
	 * @generated
	 */
	void setColorRole(String value);

	/**
	 * Returns the value of the '<em><b>Color Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the color played by this role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color Value</em>' attribute.
	 * @see #setColorValue(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDynamicColorType_ColorValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ColorValue'"
	 * @generated
	 */
	String getColorValue();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.DynamicColorType#getColorValue <em>Color Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color Value</em>' attribute.
	 * @see #getColorValue()
	 * @generated
	 */
	void setColorValue(String value);

} // DynamicColorType
