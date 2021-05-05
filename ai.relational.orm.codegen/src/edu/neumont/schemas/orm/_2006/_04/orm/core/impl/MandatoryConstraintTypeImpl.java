/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ExclusionConstraintRef;
import edu.neumont.schemas.orm._2006._04.orm.core.ExtensionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mandatory Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.MandatoryConstraintTypeImpl#getExclusiveOrExclusionConstraint <em>Exclusive Or Exclusion Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.MandatoryConstraintTypeImpl#getImpliedByObjectType <em>Implied By Object Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.MandatoryConstraintTypeImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.MandatoryConstraintTypeImpl#isIsImplied <em>Is Implied</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.MandatoryConstraintTypeImpl#isIsSimple <em>Is Simple</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MandatoryConstraintTypeImpl extends SetConstraintTypeImpl implements MandatoryConstraintType {
	/**
	 * The cached value of the '{@link #getExclusiveOrExclusionConstraint() <em>Exclusive Or Exclusion Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveOrExclusionConstraint()
	 * @generated
	 * @ordered
	 */
	protected ExclusionConstraintRef exclusiveOrExclusionConstraint;

	/**
	 * The cached value of the '{@link #getImpliedByObjectType() <em>Implied By Object Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpliedByObjectType()
	 * @generated
	 * @ordered
	 */
	protected ObjectTypeRef impliedByObjectType;

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
	 * The default value of the '{@link #isIsImplied() <em>Is Implied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsImplied()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IMPLIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsImplied() <em>Is Implied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsImplied()
	 * @generated
	 * @ordered
	 */
	protected boolean isImplied = IS_IMPLIED_EDEFAULT;

	/**
	 * This is true if the Is Implied attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isImpliedESet;

	/**
	 * The default value of the '{@link #isIsSimple() <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSimple()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SIMPLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsSimple() <em>Is Simple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsSimple()
	 * @generated
	 * @ordered
	 */
	protected boolean isSimple = IS_SIMPLE_EDEFAULT;

	/**
	 * This is true if the Is Simple attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isSimpleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MandatoryConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getMandatoryConstraintType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusionConstraintRef getExclusiveOrExclusionConstraint() {
		return exclusiveOrExclusionConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExclusiveOrExclusionConstraint(ExclusionConstraintRef newExclusiveOrExclusionConstraint, NotificationChain msgs) {
		ExclusionConstraintRef oldExclusiveOrExclusionConstraint = exclusiveOrExclusionConstraint;
		exclusiveOrExclusionConstraint = newExclusiveOrExclusionConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.MANDATORY_CONSTRAINT_TYPE__EXCLUSIVE_OR_EXCLUSION_CONSTRAINT, oldExclusiveOrExclusionConstraint, newExclusiveOrExclusionConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusiveOrExclusionConstraint(ExclusionConstraintRef newExclusiveOrExclusionConstraint) {
		if (newExclusiveOrExclusionConstraint != exclusiveOrExclusionConstraint) {
			NotificationChain msgs = null;
			if (exclusiveOrExclusionConstraint != null)
				msgs = ((InternalEObject)exclusiveOrExclusionConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.MANDATORY_CONSTRAINT_TYPE__EXCLUSIVE_OR_EXCLUSION_CONSTRAINT, null, msgs);
			if (newExclusiveOrExclusionConstraint != null)
				msgs = ((InternalEObject)newExclusiveOrExclusionConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.MANDATORY_CONSTRAINT_TYPE__EXCLUSIVE_OR_EXCLUSION_CONSTRAINT, null, msgs);
			msgs = basicSetExclusiveOrExclusionConstraint(newExclusiveOrExclusionConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MANDATORY_CONSTRAINT_TYPE__EXCLUSIVE_OR_EXCLUSION_CONSTRAINT, newExclusiveOrExclusionConstraint, newExclusiveOrExclusionConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeRef getImpliedByObjectType() {
		return impliedByObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImpliedByObjectType(ObjectTypeRef newImpliedByObjectType, NotificationChain msgs) {
		ObjectTypeRef oldImpliedByObjectType = impliedByObjectType;
		impliedByObjectType = newImpliedByObjectType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.MANDATORY_CONSTRAINT_TYPE__IMPLIED_BY_OBJECT_TYPE, oldImpliedByObjectType, newImpliedByObjectType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpliedByObjectType(ObjectTypeRef newImpliedByObjectType) {
		if (newImpliedByObjectType != impliedByObjectType) {
			NotificationChain msgs = null;
			if (impliedByObjectType != null)
				msgs = ((InternalEObject)impliedByObjectType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.MANDATORY_CONSTRAINT_TYPE__IMPLIED_BY_OBJECT_TYPE, null, msgs);
			if (newImpliedByObjectType != null)
				msgs = ((InternalEObject)newImpliedByObjectType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.MANDATORY_CONSTRAINT_TYPE__IMPLIED_BY_OBJECT_TYPE, null, msgs);
			msgs = basicSetImpliedByObjectType(newImpliedByObjectType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MANDATORY_CONSTRAINT_TYPE__IMPLIED_BY_OBJECT_TYPE, newImpliedByObjectType, newImpliedByObjectType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.MANDATORY_CONSTRAINT_TYPE__EXTENSIONS, oldExtensions, newExtensions);
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
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.MANDATORY_CONSTRAINT_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.MANDATORY_CONSTRAINT_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MANDATORY_CONSTRAINT_TYPE__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsImplied() {
		return isImplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsImplied(boolean newIsImplied) {
		boolean oldIsImplied = isImplied;
		isImplied = newIsImplied;
		boolean oldIsImpliedESet = isImpliedESet;
		isImpliedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MANDATORY_CONSTRAINT_TYPE__IS_IMPLIED, oldIsImplied, isImplied, !oldIsImpliedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsImplied() {
		boolean oldIsImplied = isImplied;
		boolean oldIsImpliedESet = isImpliedESet;
		isImplied = IS_IMPLIED_EDEFAULT;
		isImpliedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.MANDATORY_CONSTRAINT_TYPE__IS_IMPLIED, oldIsImplied, IS_IMPLIED_EDEFAULT, oldIsImpliedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsImplied() {
		return isImpliedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsSimple() {
		return isSimple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSimple(boolean newIsSimple) {
		boolean oldIsSimple = isSimple;
		isSimple = newIsSimple;
		boolean oldIsSimpleESet = isSimpleESet;
		isSimpleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MANDATORY_CONSTRAINT_TYPE__IS_SIMPLE, oldIsSimple, isSimple, !oldIsSimpleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsSimple() {
		boolean oldIsSimple = isSimple;
		boolean oldIsSimpleESet = isSimpleESet;
		isSimple = IS_SIMPLE_EDEFAULT;
		isSimpleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.MANDATORY_CONSTRAINT_TYPE__IS_SIMPLE, oldIsSimple, IS_SIMPLE_EDEFAULT, oldIsSimpleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsSimple() {
		return isSimpleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__EXCLUSIVE_OR_EXCLUSION_CONSTRAINT:
				return basicSetExclusiveOrExclusionConstraint(null, msgs);
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__IMPLIED_BY_OBJECT_TYPE:
				return basicSetImpliedByObjectType(null, msgs);
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__EXTENSIONS:
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
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__EXCLUSIVE_OR_EXCLUSION_CONSTRAINT:
				return getExclusiveOrExclusionConstraint();
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__IMPLIED_BY_OBJECT_TYPE:
				return getImpliedByObjectType();
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__EXTENSIONS:
				return getExtensions();
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__IS_IMPLIED:
				return isIsImplied();
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__IS_SIMPLE:
				return isIsSimple();
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
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__EXCLUSIVE_OR_EXCLUSION_CONSTRAINT:
				setExclusiveOrExclusionConstraint((ExclusionConstraintRef)newValue);
				return;
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__IMPLIED_BY_OBJECT_TYPE:
				setImpliedByObjectType((ObjectTypeRef)newValue);
				return;
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
				return;
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__IS_IMPLIED:
				setIsImplied((Boolean)newValue);
				return;
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__IS_SIMPLE:
				setIsSimple((Boolean)newValue);
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
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__EXCLUSIVE_OR_EXCLUSION_CONSTRAINT:
				setExclusiveOrExclusionConstraint((ExclusionConstraintRef)null);
				return;
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__IMPLIED_BY_OBJECT_TYPE:
				setImpliedByObjectType((ObjectTypeRef)null);
				return;
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)null);
				return;
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__IS_IMPLIED:
				unsetIsImplied();
				return;
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__IS_SIMPLE:
				unsetIsSimple();
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
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__EXCLUSIVE_OR_EXCLUSION_CONSTRAINT:
				return exclusiveOrExclusionConstraint != null;
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__IMPLIED_BY_OBJECT_TYPE:
				return impliedByObjectType != null;
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__EXTENSIONS:
				return extensions != null;
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__IS_IMPLIED:
				return isSetIsImplied();
			case CorePackage.MANDATORY_CONSTRAINT_TYPE__IS_SIMPLE:
				return isSetIsSimple();
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
		result.append(" (isImplied: ");
		if (isImpliedESet) result.append(isImplied); else result.append("<unset>");
		result.append(", isSimple: ");
		if (isSimpleESet) result.append(isSimple); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MandatoryConstraintTypeImpl
