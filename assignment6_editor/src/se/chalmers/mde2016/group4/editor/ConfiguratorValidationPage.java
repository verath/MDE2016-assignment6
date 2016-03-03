package se.chalmers.mde2016.group4.editor;

public class ConfiguratorValidationPage implements Page {

	private final EditorController editorController;
	private final ValidationResult validationResult;

	public ConfiguratorValidationPage(EditorController editorController, ValidationResult validationResult) {
		this.editorController = editorController;
		this.validationResult = validationResult;
	}

	@Override
	public void render() {
		System.out.print("Validation Results: ");
		System.out.println(validationResult.isValid ? "Valid" : "Invalid");
		for (String err : validationResult.errors) {
			System.out.println("  " + err);
		}
		System.out.println();
	}

	@Override
	public boolean handleInput(String input) {
		editorController.showFeatureList();
		return true;
	}

}
