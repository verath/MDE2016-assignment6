/**
 */
package assignment6_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment6_model.Group#getFeatures <em>Features</em>}</li>
 *   <li>{@link assignment6_model.Group#getName <em>Name</em>}</li>
 *   <li>{@link assignment6_model.Group#getGroupType <em>Group Type</em>}</li>
 * </ul>
 *
 * @see assignment6_model.Assignment6_modelPackage#getGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='noMandatoryIfXOR'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot noMandatoryIfXOR='self.groupType = GroupType::XOR implies self.features->forAll(f| not f.mandatory)'"
 * @generated
 */
public interface Group extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link assignment6_model.SimpleFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see assignment6_model.Assignment6_modelPackage#getGroup_Features()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<SimpleFeature> getFeatures();

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
	 * @see assignment6_model.Assignment6_modelPackage#getGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assignment6_model.Group#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Group Type</b></em>' attribute.
	 * The literals are from the enumeration {@link assignment6_model.GroupType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Type</em>' attribute.
	 * @see assignment6_model.GroupType
	 * @see #setGroupType(GroupType)
	 * @see assignment6_model.Assignment6_modelPackage#getGroup_GroupType()
	 * @model
	 * @generated
	 */
	GroupType getGroupType();

	/**
	 * Sets the value of the '{@link assignment6_model.Group#getGroupType <em>Group Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Type</em>' attribute.
	 * @see assignment6_model.GroupType
	 * @see #getGroupType()
	 * @generated
	 */
	void setGroupType(GroupType value);

} // Group
