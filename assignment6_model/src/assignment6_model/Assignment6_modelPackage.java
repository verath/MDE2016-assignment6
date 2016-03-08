/**
 */
package assignment6_model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see assignment6_model.Assignment6_modelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Assignment6_modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "assignment6_model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/assignment6_model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "assignment6_model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Assignment6_modelPackage eINSTANCE = assignment6_model.impl.Assignment6_modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link assignment6_model.impl.ConfiguratorImpl <em>Configurator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment6_model.impl.ConfiguratorImpl
	 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getConfigurator()
	 * @generated
	 */
	int CONFIGURATOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATOR__FEATURES = 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATOR__GROUPS = 2;

	/**
	 * The number of structural features of the '<em>Configurator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Configurator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment6_model.Feature <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment6_model.Feature
	 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__GROUPS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DEPENDENCIES = 3;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__MANDATORY = 4;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SELECTED = 5;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment6_model.impl.SimpleFeatureImpl <em>Simple Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment6_model.impl.SimpleFeatureImpl
	 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getSimpleFeature()
	 * @generated
	 */
	int SIMPLE_FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE__FEATURES = FEATURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE__GROUPS = FEATURE__GROUPS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE__DEPENDENCIES = FEATURE__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE__MANDATORY = FEATURE__MANDATORY;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE__SELECTED = FEATURE__SELECTED;

	/**
	 * The number of structural features of the '<em>Simple Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FEATURE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assignment6_model.impl.GroupImpl <em>Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment6_model.impl.GroupImpl
	 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getGroup()
	 * @generated
	 */
	int GROUP = 3;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__FEATURES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__NAME = 1;

	/**
	 * The feature id for the '<em><b>Group Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP__GROUP_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment6_model.impl.IntegerFeatureImpl <em>Integer Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment6_model.impl.IntegerFeatureImpl
	 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getIntegerFeature()
	 * @generated
	 */
	int INTEGER_FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE__FEATURES = FEATURE__FEATURES;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE__GROUPS = FEATURE__GROUPS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE__DEPENDENCIES = FEATURE__DEPENDENCIES;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE__MANDATORY = FEATURE__MANDATORY;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE__SELECTED = FEATURE__SELECTED;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE__MIN_VALUE = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE__MAX_VALUE = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE__STEP = FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE__VALUE = FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Integer Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Integer Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assignment6_model.Dependency <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment6_model.Dependency
	 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 5;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NOT = 0;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link assignment6_model.UnaryDependency <em>Unary Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment6_model.UnaryDependency
	 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getUnaryDependency()
	 * @generated
	 */
	int UNARY_DEPENDENCY = 6;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DEPENDENCY__NOT = DEPENDENCY__NOT;

	/**
	 * The number of structural features of the '<em>Unary Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unary Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DEPENDENCY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assignment6_model.impl.BinaryDependencyImpl <em>Binary Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment6_model.impl.BinaryDependencyImpl
	 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getBinaryDependency()
	 * @generated
	 */
	int BINARY_DEPENDENCY = 7;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEPENDENCY__NOT = DEPENDENCY__NOT;

	/**
	 * The feature id for the '<em><b>Right Hand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEPENDENCY__RIGHT_HAND = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left Hand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEPENDENCY__LEFT_HAND = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEPENDENCY__OPERATOR = DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEPENDENCY_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_DEPENDENCY_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assignment6_model.impl.IsSelectedDependencyImpl <em>Is Selected Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment6_model.impl.IsSelectedDependencyImpl
	 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getIsSelectedDependency()
	 * @generated
	 */
	int IS_SELECTED_DEPENDENCY = 8;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SELECTED_DEPENDENCY__NOT = UNARY_DEPENDENCY__NOT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SELECTED_DEPENDENCY__TARGET = UNARY_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Selected Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SELECTED_DEPENDENCY_FEATURE_COUNT = UNARY_DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Is Selected Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SELECTED_DEPENDENCY_OPERATION_COUNT = UNARY_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assignment6_model.impl.IntegerValueDependencyImpl <em>Integer Value Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment6_model.impl.IntegerValueDependencyImpl
	 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getIntegerValueDependency()
	 * @generated
	 */
	int INTEGER_VALUE_DEPENDENCY = 9;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_DEPENDENCY__NOT = UNARY_DEPENDENCY__NOT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_DEPENDENCY__TARGET = UNARY_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_DEPENDENCY__VALUE = UNARY_DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Value Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_DEPENDENCY_FEATURE_COUNT = UNARY_DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Integer Value Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_VALUE_DEPENDENCY_OPERATION_COUNT = UNARY_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link assignment6_model.GroupType <em>Group Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment6_model.GroupType
	 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getGroupType()
	 * @generated
	 */
	int GROUP_TYPE = 10;

	/**
	 * The meta object id for the '{@link assignment6_model.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see assignment6_model.BinaryOperator
	 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 11;


	/**
	 * Returns the meta object for class '{@link assignment6_model.Configurator <em>Configurator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configurator</em>'.
	 * @see assignment6_model.Configurator
	 * @generated
	 */
	EClass getConfigurator();

	/**
	 * Returns the meta object for the attribute '{@link assignment6_model.Configurator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assignment6_model.Configurator#getName()
	 * @see #getConfigurator()
	 * @generated
	 */
	EAttribute getConfigurator_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment6_model.Configurator#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see assignment6_model.Configurator#getFeatures()
	 * @see #getConfigurator()
	 * @generated
	 */
	EReference getConfigurator_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment6_model.Configurator#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see assignment6_model.Configurator#getGroups()
	 * @see #getConfigurator()
	 * @generated
	 */
	EReference getConfigurator_Groups();

	/**
	 * Returns the meta object for class '{@link assignment6_model.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see assignment6_model.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment6_model.Feature#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see assignment6_model.Feature#getFeatures()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Features();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment6_model.Feature#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see assignment6_model.Feature#getGroups()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Groups();

	/**
	 * Returns the meta object for the attribute '{@link assignment6_model.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assignment6_model.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment6_model.Feature#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see assignment6_model.Feature#getDependencies()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Dependencies();

	/**
	 * Returns the meta object for the attribute '{@link assignment6_model.Feature#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see assignment6_model.Feature#isMandatory()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Mandatory();

	/**
	 * Returns the meta object for the attribute '{@link assignment6_model.Feature#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see assignment6_model.Feature#isSelected()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Selected();

	/**
	 * Returns the meta object for class '{@link assignment6_model.SimpleFeature <em>Simple Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Feature</em>'.
	 * @see assignment6_model.SimpleFeature
	 * @generated
	 */
	EClass getSimpleFeature();

	/**
	 * Returns the meta object for class '{@link assignment6_model.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group</em>'.
	 * @see assignment6_model.Group
	 * @generated
	 */
	EClass getGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link assignment6_model.Group#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see assignment6_model.Group#getFeatures()
	 * @see #getGroup()
	 * @generated
	 */
	EReference getGroup_Features();

	/**
	 * Returns the meta object for the attribute '{@link assignment6_model.Group#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see assignment6_model.Group#getName()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_Name();

	/**
	 * Returns the meta object for the attribute '{@link assignment6_model.Group#getGroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Type</em>'.
	 * @see assignment6_model.Group#getGroupType()
	 * @see #getGroup()
	 * @generated
	 */
	EAttribute getGroup_GroupType();

	/**
	 * Returns the meta object for class '{@link assignment6_model.IntegerFeature <em>Integer Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Feature</em>'.
	 * @see assignment6_model.IntegerFeature
	 * @generated
	 */
	EClass getIntegerFeature();

	/**
	 * Returns the meta object for the attribute '{@link assignment6_model.IntegerFeature#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see assignment6_model.IntegerFeature#getMinValue()
	 * @see #getIntegerFeature()
	 * @generated
	 */
	EAttribute getIntegerFeature_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link assignment6_model.IntegerFeature#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see assignment6_model.IntegerFeature#getMaxValue()
	 * @see #getIntegerFeature()
	 * @generated
	 */
	EAttribute getIntegerFeature_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link assignment6_model.IntegerFeature#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see assignment6_model.IntegerFeature#getStep()
	 * @see #getIntegerFeature()
	 * @generated
	 */
	EAttribute getIntegerFeature_Step();

	/**
	 * Returns the meta object for the attribute '{@link assignment6_model.IntegerFeature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see assignment6_model.IntegerFeature#getValue()
	 * @see #getIntegerFeature()
	 * @generated
	 */
	EAttribute getIntegerFeature_Value();

	/**
	 * Returns the meta object for class '{@link assignment6_model.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see assignment6_model.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the attribute '{@link assignment6_model.Dependency#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see assignment6_model.Dependency#isNot()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_Not();

	/**
	 * Returns the meta object for class '{@link assignment6_model.UnaryDependency <em>Unary Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Dependency</em>'.
	 * @see assignment6_model.UnaryDependency
	 * @generated
	 */
	EClass getUnaryDependency();

	/**
	 * Returns the meta object for class '{@link assignment6_model.BinaryDependency <em>Binary Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Dependency</em>'.
	 * @see assignment6_model.BinaryDependency
	 * @generated
	 */
	EClass getBinaryDependency();

	/**
	 * Returns the meta object for the containment reference '{@link assignment6_model.BinaryDependency#getRightHand <em>Right Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Hand</em>'.
	 * @see assignment6_model.BinaryDependency#getRightHand()
	 * @see #getBinaryDependency()
	 * @generated
	 */
	EReference getBinaryDependency_RightHand();

	/**
	 * Returns the meta object for the containment reference '{@link assignment6_model.BinaryDependency#getLeftHand <em>Left Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Hand</em>'.
	 * @see assignment6_model.BinaryDependency#getLeftHand()
	 * @see #getBinaryDependency()
	 * @generated
	 */
	EReference getBinaryDependency_LeftHand();

	/**
	 * Returns the meta object for the attribute '{@link assignment6_model.BinaryDependency#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see assignment6_model.BinaryDependency#getOperator()
	 * @see #getBinaryDependency()
	 * @generated
	 */
	EAttribute getBinaryDependency_Operator();

	/**
	 * Returns the meta object for class '{@link assignment6_model.IsSelectedDependency <em>Is Selected Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Selected Dependency</em>'.
	 * @see assignment6_model.IsSelectedDependency
	 * @generated
	 */
	EClass getIsSelectedDependency();

	/**
	 * Returns the meta object for the reference '{@link assignment6_model.IsSelectedDependency#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see assignment6_model.IsSelectedDependency#getTarget()
	 * @see #getIsSelectedDependency()
	 * @generated
	 */
	EReference getIsSelectedDependency_Target();

	/**
	 * Returns the meta object for class '{@link assignment6_model.IntegerValueDependency <em>Integer Value Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Value Dependency</em>'.
	 * @see assignment6_model.IntegerValueDependency
	 * @generated
	 */
	EClass getIntegerValueDependency();

	/**
	 * Returns the meta object for the reference '{@link assignment6_model.IntegerValueDependency#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see assignment6_model.IntegerValueDependency#getTarget()
	 * @see #getIntegerValueDependency()
	 * @generated
	 */
	EReference getIntegerValueDependency_Target();

	/**
	 * Returns the meta object for the attribute '{@link assignment6_model.IntegerValueDependency#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see assignment6_model.IntegerValueDependency#getValue()
	 * @see #getIntegerValueDependency()
	 * @generated
	 */
	EAttribute getIntegerValueDependency_Value();

	/**
	 * Returns the meta object for enum '{@link assignment6_model.GroupType <em>Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Group Type</em>'.
	 * @see assignment6_model.GroupType
	 * @generated
	 */
	EEnum getGroupType();

	/**
	 * Returns the meta object for enum '{@link assignment6_model.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see assignment6_model.BinaryOperator
	 * @generated
	 */
	EEnum getBinaryOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Assignment6_modelFactory getAssignment6_modelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link assignment6_model.impl.ConfiguratorImpl <em>Configurator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment6_model.impl.ConfiguratorImpl
		 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getConfigurator()
		 * @generated
		 */
		EClass CONFIGURATOR = eINSTANCE.getConfigurator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATOR__NAME = eINSTANCE.getConfigurator_Name();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATOR__FEATURES = eINSTANCE.getConfigurator_Features();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATOR__GROUPS = eINSTANCE.getConfigurator_Groups();

		/**
		 * The meta object literal for the '{@link assignment6_model.Feature <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment6_model.Feature
		 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURES = eINSTANCE.getFeature_Features();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__GROUPS = eINSTANCE.getFeature_Groups();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__DEPENDENCIES = eINSTANCE.getFeature_Dependencies();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__MANDATORY = eINSTANCE.getFeature_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__SELECTED = eINSTANCE.getFeature_Selected();

		/**
		 * The meta object literal for the '{@link assignment6_model.impl.SimpleFeatureImpl <em>Simple Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment6_model.impl.SimpleFeatureImpl
		 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getSimpleFeature()
		 * @generated
		 */
		EClass SIMPLE_FEATURE = eINSTANCE.getSimpleFeature();

		/**
		 * The meta object literal for the '{@link assignment6_model.impl.GroupImpl <em>Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment6_model.impl.GroupImpl
		 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getGroup()
		 * @generated
		 */
		EClass GROUP = eINSTANCE.getGroup();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP__FEATURES = eINSTANCE.getGroup_Features();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

		/**
		 * The meta object literal for the '<em><b>Group Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP__GROUP_TYPE = eINSTANCE.getGroup_GroupType();

		/**
		 * The meta object literal for the '{@link assignment6_model.impl.IntegerFeatureImpl <em>Integer Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment6_model.impl.IntegerFeatureImpl
		 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getIntegerFeature()
		 * @generated
		 */
		EClass INTEGER_FEATURE = eINSTANCE.getIntegerFeature();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_FEATURE__MIN_VALUE = eINSTANCE.getIntegerFeature_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_FEATURE__MAX_VALUE = eINSTANCE.getIntegerFeature_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_FEATURE__STEP = eINSTANCE.getIntegerFeature_Step();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_FEATURE__VALUE = eINSTANCE.getIntegerFeature_Value();

		/**
		 * The meta object literal for the '{@link assignment6_model.Dependency <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment6_model.Dependency
		 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__NOT = eINSTANCE.getDependency_Not();

		/**
		 * The meta object literal for the '{@link assignment6_model.UnaryDependency <em>Unary Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment6_model.UnaryDependency
		 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getUnaryDependency()
		 * @generated
		 */
		EClass UNARY_DEPENDENCY = eINSTANCE.getUnaryDependency();

		/**
		 * The meta object literal for the '{@link assignment6_model.impl.BinaryDependencyImpl <em>Binary Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment6_model.impl.BinaryDependencyImpl
		 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getBinaryDependency()
		 * @generated
		 */
		EClass BINARY_DEPENDENCY = eINSTANCE.getBinaryDependency();

		/**
		 * The meta object literal for the '<em><b>Right Hand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_DEPENDENCY__RIGHT_HAND = eINSTANCE.getBinaryDependency_RightHand();

		/**
		 * The meta object literal for the '<em><b>Left Hand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_DEPENDENCY__LEFT_HAND = eINSTANCE.getBinaryDependency_LeftHand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_DEPENDENCY__OPERATOR = eINSTANCE.getBinaryDependency_Operator();

		/**
		 * The meta object literal for the '{@link assignment6_model.impl.IsSelectedDependencyImpl <em>Is Selected Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment6_model.impl.IsSelectedDependencyImpl
		 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getIsSelectedDependency()
		 * @generated
		 */
		EClass IS_SELECTED_DEPENDENCY = eINSTANCE.getIsSelectedDependency();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_SELECTED_DEPENDENCY__TARGET = eINSTANCE.getIsSelectedDependency_Target();

		/**
		 * The meta object literal for the '{@link assignment6_model.impl.IntegerValueDependencyImpl <em>Integer Value Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment6_model.impl.IntegerValueDependencyImpl
		 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getIntegerValueDependency()
		 * @generated
		 */
		EClass INTEGER_VALUE_DEPENDENCY = eINSTANCE.getIntegerValueDependency();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_VALUE_DEPENDENCY__TARGET = eINSTANCE.getIntegerValueDependency_Target();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_VALUE_DEPENDENCY__VALUE = eINSTANCE.getIntegerValueDependency_Value();

		/**
		 * The meta object literal for the '{@link assignment6_model.GroupType <em>Group Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment6_model.GroupType
		 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getGroupType()
		 * @generated
		 */
		EEnum GROUP_TYPE = eINSTANCE.getGroupType();

		/**
		 * The meta object literal for the '{@link assignment6_model.BinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see assignment6_model.BinaryOperator
		 * @see assignment6_model.impl.Assignment6_modelPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

	}

} //Assignment6_modelPackage
