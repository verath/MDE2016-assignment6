/**
 */
package assignment6_model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment6_model.BinaryDependency#getRightHand <em>Right Hand</em>}</li>
 *   <li>{@link assignment6_model.BinaryDependency#getLeftHand <em>Left Hand</em>}</li>
 *   <li>{@link assignment6_model.BinaryDependency#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see assignment6_model.Assignment6_modelPackage#getBinaryDependency()
 * @model
 * @generated
 */
public interface BinaryDependency extends Dependency {
	/**
	 * Returns the value of the '<em><b>Right Hand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Hand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Hand</em>' containment reference.
	 * @see #setRightHand(Dependency)
	 * @see assignment6_model.Assignment6_modelPackage#getBinaryDependency_RightHand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dependency getRightHand();

	/**
	 * Sets the value of the '{@link assignment6_model.BinaryDependency#getRightHand <em>Right Hand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Hand</em>' containment reference.
	 * @see #getRightHand()
	 * @generated
	 */
	void setRightHand(Dependency value);

	/**
	 * Returns the value of the '<em><b>Left Hand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Hand</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Hand</em>' containment reference.
	 * @see #setLeftHand(Dependency)
	 * @see assignment6_model.Assignment6_modelPackage#getBinaryDependency_LeftHand()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dependency getLeftHand();

	/**
	 * Sets the value of the '{@link assignment6_model.BinaryDependency#getLeftHand <em>Left Hand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Hand</em>' containment reference.
	 * @see #getLeftHand()
	 * @generated
	 */
	void setLeftHand(Dependency value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link assignment6_model.BinaryOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see assignment6_model.BinaryOperator
	 * @see #setOperator(BinaryOperator)
	 * @see assignment6_model.Assignment6_modelPackage#getBinaryDependency_Operator()
	 * @model
	 * @generated
	 */
	BinaryOperator getOperator();

	/**
	 * Sets the value of the '{@link assignment6_model.BinaryDependency#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see assignment6_model.BinaryOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(BinaryOperator value);

} // BinaryDependency
