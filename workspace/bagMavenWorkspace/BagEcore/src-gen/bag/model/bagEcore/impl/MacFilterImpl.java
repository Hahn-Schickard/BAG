/**
 */
package bag.model.bagEcore.impl;

import bag.model.bagEcore.BagEcorePackage;
import bag.model.bagEcore.MacAddress;
import bag.model.bagEcore.MacFilter;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mac Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bag.model.bagEcore.impl.MacFilterImpl#getMacaddress <em>Macaddress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MacFilterImpl extends MinimalEObjectImpl.Container implements MacFilter
{
	/**
	 * The cached value of the '{@link #getMacaddress() <em>Macaddress</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacaddress()
	 * @generated
	 * @ordered
	 */
	protected EList<MacAddress> macaddress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MacFilterImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BagEcorePackage.Literals.MAC_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MacAddress> getMacaddress()
	{
		if (macaddress == null)
		{
			macaddress = new EObjectContainmentEList<MacAddress>(MacAddress.class, this, BagEcorePackage.MAC_FILTER__MACADDRESS);
		}
		return macaddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case BagEcorePackage.MAC_FILTER__MACADDRESS:
				return ((InternalEList<?>)getMacaddress()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case BagEcorePackage.MAC_FILTER__MACADDRESS:
				return getMacaddress();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case BagEcorePackage.MAC_FILTER__MACADDRESS:
				getMacaddress().clear();
				getMacaddress().addAll((Collection<? extends MacAddress>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case BagEcorePackage.MAC_FILTER__MACADDRESS:
				getMacaddress().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case BagEcorePackage.MAC_FILTER__MACADDRESS:
				return macaddress != null && !macaddress.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MacFilterImpl
