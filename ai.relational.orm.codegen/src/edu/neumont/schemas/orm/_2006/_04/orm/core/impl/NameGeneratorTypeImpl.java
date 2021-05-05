/**
 */
package edu.neumont.schemas.orm._2006._04.orm.core.impl;

import edu.neumont.schemas.orm._2006._04.orm.core.CasingOptionType;
import edu.neumont.schemas.orm._2006._04.orm.core.CorePackage;
import edu.neumont.schemas.orm._2006._04.orm.core.ExtensionsType;
import edu.neumont.schemas.orm._2006._04.orm.core.NameGeneratorType;
import edu.neumont.schemas.orm._2006._04.orm.core.RefinementsType;
import edu.neumont.schemas.orm._2006._04.orm.core.SpacingFormatType;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Generator Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.NameGeneratorTypeImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.NameGeneratorTypeImpl#getRefinements <em>Refinements</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.NameGeneratorTypeImpl#isAutomaticallyShortenNames <em>Automatically Shorten Names</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.NameGeneratorTypeImpl#getCasingOption <em>Casing Option</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.NameGeneratorTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.NameGeneratorTypeImpl#getNameUsage <em>Name Usage</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.NameGeneratorTypeImpl#getSpacingFormat <em>Spacing Format</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.NameGeneratorTypeImpl#getSpacingReplacement <em>Spacing Replacement</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.NameGeneratorTypeImpl#getUserDefinedMaximum <em>User Defined Maximum</em>}</li>
 *   <li>{@link edu.neumont.schemas.orm._2006._04.orm.core.impl.NameGeneratorTypeImpl#isUseTargetDefaultMaximum <em>Use Target Default Maximum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameGeneratorTypeImpl extends MinimalEObjectImpl.Container implements NameGeneratorType {
	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected ExtensionsType extensions;

	/**
	 * The cached value of the '{@link #getRefinements() <em>Refinements</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinements()
	 * @generated
	 * @ordered
	 */
	protected RefinementsType refinements;

	/**
	 * The default value of the '{@link #isAutomaticallyShortenNames() <em>Automatically Shorten Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomaticallyShortenNames()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTOMATICALLY_SHORTEN_NAMES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAutomaticallyShortenNames() <em>Automatically Shorten Names</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAutomaticallyShortenNames()
	 * @generated
	 * @ordered
	 */
	protected boolean automaticallyShortenNames = AUTOMATICALLY_SHORTEN_NAMES_EDEFAULT;

	/**
	 * This is true if the Automatically Shorten Names attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean automaticallyShortenNamesESet;

	/**
	 * The default value of the '{@link #getCasingOption() <em>Casing Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasingOption()
	 * @generated
	 * @ordered
	 */
	protected static final CasingOptionType CASING_OPTION_EDEFAULT = CasingOptionType.NONE;

	/**
	 * The cached value of the '{@link #getCasingOption() <em>Casing Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasingOption()
	 * @generated
	 * @ordered
	 */
	protected CasingOptionType casingOption = CASING_OPTION_EDEFAULT;

	/**
	 * This is true if the Casing Option attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean casingOptionESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNameUsage() <em>Name Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameUsage()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_USAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameUsage() <em>Name Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameUsage()
	 * @generated
	 * @ordered
	 */
	protected String nameUsage = NAME_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpacingFormat() <em>Spacing Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacingFormat()
	 * @generated
	 * @ordered
	 */
	protected static final SpacingFormatType SPACING_FORMAT_EDEFAULT = SpacingFormatType.RETAIN;

	/**
	 * The cached value of the '{@link #getSpacingFormat() <em>Spacing Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacingFormat()
	 * @generated
	 * @ordered
	 */
	protected SpacingFormatType spacingFormat = SPACING_FORMAT_EDEFAULT;

	/**
	 * This is true if the Spacing Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spacingFormatESet;

	/**
	 * The default value of the '{@link #getSpacingReplacement() <em>Spacing Replacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacingReplacement()
	 * @generated
	 * @ordered
	 */
	protected static final String SPACING_REPLACEMENT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getSpacingReplacement() <em>Spacing Replacement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacingReplacement()
	 * @generated
	 * @ordered
	 */
	protected String spacingReplacement = SPACING_REPLACEMENT_EDEFAULT;

	/**
	 * This is true if the Spacing Replacement attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spacingReplacementESet;

	/**
	 * The default value of the '{@link #getUserDefinedMaximum() <em>User Defined Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger USER_DEFINED_MAXIMUM_EDEFAULT = new BigInteger("128");

	/**
	 * The cached value of the '{@link #getUserDefinedMaximum() <em>User Defined Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserDefinedMaximum()
	 * @generated
	 * @ordered
	 */
	protected BigInteger userDefinedMaximum = USER_DEFINED_MAXIMUM_EDEFAULT;

	/**
	 * This is true if the User Defined Maximum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean userDefinedMaximumESet;

	/**
	 * The default value of the '{@link #isUseTargetDefaultMaximum() <em>Use Target Default Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseTargetDefaultMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_TARGET_DEFAULT_MAXIMUM_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseTargetDefaultMaximum() <em>Use Target Default Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseTargetDefaultMaximum()
	 * @generated
	 * @ordered
	 */
	protected boolean useTargetDefaultMaximum = USE_TARGET_DEFAULT_MAXIMUM_EDEFAULT;

	/**
	 * This is true if the Use Target Default Maximum attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useTargetDefaultMaximumESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameGeneratorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getNameGeneratorType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsType getExtensions() {
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtensions(ExtensionsType newExtensions, NotificationChain msgs) {
		ExtensionsType oldExtensions = extensions;
		extensions = newExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.NAME_GENERATOR_TYPE__EXTENSIONS, oldExtensions, newExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensions(ExtensionsType newExtensions) {
		if (newExtensions != extensions) {
			NotificationChain msgs = null;
			if (extensions != null)
				msgs = ((InternalEObject)extensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.NAME_GENERATOR_TYPE__EXTENSIONS, null, msgs);
			if (newExtensions != null)
				msgs = ((InternalEObject)newExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.NAME_GENERATOR_TYPE__EXTENSIONS, null, msgs);
			msgs = basicSetExtensions(newExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NAME_GENERATOR_TYPE__EXTENSIONS, newExtensions, newExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefinementsType getRefinements() {
		return refinements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefinements(RefinementsType newRefinements, NotificationChain msgs) {
		RefinementsType oldRefinements = refinements;
		refinements = newRefinements;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.NAME_GENERATOR_TYPE__REFINEMENTS, oldRefinements, newRefinements);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefinements(RefinementsType newRefinements) {
		if (newRefinements != refinements) {
			NotificationChain msgs = null;
			if (refinements != null)
				msgs = ((InternalEObject)refinements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.NAME_GENERATOR_TYPE__REFINEMENTS, null, msgs);
			if (newRefinements != null)
				msgs = ((InternalEObject)newRefinements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.NAME_GENERATOR_TYPE__REFINEMENTS, null, msgs);
			msgs = basicSetRefinements(newRefinements, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NAME_GENERATOR_TYPE__REFINEMENTS, newRefinements, newRefinements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutomaticallyShortenNames() {
		return automaticallyShortenNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticallyShortenNames(boolean newAutomaticallyShortenNames) {
		boolean oldAutomaticallyShortenNames = automaticallyShortenNames;
		automaticallyShortenNames = newAutomaticallyShortenNames;
		boolean oldAutomaticallyShortenNamesESet = automaticallyShortenNamesESet;
		automaticallyShortenNamesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NAME_GENERATOR_TYPE__AUTOMATICALLY_SHORTEN_NAMES, oldAutomaticallyShortenNames, automaticallyShortenNames, !oldAutomaticallyShortenNamesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAutomaticallyShortenNames() {
		boolean oldAutomaticallyShortenNames = automaticallyShortenNames;
		boolean oldAutomaticallyShortenNamesESet = automaticallyShortenNamesESet;
		automaticallyShortenNames = AUTOMATICALLY_SHORTEN_NAMES_EDEFAULT;
		automaticallyShortenNamesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.NAME_GENERATOR_TYPE__AUTOMATICALLY_SHORTEN_NAMES, oldAutomaticallyShortenNames, AUTOMATICALLY_SHORTEN_NAMES_EDEFAULT, oldAutomaticallyShortenNamesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAutomaticallyShortenNames() {
		return automaticallyShortenNamesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasingOptionType getCasingOption() {
		return casingOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCasingOption(CasingOptionType newCasingOption) {
		CasingOptionType oldCasingOption = casingOption;
		casingOption = newCasingOption == null ? CASING_OPTION_EDEFAULT : newCasingOption;
		boolean oldCasingOptionESet = casingOptionESet;
		casingOptionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NAME_GENERATOR_TYPE__CASING_OPTION, oldCasingOption, casingOption, !oldCasingOptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCasingOption() {
		CasingOptionType oldCasingOption = casingOption;
		boolean oldCasingOptionESet = casingOptionESet;
		casingOption = CASING_OPTION_EDEFAULT;
		casingOptionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.NAME_GENERATOR_TYPE__CASING_OPTION, oldCasingOption, CASING_OPTION_EDEFAULT, oldCasingOptionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCasingOption() {
		return casingOptionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NAME_GENERATOR_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameUsage() {
		return nameUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameUsage(String newNameUsage) {
		String oldNameUsage = nameUsage;
		nameUsage = newNameUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NAME_GENERATOR_TYPE__NAME_USAGE, oldNameUsage, nameUsage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacingFormatType getSpacingFormat() {
		return spacingFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpacingFormat(SpacingFormatType newSpacingFormat) {
		SpacingFormatType oldSpacingFormat = spacingFormat;
		spacingFormat = newSpacingFormat == null ? SPACING_FORMAT_EDEFAULT : newSpacingFormat;
		boolean oldSpacingFormatESet = spacingFormatESet;
		spacingFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NAME_GENERATOR_TYPE__SPACING_FORMAT, oldSpacingFormat, spacingFormat, !oldSpacingFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpacingFormat() {
		SpacingFormatType oldSpacingFormat = spacingFormat;
		boolean oldSpacingFormatESet = spacingFormatESet;
		spacingFormat = SPACING_FORMAT_EDEFAULT;
		spacingFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.NAME_GENERATOR_TYPE__SPACING_FORMAT, oldSpacingFormat, SPACING_FORMAT_EDEFAULT, oldSpacingFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpacingFormat() {
		return spacingFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpacingReplacement() {
		return spacingReplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpacingReplacement(String newSpacingReplacement) {
		String oldSpacingReplacement = spacingReplacement;
		spacingReplacement = newSpacingReplacement;
		boolean oldSpacingReplacementESet = spacingReplacementESet;
		spacingReplacementESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NAME_GENERATOR_TYPE__SPACING_REPLACEMENT, oldSpacingReplacement, spacingReplacement, !oldSpacingReplacementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpacingReplacement() {
		String oldSpacingReplacement = spacingReplacement;
		boolean oldSpacingReplacementESet = spacingReplacementESet;
		spacingReplacement = SPACING_REPLACEMENT_EDEFAULT;
		spacingReplacementESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.NAME_GENERATOR_TYPE__SPACING_REPLACEMENT, oldSpacingReplacement, SPACING_REPLACEMENT_EDEFAULT, oldSpacingReplacementESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpacingReplacement() {
		return spacingReplacementESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getUserDefinedMaximum() {
		return userDefinedMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserDefinedMaximum(BigInteger newUserDefinedMaximum) {
		BigInteger oldUserDefinedMaximum = userDefinedMaximum;
		userDefinedMaximum = newUserDefinedMaximum;
		boolean oldUserDefinedMaximumESet = userDefinedMaximumESet;
		userDefinedMaximumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NAME_GENERATOR_TYPE__USER_DEFINED_MAXIMUM, oldUserDefinedMaximum, userDefinedMaximum, !oldUserDefinedMaximumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUserDefinedMaximum() {
		BigInteger oldUserDefinedMaximum = userDefinedMaximum;
		boolean oldUserDefinedMaximumESet = userDefinedMaximumESet;
		userDefinedMaximum = USER_DEFINED_MAXIMUM_EDEFAULT;
		userDefinedMaximumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.NAME_GENERATOR_TYPE__USER_DEFINED_MAXIMUM, oldUserDefinedMaximum, USER_DEFINED_MAXIMUM_EDEFAULT, oldUserDefinedMaximumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUserDefinedMaximum() {
		return userDefinedMaximumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseTargetDefaultMaximum() {
		return useTargetDefaultMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseTargetDefaultMaximum(boolean newUseTargetDefaultMaximum) {
		boolean oldUseTargetDefaultMaximum = useTargetDefaultMaximum;
		useTargetDefaultMaximum = newUseTargetDefaultMaximum;
		boolean oldUseTargetDefaultMaximumESet = useTargetDefaultMaximumESet;
		useTargetDefaultMaximumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.NAME_GENERATOR_TYPE__USE_TARGET_DEFAULT_MAXIMUM, oldUseTargetDefaultMaximum, useTargetDefaultMaximum, !oldUseTargetDefaultMaximumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseTargetDefaultMaximum() {
		boolean oldUseTargetDefaultMaximum = useTargetDefaultMaximum;
		boolean oldUseTargetDefaultMaximumESet = useTargetDefaultMaximumESet;
		useTargetDefaultMaximum = USE_TARGET_DEFAULT_MAXIMUM_EDEFAULT;
		useTargetDefaultMaximumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.NAME_GENERATOR_TYPE__USE_TARGET_DEFAULT_MAXIMUM, oldUseTargetDefaultMaximum, USE_TARGET_DEFAULT_MAXIMUM_EDEFAULT, oldUseTargetDefaultMaximumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseTargetDefaultMaximum() {
		return useTargetDefaultMaximumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.NAME_GENERATOR_TYPE__EXTENSIONS:
				return basicSetExtensions(null, msgs);
			case CorePackage.NAME_GENERATOR_TYPE__REFINEMENTS:
				return basicSetRefinements(null, msgs);
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
			case CorePackage.NAME_GENERATOR_TYPE__EXTENSIONS:
				return getExtensions();
			case CorePackage.NAME_GENERATOR_TYPE__REFINEMENTS:
				return getRefinements();
			case CorePackage.NAME_GENERATOR_TYPE__AUTOMATICALLY_SHORTEN_NAMES:
				return isAutomaticallyShortenNames();
			case CorePackage.NAME_GENERATOR_TYPE__CASING_OPTION:
				return getCasingOption();
			case CorePackage.NAME_GENERATOR_TYPE__ID:
				return getId();
			case CorePackage.NAME_GENERATOR_TYPE__NAME_USAGE:
				return getNameUsage();
			case CorePackage.NAME_GENERATOR_TYPE__SPACING_FORMAT:
				return getSpacingFormat();
			case CorePackage.NAME_GENERATOR_TYPE__SPACING_REPLACEMENT:
				return getSpacingReplacement();
			case CorePackage.NAME_GENERATOR_TYPE__USER_DEFINED_MAXIMUM:
				return getUserDefinedMaximum();
			case CorePackage.NAME_GENERATOR_TYPE__USE_TARGET_DEFAULT_MAXIMUM:
				return isUseTargetDefaultMaximum();
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
			case CorePackage.NAME_GENERATOR_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)newValue);
				return;
			case CorePackage.NAME_GENERATOR_TYPE__REFINEMENTS:
				setRefinements((RefinementsType)newValue);
				return;
			case CorePackage.NAME_GENERATOR_TYPE__AUTOMATICALLY_SHORTEN_NAMES:
				setAutomaticallyShortenNames((Boolean)newValue);
				return;
			case CorePackage.NAME_GENERATOR_TYPE__CASING_OPTION:
				setCasingOption((CasingOptionType)newValue);
				return;
			case CorePackage.NAME_GENERATOR_TYPE__ID:
				setId((String)newValue);
				return;
			case CorePackage.NAME_GENERATOR_TYPE__NAME_USAGE:
				setNameUsage((String)newValue);
				return;
			case CorePackage.NAME_GENERATOR_TYPE__SPACING_FORMAT:
				setSpacingFormat((SpacingFormatType)newValue);
				return;
			case CorePackage.NAME_GENERATOR_TYPE__SPACING_REPLACEMENT:
				setSpacingReplacement((String)newValue);
				return;
			case CorePackage.NAME_GENERATOR_TYPE__USER_DEFINED_MAXIMUM:
				setUserDefinedMaximum((BigInteger)newValue);
				return;
			case CorePackage.NAME_GENERATOR_TYPE__USE_TARGET_DEFAULT_MAXIMUM:
				setUseTargetDefaultMaximum((Boolean)newValue);
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
			case CorePackage.NAME_GENERATOR_TYPE__EXTENSIONS:
				setExtensions((ExtensionsType)null);
				return;
			case CorePackage.NAME_GENERATOR_TYPE__REFINEMENTS:
				setRefinements((RefinementsType)null);
				return;
			case CorePackage.NAME_GENERATOR_TYPE__AUTOMATICALLY_SHORTEN_NAMES:
				unsetAutomaticallyShortenNames();
				return;
			case CorePackage.NAME_GENERATOR_TYPE__CASING_OPTION:
				unsetCasingOption();
				return;
			case CorePackage.NAME_GENERATOR_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case CorePackage.NAME_GENERATOR_TYPE__NAME_USAGE:
				setNameUsage(NAME_USAGE_EDEFAULT);
				return;
			case CorePackage.NAME_GENERATOR_TYPE__SPACING_FORMAT:
				unsetSpacingFormat();
				return;
			case CorePackage.NAME_GENERATOR_TYPE__SPACING_REPLACEMENT:
				unsetSpacingReplacement();
				return;
			case CorePackage.NAME_GENERATOR_TYPE__USER_DEFINED_MAXIMUM:
				unsetUserDefinedMaximum();
				return;
			case CorePackage.NAME_GENERATOR_TYPE__USE_TARGET_DEFAULT_MAXIMUM:
				unsetUseTargetDefaultMaximum();
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
			case CorePackage.NAME_GENERATOR_TYPE__EXTENSIONS:
				return extensions != null;
			case CorePackage.NAME_GENERATOR_TYPE__REFINEMENTS:
				return refinements != null;
			case CorePackage.NAME_GENERATOR_TYPE__AUTOMATICALLY_SHORTEN_NAMES:
				return isSetAutomaticallyShortenNames();
			case CorePackage.NAME_GENERATOR_TYPE__CASING_OPTION:
				return isSetCasingOption();
			case CorePackage.NAME_GENERATOR_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CorePackage.NAME_GENERATOR_TYPE__NAME_USAGE:
				return NAME_USAGE_EDEFAULT == null ? nameUsage != null : !NAME_USAGE_EDEFAULT.equals(nameUsage);
			case CorePackage.NAME_GENERATOR_TYPE__SPACING_FORMAT:
				return isSetSpacingFormat();
			case CorePackage.NAME_GENERATOR_TYPE__SPACING_REPLACEMENT:
				return isSetSpacingReplacement();
			case CorePackage.NAME_GENERATOR_TYPE__USER_DEFINED_MAXIMUM:
				return isSetUserDefinedMaximum();
			case CorePackage.NAME_GENERATOR_TYPE__USE_TARGET_DEFAULT_MAXIMUM:
				return isSetUseTargetDefaultMaximum();
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
		result.append(" (automaticallyShortenNames: ");
		if (automaticallyShortenNamesESet) result.append(automaticallyShortenNames); else result.append("<unset>");
		result.append(", casingOption: ");
		if (casingOptionESet) result.append(casingOption); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", nameUsage: ");
		result.append(nameUsage);
		result.append(", spacingFormat: ");
		if (spacingFormatESet) result.append(spacingFormat); else result.append("<unset>");
		result.append(", spacingReplacement: ");
		if (spacingReplacementESet) result.append(spacingReplacement); else result.append("<unset>");
		result.append(", userDefinedMaximum: ");
		if (userDefinedMaximumESet) result.append(userDefinedMaximum); else result.append("<unset>");
		result.append(", useTargetDefaultMaximum: ");
		if (useTargetDefaultMaximumESet) result.append(useTargetDefaultMaximum); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //NameGeneratorTypeImpl
