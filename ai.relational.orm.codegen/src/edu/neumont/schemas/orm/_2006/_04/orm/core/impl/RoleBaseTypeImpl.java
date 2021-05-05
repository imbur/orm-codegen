/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DerivationSourceType1;
import edu.neumont.schemas.orm._2006._04.orm.core.MultiplicityValues;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeRef;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleBaseType;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleInstancesType1;
import edu.neumont.schemas.orm._2006._04.orm.core.RoleValueRestrictionType;
import edu.neumont.schemas.orm._2006._04.orm.core.UnaryRoleCardinalityRestrictionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleBaseTypeImpl#getRolePlayer <em>Role Player</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleBaseTypeImpl#getValueRestriction <em>Value Restriction</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleBaseTypeImpl#getCardinalityRestriction <em>Cardinality Restriction</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleBaseTypeImpl#getDerivationSource <em>Derivation Source</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleBaseTypeImpl#getRoleInstances <em>Role Instances</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleBaseTypeImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleBaseTypeImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleBaseTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RoleBaseTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RoleBaseTypeImpl extends MinimalEObjectImpl.Container implements RoleBaseType {
	/**
	 * The cached value of the '{@link #getRolePlayer() <em>Role Player</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRolePlayer()
	 * @generated
	 * @ordered
	 */
	protected ObjectTypeRef rolePlayer;

	/**
	 * The cached value of the '{@link #getValueRestriction() <em>Value Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRestriction()
	 * @generated
	 * @ordered
	 */
	protected RoleValueRestrictionType valueRestriction;

	/**
	 * The cached value of the '{@link #getCardinalityRestriction() <em>Cardinality Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityRestriction()
	 * @generated
	 * @ordered
	 */
	protected UnaryRoleCardinalityRestrictionType cardinalityRestriction;

	/**
	 * The cached value of the '{@link #getDerivationSource() <em>Derivation Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationSource()
	 * @generated
	 * @ordered
	 */
	protected DerivationSourceType1 derivationSource;

	/**
	 * The cached value of the '{@link #getRoleInstances() <em>Role Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleInstances()
	 * @generated
	 * @ordered
	 */
	protected RoleInstancesType1 roleInstances;

	/**
	 * The default value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatory = IS_MANDATORY_EDEFAULT;

	/**
	 * This is true if the Is Mandatory attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatoryESet;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final MultiplicityValues MULTIPLICITY_EDEFAULT = MultiplicityValues.ZERO_TO_ONE;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected MultiplicityValues multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * This is true if the Multiplicity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean multiplicityESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getRoleBaseType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeRef getRolePlayer() {
		return rolePlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRolePlayer(ObjectTypeRef newRolePlayer, NotificationChain msgs) {
		ObjectTypeRef oldRolePlayer = rolePlayer;
		rolePlayer = newRolePlayer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_BASE_TYPE__ROLE_PLAYER, oldRolePlayer, newRolePlayer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRolePlayer(ObjectTypeRef newRolePlayer) {
		if (newRolePlayer != rolePlayer) {
			NotificationChain msgs = null;
			if (rolePlayer != null)
				msgs = ((InternalEObject)rolePlayer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_BASE_TYPE__ROLE_PLAYER, null, msgs);
			if (newRolePlayer != null)
				msgs = ((InternalEObject)newRolePlayer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_BASE_TYPE__ROLE_PLAYER, null, msgs);
			msgs = basicSetRolePlayer(newRolePlayer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_BASE_TYPE__ROLE_PLAYER, newRolePlayer, newRolePlayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleValueRestrictionType getValueRestriction() {
		return valueRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueRestriction(RoleValueRestrictionType newValueRestriction, NotificationChain msgs) {
		RoleValueRestrictionType oldValueRestriction = valueRestriction;
		valueRestriction = newValueRestriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_BASE_TYPE__VALUE_RESTRICTION, oldValueRestriction, newValueRestriction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueRestriction(RoleValueRestrictionType newValueRestriction) {
		if (newValueRestriction != valueRestriction) {
			NotificationChain msgs = null;
			if (valueRestriction != null)
				msgs = ((InternalEObject)valueRestriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_BASE_TYPE__VALUE_RESTRICTION, null, msgs);
			if (newValueRestriction != null)
				msgs = ((InternalEObject)newValueRestriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_BASE_TYPE__VALUE_RESTRICTION, null, msgs);
			msgs = basicSetValueRestriction(newValueRestriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_BASE_TYPE__VALUE_RESTRICTION, newValueRestriction, newValueRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryRoleCardinalityRestrictionType getCardinalityRestriction() {
		return cardinalityRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinalityRestriction(UnaryRoleCardinalityRestrictionType newCardinalityRestriction, NotificationChain msgs) {
		UnaryRoleCardinalityRestrictionType oldCardinalityRestriction = cardinalityRestriction;
		cardinalityRestriction = newCardinalityRestriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_BASE_TYPE__CARDINALITY_RESTRICTION, oldCardinalityRestriction, newCardinalityRestriction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityRestriction(UnaryRoleCardinalityRestrictionType newCardinalityRestriction) {
		if (newCardinalityRestriction != cardinalityRestriction) {
			NotificationChain msgs = null;
			if (cardinalityRestriction != null)
				msgs = ((InternalEObject)cardinalityRestriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_BASE_TYPE__CARDINALITY_RESTRICTION, null, msgs);
			if (newCardinalityRestriction != null)
				msgs = ((InternalEObject)newCardinalityRestriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_BASE_TYPE__CARDINALITY_RESTRICTION, null, msgs);
			msgs = basicSetCardinalityRestriction(newCardinalityRestriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_BASE_TYPE__CARDINALITY_RESTRICTION, newCardinalityRestriction, newCardinalityRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationSourceType1 getDerivationSource() {
		return derivationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivationSource(DerivationSourceType1 newDerivationSource, NotificationChain msgs) {
		DerivationSourceType1 oldDerivationSource = derivationSource;
		derivationSource = newDerivationSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_BASE_TYPE__DERIVATION_SOURCE, oldDerivationSource, newDerivationSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationSource(DerivationSourceType1 newDerivationSource) {
		if (newDerivationSource != derivationSource) {
			NotificationChain msgs = null;
			if (derivationSource != null)
				msgs = ((InternalEObject)derivationSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_BASE_TYPE__DERIVATION_SOURCE, null, msgs);
			if (newDerivationSource != null)
				msgs = ((InternalEObject)newDerivationSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_BASE_TYPE__DERIVATION_SOURCE, null, msgs);
			msgs = basicSetDerivationSource(newDerivationSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_BASE_TYPE__DERIVATION_SOURCE, newDerivationSource, newDerivationSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleInstancesType1 getRoleInstances() {
		return roleInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleInstances(RoleInstancesType1 newRoleInstances, NotificationChain msgs) {
		RoleInstancesType1 oldRoleInstances = roleInstances;
		roleInstances = newRoleInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_BASE_TYPE__ROLE_INSTANCES, oldRoleInstances, newRoleInstances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleInstances(RoleInstancesType1 newRoleInstances) {
		if (newRoleInstances != roleInstances) {
			NotificationChain msgs = null;
			if (roleInstances != null)
				msgs = ((InternalEObject)roleInstances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_BASE_TYPE__ROLE_INSTANCES, null, msgs);
			if (newRoleInstances != null)
				msgs = ((InternalEObject)newRoleInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ROLE_BASE_TYPE__ROLE_INSTANCES, null, msgs);
			msgs = basicSetRoleInstances(newRoleInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_BASE_TYPE__ROLE_INSTANCES, newRoleInstances, newRoleInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMandatory() {
		return isMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMandatory(boolean newIsMandatory) {
		boolean oldIsMandatory = isMandatory;
		isMandatory = newIsMandatory;
		boolean oldIsMandatoryESet = isMandatoryESet;
		isMandatoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_BASE_TYPE__IS_MANDATORY, oldIsMandatory, isMandatory, !oldIsMandatoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsMandatory() {
		boolean oldIsMandatory = isMandatory;
		boolean oldIsMandatoryESet = isMandatoryESet;
		isMandatory = IS_MANDATORY_EDEFAULT;
		isMandatoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.ROLE_BASE_TYPE__IS_MANDATORY, oldIsMandatory, IS_MANDATORY_EDEFAULT, oldIsMandatoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsMandatory() {
		return isMandatoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityValues getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(MultiplicityValues newMultiplicity) {
		MultiplicityValues oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
		boolean oldMultiplicityESet = multiplicityESet;
		multiplicityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_BASE_TYPE__MULTIPLICITY, oldMultiplicity, multiplicity, !oldMultiplicityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMultiplicity() {
		MultiplicityValues oldMultiplicity = multiplicity;
		boolean oldMultiplicityESet = multiplicityESet;
		multiplicity = MULTIPLICITY_EDEFAULT;
		multiplicityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.ROLE_BASE_TYPE__MULTIPLICITY, oldMultiplicity, MULTIPLICITY_EDEFAULT, oldMultiplicityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMultiplicity() {
		return multiplicityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_BASE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ROLE_BASE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ROLE_BASE_TYPE__ROLE_PLAYER:
				return basicSetRolePlayer(null, msgs);
			case CorePackage.ROLE_BASE_TYPE__VALUE_RESTRICTION:
				return basicSetValueRestriction(null, msgs);
			case CorePackage.ROLE_BASE_TYPE__CARDINALITY_RESTRICTION:
				return basicSetCardinalityRestriction(null, msgs);
			case CorePackage.ROLE_BASE_TYPE__DERIVATION_SOURCE:
				return basicSetDerivationSource(null, msgs);
			case CorePackage.ROLE_BASE_TYPE__ROLE_INSTANCES:
				return basicSetRoleInstances(null, msgs);
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
			case CorePackage.ROLE_BASE_TYPE__ROLE_PLAYER:
				return getRolePlayer();
			case CorePackage.ROLE_BASE_TYPE__VALUE_RESTRICTION:
				return getValueRestriction();
			case CorePackage.ROLE_BASE_TYPE__CARDINALITY_RESTRICTION:
				return getCardinalityRestriction();
			case CorePackage.ROLE_BASE_TYPE__DERIVATION_SOURCE:
				return getDerivationSource();
			case CorePackage.ROLE_BASE_TYPE__ROLE_INSTANCES:
				return getRoleInstances();
			case CorePackage.ROLE_BASE_TYPE__IS_MANDATORY:
				return isIsMandatory();
			case CorePackage.ROLE_BASE_TYPE__MULTIPLICITY:
				return getMultiplicity();
			case CorePackage.ROLE_BASE_TYPE__ID:
				return getId();
			case CorePackage.ROLE_BASE_TYPE__NAME:
				return getName();
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
			case CorePackage.ROLE_BASE_TYPE__ROLE_PLAYER:
				setRolePlayer((ObjectTypeRef)newValue);
				return;
			case CorePackage.ROLE_BASE_TYPE__VALUE_RESTRICTION:
				setValueRestriction((RoleValueRestrictionType)newValue);
				return;
			case CorePackage.ROLE_BASE_TYPE__CARDINALITY_RESTRICTION:
				setCardinalityRestriction((UnaryRoleCardinalityRestrictionType)newValue);
				return;
			case CorePackage.ROLE_BASE_TYPE__DERIVATION_SOURCE:
				setDerivationSource((DerivationSourceType1)newValue);
				return;
			case CorePackage.ROLE_BASE_TYPE__ROLE_INSTANCES:
				setRoleInstances((RoleInstancesType1)newValue);
				return;
			case CorePackage.ROLE_BASE_TYPE__IS_MANDATORY:
				setIsMandatory((Boolean)newValue);
				return;
			case CorePackage.ROLE_BASE_TYPE__MULTIPLICITY:
				setMultiplicity((MultiplicityValues)newValue);
				return;
			case CorePackage.ROLE_BASE_TYPE__ID:
				setId((String)newValue);
				return;
			case CorePackage.ROLE_BASE_TYPE__NAME:
				setName((String)newValue);
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
			case CorePackage.ROLE_BASE_TYPE__ROLE_PLAYER:
				setRolePlayer((ObjectTypeRef)null);
				return;
			case CorePackage.ROLE_BASE_TYPE__VALUE_RESTRICTION:
				setValueRestriction((RoleValueRestrictionType)null);
				return;
			case CorePackage.ROLE_BASE_TYPE__CARDINALITY_RESTRICTION:
				setCardinalityRestriction((UnaryRoleCardinalityRestrictionType)null);
				return;
			case CorePackage.ROLE_BASE_TYPE__DERIVATION_SOURCE:
				setDerivationSource((DerivationSourceType1)null);
				return;
			case CorePackage.ROLE_BASE_TYPE__ROLE_INSTANCES:
				setRoleInstances((RoleInstancesType1)null);
				return;
			case CorePackage.ROLE_BASE_TYPE__IS_MANDATORY:
				unsetIsMandatory();
				return;
			case CorePackage.ROLE_BASE_TYPE__MULTIPLICITY:
				unsetMultiplicity();
				return;
			case CorePackage.ROLE_BASE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.ROLE_BASE_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case CorePackage.ROLE_BASE_TYPE__ROLE_PLAYER:
				return rolePlayer != null;
			case CorePackage.ROLE_BASE_TYPE__VALUE_RESTRICTION:
				return valueRestriction != null;
			case CorePackage.ROLE_BASE_TYPE__CARDINALITY_RESTRICTION:
				return cardinalityRestriction != null;
			case CorePackage.ROLE_BASE_TYPE__DERIVATION_SOURCE:
				return derivationSource != null;
			case CorePackage.ROLE_BASE_TYPE__ROLE_INSTANCES:
				return roleInstances != null;
			case CorePackage.ROLE_BASE_TYPE__IS_MANDATORY:
				return isSetIsMandatory();
			case CorePackage.ROLE_BASE_TYPE__MULTIPLICITY:
				return isSetMultiplicity();
			case CorePackage.ROLE_BASE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.ROLE_BASE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (isMandatory: ");
		if (isMandatoryESet) result.append(isMandatory); else result.append("<unset>");
		result.append(", multiplicity: ");
		if (multiplicityESet) result.append(multiplicity); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RoleBaseTypeImpl
