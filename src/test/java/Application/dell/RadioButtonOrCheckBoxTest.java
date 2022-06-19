package Application.dell;


import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dell_Pages.Dropdown_Products_Laptops_ForHomePage;
import pages.dell_Pages.HomePage;

public class RadioButtonOrCheckBoxTest extends CommonAPI{

    //@Test
    public void radioBtnForBusiness(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_Products_Laptops_ForHomePage dropdown_products_laptops_forHomePage = new Dropdown_Products_Laptops_ForHomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverProductsLaptopsOption(getDriver());
        homePage.clickProductsLaptopsForHomeOption();
        dropdown_products_laptops_forHomePage.clickRadioBtnForBusiness();
        Assert.assertTrue(dropdown_products_laptops_forHomePage.forBusinessRadioBtnIsChecked());
    }

    @Test
    public void processor12thGenIntelCoreCheckBox(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_Products_Laptops_ForHomePage dropdown_products_laptops_forHomePage = new Dropdown_Products_Laptops_ForHomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverProductsLaptopsOption(getDriver());
        homePage.clickProductsLaptopsForHomeOption();
        dropdown_products_laptops_forHomePage.clickProcessor12thGenIntelCoreCheckBox();
        Assert.assertTrue(dropdown_products_laptops_forHomePage.processor12thGenIntelCoreCheckBoxIsChecked());
    }
}
