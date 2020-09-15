/**
 */
package bag.bagEcore.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import bag.bagEcore.AppEcorePackage;
import bag.bagEcore.Characteristic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bag.bagEcore.impl.CharacteristicImpl#getName <em>Name</em>}</li>
 *   <li>{@link bag.bagEcore.impl.CharacteristicImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link bag.bagEcore.impl.CharacteristicImpl#getType <em>Type</em>}</li>
 *   <li>{@link bag.bagEcore.impl.CharacteristicImpl#getValueType <em>Value Type</em>}</li>
 *   <li>{@link bag.bagEcore.impl.CharacteristicImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link bag.bagEcore.impl.CharacteristicImpl#getUiElement <em>Ui Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharacteristicImpl extends MinimalEObjectImpl.Container implements Characteristic {
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
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueType() <em>Value Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueType()
	 * @generated
	 * @ordered
	 */
	protected String valueType = VALUE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUiElement() <em>Ui Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiElement()
	 * @generated
	 * @ordered
	 */
	protected static final String UI_ELEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUiElement() <em>Ui Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiElement()
	 * @generated
	 * @ordered
	 */
	protected String uiElement = UI_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacteristicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AppEcorePackage.Literals.CHARACTERISTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppEcorePackage.CHARACTERISTIC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppEcorePackage.CHARACTERISTIC__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppEcorePackage.CHARACTERISTIC__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValueType() {
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueType(String newValueType) {
		String oldValueType = valueType;
		valueType = newValueType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppEcorePackage.CHARACTERISTIC__VALUE_TYPE,
					oldValueType, valueType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppEcorePackage.CHARACTERISTIC__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUiElement() {
		return uiElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUiElement(String newUiElement) {
		String oldUiElement = uiElement;
		uiElement = newUiElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AppEcorePackage.CHARACTERISTIC__UI_ELEMENT,
					oldUiElement, uiElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AppEcorePackage.CHARACTERISTIC__NAME:
			return getName();
		case AppEcorePackage.CHARACTERISTIC__UUID:
			return getUuid();
		case AppEcorePackage.CHARACTERISTIC__TYPE:
			return getType();
		case AppEcorePackage.CHARACTERISTIC__VALUE_TYPE:
			return getValueType();
		case AppEcorePackage.CHARACTERISTIC__UNIT:
			return getUnit();
		case AppEcorePackage.CHARACTERISTIC__UI_ELEMENT:
			return getUiElement();
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
		case AppEcorePackage.CHARACTERISTIC__NAME:
			setName((String) newValue);
			return;
		case AppEcorePackage.CHARACTERISTIC__UUID:
			setUuid((String) newValue);
			return;
		case AppEcorePackage.CHARACTERISTIC__TYPE:
			setType((String) newValue);
			return;
		case AppEcorePackage.CHARACTERISTIC__VALUE_TYPE:
			setValueType((String) newValue);
			return;
		case AppEcorePackage.CHARACTERISTIC__UNIT:
			setUnit((String) newValue);
			return;
		case AppEcorePackage.CHARACTERISTIC__UI_ELEMENT:
			setUiElement((String) newValue);
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
		case AppEcorePackage.CHARACTERISTIC__NAME:
			setName(NAME_EDEFAULT);
			return;
		case AppEcorePackage.CHARACTERISTIC__UUID:
			setUuid(UUID_EDEFAULT);
			return;
		case AppEcorePackage.CHARACTERISTIC__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case AppEcorePackage.CHARACTERISTIC__VALUE_TYPE:
			setValueType(VALUE_TYPE_EDEFAULT);
			return;
		case AppEcorePackage.CHARACTERISTIC__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case AppEcorePackage.CHARACTERISTIC__UI_ELEMENT:
			setUiElement(UI_ELEMENT_EDEFAULT);
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
		case AppEcorePackage.CHARACTERISTIC__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case AppEcorePackage.CHARACTERISTIC__UUID:
			return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
		case AppEcorePackage.CHARACTERISTIC__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case AppEcorePackage.CHARACTERISTIC__VALUE_TYPE:
			return VALUE_TYPE_EDEFAULT == null ? valueType != null : !VALUE_TYPE_EDEFAULT.equals(valueType);
		case AppEcorePackage.CHARACTERISTIC__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		case AppEcorePackage.CHARACTERISTIC__UI_ELEMENT:
			return UI_ELEMENT_EDEFAULT == null ? uiElement != null : !UI_ELEMENT_EDEFAULT.equals(uiElement);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(", type: ");
		result.append(type);
		result.append(", valueType: ");
		result.append(valueType);
		result.append(", unit: ");
		result.append(unit);
		result.append(", uiElement: ");
		result.append(uiElement);
		result.append(')');
		return result.toString();
	}

} //CharacteristicImpl
