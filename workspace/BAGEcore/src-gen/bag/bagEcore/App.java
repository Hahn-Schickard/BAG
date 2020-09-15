/**
 */
package bag.bagEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bag.bagEcore.App#getName <em>Name</em>}</li>
 *   <li>{@link bag.bagEcore.App#getFilter <em>Filter</em>}</li>
 *   <li>{@link bag.bagEcore.App#getSensor <em>Sensor</em>}</li>
 * </ul>
 *
 * @see bag.bagEcore.AppEcorePackage#getApp()
 * @model
 * @generated
 */
public interface App extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bag.bagEcore.AppEcorePackage#getApp_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bag.bagEcore.App#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' reference.
	 * @see #setFilter(Filter)
	 * @see bag.bagEcore.AppEcorePackage#getApp_Filter()
	 * @model
	 * @generated
	 */
	Filter getFilter();

	/**
	 * Sets the value of the '{@link bag.bagEcore.App#getFilter <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Filter value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' reference.
	 * @see #setSensor(Sensor)
	 * @see bag.bagEcore.AppEcorePackage#getApp_Sensor()
	 * @model required="true"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link bag.bagEcore.App#getSensor <em>Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

} // App
