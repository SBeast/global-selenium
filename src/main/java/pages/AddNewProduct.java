package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewProduct {
    WebDriver driver;
    WebDriverWait webDriverWait;


    /**
     * variables for responses
     */
    final String errorInput = "Can not work with input ";
    final String errorButton = "Can not work with Button ";
    final String canNotWork = "Can not work with element ";
    final String canNotFind = "Can not find element ";
    final String wasOpened = " Was opened";
    final String wasClicked = " Was clicked";
    final String wasSent = " Was sent";


    public AddNewProduct(WebDriver exterDriver) {
        this.driver = exterDriver;
        PageFactory.initElements(driver, this);
        webDriverWait = new WebDriverWait(driver, 10);
    }


    public void enterName(String productName) {
        String fieldNameXPath = ".//input[@name='name[en]']";
        sendKeysToField(fieldNameXPath, productName);
    }

    public void enterCode(String productCode) {
        String fieldNameXPath = ".//input[@name='code']";
        sendKeysToField(fieldNameXPath, productCode);
    }

    public void setCheckBoxRubberDucks() {
        String checkBoxXPATH = ".//input[@data-name='Rubber Ducks']";
        setCheckBox(checkBoxXPATH);

    }

    public void setCheckBoxUniSex() {
        String checkBoxXPATH = ".//input[@value='1-3']";
        setCheckBox(checkBoxXPATH);
    }

    public void setCheckBoxEnabled() {
        String checkBoxXPATH = ".//input[@type='radio'][@value='1']";
        setCheckBox(checkBoxXPATH);
    }

    public void clickPrices() {
        String tabPricesXpath = ".//a[@href='#tab-prices']";
        clickOnButton(tabPricesXpath);
    }

    public void enterPurchasePrice(String productPurchasePrice) {
        String fieldPurchasePrice = ".//input[@name='purchase_price']";
        sendKeysToField(fieldPurchasePrice, productPurchasePrice);
    }

    public void choseCurrency(String currencyValue) {
        String dropdownMenuXPath = ".//select[@name='purchase_price_currency_code']";
        setDropdownMenuValue(dropdownMenuXPath, currencyValue);
    }

    public void uploadProductImage(String productImagePath) {
        String uploadProductImage = ".//input[@name='new_images[]']";
        sendKeysToField(uploadProductImage, productImagePath);
    }

    public void clickSave () {
        String buttonSave = ".//button[@name='save']";
        clickOnButton(buttonSave);
    }

    public void enterEuroPrice (String productEuroPrice){
       String fieldEuroPrice = ".//input[@name='gross_prices[EUR]']";
       sendKeysToField(fieldEuroPrice,productEuroPrice);

    }
    public void enterUsdPrice (String productUsdPrice){
        String fieldUsdPrice = ".//input[@name='gross_prices[USD]']";
        sendKeysToField(fieldUsdPrice,productUsdPrice);

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

    private void sendKeysToField(String fieldXPath, String valueForField) {

        try {
            WebElement field = driver.findElement(By.xpath(fieldXPath));
            this.webDriverWait.until(ExpectedConditions.visibilityOf(field));
            field.clear();
            field.sendKeys(valueForField);
            System.out.println(valueForField + wasSent);

        } catch (Exception E) {
            System.out.println(errorInput + fieldXPath);
            Assert.fail(errorInput + fieldXPath);
        }

    }

    private void setCheckBox(String checkBoxXpath) {

        try {
            WebElement checkBox = driver.findElement(By.xpath(checkBoxXpath));
            this.webDriverWait.until(ExpectedConditions.visibilityOf(checkBox));
            checkBox.click();

        } catch (Exception E) {
            System.out.println(errorInput + checkBoxXpath);
            Assert.fail(errorInput + checkBoxXpath);
        }
    }

    private void setDropdownMenuValue(String dropDownXpath, String currencyValue) {
        try {
            By dropdownMenu = By.xpath(dropDownXpath);
            this.webDriverWait.until(ExpectedConditions.elementToBeClickable(dropdownMenu));
            Select currency = new Select(driver.findElement(dropdownMenu));
            currency.selectByValue(currencyValue);

        } catch (Exception E) {
            System.out.println(canNotWork + dropDownXpath);
            Assert.fail(canNotWork + dropDownXpath);
        }
    }
}
