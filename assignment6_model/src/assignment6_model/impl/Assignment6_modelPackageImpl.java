/**
 */
package assignment6_model.impl;

import assignment6_model.Assignment6_modelFactory;
import assignment6_model.Assignment6_modelPackage;
import assignment6_model.BinaryDependency;
import assignment6_model.BinaryOperator;
import assignment6_model.Configurator;
import assignment6_model.Dependency;
import assignment6_model.Feature;
import assignment6_model.Group;
import assignment6_model.GroupType;
import assignment6_model.IntegerFeature;
import assignment6_model.IntegerValueDependency;
import assignment6_model.IsSelectedDependency;
import assignment6_model.SimpleFeature;
import assignment6_model.UnaryDependency;

import assignment6_model.util.Assignment6_modelValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Assignment6_modelPackageImpl extends EPackageImpl implements Assignment6_modelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configuratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isSelectedDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerValueDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum groupTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum binaryOperatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see assignment6_model.Assignment6_modelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Assignment6_modelPackageImpl() {
		super(eNS_URI, Assignment6_modelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Assignment6_modelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Assignment6_modelPackage init() {
		if (isInited) return (Assignment6_modelPackage)EPackage.Registry.INSTANCE.getEPackage(Assignment6_modelPackage.eNS_URI);

		// Obtain or create and register package
		Assignment6_modelPackageImpl theAssignment6_modelPackage = (Assignment6_modelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Assignment6_modelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Assignment6_modelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAssignment6_modelPackage.createPackageContents();

		// Initialize created meta-data
		theAssignment6_modelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAssignment6_modelPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Assignment6_modelValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAssignment6_modelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Assignment6_modelPackage.eNS_URI, theAssignment6_modelPackage);
		return theAssignment6_modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurator() {
		return configuratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigurator_Name() {
		return (EAttribute)configuratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurator_Features() {
		return (EReference)configuratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurator_Groups() {
		return (EReference)configuratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Features() {
		return (EReference)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Groups() {
		return (EReference)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Name() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_Dependencies() {
		return (EReference)featureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Mandatory() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Selected() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleFeature() {
		return simpleFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Features() {
		return (EReference)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Name() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_GroupType() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerFeature() {
		return integerFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerFeature_MinValue() {
		return (EAttribute)integerFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerFeature_MaxValue() {
		return (EAttribute)integerFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerFeature_Step() {
		return (EAttribute)integerFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerFeature_Value() {
		return (EAttribute)integerFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependency_Not() {
		return (EAttribute)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryDependency() {
		return unaryDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryDependency() {
		return binaryDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryDependency_RightHand() {
		return (EReference)binaryDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryDependency_LeftHand() {
		return (EReference)binaryDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinaryDependency_Operator() {
		return (EAttribute)binaryDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsSelectedDependency() {
		return isSelectedDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsSelectedDependency_Target() {
		return (EReference)isSelectedDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerValueDependency() {
		return integerValueDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntegerValueDependency_Target() {
		return (EReference)integerValueDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerValueDependency_Value() {
		return (EAttribute)integerValueDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGroupType() {
		return groupTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBinaryOperator() {
		return binaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment6_modelFactory getAssignment6_modelFactory() {
		return (Assignment6_modelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		configuratorEClass = createEClass(CONFIGURATOR);
		createEAttribute(configuratorEClass, CONFIGURATOR__NAME);
		createEReference(configuratorEClass, CONFIGURATOR__FEATURES);
		createEReference(configuratorEClass, CONFIGURATOR__GROUPS);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__FEATURES);
		createEReference(featureEClass, FEATURE__GROUPS);
		createEAttribute(featureEClass, FEATURE__NAME);
		createEReference(featureEClass, FEATURE__DEPENDENCIES);
		createEAttribute(featureEClass, FEATURE__MANDATORY);
		createEAttribute(featureEClass, FEATURE__SELECTED);

		simpleFeatureEClass = createEClass(SIMPLE_FEATURE);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__FEATURES);
		createEAttribute(groupEClass, GROUP__NAME);
		createEAttribute(groupEClass, GROUP__GROUP_TYPE);

		integerFeatureEClass = createEClass(INTEGER_FEATURE);
		createEAttribute(integerFeatureEClass, INTEGER_FEATURE__MIN_VALUE);
		createEAttribute(integerFeatureEClass, INTEGER_FEATURE__MAX_VALUE);
		createEAttribute(integerFeatureEClass, INTEGER_FEATURE__STEP);
		createEAttribute(integerFeatureEClass, INTEGER_FEATURE__VALUE);

		dependencyEClass = createEClass(DEPENDENCY);
		createEAttribute(dependencyEClass, DEPENDENCY__NOT);

		unaryDependencyEClass = createEClass(UNARY_DEPENDENCY);

		binaryDependencyEClass = createEClass(BINARY_DEPENDENCY);
		createEReference(binaryDependencyEClass, BINARY_DEPENDENCY__RIGHT_HAND);
		createEReference(binaryDependencyEClass, BINARY_DEPENDENCY__LEFT_HAND);
		createEAttribute(binaryDependencyEClass, BINARY_DEPENDENCY__OPERATOR);

		isSelectedDependencyEClass = createEClass(IS_SELECTED_DEPENDENCY);
		createEReference(isSelectedDependencyEClass, IS_SELECTED_DEPENDENCY__TARGET);

		integerValueDependencyEClass = createEClass(INTEGER_VALUE_DEPENDENCY);
		createEReference(integerValueDependencyEClass, INTEGER_VALUE_DEPENDENCY__TARGET);
		createEAttribute(integerValueDependencyEClass, INTEGER_VALUE_DEPENDENCY__VALUE);

		// Create enums
		groupTypeEEnum = createEEnum(GROUP_TYPE);
		binaryOperatorEEnum = createEEnum(BINARY_OPERATOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		simpleFeatureEClass.getESuperTypes().add(this.getFeature());
		integerFeatureEClass.getESuperTypes().add(this.getFeature());
		unaryDependencyEClass.getESuperTypes().add(this.getDependency());
		binaryDependencyEClass.getESuperTypes().add(this.getDependency());
		isSelectedDependencyEClass.getESuperTypes().add(this.getUnaryDependency());
		integerValueDependencyEClass.getESuperTypes().add(this.getUnaryDependency());

		// Initialize classes, features, and operations; add parameters
		initEClass(configuratorEClass, Configurator.class, "Configurator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigurator_Name(), ecorePackage.getEString(), "name", null, 0, 1, Configurator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurator_Features(), this.getFeature(), null, "features", null, 0, -1, Configurator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurator_Groups(), this.getGroup(), null, "groups", null, 0, -1, Configurator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_Features(), this.getFeature(), null, "features", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Groups(), this.getGroup(), null, "groups", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeature_Dependencies(), this.getDependency(), null, "dependencies", null, 0, -1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Mandatory(), ecorePackage.getEBoolean(), "mandatory", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Selected(), ecorePackage.getEBoolean(), "selected", null, 0, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleFeatureEClass, SimpleFeature.class, "SimpleFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_Features(), this.getSimpleFeature(), null, "features", null, 2, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_GroupType(), this.getGroupType(), "groupType", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerFeatureEClass, IntegerFeature.class, "IntegerFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerFeature_MinValue(), ecorePackage.getEInt(), "minValue", "0", 0, 1, IntegerFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerFeature_MaxValue(), ecorePackage.getEInt(), "maxValue", "1", 0, 1, IntegerFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerFeature_Step(), ecorePackage.getEInt(), "step", "0", 0, 1, IntegerFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerFeature_Value(), ecorePackage.getEInt(), "value", "0", 0, 1, IntegerFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependency_Not(), ecorePackage.getEBoolean(), "not", null, 0, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryDependencyEClass, UnaryDependency.class, "UnaryDependency", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryDependencyEClass, BinaryDependency.class, "BinaryDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryDependency_RightHand(), this.getDependency(), null, "rightHand", null, 1, 1, BinaryDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryDependency_LeftHand(), this.getDependency(), null, "leftHand", null, 1, 1, BinaryDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryDependency_Operator(), this.getBinaryOperator(), "operator", null, 0, 1, BinaryDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isSelectedDependencyEClass, IsSelectedDependency.class, "IsSelectedDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIsSelectedDependency_Target(), this.getFeature(), null, "target", null, 1, 1, IsSelectedDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerValueDependencyEClass, IntegerValueDependency.class, "IntegerValueDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIntegerValueDependency_Target(), this.getIntegerFeature(), null, "target", null, 1, 1, IntegerValueDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntegerValueDependency_Value(), ecorePackage.getEInt(), "value", "0", 0, 1, IntegerValueDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(groupTypeEEnum, GroupType.class, "GroupType");
		addEEnumLiteral(groupTypeEEnum, GroupType.OR);
		addEEnumLiteral(groupTypeEEnum, GroupType.XOR);

		initEEnum(binaryOperatorEEnum, BinaryOperator.class, "BinaryOperator");
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.AND);
		addEEnumLiteral(binaryOperatorEEnum, BinaryOperator.OR);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			 "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });	
		addAnnotation
		  (featureEClass, 
		   source, 
		   new String[] {
			 "constraints", "mandatoryWithDependencies parentIsNotMandatory dependsOnSelf"
		   });	
		addAnnotation
		  (groupEClass, 
		   source, 
		   new String[] {
			 "constraints", "noMandatoryIfXOR"
		   });	
		addAnnotation
		  (integerFeatureEClass, 
		   source, 
		   new String[] {
			 "constraints", "minLessThanMax evenSteps"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";	
		addAnnotation
		  (featureEClass, 
		   source, 
		   new String[] {
			 "mandatoryWithDependencies", "self.mandatory implies self.dependencies->isEmpty()",
			 "parentIsNotMandatory", "self.mandatory implies\n\t\t\tif self.oclContainer().oclIsKindOf(Feature) then\n\t\t\t\tself.oclContainer().oclAsType(Feature).mandatory\n\t\t\telse \n\t\t\t\tif self.oclContainer().oclIsKindOf(Group) and self.oclContainer().oclContainer().oclIsKindOf(Feature) then\n\t\t\t\t\tself.oclContainer().oclContainer().oclAsType(Feature).mandatory\n\t\t\t\telse true\n\t\t\t\tendif\n\t\t\tendif",
			 "dependsOnSelf", "self.dependencies->forAll(d |\n\t        d.oclAsSet()\n\t            ->closure(oclContents())\n\t            ->forAll(d1 |\n\t            \tif d1.oclIsKindOf(IsSelectedDependency) then\n\t            \t\td1.oclAsType(IsSelectedDependency).target <> self\n\t            \telse \n\t            \t\tif d1.oclIsKindOf(IntegerValueDependency) then\n\t            \t\t\td1.oclAsType(IntegerValueDependency).target <> self\n\t            \t\telse \n\t            \t\t\ttrue\n\t            \t\tendif\n\t            \tendif\n\t            )\n          \t)"
		   });	
		addAnnotation
		  (groupEClass, 
		   source, 
		   new String[] {
			 "noMandatoryIfXOR", "self.groupType = GroupType::XOR implies self.features->forAll(f| not f.mandatory)"
		   });	
		addAnnotation
		  (integerFeatureEClass, 
		   source, 
		   new String[] {
			 "minLessThanMax", "minValue < maxValue",
			 "evenSteps", "(maxValue - minValue).mod(step) = 0"
		   });
	}

} //Assignment6_modelPackageImpl
