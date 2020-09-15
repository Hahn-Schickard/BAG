/**
 */
package bag.model.bagEcore.impl;

import bag.model.bagEcore.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BAGEcoreFactoryImpl extends EFactoryImpl implements BAGEcoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BAGEcoreFactory init() {
		try {
			BAGEcoreFactory theBAGEcoreFactory = (BAGEcoreFactory) EPackage.Registry.INSTANCE
					.getEFactory(BAGEcorePackage.eNS_URI);
			if (theBAGEcoreFactory != null) {
				return theBAGEcoreFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BAGEcoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BAGEcoreFactoryImpl() {
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
		case BAGEcorePackage.APP:
			return createApp();
		case BAGEcorePackage.SENSOR:
			return createSensor();
		case BAGEcorePackage.MAC_FILTER:
			return createMacFilter();
		case BAGEcorePackage.MAC_ADDRESS:
			return createMacAddress();
		case BAGEcorePackage.CHARACTERISTIC:
			return createCharacteristic();
		case BAGEcorePackage.NAME_FILTER:
			return createNameFilter();
		case BAGEcorePackage.NAME_EXPRESSION:
			return createNameExpression();
		case BAGEcorePackage.SERVICE:
			return createService();
		case BAGEcorePackage.UI_ELEMENT:
			return createUiElement();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case BAGEcorePackage.DATA_TYPE:
			return createDataTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case BAGEcorePackage.DATA_TYPE:
			return convertDataTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public MacFilter createMacFilter() {
		MacFilterImpl macFilter = new MacFilterImpl();
		return macFilter;
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
	public NameFilter createNameFilter() {
		NameFilterImpl nameFilter = new NameFilterImpl();
		return nameFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NameExpression createNameExpression() {
		NameExpressionImpl nameExpression = new NameExpressionImpl();
		return nameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UiElement createUiElement() {
		UiElementImpl uiElement = new UiElementImpl();
		return uiElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BAGEcorePackage getBAGEcorePackage() {
		return (BAGEcorePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BAGEcorePackage getPackage() {
		return BAGEcorePackage.eINSTANCE;
	}

} //BAGEcoreFactoryImpl
