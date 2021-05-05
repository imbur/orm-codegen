/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Casing Option Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getCasingOptionType()
 * @model extendedMetaData="name='CasingOption_._type'"
 * @generated
 */
public enum CasingOptionType implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No casing options specified.
	 * <!-- end-model-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"),

	/**
	 * The '<em><b>Camel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate names using camel casing (first letter of first word lower case, first letter of subsequent words upper case).
	 * <!-- end-model-doc -->
	 * @see #CAMEL_VALUE
	 * @generated
	 * @ordered
	 */
	CAMEL(1, "Camel", "Camel"),

	/**
	 * The '<em><b>Pascal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate names using Pascal casing (first letter of all words upper case).
	 * <!-- end-model-doc -->
	 * @see #PASCAL_VALUE
	 * @generated
	 * @ordered
	 */
	PASCAL(2, "Pascal", "Pascal"),

	/**
	 * The '<em><b>Upper</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate names using all upper case letters.
	 * <!-- end-model-doc -->
	 * @see #UPPER_VALUE
	 * @generated
	 * @ordered
	 */
	UPPER(3, "Upper", "Upper"),

	/**
	 * The '<em><b>Lower</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate names using all lower case letters.
	 * <!-- end-model-doc -->
	 * @see #LOWER_VALUE
	 * @generated
	 * @ordered
	 */
	LOWER(4, "Lower", "Lower");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No casing options specified.
	 * <!-- end-model-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Camel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate names using camel casing (first letter of first word lower case, first letter of subsequent words upper case).
	 * <!-- end-model-doc -->
	 * @see #CAMEL
	 * @model name="Camel"
	 * @generated
	 * @ordered
	 */
	public static final int CAMEL_VALUE = 1;

	/**
	 * The '<em><b>Pascal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate names using Pascal casing (first letter of all words upper case).
	 * <!-- end-model-doc -->
	 * @see #PASCAL
	 * @model name="Pascal"
	 * @generated
	 * @ordered
	 */
	public static final int PASCAL_VALUE = 2;

	/**
	 * The '<em><b>Upper</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate names using all upper case letters.
	 * <!-- end-model-doc -->
	 * @see #UPPER
	 * @model name="Upper"
	 * @generated
	 * @ordered
	 */
	public static final int UPPER_VALUE = 3;

	/**
	 * The '<em><b>Lower</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate names using all lower case letters.
	 * <!-- end-model-doc -->
	 * @see #LOWER
	 * @model name="Lower"
	 * @generated
	 * @ordered
	 */
	public static final int LOWER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Casing Option Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CasingOptionType[] VALUES_ARRAY =
		new CasingOptionType[] {
			NONE,
			CAMEL,
			PASCAL,
			UPPER,
			LOWER,
		};

	/**
	 * A public read-only list of all the '<em><b>Casing Option Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CasingOptionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Casing Option Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CasingOptionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CasingOptionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Casing Option Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CasingOptionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CasingOptionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Casing Option Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CasingOptionType get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case CAMEL_VALUE: return CAMEL;
			case PASCAL_VALUE: return PASCAL;
			case UPPER_VALUE: return UPPER;
			case LOWER_VALUE: return LOWER;
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
	private CasingOptionType(int value, String name, String literal) {
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
	
} //CasingOptionType
