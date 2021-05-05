/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Display Related Types Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.diagram.DiagramPackage#getDisplayRelatedTypesType()
 * @model extendedMetaData="name='DisplayRelatedTypesType'"
 * @generated
 */
public enum DisplayRelatedTypesType implements Enumerator {
	/**
	 * The '<em><b>Attach All Types</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The shape attaches to both its supertypes and its subtypes.
	 * <!-- end-model-doc -->
	 * @see #ATTACH_ALL_TYPES_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACH_ALL_TYPES(0, "AttachAllTypes", "AttachAllTypes"),

	/**
	 * The '<em><b>Attach Subtypes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The shape attaches to its subtypes, but not its supertypes.
	 * <!-- end-model-doc -->
	 * @see #ATTACH_SUBTYPES_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACH_SUBTYPES(1, "AttachSubtypes", "AttachSubtypes"),

	/**
	 * The '<em><b>Attach Supertypes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The shape attaches to its supertypes, but not its subtypes.
	 * <!-- end-model-doc -->
	 * @see #ATTACH_SUPERTYPES_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACH_SUPERTYPES(2, "AttachSupertypes", "AttachSupertypes"),

	/**
	 * The '<em><b>Attach No Types</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The shape attaches to neither its subtypes nor its supertypes.
	 * <!-- end-model-doc -->
	 * @see #ATTACH_NO_TYPES_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACH_NO_TYPES(3, "AttachNoTypes", "AttachNoTypes");

	/**
	 * The '<em><b>Attach All Types</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The shape attaches to both its supertypes and its subtypes.
	 * <!-- end-model-doc -->
	 * @see #ATTACH_ALL_TYPES
	 * @model name="AttachAllTypes"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACH_ALL_TYPES_VALUE = 0;

	/**
	 * The '<em><b>Attach Subtypes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The shape attaches to its subtypes, but not its supertypes.
	 * <!-- end-model-doc -->
	 * @see #ATTACH_SUBTYPES
	 * @model name="AttachSubtypes"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACH_SUBTYPES_VALUE = 1;

	/**
	 * The '<em><b>Attach Supertypes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The shape attaches to its supertypes, but not its subtypes.
	 * <!-- end-model-doc -->
	 * @see #ATTACH_SUPERTYPES
	 * @model name="AttachSupertypes"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACH_SUPERTYPES_VALUE = 2;

	/**
	 * The '<em><b>Attach No Types</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The shape attaches to neither its subtypes nor its supertypes.
	 * <!-- end-model-doc -->
	 * @see #ATTACH_NO_TYPES
	 * @model name="AttachNoTypes"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACH_NO_TYPES_VALUE = 3;

	/**
	 * An array of all the '<em><b>Display Related Types Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DisplayRelatedTypesType[] VALUES_ARRAY =
		new DisplayRelatedTypesType[] {
			ATTACH_ALL_TYPES,
			ATTACH_SUBTYPES,
			ATTACH_SUPERTYPES,
			ATTACH_NO_TYPES,
		};

	/**
	 * A public read-only list of all the '<em><b>Display Related Types Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DisplayRelatedTypesType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Display Related Types Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DisplayRelatedTypesType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DisplayRelatedTypesType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Display Related Types Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DisplayRelatedTypesType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DisplayRelatedTypesType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Display Related Types Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DisplayRelatedTypesType get(int value) {
		switch (value) {
			case ATTACH_ALL_TYPES_VALUE: return ATTACH_ALL_TYPES;
			case ATTACH_SUBTYPES_VALUE: return ATTACH_SUBTYPES;
			case ATTACH_SUPERTYPES_VALUE: return ATTACH_SUPERTYPES;
			case ATTACH_NO_TYPES_VALUE: return ATTACH_NO_TYPES;
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
	private DisplayRelatedTypesType(int value, String name, String literal) {
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
	
} //DisplayRelatedTypesType
