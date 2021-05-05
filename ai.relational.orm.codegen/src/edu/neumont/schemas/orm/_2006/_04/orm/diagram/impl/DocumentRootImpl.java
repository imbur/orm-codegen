/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram.impl;

import edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage;
import edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.SubjectRef;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DocumentRootImpl#getDiagramExtensionShape <em>Diagram Extension Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DocumentRootImpl#getFactTypeRelativeExtensionShape <em>Fact Type Relative Extension Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DocumentRootImpl#getObjectTypeRelativeExtensionShape <em>Object Type Relative Extension Shape</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DocumentRootImpl#getORMDiagram <em>ORM Diagram</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.DocumentRootImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DiagramPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DiagramPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, DiagramPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeType getDiagramExtensionShape() {
		return (ShapeType)getMixed().get(DiagramPackage.Literals.DOCUMENT_ROOT__DIAGRAM_EXTENSION_SHAPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagramExtensionShape(ShapeType newDiagramExtensionShape, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DiagramPackage.Literals.DOCUMENT_ROOT__DIAGRAM_EXTENSION_SHAPE, newDiagramExtensionShape, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeType getFactTypeRelativeExtensionShape() {
		return (ShapeType)getMixed().get(DiagramPackage.Literals.DOCUMENT_ROOT__FACT_TYPE_RELATIVE_EXTENSION_SHAPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFactTypeRelativeExtensionShape(ShapeType newFactTypeRelativeExtensionShape, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DiagramPackage.Literals.DOCUMENT_ROOT__FACT_TYPE_RELATIVE_EXTENSION_SHAPE, newFactTypeRelativeExtensionShape, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeType getObjectTypeRelativeExtensionShape() {
		return (ShapeType)getMixed().get(DiagramPackage.Literals.DOCUMENT_ROOT__OBJECT_TYPE_RELATIVE_EXTENSION_SHAPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectTypeRelativeExtensionShape(ShapeType newObjectTypeRelativeExtensionShape, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DiagramPackage.Literals.DOCUMENT_ROOT__OBJECT_TYPE_RELATIVE_EXTENSION_SHAPE, newObjectTypeRelativeExtensionShape, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORMDiagramType getORMDiagram() {
		return (ORMDiagramType)getMixed().get(DiagramPackage.Literals.DOCUMENT_ROOT__ORM_DIAGRAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORMDiagram(ORMDiagramType newORMDiagram, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DiagramPackage.Literals.DOCUMENT_ROOT__ORM_DIAGRAM, newORMDiagram, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORMDiagram(ORMDiagramType newORMDiagram) {
		((FeatureMap.Internal)getMixed()).set(DiagramPackage.Literals.DOCUMENT_ROOT__ORM_DIAGRAM, newORMDiagram);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectRef getSubject() {
		return (SubjectRef)getMixed().get(DiagramPackage.Literals.DOCUMENT_ROOT__SUBJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(SubjectRef newSubject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(DiagramPackage.Literals.DOCUMENT_ROOT__SUBJECT, newSubject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(SubjectRef newSubject) {
		((FeatureMap.Internal)getMixed()).set(DiagramPackage.Literals.DOCUMENT_ROOT__SUBJECT, newSubject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DiagramPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case DiagramPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case DiagramPackage.DOCUMENT_ROOT__DIAGRAM_EXTENSION_SHAPE:
				return basicSetDiagramExtensionShape(null, msgs);
			case DiagramPackage.DOCUMENT_ROOT__FACT_TYPE_RELATIVE_EXTENSION_SHAPE:
				return basicSetFactTypeRelativeExtensionShape(null, msgs);
			case DiagramPackage.DOCUMENT_ROOT__OBJECT_TYPE_RELATIVE_EXTENSION_SHAPE:
				return basicSetObjectTypeRelativeExtensionShape(null, msgs);
			case DiagramPackage.DOCUMENT_ROOT__ORM_DIAGRAM:
				return basicSetORMDiagram(null, msgs);
			case DiagramPackage.DOCUMENT_ROOT__SUBJECT:
				return basicSetSubject(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiagramPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DiagramPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case DiagramPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case DiagramPackage.DOCUMENT_ROOT__DIAGRAM_EXTENSION_SHAPE:
				return getDiagramExtensionShape();
			case DiagramPackage.DOCUMENT_ROOT__FACT_TYPE_RELATIVE_EXTENSION_SHAPE:
				return getFactTypeRelativeExtensionShape();
			case DiagramPackage.DOCUMENT_ROOT__OBJECT_TYPE_RELATIVE_EXTENSION_SHAPE:
				return getObjectTypeRelativeExtensionShape();
			case DiagramPackage.DOCUMENT_ROOT__ORM_DIAGRAM:
				return getORMDiagram();
			case DiagramPackage.DOCUMENT_ROOT__SUBJECT:
				return getSubject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DiagramPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DiagramPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case DiagramPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case DiagramPackage.DOCUMENT_ROOT__ORM_DIAGRAM:
				setORMDiagram((ORMDiagramType)newValue);
				return;
			case DiagramPackage.DOCUMENT_ROOT__SUBJECT:
				setSubject((SubjectRef)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DiagramPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case DiagramPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case DiagramPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case DiagramPackage.DOCUMENT_ROOT__ORM_DIAGRAM:
				setORMDiagram((ORMDiagramType)null);
				return;
			case DiagramPackage.DOCUMENT_ROOT__SUBJECT:
				setSubject((SubjectRef)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DiagramPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DiagramPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case DiagramPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case DiagramPackage.DOCUMENT_ROOT__DIAGRAM_EXTENSION_SHAPE:
				return getDiagramExtensionShape() != null;
			case DiagramPackage.DOCUMENT_ROOT__FACT_TYPE_RELATIVE_EXTENSION_SHAPE:
				return getFactTypeRelativeExtensionShape() != null;
			case DiagramPackage.DOCUMENT_ROOT__OBJECT_TYPE_RELATIVE_EXTENSION_SHAPE:
				return getObjectTypeRelativeExtensionShape() != null;
			case DiagramPackage.DOCUMENT_ROOT__ORM_DIAGRAM:
				return getORMDiagram() != null;
			case DiagramPackage.DOCUMENT_ROOT__SUBJECT:
				return getSubject() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
