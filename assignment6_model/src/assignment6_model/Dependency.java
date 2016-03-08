/**
 */
package assignment6_model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment6_model.Dependency#isNot <em>Not</em>}</li>
 * </ul>
 *
 * @see assignment6_model.Assignment6_modelPackage#getDependency()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Dependency extends EObject {
	/**
	 * Returns the value of the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not</em>' attribute.
	 * @see #setNot(boolean)
	 * @see assignment6_model.Assignment6_modelPackage#getDependency_Not()
	 * @model
	 * @generated
	 */
	boolean isNot();

	/**
	 * Sets the value of the '{@link assignment6_model.Dependency#isNot <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' attribute.
	 * @see #isNot()
	 * @generated
	 */
	void setNot(boolean value);

} // Dependency
