/**
 */
package assignment6_model.impl;

import assignment6_model.Assignment6_modelPackage;
import assignment6_model.BinaryDependency;
import assignment6_model.BinaryOperator;
import assignment6_model.Dependency;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment6_model.impl.BinaryDependencyImpl#isNot <em>Not</em>}</li>
 *   <li>{@link assignment6_model.impl.BinaryDependencyImpl#getRightHand <em>Right Hand</em>}</li>
 *   <li>{@link assignment6_model.impl.BinaryDependencyImpl#getLeftHand <em>Left Hand</em>}</li>
 *   <li>{@link assignment6_model.impl.BinaryDependencyImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryDependencyImpl extends MinimalEObjectImpl.Container implements BinaryDependency {
	/**
	 * The default value of the '{@link #isNot() <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNot()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNot() <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNot()
	 * @generated
	 * @ordered
	 */
	protected boolean not = NOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRightHand() <em>Right Hand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightHand()
	 * @generated
	 * @ordered
	 */
	protected Dependency rightHand;

	/**
	 * The cached value of the '{@link #getLeftHand() <em>Left Hand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftHand()
	 * @generated
	 * @ordered
	 */
	protected Dependency leftHand;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryOperator OPERATOR_EDEFAULT = BinaryOperator.AND;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected BinaryOperator operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment6_modelPackage.Literals.BINARY_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNot() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNot(boolean newNot) {
		boolean oldNot = not;
		not = newNot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment6_modelPackage.BINARY_DEPENDENCY__NOT, oldNot, not));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getRightHand() {
		return rightHand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightHand(Dependency newRightHand, NotificationChain msgs) {
		Dependency oldRightHand = rightHand;
		rightHand = newRightHand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Assignment6_modelPackage.BINARY_DEPENDENCY__RIGHT_HAND, oldRightHand, newRightHand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightHand(Dependency newRightHand) {
		if (newRightHand != rightHand) {
			NotificationChain msgs = null;
			if (rightHand != null)
				msgs = ((InternalEObject)rightHand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Assignment6_modelPackage.BINARY_DEPENDENCY__RIGHT_HAND, null, msgs);
			if (newRightHand != null)
				msgs = ((InternalEObject)newRightHand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Assignment6_modelPackage.BINARY_DEPENDENCY__RIGHT_HAND, null, msgs);
			msgs = basicSetRightHand(newRightHand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment6_modelPackage.BINARY_DEPENDENCY__RIGHT_HAND, newRightHand, newRightHand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getLeftHand() {
		return leftHand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftHand(Dependency newLeftHand, NotificationChain msgs) {
		Dependency oldLeftHand = leftHand;
		leftHand = newLeftHand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Assignment6_modelPackage.BINARY_DEPENDENCY__LEFT_HAND, oldLeftHand, newLeftHand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftHand(Dependency newLeftHand) {
		if (newLeftHand != leftHand) {
			NotificationChain msgs = null;
			if (leftHand != null)
				msgs = ((InternalEObject)leftHand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Assignment6_modelPackage.BINARY_DEPENDENCY__LEFT_HAND, null, msgs);
			if (newLeftHand != null)
				msgs = ((InternalEObject)newLeftHand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Assignment6_modelPackage.BINARY_DEPENDENCY__LEFT_HAND, null, msgs);
			msgs = basicSetLeftHand(newLeftHand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment6_modelPackage.BINARY_DEPENDENCY__LEFT_HAND, newLeftHand, newLeftHand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryOperator getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(BinaryOperator newOperator) {
		BinaryOperator oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment6_modelPackage.BINARY_DEPENDENCY__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Assignment6_modelPackage.BINARY_DEPENDENCY__RIGHT_HAND:
				return basicSetRightHand(null, msgs);
			case Assignment6_modelPackage.BINARY_DEPENDENCY__LEFT_HAND:
				return basicSetLeftHand(null, msgs);
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
			case Assignment6_modelPackage.BINARY_DEPENDENCY__NOT:
				return isNot();
			case Assignment6_modelPackage.BINARY_DEPENDENCY__RIGHT_HAND:
				return getRightHand();
			case Assignment6_modelPackage.BINARY_DEPENDENCY__LEFT_HAND:
				return getLeftHand();
			case Assignment6_modelPackage.BINARY_DEPENDENCY__OPERATOR:
				return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Assignment6_modelPackage.BINARY_DEPENDENCY__NOT:
				setNot((Boolean)newValue);
				return;
			case Assignment6_modelPackage.BINARY_DEPENDENCY__RIGHT_HAND:
				setRightHand((Dependency)newValue);
				return;
			case Assignment6_modelPackage.BINARY_DEPENDENCY__LEFT_HAND:
				setLeftHand((Dependency)newValue);
				return;
			case Assignment6_modelPackage.BINARY_DEPENDENCY__OPERATOR:
				setOperator((BinaryOperator)newValue);
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
			case Assignment6_modelPackage.BINARY_DEPENDENCY__NOT:
				setNot(NOT_EDEFAULT);
				return;
			case Assignment6_modelPackage.BINARY_DEPENDENCY__RIGHT_HAND:
				setRightHand((Dependency)null);
				return;
			case Assignment6_modelPackage.BINARY_DEPENDENCY__LEFT_HAND:
				setLeftHand((Dependency)null);
				return;
			case Assignment6_modelPackage.BINARY_DEPENDENCY__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
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
			case Assignment6_modelPackage.BINARY_DEPENDENCY__NOT:
				return not != NOT_EDEFAULT;
			case Assignment6_modelPackage.BINARY_DEPENDENCY__RIGHT_HAND:
				return rightHand != null;
			case Assignment6_modelPackage.BINARY_DEPENDENCY__LEFT_HAND:
				return leftHand != null;
			case Assignment6_modelPackage.BINARY_DEPENDENCY__OPERATOR:
				return operator != OPERATOR_EDEFAULT;
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
		result.append(" (not: ");
		result.append(not);
		result.append(", operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //BinaryDependencyImpl
