package se.chalmers.mde2016.group4.editor;

import assignment6_model.Feature;

public class FeaturePage implements Page {

	private final EditorController editorController;
	private final Feature feature;

	public FeaturePage(EditorController editorController, Feature feature) {
		this.editorController = editorController;
		this.feature = feature;
	}

	private void renderSelected() {
		if (!feature.isMandatory()) {
			System.out.println("  Selected");
			if (feature.isSelected()) {
				System.out.println("    (t) [x] True");
				System.out.println("    (f) [ ] False");
			} else {
				System.out.println("    (t) [ ] True");
				System.out.println("    (f) [x] False");
			}
		}
	}

	protected void renderAdditonalProperties() {
	}

	@Override
	public void render() {
		System.out.print("Feature: " + feature.getName());
		if (feature.isMandatory()) {
			System.out.print(" (Mandatory)");
		}
		System.out.println();

		renderSelected();
		renderAdditonalProperties();

		System.out.println();
		System.out.println("(b) - Back");
	}

	@Override
	public boolean handleInput(String input) {
		if (input.equals("b")) {
			editorController.showFeatureList();
			return true;
		}

		if (!feature.isMandatory()) {
			if (input.equals("t")) {
				feature.setSelected(true);
				return true;
			}
			if (input.equals("f")) {
				feature.setSelected(false);
				return true;
			}
		}
		return false;
	}

}
