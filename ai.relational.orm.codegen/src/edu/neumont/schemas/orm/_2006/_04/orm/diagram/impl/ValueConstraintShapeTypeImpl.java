/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram.impl;

import edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage;
import edu.neumont.schemas.orm._2006._04.orm.diagram.SubjectRef;
import edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Constraint Shape Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ValueConstraintShapeTypeImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ValueConstraintShapeTypeImpl#getMaximumDisplayedColumns <em>Maximum Displayed Columns</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.diagram.impl.ValueConstraintShapeTypeImpl#getMaximumDisplayedValues <em>Maximum Displayed Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValueConstraintShapeTypeImpl extends ShapeTypeImpl implements ValueConstraintShapeType {
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
	 * The default value of the '{@link #getMaximumDisplayedColumns() <em>Maximum Displayed Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumDisplayedColumns()
	 * @generated
	 * @ordered
	 */
	protected static final short MAXIMUM_DISPLAYED_COLUMNS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximumDisplayedColumns() <em>Maximum Displayed Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumDisplayedColumns()
	 * @generated
	 * @ordered
	 */
	protected short maximumDisplayedColumns = MAXIMUM_DISPLAYED_COLUMNS_EDEFAULT;

	/**
	 * This is true if the Maximum Displayed Columns attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumDisplayedColumnsESet;

	/**
	 * The default value of the '{@link #getMaximumDisplayedValues() <em>Maximum Displayed Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumDisplayedValues()
	 * @generated
	 * @ordered
	 */
	protected static final short MAXIMUM_DISPLAYED_VALUES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximumDisplayedValues() <em>Maximum Displayed Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumDisplayedValues()
	 * @generated
	 * @ordered
	 */
	protected short maximumDisplayedValues = MAXIMUM_DISPLAYED_VALUES_EDEFAULT;

	/**
	 * This is true if the Maximum Displayed Values attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximumDisplayedValuesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueConstraintShapeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiagramPackage.Literals.VALUE_CONSTRAINT_SHAPE_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__SUBJECT, oldSubject, newSubject);
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
				msgs = ((InternalEObject)subject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__SUBJECT, null, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__SUBJECT, null, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getMaximumDisplayedColumns() {
		return maximumDisplayedColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumDisplayedColumns(short newMaximumDisplayedColumns) {
		short oldMaximumDisplayedColumns = maximumDisplayedColumns;
		maximumDisplayedColumns = newMaximumDisplayedColumns;
		boolean oldMaximumDisplayedColumnsESet = maximumDisplayedColumnsESet;
		maximumDisplayedColumnsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__MAXIMUM_DISPLAYED_COLUMNS, oldMaximumDisplayedColumns, maximumDisplayedColumns, !oldMaximumDisplayedColumnsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumDisplayedColumns() {
		short oldMaximumDisplayedColumns = maximumDisplayedColumns;
		boolean oldMaximumDisplayedColumnsESet = maximumDisplayedColumnsESet;
		maximumDisplayedColumns = MAXIMUM_DISPLAYED_COLUMNS_EDEFAULT;
		maximumDisplayedColumnsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__MAXIMUM_DISPLAYED_COLUMNS, oldMaximumDisplayedColumns, MAXIMUM_DISPLAYED_COLUMNS_EDEFAULT, oldMaximumDisplayedColumnsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumDisplayedColumns() {
		return maximumDisplayedColumnsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getMaximumDisplayedValues() {
		return maximumDisplayedValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumDisplayedValues(short newMaximumDisplayedValues) {
		short oldMaximumDisplayedValues = maximumDisplayedValues;
		maximumDisplayedValues = newMaximumDisplayedValues;
		boolean oldMaximumDisplayedValuesESet = maximumDisplayedValuesESet;
		maximumDisplayedValuesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__MAXIMUM_DISPLAYED_VALUES, oldMaximumDisplayedValues, maximumDisplayedValues, !oldMaximumDisplayedValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaximumDisplayedValues() {
		short oldMaximumDisplayedValues = maximumDisplayedValues;
		boolean oldMaximumDisplayedValuesESet = maximumDisplayedValuesESet;
		maximumDisplayedValues = MAXIMUM_DISPLAYED_VALUES_EDEFAULT;
		maximumDisplayedValuesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__MAXIMUM_DISPLAYED_VALUES, oldMaximumDisplayedValues, MAXIMUM_DISPLAYED_VALUES_EDEFAULT, oldMaximumDisplayedValuesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaximumDisplayedValues() {
		return maximumDisplayedValuesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__SUBJECT:
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
			case DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__SUBJECT:
				return getSubject();
			case DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__MAXIMUM_DISPLAYED_COLUMNS:
				return getMaximumDisplayedColumns();
			case DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__MAXIMUM_DISPLAYED_VALUES:
				return getMaximumDisplayedValues();
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
			case DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__SUBJECT:
				setSubject((SubjectRef)newValue);
				return;
			case DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__MAXIMUM_DISPLAYED_COLUMNS:
				setMaximumDisplayedColumns((Short)newValue);
				return;
			case DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__MAXIMUM_DISPLAYED_VALUES:
				setMaximumDisplayedValues((Short)newValue);
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
			case DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__SUBJECT:
				setSubject((SubjectRef)null);
				return;
			case DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__MAXIMUM_DISPLAYED_COLUMNS:
				unsetMaximumDisplayedColumns();
				return;
			case DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__MAXIMUM_DISPLAYED_VALUES:
				unsetMaximumDisplayedValues();
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
			case DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__SUBJECT:
				return subject != null;
			case DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__MAXIMUM_DISPLAYED_COLUMNS:
				return isSetMaximumDisplayedColumns();
			case DiagramPackage.VALUE_CONSTRAINT_SHAPE_TYPE__MAXIMUM_DISPLAYED_VALUES:
				return isSetMaximumDisplayedValues();
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
		result.append(" (maximumDisplayedColumns: ");
		if (maximumDisplayedColumnsESet) result.append(maximumDisplayedColumns); else result.append("<unset>");
		result.append(", maximumDisplayedValues: ");
		if (maximumDisplayedValuesESet) result.append(maximumDisplayedValues); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ValueConstraintShapeTypeImpl
