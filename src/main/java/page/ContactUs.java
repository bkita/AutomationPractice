package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs extends PageObject{

    public ContactUs(WebDriver driver) {
        super(driver);
    }
    @FindBy(className = "icon-chevron-right")
    private WebElement sendButton;

    @FindBy(className = "alert")
    private WebElement alert;



    public void clickOnSendButton() {
        sendButton.click();
    }

    public void isContactUsAlertVisible() {
        alert.isDisplayed();
    }
}