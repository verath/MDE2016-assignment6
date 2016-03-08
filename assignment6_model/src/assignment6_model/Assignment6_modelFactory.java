/**
 */
package assignment6_model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see assignment6_model.Assignment6_modelPackage
 * @generated
 */
public interface Assignment6_modelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Assignment6_modelFactory eINSTANCE = assignment6_model.impl.Assignment6_modelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Configurator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configurator</em>'.
	 * @generated
	 */
	Configurator createConfigurator();

	/**
	 * Returns a new object of class '<em>Simple Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Feature</em>'.
	 * @generated
	 */
	SimpleFeature createSimpleFeature();

	/**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
	Group createGroup();

	/**
	 * Returns a new object of class '<em>Integer Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Feature</em>'.
	 * @generated
	 */
	IntegerFeature createIntegerFeature();

	/**
	 * Returns a new object of class '<em>Binary Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Dependency</em>'.
	 * @generated
	 */
	BinaryDependency createBinaryDependency();

	/**
	 * Returns a new object of class '<em>Is Selected Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Is Selected Dependency</em>'.
	 * @generated
	 */
	IsSelectedDependency createIsSelectedDependency();

	/**
	 * Returns a new object of class '<em>Integer Value Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Value Dependency</em>'.
	 * @generated
	 */
	IntegerValueDependency createIntegerValueDependency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Assignment6_modelPackage getAssignment6_modelPackage();

} //Assignment6_modelFactory
