package pages;

import io.appium.java_client.AppiumDriver;

public abstract class HomeScreenPage extends BasePage {

    protected LoanCardPage loanCard;
    protected TalaStatusPage talaStatusCard;

    public HomeScreenPage(final AppiumDriver driver) {
        super(driver);
    }

    public LoanCardPage getLoanCard() {
        return loanCard;
    }

    public TalaStatusPage getTalaStatusCard() {
        return talaStatusCard;
    }
}