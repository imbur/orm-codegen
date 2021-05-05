/**
 */
package edu.neumont.schemas.orm._2006._04.orm.root;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ORM2 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.root.ORM2Type#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.root.RootPackage#getORM2Type()
 * @model extendedMetaData="name='ORM2_._type' kind='elementOnly'"
 * @generated
 */
public interface ORM2Type extends EObject {
	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.root.RootPackage#getORM2Type_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':0' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

} // ORM2Type
