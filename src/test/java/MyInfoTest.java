import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyInfoTest extends BaseTest {
    ChromeDriver driver;
    LoginPage loginPage;
    LeftMenuBarPage leftMenuBarPage;
    MyInfoPage myInfoPage;

    @BeforeMethod
    public void SetUp() {
        driver = openBrowser();
        loginPage = new LoginPage(driver);
        leftMenuBarPage = new LeftMenuBarPage(driver);
        myInfoPage = new MyInfoPage(driver);



    }
    @Test
    public void MyInfoTest(){
        loginPage.Login("Admin","admin123");
        leftMenuBarPage.Menu();
        myInfoPage.EnterName("Petar");
        myInfoPage.DateInput("1992-08-28");
        myInfoPage.Save();

    }
    @AfterMethod
    public void After(){
        driver.quit();
    }
}
