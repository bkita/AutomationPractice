package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class ContactUs extends PageObject{

    public ContactUs(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "submitMessage")
    private WebElement sendButton;

    @FindBy(className = "alert-danger")
    private WebElement alertDanger;

    @FindBy(className = "alert-success")
    private WebElement alertSuccess;

    @FindBy(id = "id_contact")
    private WebElement dropdown;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "id_order")
    private WebElement order;

    @FindBy(id = "message")
    private WebElement message;

    public ContactUs clickOnSendButton() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("submitMessage"))));
        sendButton.click();
        return this;
    }

    public boolean isContactUsAlertDangerVisible() {
        wait.until(ExpectedConditions.visibilityOf(alertDanger));
        return alertDanger.isDisplayed();
    }

    public boolean isContactUsAlertSuccessVisible() {
        wait.until(ExpectedConditions.visibilityOf(alertSuccess));
        return alertSuccess.isDisplayed();
    }
    public ContactUs clickOnDropdown() {
        dropdown.click();
        return this;
    }

    public ContactUs sendKeysToEmail() {
        email.click();
        email.sendKeys("bkita@siabadaba.com");
        return this;
    }

    public ContactUs sendKeysToOrder() {
        order.click();
        order.sendKeys("Siema koluuniuuu!");
        return this;
    }

    public ContactUs sendKeysToMessage() {
        message.click();
        message.sendKeys("Dziękuję za uwagę! Dobranoc!");
        return this;
    }

    public ContactUs selectFromDropdown() {
        Select dropdown = new Select(driver.findElement(By.id("id_contact")));
        dropdown.selectByIndex(2);
        return this;
    }
}