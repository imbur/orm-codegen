/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fact Type Derivation Expression Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * (Deprecated) A derivation expression. Use FactTypeDerivationPath/InformalRule/DerivationNote instead.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationExpressionType#getDerivationStorage <em>Derivation Storage</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeDerivationExpressionType()
 * @model extendedMetaData="name='FactTypeDerivationExpressionType' kind='elementOnly'"
 * @generated
 */
public interface FactTypeDerivationExpressionType extends DerivationExpressionType {
	/**
	 * Returns the value of the '<em><b>Derivation Storage</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.neumont.schemas.orm._2006._04.orm.core.DerivationExpressionStorageValues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derivation Storage</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DerivationExpressionStorageValues
	 * @see #isSetDerivationStorage()
	 * @see #unsetDerivationStorage()
	 * @see #setDerivationStorage(DerivationExpressionStorageValues)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getFactTypeDerivationExpressionType_DerivationStorage()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='DerivationStorage'"
	 * @generated
	 */
	DerivationExpressionStorageValues getDerivationStorage();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationExpressionType#getDerivationStorage <em>Derivation Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation Storage</em>' attribute.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.DerivationExpressionStorageValues
	 * @see #isSetDerivationStorage()
	 * @see #unsetDerivationStorage()
	 * @see #getDerivationStorage()
	 * @generated
	 */
	void setDerivationStorage(DerivationExpressionStorageValues value);

	/**
	 * Unsets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationExpressionType#getDerivationStorage <em>Derivation Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDerivationStorage()
	 * @see #getDerivationStorage()
	 * @see #setDerivationStorage(DerivationExpressionStorageValues)
	 * @generated
	 */
	void unsetDerivationStorage();

	/**
	 * Returns whether the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.FactTypeDerivationExpressionType#getDerivationStorage <em>Derivation Storage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Derivation Storage</em>' attribute is set.
	 * @see #unsetDerivationStorage()
	 * @see #getDerivationStorage()
	 * @see #setDerivationStorage(DerivationExpressionStorageValues)
	 * @generated
	 */
	boolean isSetDerivationStorage();

} // FactTypeDerivationExpressionType
