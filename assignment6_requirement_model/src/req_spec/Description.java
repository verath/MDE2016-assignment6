/**
 */
package req_spec;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link req_spec.Description#getDescriptionText <em>Description Text</em>}</li>
 * </ul>
 *
 * @see req_spec.Req_specPackage#getDescription()
 * @model
 * @generated
 */
public interface Description extends EObject {
	/**
	 * Returns the value of the '<em><b>Description Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description Text</em>' attribute.
	 * @see #setDescriptionText(String)
	 * @see req_spec.Req_specPackage#getDescription_DescriptionText()
	 * @model
	 * @generated
	 */
	String getDescriptionText();

	/**
	 * Sets the value of the '{@link req_spec.Description#getDescriptionText <em>Description Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description Text</em>' attribute.
	 * @see #getDescriptionText()
	 * @generated
	 */
	void setDescriptionText(String value);

} // Description
