/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Mode Kind Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Setting for a specific kind of reference mode pattern.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindType#getFormatString <em>Format String</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindType#getReferenceModeType <em>Reference Mode Type</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getReferenceModeKindType()
 * @model extendedMetaData="name='ReferenceModeKindType' kind='empty'"
 * @generated
 */
public interface ReferenceModeKindType extends EObject {
	/**
	 * Returns the value of the '<em><b>Format String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string with replacement fields representing a custom format for a value type name based on the entity type name (replacement field {0}) and reference mode name (replacement field {1}). Given an entity type name and a value type name, reference mode FormatStrings are used to determine the associated reference mode and reference mode kind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format String</em>' attribute.
	 * @see #setFormatString(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getReferenceModeKindType_FormatString()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='FormatString'"
	 * @generated
	 */
	String getFormatString();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindType#getFormatString <em>Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format String</em>' attribute.
	 * @see #getFormatString()
	 * @generated
	 */
	void setFormatString(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getReferenceModeKindType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Reference Mode Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Mode Type</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindValues
	 * @see #isSetReferenceModeType()
	 * @see #unsetReferenceModeType()
	 * @see #setReferenceModeType(ReferenceModeKindValues)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getReferenceModeKindType_ReferenceModeType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='ReferenceModeType'"
	 * @generated
	 */
	ReferenceModeKindValues getReferenceModeType();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindType#getReferenceModeType <em>Reference Mode Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Mode Type</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindValues
	 * @see #isSetReferenceModeType()
	 * @see #unsetReferenceModeType()
	 * @see #getReferenceModeType()
	 * @generated
	 */
	void setReferenceModeType(ReferenceModeKindValues value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindType#getReferenceModeType <em>Reference Mode Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReferenceModeType()
	 * @see #getReferenceModeType()
	 * @see #setReferenceModeType(ReferenceModeKindValues)
	 * @generated
	 */
	void unsetReferenceModeType();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ReferenceModeKindType#getReferenceModeType <em>Reference Mode Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Reference Mode Type</em>' attribute is set.
	 * @see #unsetReferenceModeType()
	 * @see #getReferenceModeType()
	 * @see #setReferenceModeType(ReferenceModeKindValues)
	 * @generated
	 */
	boolean isSetReferenceModeType();

} // ReferenceModeKindType
