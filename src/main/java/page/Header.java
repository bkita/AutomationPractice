package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {

    private WebDriver driver;

    public Header(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnContactUsButton(){
        contactUsButton().click();
    }

    private WebElement contactUsButton(){
        return driver.findElement(By.id("contact-link"));
    }

}
