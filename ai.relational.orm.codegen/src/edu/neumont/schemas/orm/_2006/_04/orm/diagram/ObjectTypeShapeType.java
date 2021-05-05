/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Type Shape Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#getRelativeShapes <em>Relative Shapes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#getSubject <em>Subject</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#getDisplayRelatedTypes <em>Display Related Types</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#isExpandRefMode <em>Expand Ref Mode</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getObjectTypeShapeType()
 * @model extendedMetaData="name='ObjectTypeShapeType' kind='elementOnly'"
 * @generated
 */
public interface ObjectTypeShapeType extends ShapeType {
	/**
	 * Returns the value of the '<em><b>Relative Shapes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Shapes</em>' containment reference.
	 * @see #setRelativeShapes(RelativeShapesType1)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getObjectTypeShapeType_RelativeShapes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RelativeShapes' namespace='##targetNamespace'"
	 * @generated
	 */
	RelativeShapesType1 getRelativeShapes();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#getRelativeShapes <em>Relative Shapes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Shapes</em>' containment reference.
	 * @see #getRelativeShapes()
	 * @generated
	 */
	void setRelativeShapes(RelativeShapesType1 value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(SubjectRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getObjectTypeShapeType_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Subject' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjectRef getSubject();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(SubjectRef value);

	/**
	 * Returns the value of the '<em><b>Display Related Types</b></em>' attribute.
	 * The default value is <code>"AttachAllTypes"</code>.
	 * The literals are from the enumeration {@link edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRelatedTypesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Related Types</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRelatedTypesType
	 * @see #isSetDisplayRelatedTypes()
	 * @see #unsetDisplayRelatedTypes()
	 * @see #setDisplayRelatedTypes(DisplayRelatedTypesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getObjectTypeShapeType_DisplayRelatedTypes()
	 * @model default="AttachAllTypes" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='DisplayRelatedTypes'"
	 * @generated
	 */
	DisplayRelatedTypesType getDisplayRelatedTypes();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#getDisplayRelatedTypes <em>Display Related Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Related Types</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRelatedTypesType
	 * @see #isSetDisplayRelatedTypes()
	 * @see #unsetDisplayRelatedTypes()
	 * @see #getDisplayRelatedTypes()
	 * @generated
	 */
	void setDisplayRelatedTypes(DisplayRelatedTypesType value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#getDisplayRelatedTypes <em>Display Related Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayRelatedTypes()
	 * @see #getDisplayRelatedTypes()
	 * @see #setDisplayRelatedTypes(DisplayRelatedTypesType)
	 * @generated
	 */
	void unsetDisplayRelatedTypes();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#getDisplayRelatedTypes <em>Display Related Types</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Related Types</em>' attribute is set.
	 * @see #unsetDisplayRelatedTypes()
	 * @see #getDisplayRelatedTypes()
	 * @see #setDisplayRelatedTypes(DisplayRelatedTypesType)
	 * @generated
	 */
	boolean isSetDisplayRelatedTypes();

	/**
	 * Returns the value of the '<em><b>Expand Ref Mode</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expand Ref Mode</em>' attribute.
	 * @see #isSetExpandRefMode()
	 * @see #unsetExpandRefMode()
	 * @see #setExpandRefMode(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getObjectTypeShapeType_ExpandRefMode()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ExpandRefMode'"
	 * @generated
	 */
	boolean isExpandRefMode();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#isExpandRefMode <em>Expand Ref Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expand Ref Mode</em>' attribute.
	 * @see #isSetExpandRefMode()
	 * @see #unsetExpandRefMode()
	 * @see #isExpandRefMode()
	 * @generated
	 */
	void setExpandRefMode(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#isExpandRefMode <em>Expand Ref Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExpandRefMode()
	 * @see #isExpandRefMode()
	 * @see #setExpandRefMode(boolean)
	 * @generated
	 */
	void unsetExpandRefMode();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType#isExpandRefMode <em>Expand Ref Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Expand Ref Mode</em>' attribute is set.
	 * @see #unsetExpandRefMode()
	 * @see #isExpandRefMode()
	 * @see #setExpandRefMode(boolean)
	 * @generated
	 */
	boolean isSetExpandRefMode();

} // ObjectTypeShapeType
