package bag.dsl.generator

import bag.model.bagEcore.App
import bag.model.bagEcore.Sensor

/**
 * The generator file for all iOS based generate-methods.  
 */
class IosGenerator {
	
	// Helper variables
	Integer counter = 0;
	Integer serviceCounter = 0;
	Integer yHeaderLabel = 8;
	Integer yReadLabel = 37;
	Integer yReadButton = 32;
	Integer yWriteTextField = 30;
	Integer yNotifyLabel = 37;
	Double contentViewHeight = 62.5;
	Integer characteristicsAmmount = 0;
	
	/**
	 * Generate-method for the 'AppDelegate.swift' file. This file contains a set of methods that you use to manage shared behaviors for your application.
	 */
	def generateAppDelegate() '''
	import UIKit
	
	@UIApplicationMain
	class AppDelegate: UIResponder, UIApplicationDelegate {
	
	    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?) -> Bool {
	        // Override point for customization after application launch.
	        return true
	    }
	
	    // MARK: UISceneSession Lifecycle
	
	    func application(_ application: UIApplication, configurationForConnecting connectingSceneSession: UISceneSession, options: UIScene.ConnectionOptions) -> UISceneConfiguration {
	        // Called when a new scene session is being created.
	        // Use this method to select a configuration to create the new scene with.
	        return UISceneConfiguration(name: "Default Configuration", sessionRole: connectingSceneSession.role)
	    }
	
	    func application(_ application: UIApplication, didDiscardSceneSessions sceneSessions: Set<UISceneSession>) {
	        // Called when the user discards a scene session.
	        // If any sessions were discarded while the application was not running, this will be called shortly after application:didFinishLaunchingWithOptions.
	        // Use this method to release any resources that were specific to the discarded scenes, as they will not return.
	    }
	}
	'''
	
	/**
	 * Generate-method for the 'SceneDelegate.swift' file. This file contains also general settings of the application.
	 */
	def generateSceneDelegate() '''
	import UIKit
	
	class SceneDelegate: UIResponder, UIWindowSceneDelegate {
	
	    var window: UIWindow?
	
	    func scene(_ scene: UIScene, willConnectTo session: UISceneSession, options connectionOptions: UIScene.ConnectionOptions) {
	        // Use this method to optionally configure and attach the UIWindow `window` to the provided UIWindowScene `scene`.
	        // If using a storyboard, the `window` property will automatically be initialized and attached to the scene.
	        // This delegate does not imply the connecting scene or session are new (see `application:configurationForConnectingSceneSession` instead).
	        guard let _ = (scene as? UIWindowScene) else { return }
	    }
	
	    func sceneDidDisconnect(_ scene: UIScene) {
	        // Called as the scene is being released by the system.
	        // This occurs shortly after the scene enters the background, or when its session is discarded.
	        // Release any resources associated with this scene that can be re-created the next time the scene connects.
	        // The scene may re-connect later, as its session was not neccessarily discarded (see `application:didDiscardSceneSessions` instead).
	    }
	
	    func sceneDidBecomeActive(_ scene: UIScene) {
	        // Called when the scene has moved from an inactive state to an active state.
	        // Use this method to restart any tasks that were paused (or not yet started) when the scene was inactive.
	    }
	
	    func sceneWillResignActive(_ scene: UIScene) {
	        // Called when the scene will move from an active state to an inactive state.
	        // This may occur due to temporary interruptions (ex. an incoming phone call).
	    }
	
	    func sceneWillEnterForeground(_ scene: UIScene) {
	        // Called as the scene transitions from the background to the foreground.
	        // Use this method to undo the changes made on entering the background.
	    }
	
	    func sceneDidEnterBackground(_ scene: UIScene) {
	        // Called as the scene transitions from the foreground to the background.
	        // Use this method to save data, release shared resources, and store enough scene-specific state information
	        // to restore the scene back to its current state.
	    }
	}
	'''
	
	/**
	 * Generate-method for the 'ItemsViewController.swift' file. This file contains the functionality of the list activity in which the nearby BLE devices are listed.
	 */
	def generateItemsViewController() '''
	import UIKit
	import Foundation
	import CoreBluetooth
	
	class ItemsViewController: UITableViewController {
	    
	    var manager: BLEManager!
	    var device: CBPeripheral!
	    
	    @IBAction func refreshClicked(_ sender: Any) {
	        manager.manager.stopScan()
	        manager.devices.removeAll()
	        manager.items.removeAll()
	        updateTableData()
	        manager.manager.scanForPeripherals(withServices: nil)
	    }
	    
	    override func viewWillAppear(_ animated: Bool) {
	        super.viewWillAppear(animated)
	        manager = BLEManager()
	        manager.initBLEManager(controller: self)
	    }
	    
	    override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
	        return manager.items.keys.count
	    }
	    
	    override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
	        let cell = tableView.dequeueReusableCell(withIdentifier: "ItemCell", for: indexPath)
	        
	        // Configure the cell...
	        if let item = itemForIndexPath(indexPath){
	            cell.textLabel?.text = item["name"] as? String
	            
	            if let rssi = item["rssi"] as? Int {
	                cell.detailTextLabel?.text = "\(rssi.description) dBm"
	            } else {
	                cell.detailTextLabel?.text = ""
	            }
	        }
	        return cell
	    }
	    
	    func itemForIndexPath(_ indexPath: IndexPath) -> [String: Any]?{
	        
	        if indexPath.row > manager.items.keys.count{
	            return nil
	        }
	        return Array(manager.items.values)[indexPath.row]
	    }
	    
	    override func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {
	        let item = itemForIndexPath(indexPath)
	        print(item?["name"]! as Any)
	        print(item?["rssi"]! as Any)
	        print(item?["uuid"]! as Any)
	        
	        for dev in manager.devices {
	            if dev.identifier.uuidString == item?["uuid"]! as? String {
	                device = dev
	            }
	        }
	        
	        let storyboard = UIStoryboard(name: "Main", bundle: Bundle.main)
	        let destination = storyboard.instantiateViewController(withIdentifier: "ViewController") as! ViewController
	        destination.device = device
	        destination.manager = manager
	        
	        manager.manager.stopScan()
	        manager.manager.connect(device)
	        
	        navigationController?.pushViewController(destination, animated: true)
	    }
	    
	    func updateTableData() {
	        tableView.reloadData()
	    }
	}
	'''
	
