/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ExtensionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frequency Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FrequencyConstraintTypeImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FrequencyConstraintTypeImpl#getMaxFrequency <em>Max Frequency</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FrequencyConstraintTypeImpl#getMinFrequency <em>Min Frequency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrequencyConstraintTypeImpl extends SetConstraintWithJoinTypeImpl implements FrequencyConstraintType {
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
	 * The default value of the '{@link #getMaxFrequency() <em>Max Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_FREQUENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxFrequency() <em>Max Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxFrequency()
	 * @generated
	 * @ordered
	 */
	protected int maxFrequency = MAX_FREQUENCY_EDEFAULT;

	/**
	 * This is true if the Max Frequency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxFrequencyESet;

	/**
	 * The default value of the '{@link #getMinFrequency() <em>Min Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_FREQUENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinFrequency() <em>Min Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinFrequency()
	 * @generated
	 * @ordered
	 */
	protected int minFrequency = MIN_FREQUENCY_EDEFAULT;

	/**
	 * This is true if the Min Frequency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minFrequencyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrequencyConstraintTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getFrequencyConstraintType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FREQUENCY_CONSTRAINT_TYPE__EXTENSIONS, oldExtensions, newExtensions);
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
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FREQUENCY_CONSTRAINT_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FREQUENCY_CONSTRAINT_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FREQUENCY_CONSTRAINT_TYPE__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxFrequency() {
		return maxFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxFrequency(int newMaxFrequency) {
		int oldMaxFrequency = maxFrequency;
		maxFrequency = newMaxFrequency;
		boolean oldMaxFrequencyESet = maxFrequencyESet;
		maxFrequencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FREQUENCY_CONSTRAINT_TYPE__MAX_FREQUENCY, oldMaxFrequency, maxFrequency, !oldMaxFrequencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxFrequency() {
		int oldMaxFrequency = maxFrequency;
		boolean oldMaxFrequencyESet = maxFrequencyESet;
		maxFrequency = MAX_FREQUENCY_EDEFAULT;
		maxFrequencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.FREQUENCY_CONSTRAINT_TYPE__MAX_FREQUENCY, oldMaxFrequency, MAX_FREQUENCY_EDEFAULT, oldMaxFrequencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxFrequency() {
		return maxFrequencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinFrequency() {
		return minFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinFrequency(int newMinFrequency) {
		int oldMinFrequency = minFrequency;
		minFrequency = newMinFrequency;
		boolean oldMinFrequencyESet = minFrequencyESet;
		minFrequencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FREQUENCY_CONSTRAINT_TYPE__MIN_FREQUENCY, oldMinFrequency, minFrequency, !oldMinFrequencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinFrequency() {
		int oldMinFrequency = minFrequency;
		boolean oldMinFrequencyESet = minFrequencyESet;
		minFrequency = MIN_FREQUENCY_EDEFAULT;
		minFrequencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.FREQUENCY_CONSTRAINT_TYPE__MIN_FREQUENCY, oldMinFrequency, MIN_FREQUENCY_EDEFAULT, oldMinFrequencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinFrequency() {
		return minFrequencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FREQUENCY_CONSTRAINT_TYPE__EXTENSIONS:
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
			case CorePackage.FREQUENCY_CONSTRAINT_TYPE__EXTENSIONS:
				return getExtensions();
			case CorePackage.FREQUENCY_CONSTRAINT_TYPE__MAX_FREQUENCY:
				return getMaxFrequency();
			case CorePackage.FREQUENCY_CONSTRAINT_TYPE__MIN_FREQUENCY:
				return getMinFrequency();
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
			case CorePackage.FREQUENCY_CONSTRAINT_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
				return;
			case CorePackage.FREQUENCY_CONSTRAINT_TYPE__MAX_FREQUENCY:
				setMaxFrequency((Integer)newValue);
				return;
			case CorePackage.FREQUENCY_CONSTRAINT_TYPE__MIN_FREQUENCY:
				setMinFrequency((Integer)newValue);
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
			case CorePackage.FREQUENCY_CONSTRAINT_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)null);
				return;
			case CorePackage.FREQUENCY_CONSTRAINT_TYPE__MAX_FREQUENCY:
				unsetMaxFrequency();
				return;
			case CorePackage.FREQUENCY_CONSTRAINT_TYPE__MIN_FREQUENCY:
				unsetMinFrequency();
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
			case CorePackage.FREQUENCY_CONSTRAINT_TYPE__EXTENSIONS:
				return extensions != null;
			case CorePackage.FREQUENCY_CONSTRAINT_TYPE__MAX_FREQUENCY:
				return isSetMaxFrequency();
			case CorePackage.FREQUENCY_CONSTRAINT_TYPE__MIN_FREQUENCY:
				return isSetMinFrequency();
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
		result.append(" (maxFrequency: ");
		if (maxFrequencyESet) result.append(maxFrequency); else result.append("<unset>");
		result.append(", minFrequency: ");
		if (minFrequencyESet) result.append(minFrequency); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FrequencyConstraintTypeImpl
