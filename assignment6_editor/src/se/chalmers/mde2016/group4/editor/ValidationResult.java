package se.chalmers.mde2016.group4.editor;

import java.util.List;

public class ValidationResult {
	public final boolean isValid;
	public final List<String> errors;

	private ValidationResult(boolean isValid, List<String> errors) {
		this.isValid = isValid;
		this.errors = errors;
	}

	public static ValidationResult fromErrors(List<String> errors) {
		return new ValidationResult(errors.isEmpty(), errors);
	}
}