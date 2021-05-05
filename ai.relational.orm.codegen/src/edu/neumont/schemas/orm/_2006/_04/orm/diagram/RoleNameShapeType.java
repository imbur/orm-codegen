/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Name Shape Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleNameShapeType#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getRoleNameShapeType()
 * @model extendedMetaData="name='RoleNameShapeType' kind='elementOnly'"
 * @generated
 */
public interface RoleNameShapeType extends ShapeType {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(SubjectRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getRoleNameShapeType_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Subject' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjectRef getSubject();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleNameShapeType#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(SubjectRef value);

} // RoleNameShapeType
