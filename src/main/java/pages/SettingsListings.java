package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettingsListings {
    WebDriver driver;
    WebDriverWait webDriverWait;


    public SettingsListings(WebDriver exterDriver) {
        this.driver = exterDriver;
        PageFactory.initElements(driver, this);
        webDriverWait = new WebDriverWait(driver, 10);
    }

}
