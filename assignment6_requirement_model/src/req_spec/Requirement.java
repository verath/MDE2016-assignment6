/**
 */
package req_spec;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link req_spec.Requirement#getName <em>Name</em>}</li>
 *   <li>{@link req_spec.Requirement#getId <em>Id</em>}</li>
 *   <li>{@link req_spec.Requirement#getPriority <em>Priority</em>}</li>
 *   <li>{@link req_spec.Requirement#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link req_spec.Requirement#getDescription <em>Description</em>}</li>
 *   <li>{@link req_spec.Requirement#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link req_spec.Requirement#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link req_spec.Requirement#getRequires <em>Requires</em>}</li>
 *   <li>{@link req_spec.Requirement#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see req_spec.Req_specPackage#getRequirement()
 * @model abstract="true"
 * @generated
 */
public interface Requirement extends EObject {
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
	 * @see req_spec.Req_specPackage#getRequirement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link req_spec.Requirement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see req_spec.Req_specPackage#getRequirement_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link req_spec.Requirement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see req_spec.Req_specPackage#getRequirement_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link req_spec.Requirement#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mandatory</em>' attribute.
	 * @see #setIsMandatory(boolean)
	 * @see req_spec.Req_specPackage#getRequirement_IsMandatory()
	 * @model
	 * @generated
	 */
	boolean isIsMandatory();

	/**
	 * Sets the value of the '{@link req_spec.Requirement#isIsMandatory <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mandatory</em>' attribute.
	 * @see #isIsMandatory()
	 * @generated
	 */
	void setIsMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Description)
	 * @see req_spec.Req_specPackage#getRequirement_Description()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link req_spec.Requirement#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' reference list.
	 * The list contents are of type {@link req_spec.Person}.
	 * It is bidirectional and its opposite is '{@link req_spec.Person#getReqResponsibility <em>Req Responsibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' reference list.
	 * @see req_spec.Req_specPackage#getRequirement_Responsible()
	 * @see req_spec.Person#getReqResponsibility
	 * @model opposite="reqResponsibility"
	 * @generated
	 */
	EList<Person> getResponsible();

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' containment reference list.
	 * The list contents are of type {@link req_spec.UnaryDependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' containment reference list.
	 * @see req_spec.Req_specPackage#getRequirement_DependsOn()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnaryDependency> getDependsOn();

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' containment reference list.
	 * The list contents are of type {@link req_spec.Requires}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' containment reference list.
	 * @see req_spec.Req_specPackage#getRequirement_Requires()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requires> getRequires();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link req_spec.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see req_spec.Req_specPackage#getRequirement_Features()
	 * @model
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Requirement
