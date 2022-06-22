package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.HomePage;
import pages.foyez.LoginPage;
import pages.foyez.SearchResultPage;
import utility.ExcelReader;
import utility.Utility;

public class ItemViewTest extends CommonAPI {

    @Test
    public void itemDetails(){
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
        searchResultPage.clickOnItemViewer();

    }

    @Test
    public void itemDetailsFromTopSeller(){
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
        searchResultPage.clickOnTopSellerItem();
        String expected=excelReader.getDataFromCell("Sheet1",0,9);
        Assert.assertEquals(searchResultPage.itemDescriptionHeader(),expected);


    }

    @Test
    public void itemsViewingFromFashionManu(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String product=excelReader.getDataFromCell("Sheet1",0,2);
        homePage.searchElement(product);
        homePage.clickOnSearchBtn();
        searchResultPage.clickOnFashionManu();
        String expectedMessage=excelReader.getDataFromCell("Sheet1",1,9);
        Assert.assertEquals(searchResultPage.listOfProductFromFashionManuAssertion(),expectedMessage);


    }

    @Test
    public void itemsViewingFromFashionSupplier(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String product=excelReader.getDataFromCell("Sheet1",0,2);
        homePage.searchElement(product);
        homePage.clickOnSearchBtn();
        searchResultPage.clickOnFashionSupplier();
        String expectedMessage=excelReader.getDataFromCell("Sheet1",2,9);
        Assert.assertEquals(searchResultPage.listOfProductionFromFashionSupplierAssertion(),expectedMessage);


    }

    @Test
    public void itemsViewingByExtendingTopsSubCategory(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String product=excelReader.getDataFromCell("Sheet1",0,2);
        homePage.searchElement(product);
        homePage.clickOnSearchBtn();
        searchResultPage.extendWomen();
        searchResultPage.clickOnCategories_Women_Top_plus();
        searchResultPage.clickOnCategories_Women_Top_TShirt();
        String expectedMessage=excelReader.getDataFromCell("Sheet1",3,9);
        Assert.assertEquals(searchResultPage.TShirtsHeader(),expectedMessage);


    }

    @Test
    public void itemsViewingByExtendingDressesSubCategory(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String product=excelReader.getDataFromCell("Sheet1",0,2);
        homePage.searchElement(product);
        homePage.clickOnSearchBtn();
        searchResultPage.extendWomen();
        searchResultPage.clickOnCategories_Women_Dresses_plus();
        searchResultPage.clickOnCategories_Women_Dresses_SummerDresses();
        String expectedMessage=excelReader.getDataFromCell("Sheet1",4,9);
        Assert.assertEquals(searchResultPage.SummerDressesAssertion(),expectedMessage);


    }
    @Test
    public void casualViewingByHoverOver(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String product=excelReader.getDataFromCell("Sheet1",0,2);
        homePage.searchElement(product);
        homePage.clickOnSearchBtn();
        searchResultPage.hoverOverFloating(getDriver());
        searchResultPage.clickOnFloatingCasual();
        String expectedMessage=excelReader.getDataFromCell("Sheet1",5,9);
        Assert.assertEquals(searchResultPage.casualHeader(),expectedMessage);


    }
    @Test
    public void eveningViewingByHoverOver(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String product=excelReader.getDataFromCell("Sheet1",0,2);
        homePage.searchElement(product);
        homePage.clickOnSearchBtn();
        searchResultPage.hoverOverFloating(getDriver());
        searchResultPage.clickOnFloatingEvening();
        String expectedMessage=excelReader.getDataFromCell("Sheet1",6,9);
        Assert.assertEquals(searchResultPage.eveningHeader(),expectedMessage);

    }

    @Test
    public void TShirtsViewingByHoverOver(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        String product=excelReader.getDataFromCell("Sheet1",0,2);
        homePage.searchElement(product);
        homePage.clickOnSearchBtn();
        searchResultPage.hoverOverFloating(getDriver());
        searchResultPage.clickOnFloatingTShirts();
        String expectedMessage=excelReader.getDataFromCell("Sheet1",7,9);
        Assert.assertEquals(searchResultPage.floatingTShirtHeader(),expectedMessage);

    }
    @Test
    public void itemViewingFromHomePage(){
        HomePage homePage= new HomePage(getDriver());
        SearchResultPage searchResultPage= new SearchResultPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        homePage.clickOnHomePageItem();
        String expectedMessage=excelReader.getDataFromCell("Sheet1",8,9);
        Assert.assertEquals(searchResultPage.fadedShortTShirtHeader(),expectedMessage);

    }



}
