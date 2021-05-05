/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DefinitionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.ExtensionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.FactRolesType;
import edu.neumont.schemas.orm._2006._04.orm.core.NotesType;
import edu.neumont.schemas.orm._2006._04.orm.core.QueryDerivationRuleType;
import edu.neumont.schemas.orm._2006._04.orm.core.QueryParametersType;
import edu.neumont.schemas.orm._2006._04.orm.core.QueryType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.QueryTypeImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.QueryTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.QueryTypeImpl#getQueryRoles <em>Query Roles</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.QueryTypeImpl#getDerivationRule <em>Derivation Rule</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.QueryTypeImpl#getQueryParameters <em>Query Parameters</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.QueryTypeImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.QueryTypeImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.QueryTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueryTypeImpl extends MinimalEObjectImpl.Container implements QueryType {
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
	 * The cached value of the '{@link #getQueryRoles() <em>Query Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryRoles()
	 * @generated
	 * @ordered
	 */
	protected FactRolesType queryRoles;

	/**
	 * The cached value of the '{@link #getDerivationRule() <em>Derivation Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivationRule()
	 * @generated
	 * @ordered
	 */
	protected QueryDerivationRuleType derivationRule;

	/**
	 * The cached value of the '{@link #getQueryParameters() <em>Query Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryParameters()
	 * @generated
	 * @ordered
	 */
	protected QueryParametersType queryParameters;

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
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected String signature = SIGNATURE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getQueryType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_TYPE__DEFINITIONS, oldDefinitions, newDefinitions);
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
				msgs = ((InternalEObject)definitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_TYPE__DEFINITIONS, null, msgs);
			if (newDefinitions != null)
				msgs = ((InternalEObject)newDefinitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_TYPE__DEFINITIONS, null, msgs);
			msgs = basicSetDefinitions(newDefinitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_TYPE__DEFINITIONS, newDefinitions, newDefinitions));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_TYPE__NOTES, oldNotes, newNotes);
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
				msgs = ((InternalEObject)notes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_TYPE__NOTES, null, msgs);
			if (newNotes != null)
				msgs = ((InternalEObject)newNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_TYPE__NOTES, null, msgs);
			msgs = basicSetNotes(newNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_TYPE__NOTES, newNotes, newNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactRolesType getQueryRoles() {
		return queryRoles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryRoles(FactRolesType newQueryRoles, NotificationChain msgs) {
		FactRolesType oldQueryRoles = queryRoles;
		queryRoles = newQueryRoles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_TYPE__QUERY_ROLES, oldQueryRoles, newQueryRoles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryRoles(FactRolesType newQueryRoles) {
		if (newQueryRoles != queryRoles) {
			NotificationChain msgs = null;
			if (queryRoles != null)
				msgs = ((InternalEObject)queryRoles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_TYPE__QUERY_ROLES, null, msgs);
			if (newQueryRoles != null)
				msgs = ((InternalEObject)newQueryRoles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_TYPE__QUERY_ROLES, null, msgs);
			msgs = basicSetQueryRoles(newQueryRoles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_TYPE__QUERY_ROLES, newQueryRoles, newQueryRoles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryDerivationRuleType getDerivationRule() {
		return derivationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDerivationRule(QueryDerivationRuleType newDerivationRule, NotificationChain msgs) {
		QueryDerivationRuleType oldDerivationRule = derivationRule;
		derivationRule = newDerivationRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_TYPE__DERIVATION_RULE, oldDerivationRule, newDerivationRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerivationRule(QueryDerivationRuleType newDerivationRule) {
		if (newDerivationRule != derivationRule) {
			NotificationChain msgs = null;
			if (derivationRule != null)
				msgs = ((InternalEObject)derivationRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_TYPE__DERIVATION_RULE, null, msgs);
			if (newDerivationRule != null)
				msgs = ((InternalEObject)newDerivationRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_TYPE__DERIVATION_RULE, null, msgs);
			msgs = basicSetDerivationRule(newDerivationRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_TYPE__DERIVATION_RULE, newDerivationRule, newDerivationRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryParametersType getQueryParameters() {
		return queryParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryParameters(QueryParametersType newQueryParameters, NotificationChain msgs) {
		QueryParametersType oldQueryParameters = queryParameters;
		queryParameters = newQueryParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_TYPE__QUERY_PARAMETERS, oldQueryParameters, newQueryParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryParameters(QueryParametersType newQueryParameters) {
		if (newQueryParameters != queryParameters) {
			NotificationChain msgs = null;
			if (queryParameters != null)
				msgs = ((InternalEObject)queryParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_TYPE__QUERY_PARAMETERS, null, msgs);
			if (newQueryParameters != null)
				msgs = ((InternalEObject)newQueryParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_TYPE__QUERY_PARAMETERS, null, msgs);
			msgs = basicSetQueryParameters(newQueryParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_TYPE__QUERY_PARAMETERS, newQueryParameters, newQueryParameters));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_TYPE__EXTENSIONS, oldExtensions, newExtensions);
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
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.QUERY_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_TYPE__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(String newSignature) {
		String oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_TYPE__SIGNATURE, oldSignature, signature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.QUERY_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.QUERY_TYPE__DEFINITIONS:
				return basicSetDefinitions(null, msgs);
			case CorePackage.QUERY_TYPE__NOTES:
				return basicSetNotes(null, msgs);
			case CorePackage.QUERY_TYPE__QUERY_ROLES:
				return basicSetQueryRoles(null, msgs);
			case CorePackage.QUERY_TYPE__DERIVATION_RULE:
				return basicSetDerivationRule(null, msgs);
			case CorePackage.QUERY_TYPE__QUERY_PARAMETERS:
				return basicSetQueryParameters(null, msgs);
			case CorePackage.QUERY_TYPE__EXTENSIONS:
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
			case CorePackage.QUERY_TYPE__DEFINITIONS:
				return getDefinitions();
			case CorePackage.QUERY_TYPE__NOTES:
				return getNotes();
			case CorePackage.QUERY_TYPE__QUERY_ROLES:
				return getQueryRoles();
			case CorePackage.QUERY_TYPE__DERIVATION_RULE:
				return getDerivationRule();
			case CorePackage.QUERY_TYPE__QUERY_PARAMETERS:
				return getQueryParameters();
			case CorePackage.QUERY_TYPE__EXTENSIONS:
				return getExtensions();
			case CorePackage.QUERY_TYPE__SIGNATURE:
				return getSignature();
			case CorePackage.QUERY_TYPE__ID:
				return getId();
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
			case CorePackage.QUERY_TYPE__DEFINITIONS:
				setDefinitions((DefinitionsType)newValue);
				return;
			case CorePackage.QUERY_TYPE__NOTES:
				setNotes((NotesType)newValue);
				return;
			case CorePackage.QUERY_TYPE__QUERY_ROLES:
				setQueryRoles((FactRolesType)newValue);
				return;
			case CorePackage.QUERY_TYPE__DERIVATION_RULE:
				setDerivationRule((QueryDerivationRuleType)newValue);
				return;
			case CorePackage.QUERY_TYPE__QUERY_PARAMETERS:
				setQueryParameters((QueryParametersType)newValue);
				return;
			case CorePackage.QUERY_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
				return;
			case CorePackage.QUERY_TYPE__SIGNATURE:
				setSignature((String)newValue);
				return;
			case CorePackage.QUERY_TYPE__ID:
				setId((String)newValue);
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
			case CorePackage.QUERY_TYPE__DEFINITIONS:
				setDefinitions((DefinitionsType)null);
				return;
			case CorePackage.QUERY_TYPE__NOTES:
				setNotes((NotesType)null);
				return;
			case CorePackage.QUERY_TYPE__QUERY_ROLES:
				setQueryRoles((FactRolesType)null);
				return;
			case CorePackage.QUERY_TYPE__DERIVATION_RULE:
				setDerivationRule((QueryDerivationRuleType)null);
				return;
			case CorePackage.QUERY_TYPE__QUERY_PARAMETERS:
				setQueryParameters((QueryParametersType)null);
				return;
			case CorePackage.QUERY_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)null);
				return;
			case CorePackage.QUERY_TYPE__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case CorePackage.QUERY_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case CorePackage.QUERY_TYPE__DEFINITIONS:
				return definitions != null;
			case CorePackage.QUERY_TYPE__NOTES:
				return notes != null;
			case CorePackage.QUERY_TYPE__QUERY_ROLES:
				return queryRoles != null;
			case CorePackage.QUERY_TYPE__DERIVATION_RULE:
				return derivationRule != null;
			case CorePackage.QUERY_TYPE__QUERY_PARAMETERS:
				return queryParameters != null;
			case CorePackage.QUERY_TYPE__EXTENSIONS:
				return extensions != null;
			case CorePackage.QUERY_TYPE__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case CorePackage.QUERY_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(" (signature: ");
		result.append(signature);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //QueryTypeImpl
