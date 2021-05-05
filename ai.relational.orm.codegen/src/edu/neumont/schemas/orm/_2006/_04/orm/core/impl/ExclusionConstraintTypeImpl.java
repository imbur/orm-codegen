/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ExclusionConstraintType;
import edu.neumont.schemas.orm._2006._04.orm.core.ExtensionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exclusion Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ExclusionConstraintTypeImpl#getExclusiveOrMandatoryConstraint <em>Exclusive Or Mandatory Constraint</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ExclusionConstraintTypeImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExclusionConstraintTypeImpl extends SetComparisonConstraintTypeImpl implements ExclusionConstraintType {
	/**
	 * The cached value of the '{@link #getExclusiveOrMandatoryConstraint() <em>Exclusive Or Mandatory Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveOrMandatoryConstraint()
	 * @generated
	 * @ordered
	 */
	protected MandatoryConstraintRef exclusiveOrMandatoryConstraint;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExclusionConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getExclusionConstraintType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryConstraintRef getExclusiveOrMandatoryConstraint() {
		return exclusiveOrMandatoryConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExclusiveOrMandatoryConstraint(MandatoryConstraintRef newExclusiveOrMandatoryConstraint, NotificationChain msgs) {
		MandatoryConstraintRef oldExclusiveOrMandatoryConstraint = exclusiveOrMandatoryConstraint;
		exclusiveOrMandatoryConstraint = newExclusiveOrMandatoryConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.EXCLUSION_CONSTRAINT_TYPE__EXCLUSIVE_OR_MANDATORY_CONSTRAINT, oldExclusiveOrMandatoryConstraint, newExclusiveOrMandatoryConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusiveOrMandatoryConstraint(MandatoryConstraintRef newExclusiveOrMandatoryConstraint) {
		if (newExclusiveOrMandatoryConstraint != exclusiveOrMandatoryConstraint) {
			NotificationChain msgs = null;
			if (exclusiveOrMandatoryConstraint != null)
				msgs = ((InternalEObject)exclusiveOrMandatoryConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.EXCLUSION_CONSTRAINT_TYPE__EXCLUSIVE_OR_MANDATORY_CONSTRAINT, null, msgs);
			if (newExclusiveOrMandatoryConstraint != null)
				msgs = ((InternalEObject)newExclusiveOrMandatoryConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.EXCLUSION_CONSTRAINT_TYPE__EXCLUSIVE_OR_MANDATORY_CONSTRAINT, null, msgs);
			msgs = basicSetExclusiveOrMandatoryConstraint(newExclusiveOrMandatoryConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXCLUSION_CONSTRAINT_TYPE__EXCLUSIVE_OR_MANDATORY_CONSTRAINT, newExclusiveOrMandatoryConstraint, newExclusiveOrMandatoryConstraint));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.EXCLUSION_CONSTRAINT_TYPE__EXTENSIONS, oldExtensions, newExtensions);
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
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.EXCLUSION_CONSTRAINT_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.EXCLUSION_CONSTRAINT_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXCLUSION_CONSTRAINT_TYPE__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.EXCLUSION_CONSTRAINT_TYPE__EXCLUSIVE_OR_MANDATORY_CONSTRAINT:
				return basicSetExclusiveOrMandatoryConstraint(null, msgs);
			case CorePackage.EXCLUSION_CONSTRAINT_TYPE__EXTENSIONS:
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
			case CorePackage.EXCLUSION_CONSTRAINT_TYPE__EXCLUSIVE_OR_MANDATORY_CONSTRAINT:
				return getExclusiveOrMandatoryConstraint();
			case CorePackage.EXCLUSION_CONSTRAINT_TYPE__EXTENSIONS:
				return getExtensions();
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
			case CorePackage.EXCLUSION_CONSTRAINT_TYPE__EXCLUSIVE_OR_MANDATORY_CONSTRAINT:
				setExclusiveOrMandatoryConstraint((MandatoryConstraintRef)newValue);
				return;
			case CorePackage.EXCLUSION_CONSTRAINT_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
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
			case CorePackage.EXCLUSION_CONSTRAINT_TYPE__EXCLUSIVE_OR_MANDATORY_CONSTRAINT:
				setExclusiveOrMandatoryConstraint((MandatoryConstraintRef)null);
				return;
			case CorePackage.EXCLUSION_CONSTRAINT_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)null);
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
			case CorePackage.EXCLUSION_CONSTRAINT_TYPE__EXCLUSIVE_OR_MANDATORY_CONSTRAINT:
				return exclusiveOrMandatoryConstraint != null;
			case CorePackage.EXCLUSION_CONSTRAINT_TYPE__EXTENSIONS:
				return extensions != null;
		}
		return super.eIsSet(featureID);
	}

} //ExclusionConstraintTypeImpl
