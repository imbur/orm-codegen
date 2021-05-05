/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Display Role Names Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getDisplayRoleNamesType()
 * @model extendedMetaData="name='DisplayRoleNames_._type'"
 * @generated
 */
public enum DisplayRoleNamesType implements Enumerator {
	/**
	 * The '<em><b>User Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	USER_DEFAULT(0, "UserDefault", "UserDefault"),

	/**
	 * The '<em><b>Off</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF_VALUE
	 * @generated
	 * @ordered
	 */
	OFF(1, "Off", "Off"),

	/**
	 * The '<em><b>On</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_VALUE
	 * @generated
	 * @ordered
	 */
	ON(2, "On", "On");

	/**
	 * The '<em><b>User Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_DEFAULT
	 * @model name="UserDefault"
	 * @generated
	 * @ordered
	 */
	public static final int USER_DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>Off</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF
	 * @model name="Off"
	 * @generated
	 * @ordered
	 */
	public static final int OFF_VALUE = 1;

	/**
	 * The '<em><b>On</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON
	 * @model name="On"
	 * @generated
	 * @ordered
	 */
	public static final int ON_VALUE = 2;

	/**
	 * An array of all the '<em><b>Display Role Names Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DisplayRoleNamesType[] VALUES_ARRAY =
		new DisplayRoleNamesType[] {
			USER_DEFAULT,
			OFF,
			ON,
		};

	/**
	 * A public read-only list of all the '<em><b>Display Role Names Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DisplayRoleNamesType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Display Role Names Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DisplayRoleNamesType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DisplayRoleNamesType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Display Role Names Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DisplayRoleNamesType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DisplayRoleNamesType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Display Role Names Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DisplayRoleNamesType get(int value) {
		switch (value) {
			case USER_DEFAULT_VALUE: return USER_DEFAULT;
			case OFF_VALUE: return OFF;
			case ON_VALUE: return ON;
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
	private DisplayRoleNamesType(int value, String name, String literal) {
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
	
} //DisplayRoleNamesType
