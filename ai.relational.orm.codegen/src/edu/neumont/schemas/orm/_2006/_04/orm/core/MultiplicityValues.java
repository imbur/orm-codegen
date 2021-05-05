/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Multiplicity Values</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The UML-style multiplicity for a role in a binary fact type. Derived from internal uniqueness and mandatory constraints.
 * <!-- end-model-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getMultiplicityValues()
 * @model extendedMetaData="name='MultiplicityValues'"
 * @generated
 */
public enum MultiplicityValues implements Enumerator {
	/**
	 * The '<em><b>Unspecified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No internal constraints are specified.
	 * <!-- end-model-doc -->
	 * @see #UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSPECIFIED(0, "Unspecified", "Unspecified"),

	/**
	 * The '<em><b>Indeterminate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specified internal constraints are inconsistent, resulting in a multiplicity that cannot be determined.
	 * <!-- end-model-doc -->
	 * @see #INDETERMINATE_VALUE
	 * @generated
	 * @ordered
	 */
	INDETERMINATE(1, "Indeterminate", "Indeterminate"),

	/**
	 * The '<em><b>Zero To One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At most one instance of this role player may be associated with the opposite role player. Corresponds to a single role uniqueness constraint on the opposite role.
	 * <!-- end-model-doc -->
	 * @see #ZERO_TO_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	ZERO_TO_ONE(2, "ZeroToOne", "ZeroToOne"),

	/**
	 * The '<em><b>Zero To Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zero or more instances of this role player can be associated a single instance of the opposite role player.
	 * <!-- end-model-doc -->
	 * @see #ZERO_TO_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	ZERO_TO_MANY(3, "ZeroToMany", "ZeroToMany"),

	/**
	 * The '<em><b>Exactly One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exactly one instance of this role player may be associated with the opposite role player. Corresponds to single role uniqueness and mandatory constraints on the opposite role.
	 * <!-- end-model-doc -->
	 * @see #EXACTLY_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	EXACTLY_ONE(4, "ExactlyOne", "ExactlyOne"),

	/**
	 * The '<em><b>One To Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more instances of this role player can be associated a single instance of the opposite role player.
	 * <!-- end-model-doc -->
	 * @see #ONE_TO_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	ONE_TO_MANY(5, "OneToMany", "OneToMany");

	/**
	 * The '<em><b>Unspecified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No internal constraints are specified.
	 * <!-- end-model-doc -->
	 * @see #UNSPECIFIED
	 * @model name="Unspecified"
	 * @generated
	 * @ordered
	 */
	public static final int UNSPECIFIED_VALUE = 0;

	/**
	 * The '<em><b>Indeterminate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specified internal constraints are inconsistent, resulting in a multiplicity that cannot be determined.
	 * <!-- end-model-doc -->
	 * @see #INDETERMINATE
	 * @model name="Indeterminate"
	 * @generated
	 * @ordered
	 */
	public static final int INDETERMINATE_VALUE = 1;

	/**
	 * The '<em><b>Zero To One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At most one instance of this role player may be associated with the opposite role player. Corresponds to a single role uniqueness constraint on the opposite role.
	 * <!-- end-model-doc -->
	 * @see #ZERO_TO_ONE
	 * @model name="ZeroToOne"
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_TO_ONE_VALUE = 2;

	/**
	 * The '<em><b>Zero To Many</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zero or more instances of this role player can be associated a single instance of the opposite role player.
	 * <!-- end-model-doc -->
	 * @see #ZERO_TO_MANY
	 * @model name="ZeroToMany"
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_TO_MANY_VALUE = 3;

	/**
	 * The '<em><b>Exactly One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exactly one instance of this role player may be associated with the opposite role player. Corresponds to single role uniqueness and mandatory constraints on the opposite role.
	 * <!-- end-model-doc -->
	 * @see #EXACTLY_ONE
	 * @model name="ExactlyOne"
	 * @generated
	 * @ordered
	 */
	public static final int EXACTLY_ONE_VALUE = 4;

	/**
	 * The '<em><b>One To Many</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more instances of this role player can be associated a single instance of the opposite role player.
	 * <!-- end-model-doc -->
	 * @see #ONE_TO_MANY
	 * @model name="OneToMany"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_TO_MANY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Multiplicity Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MultiplicityValues[] VALUES_ARRAY =
		new MultiplicityValues[] {
			UNSPECIFIED,
			INDETERMINATE,
			ZERO_TO_ONE,
			ZERO_TO_MANY,
			EXACTLY_ONE,
			ONE_TO_MANY,
		};

	/**
	 * A public read-only list of all the '<em><b>Multiplicity Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MultiplicityValues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Multiplicity Values</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MultiplicityValues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultiplicityValues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplicity Values</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MultiplicityValues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultiplicityValues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplicity Values</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MultiplicityValues get(int value) {
		switch (value) {
			case UNSPECIFIED_VALUE: return UNSPECIFIED;
			case INDETERMINATE_VALUE: return INDETERMINATE;
			case ZERO_TO_ONE_VALUE: return ZERO_TO_ONE;
			case ZERO_TO_MANY_VALUE: return ZERO_TO_MANY;
			case EXACTLY_ONE_VALUE: return EXACTLY_ONE;
			case ONE_TO_MANY_VALUE: return ONE_TO_MANY;
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
	private MultiplicityValues(int value, String name, String literal) {
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
	
} //MultiplicityValues