	/**
	 * Generate-method for the 'BLEManager.swift' file. In this file the general BLE functionality is described which is necessary for the communication between the application and a BLE device.
	 */
	def generateBLEManager(App app) '''
	import CoreBluetooth
	import UIKit
	
	class BLEManager: NSObject, CBCentralManagerDelegate, CBPeripheralDelegate {
	    
	    var manager: CBCentralManager!
	    �FOR service : app.sensor.service�
	    �FOR characteristic : service.characteristic�
	    let �characteristic.name�CBUUID = CBUUID(string: "�characteristic.uuid�")
	    var �characteristic.name�Characteristic:CBCharacteristic!
	    �ENDFOR�
	    �ENDFOR�
	    
	    var tableViewController: ItemsViewController!
	    var viewController: ViewController!
	    var devices = [CBPeripheral]()
	    var items = [String: [String: Any]]()
	    
	    func initBLEManager(controller: ItemsViewController) {
	        tableViewController = controller
	        manager = CBCentralManager(delegate: self, queue: nil)
	    }
	    
	    func centralManagerDidUpdateState(_ central: CBCentralManager){
	        if central.state == .poweredOn{
	            manager.scanForPeripherals(withServices: nil)
	        }
	    }
	    
	    func centralManager(_ central: CBCentralManager, didDiscover peripheral: CBPeripheral, advertisementData: [String : Any], rssi RSSI: NSNumber){
	        �IF app.namefilter !== null�
	        if peripheral.name != nil {
	        	let range = NSRange(location: 0, length: peripheral.name!.utf16.count)
	            let regex = try! NSRegularExpression(pattern: "�app.namefilter.name.regEx�")
	            if regex.firstMatch(in: peripheral.name!, options: [], range: range) != nil {
	            	devices.append(peripheral)
	                didReadPeripheral(peripheral, rssi: RSSI)
	            }
	        }
	        �ELSE�
	        devices.append(peripheral)
	        didReadPeripheral(peripheral, rssi: RSSI)
	        �ENDIF�
	    }
	    
	    func didReadPeripheral(_ peripheral: CBPeripheral, rssi: NSNumber){
	        if let name = peripheral.name{
	            items[name] = [
	                "name":name,
	                "rssi":rssi,
	                "uuid":peripheral.identifier.uuidString
	            ]
	        }
	        tableViewController.updateTableData()
	    }
	    
	    func centralManager(_ central: CBCentralManager, didConnect peripheral: CBPeripheral){
	        print("Connected to device \(peripheral.name ?? "Device Name")")
	        viewController.connectionStatusLabel.text = "Connected"
	        peripheral.delegate = self
	        peripheral.discoverServices(nil)
	    }
	    
	    func peripheral(_ peripheral: CBPeripheral, didDiscoverServices error: Error?) {
	        guard let services = peripheral.services else { return }
	        
	        for service in services {
	            print(service)
	            peripheral.discoverCharacteristics(nil, for: service)
	        }
	    }
	    
	    func peripheral(_ peripheral: CBPeripheral, didDiscoverCharacteristicsFor service: CBService, error: Error?) {
	        guard let characteristics = service.characteristics else { return }
	        
	        for characteristic in characteristics {
	            print(characteristic)
	            
	            �FOR service : app.sensor.service�
	            �FOR characteristic : service.characteristic�
	            if(characteristic.uuid == �characteristic.name�CBUUID) {
	            	�characteristic.name�Characteristic = characteristic
	            	�IF characteristic.read�
	            	peripheral.readValue(for: �characteristic.name�Characteristic)
	            	�ELSE�
	            	�ENDIF�
	            	�IF characteristic.notification�
	            	peripheral.setNotifyValue(true, for: �characteristic.name�Characteristic)
	            	�ELSE�
	            	�ENDIF�
	            }
	            �ENDFOR�
	            �ENDFOR�
	        }
	    }
	    
	    func peripheral(_ peripheral: CBPeripheral, didUpdateValueFor characteristic: CBCharacteristic, error: Error?) {
	    	
	    	�FOR service : app.sensor.service�
	    	�FOR characteristic : service.characteristic�
	    	if(characteristic == �characteristic.name�Characteristic) {
	    		// TODO: Add code to handle received data and do conversion if needed
	    		let value = characteristic.value![0]
	    		�IF characteristic.read && characteristic.uielement !== null�
	    		viewController.readValue�characteristic.uielement.name�.text = "\(value)"
	    		�ELSE�
	    		�ENDIF�
	    		�IF characteristic.write && characteristic.uielement !== null�
	    		viewController.writeValue�characteristic.uielement.name�.text = "\(value)"
	    		�ELSE�
	    		�ENDIF�
	    		�IF characteristic.notification && characteristic.uielement !== null�
	    		viewController.notifyValue�characteristic.uielement.name�.text = "\(value)"
	    		�ELSE�
	    		�ENDIF�
	    	}
	    	�ENDFOR�
	    	�ENDFOR�
	    }
	
	    func centralManager(_ central: CBCentralManager, didDisconnectPeripheral peripheral: CBPeripheral, error: Error?) {
	        print("Disconnected from device \(peripheral.name ?? "DeviceName")")
	        viewController.connectionStatusLabel.text = "Disconnected"
	    }
	    
	    func registerViewController(vc: ViewController) {
	        viewController = vc
	    }
	}
	'''
	
	/**
	 * Generate-method for the 'ViewController.swift' file. This file contains the main functionality of the application. 
	 */
	def generateViewController(Sensor sensor) '''
	import UIKit
	import CoreBluetooth
	
	class ViewController: UIViewController {
	    
	    @IBOutlet weak var nameLabel: UILabel!
	    @IBOutlet weak var uuidLabel: UILabel!
	    @IBOutlet weak var connectionStatusLabel: UILabel!
	    �FOR service : sensor.service�
	    �FOR characteristic : service.characteristic�
	    �IF characteristic.read && characteristic.uielement !== null�
	    @IBOutlet weak var readValue�characteristic.uielement.name�: UILabel! �IF characteristic.uielement.description !== null� // �characteristic.uielement.description��ELSE��ENDIF�
	    �ELSE�
	    �ENDIF�
	    �IF characteristic.write && characteristic.uielement !== null�
	    @IBOutlet weak var writeValue�characteristic.uielement.name�: UITextField! �IF characteristic.uielement.description !== null� // �characteristic.uielement.description��ELSE��ENDIF�
	    �ELSE�
	    �ENDIF�
	    �IF characteristic.notification && characteristic.uielement !== null�
	    @IBOutlet weak var notifyValue�characteristic.uielement.name�: UILabel! �IF characteristic.uielement.description !== null� // �characteristic.uielement.description��ELSE��ENDIF�
	    �ELSE�
	    �ENDIF�
	    �ENDFOR�
	    �ENDFOR�
	    var name:String = ""
	    var uuid:String = ""
	    var device: CBPeripheral!
	    var manager: BLEManager!
	    
	    override func viewDidLoad() {
	        super.viewDidLoad()
	        
	        // Dismiss keyboard when touching outside an textfield
	        let tap: UITapGestureRecognizer = UITapGestureRecognizer(target: self, action: #selector(UIInputViewController.dismissKeyboard))
	        view.addGestureRecognizer(tap)
	        
	        manager.registerViewController(vc: self)
	        
	        name = device.name ?? "n.a."
	        uuid = device.identifier.uuidString
	        
	        nameLabel.text = name
	        uuidLabel.text = uuid
	    }
	    
	    // Calls this function when the tap is recognized.
	    @objc func dismissKeyboard() {
	        // Causes the view (or one of its embedded text fields) to resign the first responder status.
	        view.endEditing(true)
	    }
	    
	    override func viewWillDisappear(_ animated: Bool) {
	        manager.manager.cancelPeripheralConnection(device)
	    }
	    
	    �FOR service : sensor.service�
	    �FOR characteristic : service.characteristic�
	    �IF characteristic.read && characteristic.uielement !== null�
	    @IBAction func readButton�characteristic.uielement.name�Clicked(_ sender: Any) {
	    	device.readValue(for: manager.�characteristic.name�Characteristic)
	    }
	    �ELSE�
	    �ENDIF�
	    �IF characteristic.write && characteristic.uielement !== null�
	    @IBAction func writeTextField�characteristic.uielement.name�SentClicked(_ sender: UITextField) {
	    	// TODO: Add code to receive input from TextField, convert it if necessary and send it to the device
	    	let input = Int(sender.text!)
	    	let value: [UInt8] = [UInt8(input!)]
	    	device.writeValue(Data(_: value), for: manager.�characteristic.name�Characteristic, type: CBCharacteristicWriteType.withResponse)
	    	sender.resignFirstResponder()
	    }
	    �ELSE�
	    �ENDIF�
	    �ENDFOR�
	    �ENDFOR�
	}
	'''
	
