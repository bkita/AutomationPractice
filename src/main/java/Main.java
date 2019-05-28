import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.ContactUs;
import page.Header;
import page.SignIn;
import page.Title;

public class Main {

    public static WebDriver driver;
    public static Header header;
    public static Title title;
    public static WebDriverWait wait;
    public static SignIn signIn;
    public static ContactUs contactUs;

    @BeforeAll
    public static void beforeAll() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        signIn = new SignIn(driver);
        contactUs = new ContactUs(driver);
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

//    @Test
//    public void checkSignInAlertTest() {
//        header.clickOnSignInButton();
//        signIn.clickOnCreateAnAccoundButton();
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("alert"))));
//        signIn.isCreateAnAccountAlertVisible();
//    }

    @Test
    public void checkContactUsAlertTest() {
        header.clickOnContactUsButton();

        contactUs.clickOnSendButton();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("alert"))));
        contactUs.isContactUsAlertVisible();
    }

//    @Test
//    public void checkPageTitleTest() {
//        title.isPageTitleVisible();
//    }
}