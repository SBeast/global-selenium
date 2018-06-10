package MLA.tests;


import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MainTest {

    WebDriver driver;
    WebDriverWait webDriverWait;

//
//    String baseURL = "http://localhost/litecart/";

    public void driverStart(String baseURL) {
//        FirefoxDriverManager.getInstance().setup();
//        driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        webDriverWait = new WebDriverWait(driver, 10);
//
////        ChromeDriverManager.getInstance().setup();
////        driver = new ChromeDriver();
////        driver.manage().window().maximize();
////        webDriverWait = new WebDriverWait(driver, 5);
//
//        driver.get(baseURL);

        FirefoxDriverManager.getInstance().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost/litecart/");


    }
}

