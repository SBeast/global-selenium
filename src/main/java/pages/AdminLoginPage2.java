package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;


public class AdminLoginPage2 {

    WebDriver driver;
    WebDriverWait webDriverWait;

    final String errorInput = "Can not work with input ";
    final String errorButton = "Can not work with Button ";
    final String canNotWork = "Can not work with element ";
    final String canNotFind = "Can not find element ";
    final String wasOpened = " Was opened";
    final String wasClicked = " Was clicked";

    @FindBy(xpath = ".//input[@name='username']")
    WebElement inputUsernameField;
    @FindBy(xpath = ".//input[@name='password']")
    WebElement inputPasswordField;
    @FindBy(xpath = ".//button[@type='submit']")
    WebElement loginButton;
    @FindBy(xpath = ".//input[@name='remember_me']")
    WebElement checkBoxRememberMe;
    @FindBy(id = "box-login")
    WebElement loginBox;

    public AdminLoginPage2(WebDriver exterDriver) {
        this.driver = exterDriver;
        PageFactory.initElements(driver, this);
        webDriverWait = new WebDriverWait(driver, 10);
    }


    /**
     * Method open  browser  and AdminLoginPage
     *
     * @param adminLoginPageURL
     */
    public void openBrowserAdminLoginPage(String adminLoginPageURL) {
        try {
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get(adminLoginPageURL);
            System.out.println("Page  - " + adminLoginPageURL + " was opened");

        } catch (Exception e) {
            System.out.println(errorInput + "browser");
        }
    }

    /**
     * Method closes AdminLoginPage & browser
     */
    public void closeBrowserAdminLoginPage() {
        driver.quit();
        System.out.println("Page AdminLoginPage and browser were cloused");

    }

    /**
     * Method enters adminUserName
     *
     * @param adminUserName
     */
    public void enterAdminUserName(String adminUserName) {
        try {
            inputUsernameField.clear();
            inputUsernameField.sendKeys(adminUserName);
            System.out.println("adminUserName " + adminUserName + " was entered");
        } catch (Exception e) {
            System.out.println(errorInput + " " + adminUserName);
        }
    }

    /**
     * Method enters adminPassword
     *
     * @param
     */
    public void enterAdminPassword(String adminPassword) {
        try {
            inputPasswordField.clear();
            inputPasswordField.sendKeys(adminPassword);
            System.out.println("adminPassword " + adminPassword + " was entered");
        } catch (Exception e) {
            System.out.println(errorInput + " " + adminPassword);
        }

    }

    /**
     * Method cliks on loginButton
     */
    public void clickLoginButton() {
        try {
            loginButton.click();
            System.out.println(loginButton + " was clicked");

        } catch (Exception e) {
            System.out.println(errorButton + " " + loginButton);
        }
    }

    /**
     * Method checks is loginBox is displayed on the page
     *
     * @return
     */
    public boolean isLoginBoxIsPresent() {
        try {
//            webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("box-login")));
            webDriverWait.until(ExpectedConditions.visibilityOf(loginBox));
            System.out.println(loginBox + " is Displayes");


            return loginBox.isDisplayed();

        } catch (Exception e) {
            System.out.println(loginBox + " is not displayed");
            return false;
        }

    }

    /**
     * Method open AdminLoginPage enter adminUserName,  enter adminPassword
     *
     * @param adminUserName
     * @param adminPassword
     */
    public void validAdminLogin(String adminUserName, String adminPassword, String adminLoginPageURL) {
        openBrowserAdminLoginPage(adminLoginPageURL);
        isLoginBoxIsPresent();
        enterAdminUserName(adminUserName);
        enterAdminPassword(adminPassword);
        clickLoginButton();
    }
}
