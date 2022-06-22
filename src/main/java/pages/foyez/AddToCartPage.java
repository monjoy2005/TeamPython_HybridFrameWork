package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddToCartPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(AddToCartPage.class);
    @FindBy(css = "#product_reference")
    private WebElement modelAssertion;

    @FindBy(xpath = "//button/span[text()='Add to cart']")
    private WebElement AddCart;

    @FindBy(xpath = "//span[@title='Continue shopping']/span")
    private WebElement continueShopping;

    @FindBy(css = "a[title='View my shopping cart']")
    private WebElement shoppingCart;

    @FindBy(xpath = "(//a[@title='Add to cart'])[1]/span")
    private WebElement addToCartWithFilter;

    @FindBy(css = "a[title='List']")
    public WebElement listView;





    public AddToCartPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }



    //Reusable steps

    public void clickToCart(){
        click(AddCart);
        LOG.info("click to cart success");
    }

    public void clickOnContinueShopping(){
        click(continueShopping);
        LOG.info("click on continue shopping success");
    }
    public void clickOnShoppingCart(){
        click(shoppingCart);
        LOG.info("click on shopping cart success");
    }

    public String modelHeader(){
        return getElementText(modelAssertion);
    }


    public void clickOnAddToCartWithFilter(){
        click(addToCartWithFilter);
        LOG.info("click on add to cart with filter success");
    }

    public void clickOnList(){
        click(listView);
        LOG.info("click on list success");
    }






}
