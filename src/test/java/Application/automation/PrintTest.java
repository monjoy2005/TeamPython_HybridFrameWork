package Application.automation;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.foyez.CustomizingItemPage;
import pages.foyez.HomePage;
import utility.ExcelReader;
import utility.Utility;

public class PrintTest extends CommonAPI {

    @Test
    public void print(){
        HomePage homePage= new HomePage(getDriver());
        CustomizingItemPage customizingItemPage=new CustomizingItemPage(getDriver());
        ExcelReader excelReader=new ExcelReader(Utility.currentDir+"/data/Excel.xlsx");
        homePage.clickOnHomePageItem();
        String expected= excelReader.getDataFromCell("Sheet1",10,4);
        Assert.assertEquals(getPageUrl(),expected);
        customizingItemPage.clickOnPrint();

    }

}
