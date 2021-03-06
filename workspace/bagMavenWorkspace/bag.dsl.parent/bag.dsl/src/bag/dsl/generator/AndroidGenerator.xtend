package bag.dsl.generator

import bag.model.bagEcore.Sensor
import bag.model.bagEcore.App
import bag.model.bagEcore.DataType

/**
 * The generator file for all Android based generate-methods.
 */
class AndroidGenerator {
	
	// Helper variables
	Integer counter = 0;
	Integer serviceCounter = 0;
	String currentService = "";
	
	/**
	 * Generate-method for the 'actionbar_indeterminate_progress.xml' file.
	 */
	def generateActionbar() '''
	<?xml version="1.0" encoding="utf-8"?>
	<FrameLayout xmlns:android="http://schemas.android.com/apk/res/android"
		android:layout_height="wrap_content"
		android:layout_width="56dp"
		android:minWidth="56dp">
		<ProgressBar android:layout_width="32dp"
			android:layout_height="32dp"
			android:layout_gravity="center"/>
	</FrameLayout>
	'''
	
	/**
	 * Generate-method for the 'AndroidManifest.xml' file. Inside this file there is a reference to the 'packageName' and 'appNamePath' variables.
	 */
	def generateAndroidManifest(String packageName, String appNamePath) '''
	<manifest xmlns:android="http://schemas.android.com/apk/res/android" package="�packageName�.�appNamePath�">
	
	    <uses-feature
	        android:name="android.hardware.bluetooth_le"
	        android:required="true" />
	
	    <uses-permission android:name="android.permission.BLUETOOTH" />
	    <uses-permission android:name="android.permission.BLUETOOTH_ADMIN" />
	    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
	    <uses-permission android:name="android.permission.INTERNET" />
	
	    <application
	        android:allowBackup="true"
	        android:icon="@mipmap/ic_launcher"
	        android:label="@string/app_name"
	        android:roundIcon="@mipmap/ic_launcher_round"
	        android:supportsRtl="true"
	        android:theme="@android:style/Theme.Holo.Light">
	
	        <activity android:name=".DeviceScanActivity"
	            android:label="@string/app_name"
	            android:screenOrientation="portrait">
	
	            <intent-filter>
	                <action android:name="android.intent.action.MAIN"/>
	                <category android:name="android.intent.category.LAUNCHER"/>
	            </intent-filter>
	        </activity>
	        <activity android:name=".DeviceControlActivity"/>
	        <service android:name=".BluetoothLeService" android:enabled="true"/>
	    </application>
	</manifest>
	'''
	
	/**
	 * Generate-method for the 'build.gradle' file. There are references to 'packageName' and 'appNamePath'.
	 */
	def generateBuildGradle(String packageName, String appNamePath) '''
	apply plugin: 'com.android.application'
	
	android {
	    compileSdkVersion 29
	    buildToolsVersion "29.0.2"
	    defaultConfig {
	        applicationId "�packageName�.�appNamePath�"
	        minSdkVersion 23
	        targetSdkVersion 29
	        versionCode 1
	        versionName "1.0"
	        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
	    }
	    buildTypes {
	        release {
	            minifyEnabled false
	            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
	        }
	    }
	}
	
	dependencies {
	    implementation fileTree(dir: 'libs', include: ['*.jar'])
	    implementation 'androidx.appcompat:appcompat:1.1.0'
	    testImplementation 'junit:junit:4.12'
	    androidTestImplementation 'androidx.test.ext:junit:1.1.1'
	    androidTestImplementation 'androidx.test.espresso:espresso-core:3.2.0'
	    implementation 'androidx.constraintlayout:constraintlayout:1.1.3'
	}
	'''
	
	/**
	 * Generate-method for the 'listitem_device.xml' file. This file defines the layout of the list view in which the nearby BLE devices are listed.
	 */
	def generateListitem() '''
	<?xml version="1.0" encoding="utf-8"?>
	<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
		android:orientation="vertical"
		android:layout_width="match_parent"
		android:layout_height="wrap_content">
		<TextView android:id="@+id/device_name"
			android:layout_width="match_parent"
			android:layout_height="wrap_content"
			android:textSize="24dp"/>
		<TextView android:id="@+id/device_address"
			android:layout_width="match_parent"
			android:layout_height="wrap_content"
			android:textSize="12dp"/>
	</LinearLayout>
	'''
	
