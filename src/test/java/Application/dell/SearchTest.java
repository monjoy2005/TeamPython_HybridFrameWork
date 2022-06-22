package Application.dell;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.dell_Pages.HomePage;
import pages.dell_Pages.SearchResultPage;
import utility.ExcelReader;
import utility.Utility;

import java.util.List;

public class SearchTest extends CommonAPI {


    @Test
    public void searchLaptop(){
        HomePage homePage = new HomePage(getDriver());
        ExcelReader excelReader = new ExcelReader(Utility.currentDir+"//data/TestData.xlsx");
        homePage.searchElement(excelReader.getDataFromCell("dell", 1,1));
        homePage.clickSearchBtn();
        String expectedLaptopPageUrl="https://www.dell.com/en-us/search/Laptop";
        Assert.assertEquals(expectedLaptopPageUrl,getPageUrl());
    }


    @Test
    public void searchAmdLaptop(){
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        ExcelReader excelReader = new ExcelReader(Utility.currentDir+"//data/TestData.xlsx");
        homePage.searchElement(excelReader.getDataFromCell("dell", 2,1));
        homePage.clickSearchBtn();
        searchResultPage.checkAmdLogoIsPresent();
    }

    @Test
    public void searchGamingPc(){
        HomePage homePage = new HomePage(getDriver());
        ExcelReader excelReader = new ExcelReader(Utility.currentDir+"//data/TestData.xlsx");
        homePage.searchElement(excelReader.getDataFromCell("dell", 3,1));
        homePage.clickSearchBtn();
        String expectedGamingPcPageUrl="https://www.dell.com/en-us/search/Gaming%20Pc";
        Assert.assertEquals(expectedGamingPcPageUrl,getPageUrl());
    }
    @Test
    public void searchMonitor(){                            // has all the success massage
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        ExcelReader excelReader = new ExcelReader(Utility.currentDir+"//data/TestData.xlsx");
        homePage.searchElement(excelReader.getDataFromCell("dell", 4,1));
        System.out.println("Type monitor success");
        homePage.clickSearchBtn();
        System.out.println("Click searchBtn success");
        String expectedMassage = "monitor";
        Assert.assertEquals(expectedMassage,searchResultPage.monitorsSearchText());
        System.out.println("expectedMassage and actualMassage matched");
    }

   @Test
    public void searchKvmConsole(){
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        ExcelReader excelReader = new ExcelReader(Utility.currentDir+"//data/TestData.xlsx");
        homePage.searchElement(excelReader.getDataFromCell("dell", 5,1));
        homePage.clickSearchBtn();
        String expectedMassage = "kvm console";
        Assert.assertEquals(expectedMassage,searchResultPage.kvmSearchText());
    }


   @Test
    public void searchServer(){
        HomePage homePage = new HomePage(getDriver());
        SearchResultPage searchResultPage = new SearchResultPage(getDriver());
        ExcelReader excelReader = new ExcelReader(Utility.currentDir+"//data/TestData.xlsx");
        homePage.searchElement(excelReader.getDataFromCell("dell", 6,1));
        homePage.clickSearchBtn();
        String expectedMassage= searchResultPage.getServerPageInfo();
        Assert.assertEquals("server",expectedMassage);
    }

    @Test
    public void emptySearch(){
        HomePage homePage=new HomePage(getDriver());
        ExcelReader excelReader = new ExcelReader(Utility.currentDir+"//data/TestData.xlsx");
        homePage.searchElement(excelReader.getDataFromCell("dell", 7,1));
        String expectedTitle = "Computers, Monitors & Technology Solutions | Dell USA";
        Assert.assertEquals(expectedTitle,getPageTitle());
    }

    @Test
    public void backPack(){
        HomePage homePage = new HomePage(getDriver());
        ExcelReader excelReader = new ExcelReader(Utility.currentDir+"//data/TestData.xlsx");
        homePage.searchElement(excelReader.getDataFromCell("dell", 8,1));
        homePage.clickSearchBtn();
        String expectedTitle = "Dell Search";
        Assert.assertEquals(expectedTitle,getPageTitle());

    }

    @Test
    public void support(){
        HomePage homePage = new HomePage(getDriver());
        ExcelReader excelReader = new ExcelReader(Utility.currentDir+"//data/TestData.xlsx");
        homePage.searchElement(excelReader.getDataFromCell("dell", 9,1));
        homePage.clickSearchBtn();
        String expectedUrl = "https://www.dell.com/en-us/search/support";
        Assert.assertEquals(expectedUrl,getPageUrl());
    }

    @Test
    public void keyboard(){
        HomePage homePage = new HomePage(getDriver());
        ExcelReader excelReader = new ExcelReader(Utility.currentDir+"//data/TestData.xlsx");
        homePage.searchElement(excelReader.getDataFromCell("dell", 10,1));
        homePage.clickSearchBtn();
        String expectedUrl = "https://www.dell.com/en-us/search/keyboard";
        Assert.assertEquals(expectedUrl,getPageUrl());
    }

    @Test
    public void searchMultipleItems(){
        ExcelReader excelReader = new ExcelReader(Utility.currentDir+"//data/TestData.xlsx");
        List<String> items = excelReader.getEntireColumnForGivenHeader("dell", "Item");
        HomePage homePage = new HomePage(getDriver());
        for (String item: items) {
            homePage.searchElementAndEnter(item);
            homePage.clearSearchField();
        }
    }

    @Test
    public void invalidSearch(){
        HomePage homePage=new HomePage(getDriver());
        ExcelReader excelReader = new ExcelReader(Utility.currentDir+"//data/TestData.xlsx");
        homePage.searchElement(excelReader.getDataFromCell("dell", 7,1));
        String expectedTitle = "Computers, Monitors & Technology Solutions | Dell USA";
        Assert.assertEquals(expectedTitle,getPageTitle());
    }

    @Test
    public void bag(){
        HomePage homePage = new HomePage(getDriver());
        ExcelReader excelReader = new ExcelReader(Utility.currentDir+"//data/TestData.xlsx");
        homePage.searchElement(excelReader.getDataFromCell("dell", 8,1));
        homePage.clickSearchBtn();
        String expectedTitle = "Dell Search";
        Assert.assertEquals(expectedTitle,getPageTitle());

    }

}

