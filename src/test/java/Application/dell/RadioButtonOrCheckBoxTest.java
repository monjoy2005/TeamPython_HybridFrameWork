package Application.dell;


import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dell_Pages.Dropdown_Products_Laptops_ForHomePage;
import pages.dell_Pages.HomePage;



public class RadioButtonOrCheckBoxTest extends CommonAPI{

    @Test
    public void radioBtnForBusiness(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_Products_Laptops_ForHomePage dropdown_products_laptops_forHomePage = new Dropdown_Products_Laptops_ForHomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverProductsLaptopsOption(getDriver());
        homePage.clickProductsLaptopsForHomeOption();
        //Log.info("click success");
        dropdown_products_laptops_forHomePage.clickRadioBtnForBusiness();
        Assert.assertTrue(dropdown_products_laptops_forHomePage.forBusinessRadioBtnIsChecked());
    }

    @Test
    public void processor12thGenIntelCoreCheckBox(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_Products_Laptops_ForHomePage dropdown_products_laptops_forHomePage = new Dropdown_Products_Laptops_ForHomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverProductsLaptopsOption(getDriver());
        //Log.info("click success");
        homePage.clickProductsLaptopsForHomeOption();
        String expectedUrl = "https://www.dell.com/en-us/shop/scc/sc/laptops";
        Assert.assertEquals(expectedUrl,getPageUrl());
        dropdown_products_laptops_forHomePage.clickProcessor12thGenIntelCoreCheckBox();
        Assert.assertTrue(dropdown_products_laptops_forHomePage.processor12thGenIntelCoreCheckBoxIsChecked());
    }

   @Test
    public void grayOptionCheckBoxCheckBox(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_Products_Laptops_ForHomePage dropdown_products_laptops_forHomePage = new Dropdown_Products_Laptops_ForHomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverProductsLaptopsOption(getDriver());
        homePage.clickProductsLaptopsForHomeOption();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,6500)");
        dropdown_products_laptops_forHomePage.clickGrayOptionCheckBox();
        String expectedMassage = "Gray Laptop Computers & 2-in-1 PCs";
        Assert.assertEquals(expectedMassage,dropdown_products_laptops_forHomePage.grayColorHeaderText());
    }

    @Test
    public void checkMultipleCheckBox(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_Products_Laptops_ForHomePage dropdown_products_laptops_forHomePage = new Dropdown_Products_Laptops_ForHomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverProductsLaptopsOption(getDriver());
        //Log.info("click success");
        homePage.clickProductsLaptopsForHomeOption();
        String expectedUrl = "https://www.dell.com/en-us/shop/scc/sc/laptops";
        Assert.assertEquals(expectedUrl,getPageUrl());
        dropdown_products_laptops_forHomePage.clickProcessor12thGenIntelCoreCheckBox();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,1000)");
        dropdown_products_laptops_forHomePage.clickScreenSize17inCheckBox();
        js.executeScript("window.scrollBy(0,3500)");
        dropdown_products_laptops_forHomePage.clickSilverOptionCheckBox();
        String expectedUrl2 = "https://www.dell.com/en-us/shop/dell-laptops/sr/laptops/12th-gen-intel-core?appliedRefinements=39795,15677,5973";
        Assert.assertEquals(expectedUrl2,getPageUrl());
    }

    @Test
    public void checkMultipleCheckBox2(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_Products_Laptops_ForHomePage dropdown_products_laptops_forHomePage = new Dropdown_Products_Laptops_ForHomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverProductsLaptopsOption(getDriver());
        homePage.clickProductsLaptopsForHomeOption();
        String expectedUrl = "https://www.dell.com/en-us/shop/scc/sc/laptops";
        Assert.assertEquals(expectedUrl,getPageUrl());
        dropdown_products_laptops_forHomePage.clickProcessor12thGenIntelCoreCheckBox();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,1000)");
        dropdown_products_laptops_forHomePage.clickScreenSize17inCheckBox();
        js.executeScript("window.scrollBy(0,2000)");
        dropdown_products_laptops_forHomePage.clickAllNvidiaCheckBox();
        js.executeScript("window.scrollBy(0,1500)");
        dropdown_products_laptops_forHomePage.clickSilverOptionCheckBox();
        String expectedUrl2 = "https://www.dell.com/en-us/shop/dell-laptops/sr/laptops/12th-gen-intel-core?appliedRefinements=39795,15677,5973";
        Assert.assertEquals(expectedUrl2,getPageUrl());
    }

    @Test
    public void grayOptionsCheckBoxCheckBox(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_Products_Laptops_ForHomePage dropdown_products_laptops_forHomePage = new Dropdown_Products_Laptops_ForHomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverProductsLaptopsOption(getDriver());
        homePage.clickProductsLaptopsForHomeOption();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,6500)");
        dropdown_products_laptops_forHomePage.clickGrayOptionCheckBox();
        String expectedMassage = "Gray Laptop Computers & 2-in-1 PCs";
        Assert.assertEquals(expectedMassage,dropdown_products_laptops_forHomePage.grayColorHeaderText());
    }

    @Test
    public void checkMultipleCheckBox3(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_Products_Laptops_ForHomePage dropdown_products_laptops_forHomePage = new Dropdown_Products_Laptops_ForHomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverProductsLaptopsOption(getDriver());
        homePage.clickProductsLaptopsForHomeOption();
        String expectedUrl = "https://www.dell.com/en-us/shop/scc/sc/laptops";
        Assert.assertEquals(expectedUrl,getPageUrl());
        dropdown_products_laptops_forHomePage.clickProcessor12thGenIntelCoreCheckBox();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,1000)");
        dropdown_products_laptops_forHomePage.clickScreenSize17inCheckBox();
        js.executeScript("window.scrollBy(0,3500)");
        dropdown_products_laptops_forHomePage.clickSilverOptionCheckBox();
        String expectedUrl2 = "https://www.dell.com/en-us/shop/dell-laptops/sr/laptops/12th-gen-intel-core?appliedRefinements=39795,15677,5973";
        Assert.assertEquals(expectedUrl2,getPageUrl());
    }

    @Test
    public void checkMultipleCheckBox4(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_Products_Laptops_ForHomePage dropdown_products_laptops_forHomePage = new Dropdown_Products_Laptops_ForHomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverProductsLaptopsOption(getDriver());
        homePage.clickProductsLaptopsForHomeOption();
        String expectedUrl = "https://www.dell.com/en-us/shop/scc/sc/laptops";
        Assert.assertEquals(expectedUrl,getPageUrl());
        dropdown_products_laptops_forHomePage.clickProcessor12thGenIntelCoreCheckBox();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,1000)");
        dropdown_products_laptops_forHomePage.clickScreenSize17inCheckBox();
        js.executeScript("window.scrollBy(0,2000)");
        dropdown_products_laptops_forHomePage.clickAllNvidiaCheckBox();
        js.executeScript("window.scrollBy(0,1500)");
        dropdown_products_laptops_forHomePage.clickSilverOptionCheckBox();
        String expectedUrl2 = "https://www.dell.com/en-us/shop/dell-laptops/sr/laptops/12th-gen-intel-core?appliedRefinements=39795,15677,5973";
        Assert.assertEquals(expectedUrl2,getPageUrl());
    }
}