	/**
	 * Generate-method for the 'device_control_activity.xml' file. This method generates the layout file for the main activity of the application.
	 * With the use of the helper variables the generate-method creates a layout  in which a new UI-element is placed relatively to an existing UI-element. 
	 */
	def generateDeviceControlLayout(Sensor sensor) '''
	��� Reset variables because the class variables stay for every further call of the generate method
	�{counter = 0; ""}�
	�{serviceCounter = 0; ""}�
	�{currentService = ""; ""}�
	<?xml version="1.0" encoding="utf-8"?>
		<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
			xmlns:app="http://schemas.android.com/apk/res-auto"
			xmlns:tools="http://schemas.android.com/tools"
			android:layout_width="match_parent"
			android:layout_height="match_parent"
			tools:layout_editor_absoluteX="1dp"
			tools:layout_editor_absoluteY="390dp">
			<androidx.constraintlayout.widget.ConstraintLayout
	 			android:layout_width="match_parent"
	 			android:layout_height="wrap_content"
	 			android:focusable="true"
	 			android:focusableInTouchMode="true">
	 			<TextView
					android:id="@+id/device_name_header"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="8dp"
					android:layout_marginTop="8dp"
					android:text="@string/label_device_name"
					android:textSize="18sp"
					android:textStyle="bold"
					app:layout_constraintStart_toStartOf="parent"
					app:layout_constraintTop_toTopOf="parent" />
	 			<TextView
					 android:id="@+id/device_name"
					 android:layout_width="wrap_content"
					 android:layout_height="wrap_content"
					 android:layout_marginStart="16dp"
					 android:text="Example"
					 android:textSize="18sp"
					 app:layout_constraintStart_toEndOf="@+id/device_name_header"
					 app:layout_constraintTop_toTopOf="@+id/device_name_header" />
				<TextView
					 android:id="@+id/device_address_header"
					 android:layout_width="wrap_content"
					 android:layout_height="wrap_content"
					 android:layout_marginTop="8dp"
					 android:text="@string/label_device_address"
					 android:textSize="14sp"
					 android:textStyle="bold"
					 app:layout_constraintStart_toStartOf="@+id/device_name_header"
					 app:layout_constraintTop_toBottomOf="@+id/device_name_header" />
	 			<TextView
					 android:id="@+id/device_address"
					 android:layout_width="wrap_content"
					 android:layout_height="wrap_content"
					 android:text="Example"
					 android:textSize="14sp"
					 app:layout_constraintStart_toStartOf="@+id/device_name"
					 app:layout_constraintTop_toTopOf="@+id/device_address_header" />
	 			<TextView
					 android:id="@+id/connection_state_header"
					 android:layout_width="wrap_content"
					 android:layout_height="wrap_content"
					 android:layout_marginTop="8dp"
					 android:text="@string/label_state"
					 android:textSize="14sp"
					 android:textStyle="bold"
					 app:layout_constraintStart_toStartOf="@+id/device_address_header"
					 app:layout_constraintTop_toBottomOf="@+id/device_address_header" />
	 			<TextView
					 android:id="@+id/connection_state"
					 android:layout_width="wrap_content"
					 android:layout_height="wrap_content"
					 android:text="@string/disconnected"
					 android:textSize="14sp"
					 app:layout_constraintStart_toStartOf="@+id/device_address"
					 app:layout_constraintTop_toTopOf="@+id/connection_state_header" />
				��� The first element need a reference to connection_state_header and every following to the previous element
				
				�FOR service : sensor.service�
				�{serviceCounter = serviceCounter + 1; ""}�
				�IF serviceCounter >= 2�
				�{currentService = sensor.service.get(serviceCounter - 2).name; ""}�
				�{counter = 0; ""}�
				�ELSE�
				�ENDIF�
				�FOR characteristic : service.characteristic�
				�IF characteristic.uielement !== null�
				�IF counter == 0 && serviceCounter == 1�
				<TextView
					android:id="@+id/textView�characteristic.uielement.name�Header"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="8dp"
					android:layout_marginTop="16dp"
					android:text="@string/label_�characteristic.uielement.name�"
					android:textSize="14sp"
					android:textStyle="bold"
					app:layout_constraintStart_toStartOf="parent"
					app:layout_constraintTop_toBottomOf="@+id/connection_state_header" />
				��� Depending on set characteristic operations generate views and set them visible or invisible
				�IF characteristic.read.equals(true)�
				<TextView
					android:id="@+id/textView�characteristic.uielement.name�ReadValue"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="8dp"
					android:layout_marginTop="16dp"
					android:text="@string/no_data"
					android:textSize="14sp"
					app:layout_constraintStart_toStartOf="parent"
					app:layout_constraintTop_toBottomOf="@+id/textView�characteristic.uielement.name�Header" />
				<Button
					android:id="@+id/button�characteristic.uielement.name�Read"
					style="@style/Widget.AppCompat.Button.Small"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="4dp"
					android:text="read"
					android:textSize="12sp"
					app:layout_constraintBottom_toBottomOf="@+id/textView�characteristic.uielement.name�ReadValue"
					app:layout_constraintStart_toEndOf="@+id/textView�characteristic.uielement.name�ReadValue"
					app:layout_constraintTop_toTopOf="@+id/textView�characteristic.uielement.name�ReadValue" />	
				�ELSE�
				<TextView
					android:id="@+id/textView�characteristic.uielement.name�ReadValue"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="8dp"
					android:layout_marginTop="16dp"
					android:text="@string/no_data"
					android:textSize="14sp"
					android:enabled="false"
					app:layout_constraintStart_toStartOf="parent"
					app:layout_constraintTop_toBottomOf="@+id/textView�characteristic.uielement.name�Header" />
				<Button
					android:id="@+id/button�characteristic.uielement.name�Read"
					style="@style/Widget.AppCompat.Button.Small"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="4dp"
					android:text="read"
					android:textSize="12sp"
					android:enabled="false"
					android:clickable="false"
					app:layout_constraintBottom_toBottomOf="@+id/textView�characteristic.uielement.name�ReadValue"
					app:layout_constraintStart_toEndOf="@+id/textView�characteristic.uielement.name�ReadValue"
					app:layout_constraintTop_toTopOf="@+id/textView�characteristic.uielement.name�ReadValue" />	
				�ENDIF�
				�IF characteristic.write.equals(true)�
				<EditText
					android:id="@+id/editView�characteristic.uielement.name�WriteValue"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="8dp"
					android:inputType="text"
					android:text="0"
					android:textSize="14sp"
					app:layout_constraintBottom_toBottomOf="@+id/button�characteristic.uielement.name�Read"
					app:layout_constraintStart_toEndOf="@+id/button�characteristic.uielement.name�Read"
					app:layout_constraintTop_toTopOf="@+id/button�characteristic.uielement.name�Read" />
				<Button
					android:id="@+id/button�characteristic.uielement.name�Write"
					style="@style/Widget.AppCompat.Button.Small"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="4dp"
					android:text="write"
					android:textSize="12sp"
					app:layout_constraintBottom_toBottomOf="@+id/editView�characteristic.uielement.name�WriteValue"
					app:layout_constraintStart_toEndOf="@+id/editView�characteristic.uielement.name�WriteValue"
					app:layout_constraintTop_toTopOf="@+id/editView�characteristic.uielement.name�WriteValue" />
				�ELSE�
				<EditText
					android:id="@+id/editView�characteristic.uielement.name�WriteValue"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="8dp"
					android:inputType="text"
					android:text="0"
					android:textSize="14sp"
					android:enabled="false"
					android:clickable="false"
					app:layout_constraintBottom_toBottomOf="@+id/button�characteristic.uielement.name�Read"
					app:layout_constraintStart_toEndOf="@+id/button�characteristic.uielement.name�Read"
					app:layout_constraintTop_toTopOf="@+id/button�characteristic.uielement.name�Read" />
				<Button
					android:id="@+id/button�characteristic.uielement.name�Write"
					style="@style/Widget.AppCompat.Button.Small"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="4dp"
					android:text="write"
					android:textSize="12sp"
					android:enabled="false"
					android:clickable="false"
					app:layout_constraintBottom_toBottomOf="@+id/editView�characteristic.uielement.name�WriteValue"
					app:layout_constraintStart_toEndOf="@+id/editView�characteristic.uielement.name�WriteValue"
					app:layout_constraintTop_toTopOf="@+id/editView�characteristic.uielement.name�WriteValue" />
				�ENDIF�
				�IF characteristic.notification.equals(true)�
				<TextView
					android:id="@+id/textView�characteristic.uielement.name�NotifyValue"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="16dp"
					android:text="@string/no_data"
					android:textSize="14sp"
					app:layout_constraintBottom_toBottomOf="@+id/button�characteristic.uielement.name�Write"
					app:layout_constraintStart_toEndOf="@+id/button�characteristic.uielement.name�Write"
					app:layout_constraintTop_toTopOf="@+id/button�characteristic.uielement.name�Write" />
				�ELSE�
				<TextView
					android:id="@+id/textView�characteristic.uielement.name�NotifyValue"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="16dp"
					android:text="@string/no_data"
					android:textSize="14sp"
					android:enabled="false"
					app:layout_constraintBottom_toBottomOf="@+id/button�characteristic.uielement.name�Write"
					app:layout_constraintStart_toEndOf="@+id/button�characteristic.uielement.name�Write"
					app:layout_constraintTop_toTopOf="@+id/button�characteristic.uielement.name�Write" />
				�ENDIF�
				�{counter = counter + 1; ""}�
				�ELSE�
				�IF !currentService.equals("") && !service.name.equals(currentService)�
				<TextView
					android:id="@+id/textView�characteristic.uielement.name�Header"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="8dp"
					android:layout_marginTop="64dp"
					android:text="@string/label_�characteristic.uielement.name�"
					android:textSize="14sp"
					android:textStyle="bold"
					app:layout_constraintStart_toStartOf="parent"
					app:layout_constraintTop_toBottomOf="@+id/textView�sensor.service.get(serviceCounter - 2).characteristic.get(sensor.service.get(serviceCounter - 2).characteristic.size - 1).uielement.name�Header" />
				�{currentService = service.name; ""}�
				�ELSE�
				<TextView
					android:id="@+id/textView�characteristic.uielement.name�Header"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="8dp"
					android:layout_marginTop="64dp"
					android:text="@string/label_�characteristic.uielement.name�"
					android:textSize="14sp"
					android:textStyle="bold"
					app:layout_constraintStart_toStartOf="parent"
					app:layout_constraintTop_toBottomOf="@+id/textView�service.characteristic.get(counter-1).uielement.name�Header" />
				�ENDIF�
				��� Depending on set characteristic operations generate views and set them visible or invisible
				
				�IF characteristic.read.equals(true)�
				<TextView
					android:id="@+id/textView�characteristic.uielement.name�ReadValue"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="8dp"
					android:layout_marginTop="16dp"
					android:text="@string/no_data"
					android:textSize="14sp"
					app:layout_constraintStart_toStartOf="parent"
					app:layout_constraintTop_toBottomOf="@+id/textView�characteristic.uielement.name�Header" />
				<Button
					android:id="@+id/button�characteristic.uielement.name�Read"
					style="@style/Widget.AppCompat.Button.Small"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="4dp"
					android:text="read"
					android:textSize="12sp"
					app:layout_constraintBottom_toBottomOf="@+id/textView�characteristic.uielement.name�ReadValue"
					app:layout_constraintStart_toEndOf="@+id/textView�characteristic.uielement.name�ReadValue"
					app:layout_constraintTop_toTopOf="@+id/textView�characteristic.uielement.name�ReadValue" />
				�ELSE�
				<TextView
					android:id="@+id/textView�characteristic.uielement.name�ReadValue"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="8dp"
					android:layout_marginTop="16dp"
					android:text="@string/no_data"
					android:textSize="14sp"
					android:enabled="false"
					app:layout_constraintStart_toStartOf="parent"
					app:layout_constraintTop_toBottomOf="@+id/textView�characteristic.uielement.name�Header" />
				<Button
					android:id="@+id/button�characteristic.uielement.name�Read"
					style="@style/Widget.AppCompat.Button.Small"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="4dp"
					android:text="read"
					android:textSize="12sp"
					android:enabled="false"
					android:clickable="false"
					app:layout_constraintBottom_toBottomOf="@+id/textView�characteristic.uielement.name�ReadValue"
					app:layout_constraintStart_toEndOf="@+id/textView�characteristic.uielement.name�ReadValue"
					app:layout_constraintTop_toTopOf="@+id/textView�characteristic.uielement.name�ReadValue" />
				�ENDIF�
				�IF characteristic.write.equals(true)�
				<EditText
					android:id="@+id/editView�characteristic.uielement.name�WriteValue"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="8dp"
					android:inputType="text"
					android:text="0"
					android:textSize="14sp"
					app:layout_constraintBottom_toBottomOf="@+id/button�characteristic.uielement.name�Read"
					app:layout_constraintStart_toEndOf="@+id/button�characteristic.uielement.name�Read"
					app:layout_constraintTop_toTopOf="@+id/button�characteristic.uielement.name�Read" />
				<Button
					android:id="@+id/button�characteristic.uielement.name�Write"
					style="@style/Widget.AppCompat.Button.Small"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="4dp"
					android:text="write"
					android:textSize="12sp"
					app:layout_constraintBottom_toBottomOf="@+id/editView�characteristic.uielement.name�WriteValue"
					app:layout_constraintStart_toEndOf="@+id/editView�characteristic.uielement.name�WriteValue"
					app:layout_constraintTop_toTopOf="@+id/editView�characteristic.uielement.name�WriteValue" />
				�ELSE�
				<EditText
					android:id="@+id/editView�characteristic.uielement.name�WriteValue"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="8dp"
					android:inputType="text"
					android:text="0"
					android:textSize="14sp"
					android:enabled="false"
					android:clickable="false"
					app:layout_constraintBottom_toBottomOf="@+id/button�characteristic.uielement.name�Read"
					app:layout_constraintStart_toEndOf="@+id/button�characteristic.uielement.name�Read"
					app:layout_constraintTop_toTopOf="@+id/button�characteristic.uielement.name�Read" />
				<Button
					android:id="@+id/button�characteristic.uielement.name�Write"
					style="@style/Widget.AppCompat.Button.Small"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="4dp"
					android:text="write"
					android:textSize="12sp"
					android:enabled="false"
					android:clickable="false"
					app:layout_constraintBottom_toBottomOf="@+id/editView�characteristic.uielement.name�WriteValue"
					app:layout_constraintStart_toEndOf="@+id/editView�characteristic.uielement.name�WriteValue"
					app:layout_constraintTop_toTopOf="@+id/editView�characteristic.uielement.name�WriteValue" />
				�ENDIF�
				�IF characteristic.notification.equals(true)�
				<TextView
					android:id="@+id/textView�characteristic.uielement.name�NotifyValue"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="16dp"
					android:text="@string/no_data"
					android:textSize="14sp"
					app:layout_constraintBottom_toBottomOf="@+id/button�characteristic.uielement.name�Write"
					app:layout_constraintStart_toEndOf="@+id/button�characteristic.uielement.name�Write"
					app:layout_constraintTop_toTopOf="@+id/button�characteristic.uielement.name�Write" />
				�ELSE�
				<TextView
					android:id="@+id/textView�characteristic.uielement.name�NotifyValue"
					android:layout_width="wrap_content"
					android:layout_height="wrap_content"
					android:layout_marginStart="16dp"
					android:text="@string/no_data"
					android:textSize="14sp"
					android:enabled="false"
					app:layout_constraintBottom_toBottomOf="@+id/button�characteristic.uielement.name�Write"
					app:layout_constraintStart_toEndOf="@+id/button�characteristic.uielement.name�Write"
					app:layout_constraintTop_toTopOf="@+id/button�characteristic.uielement.name�Write" />
				�ENDIF�
				�{counter = counter + 1; ""}�
				�ENDIF�
				�ENDIF�
				�ENDFOR�
				�ENDFOR�
	    	</androidx.constraintlayout.widget.ConstraintLayout>
		</ScrollView>
	'''
	
