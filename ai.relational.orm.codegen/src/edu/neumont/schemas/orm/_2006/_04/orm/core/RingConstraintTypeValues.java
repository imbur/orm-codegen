/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ring Constraint Type Values</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Restrictions on the intersections of instances associated with roles in a ring constraint.
 * <!-- end-model-doc -->
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getRingConstraintTypeValues()
 * @model extendedMetaData="name='RingConstraintTypeValues'"
 * @generated
 */
public enum RingConstraintTypeValues implements Enumerator {
	/**
	 * The '<em><b>Undefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ring type is undefined. Corresponds to a model validation error.
	 * <!-- end-model-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(0, "Undefined", "Undefined"),

	/**
	 * The '<em><b>Reflexive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays some instance then intance B plays itself.
	 * <!-- end-model-doc -->
	 * @see #REFLEXIVE_VALUE
	 * @generated
	 * @ordered
	 */
	REFLEXIVE(1, "Reflexive", "Reflexive"),

	/**
	 * The '<em><b>Irreflexive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No instance can play itself.
	 * <!-- end-model-doc -->
	 * @see #IRREFLEXIVE_VALUE
	 * @generated
	 * @ordered
	 */
	IRREFLEXIVE(2, "Irreflexive", "Irreflexive"),

	/**
	 * The '<em><b>Purely Reflexive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each instance plays itself and cannot play another instance.
	 * <!-- end-model-doc -->
	 * @see #PURELY_REFLEXIVE_VALUE
	 * @generated
	 * @ordered
	 */
	PURELY_REFLEXIVE(3, "PurelyReflexive", "PurelyReflexive"),

	/**
	 * The '<em><b>Symmetric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B then intance B plays instance A.
	 * <!-- end-model-doc -->
	 * @see #SYMMETRIC_VALUE
	 * @generated
	 * @ordered
	 */
	SYMMETRIC(4, "Symmetric", "Symmetric"),

	/**
	 * The '<em><b>Antisymmetric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A is not equal to instance B and A plays B, then B cannot play A.
	 * <!-- end-model-doc -->
	 * @see #ANTISYMMETRIC_VALUE
	 * @generated
	 * @ordered
	 */
	ANTISYMMETRIC(5, "Antisymmetric", "Antisymmetric"),

	/**
	 * The '<em><b>Asymmetric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B then instance B cannot play instance A.
	 * <!-- end-model-doc -->
	 * @see #ASYMMETRIC_VALUE
	 * @generated
	 * @ordered
	 */
	ASYMMETRIC(6, "Asymmetric", "Asymmetric"),

	/**
	 * The '<em><b>Transitive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B that plays instance C then instance A plays instance C.
	 * <!-- end-model-doc -->
	 * @see #TRANSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSITIVE(7, "Transitive", "Transitive"),

	/**
	 * The '<em><b>Intransitive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B and instance B plays instance C, then instance A cannot play instance C.
	 * <!-- end-model-doc -->
	 * @see #INTRANSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	INTRANSITIVE(8, "Intransitive", "Intransitive"),

	/**
	 * The '<em><b>Strongly Intransitive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B, then instance A cannot be indirectly related to instance B by repeatedly apply this fact type.
	 * <!-- end-model-doc -->
	 * @see #STRONGLY_INTRANSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	STRONGLY_INTRANSITIVE(9, "StronglyIntransitive", "StronglyIntransitive"),

	/**
	 * The '<em><b>Acyclic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cycles are not allowed.
	 * <!-- end-model-doc -->
	 * @see #ACYCLIC_VALUE
	 * @generated
	 * @ordered
	 */
	ACYCLIC(10, "Acyclic", "Acyclic"),

