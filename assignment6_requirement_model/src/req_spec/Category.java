/**
 */
package req_spec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link req_spec.Category#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link req_spec.Category#getSubcategory <em>Subcategory</em>}</li>
 *   <li>{@link req_spec.Category#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link req_spec.Category#getResponsible <em>Responsible</em>}</li>
 * </ul>
 *
 * @see req_spec.Req_specPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject {
	/**
	 * Returns the value of the '<em><b>Category Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category Name</em>' attribute.
	 * @see #setCategoryName(String)
	 * @see req_spec.Req_specPackage#getCategory_CategoryName()
	 * @model
	 * @generated
	 */
	String getCategoryName();

	/**
	 * Sets the value of the '{@link req_spec.Category#getCategoryName <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category Name</em>' attribute.
	 * @see #getCategoryName()
	 * @generated
	 */
	void setCategoryName(String value);

	/**
	 * Returns the value of the '<em><b>Subcategory</b></em>' containment reference list.
	 * The list contents are of type {@link req_spec.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcategory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcategory</em>' containment reference list.
	 * @see req_spec.Req_specPackage#getCategory_Subcategory()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getSubcategory();

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link req_spec.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference list.
	 * @see req_spec.Req_specPackage#getCategory_Requirement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirement();

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' reference list.
	 * The list contents are of type {@link req_spec.Person}.
	 * It is bidirectional and its opposite is '{@link req_spec.Person#getCatResponsibility <em>Cat Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' reference list.
	 * @see req_spec.Req_specPackage#getCategory_Responsible()
	 * @see req_spec.Person#getCatResponsibility
	 * @model opposite="catResponsibility"
	 * @generated
	 */
	EList<Person> getResponsible();

} // Category
