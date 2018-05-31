import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.events.Event;

import javax.sound.midi.Soundbank;
import java.util.concurrent.TimeUnit;

public class AddToCart {

    WebDriver driver;
    WebDriverWait webDriverWait;


    /**
     * variables for responses
     */
    final String errorInput = "Can not work with input ";
    final String errorElement = "Can not work with Element ";
    final String canNotWork = "Can not work with element ";
    final String canNotFind = "Can not find element ";
    final String wasOpened = " Was opened";
    final String wasClicked = " Was clicked";

    final String baseURL = "http://localhost/litecart";
    final String baseAdminURL = "http://localhost/litecart/admin";
    final String productXpath = ".//div[@id='box-most-popular']/div[@class='content']/ul[@class='listing-wrapper products']/li[1]";
    final String dropDownXpath = ".//select[@name='options[Size]']";
    final String valueDropDown = "Small";
    final String addToCartXpath = ".//button[@name='add_cart_product']";
    final String logo = ".//div[@id='logotype-wrapper']";
    final String cart = ".//span[@class='quantity']";
    final String removeButton = ".//button[@name='remove_cart_item']";
    final String tableRowsXpath = ".//td[@class='item']";
    final String tableXpath = ".//table[@class='dataTable rounded-corners']//tbody";


    @Before
    public void runUpForAddToCart() {
        driverStart();
    }


    @After
    public void afterAddToCart() {
        driverStop();
    }

    @Test
    public void addToCart() {


        for (int i = 0; i < 5; i++) {

            clickOnElement(productXpath);
            ifDropDownPresent(dropDownXpath, valueDropDown, addToCartXpath);
            clickOnElement(logo);
        }
        clickOnElement(cart);
        ifRemovePresent( tableXpath, tableRowsXpath);

    }


    private void driverStart() {
        FirefoxDriverManager.getInstance().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver, 5);

//        ChromeDriverManager.getInstance().setup();
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        webDriverWait = new WebDriverWait(driver, 5);

        driver.get(baseURL);

    }

    private void driverStop() {
        if (driver != null) driver.quit();
    }

    private void clickOnElement(String elementXpath) {

        try {
            this.webDriverWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(elementXpath))));
            WebElement element = driver.findElement(By.xpath(elementXpath));
            element.click();
            System.out.println(elementXpath + wasClicked);

        } catch (Exception E) {
            System.out.println(errorElement + elementXpath);
            Assert.fail(errorElement + elementXpath);
        }
    }

    private void ifDropDownPresent(String elementXpath, String valueForElement, String addToCartXpath) {


//        boolean ifElementPresents = driver.findElement(By.xpath(elementXpath)).isDisplayed();
        int ifElementPresents = driver.findElements(By.xpath(elementXpath)).size();
        System.out.println(ifElementPresents);

        if (ifElementPresents > 0) {
//            System.out.println(ifElementPresents);

            By dropdownMenu = By.xpath(elementXpath);
            this.webDriverWait.until(ExpectedConditions.elementToBeClickable(dropdownMenu));
            Select value = new Select(driver.findElement(dropdownMenu));
            value.selectByValue(valueForElement);
            driver.findElement(By.xpath(addToCartXpath)).click();

        } else {
            clickOnElement(addToCartXpath);
        }
    }

    private void ifDropDownPresent2(String elementXpath, String valueForElement, String addToCartXpath) {


        try {
            By dropdownMenu = By.xpath(elementXpath);
            this.webDriverWait.until(ExpectedConditions.elementToBeClickable(dropdownMenu));
            Select value = new Select(driver.findElement(dropdownMenu));
            value.selectByValue(valueForElement);
            driver.findElement(By.xpath(addToCartXpath)).click();
        } catch (Exception E) {
            System.out.println("NO dropdownMenu");
            clickOnElement(addToCartXpath);
        }

    }

    private void ifRemovePresent(String tableXpath,  String tableRowsXpath) {
        this.webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(tableRowsXpath)));
        int tableRows = driver.findElements(By.xpath(tableRowsXpath)).size();
        System.out.println(tableRows + " rows is present");
        for (int c = 0; c < tableRows; c++) {
            clickOnElement(removeButton);
            System.out.println(c);
            driver.navigate().refresh();
            this.webDriverWait.until(ExpectedConditions.refreshed(ExpectedConditions.presenceOfElementLocated(By.xpath(tableXpath))));
//            this.webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(tableXpath))).
        }
    }

    private void ifRemovePresent2(String elementXpath, String logo, String tableRowsXpath) {

        this.webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(tableRowsXpath)));
        int tableRows = driver.findElements(By.xpath(tableRowsXpath)).size();
        System.out.println(tableRows + "remove is present");
        for (int i = 0; i >= tableRows; i++) {
            clickOnElement(elementXpath);
        }


    }


}
