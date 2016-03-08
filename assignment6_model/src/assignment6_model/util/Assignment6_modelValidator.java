/**
 */
package assignment6_model.util;

import assignment6_model.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see assignment6_model.Assignment6_modelPackage
 * @generated
 */
public class Assignment6_modelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Assignment6_modelValidator INSTANCE = new Assignment6_modelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "assignment6_model";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment6_modelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Assignment6_modelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Assignment6_modelPackage.CONFIGURATOR:
				return validateConfigurator((Configurator)value, diagnostics, context);
			case Assignment6_modelPackage.FEATURE:
				return validateFeature((Feature)value, diagnostics, context);
			case Assignment6_modelPackage.SIMPLE_FEATURE:
				return validateSimpleFeature((SimpleFeature)value, diagnostics, context);
			case Assignment6_modelPackage.GROUP:
				return validateGroup((Group)value, diagnostics, context);
			case Assignment6_modelPackage.INTEGER_FEATURE:
				return validateIntegerFeature((IntegerFeature)value, diagnostics, context);
			case Assignment6_modelPackage.DEPENDENCY:
				return validateDependency((Dependency)value, diagnostics, context);
			case Assignment6_modelPackage.UNARY_DEPENDENCY:
				return validateUnaryDependency((UnaryDependency)value, diagnostics, context);
			case Assignment6_modelPackage.BINARY_DEPENDENCY:
				return validateBinaryDependency((BinaryDependency)value, diagnostics, context);
			case Assignment6_modelPackage.IS_SELECTED_DEPENDENCY:
				return validateIsSelectedDependency((IsSelectedDependency)value, diagnostics, context);
			case Assignment6_modelPackage.INTEGER_VALUE_DEPENDENCY:
				return validateIntegerValueDependency((IntegerValueDependency)value, diagnostics, context);
			case Assignment6_modelPackage.GROUP_TYPE:
				return validateGroupType((GroupType)value, diagnostics, context);
			case Assignment6_modelPackage.BINARY_OPERATOR:
				return validateBinaryOperator((BinaryOperator)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurator(Configurator configurator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configurator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(feature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_mandatoryWithDependencies(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_parentIsNotMandatory(feature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_dependsOnSelf(feature, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the mandatoryWithDependencies constraint of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FEATURE__MANDATORY_WITH_DEPENDENCIES__EEXPRESSION = "self.mandatory implies self.dependencies->isEmpty()";

	/**
	 * Validates the mandatoryWithDependencies constraint of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature_mandatoryWithDependencies(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Assignment6_modelPackage.Literals.FEATURE,
				 feature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mandatoryWithDependencies",
				 FEATURE__MANDATORY_WITH_DEPENDENCIES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the parentIsNotMandatory constraint of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FEATURE__PARENT_IS_NOT_MANDATORY__EEXPRESSION = "self.mandatory implies\n" +
		"\t\t\tif self.oclContainer().oclIsKindOf(Feature) then\n" +
		"\t\t\t\tself.oclContainer().oclAsType(Feature).mandatory\n" +
		"\t\t\telse \n" +
		"\t\t\t\tif self.oclContainer().oclIsKindOf(Group) and self.oclContainer().oclContainer().oclIsKindOf(Feature) then\n" +
		"\t\t\t\t\tself.oclContainer().oclContainer().oclAsType(Feature).mandatory\n" +
		"\t\t\t\telse true\n" +
		"\t\t\t\tendif\n" +
		"\t\t\tendif";

	/**
	 * Validates the parentIsNotMandatory constraint of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature_parentIsNotMandatory(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Assignment6_modelPackage.Literals.FEATURE,
				 feature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "parentIsNotMandatory",
				 FEATURE__PARENT_IS_NOT_MANDATORY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the dependsOnSelf constraint of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FEATURE__DEPENDS_ON_SELF__EEXPRESSION = "self.dependencies->forAll(d |\n" +
		"\t        d.oclAsSet()\n" +
		"\t            ->closure(oclContents())\n" +
		"\t            ->forAll(d1 |\n" +
		"\t            \tif d1.oclIsKindOf(IsSelectedDependency) then\n" +
		"\t            \t\td1.oclAsType(IsSelectedDependency).target <> self\n" +
		"\t            \telse \n" +
		"\t            \t\tif d1.oclIsKindOf(IntegerValueDependency) then\n" +
		"\t            \t\t\td1.oclAsType(IntegerValueDependency).target <> self\n" +
		"\t            \t\telse \n" +
		"\t            \t\t\ttrue\n" +
		"\t            \t\tendif\n" +
		"\t            \tendif\n" +
		"\t            )\n" +
		"          \t)";

	/**
	 * Validates the dependsOnSelf constraint of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFeature_dependsOnSelf(Feature feature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Assignment6_modelPackage.Literals.FEATURE,
				 feature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "dependsOnSelf",
				 FEATURE__DEPENDS_ON_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleFeature(SimpleFeature simpleFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(simpleFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(simpleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(simpleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(simpleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(simpleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(simpleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(simpleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(simpleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(simpleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_mandatoryWithDependencies(simpleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_parentIsNotMandatory(simpleFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_dependsOnSelf(simpleFeature, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroup(Group group, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(group, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(group, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(group, diagnostics, context);
		if (result || diagnostics != null) result &= validateGroup_noMandatoryIfXOR(group, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the noMandatoryIfXOR constraint of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GROUP__NO_MANDATORY_IF_XOR__EEXPRESSION = "self.groupType = GroupType::XOR implies self.features->forAll(f| not f.mandatory)";

	/**
	 * Validates the noMandatoryIfXOR constraint of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroup_noMandatoryIfXOR(Group group, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Assignment6_modelPackage.Literals.GROUP,
				 group,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "noMandatoryIfXOR",
				 GROUP__NO_MANDATORY_IF_XOR__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerFeature(IntegerFeature integerFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(integerFeature, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(integerFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(integerFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(integerFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(integerFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(integerFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(integerFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(integerFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(integerFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_mandatoryWithDependencies(integerFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_parentIsNotMandatory(integerFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateFeature_dependsOnSelf(integerFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateIntegerFeature_minLessThanMax(integerFeature, diagnostics, context);
		if (result || diagnostics != null) result &= validateIntegerFeature_evenSteps(integerFeature, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the minLessThanMax constraint of '<em>Integer Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTEGER_FEATURE__MIN_LESS_THAN_MAX__EEXPRESSION = "minValue < maxValue";

	/**
	 * Validates the minLessThanMax constraint of '<em>Integer Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerFeature_minLessThanMax(IntegerFeature integerFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Assignment6_modelPackage.Literals.INTEGER_FEATURE,
				 integerFeature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "minLessThanMax",
				 INTEGER_FEATURE__MIN_LESS_THAN_MAX__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the evenSteps constraint of '<em>Integer Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INTEGER_FEATURE__EVEN_STEPS__EEXPRESSION = "(maxValue - minValue).mod(step) = 0";

	/**
	 * Validates the evenSteps constraint of '<em>Integer Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerFeature_evenSteps(IntegerFeature integerFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Assignment6_modelPackage.Literals.INTEGER_FEATURE,
				 integerFeature,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "evenSteps",
				 INTEGER_FEATURE__EVEN_STEPS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDependency(Dependency dependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dependency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnaryDependency(UnaryDependency unaryDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unaryDependency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryDependency(BinaryDependency binaryDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryDependency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsSelectedDependency(IsSelectedDependency isSelectedDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(isSelectedDependency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntegerValueDependency(IntegerValueDependency integerValueDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(integerValueDependency, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroupType(GroupType groupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryOperator(BinaryOperator binaryOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Assignment6_modelValidator
