package MLA.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

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

    @FindBy (xpath = ".//button[@name='remove_cart_item']")
    WebElement removeButton;
    @FindBy (xpath = ".//table[@class='dataTable rounded-corners']//tbody")
    WebElement table;
    @FindBy (xpath = ".//td[@class='item']")
    WebElement tableRow;
    final String tableRowsXpath = ".//td[@class='item']";

    public CartPage(WebDriver exterDriver) {
        this.driver = exterDriver;
        PageFactory.initElements(driver, this);
        webDriverWait = new WebDriverWait(driver, 10);
    }

    public void ifRemovePresent() {
        this.webDriverWait.until(ExpectedConditions.visibilityOf(table));
        int tableRows = driver.findElements(By.xpath(tableRowsXpath)).size();
        System.out.println(tableRows + " rows is present");
        for (int c = 0; c < tableRows; c++) {
            clickOnElement(removeButton);
            System.out.println(c);
            driver.navigate().refresh();
//            WebElement table = driver.findElement(By.xpath(tableXpath));
//            this.webDriverWait.until(ExpectedConditions.stalenessOf(table));

        }
    }


    private void clickOnElement(WebElement webElementToClick) {

        try {
            this.webDriverWait.until(ExpectedConditions.elementToBeClickable(webElementToClick));
            webElementToClick.click();
            System.out.println(webElementToClick + wasClicked);
        } catch (Exception E) {
            System.out.println(errorElement + webElementToClick);
            Assert.fail(errorElement + webElementToClick);
        }
    }
}
