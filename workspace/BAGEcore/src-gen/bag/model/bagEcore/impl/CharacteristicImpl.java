/**
 */
package bag.model.bagEcore.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import bag.model.bagEcore.BAGEcorePackage;
import bag.model.bagEcore.Characteristic;
import bag.model.bagEcore.DataType;
import bag.model.bagEcore.UiElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Characteristic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bag.model.bagEcore.impl.CharacteristicImpl#getName <em>Name</em>}</li>
 *   <li>{@link bag.model.bagEcore.impl.CharacteristicImpl#getUuid <em>Uuid</em>}</li>
 *   <li>{@link bag.model.bagEcore.impl.CharacteristicImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link bag.model.bagEcore.impl.CharacteristicImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link bag.model.bagEcore.impl.CharacteristicImpl#isRead <em>Read</em>}</li>
 *   <li>{@link bag.model.bagEcore.impl.CharacteristicImpl#isWrite <em>Write</em>}</li>
 *   <li>{@link bag.model.bagEcore.impl.CharacteristicImpl#isNotification <em>Notification</em>}</li>
 *   <li>{@link bag.model.bagEcore.impl.CharacteristicImpl#getUielement <em>Uielement</em>}</li>
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
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final DataType DATA_TYPE_EDEFAULT = DataType.FLOAT;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataType dataType = DATA_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #isRead() <em>Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRead() <em>Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRead()
	 * @generated
	 * @ordered
	 */
	protected boolean read = READ_EDEFAULT;

	/**
	 * The default value of the '{@link #isWrite() <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWrite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWrite() <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWrite()
	 * @generated
	 * @ordered
	 */
	protected boolean write = WRITE_EDEFAULT;

	/**
	 * The default value of the '{@link #isNotification() <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotification()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NOTIFICATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNotification() <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNotification()
	 * @generated
	 * @ordered
	 */
	protected boolean notification = NOTIFICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUielement() <em>Uielement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUielement()
	 * @generated
	 * @ordered
	 */
	protected UiElement uielement;

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
		return BAGEcorePackage.Literals.CHARACTERISTIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BAGEcorePackage.CHARACTERISTIC__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BAGEcorePackage.CHARACTERISTIC__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDataType(DataType newDataType) {
		DataType oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BAGEcorePackage.CHARACTERISTIC__DATA_TYPE,
					oldDataType, dataType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BAGEcorePackage.CHARACTERISTIC__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UiElement getUielement() {
		return uielement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUielement(UiElement newUielement, NotificationChain msgs) {
		UiElement oldUielement = uielement;
		uielement = newUielement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BAGEcorePackage.CHARACTERISTIC__UIELEMENT, oldUielement, newUielement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUielement(UiElement newUielement) {
		if (newUielement != uielement) {
			NotificationChain msgs = null;
			if (uielement != null)
				msgs = ((InternalEObject) uielement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BAGEcorePackage.CHARACTERISTIC__UIELEMENT, null, msgs);
			if (newUielement != null)
				msgs = ((InternalEObject) newUielement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BAGEcorePackage.CHARACTERISTIC__UIELEMENT, null, msgs);
			msgs = basicSetUielement(newUielement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BAGEcorePackage.CHARACTERISTIC__UIELEMENT,
					newUielement, newUielement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRead() {
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRead(boolean newRead) {
		boolean oldRead = read;
		read = newRead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BAGEcorePackage.CHARACTERISTIC__READ, oldRead, read));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isWrite() {
		return write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWrite(boolean newWrite) {
		boolean oldWrite = write;
		write = newWrite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BAGEcorePackage.CHARACTERISTIC__WRITE, oldWrite,
					write));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNotification() {
		return notification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotification(boolean newNotification) {
		boolean oldNotification = notification;
		notification = newNotification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BAGEcorePackage.CHARACTERISTIC__NOTIFICATION,
					oldNotification, notification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BAGEcorePackage.CHARACTERISTIC__UIELEMENT:
			return basicSetUielement(null, msgs);
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
		case BAGEcorePackage.CHARACTERISTIC__NAME:
			return getName();
		case BAGEcorePackage.CHARACTERISTIC__UUID:
			return getUuid();
		case BAGEcorePackage.CHARACTERISTIC__DATA_TYPE:
			return getDataType();
		case BAGEcorePackage.CHARACTERISTIC__UNIT:
			return getUnit();
		case BAGEcorePackage.CHARACTERISTIC__READ:
			return isRead();
		case BAGEcorePackage.CHARACTERISTIC__WRITE:
			return isWrite();
		case BAGEcorePackage.CHARACTERISTIC__NOTIFICATION:
			return isNotification();
		case BAGEcorePackage.CHARACTERISTIC__UIELEMENT:
			return getUielement();
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
		case BAGEcorePackage.CHARACTERISTIC__NAME:
			setName((String) newValue);
			return;
		case BAGEcorePackage.CHARACTERISTIC__UUID:
			setUuid((String) newValue);
			return;
		case BAGEcorePackage.CHARACTERISTIC__DATA_TYPE:
			setDataType((DataType) newValue);
			return;
		case BAGEcorePackage.CHARACTERISTIC__UNIT:
			setUnit((String) newValue);
			return;
		case BAGEcorePackage.CHARACTERISTIC__READ:
			setRead((Boolean) newValue);
			return;
		case BAGEcorePackage.CHARACTERISTIC__WRITE:
			setWrite((Boolean) newValue);
			return;
		case BAGEcorePackage.CHARACTERISTIC__NOTIFICATION:
			setNotification((Boolean) newValue);
			return;
		case BAGEcorePackage.CHARACTERISTIC__UIELEMENT:
			setUielement((UiElement) newValue);
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
		case BAGEcorePackage.CHARACTERISTIC__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BAGEcorePackage.CHARACTERISTIC__UUID:
			setUuid(UUID_EDEFAULT);
			return;
		case BAGEcorePackage.CHARACTERISTIC__DATA_TYPE:
			setDataType(DATA_TYPE_EDEFAULT);
			return;
		case BAGEcorePackage.CHARACTERISTIC__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case BAGEcorePackage.CHARACTERISTIC__READ:
			setRead(READ_EDEFAULT);
			return;
		case BAGEcorePackage.CHARACTERISTIC__WRITE:
			setWrite(WRITE_EDEFAULT);
			return;
		case BAGEcorePackage.CHARACTERISTIC__NOTIFICATION:
			setNotification(NOTIFICATION_EDEFAULT);
			return;
		case BAGEcorePackage.CHARACTERISTIC__UIELEMENT:
			setUielement((UiElement) null);
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
		case BAGEcorePackage.CHARACTERISTIC__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BAGEcorePackage.CHARACTERISTIC__UUID:
			return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
		case BAGEcorePackage.CHARACTERISTIC__DATA_TYPE:
			return dataType != DATA_TYPE_EDEFAULT;
		case BAGEcorePackage.CHARACTERISTIC__UNIT:
			return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
		case BAGEcorePackage.CHARACTERISTIC__READ:
			return read != READ_EDEFAULT;
		case BAGEcorePackage.CHARACTERISTIC__WRITE:
			return write != WRITE_EDEFAULT;
		case BAGEcorePackage.CHARACTERISTIC__NOTIFICATION:
			return notification != NOTIFICATION_EDEFAULT;
		case BAGEcorePackage.CHARACTERISTIC__UIELEMENT:
			return uielement != null;
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
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", unit: ");
		result.append(unit);
		result.append(", read: ");
		result.append(read);
		result.append(", write: ");
		result.append(write);
		result.append(", notification: ");
		result.append(notification);
		result.append(')');
		return result.toString();
	}

} //CharacteristicImpl
