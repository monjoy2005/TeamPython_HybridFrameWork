package pages.dell_Pages;

import base.CommonAPI;
import org.openqa.selenium.PrintsPage;
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
    public WebElement createAccountBtn;

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
    @FindBy(xpath = "(//div[@class='dds__my-3 dds__my-lg-0 dds__p-3 dds__elevation-2 hp-dell-small-ba grey100'])[2]/div[2]/a")
    private WebElement recycleGetStartedBtn;
    @FindBy(xpath = "//div[@class='ContextualFooter1']/div[2]/ul/li[3]/a")
    private WebElement footerMyProductOption;
    @FindBy(xpath = "//nav[@class='mh-top-nav']/ul/li[2]/ul/li[3]/a")
    private WebElement productsLaptopsOption;
    @FindBy(xpath = "//nav[@class='mh-top-nav']/ul/li[2]/ul/li[3]/ul/li[3]/a")
    private WebElement productsLaptopsForHome;





    public HomePage(WebDriver driver){PageFactory.initElements(driver, this);}
// reusable steps
    public void clickFooterMyProductOption(){click(footerMyProductOption);}
    public void clickSignInBtn(){
        click(signInBtn);
    }
    public void clickFinancialServiceBtn(){
        click(financialServiceBtn);
    }
    public void chickCreateAccountBtn(){
        click(createAccountBtn);}
    public void clickEmailSignUpBtn(){
        click(emailSignUp);
    }
    public void clickPerspectivesBtn(){click(perspectivesBtn);}
    public void clickContactSupportBtn(){click(contactSupportBtn);}
    public void clickHoverOverProductsGamingDellGamingOption(){click(hoverOverProductsGamingDellGamingOption);}
    public void chickHoverOverSupportOrderSupportOption(){click(hoverOverSupportOrderSupportOption);}

    public void clickFooterCopyrightBtn(){click(footerCopyrightBtn);}

    public void clickRecycleGetStartedBtn(){click(recycleGetStartedBtn);}
    public void clickProductsLaptopsForHomeOption(){click(productsLaptopsForHome);}

    public void hoverOverAboutUs(WebDriver driver){hoverOver(driver,aboutUsOption);}
    public void hoverOverProductsLaptopsOption(WebDriver driver){hoverOver(driver,productsLaptopsOption);}

    public void searchElement(String item){
        type(searchField,item);
    }

    public void clickWorkStationsBtn(){
        click(workStationsOption);}

    public void clickSearchBtn(){
        click(searchBtn);
    }
    public void clickServerDealsOptionFromDealsDropDown(){click(serverDeals);}
    public void searchElementAndEnter(String item){
        typeAndEnter(searchField,item);
    }
    public void clearSearchField(){
        clear(searchField);
    }

    public void hoverOverOnSignInBtn(WebDriver driver){  //this is the format of hoverOver
        hoverOver(driver,signInHoverOver);}
    public void hoverOverDealsMenu(WebDriver driver){hoverOver(driver,dealsMenu);}
    public void hoverOverSupport(WebDriver driver){hoverOver(driver,hoverOverSupport);}
    public void hoverOverProductsGaming(WebDriver driver){hoverOver(driver,hoverOverProductsGaming);}

    public void hoverOverProducts(WebDriver driver){hoverOver(driver,hoverOverProducts);}

    //public void clickCreateAccountBtn(){click(createAccountBtn);}
    // public String pageTitle(){return getPageTitle();}
    // public String pageUrl(){return getPageUrl();}



}
