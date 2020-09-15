/**
 */
package bag.model.bagEcore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Characteristic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bag.model.bagEcore.Characteristic#getName <em>Name</em>}</li>
 *   <li>{@link bag.model.bagEcore.Characteristic#getUuid <em>Uuid</em>}</li>
 *   <li>{@link bag.model.bagEcore.Characteristic#getDataType <em>Data Type</em>}</li>
 *   <li>{@link bag.model.bagEcore.Characteristic#getUnit <em>Unit</em>}</li>
 *   <li>{@link bag.model.bagEcore.Characteristic#isRead <em>Read</em>}</li>
 *   <li>{@link bag.model.bagEcore.Characteristic#isWrite <em>Write</em>}</li>
 *   <li>{@link bag.model.bagEcore.Characteristic#isNotification <em>Notification</em>}</li>
 *   <li>{@link bag.model.bagEcore.Characteristic#getUielement <em>Uielement</em>}</li>
 * </ul>
 *
 * @see bag.model.bagEcore.BAGEcorePackage#getCharacteristic()
 * @model
 * @generated
 */
public interface Characteristic extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bag.model.bagEcore.BAGEcorePackage#getCharacteristic_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bag.model.bagEcore.Characteristic#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uuid</em>' attribute.
	 * @see #setUuid(String)
	 * @see bag.model.bagEcore.BAGEcorePackage#getCharacteristic_Uuid()
	 * @model required="true"
	 * @generated
	 */
	String getUuid();

	/**
	 * Sets the value of the '{@link bag.model.bagEcore.Characteristic#getUuid <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uuid</em>' attribute.
	 * @see #getUuid()
	 * @generated
	 */
	void setUuid(String value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The default value is <code>"Float"</code>.
	 * The literals are from the enumeration {@link bag.model.bagEcore.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see bag.model.bagEcore.DataType
	 * @see #setDataType(DataType)
	 * @see bag.model.bagEcore.BAGEcorePackage#getCharacteristic_DataType()
	 * @model default="Float" required="true"
	 * @generated
	 */
	DataType getDataType();

	/**
	 * Sets the value of the '{@link bag.model.bagEcore.Characteristic#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see bag.model.bagEcore.DataType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataType value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see bag.model.bagEcore.BAGEcorePackage#getCharacteristic_Unit()
	 * @model
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link bag.model.bagEcore.Characteristic#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Uielement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uielement</em>' containment reference.
	 * @see #setUielement(UiElement)
	 * @see bag.model.bagEcore.BAGEcorePackage#getCharacteristic_Uielement()
	 * @model containment="true"
	 * @generated
	 */
	UiElement getUielement();

	/**
	 * Sets the value of the '{@link bag.model.bagEcore.Characteristic#getUielement <em>Uielement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uielement</em>' containment reference.
	 * @see #getUielement()
	 * @generated
	 */
	void setUielement(UiElement value);

	/**
	 * Returns the value of the '<em><b>Read</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read</em>' attribute.
	 * @see #setRead(boolean)
	 * @see bag.model.bagEcore.BAGEcorePackage#getCharacteristic_Read()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isRead();

	/**
	 * Sets the value of the '{@link bag.model.bagEcore.Characteristic#isRead <em>Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read</em>' attribute.
	 * @see #isRead()
	 * @generated
	 */
	void setRead(boolean value);

	/**
	 * Returns the value of the '<em><b>Write</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write</em>' attribute.
	 * @see #setWrite(boolean)
	 * @see bag.model.bagEcore.BAGEcorePackage#getCharacteristic_Write()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isWrite();

	/**
	 * Sets the value of the '{@link bag.model.bagEcore.Characteristic#isWrite <em>Write</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write</em>' attribute.
	 * @see #isWrite()
	 * @generated
	 */
	void setWrite(boolean value);

	/**
	 * Returns the value of the '<em><b>Notification</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification</em>' attribute.
	 * @see #setNotification(boolean)
	 * @see bag.model.bagEcore.BAGEcorePackage#getCharacteristic_Notification()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isNotification();

	/**
	 * Sets the value of the '{@link bag.model.bagEcore.Characteristic#isNotification <em>Notification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification</em>' attribute.
	 * @see #isNotification()
	 * @generated
	 */
	void setNotification(boolean value);

} // Characteristic
