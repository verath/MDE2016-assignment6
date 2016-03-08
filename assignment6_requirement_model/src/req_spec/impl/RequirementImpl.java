/**
 */
package req_spec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import req_spec.Description;
import req_spec.Feature;
import req_spec.Person;
import req_spec.Req_specPackage;
import req_spec.Requirement;
import req_spec.Requires;
import req_spec.UnaryDependency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link req_spec.impl.RequirementImpl#getName <em>Name</em>}</li>
 *   <li>{@link req_spec.impl.RequirementImpl#getId <em>Id</em>}</li>
 *   <li>{@link req_spec.impl.RequirementImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link req_spec.impl.RequirementImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link req_spec.impl.RequirementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link req_spec.impl.RequirementImpl#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link req_spec.impl.RequirementImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link req_spec.impl.RequirementImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link req_spec.impl.RequirementImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequirementImpl extends MinimalEObjectImpl.Container implements Requirement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatory = IS_MANDATORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The cached value of the '{@link #getResponsible() <em>Responsible</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsible()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> responsible;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected EList<UnaryDependency> dependsOn;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<Requires> requires;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Req_specPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Req_specPackage.REQUIREMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Req_specPackage.REQUIREMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Req_specPackage.REQUIREMENT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMandatory() {
		return isMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMandatory(boolean newIsMandatory) {
		boolean oldIsMandatory = isMandatory;
		isMandatory = newIsMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Req_specPackage.REQUIREMENT__IS_MANDATORY, oldIsMandatory, isMandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Description newDescription, NotificationChain msgs) {
		Description oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Req_specPackage.REQUIREMENT__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Description newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Req_specPackage.REQUIREMENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Req_specPackage.REQUIREMENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Req_specPackage.REQUIREMENT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getResponsible() {
		if (responsible == null) {
			responsible = new EObjectWithInverseResolvingEList.ManyInverse<Person>(Person.class, this, Req_specPackage.REQUIREMENT__RESPONSIBLE, Req_specPackage.PERSON__REQ_RESPONSIBILITY);
		}
		return responsible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UnaryDependency> getDependsOn() {
		if (dependsOn == null) {
			dependsOn = new EObjectContainmentEList<UnaryDependency>(UnaryDependency.class, this, Req_specPackage.REQUIREMENT__DEPENDS_ON);
		}
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requires> getRequires() {
		if (requires == null) {
			requires = new EObjectContainmentEList<Requires>(Requires.class, this, Req_specPackage.REQUIREMENT__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectResolvingEList<Feature>(Feature.class, this, Req_specPackage.REQUIREMENT__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Req_specPackage.REQUIREMENT__RESPONSIBLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResponsible()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Req_specPackage.REQUIREMENT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case Req_specPackage.REQUIREMENT__RESPONSIBLE:
				return ((InternalEList<?>)getResponsible()).basicRemove(otherEnd, msgs);
			case Req_specPackage.REQUIREMENT__DEPENDS_ON:
				return ((InternalEList<?>)getDependsOn()).basicRemove(otherEnd, msgs);
			case Req_specPackage.REQUIREMENT__REQUIRES:
				return ((InternalEList<?>)getRequires()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Req_specPackage.REQUIREMENT__NAME:
				return getName();
			case Req_specPackage.REQUIREMENT__ID:
				return getId();
			case Req_specPackage.REQUIREMENT__PRIORITY:
				return getPriority();
			case Req_specPackage.REQUIREMENT__IS_MANDATORY:
				return isIsMandatory();
			case Req_specPackage.REQUIREMENT__DESCRIPTION:
				return getDescription();
			case Req_specPackage.REQUIREMENT__RESPONSIBLE:
				return getResponsible();
			case Req_specPackage.REQUIREMENT__DEPENDS_ON:
				return getDependsOn();
			case Req_specPackage.REQUIREMENT__REQUIRES:
				return getRequires();
			case Req_specPackage.REQUIREMENT__FEATURES:
				return getFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Req_specPackage.REQUIREMENT__NAME:
				setName((String)newValue);
				return;
			case Req_specPackage.REQUIREMENT__ID:
				setId((String)newValue);
				return;
			case Req_specPackage.REQUIREMENT__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case Req_specPackage.REQUIREMENT__IS_MANDATORY:
				setIsMandatory((Boolean)newValue);
				return;
			case Req_specPackage.REQUIREMENT__DESCRIPTION:
				setDescription((Description)newValue);
				return;
			case Req_specPackage.REQUIREMENT__RESPONSIBLE:
				getResponsible().clear();
				getResponsible().addAll((Collection<? extends Person>)newValue);
				return;
			case Req_specPackage.REQUIREMENT__DEPENDS_ON:
				getDependsOn().clear();
				getDependsOn().addAll((Collection<? extends UnaryDependency>)newValue);
				return;
			case Req_specPackage.REQUIREMENT__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends Requires>)newValue);
				return;
			case Req_specPackage.REQUIREMENT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Req_specPackage.REQUIREMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Req_specPackage.REQUIREMENT__ID:
				setId(ID_EDEFAULT);
				return;
			case Req_specPackage.REQUIREMENT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case Req_specPackage.REQUIREMENT__IS_MANDATORY:
				setIsMandatory(IS_MANDATORY_EDEFAULT);
				return;
			case Req_specPackage.REQUIREMENT__DESCRIPTION:
				setDescription((Description)null);
				return;
			case Req_specPackage.REQUIREMENT__RESPONSIBLE:
				getResponsible().clear();
				return;
			case Req_specPackage.REQUIREMENT__DEPENDS_ON:
				getDependsOn().clear();
				return;
			case Req_specPackage.REQUIREMENT__REQUIRES:
				getRequires().clear();
				return;
			case Req_specPackage.REQUIREMENT__FEATURES:
				getFeatures().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Req_specPackage.REQUIREMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Req_specPackage.REQUIREMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Req_specPackage.REQUIREMENT__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case Req_specPackage.REQUIREMENT__IS_MANDATORY:
				return isMandatory != IS_MANDATORY_EDEFAULT;
			case Req_specPackage.REQUIREMENT__DESCRIPTION:
				return description != null;
			case Req_specPackage.REQUIREMENT__RESPONSIBLE:
				return responsible != null && !responsible.isEmpty();
			case Req_specPackage.REQUIREMENT__DEPENDS_ON:
				return dependsOn != null && !dependsOn.isEmpty();
			case Req_specPackage.REQUIREMENT__REQUIRES:
				return requires != null && !requires.isEmpty();
			case Req_specPackage.REQUIREMENT__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", priority: ");
		result.append(priority);
		result.append(", isMandatory: ");
		result.append(isMandatory);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
