/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindType;
import edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindValues;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Mode Kind Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ReferenceModeKindTypeImpl#getFormatString <em>Format String</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ReferenceModeKindTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.ReferenceModeKindTypeImpl#getReferenceModeType <em>Reference Mode Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceModeKindTypeImpl extends MinimalEObjectImpl.Container implements ReferenceModeKindType {
	/**
	 * The default value of the '{@link #getFormatString() <em>Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatString()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormatString() <em>Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatString()
	 * @generated
	 * @ordered
	 */
	protected String formatString = FORMAT_STRING_EDEFAULT;

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
	 * The default value of the '{@link #getReferenceModeType() <em>Reference Mode Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceModeType()
	 * @generated
	 * @ordered
	 */
	protected static final ReferenceModeKindValues REFERENCE_MODE_TYPE_EDEFAULT = ReferenceModeKindValues.GENERAL;

	/**
	 * The cached value of the '{@link #getReferenceModeType() <em>Reference Mode Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceModeType()
	 * @generated
	 * @ordered
	 */
	protected ReferenceModeKindValues referenceModeType = REFERENCE_MODE_TYPE_EDEFAULT;

	/**
	 * This is true if the Reference Mode Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean referenceModeTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceModeKindTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getReferenceModeKindType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormatString() {
		return formatString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormatString(String newFormatString) {
		String oldFormatString = formatString;
		formatString = newFormatString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REFERENCE_MODE_KIND_TYPE__FORMAT_STRING, oldFormatString, formatString));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REFERENCE_MODE_KIND_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceModeKindValues getReferenceModeType() {
		return referenceModeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceModeType(ReferenceModeKindValues newReferenceModeType) {
		ReferenceModeKindValues oldReferenceModeType = referenceModeType;
		referenceModeType = newReferenceModeType == null ? REFERENCE_MODE_TYPE_EDEFAULT : newReferenceModeType;
		boolean oldReferenceModeTypeESet = referenceModeTypeESet;
		referenceModeTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.REFERENCE_MODE_KIND_TYPE__REFERENCE_MODE_TYPE, oldReferenceModeType, referenceModeType, !oldReferenceModeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferenceModeType() {
		ReferenceModeKindValues oldReferenceModeType = referenceModeType;
		boolean oldReferenceModeTypeESet = referenceModeTypeESet;
		referenceModeType = REFERENCE_MODE_TYPE_EDEFAULT;
		referenceModeTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.REFERENCE_MODE_KIND_TYPE__REFERENCE_MODE_TYPE, oldReferenceModeType, REFERENCE_MODE_TYPE_EDEFAULT, oldReferenceModeTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferenceModeType() {
		return referenceModeTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.REFERENCE_MODE_KIND_TYPE__FORMAT_STRING:
				return getFormatString();
			case CorePackage.REFERENCE_MODE_KIND_TYPE__ID:
				return getId();
			case CorePackage.REFERENCE_MODE_KIND_TYPE__REFERENCE_MODE_TYPE:
				return getReferenceModeType();
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
			case CorePackage.REFERENCE_MODE_KIND_TYPE__FORMAT_STRING:
				setFormatString((String)newValue);
				return;
			case CorePackage.REFERENCE_MODE_KIND_TYPE__ID:
				setId((String)newValue);
				return;
			case CorePackage.REFERENCE_MODE_KIND_TYPE__REFERENCE_MODE_TYPE:
				setReferenceModeType((ReferenceModeKindValues)newValue);
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
			case CorePackage.REFERENCE_MODE_KIND_TYPE__FORMAT_STRING:
				setFormatString(FORMAT_STRING_EDEFAULT);
				return;
			case CorePackage.REFERENCE_MODE_KIND_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.REFERENCE_MODE_KIND_TYPE__REFERENCE_MODE_TYPE:
				unsetReferenceModeType();
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
			case CorePackage.REFERENCE_MODE_KIND_TYPE__FORMAT_STRING:
				return FORMAT_STRING_EDEFAULT == null ? formatString != null : !FORMAT_STRING_EDEFAULT.equals(formatString);
			case CorePackage.REFERENCE_MODE_KIND_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.REFERENCE_MODE_KIND_TYPE__REFERENCE_MODE_TYPE:
				return isSetReferenceModeType();
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
		result.append(" (formatString: ");
		result.append(formatString);
		result.append(", id: ");
		result.append(id);
		result.append(", referenceModeType: ");
		if (referenceModeTypeESet) result.append(referenceModeType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ReferenceModeKindTypeImpl
