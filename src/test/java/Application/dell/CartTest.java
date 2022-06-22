package Application.dell;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dell_Pages.*;

public class  CartTest extends CommonAPI {

    //@Test
    public void addOneItemToCart(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_Products_Laptops_ForHomePage dropdown_products_laptops_forHomePage = new Dropdown_Products_Laptops_ForHomePage(getDriver());
        XpsLaptopsPage xpsLaptopsPage = new XpsLaptopsPage(getDriver());
        Xps15LaptopPage xps15LaptopPage =new Xps15LaptopPage(getDriver());
        AddToCartPage addToCartPage = new AddToCartPage(getDriver());
        Cart cart = new Cart(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverProductsLaptopsOption(getDriver());
        homePage.clickProductsLaptopsForHomeOption();
        String expectedUrl1 = "https://www.dell.com/en-us/shop/scc/sc/laptops";
        Assert.assertEquals(getPageUrl(),expectedUrl1);
        xpsLaptopsPage.clickShopXpsBtn();
        String expectedTitle = "Dell XPS Laptops | Dell USA";
        Assert.assertEquals(getPageTitle(),expectedTitle);
        xpsLaptopsPage.clickCustomizeAndBuyBtn1();
        String expectedUrl2 = "https://www.dell.com/en-us/shop/dell-laptops/new-xps-15-laptop/spd/xps-15-9520-laptop/xn9520cto020s?view=configurations";
        Assert.assertEquals(getPageUrl(),expectedUrl2);
        xps15LaptopPage.clickAddToCartBtn();
        addToCartPage.clickNextStepAccessoriesBtn();
        addToCartPage.clickNextStepCartBtn();
        String expectedUrl3 = "https://www.dell.com/en-us/cart";
        Assert.assertEquals(getPageUrl(),expectedUrl3);
    }
    //@Test
    public void removeItemFromCart(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_Products_Laptops_ForHomePage dropdown_products_laptops_forHomePage = new Dropdown_Products_Laptops_ForHomePage(getDriver());
        XpsLaptopsPage xpsLaptopsPage = new XpsLaptopsPage(getDriver());
        Xps15LaptopPage xps15LaptopPage =new Xps15LaptopPage(getDriver());
        AddToCartPage addToCartPage = new AddToCartPage(getDriver());
        Cart cart = new Cart(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverProductsLaptopsOption(getDriver());
        homePage.clickProductsLaptopsForHomeOption();
        String expectedUrl1 = "https://www.dell.com/en-us/shop/scc/sc/laptops";
        Assert.assertEquals(getPageUrl(),expectedUrl1);
        xpsLaptopsPage.clickShopXpsBtn();
        String expectedTitle = "Dell XPS Laptops | Dell USA";
        Assert.assertEquals(getPageTitle(),expectedTitle);
        xpsLaptopsPage.clickCustomizeAndBuyBtn1();
        String expectedUrl2 = "https://www.dell.com/en-us/shop/dell-laptops/new-xps-15-laptop/spd/xps-15-9520-laptop/xn9520cto020s?view=configurations";
        Assert.assertEquals(getPageUrl(),expectedUrl2);
        xps15LaptopPage.clickAddToCartBtn();
        addToCartPage.clickNextStepAccessoriesBtn();
        addToCartPage.clickNextStepCartBtn();
        String expectedUrl3 = "https://www.dell.com/en-us/cart";
        Assert.assertEquals(getPageUrl(),expectedUrl3);
        cart.clickRemoveBtn();
        String expectedMassage = "";
        Assert.assertEquals(cart.headerTextOfEmptyCart(),expectedMassage);
    }

}
