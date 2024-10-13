package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

import pages.AppPages;

public class AppTest extends baseClass {
	@Test
	public void appFlow() throws Exception {
		AppPages appPage = new AppPages();
		AppGenericLibrary generic = new AppGenericLibrary();
		PageFactory.initElements(driver, appPage);
		Assert.assertTrue(appPage.isLogoDisplayed(), "App logo is not validated");
		Assert.assertTrue(appPage.isSettingIconDisplayed(), "Settings icon is not validated");
		appPage.clickingOnSettingsIcon();
		generic.waitOrPause(3);
		generic.pressNavigationBack(driver);
		Assert.assertTrue(appPage.isDeviceNameDisplayed(), "Device name text is not validated");
		Assert.assertTrue(appPage.isJoiningLinkTextBoxDisplayed(), "Joining link textbox is not validated");
		appPage.clickingOnLinktextBox();
		generic.waitOrPause(2);
		appPage.insertLinkInTextBox();
		Assert.assertTrue(appPage.isJoinCtaDisplayed(), "Join meeting CTA is not validated");
		Assert.assertTrue(appPage.isScanQrCtaDisplayed(), "scan QR code CTA is not validated");
		appPage.clickJoinMeetingCta();
		if (appPage.isAppPermissionsDisplayed()) {
			appPage.clickOnAppPermissionCta();
		}
		Assert.assertTrue(appPage.isPreviewviodScreenDisplayed(), "Preview video screen is not validated");
		Assert.assertTrue(appPage.isPreviewJoinBtnDisplayed(), "Preview join btn is not validated");
		Assert.assertTrue(appPage.isPreviewDeviceNameBtnDisplayed(), "Preview device name btn is not validated");
		Assert.assertTrue(appPage.isPreviewAudioIconDisplayed(), "Preview audio icon is not validated");
		Assert.assertTrue(appPage.isPreviewVideoIconDisplayed(), "Preview video icon is not validated");
		Assert.assertTrue(appPage.isPreviewSwitchCamIconDisplayed(), "Preview switch cam icon is not validated");
		Assert.assertTrue(appPage.isPreviewSpeakerIconDisplayed(), "Preview speaker icon is not validated");
		appPage.clickOnPreviewjoinCta();
		generic.waitOrPause(2);
		Assert.assertTrue(appPage.isMeetingScreenDisplayed(), "Meeting screen is not validated");
		Assert.assertTrue(appPage.isMeetingEndIconDisplayed(), "Meeting end icon is not validated");
		appPage.clickOnMeetingEndCta();
		appPage.clickOnLeaveCta();
	}

}
