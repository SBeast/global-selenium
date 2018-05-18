import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.AllPagesAdmin;
//import pages.AllPages;

public class ClickAllMenuOnAdminPage {

    String adminLoginPageURL = "http://localhost/litecart/admin";
    String adminUserName = "admin";
    String adminPassword = "admin";

    @Before
    public void RunUpForClickAllMenuOnAdminPage() {


    }

    @After
    public void AfterClickAllMenuOnAdminPage() {

    }

    @Test
    public void ClickAllMenuOnAdminPage() {
        FirefoxDriverManager.getInstance().setup();
        WebDriver driver = new FirefoxDriver();
//        ChromeDriverManager.getInstance().setup();
//        WebDriver driver = new ChromeDriver();
        AllPagesAdmin allPages = new AllPagesAdmin(driver);

        allPages.adminLoginPage2.validAdminLogin(adminUserName, adminPassword, adminLoginPageURL);
//        Assert.assertTrue(allPages.adminLoginPage2.isLoginBoxIsPresent());
        allPages.adminLoginPage2.closeBrowserAdminLoginPage();


    }


}
