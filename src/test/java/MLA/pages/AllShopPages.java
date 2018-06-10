package MLA.pages;


import org.openqa.selenium.WebDriver;
import MLA.logicUseCases.WorkWithProducts;



public class AllShopPages {

    WebDriver driver;
//    WebDriverWait webDriverWait;

    public MainPage mainPage;
    public CartPage cartPage;
    public ProductPage productPage;
    public Header header;
    public WorkWithProducts workWithProducts;



    public AllShopPages (WebDriver exterDriver) {
        this.driver = exterDriver;

        // the main page of shop http://localhost/litecart/en/
        mainPage = new MainPage(driver);
        // cart page http://localhost/litecart/en/checkout
        cartPage = new CartPage(driver);
        // productPage
        productPage = new ProductPage(driver);
         //header
        header = new Header(driver);
        // logicUseCases WorkWithProducts
//        workWithProducts = new WorkWithProducts(driver);
        workWithProducts = new WorkWithProducts(driver);




    }


}
