/**
 */
package assignment6_model.impl;

import assignment6_model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Assignment6_modelFactoryImpl extends EFactoryImpl implements Assignment6_modelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Assignment6_modelFactory init() {
		try {
			Assignment6_modelFactory theAssignment6_modelFactory = (Assignment6_modelFactory)EPackage.Registry.INSTANCE.getEFactory(Assignment6_modelPackage.eNS_URI);
			if (theAssignment6_modelFactory != null) {
				return theAssignment6_modelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Assignment6_modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment6_modelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Assignment6_modelPackage.CONFIGURATOR: return createConfigurator();
			case Assignment6_modelPackage.SIMPLE_FEATURE: return createSimpleFeature();
			case Assignment6_modelPackage.GROUP: return createGroup();
			case Assignment6_modelPackage.INTEGER_FEATURE: return createIntegerFeature();
			case Assignment6_modelPackage.BINARY_DEPENDENCY: return createBinaryDependency();
			case Assignment6_modelPackage.IS_SELECTED_DEPENDENCY: return createIsSelectedDependency();
			case Assignment6_modelPackage.INTEGER_VALUE_DEPENDENCY: return createIntegerValueDependency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Assignment6_modelPackage.GROUP_TYPE:
				return createGroupTypeFromString(eDataType, initialValue);
			case Assignment6_modelPackage.BINARY_OPERATOR:
				return createBinaryOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Assignment6_modelPackage.GROUP_TYPE:
				return convertGroupTypeToString(eDataType, instanceValue);
			case Assignment6_modelPackage.BINARY_OPERATOR:
				return convertBinaryOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configurator createConfigurator() {
		ConfiguratorImpl configurator = new ConfiguratorImpl();
		return configurator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleFeature createSimpleFeature() {
		SimpleFeatureImpl simpleFeature = new SimpleFeatureImpl();
		return simpleFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerFeature createIntegerFeature() {
		IntegerFeatureImpl integerFeature = new IntegerFeatureImpl();
		return integerFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryDependency createBinaryDependency() {
		BinaryDependencyImpl binaryDependency = new BinaryDependencyImpl();
		return binaryDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsSelectedDependency createIsSelectedDependency() {
		IsSelectedDependencyImpl isSelectedDependency = new IsSelectedDependencyImpl();
		return isSelectedDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerValueDependency createIntegerValueDependency() {
		IntegerValueDependencyImpl integerValueDependency = new IntegerValueDependencyImpl();
		return integerValueDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupType createGroupTypeFromString(EDataType eDataType, String initialValue) {
		GroupType result = GroupType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroupTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator createBinaryOperatorFromString(EDataType eDataType, String initialValue) {
		BinaryOperator result = BinaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment6_modelPackage getAssignment6_modelPackage() {
		return (Assignment6_modelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Assignment6_modelPackage getPackage() {
		return Assignment6_modelPackage.eINSTANCE;
	}

} //Assignment6_modelFactoryImpl
