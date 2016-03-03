package se.chalmers.mde2016.group4.editor;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;

import assignment6_model.Configurator;
import assignment6_model.Feature;
import assignment6_model.Group;
import assignment6_model.IntegerFeature;

public class FeatureListPage implements Page {
	private final EditorController editorController;
	private final Configurator configurator;
	private final List<Feature> selectableFeatures = new ArrayList<>();

	public FeatureListPage(EditorController editorController, Configurator configurator) {
		this.editorController = editorController;
		this.configurator = configurator;
	}

	private String indentationString(int depth) {
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < depth; i++) {
			sb.append(' ');
			sb.append(' ');
		}
		return sb.toString();
	}

	private int getFeatureIndex(Feature feature) {
		if (!selectableFeatures.contains(feature)) {
			selectableFeatures.add(feature);
		}
		return selectableFeatures.indexOf(feature);
	}

	private void printGroup(Group group, int depth) {
		System.out.print(indentationString(depth));
		String groupType = group.getGroupType().getName();
		System.out.print(group.getName() + " (" + groupType + ")");
		System.out.println();

		printFeatures(group.getFeatures(), depth + 1);
	}

	private void printGroups(EList<Group> groups, int depth) {
		if (groups == null || groups.isEmpty()) {
			return;
		}
		for (Group group : groups) {
			printGroup(group, depth);
		}
	}

	private void printFeature(Feature feature, int depth) {
		System.out.print(indentationString(depth));
		System.out.print("(" + getFeatureIndex(feature) + ") ");
		if (feature.isMandatory()) {
			System.out.print("[M] ");
		} else if (feature.isSelected()) {
			System.out.print("[X] ");
		} else {
			System.out.print("[ ] ");
		}
		System.out.print(feature.getName());

		if (feature instanceof IntegerFeature) {
			System.out.print(" = " + ((IntegerFeature) feature).getValue());
		}

		System.out.println();

		printFeatures(feature.getFeatures(), depth + 1);
		printGroups(feature.getGroups(), depth + 1);
	}

	private void printFeatures(EList<? extends Feature> features, int depth) {
		if (features == null || features.isEmpty()) {
			return;
		}
		for (Feature feature : features) {
			printFeature(feature, depth);
		}
	}

	public void render() {
		System.out.println("Configurator: " + configurator.getName());
		printFeatures(configurator.getFeatures(), 1);
		printGroups(configurator.getGroups(), 1);

		System.out.println();
		System.out.println("(v) - Validate, (s) - Save, (q) - Quit");
	};

	@Override
	public boolean handleInput(String input) {
		if (input.equals("q")) {
			System.exit(0);
			return true;
		}

		if (input.equals("v")) {
			editorController.showValidation();
			return true;
		}
		
		if(input.equals("s")) {
			editorController.showSave();
			return true;
		}

		int index;
		try {
			index = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			return false;
		}

		if (index < 0 || index >= selectableFeatures.size()) {
			return false;
		} else {
			Feature feature = selectableFeatures.get(index);
			editorController.showFeature(feature);
			return true;
		}
	}
}
