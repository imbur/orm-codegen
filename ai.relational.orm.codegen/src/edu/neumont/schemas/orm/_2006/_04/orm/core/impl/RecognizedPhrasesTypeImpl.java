/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhraseType;
import edu.neumont.schemas.orm._2006._04.orm.core.RecognizedPhrasesType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recognized Phrases Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.RecognizedPhrasesTypeImpl#getRecognizedPhrase <em>Recognized Phrase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecognizedPhrasesTypeImpl extends MinimalEObjectImpl.Container implements RecognizedPhrasesType {
	/**
	 * The cached value of the '{@link #getRecognizedPhrase() <em>Recognized Phrase</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecognizedPhrase()
	 * @generated
	 * @ordered
	 */
	protected EList<RecognizedPhraseType> recognizedPhrase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecognizedPhrasesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getRecognizedPhrasesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecognizedPhraseType> getRecognizedPhrase() {
		if (recognizedPhrase == null) {
			recognizedPhrase = new EObjectContainmentEList<RecognizedPhraseType>(RecognizedPhraseType.class, this, CorePackage.RECOGNIZED_PHRASES_TYPE__RECOGNIZED_PHRASE);
		}
		return recognizedPhrase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.RECOGNIZED_PHRASES_TYPE__RECOGNIZED_PHRASE:
				return ((InternalEList<?>)getRecognizedPhrase()).basicRemove(otherEnd, msgs);
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
			case CorePackage.RECOGNIZED_PHRASES_TYPE__RECOGNIZED_PHRASE:
				return getRecognizedPhrase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.RECOGNIZED_PHRASES_TYPE__RECOGNIZED_PHRASE:
				getRecognizedPhrase().clear();
				getRecognizedPhrase().addAll((Collection<? extends RecognizedPhraseType>)newValue);
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
			case CorePackage.RECOGNIZED_PHRASES_TYPE__RECOGNIZED_PHRASE:
				getRecognizedPhrase().clear();
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
			case CorePackage.RECOGNIZED_PHRASES_TYPE__RECOGNIZED_PHRASE:
				return recognizedPhrase != null && !recognizedPhrase.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RecognizedPhrasesTypeImpl