	/**
	 * Generate-method for the 'gatt_services.xml' file. This file is for defining the layout of the second menu of the application.
	 */
	def generateGattServices() '''
	<?xml version="1.0" encoding="utf-8"?>
	<menu xmlns:android="http://schemas.android.com/apk/res/android">
		<item android:id="@+id/menu_refresh"
			android:checkable="false"
			android:orderInCategory="1"
			android:showAsAction="ifRoom"/>
		<item android:id="@+id/menu_connect"
			android:title="@string/menu_connect"
			android:orderInCategory="100"
			android:showAsAction="ifRoom|withText"/>
		<item android:id="@+id/menu_disconnect"
			android:title="@string/menu_disconnect"
			android:orderInCategory="101"
			android:showAsAction="ifRoom|withText"/>
	</menu>
	'''
	
	/**
	 * Generate-method for the 'main.xml' file. This file is for defining the layout of the main menu of the application.
	 */
	def generateMainXml() '''
	<?xml version="1.0" encoding="utf-8"?>
	<menu xmlns:android="http://schemas.android.com/apk/res/android">
		<item android:id="@+id/menu_refresh"
			android:checkable="false"
			android:orderInCategory="1"
			android:showAsAction="ifRoom"/>
		<item android:id="@+id/menu_scan"
			android:title="@string/menu_scan"
			android:orderInCategory="100"
			android:showAsAction="ifRoom|withText"/>
		<item android:id="@+id/menu_stop"
			android:title="@string/menu_stop"
			android:orderInCategory="101"
			android:showAsAction="ifRoom|withText"/>
	</menu>
	'''
	
	/**
	 * Generate-method for the 'colors.xml' file. This file is for defining the color schema of the application. 
	 */
	def generateColors() '''
	<resources>
		<color name="colorPrimary">#008577</color>
		<color name="colorPrimaryDark">#00574B</color>
		<color name="colorAccent">#D81B60</color>
	</resources>
	'''
	
	/**
	 * Generate-method for the 'styles.xml' file. This file is for defining the style of the application.
	 */
	def generateStyles() '''
	<resources>
		<!-- Base application theme. -->
	    <style name="AppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
	        <!-- Customize your theme here. -->
	        <item name="colorPrimary">@color/colorPrimary</item>
	        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
	        <item name="colorAccent">@color/colorAccent</item>
	    </style>
	</resources>
	'''
	
	/**
	 * Generate-method for the 'strings.xml' file. This file stores the defined strings for the application environment.
	 */
	def generateStrings(Sensor sensor, String appName) '''
	<resources>
	    <string name="app_name">�appName�</string>
	    <string name="ble_not_supported">BLE is not supported</string>
	    <string name="label_device_name">Bluetooth Name:</string>
	    <string name="label_device_address">Bluetooth Adresse:</string>
	    <string name="label_state">Status:</string>
	    <string name="no_data">No data</string>
	    <string name="connected">Verbunden</string>
	    <string name="disconnected">Nicht verbunden</string>
	    <string name="title_devices">BLE Ger�te suche</string>
	    <string name="error_bluetooth_not_supported">Bluetooth not supported.</string>
	    <string name="unknown_device">Unknown device</string>
	    <string name="unknown_characteristic">Unknown characteristic</string>
	    <string name="unknown_service">Unknown service</string>
	    �FOR service : sensor.service�
	    �FOR characteristic : service.characteristic�
	    �IF characteristic.uielement !== null�
	    <string name="label_�characteristic.uielement.name�">�characteristic.uielement.label�</string>
	    �ENDIF�
	    �ENDFOR�
	    �ENDFOR�
	    <!-- Menu items -->
	    <string name="menu_connect">Verbinden</string>
	    <string name="menu_disconnect">Verbindung trennen</string>
	    <string name="menu_ad">AD</string>
	    <string name="menu_value">Werte</string>
	    <string name="menu_scan">Scan</string>
	    <string name="menu_stop">Stop</string>
	</resources>
	'''
	
	/**
	 * Generate-method for the 'GattAttributes.java' file. This file stores the defined GATT characteristics and services of the described BLE device.
	 */
	def generateGattAttributes(Sensor sensor, String packageName, String appNamePath) 
	'''
	package �packageName�.�appNamePath�;
	
	import java.util.HashMap;
	
	public class GattAttributes {
	    private static HashMap<String, String> attributes = new HashMap();
	    �FOR service : sensor.service�
	    public static String �service.name� = "�service.uuid�";
	    �FOR characteristic : service.characteristic�
	    public static String �characteristic.name� = "�characteristic.uuid�";
	    �ENDFOR�
	    �ENDFOR�
	    public static String DESCRIPTOR_CUD = "00002901-0000-1000-8000-00805f9b34fb";
	    public static String DESCRIPTOR_CCCD = "00002902-0000-1000-8000-00805f9b34fb";
	
	    static {
	    	�FOR service : sensor.service�
	    	attributes.put(�service.name�, "�service.name�");
	    	�FOR characteristic : service.characteristic�
	    	attributes.put(�characteristic.name�, "�characteristic.name�");
	    	�ENDFOR�
	    	�ENDFOR�
	        attributes.put(DESCRIPTOR_CUD, "");
	        attributes.put(DESCRIPTOR_CCCD, "");
	    }
	
	    public static String lookup(String uuid, String defaultName) {
	        String name = attributes.get(uuid);
	        return name == null ? defaultName : name;
	    }
	}
	'''
	
