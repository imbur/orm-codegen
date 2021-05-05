/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Role Sequence Join Path Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A role path used to define the path between roles in different fact types in the same join path.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceJoinPathType#getJoinPathProjections <em>Join Path Projections</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceJoinPathType#isIsAutomatic <em>Is Automatic</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintRoleSequenceJoinPathType()
 * @model extendedMetaData="name='ConstraintRoleSequenceJoinPathType' kind='elementOnly'"
 * @generated
 */
public interface ConstraintRoleSequenceJoinPathType extends RolePathOwnerType {
	/**
	 * Returns the value of the '<em><b>Join Path Projections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for different sets of path projections.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Join Path Projections</em>' containment reference.
	 * @see #setJoinPathProjections(JoinPathProjectionsType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintRoleSequenceJoinPathType_JoinPathProjections()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='JoinPathProjections' namespace='##targetNamespace'"
	 * @generated
	 */
	JoinPathProjectionsType getJoinPathProjections();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceJoinPathType#getJoinPathProjections <em>Join Path Projections</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Path Projections</em>' containment reference.
	 * @see #getJoinPathProjections()
	 * @generated
	 */
	void setJoinPathProjections(JoinPathProjectionsType value);

	/**
	 * Returns the value of the '<em><b>Is Automatic</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The join path is automatically created from the constraint sequence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Automatic</em>' attribute.
	 * @see #isSetIsAutomatic()
	 * @see #unsetIsAutomatic()
	 * @see #setIsAutomatic(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintRoleSequenceJoinPathType_IsAutomatic()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsAutomatic'"
	 * @generated
	 */
	boolean isIsAutomatic();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceJoinPathType#isIsAutomatic <em>Is Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Automatic</em>' attribute.
	 * @see #isSetIsAutomatic()
	 * @see #unsetIsAutomatic()
	 * @see #isIsAutomatic()
	 * @generated
	 */
	void setIsAutomatic(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceJoinPathType#isIsAutomatic <em>Is Automatic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsAutomatic()
	 * @see #isIsAutomatic()
	 * @see #setIsAutomatic(boolean)
	 * @generated
	 */
	void unsetIsAutomatic();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ConstraintRoleSequenceJoinPathType#isIsAutomatic <em>Is Automatic</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Automatic</em>' attribute is set.
	 * @see #unsetIsAutomatic()
	 * @see #isIsAutomatic()
	 * @see #setIsAutomatic(boolean)
	 * @generated
	 */
	boolean isSetIsAutomatic();

} // ConstraintRoleSequenceJoinPathType
