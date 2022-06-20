package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.*;
import utility.ExcelReader;
import utility.Utility;

public class RemoveItemTest extends CommonAPI {

    @Test(enabled = false)
    public void removeItem(){

        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        SearchResultPage searchResultPage=new SearchResultPage(getDriver());
        RemoveItemPage removeItemPage=new RemoveItemPage(getDriver());
        AddToCartPage addToCartPage=new AddToCartPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        String password= excelReader.getDataFromCell("Sheet1",1,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        String product=excelReader.getDataFromCell("Sheet1",0,2);
        homePage.searchElement(product);
        homePage.clickOnSearchBtn();
        searchResultPage.clickOnItemFromSide();
        addToCartPage.clickToCart();
        addToCartPage.clickOnContinueShopping();
        addToCartPage.clickOnShoppingCart();
        removeItemPage.clickOnDeleteItems();
        String expected=excelReader.getDataFromCell("Sheet1",3,3);
        Assert.assertEquals(getPageUrl(),expected);

    }


    @Test
    public void removeItemByNonACHolder(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage=new SearchResultPage(getDriver());
        RemoveItemPage removeItemPage=new RemoveItemPage(getDriver());
        AddToCartPage addToCartPage=new AddToCartPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String product=excelReader.getDataFromCell("Sheet1",0,2);
        homePage.searchElement(product);
        homePage.clickOnSearchBtn();
        searchResultPage.clickOnItemFromSide();
        addToCartPage.clickToCart();
        addToCartPage.clickOnContinueShopping();
        addToCartPage.clickOnShoppingCart();
        removeItemPage.clickOnDeleteItems();
        String expected=excelReader.getDataFromCell("Sheet1",3,3);
        Assert.assertEquals(getPageUrl(),expected);

    }


}
