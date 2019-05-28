package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
        alert.isDisplayed();
    }
}