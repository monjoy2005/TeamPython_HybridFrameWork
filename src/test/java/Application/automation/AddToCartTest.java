package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.AddToCartPage;
import pages.foyez.FilterPage;
import pages.foyez.HomePage;
import pages.foyez.SearchResultPage;

public class AddToCartTest extends CommonAPI {


    @Test(enabled = false)
    public void AddToCartFromHomePage(){

        HomePage homePage= new HomePage(getDriver());
        String expectedMessage="POPULAR";
        Assert.assertEquals(homePage.popularHeader(),expectedMessage);
        homePage.hoverOverHomePageItem(getDriver());
        homePage.clickOnCartFromHomaPage();

    }

    @Test(enabled = false)
    public void AddToCartAfterViewingItem(){
        HomePage homePage= new HomePage(getDriver());
        AddToCartPage addToCartPage=new AddToCartPage(getDriver());
        homePage.clickOnHomePageItem();
        String expectedMessage="Model demo_1";
        Assert.assertEquals(addToCartPage.modelHeader(),expectedMessage);
        addToCartPage.clickToCart();

    }

    @Test(enabled = false)
    public void continueShopping(){
        HomePage homePage= new HomePage(getDriver());
        AddToCartPage addToCartPage=new AddToCartPage(getDriver());
        homePage.clickOnHomePageItem();
        String expectedMessage="Model demo_1";
        Assert.assertEquals(addToCartPage.modelHeader(),expectedMessage);
        addToCartPage.clickToCart();
        addToCartPage.clickOnContinueShopping();

    }
    @Test(enabled = false)
    public void viewCart(){
        HomePage homePage= new HomePage(getDriver());
        AddToCartPage addToCartPage=new AddToCartPage(getDriver());
        homePage.clickOnHomePageItem();
        String expectedMessage="Model demo_1";
        Assert.assertEquals(addToCartPage.modelHeader(),expectedMessage);
        addToCartPage.clickToCart();
        addToCartPage.clickOnShoppingCart();

    }

    @Test(enabled = false)
    public void addToCartAfterFiltering(){
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        AddToCartPage addToCartPage=new AddToCartPage(getDriver());
        FilterPage filterPage=new FilterPage(getDriver());
        searchResultPage.clickOnFloatingMenu();
        filterPage.casualCheck();
        filterPage.shortSleeveCheck();
        Assert.assertTrue(checkBoxIsChecked(filterPage.casualCheckbox));
        Assert.assertTrue(checkBoxIsChecked(filterPage.shortSleeveCheckbox));
        addToCartPage.clickOnList();
        Assert.assertTrue(isInteractable(addToCartPage.listView));
        addToCartPage.clickOnAddToCartWithFilter();

    }






}
