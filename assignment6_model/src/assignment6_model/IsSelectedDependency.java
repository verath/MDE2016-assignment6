/**
 */
package assignment6_model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Is Selected Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment6_model.IsSelectedDependency#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see assignment6_model.Assignment6_modelPackage#getIsSelectedDependency()
 * @model
 * @generated
 */
public interface IsSelectedDependency extends UnaryDependency {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Feature)
	 * @see assignment6_model.Assignment6_modelPackage#getIsSelectedDependency_Target()
	 * @model required="true"
	 * @generated
	 */
	Feature getTarget();

	/**
	 * Sets the value of the '{@link assignment6_model.IsSelectedDependency#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Feature value);

} // IsSelectedDependency
