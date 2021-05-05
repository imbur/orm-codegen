/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Reference Mode Kind Values</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Classification of reference mode patterns.
 * <!-- end-model-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getReferenceModeKindValues()
 * @model extendedMetaData="name='ReferenceModeKindValues'"
 * @generated
 */
public enum ReferenceModeKindValues implements Enumerator {
	/**
	 * The '<em><b>General</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference mode patterns resolves to a value type with no special semantics.
	 * <!-- end-model-doc -->
	 * @see #GENERAL_VALUE
	 * @generated
	 * @ordered
	 */
	GENERAL(0, "General", "General"),

	/**
	 * The '<em><b>Popular</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference mode patterns resolves to a value type with a name based on the identified entity type. The value type identifies exactly one entity type.
	 * <!-- end-model-doc -->
	 * @see #POPULAR_VALUE
	 * @generated
	 * @ordered
	 */
	POPULAR(1, "Popular", "Popular"),

	/**
	 * The '<em><b>Unit Based</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference mode patterns resolves to a value type that is associated with a measurable unit.
	 * <!-- end-model-doc -->
	 * @see #UNIT_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	UNIT_BASED(2, "UnitBased", "UnitBased");

	/**
	 * The '<em><b>General</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference mode patterns resolves to a value type with no special semantics.
	 * <!-- end-model-doc -->
	 * @see #GENERAL
	 * @model name="General"
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_VALUE = 0;

	/**
	 * The '<em><b>Popular</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference mode patterns resolves to a value type with a name based on the identified entity type. The value type identifies exactly one entity type.
	 * <!-- end-model-doc -->
	 * @see #POPULAR
	 * @model name="Popular"
	 * @generated
	 * @ordered
	 */
	public static final int POPULAR_VALUE = 1;

	/**
	 * The '<em><b>Unit Based</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reference mode patterns resolves to a value type that is associated with a measurable unit.
	 * <!-- end-model-doc -->
	 * @see #UNIT_BASED
	 * @model name="UnitBased"
	 * @generated
	 * @ordered
	 */
	public static final int UNIT_BASED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Reference Mode Kind Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReferenceModeKindValues[] VALUES_ARRAY =
		new ReferenceModeKindValues[] {
			GENERAL,
			POPULAR,
			UNIT_BASED,
		};

	/**
	 * A public read-only list of all the '<em><b>Reference Mode Kind Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReferenceModeKindValues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reference Mode Kind Values</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceModeKindValues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceModeKindValues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Mode Kind Values</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceModeKindValues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReferenceModeKindValues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reference Mode Kind Values</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ReferenceModeKindValues get(int value) {
		switch (value) {
			case GENERAL_VALUE: return GENERAL;
			case POPULAR_VALUE: return POPULAR;
			case UNIT_BASED_VALUE: return UNIT_BASED;
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
	private ReferenceModeKindValues(int value, String name, String literal) {
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
	
} //ReferenceModeKindValues
