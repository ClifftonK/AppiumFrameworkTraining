package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoanCardPage extends BasePage {

    @AndroidFindBy(id = "card_loan_title")
    private MobileElement titleText;

    @AndroidFindBy(id = "card_loan_description")
    private MobileElement descriptionText;

    @AndroidFindBy(id = "card_loan_flat_button_left")
    private MobileElement leftButton;

    @AndroidFindBy(id = "card_loan_flat_button_right")
    private MobileElement rightButton;

    public LoanCardPage(final AppiumDriver driver) {
        super(driver);
    }

    public MobileElement getTitleText() {
        return titleText;
    }

    public MobileElement getDescriptionText() {
        return descriptionText;
    }

    public MobileElement getLeftButton() {
        return leftButton;
    }

    public MobileElement getRightButton() {
        return rightButton;
    }

    public void clickLeftButton() {
        leftButton.click();
    }

    public void clickRightButton() {
        rightButton.click();
    }
}