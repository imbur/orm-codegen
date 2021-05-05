/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CardinalityConstraintType;
import edu.neumont.schemas.orm._2006._04.orm.core.CardinalityRangesType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ExtensionsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CardinalityConstraintTypeImpl#getRanges <em>Ranges</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.CardinalityConstraintTypeImpl#getExtensions <em>Extensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardinalityConstraintTypeImpl extends ConstraintTypeImpl implements CardinalityConstraintType {
	/**
	 * The cached value of the '{@link #getRanges() <em>Ranges</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRanges()
	 * @generated
	 * @ordered
	 */
	protected CardinalityRangesType ranges;

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
	protected CardinalityConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getCardinalityConstraintType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityRangesType getRanges() {
		return ranges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRanges(CardinalityRangesType newRanges, NotificationChain msgs) {
		CardinalityRangesType oldRanges = ranges;
		ranges = newRanges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CARDINALITY_CONSTRAINT_TYPE__RANGES, oldRanges, newRanges);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRanges(CardinalityRangesType newRanges) {
		if (newRanges != ranges) {
			NotificationChain msgs = null;
			if (ranges != null)
				msgs = ((InternalEObject)ranges).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CARDINALITY_CONSTRAINT_TYPE__RANGES, null, msgs);
			if (newRanges != null)
				msgs = ((InternalEObject)newRanges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CARDINALITY_CONSTRAINT_TYPE__RANGES, null, msgs);
			msgs = basicSetRanges(newRanges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CARDINALITY_CONSTRAINT_TYPE__RANGES, newRanges, newRanges));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CARDINALITY_CONSTRAINT_TYPE__EXTENSIONS, oldExtensions, newExtensions);
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
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CARDINALITY_CONSTRAINT_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CARDINALITY_CONSTRAINT_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CARDINALITY_CONSTRAINT_TYPE__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CARDINALITY_CONSTRAINT_TYPE__RANGES:
				return basicSetRanges(null, msgs);
			case CorePackage.CARDINALITY_CONSTRAINT_TYPE__EXTENSIONS:
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
			case CorePackage.CARDINALITY_CONSTRAINT_TYPE__RANGES:
				return getRanges();
			case CorePackage.CARDINALITY_CONSTRAINT_TYPE__EXTENSIONS:
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
			case CorePackage.CARDINALITY_CONSTRAINT_TYPE__RANGES:
				setRanges((CardinalityRangesType)newValue);
				return;
			case CorePackage.CARDINALITY_CONSTRAINT_TYPE__EXTENSIONS:
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
			case CorePackage.CARDINALITY_CONSTRAINT_TYPE__RANGES:
				setRanges((CardinalityRangesType)null);
				return;
			case CorePackage.CARDINALITY_CONSTRAINT_TYPE__EXTENSIONS:
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
			case CorePackage.CARDINALITY_CONSTRAINT_TYPE__RANGES:
				return ranges != null;
			case CorePackage.CARDINALITY_CONSTRAINT_TYPE__EXTENSIONS:
				return extensions != null;
		}
		return super.eIsSet(featureID);
	}

} //CardinalityConstraintTypeImpl
