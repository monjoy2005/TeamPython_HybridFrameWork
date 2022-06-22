package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.HomePage;
import pages.foyez.LoginPage;
import pages.foyez.WishlistPage;
import utility.ExcelReader;
import utility.Utility;

public class WishlistTest extends CommonAPI {


    @Test(enabled = false)
    public void addToWishlist(){
        HomePage homePage= new HomePage(getDriver());
        WishlistPage wishlistPage = new WishlistPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        homePage.clickOnHomePageItem();
        String expectedMessage= excelReader.getDataFromCell("Sheet1",10,9);
        Assert.assertEquals(wishlistPage.productHeader(),expectedMessage);
        wishlistPage.clickOnWishlist();


    }

    @Test(enabled = false)
    public void viewingWishlist(){
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        WishlistPage wishlistPage = new WishlistPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        String password= excelReader.getDataFromCell("Sheet1",1,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        homePage.clickOnUserName();
        wishlistPage.clickOnMyWishlist();
        String expectedMessage= excelReader.getDataFromCell("Sheet1",11,9);
        Assert.assertEquals(wishlistPage.wishListHeader(),expectedMessage);

    }

    @Test
    public void addToWishlistByNonAcHolder(){
        HomePage homePage= new HomePage(getDriver());
        WishlistPage wishlistPage = new WishlistPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        homePage.clickOnHomePageItem();
        String expectedMessage= excelReader.getDataFromCell("Sheet1",12,9);
        Assert.assertEquals(getPageUrl(),expectedMessage);
        wishlistPage.clickOnWishlist();

    }




}
