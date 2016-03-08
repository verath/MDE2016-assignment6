/**
 */
package req_spec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import req_spec.BinaryExpression;
import req_spec.BinaryOperator;
import req_spec.Expression;
import req_spec.Req_specPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link req_spec.impl.BinaryExpressionImpl#getLeftHand <em>Left Hand</em>}</li>
 *   <li>{@link req_spec.impl.BinaryExpressionImpl#getRightHand <em>Right Hand</em>}</li>
 *   <li>{@link req_spec.impl.BinaryExpressionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BinaryExpressionImpl extends ExpressionImpl implements BinaryExpression {
	/**
	 * The cached value of the '{@link #getLeftHand() <em>Left Hand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftHand()
	 * @generated
	 * @ordered
	 */
	protected Expression leftHand;

	/**
	 * The cached value of the '{@link #getRightHand() <em>Right Hand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightHand()
	 * @generated
	 * @ordered
	 */
	protected Expression rightHand;

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
	protected BinaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Req_specPackage.Literals.BINARY_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeftHand() {
		return leftHand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftHand(Expression newLeftHand, NotificationChain msgs) {
		Expression oldLeftHand = leftHand;
		leftHand = newLeftHand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Req_specPackage.BINARY_EXPRESSION__LEFT_HAND, oldLeftHand, newLeftHand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftHand(Expression newLeftHand) {
		if (newLeftHand != leftHand) {
			NotificationChain msgs = null;
			if (leftHand != null)
				msgs = ((InternalEObject)leftHand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Req_specPackage.BINARY_EXPRESSION__LEFT_HAND, null, msgs);
			if (newLeftHand != null)
				msgs = ((InternalEObject)newLeftHand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Req_specPackage.BINARY_EXPRESSION__LEFT_HAND, null, msgs);
			msgs = basicSetLeftHand(newLeftHand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Req_specPackage.BINARY_EXPRESSION__LEFT_HAND, newLeftHand, newLeftHand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRightHand() {
		return rightHand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightHand(Expression newRightHand, NotificationChain msgs) {
		Expression oldRightHand = rightHand;
		rightHand = newRightHand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Req_specPackage.BINARY_EXPRESSION__RIGHT_HAND, oldRightHand, newRightHand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightHand(Expression newRightHand) {
		if (newRightHand != rightHand) {
			NotificationChain msgs = null;
			if (rightHand != null)
				msgs = ((InternalEObject)rightHand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Req_specPackage.BINARY_EXPRESSION__RIGHT_HAND, null, msgs);
			if (newRightHand != null)
				msgs = ((InternalEObject)newRightHand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Req_specPackage.BINARY_EXPRESSION__RIGHT_HAND, null, msgs);
			msgs = basicSetRightHand(newRightHand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Req_specPackage.BINARY_EXPRESSION__RIGHT_HAND, newRightHand, newRightHand));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Req_specPackage.BINARY_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Req_specPackage.BINARY_EXPRESSION__LEFT_HAND:
				return basicSetLeftHand(null, msgs);
			case Req_specPackage.BINARY_EXPRESSION__RIGHT_HAND:
				return basicSetRightHand(null, msgs);
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
			case Req_specPackage.BINARY_EXPRESSION__LEFT_HAND:
				return getLeftHand();
			case Req_specPackage.BINARY_EXPRESSION__RIGHT_HAND:
				return getRightHand();
			case Req_specPackage.BINARY_EXPRESSION__OPERATOR:
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
			case Req_specPackage.BINARY_EXPRESSION__LEFT_HAND:
				setLeftHand((Expression)newValue);
				return;
			case Req_specPackage.BINARY_EXPRESSION__RIGHT_HAND:
				setRightHand((Expression)newValue);
				return;
			case Req_specPackage.BINARY_EXPRESSION__OPERATOR:
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
			case Req_specPackage.BINARY_EXPRESSION__LEFT_HAND:
				setLeftHand((Expression)null);
				return;
			case Req_specPackage.BINARY_EXPRESSION__RIGHT_HAND:
				setRightHand((Expression)null);
				return;
			case Req_specPackage.BINARY_EXPRESSION__OPERATOR:
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
			case Req_specPackage.BINARY_EXPRESSION__LEFT_HAND:
				return leftHand != null;
			case Req_specPackage.BINARY_EXPRESSION__RIGHT_HAND:
				return rightHand != null;
			case Req_specPackage.BINARY_EXPRESSION__OPERATOR:
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //BinaryExpressionImpl
