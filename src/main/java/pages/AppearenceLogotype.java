package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppearenceLogotype {
    WebDriver driver;
    WebDriverWait webDriverWait;
    final String errorInput = "Can not work with input ";
    final String errorButton = "Can not work with Button ";
    final String canNotWork = "Can not work with element ";
    final String canNotFind = "Can not find element ";
    final String wasOpened = " Was opened";
    final String wasClicked = " Was clicked";

//    @FindBy (xpath = ".//h1")
//    WebElement h1;

    public AppearenceLogotype(WebDriver exterDriver) {
        this.driver = exterDriver;
        PageFactory.initElements(driver, this);
        webDriverWait = new WebDriverWait(driver, 10);
    }

        @FindBy (xpath = ".//h1")
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
}
