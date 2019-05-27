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
        driver = new ChromeDriver();
        header = new Header(driver);
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
//    @Test
//    public void checkTitle() {
//        Assertions.assertThat(driver.getTitle()).isEqualTo("My Store");
//    }
//
//    @Test
//    public void canNotSendContactUsMessageWithEmptyEmail() {
//        driver.findElement(By.id("contact-link")).click();
//        driver.findElement(By.id("submitMessage")).click();
//
//        Assertions.assertThat(driver.findElement(By.cssSelector("div.alert")).isDisplayed()).isTrue();
//    }
//
//    @Test
//    public void canNotCreateAnAccountWithEmptyEmail() {
//        driver.findElement(By.cssSelector("a.login")).click();
//        driver.findElement(By.id("SubmitCreate")).click();
//
//        new WebDriverWait(driver, 5).
//                until(ExpectedConditions.visibilityOf(driver.findElement(By.id("create_account_error"))));
//
//        Assertions.assertThat(driver.findElement(By.id("create_account_error")).isDisplayed()).isTrue();
//    }
}