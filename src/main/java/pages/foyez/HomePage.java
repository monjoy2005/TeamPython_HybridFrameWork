package pages.foyez;

import base.CommonAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage {

    private final Logger LOG = LoggerFactory.getLogger(HomePage.class);
    @FindBy(css = "a.login")
    private WebElement SignIn;

    @FindBy(xpath = "//a[@title='View my customer account']/span")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='search_query_top']")
    private WebElement searchBox;

    @FindBy(css = "button[name='submit_search']")
    private WebElement searchBtn;

    @FindBy(xpath = "(//h5/a[@title='Faded Short Sleeve T-shirts'])[1]")
    private WebElement homepageItem;

    @FindBy(xpath = "(//a/span[text()='Add to cart'])[1]")
    private WebElement CartFromHomePage;

    @FindBy(xpath = "//a[@class='homefeatured']")
    private WebElement popularAssertion;








    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }




    // reusable steps

    public void clickOnSignIn() {
        click(SignIn);
        LOG.info("click on sign in success");
    }


    public void searchElement(String item) {
        type(searchBox, item);
        LOG.info("search element success");
    }

    public void clickOnSearchBtn(){
        click(searchBtn);
        LOG.info("click on search button success");
    }

    public void typeAndHit(String item){
        typeAndEnter(searchBox,item);
        LOG.info("type and hit  success");
    }

    public void clickOnHomePageItem(){
        click(homepageItem);
        LOG.info("click on home page item success");
    }


    public void hoverOverHomePageItem(WebDriver driver){
        hoverOver(driver,homepageItem);
        LOG.info("hover over home page item success");
    }

    public void clickOnUserName(){
        click(userName);
        LOG.info("click on user name success");
    }


    public void clickOnCartFromHomaPage(){
        click(CartFromHomePage);
        LOG.info("click on cart from homepage success");
    }



    public String userNameAssertion(){
        return getElementText(userName);
    }

    public String popularHeader(){
        return getElementText(popularAssertion);
    }


    public void clearSearchField(){
        clear(searchBox);
        LOG.info("clear search field success");
    }






}
