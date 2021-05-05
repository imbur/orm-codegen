/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CalculatedValuesType1;
import edu.neumont.schemas.orm._2006._04.orm.core.ConditionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.LeadRolePathType;
import edu.neumont.schemas.orm._2006._04.orm.core.NotesType;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifiersType;
import edu.neumont.schemas.orm._2006._04.orm.core.SubqueryParameterInputsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lead Role Path Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.LeadRolePathTypeImpl#getObjectUnifiers <em>Object Unifiers</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.LeadRolePathTypeImpl#getSubqueryParameterInputs <em>Subquery Parameter Inputs</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.LeadRolePathTypeImpl#getCalculatedValues <em>Calculated Values</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.LeadRolePathTypeImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.LeadRolePathTypeImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeadRolePathTypeImpl extends RolePathTypeImpl implements LeadRolePathType {
	/**
	 * The cached value of the '{@link #getObjectUnifiers() <em>Object Unifiers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectUnifiers()
	 * @generated
	 * @ordered
	 */
	protected ObjectUnifiersType objectUnifiers;

	/**
	 * The cached value of the '{@link #getSubqueryParameterInputs() <em>Subquery Parameter Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubqueryParameterInputs()
	 * @generated
	 * @ordered
	 */
	protected SubqueryParameterInputsType subqueryParameterInputs;

	/**
	 * The cached value of the '{@link #getCalculatedValues() <em>Calculated Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalculatedValues()
	 * @generated
	 * @ordered
	 */
	protected CalculatedValuesType1 calculatedValues;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected ConditionsType conditions;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeadRolePathTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getLeadRolePathType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectUnifiersType getObjectUnifiers() {
		return objectUnifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectUnifiers(ObjectUnifiersType newObjectUnifiers, NotificationChain msgs) {
		ObjectUnifiersType oldObjectUnifiers = objectUnifiers;
		objectUnifiers = newObjectUnifiers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.LEAD_ROLE_PATH_TYPE__OBJECT_UNIFIERS, oldObjectUnifiers, newObjectUnifiers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectUnifiers(ObjectUnifiersType newObjectUnifiers) {
		if (newObjectUnifiers != objectUnifiers) {
			NotificationChain msgs = null;
			if (objectUnifiers != null)
				msgs = ((InternalEObject)objectUnifiers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.LEAD_ROLE_PATH_TYPE__OBJECT_UNIFIERS, null, msgs);
			if (newObjectUnifiers != null)
				msgs = ((InternalEObject)newObjectUnifiers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.LEAD_ROLE_PATH_TYPE__OBJECT_UNIFIERS, null, msgs);
			msgs = basicSetObjectUnifiers(newObjectUnifiers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.LEAD_ROLE_PATH_TYPE__OBJECT_UNIFIERS, newObjectUnifiers, newObjectUnifiers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubqueryParameterInputsType getSubqueryParameterInputs() {
		return subqueryParameterInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubqueryParameterInputs(SubqueryParameterInputsType newSubqueryParameterInputs, NotificationChain msgs) {
		SubqueryParameterInputsType oldSubqueryParameterInputs = subqueryParameterInputs;
		subqueryParameterInputs = newSubqueryParameterInputs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.LEAD_ROLE_PATH_TYPE__SUBQUERY_PARAMETER_INPUTS, oldSubqueryParameterInputs, newSubqueryParameterInputs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubqueryParameterInputs(SubqueryParameterInputsType newSubqueryParameterInputs) {
		if (newSubqueryParameterInputs != subqueryParameterInputs) {
			NotificationChain msgs = null;
			if (subqueryParameterInputs != null)
				msgs = ((InternalEObject)subqueryParameterInputs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.LEAD_ROLE_PATH_TYPE__SUBQUERY_PARAMETER_INPUTS, null, msgs);
			if (newSubqueryParameterInputs != null)
				msgs = ((InternalEObject)newSubqueryParameterInputs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.LEAD_ROLE_PATH_TYPE__SUBQUERY_PARAMETER_INPUTS, null, msgs);
			msgs = basicSetSubqueryParameterInputs(newSubqueryParameterInputs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.LEAD_ROLE_PATH_TYPE__SUBQUERY_PARAMETER_INPUTS, newSubqueryParameterInputs, newSubqueryParameterInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedValuesType1 getCalculatedValues() {
		return calculatedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCalculatedValues(CalculatedValuesType1 newCalculatedValues, NotificationChain msgs) {
		CalculatedValuesType1 oldCalculatedValues = calculatedValues;
		calculatedValues = newCalculatedValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.LEAD_ROLE_PATH_TYPE__CALCULATED_VALUES, oldCalculatedValues, newCalculatedValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalculatedValues(CalculatedValuesType1 newCalculatedValues) {
		if (newCalculatedValues != calculatedValues) {
			NotificationChain msgs = null;
			if (calculatedValues != null)
				msgs = ((InternalEObject)calculatedValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.LEAD_ROLE_PATH_TYPE__CALCULATED_VALUES, null, msgs);
			if (newCalculatedValues != null)
				msgs = ((InternalEObject)newCalculatedValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.LEAD_ROLE_PATH_TYPE__CALCULATED_VALUES, null, msgs);
			msgs = basicSetCalculatedValues(newCalculatedValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.LEAD_ROLE_PATH_TYPE__CALCULATED_VALUES, newCalculatedValues, newCalculatedValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionsType getConditions() {
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditions(ConditionsType newConditions, NotificationChain msgs) {
		ConditionsType oldConditions = conditions;
		conditions = newConditions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.LEAD_ROLE_PATH_TYPE__CONDITIONS, oldConditions, newConditions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditions(ConditionsType newConditions) {
		if (newConditions != conditions) {
			NotificationChain msgs = null;
			if (conditions != null)
				msgs = ((InternalEObject)conditions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.LEAD_ROLE_PATH_TYPE__CONDITIONS, null, msgs);
			if (newConditions != null)
				msgs = ((InternalEObject)newConditions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.LEAD_ROLE_PATH_TYPE__CONDITIONS, null, msgs);
			msgs = basicSetConditions(newConditions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.LEAD_ROLE_PATH_TYPE__CONDITIONS, newConditions, newConditions));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.LEAD_ROLE_PATH_TYPE__NOTES, oldNotes, newNotes);
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
				msgs = ((InternalEObject)notes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.LEAD_ROLE_PATH_TYPE__NOTES, null, msgs);
			if (newNotes != null)
				msgs = ((InternalEObject)newNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.LEAD_ROLE_PATH_TYPE__NOTES, null, msgs);
			msgs = basicSetNotes(newNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.LEAD_ROLE_PATH_TYPE__NOTES, newNotes, newNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.LEAD_ROLE_PATH_TYPE__OBJECT_UNIFIERS:
				return basicSetObjectUnifiers(null, msgs);
			case CorePackage.LEAD_ROLE_PATH_TYPE__SUBQUERY_PARAMETER_INPUTS:
				return basicSetSubqueryParameterInputs(null, msgs);
			case CorePackage.LEAD_ROLE_PATH_TYPE__CALCULATED_VALUES:
				return basicSetCalculatedValues(null, msgs);
			case CorePackage.LEAD_ROLE_PATH_TYPE__CONDITIONS:
				return basicSetConditions(null, msgs);
			case CorePackage.LEAD_ROLE_PATH_TYPE__NOTES:
				return basicSetNotes(null, msgs);
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
			case CorePackage.LEAD_ROLE_PATH_TYPE__OBJECT_UNIFIERS:
				return getObjectUnifiers();
			case CorePackage.LEAD_ROLE_PATH_TYPE__SUBQUERY_PARAMETER_INPUTS:
				return getSubqueryParameterInputs();
			case CorePackage.LEAD_ROLE_PATH_TYPE__CALCULATED_VALUES:
				return getCalculatedValues();
			case CorePackage.LEAD_ROLE_PATH_TYPE__CONDITIONS:
				return getConditions();
			case CorePackage.LEAD_ROLE_PATH_TYPE__NOTES:
				return getNotes();
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
			case CorePackage.LEAD_ROLE_PATH_TYPE__OBJECT_UNIFIERS:
				setObjectUnifiers((ObjectUnifiersType)newValue);
				return;
			case CorePackage.LEAD_ROLE_PATH_TYPE__SUBQUERY_PARAMETER_INPUTS:
				setSubqueryParameterInputs((SubqueryParameterInputsType)newValue);
				return;
			case CorePackage.LEAD_ROLE_PATH_TYPE__CALCULATED_VALUES:
				setCalculatedValues((CalculatedValuesType1)newValue);
				return;
			case CorePackage.LEAD_ROLE_PATH_TYPE__CONDITIONS:
				setConditions((ConditionsType)newValue);
				return;
			case CorePackage.LEAD_ROLE_PATH_TYPE__NOTES:
				setNotes((NotesType)newValue);
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
			case CorePackage.LEAD_ROLE_PATH_TYPE__OBJECT_UNIFIERS:
				setObjectUnifiers((ObjectUnifiersType)null);
				return;
			case CorePackage.LEAD_ROLE_PATH_TYPE__SUBQUERY_PARAMETER_INPUTS:
				setSubqueryParameterInputs((SubqueryParameterInputsType)null);
				return;
			case CorePackage.LEAD_ROLE_PATH_TYPE__CALCULATED_VALUES:
				setCalculatedValues((CalculatedValuesType1)null);
				return;
			case CorePackage.LEAD_ROLE_PATH_TYPE__CONDITIONS:
				setConditions((ConditionsType)null);
				return;
			case CorePackage.LEAD_ROLE_PATH_TYPE__NOTES:
				setNotes((NotesType)null);
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
			case CorePackage.LEAD_ROLE_PATH_TYPE__OBJECT_UNIFIERS:
				return objectUnifiers != null;
			case CorePackage.LEAD_ROLE_PATH_TYPE__SUBQUERY_PARAMETER_INPUTS:
				return subqueryParameterInputs != null;
			case CorePackage.LEAD_ROLE_PATH_TYPE__CALCULATED_VALUES:
				return calculatedValues != null;
			case CorePackage.LEAD_ROLE_PATH_TYPE__CONDITIONS:
				return conditions != null;
			case CorePackage.LEAD_ROLE_PATH_TYPE__NOTES:
				return notes != null;
		}
		return super.eIsSet(featureID);
	}

} //LeadRolePathTypeImpl
