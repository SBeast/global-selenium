import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Qwerty {

    WebDriver driver;
    WebDriverWait webDriverWait;
    EventFiringWebDriver eventDriver;

    @Before
    public void start() {
                ChromeDriverManager.getInstance().setup();
//        driver = new ChromeDriver();

        eventDriver = new EventFiringWebDriver(new ChromeDriver());
        eventDriver.register(new Listener());

    }

    @After
    public void stop() {
        eventDriver.quit();
    }

    @Test
    public void listenerTest() {


        eventDriver.navigate().to("http://www.google.com");
        eventDriver.findElement(By.name("q")).sendKeys("webdriver" + Keys.ENTER);
        eventDriver.findElement(By.name("q4")).sendKeys("webdriver" + Keys.ENTER);
    }


}
