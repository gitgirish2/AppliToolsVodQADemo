package tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Config;
import utils.DriverFactory;
import com.applitools.eyes.selenium.Eyes;

public class BaseTest {


    protected static WebDriver driver;
    static Eyes eyes;


    @BeforeTest
    public static void setUp() {
        driver = DriverFactory.getDriver();
        driver.manage().window().fullscreen();
        initiateEyes();

    }

    @AfterTest
    public static void tearDown() {
        eyes.abortIfNotClosed();
    }

    @AfterClass
    public static void closeEyes(){
        driver.quit();
        eyes.close();
        eyes.abortIfNotClosed();
    }

    private static void initiateEyes(){
        eyes = new Eyes();
        eyes.setApiKey(Config.APIKEY);
    }

    public void validateWindow(String appName, String testName){
        eyes.open(driver, appName, testName);
        eyes.checkWindow();
    }



}
