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
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AllPagesAdmin;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Counrties {

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

    String baseAdminURL = "http://localhost/litecart/admin";
    String adminUserName = "admin";
    String adminPassword = "admin";
    String loginButton = ".//button[@type='submit']";
    String editCountry = ".//i[@class='fa fa-pencil']";
    String adminMenuCountries = ".//span[@class='name'][contains(text(),'Countries')]";
    String externalLink = ".//i[@class='fa fa-external-link']";

    @Before
    public void RunUpCountries() {
        driverStart();
    }

    @After
    public void afterCountries() {
        driverStop();
    }

    @Test
    public void Countries() {
        clickOnElement(adminMenuCountries);
        clickOnElement(editCountry);
        this.webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(externalLink)));
        String originalWin = driver.getWindowHandle();
        int countExternalLink = driver.findElements(By.xpath(externalLink)).size();
        for (int i=0; i < countExternalLink; i++){
            Set<String> existWs = driver.getWindowHandles();
            int c = i + 1;
            clickOnElement("("+externalLink+")[" + c +"]");
            String newW = webDriverWait.until(anyWindowOtherThan(existWs));
            driver.switchTo().window(newW);
            String currentURL = driver.getCurrentUrl();
            System.out.println(currentURL);
            driver.close();



            driver.switchTo().window(originalWin);
        }

    }

    public ExpectedCondition<String> anyWindowOtherThan(Set<String> windows) {
        return new ExpectedCondition<String>() {
            public String apply(WebDriver input) {
                Set<String> handles = driver.getWindowHandles();
                handles.removeAll(windows);
                return handles.size() > 0 ? handles.iterator().next() : null;
            }
        };
    }

    private void driverStart() {
//        FirefoxDriverManager.getInstance().setup();
//        driver = new FirefoxDriver();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        webDriverWait = new WebDriverWait(driver, 5);

        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver, 5);

        driver.get(baseAdminURL);
        driver.findElement(By.xpath(".//input[@name='username']")).clear();
        driver.findElement(By.xpath(".//input[@name='username']")).sendKeys(adminUserName);
        driver.findElement(By.xpath(".//input[@name='password']")).clear();
        driver.findElement(By.xpath(".//input[@name='password']")).sendKeys(adminPassword);
        clickOnElement(loginButton);

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
            this.webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("./html/head")));
            WebElement head = driver.findElement(By.xpath("./html/head"));
            System.out.println(head);

        } catch (Exception E) {
            System.out.println(errorElement + elementXpath);
            Assert.fail(errorElement + elementXpath);
        }
    }
}
