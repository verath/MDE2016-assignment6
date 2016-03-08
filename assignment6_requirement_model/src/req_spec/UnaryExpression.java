/**
 */
package req_spec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link req_spec.UnaryExpression#getRequirement <em>Requirement</em>}</li>
 * </ul>
 *
 * @see req_spec.Req_specPackage#getUnaryExpression()
 * @model
 * @generated
 */
public interface UnaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(Requirement)
	 * @see req_spec.Req_specPackage#getUnaryExpression_Requirement()
	 * @model required="true"
	 * @generated
	 */
	Requirement getRequirement();

	/**
	 * Sets the value of the '{@link req_spec.UnaryExpression#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(Requirement value);

} // UnaryExpression
