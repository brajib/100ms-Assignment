package tests;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL; // Correct import for URL
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class baseClass {
	public AppiumDriver driver;

	@BeforeTest
	public void setup() throws URISyntaxException, MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium:platformName", "Android");
		capabilities.setCapability("appium:noReset", true);
		capabilities.setCapability("appium:appPackage", "live.hms.app2");
		capabilities.setCapability("appium:deviceID", "emulator-5554");
		capabilities.setCapability("appium:automationName", "UiAutomator2");
		capabilities.setCapability("appium:appActivity", "live.hms.app2.ui.home.HomeActivity");
		URI uri = new URI("http://127.0.0.1:4723");
		driver = new AndroidDriver(uri.toURL(), capabilities);
	}

	@AfterTest
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}

	}

}
