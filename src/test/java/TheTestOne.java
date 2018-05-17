import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TheTestOne {




        @Test
        public void firstTest() {
//            ChromeDriverManager.getInstance().setup();
            FirefoxDriverManager.getInstance().setup();
//            InternetExplorerDriverManager.getInstance().setup();
//            EdgeDriverManager.getInstance().setup();

//            WebDriver driver = new ChromeDriver();
            WebDriver driver = new FirefoxDriver();
//            WebDriver driver = new InternetExplorerDriver();
//            WebDriver driver = new EdgeDriver();

            driver.get("http://localhost/litecart/");
//            driver.get("http://news.google.com.ua");

            driver.quit();

            System.out.println("test 2");
        }
    }