	/**
	 * Generate-method for the 'Main.storyboard' file. This file describes the layout of the whole application. With the use of the helper variables
	 * elements can be added relatively to existing elements.
	 */
	def generateStoryboard(Sensor sensor) '''
	��� Reset helper variables because class variables stay for every further call of the generate-method
	�{yHeaderLabel = 8; ""}�
	�{yReadLabel = 37; ""}�
	�{yReadButton = 32; ""}�
	�{yWriteTextField = 30; ""}�
	�{yNotifyLabel = 37; ""}�
	�{counter = 0; ""}�
	�{serviceCounter = 0; ""}�
	�{contentViewHeight = 62.5; ""}�
	�{characteristicsAmmount = 0; ""}�
	��� Count how many characteristics are defined to calculate the necessary height of the content view element
	�FOR service : sensor.service�
	�FOR characteristic : service.characteristic�
	�{characteristicsAmmount = characteristicsAmmount + 1; ""}�
	�ENDFOR�
	�ENDFOR�
	�{contentViewHeight = contentViewHeight * characteristicsAmmount; ""}�
	<?xml version="1.0" encoding="UTF-8"?>
	<document type="com.apple.InterfaceBuilder3.CocoaTouch.Storyboard.XIB" version="3.0" toolsVersion="16096" targetRuntime="iOS.CocoaTouch" propertyAccessControl="none" useAutolayout="YES" useTraitCollections="YES" colorMatched="YES" initialViewController="SPo-S7-a3q">
	    <device id="retina4_7" orientation="portrait" appearance="light"/>
	    <dependencies>
	        <plugIn identifier="com.apple.InterfaceBuilder.IBCocoaTouchPlugin" version="16087"/>
	        <capability name="documents saved in the Xcode 8 format" minToolsVersion="8.0"/>
	    </dependencies>
	    <scenes>
	        <!--Devices-->
	        <scene sceneID="sMT-hF-zCY">
	            <objects>
	                <tableViewController id="aDB-wg-86B" customClass="ItemsViewController" customModule="Reference" customModuleProvider="target" sceneMemberID="viewController">
	                    <tableView key="view" clipsSubviews="YES" contentMode="scaleToFill" alwaysBounceVertical="YES" dataMode="prototypes" style="plain" separatorStyle="default" rowHeight="44" sectionHeaderHeight="28" sectionFooterHeight="28" id="bdi-n4-G5H">
	                        <rect key="frame" x="0.0" y="0.0" width="375" height="667"/>
	                        <autoresizingMask key="autoresizingMask" widthSizable="YES" heightSizable="YES"/>
	                        <color key="backgroundColor" white="1" alpha="1" colorSpace="calibratedWhite"/>
	                        <prototypes>
	                            <tableViewCell clipsSubviews="YES" contentMode="scaleToFill" selectionStyle="default" indentationWidth="10" reuseIdentifier="ItemCell" textLabel="Vem-bU-Ccv" detailTextLabel="hm0-yO-FXd" style="IBUITableViewCellStyleValue1" id="Ka1-f4-jlc">
	                                <rect key="frame" x="0.0" y="28" width="375" height="44"/>
	                                <autoresizingMask key="autoresizingMask"/>
	                                <tableViewCellContentView key="contentView" opaque="NO" clipsSubviews="YES" multipleTouchEnabled="YES" contentMode="center" tableViewCell="Ka1-f4-jlc" id="Txd-dJ-ZvB">
	                                    <rect key="frame" x="0.0" y="0.0" width="375" height="44"/>
	                                    <autoresizingMask key="autoresizingMask"/>
	                                    <subviews>
	                                        <label opaque="NO" multipleTouchEnabled="YES" contentMode="left" text="Title" textAlignment="natural" lineBreakMode="tailTruncation" baselineAdjustment="alignBaselines" adjustsFontSizeToFit="NO" id="Vem-bU-Ccv">
	                                            <rect key="frame" x="16" y="12" width="33.5" height="20.5"/>
	                                            <autoresizingMask key="autoresizingMask"/>
	                                            <fontDescription key="fontDescription" type="system" pointSize="17"/>
	                                            <nil key="textColor"/>
	                                            <nil key="highlightedColor"/>
	                                        </label>
	                                        <label opaque="NO" multipleTouchEnabled="YES" contentMode="left" text="Detail" textAlignment="right" lineBreakMode="tailTruncation" baselineAdjustment="alignBaselines" adjustsFontSizeToFit="NO" id="hm0-yO-FXd">
	                                            <rect key="frame" x="315" y="12" width="44" height="20.5"/>
	                                            <autoresizingMask key="autoresizingMask"/>
	                                            <fontDescription key="fontDescription" type="system" pointSize="17"/>
	                                            <nil key="textColor"/>
	                                            <nil key="highlightedColor"/>
	                                        </label>
	                                    </subviews>
	                                </tableViewCellContentView>
	                            </tableViewCell>
	                        </prototypes>
	                        <connections>
	                            <outlet property="dataSource" destination="aDB-wg-86B" id="2rO-V7-py2"/>
	                            <outlet property="delegate" destination="aDB-wg-86B" id="ocf-vz-vTa"/>
	                        </connections>
	                    </tableView>
	                    <navigationItem key="navigationItem" title="Devices" id="V1X-fa-HfY">
	                        <barButtonItem key="rightBarButtonItem" title="Refresh" style="plain" id="gKp-Ev-6jC">
	                            <connections>
	                                <action selector="refreshClicked:" destination="aDB-wg-86B" id="gbS-58-1eW"/>
	                            </connections>
	                        </barButtonItem>
	                    </navigationItem>
	                </tableViewController>
	                <placeholder placeholderIdentifier="IBFirstResponder" id="d7T-4W-hPF" userLabel="First Responder" sceneMemberID="firstResponder"/>
	            </objects>
	            <point key="canvasLocation" x="1760.8" y="-407.0464767616192"/>
	        </scene>
	        <!--Navigation Controller-->
	        <scene sceneID="Mh2-Q9-xFY">
	            <objects>
	                <navigationController automaticallyAdjustsScrollViewInsets="NO" id="SPo-S7-a3q" sceneMemberID="viewController">
	                    <tabBarItem key="tabBarItem" title="" systemItem="search" id="Gsf-ZN-ymL"/>
	                    <toolbarItems/>
	                    <navigationBar key="navigationBar" contentMode="scaleToFill" id="rj6-Gf-Y4A">
	                        <rect key="frame" x="0.0" y="0.0" width="375" height="44"/>
	                        <autoresizingMask key="autoresizingMask"/>
	                    </navigationBar>
	                    <nil name="viewControllers"/>
	                    <connections>
	                        <segue destination="aDB-wg-86B" kind="relationship" relationship="rootViewController" id="B5g-1y-Eli"/>
	                    </connections>
	                </navigationController>
	                <placeholder placeholderIdentifier="IBFirstResponder" id="vGc-4t-7k5" userLabel="First Responder" sceneMemberID="firstResponder"/>
	            </objects>
	            <point key="canvasLocation" x="821.60000000000002" y="-407.0464767616192"/>
	        </scene>
	        <!--View Controller-->
	        <scene sceneID="1mi-mJ-drX">
	            <objects>
	                <viewController storyboardIdentifier="ViewController" id="mcc-oX-7Sy" customClass="ViewController" customModule="Reference" customModuleProvider="target" sceneMemberID="viewController">
	                    <view key="view" contentMode="scaleToFill" id="HmF-PQ-hoi">
	                        <rect key="frame" x="0.0" y="0.0" width="375" height="667"/>
	                        <autoresizingMask key="autoresizingMask" widthSizable="YES" heightSizable="YES"/>
	                        <subviews>
	                            <label opaque="NO" userInteractionEnabled="NO" contentMode="left" horizontalHuggingPriority="251" verticalHuggingPriority="251" text="Device Name" lineBreakMode="tailTruncation" baselineAdjustment="alignBaselines" adjustsFontSizeToFit="NO" translatesAutoresizingMaskIntoConstraints="NO" id="DeviceNameHeader">
	                                <rect key="frame" x="16" y="8" width="107" height="21"/>
	                                <fontDescription key="fontDescription" type="boldSystem" pointSize="17"/>
	                                <nil key="textColor"/>
	                                <nil key="highlightedColor"/>
	                            </label>
	                            <label opaque="NO" userInteractionEnabled="NO" contentMode="left" horizontalHuggingPriority="251" verticalHuggingPriority="251" text="n.a." textAlignment="natural" lineBreakMode="tailTruncation" baselineAdjustment="alignBaselines" adjustsFontSizeToFit="NO" translatesAutoresizingMaskIntoConstraints="NO" id="DeviceNameValue">
	                                <rect key="frame" x="16" y="37" width="28" height="21"/>
	                                <fontDescription key="fontDescription" type="system" pointSize="17"/>
	                                <nil key="textColor"/>
	                                <nil key="highlightedColor"/>
	                            </label>
	                            <label opaque="NO" userInteractionEnabled="NO" contentMode="left" horizontalHuggingPriority="251" verticalHuggingPriority="251" text="Device Identifier" lineBreakMode="tailTruncation" baselineAdjustment="alignBaselines" adjustsFontSizeToFit="NO" translatesAutoresizingMaskIntoConstraints="NO" id="DeviceIdentifierHeader">
	                                <rect key="frame" x="16" y="66" width="134.5" height="21"/>
	                                <fontDescription key="fontDescription" type="boldSystem" pointSize="17"/>
	                                <nil key="textColor"/>
	                                <nil key="highlightedColor"/>
	                            </label>
	                            <label opaque="NO" userInteractionEnabled="NO" contentMode="left" horizontalHuggingPriority="251" verticalHuggingPriority="251" text="Connection Status" lineBreakMode="tailTruncation" baselineAdjustment="alignBaselines" adjustsFontSizeToFit="NO" translatesAutoresizingMaskIntoConstraints="NO" id="ConnectionStateHeader">
	                                <rect key="frame" x="16" y="124" width="152" height="21"/>
	                                <fontDescription key="fontDescription" type="boldSystem" pointSize="17"/>
	                                <nil key="textColor"/>
	                                <nil key="highlightedColor"/>
	                            </label>
	                            <label opaque="NO" userInteractionEnabled="NO" contentMode="left" horizontalHuggingPriority="251" verticalHuggingPriority="251" text="n.a." textAlignment="natural" lineBreakMode="tailTruncation" baselineAdjustment="alignBaselines" adjustsFontSizeToFit="NO" translatesAutoresizingMaskIntoConstraints="NO" id="DeviceIdentifierValue">
	                                <rect key="frame" x="16" y="95" width="28" height="21"/>
	                                <fontDescription key="fontDescription" type="system" pointSize="17"/>
	                                <nil key="textColor"/>
	                                <nil key="highlightedColor"/>
	                            </label>
	                            <label opaque="NO" userInteractionEnabled="NO" contentMode="left" horizontalHuggingPriority="251" verticalHuggingPriority="251" text="n.a." textAlignment="natural" lineBreakMode="tailTruncation" baselineAdjustment="alignBaselines" adjustsFontSizeToFit="NO" translatesAutoresizingMaskIntoConstraints="NO" id="ConnectionStateValue">
	                                <rect key="frame" x="16" y="153" width="28" height="21"/>
	                                <fontDescription key="fontDescription" type="system" pointSize="17"/>
	                                <nil key="textColor"/>
	                                <nil key="highlightedColor"/>
	                            </label>
	                            <scrollView clipsSubviews="YES" multipleTouchEnabled="YES" contentMode="scaleToFill" translatesAutoresizingMaskIntoConstraints="NO" id="ScrollView">
	                                <rect key="frame" x="16" y="202" width="343" height="445"/>
	                                <subviews>
	                                	<view contentMode="scaleToFill" translatesAutoresizingMaskIntoConstraints="NO" id="ContentView">
	                                		<rect key="frame" x="0.0" y="0.0" width="343" height="�contentViewHeight�"/>
	                                	    <subviews>
			                                	�FOR service : sensor.service�
			                                	�FOR characteristic : service.characteristic�
			                                	�IF characteristic.uielement !== null�
			                                	<label opaque="NO" userInteractionEnabled="NO" contentMode="left" horizontalHuggingPriority="251" verticalHuggingPriority="251" text="�characteristic.uielement.label�" lineBreakMode="tailTruncation" baselineAdjustment="alignBaselines" adjustsFontSizeToFit="NO" translatesAutoresizingMaskIntoConstraints="NO" id="�characteristic.uielement.name�Header">
			                                		<rect key="frame" x="0.0" y="�yHeaderLabel�" width="200" height="21"/>
			                                		<fontDescription key="fontDescription" type="boldSystem" pointSize="17"/>
			                                		<nil key="textColor"/>
			                                		<nil key="highlightedColor"/>
			                                	</label>
			                                	�IF characteristic.read�
			                                	<label opaque="NO" userInteractionEnabled="NO" contentMode="left" horizontalHuggingPriority="251" verticalHuggingPriority="251" text="n.a" textAlignment="center" lineBreakMode="tailTruncation" baselineAdjustment="alignBaselines" adjustsFontSizeToFit="NO" translatesAutoresizingMaskIntoConstraints="NO" id="�characteristic.uielement.name�ReadValue">
			                                		<rect key="frame" x="0.0" y="�yReadLabel�" width="81" height="21"/>
			                                		<constraints>
			                                			<constraint firstAttribute="width" constant="81" id="�characteristic.uielement.name�ReadLabelConstraint"/>
			                                		</constraints>
			                                		<fontDescription key="fontDescription" type="system" pointSize="17"/>
			                                		<nil key="textColor"/>
			                                		<nil key="highlightedColor"/>
			                                	</label>
			                                	<button opaque="NO" contentMode="scaleToFill" contentHorizontalAlignment="center" contentVerticalAlignment="center" buttonType="roundedRect" lineBreakMode="middleTruncation" translatesAutoresizingMaskIntoConstraints="NO" id="�characteristic.uielement.name�ReadButton">
			                                		<rect key="frame" x="89" y="�yReadButton�" width="35" height="30"/>
			                                		<state key="normal" title="Read"/>
			                                		<connections>
			                                			<action selector="readButton�characteristic.uielement.name�Clicked:" destination="mcc-oX-7Sy" eventType="touchUpInside" id="�characteristic.uielement.name�ReadButtonAction"/>
			                                		</connections>
			                                	</button>
			                                	�ELSE�
			                                	<label opaque="NO" userInteractionEnabled="NO" contentMode="left" horizontalHuggingPriority="251" verticalHuggingPriority="251" text="n.a" textAlignment="center" lineBreakMode="tailTruncation" baselineAdjustment="alignBaselines" adjustsFontSizeToFit="NO" translatesAutoresizingMaskIntoConstraints="NO" id="�characteristic.uielement.name�ReadValue">
			                                		<rect key="frame" x="0.0" y="�yReadLabel�" width="81" height="21"/>
			                                		<constraints>
			                                			<constraint firstAttribute="width" constant="81" id="�characteristic.uielement.name�ReadLabelConstraint"/>
			                                		</constraints>
			                                		<fontDescription key="fontDescription" type="system" pointSize="17"/>
			                                		<color key="textColor" white="0.66666666666666663" alpha="1" colorSpace="custom" customColorSpace="genericGamma22GrayColorSpace"/>
			                                		<nil key="highlightedColor"/>
			                                	</label>
			                                	<button opaque="NO" contentMode="scaleToFill" enabled="NO" contentHorizontalAlignment="center" contentVerticalAlignment="center" buttonType="roundedRect" lineBreakMode="middleTruncation" translatesAutoresizingMaskIntoConstraints="NO" id="�characteristic.uielement.name�ReadButton">
			                                		<rect key="frame" x="89" y="�yReadButton�" width="35" height="30"/>
			                                		<state key="normal" title="Read"/>
			                                		<connections>
			                                			<action selector="readButton�characteristic.uielement.name�Clicked:" destination="mcc-oX-7Sy" eventType="touchUpInside" id="�characteristic.uielement.name�ReadButtonAction"/>
			                                		</connections>
			                                	</button>
			                                	�ENDIF�
			                                	�IF characteristic.write�
			                                	<textField opaque="NO" contentMode="scaleToFill" contentHorizontalAlignment="left" contentVerticalAlignment="center" borderStyle="roundedRect" placeholder="write value" textAlignment="center" minimumFontSize="17" translatesAutoresizingMaskIntoConstraints="NO" id="�characteristic.uielement.name�WriteValue">
			                                		<rect key="frame" x="132" y="�yWriteTextField�" width="97" height="34"/>
			                                		<constraints>
			                                			<constraint firstAttribute="width" constant="97" id="�characteristic.uielement.name�WriteTextFieldConstraint"/>
			                                		</constraints>
			                                		<fontDescription key="fontDescription" type="system" pointSize="14"/>
			                                		<textInputTraits key="textInputTraits" returnKeyType="send"/>
			                                		<connections>
			                                			<action selector="writeTextField�characteristic.uielement.name�SentClicked:" destination="mcc-oX-7Sy" eventType="primaryActionTriggered" id="�characteristic.uielement.name�WriteTextFieldAction"/>
			                                		</connections>
			                                	</textField>
			                                	�ELSE�
			                                	<textField opaque="NO" contentMode="scaleToFill" enabled="NO" contentHorizontalAlignment="left" contentVerticalAlignment="center" borderStyle="roundedRect" placeholder="n.a" textAlignment="center" minimumFontSize="17" translatesAutoresizingMaskIntoConstraints="NO" id="�characteristic.uielement.name�WriteValue">
			                                		<rect key="frame" x="132" y="�yWriteTextField�" width="97" height="34"/>
			                                		<constraints>
			                                			<constraint firstAttribute="width" constant="97" id="�characteristic.uielement.name�WriteTextFieldConstraint"/>
			                                		</constraints>
			                                		<fontDescription key="fontDescription" type="system" pointSize="14"/>
			                                		<textInputTraits key="textInputTraits" returnKeyType="send"/>
			                                		<connections>
			                                			<action selector="writeTextField�characteristic.uielement.name�SentClicked:" destination="mcc-oX-7Sy" eventType="primaryActionTriggered" id="�characteristic.uielement.name�WriteTextFieldAction"/>
			                                		</connections>
			                                	</textField>
			                                	�ENDIF�
			                                	�IF characteristic.notification�
			                                	<label opaque="NO" userInteractionEnabled="NO" contentMode="left" horizontalHuggingPriority="251" verticalHuggingPriority="251" text="n.a" textAlignment="center" lineBreakMode="tailTruncation" baselineAdjustment="alignBaselines" adjustsFontSizeToFit="NO" translatesAutoresizingMaskIntoConstraints="NO" id="�characteristic.uielement.name�NotifyValue">
			                                		<rect key="frame" x="237" y="�yNotifyLabel�" width="88" height="21"/>
			                                		<constraints>
			                                			<constraint firstAttribute="width" constant="88" id="�characteristic.uielement.name�NotifyLabelConstraint"/>
			                                		</constraints>
			                                		<fontDescription key="fontDescription" type="system" pointSize="17"/>
			                                		<nil key="textColor"/>
			                                		<nil key="highlightedColor"/>
			                                	</label>
			                                	�ELSE�
			                                	<label opaque="NO" userInteractionEnabled="NO" contentMode="left" horizontalHuggingPriority="251" verticalHuggingPriority="251" text="n.a" textAlignment="center" lineBreakMode="tailTruncation" baselineAdjustment="alignBaselines" adjustsFontSizeToFit="NO" translatesAutoresizingMaskIntoConstraints="NO" id="�characteristic.uielement.name�NotifyValue">
			                                		<rect key="frame" x="237" y="�yNotifyLabel�" width="88" height="21"/>
			                                		<constraints>
			                                			<constraint firstAttribute="width" constant="88" id="�characteristic.uielement.name�NotifyLabelConstraint"/>
			                                		</constraints>
			                                		<fontDescription key="fontDescription" type="system" pointSize="17"/>
			                                		<color key="textColor" white="0.66666666666666663" alpha="1" colorSpace="custom" customColorSpace="genericGamma22GrayColorSpace"/>
			                                		<nil key="highlightedColor"/>
			                                	</label>
			                                	�ENDIF�
			                                	��� Increase x and y position of view elements to place them in relation to previous elements
			                                	�{yHeaderLabel = yHeaderLabel + 62; ""}�
			                                	�{yReadLabel = yReadLabel + 62; ""}�
			                                	�{yReadButton = yReadButton + 62; ""}�
			                                	�{yWriteTextField = yWriteTextField + 62; ""}�
			                                	�{yNotifyLabel = yNotifyLabel + 62; ""}�
			                                	�ELSE�
			                                	�ENDIF�
			                                	�ENDFOR�
			                                	�ENDFOR�
			                                </subviews>
			                                <constraints>
			                                	<constraint firstAttribute="height" constant="�contentViewHeight�" id="Ty5-ms-qL4"/>
			                                	�FOR service : sensor.service�
			                                	��� Check if one or more services are defined
			                                	�{serviceCounter = serviceCounter + 1; ""}�
			                                	��� If more than one service is defined the first charactristic of the new service must have a reference to the last characteristic in the previous service
			                                	�IF serviceCounter >= 2�
			                                	�{counter = 0; ""}�
			                                	�ELSE�
			                                	�ENDIF�
			                                	�FOR characteristic : service.characteristic�
			                                	�IF characteristic.uielement !== null�
			                                	�IF counter == 0 && serviceCounter == 1�
			                                	<constraint firstItem="�characteristic.uielement.name�Header" firstAttribute="leading" secondItem="ContentView" secondAttribute="leading" id="�characteristic.uielement.name�Constraint1"/>
			                                	<constraint firstItem="�characteristic.uielement.name�Header" firstAttribute="top" secondItem="ContentView" secondAttribute="top" constant="8" id="�characteristic.uielement.name�Constraint2"/>
			                                	<constraint firstItem="�characteristic.uielement.name�ReadValue" firstAttribute="leading" secondItem="ContentView" secondAttribute="leading" id="�characteristic.uielement.name�Constraint3"/>
			                                	<constraint firstItem="�characteristic.uielement.name�ReadValue" firstAttribute="top" secondItem="�characteristic.uielement.name�Header" secondAttribute="bottom" constant="8" id="�characteristic.uielement.name�Constraint4"/>
			                                	<constraint firstItem="�characteristic.uielement.name�ReadButton" firstAttribute="leading" secondItem="�characteristic.uielement.name�ReadValue" secondAttribute="trailing" constant="8" id="�characteristic.uielement.name�Constraint5"/>
			                                	<constraint firstItem="�characteristic.uielement.name�ReadButton" firstAttribute="top" secondItem="�characteristic.uielement.name�Header" secondAttribute="bottom" constant="3" id="�characteristic.uielement.name�Constraint6"/>
			                                	<constraint firstItem="�characteristic.uielement.name�WriteValue" firstAttribute="leading" secondItem="�characteristic.uielement.name�ReadButton" secondAttribute="trailing" constant="8" id="�characteristic.uielement.name�Constraint7"/>
			                                	<constraint firstItem="�characteristic.uielement.name�WriteValue" firstAttribute="top" secondItem="ContentView" secondAttribute="top" constant="30" id="�characteristic.uielement.name�Constraint8"/>
			                                	<constraint firstItem="�characteristic.uielement.name�NotifyValue" firstAttribute="leading" secondItem="�characteristic.uielement.name�WriteValue" secondAttribute="trailing" constant="8" id="�characteristic.uielement.name�Constraint9"/>
			                                	<constraint firstItem="�characteristic.uielement.name�NotifyValue" firstAttribute="top" secondItem="ContentView" secondAttribute="top" constant="37" id="�characteristic.uielement.name�Constraint10"/>
			                                	�ELSE�
			                                	�ENDIF�
			                                	�IF counter >= 1 && serviceCounter == 1�
			                                	<constraint firstItem="�characteristic.uielement.name�Header" firstAttribute="leading" secondItem="ContentView" secondAttribute="leading" id="�characteristic.uielement.name�Constraint1"/>
			                                	<constraint firstItem="�characteristic.uielement.name�Header" firstAttribute="top" secondItem="�service.characteristic.get(counter - 1).uielement.name�WriteValue" secondAttribute="bottom" constant="6" id="�characteristic.uielement.name�Constraint2"/>
			                                	<constraint firstItem="�characteristic.uielement.name�ReadValue" firstAttribute="leading" secondItem="ContentView" secondAttribute="leading" id="�characteristic.uielement.name�Constraint3"/>
			                                	<constraint firstItem="�characteristic.uielement.name�ReadValue" firstAttribute="top" secondItem="�characteristic.uielement.name�Header" secondAttribute="bottom" constant="8" id="�characteristic.uielement.name�Constraint4"/>
			                                	<constraint firstItem="�characteristic.uielement.name�ReadButton" firstAttribute="leading" secondItem="�characteristic.uielement.name�ReadValue" secondAttribute="trailing" constant="8" id="�characteristic.uielement.name�Constraint5"/>
			                                	<constraint firstItem="�characteristic.uielement.name�ReadButton" firstAttribute="top" secondItem="�service.characteristic.get(counter - 1).uielement.name�ReadButton" secondAttribute="bottom" constant="32" id="�characteristic.uielement.name�Constraint6"/>
			                                	<constraint firstItem="�characteristic.uielement.name�WriteValue" firstAttribute="leading" secondItem="�characteristic.uielement.name�ReadButton" secondAttribute="trailing" constant="8" id="�characteristic.uielement.name�Constraint7"/>
			                                	<constraint firstItem="�characteristic.uielement.name�WriteValue" firstAttribute="top" secondItem="�service.characteristic.get(counter - 1).uielement.name�WriteValue" secondAttribute="bottom" constant="28" id="�characteristic.uielement.name�Constraint8"/>
			                                	<constraint firstItem="�characteristic.uielement.name�NotifyValue" firstAttribute="leading" secondItem="�characteristic.uielement.name�WriteValue" secondAttribute="trailing" constant="8" id="�characteristic.uielement.name�Constraint9"/>
			                                	<constraint firstItem="�characteristic.uielement.name�NotifyValue" firstAttribute="top" secondItem="�service.characteristic.get(counter - 1).uielement.name�NotifyValue" secondAttribute="bottom" constant="41" id="�characteristic.uielement.name�Constraint10"/>
			                                	�ELSE�
			                                	�ENDIF�
			                                	�IF counter == 0 && serviceCounter >= 2�
			                                	<constraint firstItem="�characteristic.uielement.name�Header" firstAttribute="leading" secondItem="ContentView" secondAttribute="leading" id="�characteristic.uielement.name�Constraint1"/>
			                                	<constraint firstItem="�characteristic.uielement.name�Header" firstAttribute="top" secondItem="�sensor.service.get(serviceCounter - 2).characteristic.get(sensor.service.get(serviceCounter - 2).characteristic.size - 1).uielement.name�WriteValue" secondAttribute="bottom" constant="6" id="�characteristic.uielement.name�Constraint2"/>
			                                	<constraint firstItem="�characteristic.uielement.name�ReadValue" firstAttribute="leading" secondItem="ContentView" secondAttribute="leading" id="�characteristic.uielement.name�Constraint3"/>
			                                	<constraint firstItem="�characteristic.uielement.name�ReadValue" firstAttribute="top" secondItem="�characteristic.uielement.name�Header" secondAttribute="bottom" constant="8" id="�characteristic.uielement.name�Constraint4"/>
			                                	<constraint firstItem="�characteristic.uielement.name�ReadButton" firstAttribute="leading" secondItem="�characteristic.uielement.name�ReadValue" secondAttribute="trailing" constant="8" id="�characteristic.uielement.name�Constraint5"/>
			                                	<constraint firstItem="�characteristic.uielement.name�ReadButton" firstAttribute="top" secondItem="�sensor.service.get(serviceCounter - 2).characteristic.get(sensor.service.get(serviceCounter - 2).characteristic.size - 1).uielement.name�ReadButton" secondAttribute="bottom" constant="32" id="�characteristic.uielement.name�Constraint6"/>
			                                	<constraint firstItem="�characteristic.uielement.name�WriteValue" firstAttribute="leading" secondItem="�characteristic.uielement.name�ReadButton" secondAttribute="trailing" constant="8" id="�characteristic.uielement.name�Constraint7"/>
			                                	<constraint firstItem="�characteristic.uielement.name�WriteValue" firstAttribute="top" secondItem="�sensor.service.get(serviceCounter - 2).characteristic.get(sensor.service.get(serviceCounter - 2).characteristic.size - 1).uielement.name�WriteValue" secondAttribute="bottom" constant="28" id="�characteristic.uielement.name�Constraint8"/>
			                                	<constraint firstItem="�characteristic.uielement.name�NotifyValue" firstAttribute="leading" secondItem="�characteristic.uielement.name�WriteValue" secondAttribute="trailing" constant="8" id="�characteristic.uielement.name�Constraint9"/>
			                                	<constraint firstItem="�characteristic.uielement.name�NotifyValue" firstAttribute="top" secondItem="�sensor.service.get(serviceCounter - 2).characteristic.get(sensor.service.get(serviceCounter - 2).characteristic.size - 1).uielement.name�NotifyValue" secondAttribute="bottom" constant="41" id="�characteristic.uielement.name�Constraint10"/>
			                                	�ELSE�
			                                	�ENDIF�
			                                	�IF counter >= 1 && serviceCounter >= 2�
			                                	<constraint firstItem="�characteristic.uielement.name�Header" firstAttribute="leading" secondItem="ContentView" secondAttribute="leading" id="�characteristic.uielement.name�Constraint1"/>
			                                	<constraint firstItem="�characteristic.uielement.name�Header" firstAttribute="top" secondItem="�service.characteristic.get(counter - 1).uielement.name�WriteValue" secondAttribute="bottom" constant="6" id="�characteristic.uielement.name�Constraint2"/>
			                                	<constraint firstItem="�characteristic.uielement.name�ReadValue" firstAttribute="leading" secondItem="ContentView" secondAttribute="leading" id="�characteristic.uielement.name�Constraint3"/>
			                                	<constraint firstItem="�characteristic.uielement.name�ReadValue" firstAttribute="top" secondItem="�characteristic.uielement.name�Header" secondAttribute="bottom" constant="8" id="�characteristic.uielement.name�Constraint4"/>
			                                	<constraint firstItem="�characteristic.uielement.name�ReadButton" firstAttribute="leading" secondItem="�characteristic.uielement.name�ReadValue" secondAttribute="trailing" constant="8" id="�characteristic.uielement.name�Constraint5"/>
			                                	<constraint firstItem="�characteristic.uielement.name�ReadButton" firstAttribute="top" secondItem="�service.characteristic.get(counter - 1).uielement.name�ReadButton" secondAttribute="bottom" constant="32" id="�characteristic.uielement.name�Constraint6"/>
			                                	<constraint firstItem="�characteristic.uielement.name�WriteValue" firstAttribute="leading" secondItem="�characteristic.uielement.name�ReadButton" secondAttribute="trailing" constant="8" id="�characteristic.uielement.name�Constraint7"/>
			                                	<constraint firstItem="�characteristic.uielement.name�WriteValue" firstAttribute="top" secondItem="�service.characteristic.get(counter - 1).uielement.name�WriteValue" secondAttribute="bottom" constant="28" id="�characteristic.uielement.name�Constraint8"/>
			                                	<constraint firstItem="�characteristic.uielement.name�NotifyValue" firstAttribute="leading" secondItem="�characteristic.uielement.name�WriteValue" secondAttribute="trailing" constant="8" id="�characteristic.uielement.name�Constraint9"/>
			                                	<constraint firstItem="�characteristic.uielement.name�NotifyValue" firstAttribute="top" secondItem="�service.characteristic.get(counter - 1).uielement.name�NotifyValue" secondAttribute="bottom" constant="41" id="�characteristic.uielement.name�Constraint10"/>
			                                	�ELSE�
			                                	�ENDIF�
			                                	�{counter = counter + 1; ""}�
			                                	�ELSE�
			                                	�ENDIF�
			                                	�ENDFOR�
			                                	�ENDFOR�
			                               	</constraints>
		                               	</view>
	                               	</subviews>
	                               	<constraints>
	                               		<constraint firstAttribute="bottom" secondItem="ContentView" secondAttribute="bottom" id="BHL-ZT-TEg"/>
	                               	    <constraint firstItem="ContentView" firstAttribute="leading" secondItem="ScrollView" secondAttribute="leading" id="Ch6-zp-6h2"/>
	                               	    <constraint firstAttribute="trailing" secondItem="ContentView" secondAttribute="trailing" id="ZVd-XX-lyS"/>
	                               	    <constraint firstItem="ContentView" firstAttribute="centerX" secondItem="ScrollView" secondAttribute="centerX" id="eiM-AW-XXE"/>
	                               	    <constraint firstItem="ContentView" firstAttribute="top" secondItem="ScrollView" secondAttribute="top" id="hCX-fP-N7X"/>
	                               	    <constraint firstItem="ContentView" firstAttribute="top" secondItem="ScrollView" secondAttribute="top" id="ip6-w8-X9y"/>
	                               	    <constraint firstAttribute="trailing" secondItem="ContentView" secondAttribute="trailing" id="pe4-c5-T3j"/>
	                               	    <constraint firstItem="ContentView" firstAttribute="leading" secondItem="ScrollView" secondAttribute="leading" id="zJE-eD-740"/>
	                               </constraints>
	                            </scrollView>
	                        </subviews>
	                        <color key="backgroundColor" white="1" alpha="1" colorSpace="custom" customColorSpace="genericGamma22GrayColorSpace"/>
	                        <constraints>
	                        	<constraint firstItem="ConnectionStateHeader" firstAttribute="top" secondItem="DeviceIdentifierValue" secondAttribute="bottom" constant="8" id="8YI-Iu-FZr"/>
	                            <constraint firstItem="DeviceNameHeader" firstAttribute="leading" secondItem="6Tk-OE-BBY" secondAttribute="leading" constant="16" id="9gA-3X-FBh"/>
	                            <constraint firstItem="6Tk-OE-BBY" firstAttribute="trailing" secondItem="ScrollView" secondAttribute="trailing" constant="16" id="LwR-gQ-Jxu"/>
	                            <constraint firstItem="DeviceNameValue" firstAttribute="top" secondItem="DeviceNameHeader" secondAttribute="bottom" constant="8" id="RhB-Tf-H1Z"/>
	                            <constraint firstItem="DeviceIdentifierValue" firstAttribute="leading" secondItem="6Tk-OE-BBY" secondAttribute="leading" constant="16" id="UN3-F0-Tdc"/>
	                            <constraint firstItem="DeviceIdentifierValue" firstAttribute="top" secondItem="DeviceIdentifierHeader" secondAttribute="bottom" constant="8" id="Z2j-58-ex5"/>
	                            <constraint firstItem="ScrollView" firstAttribute="leading" secondItem="6Tk-OE-BBY" secondAttribute="leading" constant="16" id="d4W-G1-Rno"/>
	                            <constraint firstItem="DeviceIdentifierHeader" firstAttribute="leading" secondItem="6Tk-OE-BBY" secondAttribute="leading" constant="16" id="ilT-0V-Nco"/>
	                            <constraint firstItem="DeviceIdentifierHeader" firstAttribute="top" secondItem="DeviceNameValue" secondAttribute="bottom" constant="8" id="jg8-uO-Ggy"/>
	                            <constraint firstItem="ConnectionStateHeader" firstAttribute="leading" secondItem="6Tk-OE-BBY" secondAttribute="leading" constant="16" id="lQh-Dh-R7y"/>
	                            <constraint firstItem="ConnectionStateValue" firstAttribute="top" secondItem="ConnectionStateHeader" secondAttribute="bottom" constant="8" id="mjs-C6-gqM"/>
	                            <constraint firstItem="DeviceNameHeader" firstAttribute="top" secondItem="6Tk-OE-BBY" secondAttribute="top" constant="20" id="qqG-yU-GMP"/>
	                            <constraint firstItem="ConnectionStateValue" firstAttribute="leading" secondItem="6Tk-OE-BBY" secondAttribute="leading" constant="16" id="vcQ-og-2Jg"/>
	                            <constraint firstItem="6Tk-OE-BBY" firstAttribute="bottom" secondItem="ScrollView" secondAttribute="bottom" constant="20" id="w7w-tQ-msN"/>
	                            <constraint firstItem="ScrollView" firstAttribute="top" secondItem="ConnectionStateValue" secondAttribute="bottom" constant="32" id="xEI-dD-A5j"/>
	                            <constraint firstItem="DeviceNameValue" firstAttribute="leading" secondItem="6Tk-OE-BBY" secondAttribute="leading" constant="16" id="zUc-sp-gjY"/>
	                       </constraints>
	                       <viewLayoutGuide key="safeArea" id="6Tk-OE-BBY"/>
	                    </view>
	                    <connections>
	                    	<outlet property="connectionStatusLabel" destination="ConnectionStateValue" id="Dcl-8R-MxM"/>
	                    	<outlet property="nameLabel" destination="DeviceNameValue" id="xQh-h0-zxS"/>
	                    	<outlet property="uuidLabel" destination="DeviceIdentifierValue" id="tOT-x5-PgN"/>
	                    	�FOR service : sensor.service�
	                    	�FOR characteristic : service.characteristic�
	                    	�IF characteristic.read && characteristic.uielement !== null�
	                    	<outlet property="readValue�characteristic.uielement.name�" destination="�characteristic.uielement.name�ReadValue" id="�characteristic.uielement.name�ReadValueOutlet"/>
	                    	�ELSE�
	                    	�ENDIF�
	                    	�IF characteristic.write && characteristic.uielement !== null�
	                    	<outlet property="writeValue�characteristic.uielement.name�" destination="�characteristic.uielement.name�WriteValue" id="�characteristic.uielement.name�WrtieValueOutlet"/>
	                    	�ELSE�
	                    	�ENDIF�
	                    	�IF characteristic.notification && characteristic.uielement !== null�
	                    	<outlet property="notifyValue�characteristic.uielement.name�" destination="�characteristic.uielement.name�NotifyValue" id="�characteristic.uielement.name�NotifyValueOutlet"/>
	                    	�ELSE�
	                    	�ENDIF�
	                    	�ENDFOR�
	                    	�ENDFOR�
	                    </connections>
	                </viewController>
	                <placeholder placeholderIdentifier="IBFirstResponder" id="4z1-SZ-xit" userLabel="First Responder" sceneMemberID="firstResponder"/>
	            </objects>
	            <point key="canvasLocation" x="2680.8000000000002" y="-407.0464767616192"/>
	        </scene>
	    </scenes>
	</document>
	'''
	
