/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Derivation Completeness Values</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Specify if instances of a derived fact or object type can also be directly asserted.
 * <!-- end-model-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDerivationCompletenessValues()
 * @model extendedMetaData="name='DerivationCompletenessValues'"
 * @generated
 */
public enum DerivationCompletenessValues implements Enumerator {
	/**
	 * The '<em><b>Fully Derived</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instance population is calculated on demand (default).
	 * <!-- end-model-doc -->
	 * @see #FULLY_DERIVED_VALUE
	 * @generated
	 * @ordered
	 */
	FULLY_DERIVED(0, "FullyDerived", "FullyDerived"),

	/**
	 * The '<em><b>Partially Derived</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instance population can be both calculated and asserted.
	 * <!-- end-model-doc -->
	 * @see #PARTIALLY_DERIVED_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIALLY_DERIVED(1, "PartiallyDerived", "PartiallyDerived");

	/**
	 * The '<em><b>Fully Derived</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instance population is calculated on demand (default).
	 * <!-- end-model-doc -->
	 * @see #FULLY_DERIVED
	 * @model name="FullyDerived"
	 * @generated
	 * @ordered
	 */
	public static final int FULLY_DERIVED_VALUE = 0;

	/**
	 * The '<em><b>Partially Derived</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The instance population can be both calculated and asserted.
	 * <!-- end-model-doc -->
	 * @see #PARTIALLY_DERIVED
	 * @model name="PartiallyDerived"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIALLY_DERIVED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Derivation Completeness Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DerivationCompletenessValues[] VALUES_ARRAY =
		new DerivationCompletenessValues[] {
			FULLY_DERIVED,
			PARTIALLY_DERIVED,
		};

	/**
	 * A public read-only list of all the '<em><b>Derivation Completeness Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DerivationCompletenessValues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Derivation Completeness Values</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DerivationCompletenessValues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DerivationCompletenessValues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Derivation Completeness Values</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DerivationCompletenessValues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DerivationCompletenessValues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Derivation Completeness Values</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DerivationCompletenessValues get(int value) {
		switch (value) {
			case FULLY_DERIVED_VALUE: return FULLY_DERIVED;
			case PARTIALLY_DERIVED_VALUE: return PARTIALLY_DERIVED;
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
	private DerivationCompletenessValues(int value, String name, String literal) {
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
	
} //DerivationCompletenessValues