	/**
	 * Generate-method for the 'DeviceScanActivity.java' file. This files contains the functionality of searching, finding and connecting to nearby BLE devices.
	 */
	def generateDeviceScan(App app, String packageName, String appNamePath) '''
	package �packageName�.�appNamePath�;
	
	import android.Manifest;
	import android.app.Activity;
	import android.app.ListActivity;
	import android.bluetooth.BluetoothAdapter;
	import android.bluetooth.BluetoothDevice;
	import android.bluetooth.BluetoothManager;
	import android.bluetooth.le.BluetoothLeScanner;
	import android.bluetooth.le.ScanCallback;
	import android.bluetooth.le.ScanResult;
	import android.bluetooth.le.ScanSettings;
	import android.bluetooth.le.ScanFilter;
	import android.content.Context;
	import android.content.Intent;
	import android.content.pm.PackageManager;
	import android.os.Bundle;
	import android.os.Handler;
	import android.util.Log;
	import android.view.LayoutInflater;
	import android.view.Menu;
	import android.view.MenuItem;
	import android.view.View;
	import android.view.ViewGroup;
	import android.widget.BaseAdapter;
	import android.widget.ListView;
	import android.widget.TextView;
	import android.widget.Toast;
	import java.util.ArrayList;
	import java.util.List;
	
	public class DeviceScanActivity extends ListActivity {
	    private LeDeviceListAdapter mLeDeviceListAdapter;
	    private BluetoothAdapter mBluetoothAdapter;
	    private BluetoothLeScanner mBluetoothLeScanner;
	    private boolean mScanning;
	    private Handler mHandler;
	    private static final int REQUEST_ENABLE_BT = 1;
	    private static final long SCAN_PERIOD = 10000;

		// For filtering define deviceAddress, filters and settings
		private String[] deviceAddresses;
		private List<ScanFilter> filters = new ArrayList<ScanFilter>();
		private ScanSettings settings;
	
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        getActionBar().setTitle(R.string.title_devices);
	        mHandler = new Handler();
	        
	        String[] PERMISSIONS = {Manifest.permission.ACCESS_COARSE_LOCATION};
	        requestPermissions(PERMISSIONS, 9);
	
	        if (!getPackageManager().hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE)) {
	            Toast.makeText(this, R.string.ble_not_supported, Toast.LENGTH_SHORT).show();
	            finish();
	        }
	        
	        �IF app.macfilter !== null�
	        ArrayList<String> addresses = new ArrayList<String>();
	        �FOR macAddress : app.macfilter.macaddress�
	        addresses.add("�macAddress.address�");
	        �ENDFOR�
	        deviceAddresses = (String[]) addresses.toArray();
	        �ELSE�
	        �ENDIF�
	        
	        final BluetoothManager bluetoothManager = (BluetoothManager) getSystemService(Context.BLUETOOTH_SERVICE);
	        mBluetoothAdapter = bluetoothManager.getAdapter();
	        mBluetoothLeScanner = mBluetoothAdapter.getBluetoothLeScanner();
	
			/* Define ScanSettings with desired SCAN_MODE, create filter from defined deviceAddress and add filter to list of filters
			SCAN_MODE: BALANCED = balanced power mode, LOW_LATENCY = highest duty cycle, LOW_POWER = low power mode, OPPORTUNISTIC = special scan mode */
			settings = new ScanSettings.Builder().setScanMode(ScanSettings.SCAN_MODE_BALANCED).build();
			
			if(deviceAddresses != null) {
				for(int i = 0; i < deviceAddresses.length; i++) {
					if(deviceAddresses[i] != null) {
						ScanFilter filter = new ScanFilter.Builder().setDeviceAddress(deviceAddresses[i]).build();
						filters.add(filter);
					}
				}
			}
	
	        if (mBluetoothAdapter == null) {
	            Toast.makeText(this, R.string.error_bluetooth_not_supported, Toast.LENGTH_SHORT).show();
	            finish();
	            return;
	        }
	    }
	
	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        getMenuInflater().inflate(R.menu.main, menu);
	        if (!mScanning) {
	            menu.findItem(R.id.menu_stop).setVisible(false);
	            menu.findItem(R.id.menu_scan).setVisible(true);
	            menu.findItem(R.id.menu_refresh).setActionView(null);
	        } else {
	            menu.findItem(R.id.menu_stop).setVisible(true);
	            menu.findItem(R.id.menu_scan).setVisible(false);
	            menu.findItem(R.id.menu_refresh).setActionView(
	                    R.layout.actionbar_indeterminate_progress);
	        }
	        return true;
	    }
	
	    @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	        switch (item.getItemId()) {
	            case R.id.menu_scan:
	                mLeDeviceListAdapter.clear();
	                scanLeDevice(true);
	                break;
	            case R.id.menu_stop:
	                scanLeDevice(false);
	                break;
	        }
	        return true;
	    }
	    
	    @Override
	    protected void onResume() {
	        super.onResume();
	
	        if (!mBluetoothAdapter.isEnabled()) {
	            if (!mBluetoothAdapter.isEnabled()) {
	                Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
	                startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT);
	            }
	        }
	
	        mBluetoothLeScanner = mBluetoothAdapter.getBluetoothLeScanner();
	        mLeDeviceListAdapter = new LeDeviceListAdapter();
	        setListAdapter(mLeDeviceListAdapter);
	        scanLeDevice(true);
	    }

	    @Override
	    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	        if (requestCode == REQUEST_ENABLE_BT && resultCode == Activity.RESULT_CANCELED) {
	            finish();
	            return;
	        }
	        super.onActivityResult(requestCode, resultCode, data);
	    }
	
	    @Override
	    protected void onPause() {
	        super.onPause();
	        scanLeDevice(false);
	        mLeDeviceListAdapter.clear();
	    }
	
	    @Override
	    protected void onListItemClick(ListView l, View v, int position, long id) {
	        final BluetoothDevice device = mLeDeviceListAdapter.getDevice(position);
	        if (device == null) return;
	        final Intent intent = new Intent(this, DeviceControlActivity.class);
	        intent.putExtra(DeviceControlActivity.EXTRAS_DEVICE_NAME, device.getName());
	        intent.putExtra(DeviceControlActivity.EXTRAS_DEVICE_ADDRESS, device.getAddress());
	        if (mScanning) {
	            if(mBluetoothAdapter.isEnabled() && mBluetoothLeScanner != null) {
	                mBluetoothLeScanner.stopScan(mLeScanCallback);
	            }
	            mScanning = false;
	        }
	        startActivity(intent);
	    }
	
	    private void scanLeDevice(final boolean enable) {
	        if (enable) {
	            mHandler.postDelayed(new Runnable() {
	                @Override
	                public void run() {
	                    mScanning = false;
	                    if(mBluetoothLeScanner != null && mBluetoothAdapter.isEnabled()) {
	                        mBluetoothLeScanner.stopScan(mLeScanCallback);
	                        invalidateOptionsMenu();
	                    }
	                }
	            }, SCAN_PERIOD);
	
	            mScanning = true;
	            mBluetoothLeScanner.startScan(filters, settings, mLeScanCallback);
	        } else {
	            mScanning = false;
	            mBluetoothLeScanner.stopScan(mLeScanCallback);
	        }
	        invalidateOptionsMenu();
	    }
	
	    private class LeDeviceListAdapter extends BaseAdapter {
	        private ArrayList<BluetoothDevice> mLeDevices;
	        private LayoutInflater mInflator;
	
	        public LeDeviceListAdapter() {
	            super();
	            mLeDevices = new ArrayList<>();
	            mInflator = DeviceScanActivity.this.getLayoutInflater();
	        }
	
	        public void addDevice(BluetoothDevice device) {
	            if(!mLeDevices.contains(device)) {
	            	�IF app.namefilter !== null�
	            	if(device.getName().matches("�app.namefilter.name.regEx�")) {
	            		mLeDevices.add(device);
	            	}
	            	�ELSE�
	            	mLeDevices.add(device);
	            	�ENDIF�
	            }
	        }
	
	        public BluetoothDevice getDevice(int position) {
	            return mLeDevices.get(position);
	        }
	
	        public void clear() {
	            mLeDevices.clear();
	        }
	
	        @Override
	        public int getCount() {
	            return mLeDevices.size();
	        }
	
	        @Override
	        public Object getItem(int i) {
	            return mLeDevices.get(i);
	        }
	
	        @Override
	        public long getItemId(int i) {
	            return i;
	        }
	
	        @Override
	        public View getView(int i, View view, ViewGroup viewGroup) {
	            ViewHolder viewHolder;
	            if (view == null) {
	                view = mInflator.inflate(R.layout.listitem_device, null);
	                viewHolder = new ViewHolder();
	                viewHolder.deviceAddress = view.findViewById(R.id.device_address);
	                viewHolder.deviceName = view.findViewById(R.id.device_name);
	                view.setTag(viewHolder);
	            } else {
	                viewHolder = (ViewHolder) view.getTag();
	            }
	
	            BluetoothDevice device = mLeDevices.get(i);
	            final String deviceName = device.getName();
	            if (deviceName != null && deviceName.length() > 0)
	                viewHolder.deviceName.setText(deviceName);
	            else
	                viewHolder.deviceName.setText(R.string.unknown_device);
	            viewHolder.deviceAddress.setText(device.getAddress());
	
	            return view;
	        }
	    }
	
	    private ScanCallback mLeScanCallback = new ScanCallback() {
	        @Override
	        public void onScanResult(int callbackType, ScanResult result) {
	            super.onScanResult(callbackType, result);
	            BluetoothDevice device = result.getDevice();
	
	            if(device != null) {
	                Log.i("RSSI", device.getName() + ", rssi: " + result.getRssi() + ", scanRecord: " + result.getScanRecord().toString());
	                mLeDeviceListAdapter.addDevice(result.getDevice());
	                mLeDeviceListAdapter.notifyDataSetChanged();
	            }
	        }
	
	        @Override
	        public void onBatchScanResults(List<ScanResult> results) {
	            super.onBatchScanResults(results);
	        }
	
	        @Override
	        public void onScanFailed(int errorCode) {
	            super.onScanFailed(errorCode);
	        }
	    };
	
	    static class ViewHolder {
	        TextView deviceName;
	        TextView deviceAddress;
	    }
	}
	'''
	
