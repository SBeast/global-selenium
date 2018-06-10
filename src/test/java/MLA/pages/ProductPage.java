package MLA.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

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

    @FindBy (xpath = ".//select[@name='options[Size]']")
    WebElement dropdownMenu;
    String dropDownXpath = ".//select[@name='options[Size]']";
    @FindBy (xpath = ".//button[@name='add_cart_product']")
    WebElement addToCartButton;


    public ProductPage (WebDriver exterDriver) {
        this.driver = exterDriver;
        PageFactory.initElements(driver, this);
        webDriverWait = new WebDriverWait(driver, 5);
    }

    public void ifDropDownPresent(String valueForElement) {
        int ifElementPresents = driver.findElements(By.xpath(dropDownXpath)).size();
        System.out.println("dropdown is present - "+ ifElementPresents);
        if (ifElementPresents > 0) {
            this.webDriverWait.until(ExpectedConditions.elementToBeClickable(dropdownMenu));
            Select value = new Select(driver.findElement(By.xpath(dropDownXpath)));
            value.selectByValue(valueForElement);
            clickOnElement(addToCartButton);
        } else {
            clickOnElement(addToCartButton);
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
