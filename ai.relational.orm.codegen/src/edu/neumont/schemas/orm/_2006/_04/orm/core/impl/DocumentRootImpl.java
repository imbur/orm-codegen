/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.DocumentRoot;
import edu.neumont.schemas.orm._2006._04.orm.core.DynamicColorType;
import edu.neumont.schemas.orm._2006._04.orm.core.GenerationSettingType;
import edu.neumont.schemas.orm._2006._04.orm.core.GenerationStateType;
import edu.neumont.schemas.orm._2006._04.orm.core.GroupTypeType;
import edu.neumont.schemas.orm._2006._04.orm.core.GroupingType;
import edu.neumont.schemas.orm._2006._04.orm.core.ModelError;
import edu.neumont.schemas.orm._2006._04.orm.core.ModelErrorDisplayFilterType;
import edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType;
import edu.neumont.schemas.orm._2006._04.orm.core.ORMModelType;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DocumentRootImpl#getDynamicColor <em>Dynamic Color</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DocumentRootImpl#getExtensionModelError <em>Extension Model Error</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DocumentRootImpl#getGenerationSetting <em>Generation Setting</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DocumentRootImpl#getGenerationState <em>Generation State</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DocumentRootImpl#getGrouping <em>Grouping</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DocumentRootImpl#getGroupType <em>Group Type</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DocumentRootImpl#getModelErrorDisplayFilter <em>Model Error Display Filter</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DocumentRootImpl#getNameGenerator <em>Name Generator</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DocumentRootImpl#getORMModel <em>ORM Model</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.DocumentRootImpl#getORMModelBrowserDynamicColor <em>ORM Model Browser Dynamic Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CorePackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicColorType getDynamicColor() {
		return (DynamicColorType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_DynamicColor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDynamicColor(DynamicColorType newDynamicColor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_DynamicColor(), newDynamicColor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelError getExtensionModelError() {
		return (ModelError)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ExtensionModelError(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensionModelError(ModelError newExtensionModelError, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ExtensionModelError(), newExtensionModelError, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationSettingType getGenerationSetting() {
		return (GenerationSettingType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_GenerationSetting(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerationSetting(GenerationSettingType newGenerationSetting, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_GenerationSetting(), newGenerationSetting, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerationStateType getGenerationState() {
		return (GenerationStateType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_GenerationState(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerationState(GenerationStateType newGenerationState, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_GenerationState(), newGenerationState, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerationState(GenerationStateType newGenerationState) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_GenerationState(), newGenerationState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupingType getGrouping() {
		return (GroupingType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_Grouping(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrouping(GroupingType newGrouping, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_Grouping(), newGrouping, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrouping(GroupingType newGrouping) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_Grouping(), newGrouping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupTypeType getGroupType() {
		return (GroupTypeType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_GroupType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupType(GroupTypeType newGroupType, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_GroupType(), newGroupType, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelErrorDisplayFilterType getModelErrorDisplayFilter() {
		return (ModelErrorDisplayFilterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ModelErrorDisplayFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelErrorDisplayFilter(ModelErrorDisplayFilterType newModelErrorDisplayFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ModelErrorDisplayFilter(), newModelErrorDisplayFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelErrorDisplayFilter(ModelErrorDisplayFilterType newModelErrorDisplayFilter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ModelErrorDisplayFilter(), newModelErrorDisplayFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameGeneratorType getNameGenerator() {
		return (NameGeneratorType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_NameGenerator(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameGenerator(NameGeneratorType newNameGenerator, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_NameGenerator(), newNameGenerator, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameGenerator(NameGeneratorType newNameGenerator) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_NameGenerator(), newNameGenerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORMModelType getORMModel() {
		return (ORMModelType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ORMModel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORMModel(ORMModelType newORMModel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ORMModel(), newORMModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORMModel(ORMModelType newORMModel) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ORMModel(), newORMModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicColorType getORMModelBrowserDynamicColor() {
		return (DynamicColorType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ORMModelBrowserDynamicColor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORMModelBrowserDynamicColor(DynamicColorType newORMModelBrowserDynamicColor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ORMModelBrowserDynamicColor(), newORMModelBrowserDynamicColor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORMModelBrowserDynamicColor(DynamicColorType newORMModelBrowserDynamicColor) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ORMModelBrowserDynamicColor(), newORMModelBrowserDynamicColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case CorePackage.DOCUMENT_ROOT__DYNAMIC_COLOR:
				return basicSetDynamicColor(null, msgs);
			case CorePackage.DOCUMENT_ROOT__EXTENSION_MODEL_ERROR:
				return basicSetExtensionModelError(null, msgs);
			case CorePackage.DOCUMENT_ROOT__GENERATION_SETTING:
				return basicSetGenerationSetting(null, msgs);
			case CorePackage.DOCUMENT_ROOT__GENERATION_STATE:
				return basicSetGenerationState(null, msgs);
			case CorePackage.DOCUMENT_ROOT__GROUPING:
				return basicSetGrouping(null, msgs);
			case CorePackage.DOCUMENT_ROOT__GROUP_TYPE:
				return basicSetGroupType(null, msgs);
			case CorePackage.DOCUMENT_ROOT__MODEL_ERROR_DISPLAY_FILTER:
				return basicSetModelErrorDisplayFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__NAME_GENERATOR:
				return basicSetNameGenerator(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ORM_MODEL:
				return basicSetORMModel(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ORM_MODEL_BROWSER_DYNAMIC_COLOR:
				return basicSetORMModelBrowserDynamicColor(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case CorePackage.DOCUMENT_ROOT__DYNAMIC_COLOR:
				return getDynamicColor();
			case CorePackage.DOCUMENT_ROOT__EXTENSION_MODEL_ERROR:
				return getExtensionModelError();
			case CorePackage.DOCUMENT_ROOT__GENERATION_SETTING:
				return getGenerationSetting();
			case CorePackage.DOCUMENT_ROOT__GENERATION_STATE:
				return getGenerationState();
			case CorePackage.DOCUMENT_ROOT__GROUPING:
				return getGrouping();
			case CorePackage.DOCUMENT_ROOT__GROUP_TYPE:
				return getGroupType();
			case CorePackage.DOCUMENT_ROOT__MODEL_ERROR_DISPLAY_FILTER:
				return getModelErrorDisplayFilter();
			case CorePackage.DOCUMENT_ROOT__NAME_GENERATOR:
				return getNameGenerator();
			case CorePackage.DOCUMENT_ROOT__ORM_MODEL:
				return getORMModel();
			case CorePackage.DOCUMENT_ROOT__ORM_MODEL_BROWSER_DYNAMIC_COLOR:
				return getORMModelBrowserDynamicColor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__GENERATION_STATE:
				setGenerationState((GenerationStateType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__GROUPING:
				setGrouping((GroupingType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__MODEL_ERROR_DISPLAY_FILTER:
				setModelErrorDisplayFilter((ModelErrorDisplayFilterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__NAME_GENERATOR:
				setNameGenerator((NameGeneratorType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__ORM_MODEL:
				setORMModel((ORMModelType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__ORM_MODEL_BROWSER_DYNAMIC_COLOR:
				setORMModelBrowserDynamicColor((DynamicColorType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case CorePackage.DOCUMENT_ROOT__GENERATION_STATE:
				setGenerationState((GenerationStateType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__GROUPING:
				setGrouping((GroupingType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__MODEL_ERROR_DISPLAY_FILTER:
				setModelErrorDisplayFilter((ModelErrorDisplayFilterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__NAME_GENERATOR:
				setNameGenerator((NameGeneratorType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__ORM_MODEL:
				setORMModel((ORMModelType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__ORM_MODEL_BROWSER_DYNAMIC_COLOR:
				setORMModelBrowserDynamicColor((DynamicColorType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case CorePackage.DOCUMENT_ROOT__DYNAMIC_COLOR:
				return getDynamicColor() != null;
			case CorePackage.DOCUMENT_ROOT__EXTENSION_MODEL_ERROR:
				return getExtensionModelError() != null;
			case CorePackage.DOCUMENT_ROOT__GENERATION_SETTING:
				return getGenerationSetting() != null;
			case CorePackage.DOCUMENT_ROOT__GENERATION_STATE:
				return getGenerationState() != null;
			case CorePackage.DOCUMENT_ROOT__GROUPING:
				return getGrouping() != null;
			case CorePackage.DOCUMENT_ROOT__GROUP_TYPE:
				return getGroupType() != null;
			case CorePackage.DOCUMENT_ROOT__MODEL_ERROR_DISPLAY_FILTER:
				return getModelErrorDisplayFilter() != null;
			case CorePackage.DOCUMENT_ROOT__NAME_GENERATOR:
				return getNameGenerator() != null;
			case CorePackage.DOCUMENT_ROOT__ORM_MODEL:
				return getORMModel() != null;
			case CorePackage.DOCUMENT_ROOT__ORM_MODEL_BROWSER_DYNAMIC_COLOR:
				return getORMModelBrowserDynamicColor() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
