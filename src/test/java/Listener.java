import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

import java.io.File;
import java.io.IOException;

public class Listener extends AbstractWebDriverEventListener {


    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("before search " + by);
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("after search " + by);
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        File tempFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            long time = System.currentTimeMillis();
            System.out.println("Result is displayed on - " + time + "screen.png");
            Files.copy(tempFile, new File(time + "screen.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {

        System.out.println("Exception - " + throwable.getMessage());
        File tempFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            long time = System.currentTimeMillis();
            System.out.println("Exception is displayed on - " + time + "screen.png");
            Files.copy(tempFile, new File(time + "screen.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
