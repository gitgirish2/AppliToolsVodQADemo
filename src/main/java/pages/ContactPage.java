package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends BasePage {

    @FindBy(linkText = "Contact")
    private WebElement contact;

    @FindBy(className = "event-name")
    private WebElement theme;

    public ContactPage() {
        PageFactory.initElements(driver, this);
    }


}
