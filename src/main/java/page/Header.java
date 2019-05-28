package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends PageObject{

    public Header(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "contact-link")
    private WebElement contactUsButton;

    @FindBy(className = "login")
    private WebElement signInButton;

    public void clickOnContactUsButton() {
        contactUsButton.click();
    }

    public void clickOnSignInButton() {
        signInButton.click();
    }

    public WebElement getAddButton() {
        return contactUsButton;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }
}