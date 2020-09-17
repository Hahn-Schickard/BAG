/**
 */
package bag.bagEcore.bagEcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bag.bagEcore.bagEcore.Sensor#getName <em>Name</em>}</li>
 *   <li>{@link bag.bagEcore.bagEcore.Sensor#getMacAddress <em>Mac Address</em>}</li>
 *   <li>{@link bag.bagEcore.bagEcore.Sensor#getCharacteristic <em>Characteristic</em>}</li>
 * </ul>
 *
 * @see bag.bagEcore.bagEcore.AppEcorePackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bag.bagEcore.bagEcore.AppEcorePackage#getSensor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bag.bagEcore.bagEcore.Sensor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mac Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac Address</em>' attribute.
	 * @see #setMacAddress(String)
	 * @see bag.bagEcore.bagEcore.AppEcorePackage#getSensor_MacAddress()
	 * @model
	 * @generated
	 */
	String getMacAddress();

	/**
	 * Sets the value of the '{@link bag.bagEcore.bagEcore.Sensor#getMacAddress <em>Mac Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac Address</em>' attribute.
	 * @see #getMacAddress()
	 * @generated
	 */
	void setMacAddress(String value);

	/**
	 * Returns the value of the '<em><b>Characteristic</b></em>' reference list.
	 * The list contents are of type {@link bag.bagEcore.bagEcore.Characteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic</em>' reference list.
	 * @see bag.bagEcore.bagEcore.AppEcorePackage#getSensor_Characteristic()
	 * @model required="true"
	 * @generated
	 */
	EList<Characteristic> getCharacteristic();

} // Sensor
