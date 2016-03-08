/**
 */
package req_spec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link req_spec.Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link req_spec.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link req_spec.Person#getCatResponsibility <em>Cat Responsibility</em>}</li>
 *   <li>{@link req_spec.Person#getReqResponsibility <em>Req Responsibility</em>}</li>
 * </ul>
 *
 * @see req_spec.Req_specPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see req_spec.Req_specPackage#getPerson_LastName()
	 * @model
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link req_spec.Person#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see req_spec.Req_specPackage#getPerson_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link req_spec.Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Cat Responsibility</b></em>' reference list.
	 * The list contents are of type {@link req_spec.Category}.
	 * It is bidirectional and its opposite is '{@link req_spec.Category#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cat Responsibility</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cat Responsibility</em>' reference list.
	 * @see req_spec.Req_specPackage#getPerson_CatResponsibility()
	 * @see req_spec.Category#getResponsible
	 * @model opposite="responsible"
	 * @generated
	 */
	EList<Category> getCatResponsibility();

	/**
	 * Returns the value of the '<em><b>Req Responsibility</b></em>' reference list.
	 * The list contents are of type {@link req_spec.Requirement}.
	 * It is bidirectional and its opposite is '{@link req_spec.Requirement#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Responsibility</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Responsibility</em>' reference list.
	 * @see req_spec.Req_specPackage#getPerson_ReqResponsibility()
	 * @see req_spec.Requirement#getResponsible
	 * @model opposite="responsible"
	 * @generated
	 */
	EList<Requirement> getReqResponsibility();

} // Person
