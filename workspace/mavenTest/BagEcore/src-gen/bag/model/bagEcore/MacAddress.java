/**
 */
package bag.model.bagEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mac Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bag.model.bagEcore.MacAddress#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see bag.model.bagEcore.BagEcorePackage#getMacAddress()
 * @model
 * @generated
 */
public interface MacAddress extends EObject
{
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see bag.model.bagEcore.BagEcorePackage#getMacAddress_Address()
	 * @model required="true"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link bag.model.bagEcore.MacAddress#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

} // MacAddress
