/**
 */
package assignment6_model.impl;

import assignment6_model.Assignment6_modelPackage;
import assignment6_model.Dependency;
import assignment6_model.Feature;
import assignment6_model.Group;
import assignment6_model.SimpleFeature;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment6_model.impl.SimpleFeatureImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link assignment6_model.impl.SimpleFeatureImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link assignment6_model.impl.SimpleFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link assignment6_model.impl.SimpleFeatureImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link assignment6_model.impl.SimpleFeatureImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link assignment6_model.impl.SimpleFeatureImpl#isSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleFeatureImpl extends MinimalEObjectImpl.Container implements SimpleFeature {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<Group> groups;

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
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependency> dependencies;

	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean selected = SELECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment6_modelPackage.Literals.SIMPLE_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<Feature>(Feature.class, this, Assignment6_modelPackage.SIMPLE_FEATURE__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Group> getGroups() {
		if (groups == null) {
			groups = new EObjectContainmentEList<Group>(Group.class, this, Assignment6_modelPackage.SIMPLE_FEATURE__GROUPS);
		}
		return groups;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment6_modelPackage.SIMPLE_FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<Dependency>(Dependency.class, this, Assignment6_modelPackage.SIMPLE_FEATURE__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment6_modelPackage.SIMPLE_FEATURE__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(boolean newSelected) {
		boolean oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment6_modelPackage.SIMPLE_FEATURE__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Assignment6_modelPackage.SIMPLE_FEATURE__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case Assignment6_modelPackage.SIMPLE_FEATURE__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case Assignment6_modelPackage.SIMPLE_FEATURE__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
			case Assignment6_modelPackage.SIMPLE_FEATURE__FEATURES:
				return getFeatures();
			case Assignment6_modelPackage.SIMPLE_FEATURE__GROUPS:
				return getGroups();
			case Assignment6_modelPackage.SIMPLE_FEATURE__NAME:
				return getName();
			case Assignment6_modelPackage.SIMPLE_FEATURE__DEPENDENCIES:
				return getDependencies();
			case Assignment6_modelPackage.SIMPLE_FEATURE__MANDATORY:
				return isMandatory();
			case Assignment6_modelPackage.SIMPLE_FEATURE__SELECTED:
				return isSelected();
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
			case Assignment6_modelPackage.SIMPLE_FEATURE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case Assignment6_modelPackage.SIMPLE_FEATURE__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends Group>)newValue);
				return;
			case Assignment6_modelPackage.SIMPLE_FEATURE__NAME:
				setName((String)newValue);
				return;
			case Assignment6_modelPackage.SIMPLE_FEATURE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Dependency>)newValue);
				return;
			case Assignment6_modelPackage.SIMPLE_FEATURE__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case Assignment6_modelPackage.SIMPLE_FEATURE__SELECTED:
				setSelected((Boolean)newValue);
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
			case Assignment6_modelPackage.SIMPLE_FEATURE__FEATURES:
				getFeatures().clear();
				return;
			case Assignment6_modelPackage.SIMPLE_FEATURE__GROUPS:
				getGroups().clear();
				return;
			case Assignment6_modelPackage.SIMPLE_FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Assignment6_modelPackage.SIMPLE_FEATURE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case Assignment6_modelPackage.SIMPLE_FEATURE__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case Assignment6_modelPackage.SIMPLE_FEATURE__SELECTED:
				setSelected(SELECTED_EDEFAULT);
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
			case Assignment6_modelPackage.SIMPLE_FEATURE__FEATURES:
				return features != null && !features.isEmpty();
			case Assignment6_modelPackage.SIMPLE_FEATURE__GROUPS:
				return groups != null && !groups.isEmpty();
			case Assignment6_modelPackage.SIMPLE_FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Assignment6_modelPackage.SIMPLE_FEATURE__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case Assignment6_modelPackage.SIMPLE_FEATURE__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
			case Assignment6_modelPackage.SIMPLE_FEATURE__SELECTED:
				return selected != SELECTED_EDEFAULT;
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
		result.append(", mandatory: ");
		result.append(mandatory);
		result.append(", selected: ");
		result.append(selected);
		result.append(')');
		return result.toString();
	}

} //SimpleFeatureImpl
