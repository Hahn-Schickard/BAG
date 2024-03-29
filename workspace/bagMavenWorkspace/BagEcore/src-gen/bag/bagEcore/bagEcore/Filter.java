/**
 */
package bag.bagEcore.bagEcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bag.bagEcore.bagEcore.Filter#getMacaddress <em>Macaddress</em>}</li>
 * </ul>
 *
 * @see bag.bagEcore.bagEcore.AppEcorePackage#getFilter()
 * @model
 * @generated
 */
public interface Filter extends EObject {
	/**
	 * Returns the value of the '<em><b>Macaddress</b></em>' reference list.
	 * The list contents are of type {@link bag.bagEcore.bagEcore.MacAddress}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macaddress</em>' reference list.
	 * @see bag.bagEcore.bagEcore.AppEcorePackage#getFilter_Macaddress()
	 * @model required="true" upper="4"
	 * @generated
	 */
	EList<MacAddress> getMacaddress();

} // Filter
