/**
 */
package req_spec;

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
 * @see req_spec.Req_specFactory
 * @model kind="package"
 * @generated
 */
public interface Req_specPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "req_spec";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://chalmers.se/cse/se/2016/reqSpec";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "req";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Req_specPackage eINSTANCE = req_spec.impl.Req_specPackageImpl.init();

	/**
	 * The meta object id for the '{@link req_spec.impl.RequirementsSpecificationImpl <em>Requirements Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see req_spec.impl.RequirementsSpecificationImpl
	 * @see req_spec.impl.Req_specPackageImpl#getRequirementsSpecification()
	 * @generated
	 */
	int REQUIREMENTS_SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__CATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__PERSON = 2;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION__FEATURE = 3;

	/**
	 * The number of structural features of the '<em>Requirements Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Requirements Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENTS_SPECIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link req_spec.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see req_spec.impl.RequirementImpl
	 * @see req_spec.impl.Req_specPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IS_MANDATORY = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__RESPONSIBLE = 5;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DEPENDS_ON = 6;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIRES = 7;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__FEATURES = 8;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link req_spec.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see req_spec.impl.CategoryImpl
	 * @see req_spec.impl.Req_specPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CATEGORY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Subcategory</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SUBCATEGORY = 1;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__RESPONSIBLE = 3;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link req_spec.impl.FunctionalRequirementImpl <em>Functional Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see req_spec.impl.FunctionalRequirementImpl
	 * @see req_spec.impl.Req_specPackageImpl#getFunctionalRequirement()
	 * @generated
	 */
	int FUNCTIONAL_REQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__ID = REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__PRIORITY = REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__IS_MANDATORY = REQUIREMENT__IS_MANDATORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__RESPONSIBLE = REQUIREMENT__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__DEPENDS_ON = REQUIREMENT__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__REQUIRES = REQUIREMENT__REQUIRES;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__FEATURES = REQUIREMENT__FEATURES;

	/**
	 * The number of structural features of the '<em>Functional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Functional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link req_spec.impl.QualityRequirementImpl <em>Quality Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see req_spec.impl.QualityRequirementImpl
	 * @see req_spec.impl.Req_specPackageImpl#getQualityRequirement()
	 * @generated
	 */
	int QUALITY_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__ID = REQUIREMENT__ID;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__PRIORITY = REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__IS_MANDATORY = REQUIREMENT__IS_MANDATORY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__RESPONSIBLE = REQUIREMENT__RESPONSIBLE;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__DEPENDS_ON = REQUIREMENT__DEPENDS_ON;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__REQUIRES = REQUIREMENT__REQUIRES;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT__FEATURES = REQUIREMENT__FEATURES;

	/**
	 * The number of structural features of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Quality Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link req_spec.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see req_spec.impl.DescriptionImpl
	 * @see req_spec.impl.Req_specPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__DESCRIPTION_TEXT = 0;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link req_spec.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see req_spec.impl.PersonImpl
	 * @see req_spec.impl.Req_specPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 6;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__LAST_NAME = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Cat Responsibility</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__CAT_RESPONSIBILITY = 2;

	/**
	 * The feature id for the '<em><b>Req Responsibility</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__REQ_RESPONSIBILITY = 3;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link req_spec.impl.UnaryDependencyImpl <em>Unary Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see req_spec.impl.UnaryDependencyImpl
	 * @see req_spec.impl.Req_specPackageImpl#getUnaryDependency()
	 * @generated
	 */
	int UNARY_DEPENDENCY = 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DEPENDENCY__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DEPENDENCY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Unary Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DEPENDENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unary Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link req_spec.impl.ICostImpl <em>ICost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see req_spec.impl.ICostImpl
	 * @see req_spec.impl.Req_specPackageImpl#getICost()
	 * @generated
	 */
	int ICOST = 8;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOST__TARGET = UNARY_DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOST__NAME = UNARY_DEPENDENCY__NAME;

	/**
	 * The number of structural features of the '<em>ICost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOST_FEATURE_COUNT = UNARY_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>ICost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOST_OPERATION_COUNT = UNARY_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link req_spec.impl.CValueImpl <em>CValue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see req_spec.impl.CValueImpl
	 * @see req_spec.impl.Req_specPackageImpl#getCValue()
	 * @generated
	 */
	int CVALUE = 9;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVALUE__TARGET = UNARY_DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVALUE__NAME = UNARY_DEPENDENCY__NAME;

	/**
	 * The number of structural features of the '<em>CValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVALUE_FEATURE_COUNT = UNARY_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CValue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVALUE_OPERATION_COUNT = UNARY_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link req_spec.impl.RefinesImpl <em>Refines</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see req_spec.impl.RefinesImpl
	 * @see req_spec.impl.Req_specPackageImpl#getRefines()
	 * @generated
	 */
	int REFINES = 10;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES__TARGET = UNARY_DEPENDENCY__TARGET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES__NAME = UNARY_DEPENDENCY__NAME;

	/**
	 * The number of structural features of the '<em>Refines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_FEATURE_COUNT = UNARY_DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Refines</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFINES_OPERATION_COUNT = UNARY_DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link req_spec.impl.RequiresImpl <em>Requires</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see req_spec.impl.RequiresImpl
	 * @see req_spec.impl.Req_specPackageImpl#getRequires()
	 * @generated
	 */
	int REQUIRES = 11;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__NAME = 1;

	/**
	 * The number of structural features of the '<em>Requires</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Requires</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link req_spec.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see req_spec.impl.ExpressionImpl
	 * @see req_spec.impl.Req_specPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NOT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link req_spec.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see req_spec.impl.BinaryExpressionImpl
	 * @see req_spec.impl.Req_specPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__NOT = EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Left Hand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT_HAND = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Hand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT_HAND = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link req_spec.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see req_spec.impl.UnaryExpressionImpl
	 * @see req_spec.impl.Req_specPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__NOT = EXPRESSION__NOT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__REQUIREMENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link req_spec.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see req_spec.impl.FeatureImpl
	 * @see req_spec.impl.Req_specPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REQUIREMENTS = 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link req_spec.BinaryOperator <em>Binary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see req_spec.BinaryOperator
	 * @see req_spec.impl.Req_specPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 16;


	/**
	 * Returns the meta object for class '{@link req_spec.RequirementsSpecification <em>Requirements Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirements Specification</em>'.
	 * @see req_spec.RequirementsSpecification
	 * @generated
	 */
	EClass getRequirementsSpecification();

	/**
	 * Returns the meta object for the attribute '{@link req_spec.RequirementsSpecification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see req_spec.RequirementsSpecification#getName()
	 * @see #getRequirementsSpecification()
	 * @generated
	 */
	EAttribute getRequirementsSpecification_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link req_spec.RequirementsSpecification#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Category</em>'.
	 * @see req_spec.RequirementsSpecification#getCategory()
	 * @see #getRequirementsSpecification()
	 * @generated
	 */
	EReference getRequirementsSpecification_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link req_spec.RequirementsSpecification#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person</em>'.
	 * @see req_spec.RequirementsSpecification#getPerson()
	 * @see #getRequirementsSpecification()
	 * @generated
	 */
	EReference getRequirementsSpecification_Person();

	/**
	 * Returns the meta object for the containment reference list '{@link req_spec.RequirementsSpecification#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see req_spec.RequirementsSpecification#getFeature()
	 * @see #getRequirementsSpecification()
	 * @generated
	 */
	EReference getRequirementsSpecification_Feature();

	/**
	 * Returns the meta object for class '{@link req_spec.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see req_spec.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link req_spec.Requirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see req_spec.Requirement#getName()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Name();

	/**
	 * Returns the meta object for the attribute '{@link req_spec.Requirement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see req_spec.Requirement#getId()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Id();

	/**
	 * Returns the meta object for the attribute '{@link req_spec.Requirement#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see req_spec.Requirement#getPriority()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Priority();

	/**
	 * Returns the meta object for the attribute '{@link req_spec.Requirement#isIsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mandatory</em>'.
	 * @see req_spec.Requirement#isIsMandatory()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_IsMandatory();

	/**
	 * Returns the meta object for the containment reference '{@link req_spec.Requirement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see req_spec.Requirement#getDescription()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Description();

	/**
	 * Returns the meta object for the reference list '{@link req_spec.Requirement#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsible</em>'.
	 * @see req_spec.Requirement#getResponsible()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Responsible();

	/**
	 * Returns the meta object for the containment reference list '{@link req_spec.Requirement#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Depends On</em>'.
	 * @see req_spec.Requirement#getDependsOn()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_DependsOn();

	/**
	 * Returns the meta object for the containment reference list '{@link req_spec.Requirement#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requires</em>'.
	 * @see req_spec.Requirement#getRequires()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Requires();

	/**
	 * Returns the meta object for the reference list '{@link req_spec.Requirement#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see req_spec.Requirement#getFeatures()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Features();

	/**
	 * Returns the meta object for class '{@link req_spec.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see req_spec.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link req_spec.Category#getCategoryName <em>Category Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Name</em>'.
	 * @see req_spec.Category#getCategoryName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_CategoryName();

	/**
	 * Returns the meta object for the containment reference list '{@link req_spec.Category#getSubcategory <em>Subcategory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subcategory</em>'.
	 * @see req_spec.Category#getSubcategory()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Subcategory();

	/**
	 * Returns the meta object for the containment reference list '{@link req_spec.Category#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement</em>'.
	 * @see req_spec.Category#getRequirement()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Requirement();

	/**
	 * Returns the meta object for the reference list '{@link req_spec.Category#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responsible</em>'.
	 * @see req_spec.Category#getResponsible()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Responsible();

	/**
	 * Returns the meta object for class '{@link req_spec.FunctionalRequirement <em>Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Requirement</em>'.
	 * @see req_spec.FunctionalRequirement
	 * @generated
	 */
	EClass getFunctionalRequirement();

	/**
	 * Returns the meta object for class '{@link req_spec.QualityRequirement <em>Quality Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Requirement</em>'.
	 * @see req_spec.QualityRequirement
	 * @generated
	 */
	EClass getQualityRequirement();

	/**
	 * Returns the meta object for class '{@link req_spec.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see req_spec.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link req_spec.Description#getDescriptionText <em>Description Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description Text</em>'.
	 * @see req_spec.Description#getDescriptionText()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_DescriptionText();

	/**
	 * Returns the meta object for class '{@link req_spec.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see req_spec.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the attribute '{@link req_spec.Person#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see req_spec.Person#getLastName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_LastName();

	/**
	 * Returns the meta object for the attribute '{@link req_spec.Person#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see req_spec.Person#getFirstName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_FirstName();

	/**
	 * Returns the meta object for the reference list '{@link req_spec.Person#getCatResponsibility <em>Cat Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cat Responsibility</em>'.
	 * @see req_spec.Person#getCatResponsibility()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_CatResponsibility();

	/**
	 * Returns the meta object for the reference list '{@link req_spec.Person#getReqResponsibility <em>Req Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Req Responsibility</em>'.
	 * @see req_spec.Person#getReqResponsibility()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_ReqResponsibility();

	/**
	 * Returns the meta object for class '{@link req_spec.UnaryDependency <em>Unary Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Dependency</em>'.
	 * @see req_spec.UnaryDependency
	 * @generated
	 */
	EClass getUnaryDependency();

	/**
	 * Returns the meta object for the reference '{@link req_spec.UnaryDependency#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see req_spec.UnaryDependency#getTarget()
	 * @see #getUnaryDependency()
	 * @generated
	 */
	EReference getUnaryDependency_Target();

	/**
	 * Returns the meta object for the attribute '{@link req_spec.UnaryDependency#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see req_spec.UnaryDependency#getName()
	 * @see #getUnaryDependency()
	 * @generated
	 */
	EAttribute getUnaryDependency_Name();

	/**
	 * Returns the meta object for class '{@link req_spec.ICost <em>ICost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICost</em>'.
	 * @see req_spec.ICost
	 * @generated
	 */
	EClass getICost();

	/**
	 * Returns the meta object for class '{@link req_spec.CValue <em>CValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CValue</em>'.
	 * @see req_spec.CValue
	 * @generated
	 */
	EClass getCValue();

	/**
	 * Returns the meta object for class '{@link req_spec.Refines <em>Refines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refines</em>'.
	 * @see req_spec.Refines
	 * @generated
	 */
	EClass getRefines();

	/**
	 * Returns the meta object for class '{@link req_spec.Requires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requires</em>'.
	 * @see req_spec.Requires
	 * @generated
	 */
	EClass getRequires();

	/**
	 * Returns the meta object for the containment reference '{@link req_spec.Requires#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see req_spec.Requires#getExpression()
	 * @see #getRequires()
	 * @generated
	 */
	EReference getRequires_Expression();

	/**
	 * Returns the meta object for the attribute '{@link req_spec.Requires#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see req_spec.Requires#getName()
	 * @see #getRequires()
	 * @generated
	 */
	EAttribute getRequires_Name();

	/**
	 * Returns the meta object for class '{@link req_spec.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see req_spec.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link req_spec.Expression#isNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not</em>'.
	 * @see req_spec.Expression#isNot()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Not();

	/**
	 * Returns the meta object for the attribute '{@link req_spec.Expression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see req_spec.Expression#getName()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Name();

	/**
	 * Returns the meta object for class '{@link req_spec.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see req_spec.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link req_spec.BinaryExpression#getLeftHand <em>Left Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Hand</em>'.
	 * @see req_spec.BinaryExpression#getLeftHand()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_LeftHand();

	/**
	 * Returns the meta object for the containment reference '{@link req_spec.BinaryExpression#getRightHand <em>Right Hand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Hand</em>'.
	 * @see req_spec.BinaryExpression#getRightHand()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_RightHand();

	/**
	 * Returns the meta object for the attribute '{@link req_spec.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see req_spec.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link req_spec.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see req_spec.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the reference '{@link req_spec.UnaryExpression#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Requirement</em>'.
	 * @see req_spec.UnaryExpression#getRequirement()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Requirement();

	/**
	 * Returns the meta object for class '{@link req_spec.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see req_spec.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link req_spec.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see req_spec.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the reference list '{@link req_spec.Feature#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirements</em>'.
	 * @see req_spec.Feature#getRequirements()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Requirements();

	/**
	 * Returns the meta object for enum '{@link req_spec.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Operator</em>'.
	 * @see req_spec.BinaryOperator
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
	Req_specFactory getReq_specFactory();

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
		 * The meta object literal for the '{@link req_spec.impl.RequirementsSpecificationImpl <em>Requirements Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see req_spec.impl.RequirementsSpecificationImpl
		 * @see req_spec.impl.Req_specPackageImpl#getRequirementsSpecification()
		 * @generated
		 */
		EClass REQUIREMENTS_SPECIFICATION = eINSTANCE.getRequirementsSpecification();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENTS_SPECIFICATION__NAME = eINSTANCE.getRequirementsSpecification_Name();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_SPECIFICATION__CATEGORY = eINSTANCE.getRequirementsSpecification_Category();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_SPECIFICATION__PERSON = eINSTANCE.getRequirementsSpecification_Person();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENTS_SPECIFICATION__FEATURE = eINSTANCE.getRequirementsSpecification_Feature();

		/**
		 * The meta object literal for the '{@link req_spec.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see req_spec.impl.RequirementImpl
		 * @see req_spec.impl.Req_specPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__NAME = eINSTANCE.getRequirement_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ID = eINSTANCE.getRequirement_Id();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__PRIORITY = eINSTANCE.getRequirement_Priority();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__IS_MANDATORY = eINSTANCE.getRequirement_IsMandatory();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__RESPONSIBLE = eINSTANCE.getRequirement_Responsible();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DEPENDS_ON = eINSTANCE.getRequirement_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REQUIRES = eINSTANCE.getRequirement_Requires();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__FEATURES = eINSTANCE.getRequirement_Features();

		/**
		 * The meta object literal for the '{@link req_spec.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see req_spec.impl.CategoryImpl
		 * @see req_spec.impl.Req_specPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Category Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__CATEGORY_NAME = eINSTANCE.getCategory_CategoryName();

		/**
		 * The meta object literal for the '<em><b>Subcategory</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__SUBCATEGORY = eINSTANCE.getCategory_Subcategory();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__REQUIREMENT = eINSTANCE.getCategory_Requirement();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__RESPONSIBLE = eINSTANCE.getCategory_Responsible();

		/**
		 * The meta object literal for the '{@link req_spec.impl.FunctionalRequirementImpl <em>Functional Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see req_spec.impl.FunctionalRequirementImpl
		 * @see req_spec.impl.Req_specPackageImpl#getFunctionalRequirement()
		 * @generated
		 */
		EClass FUNCTIONAL_REQUIREMENT = eINSTANCE.getFunctionalRequirement();

		/**
		 * The meta object literal for the '{@link req_spec.impl.QualityRequirementImpl <em>Quality Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see req_spec.impl.QualityRequirementImpl
		 * @see req_spec.impl.Req_specPackageImpl#getQualityRequirement()
		 * @generated
		 */
		EClass QUALITY_REQUIREMENT = eINSTANCE.getQualityRequirement();

		/**
		 * The meta object literal for the '{@link req_spec.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see req_spec.impl.DescriptionImpl
		 * @see req_spec.impl.Req_specPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Description Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__DESCRIPTION_TEXT = eINSTANCE.getDescription_DescriptionText();

		/**
		 * The meta object literal for the '{@link req_spec.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see req_spec.impl.PersonImpl
		 * @see req_spec.impl.Req_specPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

		/**
		 * The meta object literal for the '<em><b>Cat Responsibility</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__CAT_RESPONSIBILITY = eINSTANCE.getPerson_CatResponsibility();

		/**
		 * The meta object literal for the '<em><b>Req Responsibility</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__REQ_RESPONSIBILITY = eINSTANCE.getPerson_ReqResponsibility();

		/**
		 * The meta object literal for the '{@link req_spec.impl.UnaryDependencyImpl <em>Unary Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see req_spec.impl.UnaryDependencyImpl
		 * @see req_spec.impl.Req_specPackageImpl#getUnaryDependency()
		 * @generated
		 */
		EClass UNARY_DEPENDENCY = eINSTANCE.getUnaryDependency();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_DEPENDENCY__TARGET = eINSTANCE.getUnaryDependency_Target();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_DEPENDENCY__NAME = eINSTANCE.getUnaryDependency_Name();

		/**
		 * The meta object literal for the '{@link req_spec.impl.ICostImpl <em>ICost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see req_spec.impl.ICostImpl
		 * @see req_spec.impl.Req_specPackageImpl#getICost()
		 * @generated
		 */
		EClass ICOST = eINSTANCE.getICost();

		/**
		 * The meta object literal for the '{@link req_spec.impl.CValueImpl <em>CValue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see req_spec.impl.CValueImpl
		 * @see req_spec.impl.Req_specPackageImpl#getCValue()
		 * @generated
		 */
		EClass CVALUE = eINSTANCE.getCValue();

		/**
		 * The meta object literal for the '{@link req_spec.impl.RefinesImpl <em>Refines</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see req_spec.impl.RefinesImpl
		 * @see req_spec.impl.Req_specPackageImpl#getRefines()
		 * @generated
		 */
		EClass REFINES = eINSTANCE.getRefines();

		/**
		 * The meta object literal for the '{@link req_spec.impl.RequiresImpl <em>Requires</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see req_spec.impl.RequiresImpl
		 * @see req_spec.impl.Req_specPackageImpl#getRequires()
		 * @generated
		 */
		EClass REQUIRES = eINSTANCE.getRequires();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRES__EXPRESSION = eINSTANCE.getRequires_Expression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRES__NAME = eINSTANCE.getRequires_Name();

		/**
		 * The meta object literal for the '{@link req_spec.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see req_spec.impl.ExpressionImpl
		 * @see req_spec.impl.Req_specPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__NOT = eINSTANCE.getExpression_Not();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__NAME = eINSTANCE.getExpression_Name();

		/**
		 * The meta object literal for the '{@link req_spec.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see req_spec.impl.BinaryExpressionImpl
		 * @see req_spec.impl.Req_specPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left Hand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT_HAND = eINSTANCE.getBinaryExpression_LeftHand();

		/**
		 * The meta object literal for the '<em><b>Right Hand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT_HAND = eINSTANCE.getBinaryExpression_RightHand();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link req_spec.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see req_spec.impl.UnaryExpressionImpl
		 * @see req_spec.impl.Req_specPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__REQUIREMENT = eINSTANCE.getUnaryExpression_Requirement();

		/**
		 * The meta object literal for the '{@link req_spec.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see req_spec.impl.FeatureImpl
		 * @see req_spec.impl.Req_specPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__REQUIREMENTS = eINSTANCE.getFeature_Requirements();

		/**
		 * The meta object literal for the '{@link req_spec.BinaryOperator <em>Binary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see req_spec.BinaryOperator
		 * @see req_spec.impl.Req_specPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EEnum BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

	}

} //Req_specPackage
