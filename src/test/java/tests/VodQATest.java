package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.Config;

public class VodQATest extends BaseTest {

    HomePage homePage;

    @Test
    public void verifyThemeTest() {
        driver.get(Config.URL);
        System.out.println(driver.getTitle());
        homePage = new HomePage();
        Assert.assertEquals(homePage.getTheme(),"Seismic Shifts");
    }

    @Test
    public void verifySubmitLinkTest() {
        driver.get(Config.URL);
        System.out.println(driver.getTitle());
        homePage = new HomePage();
        homePage.clickSubmitTalkButton();
        Assert.assertEquals(homePage.getSubmitTalkLink(),"http://localhost:5454/#");
    }

    @Test
    public void verifyParticipateLinkTest() {
        driver.get(Config.URL);
        System.out.println(driver.getTitle());
        homePage = new HomePage();
        homePage.clickContact();
        Assert.assertEquals(homePage.getParticipateLink(),"https://goo.gl/forms/wJg5zpvwgb7Ckdes1");
    }

}
