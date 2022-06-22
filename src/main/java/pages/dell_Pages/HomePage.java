package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI{


    @FindBy(xpath = "//div[@class='mh-search']/input")
    private WebElement searchField;

    @FindBy(xpath = "//button[@class='mh-search-btn mh-search-submit']")
    private WebElement searchBtn;

    @FindBy(xpath = "//div[@class='mh-myaccount']")
    private WebElement signInHoverOver;

    @FindBy(xpath = "//a[@class='mh-btn mh-btn-primary navigate']")
    private WebElement signInBtn;

    @FindBy(xpath = "//*[text()=' Create an account ']")
    private WebElement createAccountBtn;
    @FindBy(xpath = "//div[@class='mh-myaccount-ctas']/a[4]")
    private WebElement premierSignInBtn;


    @FindBy(xpath = "//div[@class='mh-myaccount-ctas']/a[3]")
    private WebElement financialServiceBtn;

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    private WebElement hoverOverProducts;

    @FindBy(xpath = "//a[contains(text(),'Gaming')]")
    private WebElement hoverOverProductsGaming;

    @FindBy(xpath = "//a[contains(text(),'Dell Gaming')]")
    private WebElement hoverOverProductsGamingDellGamingOption;

    @FindBy(xpath = "//div[@class='hp-h-category-wrap']/div[3]/div")
    public WebElement hoverOverAlienware;

    @FindBy(xpath = "//div[@class='hp-h-category-wrap']/div[3]/div/figure/following-sibling::div/following-sibling::div/a[1]")
    public WebElement hoverOverAlienwareLaptops;

    @FindBy(xpath = "//span[contains(text(),'Products')]//..//../following-sibling::ul/li[6]/a")
    private WebElement workStationsOption;

    @FindBy(xpath = "//ul[@class='mh-top-menu-nav aria-nav']/li[8]/a/span")
    private WebElement aboutUsOption;

    @FindBy(xpath = "//ul[@class='mh-top-menu-nav aria-nav']/li[8]/ul/li[11]/a")
    private WebElement perspectivesBtn;

    @FindBy(xpath = "//div[@class='ContextualFooter1']/div[3]/ul/li[2]/a")
    private WebElement contactSupportBtn;

    @FindBy(xpath = "//div[@class='ContextualFooter2']/div[4]/ul/li[3]/a")
    private WebElement emailSignUp;

    @FindBy(xpath = "//div[@id='unified-masthead-navigation']/nav/ul/li[6]/a/span")
    private WebElement dealsMenu;

    @FindBy(xpath = "//div[@id='unified-masthead-navigation']/nav/ul/li[6]/ul/li[7]/a")
    private WebElement serverDeals;

    @FindBy(xpath = "//div[@id='unified-masthead-navigation']/nav/ul/li[5]/a/span")
    private WebElement hoverOverSupport;
    @FindBy(xpath = "//div[@id='unified-masthead-navigation']/nav/ul/li[5]/ul/li[7]/a")
    private WebElement hoverOverSupportOrderSupportOption;

    @FindBy(xpath = "//footer[@id='mh-unified-footer']/nav[3]/ul/li/a")
    private WebElement footerCopyrightBtn;
    @FindBy(xpath = "//nav[@class='ft-legal-links-section']/ul/li[2]/a")
    private WebElement footerTermsOfSaleBtn;
    @FindBy(xpath = "//div[@class='ContextualFooter2']/div[2]/ul/li[7]/a")
    private WebElement recyclingOption;
    @FindBy(xpath = "(//div[@class='dds__my-3 dds__my-lg-0 dds__p-3 dds__elevation-2 hp-dell-small-ba grey100'])[2]/div[2]/a")
    private WebElement recycleGetStartedBtn;
    @FindBy(xpath = "//div[@class='ContextualFooter1']/div[2]/ul/li[3]/a")
    private WebElement footerMyProductOption;
    @FindBy(xpath = "//nav[@class='mh-top-nav']/ul/li[2]/ul/li[3]/a")
    private WebElement productsLaptopsOption;
    @FindBy(xpath = "//nav[@class='mh-top-nav']/ul/li[2]/ul/li[3]/ul/li[3]/a")
    private WebElement productsLaptopsForHome;
    @FindBy(xpath = "//*[text()='Drivers and Downloads']")
    private WebElement driversAndDownloadsBtn;





    public HomePage(WebDriver driver){PageFactory.initElements(driver, this);}
// reusable steps
    public void clickFooterMyProductOption(){click(footerMyProductOption);
        System.out.println("My Product Option click success");}
    public void clickSignInBtn(){click(signInBtn);
        System.out.println("SignIn Btn click success");}
    public void clickFinancialServiceBtn(){click(financialServiceBtn);
        System.out.println("Financial Service Option click success");}
    public void chickCreateAccountBtn(){click(createAccountBtn);
        System.out.println("Create Account Btn click success");}
    public void clickPremierSignInBtn(){click(premierSignInBtn);
        System.out.println("Premier SignIn Btn click success");}
    public void clickEmailSignUpBtn(){click(emailSignUp);
        System.out.println("Email Signup Btn click success");}
    public void clickPerspectivesBtn(){click(perspectivesBtn);
        System.out.println("Perspectives Option click success");}
    public void clickContactSupportBtn(){click(contactSupportBtn);
        System.out.println("Contact Option click success");}
    public void clickHoverOverProductsGamingDellGamingOption(){click(hoverOverProductsGamingDellGamingOption);
        System.out.println("Gaming Option click success");}
    public void chickHoverOverSupportOrderSupportOption(){click(hoverOverSupportOrderSupportOption);
        System.out.println("Support Option click success");}

    public void clickFooterCopyrightBtn(){click(footerCopyrightBtn);
        System.out.println("Copyright Btn click success");}
    public void clickFooterTermsOfSaleBtn(){click(footerTermsOfSaleBtn);
        System.out.println("Terms of Sale Btn click success");}

    public void clickRecycleGetStartedBtn(){click(recycleGetStartedBtn);}
    public void clickRecyclingOption(){click(recyclingOption);
        System.out.println("Recycling Option click success");}
    public void clickDriversAndDownloadsBtn(){click(driversAndDownloadsBtn);
        System.out.println("Drivers And Downloads Btn click success");}
    public void clickProductsLaptopsForHomeOption(){click(productsLaptopsForHome);
        System.out.println("Laptop for Home Option click success");}

    public void hoverOverAboutUs(WebDriver driver){hoverOver(driver,aboutUsOption);
        System.out.println("HoverOver on About Us success");}
    public void hoverOverProductsLaptopsOption(WebDriver driver){hoverOver(driver,productsLaptopsOption);
        System.out.println("hoverOver on Laptop Option success");}

    public void searchElement(String item){type(searchField,item);
        System.out.println("Type in Search Field success");}

    public void clickWorkStationsBtn(){click(workStationsOption);
        System.out.println("click WorkStation Option success");
    }

    public void clickSearchBtn(){click(searchBtn);
        //LOG.info("search Btn click success");
        System.out.println("Search Btn click success");}
    public void clickServerDealsOptionFromDealsDropDown(){click(serverDeals);
        System.out.println("Server Deals click success");}
    public void searchElementAndEnter(String item){typeAndEnter(searchField,item);
        System.out.println("Type and click on Search Field success");}
    public void clearSearchField(){clear(searchField);
        System.out.println("Search Field Cleared");}

    public void hoverOverOnSignInBtn(WebDriver driver){hoverOver(driver,signInHoverOver);
        System.out.println("hoverOver on SignIn Btn success");}
    public void hoverOverDealsMenu(WebDriver driver){hoverOver(driver,dealsMenu);
        System.out.println("hoverOver on Deals Menu success");}
    public void hoverOverSupport(WebDriver driver){hoverOver(driver,hoverOverSupport);
        System.out.println("hoverOver on Support success");}
    public void hoverOverProductsGaming(WebDriver driver){hoverOver(driver,hoverOverProductsGaming);
        System.out.println("hoverOver on Gaming success");}

    public void hoverOverProducts(WebDriver driver){hoverOver(driver,hoverOverProducts);
        System.out.println("hoverOver on Products success");}

    //public void clickCreateAccountBtn(){click(createAccountBtn);}
    // public String pageTitle(){return getPageTitle();}
    // public String pageUrl(){return getPageUrl();}



}
