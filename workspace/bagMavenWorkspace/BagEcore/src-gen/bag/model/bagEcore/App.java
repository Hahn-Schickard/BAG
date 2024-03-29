/**
 */
package bag.model.bagEcore;

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
 *   <li>{@link bag.model.bagEcore.App#getName <em>Name</em>}</li>
 *   <li>{@link bag.model.bagEcore.App#getSensor <em>Sensor</em>}</li>
 *   <li>{@link bag.model.bagEcore.App#getMacfilter <em>Macfilter</em>}</li>
 *   <li>{@link bag.model.bagEcore.App#getNamefilter <em>Namefilter</em>}</li>
 *   <li>{@link bag.model.bagEcore.App#getPackageName <em>Package Name</em>}</li>
 * </ul>
 *
 * @see bag.model.bagEcore.BagEcorePackage#getApp()
 * @model
 * @generated
 */
public interface App extends EObject
{
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bag.model.bagEcore.BagEcorePackage#getApp_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bag.model.bagEcore.App#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' containment reference.
	 * @see #setSensor(Sensor)
	 * @see bag.model.bagEcore.BagEcorePackage#getApp_Sensor()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link bag.model.bagEcore.App#getSensor <em>Sensor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' containment reference.
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

	/**
	 * Returns the value of the '<em><b>Macfilter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macfilter</em>' containment reference.
	 * @see #setMacfilter(MacFilter)
	 * @see bag.model.bagEcore.BagEcorePackage#getApp_Macfilter()
	 * @model containment="true"
	 * @generated
	 */
	MacFilter getMacfilter();

	/**
	 * Sets the value of the '{@link bag.model.bagEcore.App#getMacfilter <em>Macfilter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Macfilter</em>' containment reference.
	 * @see #getMacfilter()
	 * @generated
	 */
	void setMacfilter(MacFilter value);

	/**
	 * Returns the value of the '<em><b>Namefilter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namefilter</em>' containment reference.
	 * @see #setNamefilter(NameFilter)
	 * @see bag.model.bagEcore.BagEcorePackage#getApp_Namefilter()
	 * @model containment="true"
	 * @generated
	 */
	NameFilter getNamefilter();

	/**
	 * Sets the value of the '{@link bag.model.bagEcore.App#getNamefilter <em>Namefilter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namefilter</em>' containment reference.
	 * @see #getNamefilter()
	 * @generated
	 */
	void setNamefilter(NameFilter value);

	/**
	 * Returns the value of the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Name</em>' attribute.
	 * @see #setPackageName(String)
	 * @see bag.model.bagEcore.BagEcorePackage#getApp_PackageName()
	 * @model required="true"
	 * @generated
	 */
	String getPackageName();

	/**
	 * Sets the value of the '{@link bag.model.bagEcore.App#getPackageName <em>Package Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Name</em>' attribute.
	 * @see #getPackageName()
	 * @generated
	 */
	void setPackageName(String value);

} // App
