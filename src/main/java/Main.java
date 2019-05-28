import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import page.ContactUs;
import page.Header;
import page.SignIn;
import page.Title;

public class Main {

    public static WebDriver driver;
    public static Header header;
    public static Title title;
    public static SignIn signIn;
    public static ContactUs contactUs;
    public static Actions action;

    @BeforeAll
    public static void beforeAll() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        header = new Header(driver);
        signIn = new SignIn(driver);
        contactUs = new ContactUs(driver);
        title = new Title(driver);
        action = new Actions(driver);
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
    public void checkSignInAlertDangerTest() {
        header.clickOnSignInButton();
        signIn.clickOnCreateAnAccoundButton();

        Assertions.assertThat(signIn.isCreateAnAccountAlertDangerVisible()).isTrue();
    }

    @Test
    public void checkContactUsAlertDangerTest() {
        header.clickOnContactUsButton();
        contactUs.clickOnSendButton();

        Assertions.assertThat(contactUs.isContactUsAlertDangerVisible()).isTrue();
    }

    @Test
    public void sendMessageTest() {

        header.clickOnContactUsButton();
        contactUs.clickOnDropdown()
                .selectFromDropdown()
                .sendKeysToEmail()
                .sendKeysToOrder()
                .sendKeysToMessage()
                .clickOnSendButton();

        Assertions.assertThat(contactUs.isContactUsAlertSuccessVisible()).isTrue();
    }

    @Test
    public void signInTest() {
        header.clickOnSignInButton();
        signIn.sendKeysToEmail()
                .sendKeysToPassword()
                .clickOnSignInButton();

        Assertions.assertThat(signIn.isSignInAlertDangerVisible()).isTrue();
    }

    @Test
    public void checkPageTitleTest() {
        title.isPageTitleVisible();
    }
}