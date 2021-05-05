/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType#getAbsoluteBounds <em>Absolute Bounds</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType#isIsExpanded <em>Is Expanded</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getShapeType()
 * @model abstract="true"
 *        extendedMetaData="name='ShapeType' kind='empty'"
 * @generated
 */
public interface ShapeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Absolute Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Bounds</em>' attribute.
	 * @see #setAbsoluteBounds(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getShapeType_AbsoluteBounds()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='AbsoluteBounds'"
	 * @generated
	 */
	String getAbsoluteBounds();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType#getAbsoluteBounds <em>Absolute Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Bounds</em>' attribute.
	 * @see #getAbsoluteBounds()
	 * @generated
	 */
	void setAbsoluteBounds(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getShapeType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Is Expanded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Expanded</em>' attribute.
	 * @see #isSetIsExpanded()
	 * @see #unsetIsExpanded()
	 * @see #setIsExpanded(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getShapeType_IsExpanded()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='IsExpanded'"
	 * @generated
	 */
	boolean isIsExpanded();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType#isIsExpanded <em>Is Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Expanded</em>' attribute.
	 * @see #isSetIsExpanded()
	 * @see #unsetIsExpanded()
	 * @see #isIsExpanded()
	 * @generated
	 */
	void setIsExpanded(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType#isIsExpanded <em>Is Expanded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsExpanded()
	 * @see #isIsExpanded()
	 * @see #setIsExpanded(boolean)
	 * @generated
	 */
	void unsetIsExpanded();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType#isIsExpanded <em>Is Expanded</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Expanded</em>' attribute is set.
	 * @see #unsetIsExpanded()
	 * @see #isIsExpanded()
	 * @see #setIsExpanded(boolean)
	 * @generated
	 */
	boolean isSetIsExpanded();

} // ShapeType
