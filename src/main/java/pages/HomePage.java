package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.WebElementUtils.enterText;


public class HomePage extends BasePage{


    @FindBy(linkText = "About")
    private WebElement about;

    @FindBy(linkText = "Agenda")
    private WebElement agenda;

    @FindBy(linkText = "Past Editions")
    private WebElement pastEditions;

    @FindBy(linkText = "Contact")
    private WebElement contact;

    @FindBy(className = "event-name")
    private WebElement theme;

    @FindBy(className = "submit-talk")
    private WebElement submitTalkButton;

    @FindBy(className = "participate")
    private WebElement participateButton;



    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickAbout() {
        about.click();
    }

    public void clickAgenda() {
        agenda.click();
    }

    public void clickPastEditions() {
        pastEditions.click();
    }

    public void clickContact() {
        contact.click();
    }

    public void clickSubmitTalkButton() {
        submitTalkButton.click();
    }

    public void clickParticipateButton() {
        participateButton.click();
    }


    public String getSubmitTalkLink() {
        return submitTalkButton.getAttribute("href");

    }

    public String getParticipateLink() {
        return participateButton.getAttribute("href");

    }

    public String getTheme() {
        return theme.getText();

    }

}
