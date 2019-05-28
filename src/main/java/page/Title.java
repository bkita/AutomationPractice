package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Title extends PageObject{

    public Title(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "logo")
    private WebElement pageTitle;

    public void isPageTitleVisible() {
        pageTitle.isDisplayed();
    }
}