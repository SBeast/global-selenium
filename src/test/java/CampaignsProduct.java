import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CampaignsProduct {
    public WebDriver driver;
    public WebDriverWait wait;
    WebDriver ff, cr;


    @Before
    public void runUpForCampaignsProduct() {

        driverStart();

    }

    @After
    public  void afterCampaignsProduct() {
        driverQuit();

    }

    @Test
    public void compareRegularPrice() {

        String cssSelectorOnMainPage = "#box-campaigns .regular-price";
        String elementAtributeOnMainPage = "innerText";
        String cssSelectorOnProductPage = ".regular-price";
        String elementAtributeOnProductPage = "innerText";
        String comapreElement = "regularPrice";
        findElementsAndAttributes(cssSelectorOnMainPage,elementAtributeOnMainPage,cssSelectorOnProductPage,elementAtributeOnProductPage,comapreElement);

    }

    @Test
    public void compareDiscountPrice() {

        String cssSelectorOnMainPage = "#box-campaigns .campaign-price";
        String elementAtributeOnMainPage = "innerText";
        String cssSelectorOnProductPage = ".campaign-price";
        String elementAtributeOnProductPage = "innerText";
        String comapreElement = "discountPrice";
        findElementsAndAttributes(cssSelectorOnMainPage,elementAtributeOnMainPage,cssSelectorOnProductPage,elementAtributeOnProductPage,comapreElement);

    }

    @Test
    public void compareDiscountPriceColor() {

        String cssSelectorOnMainPage = "#box-campaigns .campaign-price";
        String elementAtributeOnMainPage = "color";
        String cssSelectorOnProductPage = ".campaign-price";
        String elementAtributeOnProductPage = "color";
        String comapreElement = "discountPriceColor";
        getCssValue(cssSelectorOnMainPage,elementAtributeOnMainPage,cssSelectorOnProductPage,elementAtributeOnProductPage,comapreElement);

    }
    @Test
    public void compareRegularPriceStrike() {

        String cssSelectorOnMainPage = "#box-campaigns .regular-price";
        String elementAtributeOnMainPage = "text-decoration-line";
        String cssSelectorOnProductPage = ".regular-price";
        String elementAtributeOnProductPage = "text-decoration-line";
        String comapreElement = "discountPriceColor";
        getCssValue(cssSelectorOnMainPage,elementAtributeOnMainPage,cssSelectorOnProductPage,elementAtributeOnProductPage,comapreElement);

    }
    @Test
    public void compareRegularPriceColor() {

        String cssSelectorOnMainPage = "#box-campaigns .regular-price";
        String elementAtributeOnMainPage = "color";
        String cssSelectorOnProductPage = ".regular-price";
        String elementAtributeOnProductPage = "color";
        String comapreElement = "regularPriceColor";
        getCssValue(cssSelectorOnMainPage,elementAtributeOnMainPage,cssSelectorOnProductPage,elementAtributeOnProductPage,comapreElement);

    }

    @Test
    public void compareProductName() {

        String cssSelectorOnMainPage = "#box-campaigns .name";
        String elementAtributeOnMainPage = "innerText";
        String cssSelectorOnProductPage = "h1.title";
        String elementAtributeOnProductPage = "innerText";
        String comapreElement = "productName";
        findElementsAndAttributes(cssSelectorOnMainPage,elementAtributeOnMainPage,cssSelectorOnProductPage,elementAtributeOnProductPage,comapreElement);

    }

    private void findElementsAndAttributes (String cssSelectorOnMainPage,String elementAtributeOnMainPage, String cssSelectorOnProductPage, String elementAtributeOnProductPage, String comapreElement ){
        WebElement elementOnMainPage = ff.findElement(By.cssSelector(cssSelectorOnMainPage));
        String mainPageValue = elementOnMainPage.getAttribute(elementAtributeOnMainPage);
        System.out.println(comapreElement + " on main page = " + mainPageValue);
        clickOnProduct();
        WebElement elementOnProductPage = ff.findElement(By.cssSelector(cssSelectorOnProductPage));
        String productPageValue = elementOnProductPage.getAttribute(elementAtributeOnProductPage);
        System.out.println(comapreElement + " on product page = " + productPageValue);
        compareOfValues(mainPageValue, productPageValue,comapreElement);
    }

    private void getCssValue (String cssSelectorOnMainPage,String elementAtributeOnMainPage, String cssSelectorOnProductPage, String elementAtributeOnProductPage, String comapreElement ){
        WebElement elementOnMainPage = ff.findElement(By.cssSelector(cssSelectorOnMainPage));
        String mainPageValue = elementOnMainPage.getCssValue(elementAtributeOnMainPage);
        System.out.println(comapreElement + " on main page = " + mainPageValue);
        clickOnProduct();
        WebElement elementOnProductPage = ff.findElement(By.cssSelector(cssSelectorOnProductPage));
        String productPageValue = elementOnProductPage.getCssValue(elementAtributeOnProductPage);
        System.out.println(comapreElement + " on product page = " + productPageValue);
        compareOfValues(mainPageValue, productPageValue,comapreElement);
    }

    private void driverStart() {
        FirefoxDriverManager.getInstance().setup();
        ff = new FirefoxDriver();
        ff.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        ff.manage().window().maximize();

//        ChromeDriverManager.getInstance().setup();
//        cr = new ChromeDriver();
//        cr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        cr.manage().window().maximize();

        String baseURL = "http://localhost/litecart";

        ff.get(baseURL);
//        cr.get(baseURL);


    }

    private void driverQuit() {
        if (ff != null) ff.quit();
//        if (cr != null) cr.quit();
    }

    private void clickOnProduct() {

        try {
            ff.findElement(By.cssSelector("#box-campaigns .name")).click();
            System.out.println("Product on main page was clicked");

        } catch (Exception E) {
            Assert.fail("Can not click on product on  main page");
        }
        try {
            WebElement h1Title = ff.findElement(By.cssSelector("h1.title"));
//            System.out.println(h1Title);
//            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1.title")));
        } catch (Exception E) {
            Assert.fail("Error on product page");
        }
    }

    private void compareOfValues(String mainPageValue, String productPageValue, String comapreElement) {
        boolean equals;
        equals = mainPageValue.equals(productPageValue);

        System.out.println(equals);
        if (equals == true) {
            System.out.println("values from main page and product page equals");
            System.out.println(comapreElement + " on mainPage " + mainPageValue + " equals " + comapreElement +" on productPage " + productPageValue);
        } else {
            System.out.println(comapreElement + " on mainPage " + mainPageValue + " NOT equals " + comapreElement +" on productPage " + productPageValue);
            Assert.fail(comapreElement + " on mainPage " + mainPageValue + " NOT equals " + comapreElement +" on productPage " + productPageValue);
        }


    }
}
