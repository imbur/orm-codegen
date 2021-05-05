/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.AliasesType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DefinitionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.NotesType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeCardinalityRestrictionType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.PlayedRolesType;
import edu.neumont.schemas.orm._2006._04.orm.core.SubtypeDerivationRuleType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectTypeTypeImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectTypeTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectTypeTypeImpl#getAbbreviations <em>Abbreviations</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectTypeTypeImpl#getCardinalityRestriction <em>Cardinality Restriction</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectTypeTypeImpl#getPlayedRoles <em>Played Roles</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectTypeTypeImpl#getSubtypeDerivationRule <em>Subtype Derivation Rule</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectTypeTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectTypeTypeImpl#isIsExternal <em>Is External</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectTypeTypeImpl#isIsIndependent <em>Is Independent</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectTypeTypeImpl#isIsPersonal <em>Is Personal</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ObjectTypeTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ObjectTypeTypeImpl extends MinimalEObjectImpl.Container implements ObjectTypeType {
	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected DefinitionsType definitions;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected NotesType notes;

	/**
	 * The cached value of the '{@link #getAbbreviations() <em>Abbreviations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviations()
	 * @generated
	 * @ordered
	 */
	protected AliasesType abbreviations;

	/**
	 * The cached value of the '{@link #getCardinalityRestriction() <em>Cardinality Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityRestriction()
	 * @generated
	 * @ordered
	 */
	protected ObjectTypeCardinalityRestrictionType cardinalityRestriction;

	/**
	 * The cached value of the '{@link #getPlayedRoles() <em>Played Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayedRoles()
	 * @generated
	 * @ordered
	 */
	protected PlayedRolesType playedRoles;

	/**
	 * The cached value of the '{@link #getSubtypeDerivationRule() <em>Subtype Derivation Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtypeDerivationRule()
	 * @generated
	 * @ordered
	 */
	protected SubtypeDerivationRuleType subtypeDerivationRule;

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
	 * The default value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsExternal() <em>Is External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean isExternal = IS_EXTERNAL_EDEFAULT;

	/**
	 * This is true if the Is External attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isExternalESet;

	/**
	 * The default value of the '{@link #isIsIndependent() <em>Is Independent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIndependent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INDEPENDENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsIndependent() <em>Is Independent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsIndependent()
	 * @generated
	 * @ordered
	 */
	protected boolean isIndependent = IS_INDEPENDENT_EDEFAULT;

	/**
	 * This is true if the Is Independent attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isIndependentESet;

	/**
	 * The default value of the '{@link #isIsPersonal() <em>Is Personal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPersonal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PERSONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPersonal() <em>Is Personal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPersonal()
	 * @generated
	 * @ordered
	 */
	protected boolean isPersonal = IS_PERSONAL_EDEFAULT;

	/**
	 * This is true if the Is Personal attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isPersonalESet;

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
	protected ObjectTypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getObjectTypeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefinitionsType getDefinitions() {
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefinitions(DefinitionsType newDefinitions, NotificationChain msgs) {
		DefinitionsType oldDefinitions = definitions;
		definitions = newDefinitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_TYPE__DEFINITIONS, oldDefinitions, newDefinitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitions(DefinitionsType newDefinitions) {
		if (newDefinitions != definitions) {
			NotificationChain msgs = null;
			if (definitions != null)
				msgs = ((InternalEObject)definitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_TYPE_TYPE__DEFINITIONS, null, msgs);
			if (newDefinitions != null)
				msgs = ((InternalEObject)newDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_TYPE_TYPE__DEFINITIONS, null, msgs);
			msgs = basicSetDefinitions(newDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_TYPE__DEFINITIONS, newDefinitions, newDefinitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotesType getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotes(NotesType newNotes, NotificationChain msgs) {
		NotesType oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_TYPE__NOTES, oldNotes, newNotes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(NotesType newNotes) {
		if (newNotes != notes) {
			NotificationChain msgs = null;
			if (notes != null)
				msgs = ((InternalEObject)notes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_TYPE_TYPE__NOTES, null, msgs);
			if (newNotes != null)
				msgs = ((InternalEObject)newNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_TYPE_TYPE__NOTES, null, msgs);
			msgs = basicSetNotes(newNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_TYPE__NOTES, newNotes, newNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasesType getAbbreviations() {
		return abbreviations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbbreviations(AliasesType newAbbreviations, NotificationChain msgs) {
		AliasesType oldAbbreviations = abbreviations;
		abbreviations = newAbbreviations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_TYPE__ABBREVIATIONS, oldAbbreviations, newAbbreviations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbbreviations(AliasesType newAbbreviations) {
		if (newAbbreviations != abbreviations) {
			NotificationChain msgs = null;
			if (abbreviations != null)
				msgs = ((InternalEObject)abbreviations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_TYPE_TYPE__ABBREVIATIONS, null, msgs);
			if (newAbbreviations != null)
				msgs = ((InternalEObject)newAbbreviations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_TYPE_TYPE__ABBREVIATIONS, null, msgs);
			msgs = basicSetAbbreviations(newAbbreviations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_TYPE__ABBREVIATIONS, newAbbreviations, newAbbreviations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeCardinalityRestrictionType getCardinalityRestriction() {
		return cardinalityRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinalityRestriction(ObjectTypeCardinalityRestrictionType newCardinalityRestriction, NotificationChain msgs) {
		ObjectTypeCardinalityRestrictionType oldCardinalityRestriction = cardinalityRestriction;
		cardinalityRestriction = newCardinalityRestriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_TYPE__CARDINALITY_RESTRICTION, oldCardinalityRestriction, newCardinalityRestriction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityRestriction(ObjectTypeCardinalityRestrictionType newCardinalityRestriction) {
		if (newCardinalityRestriction != cardinalityRestriction) {
			NotificationChain msgs = null;
			if (cardinalityRestriction != null)
				msgs = ((InternalEObject)cardinalityRestriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_TYPE_TYPE__CARDINALITY_RESTRICTION, null, msgs);
			if (newCardinalityRestriction != null)
				msgs = ((InternalEObject)newCardinalityRestriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_TYPE_TYPE__CARDINALITY_RESTRICTION, null, msgs);
			msgs = basicSetCardinalityRestriction(newCardinalityRestriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_TYPE__CARDINALITY_RESTRICTION, newCardinalityRestriction, newCardinalityRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayedRolesType getPlayedRoles() {
		return playedRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayedRoles(PlayedRolesType newPlayedRoles, NotificationChain msgs) {
		PlayedRolesType oldPlayedRoles = playedRoles;
		playedRoles = newPlayedRoles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_TYPE__PLAYED_ROLES, oldPlayedRoles, newPlayedRoles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayedRoles(PlayedRolesType newPlayedRoles) {
		if (newPlayedRoles != playedRoles) {
			NotificationChain msgs = null;
			if (playedRoles != null)
				msgs = ((InternalEObject)playedRoles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_TYPE_TYPE__PLAYED_ROLES, null, msgs);
			if (newPlayedRoles != null)
				msgs = ((InternalEObject)newPlayedRoles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_TYPE_TYPE__PLAYED_ROLES, null, msgs);
			msgs = basicSetPlayedRoles(newPlayedRoles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_TYPE__PLAYED_ROLES, newPlayedRoles, newPlayedRoles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtypeDerivationRuleType getSubtypeDerivationRule() {
		return subtypeDerivationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtypeDerivationRule(SubtypeDerivationRuleType newSubtypeDerivationRule, NotificationChain msgs) {
		SubtypeDerivationRuleType oldSubtypeDerivationRule = subtypeDerivationRule;
		subtypeDerivationRule = newSubtypeDerivationRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_TYPE__SUBTYPE_DERIVATION_RULE, oldSubtypeDerivationRule, newSubtypeDerivationRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtypeDerivationRule(SubtypeDerivationRuleType newSubtypeDerivationRule) {
		if (newSubtypeDerivationRule != subtypeDerivationRule) {
			NotificationChain msgs = null;
			if (subtypeDerivationRule != null)
				msgs = ((InternalEObject)subtypeDerivationRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_TYPE_TYPE__SUBTYPE_DERIVATION_RULE, null, msgs);
			if (newSubtypeDerivationRule != null)
				msgs = ((InternalEObject)newSubtypeDerivationRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OBJECT_TYPE_TYPE__SUBTYPE_DERIVATION_RULE, null, msgs);
			msgs = basicSetSubtypeDerivationRule(newSubtypeDerivationRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_TYPE__SUBTYPE_DERIVATION_RULE, newSubtypeDerivationRule, newSubtypeDerivationRule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsExternal() {
		return isExternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExternal(boolean newIsExternal) {
		boolean oldIsExternal = isExternal;
		isExternal = newIsExternal;
		boolean oldIsExternalESet = isExternalESet;
		isExternalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_TYPE__IS_EXTERNAL, oldIsExternal, isExternal, !oldIsExternalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsExternal() {
		boolean oldIsExternal = isExternal;
		boolean oldIsExternalESet = isExternalESet;
		isExternal = IS_EXTERNAL_EDEFAULT;
		isExternalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.OBJECT_TYPE_TYPE__IS_EXTERNAL, oldIsExternal, IS_EXTERNAL_EDEFAULT, oldIsExternalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsExternal() {
		return isExternalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsIndependent() {
		return isIndependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsIndependent(boolean newIsIndependent) {
		boolean oldIsIndependent = isIndependent;
		isIndependent = newIsIndependent;
		boolean oldIsIndependentESet = isIndependentESet;
		isIndependentESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_TYPE__IS_INDEPENDENT, oldIsIndependent, isIndependent, !oldIsIndependentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsIndependent() {
		boolean oldIsIndependent = isIndependent;
		boolean oldIsIndependentESet = isIndependentESet;
		isIndependent = IS_INDEPENDENT_EDEFAULT;
		isIndependentESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.OBJECT_TYPE_TYPE__IS_INDEPENDENT, oldIsIndependent, IS_INDEPENDENT_EDEFAULT, oldIsIndependentESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsIndependent() {
		return isIndependentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPersonal() {
		return isPersonal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPersonal(boolean newIsPersonal) {
		boolean oldIsPersonal = isPersonal;
		isPersonal = newIsPersonal;
		boolean oldIsPersonalESet = isPersonalESet;
		isPersonalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_TYPE__IS_PERSONAL, oldIsPersonal, isPersonal, !oldIsPersonalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsPersonal() {
		boolean oldIsPersonal = isPersonal;
		boolean oldIsPersonalESet = isPersonalESet;
		isPersonal = IS_PERSONAL_EDEFAULT;
		isPersonalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.OBJECT_TYPE_TYPE__IS_PERSONAL, oldIsPersonal, IS_PERSONAL_EDEFAULT, oldIsPersonalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsPersonal() {
		return isPersonalESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OBJECT_TYPE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.OBJECT_TYPE_TYPE__DEFINITIONS:
				return basicSetDefinitions(null, msgs);
			case CorePackage.OBJECT_TYPE_TYPE__NOTES:
				return basicSetNotes(null, msgs);
			case CorePackage.OBJECT_TYPE_TYPE__ABBREVIATIONS:
				return basicSetAbbreviations(null, msgs);
			case CorePackage.OBJECT_TYPE_TYPE__CARDINALITY_RESTRICTION:
				return basicSetCardinalityRestriction(null, msgs);
			case CorePackage.OBJECT_TYPE_TYPE__PLAYED_ROLES:
				return basicSetPlayedRoles(null, msgs);
			case CorePackage.OBJECT_TYPE_TYPE__SUBTYPE_DERIVATION_RULE:
				return basicSetSubtypeDerivationRule(null, msgs);
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
			case CorePackage.OBJECT_TYPE_TYPE__DEFINITIONS:
				return getDefinitions();
			case CorePackage.OBJECT_TYPE_TYPE__NOTES:
				return getNotes();
			case CorePackage.OBJECT_TYPE_TYPE__ABBREVIATIONS:
				return getAbbreviations();
			case CorePackage.OBJECT_TYPE_TYPE__CARDINALITY_RESTRICTION:
				return getCardinalityRestriction();
			case CorePackage.OBJECT_TYPE_TYPE__PLAYED_ROLES:
				return getPlayedRoles();
			case CorePackage.OBJECT_TYPE_TYPE__SUBTYPE_DERIVATION_RULE:
				return getSubtypeDerivationRule();
			case CorePackage.OBJECT_TYPE_TYPE__ID:
				return getId();
			case CorePackage.OBJECT_TYPE_TYPE__IS_EXTERNAL:
				return isIsExternal();
			case CorePackage.OBJECT_TYPE_TYPE__IS_INDEPENDENT:
				return isIsIndependent();
			case CorePackage.OBJECT_TYPE_TYPE__IS_PERSONAL:
				return isIsPersonal();
			case CorePackage.OBJECT_TYPE_TYPE__NAME:
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
			case CorePackage.OBJECT_TYPE_TYPE__DEFINITIONS:
				setDefinitions((DefinitionsType)newValue);
				return;
			case CorePackage.OBJECT_TYPE_TYPE__NOTES:
				setNotes((NotesType)newValue);
				return;
			case CorePackage.OBJECT_TYPE_TYPE__ABBREVIATIONS:
				setAbbreviations((AliasesType)newValue);
				return;
			case CorePackage.OBJECT_TYPE_TYPE__CARDINALITY_RESTRICTION:
				setCardinalityRestriction((ObjectTypeCardinalityRestrictionType)newValue);
				return;
			case CorePackage.OBJECT_TYPE_TYPE__PLAYED_ROLES:
				setPlayedRoles((PlayedRolesType)newValue);
				return;
			case CorePackage.OBJECT_TYPE_TYPE__SUBTYPE_DERIVATION_RULE:
				setSubtypeDerivationRule((SubtypeDerivationRuleType)newValue);
				return;
			case CorePackage.OBJECT_TYPE_TYPE__ID:
				setId((String)newValue);
				return;
			case CorePackage.OBJECT_TYPE_TYPE__IS_EXTERNAL:
				setIsExternal((Boolean)newValue);
				return;
			case CorePackage.OBJECT_TYPE_TYPE__IS_INDEPENDENT:
				setIsIndependent((Boolean)newValue);
				return;
			case CorePackage.OBJECT_TYPE_TYPE__IS_PERSONAL:
				setIsPersonal((Boolean)newValue);
				return;
			case CorePackage.OBJECT_TYPE_TYPE__NAME:
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
			case CorePackage.OBJECT_TYPE_TYPE__DEFINITIONS:
				setDefinitions((DefinitionsType)null);
				return;
			case CorePackage.OBJECT_TYPE_TYPE__NOTES:
				setNotes((NotesType)null);
				return;
			case CorePackage.OBJECT_TYPE_TYPE__ABBREVIATIONS:
				setAbbreviations((AliasesType)null);
				return;
			case CorePackage.OBJECT_TYPE_TYPE__CARDINALITY_RESTRICTION:
				setCardinalityRestriction((ObjectTypeCardinalityRestrictionType)null);
				return;
			case CorePackage.OBJECT_TYPE_TYPE__PLAYED_ROLES:
				setPlayedRoles((PlayedRolesType)null);
				return;
			case CorePackage.OBJECT_TYPE_TYPE__SUBTYPE_DERIVATION_RULE:
				setSubtypeDerivationRule((SubtypeDerivationRuleType)null);
				return;
			case CorePackage.OBJECT_TYPE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.OBJECT_TYPE_TYPE__IS_EXTERNAL:
				unsetIsExternal();
				return;
			case CorePackage.OBJECT_TYPE_TYPE__IS_INDEPENDENT:
				unsetIsIndependent();
				return;
			case CorePackage.OBJECT_TYPE_TYPE__IS_PERSONAL:
				unsetIsPersonal();
				return;
			case CorePackage.OBJECT_TYPE_TYPE__NAME:
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
			case CorePackage.OBJECT_TYPE_TYPE__DEFINITIONS:
				return definitions != null;
			case CorePackage.OBJECT_TYPE_TYPE__NOTES:
				return notes != null;
			case CorePackage.OBJECT_TYPE_TYPE__ABBREVIATIONS:
				return abbreviations != null;
			case CorePackage.OBJECT_TYPE_TYPE__CARDINALITY_RESTRICTION:
				return cardinalityRestriction != null;
			case CorePackage.OBJECT_TYPE_TYPE__PLAYED_ROLES:
				return playedRoles != null;
			case CorePackage.OBJECT_TYPE_TYPE__SUBTYPE_DERIVATION_RULE:
				return subtypeDerivationRule != null;
			case CorePackage.OBJECT_TYPE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.OBJECT_TYPE_TYPE__IS_EXTERNAL:
				return isSetIsExternal();
			case CorePackage.OBJECT_TYPE_TYPE__IS_INDEPENDENT:
				return isSetIsIndependent();
			case CorePackage.OBJECT_TYPE_TYPE__IS_PERSONAL:
				return isSetIsPersonal();
			case CorePackage.OBJECT_TYPE_TYPE__NAME:
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
		result.append(" (id: ");
		result.append(id);
		result.append(", isExternal: ");
		if (isExternalESet) result.append(isExternal); else result.append("<unset>");
		result.append(", isIndependent: ");
		if (isIndependentESet) result.append(isIndependent); else result.append("<unset>");
		result.append(", isPersonal: ");
		if (isPersonalESet) result.append(isPersonal); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ObjectTypeTypeImpl
