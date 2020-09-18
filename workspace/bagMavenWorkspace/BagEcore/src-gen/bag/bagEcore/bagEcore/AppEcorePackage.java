/**
 */
package bag.bagEcore.bagEcore;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bag.bagEcore.bagEcore.AppEcoreFactory
 * @model kind="package"
 * @generated
 */
public interface AppEcorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "appEcore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/appEcore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "appEcore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppEcorePackage eINSTANCE = bag.bagEcore.bagEcore.impl.AppEcorePackageImpl.init();

	/**
	 * The meta object id for the '{@link bag.bagEcore.bagEcore.impl.AppImpl <em>App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bag.bagEcore.bagEcore.impl.AppImpl
	 * @see bag.bagEcore.bagEcore.impl.AppEcorePackageImpl#getApp()
	 * @generated
	 */
	int APP = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__FILTER = 1;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__SENSOR = 2;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bag.bagEcore.bagEcore.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bag.bagEcore.bagEcore.impl.SensorImpl
	 * @see bag.bagEcore.bagEcore.impl.AppEcorePackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mac Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MAC_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Characteristic</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CHARACTERISTIC = 2;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bag.bagEcore.bagEcore.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bag.bagEcore.bagEcore.impl.FilterImpl
	 * @see bag.bagEcore.bagEcore.impl.AppEcorePackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 2;

	/**
	 * The feature id for the '<em><b>Macaddress</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__MACADDRESS = 0;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bag.bagEcore.bagEcore.impl.MacAddressImpl <em>Mac Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bag.bagEcore.bagEcore.impl.MacAddressImpl
	 * @see bag.bagEcore.bagEcore.impl.AppEcorePackageImpl#getMacAddress()
	 * @generated
	 */
	int MAC_ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_ADDRESS__ADDRESS = 0;

	/**
	 * The number of structural features of the '<em>Mac Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_ADDRESS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mac Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bag.bagEcore.bagEcore.impl.CharacteristicImpl <em>Characteristic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bag.bagEcore.bagEcore.impl.CharacteristicImpl
	 * @see bag.bagEcore.bagEcore.impl.AppEcorePackageImpl#getCharacteristic()
	 * @generated
	 */
	int CHARACTERISTIC = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__UUID = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__VALUE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__UNIT = 4;

	/**
	 * The feature id for the '<em><b>Ui Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC__UI_ELEMENT = 5;

	/**
	 * The number of structural features of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Characteristic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTERISTIC_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link bag.bagEcore.bagEcore.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App</em>'.
	 * @see bag.bagEcore.bagEcore.App
	 * @generated
	 */
	EClass getApp();

	/**
	 * Returns the meta object for the attribute '{@link bag.bagEcore.bagEcore.App#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bag.bagEcore.bagEcore.App#getName()
	 * @see #getApp()
	 * @generated
	 */
	EAttribute getApp_Name();

	/**
	 * Returns the meta object for the reference '{@link bag.bagEcore.bagEcore.App#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter</em>'.
	 * @see bag.bagEcore.bagEcore.App#getFilter()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Filter();

	/**
	 * Returns the meta object for the reference '{@link bag.bagEcore.bagEcore.App#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see bag.bagEcore.bagEcore.App#getSensor()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Sensor();

	/**
	 * Returns the meta object for class '{@link bag.bagEcore.bagEcore.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see bag.bagEcore.bagEcore.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link bag.bagEcore.bagEcore.Sensor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bag.bagEcore.bagEcore.Sensor#getName()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Name();

	/**
	 * Returns the meta object for the attribute '{@link bag.bagEcore.bagEcore.Sensor#getMacAddress <em>Mac Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac Address</em>'.
	 * @see bag.bagEcore.bagEcore.Sensor#getMacAddress()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_MacAddress();

	/**
	 * Returns the meta object for the reference list '{@link bag.bagEcore.bagEcore.Sensor#getCharacteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Characteristic</em>'.
	 * @see bag.bagEcore.bagEcore.Sensor#getCharacteristic()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Characteristic();

	/**
	 * Returns the meta object for class '{@link bag.bagEcore.bagEcore.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see bag.bagEcore.bagEcore.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the reference list '{@link bag.bagEcore.bagEcore.Filter#getMacaddress <em>Macaddress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Macaddress</em>'.
	 * @see bag.bagEcore.bagEcore.Filter#getMacaddress()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_Macaddress();

	/**
	 * Returns the meta object for class '{@link bag.bagEcore.bagEcore.MacAddress <em>Mac Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mac Address</em>'.
	 * @see bag.bagEcore.bagEcore.MacAddress
	 * @generated
	 */
	EClass getMacAddress();

	/**
	 * Returns the meta object for the attribute '{@link bag.bagEcore.bagEcore.MacAddress#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see bag.bagEcore.bagEcore.MacAddress#getAddress()
	 * @see #getMacAddress()
	 * @generated
	 */
	EAttribute getMacAddress_Address();

	/**
	 * Returns the meta object for class '{@link bag.bagEcore.bagEcore.Characteristic <em>Characteristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Characteristic</em>'.
	 * @see bag.bagEcore.bagEcore.Characteristic
	 * @generated
	 */
	EClass getCharacteristic();

	/**
	 * Returns the meta object for the attribute '{@link bag.bagEcore.bagEcore.Characteristic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bag.bagEcore.bagEcore.Characteristic#getName()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Name();

	/**
	 * Returns the meta object for the attribute '{@link bag.bagEcore.bagEcore.Characteristic#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see bag.bagEcore.bagEcore.Characteristic#getUuid()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Uuid();

	/**
	 * Returns the meta object for the attribute '{@link bag.bagEcore.bagEcore.Characteristic#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bag.bagEcore.bagEcore.Characteristic#getType()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Type();

	/**
	 * Returns the meta object for the attribute '{@link bag.bagEcore.bagEcore.Characteristic#getValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Type</em>'.
	 * @see bag.bagEcore.bagEcore.Characteristic#getValueType()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_ValueType();

	/**
	 * Returns the meta object for the attribute '{@link bag.bagEcore.bagEcore.Characteristic#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see bag.bagEcore.bagEcore.Characteristic#getUnit()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_Unit();

	/**
	 * Returns the meta object for the attribute '{@link bag.bagEcore.bagEcore.Characteristic#getUiElement <em>Ui Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ui Element</em>'.
	 * @see bag.bagEcore.bagEcore.Characteristic#getUiElement()
	 * @see #getCharacteristic()
	 * @generated
	 */
	EAttribute getCharacteristic_UiElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AppEcoreFactory getAppEcoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bag.bagEcore.bagEcore.impl.AppImpl <em>App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bag.bagEcore.bagEcore.impl.AppImpl
		 * @see bag.bagEcore.bagEcore.impl.AppEcorePackageImpl#getApp()
		 * @generated
		 */
		EClass APP = eINSTANCE.getApp();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP__NAME = eINSTANCE.getApp_Name();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__FILTER = eINSTANCE.getApp_Filter();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__SENSOR = eINSTANCE.getApp_Sensor();

		/**
		 * The meta object literal for the '{@link bag.bagEcore.bagEcore.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bag.bagEcore.bagEcore.impl.SensorImpl
		 * @see bag.bagEcore.bagEcore.impl.AppEcorePackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__NAME = eINSTANCE.getSensor_Name();

		/**
		 * The meta object literal for the '<em><b>Mac Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__MAC_ADDRESS = eINSTANCE.getSensor_MacAddress();

		/**
		 * The meta object literal for the '<em><b>Characteristic</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__CHARACTERISTIC = eINSTANCE.getSensor_Characteristic();

		/**
		 * The meta object literal for the '{@link bag.bagEcore.bagEcore.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bag.bagEcore.bagEcore.impl.FilterImpl
		 * @see bag.bagEcore.bagEcore.impl.AppEcorePackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Macaddress</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__MACADDRESS = eINSTANCE.getFilter_Macaddress();

		/**
		 * The meta object literal for the '{@link bag.bagEcore.bagEcore.impl.MacAddressImpl <em>Mac Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bag.bagEcore.bagEcore.impl.MacAddressImpl
		 * @see bag.bagEcore.bagEcore.impl.AppEcorePackageImpl#getMacAddress()
		 * @generated
		 */
		EClass MAC_ADDRESS = eINSTANCE.getMacAddress();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_ADDRESS__ADDRESS = eINSTANCE.getMacAddress_Address();

		/**
		 * The meta object literal for the '{@link bag.bagEcore.bagEcore.impl.CharacteristicImpl <em>Characteristic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bag.bagEcore.bagEcore.impl.CharacteristicImpl
		 * @see bag.bagEcore.bagEcore.impl.AppEcorePackageImpl#getCharacteristic()
		 * @generated
		 */
		EClass CHARACTERISTIC = eINSTANCE.getCharacteristic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__NAME = eINSTANCE.getCharacteristic_Name();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__UUID = eINSTANCE.getCharacteristic_Uuid();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__TYPE = eINSTANCE.getCharacteristic_Type();

		/**
		 * The meta object literal for the '<em><b>Value Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__VALUE_TYPE = eINSTANCE.getCharacteristic_ValueType();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__UNIT = eINSTANCE.getCharacteristic_Unit();

		/**
		 * The meta object literal for the '<em><b>Ui Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTERISTIC__UI_ELEMENT = eINSTANCE.getCharacteristic_UiElement();

	}

} //AppEcorePackage
