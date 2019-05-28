package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignIn extends PageObject{

    public SignIn(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "SubmitCreate")
    private WebElement createAnAccountButton;

    @FindBy(id = "SubmitLogin")
    private WebElement signInButton;

    @FindBy(className = "alert-danger")
    private WebElement alertDanger;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "passwd")
    private WebElement password;

    public SignIn clickOnCreateAnAccoundButton() {
        createAnAccountButton.click();
        return this;
    }

    public boolean isCreateAnAccountAlertDangerVisible() {
        wait.until(ExpectedConditions.visibilityOf(alertDanger));
        return alertDanger.isDisplayed();
    }

    public SignIn sendKeysToEmail() {
        email.click();
        email.sendKeys("bkita@siabadaba.com");
        return this;
    }

    public SignIn sendKeysToPassword() {
        password.click();
        password.sendKeys("password");
        return this;
    }

    public SignIn clickOnSignInButton() {
        signInButton.click();
        return this;
    }

    public boolean isSignInAlertDangerVisible() {
        wait.until(ExpectedConditions.visibilityOf(alertDanger));
        return alertDanger.isDisplayed();
    }
}