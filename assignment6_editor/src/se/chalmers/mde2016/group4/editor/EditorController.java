package se.chalmers.mde2016.group4.editor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import assignment6_model.Configurator;
import assignment6_model.Feature;
import assignment6_model.IntegerFeature;

public class EditorController {
	private final Configurator configurator;
	private final BufferedReader inReader;

	private Page currentPage;

	public EditorController(Configurator configurator) {
		this.configurator = configurator;
		this.inReader = new BufferedReader(new InputStreamReader(System.in));

		clearScreen();
		showFeatureList();
	}

	private void clearScreen() {
		// Wow nice clear!
		System.out.println();
		System.out.println("---------------------");
		System.out.println();
	}

	private String getInput(String prompt) throws IOException {
		if (prompt != null && !prompt.isEmpty()) {
			System.out.print(prompt.trim() + " ");
		}
		return inReader.readLine().toLowerCase().trim();
	}

	public void showFeature(Feature feature) {
		if (feature instanceof IntegerFeature) {
			currentPage = new IntegerFeaturePage(this, (IntegerFeature) feature);
		} else {
			currentPage = new FeaturePage(this, feature);
		}
	}

	public void showFeatureList() {
		currentPage = new FeatureListPage(this, configurator);
	}

	public void showValidation() {
		Validator cv = new ConfiguratorValidator(configurator);
		ValidationResult res = cv.validate();
		currentPage = new ConfiguratorValidationPage(this, res);
	}
	
	public void showSave() {
		currentPage = new SavePage(this, configurator);
	}

	public void run() throws IOException {
		while (true) {
			currentPage.render();
			String input = getInput("Input: ");
			currentPage.handleInput(input);
			clearScreen();
		}
	}
}
