# AppGenerator

This project consisting of the "Ecore Diagramm Editor", "EMF - Eclipse Modeling Framework" and "Xtext" represents a self made domain specific language with an integrated code generator for mobile applications which communicate with bluetooth low energy devices. With the defined domain specifig language inside this project you are able to describe the behaviour and functionality of a bluetooth low energy device. After describing the device the corresponding code for an Android and iOS application will be generated. The generated code implements the necessary bluetooth low energy functionality for the communication between the application and the device. There is also the possibility to define if there should also be an user interface generated or not. 

## IDE Setup

1. Download the current version of the Eclipse Installer here: https://www.eclipse.org/downloads/
2. Install the "Eclipse IDE for Java Developers"
3. After the installation of the Eclipse IDE you need to install the necessary additional libraries inside the Eclipse IDE:
	1. Select "Help" -> "Install New Software..." choose "All available sites" in the "Work with" field and search for the libraries.
	2. "Ecore Diagramm Editor (SDK)"
	3. "EMF - Eclipse Modeling Framework SDK"
	4. "Xtext Complete SDK"
4. After successfully installing all necessary libraries and restarting the Eclipse IDE you can import the "AppGenerator" library.

## Import of the "AppGenerator" library

For using the library you have two options. Option one is for developer who want to edit or view the underlying code and the projects defining the domain specific language. Option two is for users who only want to use the defined domain specific language for generating the corresponding code.

### Option 1: Developer

1. Download "AppGenerator_src.zip"
2. Inside the Eclipse IDE select "File" -> "Import..." -> "General" -> "Achrive File" and choose the downloaded zip file
3. After successfully importing the project you can use the "AppGenerator"
4. If there are any errors displayed you need to edit some settings
	1. Open "Window" -> "Preferences" -> "Target Platform" -> "Running platform (active)" and choose "Edit"
	2. In the "Environment" tab edit the "Operating System" and "Windowing System" regarding your installed operating system
	3. E.g. for Windows you have to select "Win32" and "x86_64" for "Architecture"

### Option 2: User

1. Download "AppGenerator_user.zip"
2. Inside the Eclipe IDE select "Help" -> "Install New Software..." -> "Add" -> "Archive" and choose the downloaded zip file
3. Install the plugin and restart the Eclipse IDE
4. Create a new general project via "File" -> "New" -> "Project"
5. Create a textfile inside the project with ".appdsl" as the extension
6. Accept the question if the project should be converted into an xtext project with "Yes"
7. Inside the ".appdsl" file you can describe your bluetooth low energy device and its corresponding features. By saving this file the code for an Android and iOS application will be generated in the appearing "src-gen" folder

## Usage of the project and its domain specific language

After successfully creating a project, like described above, you can use the domain specific language. The domain specific language consists of keywords and brackets like "{" and "}". The editor in which you are using the domain specific language supports auto completion (by pressing Ctrl + Spacebar) and gives you feedback when something is missing or a wrong input has been done.

1. With the keyword "App" you create the main element of the application. This element needs a name defined like this "\<name\>". For the "App" element and every other element you need to open "{" and close "}" these brackets.
2. Inside the "App" element you need to declare the package name of the application by using the "packageName" attribute and defining its value like this "\<packageName\>".
3. Also inside the "App" element you need to create an "Sensor" element. The "Sensor" element needs a name defined like this "\<name\>" and you need to open and close the typical element brackets "{" "}".
4. Inside of the "Sensor" element you need to create at least one (you can create as much as you want) "Service" element. An "Service" element needs a name defined like this "\<name\>" and you need to open and close the typical element brackets. 
5. An "Service" element has an attribute called "uuid" which is defined like this "\<uuid\>".
6. Also there needs to be at least one "Characteristic" element created inside the "Service" element.
7. An "Characteristic" element has an "uuid"-, "dataType"-, "read"-, "write"- and "notification"-attribute. There is also the possibility to add an "UiElement" element to define if an provisionally ui element should be created for it.
8. Finally you can add an "MacFilter"- and an "NameFilter" element inside the "App" element to enable the corresponding feature.

Here is an example of such an domain specific language instance:
![DSL Instance Example](/images/02_DSL_Example.PNG)
