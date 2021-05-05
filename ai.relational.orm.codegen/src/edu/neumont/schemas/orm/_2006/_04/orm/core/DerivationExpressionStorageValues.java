/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Derivation Expression Storage Values</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Specify how instances of derived fact type are stored.
 * <!-- end-model-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDerivationExpressionStorageValues()
 * @model extendedMetaData="name='DerivationExpressionStorageValues'"
 * @generated
 */
public enum DerivationExpressionStorageValues implements Enumerator {
	/**
	 * The '<em><b>Derived</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fact instance population is calculated on demand.
	 * <!-- end-model-doc -->
	 * @see #DERIVED_VALUE
	 * @generated
	 * @ordered
	 */
	DERIVED(0, "Derived", "Derived"),

	/**
	 * The '<em><b>Derived And Stored</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fact instance population is calculated immediately and stored.
	 * <!-- end-model-doc -->
	 * @see #DERIVED_AND_STORED_VALUE
	 * @generated
	 * @ordered
	 */
	DERIVED_AND_STORED(1, "DerivedAndStored", "DerivedAndStored"),

	/**
	 * The '<em><b>Partially Derived</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fact instance population can be asserted as well as derived.
	 * <!-- end-model-doc -->
	 * @see #PARTIALLY_DERIVED_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIALLY_DERIVED(2, "PartiallyDerived", "PartiallyDerived"),

	/**
	 * The '<em><b>Partially Derived And Stored</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fact instance population can be asserted as well as calculated immediately and stored.
	 * <!-- end-model-doc -->
	 * @see #PARTIALLY_DERIVED_AND_STORED_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIALLY_DERIVED_AND_STORED(3, "PartiallyDerivedAndStored", "PartiallyDerivedAndStored");

	/**
	 * The '<em><b>Derived</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fact instance population is calculated on demand.
	 * <!-- end-model-doc -->
	 * @see #DERIVED
	 * @model name="Derived"
	 * @generated
	 * @ordered
	 */
	public static final int DERIVED_VALUE = 0;

	/**
	 * The '<em><b>Derived And Stored</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fact instance population is calculated immediately and stored.
	 * <!-- end-model-doc -->
	 * @see #DERIVED_AND_STORED
	 * @model name="DerivedAndStored"
	 * @generated
	 * @ordered
	 */
	public static final int DERIVED_AND_STORED_VALUE = 1;

	/**
	 * The '<em><b>Partially Derived</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fact instance population can be asserted as well as derived.
	 * <!-- end-model-doc -->
	 * @see #PARTIALLY_DERIVED
	 * @model name="PartiallyDerived"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIALLY_DERIVED_VALUE = 2;

	/**
	 * The '<em><b>Partially Derived And Stored</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fact instance population can be asserted as well as calculated immediately and stored.
	 * <!-- end-model-doc -->
	 * @see #PARTIALLY_DERIVED_AND_STORED
	 * @model name="PartiallyDerivedAndStored"
	 * @generated
	 * @ordered
	 */
	public static final int PARTIALLY_DERIVED_AND_STORED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Derivation Expression Storage Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DerivationExpressionStorageValues[] VALUES_ARRAY =
		new DerivationExpressionStorageValues[] {
			DERIVED,
			DERIVED_AND_STORED,
			PARTIALLY_DERIVED,
			PARTIALLY_DERIVED_AND_STORED,
		};

	/**
	 * A public read-only list of all the '<em><b>Derivation Expression Storage Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DerivationExpressionStorageValues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Derivation Expression Storage Values</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DerivationExpressionStorageValues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DerivationExpressionStorageValues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Derivation Expression Storage Values</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DerivationExpressionStorageValues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DerivationExpressionStorageValues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Derivation Expression Storage Values</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DerivationExpressionStorageValues get(int value) {
		switch (value) {
			case DERIVED_VALUE: return DERIVED;
			case DERIVED_AND_STORED_VALUE: return DERIVED_AND_STORED;
			case PARTIALLY_DERIVED_VALUE: return PARTIALLY_DERIVED;
			case PARTIALLY_DERIVED_AND_STORED_VALUE: return PARTIALLY_DERIVED_AND_STORED;
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
	private DerivationExpressionStorageValues(int value, String name, String literal) {
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
	
} //DerivationExpressionStorageValues
