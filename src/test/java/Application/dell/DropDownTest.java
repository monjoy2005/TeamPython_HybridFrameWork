package Application.dell;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dell_Pages.HomePage;
import pages.dell_Pages.Dropdown_AboutUs_PerspectivesPage;
import pages.dell_Pages.Dropdown_Deals_ServerDealsPage;
import pages.dell_Pages.Support_OrderSupportPage;

public class DropDownTest extends CommonAPI {
    @Test
    public void dellGaming(){
        HomePage homePage=new HomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.hoverOverProductsGaming(getDriver());
        homePage.clickHoverOverProductsGamingDellGamingOption();
        String expectedGamingPageTitle = "Gaming PCs and Accessories | Dell USA";
        Assert.assertEquals(getPageTitle(),expectedGamingPageTitle);

    }

    @Test
    public void workStations(){
        HomePage homePage=new HomePage(getDriver());
        homePage.hoverOverProducts(getDriver());
        homePage.clickWorkStationsBtn();
        String expectedUrl = "https://www.dell.com/en-us/work/shop/scc/sc/workstations";
        Assert.assertEquals(expectedUrl,getPageUrl());

    }


    @Test
    public void perspectives(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_AboutUs_PerspectivesPage aboutUsPerspectivesPage =new Dropdown_AboutUs_PerspectivesPage(getDriver());
        homePage.hoverOverAboutUs(getDriver());
        homePage.clickPerspectivesBtn();
        String expectedHeaderText = "Perspectives";
        Assert.assertEquals(expectedHeaderText, aboutUsPerspectivesPage.perspectivesHeaderText());
    }

    @Test
    public void dealsViewAllDeals(){
        HomePage homePage=new HomePage(getDriver());
        Dropdown_Deals_ServerDealsPage dealsServerDealsPage = new Dropdown_Deals_ServerDealsPage(getDriver());
        homePage.hoverOverDealsMenu(getDriver());
        homePage.clickServerDealsOptionFromDealsDropDown();
        dealsServerDealsPage.serverDealsHeaderTextIsPresent();

    }

    @Test
    public void orderSupport(){
        HomePage homePage = new HomePage(getDriver());
        Support_OrderSupportPage support_orderSupportPage = new Support_OrderSupportPage(getDriver());
        homePage.hoverOverSupport(getDriver());
        homePage.chickHoverOverSupportOrderSupportOption();
        support_orderSupportPage.orderSupportPageHeaderTextIsPresent();
    }







}