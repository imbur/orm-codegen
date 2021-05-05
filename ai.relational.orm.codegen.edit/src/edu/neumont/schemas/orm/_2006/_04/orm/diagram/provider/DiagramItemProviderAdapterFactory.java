/**
 */
package edu.neumont.schemas.orm._2006._04.orm.diagram.provider;

import edu.neumont.schemas.orm._2006._04.orm.diagram.util.DiagramAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DiagramItemProviderAdapterFactory extends DiagramAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.CardinalityConstraintShapeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardinalityConstraintShapeTypeItemProvider cardinalityConstraintShapeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.CardinalityConstraintShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCardinalityConstraintShapeTypeAdapter() {
		if (cardinalityConstraintShapeTypeItemProvider == null) {
			cardinalityConstraintShapeTypeItemProvider = new CardinalityConstraintShapeTypeItemProvider(this);
		}

		return cardinalityConstraintShapeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootItemProvider documentRootItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.DocumentRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDocumentRootAdapter() {
		if (documentRootItemProvider == null) {
			documentRootItemProvider = new DocumentRootItemProvider(this);
		}

		return documentRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ExternalConstraintShapeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalConstraintShapeTypeItemProvider externalConstraintShapeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ExternalConstraintShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExternalConstraintShapeTypeAdapter() {
		if (externalConstraintShapeTypeItemProvider == null) {
			externalConstraintShapeTypeItemProvider = new ExternalConstraintShapeTypeItemProvider(this);
		}

		return externalConstraintShapeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FactTypeShapeTypeItemProvider factTypeShapeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.FactTypeShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFactTypeShapeTypeAdapter() {
		if (factTypeShapeTypeItemProvider == null) {
			factTypeShapeTypeItemProvider = new FactTypeShapeTypeItemProvider(this);
		}

		return factTypeShapeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.FrequencyConstraintShapeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrequencyConstraintShapeTypeItemProvider frequencyConstraintShapeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.FrequencyConstraintShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFrequencyConstraintShapeTypeAdapter() {
		if (frequencyConstraintShapeTypeItemProvider == null) {
			frequencyConstraintShapeTypeItemProvider = new FrequencyConstraintShapeTypeItemProvider(this);
		}

		return frequencyConstraintShapeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ModelNoteShapeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelNoteShapeTypeItemProvider modelNoteShapeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ModelNoteShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelNoteShapeTypeAdapter() {
		if (modelNoteShapeTypeItemProvider == null) {
			modelNoteShapeTypeItemProvider = new ModelNoteShapeTypeItemProvider(this);
		}

		return modelNoteShapeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectTypeShapeTypeItemProvider objectTypeShapeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ObjectTypeShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectTypeShapeTypeAdapter() {
		if (objectTypeShapeTypeItemProvider == null) {
			objectTypeShapeTypeItemProvider = new ObjectTypeShapeTypeItemProvider(this);
		}

		return objectTypeShapeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ORMDiagramTypeItemProvider ormDiagramTypeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ORMDiagramType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createORMDiagramTypeAdapter() {
		if (ormDiagramTypeItemProvider == null) {
			ormDiagramTypeItemProvider = new ORMDiagramTypeItemProvider(this);
		}

		return ormDiagramTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ReadingShapeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadingShapeTypeItemProvider readingShapeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ReadingShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReadingShapeTypeAdapter() {
		if (readingShapeTypeItemProvider == null) {
			readingShapeTypeItemProvider = new ReadingShapeTypeItemProvider(this);
		}

		return readingShapeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeShapesTypeItemProvider relativeShapesTypeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelativeShapesTypeAdapter() {
		if (relativeShapesTypeItemProvider == null) {
			relativeShapesTypeItemProvider = new RelativeShapesTypeItemProvider(this);
		}

		return relativeShapesTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativeShapesType1ItemProvider relativeShapesType1ItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.RelativeShapesType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelativeShapesType1Adapter() {
		if (relativeShapesType1ItemProvider == null) {
			relativeShapesType1ItemProvider = new RelativeShapesType1ItemProvider(this);
		}

		return relativeShapesType1ItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.RingConstraintShapeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RingConstraintShapeTypeItemProvider ringConstraintShapeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.RingConstraintShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRingConstraintShapeTypeAdapter() {
		if (ringConstraintShapeTypeItemProvider == null) {
			ringConstraintShapeTypeItemProvider = new RingConstraintShapeTypeItemProvider(this);
		}

		return ringConstraintShapeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleDisplayOrderType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleDisplayOrderTypeItemProvider roleDisplayOrderTypeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleDisplayOrderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleDisplayOrderTypeAdapter() {
		if (roleDisplayOrderTypeItemProvider == null) {
			roleDisplayOrderTypeItemProvider = new RoleDisplayOrderTypeItemProvider(this);
		}

		return roleDisplayOrderTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleNameShapeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleNameShapeTypeItemProvider roleNameShapeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleNameShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleNameShapeTypeAdapter() {
		if (roleNameShapeTypeItemProvider == null) {
			roleNameShapeTypeItemProvider = new RoleNameShapeTypeItemProvider(this);
		}

		return roleNameShapeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleTypeItemProvider roleTypeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.RoleType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRoleTypeAdapter() {
		if (roleTypeItemProvider == null) {
			roleTypeItemProvider = new RoleTypeItemProvider(this);
		}

		return roleTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapesTypeItemProvider shapesTypeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ShapesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShapesTypeAdapter() {
		if (shapesTypeItemProvider == null) {
			shapesTypeItemProvider = new ShapesTypeItemProvider(this);
		}

		return shapesTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.SubjectRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectRefItemProvider subjectRefItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.SubjectRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubjectRefAdapter() {
		if (subjectRefItemProvider == null) {
			subjectRefItemProvider = new SubjectRefItemProvider(this);
		}

		return subjectRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueComparisonConstraintShapeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueComparisonConstraintShapeTypeItemProvider valueComparisonConstraintShapeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueComparisonConstraintShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueComparisonConstraintShapeTypeAdapter() {
		if (valueComparisonConstraintShapeTypeItemProvider == null) {
			valueComparisonConstraintShapeTypeItemProvider = new ValueComparisonConstraintShapeTypeItemProvider(this);
		}

		return valueComparisonConstraintShapeTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueConstraintShapeTypeItemProvider valueConstraintShapeTypeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.neumont.schemas.orm._2006._04.orm.diagram.ValueConstraintShapeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueConstraintShapeTypeAdapter() {
		if (valueConstraintShapeTypeItemProvider == null) {
			valueConstraintShapeTypeItemProvider = new ValueConstraintShapeTypeItemProvider(this);
		}

		return valueConstraintShapeTypeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (cardinalityConstraintShapeTypeItemProvider != null) cardinalityConstraintShapeTypeItemProvider.dispose();
		if (documentRootItemProvider != null) documentRootItemProvider.dispose();
		if (externalConstraintShapeTypeItemProvider != null) externalConstraintShapeTypeItemProvider.dispose();
		if (factTypeShapeTypeItemProvider != null) factTypeShapeTypeItemProvider.dispose();
		if (frequencyConstraintShapeTypeItemProvider != null) frequencyConstraintShapeTypeItemProvider.dispose();
		if (modelNoteShapeTypeItemProvider != null) modelNoteShapeTypeItemProvider.dispose();
		if (objectTypeShapeTypeItemProvider != null) objectTypeShapeTypeItemProvider.dispose();
		if (ormDiagramTypeItemProvider != null) ormDiagramTypeItemProvider.dispose();
		if (readingShapeTypeItemProvider != null) readingShapeTypeItemProvider.dispose();
		if (relativeShapesTypeItemProvider != null) relativeShapesTypeItemProvider.dispose();
		if (relativeShapesType1ItemProvider != null) relativeShapesType1ItemProvider.dispose();
		if (ringConstraintShapeTypeItemProvider != null) ringConstraintShapeTypeItemProvider.dispose();
		if (roleDisplayOrderTypeItemProvider != null) roleDisplayOrderTypeItemProvider.dispose();
		if (roleNameShapeTypeItemProvider != null) roleNameShapeTypeItemProvider.dispose();
		if (roleTypeItemProvider != null) roleTypeItemProvider.dispose();
		if (shapesTypeItemProvider != null) shapesTypeItemProvider.dispose();
		if (subjectRefItemProvider != null) subjectRefItemProvider.dispose();
		if (valueComparisonConstraintShapeTypeItemProvider != null) valueComparisonConstraintShapeTypeItemProvider.dispose();
		if (valueConstraintShapeTypeItemProvider != null) valueConstraintShapeTypeItemProvider.dispose();
	}

}