	/**
	 * The '<em><b>Acyclic Transitive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cycles are not allowed. If instance A plays instance B that plays instance C then instance A plays instance C.
	 * <!-- end-model-doc -->
	 * @see #ACYCLIC_TRANSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ACYCLIC_TRANSITIVE(11, "AcyclicTransitive", "AcyclicTransitive"),

	/**
	 * The '<em><b>Acyclic Intransitive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cycles are not allowed; and if instance A plays instance B and instance B plays instance C, then instance A cannot play instance C.
	 * <!-- end-model-doc -->
	 * @see #ACYCLIC_INTRANSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ACYCLIC_INTRANSITIVE(12, "AcyclicIntransitive", "AcyclicIntransitive"),

	/**
	 * The '<em><b>Acyclic Strongly Intransitive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cycles are not allowed; and if instance A plays instance B, then instance A cannot be indirectly related to instance B by repeatedly apply this fact type.
	 * <!-- end-model-doc -->
	 * @see #ACYCLIC_STRONGLY_INTRANSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ACYCLIC_STRONGLY_INTRANSITIVE(13, "AcyclicStronglyIntransitive", "AcyclicStronglyIntransitive"),

	/**
	 * The '<em><b>Reflexive Symmetric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays some instance then intance B plays itself. If instance A plays instance B then intance B plays instance A.
	 * <!-- end-model-doc -->
	 * @see #REFLEXIVE_SYMMETRIC_VALUE
	 * @generated
	 * @ordered
	 */
	REFLEXIVE_SYMMETRIC(14, "ReflexiveSymmetric", "ReflexiveSymmetric"),

	/**
	 * The '<em><b>Reflexive Antisymmetric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays some instance then intance B plays itself. If instance A is not equal to instance B and A plays B, then B cannot play A.
	 * <!-- end-model-doc -->
	 * @see #REFLEXIVE_ANTISYMMETRIC_VALUE
	 * @generated
	 * @ordered
	 */
	REFLEXIVE_ANTISYMMETRIC(15, "ReflexiveAntisymmetric", "ReflexiveAntisymmetric"),

	/**
	 * The '<em><b>Reflexive Transitive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays some instance then intance B plays itself. If instance A plays instance B that plays instance C then instance A plays instance C.
	 * <!-- end-model-doc -->
	 * @see #REFLEXIVE_TRANSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	REFLEXIVE_TRANSITIVE(16, "ReflexiveTransitive", "ReflexiveTransitive"),

	/**
	 * The '<em><b>Reflexive Transitive Antisymmetric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays some instance then intance B plays itself. If instance A plays instance B that plays instance C then instance A plays instance C. If instance A is not equal to instance B and A plays B, then B cannot play A.
	 * <!-- end-model-doc -->
	 * @see #REFLEXIVE_TRANSITIVE_ANTISYMMETRIC_VALUE
	 * @generated
	 * @ordered
	 */
	REFLEXIVE_TRANSITIVE_ANTISYMMETRIC(17, "ReflexiveTransitiveAntisymmetric", "ReflexiveTransitiveAntisymmetric"),

	/**
	 * The '<em><b>Symmetric Transitive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B then intance B plays instance A. If instance A plays instance B that plays instance C then instance A plays instance C.
	 * <!-- end-model-doc -->
	 * @see #SYMMETRIC_TRANSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	SYMMETRIC_TRANSITIVE(18, "SymmetricTransitive", "SymmetricTransitive"),

	/**
	 * The '<em><b>Symmetric Irreflexive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B then intance B plays instance A. No instance can play itself.
	 * <!-- end-model-doc -->
	 * @see #SYMMETRIC_IRREFLEXIVE_VALUE
	 * @generated
	 * @ordered
	 */
	SYMMETRIC_IRREFLEXIVE(19, "SymmetricIrreflexive", "SymmetricIrreflexive"),

