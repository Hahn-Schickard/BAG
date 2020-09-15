/*
 * generated by Xtext 2.17.0
 */
package bag.validation

import org.eclipse.xtext.validation.Check
import bag.model.bagEcore.Sensor
import java.util.Set
import java.util.HashSet
import bag.model.bagEcore.Service
import bag.model.bagEcore.Characteristic
import bag.model.bagEcore.App
import bag.model.bagEcore.MacAddress

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class DSLValidator extends AbstractDSLValidator {
	
	// Defined validation values
	public static val UNIQUE_NAME = 'uniqueName';
	public static val WHITESPACE = 'whitespace';
	public static val MACADDRESS = 'macAddress';
	
	/**
	 * Validation rule to check if every given name of an element is unique. There shouldn't be any duplicate 'Service', 'Characteristic' or 'UiElement' names.
	 */
	@Check
	def uniqueNameService(Sensor sensor) {
		val Set<String> duplicateServices = new HashSet<String>();
		val Set<String> duplicateCharacteristic = new HashSet<String>();
		val Set<String> duplicateUiElements = new HashSet<String>();
		
		for(Service service : sensor.service) {
			if(!duplicateServices.add(service.name)) {
				error('Duplicate service name: ' + service.name, null , UNIQUE_NAME);
			}
			for(Characteristic characteristic : service.characteristic) {
				if(!duplicateCharacteristic.add(characteristic.name)) {
					error('Duplicate characteristic name: ' + characteristic.name, null , UNIQUE_NAME);
				}
				if(!duplicateUiElements.add(characteristic.uielement.name)) {
					error('Duplicate uielement name: ' + characteristic.uielement.name, null, UNIQUE_NAME);
				}
			}
		}
		
	}
	
	/**
	 * Validation rule to check element names for not allowed whitespace. There shouldn't be any whitespace in 'PackageName', 'Service'-name, 'Service'-uuid,
	 * 'Characteristic'-name, 'Characteristic'-uuid and 'UiElement'-name.
	 */
	@Check
	def noWhitespaces(App app) {
		if(app.packageName.contains(" ")) {
			error('Package name: "' + app.packageName + '" contains a not allowed whitespace', null, WHITESPACE);
		}
		for(Service service : app.sensor.service) {
			if(service.name.contains(" ")) {
				error('Service name: "' + service.name + '" contains a not allowed whitespace', null, WHITESPACE);
			}
			if(service.uuid.contains(" ")) {
				error('Service uuid: "' + service.uuid + '" contains a not allowed whitespace', null, WHITESPACE);
			}
			for(Characteristic characteristic : service.characteristic) {
				if(characteristic.name.contains(" ")) {
					error('Characteristic name: "' + characteristic.name + '" contains a not allowed whitespace', null, WHITESPACE);
				}
				if(characteristic.uuid.contains(" ")) {
					error('Characteristic uuid: "' + characteristic.uuid + '" contains a not allowed whitespace', null, WHITESPACE);
				}
				if(characteristic.uielement.name.contains(" ")) {
					error('UiElement name: "' + characteristic.uielement.name + '" contains a not allowed whitespace', null, WHITESPACE);
				}
			}
		}
	}
	
	/**
	 * Validation rule to check if the defined MAC-address matches the common pattern 'XX:XX:XX:XX:XX:XX'. 
	 */
	@Check
	def macAddressForm(App app) {
		if(app.macfilter !== null) {
			for(MacAddress macAddress : app.macfilter.macaddress) {
				if(!macAddress.address.matches("^([0-9A-Fa-f]{2}[:]){5}([0-9A-Fa-f]{2})$")) {
					error('MacAddress : "' + macAddress.address + '" did not match required pattern XX:XX:XX:XX:XX:XX', null, MACADDRESS);
				}
			}
		}
	}
}