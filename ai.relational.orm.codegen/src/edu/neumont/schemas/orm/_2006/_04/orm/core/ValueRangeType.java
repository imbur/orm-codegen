/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A simple value range.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType#getInvariantMaxValue <em>Invariant Max Value</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType#getInvariantMinValue <em>Invariant Min Value</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType#getMaxInclusion <em>Max Inclusion</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType#getMinInclusion <em>Min Inclusion</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueRangeType()
 * @model extendedMetaData="name='ValueRangeType' kind='empty'"
 * @generated
 */
public interface ValueRangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueRangeType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Invariant Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A culture-invariant form of the maxValue attribute. This value will not be set for a data type where any value is allowed (such as a string) or if the minValue could not be interpreted by the current data type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invariant Max Value</em>' attribute.
	 * @see #setInvariantMaxValue(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueRangeType_InvariantMaxValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='InvariantMaxValue'"
	 * @generated
	 */
	String getInvariantMaxValue();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType#getInvariantMaxValue <em>Invariant Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant Max Value</em>' attribute.
	 * @see #getInvariantMaxValue()
	 * @generated
	 */
	void setInvariantMaxValue(String value);

	/**
	 * Returns the value of the '<em><b>Invariant Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A culture-invariant form of the minValue attribute. This value will not be set for a data type where any value is allowed (such as a string) or if the minValue could not be interpreted by the current data type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Invariant Min Value</em>' attribute.
	 * @see #setInvariantMinValue(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueRangeType_InvariantMinValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='InvariantMinValue'"
	 * @generated
	 */
	String getInvariantMinValue();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType#getInvariantMinValue <em>Invariant Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant Min Value</em>' attribute.
	 * @see #getInvariantMinValue()
	 * @generated
	 */
	void setInvariantMinValue(String value);

	/**
	 * Returns the value of the '<em><b>Max Inclusion</b></em>' attribute.
	 * The default value is <code>"NotSet"</code>.
	 * The literals are from the enumeration {@link edu.neumont.schemas.orm._2006._04.orm.core.RangeInclusionValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Does the range include the upper bound?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Inclusion</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RangeInclusionValues
	 * @see #isSetMaxInclusion()
	 * @see #unsetMaxInclusion()
	 * @see #setMaxInclusion(RangeInclusionValues)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueRangeType_MaxInclusion()
	 * @model default="NotSet" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='MaxInclusion'"
	 * @generated
	 */
	RangeInclusionValues getMaxInclusion();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType#getMaxInclusion <em>Max Inclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Inclusion</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RangeInclusionValues
	 * @see #isSetMaxInclusion()
	 * @see #unsetMaxInclusion()
	 * @see #getMaxInclusion()
	 * @generated
	 */
	void setMaxInclusion(RangeInclusionValues value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType#getMaxInclusion <em>Max Inclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxInclusion()
	 * @see #getMaxInclusion()
	 * @see #setMaxInclusion(RangeInclusionValues)
	 * @generated
	 */
	void unsetMaxInclusion();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType#getMaxInclusion <em>Max Inclusion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Inclusion</em>' attribute is set.
	 * @see #unsetMaxInclusion()
	 * @see #getMaxInclusion()
	 * @see #setMaxInclusion(RangeInclusionValues)
	 * @generated
	 */
	boolean isSetMaxInclusion();

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper bound of the range. Duplicate of the MinValue for a single value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueRangeType_MaxValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='MaxValue'"
	 * @generated
	 */
	String getMaxValue();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(String value);

	/**
	 * Returns the value of the '<em><b>Min Inclusion</b></em>' attribute.
	 * The default value is <code>"NotSet"</code>.
	 * The literals are from the enumeration {@link edu.neumont.schemas.orm._2006._04.orm.core.RangeInclusionValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Does the range include the lower bound?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Inclusion</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RangeInclusionValues
	 * @see #isSetMinInclusion()
	 * @see #unsetMinInclusion()
	 * @see #setMinInclusion(RangeInclusionValues)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueRangeType_MinInclusion()
	 * @model default="NotSet" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='MinInclusion'"
	 * @generated
	 */
	RangeInclusionValues getMinInclusion();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType#getMinInclusion <em>Min Inclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Inclusion</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.RangeInclusionValues
	 * @see #isSetMinInclusion()
	 * @see #unsetMinInclusion()
	 * @see #getMinInclusion()
	 * @generated
	 */
	void setMinInclusion(RangeInclusionValues value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType#getMinInclusion <em>Min Inclusion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinInclusion()
	 * @see #getMinInclusion()
	 * @see #setMinInclusion(RangeInclusionValues)
	 * @generated
	 */
	void unsetMinInclusion();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType#getMinInclusion <em>Min Inclusion</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Min Inclusion</em>' attribute is set.
	 * @see #unsetMinInclusion()
	 * @see #getMinInclusion()
	 * @see #setMinInclusion(RangeInclusionValues)
	 * @generated
	 */
	boolean isSetMinInclusion();

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lower bound for the range.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getValueRangeType_MinValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='MinValue'"
	 * @generated
	 */
	String getMinValue();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.ValueRangeType#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(String value);

} // ValueRangeType
