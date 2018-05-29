package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickOnButton {
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

public ClickOnButton (WebDriver exterDriver){
    this.driver = exterDriver;
    PageFactory.initElements(driver, this);
    webDriverWait = new WebDriverWait(driver, 10);

}
    public void clickOnButton (String buttonXPath) {

        try {

            WebElement button = driver.findElement(By.xpath(buttonXPath));
            this.webDriverWait.until(ExpectedConditions.visibilityOf(button));
            button.click();
            System.out.println(button + wasClicked);

        }catch (Exception e) {
            System.out.println(errorButton + buttonXPath);
            Assert.fail(errorButton  + buttonXPath);
        }
    }

}
