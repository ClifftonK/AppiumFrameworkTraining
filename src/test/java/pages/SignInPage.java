package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignInPage extends BasePage{

    @AndroidFindBy(id = "number_edit_text")
    private MobileElement enterMobileNumber;

    @AndroidFindBy(id = "next_button")
    private MobileElement nextButton;

    @AndroidFindBy(id = "backButton")
    private MobileElement backButton;

    public SignInPage(final AppiumDriver driver) {
        super(driver);
    }

    public MobileElement getNextButton() {
        return nextButton;
    }

    public MobileElement getBackButton() {
        return backButton;
    }

    public void clickNextButton() {
        nextButton.click();
    }

    public void clickBackButton() {
        backButton.click();
    }
}