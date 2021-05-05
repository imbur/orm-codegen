/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Constraint Modality Values</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The strength of a constraint.
 * <!-- end-model-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getConstraintModalityValues()
 * @model extendedMetaData="name='ConstraintModalityValues'"
 * @generated
 */
public enum ConstraintModalityValues implements Enumerator {
	/**
	 * The '<em><b>Alethic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A strong constraint that is enforced by the structure of a generated system.
	 * <!-- end-model-doc -->
	 * @see #ALETHIC_VALUE
	 * @generated
	 * @ordered
	 */
	ALETHIC(0, "Alethic", "Alethic"),

	/**
	 * The '<em><b>Deontic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A weak constraint that should not be violated. Instances violating a deontic constraint can be structurally stored in a generated system.
	 * <!-- end-model-doc -->
	 * @see #DEONTIC_VALUE
	 * @generated
	 * @ordered
	 */
	DEONTIC(1, "Deontic", "Deontic");

	/**
	 * The '<em><b>Alethic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A strong constraint that is enforced by the structure of a generated system.
	 * <!-- end-model-doc -->
	 * @see #ALETHIC
	 * @model name="Alethic"
	 * @generated
	 * @ordered
	 */
	public static final int ALETHIC_VALUE = 0;

	/**
	 * The '<em><b>Deontic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A weak constraint that should not be violated. Instances violating a deontic constraint can be structurally stored in a generated system.
	 * <!-- end-model-doc -->
	 * @see #DEONTIC
	 * @model name="Deontic"
	 * @generated
	 * @ordered
	 */
	public static final int DEONTIC_VALUE = 1;

	/**
	 * An array of all the '<em><b>Constraint Modality Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConstraintModalityValues[] VALUES_ARRAY =
		new ConstraintModalityValues[] {
			ALETHIC,
			DEONTIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Constraint Modality Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConstraintModalityValues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Constraint Modality Values</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintModalityValues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConstraintModalityValues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint Modality Values</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintModalityValues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConstraintModalityValues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Constraint Modality Values</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConstraintModalityValues get(int value) {
		switch (value) {
			case ALETHIC_VALUE: return ALETHIC;
			case DEONTIC_VALUE: return DEONTIC;
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
	private ConstraintModalityValues(int value, String name, String literal) {
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
	
} //ConstraintModalityValues
