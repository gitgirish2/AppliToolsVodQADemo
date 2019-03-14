package tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import utils.DriverFactory;

public class BaseTest {


    protected static WebDriver driver;


    @BeforeTest
    public static void setUp() {
        driver = DriverFactory.getDriver();
        driver.manage().window().fullscreen();
    }


    @AfterClass
    public static void closeEyes(){
        driver.quit();
    }
}
