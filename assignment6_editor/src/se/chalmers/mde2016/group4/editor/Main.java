package se.chalmers.mde2016.group4.editor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import assignment6_model.Assignment6_modelPackage;
import assignment6_model.Configurator;

public class Main {

	public static void main(String[] args) throws IOException {
		// Register our model package
		Assignment6_modelPackage.eINSTANCE.eClass();

		// Load the model
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input File (.xmi): ");
		String path = reader.readLine();
		Configurator configurator = loadConfigurator(path);
		
		System.out.println("Model loaded!");

		EditorController ec = new EditorController(configurator);
		ec.run();
	}

	private static Configurator loadConfigurator(String path) {
		// Do some ecore things...
		Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> extensionMap = reg.getExtensionToFactoryMap();
		extensionMap.put("xmi", new XMIResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();
		Resource modelInstance = resSet.getResource(URI.createURI(path), true);
		EObject eConfigurator = modelInstance.getContents().get(0);

		if (eConfigurator instanceof Configurator) {
			return (Configurator) eConfigurator;
		} else {
			throw new IllegalStateException("The model was not a Configurator!");
		}
	}
}
