/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ExtensionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRef;
import edu.neumont.schemas.orm._2006._04.orm.core.UniquenessConstraintType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uniqueness Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.UniquenessConstraintTypeImpl#getPreferredIdentifierFor <em>Preferred Identifier For</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.UniquenessConstraintTypeImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.UniquenessConstraintTypeImpl#isIsInternal <em>Is Internal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniquenessConstraintTypeImpl extends SetConstraintWithJoinTypeImpl implements UniquenessConstraintType {
	/**
	 * The cached value of the '{@link #getPreferredIdentifierFor() <em>Preferred Identifier For</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredIdentifierFor()
	 * @generated
	 * @ordered
	 */
	protected ObjectTypeRef preferredIdentifierFor;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected ExtensionsType extensions;

	/**
	 * The default value of the '{@link #isIsInternal() <em>Is Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInternal() <em>Is Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInternal()
	 * @generated
	 * @ordered
	 */
	protected boolean isInternal = IS_INTERNAL_EDEFAULT;

	/**
	 * This is true if the Is Internal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isInternalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniquenessConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getUniquenessConstraintType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeRef getPreferredIdentifierFor() {
		return preferredIdentifierFor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreferredIdentifierFor(ObjectTypeRef newPreferredIdentifierFor, NotificationChain msgs) {
		ObjectTypeRef oldPreferredIdentifierFor = preferredIdentifierFor;
		preferredIdentifierFor = newPreferredIdentifierFor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.UNIQUENESS_CONSTRAINT_TYPE__PREFERRED_IDENTIFIER_FOR, oldPreferredIdentifierFor, newPreferredIdentifierFor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredIdentifierFor(ObjectTypeRef newPreferredIdentifierFor) {
		if (newPreferredIdentifierFor != preferredIdentifierFor) {
			NotificationChain msgs = null;
			if (preferredIdentifierFor != null)
				msgs = ((InternalEObject)preferredIdentifierFor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.UNIQUENESS_CONSTRAINT_TYPE__PREFERRED_IDENTIFIER_FOR, null, msgs);
			if (newPreferredIdentifierFor != null)
				msgs = ((InternalEObject)newPreferredIdentifierFor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.UNIQUENESS_CONSTRAINT_TYPE__PREFERRED_IDENTIFIER_FOR, null, msgs);
			msgs = basicSetPreferredIdentifierFor(newPreferredIdentifierFor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.UNIQUENESS_CONSTRAINT_TYPE__PREFERRED_IDENTIFIER_FOR, newPreferredIdentifierFor, newPreferredIdentifierFor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsType getExtensions() {
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensions(ExtensionsType newExtensions, NotificationChain msgs) {
		ExtensionsType oldExtensions = extensions;
		extensions = newExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.UNIQUENESS_CONSTRAINT_TYPE__EXTENSIONS, oldExtensions, newExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensions(ExtensionsType newExtensions) {
		if (newExtensions != extensions) {
			NotificationChain msgs = null;
			if (extensions != null)
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.UNIQUENESS_CONSTRAINT_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.UNIQUENESS_CONSTRAINT_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.UNIQUENESS_CONSTRAINT_TYPE__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInternal() {
		return isInternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInternal(boolean newIsInternal) {
		boolean oldIsInternal = isInternal;
		isInternal = newIsInternal;
		boolean oldIsInternalESet = isInternalESet;
		isInternalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.UNIQUENESS_CONSTRAINT_TYPE__IS_INTERNAL, oldIsInternal, isInternal, !oldIsInternalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsInternal() {
		boolean oldIsInternal = isInternal;
		boolean oldIsInternalESet = isInternalESet;
		isInternal = IS_INTERNAL_EDEFAULT;
		isInternalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.UNIQUENESS_CONSTRAINT_TYPE__IS_INTERNAL, oldIsInternal, IS_INTERNAL_EDEFAULT, oldIsInternalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsInternal() {
		return isInternalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.UNIQUENESS_CONSTRAINT_TYPE__PREFERRED_IDENTIFIER_FOR:
				return basicSetPreferredIdentifierFor(null, msgs);
			case CorePackage.UNIQUENESS_CONSTRAINT_TYPE__EXTENSIONS:
				return basicSetExtensions(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.UNIQUENESS_CONSTRAINT_TYPE__PREFERRED_IDENTIFIER_FOR:
				return getPreferredIdentifierFor();
			case CorePackage.UNIQUENESS_CONSTRAINT_TYPE__EXTENSIONS:
				return getExtensions();
			case CorePackage.UNIQUENESS_CONSTRAINT_TYPE__IS_INTERNAL:
				return isIsInternal();
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
			case CorePackage.UNIQUENESS_CONSTRAINT_TYPE__PREFERRED_IDENTIFIER_FOR:
				setPreferredIdentifierFor((ObjectTypeRef)newValue);
				return;
			case CorePackage.UNIQUENESS_CONSTRAINT_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
				return;
			case CorePackage.UNIQUENESS_CONSTRAINT_TYPE__IS_INTERNAL:
				setIsInternal((Boolean)newValue);
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
			case CorePackage.UNIQUENESS_CONSTRAINT_TYPE__PREFERRED_IDENTIFIER_FOR:
				setPreferredIdentifierFor((ObjectTypeRef)null);
				return;
			case CorePackage.UNIQUENESS_CONSTRAINT_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)null);
				return;
			case CorePackage.UNIQUENESS_CONSTRAINT_TYPE__IS_INTERNAL:
				unsetIsInternal();
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
			case CorePackage.UNIQUENESS_CONSTRAINT_TYPE__PREFERRED_IDENTIFIER_FOR:
				return preferredIdentifierFor != null;
			case CorePackage.UNIQUENESS_CONSTRAINT_TYPE__EXTENSIONS:
				return extensions != null;
			case CorePackage.UNIQUENESS_CONSTRAINT_TYPE__IS_INTERNAL:
				return isSetIsInternal();
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
		result.append(" (isInternal: ");
		if (isInternalESet) result.append(isInternal); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //UniquenessConstraintTypeImpl
