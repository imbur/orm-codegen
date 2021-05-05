/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DefinitionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.ExtensionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.FactRolesType;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationRuleType;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeInstancesType;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.InternalConstraintsType;
import edu.neumont.schemas.orm._2006._04.orm.core.NotesType;
import edu.neumont.schemas.orm._2006._04.orm.core.ReadingOrdersType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fact Type Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeTypeImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeTypeImpl#getFactRoles <em>Fact Roles</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeTypeImpl#getReadingOrders <em>Reading Orders</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeTypeImpl#getInternalConstraints <em>Internal Constraints</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeTypeImpl#getDerivationRule <em>Derivation Rule</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeTypeImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeTypeImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.FactTypeTypeImpl#isIsExternal <em>Is External</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactTypeTypeImpl extends MinimalEObjectImpl.Container implements FactTypeType {
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
	 * The cached value of the '{@link #getFactRoles() <em>Fact Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactRoles()
	 * @generated
	 * @ordered
	 */
	protected FactRolesType factRoles;

	/**
	 * The cached value of the '{@link #getReadingOrders() <em>Reading Orders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadingOrders()
	 * @generated
	 * @ordered
	 */
	protected ReadingOrdersType readingOrders;

	/**
	 * The cached value of the '{@link #getInternalConstraints() <em>Internal Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalConstraints()
	 * @generated
	 * @ordered
	 */
	protected InternalConstraintsType internalConstraints;

	/**
	 * The cached value of the '{@link #getDerivationRule() <em>Derivation Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationRule()
	 * @generated
	 * @ordered
	 */
	protected FactTypeDerivationRuleType derivationRule;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected FactTypeInstancesType instances;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactTypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getFactTypeType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__DEFINITIONS, oldDefinitions, newDefinitions);
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
				msgs = ((InternalEObject)definitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_TYPE__DEFINITIONS, null, msgs);
			if (newDefinitions != null)
				msgs = ((InternalEObject)newDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_TYPE__DEFINITIONS, null, msgs);
			msgs = basicSetDefinitions(newDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__DEFINITIONS, newDefinitions, newDefinitions));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__NOTES, oldNotes, newNotes);
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
				msgs = ((InternalEObject)notes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_TYPE__NOTES, null, msgs);
			if (newNotes != null)
				msgs = ((InternalEObject)newNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_TYPE__NOTES, null, msgs);
			msgs = basicSetNotes(newNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__NOTES, newNotes, newNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactRolesType getFactRoles() {
		return factRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactRoles(FactRolesType newFactRoles, NotificationChain msgs) {
		FactRolesType oldFactRoles = factRoles;
		factRoles = newFactRoles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__FACT_ROLES, oldFactRoles, newFactRoles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactRoles(FactRolesType newFactRoles) {
		if (newFactRoles != factRoles) {
			NotificationChain msgs = null;
			if (factRoles != null)
				msgs = ((InternalEObject)factRoles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_TYPE__FACT_ROLES, null, msgs);
			if (newFactRoles != null)
				msgs = ((InternalEObject)newFactRoles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_TYPE__FACT_ROLES, null, msgs);
			msgs = basicSetFactRoles(newFactRoles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__FACT_ROLES, newFactRoles, newFactRoles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadingOrdersType getReadingOrders() {
		return readingOrders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadingOrders(ReadingOrdersType newReadingOrders, NotificationChain msgs) {
		ReadingOrdersType oldReadingOrders = readingOrders;
		readingOrders = newReadingOrders;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__READING_ORDERS, oldReadingOrders, newReadingOrders);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadingOrders(ReadingOrdersType newReadingOrders) {
		if (newReadingOrders != readingOrders) {
			NotificationChain msgs = null;
			if (readingOrders != null)
				msgs = ((InternalEObject)readingOrders).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_TYPE__READING_ORDERS, null, msgs);
			if (newReadingOrders != null)
				msgs = ((InternalEObject)newReadingOrders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_TYPE__READING_ORDERS, null, msgs);
			msgs = basicSetReadingOrders(newReadingOrders, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__READING_ORDERS, newReadingOrders, newReadingOrders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalConstraintsType getInternalConstraints() {
		return internalConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalConstraints(InternalConstraintsType newInternalConstraints, NotificationChain msgs) {
		InternalConstraintsType oldInternalConstraints = internalConstraints;
		internalConstraints = newInternalConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__INTERNAL_CONSTRAINTS, oldInternalConstraints, newInternalConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalConstraints(InternalConstraintsType newInternalConstraints) {
		if (newInternalConstraints != internalConstraints) {
			NotificationChain msgs = null;
			if (internalConstraints != null)
				msgs = ((InternalEObject)internalConstraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_TYPE__INTERNAL_CONSTRAINTS, null, msgs);
			if (newInternalConstraints != null)
				msgs = ((InternalEObject)newInternalConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_TYPE__INTERNAL_CONSTRAINTS, null, msgs);
			msgs = basicSetInternalConstraints(newInternalConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__INTERNAL_CONSTRAINTS, newInternalConstraints, newInternalConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeDerivationRuleType getDerivationRule() {
		return derivationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivationRule(FactTypeDerivationRuleType newDerivationRule, NotificationChain msgs) {
		FactTypeDerivationRuleType oldDerivationRule = derivationRule;
		derivationRule = newDerivationRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__DERIVATION_RULE, oldDerivationRule, newDerivationRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationRule(FactTypeDerivationRuleType newDerivationRule) {
		if (newDerivationRule != derivationRule) {
			NotificationChain msgs = null;
			if (derivationRule != null)
				msgs = ((InternalEObject)derivationRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_TYPE__DERIVATION_RULE, null, msgs);
			if (newDerivationRule != null)
				msgs = ((InternalEObject)newDerivationRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_TYPE__DERIVATION_RULE, null, msgs);
			msgs = basicSetDerivationRule(newDerivationRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__DERIVATION_RULE, newDerivationRule, newDerivationRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypeInstancesType getInstances() {
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstances(FactTypeInstancesType newInstances, NotificationChain msgs) {
		FactTypeInstancesType oldInstances = instances;
		instances = newInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__INSTANCES, oldInstances, newInstances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstances(FactTypeInstancesType newInstances) {
		if (newInstances != instances) {
			NotificationChain msgs = null;
			if (instances != null)
				msgs = ((InternalEObject)instances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_TYPE__INSTANCES, null, msgs);
			if (newInstances != null)
				msgs = ((InternalEObject)newInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_TYPE__INSTANCES, null, msgs);
			msgs = basicSetInstances(newInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__INSTANCES, newInstances, newInstances));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__EXTENSIONS, oldExtensions, newExtensions);
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
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.FACT_TYPE_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__EXTENSIONS, newExtensions, newExtensions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FACT_TYPE_TYPE__IS_EXTERNAL, oldIsExternal, isExternal, !oldIsExternalESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.FACT_TYPE_TYPE__IS_EXTERNAL, oldIsExternal, IS_EXTERNAL_EDEFAULT, oldIsExternalESet));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FACT_TYPE_TYPE__DEFINITIONS:
				return basicSetDefinitions(null, msgs);
			case CorePackage.FACT_TYPE_TYPE__NOTES:
				return basicSetNotes(null, msgs);
			case CorePackage.FACT_TYPE_TYPE__FACT_ROLES:
				return basicSetFactRoles(null, msgs);
			case CorePackage.FACT_TYPE_TYPE__READING_ORDERS:
				return basicSetReadingOrders(null, msgs);
			case CorePackage.FACT_TYPE_TYPE__INTERNAL_CONSTRAINTS:
				return basicSetInternalConstraints(null, msgs);
			case CorePackage.FACT_TYPE_TYPE__DERIVATION_RULE:
				return basicSetDerivationRule(null, msgs);
			case CorePackage.FACT_TYPE_TYPE__INSTANCES:
				return basicSetInstances(null, msgs);
			case CorePackage.FACT_TYPE_TYPE__EXTENSIONS:
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
			case CorePackage.FACT_TYPE_TYPE__DEFINITIONS:
				return getDefinitions();
			case CorePackage.FACT_TYPE_TYPE__NOTES:
				return getNotes();
			case CorePackage.FACT_TYPE_TYPE__FACT_ROLES:
				return getFactRoles();
			case CorePackage.FACT_TYPE_TYPE__READING_ORDERS:
				return getReadingOrders();
			case CorePackage.FACT_TYPE_TYPE__INTERNAL_CONSTRAINTS:
				return getInternalConstraints();
			case CorePackage.FACT_TYPE_TYPE__DERIVATION_RULE:
				return getDerivationRule();
			case CorePackage.FACT_TYPE_TYPE__INSTANCES:
				return getInstances();
			case CorePackage.FACT_TYPE_TYPE__EXTENSIONS:
				return getExtensions();
			case CorePackage.FACT_TYPE_TYPE__NAME:
				return getName();
			case CorePackage.FACT_TYPE_TYPE__ID:
				return getId();
			case CorePackage.FACT_TYPE_TYPE__IS_EXTERNAL:
				return isIsExternal();
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
			case CorePackage.FACT_TYPE_TYPE__DEFINITIONS:
				setDefinitions((DefinitionsType)newValue);
				return;
			case CorePackage.FACT_TYPE_TYPE__NOTES:
				setNotes((NotesType)newValue);
				return;
			case CorePackage.FACT_TYPE_TYPE__FACT_ROLES:
				setFactRoles((FactRolesType)newValue);
				return;
			case CorePackage.FACT_TYPE_TYPE__READING_ORDERS:
				setReadingOrders((ReadingOrdersType)newValue);
				return;
			case CorePackage.FACT_TYPE_TYPE__INTERNAL_CONSTRAINTS:
				setInternalConstraints((InternalConstraintsType)newValue);
				return;
			case CorePackage.FACT_TYPE_TYPE__DERIVATION_RULE:
				setDerivationRule((FactTypeDerivationRuleType)newValue);
				return;
			case CorePackage.FACT_TYPE_TYPE__INSTANCES:
				setInstances((FactTypeInstancesType)newValue);
				return;
			case CorePackage.FACT_TYPE_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
				return;
			case CorePackage.FACT_TYPE_TYPE__NAME:
				setName((String)newValue);
				return;
			case CorePackage.FACT_TYPE_TYPE__ID:
				setId((String)newValue);
				return;
			case CorePackage.FACT_TYPE_TYPE__IS_EXTERNAL:
				setIsExternal((Boolean)newValue);
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
			case CorePackage.FACT_TYPE_TYPE__DEFINITIONS:
				setDefinitions((DefinitionsType)null);
				return;
			case CorePackage.FACT_TYPE_TYPE__NOTES:
				setNotes((NotesType)null);
				return;
			case CorePackage.FACT_TYPE_TYPE__FACT_ROLES:
				setFactRoles((FactRolesType)null);
				return;
			case CorePackage.FACT_TYPE_TYPE__READING_ORDERS:
				setReadingOrders((ReadingOrdersType)null);
				return;
			case CorePackage.FACT_TYPE_TYPE__INTERNAL_CONSTRAINTS:
				setInternalConstraints((InternalConstraintsType)null);
				return;
			case CorePackage.FACT_TYPE_TYPE__DERIVATION_RULE:
				setDerivationRule((FactTypeDerivationRuleType)null);
				return;
			case CorePackage.FACT_TYPE_TYPE__INSTANCES:
				setInstances((FactTypeInstancesType)null);
				return;
			case CorePackage.FACT_TYPE_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)null);
				return;
			case CorePackage.FACT_TYPE_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.FACT_TYPE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.FACT_TYPE_TYPE__IS_EXTERNAL:
				unsetIsExternal();
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
			case CorePackage.FACT_TYPE_TYPE__DEFINITIONS:
				return definitions != null;
			case CorePackage.FACT_TYPE_TYPE__NOTES:
				return notes != null;
			case CorePackage.FACT_TYPE_TYPE__FACT_ROLES:
				return factRoles != null;
			case CorePackage.FACT_TYPE_TYPE__READING_ORDERS:
				return readingOrders != null;
			case CorePackage.FACT_TYPE_TYPE__INTERNAL_CONSTRAINTS:
				return internalConstraints != null;
			case CorePackage.FACT_TYPE_TYPE__DERIVATION_RULE:
				return derivationRule != null;
			case CorePackage.FACT_TYPE_TYPE__INSTANCES:
				return instances != null;
			case CorePackage.FACT_TYPE_TYPE__EXTENSIONS:
				return extensions != null;
			case CorePackage.FACT_TYPE_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.FACT_TYPE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.FACT_TYPE_TYPE__IS_EXTERNAL:
				return isSetIsExternal();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", isExternal: ");
		if (isExternalESet) result.append(isExternal); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FactTypeTypeImpl
