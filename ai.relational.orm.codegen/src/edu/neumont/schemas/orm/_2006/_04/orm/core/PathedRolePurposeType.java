/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pathed Role Purpose Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Specify how a role in a path is used to step within and between fact types.
 * <!-- end-model-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getPathedRolePurposeType()
 * @model extendedMetaData="name='PathedRolePurposeType'"
 * @generated
 */
public enum PathedRolePurposeType implements Enumerator {
	/**
	 * The '<em><b>Start Role</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role is the beginning of a path and directly attached to the root object type.
	 * <!-- end-model-doc -->
	 * @see #START_ROLE_VALUE
	 * @generated
	 * @ordered
	 */
	START_ROLE(0, "StartRole", "StartRole"),

	/**
	 * The '<em><b>Same Fact Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role is the same fact type as the previous join or start role.
	 * <!-- end-model-doc -->
	 * @see #SAME_FACT_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	SAME_FACT_TYPE(1, "SameFactType", "SameFactType"),

	/**
	 * The '<em><b>Post Inner Join</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role represents an inner over a role player shared with the previous role in the path.
	 * <!-- end-model-doc -->
	 * @see #POST_INNER_JOIN_VALUE
	 * @generated
	 * @ordered
	 */
	POST_INNER_JOIN(2, "PostInnerJoin", "PostInnerJoin"),

	/**
	 * The '<em><b>Post Outer Join</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role represents an outer join over a role player shared with the previous role in the path.
	 * <!-- end-model-doc -->
	 * @see #POST_OUTER_JOIN_VALUE
	 * @generated
	 * @ordered
	 */
	POST_OUTER_JOIN(3, "PostOuterJoin", "PostOuterJoin");

	/**
	 * The '<em><b>Start Role</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role is the beginning of a path and directly attached to the root object type.
	 * <!-- end-model-doc -->
	 * @see #START_ROLE
	 * @model name="StartRole"
	 * @generated
	 * @ordered
	 */
	public static final int START_ROLE_VALUE = 0;

	/**
	 * The '<em><b>Same Fact Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role is the same fact type as the previous join or start role.
	 * <!-- end-model-doc -->
	 * @see #SAME_FACT_TYPE
	 * @model name="SameFactType"
	 * @generated
	 * @ordered
	 */
	public static final int SAME_FACT_TYPE_VALUE = 1;

	/**
	 * The '<em><b>Post Inner Join</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role represents an inner over a role player shared with the previous role in the path.
	 * <!-- end-model-doc -->
	 * @see #POST_INNER_JOIN
	 * @model name="PostInnerJoin"
	 * @generated
	 * @ordered
	 */
	public static final int POST_INNER_JOIN_VALUE = 2;

	/**
	 * The '<em><b>Post Outer Join</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The role represents an outer join over a role player shared with the previous role in the path.
	 * <!-- end-model-doc -->
	 * @see #POST_OUTER_JOIN
	 * @model name="PostOuterJoin"
	 * @generated
	 * @ordered
	 */
	public static final int POST_OUTER_JOIN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Pathed Role Purpose Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PathedRolePurposeType[] VALUES_ARRAY =
		new PathedRolePurposeType[] {
			START_ROLE,
			SAME_FACT_TYPE,
			POST_INNER_JOIN,
			POST_OUTER_JOIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Pathed Role Purpose Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PathedRolePurposeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pathed Role Purpose Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PathedRolePurposeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PathedRolePurposeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pathed Role Purpose Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PathedRolePurposeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PathedRolePurposeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pathed Role Purpose Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PathedRolePurposeType get(int value) {
		switch (value) {
			case START_ROLE_VALUE: return START_ROLE;
			case SAME_FACT_TYPE_VALUE: return SAME_FACT_TYPE;
			case POST_INNER_JOIN_VALUE: return POST_INNER_JOIN;
			case POST_OUTER_JOIN_VALUE: return POST_OUTER_JOIN;
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
	private PathedRolePurposeType(int value, String name, String literal) {
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
	
} //PathedRolePurposeType
