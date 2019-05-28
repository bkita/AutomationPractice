package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactUs extends PageObject{

    public ContactUs(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "submitMessage")
    private WebElement sendButton;

    @FindBy(className = "alert")
    private WebElement alert;



    public void clickOnSendButton() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("submitMessage"))));
        sendButton.click();
    }

    public void isContactUsAlertVisible() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("alert"))));
        alert.isDisplayed();
    }
}