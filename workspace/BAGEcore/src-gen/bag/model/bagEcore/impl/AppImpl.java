/**
 */
package bag.model.bagEcore.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import bag.model.bagEcore.App;
import bag.model.bagEcore.BAGEcorePackage;
import bag.model.bagEcore.MacFilter;
import bag.model.bagEcore.NameFilter;
import bag.model.bagEcore.Sensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bag.model.bagEcore.impl.AppImpl#getName <em>Name</em>}</li>
 *   <li>{@link bag.model.bagEcore.impl.AppImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link bag.model.bagEcore.impl.AppImpl#getMacfilter <em>Macfilter</em>}</li>
 *   <li>{@link bag.model.bagEcore.impl.AppImpl#getNamefilter <em>Namefilter</em>}</li>
 *   <li>{@link bag.model.bagEcore.impl.AppImpl#getPackageName <em>Package Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AppImpl extends MinimalEObjectImpl.Container implements App {
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
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected Sensor sensor;

	/**
	 * The cached value of the '{@link #getMacfilter() <em>Macfilter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacfilter()
	 * @generated
	 * @ordered
	 */
	protected MacFilter macfilter;

	/**
	 * The cached value of the '{@link #getNamefilter() <em>Namefilter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamefilter()
	 * @generated
	 * @ordered
	 */
	protected NameFilter namefilter;

	/**
	 * The default value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageName()
	 * @generated
	 * @ordered
	 */
	protected String packageName = PACKAGE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BAGEcorePackage.Literals.APP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BAGEcorePackage.APP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor getSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSensor(Sensor newSensor, NotificationChain msgs) {
		Sensor oldSensor = sensor;
		sensor = newSensor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BAGEcorePackage.APP__SENSOR,
					oldSensor, newSensor);
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
	public void setSensor(Sensor newSensor) {
		if (newSensor != sensor) {
			NotificationChain msgs = null;
			if (sensor != null)
				msgs = ((InternalEObject) sensor).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BAGEcorePackage.APP__SENSOR, null, msgs);
			if (newSensor != null)
				msgs = ((InternalEObject) newSensor).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BAGEcorePackage.APP__SENSOR, null, msgs);
			msgs = basicSetSensor(newSensor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BAGEcorePackage.APP__SENSOR, newSensor, newSensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MacFilter getMacfilter() {
		return macfilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMacfilter(MacFilter newMacfilter, NotificationChain msgs) {
		MacFilter oldMacfilter = macfilter;
		macfilter = newMacfilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BAGEcorePackage.APP__MACFILTER, oldMacfilter, newMacfilter);
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
	public void setMacfilter(MacFilter newMacfilter) {
		if (newMacfilter != macfilter) {
			NotificationChain msgs = null;
			if (macfilter != null)
				msgs = ((InternalEObject) macfilter).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BAGEcorePackage.APP__MACFILTER, null, msgs);
			if (newMacfilter != null)
				msgs = ((InternalEObject) newMacfilter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BAGEcorePackage.APP__MACFILTER, null, msgs);
			msgs = basicSetMacfilter(newMacfilter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BAGEcorePackage.APP__MACFILTER, newMacfilter,
					newMacfilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BAGEcorePackage.APP__SENSOR:
			return basicSetSensor(null, msgs);
		case BAGEcorePackage.APP__MACFILTER:
			return basicSetMacfilter(null, msgs);
		case BAGEcorePackage.APP__NAMEFILTER:
			return basicSetNamefilter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameFilter getNamefilter() {
		return namefilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamefilter(NameFilter newNamefilter, NotificationChain msgs) {
		NameFilter oldNamefilter = namefilter;
		namefilter = newNamefilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BAGEcorePackage.APP__NAMEFILTER, oldNamefilter, newNamefilter);
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
	public void setNamefilter(NameFilter newNamefilter) {
		if (newNamefilter != namefilter) {
			NotificationChain msgs = null;
			if (namefilter != null)
				msgs = ((InternalEObject) namefilter).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BAGEcorePackage.APP__NAMEFILTER, null, msgs);
			if (newNamefilter != null)
				msgs = ((InternalEObject) newNamefilter).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BAGEcorePackage.APP__NAMEFILTER, null, msgs);
			msgs = basicSetNamefilter(newNamefilter, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BAGEcorePackage.APP__NAMEFILTER, newNamefilter,
					newNamefilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPackageName() {
		return packageName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackageName(String newPackageName) {
		String oldPackageName = packageName;
		packageName = newPackageName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BAGEcorePackage.APP__PACKAGE_NAME, oldPackageName,
					packageName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BAGEcorePackage.APP__NAME:
			return getName();
		case BAGEcorePackage.APP__SENSOR:
			return getSensor();
		case BAGEcorePackage.APP__MACFILTER:
			return getMacfilter();
		case BAGEcorePackage.APP__NAMEFILTER:
			return getNamefilter();
		case BAGEcorePackage.APP__PACKAGE_NAME:
			return getPackageName();
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
		case BAGEcorePackage.APP__NAME:
			setName((String) newValue);
			return;
		case BAGEcorePackage.APP__SENSOR:
			setSensor((Sensor) newValue);
			return;
		case BAGEcorePackage.APP__MACFILTER:
			setMacfilter((MacFilter) newValue);
			return;
		case BAGEcorePackage.APP__NAMEFILTER:
			setNamefilter((NameFilter) newValue);
			return;
		case BAGEcorePackage.APP__PACKAGE_NAME:
			setPackageName((String) newValue);
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
		case BAGEcorePackage.APP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BAGEcorePackage.APP__SENSOR:
			setSensor((Sensor) null);
			return;
		case BAGEcorePackage.APP__MACFILTER:
			setMacfilter((MacFilter) null);
			return;
		case BAGEcorePackage.APP__NAMEFILTER:
			setNamefilter((NameFilter) null);
			return;
		case BAGEcorePackage.APP__PACKAGE_NAME:
			setPackageName(PACKAGE_NAME_EDEFAULT);
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
		case BAGEcorePackage.APP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BAGEcorePackage.APP__SENSOR:
			return sensor != null;
		case BAGEcorePackage.APP__MACFILTER:
			return macfilter != null;
		case BAGEcorePackage.APP__NAMEFILTER:
			return namefilter != null;
		case BAGEcorePackage.APP__PACKAGE_NAME:
			return PACKAGE_NAME_EDEFAULT == null ? packageName != null : !PACKAGE_NAME_EDEFAULT.equals(packageName);
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
		result.append(", packageName: ");
		result.append(packageName);
		result.append(')');
		return result.toString();
	}

} //AppImpl
