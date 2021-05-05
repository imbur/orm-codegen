/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeInstancesType;
import edu.neumont.schemas.orm._2006._04.orm.core.ExtensionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedFactTypeRef;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectifiedTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.UniquenessConstraintRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objectified Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectifiedTypeTypeImpl#getPreferredIdentifier <em>Preferred Identifier</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectifiedTypeTypeImpl#getNestedPredicate <em>Nested Predicate</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectifiedTypeTypeImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectifiedTypeTypeImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectifiedTypeTypeImpl#getReferenceMode <em>Reference Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectifiedTypeTypeImpl extends ObjectTypeTypeImpl implements ObjectifiedTypeType {
	/**
	 * The cached value of the '{@link #getPreferredIdentifier() <em>Preferred Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredIdentifier()
	 * @generated
	 * @ordered
	 */
	protected UniquenessConstraintRef preferredIdentifier;

	/**
	 * The cached value of the '{@link #getNestedPredicate() <em>Nested Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedPredicate()
	 * @generated
	 * @ordered
	 */
	protected ObjectifiedFactTypeRef nestedPredicate;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EntityTypeInstancesType instances;

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
	 * The default value of the '{@link #getReferenceMode() <em>Reference Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceMode()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceMode() <em>Reference Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceMode()
	 * @generated
	 * @ordered
	 */
	protected String referenceMode = REFERENCE_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectifiedTypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getObjectifiedTypeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniquenessConstraintRef getPreferredIdentifier() {
		return preferredIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreferredIdentifier(UniquenessConstraintRef newPreferredIdentifier, NotificationChain msgs) {
		UniquenessConstraintRef oldPreferredIdentifier = preferredIdentifier;
		preferredIdentifier = newPreferredIdentifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OBJECTIFIED_TYPE_TYPE__PREFERRED_IDENTIFIER, oldPreferredIdentifier, newPreferredIdentifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreferredIdentifier(UniquenessConstraintRef newPreferredIdentifier) {
		if (newPreferredIdentifier != preferredIdentifier) {
			NotificationChain msgs = null;
			if (preferredIdentifier != null)
				msgs = ((InternalEObject)preferredIdentifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECTIFIED_TYPE_TYPE__PREFERRED_IDENTIFIER, null, msgs);
			if (newPreferredIdentifier != null)
				msgs = ((InternalEObject)newPreferredIdentifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECTIFIED_TYPE_TYPE__PREFERRED_IDENTIFIER, null, msgs);
			msgs = basicSetPreferredIdentifier(newPreferredIdentifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECTIFIED_TYPE_TYPE__PREFERRED_IDENTIFIER, newPreferredIdentifier, newPreferredIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectifiedFactTypeRef getNestedPredicate() {
		return nestedPredicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestedPredicate(ObjectifiedFactTypeRef newNestedPredicate, NotificationChain msgs) {
		ObjectifiedFactTypeRef oldNestedPredicate = nestedPredicate;
		nestedPredicate = newNestedPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OBJECTIFIED_TYPE_TYPE__NESTED_PREDICATE, oldNestedPredicate, newNestedPredicate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestedPredicate(ObjectifiedFactTypeRef newNestedPredicate) {
		if (newNestedPredicate != nestedPredicate) {
			NotificationChain msgs = null;
			if (nestedPredicate != null)
				msgs = ((InternalEObject)nestedPredicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECTIFIED_TYPE_TYPE__NESTED_PREDICATE, null, msgs);
			if (newNestedPredicate != null)
				msgs = ((InternalEObject)newNestedPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECTIFIED_TYPE_TYPE__NESTED_PREDICATE, null, msgs);
			msgs = basicSetNestedPredicate(newNestedPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECTIFIED_TYPE_TYPE__NESTED_PREDICATE, newNestedPredicate, newNestedPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityTypeInstancesType getInstances() {
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstances(EntityTypeInstancesType newInstances, NotificationChain msgs) {
		EntityTypeInstancesType oldInstances = instances;
		instances = newInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OBJECTIFIED_TYPE_TYPE__INSTANCES, oldInstances, newInstances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstances(EntityTypeInstancesType newInstances) {
		if (newInstances != instances) {
			NotificationChain msgs = null;
			if (instances != null)
				msgs = ((InternalEObject)instances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECTIFIED_TYPE_TYPE__INSTANCES, null, msgs);
			if (newInstances != null)
				msgs = ((InternalEObject)newInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECTIFIED_TYPE_TYPE__INSTANCES, null, msgs);
			msgs = basicSetInstances(newInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECTIFIED_TYPE_TYPE__INSTANCES, newInstances, newInstances));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OBJECTIFIED_TYPE_TYPE__EXTENSIONS, oldExtensions, newExtensions);
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
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECTIFIED_TYPE_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECTIFIED_TYPE_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECTIFIED_TYPE_TYPE__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceMode() {
		return referenceMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceMode(String newReferenceMode) {
		String oldReferenceMode = referenceMode;
		referenceMode = newReferenceMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECTIFIED_TYPE_TYPE__REFERENCE_MODE, oldReferenceMode, referenceMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.OBJECTIFIED_TYPE_TYPE__PREFERRED_IDENTIFIER:
				return basicSetPreferredIdentifier(null, msgs);
			case CorePackage.OBJECTIFIED_TYPE_TYPE__NESTED_PREDICATE:
				return basicSetNestedPredicate(null, msgs);
			case CorePackage.OBJECTIFIED_TYPE_TYPE__INSTANCES:
				return basicSetInstances(null, msgs);
			case CorePackage.OBJECTIFIED_TYPE_TYPE__EXTENSIONS:
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
			case CorePackage.OBJECTIFIED_TYPE_TYPE__PREFERRED_IDENTIFIER:
				return getPreferredIdentifier();
			case CorePackage.OBJECTIFIED_TYPE_TYPE__NESTED_PREDICATE:
				return getNestedPredicate();
			case CorePackage.OBJECTIFIED_TYPE_TYPE__INSTANCES:
				return getInstances();
			case CorePackage.OBJECTIFIED_TYPE_TYPE__EXTENSIONS:
				return getExtensions();
			case CorePackage.OBJECTIFIED_TYPE_TYPE__REFERENCE_MODE:
				return getReferenceMode();
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
			case CorePackage.OBJECTIFIED_TYPE_TYPE__PREFERRED_IDENTIFIER:
				setPreferredIdentifier((UniquenessConstraintRef)newValue);
				return;
			case CorePackage.OBJECTIFIED_TYPE_TYPE__NESTED_PREDICATE:
				setNestedPredicate((ObjectifiedFactTypeRef)newValue);
				return;
			case CorePackage.OBJECTIFIED_TYPE_TYPE__INSTANCES:
				setInstances((EntityTypeInstancesType)newValue);
				return;
			case CorePackage.OBJECTIFIED_TYPE_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
				return;
			case CorePackage.OBJECTIFIED_TYPE_TYPE__REFERENCE_MODE:
				setReferenceMode((String)newValue);
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
			case CorePackage.OBJECTIFIED_TYPE_TYPE__PREFERRED_IDENTIFIER:
				setPreferredIdentifier((UniquenessConstraintRef)null);
				return;
			case CorePackage.OBJECTIFIED_TYPE_TYPE__NESTED_PREDICATE:
				setNestedPredicate((ObjectifiedFactTypeRef)null);
				return;
			case CorePackage.OBJECTIFIED_TYPE_TYPE__INSTANCES:
				setInstances((EntityTypeInstancesType)null);
				return;
			case CorePackage.OBJECTIFIED_TYPE_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)null);
				return;
			case CorePackage.OBJECTIFIED_TYPE_TYPE__REFERENCE_MODE:
				setReferenceMode(REFERENCE_MODE_EDEFAULT);
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
			case CorePackage.OBJECTIFIED_TYPE_TYPE__PREFERRED_IDENTIFIER:
				return preferredIdentifier != null;
			case CorePackage.OBJECTIFIED_TYPE_TYPE__NESTED_PREDICATE:
				return nestedPredicate != null;
			case CorePackage.OBJECTIFIED_TYPE_TYPE__INSTANCES:
				return instances != null;
			case CorePackage.OBJECTIFIED_TYPE_TYPE__EXTENSIONS:
				return extensions != null;
			case CorePackage.OBJECTIFIED_TYPE_TYPE__REFERENCE_MODE:
				return REFERENCE_MODE_EDEFAULT == null ? referenceMode != null : !REFERENCE_MODE_EDEFAULT.equals(referenceMode);
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
		result.append(" (referenceMode: ");
		result.append(referenceMode);
		result.append(')');
		return result.toString();
	}

} //ObjectifiedTypeTypeImpl
