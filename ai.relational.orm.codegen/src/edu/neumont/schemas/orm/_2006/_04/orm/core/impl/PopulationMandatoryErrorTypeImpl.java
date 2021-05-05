/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.MandatoryConstraintRef;
import edu.neumont.schemas.orm._2006._04.orm.core.ObjectTypeInstanceRef;
import edu.neumont.schemas.orm._2006._04.orm.core.PopulationMandatoryErrorType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Population Mandatory Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PopulationMandatoryErrorTypeImpl#getObjectTypeInstance <em>Object Type Instance</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.PopulationMandatoryErrorTypeImpl#getMandatoryConstraint <em>Mandatory Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PopulationMandatoryErrorTypeImpl extends ModelErrorImpl implements PopulationMandatoryErrorType {
	/**
	 * The cached value of the '{@link #getObjectTypeInstance() <em>Object Type Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectTypeInstance()
	 * @generated
	 * @ordered
	 */
	protected ObjectTypeInstanceRef objectTypeInstance;

	/**
	 * The cached value of the '{@link #getMandatoryConstraint() <em>Mandatory Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryConstraint()
	 * @generated
	 * @ordered
	 */
	protected MandatoryConstraintRef mandatoryConstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PopulationMandatoryErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getPopulationMandatoryErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTypeInstanceRef getObjectTypeInstance() {
		return objectTypeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectTypeInstance(ObjectTypeInstanceRef newObjectTypeInstance, NotificationChain msgs) {
		ObjectTypeInstanceRef oldObjectTypeInstance = objectTypeInstance;
		objectTypeInstance = newObjectTypeInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.POPULATION_MANDATORY_ERROR_TYPE__OBJECT_TYPE_INSTANCE, oldObjectTypeInstance, newObjectTypeInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectTypeInstance(ObjectTypeInstanceRef newObjectTypeInstance) {
		if (newObjectTypeInstance != objectTypeInstance) {
			NotificationChain msgs = null;
			if (objectTypeInstance != null)
				msgs = ((InternalEObject)objectTypeInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.POPULATION_MANDATORY_ERROR_TYPE__OBJECT_TYPE_INSTANCE, null, msgs);
			if (newObjectTypeInstance != null)
				msgs = ((InternalEObject)newObjectTypeInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.POPULATION_MANDATORY_ERROR_TYPE__OBJECT_TYPE_INSTANCE, null, msgs);
			msgs = basicSetObjectTypeInstance(newObjectTypeInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.POPULATION_MANDATORY_ERROR_TYPE__OBJECT_TYPE_INSTANCE, newObjectTypeInstance, newObjectTypeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MandatoryConstraintRef getMandatoryConstraint() {
		return mandatoryConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMandatoryConstraint(MandatoryConstraintRef newMandatoryConstraint, NotificationChain msgs) {
		MandatoryConstraintRef oldMandatoryConstraint = mandatoryConstraint;
		mandatoryConstraint = newMandatoryConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.POPULATION_MANDATORY_ERROR_TYPE__MANDATORY_CONSTRAINT, oldMandatoryConstraint, newMandatoryConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatoryConstraint(MandatoryConstraintRef newMandatoryConstraint) {
		if (newMandatoryConstraint != mandatoryConstraint) {
			NotificationChain msgs = null;
			if (mandatoryConstraint != null)
				msgs = ((InternalEObject)mandatoryConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.POPULATION_MANDATORY_ERROR_TYPE__MANDATORY_CONSTRAINT, null, msgs);
			if (newMandatoryConstraint != null)
				msgs = ((InternalEObject)newMandatoryConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.POPULATION_MANDATORY_ERROR_TYPE__MANDATORY_CONSTRAINT, null, msgs);
			msgs = basicSetMandatoryConstraint(newMandatoryConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.POPULATION_MANDATORY_ERROR_TYPE__MANDATORY_CONSTRAINT, newMandatoryConstraint, newMandatoryConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.POPULATION_MANDATORY_ERROR_TYPE__OBJECT_TYPE_INSTANCE:
				return basicSetObjectTypeInstance(null, msgs);
			case CorePackage.POPULATION_MANDATORY_ERROR_TYPE__MANDATORY_CONSTRAINT:
				return basicSetMandatoryConstraint(null, msgs);
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
			case CorePackage.POPULATION_MANDATORY_ERROR_TYPE__OBJECT_TYPE_INSTANCE:
				return getObjectTypeInstance();
			case CorePackage.POPULATION_MANDATORY_ERROR_TYPE__MANDATORY_CONSTRAINT:
				return getMandatoryConstraint();
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
			case CorePackage.POPULATION_MANDATORY_ERROR_TYPE__OBJECT_TYPE_INSTANCE:
				setObjectTypeInstance((ObjectTypeInstanceRef)newValue);
				return;
			case CorePackage.POPULATION_MANDATORY_ERROR_TYPE__MANDATORY_CONSTRAINT:
				setMandatoryConstraint((MandatoryConstraintRef)newValue);
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
			case CorePackage.POPULATION_MANDATORY_ERROR_TYPE__OBJECT_TYPE_INSTANCE:
				setObjectTypeInstance((ObjectTypeInstanceRef)null);
				return;
			case CorePackage.POPULATION_MANDATORY_ERROR_TYPE__MANDATORY_CONSTRAINT:
				setMandatoryConstraint((MandatoryConstraintRef)null);
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
			case CorePackage.POPULATION_MANDATORY_ERROR_TYPE__OBJECT_TYPE_INSTANCE:
				return objectTypeInstance != null;
			case CorePackage.POPULATION_MANDATORY_ERROR_TYPE__MANDATORY_CONSTRAINT:
				return mandatoryConstraint != null;
		}
		return super.eIsSet(featureID);
	}

} //PopulationMandatoryErrorTypeImpl
