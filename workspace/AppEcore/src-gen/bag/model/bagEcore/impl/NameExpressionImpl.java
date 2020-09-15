/**
 */
package bag.model.bagEcore.impl;

import bag.model.bagEcore.BAGEcorePackage;
import bag.model.bagEcore.NameExpression;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bag.model.bagEcore.impl.NameExpressionImpl#getRegEx <em>Reg Ex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NameExpressionImpl extends MinimalEObjectImpl.Container implements NameExpression {
	/**
	 * The default value of the '{@link #getRegEx() <em>Reg Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegEx()
	 * @generated
	 * @ordered
	 */
	protected static final String REG_EX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegEx() <em>Reg Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegEx()
	 * @generated
	 * @ordered
	 */
	protected String regEx = REG_EX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BAGEcorePackage.Literals.NAME_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRegEx() {
		return regEx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegEx(String newRegEx) {
		String oldRegEx = regEx;
		regEx = newRegEx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BAGEcorePackage.NAME_EXPRESSION__REG_EX, oldRegEx,
					regEx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BAGEcorePackage.NAME_EXPRESSION__REG_EX:
			return getRegEx();
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
		case BAGEcorePackage.NAME_EXPRESSION__REG_EX:
			setRegEx((String) newValue);
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
		case BAGEcorePackage.NAME_EXPRESSION__REG_EX:
			setRegEx(REG_EX_EDEFAULT);
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
		case BAGEcorePackage.NAME_EXPRESSION__REG_EX:
			return REG_EX_EDEFAULT == null ? regEx != null : !REG_EX_EDEFAULT.equals(regEx);
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (regEx: ");
		result.append(regEx);
		result.append(')');
		return result.toString();
	}

} //NameExpressionImpl
