/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact Type Shape Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getRelativeShapes <em>Relative Shapes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getSubject <em>Subject</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getRoleDisplayOrder <em>Role Display Order</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getConstraintDisplayPosition <em>Constraint Display Position</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#isDisplayAsObjectType <em>Display As Object Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getDisplayOrientation <em>Display Orientation</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getDisplayRelatedTypes <em>Display Related Types</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getDisplayRoleNames <em>Display Role Names</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#isExpandRefMode <em>Expand Ref Mode</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getFactTypeShapeType()
 * @model extendedMetaData="name='FactTypeShapeType' kind='elementOnly'"
 * @generated
 */
public interface FactTypeShapeType extends ShapeType {
	/**
	 * Returns the value of the '<em><b>Relative Shapes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Shapes</em>' containment reference.
	 * @see #setRelativeShapes(RelativeShapesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getFactTypeShapeType_RelativeShapes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RelativeShapes' namespace='##targetNamespace'"
	 * @generated
	 */
	RelativeShapesType getRelativeShapes();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getRelativeShapes <em>Relative Shapes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Shapes</em>' containment reference.
	 * @see #getRelativeShapes()
	 * @generated
	 */
	void setRelativeShapes(RelativeShapesType value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(SubjectRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getFactTypeShapeType_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Subject' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjectRef getSubject();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(SubjectRef value);

	/**
	 * Returns the value of the '<em><b>Role Display Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Display Order</em>' containment reference.
	 * @see #setRoleDisplayOrder(RoleDisplayOrderType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getFactTypeShapeType_RoleDisplayOrder()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RoleDisplayOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	RoleDisplayOrderType getRoleDisplayOrder();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getRoleDisplayOrder <em>Role Display Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Display Order</em>' containment reference.
	 * @see #getRoleDisplayOrder()
	 * @generated
	 */
	void setRoleDisplayOrder(RoleDisplayOrderType value);

	/**
	 * Returns the value of the '<em><b>Constraint Display Position</b></em>' attribute.
	 * The default value is <code>"Top"</code>.
	 * The literals are from the enumeration {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ConstraintDisplayPositionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Display Position</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ConstraintDisplayPositionType
	 * @see #isSetConstraintDisplayPosition()
	 * @see #unsetConstraintDisplayPosition()
	 * @see #setConstraintDisplayPosition(ConstraintDisplayPositionType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getFactTypeShapeType_ConstraintDisplayPosition()
	 * @model default="Top" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='ConstraintDisplayPosition'"
	 * @generated
	 */
	ConstraintDisplayPositionType getConstraintDisplayPosition();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getConstraintDisplayPosition <em>Constraint Display Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint Display Position</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.ConstraintDisplayPositionType
	 * @see #isSetConstraintDisplayPosition()
	 * @see #unsetConstraintDisplayPosition()
	 * @see #getConstraintDisplayPosition()
	 * @generated
	 */
	void setConstraintDisplayPosition(ConstraintDisplayPositionType value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getConstraintDisplayPosition <em>Constraint Display Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetConstraintDisplayPosition()
	 * @see #getConstraintDisplayPosition()
	 * @see #setConstraintDisplayPosition(ConstraintDisplayPositionType)
	 * @generated
	 */
	void unsetConstraintDisplayPosition();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getConstraintDisplayPosition <em>Constraint Display Position</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Constraint Display Position</em>' attribute is set.
	 * @see #unsetConstraintDisplayPosition()
	 * @see #getConstraintDisplayPosition()
	 * @see #setConstraintDisplayPosition(ConstraintDisplayPositionType)
	 * @generated
	 */
	boolean isSetConstraintDisplayPosition();

	/**
	 * Returns the value of the '<em><b>Display As Object Type</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display As Object Type</em>' attribute.
	 * @see #isSetDisplayAsObjectType()
	 * @see #unsetDisplayAsObjectType()
	 * @see #setDisplayAsObjectType(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getFactTypeShapeType_DisplayAsObjectType()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='DisplayAsObjectType'"
	 * @generated
	 */
	boolean isDisplayAsObjectType();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#isDisplayAsObjectType <em>Display As Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display As Object Type</em>' attribute.
	 * @see #isSetDisplayAsObjectType()
	 * @see #unsetDisplayAsObjectType()
	 * @see #isDisplayAsObjectType()
	 * @generated
	 */
	void setDisplayAsObjectType(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#isDisplayAsObjectType <em>Display As Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayAsObjectType()
	 * @see #isDisplayAsObjectType()
	 * @see #setDisplayAsObjectType(boolean)
	 * @generated
	 */
	void unsetDisplayAsObjectType();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#isDisplayAsObjectType <em>Display As Object Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display As Object Type</em>' attribute is set.
	 * @see #unsetDisplayAsObjectType()
	 * @see #isDisplayAsObjectType()
	 * @see #setDisplayAsObjectType(boolean)
	 * @generated
	 */
	boolean isSetDisplayAsObjectType();

	/**
	 * Returns the value of the '<em><b>Display Orientation</b></em>' attribute.
	 * The default value is <code>"Horizontal"</code>.
	 * The literals are from the enumeration {@link edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayOrientationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Orientation</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayOrientationType
	 * @see #isSetDisplayOrientation()
	 * @see #unsetDisplayOrientation()
	 * @see #setDisplayOrientation(DisplayOrientationType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getFactTypeShapeType_DisplayOrientation()
	 * @model default="Horizontal" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='DisplayOrientation'"
	 * @generated
	 */
	DisplayOrientationType getDisplayOrientation();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getDisplayOrientation <em>Display Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Orientation</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayOrientationType
	 * @see #isSetDisplayOrientation()
	 * @see #unsetDisplayOrientation()
	 * @see #getDisplayOrientation()
	 * @generated
	 */
	void setDisplayOrientation(DisplayOrientationType value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getDisplayOrientation <em>Display Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayOrientation()
	 * @see #getDisplayOrientation()
	 * @see #setDisplayOrientation(DisplayOrientationType)
	 * @generated
	 */
	void unsetDisplayOrientation();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getDisplayOrientation <em>Display Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Orientation</em>' attribute is set.
	 * @see #unsetDisplayOrientation()
	 * @see #getDisplayOrientation()
	 * @see #setDisplayOrientation(DisplayOrientationType)
	 * @generated
	 */
	boolean isSetDisplayOrientation();

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
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getFactTypeShapeType_DisplayRelatedTypes()
	 * @model default="AttachAllTypes" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='DisplayRelatedTypes'"
	 * @generated
	 */
	DisplayRelatedTypesType getDisplayRelatedTypes();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getDisplayRelatedTypes <em>Display Related Types</em>}' attribute.
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
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getDisplayRelatedTypes <em>Display Related Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayRelatedTypes()
	 * @see #getDisplayRelatedTypes()
	 * @see #setDisplayRelatedTypes(DisplayRelatedTypesType)
	 * @generated
	 */
	void unsetDisplayRelatedTypes();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getDisplayRelatedTypes <em>Display Related Types</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Display Role Names</b></em>' attribute.
	 * The default value is <code>"UserDefault"</code>.
	 * The literals are from the enumeration {@link edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRoleNamesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Role Names</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRoleNamesType
	 * @see #isSetDisplayRoleNames()
	 * @see #unsetDisplayRoleNames()
	 * @see #setDisplayRoleNames(DisplayRoleNamesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getFactTypeShapeType_DisplayRoleNames()
	 * @model default="UserDefault" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='DisplayRoleNames'"
	 * @generated
	 */
	DisplayRoleNamesType getDisplayRoleNames();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getDisplayRoleNames <em>Display Role Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Role Names</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRoleNamesType
	 * @see #isSetDisplayRoleNames()
	 * @see #unsetDisplayRoleNames()
	 * @see #getDisplayRoleNames()
	 * @generated
	 */
	void setDisplayRoleNames(DisplayRoleNamesType value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getDisplayRoleNames <em>Display Role Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayRoleNames()
	 * @see #getDisplayRoleNames()
	 * @see #setDisplayRoleNames(DisplayRoleNamesType)
	 * @generated
	 */
	void unsetDisplayRoleNames();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#getDisplayRoleNames <em>Display Role Names</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Role Names</em>' attribute is set.
	 * @see #unsetDisplayRoleNames()
	 * @see #getDisplayRoleNames()
	 * @see #setDisplayRoleNames(DisplayRoleNamesType)
	 * @generated
	 */
	boolean isSetDisplayRoleNames();

	/**
	 * Returns the value of the '<em><b>Expand Ref Mode</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expand Ref Mode</em>' attribute.
	 * @see #isSetExpandRefMode()
	 * @see #unsetExpandRefMode()
	 * @see #setExpandRefMode(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getFactTypeShapeType_ExpandRefMode()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='ExpandRefMode'"
	 * @generated
	 */
	boolean isExpandRefMode();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#isExpandRefMode <em>Expand Ref Mode</em>}' attribute.
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
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#isExpandRefMode <em>Expand Ref Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExpandRefMode()
	 * @see #isExpandRefMode()
	 * @see #setExpandRefMode(boolean)
	 * @generated
	 */
	void unsetExpandRefMode();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType#isExpandRefMode <em>Expand Ref Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Expand Ref Mode</em>' attribute is set.
	 * @see #unsetExpandRefMode()
	 * @see #isExpandRefMode()
	 * @see #setExpandRefMode(boolean)
	 * @generated
	 */
	boolean isSetExpandRefMode();

} // FactTypeShapeType
