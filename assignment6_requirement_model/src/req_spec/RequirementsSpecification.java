/**
 */
package req_spec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link req_spec.RequirementsSpecification#getName <em>Name</em>}</li>
 *   <li>{@link req_spec.RequirementsSpecification#getCategory <em>Category</em>}</li>
 *   <li>{@link req_spec.RequirementsSpecification#getPerson <em>Person</em>}</li>
 *   <li>{@link req_spec.RequirementsSpecification#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see req_spec.Req_specPackage#getRequirementsSpecification()
 * @model
 * @generated
 */
public interface RequirementsSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see req_spec.Req_specPackage#getRequirementsSpecification_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link req_spec.RequirementsSpecification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' containment reference list.
	 * The list contents are of type {@link req_spec.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' containment reference list.
	 * @see req_spec.Req_specPackage#getRequirementsSpecification_Category()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getCategory();

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference list.
	 * The list contents are of type {@link req_spec.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' containment reference list.
	 * @see req_spec.Req_specPackage#getRequirementsSpecification_Person()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPerson();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' containment reference list.
	 * The list contents are of type {@link req_spec.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' containment reference list.
	 * @see req_spec.Req_specPackage#getRequirementsSpecification_Feature()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeature();

} // RequirementsSpecification
