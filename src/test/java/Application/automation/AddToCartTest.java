package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.AddToCartPage;
import pages.foyez.HomePage;

public class AddToCartTest extends CommonAPI {


    @Test
    public void AddToCartFromHomePage(){

        HomePage homePage= new HomePage(getDriver());
        String expectedMessage="POPULAR";
        Assert.assertEquals(homePage.popularHeader(),expectedMessage);
        homePage.hoverOverHomePageItem(getDriver());
        homePage.clickOnCartFromHomaPage();

    }

    @Test
    public void AddToCartAfterViewingItem(){
        HomePage homePage= new HomePage(getDriver());
        AddToCartPage addToCartPage=new AddToCartPage(getDriver());
        homePage.clickOnHomePageItem();
        String expectedMessage="Model demo_1";
        Assert.assertEquals(addToCartPage.modelHeader(),expectedMessage);
        addToCartPage.clickToCart();

    }

    @Test
    public void continueShopping(){
        HomePage homePage= new HomePage(getDriver());
        AddToCartPage addToCartPage=new AddToCartPage(getDriver());
        homePage.clickOnHomePageItem();
        String expectedMessage="Model demo_1";
        Assert.assertEquals(addToCartPage.modelHeader(),expectedMessage);
        addToCartPage.clickToCart();
        addToCartPage.clickOnContinueShopping();

    }
    @Test
    public void viewCart(){
        HomePage homePage= new HomePage(getDriver());
        AddToCartPage addToCartPage=new AddToCartPage(getDriver());
        homePage.clickOnHomePageItem();
        String expectedMessage="Model demo_1";
        Assert.assertEquals(addToCartPage.modelHeader(),expectedMessage);
        addToCartPage.clickToCart();
        addToCartPage.clickOnShoppingCart();

    }





}
