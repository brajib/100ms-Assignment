Mobile App End-to-End Automation with Appium and TestNG
This project automates the end-to-end (E2E) flow of a mobile application using Appium and TestNG. It includes launching the app, navigating through the app’s key screens, and validating the correct functionality. The automation leverages an emulator or a real device, and Android Inspector is used to locate and identify the UI elements.

### Table of Contents:
Prerequisites

Project Structure

Dependencies

Setup

Running the Tests

Test Flow

Technologies Used

Contributing

Prerequisites

Make sure you have the following installed and set up before running the tests:

Java JDK 21

Android SDK (make sure ANDROID_HOME is set)

Appium (version 2.x recommended)

Node.js (for Appium server)

Appium Desktop (optional, for starting the Appium server)

Android Emulator 

Android Inspector to locate UI elements of the app

pom.xml: Contains Maven dependencies required to run the automation tests.

###Dependencies
The following dependencies are included in the pom.xml:

xml
Copy code
<dependencies>
    <!-- Appium Java Client -->
    <dependency>
        <groupId>io.appium</groupId>
        <artifactId>java-client</artifactId>
        <version>8.0.0</version>
    </dependency>
</dependencies>

Setup:
1. Install Appium
Install Appium via npm:

bash
Copy code
npm install -g appium
Verify the installation:

bash
Copy code
appium -v
2. Start the Appium Server
You can start Appium either via:
Command Line:
appium
Appium Desktop (optional): Use Appium Desktop to start and manage the server visually.
3. Configure Android Emulator or Device
Set up your Android emulator or connect a real Android device.
Check if the emulator/device is running using the following command:
adb devices
4. Using Android Inspector to Locate Elements
Use Android Inspector or Appium Inspector to identify the element locators (e.g., XPath, ID, ClassName) used in the tests.
Ensure that the elements in the app are accessible and identifiable.
5. Environment Variables
Ensure the following environment variables are set:

JAVA_HOME: Path to your Java installation.
ANDROID_HOME: Path to your Android SDK.
Running the Tests
To run the tests using Maven and TestNG, use the following command:
run using testNG

You can specify individual test classes as well:
run using testNG
This will start the Appium server, launch the emulator or connected device, and run the test suite.

Test Flow
The automation flow includes:
App Launch: Launch the mobile app on an emulator or a connected device.
Navigation: Navigate through the start screen, and other functional screens.
Element Verification: Verify the visibility and functionality of key UI elements.
Video and UI Tests: Ensure video elements and other critical app features work correctly.
App Close: Close the app after the tests are done.
Technologies Used
Java: The programming language used for the automation code.
Appium: Used for mobile app automation.
TestNG: Test management and execution framework.
Maven: Dependency management and build tool.
Android Inspector/Appium Inspector: For identifying elements in the mobile app.
