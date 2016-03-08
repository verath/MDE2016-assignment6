/**
 */
package assignment6_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment6_model.Feature#getFeatures <em>Features</em>}</li>
 *   <li>{@link assignment6_model.Feature#getGroups <em>Groups</em>}</li>
 *   <li>{@link assignment6_model.Feature#getName <em>Name</em>}</li>
 *   <li>{@link assignment6_model.Feature#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link assignment6_model.Feature#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link assignment6_model.Feature#isSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @see assignment6_model.Assignment6_modelPackage#getFeature()
 * @model interface="true" abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mandatoryWithDependencies parentIsNotMandatory dependsOnSelf'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mandatoryWithDependencies='self.mandatory implies self.dependencies->isEmpty()' parentIsNotMandatory='self.mandatory implies\n\t\t\tif self.oclContainer().oclIsKindOf(Feature) then\n\t\t\t\tself.oclContainer().oclAsType(Feature).mandatory\n\t\t\telse \n\t\t\t\tif self.oclContainer().oclIsKindOf(Group) and self.oclContainer().oclContainer().oclIsKindOf(Feature) then\n\t\t\t\t\tself.oclContainer().oclContainer().oclAsType(Feature).mandatory\n\t\t\t\telse true\n\t\t\t\tendif\n\t\t\tendif' dependsOnSelf='self.dependencies->forAll(d |\n\t        d.oclAsSet()\n\t            ->closure(oclContents())\n\t            ->forAll(d1 |\n\t            \tif d1.oclIsKindOf(IsSelectedDependency) then\n\t            \t\td1.oclAsType(IsSelectedDependency).target <> self\n\t            \telse \n\t            \t\tif d1.oclIsKindOf(IntegerValueDependency) then\n\t            \t\t\td1.oclAsType(IntegerValueDependency).target <> self\n\t            \t\telse \n\t            \t\t\ttrue\n\t            \t\tendif\n\t            \tendif\n\t            )\n          \t)'"
 * @generated
 */
public interface Feature extends EObject {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link assignment6_model.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see assignment6_model.Assignment6_modelPackage#getFeature_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link assignment6_model.Group}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see assignment6_model.Assignment6_modelPackage#getFeature_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Group> getGroups();

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
	 * @see assignment6_model.Assignment6_modelPackage#getFeature_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assignment6_model.Feature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link assignment6_model.Dependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see assignment6_model.Assignment6_modelPackage#getFeature_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependencies();

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see assignment6_model.Assignment6_modelPackage#getFeature_Mandatory()
	 * @model
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link assignment6_model.Feature#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see assignment6_model.Assignment6_modelPackage#getFeature_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link assignment6_model.Feature#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

} // Feature
