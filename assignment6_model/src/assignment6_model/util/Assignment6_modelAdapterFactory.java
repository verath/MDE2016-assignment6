/**
 */
package assignment6_model.util;

import assignment6_model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see assignment6_model.Assignment6_modelPackage
 * @generated
 */
public class Assignment6_modelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Assignment6_modelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment6_modelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Assignment6_modelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Assignment6_modelSwitch<Adapter> modelSwitch =
		new Assignment6_modelSwitch<Adapter>() {
			@Override
			public Adapter caseConfigurator(Configurator object) {
				return createConfiguratorAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseSimpleFeature(SimpleFeature object) {
				return createSimpleFeatureAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseIntegerFeature(IntegerFeature object) {
				return createIntegerFeatureAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseUnaryDependency(UnaryDependency object) {
				return createUnaryDependencyAdapter();
			}
			@Override
			public Adapter caseBinaryDependency(BinaryDependency object) {
				return createBinaryDependencyAdapter();
			}
			@Override
			public Adapter caseIsSelectedDependency(IsSelectedDependency object) {
				return createIsSelectedDependencyAdapter();
			}
			@Override
			public Adapter caseIntegerValueDependency(IntegerValueDependency object) {
				return createIntegerValueDependencyAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link assignment6_model.Configurator <em>Configurator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment6_model.Configurator
	 * @generated
	 */
	public Adapter createConfiguratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment6_model.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment6_model.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment6_model.SimpleFeature <em>Simple Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment6_model.SimpleFeature
	 * @generated
	 */
	public Adapter createSimpleFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment6_model.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment6_model.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment6_model.IntegerFeature <em>Integer Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment6_model.IntegerFeature
	 * @generated
	 */
	public Adapter createIntegerFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment6_model.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment6_model.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment6_model.UnaryDependency <em>Unary Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment6_model.UnaryDependency
	 * @generated
	 */
	public Adapter createUnaryDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment6_model.BinaryDependency <em>Binary Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment6_model.BinaryDependency
	 * @generated
	 */
	public Adapter createBinaryDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment6_model.IsSelectedDependency <em>Is Selected Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment6_model.IsSelectedDependency
	 * @generated
	 */
	public Adapter createIsSelectedDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link assignment6_model.IntegerValueDependency <em>Integer Value Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see assignment6_model.IntegerValueDependency
	 * @generated
	 */
	public Adapter createIntegerValueDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Assignment6_modelAdapterFactory
