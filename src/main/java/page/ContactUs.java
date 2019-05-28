package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs {

    private WebDriver driver;

    public ContactUs(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnSendButton() {
        sendButtonInContactUsPage().click();
    }

    public void isContactUsAlertVisible() {
        isContactUsAlertOn().isDisplayed();
    }

    private WebElement sendButtonInContactUsPage() {
        return driver.findElement(By.className("icon-chevron-right"));
    }

    private WebElement isContactUsAlertOn() {
        return driver.findElement(By.className("alert"));
    }
}