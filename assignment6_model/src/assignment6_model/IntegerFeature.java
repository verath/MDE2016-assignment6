/**
 */
package assignment6_model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment6_model.IntegerFeature#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link assignment6_model.IntegerFeature#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link assignment6_model.IntegerFeature#getStep <em>Step</em>}</li>
 *   <li>{@link assignment6_model.IntegerFeature#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see assignment6_model.Assignment6_modelPackage#getIntegerFeature()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='minLessThanMax evenSteps'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot minLessThanMax='minValue < maxValue' evenSteps='(maxValue - minValue).mod(step) = 0'"
 * @generated
 */
public interface IntegerFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(int)
	 * @see assignment6_model.Assignment6_modelPackage#getIntegerFeature_MinValue()
	 * @model default="0"
	 * @generated
	 */
	int getMinValue();

	/**
	 * Sets the value of the '{@link assignment6_model.IntegerFeature#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(int value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(int)
	 * @see assignment6_model.Assignment6_modelPackage#getIntegerFeature_MaxValue()
	 * @model default="1"
	 * @generated
	 */
	int getMaxValue();

	/**
	 * Sets the value of the '{@link assignment6_model.IntegerFeature#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(int value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute.
	 * @see #setStep(int)
	 * @see assignment6_model.Assignment6_modelPackage#getIntegerFeature_Step()
	 * @model default="0"
	 * @generated
	 */
	int getStep();

	/**
	 * Sets the value of the '{@link assignment6_model.IntegerFeature#getStep <em>Step</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' attribute.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(int value);

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
	 * @see assignment6_model.Assignment6_modelPackage#getIntegerFeature_Value()
	 * @model default="0"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link assignment6_model.IntegerFeature#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // IntegerFeature
