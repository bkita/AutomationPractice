package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {

    private WebDriver driver;

    public SignIn(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnCreateAnAccoundButton() {
        createAnAccountButton().click();
    }

    public void isCreateAnAccountAlertVisible() {
        isCreateAnAccountAlertOn().isDisplayed();
    }

    private WebElement createAnAccountButton() {
        return driver.findElement(By.className("btn"));
    }

    private WebElement isCreateAnAccountAlertOn() {
        return driver.findElement(By.className("alert"));
    }
}