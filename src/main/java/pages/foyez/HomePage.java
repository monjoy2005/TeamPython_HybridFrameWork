package pages.foyez;

import base.CommonAPI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends CommonAPI {

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
    }


    public void searchElement(String item) {
        type(searchBox, item);
    }

    public void clickOnSearchBtn(){
        click(searchBtn);
    }

    public void typeAndHit(String item){
        typeAndEnter(searchBox,item);
    }

    public void clickOnHomePageItem(){
        click(homepageItem);
    }


    public void hoverOverHomePageItem(WebDriver driver){
        hoverOver(driver,homepageItem);
    }

    public void clickOnUserName(){
        click(userName);

    }


    public void clickOnCartFromHomaPage(){
        click(CartFromHomePage);
    }



    public String userNameAssertion(){
        return getElementText(userName);
    }

    public String popularHeader(){
        return getElementText(popularAssertion);
    }


    public void clearSearchField(){
        clear(searchBox);
    }






}
