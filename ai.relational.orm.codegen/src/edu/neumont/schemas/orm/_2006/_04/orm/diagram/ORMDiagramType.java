/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ORM Diagram Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getShapes <em>Shapes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getSubject <em>Subject</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#isAutoPopulateShapes <em>Auto Populate Shapes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getBaseFontName <em>Base Font Name</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getBaseFontSize <em>Base Font Size</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#isIsCompleteView <em>Is Complete View</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getORMDiagramType()
 * @model extendedMetaData="name='ORMDiagramType' kind='elementOnly'"
 * @generated
 */
public interface ORMDiagramType extends EObject {
	/**
	 * Returns the value of the '<em><b>Shapes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shapes</em>' containment reference.
	 * @see #setShapes(ShapesType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getORMDiagramType_Shapes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Shapes' namespace='##targetNamespace'"
	 * @generated
	 */
	ShapesType getShapes();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getShapes <em>Shapes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shapes</em>' containment reference.
	 * @see #getShapes()
	 * @generated
	 */
	void setShapes(ShapesType value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(SubjectRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getORMDiagramType_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Subject' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjectRef getSubject();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(SubjectRef value);

	/**
	 * Returns the value of the '<em><b>Auto Populate Shapes</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If this is set to true, then all shapes in the model will be loaded onto this diagram when the diagram is first loaded. AutoPopulateShapes is never written, but is useful for importing models with no diagram information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Populate Shapes</em>' attribute.
	 * @see #isSetAutoPopulateShapes()
	 * @see #unsetAutoPopulateShapes()
	 * @see #setAutoPopulateShapes(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getORMDiagramType_AutoPopulateShapes()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='AutoPopulateShapes'"
	 * @generated
	 */
	boolean isAutoPopulateShapes();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#isAutoPopulateShapes <em>Auto Populate Shapes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Populate Shapes</em>' attribute.
	 * @see #isSetAutoPopulateShapes()
	 * @see #unsetAutoPopulateShapes()
	 * @see #isAutoPopulateShapes()
	 * @generated
	 */
	void setAutoPopulateShapes(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#isAutoPopulateShapes <em>Auto Populate Shapes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAutoPopulateShapes()
	 * @see #isAutoPopulateShapes()
	 * @see #setAutoPopulateShapes(boolean)
	 * @generated
	 */
	void unsetAutoPopulateShapes();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#isAutoPopulateShapes <em>Auto Populate Shapes</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Auto Populate Shapes</em>' attribute is set.
	 * @see #unsetAutoPopulateShapes()
	 * @see #isAutoPopulateShapes()
	 * @see #setAutoPopulateShapes(boolean)
	 * @generated
	 */
	boolean isSetAutoPopulateShapes();

	/**
	 * Returns the value of the '<em><b>Base Font Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Font Name</em>' attribute.
	 * @see #setBaseFontName(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getORMDiagramType_BaseFontName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='BaseFontName'"
	 * @generated
	 */
	String getBaseFontName();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getBaseFontName <em>Base Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Font Name</em>' attribute.
	 * @see #getBaseFontName()
	 * @generated
	 */
	void setBaseFontName(String value);

	/**
	 * Returns the value of the '<em><b>Base Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Font Size</em>' attribute.
	 * @see #setBaseFontSize(BigDecimal)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getORMDiagramType_BaseFontSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='attribute' name='BaseFontSize'"
	 * @generated
	 */
	BigDecimal getBaseFontSize();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getBaseFontSize <em>Base Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Font Size</em>' attribute.
	 * @see #getBaseFontSize()
	 * @generated
	 */
	void setBaseFontSize(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getORMDiagramType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Is Complete View</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Complete View</em>' attribute.
	 * @see #isSetIsCompleteView()
	 * @see #unsetIsCompleteView()
	 * @see #setIsCompleteView(boolean)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getORMDiagramType_IsCompleteView()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='IsCompleteView'"
	 * @generated
	 */
	boolean isIsCompleteView();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#isIsCompleteView <em>Is Complete View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Complete View</em>' attribute.
	 * @see #isSetIsCompleteView()
	 * @see #unsetIsCompleteView()
	 * @see #isIsCompleteView()
	 * @generated
	 */
	void setIsCompleteView(boolean value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#isIsCompleteView <em>Is Complete View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsCompleteView()
	 * @see #isIsCompleteView()
	 * @see #setIsCompleteView(boolean)
	 * @generated
	 */
	void unsetIsCompleteView();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#isIsCompleteView <em>Is Complete View</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Complete View</em>' attribute is set.
	 * @see #unsetIsCompleteView()
	 * @see #isIsCompleteView()
	 * @see #setIsCompleteView(boolean)
	 * @generated
	 */
	boolean isSetIsCompleteView();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getORMDiagramType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ORMDiagramType
