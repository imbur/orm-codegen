/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram.impl;

import edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage;
import edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRelatedTypesType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1;
import edu.neumont.schemas.orm._2006._04.orm.diagram.SubjectRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Type Shape Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ObjectTypeShapeTypeImpl#getRelativeShapes <em>Relative Shapes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ObjectTypeShapeTypeImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ObjectTypeShapeTypeImpl#getDisplayRelatedTypes <em>Display Related Types</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ObjectTypeShapeTypeImpl#isExpandRefMode <em>Expand Ref Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectTypeShapeTypeImpl extends ShapeTypeImpl implements ObjectTypeShapeType {
	/**
	 * The cached value of the '{@link #getRelativeShapes() <em>Relative Shapes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeShapes()
	 * @generated
	 * @ordered
	 */
	protected RelativeShapesType1 relativeShapes;

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
	 * The default value of the '{@link #getDisplayRelatedTypes() <em>Display Related Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayRelatedTypes()
	 * @generated
	 * @ordered
	 */
	protected static final DisplayRelatedTypesType DISPLAY_RELATED_TYPES_EDEFAULT = DisplayRelatedTypesType.ATTACH_ALL_TYPES;

	/**
	 * The cached value of the '{@link #getDisplayRelatedTypes() <em>Display Related Types</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayRelatedTypes()
	 * @generated
	 * @ordered
	 */
	protected DisplayRelatedTypesType displayRelatedTypes = DISPLAY_RELATED_TYPES_EDEFAULT;

	/**
	 * This is true if the Display Related Types attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayRelatedTypesESet;

	/**
	 * The default value of the '{@link #isExpandRefMode() <em>Expand Ref Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpandRefMode()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPAND_REF_MODE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExpandRefMode() <em>Expand Ref Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExpandRefMode()
	 * @generated
	 * @ordered
	 */
	protected boolean expandRefMode = EXPAND_REF_MODE_EDEFAULT;

	/**
	 * This is true if the Expand Ref Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean expandRefModeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectTypeShapeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.OBJECT_TYPE_SHAPE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeShapesType1 getRelativeShapes() {
		return relativeShapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativeShapes(RelativeShapesType1 newRelativeShapes, NotificationChain msgs) {
		RelativeShapesType1 oldRelativeShapes = relativeShapes;
		relativeShapes = newRelativeShapes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES, oldRelativeShapes, newRelativeShapes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeShapes(RelativeShapesType1 newRelativeShapes) {
		if (newRelativeShapes != relativeShapes) {
			NotificationChain msgs = null;
			if (relativeShapes != null)
				msgs = ((InternalEObject)relativeShapes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES, null, msgs);
			if (newRelativeShapes != null)
				msgs = ((InternalEObject)newRelativeShapes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES, null, msgs);
			msgs = basicSetRelativeShapes(newRelativeShapes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES, newRelativeShapes, newRelativeShapes));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayRelatedTypesType getDisplayRelatedTypes() {
		return displayRelatedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayRelatedTypes(DisplayRelatedTypesType newDisplayRelatedTypes) {
		DisplayRelatedTypesType oldDisplayRelatedTypes = displayRelatedTypes;
		displayRelatedTypes = newDisplayRelatedTypes == null ? DISPLAY_RELATED_TYPES_EDEFAULT : newDisplayRelatedTypes;
		boolean oldDisplayRelatedTypesESet = displayRelatedTypesESet;
		displayRelatedTypesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__DISPLAY_RELATED_TYPES, oldDisplayRelatedTypes, displayRelatedTypes, !oldDisplayRelatedTypesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayRelatedTypes() {
		DisplayRelatedTypesType oldDisplayRelatedTypes = displayRelatedTypes;
		boolean oldDisplayRelatedTypesESet = displayRelatedTypesESet;
		displayRelatedTypes = DISPLAY_RELATED_TYPES_EDEFAULT;
		displayRelatedTypesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__DISPLAY_RELATED_TYPES, oldDisplayRelatedTypes, DISPLAY_RELATED_TYPES_EDEFAULT, oldDisplayRelatedTypesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayRelatedTypes() {
		return displayRelatedTypesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExpandRefMode() {
		return expandRefMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpandRefMode(boolean newExpandRefMode) {
		boolean oldExpandRefMode = expandRefMode;
		expandRefMode = newExpandRefMode;
		boolean oldExpandRefModeESet = expandRefModeESet;
		expandRefModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__EXPAND_REF_MODE, oldExpandRefMode, expandRefMode, !oldExpandRefModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetExpandRefMode() {
		boolean oldExpandRefMode = expandRefMode;
		boolean oldExpandRefModeESet = expandRefModeESet;
		expandRefMode = EXPAND_REF_MODE_EDEFAULT;
		expandRefModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__EXPAND_REF_MODE, oldExpandRefMode, EXPAND_REF_MODE_EDEFAULT, oldExpandRefModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExpandRefMode() {
		return expandRefModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES:
				return basicSetRelativeShapes(null, msgs);
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__SUBJECT:
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
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES:
				return getRelativeShapes();
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__SUBJECT:
				return getSubject();
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__DISPLAY_RELATED_TYPES:
				return getDisplayRelatedTypes();
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__EXPAND_REF_MODE:
				return isExpandRefMode();
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
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES:
				setRelativeShapes((RelativeShapesType1)newValue);
				return;
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__SUBJECT:
				setSubject((SubjectRef)newValue);
				return;
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__DISPLAY_RELATED_TYPES:
				setDisplayRelatedTypes((DisplayRelatedTypesType)newValue);
				return;
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__EXPAND_REF_MODE:
				setExpandRefMode((Boolean)newValue);
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
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES:
				setRelativeShapes((RelativeShapesType1)null);
				return;
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__SUBJECT:
				setSubject((SubjectRef)null);
				return;
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__DISPLAY_RELATED_TYPES:
				unsetDisplayRelatedTypes();
				return;
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__EXPAND_REF_MODE:
				unsetExpandRefMode();
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
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES:
				return relativeShapes != null;
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__SUBJECT:
				return subject != null;
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__DISPLAY_RELATED_TYPES:
				return isSetDisplayRelatedTypes();
			case DiagramPackage.OBJECT_TYPE_SHAPE_TYPE__EXPAND_REF_MODE:
				return isSetExpandRefMode();
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
		result.append(" (displayRelatedTypes: ");
		if (displayRelatedTypesESet) result.append(displayRelatedTypes); else result.append("<unset>");
		result.append(", expandRefMode: ");
		if (expandRefModeESet) result.append(expandRefMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ObjectTypeShapeTypeImpl
