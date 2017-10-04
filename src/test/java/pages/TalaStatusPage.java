package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TalaStatusPage extends BasePage {

    @AndroidFindBy(id = "card_credit_title")
    private MobileElement title_text;

    @AndroidFindBy(id = "card_credit_subtitle")
    private MobileElement subtitleText;

    @AndroidFindBy(id = "card_credit_button")
    private MobileElement viewStatusButton;


    public TalaStatusPage(final AppiumDriver driver) {
        super(driver);
    }

    private MobileElement getTitle_text() {
        return title_text;
    }

    private MobileElement getSubtitleText() {
        return subtitleText;
    }

    private MobileElement getViewStatusButton() {
        return viewStatusButton;
    }

    public void clickTalaStatusButton() {
        viewStatusButton.click();
    }
}