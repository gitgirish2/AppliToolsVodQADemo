package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static WebDriver driver;

    public static String browserName=Config.BROWSER;
    private static String driverLocation="src/main/resources/drivers/";

    public DriverFactory(){
        this.driver=getDriver();
    }

    public static WebDriver createDriver() {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", driverLocation + "chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-cache");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", driverLocation + "geckodriver");
            driver = new FirefoxDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        return driver;
    }

        public static WebDriver getDriver () {
            if (driver == null) {
                createDriver();
            }
            return driver;
        }


        public static void closeDriver () {
            driver.close();
            driver.quit();
        }

    }


