package se.chalmers.mde2016.group4.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import assignment6_model.Configurator;
import assignment6_model.Feature;
import assignment6_model.Group;
import assignment6_model.GroupType;
import assignment6_model.IntegerFeature;

public class ConfiguratorValidator implements Validator {
	private final Configurator configurator;

	public ConfiguratorValidator(Configurator configurator) {
		this.configurator = configurator;
	}

	private void addError(List<String> errors, Group group, String errMessage) {
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		sb.append("Group: ");
		sb.append(group.getName());
		sb.append('>');
		sb.append(" ");
		sb.append(errMessage);
		errors.add(sb.toString());
	}

	private void addError(List<String> errors, Feature feature, String errMessage) {
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		sb.append("Feature: ");
		sb.append(feature.getName());
		sb.append('>');
		sb.append(" ");
		sb.append(errMessage);
		errors.add(sb.toString());
	}

	private void validateGroup(Group group, List<String> errors) {
		int numChosen = 0;
		for (Feature feature : group.getFeatures()) {
			if (feature.isSelected() || feature.isMandatory()) {
				numChosen++;
			}
		}

		if (numChosen < 1) {
			addError(errors, group, "No feature selected");
		}

		if (group.getGroupType() == GroupType.XOR) {
			if (numChosen > 1) {
				addError(errors, group, "More than one feature selected");
			}
		}
		
		validateFeatures(group.getFeatures(), errors);
	}

	private void validateGroups(EList<Group> groups, List<String> errors) {
		for (Group group : groups) {
			validateGroup(group, errors);
		}
	}

	private void validateFeature(Feature feature, List<String> errors) {
		FeatureValidator fv;
		if (feature instanceof IntegerFeature) {
			fv = new IntegerFeatureValidator((IntegerFeature) feature);
		} else {
			fv = new FeatureValidator(feature);
		}

		ValidationResult res = fv.validate();
		for (String err : res.errors) {
			addError(errors, feature, err);
		}
		
		validateGroups(feature.getGroups(), errors);
		validateFeatures(feature.getFeatures(), errors);
	}

	private void validateFeatures(EList<? extends Feature> features, List<String> errors) {
		if (features == null) {
			return;
		}
		for (Feature feature : features) {
			validateFeature(feature, errors);
		}
	}

	@Override
	public ValidationResult validate() {
		List<String> errors = new ArrayList<String>();

		validateGroups(configurator.getGroups(), errors);
		validateFeatures(configurator.getFeatures(), errors);

		return ValidationResult.fromErrors(errors);
	}
}