	/**
	 * Generate-method for the 'BluetoothLeService.java' file. This files contains the underlying BLE functionality which is necessary to use BLE inside an application.
	 */
	def generateBluetoothLeService(Sensor sensor, String packageName, String appNamePath) '''
	package �packageName�.�appNamePath�;
	
	import android.app.Service;
	import android.bluetooth.BluetoothAdapter;
	import android.bluetooth.BluetoothDevice;
	import android.bluetooth.BluetoothGatt;
	import android.bluetooth.BluetoothGattCallback;
	import android.bluetooth.BluetoothGattCharacteristic;
	import android.bluetooth.BluetoothGattDescriptor;
	import android.bluetooth.BluetoothGattService;
	import android.bluetooth.BluetoothManager;
	import android.bluetooth.BluetoothProfile;
	import android.content.Context;
	import android.content.Intent;
	import android.os.Binder;
	import android.os.IBinder;
	import android.util.Log;
	import java.util.List;
	import java.util.UUID;
	
	public class BluetoothLeService extends Service {
	    private final static String TAG = BluetoothLeService.class.getSimpleName();
	
	    private BluetoothManager mBluetoothManager;
	    private BluetoothAdapter mBluetoothAdapter;
	    private String mBluetoothDeviceAddress;
	    private BluetoothGatt mBluetoothGatt;
	    private int mConnectionState = STATE_DISCONNECTED;
	
	    private DataStruct mDataStruct;
	
	    private static final int STATE_DISCONNECTED = 0;
	    private static final int STATE_CONNECTING = 1;
	    private static final int STATE_CONNECTED = 2;
	
	    public final static String ACTION_GATT_CONNECTED = "com.example.bluetooth.le.ACTION_GATT_CONNECTED";
	    public final static String ACTION_GATT_DISCONNECTED = "com.example.bluetooth.le.ACTION_GATT_DISCONNECTED";
	    public final static String ACTION_GATT_SERVICES_DISCOVERED = "com.example.bluetooth.le.ACTION_GATT_SERVICES_DISCOVERED";
	    public final static String ACTION_DATA_AVAILABLE = "com.example.bluetooth.le.ACTION_DATA_AVAILABLE";
	    public final static String EXTRA_DATA = "com.example.bluetooth.le.EXTRA_DATA";
	
		�FOR service : sensor.service�
		�FOR characteristic : service.characteristic�
		public final static UUID UUID_CHARACTERISTIC_�characteristic.name� = UUID.fromString(GattAttributes.�characteristic.name�);
		�ENDFOR�
		�ENDFOR�

	    private final BluetoothGattCallback mGattCallback = new BluetoothGattCallback() {
	        @Override
	        public void onConnectionStateChange(BluetoothGatt gatt, int status, int newState) {
	            String intentAction;
	            if (newState == BluetoothProfile.STATE_CONNECTED) {
	                intentAction = ACTION_GATT_CONNECTED;
	                mConnectionState = STATE_CONNECTED;
	                broadcastUpdate(intentAction);
	                Log.i(TAG, "Connected to GATT server.");
	                Log.i(TAG, "Attempting to start service discovery:" + mBluetoothGatt.discoverServices());
	
	            } else if (newState == BluetoothProfile.STATE_DISCONNECTED) {
	                intentAction = ACTION_GATT_DISCONNECTED;
	                mConnectionState = STATE_DISCONNECTED;
	                Log.i(TAG, "Disconnected from GATT server.");
	                broadcastUpdate(intentAction);
	            }
	        }
	
	        @Override
	        public void onServicesDiscovered(BluetoothGatt gatt, int status) {
	            if (status == BluetoothGatt.GATT_SUCCESS) {
	                broadcastUpdate(ACTION_GATT_SERVICES_DISCOVERED);
	            } else {
	                Log.w(TAG, "onServicesDiscovered received: " + status);
	            }
	        }
	
	        @Override
	        public void onCharacteristicRead(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic,
	                                         int status) {
	            if (status == BluetoothGatt.GATT_SUCCESS) {
	                broadcastUpdate(ACTION_DATA_AVAILABLE, characteristic);
	            }
	        }
	
	        @Override
	        public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic) {
	            broadcastUpdate(ACTION_DATA_AVAILABLE, characteristic);
	        }
	    };
	
	    private void broadcastUpdate(final String action) {
	        final Intent intent = new Intent(action);
	        sendBroadcast(intent);
	    }
	
	    private void broadcastUpdate(final String action, final BluetoothGattCharacteristic characteristic) {
	        final Intent intent = new Intent(action);
	        final byte[] data = characteristic.getValue();
			��� For the first element there should be a if-clause and for the following an else if-clause
			
			�FOR service : sensor.service�
			�FOR characteristic : service.characteristic�
			if(UUID_CHARACTERISTIC_�characteristic.name�.equals(characteristic.getUuid())) {
				intent.putExtra(EXTRA_DATA, "�characteristic.name�");
				mDataStruct.set�characteristic.name�(data);
			}
			�ENDFOR�
			�ENDFOR�
			else {}
	        sendBroadcast(intent);
	    }
	
	    public DataStruct getDataStruct(){
	        return mDataStruct;
	    }
	
	    public class LocalBinder extends Binder {
	        BluetoothLeService getService() {
	            return BluetoothLeService.this;
	        }
	    }
	
	    @Override
	    public IBinder onBind(Intent intent) {
	        return mBinder;
	    }
	
	    @Override
	    public boolean onUnbind(Intent intent) {
	        close();
	        return super.onUnbind(intent);
	    }
	
	    private final IBinder mBinder = new LocalBinder();
	
	    public boolean initialize() {
	        if (mBluetoothManager == null) {
	            mBluetoothManager = (BluetoothManager) getSystemService(Context.BLUETOOTH_SERVICE);
	            if (mBluetoothManager == null) {
	                Log.e(TAG, "Unable to initialize BluetoothManager.");
	                return false;
	            }
	        }
	
	        mBluetoothAdapter = mBluetoothManager.getAdapter();
	        if (mBluetoothAdapter == null) {
	            Log.e(TAG, "Unable to obtain a BluetoothAdapter.");
	            return false;
	        }
	        mDataStruct = new DataStruct();
	        return true;
	    }
	
	    public boolean connect(final String address) {
	        if (mBluetoothAdapter == null || address == null) {
	            Log.w(TAG, "BluetoothAdapter not initialized or unspecified address.");
	            return false;
	        }
	
	        if (mBluetoothDeviceAddress != null && address.equals(mBluetoothDeviceAddress)
	                && mBluetoothGatt != null) {
	            Log.d(TAG, "Trying to use an existing mBluetoothGatt for connection.");
	            if (mBluetoothGatt.connect()) {
	                mConnectionState = STATE_CONNECTING;
	                return true;
	            } else {
	                return false;
	            }
	        }
	
	        final BluetoothDevice device = mBluetoothAdapter.getRemoteDevice(address);
	        if (device == null) {
	            Log.w(TAG, "Device not found.  Unable to connect.");
	            return false;
	        }
	        mBluetoothGatt = device.connectGatt(this, false, mGattCallback);
	        Log.d(TAG, "Trying to create a new connection.");
	        mBluetoothDeviceAddress = address;
	        mConnectionState = STATE_CONNECTING;
	        return true;
	    }
	
	    public void disconnect() {
	        if (mBluetoothAdapter == null || mBluetoothGatt == null) {
	            Log.w(TAG, "BluetoothAdapter not initialized");
	            return;
	        }
	        mBluetoothGatt.disconnect();
	    }
	
	    public void close() {
	        if (mBluetoothGatt == null) {
	            return;
	        }
	        mBluetoothGatt.close();
	        mBluetoothGatt = null;
	    }
	
	    public void readCharacteristic(BluetoothGattCharacteristic characteristic) {
	        if (mBluetoothAdapter == null || mBluetoothGatt == null) {
	            Log.w(TAG, "BluetoothAdapter not initialized");
	            return;
	        }
	
	        mBluetoothGatt.readCharacteristic(characteristic);
	    }
	
	    public void writeCharacteristic(BluetoothGattCharacteristic characteristic) {
	        if (mBluetoothAdapter == null || mBluetoothGatt == null) {
	            Log.w(TAG, "BluetoothAdapter not initialized");
	            return;
	        }
	        mBluetoothGatt.writeCharacteristic(characteristic);
	    }
	
	    public void setCharacteristicNotification(BluetoothGattCharacteristic characteristic, boolean enabled) {
	        if (mBluetoothAdapter == null || mBluetoothGatt == null) {
	            Log.w(TAG, "BluetoothAdapter not initialized");
	            return;
	        }
	        mBluetoothGatt.setCharacteristicNotification(characteristic, enabled);
	
			�FOR service : sensor.service�
			�FOR characteristic : service.characteristic�
			�IF characteristic.notification�
			if(UUID_CHARACTERISTIC_�characteristic.name�.equals(characteristic.getUuid())) {
				BluetoothGattDescriptor descriptor = characteristic.getDescriptor(UUID.fromString(GattAttributes.DESCRIPTOR_CCCD));
			    descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
				mBluetoothGatt.writeDescriptor(descriptor);
			}
			�ENDIF�
			�ENDFOR�
			�ENDFOR�
	    }
	
	    public List<BluetoothGattService> getSupportedGattServices() {
	        if (mBluetoothGatt == null) return null;
	
	        return mBluetoothGatt.getServices();
	    }
	}
	'''
	
