package MLA.tests;

import MLA.pages.AllShopPages;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AddRemoveProducts {
    WebDriver driver;

    String baseURL = "http://localhost/litecart/";
    int quantity = 20 ;
    String valueDropDown = "Small";

    @Before
    public void runUpForAddRemoveProducts() { driverStart(); }

    @After
    public void afterAddRemoveProducts() { driverStop(); }

    @Test
    public void AddRemoveProducts() {

        AllShopPages allShopPages = new AllShopPages(driver);
        allShopPages.workWithProducts.addProductToCurt(quantity,valueDropDown);
        allShopPages.workWithProducts.removeAllProductsFromCart();

    }


    private void driverStart() {
        FirefoxDriverManager.getInstance().setup();
        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.manage().window().maximize();

//        ChromeDriverManager.getInstance().setup();
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//        driver.manage().window().maximize();

        driver.get(baseURL);
    }

    private void driverStop() {
        if (driver != null) driver.quit();
    }
}
