package MLA.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

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

    public MainPage(WebDriver exterDriver) {
        this.driver = exterDriver;
        PageFactory.initElements(driver, this);
        webDriverWait = new WebDriverWait(driver, 5);
    }

    @FindBy (xpath = ".//div[@id='box-most-popular']/div[@class='content']/ul[@class='listing-wrapper products']/li[1]")
    WebElement campaignsSection_1st;

    public void clickCampaignsSection_1st (){

        try {
            this.webDriverWait.until(ExpectedConditions.elementToBeClickable(campaignsSection_1st));
            campaignsSection_1st.click();
            System.out.println(campaignsSection_1st + wasClicked);
        } catch (Exception E){
            System.out.println(canNotWork + campaignsSection_1st);
            Assert.fail(canNotWork + campaignsSection_1st);
        }

    }
}