	/**
	 * The '<em><b>Symmetric Intransitive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B then intance B plays instance A. If instance A plays instance B and instance B plays instance C, then instance A cannot play instance C.
	 * <!-- end-model-doc -->
	 * @see #SYMMETRIC_INTRANSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	SYMMETRIC_INTRANSITIVE(20, "SymmetricIntransitive", "SymmetricIntransitive"),

	/**
	 * The '<em><b>Symmetric Strongly Intransitive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B then intance B plays instance A. If instance A plays instance B, then instance A cannot be indirectly related to instance B by repeatedly apply this fact type.
	 * <!-- end-model-doc -->
	 * @see #SYMMETRIC_STRONGLY_INTRANSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	SYMMETRIC_STRONGLY_INTRANSITIVE(21, "SymmetricStronglyIntransitive", "SymmetricStronglyIntransitive"),

	/**
	 * The '<em><b>Asymmetric Intransitive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B then instance B cannot play instance A. If instance A plays instance B and instance B plays instance C, then instance A cannot play instance C.
	 * <!-- end-model-doc -->
	 * @see #ASYMMETRIC_INTRANSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ASYMMETRIC_INTRANSITIVE(22, "AsymmetricIntransitive", "AsymmetricIntransitive"),

	/**
	 * The '<em><b>Asymmetric Strongly Intransitive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B then instance B cannot play instance A. If instance A plays instance B, then instance A cannot be indirectly related to instance B by repeatedly apply this fact type.
	 * <!-- end-model-doc -->
	 * @see #ASYMMETRIC_STRONGLY_INTRANSITIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ASYMMETRIC_STRONGLY_INTRANSITIVE(23, "AsymmetricStronglyIntransitive", "AsymmetricStronglyIntransitive"),

	/**
	 * The '<em><b>Transitive Irreflexive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B that plays instance C then instance A plays instance C. No instance can play itself.
	 * <!-- end-model-doc -->
	 * @see #TRANSITIVE_IRREFLEXIVE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSITIVE_IRREFLEXIVE(24, "TransitiveIrreflexive", "TransitiveIrreflexive"),

	/**
	 * The '<em><b>Transitive Antisymmetric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B that plays instance C then instance A plays instance C. If instance A is not equal to instance B and A plays B, then B cannot play A.
	 * <!-- end-model-doc -->
	 * @see #TRANSITIVE_ANTISYMMETRIC_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSITIVE_ANTISYMMETRIC(25, "TransitiveAntisymmetric", "TransitiveAntisymmetric"),

	/**
	 * The '<em><b>Transitive Asymmetric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B that plays instance C then instance A plays instance C. If instance A plays instance B then instance B cannot play instance A.
	 * <!-- end-model-doc -->
	 * @see #TRANSITIVE_ASYMMETRIC_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSITIVE_ASYMMETRIC(26, "TransitiveAsymmetric", "TransitiveAsymmetric");

	/**
	 * The '<em><b>Undefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ring type is undefined. Corresponds to a model validation error.
	 * <!-- end-model-doc -->
	 * @see #UNDEFINED
	 * @model name="Undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 0;

	/**
	 * The '<em><b>Reflexive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays some instance then intance B plays itself.
	 * <!-- end-model-doc -->
	 * @see #REFLEXIVE
	 * @model name="Reflexive"
	 * @generated
	 * @ordered
	 */
	public static final int REFLEXIVE_VALUE = 1;

	/**
	 * The '<em><b>Irreflexive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No instance can play itself.
	 * <!-- end-model-doc -->
	 * @see #IRREFLEXIVE
	 * @model name="Irreflexive"
	 * @generated
	 * @ordered
	 */
	public static final int IRREFLEXIVE_VALUE = 2;

	/**
	 * The '<em><b>Purely Reflexive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each instance plays itself and cannot play another instance.
	 * <!-- end-model-doc -->
	 * @see #PURELY_REFLEXIVE
	 * @model name="PurelyReflexive"
	 * @generated
	 * @ordered
	 */
	public static final int PURELY_REFLEXIVE_VALUE = 3;

	/**
	 * The '<em><b>Symmetric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B then intance B plays instance A.
	 * <!-- end-model-doc -->
	 * @see #SYMMETRIC
	 * @model name="Symmetric"
	 * @generated
	 * @ordered
	 */
	public static final int SYMMETRIC_VALUE = 4;

	/**
	 * The '<em><b>Antisymmetric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A is not equal to instance B and A plays B, then B cannot play A.
	 * <!-- end-model-doc -->
	 * @see #ANTISYMMETRIC
	 * @model name="Antisymmetric"
	 * @generated
	 * @ordered
	 */
	public static final int ANTISYMMETRIC_VALUE = 5;

	/**
	 * The '<em><b>Asymmetric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B then instance B cannot play instance A.
	 * <!-- end-model-doc -->
	 * @see #ASYMMETRIC
	 * @model name="Asymmetric"
	 * @generated
	 * @ordered
	 */
	public static final int ASYMMETRIC_VALUE = 6;

	/**
	 * The '<em><b>Transitive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B that plays instance C then instance A plays instance C.
	 * <!-- end-model-doc -->
	 * @see #TRANSITIVE
	 * @model name="Transitive"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITIVE_VALUE = 7;

	/**
	 * The '<em><b>Intransitive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B and instance B plays instance C, then instance A cannot play instance C.
	 * <!-- end-model-doc -->
	 * @see #INTRANSITIVE
	 * @model name="Intransitive"
	 * @generated
	 * @ordered
	 */
	public static final int INTRANSITIVE_VALUE = 8;

