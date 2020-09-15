/**
 */
package bag.model.bagEcore;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bag.model.bagEcore.AppEcorePackage
 * @generated
 */
public interface AppEcoreFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AppEcoreFactory eINSTANCE = bag.model.bagEcore.impl.AppEcoreFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>App</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App</em>'.
	 * @generated
	 */
	App createApp();

	/**
	 * Returns a new object of class '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensor</em>'.
	 * @generated
	 */
	Sensor createSensor();

	/**
	 * Returns a new object of class '<em>Mac Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mac Filter</em>'.
	 * @generated
	 */
	MacFilter createMacFilter();

	/**
	 * Returns a new object of class '<em>Mac Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mac Address</em>'.
	 * @generated
	 */
	MacAddress createMacAddress();

	/**
	 * Returns a new object of class '<em>Characteristic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Characteristic</em>'.
	 * @generated
	 */
	Characteristic createCharacteristic();

	/**
	 * Returns a new object of class '<em>Name Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Filter</em>'.
	 * @generated
	 */
	NameFilter createNameFilter();

	/**
	 * Returns a new object of class '<em>Name Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name Expression</em>'.
	 * @generated
	 */
	NameExpression createNameExpression();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Ui Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ui Element</em>'.
	 * @generated
	 */
	UiElement createUiElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AppEcorePackage getAppEcorePackage();

} //AppEcoreFactory
