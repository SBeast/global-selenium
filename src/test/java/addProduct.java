import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AllPagesAdmin;
//import pages.AllPages;

public class AddProduct {

//    public WebDriver driver;
//    public WebDriverWait wait;


    String adminLoginPageURL = "http://localhost/litecart/admin";
    String adminUserName = "admin";
    String adminPassword = "admin";
    String buttonEddNewProduct = ".//a[@href='http://localhost/litecart/admin/?category_id=0&app=catalog&doc=edit_product']";
    String productName = "Dragon Duck";
    String productCode = "rd100";
    String productPurchasePrice = "10";
    String currencyValue = "EUR";
    String productEuroPrice = "101";
    String productUsdPrice = "200";
    String productImagePath = "D:\\Project\\global-selenium\\duck_knight.jpg";

    @Before
    public void RunUpForAddProduct() {


    }

    @After
    public void AfterAddProduct() {


    }

    @Test
    public void AddProduct() {
        FirefoxDriverManager.getInstance().setup();
        WebDriver driver = new FirefoxDriver();
////        ChromeDriverManager.getInstance().setup();
////        WebDriver driver = new ChromeDriver();
        AllPagesAdmin allPages = new AllPagesAdmin(driver);
        allPages.adminLoginPage2.validAdminLogin(adminUserName, adminPassword, adminLoginPageURL);
        allPages.adminMenu.clickAdminMenuCatalog();
        //add new product
        allPages.catalog.clickOnAddNewProduct();
        allPages.addNewProduct.enterName(productName);
        allPages.addNewProduct.enterCode(productCode);
        allPages.addNewProduct.setCheckBoxRubberDucks();
        allPages.addNewProduct.setCheckBoxUniSex();
        allPages.addNewProduct.setCheckBoxEnabled();
        allPages.addNewProduct.uploadProductImage(productImagePath);
        allPages.addNewProduct.clickPrices();
        allPages.addNewProduct.enterPurchasePrice(productPurchasePrice);
        allPages.addNewProduct.enterEuroPrice(productEuroPrice);
        allPages.addNewProduct.enterUsdPrice(productUsdPrice);
        allPages.addNewProduct.choseCurrency(currencyValue);
        allPages.addNewProduct.clickSave();
        //check is added product is present
        allPages.adminMenu.clickAdminMenuCatalog();
        allPages.catalog.clickOnRubberDucksGroup();
        allPages.catalog.isElementPresent(productName);
        //delete added product
//        allPages.adminMenu.clickAdminMenuCatalog();
//        allPages.catalog.clickOnRubberDucksGroup();




//        allPages.clickOnButton.clickOnButton(buttonEddNewProduct);
//

//        allPages.adminLoginPage2.closeBrowserAdminLoginPage();

    }


}
