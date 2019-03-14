package tests;

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
        Assert.assertEquals(homePage.getSubmitTalkLink(),Config.URL+"#");
    }
}
