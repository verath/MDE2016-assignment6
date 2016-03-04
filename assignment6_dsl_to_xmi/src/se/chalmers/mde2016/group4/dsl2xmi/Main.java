package se.chalmers.mde2016.group4.dsl2xmi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.example.assignment6.ConfiguratorDSLStandaloneSetup;

import com.google.inject.Injector;

import assignment6_model.Assignment6_modelPackage;
import assignment6_model.Configurator;

public class Main {

	public static void main(String[] args) throws IOException {
		// Register our model package
		Assignment6_modelPackage.eINSTANCE.eClass();

		// Load the model
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input File (.configuratordsl): ");
		String path = reader.readLine();
		Configurator configurator = loadConfigurator(path);

		// Save the model
		String fileName = "configurator-" + Long.toString(System.currentTimeMillis()) + ".xmi";
		saveConfigurator(configurator, fileName);
	}

	private static Configurator loadConfigurator(String path) {
		// See
		// http://wiki.eclipse.org/Xtext/FAQ#How_do_I_load_my_model_in_a_standalone_Java_application.C2.A0.3F
		Injector injector = new ConfiguratorDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(URI.createURI(path), true);

		EObject eConfigurator = resource.getContents().get(0);
		if (eConfigurator instanceof Configurator) {
			return (Configurator) eConfigurator;
		} else {
			throw new IllegalStateException("The model was not a Configurator!");
		}
	}

	private static void saveConfigurator(Configurator configurator, String fileName) {
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI(fileName));
		resource.getContents().add(configurator);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
