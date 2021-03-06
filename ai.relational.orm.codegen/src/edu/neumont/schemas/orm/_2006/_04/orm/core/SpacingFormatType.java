/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Spacing Format Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getSpacingFormatType()
 * @model extendedMetaData="name='SpacingFormat_._type'"
 * @generated
 */
public enum SpacingFormatType implements Enumerator {
	/**
	 * The '<em><b>Retain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Keep any spaces specified in names used in the ORM model.
	 * <!-- end-model-doc -->
	 * @see #RETAIN_VALUE
	 * @generated
	 * @ordered
	 */
	RETAIN(0, "Retain", "Retain"),

	/**
	 * The '<em><b>Remove</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate names using all upper case letters.
	 * <!-- end-model-doc -->
	 * @see #REMOVE_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVE(1, "Remove", "Remove"),

	/**
	 * The '<em><b>Replace With</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replace one or more spaces in model names with the character specified in the SpacingReplacement attribute.
	 * <!-- end-model-doc -->
	 * @see #REPLACE_WITH_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACE_WITH(2, "ReplaceWith", "ReplaceWith");

	/**
	 * The '<em><b>Retain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Keep any spaces specified in names used in the ORM model.
	 * <!-- end-model-doc -->
	 * @see #RETAIN
	 * @model name="Retain"
	 * @generated
	 * @ordered
	 */
	public static final int RETAIN_VALUE = 0;

	/**
	 * The '<em><b>Remove</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generate names using all upper case letters.
	 * <!-- end-model-doc -->
	 * @see #REMOVE
	 * @model name="Remove"
	 * @generated
	 * @ordered
	 */
	public static final int REMOVE_VALUE = 1;

	/**
	 * The '<em><b>Replace With</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replace one or more spaces in model names with the character specified in the SpacingReplacement attribute.
	 * <!-- end-model-doc -->
	 * @see #REPLACE_WITH
	 * @model name="ReplaceWith"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACE_WITH_VALUE = 2;

	/**
	 * An array of all the '<em><b>Spacing Format Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SpacingFormatType[] VALUES_ARRAY =
		new SpacingFormatType[] {
			RETAIN,
			REMOVE,
			REPLACE_WITH,
		};

	/**
	 * A public read-only list of all the '<em><b>Spacing Format Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SpacingFormatType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Spacing Format Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpacingFormatType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpacingFormatType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spacing Format Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpacingFormatType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SpacingFormatType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spacing Format Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SpacingFormatType get(int value) {
		switch (value) {
			case RETAIN_VALUE: return RETAIN;
			case REMOVE_VALUE: return REMOVE;
			case REPLACE_WITH_VALUE: return REPLACE_WITH;
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
	private SpacingFormatType(int value, String name, String literal) {
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
	
} //SpacingFormatType
