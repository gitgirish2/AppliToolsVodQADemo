package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Config;


public class AllPagesTest extends BaseTest {

    HomePage homePage;

    @Test
    public void verifyAllPagesTest() {
        driver.get(Config.URL);
        Assert.assertEquals(driver.getTitle(),"VodQA - Seismic Shifts - 16 March 2019");
        homePage = new HomePage();
        homePage.clickAbout();
        homePage.clickAgenda();
        homePage.clickPastEditions();
        homePage.clickContact();
    }
}