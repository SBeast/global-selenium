package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminMenu {
    WebDriver driver;
    WebDriverWait webDriverWait;
    /**
     * variables for responses
     */
    final String errorInput = "Can not work with input ";
    final String errorButton = "Can not work with Button ";
    final String canNotWork = "Can not work with element ";
    final String canNotFind = "Can not find element ";
    final String wasOpened = " Was opened";
    final String wasClicked = " Was clicked";

    @FindBy (xpath = ".//span[@class='name'][contains(text(),'Appearence')]")
    WebElement adminMenuAppearence;
    @FindBy (xpath = ".//span[@class='name'][contains(text(),'Template')]")
    WebElement adminMenuAppearenceSubMenuTemplate;
    @FindBy (xpath = ".//span[@class='name'][contains(text(),'Logotype')]")
    WebElement adminMenuAppearenceSubMenuLogotype;
    @FindBy (xpath = ".//span[@class='name'][contains(text(),'Catalog')]")
    WebElement adminMenuCatalog;
    @FindBy (xpath = ".//li[@id='doc-catalog']")
    WebElement adminMenuCatalogSubMenuCatalog;
    @FindBy (xpath = ".//li[@id='doc-product_groups']]")
    WebElement adminMenuCatalogSubMenuProductGroups;
    @FindBy (xpath = ".//li[@id='doc-option_groups']")
    WebElement adminMenuCatalogSubMenuOptionGroups;
    @FindBy (xpath = ".//li[@id='doc-manufacturers']")
    WebElement adminMenuCatalogSubMenuManufacturers;
    @FindBy (xpath = ".//li[@id='doc-suppliers']")
    WebElement adminMenuCatalogSubMenuSuppliers;
    @FindBy (xpath = ".//li[@id='doc-delivery_statuses']")
    WebElement adminMenuCatalogSubMenuDeliveryStatuses;
    @FindBy (xpath = ".//li[@id='doc-sold_out_statuses']")
    WebElement adminMenuCatalogSubMenuSoldOutStatuses;
    @FindBy (xpath = ".//li[@id='doc-quantity_units']")
    WebElement adminMenuCatalogSubMenuQuantityUnits;
    @FindBy (xpath = ".//a[@href='http://localhost/litecart/admin/?app=catalog&doc=csv']")
    WebElement adminMenuCatalogSubMenuCSV;

    @FindBy (xpath = ".//span[@class='name'][contains(text(),'Countries')]")
    WebElement adminMenuCountries;
    @FindBy (xpath = ".//span[@class='name'][contains(text(),'Currencies')]")
    WebElement adminMenuCurrencies;
    @FindBy (xpath = ".//span[@class='name'][contains(text(),'Customers')]")
    WebElement adminMenuCustomers;
    @FindBy (xpath = ".//li[@id='doc-customers']")
    WebElement adminMenuCustomersSubMenuCustomers;
    @FindBy (xpath = ".//a[@href='http://localhost/litecart/admin/?app=customers&doc=csv']")
    WebElement adminMenuCustomersSubMenuCSV;
    @FindBy (xpath = ".//li[@id='doc-newsletter']")
    WebElement adminMenuCustomersSubMenuNewsletter;

    @FindBy (xpath = ".//a[@href='http://localhost/litecart/admin/?app=geo_zones&doc=geo_zones']")
    WebElement adminMenuGeoZones;
    @FindBy (xpath = ".//a[@href='http://localhost/litecart/admin/?app=languages&doc=languages']")
    WebElement adminMenuLanguages;
    @FindBy (xpath = ".//li[@id='doc-languages']")
    WebElement adminMenuLanguagesSubMenuLanguages;
    @FindBy (xpath = ".//li[@id='doc-storage_encoding']")
    WebElement adminMenuLanguagesSubMenuStorageEncoding;

    @FindBy (xpath = ".//a[@href='http://localhost/litecart/admin/?app=modules&doc=jobs']")
    WebElement adminMenuModules;
    @FindBy (xpath = ".//li[@id='doc-jobs']")
    WebElement adminMenuModulesSubMenuBackgroundJobs;
    @FindBy (xpath = ".//a[@href='http://localhost/litecart/admin/?app=modules&doc=customer']")
    WebElement adminMenuModulesSubMenuCustomer;
    @FindBy (xpath = ".//li[@id='doc-shipping']")
    WebElement adminMenuModulesSubMenuShipping;
    @FindBy (xpath = ".//li[@id='doc-payment']")
    WebElement adminMenuModulesSubMenuPayment;
    @FindBy (xpath = ".//li[@id='doc-order_total']")
    WebElement adminMenuModulesSubMenuOrderTotal;
    @FindBy (xpath = ".//li[@id='doc-order_success']")
    WebElement adminMenuModulesSubMenuOrderSuccess;
    @FindBy (xpath = ".//li[@id='doc-order_action']")
    WebElement adminMenuModulesSubMenuOrderAction;

    @FindBy (xpath = ".//a[@href='http://localhost/litecart/admin/?app=orders&doc=orders']")
    WebElement adminMenuOrders;
    @FindBy (xpath = ".//li[@id='doc-orders']//a//span[@class='name'][contains(text(),'Orders')]")
    WebElement adminMenuOrdersSubMenuOrders;
    @FindBy (xpath = ".//li[@id='doc-order_statuses']")
    WebElement adminMenuModulesSubMenuOrderStatuses;

    @FindBy (xpath = ".//a[@href='http://localhost/litecart/admin/?app=pages&doc=pages']")
    WebElement adminMenuPages;

    @FindBy (xpath = ".//a[@href='http://localhost/litecart/admin/?app=reports&doc=monthly_sales']")
    WebElement adminMenuReports;
    @FindBy (xpath = ".//li[@id='doc-monthly_sales']")
    WebElement adminMenuModulesSubMenuMonthlySales;
    @FindBy (xpath = ".//li[@id='doc-most_sold_products']")
    WebElement adminMenuModulesSubMenuMostSoldProducts;
    @FindBy (xpath = ".//li[@id='doc-most_shopping_customers']")
    WebElement adminMenuModulesSubMenudocMostShoppingCustomers;

    @FindBy (xpath = ".//a[@href='http://localhost/litecart/admin/?app=settings&doc=store_info']")
    WebElement adminMenuSettings;
    @FindBy (xpath = ".//li[@id='doc-store_info']")
    WebElement adminMenuSettingsSubMenuStoreInfo;
    @FindBy (xpath = ".//li[@id='doc-defaults']")
    WebElement adminMenuSettingsSubMenuDefaults;
    @FindBy (xpath = ".//li[@id='doc-general']")
    WebElement adminMenuSettingsSubMenuGeneral;
    @FindBy (xpath = ".//li[@id='doc-listings']")
    WebElement adminMenuSettingsSubMenuListings;
    @FindBy (xpath = ".//li[@id='doc-images']")
    WebElement adminMenuSettingsSubMenuiIages;
    @FindBy (xpath = ".//li[@id='doc-checkout']")
    WebElement adminMenuSettingsSubMenuCheckout;
    @FindBy (xpath = ".//li[@id='doc-advanced']")
    WebElement adminMenuSettingsSubMenuAdvanced;
    @FindBy (xpath = ".//li[@id='doc-security']")
    WebElement adminMenuSettingsSubMenuSecurity;



    public AdminMenu (WebDriver exterDriver){
        this.driver = exterDriver;
        PageFactory.initElements(driver, this);
        webDriverWait = new WebDriverWait(driver, 10);
    }



}
