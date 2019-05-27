import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.Header;
import page.Title;

import java.util.concurrent.locks.Condition;

public class Main {

    public static WebDriver driver;
    public static Header header;
    public static Title title;
    public static WebDriverWait wait;

    @BeforeAll
    public static void beforeAll() {

        WebDriverManager.chromedriver().setup();

        title = new Title(driver);
        wait = new WebDriverWait(driver, 10);
    }

    @BeforeEach
    public void beforeEach() {
        driver.get("http://automationpractice.com/");
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void afterAll() {
        driver.quit();
    }

    @Test
    public void checkSignInAlertTest(){
        header.clickOnSignInButton();
        header.clickOnSignInButtonInLoginPage();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("alert"))));
        header.isContactUsAlertVisible();
    }

    @Test
    public void checkContactUsAlertTest() {
        header.clickOnContactUsButton();

        header.clickOnCreateAnAccoundButton();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("alert"))));
        header.isCreateAnAccountAlertVisible();
    }

    @Test
    public void checkPageTitleTest() {
        title.isPageTitleVisible();
    }
}