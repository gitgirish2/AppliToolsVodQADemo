package tests;

import com.applitools.eyes.MatchLevel;
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
        eyes.open(driver, "vodQA", "AllPagesTest");
        eyes.checkWindow();
        homePage.clickAbout();
        eyes.checkWindow();
        homePage.clickAgenda();
        eyes.checkWindow();
        homePage.clickPastEditions();
        eyes.checkWindow();
        homePage.clickContact();
        eyes.setMatchLevel(MatchLevel.LAYOUT);
        eyes.checkWindow();
    }
}