	/**
	 * Generate-method for the 'DeviceControlActivity.java' file. This file contains the main functionality of the main activity of the application.
	 */
	def generateDeviceControlActivity(Sensor sensor, String packageName, String appNamePath) '''
	package �packageName�.�appNamePath�;
		
	import android.app.Activity;
	import android.bluetooth.BluetoothGattCharacteristic;
	import android.bluetooth.BluetoothGattService;
	import android.content.BroadcastReceiver;
	import android.content.ComponentName;
	import android.content.Context;
	import android.content.Intent;
	import android.content.IntentFilter;
	import android.content.ServiceConnection;
	import android.os.Bundle;
	import android.os.IBinder;
	import android.util.Log;
	import android.view.Menu;
	import android.view.MenuItem;
	import android.view.View;
	import android.widget.Button;
	import android.widget.EditText;
	import android.widget.TextView;
	import java.util.List;
	import java.util.UUID;
	
	public class DeviceControlActivity extends Activity {
	    private final static String TAG = DeviceControlActivity.class.getSimpleName();
	
	    public static final String EXTRAS_DEVICE_NAME = "DEVICE_NAME";
	    public static final String EXTRAS_DEVICE_ADDRESS = "DEVICE_ADDRESS";

	   	private TextView mAddress;
	    private TextView mName;
	    private TextView mConnectionState;

		�FOR service : sensor.service�
		�FOR characteristic : service.characteristic�
		�IF characteristic.uielement !== null�
		�IF characteristic.read.equals(true)�
		private TextView textView�characteristic.uielement.name�ReadValue; �IF characteristic.uielement.description !== null� // �characteristic.uielement.description��ENDIF�
		private Button button�characteristic.uielement.name�Read;
		�ELSE�
		�ENDIF�
		�IF characteristic.write.equals(true)�
		private EditText editText�characteristic.uielement.name�WriteValue; �IF characteristic.uielement.description !== null� // �characteristic.uielement.description��ENDIF�
		private Button button�characteristic.uielement.name�Write; 
		�ELSE�
		�ENDIF�
		�IF characteristic.notification.equals(true)�
		private TextView textView�characteristic.uielement.name�NotifyValue; �IF characteristic.uielement.description !== null� // �characteristic.uielement.description��ENDIF�
		�ELSE�
		�ENDIF�
		�ENDIF�
		�ENDFOR�
		�ENDFOR�
	
	    private String mDeviceName;
	    private String mDeviceAddress;

	    private BluetoothLeService mBluetoothLeService;
		�FOR service : sensor.service�
		�FOR characteristic : service.characteristic�
		private BluetoothGattCharacteristic gattCharacteristic�characteristic.name�;
		�ENDFOR�
		�ENDFOR�

	    private boolean mConnected = false;
	
	    private Helper helper;
	
	    private final ServiceConnection mServiceConnection = new ServiceConnection() {
	
	        @Override
	        public void onServiceConnected(ComponentName componentName, IBinder service) {
	            mBluetoothLeService = ((BluetoothLeService.LocalBinder) service).getService();
	            helper = new Helper(mBluetoothLeService);
	            if (!mBluetoothLeService.initialize()) {
	                Log.e(TAG, "Unable to initialize Bluetooth");
	                finish();
	            }
	            mBluetoothLeService.connect(mDeviceAddress);
	        }
	
	        @Override
	        public void onServiceDisconnected(ComponentName componentName) {
	            mBluetoothLeService = null;
	        }
	    };
	
	    private final BroadcastReceiver mGattUpdateReceiver = new BroadcastReceiver() {
	        @Override
	        public void onReceive(Context context, Intent intent) {
	            final String action = intent.getAction();
	            if (BluetoothLeService.ACTION_GATT_CONNECTED.equals(action)) {
	                mConnected = true;
	                updateConnectionState(R.string.connected);
	                invalidateOptionsMenu();
	            } else if (BluetoothLeService.ACTION_GATT_DISCONNECTED.equals(action)) {
	                mConnected = false;
	                updateConnectionState(R.string.disconnected);
	                invalidateOptionsMenu();
	                clearUI();
	            } else if (BluetoothLeService.ACTION_GATT_SERVICES_DISCOVERED.equals(action)) {
	                List<BluetoothGattService> gattServices = mBluetoothLeService.getSupportedGattServices();
	                for(BluetoothGattService s:gattServices) {
	                    List<BluetoothGattCharacteristic> gattCharacteristic = s.getCharacteristics();
	                    for (BluetoothGattCharacteristic c : gattCharacteristic) {
	                    	�FOR service : sensor.service�
	                    	�FOR characteristic : service.characteristic�
	                    	if(c.getUuid().equals(UUID.fromString(GattAttributes.�characteristic.name�))) {
	                    		gattCharacteristic�characteristic.name� = c;
	                    		�IF characteristic.read�
	                    		helper.readCharacteristic(gattCharacteristic�characteristic.name�);
	                    		try {
	                    			Thread.sleep(500);
	                    		} catch (InterruptedException e) {
	                    			e.printStackTrace();
	                    		}
	                    		�ENDIF�
	                    	}
	                    	�ENDFOR�
	                    	�ENDFOR�
	                    }
	                }
	
					�FOR service : sensor.service�
					�FOR characteristic : service.characteristic�
					�IF characteristic.notification�
					if(gattCharacteristic�characteristic.name� != null) {
						helper.setCharacteristicNotification(gattCharacteristic�characteristic.name�);
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					�ENDIF�
					�ENDFOR�
					�ENDFOR�
	
	            } else if (BluetoothLeService.ACTION_DATA_AVAILABLE.equals(action)) {
	                displayData(intent.getStringExtra(BluetoothLeService.EXTRA_DATA));
	            }
	        }
	    };
	
	    private void clearUI() {
	    	�FOR service : sensor.service�
	    	�FOR characteristic : service.characteristic�
	    	�IF characteristic.uielement !== null�
	    	�IF characteristic.read.equals(true)�
	    	textView�characteristic.uielement.name�ReadValue.setText(R.string.no_data);
	    	�ELSE�
	    	�ENDIF�
	    	�IF characteristic.write.equals(true)�
	    	editText�characteristic.uielement.name�WriteValue.setText("0");
	    	�ELSE�
	    	�ENDIF�
	    	�IF characteristic.notification.equals(true)�
	    	textView�characteristic.uielement.name�NotifyValue.setText(R.string.no_data);
	    	�ELSE�
	    	�ENDIF�
	    	�ELSE�
	    	�ENDIF�
	    	�ENDFOR�
	    	�ENDFOR�
	    }
	
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.device_control_activity);
	
	        final Intent intent = getIntent();
	        mDeviceName = intent.getStringExtra(EXTRAS_DEVICE_NAME);
	        mDeviceAddress = intent.getStringExtra(EXTRAS_DEVICE_ADDRESS);
	
	        mName = findViewById(R.id.device_name);
	        mName.setText(mDeviceName);
	
	        mAddress = findViewById(R.id.device_address);
	        mAddress.setText(mDeviceAddress);
	
	        mConnectionState = findViewById(R.id.connection_state);
	        
	        �FOR service : sensor.service�
	        �FOR characteristic : service.characteristic�
	        �IF characteristic.uielement !== null�
	        �IF characteristic.read.equals(true)�
	        textView�characteristic.uielement.name�ReadValue = findViewById(R.id.textView�characteristic.uielement.name�ReadValue);
	        button�characteristic.uielement.name�Read = findViewById(R.id.button�characteristic.uielement.name�Read);
	        button�characteristic.uielement.name�Read.setOnClickListener(new View.OnClickListener() {
	        	public void onClick(View v) {
	        		helper.readCharacteristic(gattCharacteristic�characteristic.name�);
	        	}
	        });
	        �ELSE�
	        �ENDIF�
	        �IF characteristic.write.equals(true)�
	        editText�characteristic.uielement.name�WriteValue = findViewById(R.id.editView�characteristic.uielement.name�WriteValue);
	        button�characteristic.uielement.name�Write = findViewById(R.id.button�characteristic.uielement.name�Write);
	        button�characteristic.uielement.name�Write.setOnClickListener(new View.OnClickListener() {
	        	public void onClick(View v) {
	        		if(!editText�characteristic.uielement.name�WriteValue.getText().toString().isEmpty()) {
	        			�IF characteristic.dataType.equals(DataType.DOUBLE)�
	        			double value = Double.valueOf(editText�characteristic.uielement.name�WriteValue.getText().toString());
	        			helper.writeCharacteristicDouble(gattCharacteristic�characteristic.name�, value);
	        			�ELSEIF characteristic.dataType.equals(DataType.FLOAT)�
	        			float value = Float.valueOf(editText�characteristic.uielement.name�WriteValue.getText().toString());
	        			helper.writeCharacteristicFloat(gattCharacteristic�characteristic.name�, value);
	        			�ELSEIF characteristic.dataType.equals(DataType.INTEGER)�
	        			int value = Integer.valueOf(editText�characteristic.uielement.name�WriteValue.getText().toString());
	        			helper.writeCharacteristicInt(gattCharacteristic�characteristic.name�, value);
	        			�ELSEIF characteristic.dataType.equals(DataType.STRING)�
	        			String value = editText�characteristic.uielement.name�WriteValue.getText().toString();
	        			helper.writeCharacteristicString(gattCharacteristic�characteristic.name�, value);
	        			�ELSEIF characteristic.dataType.equals(DataType.BYTE)�
	        			int value = Integer.valueOf(editText�characteristic.uielement.name�WriteValue.getText().toString());
	        			helper.writeCharacteristicByte(gattCharacteristic�characteristic.name�, (byte) value);
	        			�ELSEIF characteristic.dataType.equals(DataType.BYTES)�
	        			String value = editText�characteristic.uielement.name�WriteValue.getText().toString();
	        			helper.writeCharacteristicBytes(gattCharacteristic�characteristic.name�, value.getBytes());
	        			�ELSE�
	        			�ENDIF�
	        		}
	        	}
	        });
	        �ELSE�
	        �ENDIF�
	        �IF characteristic.notification.equals(true)�
	        textView�characteristic.uielement.name�NotifyValue = findViewById(R.id.textView�characteristic.uielement.name�NotifyValue);
	        �ELSE�
	        �ENDIF�
	        �ELSE�
	        �ENDIF�
	        �ENDFOR�
	        �ENDFOR�
	
	        getActionBar().setTitle(mDeviceName);
	        getActionBar().setDisplayHomeAsUpEnabled(true);
	        Intent gattServiceIntent = new Intent(this, BluetoothLeService.class);
	        bindService(gattServiceIntent, mServiceConnection, BIND_AUTO_CREATE);
	    }
	
	    @Override
	    protected void onResume() {
	        super.onResume();
	        registerReceiver(mGattUpdateReceiver, makeGattUpdateIntentFilter());
	        if (mBluetoothLeService != null) {
	            final boolean result = mBluetoothLeService.connect(mDeviceAddress);
	            Log.d(TAG, "Connect request result=" + result);
	        }
	    }
	
	    @Override
	    protected void onPause() {
	        super.onPause();
	        unregisterReceiver(mGattUpdateReceiver);
	    }
	
	    @Override
	    protected void onDestroy() {
	        super.onDestroy();
	        unbindService(mServiceConnection);
	        mBluetoothLeService = null;
	    }
	
	    @Override
	    public boolean onCreateOptionsMenu(Menu menu) {
	        getMenuInflater().inflate(R.menu.gatt_services, menu);
	        if (mConnected) {
	            menu.findItem(R.id.menu_connect).setVisible(false);
	            menu.findItem(R.id.menu_disconnect).setVisible(true);
	        } else {
	            menu.findItem(R.id.menu_connect).setVisible(true);
	            menu.findItem(R.id.menu_disconnect).setVisible(false);
	        }
	        return true;
	    }
	
	    @Override
	    public boolean onOptionsItemSelected(MenuItem item) {
	        switch(item.getItemId()) {
	            case R.id.menu_connect:
	                mBluetoothLeService.connect(mDeviceAddress);
	                return true;
	            case R.id.menu_disconnect:
	                mBluetoothLeService.disconnect();
	                return true;
	            case android.R.id.home:
	                onBackPressed();
	                return true;
	        }
	        return super.onOptionsItemSelected(item);
	    }
	
	    private void updateConnectionState(final int resourceId) {
	        runOnUiThread(new Runnable() {
	            @Override
	            public void run() {
	                mConnectionState.setText(resourceId);
	            }
	        });
	    }
	
	    private void displayData(final String t1) {
	        runOnUiThread(new Runnable() {
	            @Override
	            public void run() {
	            	if(t1 != null) {
	            		�FOR service : sensor.service�
	            		�FOR characteristic : service.characteristic�
	            		�IF characteristic.uielement !== null�
	            		�IF characteristic.read.equals(true)�
	            		if(t1.equals("�characteristic.name�")) {
	            			�IF characteristic.unit !== null�
	            			textView�characteristic.uielement.name�ReadValue.setText(helper.get("�characteristic.name�") + "�characteristic.unit�");
	            			�ELSE�
	            			textView�characteristic.uielement.name�ReadValue.setText(helper.get("�characteristic.name�"));
	            			�ENDIF�
	            		}
	            		�ELSE�
	            		�ENDIF�
	            		�IF characteristic.notification.equals(true)�
	            		if(t1.equals("�characteristic.name�")) {
	            			�IF characteristic.unit !== null�
	            			textView�characteristic.uielement.name�NotifyValue.setText(helper.get("�characteristic.name�") + "�characteristic.unit�");
	            			�ELSE�
	            			textView�characteristic.uielement.name�NotifyValue.setText(helper.get("�characteristic.name�"));
	            			�ENDIF�
	            		}
	            		�ELSE�
	            		�ENDIF�
	            		�ELSE�
	            		�ENDIF�
	            		�ENDFOR�
	            		�ENDFOR�
	            	}
	            }
	        });
	    }
	
	    private static IntentFilter makeGattUpdateIntentFilter() {
	        final IntentFilter intentFilter = new IntentFilter();
	        intentFilter.addAction(BluetoothLeService.ACTION_GATT_CONNECTED);
	        intentFilter.addAction(BluetoothLeService.ACTION_GATT_DISCONNECTED);
	        intentFilter.addAction(BluetoothLeService.ACTION_GATT_SERVICES_DISCOVERED);
	        intentFilter.addAction(BluetoothLeService.ACTION_DATA_AVAILABLE);
	        return intentFilter;
	    }
	}
	'''
	
