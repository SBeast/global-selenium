package pages;

import org.openqa.selenium.WebDriver;

public class AllPages2 {
    WebDriver driver;
    public AdminLoginPage2 adminLoginPage2;

    public AllPages2(WebDriver exterDriver) {
        this.driver = exterDriver;
        adminLoginPage2 = new AdminLoginPage2(driver);

    }
}
