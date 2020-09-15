/**
 */
package bag.model.bagEcore;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bag.model.bagEcore.Service#getName <em>Name</em>}</li>
 *   <li>{@link bag.model.bagEcore.Service#getCharacteristic <em>Characteristic</em>}</li>
 *   <li>{@link bag.model.bagEcore.Service#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @see bag.model.bagEcore.BAGEcorePackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bag.model.bagEcore.BAGEcorePackage#getService_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bag.model.bagEcore.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Characteristic</b></em>' containment reference list.
	 * The list contents are of type {@link bag.model.bagEcore.Characteristic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic</em>' containment reference list.
	 * @see bag.model.bagEcore.BAGEcorePackage#getService_Characteristic()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Characteristic> getCharacteristic();

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see bag.model.bagEcore.BAGEcorePackage#getService_Uuid()
	 * @model required="true"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link bag.model.bagEcore.Service#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

} // Service
