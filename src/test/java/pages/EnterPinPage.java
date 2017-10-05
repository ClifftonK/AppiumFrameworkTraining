package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EnterPinPage extends BasePage {

    @AndroidFindBy(id = "first_digit_edit_text")
    private MobileElement firstPinDigit;

    @AndroidFindBy(id = "second_digit_edit_text")
    private MobileElement secondPinDigit;

    @AndroidFindBy(id = "third_digit_edit_text")
    private MobileElement thirdPinDigit;

    @AndroidFindBy(id = "fourth_digit_edit_text")
    private MobileElement fourthPinDigit;

    @AndroidFindBy(id = "switch_mask_text_view")
    private MobileElement showButton;

    @AndroidFindBy(id = "next_button")
    private MobileElement nextButton;

    public EnterPinPage(final AppiumDriver driver) {
        super(driver);
    }

    public MobileElement getFirstPinDigit() {
        return firstPinDigit;
    }

    public MobileElement getSecondPinDigit() {
        return secondPinDigit;
    }

    public MobileElement getThirdPinDigit() {
        return thirdPinDigit;
    }

    public MobileElement getFourthPinDigit() {
        return fourthPinDigit;
    }

    public MobileElement getNextButton() {
        return nextButton;
    }

    public MobileElement getShowButton() {
        return showButton;
    }

    public void clickShowButton() {
        showButton.click();
    }

    public void clickNextButton() {
        nextButton.click();
    }
}