	/**
	 * Generate-method for the 'DataStruct.java' file. This file is a type of helper class to store and manage data received from the BLE device.
	 */
	def generateDataStruct(Sensor sensor, String packageName, String appNamePath) '''
	package �packageName�.�appNamePath�;
	
	public class DataStruct {
	
		�FOR service : sensor.service�
		�FOR characteristic : service.characteristic�
		�IF characteristic.dataType.equals(DataType.BYTES)�
		private bytes[] �characteristic.name�;
		�ELSEIF characteristic.dataType.equals(DataType.BYTE)�
		private byte �characteristic.name�;
		�ELSEIF characteristic.dataType.equals(DataType.DOUBLE)�
		private double �characteristic.name�;
		�ELSEIF characteristic.dataType.equals(DataType.FLOAT)�
		private float �characteristic.name�;
		�ELSEIF characteristic.dataType.equals(DataType.INTEGER)�
		private int �characteristic.name�;
		�ELSEIF characteristic.dataType.equals(DataType.STRING)�
		private String �characteristic.name�;
		�ENDIF�
		�ENDFOR�
		�ENDFOR�
	
	    public DataStruct(){
	        �FOR service : sensor.service�
	        �FOR characteristic : service.characteristic�
	        �IF characteristic.dataType !== DataType.STRING�
	        �characteristic.name� = 0;
	        �ELSE�
	        �characteristic.name� = "";
	        �ENDIF�
	        �ENDFOR�
	        �ENDFOR�
	    }
	    
	    �FOR service : sensor.service�
	    �FOR characteristic : service.characteristic�
	    �IF characteristic.dataType.equals(DataType.BYTES)�
	    public void set�characteristic.name�(byte[] data) {
	    	�characteristic.name� = data;
	    }
	    
	    public byte[] get�characteristic.name�() {
	    	return �characteristic.name�;
	    }
	    
	    �ELSEIF characteristic.dataType.equals(DataType.BYTE)�
	    public void set�characteristic.name�(byte[] data) {
	    	// TODO: Add code to receive data and convert if necessary
	    	�characteristic.name� = data[0];
	    }
	    
	    public byte get�characteristic.name�() {
	    	return �characteristic.name�;
	    }
	    
	    �ELSEIF characteristic.dataType.equals(DataType.DOUBLE)�
	    public void set�characteristic.name�(byte[] data) {
	    	// TODO: Add code to receive data and convert if necessary
	    	�characteristic.name� = data[0];
	    }
	    
	    public double get�characteristic.name�() {
	    	return �characteristic.name�;
	    }
	    
	    �ELSEIF characteristic.dataType.equals(DataType.FLOAT)�
	    public void set�characteristic.name�(byte[] data) {
	    	// TODO: Add code to receive data and convert if necessary
	    	�characteristic.name� = data[0];
	    }
	    
	    public float get�characteristic.name�() {
	    	return �characteristic.name�;
	    }
	    
	    �ELSEIF characteristic.dataType.equals(DataType.INTEGER)�
	    public void set�characteristic.name�(byte[] data) {
	    	// TODO: Add code to receive data and convert if necessary
	    	�characteristic.name� = data[0];
	    }
	    
	    public int get�characteristic.name�() {
	    	return �characteristic.name�;
	    }
	    
	    �ELSEIF characteristic.dataType.equals(DataType.STRING)�
	    public void set�characteristic.name�(byte[] data) {
	    	// TODO: Add code to receive data and convert if necessary
	    	�characteristic.name� = String.valueOf(data[0]);
	    }
	    
	    public String get�characteristic.name�() {
	    	return �characteristic.name�;
	    }
	    
	    �ENDIF�
	    �ENDFOR�
	    �ENDFOR�
	}
	'''
	
