/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partial Join Path Projection Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A join path projection must project on all roles in the constraint role sequence.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.PartialJoinPathProjectionErrorType#getJoinPathProjection <em>Join Path Projection</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPartialJoinPathProjectionErrorType()
 * @model extendedMetaData="name='PartialJoinPathProjectionErrorType' kind='elementOnly'"
 * @generated
 */
public interface PartialJoinPathProjectionErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Join Path Projection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Path Projection</em>' containment reference.
	 * @see #setJoinPathProjection(JoinPathProjectionRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPartialJoinPathProjectionErrorType_JoinPathProjection()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='JoinPathProjection' namespace='##targetNamespace'"
	 * @generated
	 */
	JoinPathProjectionRef getJoinPathProjection();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.PartialJoinPathProjectionErrorType#getJoinPathProjection <em>Join Path Projection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Path Projection</em>' containment reference.
	 * @see #getJoinPathProjection()
	 * @generated
	 */
	void setJoinPathProjection(JoinPathProjectionRef value);

} // PartialJoinPathProjectionErrorType
