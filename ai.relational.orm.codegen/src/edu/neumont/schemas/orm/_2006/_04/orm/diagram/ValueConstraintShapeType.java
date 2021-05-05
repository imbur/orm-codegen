/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Constraint Shape Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType#getSubject <em>Subject</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType#getMaximumDisplayedColumns <em>Maximum Displayed Columns</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType#getMaximumDisplayedValues <em>Maximum Displayed Values</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getValueConstraintShapeType()
 * @model extendedMetaData="name='ValueConstraintShapeType' kind='elementOnly'"
 * @generated
 */
public interface ValueConstraintShapeType extends ShapeType {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(SubjectRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getValueConstraintShapeType_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Subject' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjectRef getSubject();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(SubjectRef value);

	/**
	 * Returns the value of the '<em><b>Maximum Displayed Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum number of columns to be used to display the values and ranges in this shape.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Displayed Columns</em>' attribute.
	 * @see #isSetMaximumDisplayedColumns()
	 * @see #unsetMaximumDisplayedColumns()
	 * @see #setMaximumDisplayedColumns(short)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getValueConstraintShapeType_MaximumDisplayedColumns()
	 * @model unsettable="true" dataType="edu.neumont.schemas.orm._2006._04.orm.diagram.MaximumDisplayedColumnsType"
	 *        extendedMetaData="kind='attribute' name='MaximumDisplayedColumns'"
	 * @generated
	 */
	short getMaximumDisplayedColumns();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType#getMaximumDisplayedColumns <em>Maximum Displayed Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Displayed Columns</em>' attribute.
	 * @see #isSetMaximumDisplayedColumns()
	 * @see #unsetMaximumDisplayedColumns()
	 * @see #getMaximumDisplayedColumns()
	 * @generated
	 */
	void setMaximumDisplayedColumns(short value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType#getMaximumDisplayedColumns <em>Maximum Displayed Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumDisplayedColumns()
	 * @see #getMaximumDisplayedColumns()
	 * @see #setMaximumDisplayedColumns(short)
	 * @generated
	 */
	void unsetMaximumDisplayedColumns();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType#getMaximumDisplayedColumns <em>Maximum Displayed Columns</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Displayed Columns</em>' attribute is set.
	 * @see #unsetMaximumDisplayedColumns()
	 * @see #getMaximumDisplayedColumns()
	 * @see #setMaximumDisplayedColumns(short)
	 * @generated
	 */
	boolean isSetMaximumDisplayedColumns();

	/**
	 * Returns the value of the '<em><b>Maximum Displayed Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The maximum total number of values and ranges to be displayed with this shape.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Displayed Values</em>' attribute.
	 * @see #isSetMaximumDisplayedValues()
	 * @see #unsetMaximumDisplayedValues()
	 * @see #setMaximumDisplayedValues(short)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getValueConstraintShapeType_MaximumDisplayedValues()
	 * @model unsettable="true" dataType="edu.neumont.schemas.orm._2006._04.orm.diagram.MaximumDisplayedValuesType"
	 *        extendedMetaData="kind='attribute' name='MaximumDisplayedValues'"
	 * @generated
	 */
	short getMaximumDisplayedValues();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType#getMaximumDisplayedValues <em>Maximum Displayed Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Displayed Values</em>' attribute.
	 * @see #isSetMaximumDisplayedValues()
	 * @see #unsetMaximumDisplayedValues()
	 * @see #getMaximumDisplayedValues()
	 * @generated
	 */
	void setMaximumDisplayedValues(short value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType#getMaximumDisplayedValues <em>Maximum Displayed Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximumDisplayedValues()
	 * @see #getMaximumDisplayedValues()
	 * @see #setMaximumDisplayedValues(short)
	 * @generated
	 */
	void unsetMaximumDisplayedValues();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType#getMaximumDisplayedValues <em>Maximum Displayed Values</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximum Displayed Values</em>' attribute is set.
	 * @see #unsetMaximumDisplayedValues()
	 * @see #getMaximumDisplayedValues()
	 * @see #setMaximumDisplayedValues(short)
	 * @generated
	 */
	boolean isSetMaximumDisplayedValues();

} // ValueConstraintShapeType
