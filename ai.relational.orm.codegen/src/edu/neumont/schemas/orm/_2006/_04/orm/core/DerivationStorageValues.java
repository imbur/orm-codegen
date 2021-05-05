/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Derivation Storage Values</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Specify if derived fact or object instances should be recalculated on demand, or calculated on change and stored.
 * <!-- end-model-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getDerivationStorageValues()
 * @model extendedMetaData="name='DerivationStorageValues'"
 * @generated
 */
public enum DerivationStorageValues implements Enumerator {
	/**
	 * The '<em><b>Not Stored</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instances are recalculated on demand (default).
	 * <!-- end-model-doc -->
	 * @see #NOT_STORED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_STORED(0, "NotStored", "NotStored"),

	/**
	 * The '<em><b>Stored</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instances are calculated on change and stored.
	 * <!-- end-model-doc -->
	 * @see #STORED_VALUE
	 * @generated
	 * @ordered
	 */
	STORED(1, "Stored", "Stored");

	/**
	 * The '<em><b>Not Stored</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instances are recalculated on demand (default).
	 * <!-- end-model-doc -->
	 * @see #NOT_STORED
	 * @model name="NotStored"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_STORED_VALUE = 0;

	/**
	 * The '<em><b>Stored</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instances are calculated on change and stored.
	 * <!-- end-model-doc -->
	 * @see #STORED
	 * @model name="Stored"
	 * @generated
	 * @ordered
	 */
	public static final int STORED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Derivation Storage Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DerivationStorageValues[] VALUES_ARRAY =
		new DerivationStorageValues[] {
			NOT_STORED,
			STORED,
		};

	/**
	 * A public read-only list of all the '<em><b>Derivation Storage Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DerivationStorageValues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Derivation Storage Values</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DerivationStorageValues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DerivationStorageValues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Derivation Storage Values</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DerivationStorageValues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DerivationStorageValues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Derivation Storage Values</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DerivationStorageValues get(int value) {
		switch (value) {
			case NOT_STORED_VALUE: return NOT_STORED;
			case STORED_VALUE: return STORED;
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
	private DerivationStorageValues(int value, String name, String literal) {
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
	
} //DerivationStorageValues
