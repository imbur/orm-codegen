/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.ConstraintsType5;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.CustomReferenceModesType;
import edu.neumont.schemas.orm._2006._04.orm.core.DataTypesType;
import edu.neumont.schemas.orm._2006._04.orm.core.DefinitionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.ExtensionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.FactTypesType;
import edu.neumont.schemas.orm._2006._04.orm.core.FunctionsType1;
import edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorsType;
import edu.neumont.schemas.orm._2006._04.orm.core.ModelNotesType;
import edu.neumont.schemas.orm._2006._04.orm.core.NotesType;
import edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypesType;
import edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhrasesType;
import edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ORM Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ORMModelTypeImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ORMModelTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ORMModelTypeImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ORMModelTypeImpl#getFacts <em>Facts</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ORMModelTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ORMModelTypeImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ORMModelTypeImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ORMModelTypeImpl#getCustomReferenceModes <em>Custom Reference Modes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ORMModelTypeImpl#getModelNotes <em>Model Notes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ORMModelTypeImpl#getModelErrors <em>Model Errors</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ORMModelTypeImpl#getReferenceModeKinds <em>Reference Mode Kinds</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ORMModelTypeImpl#getRecognizedPhrases <em>Recognized Phrases</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ORMModelTypeImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ORMModelTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ORMModelTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ORMModelTypeImpl extends MinimalEObjectImpl.Container implements ORMModelType {
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
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected ObjectTypesType objects;

	/**
	 * The cached value of the '{@link #getFacts() <em>Facts</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacts()
	 * @generated
	 * @ordered
	 */
	protected FactTypesType facts;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected ConstraintsType5 constraints;

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected DataTypesType dataTypes;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected FunctionsType1 functions;

	/**
	 * The cached value of the '{@link #getCustomReferenceModes() <em>Custom Reference Modes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomReferenceModes()
	 * @generated
	 * @ordered
	 */
	protected CustomReferenceModesType customReferenceModes;

	/**
	 * The cached value of the '{@link #getModelNotes() <em>Model Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelNotes()
	 * @generated
	 * @ordered
	 */
	protected ModelNotesType modelNotes;

	/**
	 * The cached value of the '{@link #getModelErrors() <em>Model Errors</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelErrors()
	 * @generated
	 * @ordered
	 */
	protected ModelErrorsType modelErrors;

	/**
	 * The cached value of the '{@link #getReferenceModeKinds() <em>Reference Mode Kinds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceModeKinds()
	 * @generated
	 * @ordered
	 */
	protected ReferenceModeKindsType referenceModeKinds;

	/**
	 * The cached value of the '{@link #getRecognizedPhrases() <em>Recognized Phrases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecognizedPhrases()
	 * @generated
	 * @ordered
	 */
	protected RecognizedPhrasesType recognizedPhrases;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ORMModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getORMModelType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__DEFINITIONS, oldDefinitions, newDefinitions);
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
				msgs = ((InternalEObject)definitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__DEFINITIONS, null, msgs);
			if (newDefinitions != null)
				msgs = ((InternalEObject)newDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__DEFINITIONS, null, msgs);
			msgs = basicSetDefinitions(newDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__DEFINITIONS, newDefinitions, newDefinitions));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__NOTES, oldNotes, newNotes);
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
				msgs = ((InternalEObject)notes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__NOTES, null, msgs);
			if (newNotes != null)
				msgs = ((InternalEObject)newNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__NOTES, null, msgs);
			msgs = basicSetNotes(newNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__NOTES, newNotes, newNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypesType getObjects() {
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjects(ObjectTypesType newObjects, NotificationChain msgs) {
		ObjectTypesType oldObjects = objects;
		objects = newObjects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__OBJECTS, oldObjects, newObjects);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjects(ObjectTypesType newObjects) {
		if (newObjects != objects) {
			NotificationChain msgs = null;
			if (objects != null)
				msgs = ((InternalEObject)objects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__OBJECTS, null, msgs);
			if (newObjects != null)
				msgs = ((InternalEObject)newObjects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__OBJECTS, null, msgs);
			msgs = basicSetObjects(newObjects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__OBJECTS, newObjects, newObjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactTypesType getFacts() {
		return facts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacts(FactTypesType newFacts, NotificationChain msgs) {
		FactTypesType oldFacts = facts;
		facts = newFacts;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__FACTS, oldFacts, newFacts);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacts(FactTypesType newFacts) {
		if (newFacts != facts) {
			NotificationChain msgs = null;
			if (facts != null)
				msgs = ((InternalEObject)facts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__FACTS, null, msgs);
			if (newFacts != null)
				msgs = ((InternalEObject)newFacts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__FACTS, null, msgs);
			msgs = basicSetFacts(newFacts, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__FACTS, newFacts, newFacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsType5 getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraints(ConstraintsType5 newConstraints, NotificationChain msgs) {
		ConstraintsType5 oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__CONSTRAINTS, oldConstraints, newConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(ConstraintsType5 newConstraints) {
		if (newConstraints != constraints) {
			NotificationChain msgs = null;
			if (constraints != null)
				msgs = ((InternalEObject)constraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__CONSTRAINTS, null, msgs);
			if (newConstraints != null)
				msgs = ((InternalEObject)newConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__CONSTRAINTS, null, msgs);
			msgs = basicSetConstraints(newConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__CONSTRAINTS, newConstraints, newConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesType getDataTypes() {
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTypes(DataTypesType newDataTypes, NotificationChain msgs) {
		DataTypesType oldDataTypes = dataTypes;
		dataTypes = newDataTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__DATA_TYPES, oldDataTypes, newDataTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypes(DataTypesType newDataTypes) {
		if (newDataTypes != dataTypes) {
			NotificationChain msgs = null;
			if (dataTypes != null)
				msgs = ((InternalEObject)dataTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__DATA_TYPES, null, msgs);
			if (newDataTypes != null)
				msgs = ((InternalEObject)newDataTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__DATA_TYPES, null, msgs);
			msgs = basicSetDataTypes(newDataTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__DATA_TYPES, newDataTypes, newDataTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsType1 getFunctions() {
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctions(FunctionsType1 newFunctions, NotificationChain msgs) {
		FunctionsType1 oldFunctions = functions;
		functions = newFunctions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__FUNCTIONS, oldFunctions, newFunctions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctions(FunctionsType1 newFunctions) {
		if (newFunctions != functions) {
			NotificationChain msgs = null;
			if (functions != null)
				msgs = ((InternalEObject)functions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__FUNCTIONS, null, msgs);
			if (newFunctions != null)
				msgs = ((InternalEObject)newFunctions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__FUNCTIONS, null, msgs);
			msgs = basicSetFunctions(newFunctions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__FUNCTIONS, newFunctions, newFunctions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomReferenceModesType getCustomReferenceModes() {
		return customReferenceModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomReferenceModes(CustomReferenceModesType newCustomReferenceModes, NotificationChain msgs) {
		CustomReferenceModesType oldCustomReferenceModes = customReferenceModes;
		customReferenceModes = newCustomReferenceModes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__CUSTOM_REFERENCE_MODES, oldCustomReferenceModes, newCustomReferenceModes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomReferenceModes(CustomReferenceModesType newCustomReferenceModes) {
		if (newCustomReferenceModes != customReferenceModes) {
			NotificationChain msgs = null;
			if (customReferenceModes != null)
				msgs = ((InternalEObject)customReferenceModes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__CUSTOM_REFERENCE_MODES, null, msgs);
			if (newCustomReferenceModes != null)
				msgs = ((InternalEObject)newCustomReferenceModes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__CUSTOM_REFERENCE_MODES, null, msgs);
			msgs = basicSetCustomReferenceModes(newCustomReferenceModes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__CUSTOM_REFERENCE_MODES, newCustomReferenceModes, newCustomReferenceModes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelNotesType getModelNotes() {
		return modelNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelNotes(ModelNotesType newModelNotes, NotificationChain msgs) {
		ModelNotesType oldModelNotes = modelNotes;
		modelNotes = newModelNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__MODEL_NOTES, oldModelNotes, newModelNotes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelNotes(ModelNotesType newModelNotes) {
		if (newModelNotes != modelNotes) {
			NotificationChain msgs = null;
			if (modelNotes != null)
				msgs = ((InternalEObject)modelNotes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__MODEL_NOTES, null, msgs);
			if (newModelNotes != null)
				msgs = ((InternalEObject)newModelNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__MODEL_NOTES, null, msgs);
			msgs = basicSetModelNotes(newModelNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__MODEL_NOTES, newModelNotes, newModelNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelErrorsType getModelErrors() {
		return modelErrors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelErrors(ModelErrorsType newModelErrors, NotificationChain msgs) {
		ModelErrorsType oldModelErrors = modelErrors;
		modelErrors = newModelErrors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__MODEL_ERRORS, oldModelErrors, newModelErrors);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelErrors(ModelErrorsType newModelErrors) {
		if (newModelErrors != modelErrors) {
			NotificationChain msgs = null;
			if (modelErrors != null)
				msgs = ((InternalEObject)modelErrors).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__MODEL_ERRORS, null, msgs);
			if (newModelErrors != null)
				msgs = ((InternalEObject)newModelErrors).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__MODEL_ERRORS, null, msgs);
			msgs = basicSetModelErrors(newModelErrors, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__MODEL_ERRORS, newModelErrors, newModelErrors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceModeKindsType getReferenceModeKinds() {
		return referenceModeKinds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceModeKinds(ReferenceModeKindsType newReferenceModeKinds, NotificationChain msgs) {
		ReferenceModeKindsType oldReferenceModeKinds = referenceModeKinds;
		referenceModeKinds = newReferenceModeKinds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__REFERENCE_MODE_KINDS, oldReferenceModeKinds, newReferenceModeKinds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceModeKinds(ReferenceModeKindsType newReferenceModeKinds) {
		if (newReferenceModeKinds != referenceModeKinds) {
			NotificationChain msgs = null;
			if (referenceModeKinds != null)
				msgs = ((InternalEObject)referenceModeKinds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__REFERENCE_MODE_KINDS, null, msgs);
			if (newReferenceModeKinds != null)
				msgs = ((InternalEObject)newReferenceModeKinds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__REFERENCE_MODE_KINDS, null, msgs);
			msgs = basicSetReferenceModeKinds(newReferenceModeKinds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__REFERENCE_MODE_KINDS, newReferenceModeKinds, newReferenceModeKinds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecognizedPhrasesType getRecognizedPhrases() {
		return recognizedPhrases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecognizedPhrases(RecognizedPhrasesType newRecognizedPhrases, NotificationChain msgs) {
		RecognizedPhrasesType oldRecognizedPhrases = recognizedPhrases;
		recognizedPhrases = newRecognizedPhrases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__RECOGNIZED_PHRASES, oldRecognizedPhrases, newRecognizedPhrases);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecognizedPhrases(RecognizedPhrasesType newRecognizedPhrases) {
		if (newRecognizedPhrases != recognizedPhrases) {
			NotificationChain msgs = null;
			if (recognizedPhrases != null)
				msgs = ((InternalEObject)recognizedPhrases).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__RECOGNIZED_PHRASES, null, msgs);
			if (newRecognizedPhrases != null)
				msgs = ((InternalEObject)newRecognizedPhrases).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__RECOGNIZED_PHRASES, null, msgs);
			msgs = basicSetRecognizedPhrases(newRecognizedPhrases, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__RECOGNIZED_PHRASES, newRecognizedPhrases, newRecognizedPhrases));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__EXTENSIONS, oldExtensions, newExtensions);
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
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.ORM_MODEL_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__EXTENSIONS, newExtensions, newExtensions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ORM_MODEL_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.ORM_MODEL_TYPE__DEFINITIONS:
				return basicSetDefinitions(null, msgs);
			case CorePackage.ORM_MODEL_TYPE__NOTES:
				return basicSetNotes(null, msgs);
			case CorePackage.ORM_MODEL_TYPE__OBJECTS:
				return basicSetObjects(null, msgs);
			case CorePackage.ORM_MODEL_TYPE__FACTS:
				return basicSetFacts(null, msgs);
			case CorePackage.ORM_MODEL_TYPE__CONSTRAINTS:
				return basicSetConstraints(null, msgs);
			case CorePackage.ORM_MODEL_TYPE__DATA_TYPES:
				return basicSetDataTypes(null, msgs);
			case CorePackage.ORM_MODEL_TYPE__FUNCTIONS:
				return basicSetFunctions(null, msgs);
			case CorePackage.ORM_MODEL_TYPE__CUSTOM_REFERENCE_MODES:
				return basicSetCustomReferenceModes(null, msgs);
			case CorePackage.ORM_MODEL_TYPE__MODEL_NOTES:
				return basicSetModelNotes(null, msgs);
			case CorePackage.ORM_MODEL_TYPE__MODEL_ERRORS:
				return basicSetModelErrors(null, msgs);
			case CorePackage.ORM_MODEL_TYPE__REFERENCE_MODE_KINDS:
				return basicSetReferenceModeKinds(null, msgs);
			case CorePackage.ORM_MODEL_TYPE__RECOGNIZED_PHRASES:
				return basicSetRecognizedPhrases(null, msgs);
			case CorePackage.ORM_MODEL_TYPE__EXTENSIONS:
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
			case CorePackage.ORM_MODEL_TYPE__DEFINITIONS:
				return getDefinitions();
			case CorePackage.ORM_MODEL_TYPE__NOTES:
				return getNotes();
			case CorePackage.ORM_MODEL_TYPE__OBJECTS:
				return getObjects();
			case CorePackage.ORM_MODEL_TYPE__FACTS:
				return getFacts();
			case CorePackage.ORM_MODEL_TYPE__CONSTRAINTS:
				return getConstraints();
			case CorePackage.ORM_MODEL_TYPE__DATA_TYPES:
				return getDataTypes();
			case CorePackage.ORM_MODEL_TYPE__FUNCTIONS:
				return getFunctions();
			case CorePackage.ORM_MODEL_TYPE__CUSTOM_REFERENCE_MODES:
				return getCustomReferenceModes();
			case CorePackage.ORM_MODEL_TYPE__MODEL_NOTES:
				return getModelNotes();
			case CorePackage.ORM_MODEL_TYPE__MODEL_ERRORS:
				return getModelErrors();
			case CorePackage.ORM_MODEL_TYPE__REFERENCE_MODE_KINDS:
				return getReferenceModeKinds();
			case CorePackage.ORM_MODEL_TYPE__RECOGNIZED_PHRASES:
				return getRecognizedPhrases();
			case CorePackage.ORM_MODEL_TYPE__EXTENSIONS:
				return getExtensions();
			case CorePackage.ORM_MODEL_TYPE__ID:
				return getId();
			case CorePackage.ORM_MODEL_TYPE__NAME:
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
			case CorePackage.ORM_MODEL_TYPE__DEFINITIONS:
				setDefinitions((DefinitionsType)newValue);
				return;
			case CorePackage.ORM_MODEL_TYPE__NOTES:
				setNotes((NotesType)newValue);
				return;
			case CorePackage.ORM_MODEL_TYPE__OBJECTS:
				setObjects((ObjectTypesType)newValue);
				return;
			case CorePackage.ORM_MODEL_TYPE__FACTS:
				setFacts((FactTypesType)newValue);
				return;
			case CorePackage.ORM_MODEL_TYPE__CONSTRAINTS:
				setConstraints((ConstraintsType5)newValue);
				return;
			case CorePackage.ORM_MODEL_TYPE__DATA_TYPES:
				setDataTypes((DataTypesType)newValue);
				return;
			case CorePackage.ORM_MODEL_TYPE__FUNCTIONS:
				setFunctions((FunctionsType1)newValue);
				return;
			case CorePackage.ORM_MODEL_TYPE__CUSTOM_REFERENCE_MODES:
				setCustomReferenceModes((CustomReferenceModesType)newValue);
				return;
			case CorePackage.ORM_MODEL_TYPE__MODEL_NOTES:
				setModelNotes((ModelNotesType)newValue);
				return;
			case CorePackage.ORM_MODEL_TYPE__MODEL_ERRORS:
				setModelErrors((ModelErrorsType)newValue);
				return;
			case CorePackage.ORM_MODEL_TYPE__REFERENCE_MODE_KINDS:
				setReferenceModeKinds((ReferenceModeKindsType)newValue);
				return;
			case CorePackage.ORM_MODEL_TYPE__RECOGNIZED_PHRASES:
				setRecognizedPhrases((RecognizedPhrasesType)newValue);
				return;
			case CorePackage.ORM_MODEL_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
				return;
			case CorePackage.ORM_MODEL_TYPE__ID:
				setId((String)newValue);
				return;
			case CorePackage.ORM_MODEL_TYPE__NAME:
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
			case CorePackage.ORM_MODEL_TYPE__DEFINITIONS:
				setDefinitions((DefinitionsType)null);
				return;
			case CorePackage.ORM_MODEL_TYPE__NOTES:
				setNotes((NotesType)null);
				return;
			case CorePackage.ORM_MODEL_TYPE__OBJECTS:
				setObjects((ObjectTypesType)null);
				return;
			case CorePackage.ORM_MODEL_TYPE__FACTS:
				setFacts((FactTypesType)null);
				return;
			case CorePackage.ORM_MODEL_TYPE__CONSTRAINTS:
				setConstraints((ConstraintsType5)null);
				return;
			case CorePackage.ORM_MODEL_TYPE__DATA_TYPES:
				setDataTypes((DataTypesType)null);
				return;
			case CorePackage.ORM_MODEL_TYPE__FUNCTIONS:
				setFunctions((FunctionsType1)null);
				return;
			case CorePackage.ORM_MODEL_TYPE__CUSTOM_REFERENCE_MODES:
				setCustomReferenceModes((CustomReferenceModesType)null);
				return;
			case CorePackage.ORM_MODEL_TYPE__MODEL_NOTES:
				setModelNotes((ModelNotesType)null);
				return;
			case CorePackage.ORM_MODEL_TYPE__MODEL_ERRORS:
				setModelErrors((ModelErrorsType)null);
				return;
			case CorePackage.ORM_MODEL_TYPE__REFERENCE_MODE_KINDS:
				setReferenceModeKinds((ReferenceModeKindsType)null);
				return;
			case CorePackage.ORM_MODEL_TYPE__RECOGNIZED_PHRASES:
				setRecognizedPhrases((RecognizedPhrasesType)null);
				return;
			case CorePackage.ORM_MODEL_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)null);
				return;
			case CorePackage.ORM_MODEL_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.ORM_MODEL_TYPE__NAME:
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
			case CorePackage.ORM_MODEL_TYPE__DEFINITIONS:
				return definitions != null;
			case CorePackage.ORM_MODEL_TYPE__NOTES:
				return notes != null;
			case CorePackage.ORM_MODEL_TYPE__OBJECTS:
				return objects != null;
			case CorePackage.ORM_MODEL_TYPE__FACTS:
				return facts != null;
			case CorePackage.ORM_MODEL_TYPE__CONSTRAINTS:
				return constraints != null;
			case CorePackage.ORM_MODEL_TYPE__DATA_TYPES:
				return dataTypes != null;
			case CorePackage.ORM_MODEL_TYPE__FUNCTIONS:
				return functions != null;
			case CorePackage.ORM_MODEL_TYPE__CUSTOM_REFERENCE_MODES:
				return customReferenceModes != null;
			case CorePackage.ORM_MODEL_TYPE__MODEL_NOTES:
				return modelNotes != null;
			case CorePackage.ORM_MODEL_TYPE__MODEL_ERRORS:
				return modelErrors != null;
			case CorePackage.ORM_MODEL_TYPE__REFERENCE_MODE_KINDS:
				return referenceModeKinds != null;
			case CorePackage.ORM_MODEL_TYPE__RECOGNIZED_PHRASES:
				return recognizedPhrases != null;
			case CorePackage.ORM_MODEL_TYPE__EXTENSIONS:
				return extensions != null;
			case CorePackage.ORM_MODEL_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.ORM_MODEL_TYPE__NAME:
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ORMModelTypeImpl
