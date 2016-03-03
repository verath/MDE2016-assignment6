package se.chalmers.mde2016.group4.editor;

import java.io.IOException;
import java.util.Collections;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import assignment6_model.Configurator;

public class SavePage implements Page {

	private final EditorController editorController;
	private final Configurator configurator;
	private final String fileName;

	public SavePage(EditorController editorController, Configurator configurator) {
		this.editorController = editorController;
		this.configurator = configurator;
		this.fileName = "configurator-" + Long.toString(System.currentTimeMillis()) + ".xmi";
	}

	@Override
	public void render() {
		System.out.println("The model will be saved as '" + fileName + "'");
		System.out.println("  (y) Yes");
		System.out.println("  (n) No");
	}

	private void saveToFile() {
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI(fileName));
		resource.getContents().add(configurator);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean handleInput(String input) {
		if (input.equals("y")) {
			saveToFile();
			editorController.showFeatureList();
			return true;
		} else if (input.equals("n")) {
			editorController.showFeatureList();
			return true;
		} else {
			return false;
		}
	}

}
