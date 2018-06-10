package MLA.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Header {

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


    @FindBy(xpath = ".//div[@id='logotype-wrapper']")
    WebElement logo;

    @FindBy(xpath = ".//div[@id='cart']")
    WebElement cart;

    public Header(WebDriver exterDriver) {
        this.driver = exterDriver;
        PageFactory.initElements(driver, this);
        webDriverWait = new WebDriverWait(driver, 5);
    }

    public void clickOnLogo() {
        clickOnElement(logo);
    }

    public void clokOnCart () {
        clickOnElement(cart);
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
