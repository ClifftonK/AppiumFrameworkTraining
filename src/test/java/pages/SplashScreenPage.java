package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SplashScreenPage extends BasePage{

    @AndroidFindBy(id= "sign_up_button")
    private MobileElement signUpButton;

    @AndroidFindBy(id = "sign_in_button")
    private MobileElement signInButton;

    @AndroidFindBy(id = "title_text_view")
    private MobileElement titleText;

    public SplashScreenPage(final AppiumDriver driver) {
        super(driver);
    }

    public MobileElement getSignUpButton() {
        return signUpButton;
    }

    public MobileElement getSignInButton() {
        return signInButton;
    }

    public MobileElement getTitleText() {
        return titleText;
    }

    public void clickSignUpButton() {
        signUpButton.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }
}