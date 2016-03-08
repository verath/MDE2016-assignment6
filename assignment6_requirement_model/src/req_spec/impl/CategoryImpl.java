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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import req_spec.Category;
import req_spec.Person;
import req_spec.Req_specPackage;
import req_spec.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link req_spec.impl.CategoryImpl#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link req_spec.impl.CategoryImpl#getSubcategory <em>Subcategory</em>}</li>
 *   <li>{@link req_spec.impl.CategoryImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link req_spec.impl.CategoryImpl#getResponsible <em>Responsible</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CategoryImpl extends MinimalEObjectImpl.Container implements Category {
	/**
	 * The default value of the '{@link #getCategoryName() <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryName()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategoryName() <em>Category Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategoryName()
	 * @generated
	 * @ordered
	 */
	protected String categoryName = CATEGORY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubcategory() <em>Subcategory</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> subcategory;

	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirement;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Req_specPackage.Literals.CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategoryName(String newCategoryName) {
		String oldCategoryName = categoryName;
		categoryName = newCategoryName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Req_specPackage.CATEGORY__CATEGORY_NAME, oldCategoryName, categoryName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getSubcategory() {
		if (subcategory == null) {
			subcategory = new EObjectContainmentEList<Category>(Category.class, this, Req_specPackage.CATEGORY__SUBCATEGORY);
		}
		return subcategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRequirement() {
		if (requirement == null) {
			requirement = new EObjectContainmentEList<Requirement>(Requirement.class, this, Req_specPackage.CATEGORY__REQUIREMENT);
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getResponsible() {
		if (responsible == null) {
			responsible = new EObjectWithInverseResolvingEList.ManyInverse<Person>(Person.class, this, Req_specPackage.CATEGORY__RESPONSIBLE, Req_specPackage.PERSON__CAT_RESPONSIBILITY);
		}
		return responsible;
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
			case Req_specPackage.CATEGORY__RESPONSIBLE:
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
			case Req_specPackage.CATEGORY__SUBCATEGORY:
				return ((InternalEList<?>)getSubcategory()).basicRemove(otherEnd, msgs);
			case Req_specPackage.CATEGORY__REQUIREMENT:
				return ((InternalEList<?>)getRequirement()).basicRemove(otherEnd, msgs);
			case Req_specPackage.CATEGORY__RESPONSIBLE:
				return ((InternalEList<?>)getResponsible()).basicRemove(otherEnd, msgs);
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
			case Req_specPackage.CATEGORY__CATEGORY_NAME:
				return getCategoryName();
			case Req_specPackage.CATEGORY__SUBCATEGORY:
				return getSubcategory();
			case Req_specPackage.CATEGORY__REQUIREMENT:
				return getRequirement();
			case Req_specPackage.CATEGORY__RESPONSIBLE:
				return getResponsible();
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
			case Req_specPackage.CATEGORY__CATEGORY_NAME:
				setCategoryName((String)newValue);
				return;
			case Req_specPackage.CATEGORY__SUBCATEGORY:
				getSubcategory().clear();
				getSubcategory().addAll((Collection<? extends Category>)newValue);
				return;
			case Req_specPackage.CATEGORY__REQUIREMENT:
				getRequirement().clear();
				getRequirement().addAll((Collection<? extends Requirement>)newValue);
				return;
			case Req_specPackage.CATEGORY__RESPONSIBLE:
				getResponsible().clear();
				getResponsible().addAll((Collection<? extends Person>)newValue);
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
			case Req_specPackage.CATEGORY__CATEGORY_NAME:
				setCategoryName(CATEGORY_NAME_EDEFAULT);
				return;
			case Req_specPackage.CATEGORY__SUBCATEGORY:
				getSubcategory().clear();
				return;
			case Req_specPackage.CATEGORY__REQUIREMENT:
				getRequirement().clear();
				return;
			case Req_specPackage.CATEGORY__RESPONSIBLE:
				getResponsible().clear();
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
			case Req_specPackage.CATEGORY__CATEGORY_NAME:
				return CATEGORY_NAME_EDEFAULT == null ? categoryName != null : !CATEGORY_NAME_EDEFAULT.equals(categoryName);
			case Req_specPackage.CATEGORY__SUBCATEGORY:
				return subcategory != null && !subcategory.isEmpty();
			case Req_specPackage.CATEGORY__REQUIREMENT:
				return requirement != null && !requirement.isEmpty();
			case Req_specPackage.CATEGORY__RESPONSIBLE:
				return responsible != null && !responsible.isEmpty();
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
		result.append(" (categoryName: ");
		result.append(categoryName);
		result.append(')');
		return result.toString();
	}

} //CategoryImpl
