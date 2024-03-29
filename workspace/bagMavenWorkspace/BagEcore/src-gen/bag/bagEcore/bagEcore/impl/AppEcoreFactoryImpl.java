/**
 */
package bag.bagEcore.bagEcore.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import bag.bagEcore.bagEcore.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppEcoreFactoryImpl extends EFactoryImpl implements AppEcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AppEcoreFactory init() {
		try {
			AppEcoreFactory theAppEcoreFactory = (AppEcoreFactory) EPackage.Registry.INSTANCE
					.getEFactory(AppEcorePackage.eNS_URI);
			if (theAppEcoreFactory != null) {
				return theAppEcoreFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AppEcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppEcoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case AppEcorePackage.APP:
			return createApp();
		case AppEcorePackage.SENSOR:
			return createSensor();
		case AppEcorePackage.FILTER:
			return createFilter();
		case AppEcorePackage.MAC_ADDRESS:
			return createMacAddress();
		case AppEcorePackage.CHARACTERISTIC:
			return createCharacteristic();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public App createApp() {
		AppImpl app = new AppImpl();
		return app;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MacAddress createMacAddress() {
		MacAddressImpl macAddress = new MacAddressImpl();
		return macAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Characteristic createCharacteristic() {
		CharacteristicImpl characteristic = new CharacteristicImpl();
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AppEcorePackage getAppEcorePackage() {
		return (AppEcorePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AppEcorePackage getPackage() {
		return AppEcorePackage.eINSTANCE;
	}

} //AppEcoreFactoryImpl