	/**
	 * The '<em><b>Strongly Intransitive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B, then instance A cannot be indirectly related to instance B by repeatedly apply this fact type.
	 * <!-- end-model-doc -->
	 * @see #STRONGLY_INTRANSITIVE
	 * @model name="StronglyIntransitive"
	 * @generated
	 * @ordered
	 */
	public static final int STRONGLY_INTRANSITIVE_VALUE = 9;

	/**
	 * The '<em><b>Acyclic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cycles are not allowed.
	 * <!-- end-model-doc -->
	 * @see #ACYCLIC
	 * @model name="Acyclic"
	 * @generated
	 * @ordered
	 */
	public static final int ACYCLIC_VALUE = 10;

	/**
	 * The '<em><b>Acyclic Transitive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cycles are not allowed. If instance A plays instance B that plays instance C then instance A plays instance C.
	 * <!-- end-model-doc -->
	 * @see #ACYCLIC_TRANSITIVE
	 * @model name="AcyclicTransitive"
	 * @generated
	 * @ordered
	 */
	public static final int ACYCLIC_TRANSITIVE_VALUE = 11;

	/**
	 * The '<em><b>Acyclic Intransitive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cycles are not allowed; and if instance A plays instance B and instance B plays instance C, then instance A cannot play instance C.
	 * <!-- end-model-doc -->
	 * @see #ACYCLIC_INTRANSITIVE
	 * @model name="AcyclicIntransitive"
	 * @generated
	 * @ordered
	 */
	public static final int ACYCLIC_INTRANSITIVE_VALUE = 12;

	/**
	 * The '<em><b>Acyclic Strongly Intransitive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Cycles are not allowed; and if instance A plays instance B, then instance A cannot be indirectly related to instance B by repeatedly apply this fact type.
	 * <!-- end-model-doc -->
	 * @see #ACYCLIC_STRONGLY_INTRANSITIVE
	 * @model name="AcyclicStronglyIntransitive"
	 * @generated
	 * @ordered
	 */
	public static final int ACYCLIC_STRONGLY_INTRANSITIVE_VALUE = 13;

	/**
	 * The '<em><b>Reflexive Symmetric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays some instance then intance B plays itself. If instance A plays instance B then intance B plays instance A.
	 * <!-- end-model-doc -->
	 * @see #REFLEXIVE_SYMMETRIC
	 * @model name="ReflexiveSymmetric"
	 * @generated
	 * @ordered
	 */
	public static final int REFLEXIVE_SYMMETRIC_VALUE = 14;

	/**
	 * The '<em><b>Reflexive Antisymmetric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays some instance then intance B plays itself. If instance A is not equal to instance B and A plays B, then B cannot play A.
	 * <!-- end-model-doc -->
	 * @see #REFLEXIVE_ANTISYMMETRIC
	 * @model name="ReflexiveAntisymmetric"
	 * @generated
	 * @ordered
	 */
	public static final int REFLEXIVE_ANTISYMMETRIC_VALUE = 15;

	/**
	 * The '<em><b>Reflexive Transitive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays some instance then intance B plays itself. If instance A plays instance B that plays instance C then instance A plays instance C.
	 * <!-- end-model-doc -->
	 * @see #REFLEXIVE_TRANSITIVE
	 * @model name="ReflexiveTransitive"
	 * @generated
	 * @ordered
	 */
	public static final int REFLEXIVE_TRANSITIVE_VALUE = 16;

	/**
	 * The '<em><b>Reflexive Transitive Antisymmetric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays some instance then intance B plays itself. If instance A plays instance B that plays instance C then instance A plays instance C. If instance A is not equal to instance B and A plays B, then B cannot play A.
	 * <!-- end-model-doc -->
	 * @see #REFLEXIVE_TRANSITIVE_ANTISYMMETRIC
	 * @model name="ReflexiveTransitiveAntisymmetric"
	 * @generated
	 * @ordered
	 */
	public static final int REFLEXIVE_TRANSITIVE_ANTISYMMETRIC_VALUE = 17;

