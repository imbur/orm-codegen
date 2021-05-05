/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A single cardinality range.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CardinalityRangeType#getFrom <em>From</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CardinalityRangeType#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.CardinalityRangeType#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCardinalityRangeType()
 * @model extendedMetaData="name='CardinalityRangeType' kind='empty'"
 * @generated
 */
public interface CardinalityRangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The lower bound of the cardinality range. A value of zero indicates than an empty population is allowed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(BigInteger)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCardinalityRangeType_From()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger" required="true"
	 *        extendedMetaData="kind='attribute' name='From'"
	 * @generated
	 */
	BigInteger getFrom();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CardinalityRangeType#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier for this element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCardinalityRangeType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CardinalityRangeType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The upper bound of the cardinality range. Set to the same value as the 'From' attribute for a single-valued range. If this is omitted, then an unbounded range is assumed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(BigInteger)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCardinalityRangeType_To()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="kind='attribute' name='To'"
	 * @generated
	 */
	BigInteger getTo();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.CardinalityRangeType#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(BigInteger value);

} // CardinalityRangeType