	/**
	 * Generate-method for the 'Helper.java' file. This file is a helper class to ease the communication between the application and the BLE device.
	 */
	def generateHelper(Sensor sensor, String packageName, String appNamePath) '''
	package �packageName�.�appNamePath�;
	
	import android.bluetooth.BluetoothGattCharacteristic;
	import java.nio.ByteBuffer;
	
	public class Helper {
	
	    BluetoothLeService bluetoothLeService;
	
	    public Helper(BluetoothLeService service) {
	        bluetoothLeService = service;
	    }
	
	    public void readCharacteristic(BluetoothGattCharacteristic characteristic) {
	        bluetoothLeService.readCharacteristic(characteristic);
	    }
	
	    public boolean writeCharacteristicInt(BluetoothGattCharacteristic characteristic, int value) {
	    	// TODO: Add your own conversion methods or adjust existing conversion methods
	        byte[] bytes = intToByteArray(value);
	        boolean result = characteristic.setValue(bytes);
	        bluetoothLeService.writeCharacteristic(characteristic);
	
	        return result;
	    }
	    
	    public boolean writeCharacteristicFloat(BluetoothGattCharacteristic characteristic, float value) {
	    	// TODO: Add your own conversion methods or adjust existing conversion methods
	        byte[] bytes = floatToByteArray(value);
	        boolean result = characteristic.setValue(bytes);
	        bluetoothLeService.writeCharacteristic(characteristic);
	
	        return result;
	    }
	    
	    public boolean writeCharacteristicDouble(BluetoothGattCharacteristic characteristic, double value) {
	    	// TODO: Add your own conversion methods or adjust existing conversion methods
	    	byte[] bytes = doubleToByteArray(value);
	    	boolean result = characteristic.setValue(bytes);
	    	bluetoothLeService.writeCharacteristic(characteristic);
	    	
	    	return result;
	    }
	    
	    public boolean writeCharacteristicString(BluetoothGattCharacteristic characteristic, String value) {
	    	// TODO: Add your own conversion methods or adjust existing conversion methods
	    	byte[] bytes = value.getBytes();
	    	boolean result = characteristic.setValue(bytes);
	    	bluetoothLeService.writeCharacteristic(characteristic);
	    	
	    	return result;
	    }
	
	    public boolean writeCharacteristicByte(BluetoothGattCharacteristic characteristic, byte value) {
	    	// TODO: Add your own conversion methods or adjust existing conversion methods
	        boolean result = characteristic.setValue(new byte[]{value});
	        bluetoothLeService.writeCharacteristic(characteristic);
	
	        return result;
	    }
	    
	    public boolean writeCharacteristicBytes(BluetoothGattCharacteristic characteristic, byte[] value) {
	    	// TODO: Add your own conversion methods or adjust existing conversion methods
	    	boolean result = characteristic.setValue(value);
	    	bluetoothLeService.writeCharacteristic(characteristic);
	    	
	    	return result;
	    }
	
	    public void setCharacteristicNotification(BluetoothGattCharacteristic characteristic) {
	        bluetoothLeService.setCharacteristicNotification(characteristic, true);
	    }
	
		public String get(String identifier) {
	    	switch (identifier) {
	    		�FOR service : sensor.service�
	    		�FOR characteristic : service.characteristic�
	    		case "�characteristic.name�": return String.valueOf(bluetoothLeService.getDataStruct().get�characteristic.name�());
	    		�ENDFOR�
	    		�ENDFOR�
	            default: return "n/a";
	    	}
		}
		
		private byte[] intToByteArray(int value) {
			return ByteBuffer.allocate(4).putInt(value).array();
		}
		
		private byte[] floatToByteArray(float value) {
			return ByteBuffer.allocate(4).putFloat(value).array();
		}
		
		private byte[] doubleToByteArray(double value) {
			return ByteBuffer.allocate(4).putDouble(value).array();
		}
	}
	'''
}