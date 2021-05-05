/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram.impl;

import edu.neumont.schemas.orm._2006._04.orm.diagram.ConstraintDisplayPositionType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage;
import edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayOrientationType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRelatedTypesType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.DisplayRoleNamesType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.RoleDisplayOrderType;
import edu.neumont.schemas.orm._2006._04.orm.diagram.SubjectRef;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fact Type Shape Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.FactTypeShapeTypeImpl#getRelativeShapes <em>Relative Shapes</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.FactTypeShapeTypeImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.FactTypeShapeTypeImpl#getRoleDisplayOrder <em>Role Display Order</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.FactTypeShapeTypeImpl#getConstraintDisplayPosition <em>Constraint Display Position</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.FactTypeShapeTypeImpl#isDisplayAsObjectType <em>Display As Object Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.FactTypeShapeTypeImpl#getDisplayOrientation <em>Display Orientation</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.FactTypeShapeTypeImpl#getDisplayRelatedTypes <em>Display Related Types</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.FactTypeShapeTypeImpl#getDisplayRoleNames <em>Display Role Names</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.FactTypeShapeTypeImpl#isExpandRefMode <em>Expand Ref Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FactTypeShapeTypeImpl extends ShapeTypeImpl implements FactTypeShapeType {
	/**
	 * The cached value of the '{@link #getRelativeShapes() <em>Relative Shapes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativeShapes()
	 * @generated
	 * @ordered
	 */
	protected RelativeShapesType relativeShapes;

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
	 * The cached value of the '{@link #getRoleDisplayOrder() <em>Role Display Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleDisplayOrder()
	 * @generated
	 * @ordered
	 */
	protected RoleDisplayOrderType roleDisplayOrder;

	/**
	 * The default value of the '{@link #getConstraintDisplayPosition() <em>Constraint Display Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintDisplayPosition()
	 * @generated
	 * @ordered
	 */
	protected static final ConstraintDisplayPositionType CONSTRAINT_DISPLAY_POSITION_EDEFAULT = ConstraintDisplayPositionType.TOP;

	/**
	 * The cached value of the '{@link #getConstraintDisplayPosition() <em>Constraint Display Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintDisplayPosition()
	 * @generated
	 * @ordered
	 */
	protected ConstraintDisplayPositionType constraintDisplayPosition = CONSTRAINT_DISPLAY_POSITION_EDEFAULT;

	/**
	 * This is true if the Constraint Display Position attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean constraintDisplayPositionESet;

	/**
	 * The default value of the '{@link #isDisplayAsObjectType() <em>Display As Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayAsObjectType()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPLAY_AS_OBJECT_TYPE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisplayAsObjectType() <em>Display As Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplayAsObjectType()
	 * @generated
	 * @ordered
	 */
	protected boolean displayAsObjectType = DISPLAY_AS_OBJECT_TYPE_EDEFAULT;

	/**
	 * This is true if the Display As Object Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayAsObjectTypeESet;

	/**
	 * The default value of the '{@link #getDisplayOrientation() <em>Display Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayOrientation()
	 * @generated
	 * @ordered
	 */
	protected static final DisplayOrientationType DISPLAY_ORIENTATION_EDEFAULT = DisplayOrientationType.HORIZONTAL;

	/**
	 * The cached value of the '{@link #getDisplayOrientation() <em>Display Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayOrientation()
	 * @generated
	 * @ordered
	 */
	protected DisplayOrientationType displayOrientation = DISPLAY_ORIENTATION_EDEFAULT;

	/**
	 * This is true if the Display Orientation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayOrientationESet;

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
	 * The default value of the '{@link #getDisplayRoleNames() <em>Display Role Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayRoleNames()
	 * @generated
	 * @ordered
	 */
	protected static final DisplayRoleNamesType DISPLAY_ROLE_NAMES_EDEFAULT = DisplayRoleNamesType.USER_DEFAULT;

	/**
	 * The cached value of the '{@link #getDisplayRoleNames() <em>Display Role Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayRoleNames()
	 * @generated
	 * @ordered
	 */
	protected DisplayRoleNamesType displayRoleNames = DISPLAY_ROLE_NAMES_EDEFAULT;

	/**
	 * This is true if the Display Role Names attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displayRoleNamesESet;

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
	protected FactTypeShapeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.FACT_TYPE_SHAPE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeShapesType getRelativeShapes() {
		return relativeShapes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelativeShapes(RelativeShapesType newRelativeShapes, NotificationChain msgs) {
		RelativeShapesType oldRelativeShapes = relativeShapes;
		relativeShapes = newRelativeShapes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramPackage.FACT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES, oldRelativeShapes, newRelativeShapes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelativeShapes(RelativeShapesType newRelativeShapes) {
		if (newRelativeShapes != relativeShapes) {
			NotificationChain msgs = null;
			if (relativeShapes != null)
				msgs = ((InternalEObject)relativeShapes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.FACT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES, null, msgs);
			if (newRelativeShapes != null)
				msgs = ((InternalEObject)newRelativeShapes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.FACT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES, null, msgs);
			msgs = basicSetRelativeShapes(newRelativeShapes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.FACT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES, newRelativeShapes, newRelativeShapes));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramPackage.FACT_TYPE_SHAPE_TYPE__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.FACT_TYPE_SHAPE_TYPE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.FACT_TYPE_SHAPE_TYPE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.FACT_TYPE_SHAPE_TYPE__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleDisplayOrderType getRoleDisplayOrder() {
		return roleDisplayOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoleDisplayOrder(RoleDisplayOrderType newRoleDisplayOrder, NotificationChain msgs) {
		RoleDisplayOrderType oldRoleDisplayOrder = roleDisplayOrder;
		roleDisplayOrder = newRoleDisplayOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramPackage.FACT_TYPE_SHAPE_TYPE__ROLE_DISPLAY_ORDER, oldRoleDisplayOrder, newRoleDisplayOrder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleDisplayOrder(RoleDisplayOrderType newRoleDisplayOrder) {
		if (newRoleDisplayOrder != roleDisplayOrder) {
			NotificationChain msgs = null;
			if (roleDisplayOrder != null)
				msgs = ((InternalEObject)roleDisplayOrder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.FACT_TYPE_SHAPE_TYPE__ROLE_DISPLAY_ORDER, null, msgs);
			if (newRoleDisplayOrder != null)
				msgs = ((InternalEObject)newRoleDisplayOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.FACT_TYPE_SHAPE_TYPE__ROLE_DISPLAY_ORDER, null, msgs);
			msgs = basicSetRoleDisplayOrder(newRoleDisplayOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.FACT_TYPE_SHAPE_TYPE__ROLE_DISPLAY_ORDER, newRoleDisplayOrder, newRoleDisplayOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintDisplayPositionType getConstraintDisplayPosition() {
		return constraintDisplayPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintDisplayPosition(ConstraintDisplayPositionType newConstraintDisplayPosition) {
		ConstraintDisplayPositionType oldConstraintDisplayPosition = constraintDisplayPosition;
		constraintDisplayPosition = newConstraintDisplayPosition == null ? CONSTRAINT_DISPLAY_POSITION_EDEFAULT : newConstraintDisplayPosition;
		boolean oldConstraintDisplayPositionESet = constraintDisplayPositionESet;
		constraintDisplayPositionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.FACT_TYPE_SHAPE_TYPE__CONSTRAINT_DISPLAY_POSITION, oldConstraintDisplayPosition, constraintDisplayPosition, !oldConstraintDisplayPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConstraintDisplayPosition() {
		ConstraintDisplayPositionType oldConstraintDisplayPosition = constraintDisplayPosition;
		boolean oldConstraintDisplayPositionESet = constraintDisplayPositionESet;
		constraintDisplayPosition = CONSTRAINT_DISPLAY_POSITION_EDEFAULT;
		constraintDisplayPositionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DiagramPackage.FACT_TYPE_SHAPE_TYPE__CONSTRAINT_DISPLAY_POSITION, oldConstraintDisplayPosition, CONSTRAINT_DISPLAY_POSITION_EDEFAULT, oldConstraintDisplayPositionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstraintDisplayPosition() {
		return constraintDisplayPositionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisplayAsObjectType() {
		return displayAsObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayAsObjectType(boolean newDisplayAsObjectType) {
		boolean oldDisplayAsObjectType = displayAsObjectType;
		displayAsObjectType = newDisplayAsObjectType;
		boolean oldDisplayAsObjectTypeESet = displayAsObjectTypeESet;
		displayAsObjectTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_AS_OBJECT_TYPE, oldDisplayAsObjectType, displayAsObjectType, !oldDisplayAsObjectTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayAsObjectType() {
		boolean oldDisplayAsObjectType = displayAsObjectType;
		boolean oldDisplayAsObjectTypeESet = displayAsObjectTypeESet;
		displayAsObjectType = DISPLAY_AS_OBJECT_TYPE_EDEFAULT;
		displayAsObjectTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_AS_OBJECT_TYPE, oldDisplayAsObjectType, DISPLAY_AS_OBJECT_TYPE_EDEFAULT, oldDisplayAsObjectTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayAsObjectType() {
		return displayAsObjectTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayOrientationType getDisplayOrientation() {
		return displayOrientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayOrientation(DisplayOrientationType newDisplayOrientation) {
		DisplayOrientationType oldDisplayOrientation = displayOrientation;
		displayOrientation = newDisplayOrientation == null ? DISPLAY_ORIENTATION_EDEFAULT : newDisplayOrientation;
		boolean oldDisplayOrientationESet = displayOrientationESet;
		displayOrientationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_ORIENTATION, oldDisplayOrientation, displayOrientation, !oldDisplayOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayOrientation() {
		DisplayOrientationType oldDisplayOrientation = displayOrientation;
		boolean oldDisplayOrientationESet = displayOrientationESet;
		displayOrientation = DISPLAY_ORIENTATION_EDEFAULT;
		displayOrientationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_ORIENTATION, oldDisplayOrientation, DISPLAY_ORIENTATION_EDEFAULT, oldDisplayOrientationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayOrientation() {
		return displayOrientationESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_RELATED_TYPES, oldDisplayRelatedTypes, displayRelatedTypes, !oldDisplayRelatedTypesESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_RELATED_TYPES, oldDisplayRelatedTypes, DISPLAY_RELATED_TYPES_EDEFAULT, oldDisplayRelatedTypesESet));
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
	public DisplayRoleNamesType getDisplayRoleNames() {
		return displayRoleNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayRoleNames(DisplayRoleNamesType newDisplayRoleNames) {
		DisplayRoleNamesType oldDisplayRoleNames = displayRoleNames;
		displayRoleNames = newDisplayRoleNames == null ? DISPLAY_ROLE_NAMES_EDEFAULT : newDisplayRoleNames;
		boolean oldDisplayRoleNamesESet = displayRoleNamesESet;
		displayRoleNamesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_ROLE_NAMES, oldDisplayRoleNames, displayRoleNames, !oldDisplayRoleNamesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplayRoleNames() {
		DisplayRoleNamesType oldDisplayRoleNames = displayRoleNames;
		boolean oldDisplayRoleNamesESet = displayRoleNamesESet;
		displayRoleNames = DISPLAY_ROLE_NAMES_EDEFAULT;
		displayRoleNamesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_ROLE_NAMES, oldDisplayRoleNames, DISPLAY_ROLE_NAMES_EDEFAULT, oldDisplayRoleNamesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplayRoleNames() {
		return displayRoleNamesESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.FACT_TYPE_SHAPE_TYPE__EXPAND_REF_MODE, oldExpandRefMode, expandRefMode, !oldExpandRefModeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, DiagramPackage.FACT_TYPE_SHAPE_TYPE__EXPAND_REF_MODE, oldExpandRefMode, EXPAND_REF_MODE_EDEFAULT, oldExpandRefModeESet));
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
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES:
				return basicSetRelativeShapes(null, msgs);
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__SUBJECT:
				return basicSetSubject(null, msgs);
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__ROLE_DISPLAY_ORDER:
				return basicSetRoleDisplayOrder(null, msgs);
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
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES:
				return getRelativeShapes();
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__SUBJECT:
				return getSubject();
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__ROLE_DISPLAY_ORDER:
				return getRoleDisplayOrder();
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__CONSTRAINT_DISPLAY_POSITION:
				return getConstraintDisplayPosition();
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_AS_OBJECT_TYPE:
				return isDisplayAsObjectType();
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_ORIENTATION:
				return getDisplayOrientation();
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_RELATED_TYPES:
				return getDisplayRelatedTypes();
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_ROLE_NAMES:
				return getDisplayRoleNames();
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__EXPAND_REF_MODE:
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
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES:
				setRelativeShapes((RelativeShapesType)newValue);
				return;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__SUBJECT:
				setSubject((SubjectRef)newValue);
				return;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__ROLE_DISPLAY_ORDER:
				setRoleDisplayOrder((RoleDisplayOrderType)newValue);
				return;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__CONSTRAINT_DISPLAY_POSITION:
				setConstraintDisplayPosition((ConstraintDisplayPositionType)newValue);
				return;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_AS_OBJECT_TYPE:
				setDisplayAsObjectType((Boolean)newValue);
				return;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_ORIENTATION:
				setDisplayOrientation((DisplayOrientationType)newValue);
				return;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_RELATED_TYPES:
				setDisplayRelatedTypes((DisplayRelatedTypesType)newValue);
				return;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_ROLE_NAMES:
				setDisplayRoleNames((DisplayRoleNamesType)newValue);
				return;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__EXPAND_REF_MODE:
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
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES:
				setRelativeShapes((RelativeShapesType)null);
				return;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__SUBJECT:
				setSubject((SubjectRef)null);
				return;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__ROLE_DISPLAY_ORDER:
				setRoleDisplayOrder((RoleDisplayOrderType)null);
				return;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__CONSTRAINT_DISPLAY_POSITION:
				unsetConstraintDisplayPosition();
				return;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_AS_OBJECT_TYPE:
				unsetDisplayAsObjectType();
				return;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_ORIENTATION:
				unsetDisplayOrientation();
				return;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_RELATED_TYPES:
				unsetDisplayRelatedTypes();
				return;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_ROLE_NAMES:
				unsetDisplayRoleNames();
				return;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__EXPAND_REF_MODE:
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
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__RELATIVE_SHAPES:
				return relativeShapes != null;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__SUBJECT:
				return subject != null;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__ROLE_DISPLAY_ORDER:
				return roleDisplayOrder != null;
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__CONSTRAINT_DISPLAY_POSITION:
				return isSetConstraintDisplayPosition();
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_AS_OBJECT_TYPE:
				return isSetDisplayAsObjectType();
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_ORIENTATION:
				return isSetDisplayOrientation();
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_RELATED_TYPES:
				return isSetDisplayRelatedTypes();
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__DISPLAY_ROLE_NAMES:
				return isSetDisplayRoleNames();
			case DiagramPackage.FACT_TYPE_SHAPE_TYPE__EXPAND_REF_MODE:
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
		result.append(" (constraintDisplayPosition: ");
		if (constraintDisplayPositionESet) result.append(constraintDisplayPosition); else result.append("<unset>");
		result.append(", displayAsObjectType: ");
		if (displayAsObjectTypeESet) result.append(displayAsObjectType); else result.append("<unset>");
		result.append(", displayOrientation: ");
		if (displayOrientationESet) result.append(displayOrientation); else result.append("<unset>");
		result.append(", displayRelatedTypes: ");
		if (displayRelatedTypesESet) result.append(displayRelatedTypes); else result.append("<unset>");
		result.append(", displayRoleNames: ");
		if (displayRoleNamesESet) result.append(displayRoleNames); else result.append("<unset>");
		result.append(", expandRefMode: ");
		if (expandRefModeESet) result.append(expandRefMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FactTypeShapeTypeImpl
