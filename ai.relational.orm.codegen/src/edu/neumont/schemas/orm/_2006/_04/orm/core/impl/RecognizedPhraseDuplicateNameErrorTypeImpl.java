/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhraseDuplicateNameErrorType;
import edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhrasesType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recognized Phrase Duplicate Name Error Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RecognizedPhraseDuplicateNameErrorTypeImpl#getRecognizedPhrases <em>Recognized Phrases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecognizedPhraseDuplicateNameErrorTypeImpl extends ModelErrorImpl implements RecognizedPhraseDuplicateNameErrorType {
	/**
	 * The cached value of the '{@link #getRecognizedPhrases() <em>Recognized Phrases</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecognizedPhrases()
	 * @generated
	 * @ordered
	 */
	protected RecognizedPhrasesType1 recognizedPhrases;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecognizedPhraseDuplicateNameErrorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getRecognizedPhraseDuplicateNameErrorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecognizedPhrasesType1 getRecognizedPhrases() {
		return recognizedPhrases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecognizedPhrases(RecognizedPhrasesType1 newRecognizedPhrases, NotificationChain msgs) {
		RecognizedPhrasesType1 oldRecognizedPhrases = recognizedPhrases;
		recognizedPhrases = newRecognizedPhrases;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.RECOGNIZED_PHRASE_DUPLICATE_NAME_ERROR_TYPE__RECOGNIZED_PHRASES, oldRecognizedPhrases, newRecognizedPhrases);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecognizedPhrases(RecognizedPhrasesType1 newRecognizedPhrases) {
		if (newRecognizedPhrases != recognizedPhrases) {
			NotificationChain msgs = null;
			if (recognizedPhrases != null)
				msgs = ((InternalEObject)recognizedPhrases).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.RECOGNIZED_PHRASE_DUPLICATE_NAME_ERROR_TYPE__RECOGNIZED_PHRASES, null, msgs);
			if (newRecognizedPhrases != null)
				msgs = ((InternalEObject)newRecognizedPhrases).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.RECOGNIZED_PHRASE_DUPLICATE_NAME_ERROR_TYPE__RECOGNIZED_PHRASES, null, msgs);
			msgs = basicSetRecognizedPhrases(newRecognizedPhrases, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RECOGNIZED_PHRASE_DUPLICATE_NAME_ERROR_TYPE__RECOGNIZED_PHRASES, newRecognizedPhrases, newRecognizedPhrases));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.RECOGNIZED_PHRASE_DUPLICATE_NAME_ERROR_TYPE__RECOGNIZED_PHRASES:
				return basicSetRecognizedPhrases(null, msgs);
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
			case CorePackage.RECOGNIZED_PHRASE_DUPLICATE_NAME_ERROR_TYPE__RECOGNIZED_PHRASES:
				return getRecognizedPhrases();
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
			case CorePackage.RECOGNIZED_PHRASE_DUPLICATE_NAME_ERROR_TYPE__RECOGNIZED_PHRASES:
				setRecognizedPhrases((RecognizedPhrasesType1)newValue);
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
			case CorePackage.RECOGNIZED_PHRASE_DUPLICATE_NAME_ERROR_TYPE__RECOGNIZED_PHRASES:
				setRecognizedPhrases((RecognizedPhrasesType1)null);
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
			case CorePackage.RECOGNIZED_PHRASE_DUPLICATE_NAME_ERROR_TYPE__RECOGNIZED_PHRASES:
				return recognizedPhrases != null;
		}
		return super.eIsSet(featureID);
	}

} //RecognizedPhraseDuplicateNameErrorTypeImpl
