package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Config;

public class ElementTest extends BaseTest {

    HomePage homePage;

    @Test
    public void verifyElementTest() {
        driver.get(Config.URL);
        System.out.println(driver.getTitle());
        homePage = new HomePage();
        Assert.assertEquals(homePage.getSubmitTalkLink(),Config.URL+"#");
    }
}
