package pages;

import org.openqa.selenium.WebDriver;

public class AllPagesAdmin {
    WebDriver driver;
    public AdminLoginPage2 adminLoginPage2;
    public AdminMenu adminMenu;
	

    public AllPagesAdmin(WebDriver exterDriver) {
        this.driver = exterDriver;
        adminLoginPage2 = new AdminLoginPage2(driver);
        adminMenu = new AdminMenu(driver);

    }
}
