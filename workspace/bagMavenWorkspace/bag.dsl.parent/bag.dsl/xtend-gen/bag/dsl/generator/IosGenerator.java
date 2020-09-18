package bag.dsl.generator;

import bag.model.bagEcore.App;
import bag.model.bagEcore.Characteristic;
import bag.model.bagEcore.NameFilter;
import bag.model.bagEcore.Sensor;
import bag.model.bagEcore.Service;
import bag.model.bagEcore.UiElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.DoubleExtensions;

/**
 * The generator file for all iOS based generate-methods.
 */
@SuppressWarnings("all")
public class IosGenerator {
  private Integer counter = Integer.valueOf(0);
  
  private Integer serviceCounter = Integer.valueOf(0);
  
  private Integer yHeaderLabel = Integer.valueOf(8);
  
  private Integer yReadLabel = Integer.valueOf(37);
  
  private Integer yReadButton = Integer.valueOf(32);
  
  private Integer yWriteTextField = Integer.valueOf(30);
  
  private Integer yNotifyLabel = Integer.valueOf(37);
  
  private Double contentViewHeight = Double.valueOf(62.5);
  
  private Integer characteristicsAmmount = Integer.valueOf(0);
  
  /**
   * Generate-method for the 'AppDelegate.swift' file. This file contains a set of methods that you use to manage shared behaviors for your application.
   */
  public CharSequence generateAppDelegate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import UIKit");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@UIApplicationMain");
    _builder.newLine();
    _builder.append("class AppDelegate: UIResponder, UIApplicationDelegate {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?) -> Bool {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Override point for customization after application launch.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return true");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// MARK: UISceneSession Lifecycle");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func application(_ application: UIApplication, configurationForConnecting connectingSceneSession: UISceneSession, options: UIScene.ConnectionOptions) -> UISceneConfiguration {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Called when a new scene session is being created.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Use this method to select a configuration to create the new scene with.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return UISceneConfiguration(name: \"Default Configuration\", sessionRole: connectingSceneSession.role)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func application(_ application: UIApplication, didDiscardSceneSessions sceneSessions: Set<UISceneSession>) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Called when the user discards a scene session.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// If any sessions were discarded while the application was not running, this will be called shortly after application:didFinishLaunchingWithOptions.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Use this method to release any resources that were specific to the discarded scenes, as they will not return.");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generate-method for the 'SceneDelegate.swift' file. This file contains also general settings of the application.
   */
  public CharSequence generateSceneDelegate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import UIKit");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class SceneDelegate: UIResponder, UIWindowSceneDelegate {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var window: UIWindow?");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func scene(_ scene: UIScene, willConnectTo session: UISceneSession, options connectionOptions: UIScene.ConnectionOptions) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Use this method to optionally configure and attach the UIWindow `window` to the provided UIWindowScene `scene`.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// If using a storyboard, the `window` property will automatically be initialized and attached to the scene.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// This delegate does not imply the connecting scene or session are new (see `application:configurationForConnectingSceneSession` instead).");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("guard let _ = (scene as? UIWindowScene) else { return }");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func sceneDidDisconnect(_ scene: UIScene) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Called as the scene is being released by the system.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// This occurs shortly after the scene enters the background, or when its session is discarded.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Release any resources associated with this scene that can be re-created the next time the scene connects.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// The scene may re-connect later, as its session was not neccessarily discarded (see `application:didDiscardSceneSessions` instead).");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func sceneDidBecomeActive(_ scene: UIScene) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Called when the scene has moved from an inactive state to an active state.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Use this method to restart any tasks that were paused (or not yet started) when the scene was inactive.");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func sceneWillResignActive(_ scene: UIScene) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Called when the scene will move from an active state to an inactive state.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// This may occur due to temporary interruptions (ex. an incoming phone call).");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func sceneWillEnterForeground(_ scene: UIScene) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Called as the scene transitions from the background to the foreground.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Use this method to undo the changes made on entering the background.");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func sceneDidEnterBackground(_ scene: UIScene) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Called as the scene transitions from the foreground to the background.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Use this method to save data, release shared resources, and store enough scene-specific state information");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// to restore the scene back to its current state.");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generate-method for the 'ItemsViewController.swift' file. This file contains the functionality of the list activity in which the nearby BLE devices are listed.
   */
  public CharSequence generateItemsViewController() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import UIKit");
    _builder.newLine();
    _builder.append("import Foundation");
    _builder.newLine();
    _builder.append("import CoreBluetooth");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class ItemsViewController: UITableViewController {");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var manager: BLEManager!");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var device: CBPeripheral!");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@IBAction func refreshClicked(_ sender: Any) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("manager.manager.stopScan()");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("manager.devices.removeAll()");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("manager.items.removeAll()");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("updateTableData()");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("manager.manager.scanForPeripherals(withServices: nil)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("override func viewWillAppear(_ animated: Bool) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super.viewWillAppear(animated)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("manager = BLEManager()");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("manager.initBLEManager(controller: self)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("override func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return manager.items.keys.count");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("override func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("let cell = tableView.dequeueReusableCell(withIdentifier: \"ItemCell\", for: indexPath)");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Configure the cell...");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if let item = itemForIndexPath(indexPath){");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("cell.textLabel?.text = item[\"name\"] as? String");
    _builder.newLine();
    _builder.append("            ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if let rssi = item[\"rssi\"] as? Int {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("cell.detailTextLabel?.text = \"\\(rssi.description) dBm\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("cell.detailTextLabel?.text = \"\"");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return cell");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func itemForIndexPath(_ indexPath: IndexPath) -> [String: Any]?{");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if indexPath.row > manager.items.keys.count{");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return nil");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("return Array(manager.items.values)[indexPath.row]");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("override func tableView(_ tableView: UITableView, didSelectRowAt indexPath: IndexPath) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("let item = itemForIndexPath(indexPath)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("print(item?[\"name\"]! as Any)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("print(item?[\"rssi\"]! as Any)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("print(item?[\"uuid\"]! as Any)");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for dev in manager.devices {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("if dev.identifier.uuidString == item?[\"uuid\"]! as? String {");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("device = dev");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("let storyboard = UIStoryboard(name: \"Main\", bundle: Bundle.main)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("let destination = storyboard.instantiateViewController(withIdentifier: \"ViewController\") as! ViewController");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("destination.device = device");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("destination.manager = manager");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("manager.manager.stopScan()");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("manager.manager.connect(device)");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("navigationController?.pushViewController(destination, animated: true)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func updateTableData() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("tableView.reloadData()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generate-method for the 'BLEManager.swift' file. In this file the general BLE functionality is described which is necessary for the communication between the application and a BLE device.
   */
  public CharSequence generateBLEManager(final App app) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import CoreBluetooth");
    _builder.newLine();
    _builder.append("import UIKit");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class BLEManager: NSObject, CBCentralManagerDelegate, CBPeripheralDelegate {");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var manager: CBCentralManager!");
    _builder.newLine();
    {
      EList<Service> _service = app.getSensor().getService();
      for(final Service service : _service) {
        {
          EList<Characteristic> _characteristic = service.getCharacteristic();
          for(final Characteristic characteristic : _characteristic) {
            _builder.append("    ");
            _builder.append("let ");
            String _name = characteristic.getName();
            _builder.append(_name, "    ");
            _builder.append("CBUUID = CBUUID(string: \"");
            String _uuid = characteristic.getUuid();
            _builder.append(_uuid, "    ");
            _builder.append("\")");
            _builder.newLineIfNotEmpty();
            _builder.append("    ");
            _builder.append("var ");
            String _name_1 = characteristic.getName();
            _builder.append(_name_1, "    ");
            _builder.append("Characteristic:CBCharacteristic!");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var tableViewController: ItemsViewController!");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var viewController: ViewController!");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var devices = [CBPeripheral]()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var items = [String: [String: Any]]()");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func initBLEManager(controller: ItemsViewController) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("tableViewController = controller");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("manager = CBCentralManager(delegate: self, queue: nil)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func centralManagerDidUpdateState(_ central: CBCentralManager){");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if central.state == .poweredOn{");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("manager.scanForPeripherals(withServices: nil)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func centralManager(_ central: CBCentralManager, didDiscover peripheral: CBPeripheral, advertisementData: [String : Any], rssi RSSI: NSNumber){");
    _builder.newLine();
    {
      NameFilter _namefilter = app.getNamefilter();
      boolean _tripleNotEquals = (_namefilter != null);
      if (_tripleNotEquals) {
        _builder.append("        ");
        _builder.append("if peripheral.name != nil {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("\t");
        _builder.append("let range = NSRange(location: 0, length: peripheral.name!.utf16.count)");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("let regex = try! NSRegularExpression(pattern: \"");
        String _regEx = app.getNamefilter().getName().getRegEx();
        _builder.append(_regEx, "            ");
        _builder.append("\")");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("if regex.firstMatch(in: peripheral.name!, options: [], range: range) != nil {");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    \t");
        _builder.append("devices.append(peripheral)");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("        ");
        _builder.append("didReadPeripheral(peripheral, rssi: RSSI)");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("}");
        _builder.newLine();
      } else {
        _builder.append("        ");
        _builder.append("devices.append(peripheral)");
        _builder.newLine();
        _builder.append("        ");
        _builder.append("didReadPeripheral(peripheral, rssi: RSSI)");
        _builder.newLine();
      }
    }
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func didReadPeripheral(_ peripheral: CBPeripheral, rssi: NSNumber){");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if let name = peripheral.name{");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("items[name] = [");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("\"name\":name,");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("\"rssi\":rssi,");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("\"uuid\":peripheral.identifier.uuidString");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("]");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("tableViewController.updateTableData()");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func centralManager(_ central: CBCentralManager, didConnect peripheral: CBPeripheral){");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("print(\"Connected to device \\(peripheral.name ?? \"Device Name\")\")");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("viewController.connectionStatusLabel.text = \"Connected\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("peripheral.delegate = self");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("peripheral.discoverServices(nil)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func peripheral(_ peripheral: CBPeripheral, didDiscoverServices error: Error?) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("guard let services = peripheral.services else { return }");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for service in services {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("print(service)");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("peripheral.discoverCharacteristics(nil, for: service)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func peripheral(_ peripheral: CBPeripheral, didDiscoverCharacteristicsFor service: CBService, error: Error?) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("guard let characteristics = service.characteristics else { return }");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("for characteristic in characteristics {");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("print(characteristic)");
    _builder.newLine();
    _builder.append("            ");
    _builder.newLine();
    {
      EList<Service> _service_1 = app.getSensor().getService();
      for(final Service service_1 : _service_1) {
        {
          EList<Characteristic> _characteristic_1 = service_1.getCharacteristic();
          for(final Characteristic characteristic_1 : _characteristic_1) {
            _builder.append("            ");
            _builder.append("if(characteristic.uuid == ");
            String _name_2 = characteristic_1.getName();
            _builder.append(_name_2, "            ");
            _builder.append("CBUUID) {");
            _builder.newLineIfNotEmpty();
            _builder.append("            ");
            _builder.append("\t");
            String _name_3 = characteristic_1.getName();
            _builder.append(_name_3, "            \t");
            _builder.append("Characteristic = characteristic");
            _builder.newLineIfNotEmpty();
            {
              boolean _isRead = characteristic_1.isRead();
              if (_isRead) {
                _builder.append("            ");
                _builder.append("\t");
                _builder.append("peripheral.readValue(for: ");
                String _name_4 = characteristic_1.getName();
                _builder.append(_name_4, "            \t");
                _builder.append("Characteristic)");
                _builder.newLineIfNotEmpty();
              } else {
              }
            }
            {
              boolean _isNotification = characteristic_1.isNotification();
              if (_isNotification) {
                _builder.append("            ");
                _builder.append("\t");
                _builder.append("peripheral.setNotifyValue(true, for: ");
                String _name_5 = characteristic_1.getName();
                _builder.append(_name_5, "            \t");
                _builder.append("Characteristic)");
                _builder.newLineIfNotEmpty();
              } else {
              }
            }
            _builder.append("            ");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("        ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func peripheral(_ peripheral: CBPeripheral, didUpdateValueFor characteristic: CBCharacteristic, error: Error?) {");
    _builder.newLine();
    _builder.append("    \t");
    _builder.newLine();
    {
      EList<Service> _service_2 = app.getSensor().getService();
      for(final Service service_2 : _service_2) {
        {
          EList<Characteristic> _characteristic_2 = service_2.getCharacteristic();
          for(final Characteristic characteristic_2 : _characteristic_2) {
            _builder.append("    \t");
            _builder.append("if(characteristic == ");
            String _name_6 = characteristic_2.getName();
            _builder.append(_name_6, "    \t");
            _builder.append("Characteristic) {");
            _builder.newLineIfNotEmpty();
            _builder.append("    \t");
            _builder.append("\t");
            _builder.append("// TODO: Add code to handle received data and do conversion if needed");
            _builder.newLine();
            _builder.append("    \t");
            _builder.append("\t");
            _builder.append("let value = characteristic.value![0]");
            _builder.newLine();
            {
              if ((characteristic_2.isRead() && (characteristic_2.getUielement() != null))) {
                _builder.append("    \t");
                _builder.append("\t");
                _builder.append("viewController.readValue");
                String _name_7 = characteristic_2.getUielement().getName();
                _builder.append(_name_7, "    \t\t");
                _builder.append(".text = \"\\(value)\"");
                _builder.newLineIfNotEmpty();
              } else {
              }
            }
            {
              if ((characteristic_2.isWrite() && (characteristic_2.getUielement() != null))) {
                _builder.append("    \t");
                _builder.append("\t");
                _builder.append("viewController.writeValue");
                String _name_8 = characteristic_2.getUielement().getName();
                _builder.append(_name_8, "    \t\t");
                _builder.append(".text = \"\\(value)\"");
                _builder.newLineIfNotEmpty();
              } else {
              }
            }
            {
              if ((characteristic_2.isNotification() && (characteristic_2.getUielement() != null))) {
                _builder.append("    \t");
                _builder.append("\t");
                _builder.append("viewController.notifyValue");
                String _name_9 = characteristic_2.getUielement().getName();
                _builder.append(_name_9, "    \t\t");
                _builder.append(".text = \"\\(value)\"");
                _builder.newLineIfNotEmpty();
              } else {
              }
            }
            _builder.append("    \t");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func centralManager(_ central: CBCentralManager, didDisconnectPeripheral peripheral: CBPeripheral, error: Error?) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("print(\"Disconnected from device \\(peripheral.name ?? \"DeviceName\")\")");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("viewController.connectionStatusLabel.text = \"Disconnected\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("func registerViewController(vc: ViewController) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("viewController = vc");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generate-method for the 'ViewController.swift' file. This file contains the main functionality of the application.
   */
  public CharSequence generateViewController(final Sensor sensor) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import UIKit");
    _builder.newLine();
    _builder.append("import CoreBluetooth");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class ViewController: UIViewController {");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@IBOutlet weak var nameLabel: UILabel!");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@IBOutlet weak var uuidLabel: UILabel!");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@IBOutlet weak var connectionStatusLabel: UILabel!");
    _builder.newLine();
    {
      EList<Service> _service = sensor.getService();
      for(final Service service : _service) {
        {
          EList<Characteristic> _characteristic = service.getCharacteristic();
          for(final Characteristic characteristic : _characteristic) {
            {
              if ((characteristic.isRead() && (characteristic.getUielement() != null))) {
                _builder.append("    ");
                _builder.append("@IBOutlet weak var readValue");
                String _name = characteristic.getUielement().getName();
                _builder.append(_name, "    ");
                _builder.append(": UILabel! ");
                {
                  String _description = characteristic.getUielement().getDescription();
                  boolean _tripleNotEquals = (_description != null);
                  if (_tripleNotEquals) {
                    _builder.append(" // ");
                    String _description_1 = characteristic.getUielement().getDescription();
                    _builder.append(_description_1, "    ");
                  } else {
                  }
                }
                _builder.newLineIfNotEmpty();
              } else {
              }
            }
            {
              if ((characteristic.isWrite() && (characteristic.getUielement() != null))) {
                _builder.append("    ");
                _builder.append("@IBOutlet weak var writeValue");
                String _name_1 = characteristic.getUielement().getName();
                _builder.append(_name_1, "    ");
                _builder.append(": UITextField! ");
                {
                  String _description_2 = characteristic.getUielement().getDescription();
                  boolean _tripleNotEquals_1 = (_description_2 != null);
                  if (_tripleNotEquals_1) {
                    _builder.append(" // ");
                    String _description_3 = characteristic.getUielement().getDescription();
                    _builder.append(_description_3, "    ");
                  } else {
                  }
                }
                _builder.newLineIfNotEmpty();
              } else {
              }
            }
            {
              if ((characteristic.isNotification() && (characteristic.getUielement() != null))) {
                _builder.append("    ");
                _builder.append("@IBOutlet weak var notifyValue");
                String _name_2 = characteristic.getUielement().getName();
                _builder.append(_name_2, "    ");
                _builder.append(": UILabel! ");
                {
                  String _description_4 = characteristic.getUielement().getDescription();
                  boolean _tripleNotEquals_2 = (_description_4 != null);
                  if (_tripleNotEquals_2) {
                    _builder.append(" // ");
                    String _description_5 = characteristic.getUielement().getDescription();
                    _builder.append(_description_5, "    ");
                  } else {
                  }
                }
                _builder.newLineIfNotEmpty();
              } else {
              }
            }
          }
        }
      }
    }
    _builder.append("    ");
    _builder.append("var name:String = \"\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var uuid:String = \"\"");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var device: CBPeripheral!");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("var manager: BLEManager!");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("override func viewDidLoad() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("super.viewDidLoad()");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Dismiss keyboard when touching outside an textfield");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("let tap: UITapGestureRecognizer = UITapGestureRecognizer(target: self, action: #selector(UIInputViewController.dismissKeyboard))");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("view.addGestureRecognizer(tap)");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("manager.registerViewController(vc: self)");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("name = device.name ?? \"n.a.\"");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("uuid = device.identifier.uuidString");
    _builder.newLine();
    _builder.append("        ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("nameLabel.text = name");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("uuidLabel.text = uuid");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("// Calls this function when the tap is recognized.");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("@objc func dismissKeyboard() {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("// Causes the view (or one of its embedded text fields) to resign the first responder status.");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("view.endEditing(true)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("override func viewWillDisappear(_ animated: Bool) {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("manager.manager.cancelPeripheralConnection(device)");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    {
      EList<Service> _service_1 = sensor.getService();
      for(final Service service_1 : _service_1) {
        {
          EList<Characteristic> _characteristic_1 = service_1.getCharacteristic();
          for(final Characteristic characteristic_1 : _characteristic_1) {
            {
              if ((characteristic_1.isRead() && (characteristic_1.getUielement() != null))) {
                _builder.append("    ");
                _builder.append("@IBAction func readButton");
                String _name_3 = characteristic_1.getUielement().getName();
                _builder.append(_name_3, "    ");
                _builder.append("Clicked(_ sender: Any) {");
                _builder.newLineIfNotEmpty();
                _builder.append("    ");
                _builder.append("\t");
                _builder.append("device.readValue(for: manager.");
                String _name_4 = characteristic_1.getName();
                _builder.append(_name_4, "    \t");
                _builder.append("Characteristic)");
                _builder.newLineIfNotEmpty();
                _builder.append("    ");
                _builder.append("}");
                _builder.newLine();
              } else {
              }
            }
            {
              if ((characteristic_1.isWrite() && (characteristic_1.getUielement() != null))) {
                _builder.append("    ");
                _builder.append("@IBAction func writeTextField");
                String _name_5 = characteristic_1.getUielement().getName();
                _builder.append(_name_5, "    ");
                _builder.append("SentClicked(_ sender: UITextField) {");
                _builder.newLineIfNotEmpty();
                _builder.append("    ");
                _builder.append("\t");
                _builder.append("// TODO: Add code to receive input from TextField, convert it if necessary and send it to the device");
                _builder.newLine();
                _builder.append("    ");
                _builder.append("\t");
                _builder.append("let input = Int(sender.text!)");
                _builder.newLine();
                _builder.append("    ");
                _builder.append("\t");
                _builder.append("let value: [UInt8] = [UInt8(input!)]");
                _builder.newLine();
                _builder.append("    ");
                _builder.append("\t");
                _builder.append("device.writeValue(Data(_: value), for: manager.");
                String _name_6 = characteristic_1.getName();
                _builder.append(_name_6, "    \t");
                _builder.append("Characteristic, type: CBCharacteristicWriteType.withResponse)");
                _builder.newLineIfNotEmpty();
                _builder.append("    ");
                _builder.append("\t");
                _builder.append("sender.resignFirstResponder()");
                _builder.newLine();
                _builder.append("    ");
                _builder.append("}");
                _builder.newLine();
              } else {
              }
            }
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generate-method for the 'Main.storyboard' file. This file describes the layout of the whole application. With the use of the helper variables
   * elements can be added relatively to existing elements.
   */
  public CharSequence generateStoryboard(final Sensor sensor) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    String _xblockexpression = null;
    {
      this.yHeaderLabel = Integer.valueOf(8);
      _xblockexpression = "";
    }
    _builder.append(_xblockexpression, "\t");
    _builder.newLineIfNotEmpty();
    String _xblockexpression_1 = null;
    {
      this.yReadLabel = Integer.valueOf(37);
      _xblockexpression_1 = "";
    }
    _builder.append(_xblockexpression_1);
    _builder.newLineIfNotEmpty();
    String _xblockexpression_2 = null;
    {
      this.yReadButton = Integer.valueOf(32);
      _xblockexpression_2 = "";
    }
    _builder.append(_xblockexpression_2);
    _builder.newLineIfNotEmpty();
    String _xblockexpression_3 = null;
    {
      this.yWriteTextField = Integer.valueOf(30);
      _xblockexpression_3 = "";
    }
    _builder.append(_xblockexpression_3);
    _builder.newLineIfNotEmpty();
    String _xblockexpression_4 = null;
    {
      this.yNotifyLabel = Integer.valueOf(37);
      _xblockexpression_4 = "";
    }
    _builder.append(_xblockexpression_4);
    _builder.newLineIfNotEmpty();
    String _xblockexpression_5 = null;
    {
      this.counter = Integer.valueOf(0);
      _xblockexpression_5 = "";
    }
    _builder.append(_xblockexpression_5);
    _builder.newLineIfNotEmpty();
    String _xblockexpression_6 = null;
    {
      this.serviceCounter = Integer.valueOf(0);
      _xblockexpression_6 = "";
    }
    _builder.append(_xblockexpression_6);
    _builder.newLineIfNotEmpty();
    String _xblockexpression_7 = null;
    {
      this.contentViewHeight = Double.valueOf(62.5);
      _xblockexpression_7 = "";
    }
    _builder.append(_xblockexpression_7);
    _builder.newLineIfNotEmpty();
    String _xblockexpression_8 = null;
    {
      this.characteristicsAmmount = Integer.valueOf(0);
      _xblockexpression_8 = "";
    }
    _builder.append(_xblockexpression_8);
    _builder.newLineIfNotEmpty();
    {
      EList<Service> _service = sensor.getService();
      for(final Service service : _service) {
        {
          EList<Characteristic> _characteristic = service.getCharacteristic();
          for(final Characteristic characteristic : _characteristic) {
            String _xblockexpression_9 = null;
            {
              this.characteristicsAmmount = Integer.valueOf(((this.characteristicsAmmount).intValue() + 1));
              _xblockexpression_9 = "";
            }
            _builder.append(_xblockexpression_9);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    String _xblockexpression_10 = null;
    {
      double _multiply = DoubleExtensions.operator_multiply(this.contentViewHeight, this.characteristicsAmmount);
      this.contentViewHeight = Double.valueOf(_multiply);
      _xblockexpression_10 = "";
    }
    _builder.append(_xblockexpression_10);
    _builder.newLineIfNotEmpty();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<document type=\"com.apple.InterfaceBuilder3.CocoaTouch.Storyboard.XIB\" version=\"3.0\" toolsVersion=\"16096\" targetRuntime=\"iOS.CocoaTouch\" propertyAccessControl=\"none\" useAutolayout=\"YES\" useTraitCollections=\"YES\" colorMatched=\"YES\" initialViewController=\"SPo-S7-a3q\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<device id=\"retina4_7\" orientation=\"portrait\" appearance=\"light\"/>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<dependencies>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<plugIn identifier=\"com.apple.InterfaceBuilder.IBCocoaTouchPlugin\" version=\"16087\"/>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<capability name=\"documents saved in the Xcode 8 format\" minToolsVersion=\"8.0\"/>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</dependencies>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<scenes>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<!--Devices-->");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<scene sceneID=\"sMT-hF-zCY\">");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<objects>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<tableViewController id=\"aDB-wg-86B\" customClass=\"ItemsViewController\" customModule=\"Reference\" customModuleProvider=\"target\" sceneMemberID=\"viewController\">");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<tableView key=\"view\" clipsSubviews=\"YES\" contentMode=\"scaleToFill\" alwaysBounceVertical=\"YES\" dataMode=\"prototypes\" style=\"plain\" separatorStyle=\"default\" rowHeight=\"44\" sectionHeaderHeight=\"28\" sectionFooterHeight=\"28\" id=\"bdi-n4-G5H\">");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<rect key=\"frame\" x=\"0.0\" y=\"0.0\" width=\"375\" height=\"667\"/>");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<autoresizingMask key=\"autoresizingMask\" widthSizable=\"YES\" heightSizable=\"YES\"/>");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<color key=\"backgroundColor\" white=\"1\" alpha=\"1\" colorSpace=\"calibratedWhite\"/>");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<prototypes>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<tableViewCell clipsSubviews=\"YES\" contentMode=\"scaleToFill\" selectionStyle=\"default\" indentationWidth=\"10\" reuseIdentifier=\"ItemCell\" textLabel=\"Vem-bU-Ccv\" detailTextLabel=\"hm0-yO-FXd\" style=\"IBUITableViewCellStyleValue1\" id=\"Ka1-f4-jlc\">");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<rect key=\"frame\" x=\"0.0\" y=\"28\" width=\"375\" height=\"44\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<autoresizingMask key=\"autoresizingMask\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<tableViewCellContentView key=\"contentView\" opaque=\"NO\" clipsSubviews=\"YES\" multipleTouchEnabled=\"YES\" contentMode=\"center\" tableViewCell=\"Ka1-f4-jlc\" id=\"Txd-dJ-ZvB\">");
    _builder.newLine();
    _builder.append("                                    ");
    _builder.append("<rect key=\"frame\" x=\"0.0\" y=\"0.0\" width=\"375\" height=\"44\"/>");
    _builder.newLine();
    _builder.append("                                    ");
    _builder.append("<autoresizingMask key=\"autoresizingMask\"/>");
    _builder.newLine();
    _builder.append("                                    ");
    _builder.append("<subviews>");
    _builder.newLine();
    _builder.append("                                        ");
    _builder.append("<label opaque=\"NO\" multipleTouchEnabled=\"YES\" contentMode=\"left\" text=\"Title\" textAlignment=\"natural\" lineBreakMode=\"tailTruncation\" baselineAdjustment=\"alignBaselines\" adjustsFontSizeToFit=\"NO\" id=\"Vem-bU-Ccv\">");
    _builder.newLine();
    _builder.append("                                            ");
    _builder.append("<rect key=\"frame\" x=\"16\" y=\"12\" width=\"33.5\" height=\"20.5\"/>");
    _builder.newLine();
    _builder.append("                                            ");
    _builder.append("<autoresizingMask key=\"autoresizingMask\"/>");
    _builder.newLine();
    _builder.append("                                            ");
    _builder.append("<fontDescription key=\"fontDescription\" type=\"system\" pointSize=\"17\"/>");
    _builder.newLine();
    _builder.append("                                            ");
    _builder.append("<nil key=\"textColor\"/>");
    _builder.newLine();
    _builder.append("                                            ");
    _builder.append("<nil key=\"highlightedColor\"/>");
    _builder.newLine();
    _builder.append("                                        ");
    _builder.append("</label>");
    _builder.newLine();
    _builder.append("                                        ");
    _builder.append("<label opaque=\"NO\" multipleTouchEnabled=\"YES\" contentMode=\"left\" text=\"Detail\" textAlignment=\"right\" lineBreakMode=\"tailTruncation\" baselineAdjustment=\"alignBaselines\" adjustsFontSizeToFit=\"NO\" id=\"hm0-yO-FXd\">");
    _builder.newLine();
    _builder.append("                                            ");
    _builder.append("<rect key=\"frame\" x=\"315\" y=\"12\" width=\"44\" height=\"20.5\"/>");
    _builder.newLine();
    _builder.append("                                            ");
    _builder.append("<autoresizingMask key=\"autoresizingMask\"/>");
    _builder.newLine();
    _builder.append("                                            ");
    _builder.append("<fontDescription key=\"fontDescription\" type=\"system\" pointSize=\"17\"/>");
    _builder.newLine();
    _builder.append("                                            ");
    _builder.append("<nil key=\"textColor\"/>");
    _builder.newLine();
    _builder.append("                                            ");
    _builder.append("<nil key=\"highlightedColor\"/>");
    _builder.newLine();
    _builder.append("                                        ");
    _builder.append("</label>");
    _builder.newLine();
    _builder.append("                                    ");
    _builder.append("</subviews>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("</tableViewCellContentView>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("</tableViewCell>");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("</prototypes>");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<connections>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<outlet property=\"dataSource\" destination=\"aDB-wg-86B\" id=\"2rO-V7-py2\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<outlet property=\"delegate\" destination=\"aDB-wg-86B\" id=\"ocf-vz-vTa\"/>");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("</connections>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("</tableView>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<navigationItem key=\"navigationItem\" title=\"Devices\" id=\"V1X-fa-HfY\">");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<barButtonItem key=\"rightBarButtonItem\" title=\"Refresh\" style=\"plain\" id=\"gKp-Ev-6jC\">");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<connections>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<action selector=\"refreshClicked:\" destination=\"aDB-wg-86B\" id=\"gbS-58-1eW\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("</connections>");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("</barButtonItem>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("</navigationItem>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("</tableViewController>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<placeholder placeholderIdentifier=\"IBFirstResponder\" id=\"d7T-4W-hPF\" userLabel=\"First Responder\" sceneMemberID=\"firstResponder\"/>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</objects>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<point key=\"canvasLocation\" x=\"1760.8\" y=\"-407.0464767616192\"/>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</scene>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<!--Navigation Controller-->");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<scene sceneID=\"Mh2-Q9-xFY\">");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<objects>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<navigationController automaticallyAdjustsScrollViewInsets=\"NO\" id=\"SPo-S7-a3q\" sceneMemberID=\"viewController\">");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<tabBarItem key=\"tabBarItem\" title=\"\" systemItem=\"search\" id=\"Gsf-ZN-ymL\"/>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<toolbarItems/>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<navigationBar key=\"navigationBar\" contentMode=\"scaleToFill\" id=\"rj6-Gf-Y4A\">");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<rect key=\"frame\" x=\"0.0\" y=\"0.0\" width=\"375\" height=\"44\"/>");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<autoresizingMask key=\"autoresizingMask\"/>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("</navigationBar>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<nil name=\"viewControllers\"/>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<connections>");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<segue destination=\"aDB-wg-86B\" kind=\"relationship\" relationship=\"rootViewController\" id=\"B5g-1y-Eli\"/>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("</connections>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("</navigationController>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<placeholder placeholderIdentifier=\"IBFirstResponder\" id=\"vGc-4t-7k5\" userLabel=\"First Responder\" sceneMemberID=\"firstResponder\"/>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</objects>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<point key=\"canvasLocation\" x=\"821.60000000000002\" y=\"-407.0464767616192\"/>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</scene>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<!--View Controller-->");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<scene sceneID=\"1mi-mJ-drX\">");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<objects>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<viewController storyboardIdentifier=\"ViewController\" id=\"mcc-oX-7Sy\" customClass=\"ViewController\" customModule=\"Reference\" customModuleProvider=\"target\" sceneMemberID=\"viewController\">");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<view key=\"view\" contentMode=\"scaleToFill\" id=\"HmF-PQ-hoi\">");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<rect key=\"frame\" x=\"0.0\" y=\"0.0\" width=\"375\" height=\"667\"/>");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<autoresizingMask key=\"autoresizingMask\" widthSizable=\"YES\" heightSizable=\"YES\"/>");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<subviews>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<label opaque=\"NO\" userInteractionEnabled=\"NO\" contentMode=\"left\" horizontalHuggingPriority=\"251\" verticalHuggingPriority=\"251\" text=\"Device Name\" lineBreakMode=\"tailTruncation\" baselineAdjustment=\"alignBaselines\" adjustsFontSizeToFit=\"NO\" translatesAutoresizingMaskIntoConstraints=\"NO\" id=\"DeviceNameHeader\">");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<rect key=\"frame\" x=\"16\" y=\"8\" width=\"107\" height=\"21\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<fontDescription key=\"fontDescription\" type=\"boldSystem\" pointSize=\"17\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<nil key=\"textColor\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<nil key=\"highlightedColor\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("</label>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<label opaque=\"NO\" userInteractionEnabled=\"NO\" contentMode=\"left\" horizontalHuggingPriority=\"251\" verticalHuggingPriority=\"251\" text=\"n.a.\" textAlignment=\"natural\" lineBreakMode=\"tailTruncation\" baselineAdjustment=\"alignBaselines\" adjustsFontSizeToFit=\"NO\" translatesAutoresizingMaskIntoConstraints=\"NO\" id=\"DeviceNameValue\">");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<rect key=\"frame\" x=\"16\" y=\"37\" width=\"28\" height=\"21\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<fontDescription key=\"fontDescription\" type=\"system\" pointSize=\"17\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<nil key=\"textColor\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<nil key=\"highlightedColor\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("</label>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<label opaque=\"NO\" userInteractionEnabled=\"NO\" contentMode=\"left\" horizontalHuggingPriority=\"251\" verticalHuggingPriority=\"251\" text=\"Device Identifier\" lineBreakMode=\"tailTruncation\" baselineAdjustment=\"alignBaselines\" adjustsFontSizeToFit=\"NO\" translatesAutoresizingMaskIntoConstraints=\"NO\" id=\"DeviceIdentifierHeader\">");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<rect key=\"frame\" x=\"16\" y=\"66\" width=\"134.5\" height=\"21\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<fontDescription key=\"fontDescription\" type=\"boldSystem\" pointSize=\"17\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<nil key=\"textColor\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<nil key=\"highlightedColor\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("</label>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<label opaque=\"NO\" userInteractionEnabled=\"NO\" contentMode=\"left\" horizontalHuggingPriority=\"251\" verticalHuggingPriority=\"251\" text=\"Connection Status\" lineBreakMode=\"tailTruncation\" baselineAdjustment=\"alignBaselines\" adjustsFontSizeToFit=\"NO\" translatesAutoresizingMaskIntoConstraints=\"NO\" id=\"ConnectionStateHeader\">");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<rect key=\"frame\" x=\"16\" y=\"124\" width=\"152\" height=\"21\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<fontDescription key=\"fontDescription\" type=\"boldSystem\" pointSize=\"17\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<nil key=\"textColor\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<nil key=\"highlightedColor\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("</label>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<label opaque=\"NO\" userInteractionEnabled=\"NO\" contentMode=\"left\" horizontalHuggingPriority=\"251\" verticalHuggingPriority=\"251\" text=\"n.a.\" textAlignment=\"natural\" lineBreakMode=\"tailTruncation\" baselineAdjustment=\"alignBaselines\" adjustsFontSizeToFit=\"NO\" translatesAutoresizingMaskIntoConstraints=\"NO\" id=\"DeviceIdentifierValue\">");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<rect key=\"frame\" x=\"16\" y=\"95\" width=\"28\" height=\"21\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<fontDescription key=\"fontDescription\" type=\"system\" pointSize=\"17\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<nil key=\"textColor\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<nil key=\"highlightedColor\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("</label>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<label opaque=\"NO\" userInteractionEnabled=\"NO\" contentMode=\"left\" horizontalHuggingPriority=\"251\" verticalHuggingPriority=\"251\" text=\"n.a.\" textAlignment=\"natural\" lineBreakMode=\"tailTruncation\" baselineAdjustment=\"alignBaselines\" adjustsFontSizeToFit=\"NO\" translatesAutoresizingMaskIntoConstraints=\"NO\" id=\"ConnectionStateValue\">");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<rect key=\"frame\" x=\"16\" y=\"153\" width=\"28\" height=\"21\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<fontDescription key=\"fontDescription\" type=\"system\" pointSize=\"17\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<nil key=\"textColor\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<nil key=\"highlightedColor\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("</label>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<scrollView clipsSubviews=\"YES\" multipleTouchEnabled=\"YES\" contentMode=\"scaleToFill\" translatesAutoresizingMaskIntoConstraints=\"NO\" id=\"ScrollView\">");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<rect key=\"frame\" x=\"16\" y=\"202\" width=\"343\" height=\"445\"/>");
    _builder.newLine();
    _builder.append("                                ");
    _builder.append("<subviews>");
    _builder.newLine();
    _builder.append("                                \t");
    _builder.append("<view contentMode=\"scaleToFill\" translatesAutoresizingMaskIntoConstraints=\"NO\" id=\"ContentView\">");
    _builder.newLine();
    _builder.append("                                \t\t");
    _builder.append("<rect key=\"frame\" x=\"0.0\" y=\"0.0\" width=\"343\" height=\"");
    _builder.append(this.contentViewHeight, "                                \t\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("                                \t    ");
    _builder.append("<subviews>");
    _builder.newLine();
    {
      EList<Service> _service_1 = sensor.getService();
      for(final Service service_1 : _service_1) {
        {
          EList<Characteristic> _characteristic_1 = service_1.getCharacteristic();
          for(final Characteristic characteristic_1 : _characteristic_1) {
            {
              UiElement _uielement = characteristic_1.getUielement();
              boolean _tripleNotEquals = (_uielement != null);
              if (_tripleNotEquals) {
                _builder.append("\t\t                                \t");
                _builder.append("<label opaque=\"NO\" userInteractionEnabled=\"NO\" contentMode=\"left\" horizontalHuggingPriority=\"251\" verticalHuggingPriority=\"251\" text=\"");
                String _label = characteristic_1.getUielement().getLabel();
                _builder.append(_label, "\t\t                                \t");
                _builder.append("\" lineBreakMode=\"tailTruncation\" baselineAdjustment=\"alignBaselines\" adjustsFontSizeToFit=\"NO\" translatesAutoresizingMaskIntoConstraints=\"NO\" id=\"");
                String _name = characteristic_1.getUielement().getName();
                _builder.append(_name, "\t\t                                \t");
                _builder.append("Header\">");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t                                \t");
                _builder.append("\t");
                _builder.append("<rect key=\"frame\" x=\"0.0\" y=\"");
                _builder.append(this.yHeaderLabel, "\t\t                                \t\t");
                _builder.append("\" width=\"200\" height=\"21\"/>");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t                                \t");
                _builder.append("\t");
                _builder.append("<fontDescription key=\"fontDescription\" type=\"boldSystem\" pointSize=\"17\"/>");
                _builder.newLine();
                _builder.append("\t\t                                \t");
                _builder.append("\t");
                _builder.append("<nil key=\"textColor\"/>");
                _builder.newLine();
                _builder.append("\t\t                                \t");
                _builder.append("\t");
                _builder.append("<nil key=\"highlightedColor\"/>");
                _builder.newLine();
                _builder.append("\t\t                                \t");
                _builder.append("</label>");
                _builder.newLine();
                {
                  boolean _isRead = characteristic_1.isRead();
                  if (_isRead) {
                    _builder.append("\t\t                                \t");
                    _builder.append("<label opaque=\"NO\" userInteractionEnabled=\"NO\" contentMode=\"left\" horizontalHuggingPriority=\"251\" verticalHuggingPriority=\"251\" text=\"n.a\" textAlignment=\"center\" lineBreakMode=\"tailTruncation\" baselineAdjustment=\"alignBaselines\" adjustsFontSizeToFit=\"NO\" translatesAutoresizingMaskIntoConstraints=\"NO\" id=\"");
                    String _name_1 = characteristic_1.getUielement().getName();
                    _builder.append(_name_1, "\t\t                                \t");
                    _builder.append("ReadValue\">");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<rect key=\"frame\" x=\"0.0\" y=\"");
                    _builder.append(this.yReadLabel, "\t\t                                \t\t");
                    _builder.append("\" width=\"81\" height=\"21\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<constraints>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t\t");
                    _builder.append("<constraint firstAttribute=\"width\" constant=\"81\" id=\"");
                    String _name_2 = characteristic_1.getUielement().getName();
                    _builder.append(_name_2, "\t\t                                \t\t\t");
                    _builder.append("ReadLabelConstraint\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("</constraints>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<fontDescription key=\"fontDescription\" type=\"system\" pointSize=\"17\"/>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<nil key=\"textColor\"/>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<nil key=\"highlightedColor\"/>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("</label>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("<button opaque=\"NO\" contentMode=\"scaleToFill\" contentHorizontalAlignment=\"center\" contentVerticalAlignment=\"center\" buttonType=\"roundedRect\" lineBreakMode=\"middleTruncation\" translatesAutoresizingMaskIntoConstraints=\"NO\" id=\"");
                    String _name_3 = characteristic_1.getUielement().getName();
                    _builder.append(_name_3, "\t\t                                \t");
                    _builder.append("ReadButton\">");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<rect key=\"frame\" x=\"89\" y=\"");
                    _builder.append(this.yReadButton, "\t\t                                \t\t");
                    _builder.append("\" width=\"35\" height=\"30\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<state key=\"normal\" title=\"Read\"/>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<connections>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t\t");
                    _builder.append("<action selector=\"readButton");
                    String _name_4 = characteristic_1.getUielement().getName();
                    _builder.append(_name_4, "\t\t                                \t\t\t");
                    _builder.append("Clicked:\" destination=\"mcc-oX-7Sy\" eventType=\"touchUpInside\" id=\"");
                    String _name_5 = characteristic_1.getUielement().getName();
                    _builder.append(_name_5, "\t\t                                \t\t\t");
                    _builder.append("ReadButtonAction\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("</connections>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("</button>");
                    _builder.newLine();
                  } else {
                    _builder.append("\t\t                                \t");
                    _builder.append("<label opaque=\"NO\" userInteractionEnabled=\"NO\" contentMode=\"left\" horizontalHuggingPriority=\"251\" verticalHuggingPriority=\"251\" text=\"n.a\" textAlignment=\"center\" lineBreakMode=\"tailTruncation\" baselineAdjustment=\"alignBaselines\" adjustsFontSizeToFit=\"NO\" translatesAutoresizingMaskIntoConstraints=\"NO\" id=\"");
                    String _name_6 = characteristic_1.getUielement().getName();
                    _builder.append(_name_6, "\t\t                                \t");
                    _builder.append("ReadValue\">");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<rect key=\"frame\" x=\"0.0\" y=\"");
                    _builder.append(this.yReadLabel, "\t\t                                \t\t");
                    _builder.append("\" width=\"81\" height=\"21\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<constraints>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t\t");
                    _builder.append("<constraint firstAttribute=\"width\" constant=\"81\" id=\"");
                    String _name_7 = characteristic_1.getUielement().getName();
                    _builder.append(_name_7, "\t\t                                \t\t\t");
                    _builder.append("ReadLabelConstraint\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("</constraints>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<fontDescription key=\"fontDescription\" type=\"system\" pointSize=\"17\"/>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<color key=\"textColor\" white=\"0.66666666666666663\" alpha=\"1\" colorSpace=\"custom\" customColorSpace=\"genericGamma22GrayColorSpace\"/>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<nil key=\"highlightedColor\"/>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("</label>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("<button opaque=\"NO\" contentMode=\"scaleToFill\" enabled=\"NO\" contentHorizontalAlignment=\"center\" contentVerticalAlignment=\"center\" buttonType=\"roundedRect\" lineBreakMode=\"middleTruncation\" translatesAutoresizingMaskIntoConstraints=\"NO\" id=\"");
                    String _name_8 = characteristic_1.getUielement().getName();
                    _builder.append(_name_8, "\t\t                                \t");
                    _builder.append("ReadButton\">");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<rect key=\"frame\" x=\"89\" y=\"");
                    _builder.append(this.yReadButton, "\t\t                                \t\t");
                    _builder.append("\" width=\"35\" height=\"30\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<state key=\"normal\" title=\"Read\"/>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<connections>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t\t");
                    _builder.append("<action selector=\"readButton");
                    String _name_9 = characteristic_1.getUielement().getName();
                    _builder.append(_name_9, "\t\t                                \t\t\t");
                    _builder.append("Clicked:\" destination=\"mcc-oX-7Sy\" eventType=\"touchUpInside\" id=\"");
                    String _name_10 = characteristic_1.getUielement().getName();
                    _builder.append(_name_10, "\t\t                                \t\t\t");
                    _builder.append("ReadButtonAction\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("</connections>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("</button>");
                    _builder.newLine();
                  }
                }
                {
                  boolean _isWrite = characteristic_1.isWrite();
                  if (_isWrite) {
                    _builder.append("\t\t                                \t");
                    _builder.append("<textField opaque=\"NO\" contentMode=\"scaleToFill\" contentHorizontalAlignment=\"left\" contentVerticalAlignment=\"center\" borderStyle=\"roundedRect\" placeholder=\"write value\" textAlignment=\"center\" minimumFontSize=\"17\" translatesAutoresizingMaskIntoConstraints=\"NO\" id=\"");
                    String _name_11 = characteristic_1.getUielement().getName();
                    _builder.append(_name_11, "\t\t                                \t");
                    _builder.append("WriteValue\">");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<rect key=\"frame\" x=\"132\" y=\"");
                    _builder.append(this.yWriteTextField, "\t\t                                \t\t");
                    _builder.append("\" width=\"97\" height=\"34\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<constraints>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t\t");
                    _builder.append("<constraint firstAttribute=\"width\" constant=\"97\" id=\"");
                    String _name_12 = characteristic_1.getUielement().getName();
                    _builder.append(_name_12, "\t\t                                \t\t\t");
                    _builder.append("WriteTextFieldConstraint\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("</constraints>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<fontDescription key=\"fontDescription\" type=\"system\" pointSize=\"14\"/>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<textInputTraits key=\"textInputTraits\" returnKeyType=\"send\"/>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<connections>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t\t");
                    _builder.append("<action selector=\"writeTextField");
                    String _name_13 = characteristic_1.getUielement().getName();
                    _builder.append(_name_13, "\t\t                                \t\t\t");
                    _builder.append("SentClicked:\" destination=\"mcc-oX-7Sy\" eventType=\"primaryActionTriggered\" id=\"");
                    String _name_14 = characteristic_1.getUielement().getName();
                    _builder.append(_name_14, "\t\t                                \t\t\t");
                    _builder.append("WriteTextFieldAction\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("</connections>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("</textField>");
                    _builder.newLine();
                  } else {
                    _builder.append("\t\t                                \t");
                    _builder.append("<textField opaque=\"NO\" contentMode=\"scaleToFill\" enabled=\"NO\" contentHorizontalAlignment=\"left\" contentVerticalAlignment=\"center\" borderStyle=\"roundedRect\" placeholder=\"n.a\" textAlignment=\"center\" minimumFontSize=\"17\" translatesAutoresizingMaskIntoConstraints=\"NO\" id=\"");
                    String _name_15 = characteristic_1.getUielement().getName();
                    _builder.append(_name_15, "\t\t                                \t");
                    _builder.append("WriteValue\">");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<rect key=\"frame\" x=\"132\" y=\"");
                    _builder.append(this.yWriteTextField, "\t\t                                \t\t");
                    _builder.append("\" width=\"97\" height=\"34\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<constraints>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t\t");
                    _builder.append("<constraint firstAttribute=\"width\" constant=\"97\" id=\"");
                    String _name_16 = characteristic_1.getUielement().getName();
                    _builder.append(_name_16, "\t\t                                \t\t\t");
                    _builder.append("WriteTextFieldConstraint\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("</constraints>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<fontDescription key=\"fontDescription\" type=\"system\" pointSize=\"14\"/>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<textInputTraits key=\"textInputTraits\" returnKeyType=\"send\"/>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<connections>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t\t");
                    _builder.append("<action selector=\"writeTextField");
                    String _name_17 = characteristic_1.getUielement().getName();
                    _builder.append(_name_17, "\t\t                                \t\t\t");
                    _builder.append("SentClicked:\" destination=\"mcc-oX-7Sy\" eventType=\"primaryActionTriggered\" id=\"");
                    String _name_18 = characteristic_1.getUielement().getName();
                    _builder.append(_name_18, "\t\t                                \t\t\t");
                    _builder.append("WriteTextFieldAction\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("</connections>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("</textField>");
                    _builder.newLine();
                  }
                }
                {
                  boolean _isNotification = characteristic_1.isNotification();
                  if (_isNotification) {
                    _builder.append("\t\t                                \t");
                    _builder.append("<label opaque=\"NO\" userInteractionEnabled=\"NO\" contentMode=\"left\" horizontalHuggingPriority=\"251\" verticalHuggingPriority=\"251\" text=\"n.a\" textAlignment=\"center\" lineBreakMode=\"tailTruncation\" baselineAdjustment=\"alignBaselines\" adjustsFontSizeToFit=\"NO\" translatesAutoresizingMaskIntoConstraints=\"NO\" id=\"");
                    String _name_19 = characteristic_1.getUielement().getName();
                    _builder.append(_name_19, "\t\t                                \t");
                    _builder.append("NotifyValue\">");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<rect key=\"frame\" x=\"237\" y=\"");
                    _builder.append(this.yNotifyLabel, "\t\t                                \t\t");
                    _builder.append("\" width=\"88\" height=\"21\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<constraints>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t\t");
                    _builder.append("<constraint firstAttribute=\"width\" constant=\"88\" id=\"");
                    String _name_20 = characteristic_1.getUielement().getName();
                    _builder.append(_name_20, "\t\t                                \t\t\t");
                    _builder.append("NotifyLabelConstraint\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("</constraints>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<fontDescription key=\"fontDescription\" type=\"system\" pointSize=\"17\"/>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<nil key=\"textColor\"/>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<nil key=\"highlightedColor\"/>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("</label>");
                    _builder.newLine();
                  } else {
                    _builder.append("\t\t                                \t");
                    _builder.append("<label opaque=\"NO\" userInteractionEnabled=\"NO\" contentMode=\"left\" horizontalHuggingPriority=\"251\" verticalHuggingPriority=\"251\" text=\"n.a\" textAlignment=\"center\" lineBreakMode=\"tailTruncation\" baselineAdjustment=\"alignBaselines\" adjustsFontSizeToFit=\"NO\" translatesAutoresizingMaskIntoConstraints=\"NO\" id=\"");
                    String _name_21 = characteristic_1.getUielement().getName();
                    _builder.append(_name_21, "\t\t                                \t");
                    _builder.append("NotifyValue\">");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<rect key=\"frame\" x=\"237\" y=\"");
                    _builder.append(this.yNotifyLabel, "\t\t                                \t\t");
                    _builder.append("\" width=\"88\" height=\"21\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<constraints>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t\t");
                    _builder.append("<constraint firstAttribute=\"width\" constant=\"88\" id=\"");
                    String _name_22 = characteristic_1.getUielement().getName();
                    _builder.append(_name_22, "\t\t                                \t\t\t");
                    _builder.append("NotifyLabelConstraint\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("</constraints>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<fontDescription key=\"fontDescription\" type=\"system\" pointSize=\"17\"/>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<color key=\"textColor\" white=\"0.66666666666666663\" alpha=\"1\" colorSpace=\"custom\" customColorSpace=\"genericGamma22GrayColorSpace\"/>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("\t");
                    _builder.append("<nil key=\"highlightedColor\"/>");
                    _builder.newLine();
                    _builder.append("\t\t                                \t");
                    _builder.append("</label>");
                    _builder.newLine();
                  }
                }
                _builder.append("\t\t                                \t");
                _builder.append("\t\t\t                                \t");
                String _xblockexpression_11 = null;
                {
                  this.yHeaderLabel = Integer.valueOf(((this.yHeaderLabel).intValue() + 62));
                  _xblockexpression_11 = "";
                }
                _builder.append(_xblockexpression_11, "\t\t                                \t\t\t\t                                \t");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t                                \t");
                String _xblockexpression_12 = null;
                {
                  this.yReadLabel = Integer.valueOf(((this.yReadLabel).intValue() + 62));
                  _xblockexpression_12 = "";
                }
                _builder.append(_xblockexpression_12, "\t\t                                \t");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t                                \t");
                String _xblockexpression_13 = null;
                {
                  this.yReadButton = Integer.valueOf(((this.yReadButton).intValue() + 62));
                  _xblockexpression_13 = "";
                }
                _builder.append(_xblockexpression_13, "\t\t                                \t");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t                                \t");
                String _xblockexpression_14 = null;
                {
                  this.yWriteTextField = Integer.valueOf(((this.yWriteTextField).intValue() + 62));
                  _xblockexpression_14 = "";
                }
                _builder.append(_xblockexpression_14, "\t\t                                \t");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t                                \t");
                String _xblockexpression_15 = null;
                {
                  this.yNotifyLabel = Integer.valueOf(((this.yNotifyLabel).intValue() + 62));
                  _xblockexpression_15 = "";
                }
                _builder.append(_xblockexpression_15, "\t\t                                \t");
                _builder.newLineIfNotEmpty();
              } else {
              }
            }
          }
        }
      }
    }
    _builder.append("\t\t                                ");
    _builder.append("</subviews>");
    _builder.newLine();
    _builder.append("\t\t                                ");
    _builder.append("<constraints>");
    _builder.newLine();
    _builder.append("\t\t                                \t");
    _builder.append("<constraint firstAttribute=\"height\" constant=\"");
    _builder.append(this.contentViewHeight, "\t\t                                \t");
    _builder.append("\" id=\"Ty5-ms-qL4\"/>");
    _builder.newLineIfNotEmpty();
    {
      EList<Service> _service_2 = sensor.getService();
      for(final Service service_2 : _service_2) {
        _builder.append("\t\t                                \t");
        _builder.append("\t\t\t                                \t");
        String _xblockexpression_16 = null;
        {
          this.serviceCounter = Integer.valueOf(((this.serviceCounter).intValue() + 1));
          _xblockexpression_16 = "";
        }
        _builder.append(_xblockexpression_16, "\t\t                                \t\t\t\t                                \t");
        _builder.newLineIfNotEmpty();
        {
          if (((this.serviceCounter).intValue() >= 2)) {
            _builder.append("\t\t                                \t");
            String _xblockexpression_17 = null;
            {
              this.counter = Integer.valueOf(0);
              _xblockexpression_17 = "";
            }
            _builder.append(_xblockexpression_17, "\t\t                                \t");
            _builder.newLineIfNotEmpty();
          } else {
          }
        }
        {
          EList<Characteristic> _characteristic_2 = service_2.getCharacteristic();
          for(final Characteristic characteristic_2 : _characteristic_2) {
            {
              UiElement _uielement_1 = characteristic_2.getUielement();
              boolean _tripleNotEquals_1 = (_uielement_1 != null);
              if (_tripleNotEquals_1) {
                {
                  if ((((this.counter).intValue() == 0) && ((this.serviceCounter).intValue() == 1))) {
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_23 = characteristic_2.getUielement().getName();
                    _builder.append(_name_23, "\t\t                                \t");
                    _builder.append("Header\" firstAttribute=\"leading\" secondItem=\"ContentView\" secondAttribute=\"leading\" id=\"");
                    String _name_24 = characteristic_2.getUielement().getName();
                    _builder.append(_name_24, "\t\t                                \t");
                    _builder.append("Constraint1\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_25 = characteristic_2.getUielement().getName();
                    _builder.append(_name_25, "\t\t                                \t");
                    _builder.append("Header\" firstAttribute=\"top\" secondItem=\"ContentView\" secondAttribute=\"top\" constant=\"8\" id=\"");
                    String _name_26 = characteristic_2.getUielement().getName();
                    _builder.append(_name_26, "\t\t                                \t");
                    _builder.append("Constraint2\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_27 = characteristic_2.getUielement().getName();
                    _builder.append(_name_27, "\t\t                                \t");
                    _builder.append("ReadValue\" firstAttribute=\"leading\" secondItem=\"ContentView\" secondAttribute=\"leading\" id=\"");
                    String _name_28 = characteristic_2.getUielement().getName();
                    _builder.append(_name_28, "\t\t                                \t");
                    _builder.append("Constraint3\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_29 = characteristic_2.getUielement().getName();
                    _builder.append(_name_29, "\t\t                                \t");
                    _builder.append("ReadValue\" firstAttribute=\"top\" secondItem=\"");
                    String _name_30 = characteristic_2.getUielement().getName();
                    _builder.append(_name_30, "\t\t                                \t");
                    _builder.append("Header\" secondAttribute=\"bottom\" constant=\"8\" id=\"");
                    String _name_31 = characteristic_2.getUielement().getName();
                    _builder.append(_name_31, "\t\t                                \t");
                    _builder.append("Constraint4\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_32 = characteristic_2.getUielement().getName();
                    _builder.append(_name_32, "\t\t                                \t");
                    _builder.append("ReadButton\" firstAttribute=\"leading\" secondItem=\"");
                    String _name_33 = characteristic_2.getUielement().getName();
                    _builder.append(_name_33, "\t\t                                \t");
                    _builder.append("ReadValue\" secondAttribute=\"trailing\" constant=\"8\" id=\"");
                    String _name_34 = characteristic_2.getUielement().getName();
                    _builder.append(_name_34, "\t\t                                \t");
                    _builder.append("Constraint5\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_35 = characteristic_2.getUielement().getName();
                    _builder.append(_name_35, "\t\t                                \t");
                    _builder.append("ReadButton\" firstAttribute=\"top\" secondItem=\"");
                    String _name_36 = characteristic_2.getUielement().getName();
                    _builder.append(_name_36, "\t\t                                \t");
                    _builder.append("Header\" secondAttribute=\"bottom\" constant=\"3\" id=\"");
                    String _name_37 = characteristic_2.getUielement().getName();
                    _builder.append(_name_37, "\t\t                                \t");
                    _builder.append("Constraint6\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_38 = characteristic_2.getUielement().getName();
                    _builder.append(_name_38, "\t\t                                \t");
                    _builder.append("WriteValue\" firstAttribute=\"leading\" secondItem=\"");
                    String _name_39 = characteristic_2.getUielement().getName();
                    _builder.append(_name_39, "\t\t                                \t");
                    _builder.append("ReadButton\" secondAttribute=\"trailing\" constant=\"8\" id=\"");
                    String _name_40 = characteristic_2.getUielement().getName();
                    _builder.append(_name_40, "\t\t                                \t");
                    _builder.append("Constraint7\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_41 = characteristic_2.getUielement().getName();
                    _builder.append(_name_41, "\t\t                                \t");
                    _builder.append("WriteValue\" firstAttribute=\"top\" secondItem=\"ContentView\" secondAttribute=\"top\" constant=\"30\" id=\"");
                    String _name_42 = characteristic_2.getUielement().getName();
                    _builder.append(_name_42, "\t\t                                \t");
                    _builder.append("Constraint8\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_43 = characteristic_2.getUielement().getName();
                    _builder.append(_name_43, "\t\t                                \t");
                    _builder.append("NotifyValue\" firstAttribute=\"leading\" secondItem=\"");
                    String _name_44 = characteristic_2.getUielement().getName();
                    _builder.append(_name_44, "\t\t                                \t");
                    _builder.append("WriteValue\" secondAttribute=\"trailing\" constant=\"8\" id=\"");
                    String _name_45 = characteristic_2.getUielement().getName();
                    _builder.append(_name_45, "\t\t                                \t");
                    _builder.append("Constraint9\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_46 = characteristic_2.getUielement().getName();
                    _builder.append(_name_46, "\t\t                                \t");
                    _builder.append("NotifyValue\" firstAttribute=\"top\" secondItem=\"ContentView\" secondAttribute=\"top\" constant=\"37\" id=\"");
                    String _name_47 = characteristic_2.getUielement().getName();
                    _builder.append(_name_47, "\t\t                                \t");
                    _builder.append("Constraint10\"/>");
                    _builder.newLineIfNotEmpty();
                  } else {
                  }
                }
                {
                  if ((((this.counter).intValue() >= 1) && ((this.serviceCounter).intValue() == 1))) {
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_48 = characteristic_2.getUielement().getName();
                    _builder.append(_name_48, "\t\t                                \t");
                    _builder.append("Header\" firstAttribute=\"leading\" secondItem=\"ContentView\" secondAttribute=\"leading\" id=\"");
                    String _name_49 = characteristic_2.getUielement().getName();
                    _builder.append(_name_49, "\t\t                                \t");
                    _builder.append("Constraint1\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_50 = characteristic_2.getUielement().getName();
                    _builder.append(_name_50, "\t\t                                \t");
                    _builder.append("Header\" firstAttribute=\"top\" secondItem=\"");
                    String _name_51 = service_2.getCharacteristic().get(((this.counter).intValue() - 1)).getUielement().getName();
                    _builder.append(_name_51, "\t\t                                \t");
                    _builder.append("WriteValue\" secondAttribute=\"bottom\" constant=\"6\" id=\"");
                    String _name_52 = characteristic_2.getUielement().getName();
                    _builder.append(_name_52, "\t\t                                \t");
                    _builder.append("Constraint2\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_53 = characteristic_2.getUielement().getName();
                    _builder.append(_name_53, "\t\t                                \t");
                    _builder.append("ReadValue\" firstAttribute=\"leading\" secondItem=\"ContentView\" secondAttribute=\"leading\" id=\"");
                    String _name_54 = characteristic_2.getUielement().getName();
                    _builder.append(_name_54, "\t\t                                \t");
                    _builder.append("Constraint3\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_55 = characteristic_2.getUielement().getName();
                    _builder.append(_name_55, "\t\t                                \t");
                    _builder.append("ReadValue\" firstAttribute=\"top\" secondItem=\"");
                    String _name_56 = characteristic_2.getUielement().getName();
                    _builder.append(_name_56, "\t\t                                \t");
                    _builder.append("Header\" secondAttribute=\"bottom\" constant=\"8\" id=\"");
                    String _name_57 = characteristic_2.getUielement().getName();
                    _builder.append(_name_57, "\t\t                                \t");
                    _builder.append("Constraint4\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_58 = characteristic_2.getUielement().getName();
                    _builder.append(_name_58, "\t\t                                \t");
                    _builder.append("ReadButton\" firstAttribute=\"leading\" secondItem=\"");
                    String _name_59 = characteristic_2.getUielement().getName();
                    _builder.append(_name_59, "\t\t                                \t");
                    _builder.append("ReadValue\" secondAttribute=\"trailing\" constant=\"8\" id=\"");
                    String _name_60 = characteristic_2.getUielement().getName();
                    _builder.append(_name_60, "\t\t                                \t");
                    _builder.append("Constraint5\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_61 = characteristic_2.getUielement().getName();
                    _builder.append(_name_61, "\t\t                                \t");
                    _builder.append("ReadButton\" firstAttribute=\"top\" secondItem=\"");
                    String _name_62 = service_2.getCharacteristic().get(((this.counter).intValue() - 1)).getUielement().getName();
                    _builder.append(_name_62, "\t\t                                \t");
                    _builder.append("ReadButton\" secondAttribute=\"bottom\" constant=\"32\" id=\"");
                    String _name_63 = characteristic_2.getUielement().getName();
                    _builder.append(_name_63, "\t\t                                \t");
                    _builder.append("Constraint6\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_64 = characteristic_2.getUielement().getName();
                    _builder.append(_name_64, "\t\t                                \t");
                    _builder.append("WriteValue\" firstAttribute=\"leading\" secondItem=\"");
                    String _name_65 = characteristic_2.getUielement().getName();
                    _builder.append(_name_65, "\t\t                                \t");
                    _builder.append("ReadButton\" secondAttribute=\"trailing\" constant=\"8\" id=\"");
                    String _name_66 = characteristic_2.getUielement().getName();
                    _builder.append(_name_66, "\t\t                                \t");
                    _builder.append("Constraint7\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_67 = characteristic_2.getUielement().getName();
                    _builder.append(_name_67, "\t\t                                \t");
                    _builder.append("WriteValue\" firstAttribute=\"top\" secondItem=\"");
                    String _name_68 = service_2.getCharacteristic().get(((this.counter).intValue() - 1)).getUielement().getName();
                    _builder.append(_name_68, "\t\t                                \t");
                    _builder.append("WriteValue\" secondAttribute=\"bottom\" constant=\"28\" id=\"");
                    String _name_69 = characteristic_2.getUielement().getName();
                    _builder.append(_name_69, "\t\t                                \t");
                    _builder.append("Constraint8\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_70 = characteristic_2.getUielement().getName();
                    _builder.append(_name_70, "\t\t                                \t");
                    _builder.append("NotifyValue\" firstAttribute=\"leading\" secondItem=\"");
                    String _name_71 = characteristic_2.getUielement().getName();
                    _builder.append(_name_71, "\t\t                                \t");
                    _builder.append("WriteValue\" secondAttribute=\"trailing\" constant=\"8\" id=\"");
                    String _name_72 = characteristic_2.getUielement().getName();
                    _builder.append(_name_72, "\t\t                                \t");
                    _builder.append("Constraint9\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_73 = characteristic_2.getUielement().getName();
                    _builder.append(_name_73, "\t\t                                \t");
                    _builder.append("NotifyValue\" firstAttribute=\"top\" secondItem=\"");
                    String _name_74 = service_2.getCharacteristic().get(((this.counter).intValue() - 1)).getUielement().getName();
                    _builder.append(_name_74, "\t\t                                \t");
                    _builder.append("NotifyValue\" secondAttribute=\"bottom\" constant=\"41\" id=\"");
                    String _name_75 = characteristic_2.getUielement().getName();
                    _builder.append(_name_75, "\t\t                                \t");
                    _builder.append("Constraint10\"/>");
                    _builder.newLineIfNotEmpty();
                  } else {
                  }
                }
                {
                  if ((((this.counter).intValue() == 0) && ((this.serviceCounter).intValue() >= 2))) {
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_76 = characteristic_2.getUielement().getName();
                    _builder.append(_name_76, "\t\t                                \t");
                    _builder.append("Header\" firstAttribute=\"leading\" secondItem=\"ContentView\" secondAttribute=\"leading\" id=\"");
                    String _name_77 = characteristic_2.getUielement().getName();
                    _builder.append(_name_77, "\t\t                                \t");
                    _builder.append("Constraint1\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_78 = characteristic_2.getUielement().getName();
                    _builder.append(_name_78, "\t\t                                \t");
                    _builder.append("Header\" firstAttribute=\"top\" secondItem=\"");
                    EList<Characteristic> _characteristic_3 = sensor.getService().get(((this.serviceCounter).intValue() - 2)).getCharacteristic();
                    int _size = sensor.getService().get(((this.serviceCounter).intValue() - 2)).getCharacteristic().size();
                    int _minus = (_size - 1);
                    String _name_79 = _characteristic_3.get(_minus).getUielement().getName();
                    _builder.append(_name_79, "\t\t                                \t");
                    _builder.append("WriteValue\" secondAttribute=\"bottom\" constant=\"6\" id=\"");
                    String _name_80 = characteristic_2.getUielement().getName();
                    _builder.append(_name_80, "\t\t                                \t");
                    _builder.append("Constraint2\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_81 = characteristic_2.getUielement().getName();
                    _builder.append(_name_81, "\t\t                                \t");
                    _builder.append("ReadValue\" firstAttribute=\"leading\" secondItem=\"ContentView\" secondAttribute=\"leading\" id=\"");
                    String _name_82 = characteristic_2.getUielement().getName();
                    _builder.append(_name_82, "\t\t                                \t");
                    _builder.append("Constraint3\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_83 = characteristic_2.getUielement().getName();
                    _builder.append(_name_83, "\t\t                                \t");
                    _builder.append("ReadValue\" firstAttribute=\"top\" secondItem=\"");
                    String _name_84 = characteristic_2.getUielement().getName();
                    _builder.append(_name_84, "\t\t                                \t");
                    _builder.append("Header\" secondAttribute=\"bottom\" constant=\"8\" id=\"");
                    String _name_85 = characteristic_2.getUielement().getName();
                    _builder.append(_name_85, "\t\t                                \t");
                    _builder.append("Constraint4\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_86 = characteristic_2.getUielement().getName();
                    _builder.append(_name_86, "\t\t                                \t");
                    _builder.append("ReadButton\" firstAttribute=\"leading\" secondItem=\"");
                    String _name_87 = characteristic_2.getUielement().getName();
                    _builder.append(_name_87, "\t\t                                \t");
                    _builder.append("ReadValue\" secondAttribute=\"trailing\" constant=\"8\" id=\"");
                    String _name_88 = characteristic_2.getUielement().getName();
                    _builder.append(_name_88, "\t\t                                \t");
                    _builder.append("Constraint5\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_89 = characteristic_2.getUielement().getName();
                    _builder.append(_name_89, "\t\t                                \t");
                    _builder.append("ReadButton\" firstAttribute=\"top\" secondItem=\"");
                    EList<Characteristic> _characteristic_4 = sensor.getService().get(((this.serviceCounter).intValue() - 2)).getCharacteristic();
                    int _size_1 = sensor.getService().get(((this.serviceCounter).intValue() - 2)).getCharacteristic().size();
                    int _minus_1 = (_size_1 - 1);
                    String _name_90 = _characteristic_4.get(_minus_1).getUielement().getName();
                    _builder.append(_name_90, "\t\t                                \t");
                    _builder.append("ReadButton\" secondAttribute=\"bottom\" constant=\"32\" id=\"");
                    String _name_91 = characteristic_2.getUielement().getName();
                    _builder.append(_name_91, "\t\t                                \t");
                    _builder.append("Constraint6\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_92 = characteristic_2.getUielement().getName();
                    _builder.append(_name_92, "\t\t                                \t");
                    _builder.append("WriteValue\" firstAttribute=\"leading\" secondItem=\"");
                    String _name_93 = characteristic_2.getUielement().getName();
                    _builder.append(_name_93, "\t\t                                \t");
                    _builder.append("ReadButton\" secondAttribute=\"trailing\" constant=\"8\" id=\"");
                    String _name_94 = characteristic_2.getUielement().getName();
                    _builder.append(_name_94, "\t\t                                \t");
                    _builder.append("Constraint7\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_95 = characteristic_2.getUielement().getName();
                    _builder.append(_name_95, "\t\t                                \t");
                    _builder.append("WriteValue\" firstAttribute=\"top\" secondItem=\"");
                    EList<Characteristic> _characteristic_5 = sensor.getService().get(((this.serviceCounter).intValue() - 2)).getCharacteristic();
                    int _size_2 = sensor.getService().get(((this.serviceCounter).intValue() - 2)).getCharacteristic().size();
                    int _minus_2 = (_size_2 - 1);
                    String _name_96 = _characteristic_5.get(_minus_2).getUielement().getName();
                    _builder.append(_name_96, "\t\t                                \t");
                    _builder.append("WriteValue\" secondAttribute=\"bottom\" constant=\"28\" id=\"");
                    String _name_97 = characteristic_2.getUielement().getName();
                    _builder.append(_name_97, "\t\t                                \t");
                    _builder.append("Constraint8\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_98 = characteristic_2.getUielement().getName();
                    _builder.append(_name_98, "\t\t                                \t");
                    _builder.append("NotifyValue\" firstAttribute=\"leading\" secondItem=\"");
                    String _name_99 = characteristic_2.getUielement().getName();
                    _builder.append(_name_99, "\t\t                                \t");
                    _builder.append("WriteValue\" secondAttribute=\"trailing\" constant=\"8\" id=\"");
                    String _name_100 = characteristic_2.getUielement().getName();
                    _builder.append(_name_100, "\t\t                                \t");
                    _builder.append("Constraint9\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_101 = characteristic_2.getUielement().getName();
                    _builder.append(_name_101, "\t\t                                \t");
                    _builder.append("NotifyValue\" firstAttribute=\"top\" secondItem=\"");
                    EList<Characteristic> _characteristic_6 = sensor.getService().get(((this.serviceCounter).intValue() - 2)).getCharacteristic();
                    int _size_3 = sensor.getService().get(((this.serviceCounter).intValue() - 2)).getCharacteristic().size();
                    int _minus_3 = (_size_3 - 1);
                    String _name_102 = _characteristic_6.get(_minus_3).getUielement().getName();
                    _builder.append(_name_102, "\t\t                                \t");
                    _builder.append("NotifyValue\" secondAttribute=\"bottom\" constant=\"41\" id=\"");
                    String _name_103 = characteristic_2.getUielement().getName();
                    _builder.append(_name_103, "\t\t                                \t");
                    _builder.append("Constraint10\"/>");
                    _builder.newLineIfNotEmpty();
                  } else {
                  }
                }
                {
                  if ((((this.counter).intValue() >= 1) && ((this.serviceCounter).intValue() >= 2))) {
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_104 = characteristic_2.getUielement().getName();
                    _builder.append(_name_104, "\t\t                                \t");
                    _builder.append("Header\" firstAttribute=\"leading\" secondItem=\"ContentView\" secondAttribute=\"leading\" id=\"");
                    String _name_105 = characteristic_2.getUielement().getName();
                    _builder.append(_name_105, "\t\t                                \t");
                    _builder.append("Constraint1\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_106 = characteristic_2.getUielement().getName();
                    _builder.append(_name_106, "\t\t                                \t");
                    _builder.append("Header\" firstAttribute=\"top\" secondItem=\"");
                    String _name_107 = service_2.getCharacteristic().get(((this.counter).intValue() - 1)).getUielement().getName();
                    _builder.append(_name_107, "\t\t                                \t");
                    _builder.append("WriteValue\" secondAttribute=\"bottom\" constant=\"6\" id=\"");
                    String _name_108 = characteristic_2.getUielement().getName();
                    _builder.append(_name_108, "\t\t                                \t");
                    _builder.append("Constraint2\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_109 = characteristic_2.getUielement().getName();
                    _builder.append(_name_109, "\t\t                                \t");
                    _builder.append("ReadValue\" firstAttribute=\"leading\" secondItem=\"ContentView\" secondAttribute=\"leading\" id=\"");
                    String _name_110 = characteristic_2.getUielement().getName();
                    _builder.append(_name_110, "\t\t                                \t");
                    _builder.append("Constraint3\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_111 = characteristic_2.getUielement().getName();
                    _builder.append(_name_111, "\t\t                                \t");
                    _builder.append("ReadValue\" firstAttribute=\"top\" secondItem=\"");
                    String _name_112 = characteristic_2.getUielement().getName();
                    _builder.append(_name_112, "\t\t                                \t");
                    _builder.append("Header\" secondAttribute=\"bottom\" constant=\"8\" id=\"");
                    String _name_113 = characteristic_2.getUielement().getName();
                    _builder.append(_name_113, "\t\t                                \t");
                    _builder.append("Constraint4\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_114 = characteristic_2.getUielement().getName();
                    _builder.append(_name_114, "\t\t                                \t");
                    _builder.append("ReadButton\" firstAttribute=\"leading\" secondItem=\"");
                    String _name_115 = characteristic_2.getUielement().getName();
                    _builder.append(_name_115, "\t\t                                \t");
                    _builder.append("ReadValue\" secondAttribute=\"trailing\" constant=\"8\" id=\"");
                    String _name_116 = characteristic_2.getUielement().getName();
                    _builder.append(_name_116, "\t\t                                \t");
                    _builder.append("Constraint5\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_117 = characteristic_2.getUielement().getName();
                    _builder.append(_name_117, "\t\t                                \t");
                    _builder.append("ReadButton\" firstAttribute=\"top\" secondItem=\"");
                    String _name_118 = service_2.getCharacteristic().get(((this.counter).intValue() - 1)).getUielement().getName();
                    _builder.append(_name_118, "\t\t                                \t");
                    _builder.append("ReadButton\" secondAttribute=\"bottom\" constant=\"32\" id=\"");
                    String _name_119 = characteristic_2.getUielement().getName();
                    _builder.append(_name_119, "\t\t                                \t");
                    _builder.append("Constraint6\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_120 = characteristic_2.getUielement().getName();
                    _builder.append(_name_120, "\t\t                                \t");
                    _builder.append("WriteValue\" firstAttribute=\"leading\" secondItem=\"");
                    String _name_121 = characteristic_2.getUielement().getName();
                    _builder.append(_name_121, "\t\t                                \t");
                    _builder.append("ReadButton\" secondAttribute=\"trailing\" constant=\"8\" id=\"");
                    String _name_122 = characteristic_2.getUielement().getName();
                    _builder.append(_name_122, "\t\t                                \t");
                    _builder.append("Constraint7\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_123 = characteristic_2.getUielement().getName();
                    _builder.append(_name_123, "\t\t                                \t");
                    _builder.append("WriteValue\" firstAttribute=\"top\" secondItem=\"");
                    String _name_124 = service_2.getCharacteristic().get(((this.counter).intValue() - 1)).getUielement().getName();
                    _builder.append(_name_124, "\t\t                                \t");
                    _builder.append("WriteValue\" secondAttribute=\"bottom\" constant=\"28\" id=\"");
                    String _name_125 = characteristic_2.getUielement().getName();
                    _builder.append(_name_125, "\t\t                                \t");
                    _builder.append("Constraint8\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_126 = characteristic_2.getUielement().getName();
                    _builder.append(_name_126, "\t\t                                \t");
                    _builder.append("NotifyValue\" firstAttribute=\"leading\" secondItem=\"");
                    String _name_127 = characteristic_2.getUielement().getName();
                    _builder.append(_name_127, "\t\t                                \t");
                    _builder.append("WriteValue\" secondAttribute=\"trailing\" constant=\"8\" id=\"");
                    String _name_128 = characteristic_2.getUielement().getName();
                    _builder.append(_name_128, "\t\t                                \t");
                    _builder.append("Constraint9\"/>");
                    _builder.newLineIfNotEmpty();
                    _builder.append("\t\t                                \t");
                    _builder.append("<constraint firstItem=\"");
                    String _name_129 = characteristic_2.getUielement().getName();
                    _builder.append(_name_129, "\t\t                                \t");
                    _builder.append("NotifyValue\" firstAttribute=\"top\" secondItem=\"");
                    String _name_130 = service_2.getCharacteristic().get(((this.counter).intValue() - 1)).getUielement().getName();
                    _builder.append(_name_130, "\t\t                                \t");
                    _builder.append("NotifyValue\" secondAttribute=\"bottom\" constant=\"41\" id=\"");
                    String _name_131 = characteristic_2.getUielement().getName();
                    _builder.append(_name_131, "\t\t                                \t");
                    _builder.append("Constraint10\"/>");
                    _builder.newLineIfNotEmpty();
                  } else {
                  }
                }
                _builder.append("\t\t                                \t");
                String _xblockexpression_18 = null;
                {
                  this.counter = Integer.valueOf(((this.counter).intValue() + 1));
                  _xblockexpression_18 = "";
                }
                _builder.append(_xblockexpression_18, "\t\t                                \t");
                _builder.newLineIfNotEmpty();
              } else {
              }
            }
          }
        }
      }
    }
    _builder.append("\t\t                               \t");
    _builder.append("</constraints>");
    _builder.newLine();
    _builder.append("\t                               \t");
    _builder.append("</view>");
    _builder.newLine();
    _builder.append("                               \t");
    _builder.append("</subviews>");
    _builder.newLine();
    _builder.append("                               \t");
    _builder.append("<constraints>");
    _builder.newLine();
    _builder.append("                               \t\t");
    _builder.append("<constraint firstAttribute=\"bottom\" secondItem=\"ContentView\" secondAttribute=\"bottom\" id=\"BHL-ZT-TEg\"/>");
    _builder.newLine();
    _builder.append("                               \t    ");
    _builder.append("<constraint firstItem=\"ContentView\" firstAttribute=\"leading\" secondItem=\"ScrollView\" secondAttribute=\"leading\" id=\"Ch6-zp-6h2\"/>");
    _builder.newLine();
    _builder.append("                               \t    ");
    _builder.append("<constraint firstAttribute=\"trailing\" secondItem=\"ContentView\" secondAttribute=\"trailing\" id=\"ZVd-XX-lyS\"/>");
    _builder.newLine();
    _builder.append("                               \t    ");
    _builder.append("<constraint firstItem=\"ContentView\" firstAttribute=\"centerX\" secondItem=\"ScrollView\" secondAttribute=\"centerX\" id=\"eiM-AW-XXE\"/>");
    _builder.newLine();
    _builder.append("                               \t    ");
    _builder.append("<constraint firstItem=\"ContentView\" firstAttribute=\"top\" secondItem=\"ScrollView\" secondAttribute=\"top\" id=\"hCX-fP-N7X\"/>");
    _builder.newLine();
    _builder.append("                               \t    ");
    _builder.append("<constraint firstItem=\"ContentView\" firstAttribute=\"top\" secondItem=\"ScrollView\" secondAttribute=\"top\" id=\"ip6-w8-X9y\"/>");
    _builder.newLine();
    _builder.append("                               \t    ");
    _builder.append("<constraint firstAttribute=\"trailing\" secondItem=\"ContentView\" secondAttribute=\"trailing\" id=\"pe4-c5-T3j\"/>");
    _builder.newLine();
    _builder.append("                               \t    ");
    _builder.append("<constraint firstItem=\"ContentView\" firstAttribute=\"leading\" secondItem=\"ScrollView\" secondAttribute=\"leading\" id=\"zJE-eD-740\"/>");
    _builder.newLine();
    _builder.append("                               ");
    _builder.append("</constraints>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("</scrollView>");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("</subviews>");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<color key=\"backgroundColor\" white=\"1\" alpha=\"1\" colorSpace=\"custom\" customColorSpace=\"genericGamma22GrayColorSpace\"/>");
    _builder.newLine();
    _builder.append("                        ");
    _builder.append("<constraints>");
    _builder.newLine();
    _builder.append("                        \t");
    _builder.append("<constraint firstItem=\"ConnectionStateHeader\" firstAttribute=\"top\" secondItem=\"DeviceIdentifierValue\" secondAttribute=\"bottom\" constant=\"8\" id=\"8YI-Iu-FZr\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<constraint firstItem=\"DeviceNameHeader\" firstAttribute=\"leading\" secondItem=\"6Tk-OE-BBY\" secondAttribute=\"leading\" constant=\"16\" id=\"9gA-3X-FBh\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<constraint firstItem=\"6Tk-OE-BBY\" firstAttribute=\"trailing\" secondItem=\"ScrollView\" secondAttribute=\"trailing\" constant=\"16\" id=\"LwR-gQ-Jxu\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<constraint firstItem=\"DeviceNameValue\" firstAttribute=\"top\" secondItem=\"DeviceNameHeader\" secondAttribute=\"bottom\" constant=\"8\" id=\"RhB-Tf-H1Z\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<constraint firstItem=\"DeviceIdentifierValue\" firstAttribute=\"leading\" secondItem=\"6Tk-OE-BBY\" secondAttribute=\"leading\" constant=\"16\" id=\"UN3-F0-Tdc\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<constraint firstItem=\"DeviceIdentifierValue\" firstAttribute=\"top\" secondItem=\"DeviceIdentifierHeader\" secondAttribute=\"bottom\" constant=\"8\" id=\"Z2j-58-ex5\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<constraint firstItem=\"ScrollView\" firstAttribute=\"leading\" secondItem=\"6Tk-OE-BBY\" secondAttribute=\"leading\" constant=\"16\" id=\"d4W-G1-Rno\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<constraint firstItem=\"DeviceIdentifierHeader\" firstAttribute=\"leading\" secondItem=\"6Tk-OE-BBY\" secondAttribute=\"leading\" constant=\"16\" id=\"ilT-0V-Nco\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<constraint firstItem=\"DeviceIdentifierHeader\" firstAttribute=\"top\" secondItem=\"DeviceNameValue\" secondAttribute=\"bottom\" constant=\"8\" id=\"jg8-uO-Ggy\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<constraint firstItem=\"ConnectionStateHeader\" firstAttribute=\"leading\" secondItem=\"6Tk-OE-BBY\" secondAttribute=\"leading\" constant=\"16\" id=\"lQh-Dh-R7y\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<constraint firstItem=\"ConnectionStateValue\" firstAttribute=\"top\" secondItem=\"ConnectionStateHeader\" secondAttribute=\"bottom\" constant=\"8\" id=\"mjs-C6-gqM\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<constraint firstItem=\"DeviceNameHeader\" firstAttribute=\"top\" secondItem=\"6Tk-OE-BBY\" secondAttribute=\"top\" constant=\"20\" id=\"qqG-yU-GMP\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<constraint firstItem=\"ConnectionStateValue\" firstAttribute=\"leading\" secondItem=\"6Tk-OE-BBY\" secondAttribute=\"leading\" constant=\"16\" id=\"vcQ-og-2Jg\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<constraint firstItem=\"6Tk-OE-BBY\" firstAttribute=\"bottom\" secondItem=\"ScrollView\" secondAttribute=\"bottom\" constant=\"20\" id=\"w7w-tQ-msN\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<constraint firstItem=\"ScrollView\" firstAttribute=\"top\" secondItem=\"ConnectionStateValue\" secondAttribute=\"bottom\" constant=\"32\" id=\"xEI-dD-A5j\"/>");
    _builder.newLine();
    _builder.append("                            ");
    _builder.append("<constraint firstItem=\"DeviceNameValue\" firstAttribute=\"leading\" secondItem=\"6Tk-OE-BBY\" secondAttribute=\"leading\" constant=\"16\" id=\"zUc-sp-gjY\"/>");
    _builder.newLine();
    _builder.append("                       ");
    _builder.append("</constraints>");
    _builder.newLine();
    _builder.append("                       ");
    _builder.append("<viewLayoutGuide key=\"safeArea\" id=\"6Tk-OE-BBY\"/>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("</view>");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("<connections>");
    _builder.newLine();
    _builder.append("                    \t");
    _builder.append("<outlet property=\"connectionStatusLabel\" destination=\"ConnectionStateValue\" id=\"Dcl-8R-MxM\"/>");
    _builder.newLine();
    _builder.append("                    \t");
    _builder.append("<outlet property=\"nameLabel\" destination=\"DeviceNameValue\" id=\"xQh-h0-zxS\"/>");
    _builder.newLine();
    _builder.append("                    \t");
    _builder.append("<outlet property=\"uuidLabel\" destination=\"DeviceIdentifierValue\" id=\"tOT-x5-PgN\"/>");
    _builder.newLine();
    {
      EList<Service> _service_3 = sensor.getService();
      for(final Service service_3 : _service_3) {
        {
          EList<Characteristic> _characteristic_7 = service_3.getCharacteristic();
          for(final Characteristic characteristic_3 : _characteristic_7) {
            {
              if ((characteristic_3.isRead() && (characteristic_3.getUielement() != null))) {
                _builder.append("                    \t");
                _builder.append("<outlet property=\"readValue");
                String _name_132 = characteristic_3.getUielement().getName();
                _builder.append(_name_132, "                    \t");
                _builder.append("\" destination=\"");
                String _name_133 = characteristic_3.getUielement().getName();
                _builder.append(_name_133, "                    \t");
                _builder.append("ReadValue\" id=\"");
                String _name_134 = characteristic_3.getUielement().getName();
                _builder.append(_name_134, "                    \t");
                _builder.append("ReadValueOutlet\"/>");
                _builder.newLineIfNotEmpty();
              } else {
              }
            }
            {
              if ((characteristic_3.isWrite() && (characteristic_3.getUielement() != null))) {
                _builder.append("                    \t");
                _builder.append("<outlet property=\"writeValue");
                String _name_135 = characteristic_3.getUielement().getName();
                _builder.append(_name_135, "                    \t");
                _builder.append("\" destination=\"");
                String _name_136 = characteristic_3.getUielement().getName();
                _builder.append(_name_136, "                    \t");
                _builder.append("WriteValue\" id=\"");
                String _name_137 = characteristic_3.getUielement().getName();
                _builder.append(_name_137, "                    \t");
                _builder.append("WrtieValueOutlet\"/>");
                _builder.newLineIfNotEmpty();
              } else {
              }
            }
            {
              if ((characteristic_3.isNotification() && (characteristic_3.getUielement() != null))) {
                _builder.append("                    \t");
                _builder.append("<outlet property=\"notifyValue");
                String _name_138 = characteristic_3.getUielement().getName();
                _builder.append(_name_138, "                    \t");
                _builder.append("\" destination=\"");
                String _name_139 = characteristic_3.getUielement().getName();
                _builder.append(_name_139, "                    \t");
                _builder.append("NotifyValue\" id=\"");
                String _name_140 = characteristic_3.getUielement().getName();
                _builder.append(_name_140, "                    \t");
                _builder.append("NotifyValueOutlet\"/>");
                _builder.newLineIfNotEmpty();
              } else {
              }
            }
          }
        }
      }
    }
    _builder.append("                    ");
    _builder.append("</connections>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("</viewController>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<placeholder placeholderIdentifier=\"IBFirstResponder\" id=\"4z1-SZ-xit\" userLabel=\"First Responder\" sceneMemberID=\"firstResponder\"/>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</objects>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<point key=\"canvasLocation\" x=\"2680.8000000000002\" y=\"-407.0464767616192\"/>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("</scene>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</scenes>");
    _builder.newLine();
    _builder.append("</document>");
    _builder.newLine();
    return _builder;
  }
  
  /**
   * Generate-method for the 'Info.plist' file. This file contains general information about the application.
   */
  public CharSequence generateInfo() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder.newLine();
    _builder.append("<!DOCTYPE plist PUBLIC \"-//Apple//DTD PLIST 1.0//EN\" \"http://www.apple.com/DTDs/PropertyList-1.0.dtd\">");
    _builder.newLine();
    _builder.append("<plist version=\"1.0\">");
    _builder.newLine();
    _builder.append("<dict>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>NSBluetoothAlwaysUsageDescription</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>$(PRODUCT_NAME) uses Bluetooth</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>CFBundleDevelopmentRegion</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>$(DEVELOPMENT_LANGUAGE)</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>CFBundleExecutable</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>$(EXECUTABLE_NAME)</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>CFBundleIdentifier</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>$(PRODUCT_BUNDLE_IDENTIFIER)</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>CFBundleInfoDictionaryVersion</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>6.0</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>CFBundleName</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>$(PRODUCT_NAME)</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>CFBundlePackageType</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>$(PRODUCT_BUNDLE_PACKAGE_TYPE)</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>CFBundleShortVersionString</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>1.0</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>CFBundleVersion</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>1</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>LSRequiresIPhoneOS</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<true/>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>UIApplicationSceneManifest</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<dict>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<key>UIApplicationSupportsMultipleScenes</key>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<false/>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<key>UISceneConfigurations</key>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<dict>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<key>UIWindowSceneSessionRoleApplication</key>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<array>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<dict>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<key>UISceneConfigurationName</key>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<string>Default Configuration</string>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<key>UISceneDelegateClassName</key>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<string>$(PRODUCT_MODULE_NAME).SceneDelegate</string>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<key>UISceneStoryboardFile</key>");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("<string>Main</string>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</dict>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</array>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</dict>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</dict>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>UILaunchStoryboardName</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>LaunchScreen</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>UIMainStoryboardFile</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<string>Main</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>UIRequiredDeviceCapabilities</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<array>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<string>armv7</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</array>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>UISupportedInterfaceOrientations</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<array>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<string>UIInterfaceOrientationPortrait</string>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<string>UIInterfaceOrientationLandscapeLeft</string>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<string>UIInterfaceOrientationLandscapeRight</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</array>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<key>UISupportedInterfaceOrientations~ipad</key>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<array>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<string>UIInterfaceOrientationPortrait</string>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<string>UIInterfaceOrientationPortraitUpsideDown</string>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<string>UIInterfaceOrientationLandscapeLeft</string>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<string>UIInterfaceOrientationLandscapeRight</string>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</array>");
    _builder.newLine();
    _builder.append("</dict>");
    _builder.newLine();
    _builder.append("</plist>");
    _builder.newLine();
    return _builder;
  }
}
