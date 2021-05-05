/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleTextType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Text Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleTextTypeImpl#getFollowingText <em>Following Text</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleTextTypeImpl#getPostBoundText <em>Post Bound Text</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleTextTypeImpl#getPreBoundText <em>Pre Bound Text</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleTextTypeImpl#getRoleIndex <em>Role Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleTextTypeImpl extends MinimalEObjectImpl.Container implements RoleTextType {
	/**
	 * The default value of the '{@link #getFollowingText() <em>Following Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowingText()
	 * @generated
	 * @ordered
	 */
	protected static final String FOLLOWING_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFollowingText() <em>Following Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowingText()
	 * @generated
	 * @ordered
	 */
	protected String followingText = FOLLOWING_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostBoundText() <em>Post Bound Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostBoundText()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_BOUND_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostBoundText() <em>Post Bound Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostBoundText()
	 * @generated
	 * @ordered
	 */
	protected String postBoundText = POST_BOUND_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreBoundText() <em>Pre Bound Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreBoundText()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_BOUND_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreBoundText() <em>Pre Bound Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreBoundText()
	 * @generated
	 * @ordered
	 */
	protected String preBoundText = PRE_BOUND_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoleIndex() <em>Role Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ROLE_INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleIndex() <em>Role Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleIndex()
	 * @generated
	 * @ordered
	 */
	protected BigInteger roleIndex = ROLE_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleTextTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getRoleTextType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFollowingText() {
		return followingText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFollowingText(String newFollowingText) {
		String oldFollowingText = followingText;
		followingText = newFollowingText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_TEXT_TYPE__FOLLOWING_TEXT, oldFollowingText, followingText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostBoundText() {
		return postBoundText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostBoundText(String newPostBoundText) {
		String oldPostBoundText = postBoundText;
		postBoundText = newPostBoundText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_TEXT_TYPE__POST_BOUND_TEXT, oldPostBoundText, postBoundText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPreBoundText() {
		return preBoundText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreBoundText(String newPreBoundText) {
		String oldPreBoundText = preBoundText;
		preBoundText = newPreBoundText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_TEXT_TYPE__PRE_BOUND_TEXT, oldPreBoundText, preBoundText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRoleIndex() {
		return roleIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleIndex(BigInteger newRoleIndex) {
		BigInteger oldRoleIndex = roleIndex;
		roleIndex = newRoleIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_TEXT_TYPE__ROLE_INDEX, oldRoleIndex, roleIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ROLE_TEXT_TYPE__FOLLOWING_TEXT:
				return getFollowingText();
			case CorePackage.ROLE_TEXT_TYPE__POST_BOUND_TEXT:
				return getPostBoundText();
			case CorePackage.ROLE_TEXT_TYPE__PRE_BOUND_TEXT:
				return getPreBoundText();
			case CorePackage.ROLE_TEXT_TYPE__ROLE_INDEX:
				return getRoleIndex();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.ROLE_TEXT_TYPE__FOLLOWING_TEXT:
				setFollowingText((String)newValue);
				return;
			case CorePackage.ROLE_TEXT_TYPE__POST_BOUND_TEXT:
				setPostBoundText((String)newValue);
				return;
			case CorePackage.ROLE_TEXT_TYPE__PRE_BOUND_TEXT:
				setPreBoundText((String)newValue);
				return;
			case CorePackage.ROLE_TEXT_TYPE__ROLE_INDEX:
				setRoleIndex((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.ROLE_TEXT_TYPE__FOLLOWING_TEXT:
				setFollowingText(FOLLOWING_TEXT_EDEFAULT);
				return;
			case CorePackage.ROLE_TEXT_TYPE__POST_BOUND_TEXT:
				setPostBoundText(POST_BOUND_TEXT_EDEFAULT);
				return;
			case CorePackage.ROLE_TEXT_TYPE__PRE_BOUND_TEXT:
				setPreBoundText(PRE_BOUND_TEXT_EDEFAULT);
				return;
			case CorePackage.ROLE_TEXT_TYPE__ROLE_INDEX:
				setRoleIndex(ROLE_INDEX_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.ROLE_TEXT_TYPE__FOLLOWING_TEXT:
				return FOLLOWING_TEXT_EDEFAULT == null ? followingText != null : !FOLLOWING_TEXT_EDEFAULT.equals(followingText);
			case CorePackage.ROLE_TEXT_TYPE__POST_BOUND_TEXT:
				return POST_BOUND_TEXT_EDEFAULT == null ? postBoundText != null : !POST_BOUND_TEXT_EDEFAULT.equals(postBoundText);
			case CorePackage.ROLE_TEXT_TYPE__PRE_BOUND_TEXT:
				return PRE_BOUND_TEXT_EDEFAULT == null ? preBoundText != null : !PRE_BOUND_TEXT_EDEFAULT.equals(preBoundText);
			case CorePackage.ROLE_TEXT_TYPE__ROLE_INDEX:
				return ROLE_INDEX_EDEFAULT == null ? roleIndex != null : !ROLE_INDEX_EDEFAULT.equals(roleIndex);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (followingText: ");
		result.append(followingText);
		result.append(", postBoundText: ");
		result.append(postBoundText);
		result.append(", preBoundText: ");
		result.append(preBoundText);
		result.append(", roleIndex: ");
		result.append(roleIndex);
		result.append(')');
		return result.toString();
	}

} //RoleTextTypeImpl
