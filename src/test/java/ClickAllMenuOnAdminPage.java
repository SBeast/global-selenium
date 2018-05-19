import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.AllPagesAdmin;
//import pages.AllPages;

public class ClickAllMenuOnAdminPage {

    String adminLoginPageURL = "http://localhost/litecart/admin";
    String adminUserName = "admin";
    String adminPassword = "admin";

    @Before
    public void RunUpForClickAllMenuOnAdminPage() {


    }

    @After
    public void AfterClickAllMenuOnAdminPage() {

    }

    @Test
    public void ClickAllMenuOnAdminPage() {
        FirefoxDriverManager.getInstance().setup();
        WebDriver driver = new FirefoxDriver();
//        ChromeDriverManager.getInstance().setup();
//        WebDriver driver = new ChromeDriver();
        AllPagesAdmin allPages = new AllPagesAdmin(driver);

        allPages.adminLoginPage2.validAdminLogin(adminUserName, adminPassword, adminLoginPageURL);
//        Assert.assertTrue(allPages.adminLoginPage2.isLoginBoxIsPresent());
//        allPages.adminLoginPage2.closeBrowserAdminLoginPage();
        /**
         * MenuAppearence
         */
        allPages.adminMenu.clickAdminMenuAppearence();
        allPages.appearenceTemplate.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuAppearenceSubMenuTemplate();
        allPages.appearenceTemplate.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuAppearenceSubMenuLogotype();
        allPages.appearenceLogotype.isH1IsPresent();
        /**
         * MenuCatalog
         */
        allPages.adminMenu.clickAdminMenuCatalog();
        allPages.catalog.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuCatalogSubMenuCatalog();
        allPages.catalog.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuCatalogSubMenuProductGroups();
        allPages.catalogProductGroups.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuCatalogSubMenuOptionGroups();
        allPages.catalogOptionGroups.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuCatalogSubMenuManufacturers();
        allPages.catalogManufacturers.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuCatalogSubMenuSuppliers();
        allPages.catalogSuppliers.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuCatalogSubMenuDeliveryStatuses();
        allPages.catalogDeliveryStatuses.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuCatalogSubMenuSoldOutStatuses();
        allPages.catalogSoldOutStatuses.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuCatalogSubMenuQuantityUnits();
        allPages.catalogQuantityUnits.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuCatalogSubMenuCSV();
        allPages.catalogCatalogCSV.isH1IsPresent();
        /**
         * MenuCountries
         */
        allPages.adminMenu.clickAdminMenuCountries();
        allPages.countries.isH1IsPresent();
        /**
         * MenuCurrencies
         */
        allPages.adminMenu.clickAdminMenuCurrencies();
        allPages.countries.isH1IsPresent();
        /**
         * MenuCustomers
         */
        allPages.adminMenu.clickAdminMenuCustomers();
        allPages.customers.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuCustomersSubMenuCustomers();
        allPages.customers.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuCustomersSubMenuCSV();
        allPages.customersCSV.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuCustomersSubMenuNewsletter();
        allPages.customersNewsletter.isH1IsPresent();
        /**
         * MenuGeoZones
         */
        allPages.adminMenu.clickAdminMenuGeoZones();
        allPages.geoZones.isH1IsPresent();
/**
 * MenuLanguages
 */
        allPages.adminMenu.clickAdminMenuLanguages();
        allPages.languages.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuLanguagesSubMenuLanguages();
        allPages.languages.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuLanguagesSubMenuStorageEncoding();
        allPages.languagesStorageEncoding.isH1IsPresent();
/**
 * MenuModules
 */
        allPages.adminMenu.clickAdminMenuModules();
        allPages.modulesJobModules.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuModulesSubMenuBackgroundJobs();
        allPages.modulesJobModules.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuModulesSubMenuCustomer();
        allPages.modulesCustomerModules.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuModulesSubMenuShipping();
        allPages.modulesShippingModules.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuModulesSubMenuPayment();
        allPages.modulesPaymentModules.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuModulesSubMenuOrderTotal();
        allPages.modulesOrderTotalModules.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuModulesSubMenuOrderSuccess();
        allPages.modulesOrderSuccessModules.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuModulesSubMenuOrderAction();
        allPages.modulesOrderActionModules.isH1IsPresent();


        allPages.adminMenu.clickAdminMenuOrders();
        allPages.orders.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuOrdersSubMenuOrders();
        allPages.orders.isH1IsPresent();
        allPages.adminMenu.clickAdminMenuModulesSubMenuOrderStatuses();
        allPages.ordersOrderStatuses.isH1IsPresent();



        allPages.adminLoginPage2.closeBrowserAdminLoginPage();

    }


}
