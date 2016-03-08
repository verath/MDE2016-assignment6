/**
 */
package assignment6_model.impl;

import assignment6_model.Assignment6_modelPackage;
import assignment6_model.IntegerFeature;
import assignment6_model.IntegerValueDependency;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Value Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment6_model.impl.IntegerValueDependencyImpl#isNot <em>Not</em>}</li>
 *   <li>{@link assignment6_model.impl.IntegerValueDependencyImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link assignment6_model.impl.IntegerValueDependencyImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerValueDependencyImpl extends MinimalEObjectImpl.Container implements IntegerValueDependency {
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
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected IntegerFeature target;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerValueDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment6_modelPackage.Literals.INTEGER_VALUE_DEPENDENCY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment6_modelPackage.INTEGER_VALUE_DEPENDENCY__NOT, oldNot, not));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerFeature getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (IntegerFeature)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Assignment6_modelPackage.INTEGER_VALUE_DEPENDENCY__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerFeature basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(IntegerFeature newTarget) {
		IntegerFeature oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment6_modelPackage.INTEGER_VALUE_DEPENDENCY__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment6_modelPackage.INTEGER_VALUE_DEPENDENCY__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Assignment6_modelPackage.INTEGER_VALUE_DEPENDENCY__NOT:
				return isNot();
			case Assignment6_modelPackage.INTEGER_VALUE_DEPENDENCY__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case Assignment6_modelPackage.INTEGER_VALUE_DEPENDENCY__VALUE:
				return getValue();
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
			case Assignment6_modelPackage.INTEGER_VALUE_DEPENDENCY__NOT:
				setNot((Boolean)newValue);
				return;
			case Assignment6_modelPackage.INTEGER_VALUE_DEPENDENCY__TARGET:
				setTarget((IntegerFeature)newValue);
				return;
			case Assignment6_modelPackage.INTEGER_VALUE_DEPENDENCY__VALUE:
				setValue((Integer)newValue);
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
			case Assignment6_modelPackage.INTEGER_VALUE_DEPENDENCY__NOT:
				setNot(NOT_EDEFAULT);
				return;
			case Assignment6_modelPackage.INTEGER_VALUE_DEPENDENCY__TARGET:
				setTarget((IntegerFeature)null);
				return;
			case Assignment6_modelPackage.INTEGER_VALUE_DEPENDENCY__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case Assignment6_modelPackage.INTEGER_VALUE_DEPENDENCY__NOT:
				return not != NOT_EDEFAULT;
			case Assignment6_modelPackage.INTEGER_VALUE_DEPENDENCY__TARGET:
				return target != null;
			case Assignment6_modelPackage.INTEGER_VALUE_DEPENDENCY__VALUE:
				return value != VALUE_EDEFAULT;
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
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //IntegerValueDependencyImpl
