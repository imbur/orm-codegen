/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ModelNoteReferencedByType;
import edu.neumont.schemas.orm._2006._04.orm.core.ModelNoteType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Note Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ModelNoteTypeImpl#getReferencedBy <em>Referenced By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelNoteTypeImpl extends NoteTypeImpl implements ModelNoteType {
	/**
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected ModelNoteReferencedByType referencedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelNoteTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getModelNoteType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelNoteReferencedByType getReferencedBy() {
		return referencedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferencedBy(ModelNoteReferencedByType newReferencedBy, NotificationChain msgs) {
		ModelNoteReferencedByType oldReferencedBy = referencedBy;
		referencedBy = newReferencedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.MODEL_NOTE_TYPE__REFERENCED_BY, oldReferencedBy, newReferencedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedBy(ModelNoteReferencedByType newReferencedBy) {
		if (newReferencedBy != referencedBy) {
			NotificationChain msgs = null;
			if (referencedBy != null)
				msgs = ((InternalEObject)referencedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.MODEL_NOTE_TYPE__REFERENCED_BY, null, msgs);
			if (newReferencedBy != null)
				msgs = ((InternalEObject)newReferencedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.MODEL_NOTE_TYPE__REFERENCED_BY, null, msgs);
			msgs = basicSetReferencedBy(newReferencedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MODEL_NOTE_TYPE__REFERENCED_BY, newReferencedBy, newReferencedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.MODEL_NOTE_TYPE__REFERENCED_BY:
				return basicSetReferencedBy(null, msgs);
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
			case CorePackage.MODEL_NOTE_TYPE__REFERENCED_BY:
				return getReferencedBy();
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
			case CorePackage.MODEL_NOTE_TYPE__REFERENCED_BY:
				setReferencedBy((ModelNoteReferencedByType)newValue);
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
			case CorePackage.MODEL_NOTE_TYPE__REFERENCED_BY:
				setReferencedBy((ModelNoteReferencedByType)null);
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
			case CorePackage.MODEL_NOTE_TYPE__REFERENCED_BY:
				return referencedBy != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelNoteTypeImpl
