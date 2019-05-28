package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignIn extends PageObject{

    public SignIn(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "btn")
    private WebElement createAnAccountButton;

    @FindBy(className = "alert")
    private WebElement alert;

    public void clickOnCreateAnAccoundButton() {
        createAnAccountButton.click();
    }

    public void isCreateAnAccountAlertVisible() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("alert"))));
        alert.isDisplayed();
    }
}