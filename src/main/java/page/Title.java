package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Title {

    private WebDriver driver;

    public Title(WebDriver driver) {
        this.driver = driver;
    }

    public void isPageTitleVisible() {
        getPageTitle().isDisplayed();
    }

    private WebElement getPageTitle() {
        return driver.findElement(By.className("logo"));
    }
}