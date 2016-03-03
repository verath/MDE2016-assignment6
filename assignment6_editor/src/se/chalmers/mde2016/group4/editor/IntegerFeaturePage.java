package se.chalmers.mde2016.group4.editor;

import assignment6_model.IntegerFeature;

public class IntegerFeaturePage extends FeaturePage {

	private final IntegerFeature feature;

	public IntegerFeaturePage(EditorController editorController, IntegerFeature feature) {
		super(editorController, feature);
		this.feature = feature;
	}

	@Override
	protected void renderAdditonalProperties() {
		System.out.print("  Value = " + feature.getValue() + " ");
		System.out.print("(" + feature.getMinValue());
		System.out.print("..");
		System.out.print(feature.getMaxValue());
		System.out.print(", ");
		System.out.print(feature.getStep());
		System.out.println(")");
	}

	@Override
	public boolean handleInput(String input) {
		if (super.handleInput(input)) {
			return true;
		}

		try {
			int newValue = Integer.parseInt(input);
			feature.setValue(newValue);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

}
