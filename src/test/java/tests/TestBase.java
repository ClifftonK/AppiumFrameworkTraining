package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import pages.SplashScreenPage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class TestBase {
    public static String apkPath = "/home/clifftonkariuki/Downloads/";
    public static String apk = "app-KE_QA-release.apk";
    public static String appName = "Nexus6P";
    public static String appiumUrl= "http://127.0.0.1:4723/wd/hub";

    //the driver has to be static hence created only once and used across all test classes
    public static AndroidDriver<MobileElement> driver;

    /**
     *This is a class that creates all
     */
    @BeforeSuite
    public void setUpAppium() throws MalformedURLException {
        File apkSource = new File(apkPath, apk);
        URL url = new URL(appiumUrl);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, appName);
        capabilities.setCapability(MobileCapabilityType.APP, apkSource.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.inventureaccess.safarirahisiQA");
        capabilities.setCapability("appActivity", "com.inventure.mkopoph.MainActivity");
        driver = new AndroidDriver<MobileElement>(url, capabilities);
    }

    @AfterTest
    public void tearDown() {
        driver.closeApp();
        driver.quit();
    }

    public void splashScreen() {
        SplashScreenPage splashScreenPage = new SplashScreenPage(driver);
        splashScreenPage.clickSignUpButton();
    }
}