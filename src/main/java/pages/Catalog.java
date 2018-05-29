package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Catalog {
    WebDriver driver;
    WebDriverWait webDriverWait;
//    AllPagesAdmin allPages = new AllPagesAdmin(driver);
//  private    AllPagesAdmin allPagesAdmin = new AllPagesAdmin(driver);

    /**
     * variables for responses
     */
    final String errorInput = "Can not work with input ";
    final String errorButton = "Can not work with Button ";
    final String canNotWork = "Can not work with element ";
    final String canNotFind = "Can not find element ";
    final String wasOpened = " Was opened";
    final String wasClicked = " Was clicked";

    public Catalog(WebDriver exterDriver) {
        this.driver = exterDriver;
        PageFactory.initElements(driver, this);
        webDriverWait = new WebDriverWait(driver, 10);
    }


    @FindBy(xpath = ".//h1")
    WebElement h1;

    public boolean isH1IsPresent() {
        try {
            webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//h1")));
//            webDriverWait.until(ExpectedConditions.visibilityOf(loginBox));
            System.out.println(h1 + " is Displayes");


            return h1.isDisplayed();

        } catch (Exception e) {
            System.out.println(h1 + " is not displayed");
            return false;
        }

    }

    public void clickOnAddNewProduct() {
        String buttonEddNewProductXPath = ".//a[@href='http://localhost/litecart/admin/?category_id=0&app=catalog&doc=edit_product']";
        clickOnButton(buttonEddNewProductXPath);

    }


    public void clickOnRubberDucksGroup () {
        String rubberDucksGroup = ".//a[@href='http://localhost/litecart/admin/?app=catalog&doc=catalog&category_id=1']";
        clickOnButton(rubberDucksGroup);
    }


    private void clickOnButton(String buttonXPath) {

        try {

            WebElement button = driver.findElement(By.xpath(buttonXPath));
            this.webDriverWait.until(ExpectedConditions.visibilityOf(button));
            button.click();
            System.out.println(button + wasClicked);

        } catch (Exception e) {
            System.out.println(errorButton + buttonXPath);
            Assert.fail(errorButton + buttonXPath);
        }
    }

    public boolean isElementPresent(String productName) {
        try {

            String productNameXpath = ".//a[contains(text(),'"+ productName +"')]";
            webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(productNameXpath)));
            WebElement product = driver.findElement(By.xpath(productNameXpath));

//            webDriverWait.until(ExpectedConditions.visibilityOf(loginBox));
            System.out.println(product + " is Displayes");
            return product.isDisplayed();

        } catch (Exception e) {
            System.out.println(productName + " is not displayed");
            return false;
        }

    }
}
