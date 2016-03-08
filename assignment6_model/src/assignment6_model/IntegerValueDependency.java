/**
 */
package assignment6_model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Value Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment6_model.IntegerValueDependency#getTarget <em>Target</em>}</li>
 *   <li>{@link assignment6_model.IntegerValueDependency#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see assignment6_model.Assignment6_modelPackage#getIntegerValueDependency()
 * @model
 * @generated
 */
public interface IntegerValueDependency extends UnaryDependency {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(IntegerFeature)
	 * @see assignment6_model.Assignment6_modelPackage#getIntegerValueDependency_Target()
	 * @model required="true"
	 * @generated
	 */
	IntegerFeature getTarget();

	/**
	 * Sets the value of the '{@link assignment6_model.IntegerValueDependency#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(IntegerFeature value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see assignment6_model.Assignment6_modelPackage#getIntegerValueDependency_Value()
	 * @model default="0"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link assignment6_model.IntegerValueDependency#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntegerValueDependency
