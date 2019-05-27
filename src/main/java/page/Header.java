package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {

    private WebDriver driver;

    public Header(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnContactUsButton() {
        contactUsButton().click();
    }

    public void clickOnSendButton() {
        sendButtonInContactUsPage().click();
    }

    public void isContactUsAlertVisible() {
        isContactUsAlertOn().isDisplayed();
    }

    public void clickOnSignInButton() {
        signInButton().click();
    }

    public void clickOnSignInButtonInLoginPage() {
        signInButtonInLoginPage().click();
    }

    public void clickOnCreateAnAccoundButton() {
        createAnAccountButton().click();
    }

    public void isCreateAnAccountAlertVisible() {
        isCreateAnAccountAlertOn().isDisplayed();
    }

    private WebElement contactUsButton() {
        return driver.findElement(By.id("contact-link"));
    }

    private WebElement sendButtonInContactUsPage() {
        return driver.findElement(By.className("icon-chevron-right"));
    }

    private WebElement isContactUsAlertOn() {
        return driver.findElement(By.className("alert"));
    }

    private WebElement signInButton() {
        return driver.findElement(By.className("login"));
    }

    private WebElement signInButtonInLoginPage() {
        return driver.findElement(By.className("icon-lock"));
    }

    private WebElement createAnAccountButton() {
        return driver.findElement(By.className("btn"));
    }

    private WebElement isCreateAnAccountAlertOn() {
        return driver.findElement(By.className("alert"));
    }
}