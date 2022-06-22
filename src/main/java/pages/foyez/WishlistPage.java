package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WishlistPage extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(WishlistPage.class);

    @FindBy(css = "#product_condition")
    private WebElement productConditionAssertion;

    @FindBy(xpath = "(//p[@class='buttons_bottom_block no-print'])[2]")
    private WebElement wishlist;

    @FindBy(xpath = "//span[text()='My wishlists']")
    private WebElement myWishlist;

    @FindBy(css = "h1[class='page-heading']")
    private WebElement wishlistAssertion;








    public WishlistPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }



    //reusable steps

    public void clickOnWishlist(){
        click(wishlist);
        LOG.info("click on wishlist success");
    }


    public void clickOnMyWishlist(){
        click(myWishlist);
        LOG.info("click on my wishlist success");
    }


    public String productHeader(){
       return getElementText(productConditionAssertion);
    }


    public String wishListHeader(){
        return getElementText(wishlistAssertion);
    }

}
