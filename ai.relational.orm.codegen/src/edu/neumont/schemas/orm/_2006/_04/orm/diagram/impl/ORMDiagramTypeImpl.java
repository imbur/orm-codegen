/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram.impl;

import edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.SubjectRef;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ORM Diagram Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ORMDiagramTypeImpl#getShapes <em>Shapes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ORMDiagramTypeImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ORMDiagramTypeImpl#isAutoPopulateShapes <em>Auto Populate Shapes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ORMDiagramTypeImpl#getBaseFontName <em>Base Font Name</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ORMDiagramTypeImpl#getBaseFontSize <em>Base Font Size</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ORMDiagramTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ORMDiagramTypeImpl#isIsCompleteView <em>Is Complete View</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ORMDiagramTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ORMDiagramTypeImpl extends MinimalEObjectImpl.Container implements ORMDiagramType {
	/**
	 * The cached value of the '{@link #getShapes() <em>Shapes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapes()
	 * @generated
	 * @ordered
	 */
	protected ShapesType shapes;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected SubjectRef subject;

	/**
	 * The default value of the '{@link #isAutoPopulateShapes() <em>Auto Populate Shapes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoPopulateShapes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTO_POPULATE_SHAPES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAutoPopulateShapes() <em>Auto Populate Shapes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutoPopulateShapes()
	 * @generated
	 * @ordered
	 */
	protected boolean autoPopulateShapes = AUTO_POPULATE_SHAPES_EDEFAULT;

	/**
	 * This is true if the Auto Populate Shapes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean autoPopulateShapesESet;

	/**
	 * The default value of the '{@link #getBaseFontName() <em>Base Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseFontName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_FONT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseFontName() <em>Base Font Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseFontName()
	 * @generated
	 * @ordered
	 */
	protected String baseFontName = BASE_FONT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseFontSize() <em>Base Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BASE_FONT_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseFontSize() <em>Base Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseFontSize()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal baseFontSize = BASE_FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsCompleteView() <em>Is Complete View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCompleteView()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPLETE_VIEW_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCompleteView() <em>Is Complete View</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCompleteView()
	 * @generated
	 * @ordered
	 */
	protected boolean isCompleteView = IS_COMPLETE_VIEW_EDEFAULT;

	/**
	 * This is true if the Is Complete View attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isCompleteViewESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ORMDiagramTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.ORM_DIAGRAM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapesType getShapes() {
		return shapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShapes(ShapesType newShapes, NotificationChain msgs) {
		ShapesType oldShapes = shapes;
		shapes = newShapes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramPackage.ORM_DIAGRAM_TYPE__SHAPES, oldShapes, newShapes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShapes(ShapesType newShapes) {
		if (newShapes != shapes) {
			NotificationChain msgs = null;
			if (shapes != null)
				msgs = ((InternalEObject)shapes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.ORM_DIAGRAM_TYPE__SHAPES, null, msgs);
			if (newShapes != null)
				msgs = ((InternalEObject)newShapes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.ORM_DIAGRAM_TYPE__SHAPES, null, msgs);
			msgs = basicSetShapes(newShapes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.ORM_DIAGRAM_TYPE__SHAPES, newShapes, newShapes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectRef getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(SubjectRef newSubject, NotificationChain msgs) {
		SubjectRef oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramPackage.ORM_DIAGRAM_TYPE__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(SubjectRef newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.ORM_DIAGRAM_TYPE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.ORM_DIAGRAM_TYPE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.ORM_DIAGRAM_TYPE__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutoPopulateShapes() {
		return autoPopulateShapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoPopulateShapes(boolean newAutoPopulateShapes) {
		boolean oldAutoPopulateShapes = autoPopulateShapes;
		autoPopulateShapes = newAutoPopulateShapes;
		boolean oldAutoPopulateShapesESet = autoPopulateShapesESet;
		autoPopulateShapesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.ORM_DIAGRAM_TYPE__AUTO_POPULATE_SHAPES, oldAutoPopulateShapes, autoPopulateShapes, !oldAutoPopulateShapesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutoPopulateShapes() {
		boolean oldAutoPopulateShapes = autoPopulateShapes;
		boolean oldAutoPopulateShapesESet = autoPopulateShapesESet;
		autoPopulateShapes = AUTO_POPULATE_SHAPES_EDEFAULT;
		autoPopulateShapesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DiagramPackage.ORM_DIAGRAM_TYPE__AUTO_POPULATE_SHAPES, oldAutoPopulateShapes, AUTO_POPULATE_SHAPES_EDEFAULT, oldAutoPopulateShapesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutoPopulateShapes() {
		return autoPopulateShapesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseFontName() {
		return baseFontName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseFontName(String newBaseFontName) {
		String oldBaseFontName = baseFontName;
		baseFontName = newBaseFontName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.ORM_DIAGRAM_TYPE__BASE_FONT_NAME, oldBaseFontName, baseFontName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getBaseFontSize() {
		return baseFontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseFontSize(BigDecimal newBaseFontSize) {
		BigDecimal oldBaseFontSize = baseFontSize;
		baseFontSize = newBaseFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.ORM_DIAGRAM_TYPE__BASE_FONT_SIZE, oldBaseFontSize, baseFontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.ORM_DIAGRAM_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCompleteView() {
		return isCompleteView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCompleteView(boolean newIsCompleteView) {
		boolean oldIsCompleteView = isCompleteView;
		isCompleteView = newIsCompleteView;
		boolean oldIsCompleteViewESet = isCompleteViewESet;
		isCompleteViewESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.ORM_DIAGRAM_TYPE__IS_COMPLETE_VIEW, oldIsCompleteView, isCompleteView, !oldIsCompleteViewESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsCompleteView() {
		boolean oldIsCompleteView = isCompleteView;
		boolean oldIsCompleteViewESet = isCompleteViewESet;
		isCompleteView = IS_COMPLETE_VIEW_EDEFAULT;
		isCompleteViewESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DiagramPackage.ORM_DIAGRAM_TYPE__IS_COMPLETE_VIEW, oldIsCompleteView, IS_COMPLETE_VIEW_EDEFAULT, oldIsCompleteViewESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsCompleteView() {
		return isCompleteViewESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.ORM_DIAGRAM_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramPackage.ORM_DIAGRAM_TYPE__SHAPES:
				return basicSetShapes(null, msgs);
			case DiagramPackage.ORM_DIAGRAM_TYPE__SUBJECT:
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
			case DiagramPackage.ORM_DIAGRAM_TYPE__SHAPES:
				return getShapes();
			case DiagramPackage.ORM_DIAGRAM_TYPE__SUBJECT:
				return getSubject();
			case DiagramPackage.ORM_DIAGRAM_TYPE__AUTO_POPULATE_SHAPES:
				return isAutoPopulateShapes();
			case DiagramPackage.ORM_DIAGRAM_TYPE__BASE_FONT_NAME:
				return getBaseFontName();
			case DiagramPackage.ORM_DIAGRAM_TYPE__BASE_FONT_SIZE:
				return getBaseFontSize();
			case DiagramPackage.ORM_DIAGRAM_TYPE__ID:
				return getId();
			case DiagramPackage.ORM_DIAGRAM_TYPE__IS_COMPLETE_VIEW:
				return isIsCompleteView();
			case DiagramPackage.ORM_DIAGRAM_TYPE__NAME:
				return getName();
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
			case DiagramPackage.ORM_DIAGRAM_TYPE__SHAPES:
				setShapes((ShapesType)newValue);
				return;
			case DiagramPackage.ORM_DIAGRAM_TYPE__SUBJECT:
				setSubject((SubjectRef)newValue);
				return;
			case DiagramPackage.ORM_DIAGRAM_TYPE__AUTO_POPULATE_SHAPES:
				setAutoPopulateShapes((Boolean)newValue);
				return;
			case DiagramPackage.ORM_DIAGRAM_TYPE__BASE_FONT_NAME:
				setBaseFontName((String)newValue);
				return;
			case DiagramPackage.ORM_DIAGRAM_TYPE__BASE_FONT_SIZE:
				setBaseFontSize((BigDecimal)newValue);
				return;
			case DiagramPackage.ORM_DIAGRAM_TYPE__ID:
				setId((String)newValue);
				return;
			case DiagramPackage.ORM_DIAGRAM_TYPE__IS_COMPLETE_VIEW:
				setIsCompleteView((Boolean)newValue);
				return;
			case DiagramPackage.ORM_DIAGRAM_TYPE__NAME:
				setName((String)newValue);
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
			case DiagramPackage.ORM_DIAGRAM_TYPE__SHAPES:
				setShapes((ShapesType)null);
				return;
			case DiagramPackage.ORM_DIAGRAM_TYPE__SUBJECT:
				setSubject((SubjectRef)null);
				return;
			case DiagramPackage.ORM_DIAGRAM_TYPE__AUTO_POPULATE_SHAPES:
				unsetAutoPopulateShapes();
				return;
			case DiagramPackage.ORM_DIAGRAM_TYPE__BASE_FONT_NAME:
				setBaseFontName(BASE_FONT_NAME_EDEFAULT);
				return;
			case DiagramPackage.ORM_DIAGRAM_TYPE__BASE_FONT_SIZE:
				setBaseFontSize(BASE_FONT_SIZE_EDEFAULT);
				return;
			case DiagramPackage.ORM_DIAGRAM_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DiagramPackage.ORM_DIAGRAM_TYPE__IS_COMPLETE_VIEW:
				unsetIsCompleteView();
				return;
			case DiagramPackage.ORM_DIAGRAM_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case DiagramPackage.ORM_DIAGRAM_TYPE__SHAPES:
				return shapes != null;
			case DiagramPackage.ORM_DIAGRAM_TYPE__SUBJECT:
				return subject != null;
			case DiagramPackage.ORM_DIAGRAM_TYPE__AUTO_POPULATE_SHAPES:
				return isSetAutoPopulateShapes();
			case DiagramPackage.ORM_DIAGRAM_TYPE__BASE_FONT_NAME:
				return BASE_FONT_NAME_EDEFAULT == null ? baseFontName != null : !BASE_FONT_NAME_EDEFAULT.equals(baseFontName);
			case DiagramPackage.ORM_DIAGRAM_TYPE__BASE_FONT_SIZE:
				return BASE_FONT_SIZE_EDEFAULT == null ? baseFontSize != null : !BASE_FONT_SIZE_EDEFAULT.equals(baseFontSize);
			case DiagramPackage.ORM_DIAGRAM_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DiagramPackage.ORM_DIAGRAM_TYPE__IS_COMPLETE_VIEW:
				return isSetIsCompleteView();
			case DiagramPackage.ORM_DIAGRAM_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (autoPopulateShapes: ");
		if (autoPopulateShapesESet) result.append(autoPopulateShapes); else result.append("<unset>");
		result.append(", baseFontName: ");
		result.append(baseFontName);
		result.append(", baseFontSize: ");
		result.append(baseFontSize);
		result.append(", id: ");
		result.append(id);
		result.append(", isCompleteView: ");
		if (isCompleteViewESet) result.append(isCompleteView); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ORMDiagramTypeImpl
