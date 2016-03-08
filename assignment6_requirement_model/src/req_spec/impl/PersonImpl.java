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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import req_spec.Category;
import req_spec.Person;
import req_spec.Req_specPackage;
import req_spec.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link req_spec.impl.PersonImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link req_spec.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link req_spec.impl.PersonImpl#getCatResponsibility <em>Cat Responsibility</em>}</li>
 *   <li>{@link req_spec.impl.PersonImpl#getReqResponsibility <em>Req Responsibility</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends MinimalEObjectImpl.Container implements Person {
	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCatResponsibility() <em>Cat Responsibility</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatResponsibility()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> catResponsibility;

	/**
	 * The cached value of the '{@link #getReqResponsibility() <em>Req Responsibility</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqResponsibility()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> reqResponsibility;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Req_specPackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Req_specPackage.PERSON__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Req_specPackage.PERSON__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCatResponsibility() {
		if (catResponsibility == null) {
			catResponsibility = new EObjectWithInverseResolvingEList.ManyInverse<Category>(Category.class, this, Req_specPackage.PERSON__CAT_RESPONSIBILITY, Req_specPackage.CATEGORY__RESPONSIBLE);
		}
		return catResponsibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getReqResponsibility() {
		if (reqResponsibility == null) {
			reqResponsibility = new EObjectWithInverseResolvingEList.ManyInverse<Requirement>(Requirement.class, this, Req_specPackage.PERSON__REQ_RESPONSIBILITY, Req_specPackage.REQUIREMENT__RESPONSIBLE);
		}
		return reqResponsibility;
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
			case Req_specPackage.PERSON__CAT_RESPONSIBILITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCatResponsibility()).basicAdd(otherEnd, msgs);
			case Req_specPackage.PERSON__REQ_RESPONSIBILITY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReqResponsibility()).basicAdd(otherEnd, msgs);
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
			case Req_specPackage.PERSON__CAT_RESPONSIBILITY:
				return ((InternalEList<?>)getCatResponsibility()).basicRemove(otherEnd, msgs);
			case Req_specPackage.PERSON__REQ_RESPONSIBILITY:
				return ((InternalEList<?>)getReqResponsibility()).basicRemove(otherEnd, msgs);
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
			case Req_specPackage.PERSON__LAST_NAME:
				return getLastName();
			case Req_specPackage.PERSON__FIRST_NAME:
				return getFirstName();
			case Req_specPackage.PERSON__CAT_RESPONSIBILITY:
				return getCatResponsibility();
			case Req_specPackage.PERSON__REQ_RESPONSIBILITY:
				return getReqResponsibility();
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
			case Req_specPackage.PERSON__LAST_NAME:
				setLastName((String)newValue);
				return;
			case Req_specPackage.PERSON__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case Req_specPackage.PERSON__CAT_RESPONSIBILITY:
				getCatResponsibility().clear();
				getCatResponsibility().addAll((Collection<? extends Category>)newValue);
				return;
			case Req_specPackage.PERSON__REQ_RESPONSIBILITY:
				getReqResponsibility().clear();
				getReqResponsibility().addAll((Collection<? extends Requirement>)newValue);
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
			case Req_specPackage.PERSON__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case Req_specPackage.PERSON__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case Req_specPackage.PERSON__CAT_RESPONSIBILITY:
				getCatResponsibility().clear();
				return;
			case Req_specPackage.PERSON__REQ_RESPONSIBILITY:
				getReqResponsibility().clear();
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
			case Req_specPackage.PERSON__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case Req_specPackage.PERSON__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case Req_specPackage.PERSON__CAT_RESPONSIBILITY:
				return catResponsibility != null && !catResponsibility.isEmpty();
			case Req_specPackage.PERSON__REQ_RESPONSIBILITY:
				return reqResponsibility != null && !reqResponsibility.isEmpty();
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
		result.append(" (lastName: ");
		result.append(lastName);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