	/**
	 * The '<em><b>Symmetric Transitive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B then intance B plays instance A. If instance A plays instance B that plays instance C then instance A plays instance C.
	 * <!-- end-model-doc -->
	 * @see #SYMMETRIC_TRANSITIVE
	 * @model name="SymmetricTransitive"
	 * @generated
	 * @ordered
	 */
	public static final int SYMMETRIC_TRANSITIVE_VALUE = 18;

	/**
	 * The '<em><b>Symmetric Irreflexive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B then intance B plays instance A. No instance can play itself.
	 * <!-- end-model-doc -->
	 * @see #SYMMETRIC_IRREFLEXIVE
	 * @model name="SymmetricIrreflexive"
	 * @generated
	 * @ordered
	 */
	public static final int SYMMETRIC_IRREFLEXIVE_VALUE = 19;

	/**
	 * The '<em><b>Symmetric Intransitive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B then intance B plays instance A. If instance A plays instance B and instance B plays instance C, then instance A cannot play instance C.
	 * <!-- end-model-doc -->
	 * @see #SYMMETRIC_INTRANSITIVE
	 * @model name="SymmetricIntransitive"
	 * @generated
	 * @ordered
	 */
	public static final int SYMMETRIC_INTRANSITIVE_VALUE = 20;

	/**
	 * The '<em><b>Symmetric Strongly Intransitive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B then intance B plays instance A. If instance A plays instance B, then instance A cannot be indirectly related to instance B by repeatedly apply this fact type.
	 * <!-- end-model-doc -->
	 * @see #SYMMETRIC_STRONGLY_INTRANSITIVE
	 * @model name="SymmetricStronglyIntransitive"
	 * @generated
	 * @ordered
	 */
	public static final int SYMMETRIC_STRONGLY_INTRANSITIVE_VALUE = 21;

	/**
	 * The '<em><b>Asymmetric Intransitive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B then instance B cannot play instance A. If instance A plays instance B and instance B plays instance C, then instance A cannot play instance C.
	 * <!-- end-model-doc -->
	 * @see #ASYMMETRIC_INTRANSITIVE
	 * @model name="AsymmetricIntransitive"
	 * @generated
	 * @ordered
	 */
	public static final int ASYMMETRIC_INTRANSITIVE_VALUE = 22;

	/**
	 * The '<em><b>Asymmetric Strongly Intransitive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B then instance B cannot play instance A. If instance A plays instance B, then instance A cannot be indirectly related to instance B by repeatedly apply this fact type.
	 * <!-- end-model-doc -->
	 * @see #ASYMMETRIC_STRONGLY_INTRANSITIVE
	 * @model name="AsymmetricStronglyIntransitive"
	 * @generated
	 * @ordered
	 */
	public static final int ASYMMETRIC_STRONGLY_INTRANSITIVE_VALUE = 23;

