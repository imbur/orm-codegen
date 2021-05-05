/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Compliance Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getTypeComplianceType()
 * @model extendedMetaData="name='TypeCompliance_._type'"
 * @generated
 */
public enum TypeComplianceType implements Enumerator {
	/**
	 * The '<em><b>Not Excluded</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allow any element that is not explicitly blocked by a group type.
	 * <!-- end-model-doc -->
	 * @see #NOT_EXCLUDED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_EXCLUDED(0, "NotExcluded", "NotExcluded"),

	/**
	 * The '<em><b>Partially Approved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At least one associated group type recognizes the element.
	 * <!-- end-model-doc -->
	 * @see #PARTIALLY_APPROVED_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIALLY_APPROVED(1, "PartiallyApproved", "PartiallyApproved"),

	/**
	 * The '<em><b>Fully Approved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All associated group types recognize the element.
	 * <!-- end-model-doc -->
	 * @see #FULLY_APPROVED_VALUE
	 * @generated
	 * @ordered
	 */
	FULLY_APPROVED(2, "FullyApproved", "FullyApproved");

	/**
	 * The '<em><b>Not Excluded</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allow any element that is not explicitly blocked by a group type.
	 * <!-- end-model-doc -->
	 * @see #NOT_EXCLUDED
	 * @model name="NotExcluded"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_EXCLUDED_VALUE = 0;

	/**
	 * The '<em><b>Partially Approved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At least one associated group type recognizes the element.
	 * <!-- end-model-doc -->
	 * @see #PARTIALLY_APPROVED
	 * @model name="PartiallyApproved"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIALLY_APPROVED_VALUE = 1;

	/**
	 * The '<em><b>Fully Approved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * All associated group types recognize the element.
	 * <!-- end-model-doc -->
	 * @see #FULLY_APPROVED
	 * @model name="FullyApproved"
	 * @generated
	 * @ordered
	 */
	public static final int FULLY_APPROVED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Type Compliance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypeComplianceType[] VALUES_ARRAY =
		new TypeComplianceType[] {
			NOT_EXCLUDED,
			PARTIALLY_APPROVED,
			FULLY_APPROVED,
		};

	/**
	 * A public read-only list of all the '<em><b>Type Compliance Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypeComplianceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type Compliance Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeComplianceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeComplianceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Compliance Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeComplianceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypeComplianceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type Compliance Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TypeComplianceType get(int value) {
		switch (value) {
			case NOT_EXCLUDED_VALUE: return NOT_EXCLUDED;
			case PARTIALLY_APPROVED_VALUE: return PARTIALLY_APPROVED;
			case FULLY_APPROVED_VALUE: return FULLY_APPROVED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TypeComplianceType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //TypeComplianceType
