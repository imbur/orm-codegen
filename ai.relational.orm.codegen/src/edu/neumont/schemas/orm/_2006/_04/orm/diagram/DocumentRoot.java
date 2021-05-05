/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getDiagramExtensionShape <em>Diagram Extension Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getFactTypeRelativeExtensionShape <em>Fact Type Relative Extension Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getObjectTypeRelativeExtensionShape <em>Object Type Relative Extension Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getORMDiagram <em>ORM Diagram</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Diagram Extension Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Extension Shape</em>' containment reference.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getDocumentRoot_DiagramExtensionShape()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DiagramExtensionShape' namespace='##targetNamespace'"
	 * @generated
	 */
	ShapeType getDiagramExtensionShape();

	/**
	 * Returns the value of the '<em><b>Fact Type Relative Extension Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact Type Relative Extension Shape</em>' containment reference.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getDocumentRoot_FactTypeRelativeExtensionShape()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FactTypeRelativeExtensionShape' namespace='##targetNamespace'"
	 * @generated
	 */
	ShapeType getFactTypeRelativeExtensionShape();

	/**
	 * Returns the value of the '<em><b>Object Type Relative Extension Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Type Relative Extension Shape</em>' containment reference.
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getDocumentRoot_ObjectTypeRelativeExtensionShape()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ObjectTypeRelativeExtensionShape' namespace='##targetNamespace'"
	 * @generated
	 */
	ShapeType getObjectTypeRelativeExtensionShape();

	/**
	 * Returns the value of the '<em><b>ORM Diagram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ORM Diagram</em>' containment reference.
	 * @see #setORMDiagram(ORMDiagramType)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getDocumentRoot_ORMDiagram()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ORMDiagram' namespace='##targetNamespace'"
	 * @generated
	 */
	ORMDiagramType getORMDiagram();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getORMDiagram <em>ORM Diagram</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ORM Diagram</em>' containment reference.
	 * @see #getORMDiagram()
	 * @generated
	 */
	void setORMDiagram(ORMDiagramType value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(SubjectRef)
	 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getDocumentRoot_Subject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Subject' namespace='##targetNamespace'"
	 * @generated
	 */
	SubjectRef getSubject();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(SubjectRef value);

} // DocumentRoot