	/**
	 * Generate-method for the 'Info.plist' file. This file contains general information about the application.
	 */
	def generateInfo() '''
	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE plist PUBLIC "-//Apple//DTD PLIST 1.0//EN" "http://www.apple.com/DTDs/PropertyList-1.0.dtd">
	<plist version="1.0">
	<dict>
		<key>NSBluetoothAlwaysUsageDescription</key>
		<string>$(PRODUCT_NAME) uses Bluetooth</string>
		<key>CFBundleDevelopmentRegion</key>
		<string>$(DEVELOPMENT_LANGUAGE)</string>
		<key>CFBundleExecutable</key>
		<string>$(EXECUTABLE_NAME)</string>
		<key>CFBundleIdentifier</key>
		<string>$(PRODUCT_BUNDLE_IDENTIFIER)</string>
		<key>CFBundleInfoDictionaryVersion</key>
		<string>6.0</string>
		<key>CFBundleName</key>
		<string>$(PRODUCT_NAME)</string>
		<key>CFBundlePackageType</key>
		<string>$(PRODUCT_BUNDLE_PACKAGE_TYPE)</string>
		<key>CFBundleShortVersionString</key>
		<string>1.0</string>
		<key>CFBundleVersion</key>
		<string>1</string>
		<key>LSRequiresIPhoneOS</key>
		<true/>
		<key>UIApplicationSceneManifest</key>
		<dict>
			<key>UIApplicationSupportsMultipleScenes</key>
			<false/>
			<key>UISceneConfigurations</key>
			<dict>
				<key>UIWindowSceneSessionRoleApplication</key>
				<array>
					<dict>
						<key>UISceneConfigurationName</key>
						<string>Default Configuration</string>
						<key>UISceneDelegateClassName</key>
						<string>$(PRODUCT_MODULE_NAME).SceneDelegate</string>
						<key>UISceneStoryboardFile</key>
						<string>Main</string>
					</dict>
				</array>
			</dict>
		</dict>
		<key>UILaunchStoryboardName</key>
		<string>LaunchScreen</string>
		<key>UIMainStoryboardFile</key>
		<string>Main</string>
		<key>UIRequiredDeviceCapabilities</key>
		<array>
			<string>armv7</string>
		</array>
		<key>UISupportedInterfaceOrientations</key>
		<array>
			<string>UIInterfaceOrientationPortrait</string>
			<string>UIInterfaceOrientationLandscapeLeft</string>
			<string>UIInterfaceOrientationLandscapeRight</string>
		</array>
		<key>UISupportedInterfaceOrientations~ipad</key>
		<array>
			<string>UIInterfaceOrientationPortrait</string>
			<string>UIInterfaceOrientationPortraitUpsideDown</string>
			<string>UIInterfaceOrientationLandscapeLeft</string>
			<string>UIInterfaceOrientationLandscapeRight</string>
		</array>
	</dict>
	</plist>
	'''
}