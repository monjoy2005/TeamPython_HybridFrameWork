package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.HomePage;
import pages.foyez.LoginPage;
import pages.foyez.SearchResultPage;
import utility.ExcelReader;
import utility.Utility;

import java.util.List;

public class SearchBoxTest extends CommonAPI {

    @Test(enabled = false)
    public void search(){
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
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
        String expected="\"BLOUSES\"";
        Assert.assertEquals(searchResultPage.searchedItemAssertion(),expected);



    }
    @Test(enabled = false)
    public void searchWithKeyBoardBtn(){
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        String password= excelReader.getDataFromCell("Sheet1",1,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        String product=excelReader.getDataFromCell("Sheet1",0,2);
        homePage.typeAndHit(product);
        String expected= "1 result has been found.";
        Assert.assertEquals(searchResultPage.noOfFoundResultHeader(),expected);

    }

    @Test(enabled = false)
    public void searchWithoutSearchKeyword(){
        HomePage homePage= new HomePage(getDriver());
        LoginPage loginPage= new LoginPage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String email= excelReader.getDataFromCell("Sheet1",0,0);
        String password= excelReader.getDataFromCell("Sheet1",1,0);
        homePage.clickOnSignIn();
        loginPage.putEmail(email);
        loginPage.putPassword(password);
        loginPage.hitSignIn();
        homePage.clickOnSearchBtn();
        String expectedMessage="Please enter a search keyword";
        Assert.assertEquals(searchResultPage.keyWordTextAssertion(),expectedMessage);


    }
    @Test(enabled = false)
    public void searchByNonAcHolder(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String product=excelReader.getDataFromCell("Sheet1",0,2);
        homePage.searchElement(product);
        homePage.clickOnSearchBtn();
        String expected="\"BLOUSES\"";
        Assert.assertEquals(searchResultPage.searchedItemAssertion(),expected);

    }

    @Test(enabled = false)
    public void searchWithKeyBoardBtnByNonAcHOlder(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String product=excelReader.getDataFromCell("Sheet1",0,2);
        homePage.typeAndHit(product);
        String expected= "1 result has been found.";
        Assert.assertEquals(searchResultPage.noOfFoundResultHeader(),expected);

    }

    @Test(enabled = false)
    public void searchWithoutSearchKeywordByNonAcHolder(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        homePage.clickOnSearchBtn();
        String expectedMessage="Please enter a search keyword";
        Assert.assertEquals(searchResultPage.keyWordTextAssertion(),expectedMessage);


    }

    @Test
    public void searchMultipleItems(){
        HomePage homePage= new HomePage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        List<String> items=excelReader.getEntireColumnForGivenHeader("Sheet1","Item");
        for (String Item:items){
            homePage.typeAndHit(Item);
            homePage.clearSearchField();
        }



    }




}
