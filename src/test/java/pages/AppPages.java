package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.AppGenericLibrary;

public class AppPages extends AppGenericLibrary {

	@FindBy(xpath = "//android.widget.ImageView[@content-desc=\"100ms Logo\"]")
	private WebElement logo;

	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Settings\"]")
	private WebElement settingInStartPage;

	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"live.hms.app2:id/edit_text_name\"]")
	private WebElement deviceNameTextBox;

	@FindBy(xpath = "//android.widget.EditText[@resource-id=\"live.hms.app2:id/edt_meeting_url\"]")
	private WebElement linkTextBox;

	@FindBy(id = "live.hms.app2:id/text_input_end_icon")
	private WebElement crossicon;

	@FindBy(id = "live.hms.app2:id/btn_join_now")
	private WebElement joinNowBtn;

	@FindBy(xpath = "//android.widget.LinearLayout[@resource-id=\"live.hms.app2:id/btn_scan_now\"]")
	private WebElement scanQrBtn;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private WebElement permission;

	@FindBy(id = "live.hms.app2:id/preview_view")
	private WebElement videoScreen;

	@FindBy(id = "live.hms.app2:id/button_join_meeting")
	private WebElement previewjoinBtn;

	@FindBy(id = "live.hms.app2:id/edit_text_name")
	private WebElement previewDeviceName;

	@FindBy(id = "live.hms.app2:id/button_toggle_audio")
	private WebElement previewAudioIcon;

	@FindBy(id = "live.hms.app2:id/button_toggle_video")
	private WebElement previewVideoIcon;

	@FindBy(id = "live.hms.app2:id/button_switch_camera")
	private WebElement previewSwitchCamIcon;

	@FindBy(id = "live.hms.app2:id/icon_output_device")
	private WebElement previewSpeakerIcon;

	@FindBy(id = "live.hms.app2:id/hms_video_view")
	private WebElement meetingScreen;

	@FindBy(id = "live.hms.app2:id/button_end_call")
	private WebElement meetingEndIcon;

	@FindBy(id = "live.hms.app2:id/leave_icon")
	private WebElement leaveIcon;

	@FindBy(id = "live.hms.app2:id/end_session_button")
	private WebElement leaveSession;

	// Verifying logo is displayed is displayed or not
	public boolean isLogoDisplayed() throws Exception {
		try {
			awaitForElement(driver, logo);
			return logo.isDisplayed();
		} catch (Exception e) {
			throw new Exception("Error in isLogoDisplayed()" + e.getMessage());
		}
	}

	// Verifying settings icon is displayed is displayed or no
	public boolean isSettingIconDisplayed() throws Exception {
		try {
			awaitForElement(driver, settingInStartPage);
			return settingInStartPage.isDisplayed();
		} catch (Exception e) {
			throw new Exception("Error in isSettingIconDisplayed()" + e.getMessage());
		}
	}

	// Clicking setting icon
	public void clickingOnSettingsIcon() throws Exception {
		try {
			clickOnElement(settingInStartPage);
		} catch (Exception e) {
			throw new Exception("Error in clickingOnSettingsIcon()" + e.getMessage());
		}
	}

	// verifying device name text box is displayed or not
	public boolean isDeviceNameDisplayed() throws Exception {
		try {
			awaitForElement(driver, deviceNameTextBox);
			return deviceNameTextBox.isDisplayed();
		} catch (Exception e) {
			throw new Exception("Error in isDeviceNameDisplayed()" + e.getMessage());
		}
	}

	// verifying joining link text box is displayed or not
	public boolean isJoiningLinkTextBoxDisplayed() throws Exception {
		try {
			awaitForElement(driver, linkTextBox);
			return linkTextBox.isDisplayed();
		} catch (Exception e) {
			throw new Exception("Error in isJoiningLinkTextBoxDisplayed()" + e.getMessage());
		}
	}

	// Clicking link text box
	public void clickingOnLinktextBox() throws Exception {
		try {
			clickOnElement(linkTextBox);
		} catch (Exception e) {
			throw new Exception("Error in clickingOnLinktextBox()" + e.getMessage());
		}
	}

	// Inserting link in text box
	public void insertLinkInTextBox() throws Exception {
		try {
			AppGenericLibrary generic = new AppGenericLibrary();
			generic.type(linkTextBox, "https://rajib-videoconf-1953.app.100ms.live/meeting/qxg-xkhz-plh");
		} catch (Exception e) {
			throw new Exception("Error in insertLinkInTextBox()" + e.getMessage());
		}
	}

	// verifying joining cross icon in link text box is displayed or not
	public boolean isCrossIconInLinkTextboxDisplayed() throws Exception {
		try {
			awaitForElement(driver, crossicon);
			return crossicon.isDisplayed();
		} catch (Exception e) {
			throw new Exception("Error in isCrossIconInLinkTextboxDisplayed()" + e.getMessage());
		}
	}

	// click cross icon in link text box
	public void clickCrossIconInLinkTextbox() throws Exception {
		try {
			clickOnElement(crossicon);
		} catch (Exception e) {
			throw new Exception("Error in clickCrossIconInLinkTextbox()" + e.getMessage());
		}
	}

	// verifying joining CTA is displayed or not
	public boolean isJoinCtaDisplayed() throws Exception {
		try {
			awaitForElement(driver, joinNowBtn);
			return joinNowBtn.isDisplayed();
		} catch (Exception e) {
			throw new Exception("Error in isJoinCtaDisplayed()" + e.getMessage());
		}
	}

	// click join meeting CTA
	public void clickJoinMeetingCta() throws Exception {
		try {
			clickOnElement(joinNowBtn);
		} catch (Exception e) {
			throw new Exception("Error in clickJoinMeetingCta()" + e.getMessage());
		}
	}

	// verifying joining CTA is displayed or not
	public boolean isScanQrCtaDisplayed() throws Exception {
		try {
			awaitForElement(driver, scanQrBtn);
			return scanQrBtn.isDisplayed();
		} catch (Exception e) {
			throw new Exception("Error in isScanQrCtaDisplayed()" + e.getMessage());
		}
	}

	// verifying app permissions is displayed or not
	public boolean isAppPermissionsDisplayed() throws Exception {
		try {
			awaitForElement(driver, permission);
			return permission.isDisplayed();
		} catch (Exception e) {
			throw new Exception("Error in isAppPermissionsDisplayed()" + e.getMessage());
		}
	}

	// click on app permission
	public void clickOnAppPermissionCta() throws Exception {
		try {
			clickOnElement(permission);
			clickOnElement(permission);
		} catch (Exception e) {
			throw new Exception("Error in clickAppPermissionCta()" + e.getMessage());
		}
	}

	// verifying preview video screen is displayed or not
	public boolean isPreviewviodScreenDisplayed() throws Exception {
		try {
			awaitForElement(driver, videoScreen);
			return videoScreen.isDisplayed();
		} catch (Exception e) {
			throw new Exception("Error in isPreviewviodScreenDisplayed()" + e.getMessage());
		}
	}

	// verifying preview join btn is displayed or not
	public boolean isPreviewJoinBtnDisplayed() throws Exception {
		try {
			awaitForElement(driver, previewjoinBtn);
			return previewjoinBtn.isDisplayed();
		} catch (Exception e) {
			throw new Exception("Error in isPreviewJoinBtnDisplayed()" + e.getMessage());
		}
	}

	// click on preview join btn
	public void clickOnPreviewjoinCta() throws Exception {
		try {
			clickOnElement(previewjoinBtn);
		} catch (Exception e) {
			throw new Exception("Error in clickOnPreviewjoinCta()" + e.getMessage());
		}
	}

	// verifying preview device name is displayed or not
	public boolean isPreviewDeviceNameBtnDisplayed() throws Exception {
		try {
			awaitForElement(driver, previewDeviceName);
			return previewDeviceName.isDisplayed();
		} catch (Exception e) {
			throw new Exception("Error in isPreviewDeviceNameBtnDisplayed()" + e.getMessage());
		}
	}

	// verifying preview audio icon is displayed or not
	public boolean isPreviewAudioIconDisplayed() throws Exception {
		try {
			awaitForElement(driver, previewAudioIcon);
			return previewAudioIcon.isDisplayed();
		} catch (Exception e) {
			throw new Exception("Error in isPreviewAudioIconDisplayed()" + e.getMessage());
		}
	}

	// verifying preview video icon is displayed or not
	public boolean isPreviewVideoIconDisplayed() throws Exception {
		try {
			awaitForElement(driver, previewVideoIcon);
			return previewVideoIcon.isDisplayed();
		} catch (Exception e) {
			throw new Exception("Error in isPreviewVideoIconDisplayed()" + e.getMessage());
		}
	}

	// verifying preview switch camera icon is displayed or not
	public boolean isPreviewSwitchCamIconDisplayed() throws Exception {
		try {
			awaitForElement(driver, previewSwitchCamIcon);
			return previewSwitchCamIcon.isDisplayed();
		} catch (Exception e) {
			throw new Exception("Error in isPreviewSwitchCamIconDisplayed()" + e.getMessage());
		}
	}

	// verifying preview speaker icon is displayed or not
	public boolean isPreviewSpeakerIconDisplayed() throws Exception {
		try {
			awaitForElement(driver, previewSpeakerIcon);
			return previewSpeakerIcon.isDisplayed();
		} catch (Exception e) {
			throw new Exception("Error in isPreviewSpeakerIconDisplayed()" + e.getMessage());
		}
	}

	// verifying meeting screen is displayed or not
	public boolean isMeetingScreenDisplayed() throws Exception {
		try {
			awaitForElement(driver, meetingScreen);
			return meetingScreen.isDisplayed();
		} catch (Exception e) {
			throw new Exception("Error in isMeetingScreenDisplayed()" + e.getMessage());
		}
	}

	// verifying meeting end icon is displayed or not
	public boolean isMeetingEndIconDisplayed() throws Exception {
		try {
			awaitForElement(driver, meetingEndIcon);
			return meetingEndIcon.isDisplayed();
		} catch (Exception e) {
			throw new Exception("Error in isMeetingEndIconDisplayed()" + e.getMessage());
		}
	}

	// click on meeting end cta
	public void clickOnMeetingEndCta() throws Exception {
		try {
			clickOnElement(meetingEndIcon);
		} catch (Exception e) {
			throw new Exception("Error in clickOnMeetingEndCta()" + e.getMessage());
		}
	}

	// click on leave icon
	public void clickOnLeaveCta() throws Exception {
		try {
			clickOnElement(leaveIcon);
			clickOnElement(leaveSession);
		} catch (Exception e) {
			throw new Exception("Error in clickOnLeaveCta()" + e.getMessage());
		}
	}

}
