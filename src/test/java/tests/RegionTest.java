package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Config;

public class RegionTest extends BaseTest{


    HomePage homePage;

    @Test
    public void verifyRegionTest() {
        driver.get(Config.URL);
        System.out.println(driver.getTitle());
        homePage = new HomePage();
        eyes.open(driver, "vodQA", "verifyRegionTest");
        eyes.checkRegion(driver.findElement(By.className("box")));
        Assert.assertEquals(homePage.getSubmitTalkLink(),Config.URL+"#");
    }
}
