/**
 */
package req_spec;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link req_spec.BinaryExpression#getLeftHand <em>Left Hand</em>}</li>
 *   <li>{@link req_spec.BinaryExpression#getRightHand <em>Right Hand</em>}</li>
 *   <li>{@link req_spec.BinaryExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see req_spec.Req_specPackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Left Hand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Hand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Hand</em>' containment reference.
	 * @see #setLeftHand(Expression)
	 * @see req_spec.Req_specPackage#getBinaryExpression_LeftHand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeftHand();

	/**
	 * Sets the value of the '{@link req_spec.BinaryExpression#getLeftHand <em>Left Hand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Hand</em>' containment reference.
	 * @see #getLeftHand()
	 * @generated
	 */
	void setLeftHand(Expression value);

	/**
	 * Returns the value of the '<em><b>Right Hand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Hand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hand</em>' containment reference.
	 * @see #setRightHand(Expression)
	 * @see req_spec.Req_specPackage#getBinaryExpression_RightHand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRightHand();

	/**
	 * Sets the value of the '{@link req_spec.BinaryExpression#getRightHand <em>Right Hand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Hand</em>' containment reference.
	 * @see #getRightHand()
	 * @generated
	 */
	void setRightHand(Expression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link req_spec.BinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see req_spec.BinaryOperator
	 * @see #setOperator(BinaryOperator)
	 * @see req_spec.Req_specPackage#getBinaryExpression_Operator()
	 * @model
	 * @generated
	 */
	BinaryOperator getOperator();

	/**
	 * Sets the value of the '{@link req_spec.BinaryExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see req_spec.BinaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryOperator value);

} // BinaryExpression