	/**
	 * The '<em><b>Transitive Irreflexive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B that plays instance C then instance A plays instance C. No instance can play itself.
	 * <!-- end-model-doc -->
	 * @see #TRANSITIVE_IRREFLEXIVE
	 * @model name="TransitiveIrreflexive"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITIVE_IRREFLEXIVE_VALUE = 24;

	/**
	 * The '<em><b>Transitive Antisymmetric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B that plays instance C then instance A plays instance C. If instance A is not equal to instance B and A plays B, then B cannot play A.
	 * <!-- end-model-doc -->
	 * @see #TRANSITIVE_ANTISYMMETRIC
	 * @model name="TransitiveAntisymmetric"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITIVE_ANTISYMMETRIC_VALUE = 25;

	/**
	 * The '<em><b>Transitive Asymmetric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If instance A plays instance B that plays instance C then instance A plays instance C. If instance A plays instance B then instance B cannot play instance A.
	 * <!-- end-model-doc -->
	 * @see #TRANSITIVE_ASYMMETRIC
	 * @model name="TransitiveAsymmetric"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSITIVE_ASYMMETRIC_VALUE = 26;

	/**
	 * An array of all the '<em><b>Ring Constraint Type Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RingConstraintTypeValues[] VALUES_ARRAY =
		new RingConstraintTypeValues[] {
			UNDEFINED,
			REFLEXIVE,
			IRREFLEXIVE,
			PURELY_REFLEXIVE,
			SYMMETRIC,
			ANTISYMMETRIC,
			ASYMMETRIC,
			TRANSITIVE,
			INTRANSITIVE,
			STRONGLY_INTRANSITIVE,
			ACYCLIC,
			ACYCLIC_TRANSITIVE,
			ACYCLIC_INTRANSITIVE,
			ACYCLIC_STRONGLY_INTRANSITIVE,
			REFLEXIVE_SYMMETRIC,
			REFLEXIVE_ANTISYMMETRIC,
			REFLEXIVE_TRANSITIVE,
			REFLEXIVE_TRANSITIVE_ANTISYMMETRIC,
			SYMMETRIC_TRANSITIVE,
			SYMMETRIC_IRREFLEXIVE,
			SYMMETRIC_INTRANSITIVE,
			SYMMETRIC_STRONGLY_INTRANSITIVE,
			ASYMMETRIC_INTRANSITIVE,
			ASYMMETRIC_STRONGLY_INTRANSITIVE,
			TRANSITIVE_IRREFLEXIVE,
			TRANSITIVE_ANTISYMMETRIC,
			TRANSITIVE_ASYMMETRIC,
		};

	/**
	 * A public read-only list of all the '<em><b>Ring Constraint Type Values</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RingConstraintTypeValues> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ring Constraint Type Values</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RingConstraintTypeValues get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RingConstraintTypeValues result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ring Constraint Type Values</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RingConstraintTypeValues getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RingConstraintTypeValues result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ring Constraint Type Values</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RingConstraintTypeValues get(int value) {
		switch (value) {
			case UNDEFINED_VALUE: return UNDEFINED;
			case REFLEXIVE_VALUE: return REFLEXIVE;
			case IRREFLEXIVE_VALUE: return IRREFLEXIVE;
			case PURELY_REFLEXIVE_VALUE: return PURELY_REFLEXIVE;
			case SYMMETRIC_VALUE: return SYMMETRIC;
			case ANTISYMMETRIC_VALUE: return ANTISYMMETRIC;
			case ASYMMETRIC_VALUE: return ASYMMETRIC;
			case TRANSITIVE_VALUE: return TRANSITIVE;
			case INTRANSITIVE_VALUE: return INTRANSITIVE;
			case STRONGLY_INTRANSITIVE_VALUE: return STRONGLY_INTRANSITIVE;
			case ACYCLIC_VALUE: return ACYCLIC;
			case ACYCLIC_TRANSITIVE_VALUE: return ACYCLIC_TRANSITIVE;
			case ACYCLIC_INTRANSITIVE_VALUE: return ACYCLIC_INTRANSITIVE;
			case ACYCLIC_STRONGLY_INTRANSITIVE_VALUE: return ACYCLIC_STRONGLY_INTRANSITIVE;
			case REFLEXIVE_SYMMETRIC_VALUE: return REFLEXIVE_SYMMETRIC;
			case REFLEXIVE_ANTISYMMETRIC_VALUE: return REFLEXIVE_ANTISYMMETRIC;
			case REFLEXIVE_TRANSITIVE_VALUE: return REFLEXIVE_TRANSITIVE;
			case REFLEXIVE_TRANSITIVE_ANTISYMMETRIC_VALUE: return REFLEXIVE_TRANSITIVE_ANTISYMMETRIC;
			case SYMMETRIC_TRANSITIVE_VALUE: return SYMMETRIC_TRANSITIVE;
			case SYMMETRIC_IRREFLEXIVE_VALUE: return SYMMETRIC_IRREFLEXIVE;
			case SYMMETRIC_INTRANSITIVE_VALUE: return SYMMETRIC_INTRANSITIVE;
			case SYMMETRIC_STRONGLY_INTRANSITIVE_VALUE: return SYMMETRIC_STRONGLY_INTRANSITIVE;
			case ASYMMETRIC_INTRANSITIVE_VALUE: return ASYMMETRIC_INTRANSITIVE;
			case ASYMMETRIC_STRONGLY_INTRANSITIVE_VALUE: return ASYMMETRIC_STRONGLY_INTRANSITIVE;
			case TRANSITIVE_IRREFLEXIVE_VALUE: return TRANSITIVE_IRREFLEXIVE;
			case TRANSITIVE_ANTISYMMETRIC_VALUE: return TRANSITIVE_ANTISYMMETRIC;
			case TRANSITIVE_ASYMMETRIC_VALUE: return TRANSITIVE_ASYMMETRIC;
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
	private RingConstraintTypeValues(int value, String name, String literal) {
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
	
} //RingConstraintTypeValues
