package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    @FindBy(xpath = ".//span[@class='name'][contains(text(),'Appearence')]")
    WebElement adminMenuAppearence;
    @FindBy(xpath = ".//span[@class='name'][contains(text(),'Template')]")
    WebElement adminMenuAppearenceSubMenuTemplate;
    @FindBy(xpath = ".//span[@class='name'][contains(text(),'Logotype')]")
    WebElement adminMenuAppearenceSubMenuLogotype;
    @FindBy(xpath = ".//span[@class='name'][contains(text(),'Catalog')]")
    WebElement adminMenuCatalog;
    @FindBy(xpath = ".//li[@id='doc-catalog']")
    WebElement adminMenuCatalogSubMenuCatalog;
    @FindBy(xpath = ".//li[@id='doc-product_groups']]")
    WebElement adminMenuCatalogSubMenuProductGroups;
    @FindBy(xpath = ".//li[@id='doc-option_groups']")
    WebElement adminMenuCatalogSubMenuOptionGroups;
    @FindBy(xpath = ".//li[@id='doc-manufacturers']")
    WebElement adminMenuCatalogSubMenuManufacturers;
    @FindBy(xpath = ".//li[@id='doc-suppliers']")
    WebElement adminMenuCatalogSubMenuSuppliers;
    @FindBy(xpath = ".//li[@id='doc-delivery_statuses']")
    WebElement adminMenuCatalogSubMenuDeliveryStatuses;
    @FindBy(xpath = ".//li[@id='doc-sold_out_statuses']")
    WebElement adminMenuCatalogSubMenuSoldOutStatuses;
    @FindBy(xpath = ".//li[@id='doc-quantity_units']")
    WebElement adminMenuCatalogSubMenuQuantityUnits;
    @FindBy(xpath = ".//a[@href='http://localhost/litecart/admin/?app=catalog&doc=csv']")
    WebElement adminMenuCatalogSubMenuCSV;

    @FindBy(xpath = ".//span[@class='name'][contains(text(),'Countries')]")
    WebElement adminMenuCountries;
    @FindBy(xpath = ".//span[@class='name'][contains(text(),'Currencies')]")
    WebElement adminMenuCurrencies;
    @FindBy(xpath = ".//span[@class='name'][contains(text(),'Customers')]")
    WebElement adminMenuCustomers;
    @FindBy(xpath = ".//li[@id='doc-customers']")
    WebElement adminMenuCustomersSubMenuCustomers;
    @FindBy(xpath = ".//a[@href='http://localhost/litecart/admin/?app=customers&doc=csv']")
    WebElement adminMenuCustomersSubMenuCSV;
    @FindBy(xpath = ".//li[@id='doc-newsletter']")
    WebElement adminMenuCustomersSubMenuNewsletter;

    @FindBy(xpath = ".//a[@href='http://localhost/litecart/admin/?app=geo_zones&doc=geo_zones']")
    WebElement adminMenuGeoZones;
    @FindBy(xpath = ".//a[@href='http://localhost/litecart/admin/?app=languages&doc=languages']")
    WebElement adminMenuLanguages;
    @FindBy(xpath = ".//li[@id='doc-languages']")
    WebElement adminMenuLanguagesSubMenuLanguages;
    @FindBy(xpath = ".//li[@id='doc-storage_encoding']")
    WebElement adminMenuLanguagesSubMenuStorageEncoding;

    @FindBy(xpath = ".//a[@href='http://localhost/litecart/admin/?app=modules&doc=jobs']")
    WebElement adminMenuModules;
    @FindBy(xpath = ".//li[@id='doc-jobs']")
    WebElement adminMenuModulesSubMenuBackgroundJobs;
    @FindBy(xpath = ".//a[@href='http://localhost/litecart/admin/?app=modules&doc=customer']")
    WebElement adminMenuModulesSubMenuCustomer;
    @FindBy(xpath = ".//li[@id='doc-shipping']")
    WebElement adminMenuModulesSubMenuShipping;
    @FindBy(xpath = ".//li[@id='doc-payment']")
    WebElement adminMenuModulesSubMenuPayment;
    @FindBy(xpath = ".//li[@id='doc-order_total']")
    WebElement adminMenuModulesSubMenuOrderTotal;
    @FindBy(xpath = ".//li[@id='doc-order_success']")
    WebElement adminMenuModulesSubMenuOrderSuccess;
    @FindBy(xpath = ".//li[@id='doc-order_action']")
    WebElement adminMenuModulesSubMenuOrderAction;

    @FindBy(xpath = ".//a[@href='http://localhost/litecart/admin/?app=orders&doc=orders']")
    WebElement adminMenuOrders;
    @FindBy(xpath = ".//li[@id='doc-orders']//a//span[@class='name'][contains(text(),'Orders')]")
    WebElement adminMenuOrdersSubMenuOrders;
    @FindBy(xpath = ".//li[@id='doc-order_statuses']")
    WebElement adminMenuModulesSubMenuOrderStatuses;

    @FindBy(xpath = ".//a[@href='http://localhost/litecart/admin/?app=pages&doc=pages']")
    WebElement adminMenuPages;

    @FindBy(xpath = ".//a[@href='http://localhost/litecart/admin/?app=reports&doc=monthly_sales']")
    WebElement adminMenuReports;
    @FindBy(xpath = ".//li[@id='doc-monthly_sales']")
    WebElement adminMenuModulesSubMenuMonthlySales;
    @FindBy(xpath = ".//li[@id='doc-most_sold_products']")
    WebElement adminMenuModulesSubMenuMostSoldProducts;
    @FindBy(xpath = ".//li[@id='doc-most_shopping_customers']")
    WebElement adminMenuModulesSubMenudocMostShoppingCustomers;

    @FindBy(xpath = ".//a[@href='http://localhost/litecart/admin/?app=settings&doc=store_info']")
    WebElement adminMenuSettings;
    @FindBy(xpath = ".//li[@id='doc-store_info']")
    WebElement adminMenuSettingsSubMenuStoreInfo;
    @FindBy(xpath = ".//li[@id='doc-defaults']")
    WebElement adminMenuSettingsSubMenuDefaults;
    @FindBy(xpath = ".//li[@id='doc-general']")
    WebElement adminMenuSettingsSubMenuGeneral;
    @FindBy(xpath = ".//li[@id='doc-listings']")
    WebElement adminMenuSettingsSubMenuListings;
    @FindBy(xpath = ".//li[@id='doc-images']")
    WebElement adminMenuSettingsSubMenuiIages;
    @FindBy(xpath = ".//li[@id='doc-checkout']")
    WebElement adminMenuSettingsSubMenuCheckout;
    @FindBy(xpath = ".//li[@id='doc-advanced']")
    WebElement adminMenuSettingsSubMenuAdvanced;
    @FindBy(xpath = ".//li[@id='doc-security']")
    WebElement adminMenuSettingsSubMenuSecurity;


    @FindBy(xpath = ".//a[@href='http://localhost/litecart/admin/?app=slides&doc=slides']")
    WebElement adminMenuSlides;

    @FindBy(xpath = "//a[@href='http://localhost/litecart/admin/?app=tax&doc=tax_classes']")
    WebElement adminMenuTax;
    @FindBy(xpath = ".//li[@id='doc-tax_classes']")
    WebElement adminMenuTaxSubMenuTaxClasses;
    @FindBy(xpath = ".//li[@id='doc-tax_rates']")
    WebElement adminMenuTaxSubMenuTaxRates;

    @FindBy(xpath = ".//a[@href='http://localhost/litecart/admin/?app=translations&doc=search']")
    WebElement adminMenuTranslations;
    @FindBy(xpath = ".//li[@id='doc-search']")
    WebElement adminMenuTranslationsSubMenuSearchTranslations;
    @FindBy(xpath = ".//li[@id='doc-scan']")
    WebElement adminMenuTranslationsSubMenuSearchScanFiles;
    @FindBy(xpath = ".//a[@href='http://localhost/litecart/admin/?app=translations&doc=csv']")
    WebElement adminMenuTranslationsSubMenuCSV;

    @FindBy(xpath = ".//a[@href='http://localhost/litecart/admin/?app=users&doc=users']")
    WebElement adminMenuUsers;

    @FindBy(xpath = ".//a[@http://localhost/litecart/admin/?app=vqmods&doc=vqmods']")
    WebElement adminMenuVQmods;
    @FindBy(xpath = ".//li[@id='doc-vqmods']")
    WebElement adminMenuVQmodsSubMenuVQmods;


    public AdminMenu(WebDriver exterDriver) {
        this.driver = exterDriver;
        PageFactory.initElements(driver, this);
        webDriverWait = new WebDriverWait(driver, 10);
    }

    /**
     * Method cliks on adminMenuAppearence
     */
    public void clickAdminMenuAppearence() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuAppearence));
            adminMenuAppearence.click();
            System.out.println(adminMenuAppearence + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuAppearence);
        }
    }

    /**
     * Method cliks on adminMenuAppearenceSubMenuTemplate
     */
    public void clickAdminMenuAppearenceSubMenuTemplate() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuAppearenceSubMenuTemplate));
            adminMenuAppearenceSubMenuTemplate.click();
            System.out.println(adminMenuAppearenceSubMenuTemplate + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuAppearenceSubMenuTemplate);
        }
    }

    /**
     * Method cliks on adminMenuAppearenceSubMenuLogotype
     */
    public void clickAdminMenuAppearenceSubMenuLogotype() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuAppearenceSubMenuLogotype));
            adminMenuAppearenceSubMenuLogotype.click();
            System.out.println(adminMenuAppearenceSubMenuLogotype + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuAppearenceSubMenuLogotype);
        }
    }

    /**
     * Method cliks on adminMenuCatalog
     */
    public void clickAdminMenuCatalog() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuCatalog));
            adminMenuCatalog.click();
            System.out.println(adminMenuCatalog + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuCatalog);
        }
    }

    /**
     * Method cliks on adminMenuCatalogSubMenuCatalog
     */
    public void clickAdminMenuCatalogSubMenuCatalog() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuCatalogSubMenuCatalog));
            adminMenuCatalogSubMenuCatalog.click();
            System.out.println(adminMenuCatalogSubMenuCatalog + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuCatalogSubMenuCatalog);
        }
    }

    /**
     * Method cliks on adminMenuCatalogSubMenuProductGroups
     */
    public void clickAdminMenuCatalogSubMenuProductGroups() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuCatalogSubMenuProductGroups));
            adminMenuCatalogSubMenuProductGroups.click();
            System.out.println(adminMenuCatalogSubMenuProductGroups + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuCatalogSubMenuProductGroups);
        }
    }

    /**
     * Method cliks on adminMenuCatalogSubMenuOptionGroups
     */
    public void clickAdminMenuCatalogSubMenuOptionGroups() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuCatalogSubMenuOptionGroups));
            adminMenuCatalogSubMenuOptionGroups.click();
            System.out.println(adminMenuCatalogSubMenuOptionGroups + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuCatalogSubMenuOptionGroups);
        }
    }

    /**
     * Method cliks on adminMenuCatalogSubMenuManufacturers
     */
    public void clickAdminMenuCatalogSubMenuManufacturers() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuCatalogSubMenuManufacturers));
            adminMenuCatalogSubMenuManufacturers.click();
            System.out.println(adminMenuCatalogSubMenuManufacturers + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuCatalogSubMenuManufacturers);
        }
    }

    /**
     * Method cliks on adminMenuCatalogSubMenuSuppliers
     */
    public void clickAdminMenuCatalogSubMenuSuppliers() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuCatalogSubMenuSuppliers));
            adminMenuCatalogSubMenuSuppliers.click();
            System.out.println(adminMenuCatalogSubMenuSuppliers + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuCatalogSubMenuSuppliers);
        }
    }

    /**
     * Method cliks on adminMenuCatalogSubMenuDeliveryStatuses
     */
    public void clickAdminMenuCatalogSubMenuDeliveryStatuses() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuCatalogSubMenuDeliveryStatuses));
            adminMenuCatalogSubMenuDeliveryStatuses.click();
            System.out.println(adminMenuCatalogSubMenuDeliveryStatuses + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuCatalogSubMenuDeliveryStatuses);
        }
    }

    /**
     * Method cliks on adminMenuCatalogSubMenuDeliveryStatuses
     */
    public void clickAdminMenuCatalogSubMenuSoldOutStatuses() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuCatalogSubMenuSoldOutStatuses));
            adminMenuCatalogSubMenuSoldOutStatuses.click();
            System.out.println(adminMenuCatalogSubMenuSoldOutStatuses + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuCatalogSubMenuSoldOutStatuses);
        }
    }

    /**
     * Method cliks on adminMenuCatalogSubMenuQuantityUnits
     */
    public void clickAdminMenuCatalogSubMenuQuantityUnits() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuCatalogSubMenuQuantityUnits));
            adminMenuCatalogSubMenuQuantityUnits.click();
            System.out.println(adminMenuCatalogSubMenuQuantityUnits + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuCatalogSubMenuQuantityUnits);
        }
    }

    /**
     * Method cliks on adminMenuCatalogSubMenuCSV
     */
    public void clickAdminMenuCatalogSubMenuCSV() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuCatalogSubMenuCSV));
            adminMenuCatalogSubMenuCSV.click();
            System.out.println(adminMenuCatalogSubMenuCSV + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuCatalogSubMenuCSV);
        }
    }

    /**
     * Method cliks on adminMenuCountries
     */
    public void clickAdminMenuCountries() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuCountries));
            adminMenuCountries.click();
            System.out.println(adminMenuCountries + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuCountries);
        }
    }

    /**
     * Method cliks on adminMenuCurrencies
     */
    public void clickAdminMenuCurrencies() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuCurrencies));
            adminMenuCurrencies.click();
            System.out.println(adminMenuCurrencies + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuCurrencies);
        }
    }

    /**
     * Method cliks on adminMenuCustomers
     */
    public void clickAdminMenuCustomers() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuCustomers));
            adminMenuCustomers.click();
            System.out.println(adminMenuCustomers + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuCustomers);
        }
    }

    /**
     * Method cliks on adminMenuCustomersSubMenuCustomers
     */
    public void clickAdminMenuCustomersSubMenuCustomers() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuCustomersSubMenuCustomers));
            adminMenuCustomersSubMenuCustomers.click();
            System.out.println(adminMenuCustomersSubMenuCustomers + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuCustomersSubMenuCustomers);
        }
    }


    /**
     * Method cliks on adminMenuCustomersSubMenuCSV
     */
    public void clickAdminMenuCustomersSubMenuCSV() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuCustomersSubMenuCSV));
            adminMenuCustomersSubMenuCSV.click();
            System.out.println(adminMenuCustomersSubMenuCSV + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuCustomersSubMenuCSV);
        }
    }

    /**
     * Method cliks on adminMenuCustomersSubMenuNewsletter
     */
    public void clickAdminMenuCustomersSubMenuNewsletter() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuCustomersSubMenuNewsletter));
            adminMenuCustomersSubMenuNewsletter.click();
            System.out.println(adminMenuCustomersSubMenuNewsletter + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuCustomersSubMenuNewsletter);
        }
    }

    /**
     * Method cliks on adminMenuGeoZones
     */
    public void clickAdminMenuGeoZones() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuGeoZones));
            adminMenuGeoZones.click();
            System.out.println(adminMenuGeoZones + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuGeoZones);
        }
    }

    /**
     * Method cliks on adminMenuLanguages
     */
    public void clickAdminMenuLanguages() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuLanguages));
            adminMenuLanguages.click();
            System.out.println(adminMenuLanguages + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuLanguages);
        }
    }

    /**
     * Method cliks on adminMenuLanguagesSubMenuLanguages
     */
    public void clickAdminMenuLanguagesSubMenuLanguages() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuLanguagesSubMenuLanguages));
            adminMenuLanguagesSubMenuLanguages.click();
            System.out.println(adminMenuLanguagesSubMenuLanguages + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuLanguagesSubMenuLanguages);
        }
    }

    /**
     * Method cliks on adminMenuLanguagesSubMenuStorageEncoding
     */
    public void clickAdminMenuLanguagesSubMenuStorageEncoding() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuLanguagesSubMenuStorageEncoding));
            adminMenuLanguagesSubMenuStorageEncoding.click();
            System.out.println(adminMenuLanguagesSubMenuStorageEncoding + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuLanguagesSubMenuStorageEncoding);
        }
    }

    /**
     * Method cliks on adminMenuModules
     */
    public void clickAdminMenuModules() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuModules));
            adminMenuModules.click();
            System.out.println(adminMenuModules + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuModules);
        }
    }

    /**
     * Method cliks on adminMenuModulesSubMenuBackgroundJobs
     */
    public void clickAdminMenuModulesSubMenuBackgroundJobs() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuModulesSubMenuBackgroundJobs));
            adminMenuModulesSubMenuBackgroundJobs.click();
            System.out.println(adminMenuModulesSubMenuBackgroundJobs + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuModulesSubMenuBackgroundJobs);
        }
    }

    /**
     * Method cliks on adminMenuModulesSubMenuCustomer
     */
    public void clickAdminMenuModulesSubMenuCustomer() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuModulesSubMenuCustomer));
            adminMenuModulesSubMenuCustomer.click();
            System.out.println(adminMenuModulesSubMenuCustomer + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuModulesSubMenuCustomer);
        }
    }

    /**
     * Method cliks on adminMenuModulesSubMenuShipping
     */
    public void clickAdminMenuModulesSubMenuShipping() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuModulesSubMenuShipping));
            adminMenuModulesSubMenuShipping.click();
            System.out.println(adminMenuModulesSubMenuShipping + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuModulesSubMenuShipping);
        }
    }

    /**
     * Method cliks on adminMenuModulesSubMenuPayment
     */
    public void clickAdminMenuModulesSubMenuPayment() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuModulesSubMenuPayment));
            adminMenuModulesSubMenuPayment.click();
            System.out.println(adminMenuModulesSubMenuPayment + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuModulesSubMenuPayment);
        }
    }

    /**
     * Method cliks on adminMenuModulesSubMenuOrderTotal
     */
    public void clickAdminMenuModulesSubMenuOrderTotal() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuModulesSubMenuOrderTotal));
            adminMenuModulesSubMenuOrderTotal.click();
            System.out.println(adminMenuModulesSubMenuOrderTotal + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuModulesSubMenuOrderTotal);
        }
    }

    /**
     * Method cliks on adminMenuModulesSubMenuOrderSuccess
     */
    public void clickAdminMenuModulesSubMenuOrderSuccess() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuModulesSubMenuOrderSuccess));
            adminMenuModulesSubMenuOrderSuccess.click();
            System.out.println(adminMenuModulesSubMenuOrderSuccess + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuModulesSubMenuOrderSuccess);
        }
    }

    /**
     * Method cliks on adminMenuModulesSubMenuOrderAction
     */
    public void clickAdminMenuModulesSubMenuOrderAction() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuModulesSubMenuOrderAction));
            adminMenuModulesSubMenuOrderAction.click();
            System.out.println(adminMenuModulesSubMenuOrderAction + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuModulesSubMenuOrderAction);
        }
    }


    /**
     * Method cliks on adminMenuOrders
     */
    public void clickAdminMenuOrders() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuOrders));
            adminMenuOrders.click();
            System.out.println(adminMenuOrders + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuOrders);
        }
    }

    /**
     * Method cliks on adminMenuOrdersSubMenuOrders
     */
    public void clickAdminMenuOrdersSubMenuOrders() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuOrdersSubMenuOrders));
            adminMenuOrdersSubMenuOrders.click();
            System.out.println(adminMenuOrdersSubMenuOrders + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuOrdersSubMenuOrders);
        }
    }

    /**
     * Method cliks on adminMenuModulesSubMenuOrderStatuses
     */
    public void clickAdminMenuModulesSubMenuOrderStatuses() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuModulesSubMenuOrderStatuses));
            adminMenuModulesSubMenuOrderStatuses.click();
            System.out.println(adminMenuModulesSubMenuOrderStatuses + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuModulesSubMenuOrderStatuses);
        }
    }

    /**
     * Method cliks on adminMenuPages
     */
    public void clickAdminMenuPages() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuPages));
            adminMenuPages.click();
            System.out.println(adminMenuPages + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuPages);
        }
    }

    /**
     * Method cliks on adminMenuReports
     */
    public void clickAdminMenuReports() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuReports));
            adminMenuReports.click();
            System.out.println(adminMenuReports + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuReports);
        }
    }

    /**
     * Method cliks on adminMenuModulesSubMenuMonthlySales
     */
    public void clickAdminMenuModulesSubMenuMonthlySales() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuModulesSubMenuMonthlySales));
            adminMenuModulesSubMenuMonthlySales.click();
            System.out.println(adminMenuModulesSubMenuMonthlySales + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuModulesSubMenuMonthlySales);
        }
    }

    /**
     * Method cliks on adminMenuModulesSubMenuMostSoldProducts
     */
    public void clickAdminMenuModulesSubMenuMostSoldProducts() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuModulesSubMenuMostSoldProducts));
            adminMenuModulesSubMenuMostSoldProducts.click();
            System.out.println(adminMenuModulesSubMenuMostSoldProducts + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuModulesSubMenuMostSoldProducts);
        }
    }


    /**
     * Method cliks on adminMenuModulesSubMenudocMostShoppingCustomers
     */
    public void clickAdminMenuModulesSubMenudocMostShoppingCustomers() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuModulesSubMenudocMostShoppingCustomers));
            adminMenuModulesSubMenudocMostShoppingCustomers.click();
            System.out.println(adminMenuModulesSubMenudocMostShoppingCustomers + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuModulesSubMenudocMostShoppingCustomers);
        }
    }

    /**
     * Method cliks on adminMenuSettings
     */
    public void clickAdminMenuSettings() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuSettings));
            adminMenuSettings.click();
            System.out.println(adminMenuSettings + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuSettings);
        }
    }

    /**
     * Method cliks on adminMenuSettingsSubMenuStoreInfo
     */
    public void clickAdminMenuSettingsSubMenuStoreInfo() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuSettingsSubMenuStoreInfo));
            adminMenuSettingsSubMenuStoreInfo.click();
            System.out.println(adminMenuSettingsSubMenuStoreInfo + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuSettingsSubMenuStoreInfo);
        }
    }

    /**
     * Method cliks on adminMenuSettingsSubMenuDefaults
     */
    public void clickAdminMenuSettingsSubMenuDefaults() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuSettingsSubMenuDefaults));
            adminMenuSettingsSubMenuDefaults.click();
            System.out.println(adminMenuSettingsSubMenuDefaults + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuSettingsSubMenuDefaults);
        }
    }


    /**
     * Method cliks on adminMenuSettingsSubMenuGeneral
     */
    public void clickAdminMenuSettingsSubMenuGeneral() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuSettingsSubMenuGeneral));
            adminMenuSettingsSubMenuGeneral.click();
            System.out.println(adminMenuSettingsSubMenuGeneral + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuSettingsSubMenuGeneral);
        }
    }

    /**
     * Method cliks on adminMenuSettingsSubMenuListings
     */
    public void clickAdminMenuSettingsSubMenuListings() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuSettingsSubMenuListings));
            adminMenuSettingsSubMenuListings.click();
            System.out.println(adminMenuSettingsSubMenuListings + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuSettingsSubMenuListings);
        }
    }

    /**
     * Method cliks on adminMenuSettingsSubMenuiIages
     */
    public void clickAdminMenuSettingsSubMenuiIages() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuSettingsSubMenuiIages));
            adminMenuSettingsSubMenuiIages.click();
            System.out.println(adminMenuSettingsSubMenuiIages + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuSettingsSubMenuiIages);
        }
    }

    /**
     * Method cliks on adminMenuSettingsSubMenuCheckout
     */
    public void clickAdminMenuSettingsSubMenuCheckout() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuSettingsSubMenuCheckout));
            adminMenuSettingsSubMenuCheckout.click();
            System.out.println(adminMenuSettingsSubMenuCheckout + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuSettingsSubMenuCheckout);
        }
    }

    /**
     * Method cliks on adminMenuSettingsSubMenuAdvanced
     */
    public void clickAdminMenuSettingsSubMenuAdvanced() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuSettingsSubMenuAdvanced));
            adminMenuSettingsSubMenuAdvanced.click();
            System.out.println(adminMenuSettingsSubMenuAdvanced + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuSettingsSubMenuAdvanced);
        }
    }

    /**
     * Method cliks on adminMenuSettingsSubMenuSecurity
     */
    public void clickAdminMenuSettingsSubMenuSecurity() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuSettingsSubMenuSecurity));
            adminMenuSettingsSubMenuSecurity.click();
            System.out.println(adminMenuSettingsSubMenuSecurity + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuSettingsSubMenuSecurity);
        }
    }


    /**
     * Method cliks on adminMenuSlides
     */
    public void clickAdminMenuSlides() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuSlides));
            adminMenuSlides.click();
            System.out.println(adminMenuSlides + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuSlides);
        }
    }

    /**
     * Method cliks on adminMenuTax
     */
    public void clickAdminMenuTax() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuTax));
            adminMenuTax.click();
            System.out.println(adminMenuTax + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuTax);
        }
    }

    /**
     * Method cliks on adminMenuTaxSubMenuTaxClasses
     */
    public void clickAdminMenuTaxSubMenuTaxClasses() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuTaxSubMenuTaxClasses));
            adminMenuTaxSubMenuTaxClasses.click();
            System.out.println(adminMenuTaxSubMenuTaxClasses + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuTaxSubMenuTaxClasses);
        }
    }

    /**
     * Method cliks on adminMenuTaxSubMenuTaxRates
     */
    public void clickAdminMenuTaxSubMenuTaxRates() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuTaxSubMenuTaxRates));
            adminMenuTaxSubMenuTaxRates.click();
            System.out.println(adminMenuTaxSubMenuTaxRates + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuTaxSubMenuTaxRates);
        }
    }


    /**
     * Method cliks on adminMenuTranslations
     */
    public void clickAdminMenuTranslations() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuTranslations));
            adminMenuTranslations.click();
            System.out.println(adminMenuTranslations + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuTranslations);
        }
    }

    /**
     * Method cliks on adminMenuTranslationsSubMenuSearchTranslations
     */
    public void clickAdminMenuTranslationsSubMenuSearchTranslations() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuTranslationsSubMenuSearchTranslations));
            adminMenuTranslationsSubMenuSearchTranslations.click();
            System.out.println(adminMenuTranslationsSubMenuSearchTranslations + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuTranslationsSubMenuSearchTranslations);
        }
    }


    /**
     * Method cliks on adminMenuTranslationsSubMenuSearchScanFiles
     */
    public void clickAdminMenuTranslationsSubMenuSearchScanFiles() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuTranslationsSubMenuSearchScanFiles));
            adminMenuTranslationsSubMenuSearchScanFiles.click();
            System.out.println(adminMenuTranslationsSubMenuSearchScanFiles + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuTranslationsSubMenuSearchScanFiles);
        }
    }


    /**
     * Method cliks on adminMenuTranslationsSubMenuCSV
     */
    public void clickAdminMenuTranslationsSubMenuCSV() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuTranslationsSubMenuCSV));
            adminMenuTranslationsSubMenuCSV.click();
            System.out.println(adminMenuTranslationsSubMenuCSV + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuTranslationsSubMenuCSV);
        }
    }

    /**
     * Method cliks on adminMenuUsers
     */
    public void clickAdminMenuUsers() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuUsers));
            adminMenuUsers.click();
            System.out.println(adminMenuUsers + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuUsers);
        }
    }


    /**
     * Method cliks on adminMenuVQmods
     */
    public void clickAdminMenuVQmods() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuVQmods));
            adminMenuVQmods.click();
            System.out.println(adminMenuVQmods + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuVQmods);
        }
    }


    /**
     * Method cliks on adminMenuVQmodsSubMenuVQmods
     */
    public void clickAdminMenuVQmodsSubMenuVQmods() {
        try {
            this.webDriverWait.until(ExpectedConditions.visibilityOf(adminMenuVQmodsSubMenuVQmods));
            adminMenuVQmodsSubMenuVQmods.click();
            System.out.println(adminMenuVQmodsSubMenuVQmods + " was clicked");

        } catch (Exception e) {
            System.out.println("Can not work with Button  " + this.adminMenuVQmodsSubMenuVQmods);
        }
    }


}
