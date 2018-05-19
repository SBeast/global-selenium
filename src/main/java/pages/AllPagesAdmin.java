package pages;

import com.sun.scenario.Settings;
import org.openqa.selenium.WebDriver;

public class AllPagesAdmin {
    WebDriver driver;
    public AdminLoginPage2 adminLoginPage2;
    public AdminMenu adminMenu;
    /**
     * main Admin Page
     */
    public MyStore myStore;
    /**
     * Appearence group
     */
    public AppearenceTemplate appearenceTemplate;
    public AppearenceLogotype appearenceLogotype;
    /**
     * Catalog grouop
     */
    public Catalog catalog;
    public CatalogProductGroups catalogProductGroups;
    public CatalogOptionGroups catalogOptionGroups;
    public CatalogManufacturers catalogManufacturers;
    public CatalogSuppliers catalogSuppliers;
    public CatalogDeliveryStatuses catalogDeliveryStatuses;
    public CatalogSoldOutStatuses catalogSoldOutStatuses;
    public CatalogQuantityUnits catalogQuantityUnits;
    public CatalogCSV catalogCatalogCSV;
    /**
     * Countries group
     */
    public Countries countries;
    /**
     * Currencies group
     */
    public Currencies currencies;
    /**
     * Customers group
     */
    public Customers customers;
    public CustomersCSV customersCSV;
    public CustomersNewsletter customersNewsletter;
    /**
     * Geo Zones group
     */
    public GeoZones geoZones;
    /**
     * Languages group
     */
    public Languages languages;
    public LanguagesStorageEncoding languagesStorageEncoding;
    /**
     * Modules group
     */
    public ModulesJobModules modulesJobModules; //Background Jobs adminMenu
    public ModulesCustomerModules modulesCustomerModules; //Customer adminMenu
    public ModulesShippingModules modulesShippingModules; //Shipping adminMenu
    public ModulesPaymentModules modulesPaymentModules; // Payment adminMenu
    public ModulesOrderTotalModules modulesOrderTotalModules; //OrderTotal adminMenu
    public ModulesOrderSuccessModules modulesOrderSuccessModules; //OrderSuccess adminMenu
    public ModulesOrderActionModules modulesOrderActionModules; //OrderAction v
    /**
     * Orders group
     */
    public Orders orders;
    public OrdersOrderStatuses ordersOrderStatuses;
    /**
     * Pages group
     */
    public Pages pages;
    /**
     * Reports group
     */
    public ReportsMonthlySales reportsMonthlySales;
    public ReportsMostSoldProducts reportsMostSoldProducts;
    public ReportMostShoppingCustomers reportMostShoppingCustomers;
    /**
     * Settings group
     */
//    public Settings settings; // Settings & StoreInfo menus
    public SettingsInAdmin settingsInAdmin;
    public SettingsDefaults settingsDefaults; // litecart/admin/?app=settings&doc=defaults
    public SettingsGeneral settingsGeneral; // litecart/admin/?app=settings&doc=general
    public SettingsListings settingsListings; // litecart/admin/?app=settings&doc=listings
    public SettingsImages settingsImages; // litecart/admin/?app=settings&doc=images
    public SettingsCheckout settingsCheckout; // litecart/admin/?app=settings&doc=checkout
    public SettingsAdvanced settingsAdvanced; // litecart/admin/?app=settings&doc=advanced
    public SettingsSecurity settingsSecurity; // litecart/admin/?app=settings&doc=security
    /**
     * Slides group
     */
    public Slides slides;
    /**
     * Tax group
     */
    public TaxClasses taxClasses;
    public TaxRates taxRates;
    /**
     * Translations group
     */
    public TranslationsSearch translationsSearch;
    public TranslationScanFilesForTranslations translationScanFilesForTranslations;
    public TranslationsCSV translationsCSV;
    /**
     * Users group
     */
    public Users users;
    /**
     * vQmods group
     */
    public VQmods vQmods;


    public AllPagesAdmin(WebDriver exterDriver) {
        this.driver = exterDriver;
        adminLoginPage2 = new AdminLoginPage2(driver);
        adminMenu = new AdminMenu(driver);
        myStore = new MyStore(driver);

        appearenceTemplate = new AppearenceTemplate(driver);
        appearenceLogotype = new AppearenceLogotype(driver);

        catalog = new Catalog(driver);
        catalogProductGroups = new CatalogProductGroups(driver);
        catalogOptionGroups = new CatalogOptionGroups(driver);
        catalogManufacturers = new CatalogManufacturers(driver);
        catalogSuppliers = new CatalogSuppliers(driver);
        catalogDeliveryStatuses = new CatalogDeliveryStatuses(driver);
        catalogSoldOutStatuses = new CatalogSoldOutStatuses(driver);
        catalogQuantityUnits = new CatalogQuantityUnits(driver);
        catalogCatalogCSV = new CatalogCSV(driver);

        countries = new Countries(driver);

        currencies = new Currencies(driver);

        customers = new Customers(driver);
        customersCSV = new CustomersCSV(driver);
        customersNewsletter = new CustomersNewsletter(driver);

        geoZones = new GeoZones(driver);

        languages = new Languages(driver);
        languagesStorageEncoding = new LanguagesStorageEncoding(driver);

        modulesJobModules = new ModulesJobModules(driver);
        modulesCustomerModules = new ModulesCustomerModules(driver);
        modulesShippingModules = new ModulesShippingModules(driver);
        modulesPaymentModules = new ModulesPaymentModules(driver);
        modulesOrderTotalModules = new ModulesOrderTotalModules(driver);
        modulesOrderSuccessModules = new ModulesOrderSuccessModules(driver);
        modulesOrderActionModules = new ModulesOrderActionModules(driver);

        orders = new Orders(driver);
        ordersOrderStatuses = new OrdersOrderStatuses(driver);

        pages = new Pages(driver);

        reportsMonthlySales = new ReportsMonthlySales(driver);
        reportsMostSoldProducts = new ReportsMostSoldProducts(driver);
        reportMostShoppingCustomers = new ReportMostShoppingCustomers(driver);

        settingsInAdmin = new SettingsInAdmin(driver);
        settingsDefaults = new SettingsDefaults(driver);
        settingsGeneral = new SettingsGeneral(driver);
        settingsListings = new SettingsListings(driver);
        settingsImages = new SettingsImages(driver);
        settingsCheckout = new SettingsCheckout(driver);
        settingsAdvanced = new SettingsAdvanced(driver);
        settingsSecurity = new SettingsSecurity(driver);

        slides = new Slides(driver);

        taxClasses = new TaxClasses(driver);
        taxRates = new TaxRates(driver);

        translationsSearch = new TranslationsSearch(driver);
        translationScanFilesForTranslations = new TranslationScanFilesForTranslations(driver);
        translationsCSV = new TranslationsCSV(driver);

        users = new Users(driver);

        vQmods = new VQmods(driver);


    }
}
