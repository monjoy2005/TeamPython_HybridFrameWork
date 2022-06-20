package pages.foyez;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage extends CommonAPI {



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
    }


    public void clickOnMyWishlist(){
        click(myWishlist);
    }


    public String productHeader(){
       return getElementText(productConditionAssertion);
    }


    public String wishListHeader(){
        return getElementText(wishlistAssertion);
    }

}
