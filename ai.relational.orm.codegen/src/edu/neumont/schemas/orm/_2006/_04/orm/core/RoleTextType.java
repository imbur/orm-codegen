/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Text Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleTextType#getFollowingText <em>Following Text</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleTextType#getPostBoundText <em>Post Bound Text</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleTextType#getPreBoundText <em>Pre Bound Text</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleTextType#getRoleIndex <em>Role Index</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleTextType()
 * @model extendedMetaData="name='RoleText_._type' kind='empty'"
 * @generated
 */
public interface RoleTextType extends EObject {
	/**
	 * Returns the value of the '<em><b>Following Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text following a role replacement field and associated bound text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Following Text</em>' attribute.
	 * @see #setFollowingText(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleTextType_FollowingText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='FollowingText'"
	 * @generated
	 */
	String getFollowingText();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleTextType#getFollowingText <em>Following Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Following Text</em>' attribute.
	 * @see #getFollowingText()
	 * @generated
	 */
	void setFollowingText(String value);

	/**
	 * Returns the value of the '<em><b>Post Bound Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text that is bound to the role as trailing text through hyphen binding semantics in the full reading text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post Bound Text</em>' attribute.
	 * @see #setPostBoundText(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleTextType_PostBoundText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='PostBoundText'"
	 * @generated
	 */
	String getPostBoundText();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleTextType#getPostBoundText <em>Post Bound Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post Bound Text</em>' attribute.
	 * @see #getPostBoundText()
	 * @generated
	 */
	void setPostBoundText(String value);

	/**
	 * Returns the value of the '<em><b>Pre Bound Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text that is bound to the role as leading text through hyphen binding semantics in the full reading text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre Bound Text</em>' attribute.
	 * @see #setPreBoundText(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleTextType_PreBoundText()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='PreBoundText'"
	 * @generated
	 */
	String getPreBoundText();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleTextType#getPreBoundText <em>Pre Bound Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre Bound Text</em>' attribute.
	 * @see #getPreBoundText()
	 * @generated
	 */
	void setPreBoundText(String value);

	/**
	 * Returns the value of the '<em><b>Role Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The zero-based index of the role.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Index</em>' attribute.
	 * @see #setRoleIndex(BigInteger)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRoleTextType_RoleIndex()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='RoleIndex'"
	 * @generated
	 */
	BigInteger getRoleIndex();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.RoleTextType#getRoleIndex <em>Role Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Index</em>' attribute.
	 * @see #getRoleIndex()
	 * @generated
	 */
	void setRoleIndex(BigInteger value);

} // RoleTextType
