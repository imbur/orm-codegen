/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generation Settings Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.GenerationSettingsType#getGroup <em>Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.GenerationSettingsType#getGenerationSettingGroup <em>Generation Setting Group</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.GenerationSettingsType#getGenerationSetting <em>Generation Setting</em>}</li>
 * </ul>
 *
 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getGenerationSettingsType()
 * @model extendedMetaData="name='GenerationSettings_._type' kind='elementOnly'"
 * @generated
 */
public interface GenerationSettingsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getGenerationSettingsType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Generation Setting Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Setting Group</em>' attribute list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getGenerationSettingsType_GenerationSettingGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='GenerationSetting:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getGenerationSettingGroup();

	/**
	 * Returns the value of the '<em><b>Generation Setting</b></em>' containment reference list.
	 * The list contents are of type {@link edu.neumont.schemas.orm._2006._04.orm.core.GenerationSettingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation Setting</em>' containment reference list.
	 * @see edu.neumont.schemas.orm._2006._04.orm.core.CorePackage#getGenerationSettingsType_GenerationSetting()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='GenerationSetting' namespace='##targetNamespace' group='GenerationSetting:group'"
	 * @generated
	 */
	EList<GenerationSettingType> getGenerationSetting();

} // GenerationSettingsType
