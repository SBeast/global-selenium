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
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ClickAllMenuOnAdminPageWithListener {

    WebDriverWait webDriverWait;
    EventFiringWebDriver eventDriver;


    String baseAdminURL = "http://localhost/litecart/admin";
    String adminUserName = "admin";
    String adminPassword = "admin";
    String loginButton = ".//button[@type='submit']";
    String mainMenuXPath = ".//li[@id='app-']";

    @Before
    public void runUpClickAllMenuOnAdminPageWithListener() {
        driverStart();

        eventDriver.findElement(By.xpath(".//input[@name='username']")).clear();
        eventDriver.findElement(By.xpath(".//input[@name='username']")).sendKeys(adminUserName);
        eventDriver.findElement(By.xpath(".//input[@name='password']")).clear();
        eventDriver.findElement(By.xpath(".//input[@name='password']")).sendKeys(adminPassword);
        clickOnElement(loginButton);

    }

    @After
    public void afterClickAllMenuOnAdminPageWithListener() {
        driverStop();
    }

    @Test
    public void ClickAllMenuOnAdminPageWithListener() {
        int countMainMenu = eventDriver.findElements(By.xpath(mainMenuXPath)).size();
        System.out.println(countMainMenu);
        for (int i = 1; i <= countMainMenu; i++) {
            clickOnElement("(" + mainMenuXPath + ")[" + i + "]");
            webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//h1")));
            int countSubMenu = eventDriver.findElements(By.xpath(".//li[" + i + "]/ul[1]/li")).size();
            if (countSubMenu > 0) {
                System.out.println("submenu size " + countSubMenu);
                for (int z = 1; z <= countSubMenu; z++) {
                    clickOnElement(".//li[" + i + "]/ul[1]/li[" + z + "]");
                    webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//h1")));
                }
            }
        }
    }


    private void driverStart() {

//        FirefoxDriverManager.getInstance().setup();
//        eventDriver = new EventFiringWebDriver(new FirefoxDriver());
//        eventDriver.register(new Listener());
//        eventDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        eventDriver.manage().window().maximize();

        ChromeDriverManager.getInstance().setup();
        eventDriver = new EventFiringWebDriver(new ChromeDriver());
        eventDriver.register(new Listener());
        eventDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        eventDriver.manage().window().maximize();

        webDriverWait = new WebDriverWait(eventDriver, 5);
        eventDriver.get(baseAdminURL);

    }

    private void driverStop() {
        if (eventDriver != null) eventDriver.quit();
    }

    private void clickOnElement(String elementXpath) {

        try {
            this.webDriverWait.until(ExpectedConditions.elementToBeClickable(eventDriver.findElement(By.xpath(elementXpath))));
            WebElement element = eventDriver.findElement(By.xpath(elementXpath));
            element.click();

        } catch (Exception E) {
            System.out.println(eventDriver + elementXpath);
            Assert.fail(eventDriver + elementXpath);
        }
    }
}
