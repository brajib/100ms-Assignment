
package tests;

import java.time.Duration;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AppGenericLibrary extends baseClass {

	protected static final Logger logger = Logger.getLogger(AppGenericLibrary.class.getName());

	public void awaitForElement(AppiumDriver driver, WebElement element) {
		logger.info("waiting for visibility of Element: " + element);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (TimeoutException e) {
			wait.until(ExpectedConditions.visibilityOf(element));
			logger.warn("Element not visible after waiting: " + element, e);
			e.printStackTrace();
		}
	}

	public void waitOrPause(long seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnElement(WebElement element) {
		logger.info("clicking on element: " + element);
		element.click();
	}

	public void pressNavigationBack(AppiumDriver driver) {
		logger.info("Pressing android navigate back button");
		AndroidDriver androidDriver = (AndroidDriver) driver;
		androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));
	}

	public void type(WebElement element, String text) {
		logger.info("typing into text field: " + element + " with text: " + text);
		element.sendKeys(text);
	}
}
