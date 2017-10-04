package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PhonePermissionsPage extends BasePage{

    @AndroidFindBy(id = "toolbar")
    private MobileElement title;

    @AndroidFindBy(id = "btn_option_one")
    private MobileElement continueButton;

    @AndroidFindBy(id = "permission_allow_button")
    private MobileElement allowPermissionsButton;


    public PhonePermissionsPage(final AppiumDriver driver) {
        super(driver);
    }

    public MobileElement getTitle() {
        return title;
    }

    public MobileElement getContinueButton() {
        return continueButton;
    }

    public MobileElement getAllowPermissions() {
        return allowPermissionsButton;
    }

    public void clickContinueButton() {
        continueButton.click();
    }

    public void clickAllowPermissionsButton() {
        allowPermissionsButton.click();
    }
}