/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DefinitionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.ExtensionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.GroupElementsType;
import edu.neumont.schemas.orm._2006._04.orm.core.GroupType1;
import edu.neumont.schemas.orm._2006._04.orm.core.GroupTypesType;
import edu.neumont.schemas.orm._2006._04.orm.core.NestedGroupsType;
import edu.neumont.schemas.orm._2006._04.orm.core.NotesType;
import edu.neumont.schemas.orm._2006._04.orm.core.TypeComplianceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GroupType1Impl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GroupType1Impl#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GroupType1Impl#getGroupTypes <em>Group Types</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GroupType1Impl#getElements <em>Elements</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GroupType1Impl#getNestedGroups <em>Nested Groups</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GroupType1Impl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GroupType1Impl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GroupType1Impl#getName <em>Name</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GroupType1Impl#getPriority <em>Priority</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.GroupType1Impl#getTypeCompliance <em>Type Compliance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupType1Impl extends MinimalEObjectImpl.Container implements GroupType1 {
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
	 * The cached value of the '{@link #getGroupTypes() <em>Group Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupTypes()
	 * @generated
	 * @ordered
	 */
	protected GroupTypesType groupTypes;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected GroupElementsType elements;

	/**
	 * The cached value of the '{@link #getNestedGroups() <em>Nested Groups</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedGroups()
	 * @generated
	 * @ordered
	 */
	protected NestedGroupsType nestedGroups;

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
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * This is true if the Priority attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean priorityESet;

	/**
	 * The default value of the '{@link #getTypeCompliance() <em>Type Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCompliance()
	 * @generated
	 * @ordered
	 */
	protected static final TypeComplianceType TYPE_COMPLIANCE_EDEFAULT = TypeComplianceType.NOT_EXCLUDED;

	/**
	 * The cached value of the '{@link #getTypeCompliance() <em>Type Compliance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeCompliance()
	 * @generated
	 * @ordered
	 */
	protected TypeComplianceType typeCompliance = TYPE_COMPLIANCE_EDEFAULT;

	/**
	 * This is true if the Type Compliance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeComplianceESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupType1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getGroupType1();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.GROUP_TYPE1__DEFINITIONS, oldDefinitions, newDefinitions);
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
				msgs = ((InternalEObject)definitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.GROUP_TYPE1__DEFINITIONS, null, msgs);
			if (newDefinitions != null)
				msgs = ((InternalEObject)newDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.GROUP_TYPE1__DEFINITIONS, null, msgs);
			msgs = basicSetDefinitions(newDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GROUP_TYPE1__DEFINITIONS, newDefinitions, newDefinitions));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.GROUP_TYPE1__NOTES, oldNotes, newNotes);
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
				msgs = ((InternalEObject)notes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.GROUP_TYPE1__NOTES, null, msgs);
			if (newNotes != null)
				msgs = ((InternalEObject)newNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.GROUP_TYPE1__NOTES, null, msgs);
			msgs = basicSetNotes(newNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GROUP_TYPE1__NOTES, newNotes, newNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupTypesType getGroupTypes() {
		return groupTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupTypes(GroupTypesType newGroupTypes, NotificationChain msgs) {
		GroupTypesType oldGroupTypes = groupTypes;
		groupTypes = newGroupTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.GROUP_TYPE1__GROUP_TYPES, oldGroupTypes, newGroupTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupTypes(GroupTypesType newGroupTypes) {
		if (newGroupTypes != groupTypes) {
			NotificationChain msgs = null;
			if (groupTypes != null)
				msgs = ((InternalEObject)groupTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.GROUP_TYPE1__GROUP_TYPES, null, msgs);
			if (newGroupTypes != null)
				msgs = ((InternalEObject)newGroupTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.GROUP_TYPE1__GROUP_TYPES, null, msgs);
			msgs = basicSetGroupTypes(newGroupTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GROUP_TYPE1__GROUP_TYPES, newGroupTypes, newGroupTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupElementsType getElements() {
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElements(GroupElementsType newElements, NotificationChain msgs) {
		GroupElementsType oldElements = elements;
		elements = newElements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.GROUP_TYPE1__ELEMENTS, oldElements, newElements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElements(GroupElementsType newElements) {
		if (newElements != elements) {
			NotificationChain msgs = null;
			if (elements != null)
				msgs = ((InternalEObject)elements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.GROUP_TYPE1__ELEMENTS, null, msgs);
			if (newElements != null)
				msgs = ((InternalEObject)newElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.GROUP_TYPE1__ELEMENTS, null, msgs);
			msgs = basicSetElements(newElements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GROUP_TYPE1__ELEMENTS, newElements, newElements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedGroupsType getNestedGroups() {
		return nestedGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestedGroups(NestedGroupsType newNestedGroups, NotificationChain msgs) {
		NestedGroupsType oldNestedGroups = nestedGroups;
		nestedGroups = newNestedGroups;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.GROUP_TYPE1__NESTED_GROUPS, oldNestedGroups, newNestedGroups);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestedGroups(NestedGroupsType newNestedGroups) {
		if (newNestedGroups != nestedGroups) {
			NotificationChain msgs = null;
			if (nestedGroups != null)
				msgs = ((InternalEObject)nestedGroups).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.GROUP_TYPE1__NESTED_GROUPS, null, msgs);
			if (newNestedGroups != null)
				msgs = ((InternalEObject)newNestedGroups).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.GROUP_TYPE1__NESTED_GROUPS, null, msgs);
			msgs = basicSetNestedGroups(newNestedGroups, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GROUP_TYPE1__NESTED_GROUPS, newNestedGroups, newNestedGroups));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.GROUP_TYPE1__EXTENSIONS, oldExtensions, newExtensions);
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
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.GROUP_TYPE1__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.GROUP_TYPE1__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GROUP_TYPE1__EXTENSIONS, newExtensions, newExtensions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GROUP_TYPE1__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GROUP_TYPE1__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		boolean oldPriorityESet = priorityESet;
		priorityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GROUP_TYPE1__PRIORITY, oldPriority, priority, !oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriority() {
		int oldPriority = priority;
		boolean oldPriorityESet = priorityESet;
		priority = PRIORITY_EDEFAULT;
		priorityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.GROUP_TYPE1__PRIORITY, oldPriority, PRIORITY_EDEFAULT, oldPriorityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriority() {
		return priorityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeComplianceType getTypeCompliance() {
		return typeCompliance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeCompliance(TypeComplianceType newTypeCompliance) {
		TypeComplianceType oldTypeCompliance = typeCompliance;
		typeCompliance = newTypeCompliance == null ? TYPE_COMPLIANCE_EDEFAULT : newTypeCompliance;
		boolean oldTypeComplianceESet = typeComplianceESet;
		typeComplianceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.GROUP_TYPE1__TYPE_COMPLIANCE, oldTypeCompliance, typeCompliance, !oldTypeComplianceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeCompliance() {
		TypeComplianceType oldTypeCompliance = typeCompliance;
		boolean oldTypeComplianceESet = typeComplianceESet;
		typeCompliance = TYPE_COMPLIANCE_EDEFAULT;
		typeComplianceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.GROUP_TYPE1__TYPE_COMPLIANCE, oldTypeCompliance, TYPE_COMPLIANCE_EDEFAULT, oldTypeComplianceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeCompliance() {
		return typeComplianceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.GROUP_TYPE1__DEFINITIONS:
				return basicSetDefinitions(null, msgs);
			case CorePackage.GROUP_TYPE1__NOTES:
				return basicSetNotes(null, msgs);
			case CorePackage.GROUP_TYPE1__GROUP_TYPES:
				return basicSetGroupTypes(null, msgs);
			case CorePackage.GROUP_TYPE1__ELEMENTS:
				return basicSetElements(null, msgs);
			case CorePackage.GROUP_TYPE1__NESTED_GROUPS:
				return basicSetNestedGroups(null, msgs);
			case CorePackage.GROUP_TYPE1__EXTENSIONS:
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
			case CorePackage.GROUP_TYPE1__DEFINITIONS:
				return getDefinitions();
			case CorePackage.GROUP_TYPE1__NOTES:
				return getNotes();
			case CorePackage.GROUP_TYPE1__GROUP_TYPES:
				return getGroupTypes();
			case CorePackage.GROUP_TYPE1__ELEMENTS:
				return getElements();
			case CorePackage.GROUP_TYPE1__NESTED_GROUPS:
				return getNestedGroups();
			case CorePackage.GROUP_TYPE1__EXTENSIONS:
				return getExtensions();
			case CorePackage.GROUP_TYPE1__ID:
				return getId();
			case CorePackage.GROUP_TYPE1__NAME:
				return getName();
			case CorePackage.GROUP_TYPE1__PRIORITY:
				return getPriority();
			case CorePackage.GROUP_TYPE1__TYPE_COMPLIANCE:
				return getTypeCompliance();
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
			case CorePackage.GROUP_TYPE1__DEFINITIONS:
				setDefinitions((DefinitionsType)newValue);
				return;
			case CorePackage.GROUP_TYPE1__NOTES:
				setNotes((NotesType)newValue);
				return;
			case CorePackage.GROUP_TYPE1__GROUP_TYPES:
				setGroupTypes((GroupTypesType)newValue);
				return;
			case CorePackage.GROUP_TYPE1__ELEMENTS:
				setElements((GroupElementsType)newValue);
				return;
			case CorePackage.GROUP_TYPE1__NESTED_GROUPS:
				setNestedGroups((NestedGroupsType)newValue);
				return;
			case CorePackage.GROUP_TYPE1__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
				return;
			case CorePackage.GROUP_TYPE1__ID:
				setId((String)newValue);
				return;
			case CorePackage.GROUP_TYPE1__NAME:
				setName((String)newValue);
				return;
			case CorePackage.GROUP_TYPE1__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case CorePackage.GROUP_TYPE1__TYPE_COMPLIANCE:
				setTypeCompliance((TypeComplianceType)newValue);
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
			case CorePackage.GROUP_TYPE1__DEFINITIONS:
				setDefinitions((DefinitionsType)null);
				return;
			case CorePackage.GROUP_TYPE1__NOTES:
				setNotes((NotesType)null);
				return;
			case CorePackage.GROUP_TYPE1__GROUP_TYPES:
				setGroupTypes((GroupTypesType)null);
				return;
			case CorePackage.GROUP_TYPE1__ELEMENTS:
				setElements((GroupElementsType)null);
				return;
			case CorePackage.GROUP_TYPE1__NESTED_GROUPS:
				setNestedGroups((NestedGroupsType)null);
				return;
			case CorePackage.GROUP_TYPE1__EXTENSIONS:
				setExtensions((ExtensionsType)null);
				return;
			case CorePackage.GROUP_TYPE1__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.GROUP_TYPE1__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.GROUP_TYPE1__PRIORITY:
				unsetPriority();
				return;
			case CorePackage.GROUP_TYPE1__TYPE_COMPLIANCE:
				unsetTypeCompliance();
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
			case CorePackage.GROUP_TYPE1__DEFINITIONS:
				return definitions != null;
			case CorePackage.GROUP_TYPE1__NOTES:
				return notes != null;
			case CorePackage.GROUP_TYPE1__GROUP_TYPES:
				return groupTypes != null;
			case CorePackage.GROUP_TYPE1__ELEMENTS:
				return elements != null;
			case CorePackage.GROUP_TYPE1__NESTED_GROUPS:
				return nestedGroups != null;
			case CorePackage.GROUP_TYPE1__EXTENSIONS:
				return extensions != null;
			case CorePackage.GROUP_TYPE1__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.GROUP_TYPE1__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.GROUP_TYPE1__PRIORITY:
				return isSetPriority();
			case CorePackage.GROUP_TYPE1__TYPE_COMPLIANCE:
				return isSetTypeCompliance();
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
		result.append(", name: ");
		result.append(name);
		result.append(", priority: ");
		if (priorityESet) result.append(priority); else result.append("<unset>");
		result.append(", typeCompliance: ");
		if (typeComplianceESet) result.append(typeCompliance); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GroupType1Impl
