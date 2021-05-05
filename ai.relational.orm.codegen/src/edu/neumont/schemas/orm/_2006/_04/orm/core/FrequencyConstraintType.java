/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frequency Constraint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A constraint specifying the number of times an instance must occur in a set population. Applies only if the instance appears at all.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintType#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintType#getMaxFrequency <em>Max Frequency</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintType#getMinFrequency <em>Min Frequency</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFrequencyConstraintType()
 * @model extendedMetaData="name='FrequencyConstraintType' kind='elementOnly'"
 * @generated
 */
public interface FrequencyConstraintType extends SetConstraintWithJoinType {
	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference.
	 * @see #setExtensions(ExtensionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFrequencyConstraintType_Extensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Extensions' namespace='##targetNamespace'"
	 * @generated
	 */
	ExtensionsType getExtensions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintType#getExtensions <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extensions</em>' containment reference.
	 * @see #getExtensions()
	 * @generated
	 */
	void setExtensions(ExtensionsType value);

	/**
	 * Returns the value of the '<em><b>Max Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of times an instance must be played by the constrained role(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Frequency</em>' attribute.
	 * @see #isSetMaxFrequency()
	 * @see #unsetMaxFrequency()
	 * @see #setMaxFrequency(int)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFrequencyConstraintType_MaxFrequency()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='MaxFrequency'"
	 * @generated
	 */
	int getMaxFrequency();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintType#getMaxFrequency <em>Max Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Frequency</em>' attribute.
	 * @see #isSetMaxFrequency()
	 * @see #unsetMaxFrequency()
	 * @see #getMaxFrequency()
	 * @generated
	 */
	void setMaxFrequency(int value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintType#getMaxFrequency <em>Max Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxFrequency()
	 * @see #getMaxFrequency()
	 * @see #setMaxFrequency(int)
	 * @generated
	 */
	void unsetMaxFrequency();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintType#getMaxFrequency <em>Max Frequency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Frequency</em>' attribute is set.
	 * @see #unsetMaxFrequency()
	 * @see #getMaxFrequency()
	 * @see #setMaxFrequency(int)
	 * @generated
	 */
	boolean isSetMaxFrequency();

	/**
	 * Returns the value of the '<em><b>Min Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The minimum number of times an instance must be played by the constrained role(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Frequency</em>' attribute.
	 * @see #isSetMinFrequency()
	 * @see #unsetMinFrequency()
	 * @see #setMinFrequency(int)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFrequencyConstraintType_MinFrequency()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='MinFrequency'"
	 * @generated
	 */
	int getMinFrequency();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintType#getMinFrequency <em>Min Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Frequency</em>' attribute.
	 * @see #isSetMinFrequency()
	 * @see #unsetMinFrequency()
	 * @see #getMinFrequency()
	 * @generated
	 */
	void setMinFrequency(int value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintType#getMinFrequency <em>Min Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinFrequency()
	 * @see #getMinFrequency()
	 * @see #setMinFrequency(int)
	 * @generated
	 */
	void unsetMinFrequency();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FrequencyConstraintType#getMinFrequency <em>Min Frequency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Frequency</em>' attribute is set.
	 * @see #unsetMinFrequency()
	 * @see #getMinFrequency()
	 * @see #setMinFrequency(int)
	 * @generated
	 */
	boolean isSetMinFrequency();

} // FrequencyConstraintType
