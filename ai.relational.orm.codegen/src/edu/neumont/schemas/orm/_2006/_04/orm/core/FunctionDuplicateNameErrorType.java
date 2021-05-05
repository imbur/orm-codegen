/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Duplicate Name Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Multiple functions have the same name.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionDuplicateNameErrorType#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFunctionDuplicateNameErrorType()
 * @model extendedMetaData="name='FunctionDuplicateNameErrorType' kind='elementOnly'"
 * @generated
 */
public interface FunctionDuplicateNameErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Like-named functions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference.
	 * @see #setFunctions(FunctionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFunctionDuplicateNameErrorType_Functions()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Functions' namespace='##targetNamespace'"
	 * @generated
	 */
	FunctionsType getFunctions();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FunctionDuplicateNameErrorType#getFunctions <em>Functions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functions</em>' containment reference.
	 * @see #getFunctions()
	 * @generated
	 */
	void setFunctions(FunctionsType value);

} // FunctionDuplicateNameErrorType
