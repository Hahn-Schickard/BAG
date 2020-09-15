/**
 */
package bag.model.bagEcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mac Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bag.model.bagEcore.MacFilter#getMacaddress <em>Macaddress</em>}</li>
 * </ul>
 *
 * @see bag.model.bagEcore.BAGEcorePackage#getMacFilter()
 * @model
 * @generated
 */
public interface MacFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Macaddress</b></em>' containment reference list.
	 * The list contents are of type {@link bag.model.bagEcore.MacAddress}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macaddress</em>' containment reference list.
	 * @see bag.model.bagEcore.BAGEcorePackage#getMacFilter_Macaddress()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MacAddress> getMacaddress();

} // MacFilter
