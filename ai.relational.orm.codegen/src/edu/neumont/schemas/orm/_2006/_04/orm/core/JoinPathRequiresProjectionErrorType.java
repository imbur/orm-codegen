/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Path Requires Projection Error Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A constraint join path must be projected on at least one role path.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.JoinPathRequiresProjectionErrorType#getJoinPath <em>Join Path</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getJoinPathRequiresProjectionErrorType()
 * @model extendedMetaData="name='JoinPathRequiresProjectionErrorType' kind='elementOnly'"
 * @generated
 */
public interface JoinPathRequiresProjectionErrorType extends ModelError {
	/**
	 * Returns the value of the '<em><b>Join Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Path</em>' containment reference.
	 * @see #setJoinPath(ConstraintRoleSequenceJoinPathRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getJoinPathRequiresProjectionErrorType_JoinPath()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='JoinPath' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstraintRoleSequenceJoinPathRef getJoinPath();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.JoinPathRequiresProjectionErrorType#getJoinPath <em>Join Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Path</em>' containment reference.
	 * @see #getJoinPath()
	 * @generated
	 */
	void setJoinPath(ConstraintRoleSequenceJoinPathRef value);

} // JoinPathRequiresProjectionErrorType
