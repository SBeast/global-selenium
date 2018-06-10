package MLA.logicUseCases;

import MLA.pages.AllShopPages;
import org.openqa.selenium.WebDriver;


public class WorkWithProducts {
    WebDriver driver;



    public WorkWithProducts(WebDriver exterDriver) {
        this.driver = exterDriver;
    }

    public void addProductToCurt (int quantity, String valueDropDown) {
        AllShopPages allShopPages = new AllShopPages(driver);
        for (int i = 0; i < quantity; i++) {
            System.out.println("quantity = " + quantity + " ;" + "i = "+ i +" ;");
            allShopPages.mainPage.clickCampaignsSection_1st();
            allShopPages.productPage.ifDropDownPresent(valueDropDown);
            allShopPages.header.clickOnLogo();
        }
    }

    public void removeAllProductsFromCart (){
        AllShopPages allShopPages = new AllShopPages(driver);
        allShopPages.header.clokOnCart();
        allShopPages.cartPage.ifRemovePresent();
    }
}
