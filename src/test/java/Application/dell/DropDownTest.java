package Application.dell;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dell_Pages.*;

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

    @Test
    public void recycleBtn(){
        HomePage homePage = new HomePage(getDriver());
        RecyclePage recyclePage = new RecyclePage(getDriver());
        homePage.clickRecycleGetStartedBtn();
        String expectedHeaderText = "Computer and IT Equipment Recycling Solutions";
        Assert.assertEquals(expectedHeaderText,recyclePage.recycleHeaderText());

    }

//    @Test
//    public void table2(){
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
//        waitFor(5);
//        System.out.println(WebDriver.findElement(By.xpath("//tbody/tr[9]/td[4]")).getText());
//    }

}