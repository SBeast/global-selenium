import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TheTestOne {




        @Test
        public void firstTest() {
            ChromeDriverManager.getInstance().setup();
//            FirefoxDriverManager.getInstance().setup();

            WebDriver driver = new ChromeDriver();
//            WebDriver driver = new FirefoxDriver();
            driver.get("http://google.com");

            driver.quit();


            System.out.println("test ");
        }
    }

