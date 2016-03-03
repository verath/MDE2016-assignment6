package se.chalmers.mde2016.group4.editor;

import java.util.ArrayList;
import java.util.List;

import assignment6_model.IntegerFeature;

public class IntegerFeatureValidator extends FeatureValidator {

	private final IntegerFeature feature;

	public IntegerFeatureValidator(IntegerFeature feature) {
		super(feature);
		this.feature = feature;
	}

	@Override
	public ValidationResult validate() {
		ValidationResult res = super.validate();
		List<String> errors = new ArrayList<>(res.errors);

		if (feature.getValue() < feature.getMinValue()) {
			errors.add("Value is less than min value");
		}
		if (feature.getValue() > feature.getMaxValue()) {
			errors.add("Value is larger than max value");
		}
		if ((feature.getValue() - feature.getMinValue()) % feature.getStep() != 0) {
			errors.add("Value is not a valid step size");
		}

		return ValidationResult.fromErrors(errors);
	}

}
