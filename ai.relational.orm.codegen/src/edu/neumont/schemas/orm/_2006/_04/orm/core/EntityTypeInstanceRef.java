/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Type Instance Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to an entity type instance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeInstanceRef#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeInstanceRef()
 * @model extendedMetaData="name='EntityTypeInstanceRef' kind='empty'"
 * @generated
 */
public interface EntityTypeInstanceRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of the referenced element's unique id.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getEntityTypeInstanceRef_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF" required="true"
	 *        extendedMetaData="kind='attribute' name='ref'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link edu.neumont.schemas.orm._2006._04.orm.core.EntityTypeInstanceRef#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

} // EntityTypeInstanceRef
