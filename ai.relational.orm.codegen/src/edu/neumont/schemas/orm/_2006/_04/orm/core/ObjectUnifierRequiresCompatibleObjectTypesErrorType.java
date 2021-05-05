/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Unifier Requires Compatible Object Types Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ObjectUnifier unifies path nodes with incompatible object types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifierRequiresCompatibleObjectTypesErrorType#getObjectUnifier <em>Object Unifier</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectUnifierRequiresCompatibleObjectTypesErrorType()
 * @model extendedMetaData="name='ObjectUnifierRequiresCompatibleObjectTypesErrorType' kind='elementOnly'"
 * @generated
 */
public interface ObjectUnifierRequiresCompatibleObjectTypesErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Object Unifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Unifier</em>' containment reference.
	 * @see #setObjectUnifier(ObjectUnifierRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getObjectUnifierRequiresCompatibleObjectTypesErrorType_ObjectUnifier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ObjectUnifier' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectUnifierRef getObjectUnifier();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ObjectUnifierRequiresCompatibleObjectTypesErrorType#getObjectUnifier <em>Object Unifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Unifier</em>' containment reference.
	 * @see #getObjectUnifier()
	 * @generated
	 */
	void setObjectUnifier(ObjectUnifierRef value);

} // ObjectUnifierRequiresCompatibleObjectTypesErrorType
