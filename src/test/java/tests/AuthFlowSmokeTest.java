package tests;

import org.testng.annotations.Test;
import pages.SplashScreenPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AuthFlowSmokeTest extends TestBase {

    @Test
    public void testSplashScreenLandingPage() {
        //splashScreen();

        SplashScreenPage splashScreen = new SplashScreenPage(driver);
        assertThat(splashScreen.getTitleText().getText(),is("Karibu"));
    }
}