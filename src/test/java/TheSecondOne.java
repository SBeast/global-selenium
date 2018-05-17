import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TheSecondOne {

    @Before
    public void start() {
        ChromeDriverManager.getInstance().setup();

        ChromeOptions opt = new ChromeOptions();
        opt.setCapability("", "");
        opt.setHeadless(true);

        WebDriver driver = new ChromeDriver();

        System.out.println("Before");
    }

    @Test
    public void secondTest() {
        System.out.println("test 2");
    }

    @After
    public void stop() {
        System.out.println("After ");
    }

}

