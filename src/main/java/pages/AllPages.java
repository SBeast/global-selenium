package pages;

import org.openqa.selenium.WebDriver;

public class AllPages {
    WebDriver driver;
    public AdminLoginPage adminLoginPage;

    public AllPages(WebDriver exterDriver) {
        this.driver = exterDriver;
        adminLoginPage = new AdminLoginPage(driver);

    }
}
