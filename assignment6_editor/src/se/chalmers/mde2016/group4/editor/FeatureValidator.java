package se.chalmers.mde2016.group4.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import assignment6_model.BinaryDependency;
import assignment6_model.Dependency;
import assignment6_model.Feature;
import assignment6_model.Group;
import assignment6_model.IntegerValueDependency;
import assignment6_model.IsSelectedDependency;
import assignment6_model.UnaryDependency;

public class FeatureValidator implements Validator {
	private final Feature feature;

	public FeatureValidator(Feature feature) {
		this.feature = feature;
	}

	private void validateIntegerValueDependency(IntegerValueDependency dependency, List<String> errors) {
		int value = dependency.getValue();
		if (dependency.getTarget().getValue() != value) {
			String targetName = dependency.getTarget().getName();
			errors.add(targetName + " must be equal to " + value);
		}
	}

	private void validateIsSelectedDependency(IsSelectedDependency dependency, List<String> errors) {
		Feature target = dependency.getTarget();
		if (!target.isMandatory() && !target.isSelected()) {
			String targetName = dependency.getTarget().getName();
			errors.add(targetName + " must be selected");
		}
	}

	private void validateUnaryDependency(UnaryDependency dependency, List<String> errors) {
		if (dependency instanceof IsSelectedDependency) {
			validateIsSelectedDependency((IsSelectedDependency) dependency, errors);
		} else if (dependency instanceof IntegerValueDependency) {
			validateIntegerValueDependency((IntegerValueDependency) dependency, errors);
		}
	}

	private void validateDependency(Dependency dependency, List<String> errors) {
		if (dependency instanceof BinaryDependency) {
			BinaryDependency binaryDependency = (BinaryDependency) dependency;
			validateDependency(binaryDependency.getLeftHand(), errors);
			validateDependency(binaryDependency.getRightHand(), errors);
		} else if (dependency instanceof UnaryDependency) {
			validateUnaryDependency((UnaryDependency) dependency, errors);
		}
	}
	
	private void validateContainer(Feature feature, List<String> errors) {
		EObject container = feature.eContainer();
		if (container instanceof Group) {
			container = container.eContainer();
		}
		if (container instanceof Feature) {
			Feature containerFeature = (Feature) container;
			if (!containerFeature.isMandatory() && !containerFeature.isSelected()) {
				errors.add("Container " + containerFeature.getName() + " must be selected");
			}
		}
	}

	@Override
	public ValidationResult validate() {
		List<String> errors = new ArrayList<>();

		if (feature.isSelected()) {
			validateContainer(feature, errors);
			for (Dependency dependency : feature.getDependencies()) {
				validateDependency(dependency, errors);
			}
		}

		return ValidationResult.fromErrors(errors);
	}
}
